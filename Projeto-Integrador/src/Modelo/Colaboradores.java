package Modelo;

import java.time.LocalDate;

public class Colaboradores {
	
	private  int id ;
	private  String  nome ;
	private  String  cpf ;
	private  LocalDate dataNasc;
	private  String habilitado;
	
	
	public Colaboradores(int id, String nome, String cpf, LocalDate dataNasc, String habilitado) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.dataNasc = dataNasc;
		this.habilitado = habilitado;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public LocalDate getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(LocalDate string) {
		this.dataNasc = string;
	}
	public String getHabilitado() {
		return habilitado;
	}
	public void setHabilitado(String habilitado) {
		this.habilitado = habilitado;
	}
	
	public String toString() {
		return id + "-" +  nome + " - " + cpf + " - " + dataNasc + " - " + habilitado;
		
	}
	
	
	}


