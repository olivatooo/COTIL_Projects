class Exemplo1
{
    public static void main(String args[])
    {
        String frase1 = "Estudo muito";
        String frase2 = "porque sei que";
        String frase3 = "serei valorizado!";
        limpaTela();
        tela(frase1);
        tela(" ");
        tela(frase2);
        tela(" ");
        tela(frase3);
    }
    public static void tela(String S)
    {
        System.out.println(S);
    }
    public static void limpaTela()
    {
        for(int i=0;i<100;i++)
        {
            System.out.println();
        }
    }
}