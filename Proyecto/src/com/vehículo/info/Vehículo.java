package com.veh�culo.info;
//La superclase de Coche, Avion y Bicicleta, clase madre
public class Veh�culo {
	//Atributos
	protected float velocidad;
	protected int asientos;
	protected int orientacionRuedas;
	//Constructores de la superclase
	public Veh�culo() {
		this.velocidad = 18.0f;
		this.asientos = 4;
		this.orientacionRuedas = 0;
		System.out.println("Constructor de la clase madre, valor de velocidad: " + this.velocidad + " y el vehiculo tiene estos asientos: " + this.asientos );
	}
	public Veh�culo(float velocidad , int asientos , int orientacionRuedas) {
		this.velocidad = velocidad;
		this.asientos = asientos;
		this.orientacionRuedas = orientacionRuedas;
	}
	//M�todos
	public void parar() {}
	public void acelerar() {}
	public void desacelerar() {}
	public void girarIzquierda() {}
	public void girarDerecha() {}
}