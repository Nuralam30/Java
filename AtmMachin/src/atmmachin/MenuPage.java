
package atmmachin;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class MenuPage extends JFrame {
    
    private Container c;
    private JButton bButton,dButton,wButton,tButton,eButton;
    private Font f;
    private JLabel aLabel;
    
    MenuPage(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,50,400,350);
        this.setTitle(" Menu Options ");
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.orange);
        
        f = new Font("Arial",Font.BOLD,16);
        
        bButton = new JButton("Balance");
        bButton.setBounds(80, 50, 130, 30);
        bButton.setFont(f);
        c.add(bButton);
        
        wButton = new JButton("Withdrew");
        wButton.setBounds(80, 85, 130, 30);
        wButton.setFont(f);
        c.add(wButton);
        
        dButton = new JButton("Deposite");
        dButton.setBounds(80, 120, 130, 30);
        dButton.setFont(f);
        c.add(dButton);
        
        tButton = new JButton("Transfer");
        tButton.setBounds(80, 155, 130, 30);
        tButton.setFont(f);
        c.add(tButton);
        
        eButton = new JButton(" Close");
        eButton.setBounds(80, 190, 130, 30);
        eButton.setFont(f);
        c.add(eButton);
        
        Balance bal = new Balance();
        
        
        bButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent ae) {
           
            JOptionPane.showMessageDialog(null,"Balance is :"+bal.balance);
            }
        
        });
         wButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent ae) {
               
               String fn = JOptionPane.showInputDialog("Enter amount");
               
                double Z = Double.parseDouble(fn);
              
               bal.withdrew(Z);
            }
        
        });
          dButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent ae) {
              
                 String fn = JOptionPane.showInputDialog("Enter amount");
               
                double Z = Double.parseDouble(fn);
                   
               bal.Deposite(Z);
            }
        
        });
           tButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent ae) {
                
                
              String fn = JOptionPane.showInputDialog("Enter amount");
                
                double Z = Double.parseDouble(fn);
              
               bal.Transfer(Z);
            }
        
        });
           eButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent ae) {
              System.exit(0);
            }
        });
    }
    
  public static void main(String []args){
      
  MenuPage fr = new MenuPage();
  fr.setVisible(true);
} 
}
