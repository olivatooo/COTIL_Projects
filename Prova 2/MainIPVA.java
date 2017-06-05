public class MainIPVA
{
public static void main(String arg)
    {
    IPVA a =new IPVA();
           
    if ((a.Checa(arg))==true)
        {
        double n=Double.parseDouble(arg);
        System.out.println("Valor do IPVA: "+a.Calcula(n));
        }
        else
        {
        System.out.println("Número inválido!");
    }
    }
}