class Triangulo 
{
public static void main(String args[])
    {
        float l1,l2,l3;
        l1=3;
        l2=l1++;
        l3=4;
        System.out.println(l2);
      boolean igualdade12,igualdade23;
      igualdade12=(l1==l2);
      igualdade23=(l2==l3);
      System.out.print("Lado 1 igual a lado 2?");
      System.out.println(igualdade12);
      System.out.print("Lado 2 igual a lado 3?");
      System.out.println(igualdade23);
      
      boolean equilatero;
      equilatero=(igualdade12&igualdade23);
      System.out.print("Triangulo equilatero?"+equilatero);      
    }
}