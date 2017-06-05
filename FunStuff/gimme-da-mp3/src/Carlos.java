import java.util.Random;


public class Carlos {
	String result = "";
	char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	
	public void createAllCarlos()
	{
		for(int i = 0;i<alphabet.length;i++)
		{
			result=alphabet[i]+"arlos";
			System.out.println(result.substring(0, 1).toUpperCase() + result.substring(1));
		}
	}
	public void createNewCarlos(int size)
	{	
		result ="";
		Random r = new Random();
		for(int i = 0;i<size;i++)
		{
			result+=alphabet[r.nextInt(alphabet.length)];
		}
		result +="arlos";
		System.out.println(result.substring(0, 1).toUpperCase() + result.substring(1));
	}
}
