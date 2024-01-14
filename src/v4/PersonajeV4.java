/**
 * 
 */
package v4;

/**
 * 
 */
public class PersonajeV4 {
	private int vidasrestantes;
	private String nombre;
	private int vidasiniciales = 5;
	
	public PersonajeV4(String nombre) {
		vidasrestantes = vidasiniciales;
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

	public boolean quitaVida() {
		vidasrestantes = vidasrestantes - 1;
		if (vidasrestantes>=1) {
			return true;
		} else {
				return false;
			}
	}

	public void actualizaRecord() {
		if (vidasrestantes == JuegoV4.getRecord()) {
			System.out.println("Se ha alcanzado el récord");
		} else if (vidasrestantes > JuegoV4.getRecord()) {
				JuegoV4.setRecord(vidasrestantes);
				System.out.println("El jugador "+nombre+" ha batido el récord y el nuevo récord es " + JuegoV4.getRecord());
			} else {
				System.out.println("No se ha batido el récord");
			}
	}

	public void reiniciarPartida() {
		setVidasrestantes(vidasiniciales);
	}
}