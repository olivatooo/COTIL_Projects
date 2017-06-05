public class Ator extends Pessoa
{
    private String contrato;
    
    Ator(String name, int i, Data n, String c)
    {
        super(name,i,n);
        contrato=c;
    }
    public String toString()
    {
        return super.toString()+"\nContrato:"+contrato;
    }
}