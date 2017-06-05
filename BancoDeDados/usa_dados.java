import java.util.Scanner;

public class usa_dados
{
public static void main()
    {
    dados d=new dados();
    if(d.conecta("143.106.241.1","3infd1","3infd1","3infd1"))
        {
        System.out.println("Conectado!");
        }
    else
        {
        System.out.println("Não conectado");
        }
    
    Scanner teclado=new Scanner(System.in);
    System.out.println("Digite seu nome: ");
    String n=teclado.nextLine();
    System.out.println("Digite sua idade: ");
    String i=teclado.nextLine();
    
    if(d.insere("cliente",n,i))
        {
        System.out.println("Inserido");
        }
        else{
        System.out.println("Não inserido");
        }
    }
}