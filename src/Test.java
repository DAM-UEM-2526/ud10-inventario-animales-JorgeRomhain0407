
public class Test {

	public static void main(String[] args) {
		//creo un perro y un gato
		Perro r = new Perro("Rocky", 1, "OK", "11022017");
		Gato g = new Gato("Negro", 2, "OK", "05012016");

		//devuelvo nombre
		System.out.println(r.getNombreI());
		System.out.println(g.getEstado());

		//creamos el inventario y ejecutamos los metodos pedidos
		Inventario i = new Inventario();
		i.insertarMascota(r);
		i.insertarMascota(g);
		i.imprimirTodos();
		i.imprimirPerros();
		i.vaciar();
		i.imprimirPerros();
		i.imprimirPerros();

	}

}
