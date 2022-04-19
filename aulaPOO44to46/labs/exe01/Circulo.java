package com.wendy.cursojava.aulaPOO44to46.labs.exe01;

public class Circulo extends Figura2D{
	
	private double raio;

	public double getRaio() {
		return raio;
	}
	
	public void setRaio(double raio) {
	this.raio = raio;
}
 
	public double calcularArea() {
		
		return (Math.PI*Math.pow(raio, 2));
	}

}
