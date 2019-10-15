
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
import javax.swing.JTextField;

public class Amount extends JFrame{

    private JLabel aLabel;
    private Container c;
    private Font f;
    private JTextField p;
    private JButton aButton,bButton;
    
    Amount(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,50,400,350);
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.yellow);
        
        f = new Font("Arial",Font.BOLD,16);
        
        aLabel = new JLabel("Enter Amount");
        aLabel.setBounds(140, 60, 200, 40);
        aLabel.setFont(f);
        c.add(aLabel);
        
        p = new JTextField();
        p.setBounds(120, 90, 200, 40);
        p.setFont(f);
        c.add(p);
                 
        aButton = new JButton(" Enter ");
        aButton.setBounds(120, 140, 90, 40);
        aButton.setFont(f);
        c.add(aButton);
                 
        bButton = new JButton(" cancel ");
        bButton.setBounds(240, 140, 95, 40);
        bButton.setFont(f);
        c.add(bButton);
        
        
         aButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent ae) {
                
             String fn = p.getText();
             double Z = Float.parseFloat(fn);
            
            
          Balance bal = new Balance();
           double b = bal.getBalance();
           JOptionPane.showMessageDialog(null,"Successful ! The new balance is"+b);
           
            }
        });
         
          bButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent ae) {
                MenuPage m = new MenuPage();
                m.setVisible(true);
                
            }
        
        });
          
    }
    
    public static void main(String []args){
        Amount n = new Amount();
        n.setVisible(true);
    }
}


