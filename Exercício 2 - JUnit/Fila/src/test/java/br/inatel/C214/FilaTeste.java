package br.inatel.C214;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;


public class FilaTeste {
	
	private Fila filaDePacientes;
	
	@Before
	public void criarFila() {
		filaDePacientes = new Fila();
	}
	
	@Test
	public void testeFilaVazia() {
		boolean vazia = filaDePacientes.filaVazia();
		assertTrue(vazia);
	}
	
	@Test
	public void testeFilaNaoVazia() {
		
		Paciente p = new Paciente("Marcos", 1);
		filaDePacientes.adicionarPaciente(p);
		
		boolean vazia = filaDePacientes.filaVazia();
		assertFalse(vazia);
		
	}
	
	@Test
	public void testeAdicionarPaciente() {
		
		Paciente p = new Paciente("Marcos", 1);
		
		filaDePacientes.adicionarPaciente(p);
		
		assertFalse(filaDePacientes.filaVazia());
	}
	
	@Test(expected = Exceptions.class)
	public void testeAdicionarDoisPacienteIguais() {
		
		Paciente p = new Paciente("Marcos", 1);
		
		filaDePacientes.adicionarPaciente(p);
		filaDePacientes.adicionarPaciente(p);
	}
	
	@Test
	public void testeRemoverPaciente() {
		
		Paciente p = new Paciente("Marcos", 1);
		
		filaDePacientes.adicionarPaciente(p);
		
		filaDePacientes.removePaciente(p);
		
		assertTrue(filaDePacientes.filaVazia());
	}
	
	@Test(expected = Exceptions.class)
	public void testeRemoverPacienteFilaVazia() {
		
		Paciente p = new Paciente("Marcos", 1);
		
		filaDePacientes.removePaciente(p);
	}
	
	@Test
	public void testePacienteComMaiorPrioridade() {
		
		Paciente p = new Paciente("Marcos", 5);
		filaDePacientes.adicionarPaciente(p);
		
		Paciente p2 = new Paciente("Ítalo", 2);
		filaDePacientes.adicionarPaciente(p2);
		
		Paciente p3 = new Paciente("Beh", 3);
		filaDePacientes.adicionarPaciente(p3);
		
		Paciente p4  = new Paciente("Bruno", 6);
		filaDePacientes.adicionarPaciente(p4);
		
		Paciente PrimeiroPaciente = filaDePacientes.retornarPacienteComMaiorPrioridade();
		
		assertEquals(6, PrimeiroPaciente.getPrioridade());
	}
	
	@Test(expected = Exceptions.class)
	public void testePacienteComMaiorPrioridadeFilaVazia() {
		filaDePacientes.retornarPacienteComMaiorPrioridade();
	}
}
