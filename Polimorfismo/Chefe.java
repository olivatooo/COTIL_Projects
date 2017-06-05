class Chefe extends Funcionario
{
private String departamento;
private Data promocao;

Chefe(String nome, int id, Data nasc, Data adm, float sal, String dep, Data prom)
    {
    super(nome,id,nasc,adm,sal);
    departamento=dep;
    promocao=prom;
    }
public String toString()
    {
    String retorna=super.toString()+"\n";
    retorna+="Promovido em: "+promocao+"\n"+"Departamento: "+departamento;
    return retorna;
}
public String qualDepartamento()
    {
     return departamento;   
    }
}