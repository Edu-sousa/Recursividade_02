package view;

import java.util.Scanner;

import controller.Controller_02;

public class View_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Controller_02 cont = new Controller_02();
		int a = 0, b = 0;

		while (a <= 0) {
			System.out.println("Digite um numero inteiro");
			a = sc.nextInt();
		}

		while (b <= 0 || b > a) {
			System.out.println("Digite um numero menor que o primeiro");
			b = sc.nextInt();
		}
		System.out.println("resto da divisão " + a + " / " + b + " : " + cont.divisao(a, b));
	}
}
