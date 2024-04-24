package H8;

public class CuentaCorriente extends CuentaBancaria {
    
    private double maximoRetirable;

    public CuentaCorriente(double maximoRetirable, long numerocuenta, Persona cliente) {
        super(numerocuenta, cliente);
        this.maximoRetirable = maximoRetirable;
    }

    public double getMaximoRetirable() {
        return maximoRetirable;
    }

    public void setMaximoRetirable(double maximoRetirable) {
        this.maximoRetirable = maximoRetirable;
    }

    @Override
    public void retirar(double x) {
        if (x > 0 && x <= getSaldo() && x <= maximoRetirable) //saldo-=x;
        {
            setSaldo(getSaldo() - x);
        } else {
            System.out.println("No puede retirar el valor!");
        }
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" + "maximoRetirable=" + maximoRetirable + super.toString() + '}';
    }

}
