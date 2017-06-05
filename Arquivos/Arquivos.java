import java.util.Scanner;
import java.io.*;


public class Arquivos
{
    public static void main() throws IOException,FileNotFoundException
    {
        Scanner a = new Scanner(System.in);
        
        String string = "";
        String novo = "";
        String[] aux;
        
        
        int selecao = 1;
        while(selecao!=0)
        {
        System.out.println("1. Gravar nomes na agenda telefônica");
        System.out.println("2. Consultar nomes na lista");
        System.out.println("3. Alterar contatos existentes");
        System.out.println("4. Excluir contatos");
        System.out.println("5. Excluir tudo");
        System.out.println("0. Sair");
        System.out.println("Escolha uma opção:");
        try
        {
        selecao = a.nextInt();
        }catch(Exception e)
        {
            System.out.println("Seleção inválida");
            System.exit(0);
        }
        
        System.out.println("------------------------------------------------------------------");
        
        if(selecao==1)
        {
            FileWriter fw = new FileWriter("agenda.txt",true);
            System.out.println("Digite o nome do contato:");
            string = a.next();
            System.out.println("Digite o número do contato");
            string = " - "+string +" - "+ a.next() +"\n";
            fw.write(string); 
            fw.close();
            string = "";
        }
        if(selecao==2)
        {
            File file = new File("agenda.txt");
            if(!file.exists())
            {
                System.out.println("Arquivo não existe");
                break;
            }
            
            BufferedReader br = new BufferedReader(new FileReader("agenda.txt"));
            String saida = "";
            String linha;
            while((linha=br.readLine())!=null)
            {
                saida += linha + "\n";
            }
            br.close();
           
            System.out.println("\n<---------- AGENDA TELEFÔNICA 2016 ----------->\n");
            System.out.println(saida);
               
        }
        if(selecao==3)
        {
            File file = new File("agenda.txt");
            if(!file.exists())
            {
                System.out.println("Arquivo não existe");
                break;
            }
            
            BufferedReader br = new BufferedReader(new FileReader("agenda.txt"));
            String saida = "";
            String linha;
            while((linha=br.readLine())!=null)
            {
                saida += linha + "\n";
            }
            br.close();
            
            System.out.println("Digite o nome do contato a ser alterado:");
            string = a.next();
            System.out.println("Digite um novo nome:");
            novo = a.next();
            aux = saida.split(string);
            string = aux[0]+novo+aux[1];
            System.out.println(string);
            FileWriter fw = new FileWriter("agenda.txt",false);
            fw.write(string);
            fw.close();
        }
        if(selecao==4)
        {
            System.out.println("Digite o nome a ser excluído");
            string = a.next();   
            File file = new File("agenda.txt");
            
            if(!file.exists())
            {
                System.out.println("Arquivo não existe");
                break;
            }
            
            BufferedReader br = new BufferedReader(new FileReader("agenda.txt"));
            
            String saida = "";
            String linha;
            
            
            while((linha=br.readLine())!=null)
            {   
                if(saida.contains(string)==false)
                {
                saida += linha + "\n";
                }
            }
            
            br.close();
            aux = saida.split(string);
            
            
            FileWriter fw = new FileWriter("agenda.txt",false);
            fw.write(saida);
            fw.close();
            
        }
        if(selecao==5)
        {
          FileWriter fw = new FileWriter("agenda.txt",false);
          fw.write("");
          fw.close();
        }
        
        
        }
        
    }
    
}