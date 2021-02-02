
public class EJ3_App {
	public static void main (String args[]) {
		int x = 5, y = 8;
		double n = 4.25, m = 8.54;
		
		System.out.println("Valores: "
				+ "\nX = "+x
				+"\nY = "+y
				+ "\nN = "+n
				+ "\nM = "+m);
		
		System.out.println("Operaciones de X e Y:"
				+ "\nX + Y = "+(x+y)+""
				+ "\nX - Y = "+(x-y)+""
				+ "\nX * Y = "+(x*y)+""
				+ "\nX / Y = "+(x/y)+""
				+ "\nX % Y = "+(x%y));
		
		System.out.println("Operaciones de N y M:"
				+ "\nN + M = "+(n+m)+""
				+ "\nN - M = "+(n-m)+""
				+ "\nN * M = "+(n*m)+""
				+ "\nN / M = "+(n/m)+""
				+ "\nN % M = "+(n%m));
		
		System.out.println("Operaciones combinadas:"
				+ "\nX + N = "+(x+n)
				+ "\nY / M = "+(y+m)
				+ "\nY % M = "+(y%m));
		
		System.out.println("Doble de cada variable:"
				+ "\nX = "+x+" || Doble = "+(x*2)
				+ "\nY = "+y+" || Doble = "+(y*2)
				+ "\nN = "+n+" || Doble = "+(n*2)
				+ "\nM = "+m+" || Doble = "+(m*2));
		
		System.out.println("Suma y producto de todas las variables:"
				+ "\nSuma = "+(x+y+n+m)
				+ "\nProducto = "+(x*y*n*m));
		
		
	}
}
