import java.util.ArrayList;
import java.io.*;
import java.util.Collections;
public class Vetor
{
    ArrayList<Integer> a = new ArrayList();
    Vetor(){
        for(int i=0;i<a.size();i++)
        {
            a.add(0);
        }
    }
    public void Gerar(ArrayList<Integer> vetor)
    {
        for(int i=0;i<vetor.size();i++)
        {
            System.out.println(vetor.get(i));
        }
    }
    public void Gerar(ArrayList<Integer> args,String arq) throws Exception
    {
        FileWriter fw = new FileWriter(arq,true);
        ArrayList<Integer> a = new ArrayList();
        String saida="";
        for(int i=0;i<args.size();i++)
        {
            a.add(args.get(i));
        }
        Collections.sort(a,Collections.reverseOrder());
        for(int i=0;i<a.size();i++)
        {
           saida=saida+""+a.get(i);
        }
        System.out.println(saida);
        fw.write(saida);
        fw.close();
        
    }
}