class Chefe extends Funcionario
{
private String departamento;
private String promocao;

Chefe(String nome, int id, String nasc, String adm, float sal, String dep, String prom)
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