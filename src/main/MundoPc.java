package main;

import mundopc.*;

public class MundoPc {
	public static void main(String[] args) {
		//Raton r1 = new Raton("USB", "samsung");
		Raton r2 = new Raton("BlueTooth", "LG");
		Raton r3 = new Raton("USB", "HP");

		Teclado t1 = new Teclado("USB", "Apple ");
		Teclado t2 = new Teclado("BT", "Dell ");

		Monitor m1 = new Monitor("HP", 24.3);

		Computadora c1 = new Computadora("Gamming monster", m1, t1, r2);
		Computadora c2 = new Computadora("Gamming zilla", m1, t2, r3);

		Orden orden1 = new Orden();
		orden1.agregarComputadora(c2);
		orden1.agregarComputadora(c1);

		orden1.mostrarOrden();

	}

}
