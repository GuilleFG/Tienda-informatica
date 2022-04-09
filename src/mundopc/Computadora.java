package mundopc;

public class Computadora {
	
	static int contador;
	 int idComputadora;
	String nombre;
	Monitor monitor;
	Teclado teclado;
	Raton raton;
	
	private Computadora() {
		this.idComputadora=++Computadora.contador;
	}
	public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton) {
		this();
		this.nombre = nombre;
		this.monitor = monitor;
		this.teclado = teclado;
		this.raton = raton;
		
	}
	
	
	
	@Override
	public String toString() {
		return "Computadora [idComputadora=" + idComputadora + ", nombre=" + nombre + ", monitor=" + monitor
				+ ", teclado=" + teclado + ", raton=" + raton + "]";
	}
	public int getIdComputadora() {
		return idComputadora;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Monitor getMonitor() {
		return monitor;
	}
	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
	public Teclado getTeclado() {
		return teclado;
	}
	public void setTeclado(Teclado teclado) {
		this.teclado = teclado;
	}
	public Raton getRaton() {
		return raton;
	}
	public void setRaton(Raton raton) {
		this.raton = raton;
	}
	public  int obtenerid() {
		return idComputadora;
	}
	
	
}
