package D4;

public class Prueba {
    public static void main(String[] args) {
        
    Persona p1 = new Persona("Oscar", 15, "254895456");
    Persona p2 = new Persona("Alejandra", 70, "845785487");
    
        System.out.println("Persona 1:");
        System.out.println("Nombre: " + p1.getNombre());
        System.out.println("Edad: " + p1.getEdad());
        System.out.println("DNI: " + p1.getDni());
        p1.MayorEdad(18);
        System.out.println("Años siendo mayor de edad: " + p1.HaceCuantoMayorEdad(15));
        System.out.println("Está jubilado: " + p1.Jubilado());

        System.out.println("-----------------------------");
        
        System.out.println("Persona 2:");
        System.out.println("Nombre: " + p2.getNombre());
        System.out.println("Edad: " + p2.getEdad());
        System.out.println("DNI: " + p2.getDni());
        p1.MayorEdad(18);
        System.out.println("Años siendo mayor de edad: " + p2.HaceCuantoMayorEdad(70));
        System.out.println("Está jubilado: " + p2.Jubilado());

        // Cambiar valor de atributos
        p1.setEdad(25);
        p1.setDni("987654321");
        p2.setNombre("Ana");
        p2.setEdad(40);  
    }
}