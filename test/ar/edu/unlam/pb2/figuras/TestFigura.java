package ar.edu.unlam.pb2.figuras;

public class TestFigura {

	public static void main(String[] args) {
		
		Circulo c1= new Circulo("rojo",3.2);
		System.out.println(""+c1.imprimir());
		System.out.println(""+c1.calcularArea());
		System.out.println(""+c1.calcularPerimetro());

		Rectangulo r1= new Rectangulo("azul",3.5,3.5);
		System.out.println(""+r1.imprimir());
		System.out.println(""+r1.calcularArea());
		System.out.println(""+r1.calcularPerimetro());
		
		

	}

}
