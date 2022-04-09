package mundopc;

public class Teclado extends DispositivoEntrada {
	
	final int idTeclado;
	static int contadorTeclados;
	
	public Teclado(String tipoEntrada, String marca) {
		super(tipoEntrada, marca);
		this.idTeclado=++Teclado.contadorTeclados;
	}

	@Override
	public String toString() {
		return "Teclado [idTeclado=" + idTeclado + ", toString()="
				+ super.toString() + ", getTipoEntrada()=" + getTipoEntrada() + ", getMarca()=" + getMarca()
				+ ", getClass()=" + getClass() + "]";
	}
	
	
	
	

}
