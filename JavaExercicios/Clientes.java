public class Clientes
{
    public static void main(String nome1,double alt1,int peso1,int idade1, String nome2,double alt2,int peso2,int idade2)
    {
    Alunos A=new Alunos();
    Alunos B=new Alunos();
    
    A.nome=nome1;
    A.alt=alt1;
    A.peso=peso1;
    A.idade=idade1;
    
    B.nome=nome2;
    B.alt=alt2;
    B.peso=peso2;
    B.idade=idade2;
    
    A.mostraNome();
    System.out.println(A.imc());
    B.mostraNome();
    System.out.println(B.imc());
    
    }
}