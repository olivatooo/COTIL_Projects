class Funcionario extends Pessoa
{
private String admissao;
private float salario;
Funcionario(String nome, int id, Data nasc, String adm, float sal)
    {
    super(nome, id, nasc);
    admissao=adm;
    salario=sal;
    }
public String toString()
    {
    String resultado;
    resultado=super.toString()+"\n";
    resultado=resultado+"Data de admissão:"+admissao+"\n";
    resultado=resultado+"Salário:"+salario;
    return resultado;
    }
final public float qualSalario()
    {
    return salario;
    }
}