package com.wendy.cursojava.aulaPOO44to46.labs.exe01;

public class Quadrado extends Figura2D{

	private double lado;
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double calcularArea() {
		
		return Math.pow(lado, 2);
	}
}
