
package calificaciones;


public class Calculos {
     public String Materia;
     public Double Creditos;
     public Double Ca1,Ca2,Ca3;

    public Calculos(String materia, double creditos, double ca1, double ca2, double ca3) {
        this.Materia = materia;
        this.Creditos = creditos;
        this.Ca1 = ca1;
        this.Ca2 = ca2;
        this.Ca3 = ca3;
    }
    public Double Promedio(){
        double prom;
        prom=(Ca1+Ca2+Ca3)/3;
        return prom;}
    
    
    public String Competencia(){
     String Comp=null;
     
     if (Promedio()==10){
      Comp="Sobresaliente Omedeto!";}
     if (Promedio()==9){
      Comp="Avanzado Good Job! ";}
     if (Promedio()==8){
      Comp="Intermedio Esfuerzate mas!";}
     if (Promedio()==7){
      Comp="Basico El que persevera alcanza";}
     if (Promedio()<=6){
      Comp="No competente, necesitas trabajar mucho mas :D";}
     return Comp;
     
    }
    public String MinMax(){
     double Min,Max;
     if ((Ca1<Ca2)||(Ca1<Ca3)){Min=Ca1;}
     else{
     if (Ca2<Ca3){Min=Ca2;}
     else{Min=Ca3;}}
     if ((Ca1>Ca2)||(Ca1>Ca3)){Max=Ca1;}
     else{
         if (Ca2>Ca3){Max=Ca2;}
         else{Max=Ca3;}}
     return "La calificacion minima es: "+Min+"\nLa calificacion maxima es: "+Max;
         
     }
     public void RegrasarDatos(){
      System.out.println("Materia: "+Materia);
      System.out.println("Creditos"+Creditos);
      System.out.println("Calificaciones: "+Ca1+"--"+Ca2+"--"+Ca3);
      System.out.println("Competencia"+Competencia());
      System.out.println("Promedio"+Promedio());
      System.out.println(MinMax());
  }
    
    }
     
    


