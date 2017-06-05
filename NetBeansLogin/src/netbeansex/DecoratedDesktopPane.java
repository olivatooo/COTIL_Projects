/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netbeansex;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;

/**
 *
 * @author aluno
 */
class DecoratedDesktopPane extends JDesktopPane {
        private Image img;
        public DecoratedDesktopPane() {
            try {
                img = javax.imageio.ImageIO.read(new java.net.URL(getClass().getResource("/resources/fundo.jpg"), "fundo.jpg"));
            } catch (Exception ex) {
            }
        }
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (img != null) {
                
                Dimension dimension = this.getSize();
                Image newimg = img.getScaledInstance( (int)dimension.getWidth(),(int)dimension.getHeight(),  java.awt.Image.SCALE_SMOOTH ) ; 
                int x = (int)(dimension.getWidth() - newimg.getWidth(this)) / 2;
                int y = (int)(dimension.getHeight() - newimg.getHeight(this)) / 2;
                g.drawImage(newimg, x, y, newimg.getWidth(this), newimg.getHeight(this), this);
            
               
                 
                
            } else {
                g.drawString("Imagem nao encontrada", 50, 50);
            }
        }
    }