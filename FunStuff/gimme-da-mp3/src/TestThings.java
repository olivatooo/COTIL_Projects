
public class TestThings {
	public static void main(String args[])
	{
		int qntdecarlos=10;
		Carlos c = new Carlos();
		c.createAllCarlos();
		for(int i = 0;i<qntdecarlos;i++)
		{
			c.createNewCarlos(2);
		}
		for(int i = 0;i<qntdecarlos;i++)
		{
			c.createNewCarlos(3);
		}
	}
}
