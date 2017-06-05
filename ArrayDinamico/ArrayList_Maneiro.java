import java.util.Scanner;
import java.util.Iterator;
import java.util.Collections;
import java.util.ArrayList;

 class ArrayList_Maneiro{
public static void main()
{
    int i=1;
    ArrayList<Integer> list=new ArrayList();
    Scanner a=new Scanner(System.in);
    
System.out.println("Obs: 0 para sair");
while (i!=0)
    {
    System.out.println("Digite um nº:");
    i=a.nextInt();
    list.add(i);
}
Iterator<Integer> iterator=list.iterator();
while(iterator.hasNext()){
System.out.println(iterator.next());
}

System.out.println("Crescente:\n");
Collections.sort(list);
Iterator<Integer> c=list.iterator();
while(c.hasNext())
    {
    System.out.println(c.next());
    }
    
    System.out.println("Decrescente:\n");
Collections.sort(list,Collections.reverseOrder());
Iterator<Integer> d=list.iterator();
while(d.hasNext())
    {
    System.out.println(d.next());
    }
}
}