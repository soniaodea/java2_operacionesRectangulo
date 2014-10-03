
public class Rectangulo {


	private double base;

	private double altura;



	//Método que dado el radio calcula la circunferencia de un círculo.
	//public double circunferencia(double radio) {
	public double area() {

		double result;

		result = this.getAltura()*this.getBase();

		return result;
	}

	//Método que dado el radio calcula el area de un círculo.
	//public double area(double radio) {
	public double perimetro() {

		double result;

		result = this.getBase()+this.getBase()+this.getAltura()+this.getAltura();

		return result;
	}

	public double getBase() {

		return this.base;
	}	

	public void setBase(double base) {

		System.out.print("\nsetBase: "+ base);		
		this.base = base;
	} 

	public double getAltura(){
		
		return this.altura;
	}

	public void setAltura(double altura) {
		
		System.out.print("\nsetAltura: "+ altura);
		this.altura = altura; 
	}

}
