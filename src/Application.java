
public class Application {

	public static void main(String[] args) {

		Computadora computadora = new Computadora();

		computadora.setMouse(construirMouse());
		computadora.setTeclado(construirTeclado());
		computadora.setCpu(construirCpu());
		computadora.setPantalla(construirPantalla());

		System.out.println(computadora);
	}

	private static Teclado construirTeclado() {
		Teclado teclado = new Teclado();
		teclado.setColor("Azul");
		teclado.setModelo("Gamer");
		return teclado;
	}

	private static Mouse construirMouse() {
		Mouse mouse = new Mouse();
		mouse.setColor("negro");
		mouse.setModelo("125");
		mouse.setTipo("Inalambrico");
		return mouse;

	}

	private static Cpu construirCpu() {
		Cpu cpu = new Cpu();
		cpu.setColor("rojo");
		cpu.setMarca("samsung");
		cpu.setModelo("castillo");
		return cpu;

	}

	private static Pantalla construirPantalla() {
		Pantalla pantalla = new Pantalla();
		pantalla.setColor("verde");
		pantalla.setMarca("lg");
		pantalla.setModelo("plana");
		return pantalla;

	}
}
