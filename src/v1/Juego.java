/**
 * 
 */
package v1;

/**
 * 
 */
public class Juego {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Personaje player1 = new Personaje(5, "nombre");
		System.out.println(player1.muestraVidasRestantes()); 
		player1.getVidasrestantes();
		
		player1.setVidasrestantes(player1.getVidasrestantes()-1);
		System.out.println(player1.muestraVidasRestantes());

		Personaje player2= new Personaje (5,"nombre");
		System.out.println(player2.muestraVidasRestantes());
		player2.getVidasrestantes();

		player2.setVidasrestantes(player2.getVidasrestantes()-1);
		System.out.println(player2.muestraVidasRestantes());

		/*
		*Las vidas restantes son: 5
		*Las vidas restantes son: 4
		*Las vidas restantes son: 5
		*Las vidas restantes son: 4
		 */


	        
	    }
	}
	


