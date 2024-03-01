package view;

import java.util.Scanner;

import controller.Controller_05;

public class View_05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Controller_05 cont = new Controller_05();
		int x = 0, y = 0;

		while (x <= 0) {
			System.out.println("Insira um numero inteiro e positivo");
			x = sc.nextInt();
		}

		while (y <= 0) {
			System.out.println("Insira outro numero inteiro e positivo");
			y = sc.nextInt();
		}

		System.out.println("O MDC de " + x + " e " + y + " é = " + cont.mdc(x, y));
	}
}