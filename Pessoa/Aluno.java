public class Aluno extends Pessoa
{
    int RA;
    
    Aluno(String name, int i, Data n, int ra)
    {
        super(name,i,n);
        RA=ra;
    }
    public String toString()
    {
        return super.toString()+"\nRA:"+RA;
    }
}