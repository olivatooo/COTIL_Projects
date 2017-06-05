public class Alunos
{
    String nome;
     int idade;
     int peso;
     double alt;
    
    public void mostraNome()
    {
    System.out.println(nome);
    }
    
    public void mostraIdade()
    {
    System.out.println(idade);
    }
    
    public void mostraPeso()
    {
    System.out.println(peso);
    }
    
     public void mostraAlt()
    {
    System.out.println(alt);
    }
    
    public double imc()
    {
    return (peso/(alt*alt));
    }
}
