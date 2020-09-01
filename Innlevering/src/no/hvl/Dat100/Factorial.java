package no.hvl.Dat100;

public class Factorial {
	
	
	public static int factorial  (int num) {
        if(num > 1) {
           return num * factorial(num-1);
        }
        return num;
    }
    
    public static void main(String[] args) {
        
     String tall = javax.swing.JOptionPane.showInputDialog("Factorial tall:");
     int n = Integer.parseInt(tall);
     
     factorial(n);
     
     javax.swing.JOptionPane.showMessageDialog(null,"n! av " + n + " = " + factorial(n));
    
    }	

}
