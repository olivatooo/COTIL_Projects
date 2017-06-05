import java.util.Scanner;
import java.util.ArrayList;

public class UsaVetor{
    
    public static void main()
    {
        Scanner a = new Scanner(System.in);
        ArrayList<Integer> vetor = new ArrayList();
        int selecao=0;
        System.out.println("Digite as posições do vetor");
        for(int i=0;i<10;i++)
        {
            selecao = a.nextInt();
            vetor.add(selecao);
        }
        
        System.out.println("Mostrando vetor");
         for(int i=0;i<vetor.size();i++)
        {
            System.out.println(vetor.get(i));
        }
        System.out.println("1. Exibir");
        System.out.println("2. Gravar em um arquivo e sair");
        selecao=a.nextInt();
        
        if(selecao==1)
        {
            Vetor b = new Vetor();
            try
            {
            b.Gerar(vetor);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            
        }
        if(selecao==2)
        {
            Vetor b = new Vetor();
            try
            {
                b.Gerar(vetor,"texto.txt");
            }
            catch(Exception e)
            {                
            }
        }
    }
}
    