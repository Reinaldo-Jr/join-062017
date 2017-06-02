package br.com.modelo;

public class Aluno {

	private String matricula;
	private String nome;
	private Double nota;
	public Aluno(String matricula, String nome, Double nota) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.nota = nota;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getNota() {
		return nota;
	}
	public void setNota(Double nota) {
		this.nota = nota;
	}
	
	
}
