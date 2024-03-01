package controller;

public class Controller_05 {

	public Controller_05() {
		super();
	}

	public int mdc(int x, int y) {

		if (x == y) {
			return x;
		}
		if (x > y) {
			return mdc(x - y, y);
		} else {
			return mdc(y, x);
		}
	}
}
