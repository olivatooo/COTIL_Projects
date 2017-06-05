import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Vetor
{
    static String saida="";
Vetor()
    {
        for(int i=0;i<10;i++)
            {
            vetor.add(i,0);
            }
    }
public static void Gerar(ArrayList<Integer> vetor)
    {
    for(int i=0;i<vetor.size();i++)
        {
         System.out.println("-----Array-----\n");
         System.out.println("Posição "+i+" - "+vetor.get(i));
        }
    }
public static void Gerar(String arquivo, ArrayList<Integer> vetor) throws FileNotFoundException, IOException
    {
    FileWriter fw=new FileWriter(arquivo,false);
    Collections.sort(vetor,Collections.reverseOrder());
    for(int i=0;i<vetor.size();i++)
        {
         saida+=vetor.get(i)+"\n";
        }
    fw.write(saida);
    fw.close();
    }
}