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
	@Test
	public void formarTurma(){
		Disciplina disciplina = new Disciplina();
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno();
		Aluno aluno4 = new Aluno();
		disciplina.setNome("IP");
		List <Aluno> turmaIP = new ArrayList<>();
		turmaIP.add(aluno1);
		turmaIP.add(aluno2);
		turmaIP.add(aluno3);
		turmaIP.add(aluno4);
		assertEquals(2,turmaIP.indexOf(aluno3));
		assertEquals(4,turmaIP.size());	
		
	}
	@Test
	public void matricularAlunosEmDuasTurmasETrancarUma(){
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno();
		
		Disciplina disciplina1 = new Disciplina();
		disciplina1.setNome("CALCULO 1");
		
		List <Aluno> turmaCALCULO1 = new ArrayList<>();
		turmaCALCULO1.add(aluno1);
		turmaCALCULO1.add(aluno2);
		turmaCALCULO1.add(aluno3);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setNome("LP");
		List <Aluno> turmaLP = new ArrayList<>();
		turmaLP.add(aluno1);
		turmaLP.add(aluno2);
		turmaLP.add(aluno3);
		assertEquals(3,turmaLP.size());
		assertTrue(turmaLP.contains(aluno2));
		
		turmaLP.remove(aluno2);
		assertFalse(turmaLP.contains(aluno2));

	}
	

}
