/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netbeansex;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.ResultSet;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class CadFuncionario extends javax.swing.JInternalFrame {

     private Dados d;
    /**
     * Creates new form CadCliente
     */
    public CadFuncionario() {
        initComponents();
         d = new Dados();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        nome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cpf = new javax.swing.JTextField();
        tel = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        end = new javax.swing.JTextField();
        foto = new javax.swing.JButton();
        cadastrar = new javax.swing.JButton();
        consultar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cargo = new javax.swing.JTextField();
        salario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        login = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        senha = new javax.swing.JPasswordField();
        confirmarsenha = new javax.swing.JPasswordField();
        excluir = new javax.swing.JButton();
        atualizar = new javax.swing.JButton();
        admin = new javax.swing.JCheckBox();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");

        setClosable(true);
        setTitle("Cadastro de Anões");

        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome:");

        jLabel2.setText("CPF:");

        jLabel3.setText("Telefone:");

        cpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cpfKeyPressed(evt);
            }
        });

        tel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                telKeyPressed(evt);
            }
        });

        jLabel4.setText("Endereço:");

        foto.setText("Foto");
        foto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fotoMouseClicked(evt);
            }
        });

        cadastrar.setText("CADASTRAR");
        cadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastrarMouseClicked(evt);
            }
        });

        consultar.setText("Consultar Anões");
        consultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consultarMouseClicked(evt);
            }
        });

        jLabel5.setText("Cargo:");

        jLabel6.setText("Salário:");

        salario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salarioActionPerformed(evt);
            }
        });

        jLabel7.setText("Login:");

        jLabel8.setText("Senha:");

        jLabel9.setText("Confirmar senha:");

        confirmarsenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarsenhaActionPerformed(evt);
            }
        });

        excluir.setText("Excluir Anões");
        excluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                excluirMouseClicked(evt);
            }
        });

        atualizar.setText("Atualizar Anões");
        atualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atualizarMouseClicked(evt);
            }
        });

        admin.setText("Admin?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(end)
                            .addComponent(nome, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                            .addComponent(cargo)
                            .addComponent(login))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(cpf))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(8, 8, 8))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(salario, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                            .addComponent(tel)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(admin))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(senha)
                            .addComponent(confirmarsenha)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 91, Short.MAX_VALUE)
                        .addComponent(atualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(consultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(excluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cadastrar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(end, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(admin))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(confirmarsenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(consultar)
                    .addComponent(cadastrar)
                    .addComponent(excluir)
                    .addComponent(atualizar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

    private void salarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salarioActionPerformed
 
     
      private void carregaImagem(JButton botao, String arquivo) 
    {
       try{
        File file =new File(arquivo);
        BufferedImage bufi= ImageIO.read(file);
        ImageIcon ico=new ImageIcon(bufi);
        
        Image img = ico.getImage() ;  
        Image newimg = img.getScaledInstance( foto.getWidth(),foto.getHeight(),  java.awt.Image.SCALE_SMOOTH ) ;  
        ico = new ImageIcon( newimg );
        botao.setIcon(ico);
        
        //BIANCA QND ESTUDAR IGNORE ISSO
       // botao.setIcon(new ImageIcon(ImageIO.read(getClass().getResource(arquivo))));
       
        }catch(Exception e)
            {
                System.out.println("ERRO:"+e.toString());
            }
    }
                                       
    
    private void cadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarMouseClicked
       Dados d = new Dados();
       boolean foi = false;
       d.conecta("143.106.241.1","3infd1", "3infd1", "3infd1");
       String pass = new String(senha.getPassword());
       String confirmPass = new String(confirmarsenha.getPassword());
       System.out.println("Pass:"+pass);
       System.out.println("ConfirmPass:"+confirmPass);
       
       boolean camposOK=true;
       
       if(!pass.equals(confirmPass))
       {
           JOptionPane.showConfirmDialog(null,"As senhas digitadas são diferentes!","Erro",JOptionPane.PLAIN_MESSAGE);
           camposOK=false;
       }
       
       if((nome.getText().trim().equals(""))||(cpf.getText().equals(""))||(end.getText().equals(""))||(tel.getText().equals(""))||(foto.getText()=="Foto")||(foto.getText().trim().equals("nullnull"))||(login.getText().equals(""))||(pass==(""))||(salario.getText().equals(""))||(cargo.getText().equals(""))||(confirmPass==("")))
            {
               JOptionPane.showConfirmDialog(null,"Não saia da mesa sem pagar a todos (Preencha todos os campos)","Erro  ( ͠° ͟ʖ ͡°) ",JOptionPane.PLAIN_MESSAGE);
               camposOK=false;
            }
       int radio_admin;
       if(camposOK==true){
        
           if(admin.isSelected()) 
           {
                radio_admin=1;
           }
           else
           {
                radio_admin=0;
           }
           
           System.out.println("Admin: "+radio_admin);
           
       foi = d.insere_funcionario("Funcionario_Login",cpf.getText().toString(),nome.getText().toString(),tel.getText().toString(),end.getText().toString(),foto.getText().toString(),cargo.getText().toString(),salario.getText().toString(),login.getText().toString().trim(),pass,""+radio_admin);
       
      
       if((foi==true))
       {
           JOptionPane.showConfirmDialog(null,"Anão alistado para o trabalho :D","Sucesso",JOptionPane.PLAIN_MESSAGE);
           limpar();
       }
       if((foi==false)||(camposOK==false))
       {
           JOptionPane.showConfirmDialog(null,"Erro :(","Sauron tá vendo a sua zueira",JOptionPane.PLAIN_MESSAGE);
       }
  
       
       }
    }//GEN-LAST:event_cadastrarMouseClicked

    private void cpfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cpfKeyPressed
        if(cpf.getText().length()>=11)
     {
         cpf.setText(cpf.getText().substring(0,cpf.getText().length()-1));
     }
    }//GEN-LAST:event_cpfKeyPressed

    private void consultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultarMouseClicked
       String str=JOptionPane.showInputDialog(null,"Digite o nome do anão:","Oráculo",JOptionPane.PLAIN_MESSAGE);
       System.out.println(str);
       Dados d = new Dados();
       d.conecta("143.106.241.1","3infd1", "3infd1", "3infd1");
       ResultSet rs=d.consulta("SELECT * FROM Funcionario_Login WHERE Nome='"+str+"'");
       
       try
       {
           rs.next();
       cpf.setText(rs.getString("CPF"));
       nome.setText(rs.getString("Nome"));
       tel.setText(rs.getString("Telefone"));
       end.setText(rs.getString("Endereco"));
       cargo.setText(rs.getString("Cargo"));
       salario.setText(rs.getString("Salario")); 
       login.setText(rs.getString("Login"));
       senha.setText(rs.getString("Senha"));
       confirmarsenha.setText(rs.getString("Senha"));
       carregaImagem(foto,rs.getString("Foto"));
       foto.setText(rs.getString("Foto"));
       }catch(Exception e)
            {
              JOptionPane.showConfirmDialog(null,"Não temos esse anão :/","Oráculo",JOptionPane.PLAIN_MESSAGE);
            }
    }//GEN-LAST:event_consultarMouseClicked

    private void fotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fotoMouseClicked
     FileDialog fileDialog=new FileDialog((Frame)null);
     fileDialog.setVisible(true);
     foto.setText(fileDialog.getDirectory()+fileDialog.getFile());
     carregaImagem(foto,fileDialog.getDirectory()+fileDialog.getFile());
    }//GEN-LAST:event_fotoMouseClicked

    private void telKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telKeyPressed
        if(tel.getText().length()>11)
     {
         tel.setText(tel.getText().substring(0,tel.getText().length()-1));
     }
    }//GEN-LAST:event_telKeyPressed

    private void confirmarsenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarsenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmarsenhaActionPerformed

    private void excluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_excluirMouseClicked
         d.conecta("143.106.241.1","3infd1", "3infd1", "3infd1");
         String str=JOptionPane.showInputDialog(null,"Digite o nome do anão:","Oráculo",JOptionPane.PLAIN_MESSAGE);
        
        if(!d.excluir("Funcionario_Login", "Nome",str))
        {
            JOptionPane.showConfirmDialog(null,"Não temos esse anão :/","Oráculo",JOptionPane.PLAIN_MESSAGE);
        }else
        {
        JOptionPane.showConfirmDialog(null,"Anão excluído com sucesso!","Oráculo",JOptionPane.PLAIN_MESSAGE);
        }
        
    }//GEN-LAST:event_excluirMouseClicked

    private void atualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atualizarMouseClicked
       d.conecta("143.106.241.1","3infd1", "3infd1", "3infd1");
        String chave = JOptionPane.showInputDialog(null,"Para usar a atualização de elfos você precisa usar antes a consulta.\n Caso já tenha realizado a consulta e alterado os dados desejados, digite (mellon)","Atualizar instruções",JOptionPane.PLAIN_MESSAGE);
        if(chave.equals("mellon"))
        {
          if(d.excluir("Funcionario_Login","Nome", nome.getText()))
          {
             cadastrarMouseClicked(evt);
          }
          
        }
        else
        {
          consultarMouseClicked(evt);
        }
    }//GEN-LAST:event_atualizarMouseClicked
      
      
    public void limpar()
    {
        cpf.setText("");
        nome.setText("");
        end.setText("");
        tel.setText("");
        foto.setText("Foto");
        foto.setIcon(null);
        cargo.setText("");
        salario.setText("");
        login.setText("");
        confirmarsenha.setText("");
        senha.setText("");
        admin.setSelected(false);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox admin;
    private javax.swing.JButton atualizar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cadastrar;
    private javax.swing.JTextField cargo;
    private javax.swing.JPasswordField confirmarsenha;
    private javax.swing.JButton consultar;
    private javax.swing.JTextField cpf;
    private javax.swing.JTextField end;
    private javax.swing.JButton excluir;
    private javax.swing.JButton foto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JTextField login;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField salario;
    private javax.swing.JPasswordField senha;
    private javax.swing.JTextField tel;
    // End of variables declaration//GEN-END:variables
}
