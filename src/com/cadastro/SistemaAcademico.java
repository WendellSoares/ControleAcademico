package com.cadastro;

import java.util.ArrayList;
import java.util.List;

public class SistemaAcademico {
	private String entidade;
	private String cidade;
	List<Professor> professores = new ArrayList<>();
	List<Aluno> alunos = new ArrayList<>();
	List<Disciplina> disciplinas = new ArrayList<Disciplina>();

	public String getEntidade() {
		return entidade;
	}

	public void setEntidade(String entidade) {
		this.entidade = entidade;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public void addProfessor(Professor professor) {
		professores.add(professor);

	}

	public void addAluno(Aluno aluno) {
		alunos.add(aluno);
	}
	public void addDisciplinas(Disciplina disciplina){
		disciplinas.add(disciplina);
	}
	
	public List<Professor> getProfessores(){
		return professores;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	
	public List<Aluno> getAlunos() {
		return alunos;
	}
}
	
