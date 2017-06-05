class EmprestimoBancario
{
public static void main(String arg[])
    {
    Pessoa p1=new Pessoa("Joao",98789,
    new Data((byte)23,(byte)12,(short)1999));
    
    Funcionario f1=new Funcionario("Pedro",5435343,
    new Data((byte)30,(byte)1, (short)1982),
    new Data((byte)12,(byte)3,(short)1965),
    2500.0f);
    
    Funcionario f2=new Funcionario("Joaquim",7656453,
    new Data((byte)14,(byte)9, (short)1982),
    new Data((byte)2,(byte)1,(short)1995),
    3200.0f);
    
    Funcionario f3=new Funcionario("Seu Manoel",345435543,
    new Data((byte)29,(byte)10, (short)1952),
    new Data((byte)2,(byte)7,(short)1985),
    3600.0f);
    
    Chefe c1= new Chefe("Henriqui", 7678668,
    new Data((byte)3,(byte)3,(short)1921),
    new Data((byte)2,(byte)1,(short)1951),
    4100.0f,"Setor de Parafusos e Pregos",
    new Data((byte)4,(byte)12,(short)1955));
    
    System.out.println(calculaEmprestimo(p1));
    System.out.println(calculaEmprestimo(f1));
    System.out.println(calculaEmprestimo(f2));
    System.out.println(calculaEmprestimo(f3));
    System.out.println(calculaEmprestimo(c1));
    
    }
public static float calculaEmprestimo(Pessoa p)
    {
    return 1000.0f;
    }
public static float calculaEmprestimo(Funcionario f)
    {
    float emprestimo=0f;
    if(f instanceof Chefe)
        {
        emprestimo=4.0f*f.qualSalario();
        }else if(f instanceof Funcionario)
        {
        emprestimo=2.0f*f.qualSalario();
        }
        return emprestimo;
    }
}