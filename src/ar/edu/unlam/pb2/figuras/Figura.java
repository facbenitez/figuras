package ar.edu.unlam.pb2.figuras;

public class Figura {
	private String color;
	
	public Figura(String color) {
		this.color = color;
	}
	
	public String imprimir() {
		 return "soy una figura de color: "+getColor();
	}
	
	public Double calcularArea() {
		return 0.0;
	}
	
	public Double calcularPerimetro() {
		return 0.0;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	

}
