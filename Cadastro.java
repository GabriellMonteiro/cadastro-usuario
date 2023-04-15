package caixa;

import java.util.ArrayList;
import java.util.Scanner;


public class Cadastro {
	
	Scanner sc = new Scanner(System.in);	
	Usuario user = new Usuario();
	
	ArrayList<Usuario> users = new ArrayList<Usuario>();
	
	public void cadastrar() {
		sc.nextLine();
		System.out.print("Digite seu nome: ");
		user.setNome(sc.nextLine());
		System.out.print("Digite sua idade: ");
		user.setIdade(sc.nextInt());
		System.out.print("Digite sua altura: ");
		user.setAltura(sc.nextDouble());
		System.out.print("Digite seu peso: ");
		user.setPeso(sc.nextDouble());
		
		users.add(user);
	}
	
	public void editar() {
		System.out.print("Digite a ID do usuário que deseja editar: ");
		int id = sc.nextInt();
		Usuario novo = users.get(id);
		System.out.print("Digite seu nome: ");
		novo.setNome(sc.next());
		System.out.print("Digite sua idade: ");
		novo.setIdade(sc.nextInt());
		System.out.print("Digite sua altura: ");
		novo.setAltura(sc.nextDouble());
		System.out.print("Digite seu peso: ");
		novo.setPeso(sc.nextDouble());
		
		users.set(id,novo);
		
		System.out.println("Processando...");
		System.out.println("Usuário editado com sucesso!");
	}
	
	public void excluir() {
		System.out.print("Digite a ID do usuário que deseja excluir: ");
		int id = sc.nextInt();
		users.remove(id);
		System.out.println("Processando...");
		System.out.println("Usuário excluído com sucesso!");
	}
	
	public void listar() {
		for(int i = 0; i < users.size(); i++) {
			System.out.println("ID USUÁRIO: " + i);
			System.out.printf("Nome: %s%n", users.get(i).getNome());
			System.out.printf("Idade: %d%n", users.get(i).getIdade());
			System.out.printf("Altura: %.2f%n",users.get(i).getAltura());
			System.out.printf("Peso: %.2f%n", users.get(i).getPeso());
			System.out.println();
		}
	}
	
	
}
