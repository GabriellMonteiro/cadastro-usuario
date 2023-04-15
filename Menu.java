package caixa;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Cadastro cadastro = new Cadastro();
		int op;
		do {
		System.out.println();
		System.out.println("Escolha uma das opções abaixo \n 1 - Criar usuário \n 2 - Editar usuário \n 3 - Remover usuário \n 4 - Listar usuários \n 5 - Fechar o menu");

		op = sc.nextInt();
		if (op == 1) {
			cadastro.cadastrar();
		} else if (op == 2) {
			cadastro.editar();
		} else if (op == 3) {
			cadastro.excluir();
		} else if (op == 4) {
			cadastro.listar();
		}
	}while(op != 5);
		
		
		
	}
}
