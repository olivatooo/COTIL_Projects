class Usaproduto1{
public static void main(String args[]){
Produto A,B;
A=new Produto();
B=new Produto();

System.out.println("Cód. A: "+A.codigo+" Nome A: "+A.nome+" ");
System.out.println("Qntd. A: "+A.quantidade+" Preço A: "+A.preco);
A.codigo=10;
A.nome="Cookie";
A.quantidade=5;
A.preco=5.99;

System.out.println("Cód. A: "+A.codigo+" Nome A: "+A.nome+" ");
System.out.println("Qntd. A: "+A.quantidade+" Preço A: "+A.preco);

System.out.println("Cód. B: "+B.codigo+" Nome B: "+B.nome+" ");
System.out.println("Qntd. B: "+B.quantidade+" Preço B: "+B.preco);
B.codigo=5;
B.nome="Bombom de chocolate belga u.u";
B.quantidade=9;
B.preco=8.99;

System.out.println("Cód. B: "+B.codigo+" Nome B: "+B.nome+" ");
System.out.println("Qntd. B: "+B.quantidade+" Preço B: "+B.preco); 

}
}