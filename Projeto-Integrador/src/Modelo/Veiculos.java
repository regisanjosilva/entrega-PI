package Modelo;

public class Veiculos {
	
	private int Placa;
	private String modelo;
	private int ano;
	private String cor;
	private String KmPorLitro;
	
	
	
	public Veiculos(int placa, String modelo, int ano, String cor, String kmPorLitro) {
		super();
		Placa = placa;
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
		KmPorLitro = kmPorLitro;
	}
	public int getPlaca() {
		return Placa;
	}
	public void setPlaca(int placa) {
		Placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getKmPorLitro() {
		return KmPorLitro;
	}
	public void setKmPorLitro(String kmPorLitro) {
		KmPorLitro = kmPorLitro;
	}
	
	

}
