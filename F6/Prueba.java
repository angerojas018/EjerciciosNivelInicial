package F6;

public class Prueba {
    public static void main(String[] args) {
    //objetos    
    Coche c1 = new Coche("Renault","Gris",2000,25500, 5.50,2018, "RTC163",50,"36345875");
    Coche c2 = new Coche("Mazda","Rojo",10000,1500, 12.40,2020, "RSR189",100,"548754");
    Coche c3 = new Coche("Tesla","Blanco",8000,85500, 2.20,2025, "MKP163",200,"695125");
    
    System.out.println("Coche 1:");
        System.out.println("Marca: " + c1.getMarca());
        System.out.println("Color: " + c1.getColor());
        System.out.println("Kilómetros: " + c1.getKm());
        System.out.println("Precio: " + c1.getPrecio());
        System.out.println("Factor de contaminación: " + c1.getFactorContaminación());
        System.out.println("Impuesto de Factor de Contaminación es:" + c1.calcularImpuestoContaminacion());
        System.out.println("Año: " + c1.getAño());
        System.out.println("Matrícula: " + c1.getMatricula());
        System.out.println("Impuesto de matriculación: " + c1.getImpuestomatricula());
        System.out.println("DNI del titular: " + c1.getDniTitular());
        
    System.out.println("\nCoche 2:");
        System.out.println("Marca: " + c2.getMarca());
        System.out.println("Color: " + c2.getColor());
        System.out.println("Kilómetros: " + c2.getKm());
        System.out.println("Precio: " + c2.getPrecio());
        System.out.println("Factor de contaminación: " + c2.getFactorContaminación());
        System.out.println("Impuesto de Factor de Contaminación es:" + c2.calcularImpuestoContaminacion());
        System.out.println("Año: " + c2.getAño());
        System.out.println("Matrícula: " + c2.getMatricula());
        System.out.println("Impuesto de matriculación: " + c2.getImpuestomatricula());
        System.out.println("DNI del titular: " + c2.getDniTitular());
    
    System.out.println("\nCoche 3:");
        System.out.println("Marca: " + c3.getMarca());
        System.out.println("Color: " + c3.getColor());
        System.out.println("Kilómetros: " + c3.getKm());
        System.out.println("Precio: " + c3.getPrecio());
        System.out.println("Factor de contaminación: " + c3.getFactorContaminación());
        System.out.println("Impuesto de Factor de Contaminación es:" + c3.calcularImpuestoContaminacion());
        System.out.println("Año: " + c3.getAño());
        System.out.println("Matrícula: " + c3.getMatricula());
        System.out.println("Impuesto de matriculación: " + c3.getImpuestomatricula());
        System.out.println("DNI del titular: " + c3.getDniTitular());
        
        //Media del precio de los 3 coches
        System.out.println("\n");
        double suma = (c1.getPrecio()+ c2.getPrecio()+ c3.getPrecio());
        System.out.println("La suma de los carros:"+ suma);
        double promedio = (c1.getPrecio()+ c2.getPrecio()+ c3.getPrecio())/3;
        System.out.println("El promedio de los carros es: "+ promedio);
        //Maximo coche con FactContaminación
        double maxFactorContaminacion = Math.max(c1.getFactorContaminación(), Math.max(c2.getFactorContaminación(), c3.getFactorContaminación()));
        System.out.println("El coche con el mayor factor de contaminación es: ");
        if (c1.getFactorContaminación() == maxFactorContaminacion) {
            System.out.println("Coche 1");
        }
        if (c2.getFactorContaminación() == maxFactorContaminacion) {
            System.out.println("Coche 2");
        }
        if (c3.getFactorContaminación() == maxFactorContaminacion) {
            System.out.println("Coche 3");
        }

        } 
}

