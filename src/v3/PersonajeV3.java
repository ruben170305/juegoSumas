/**
 * 
 */
package v3;

/**
 * 
 */
public class PersonajeV3 {
	private int vidasrestantes;
	private String nombre;
	private int vidasiniciales = 5;
	
	public PersonajeV3(String nombre) {
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
		if (vidasrestantes == JuegoV3.getRecord()) {
			System.out.println("Se ha alcanzado el récord");
		} else if (vidasrestantes > JuegoV3.getRecord()) {
				JuegoV3.setRecord(vidasrestantes);
				System.out.println("Se ha batido el récord y el nuevo récord es " + JuegoV3.getRecord());
			} else {
				System.out.println("No se ha batido el récord");
			}
	}

	public void reiniciarPartida() {
		setVidasrestantes(vidasiniciales);
	}
}