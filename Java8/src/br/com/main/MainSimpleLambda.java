package br.com.main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import br.com.modelo.Aluno;


public class MainSimpleLambda {

	public static void main(String[] args) {
		
		List<Aluno> listaAlunos = new ArrayList<Aluno>();
		listaAlunos.add(new Aluno("11", "Reinaldo Jr", 8.0));
		listaAlunos.add(new Aluno("22", "Maria Aparecida", 9.0));
		listaAlunos.add(new Aluno("33", "Carlos Soares", 7.5));
		
		listaAlunos.forEach(a -> System.out.println(a.getMatricula() + " " + 
						    a.getNome() + " " + a.getNota()));	
		
//		System.out.println("Alunos com Data >= 8.0");
//		List<Aluno> maioresIgualOito = listaAlunos.stream().
//				filter(a -> a.getNota() >= 8.0).collect(Collectors.toList());
//		maioresIgualOito.forEach(a -> System.out.println(a.getNome()));

		System.out.println("Alunos com Data >= 8.0");
		listaAlunos.stream().
					filter(a -> a.getNota() >= 8.0).collect(Collectors.toList()).
					forEach(a -> System.out.println(a.getNome()));

		listaAlunos.forEach(a -> System.out.println(a.getMatricula() + " " + 
			    a.getNome() + " " + a.getNota()));	
		
	}

}
