package view;

import java.util.Scanner;

import controller.Controller_04;

public class View_04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Controller_04 cont = new Controller_04();
		int impar = 0;

		while (impar <= 0 || impar % 2 == 0) {
			System.out.println("Digite um numero impar maior que 0");
			impar = sc.nextInt();
		}

		System.out.println("O fatorial duplo de " + impar + " é = " + cont.fatorialDuplo(impar));
	}
}
