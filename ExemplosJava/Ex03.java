class Ex03
{
 public static void main(String args[])
    {
    int n1,n2;
    try
        {
        n1=Integer.parseInt(args[0]);    
        n2=Integer.parseInt(args[1]);    
        System.out.println("Soma="+(n1+n2));
        System.out.println("Subtração="+(n1-n2));
        System.out.println("Multiplicação="+(n1*n2));
        System.out.println("Divisão="+(n1/n2));
        
        }
        catch(ArithmeticException e)
            {
            System.out.println("Erro de divisão por zero");
            }
        catch(ArrayIndexOutOfBoundsException e)
            {
            System.out.println("Número de argumentos inválidos");
            }
        catch(NumberFormatException e)
            {
            System.out.println("Apenas números inteiros!");
            }
     finally
        {
          System.out.println("tchau, pequeno");
        }
    }
}