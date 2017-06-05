import java.util.Random;
import java.util.Scanner;


public class TerrainGen {
	int[][] world;
	int size;
	Random r = new Random();
	int elevationProb=25;
	int carveProb = 10;
	public void main()
	{
		Scanner a = new Scanner(System.in);
		System.out.println("Digite o tamanho do seu mundo:");
		try
		{
		size = a.nextInt();
		}catch(Exception e)
		{
			System.err.println("Apenas números!");
			System.exit(0);
		}
		world = new int[size][size];
		
		for(int i = 0;i<size;i++)
		{
			for(int j = 0;j<size;j++)
			{
				world[i][j]=0;
			}
		}
		a.close();
	}
	
	public void printWorld()
	{
		for(int i = 0;i<size;i++)
		{
			for(int j = 0;j<size;j++)
			{
				System.out.print(" "+world[i][j]+" ");
			}
			System.out.println("");
		}
		System.out.println("--------------------------");
	}
	public void makeBase()
	{
		for(int i =0;i<size;i++)
		{
			world[size-1][i]=1;
		}
	}
	public void makeElevation()
	{
		
		int x =1;
		int prob = r.nextInt(100);
		for(int i =0;i<size;i++)
		{
			prob = r.nextInt(100);
			if(elevationProb>prob)
				x++;
			try
			{
			world[size-x][i]=1;
			}catch(Exception e){}
			
		}
	}
	public void makeChisel()
	{
		for(int i = 0;i<size;i++)
		{
			for(int j = 0;j<size;j++)
			{
				if(world[i][j]==1)
				{
					if(carveProb>r.nextInt(100))
					{
						world[i][j]=0;
					}
				}
			}
		}
	}
	public void makeCarve(int carveSize)
	{
		for(int i = 0;i<size;i++)
		{
			for(int j = 0;j<size;j++)
			{
				if(world[i][j]==1)
				{
					if(world[i][j]==0)
					{
							makeCaverns(i,j,carveSize);
					}
				}
			}
		}
	}
	public void makeCaverns(int x , int y,int cavernSize)
	{
		try
		{
			while(numberOfNeighboors(x,y)<=3)
			{
				x+=r.nextInt(cavernSize);
				y+=r.nextInt(cavernSize);
				world[x][y]=0;
			}
		}catch(Exception e){}
	}
	public int numberOfNeighboors(int x , int y)
	{
		int searchFor = world[x][y];
		int nmb = 0;
		for(int i = -1;i<2;i++)
		{
			for(int j = -1;j<2;j++)
			{
				if(world[x+i][y+j]==searchFor)
				{
					nmb++;
				}
			}
		}
		return nmb--;
	}
	public void fullfillCaverns()
	{
		for(int i = 0;i<size;i++)
		{
			for(int j = 0;j<size;j++)
			{
				if(world[i][j]==1)
				{
					try
					{
						if(world[i+1][j]==0)
						{
							world[i+1][j]=1;
						}
					}catch(Exception e){}
				}
			}
		}
	}
}
