
package calificaciones;


public class Materias extends Calculos {

    public Materias(String materia, Double creditos, Double ca1, Double ca2, Double ca3) {
        super(materia, creditos, ca1, ca2, ca3);
    }
    public void RegrasarDatos(){
      System.out.println("Materia: "+Materia);
      System.out.println("Creditos"+Creditos);
      System.out.println("Calificaciones: "+Ca1+"--"+Ca2+"--"+Ca3);
      System.out.println("Competencia"+super.Competencia());
      System.out.println("Promedio"+super.Promedio());
      System.out.println(super.MinMax());
  }
}
