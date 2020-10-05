package br.inatel.C214;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fila {

	public List<Paciente> filaPacientes;

	public Fila() {
		filaPacientes = new ArrayList<Paciente>();
	}

	public boolean filaVazia() {
		if (filaPacientes.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	public void adicionarPaciente(Paciente p) {
		if (!filaPacientes.contains(p)) {
			filaPacientes.add(p);
			Collections.sort(filaPacientes); // Ordenar fila de pacientes
		} else {
			throw new Exceptions("Paciente já adicionado");
		}
	}

	public int size() {
		return filaPacientes.size();
	}

	public void removePaciente(Paciente p) {
		if (filaPacientes.contains(p)) {
			filaPacientes.remove(p);
		} else {
			throw new Exceptions("Paciente não presente");
		}
	}

	public Paciente retornarPacienteComMaiorPrioridade() {
		if (!filaVazia()) {
			return filaPacientes.get(0);
		} else {
			throw new Exceptions("Fila vazia");
		}
	}

}
