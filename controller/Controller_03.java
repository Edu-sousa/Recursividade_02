package controller;

public class Controller_03 {

	public Controller_03() {
		super();
	}

	public int qtdPares(int[] vet, int tamanho) {

		if (tamanho == 0) {
			return 0;
		} else {
			tamanho--;
			if (vet[tamanho] % 2 == 0) {
				return 1 + qtdPares(vet, tamanho);
			} else
				return qtdPares(vet, tamanho);
		}
	}
}
