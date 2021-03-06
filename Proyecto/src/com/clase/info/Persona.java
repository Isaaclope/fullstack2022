package com.clase.info;
public abstract class Persona {
	//Atributos
	protected int id;
	protected int edat;
	protected int telefono;
	//Constructor
	public Persona() {
		this.id = 3;
		this.edat = 18;
		this.telefono = 639639639;
	}
	public Persona(int id,int edat, int telefono) {
		this.id = id;
		this.edat = edat;
		this.telefono = telefono;
	}
	//M?todos
	public void mostrarInfo() {
		getId();
		getEdat();
		getTelefono();
	}
	public int getId() {
		return id;
	};
	public void setId(int id) {
		this.id = id;
	};
	public int getEdat() {
		return edat;
	};
	public void setEdat(int edat) {
		this.edat = edat;
	};
	public int getTelefono() {
		return telefono;
	};
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	};
	//M?todo abstracto
	public abstract void mostrarID();
}