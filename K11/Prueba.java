package K11;

public class Prueba {
    public static void main(String[] args) {
        Alumno[] a = new Alumno[3];
        a[0] = new Alumno("Juan");
        a[1] = new Alumno("Diana");
        a[2] = new Alumno("Isa");

        // Probar métodos para cada alumno
        for (Alumno alumno : a) {
            System.out.println("\nAlumno: " + alumno.getNombre());

         alumno.ponerNota(1, 8.5);
         alumno.ponerNota(2, 9.2);
         alumno.ponerNota(3, 7.8);
         
          System.out.println("Número de notas: " + alumno.numeroNotas());
          System.out.println("Nota máxima: " + alumno.notaMaxima());
          
          if (alumno.tieneNota(2)) {
                System.out.println("Tiene nota en la evaluación 2: " + alumno.getNota(2));
            } else {
                System.out.println("No tiene nota en la evaluación 2.");
            }
          alumno.borrarNota(3);
            System.out.println("Número de notas después de borrar la nota 3: " + alumno.numeroNotas());
    }
 }
}

