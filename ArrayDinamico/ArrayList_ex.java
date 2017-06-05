import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.util.Scanner;

public class ArrayList_ex
{
public static void main(String args[])
    {
    Scanner entrada=new Scanner(System.in);
    ArrayList<String> agenda=new ArrayList();
    agenda.add("Bianca: 6");
    agenda.add("Gabriel: 4");
    agenda.add("Marcelo: 8");
    agenda.add("Bruno: 1");
    
    int i;
    System.out.printf("Exibindo o Array List:\n");
    for(i=0;i<agenda.size();i++)
        {
        System.out.printf("Posição %d -%s\n",i,agenda.get(i));
        }
    System.out.println("\nQual a posição a ser excluída:\n");
    i=entrada.nextInt();
    
    try{
    agenda.remove(i);
    }catch(Exception e)
        {
        System.out.printf("\nErro: posição inválida (%s).",e.getMessage());
        }
        System.out.println("Ordenando...");
        Collections.sort(agenda,Collections.reverseOrder());
    System.out.printf("\nExibindo o ArrayList (usando Iterator)\n");
    i=0;
    Iterator<String> iterator=agenda.iterator();
    while(iterator.hasNext())
        {
        System.out.printf("Posição %d-%s\n",i,iterator.next());
        i++;
        }
    }
}