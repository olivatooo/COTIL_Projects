public class VerificaCalcula
{
public boolean Faixa(int num)
    {
    if ((num<100)&&(num>0))
        {
            return true;
        }
    return false;
    }
public void Pares(int n1, int n2)
    {   
    for(int i = n1;i<n2;i++)
    {
        if((i%2)==0)
        {
            System.out.println(i);
        }
    }
    }    
}