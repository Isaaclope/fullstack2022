package com.clase.info;
public class EjerciciosEstudiantes {
	//Constructor por defecto
	public EjerciciosEstudiantes() {
		this.id=1;
		this.edat=18;
		this.telefono=699999999;
		this.numeroDeNotas=1;
		this.sumaDeNotas=10;
		this.notaMedia=5;
	}
	//Constructor con un par?metro
	public EjerciciosEstudiantes(int id) {
		this.id=id;
		this.edat=23;
		this.telefono=699999996;
		this.numeroDeNotas=3;
		this.sumaDeNotas=7;
		this.notaMedia=7.5;
	}
	//Constructor con dos par?metros
	public EjerciciosEstudiantes(int id, int edat) {
		this.id=id;
		this.edat=edat;
		this.telefono=699999996;
		this.numeroDeNotas=3;
		this.sumaDeNotas=7;
		this.notaMedia=7.5;
	}
	//Constructor con todos los par?metros
	public EjerciciosEstudiantes(int id,int edat,int telefono,int numeroDeNotas,int sumaDeNotas,double notaMedia) {
		this.id=id;
		this.edat=edat;
		this.telefono=telefono;
		this.numeroDeNotas=numeroDeNotas;
		this.sumaDeNotas=sumaDeNotas;
		this.notaMedia=notaMedia;
	}
	//Atributos privados es lo normal
	private int id;
	private int edat;
	private int telefono;
	private int numeroDeNotas;
	private int sumaDeNotas;
	private double notaMedia;
	//public static float crearEstudiante = Estudiante();
	//M?todos p?blicos
	public void mostrarInfo() {};
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
	public int getNumeroDeNotas() {
		return numeroDeNotas;
	};
	public void setNumeroDeNotas(int numeroDeNotas) {
		this.numeroDeNotas = numeroDeNotas;
	};
	public int getSumaDeNotas() {
		return sumaDeNotas;
	};
	public void setSumaDeNotas(int sumaDeNotas) {
		this.sumaDeNotas = sumaDeNotas;
	};
	public double getNotaMedia() {
		return notaMedia;
	};
	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	};
	public void agregarNuevaNota() {
		numeroDeNotas++;
	}
	//Ejercicio p?g 380
	public void agregarNuevaNota(int nota) {
		agregarNuevaNota();
		sumaDeNotas+=nota;
		notaMedia=sumaDeNotas/numeroDeNotas;
	}
	public void agregarNuevaNota(int nota, boolean notaTrue) {
		if (notaTrue) {
			numeroDeNotas=0;
			sumaDeNotas=0;
			notaMedia=0;
		} else {
			agregarNuevaNota();
			agregarNuevaNota(nota);
		}
		
	}
}
