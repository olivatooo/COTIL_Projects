public class RegistroAcademico
{
String nome;
int ra;
int idade;
String classe;
String curso;

RegistroAcademico(String nome, int ra, int idade, String classe, String curso)
    {
        this.nome=nome;
        this.ra=ra;
        this.idade=idade;
        this.classe=classe;
        this.curso=curso;
    }
RegistroAcademico(String nome)
        {
        this.nome=nome;
        }
RegistroAcademico(int ra)
    {
    this.ra=ra;
    }
RegistroAcademico()
    {
    System.out.println("Nada foi passado");
    }
public String toString()
    {
    return "Nome: "+nome+"\n"+
    "RA: "+ra+"\n"+
    "Idade: "+idade+"\n"+
    "Classe: "+classe+"\n"+
    "Curso: "+curso+"\n";
    }
}
