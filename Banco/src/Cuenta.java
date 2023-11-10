public class Cuenta {

    private String numeroCuenta;
    private String titular;
    private double saldo;

    public Cuenta (String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0.0;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    public double consultarSaldo () {
        return saldo;
    }

    public void depositar (double monto) {
        this.saldo += monto;
    }

    public boolean transferir (Cuenta cuentaDestino, double monto) {
        if (monto <= this.saldo) {
            this.saldo -= monto;
            cuentaDestino.depositar(monto);
            return true;
        }
        return false;
    }

    public boolean extraerDinero (double monto) {
        if (monto <= this.saldo) {
            this.saldo -= monto;
            return true;
        }
        return false;
    }

    public void imprimir () {
        System.out.println("Cuenta n°: " + numeroCuenta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: $ " + this.saldo);
    }
}
