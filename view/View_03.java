package view;

import java.util.Scanner;

import controller.Controller_03;

public class View_03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Controller_03 cont = new Controller_03();

		System.out.println("Informe o tamanho do vetor");
		int tamanho = sc.nextInt();

		int[] vet = new int[tamanho];

		for (int i = 0; i < tamanho; i++) {

			System.out.println("Posição " + (i + 1) + " de " + tamanho);
			vet[i] = sc.nextInt();
		}
		System.out.println("Quantidades de numeros pares = " + cont.qtdPares(vet, tamanho));
	}
}