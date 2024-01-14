package v2;



public class Personaje {

	private int vidasrestantes;
	private String nombre;
	private int vidainicial;
	//private int record;
	//el private int record a lo mejor hay que quitarlo después una vez completado el metodo record en el main.
	
	
	public Personaje(int vidasrestantes, String nombre) {
		this.vidasrestantes = vidasrestantes;
		this.nombre = nombre;
		vidainicial = vidasrestantes;
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
		return "Las vidas restantes de "+nombre+" son: "+ vidasrestantes;
	}
	
	
	

	
	
	public boolean quitaVida() {
		vidasrestantes = vidasrestantes - 1;
		if (vidasrestantes>=1) {
			return true;
		} else {
				System.out.println("Juego Terminado "+ nombre);
				return false;
			}
		}
	
	
	public void actualizaRecord() {
		if (vidasrestantes == juegov2main.getRecord()) {
			System.out.println(nombre+" ha alcanzado el récord");
		} else if (vidasrestantes > juegov2main.getRecord()) {
				juegov2main.setRecord(vidasrestantes);
				System.out.println(nombre +" ha batido el récord y el nuevo récord es " + juegov2main.getRecord());
			} else {
				System.out.println("No se ha batido el récord");
			}
		}
	
	
	
	
	public void reiniciaPartida() {
		vidasrestantes = vidainicial;
		//System.out.println("Reinicio de partida con " + vidasrestantes + " vidas.");
		//No hace falta imprimir porque solo queremos el reincio de la partida, cambiando las vidas restantes.
		//Usaremos el método muestravidasrestantes para ver con cuantas vidas hemos reiniciado. 
	}

	
	
}