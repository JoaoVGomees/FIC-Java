package br.edu.senaisp.dao;

import java.util.ArrayList;
import java.util.List;
//import java.util.Random;

import br.edu.senaisp.model.Aluno;

public class AlunoDAO {

	private static List<Aluno> listaDB = new ArrayList<>();

	public void insert (Aluno a) {
//		Random geradorNumero = new Random();
//		a.setNrMatricula(geradorNumero.nextInt());
//		
		listaDB.add(a);
	}
	
	public void update(Aluno a) {
		int i = listaDB.indexOf(a);
		
		if (i >= 0) {
			listaDB.set(i, a);
		}
	}
	
	public void delete (Aluno a) {
		int i = listaDB.indexOf(a);
		
		if (i >= 0) {
			listaDB.remove(i);
		}
	}
	
	public List<Aluno> selectAll () {
		return listaDB;
	}

	
}
