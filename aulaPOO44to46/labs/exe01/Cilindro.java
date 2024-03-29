package com.wendy.cursojava.aulaPOO44to46.labs.exe01;

public class Cilindro extends Figura3D {

	private double altura;
	private double raio;
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double calcularArea() {
		double areaBase = Math.PI * Math.pow(raio, 2);
		double areaLateral = 2 * Math.PI * raio * altura;
		double areaTotal = (2 * areaBase) + areaLateral;
		
		return areaTotal;
	}
	
	public double calcularVolume() {
		return (Math.PI * Math.pow(raio, 2) * altura);
	}
}
