
public class Application {

	public static void main(String[] args) {
	
		Computadora computadora = new Computadora();
	
		Mouse mouse = new Mouse();
		mouse.setColor("Negro");
		mouse.setTipo("Inalambrico");
		mouse.setModelo("125");
		
		computadora.setMouse(mouse);
		computadora.setTeclado(construirTeclado());
		
		System.out.println(computadora);
	}

	private static Teclado construirTeclado() {
		Teclado teclado = new Teclado();
		teclado.setColor("Azul");
		teclado.setModelo("Gamer");
		return teclado;
	}

}
