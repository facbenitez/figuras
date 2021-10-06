package ar.edu.unlam.pb2.figuras;

public class Rectangulo extends Figura {
	private Double lado1;
	private Double lado2;
	
	public Rectangulo(String color, Double lado1, Double lado2) {
		super(color);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	
	@Override
	public String imprimir() {
		 return "soy un rectangulo de color: "+getColor();
	}
	
	@Override
	public Double calcularArea() {
		
		return (this.lado1*this.lado2);
	}
	
	@Override
	public Double calcularPerimetro() {
		return (this.lado1*2)+(this.lado2*2);
	}
	
	

}
