import java.util.Scanner;
import java.util.Collections;
import java.io.*;

class Agenda_Da_Pri
{
    static Scanner entrada=new Scanner(System.in);
    static String arquivo="agenda_legal.txt";
    static String nome;
    static int tel;
    static String linha="";
    static String saida;
    static int cont=0;
public static void main()
    {
        int op=1;
    while(op!=0)
        {
          System.out.println("\n------------MENU-----------");
          System.out.println("1-Incluir");
          System.out.println("2-Consultar");
          System.out.println("3-Alterar");
          System.out.println("4-Excluir");
          System.out.println("5-Excluir tudo");
          System.out.println("6-Mostrar Agenda");
          System.out.println("0-Sair");
          System.out.print("\nOpção: ");
          op=entrada.nextInt();
          
          try{
          if(op==0) System.exit(0);
          else if(op==1)
            {
            incluir(true);
            }
            else if(op==2)
            {
             System.out.print("\nNome para consulta: ");
             nome=entrada.next();
             consultar();
            }
            else if(op==3)
            {
            System.out.print("\nNome do contato a ser alterado: ");
            nome=entrada.next();
            alterar();
            }
            else if(op==4)
            {
            System.out.print("\nNome do contato a ser excluído: ");
            nome=entrada.next();
            excluir();
            }
            else if(op==5)
            {
            excluir_tudo();
            }
            else if(op==6)
            {
            mostrar();
            }
            else
            {
            System.out.print("\nOpção Inválida! Digite novamente: ");
            op=entrada.nextInt();
            }
        }catch(Exception e)
            {
            e.printStackTrace();
            }
    }
}
public static void incluir(boolean add) throws FileNotFoundException, IOException
    {
    System.out.println("\n--------Novo Contato-----\n");
    System.out.print("Nome: ");
    nome=entrada.next();
    System.out.print("Telefone: ");
    tel=entrada.nextInt();
    FileWriter fw=new FileWriter(arquivo,add);
    fw.write(nome+"\n");
    fw.write(tel+"\n");
    fw.close();
    mostrar();
    }
public static void alterar() throws FileNotFoundException, IOException
    {
    File file=new File(arquivo);
    if(!file.exists()) System.out.println("Arquivo não existe!");
    else
        {   
        BufferedReader br=new BufferedReader(new FileReader(arquivo));
        while((linha=br.readLine())!=null)
        {
        if(linha.equals(nome))
            {
            proxLinha=br.readLine();
            }
        }
        
    }
}
public static void consultar() throws FileNotFoundException, IOException
    {
    File file=new File(arquivo);
    if(!file.exists()) System.out.println("Arquivo não existe!");
    else
        {   
        BufferedReader br=new BufferedReader(new FileReader(arquivo));
        while((linha=br.readLine())!=null)
            {
            if(linha.equals(nome))
                {
                System.out.println("\nContato encontrado!");
                System.out.println("Nome: "+nome);
                System.out.println("Telefone: "+br.readLine());
                cont++;                
                }
            }
        linha="";
        if(cont<1) System.out.println("Contato não encontrado :c");
    }
    }    
public static void excluir() throws FileNotFoundException, IOException
    {
        saida="";
        String proxLinha="";
    File file=new File(arquivo);
    if(!file.exists()) System.out.println("Arquivo não existe!");
    else
        {   
        BufferedReader br=new BufferedReader(new FileReader(arquivo));
        while((linha=br.readLine())!=null)
            {
            if(linha.equals(nome))
                {
                 proxLinha=br.readLine();
                 System.out.println("\nContato excluído!");
                }
            else if(linha.equals(proxLinha))
                {
                    System.out.println("proxLinha: "+proxLinha);
                }
            else
                {
                saida+=linha+"\n";
                }
            }
         FileWriter fw=new FileWriter(arquivo,false);   
         fw.write(saida);
         fw.close();
         mostrar();
         linha="";
        }
    }
public static void excluir_tudo() throws FileNotFoundException, IOException
    {
    FileWriter fw=new FileWriter(arquivo,false);
    fw.write("");
    fw.close();
    mostrar();
    }
public static void mostrar() throws FileNotFoundException, IOException
    {
    File file=new File(arquivo);
    if(!file.exists()) System.out.println("Arquivo não existe!");
    else
        {
        BufferedReader br=new BufferedReader(new FileReader(arquivo));
        System.out.println("\n============ AGENDA ===========\n");
        while((linha=br.readLine())!=null)
            {
            System.out.println(linha);
            }
         linha="";
        }
    }
}