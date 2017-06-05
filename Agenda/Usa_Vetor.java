import java.util.Scanner;
import java.util.ArrayList;

class Usa_Vetor
{
 static Vetor a=new Vetor();
 static Scanner ent=new Scanner(System.in);
 static ArrayList<Integer> vetor=new ArrayList();
 public static void main()
    {
        int i=0;
    while(i<10)
        {
        System.out.print("Digite o valor para a posição "+i+": ");
        vetor.add(ent.nextInt());
        i++;
        }
    System.out.println("\nSelecione:");
    System.out.println("1-Deseja exibir o vetor?");
    System.out.println("2-Deseja gravá-lo em um arquivo?");
    System.out.print("\nOpção:");
    i=ent.nextInt();
    
    try{
    if(i==1)
        {
        a.Gerar(vetor);
        }
    else if(i==2)
        {
        a.Gerar("arquivo.txt",vetor);
        }
    else 
        {
        System.out.print("\nOpção:");
        i=ent.nextInt();
        }
    }catch(Exception e){}
}
}