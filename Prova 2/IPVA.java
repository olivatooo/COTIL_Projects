public class IPVA
{
    public boolean Checa(String checa)
    {
        try
        {
            Double.parseDouble(checa);
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }
    public double Calcula(double ipva)
    {
        return(0.03*ipva);
    }
}