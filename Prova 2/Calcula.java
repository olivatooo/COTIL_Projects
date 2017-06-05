public class Calcula
{
    public static void main(String args[])
    {
        for(int i = 0;i<args.length;i++)
        {
         Calcula.Checa(args[i]);
        }
   }
   public static void Checa(String checa)
   {
        try
         {
             Integer.parseInt(checa);
             System.out.println("Número: "+checa);
         }
         catch(Exception e)
         {
             System.out.println("Não número: "+checa);
         }
   }
}