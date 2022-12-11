package model;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public abstract class Funcionario {
	private int matricula;
	private String nome;
	private String endereco;

	private String bairro;
	private String cep;
	private String cidade;
	private String estado;



	public Funcionario() {
		super();
	}

	public Funcionario(int matricula, String nome, String endereco, String bairro, String cep, String cidade, String estado ) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.endereco = endereco;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
	}

	//setters e getters

	public int getMatricula() {
		return matricula;
	}

	public int setMatricula(int id) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}


	@Override
	public String toString() {
		return "\nFuncionario [id=" + id + ", cpf=" + cpf + ", nome=" + nome + ", sobrenome=" + sobrenome
				+ ", dataNascimento=" + calendarToString(dataNascimento) + "]";
	}

	// métodos utilitários para conversão de Calendar para String formatada
	private static String calendarToString(Calendar data) {
		if (data != null) {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
			return sdf.format(data.getTime());
		}
		return "00/00/0000 00:00";
	}

}
