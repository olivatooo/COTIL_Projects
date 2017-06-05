import java.util.Scanner;
public class ExclueRegistros
{
      public static void main()
    {
        
        dados d = new dados();
        String nome;
        Scanner a = new Scanner(System.in);
           if(d.conecta("143.106.241.1","3infd1","3infd1","3infd1"))
        {
        System.out.println("Conectado!");
        }
        else
        {
        System.out.println("Não conectado");
        }
        System.out.println("Digite o nome a ser excluído:");
        nome=a.next();
        
        try
        {
         d.excluir("cliente","nome",nome);
         System.out.println("Sucesso!");
        }
        catch(Exception e)
        {
            System.out.println("Houve um erro:"+e);
        }
    }    
}
