package view;

import java.util.Scanner;

import controller.Controller_01;

public class View_01 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		Controller_01 cont = new Controller_01();

		System.out.println("Digite um numero");
		int a = ler.nextInt();
		System.out.println("Digite outro numero");
		int b = ler.nextInt();

		if (a < 0 && b < 0) {
			a = Math.abs(a);
			b = Math.abs(b);
			System.out.println(a + " X " + b + " = " + cont.multiplicacao(a, b));
		} else if (b < 0) {
			System.out.println(a + " X " + b + " = " + cont.multiplicacao(b, a));
		} else
			System.out.println(a + " X " + b + " = " + cont.multiplicacao(a, b));
	}
}
