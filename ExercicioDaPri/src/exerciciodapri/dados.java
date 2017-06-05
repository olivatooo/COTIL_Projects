package exerciciodapri;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;

public class dados
{
Connection con;

public boolean conecta(String local, String banco, String usuario, String senha)
    {
    boolean retorno=false;
    try{
    Class.forName("com.mysql.jdbc.Driver");
    con=DriverManager.getConnection("jdbc:mysql://"+local+"/"+banco,usuario,senha);
    retorno=true;
    }
    catch(ClassNotFoundException e)
        {
        System.err.println("1-Erro de conexão:\n"+e);
        }
    catch(SQLException e)
        {
        System.err.println("2-Erro de conexão:\n"+e);
        }
     return retorno;
    }



public boolean insere(String tabela,int codigo,String descricao)
    {
    boolean retorno=false;
    try
        {
       PreparedStatement stmt=(PreparedStatement) this.con.prepareStatement("insert into "+tabela+"(codigo,descricao)values("+codigo+",'"+descricao+"');");
       stmt.execute();
       stmt.close();
       retorno=true;
        }catch(SQLException ex)
            {
            retorno=false;
            System.err.printf("Erro INSERT: "+ex);
            }
           return retorno;
    }
public boolean insere(String tabela,int codigo,int qnt)
    {
    boolean retorno=false;
    try
        {
       PreparedStatement stmt=(PreparedStatement) this.con.prepareStatement("insert into "+tabela+"(cod_produto,quantidade)values("+codigo+","+qnt+");");
       stmt.execute();
       stmt.close();
       retorno=true;
        }catch(SQLException ex)
            {
            retorno=false;
            System.err.printf("Erro INSERT: "+ex);
            }
           return retorno;
    }


public boolean excluir(String tabela,String campo,String nome)
{
    boolean retorno = false;
    try
    {
       PreparedStatement stmt=(PreparedStatement) this.con.prepareStatement("DELETE FROM "+tabela+" WHERE "+ campo + "=" + "'"+nome+"'");
       stmt.execute();
       stmt.close();
       retorno=true;
    }
    catch(Exception e)
    {
        retorno= false;
    }
    return retorno;
}
public void alterar(String cod,String qnt)
{
    try
    {
       PreparedStatement stmt = (PreparedStatement)this.con.prepareStatement("UPDATE `3infd1`.`estoque` SET `quantidade`='"+qnt+"' WHERE `cod_produto`='"+cod+"';");
       stmt.execute();
       stmt.close();
    }
    catch(Exception e)
    {
        System.err.println("Erro CONSULTA:"+e);
    }
}
public ResultSet consulta(String consulta)
{
    ResultSet rs = null;
    try
    {
       PreparedStatement stmt = (PreparedStatement)this.con.prepareStatement(consulta);
       rs = stmt.executeQuery();
    }
    catch(Exception e)
    {
        System.err.println("Erro CONSULTA:"+e);
    }
    return rs;
}












}