package I9;

public class Prueba {
    public static void main(String[] args) {
         // Create a rectangle with all parameters
        Rectangulo rectangulo1 = new Rectangulo(5, 3, 1.0f, 4.0f);
        System.out.println("Rectángulo 1: " + rectangulo1);

        // Calculate area and perimeter
        System.out.println("Área: " + rectangulo1.getArea());
        System.out.println("Perímetro: " + rectangulo1.getPerimetro());

        // Agrandar
        rectangulo1.agranda(2, 5);
        System.out.println("Rectángulo 1 agrandado (base 2 , altura 5): " + rectangulo1);//diferentes #
        
        rectangulo1.agranda(5);
        System.out.println("Rectangulo 1 agrandado (base 5, altura 5)" + rectangulo1);//mismo # 
        
        rectangulo1.agranda();// + 1
        System.out.println("Rectangulo 1 agrandado (base 1, altura 1)" + rectangulo1);

      
}
}
