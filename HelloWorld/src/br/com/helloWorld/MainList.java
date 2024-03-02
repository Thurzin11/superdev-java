package br.com.helloWorld;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MainList {

	public static void main(String[] args) {

		List<String> listaAlunos = new ArrayList<String>();

		Scanner scanner = new Scanner(System.in);
		boolean keepRun = true;

		while (keepRun) {
			System.out.println("[1] Exibir Lista");
			System.out.println("[2] Novo Aluno");
			System.out.println("[3] Remover aluno");
			System.out.println("[0] Cancelar");
			Integer decisao = scanner.nextInt();

			switch (decisao) {
			case 0: {
				keepRun = false;
				System.out.println("Obrigado por participar!!!");
				break;
			}
			case 1: {

				System.out.println("Lista de alunos:");
				for (String aluno : listaAlunos) {
					System.out.println(aluno);
				}
				break;
			}
			case 2: {
				System.out.println("Informe um nome de aluno: ");
				String novoAluno = scanner.next();
				listaAlunos.add(novoAluno);
				break;
			}
			case 3: {
				System.out.println("Informe um aluno para excluir");
				String alunoRemove = scanner.next();
				listaAlunos.remove(alunoRemove);
				break;
			}

			}

		}

	}

}
