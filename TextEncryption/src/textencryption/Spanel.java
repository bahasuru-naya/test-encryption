package textencryption;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.BorderFactory;
import javax.swing.border.Border;

public class Spanel extends javax.swing.JFrame implements ActionListener{
    
    int i = 0;
    JProgressBar b;
    Thread run;
    JButton c; 
    JFrame f;
    
    public  Spanel()
    {
    f = new JFrame();
    
    Border blackline = BorderFactory.createLineBorder(Color.gray,5);
    
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setUndecorated(true);
    ImageIcon icon = new ImageIcon("src/textencryption/icon.png");
    f.setIconImage(icon.getImage());
    
    
    JPanel panel = new JPanel();
    JPanel panel1 = new JPanel();
    
    JLabel label1 =new JLabel("TEXT", JLabel.CENTER);
    JLabel label2 =new JLabel("ENCRYPTER", JLabel.CENTER);
    JLabel label3 =new JLabel("Loading...", JLabel.CENTER);
    JLabel label4 =new JLabel("By Bahasuru Nayanakantha", JLabel.CENTER);
    Color color = new Color(240,240,240);
   
    
    panel.setPreferredSize(new Dimension(300, 400));
    panel1.setPreferredSize(new Dimension(300, 400)); 
    panel.setBackground(Color.WHITE);
    panel1.setBackground(color);
    panel1.setBorder(blackline);
    
    GridLayout box =new GridLayout(6,1);
    panel1.setLayout(box);
    
    label1.setFont(new Font("Verdana", Font.BOLD, 35));
    label2.setFont(new Font("Verdana", Font.BOLD, 35));
    label3.setFont(new Font("Verdana", Font.PLAIN, 25));
    label4.setFont(new Font("Verdana", Font.PLAIN, 15));
    b = new JProgressBar(0,2000);    
    c=new JButton("close");
    c.addActionListener(this);
    c.setAlignmentX(300);
    b.setValue(0); 
    b.setStringPainted(true); 
    
    panel1.add(label1);
    panel1.add(label2);
    panel1.add(label4);
    panel1.add(b);
    panel1.add(label3);
    panel1.add(c);        
        
    f.add(panel1);
    f.pack();
    f.setLocationRelativeTo(null); // this method display the JFrame to center position of a screen
    f.setVisible(true);
   
    }
    
     public void actionPerformed(ActionEvent evt)
    {
        Object s=evt.getSource();
        if(s==c)
        {
            System.exit(0);
        }
    }
     
     public  void fill()
    {
        while (i <= 2000) {
                
                b.setValue(i );
       
        try {         
                 
                Thread.sleep(100);
                
            }
        
        catch (Exception e) { }
        i += 150;
        }
        if(i > 2000)
        f.dispose();
   } 
     
    
            
}

