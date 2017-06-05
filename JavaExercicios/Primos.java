public class Primos
{
    public static void main()
    {
        int i=1,t=1,cont=0;
        for(i=1;i<101;i++)
        {     
            cont=0;
            for(t=1;t<101;t++)
            {                  
               if(((i)%(t))==0)
                {
                cont++;
                }
            }
        if(cont<=2)
        {
        System.out.println(i);
        }     
        
        }
    }
}