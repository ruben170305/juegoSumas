package v4;

import java.util.Random;
import java.util.Scanner;

public class JuegoV4 {
    
    private static int record = 0;

    public static int getRecord() {
        return record;
    }

    public static void setRecord(int a) {
        record = a;
    }


    public static void main(String[] args) {
	// TODO Auto-generated method stub
    String name1,name2;
    	
    Random random = new Random();
	System.out.println("Hola, bienvenido a mi juego. Introduce el nombre del primer jugador");
	Scanner sc = new Scanner(System.in);
    name1 = sc.nextLine();
    
    System.out.println("Hola, bienvenido a mi juego. Introduce el nombre del segundo jugador");
    name2 = sc.nextLine();
    
    PersonajeV4 player1 = new PersonajeV4(name1);
    PersonajeV4 player2 = new PersonajeV4(name2);	
    
    System.out.println("Bienvenido, "+player1.getNombre()+" tienes "+player1.getVidasrestantes()+" vidas.");
    
    System.out.println("Bienvenido, "+player2.getNombre()+" tienes "+player2.getVidasrestantes()+" vidas.");
    
    int c = 1;
    String continuar = "si";

    //&& (continuar.equals("si")
 while ( continuar.equals("si") )  {
	 System.out.println("\n Ahora empieza el jugador: "+player1.getNombre());
	    while ( (c<10) && (player1.getVidasrestantes()>0) ) {
	        //Genero numeros aleatorios para hacer las operaciones
	        int num1 = random.nextInt(10)+1;
	        int num2 = random.nextInt(10)+1;
	        int resultado = 0;
	
	        //Operacion aleatoria
	        int operacion = random.nextInt(4);
	        c++;
	
	        switch (operacion) {
	            case 0:
	                //suma
	                resultado = num1 + num2; 
	                System.out.println("La operacion es: "+num1 + " + " + num2);
	                break;
	            case 1:
	                //resta
	                if (num1>num2) {
	                    resultado = num1 - num2;
	                    System.out.println("La operacion es: "+num1 + " - " + num2);
	                } else {
	                    resultado = num2 - num1;
	                    System.out.println("La operacion es: "+num2 + " - " + num1);
	                }
	                
	                break;
	            case 2:
	                //multiplicacion
	                resultado = num1 * num2;
	 	               System.out.println("La operacion es: " + num1 + " x " + num2);
	                break;
	            case 3:
	                //division
	                if (num1>num2) {
	                    resultado = num1 / num2;
	                    System.out.println("La operacion es: "+num1 + " divido entre " + num2);
	                } else {
	                    resultado = num2 / num1;
	                    System.out.println("La operacion es: "+num2 + " divido entre " + num1);
	                }
	                break;
	            default:
	                System.out.println("Se ha generado una operacion incorrecta");
	                break;
	        }
	        //Pido y guardo el resultado
	        System.out.println("Dime el resultado de la operacion (Numero entero): ");
	        int intento = sc.nextInt();
	
	        //Compruebo que el resultado es correccto
	        if (intento == resultado) {
	            System.out.println("El intento es correcto");
	        } else {
	            System.out.println("El intento es incorrecto");
	            System.err.println("¿Al jugador le quedan vidas? "+player1.quitaVida());
	            System.err.println("Vidas restantes: "+player1.getVidasrestantes());
	        }
	
	        //Compruebo las condiones para mostrar resultados y si quiere reiniciar
	        if (player1.getVidasrestantes()==0) {
	            System.out.println("El juego ha terminado porque el jugador "+player1.getNombre()+" se ha quedado sin vidas.");
	        }
	
	        if (c==10) {
	            System.out.println("El juego ha terminado porque se han terminado las operaciones.");
	        }
	
	    } 
	    c = 1;
	    System.out.println("\n Ahora empieza el jugador: "+player2.getNombre());
	    while ( (c<10) && (player2.getVidasrestantes()>0) ) {
	        //Genero numeros aleatorios para hacer las operaciones
	        int num1 = random.nextInt(10)+1;
	        int num2 = random.nextInt(10)+1;
	        int resultado = 0;
	
	        //Operacion aleatoria
	        int operacion = random.nextInt(4);
	        c++;
	
	        switch (operacion) {
	            case 0:
	                //suma
	                resultado = num1 + num2; 
	                System.out.println("La operacion es: "+num1 + " + " + num2);
	                break;
	            case 1:
	                //resta
	                if (num1>num2) {
	                    resultado = num1 - num2;
	                    System.out.println("La operacion es: "+num1 + " - " + num2);
	                } else {
	                    resultado = num2 - num1;
	                    System.out.println("La operacion es: "+num2 + " - " + num1);
	                }
	                
	                break;
	            case 2:
	                //multiplicacion
	                resultado = num1 * num2;
	 	               System.out.println("La operacion es: " + num1 + " x " + num2);
	                break;
	            case 3:
	                //division
	                if (num1>num2) {
	                    resultado = num1 / num2;
	                    System.out.println("La operacion es: "+num1 + " divido entre " + num2);
	                } else {
	                    resultado = num2 / num1;
	                    System.out.println("La operacion es: "+num2 + " divido entre " + num1);
	                }
	                break;
	            default:
	                System.out.println("Se ha generado una operacion incorrecta");
	                break;
	        }
	        //Pido y guardo el resultado
	        System.out.println("Dime el resultado de la operacion (Numero entero): ");
	        int intento = sc.nextInt();
	
	        //Compruebo que el resultado es correccto
	        if (intento == resultado) {
	            System.out.println("El intento es correcto");
	        } else {
	            System.out.println("El intento es incorrecto");
	            System.err.println("¿Al jugador le quedan vidas? "+player2.quitaVida());
	            System.err.println("Vidas restantes: "+player2.getVidasrestantes());
	        }
	
	        //Compruebo las condiones para mostrar resultados y si quiere reiniciar
	        if (player2.getVidasrestantes()==0) {
	            System.out.println("El juego ha terminado porque el jugador "+player2.getNombre()+" se ha quedado sin vidas.");
	        }
	
	        if (c==10) {
	            System.out.println("El juego ha terminado porque se han terminado las operaciones.");
	        }
	
	    }  
	    
	    if (player1.getVidasrestantes() > player2.getVidasrestantes()) {
			System.out.println("Ha ganado "+player1.getNombre());
			player1.actualizaRecord();
		} else if (player1.getVidasrestantes() < player2.getVidasrestantes()) {
			System.out.println("Ha ganado "+player2.getNombre());
			player2.actualizaRecord();
		}
	    
	    if (c==10 || player1.getVidasrestantes()==0) {
	        System.out.println("¿Quieres volver a jugar? Introduce Si o No");
	        sc.nextLine();
	        continuar = sc.nextLine();
	        continuar = continuar.toLowerCase();
	        System.err.println("Tu respuesta es: "+continuar);
	        player1.reiniciarPartida();
	        c = 1;
	    	}
    }
 	sc.close();
    }
  }
