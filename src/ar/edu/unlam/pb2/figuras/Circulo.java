package ar.edu.unlam.pb2.figuras;

public class Circulo extends Figura {
	private Double radio;

	public Circulo(String color, Double radio) {
		super(color);
		this.radio = radio;
	}
	
	@Override
	public String imprimir() {
		 return "soy un circulo de color: "+getColor();
	}
	
	@Override
	public Double calcularArea() {
		Double area=0.0;
		area=(this.radio*this.radio*Math.PI);
		return area;
	}
	
	@Override
	public Double calcularPerimetro() {
		Double perimetro=0.0;
		perimetro=(2*this.radio*Math.PI);
		return perimetro;
	}
	
	

}
