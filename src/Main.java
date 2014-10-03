
import java.util.Scanner;

public class Main {

	public static void main (String[] args) {
	
	  double altura;
	  double base;
     
	  Rectangulo rectangulo = new Rectangulo();

	  Scanner sc = new Scanner(System.in);
          System.out.print("\ningresa la altura: ");
          altura = sc.nextDouble();

          	  
          System.out.print("\ningresa la base: ");
          base = sc.nextDouble();
	  
 	  rectangulo.setAltura(altura);
	  rectangulo.setBase(base);

	
	  System.out.println("el perimetro es: " + rectangulo.perimetro()); 
			
	  
	  System.out.println("El area es: " + rectangulo.area()); 
        }

}
