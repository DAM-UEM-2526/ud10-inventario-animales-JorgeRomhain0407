
public abstract class Mascota {
	protected String nombreI;
	protected int edad;
	protected String estado;
	protected String fechaNacimiento;
	
	public Mascota(String nombreI, int edad, String estado, String fechaNacimiento) {
		this.nombreI = nombreI;
		this.edad = edad;
		this.estado = estado;
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Nombre= " + nombreI;
	}

	public String getNombreI() {
		return nombreI;
	}

	public String getEstado() {
		return estado;
	}
	
	
	
	
}
