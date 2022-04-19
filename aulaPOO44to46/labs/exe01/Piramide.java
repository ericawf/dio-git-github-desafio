package com.wendy.cursojava.aulaPOO44to46.labs.exe01;

public class Piramide extends Figura3D {

	private double arestaBase;
	private double altura;
	private double apotema;
	private double numPoliBase;
	
	private Figura2D base;

	public double getArestaBase() {
		return arestaBase;
	}

	public void setArestaBase(double arestaBase) {
		this.arestaBase = arestaBase;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getApotema() {
		return apotema;
	}

	public void setApotema(double apotema) {
		this.apotema = apotema;
	}

	public double getNumPoliBase() {
		return numPoliBase;
	}

	public void setNumPoliBase(double numPoliBase) {
		this.numPoliBase = numPoliBase;
	}

	public Figura2D getBase() {
		return base;
	}

	public void setBase(Figura2D base) {
		this.base = base;
	}
	
	public double calcularArea() {
		if (base != null) {
			return (numPoliBase * ((arestaBase * apotema)/2) + base.calcularArea());
		}
		return 0;
	}
	
	public double calcularVolume() {
		if (base != null) {
			return (base.calcularArea() * altura/3);
		}
		return 0;
	}
}
