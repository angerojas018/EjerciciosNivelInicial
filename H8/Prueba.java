package H8;

public class Prueba {
    public static void main(String[] args) {
        Persona p = new Persona("María","1234");
        CuentaBancaria c = new CuentaBancaria(987654,p);
        CuentaCorriente cc= new CuentaCorriente(200,56789,p);
        
        System.out.println("C1:"+c.toString());
        c.ingresar(1000);
        
        System.out.println("C2:"+c.toString());
        c.retirar(250);
        
        System.out.println("C3:"+c.toString());
        
        cc.ingresar(2000);
        System.out.println("CC1:"+cc.toString());
        
        cc.retirar(150);
        System.out.println("CC2:"+cc.toString());
    }
   
}
