package caixa;

import java.util.ArrayList;
import java.util.Scanner;


public class Cadastro {
	
	Scanner sc = new Scanner(System.in);	
	User user = new User();
	
	ArrayList<User> users = new ArrayList<User>();
	
	public void cadastrar() {
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
		int id = sc.nextInt();
		User novo = users.get(id);
		novo.setNome(sc.next());
		novo.setIdade(sc.nextInt());
		novo.setAltura(sc.nextDouble());
		novo.setPeso(sc.nextDouble());
		
		users.set(id,novo);
	}
	
	public void excluir() {
		int id = sc.nextInt();
		users.remove(id);
	}
	
	public void listar() {
		for(int i = 0; i < users.size(); i++) {
			System.out.println("id: " + i);
			System.out.println(users.get(i).getNome());
			System.out.println(users.get(i).getIdade());
			System.out.println(users.get(i).getAltura());
			System.out.println(users.get(i).getPeso());
		}
	}
	
	
}
