package no.hvl.Dat100;

import javax.swing.JOptionPane;

public class Skatt {

	public static void main(String[] args) {
		
		String lonn = JOptionPane.showInputDialog("Brutto lønn:");
		double a = Double.parseDouble(lonn);
		
		if (a <= 180799) {
			System.out.println("0");
		}
		if (180800 <= a && a <= 254500){
			double b = a * 0.019;
			System.out.println(b + "kr");
		}
		if (254501 <= a && a <= 639750){
			double b = a * 0.042;
			System.out.println(b + "kr");
		}
		if (639751 <= a && a <= 999550){
			double b = a * 0.132;
			System.out.println(b + "kr");
		}
		if (999551 <= a){
			double b = a * 0.162;
			System.out.println(b + "kr");
		}
	}
}
