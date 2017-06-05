class Exemplo2{
public static void main(String args[])
    {
        System.out.println("Resultado= "+soma(args[0],args[1]));
    }
public static int soma(String Num1, String Num2)
    {
    int x=0,y=0;
    try
        {
        x=Integer.parseInt(Num1);
        y=Integer.parseInt(Num2);
        }
    catch(Exception e)
        {
        System.out.println("Digite apenas numeros");
        System.exit(0);
        
        }
     return(x+y);   
    }
}