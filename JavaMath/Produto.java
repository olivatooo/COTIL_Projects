class Produto
{
static int codigo;
String nome;
int quantidade;
double preco;

public void mostraPreco()
{
    System.out.println(preco);
}

public void atualizaPreco(double porc){
    preco=preco+preco*porc/100;
}
}