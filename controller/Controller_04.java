package controller;

public class Controller_04 {

	public Controller_04() {
		super();
	}

	public int fatorialDuplo(int impar) {

		if (impar == 1) {
			return 1;
		} else {

			return impar * fatorialDuplo(impar - 2);
		}
	}
}
