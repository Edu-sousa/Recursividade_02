package controller;

public class Controller_02 {

	public Controller_02() {
		super();
	}

	public int divisao(int a, int b) {

		if (a < 0) {
			return a + b;
		} else {
			return divisao(a - b, b);
		}
	}
}
