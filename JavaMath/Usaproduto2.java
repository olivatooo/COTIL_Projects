class Usaproduto2{
public static void main(String args[])
{
Produto A=new Produto();
Produto B=new Produto();

A.codigo=10;
A.nome="Cookie";
A.quantidade=5;
A.preco=5.99;
System.out.println("Cód. A: "+A.codigo+" Nome A: "+A.nome+" ");
System.out.println("Qntd. A: "+A.quantidade+" Preço A: "+A.preco);
A.mostraPreco();
A.atualizaPreco(12);
A.mostraPreco();

B.preco=6;
B.mostraPreco();
B.atualizaPreco(9);
B.mostraPreco();
}
}