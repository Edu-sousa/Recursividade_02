package controller;

public class Controller_01 {

	public Controller_01() {
		super();
	}

	public int multiplicacao(int a, int b) {

		if (b <= 0) {
			return 0;
		} else {
			return a + multiplicacao(a, --b);
		}
	}
}
