package v3;

import java.util.Random;
import java.util.Scanner;

public class JuegoV3 {
    
    private static int record = 0;

    public static int getRecord() {
        return record;
    }

    public static void setRecord(int a) {
        record = a;
    }


    public static void main(String[] args) {
	// TODO Auto-generated method stub
    Random random = new Random();
	System.out.println("Hola, bienvenido a mi juego. Introduce tu nombre");
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    PersonajeV3 player1 = new PersonajeV3(name);
    System.out.println("Bienvenido, "+player1.getNombre()+" tienes "+player1.getVidasrestantes()+" vidas.");
    
    int c = 1;
    String continuar = "si";

    while ( (c<10) && (player1.getVidasrestantes()>0) && (continuar.equals("si")) ) {
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
            player1.actualizaRecord();
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