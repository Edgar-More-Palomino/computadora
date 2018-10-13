
public class Computadora {

	// campos
	private Mouse mouse;
	private Teclado teclado;
	private Pantalla pantalla;
	private Cpu cpu;

	// metodos
	public Cpu getCpu() {
		return cpu;
	}

	public void setCpu(Cpu cpu) {
		this.cpu = cpu;
	}

	public Mouse getMouse() {
		return mouse;
	}

	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}

	public Teclado getTeclado() {
		return teclado;
	}

	public void setTeclado(Teclado teclado) {
		this.teclado = teclado;
	}

	public Pantalla getPantalla() {
		return pantalla;
	}

	public void setPantalla(Pantalla pantalla) {
		this.pantalla = pantalla;
	}

	@Override
	public String toString() {
		return "Computadora [mouse=" + mouse + ", teclado=" + teclado + ", pantalla=" + pantalla + ", cpu=" + cpu + "]";
	}

}
