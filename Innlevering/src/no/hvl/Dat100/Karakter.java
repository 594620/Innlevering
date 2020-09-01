package no.hvl.Dat100;

public class Karakter {
	
public static void main(String[] args) {
	
	for (int k = 1; k <= 10; k++) {
	String sum = javax.swing.JOptionPane.showInputDialog("Poengsum:");
	int poeng = Integer.parseInt(sum);
	
	if (poeng >= 100) {
		System.out.println("Ugyldig poengsum!");
		igjen();
	}
	if (poeng <=0) {
		System.out.println("ugyldig poengsum!");
		igjen();
	}
	if (poeng <= 39 && poeng >= 0) {
		System.out.println("F");
	}
	if (poeng >= 40 && poeng <= 49) {
		System.out.println("E");
	}
	if (poeng >= 50 && poeng <= 59) {
		System.out.println("D");
		}
	if (poeng >= 60 && poeng <= 79) {
		System.out.println("C");
		}
	if (poeng >= 80 && poeng <= 89) {
		System.out.println("B");
		}
	if (poeng >= 90 && poeng <= 100) {
		System.out.println("A");
		}
	}
	}

private static void igjen() {	
	String sum = javax.swing.JOptionPane.showInputDialog("Poengsum:");
	int poeng = Integer.parseInt(sum);
	
	if (poeng >= 100) {
		System.out.println("Ugyldig poengsum!");
		igjen();
	}
	if (poeng <=0) {
		System.out.println("ugyldig poengsum!");
		igjen();
	}
	if (poeng <= 39 && poeng >= 0) {
		System.out.println("F");
	}
	if (poeng >= 40 && poeng <= 49) {
		System.out.println("E");
	}
	if (poeng >= 50 && poeng <= 59) {
		System.out.println("D");
		}
	if (poeng >= 60 && poeng <= 79) {
		System.out.println("C");
		}
	if (poeng >= 80 && poeng <= 89) {
		System.out.println("B");
		}
	if (poeng >= 90 && poeng <= 100) {
		System.out.println("A");
		}
	}
}
