package teste02;

import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		System.out.println("Qual é o seu nome?");
		String nome = in.nextLine();
		System.out.println("Olá "+nome);

	}

}
