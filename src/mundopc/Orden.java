package mundopc;

public class Orden {
	private final int idOrden;
	private Computadora computadoras[];
	private static int contadorOrdenes;
	private int contadorcomputadoras;
	private static final int MAX_COMPUTADORAS= 10;
	
	public Orden() {
		this.idOrden=++Orden.contadorOrdenes;
		this.computadoras= new Computadora[Orden.MAX_COMPUTADORAS];
	
		
	}
	public void agregarComputadora(Computadora computadora) {
		if (this.contadorcomputadoras<Orden.MAX_COMPUTADORAS) {
			this.computadoras[this.contadorcomputadoras++]=computadora;
		}
		else {
			System.out.println("Has superado el limite de computadoras");
		}
		
	}
	public void mostrarOrden() {
		System.out.println("Orden#:"+ this.idOrden);
		System.out.println("Computadoras de la orden#:"+ this.idOrden);
		for(int i =0;i<this.contadorcomputadoras;i++) {
			System.out.println(this.computadoras[i]);
		}
		
	}

}
