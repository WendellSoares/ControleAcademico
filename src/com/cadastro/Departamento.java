package com.cadastro;

import java.util.ArrayList;
import java.util.List;


public class Departamento {

	private String nome;
	List<Curso> cursos = new ArrayList<Curso>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getCapacidadeDeCursos(){
		return cursos.size();
	}
	
	

}
