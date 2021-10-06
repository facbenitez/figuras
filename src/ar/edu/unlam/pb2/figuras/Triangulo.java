package ar.edu.unlam.pb2.figuras;

public class Triangulo extends Figura {
	private Double lado1;
	private Double lado2;
	private Double lado3;
	
	
	public Triangulo(String color, Double lado1, Double lado2,Double lado3) {
		super(color);
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}
	
	@Override
	public String imprimir() {
		 return "soy un triangulo de color: "+getColor();
	}
	
	@Override
	public Double calcularArea() {
		
		return (this.lado1*this.lado2*this.lado3);
	}
	
	@Override
	public Double calcularPerimetro() {
		return (this.lado1*2)+(this.lado2*2);
	}

}
