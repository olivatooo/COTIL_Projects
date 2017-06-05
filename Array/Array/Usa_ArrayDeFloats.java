import java.util.Scanner;
class Usa_ArrayDeFloats
{
public static void main(String arg[])
{
ArrayDeFloats vetor=new ArrayDeFloats(5);
Scanner entrada = new Scanner(System.in);
for(int i=0;i<vetor.tamanho();i++)
    {
    System.out.println("Digite um valor ("+(i+1)+"/"+vetor.tamanho()+"):");
    vetor.modifica(i,entrada.nextFloat());
    }
System.out.println("Vetor digitado: ");
for(int i=0;i<vetor.tamanho();i++)
System.out.println(vetor.valor(i));
System.out.println("Menor valor: "+vetor.menorValor());
System.out.println("Maior valor: "+vetor.maiorValor());
}
}