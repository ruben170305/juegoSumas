/**
 * 
 */
package v1;

/**
 * 
 */
public class Personaje {
	private int vidasrestantes;
	private String nombre;
	
	public Personaje(int vidasrestantes, String nombre) {
		this.vidasrestantes = vidasrestantes;
		this.nombre = nombre;
	}

	public int getVidasrestantes() {
		return vidasrestantes;
	}

	public void setVidasrestantes(int vidasrestantes) {
		this.vidasrestantes = vidasrestantes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String muestraVidasRestantes() {
		return "Las vidas restantes son: "+vidasrestantes;
	}
	
	
}
