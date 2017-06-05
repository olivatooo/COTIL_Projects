import java.util.Scanner;
public class ArraysManeiros
{
    public static void main()
    {
        Scanner entrada=new Scanner(System.in);
        
       
        int i=1;
        int[] principal = new int[i];
        int[] mirror = new int[i];
        int controle = 1;
        
        while(controle!=0)
        {
            System.out.println("Digite um número");
            System.out.print("Número:");
            controle = entrada.nextInt();
            principal[i-1]=controle;
            System.out.println("Deseja continuar?(1)");
            controle = entrada.nextInt();
            if(controle==1)
            {
            i++;
            mirror = principal;
            principal = new int[i];
            for(int z=0;z<i-1;z++)
            {
                principal[z]=mirror[z];
            }
            mirror = new int[i];
            }
        }
        System.out.println("Mostrando o vetor:");
        for(int z=0;z<i;z++)
        {
            System.out.println("Posição:"+z+"="+principal[z]);
        }
        System.out.println("\nDecrescente:");
        
        for(int x=0;x<principal.length;x++)
        {
            for(int y=0;y<principal.length;y++)
            {
             if(principal[x]>principal[y])
            {
            int aux=principal[x];
            principal[x]=principal[y];
            principal[y]=aux;
            }
            }
        }
 
        for(int z=0;z<i;z++)
        {
            System.out.println("Posição:"+z+"="+principal[z]);
        }
        
        System.out.println("\nCrescente:");
        int z=principal.length;
        while(z!=0)
        {
            z--;
            System.out.println("Posição:"+z+"="+principal[z]);
            
        }
        
        
       
        
       System.exit(0);
    }
}