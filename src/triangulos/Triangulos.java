package triangulos;

import java.util.*;


public class Triangulos {

    public static void main(String[] args) {
        menuPrincipal();
    }
    
    public static void menuPrincipal(){
        System.out.println("Trabajo desarrollado por: ");
        System.out.println("Bruno Ceriotti, 352918.");
        System.out.println("Tiago Lattaro, NUMERO ESTUDIANTE.");
        System.out.println("");
        
        Scanner input = new Scanner(System.in);
        System.out.println("-------- Menu principal --------");
        System.out.println("1. Registrar jugador.");
        System.out.println("2. Configurar la partida.");
        System.out.println("3. Comenzar la partida.");
        System.out.println("4. Mostrar ranking y racha de los jugadores.");
        System.out.println("5. Salir.");
        System.out.print("Ingrese el numero de opcion: ");
        int opcion=0;
        opcion = input.nextInt();
        
        switch(opcion){
            case 1:
                registrarJugador();
                break;
            case 2:
                configPartida();
                break;
            case 3:
                comenzarPartida();
                break;
            case 4:
                rankingJugadores();
                break;
            case 5:
                System.out.println("Cerrando el juego.");
                System.exit(0);
                break;
            default:
                System.out.println("Opcion incorrecta."); 
                menuPrincipal();
        }
        
    }
    public static void registrarJugador(){}
    public static void configPartida(){}
    public static void comenzarPartida(){}
    public static void rankingJugadores(){}
}
