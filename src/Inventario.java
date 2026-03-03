import java.util.ArrayList;
import java.util.List;

public class Inventario {

	private List<Mascota> mascotas;

	// inicializo el objeto inventario inicializando la lista de mascotas
	public Inventario() {
		this.mascotas = new ArrayList<>();
	}

	// metodo que vacia todos los objetos de dentro de la lista de mascotas
	public void vaciar() {
		mascotas.removeAll(mascotas);
	}

	// metodo para insertar mascotas
	public void insertarMascota(Mascota a) {
		mascotas.add(a);
	}

	// metodo para eliminarmascota por el nombre
	public void eliminarMascota(String nombreI) {
		mascotas.remove(nombreI);
	}

	// metodo que recorre toda la lista de mascotas devolviendo su nombre
	public void imprimirTodos() {
		for (int i = 0; i < mascotas.size(); i++) {
			System.out.println(mascotas.get(i).getNombreI());
		}
	}

	// con este bucle recorremos la lista de mascotas y en el caso de que
	// encontremos a un perro imprimimos su nombre
	public void imprimirPerros() {
		for (int i = 0; i < mascotas.size(); i++) {
			if (mascotas.get(i) instanceof Perro) {
				System.out.println(mascotas.get(i).getNombreI());
			}
		}
	}

}
