/**
 * 
 */
package v2;

/**
 * 
 */
public class juegov2main {

	
	
	private static int record= 0;

	public static int getRecord( ) {
		return record;
	}	
	
	public static void setRecord(int a) {
        record = a;
    }
		
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Personaje player1 = new Personaje(5, "aaaa");
		Personaje player2 = new Personaje(5, "bbbb");
		
		
		
		//1.-
		player1.quitaVida();
		System.out.println(""+ player1.muestraVidasRestantes());
		
		//2.-
		player1.reiniciaPartida();
		System.out.println(""+ player1.muestraVidasRestantes());
		
		//3.- 
		player1.actualizaRecord();
		player2.actualizaRecord();
	}

}
