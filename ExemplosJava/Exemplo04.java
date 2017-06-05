class Exemplo04
{
    public static void main(String args[])
    {
        try
        {
            System.out.println("Erro mortal: explodir em 4..3..2...1...");
            throw new Exception("MyException");
        }
        catch(Exception MyException)
            {
            System.out.println("Boooom");
            }
    }
}