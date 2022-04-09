package mundopc;

public class Raton extends DispositivoEntrada{
	
	final int idRaton;
	static int contadorRatones;

	public Raton(String tipoEntrada, String marca) {
		super(tipoEntrada, marca);
		this.idRaton=++Raton.contadorRatones;
	}

	@Override
	public String toString() {
		return "Raton [idRaton=" + idRaton+ ", toString()=" + super.toString()
				+ ", getTipoEntrada()=" + getTipoEntrada() + ", getMarca()=" + getMarca() + ", getClass()=" ;
	}
	

}
