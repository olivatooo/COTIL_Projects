class Crianca extends Pessoa
{
public boolean imaginacao;

Crianca(String nome, int id, Data nasc, boolean imaginacao)
    {
    super(nome,id,nasc);
    this.imaginacao=imaginacao;
    }
public String toString()
    {
    return (super.toString()+"\n"+
    "Imaginação: "+imaginacao);
    }
}