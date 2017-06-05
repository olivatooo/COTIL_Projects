/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netbeansex;


import com.mysql.jdbc.PreparedStatement;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
public class Dados
{
Connection con;
public void Kill()
{
    try {
        con.close();
    } catch (SQLException ex) {
        Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, ex);
    }
}
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

public boolean insere(String tabela,String nome,String idade)
    {
    boolean retorno=false;
    try
        {
       PreparedStatement stmt=(PreparedStatement) this.con.prepareStatement("insert into "+tabela+"(nome,idade)values('"+nome+"',"+idade+");");
       stmt.execute();
       stmt.close();
       retorno=true;
        }catch(SQLException ex)
            {
            retorno=false;
            System.err.printf("Erro INSERT: "+ex);
            }
    System.out.println("insert into "+tabela+"(nome,idade)values('"+nome+"',"+idade+");");
           return retorno;
    }

public boolean insere(String tabela, String nome, String arquivo, JButton botao)
{
boolean retorno=false;
    try
        {
        PreparedStatement stmt=(PreparedStatement)this.con.prepareStatement("INSERT INTO +"+tabela+"(nome,arquivo,imagem) VALUES (?,?,?)");
        stmt.setString(1,nome);
        stmt.setString(2,arquivo);
        File arq=new File(arquivo);
        FileInputStream inputStream=null;
            try
                {
                inputStream=new FileInputStream(arq);
                }catch(FileNotFoundException ex)
                    {
                      System.err.println("Erro-"+ex);
                    }
            stmt.setBinaryStream(3,inputStream,(int) arq.length());
            stmt.execute();
            stmt.close();
            retorno=true;
        }catch(SQLException ex)
            {
            retorno=false;
            System.out.println("Erro INSERT:"+ex);
            }
    return retorno;
}

public boolean insere_cliente(String tabela, String cpf, String nome, String tel, String end, String caminho)
{
boolean retorno=false;
    try
        {
        PreparedStatement stmt=(PreparedStatement)this.con.prepareStatement("INSERT INTO "+tabela+" (CPF,Nome,Telefone,Endereco,Foto) VALUES (?,?,?,?,?)");
        stmt.setString(1,cpf);
        stmt.setString(2,nome);
        stmt.setString(3,tel);
        stmt.setString(4,end);
        stmt.setString(5,caminho);
        
            stmt.execute();
            stmt.close();
            retorno=true;
        }catch(SQLException ex)
            {
            retorno=false;
            System.out.println("Erro INSERT:"+ex);
            }
    return retorno;
}

        
public boolean insere_funcionario(String tabela, String cpf, String nome, String tel, String end, String caminho, String cargo, String salario,String login,String senha,String admin)
{
boolean retorno=false;
    try
        {
        PreparedStatement stmt=(PreparedStatement)this.con.prepareStatement("INSERT INTO "+tabela+" (CPF,Nome,Telefone,Endereco,Foto,Cargo,Salario,Login,Senha,Admin) VALUES (?,?,?,?,?,?,?,?,?,?)");
        stmt.setString(1,cpf);
        stmt.setString(2,nome);
        stmt.setString(3,tel);
        stmt.setString(4,end);
        stmt.setString(5,caminho);
        stmt.setString(6,cargo);
        stmt.setString(7,salario);
        stmt.setString(8,login);
        stmt.setString(9,senha);
        stmt.setString(10,admin);
            stmt.execute();
            stmt.close();
            retorno=true;
        }catch(SQLException ex)
            {
            retorno=false;
            System.out.println("Erro INSERT:"+ex);
            }
    return retorno;
}
public boolean excluirFocado(String nome,String livro)
{
    boolean retorno = false;
    try
    {  
       PreparedStatement stmt=(PreparedStatement) this.con.prepareStatement("DELETE FROM Livros_Locados WHERE id_livro='"+livro+"' AND CPF_cliente='"+nome+"';");
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
//OPTION PANE
//String response = JOptionPane.showInputDialog(null, "Digite sua consulta", "Consulta", JOptionPane.PLAIN_MESSAGE);

//TABLE
//DefaultTableModel dfm = (DefaultTableModel)tabela.getModel();
/*dfm.addRow(new String[dfm.getColumnCount()]);
              dfm.setValueAt(rs.getString("nome"),linha,0);
              dfm.setValueAt(rs.getString("idade"),linha,1);*/

    boolean insere_dependentes(String tabela, String cpf, String nome) {
        boolean retorno=false;
    try
        {
        PreparedStatement stmt=(PreparedStatement)this.con.prepareStatement("INSERT INTO "+tabela+" (Nome,cpf_cliente) VALUES (?,?)");
        stmt.setString(1,nome);
        stmt.setString(2,cpf);  
        
            stmt.execute();
            stmt.close();
            retorno=true;
        }catch(SQLException ex)
            {
            retorno=false;
            System.out.println("Erro INSERT:"+ex);
            }
    return retorno;
    }

    
     boolean insere_livro(String tabela, String id, String titulo, String autor, String editora, String qntd, String data, String disponivel) {
        boolean retorno=false;
    try
        {
        PreparedStatement stmt=(PreparedStatement)this.con.prepareStatement("INSERT INTO "+tabela+" (id_livro,Titulo_livro,Autor,Editora,Data,Qntd,Disponivel) VALUES (?,?,?,?,?,?,?)");
        stmt.setString(1,id);
        stmt.setString(2,titulo); 
        stmt.setString(3,autor); 
        stmt.setString(4,editora); 
        stmt.setString(5,data); 
        stmt.setString(6,qntd);
        stmt.setString(7,disponivel);
        
            stmt.execute();
            stmt.close();
            retorno=true;
            
        }catch(SQLException ex)
            {
            retorno=false;
            System.out.println("Erro INSERT:"+ex);
            }
    return retorno;
    }
     boolean insere_locacao(String id,String cpf_cliente) {
        boolean retorno=false;
    
        //System.out.println("ID livro: "+consulta("SELECT id_livro FROM Livros WHERE Titulo_livro='"+titulo+"';"));
        
        try
        {
        
        PreparedStatement stmt=(PreparedStatement)this.con.prepareStatement("INSERT INTO Livros_Locados (id_livro,CPF_cliente,Data_locacao) VALUES (?,?,CURDATE())");
        stmt.setString(1,id);
        stmt.setString(2,cpf_cliente); 
            stmt.execute();
            stmt.close();
            retorno=true;
            
        }catch(SQLException ex)
            {
            retorno=false;
            System.out.println("Erro INSERT:"+ex);
            }

    return retorno;

     }








}