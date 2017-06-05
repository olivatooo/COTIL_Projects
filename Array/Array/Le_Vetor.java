import java.util.Scanner;
class Le_Vetor
{
public static void main(String arg[])
    {
    Scanner entrada = new Scanner(System.in);
    int[]vetor=new int[5];
    for(int i=0;i<5;i++)
        {
        System.out.println("Digite um número para o vetor: ");
        vetor[i]=entrada.nextInt();
        }
        System.out.println("Valores digitados no vetor: ");
        for(int i=0;i<5;i++)
        System.out.println(vetor[i]);
    }
}