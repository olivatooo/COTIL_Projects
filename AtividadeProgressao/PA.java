import java.util.ArrayList;
import java.util.Scanner;

class PA
{
public static void main()
    {   
        int controle=1;
        int aux=0;
        int q=0;
        ArrayList<Integer> array=new ArrayList();
        Scanner entrada=new Scanner(System.in);
    while(controle!=0) 
        {
        System.out.println("Digite um número: ");
        array.add(entrada.nextInt());
        System.out.println("Deseja continuar(Nao:0)");
        controle = entrada.nextInt();
        }
    for(int i=0;i<array.size()-1;i++)
            {
             q=(array.get(i+1))-array.get(i);
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
        
     System.out.println("\nÉ uma PA!!! uhuul \nRazão: "+q+"\nPrimeiro termo: "+array.get(0));
     
    }
}