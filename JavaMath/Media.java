public class Media
{
public static void main(float n1, float n2, float n3, String nome)
    {
        try
        {
        CalculaMedia(n1,n2,n3);    
        }catch(Exception e){};
        
        System.out.println("Nome: "+nome);
    }
public static void CalculaMedia(float n1, float n2, float n3)
    {
    System.out.println("Média: "+((n1+n2+n3)/3));
    }
    
}