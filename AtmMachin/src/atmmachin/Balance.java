
package atmmachin;


import javax.swing.JOptionPane;

public class Balance {

   public double balance = 0;
  
public double withdrew(double amount){
    if(amount > balance){
     JOptionPane.showMessageDialog(null," Insufficient amount");   
    }
    else{
     balance =balance - amount;
    
    JOptionPane.showMessageDialog(null,"Successful ! The new Balance is :"+balance);
   }
     return balance;
} 

public double Transfer(double amount){
     if(amount > balance){
     JOptionPane.showMessageDialog(null," Insufficient amount");   
    }
    else{
      balance =balance - amount;
      JOptionPane.showMessageDialog(null,"Successful ! The new Balance is :"+balance);
     }
      return balance;
} 

public double Deposite(double amount){
   
     balance =balance + amount;
     //balance = balance;
     JOptionPane.showMessageDialog(null,"Successful ! The new Balance is :"+balance);
      return balance;
} 
public double getBalance(){
    return balance;
}
}