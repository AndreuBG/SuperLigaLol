package esports_lol;
// Probando conexion a linux
import java.util.ArrayList;

public class ESports_LOL {
    
       public enum Rol {ADC, SUPP, MID, JGL, TOP};

       public class Equipo {
            String nombre;
            ArrayList<Jugador> titulares;
            ArrayList<Jugador> reservas;
            Entrenador entrenador;
            String tag;
        }
       
       public class Jugador {
           String nombre;
           String apellido;
           String nickname;
           int edad;
           Rol rol;
       }
       
       public class Entrenador {
           String nombre;
           String apellido;
           String nickname;
           int edad;
       }
       
public static void main(String[] args) {
        
    }
    
}
