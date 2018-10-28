
package calificaciones;
import java.util.Scanner;
       
public class Calificaciones {

   
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        String Materia;
        Double Creditos;
        Double Ca1,Ca2,Ca3;
        
        System.out.println("¡¡Bienvenido al sistema academico de IA!!");
        
        System.out.println("Ingrese materia :3");
        Materia = teclado.nextLine();
        System.out.println("Ingrese el numero de creditos >w<");
        Creditos = teclado.nextDouble();
        System.out.println("Ingrese las calificaciones");
        Ca1 = teclado.nextDouble();
        Ca2 = teclado.nextDouble();
        Ca3 = teclado.nextDouble();
        Materias Chariot = new Materias (Materia,Creditos,Ca1,Ca2,Ca3);
        Chariot.RegrasarDatos();
    }
    
}
