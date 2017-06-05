import java.util.ArrayList;
import java.util.Scanner;

class PG
{
public static void main()
    {   
        int controle=1;
        double aux=0;
        double q=0;
        String x="";
        ArrayList<Double> array=new ArrayList();
        Scanner entrada=new Scanner(System.in);
    while(controle!=0) 
        {
        System.out.println("Digite um número: ");
        array.add(entrada.nextDouble());
        System.out.println("Deseja continuar(Nao:0)");
        controle = entrada.nextInt();
        }
    for(int i=0;i<array.size()-1;i++)
            {
             q=(array.get(i+1))/array.get(i);
             if(i==0)
             {
             aux=q;
             }
             if(aux!=q)
             {
                 System.out.println("\nNão existe razão nas coisas feitas pelo coração");
                 System.exit(0);
             }
             aux=q;
            }
        
    
     if(q<0)
     {
          x=("Oscilante");
        }
        if(((q>0)&&(array.get(0)>0))||(((q<1)&&(q>0)&&(array.get(0)<0)))){
          x=("Crescente");
        }
         if(q==1)
     {
          x=("Constante");
        }
         if(((q>1)&&(array.get(0)<0))||(((q<1)&&(q>0)&&(array.get(0)>0))))
         {
          x=("Decrescente");
        }
    System.out.println("\nÉ uma PG!!! uhuul \nRazão "+x+": "+q+"\nPrimeiro termo: "+array.get(0));
    }
}