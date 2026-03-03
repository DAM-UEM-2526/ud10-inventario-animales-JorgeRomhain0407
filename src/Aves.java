
public abstract class Aves extends Mascota {

	// Inicializamos los objetos de la clase aves con el constructor dado por
	// mascota atravez del super
	public Aves(String nombreI, int edad, String estado, String fechaNacimiento) {
		super(nombreI, edad, estado, fechaNacimiento);
	}

	@Override
	public String toString() {
		return nombreI;
	}

}
