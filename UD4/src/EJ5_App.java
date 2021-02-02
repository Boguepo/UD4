
public class EJ5_App {
	public static void main (String args[]) {
		int a = 1, b = 2, c = 3, d = 4;
		
		System.out.println("Variables:"
				+ "\nA = "+a
				+ "\nB = "+b
				+ "\nC = "+c
				+ "\nD = "+d);
		
		b = c;
		c = a;
		a = d;
		d = b;
		
		System.out.println("Cambios:"
				+ "\nA = "+a
				+ "\nB = "+b
				+ "\nC = "+c
				+ "\nD = "+d);
		
		
	
		
		
	}
}
