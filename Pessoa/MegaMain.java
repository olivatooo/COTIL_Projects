public class MegaMain
{
    public static void main(String args[])
    {
         String nome = args[0];
         int identidade = Integer.valueOf(args[1]);
         byte d = Byte.valueOf(args[2]);
         byte m = Byte.valueOf(args[3]);
         short a = Short.valueOf(args[4]);         
         Data nascimento = new Data(d,m,a);
         
         try
         {
             int ra = Integer.valueOf(args[5]);
             Aluno b = new Aluno(nome,identidade,nascimento,ra);
             System.out.println(b);     
         }
         catch (Exception f)
            {
             Ator c = new Ator(nome,identidade,nascimento,args[5]);
             System.out.println(c);
             
            }
            try{
                    boolean imag=Boolean.valueOf(args[5]);
             Crianca g=new Crianca(nome,identidade,nascimento,imag);
             System.out.println(d);
            }
        catch(Exception e)
            {
            
            }
        }
}