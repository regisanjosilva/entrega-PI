package Modelo;

public class Chamado {
	
	private int id;
	private double distanciaPercorrida;
	private double co2Emitido;
	private String idPlaca;
	private int idColaboradores;
		
	public Chamado(int id, double distanciaPercorrida, double co2Emitido, String idPlaca, int idColaboradores) {
		this.id = id;
		this.distanciaPercorrida = distanciaPercorrida;
		this.co2Emitido = co2Emitido;
		this.idPlaca = idPlaca;
		this.idColaboradores= idColaboradores;
	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getDistanciaPercorrida() {
		return distanciaPercorrida;
	}

	public void setDistanciaPercorrida(double distanciaPercorrida) {
		this.distanciaPercorrida = distanciaPercorrida;
	}

	public double getCo2Emitido() {
		return co2Emitido;
	}

	public void setCo2Emitido(double co2Emitido) {
		this.co2Emitido = co2Emitido;
	}

	public String getIdPlaca() {
		return idPlaca;
	}

	public void setIdPlaca(String idPlaca) {
		this.idPlaca = idPlaca;
	}

	public int getIdColaboradores() {
		return idColaboradores;
	}

	public void setIdColaboradores(int idColaboradores) {
		this.idColaboradores = idColaboradores;
	}

	
	}

	
	

