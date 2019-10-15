
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
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class AtmMachin extends JFrame{

    private JLabel uLabel,pLabel;
    private JButton loginButton, clearButton;
    private JTextField tf;
    private JPasswordField pf;
    private Container c;
    private Font f;
    
    AtmMachin(){
        
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setBounds(100,50,400,350);
    this.setTitle("Welcome Users");
    
    c = this.getContentPane();
    c.setLayout(null);
    c.setBackground(Color.orange);
    
    f = new Font("Arial",Font.BOLD,16);
   
    uLabel = new JLabel("USERNAME :");
    uLabel.setBounds(50,50,120,50);
    uLabel.setFont(f);
    c.add(uLabel);
        
    tf = new JTextField();
    tf.setBounds(170,55,150,40);
    tf.setFont(f);
    c.add(tf);
    
    
    pLabel = new JLabel("PASSWORD :");
    pLabel.setBounds(50,55,150,170);
    pLabel.setFont(f);
    c.add(pLabel);
    
    pf = new JPasswordField();
    pf.setBounds(170,120,150,40);
    pf.setEchoChar('*');
    pf.setFont(f);
    c.add(pf);
    
    
    loginButton = new JButton("LOGIN");
    loginButton.setBounds(150,190,80,40);
    c.add(loginButton);
    
   clearButton = new JButton("CLEAR");
   clearButton.setBounds(250,190,80,40);
    c.add(clearButton); 
    
    clearButton.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent ae) {
          
            tf.setText("");
            pf.setText("");
        }
    });
    loginButton.addActionListener(new ActionListener(){

        @Override
        public void actionPerformed(ActionEvent ae) {
        
            String username = tf.getText();
            String password = pf.getText();
            
            if(username.equals("Nur") && password.equals("5543")){
           
             MenuPage m = new MenuPage();
             m.setVisible(true);
            }
            
            else{
           JOptionPane.showMessageDialog(null,"Incorrect Username or Password");
            }
            }
    });
    
}

   public static void main(String []args){
  AtmMachin f = new AtmMachin();
  f.setVisible(true);
}
   
}
