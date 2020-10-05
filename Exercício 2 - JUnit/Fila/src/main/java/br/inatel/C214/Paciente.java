package br.inatel.C214;

public class Paciente implements Comparable<Paciente> {

	private String nome;
	private int prioridade;

	public Paciente(String nome, int prioridade) {
		this.nome = nome;
		this.prioridade = prioridade;
	}

	
	@Override
	public int compareTo(Paciente p) {
		if (this.prioridade > p.getPrioridade()) {
			return -1;
		}
		if (this.prioridade < p.getPrioridade()) {
			return 1;
		}
		return 0;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getPrioridade() {
		return prioridade;
	}

}
