public class Ex5
{
    public static void main(String args[])
    {
    String texto = "";
    
    for(int i=0;i<256;i++)
        {
        try
            {
            texto=texto+" "+args[i];
            }  
            catch(Exception e){};
        }
    texto.trim();
    System.out.println(texto.replace(' ','*'));
    }
}