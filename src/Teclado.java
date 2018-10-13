
public class Teclado {
	private String color;
	private String modelo;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Teclado [color=" + color + ", modelo=" + modelo + "]";
	}

}
