import daw.com.Pantalla;
import daw.com.Teclado;

public class Rectangulo {

	private int b;
	private int h;
	private String color;
	private Punto posicion;
	
	//Sin nada
	public Rectangulo () {
		this.b = 0;
		this.h = 0;
		this.color = "";
		this.posicion = new Punto();
	}
	
	//Intermedio
	public Rectangulo (int b, int h) {
		this.b = b;
		this.h = h;
		this.color = "";
		this.posicion = new Punto();
	}
	
	//Completo
	public Rectangulo (int b, int h, String color, Punto posicion) {
		this.b = b;
		this.h = h;
		this.color = color;
		this.posicion = posicion;
	}
	
	//Copia
	public Rectangulo (Rectangulo copia) {
		this.b = copia.b;
		this.h = copia.h;
		this.color = copia.color;
		this.posicion = copia.posicion;
	}
	
	//------Get------
	public int getB () {
		return b;
	}
	
	public int getH () {
		return h;
	}
	
	public String getColor () {
		return color;
	}
	
	public Punto getPosicion () {
		return posicion;
	}
	
	//------Set------
	public void setB (int b) {
		this.b = b;
	}
	
	public void setH (int h) {
		this.h = h;
	}
	
	public void setColor (String color) {
		this.color = color;
	}
	
	public void setPosicion (Punto posicion) {
		this.posicion = posicion;
	}
	
	//Mostrar Datos
	public void mostrarDatos () {
		Pantalla.escribirString("Base del Rectángulo: " + b);
		Pantalla.escribirString("Altura del Rectángulo: " + h);
		Pantalla.escribirString("Color del Rectángulo: " + color);
		posicion.mostrarDatos();
	}
	
	//Cambiar Datos
	public void cambiarDatos () {
		int b = Teclado.leerInt("Base del Rectángulo: ");
		
		if (b != 0) {
			setB(b);
		}
		
		int h = Teclado.leerInt("Altura del Rectángulo: ");
		
		if (h != 0) {
			setH(h);
		}
		
		String color = Teclado.leerString("Color del Rectángulo: ");
		
		if (color != null) {
			setColor(color);
		}
		
		Punto posicion2 = posicion.leerDatos();
		
		if (mostrarDatos() != new Punto()) {
			setPosicion(posicion);
		}

		
		setB(Teclado.leerInt("Base del Rectángulo: " + b));
		setH(Teclado.leerInt("Altura del Rectángulo: " + h));
		setColor(Teclado.leerString("Color del Rectángulo: " + color));
		posicion.leerDatos();
		
		Pantalla.escribirSaltoLinea();
		
		mostrarDatos();
	}
}
