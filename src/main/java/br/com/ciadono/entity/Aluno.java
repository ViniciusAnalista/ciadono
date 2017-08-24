package br.com.ciadono.entity;

public class Aluno {
	
	private long idAluno;
	private String nome;
	private Endereco endereco;
	private String cpf;
	private Professor professor;
<<<<<<< HEAD
	private boolean isBolsista;
	private Mensalidade mensalidade;
	private int numeroMatricula;
=======
	private boolean isBolsista;	
>>>>>>> 5d7dd3d58c4fb0be3ad39a7cb9e08651305d8825
	
	public long getIdAluno() {
		return idAluno;
	}
	public void setIdAluno(long idAluno) {
		this.idAluno = idAluno;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public boolean isBolsista() {
		return isBolsista;
	}
	public void setBolsista(boolean isBolsista) {
		this.isBolsista = isBolsista;
	}
	public Mensalidade getMensalidade() {
		return mensalidade;
	}
	public void setMensalidade(Mensalidade mensalidade) {
		this.mensalidade = mensalidade;
	}
	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}
}
