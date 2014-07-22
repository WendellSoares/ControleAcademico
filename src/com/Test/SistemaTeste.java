package com.Test;

import static org.junit.Assert.*;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.cadastro.Aluno;
import com.cadastro.Curso;
import com.cadastro.Departamento;
import com.cadastro.Professor;
import com.cadastro.SistemaAcademico;


public class SistemaTeste{
	
	private SistemaAcademico sistemaAcademico;
	@Before
	public void NovoSistemaAcademico(){
		sistemaAcademico = new SistemaAcademico();
	}

	@Test
	public void cadastrarEntidade() {
		
		sistemaAcademico.setEntidade("UNIPÊ");
		sistemaAcademico.setCidade("João Pessoa");
		SistemaAcademico sistemaSalvo = (sistemaAcademico);
		
		assertEquals("UNIPÊ", sistemaSalvo.getEntidade());	
		assertEquals("João Pessoa", sistemaSalvo.getCidade());
			
	}
	
	@Test
	public void cadastrarProfessor(){		
		
		Professor professor = new Professor();
		professor.setNome("Rodrigo Vilar");
		professor.setCpf("085.966.477-1");
		sistemaAcademico.addProfessor(professor);
		assertEquals("Rodrigo Vilar", professor.getNome());
		assertEquals("085.966.477-1", professor.getCpf());	
		
		Map <String,Professor>professores = new HashMap<String,Professor>();		
		professores.put ("085.966.477-1", professor);
		assertTrue(professores.containsKey("085.966.477-1"));

	}
	
	@Test
	public void cadastrarAluno(){
		Aluno aluno = new Aluno();
		aluno.setNome("Cristal");
		aluno.setMatricula("81221231");
		sistemaAcademico.addAluno(aluno);
		assertEquals("Cristal", aluno.getNome());
		assertEquals("81221231", aluno.getMatricula());
		
		Map <String,Aluno>alunos = new HashMap<String,Aluno>();
		alunos.put ("81221231", aluno);
		assertTrue(alunos.containsKey("81221231"));
	}
	@Test
	public void cadastrarDepartamento(){
		Departamento departamento = new Departamento();
		departamento.setNome("Departamento de ciencias exatas");
		Departamento departamentoSalvo = (departamento);
		assertEquals("Departamento de ciencias exatas", departamentoSalvo.getNome());
		
	}
	@Test
	public void novoCurso(){
		Curso curso1 = new Curso();
		curso1.setNome("Ciencia da Computação");
		curso1.setCargaHoraria(60);
		Curso cursoSalvo = (curso1);
		assertEquals("Ciencia da Computação", cursoSalvo.getNome());
		assertEquals(60, cursoSalvo.getCargaHoraria());
		
		
	}
	@Test
	public void listarCursosPorDepartamento(){
		Curso curso1 = new Curso();
		Curso curso2 = new Curso();
		
		List<Curso> cursosPorDepartamento = new ArrayList<Curso>();
		cursosPorDepartamento.add(curso1);
		cursosPorDepartamento.add(curso2);
		cursosPorDepartamento.size();
		assertEquals(2, cursosPorDepartamento.size());
		
	}
	@Test
	public void verificarPosicaoCursoNoDepartamento(){
		Curso curso1 = new Curso();
		Curso curso2 = new Curso();
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(curso1);
		cursos.add(curso2);
		assertEquals(0,cursos.indexOf(curso1));			
		
	}
	@Test
	public void removerCursoDaLista(){
		Curso curso1 = new Curso();
		Curso curso2 = new Curso();
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(curso1);
		cursos.add(curso2);
		
		cursos.remove(1);
		assertFalse(cursos.contains(curso2));	
			
	}	
	

}
