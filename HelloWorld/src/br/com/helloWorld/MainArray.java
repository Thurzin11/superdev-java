package br.com.helloWorld;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MainArray {

	public static void main(String[] args) {
		String nomes[] = new String[3];
		Scanner scanner = new Scanner(System.in);
		Integer codigoAluno;
		boolean thereIs = false;
		String alunoEncontrado = "";
		boolean keepRun = true;
		char decisaoTry;
		
		while(keepRun) {
			
			for (int i = 0; i < nomes.length; i++) {
				System.out.println("Infrome um nome para o " + (i + 1) + " aluno");
				nomes[i] = scanner.next();
			}
			
			System.out.println("Informe o codigo do aluno que voce quer encontrar:");
			codigoAluno = scanner.nextInt();
			
			
			for (int i = 0; i < nomes.length; i++) {
				if (codigoAluno == i) {
					thereIs = true;
					alunoEncontrado = nomes[i];
				}
			}
			
			if (thereIs) {
				System.out.println("Aluno encontrado!!!\n O nome do aluno é: "+ alunoEncontrado);
			}else {
				System.out.println("Aluno nao encontrado!!!");
				
			}
			
			System.out.println("Deseja tentar novamente? (y/n)");
			decisaoTry = scanner.next().charAt(0);
			
			if(decisaoTry == 'n') {
				keepRun = false;
			}
		}

		
		
	}

}
