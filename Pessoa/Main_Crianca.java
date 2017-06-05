class Main_Crianca
{
public static void main(String nome, int id, byte dia, byte mes, short ano, boolean imag)
    {
    Data a=new Data(dia, mes, ano);
    Crianca b=new Crianca(nome, id, a, imag);
    System.out.println(b);
    
    if(b.imaginacao==false)
    {
        System.out.println("Isso é grande");
    }
}
}