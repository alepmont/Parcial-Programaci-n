public class Cliente {

    private String nombre;

    private Cuenta cuenta;

    public Cliente(String nombre, String numeroCuenta) {
        this.nombre = nombre;
        this.cuenta = new Cuenta(numeroCuenta);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public void consultarSaldo() {
        double saldo = cuenta.consultarSaldo();
        System.out.println("-- Saldo actual: $ " + saldo);
    }

    public void depositar (double monto) {
        cuenta.depositar(monto);
        System.out.println("-- Deposito exitoso");
    }

    public void transferir (Cuenta cuentaDestino, double monto) {
        boolean exito = cuenta.transferir(cuentaDestino, monto);
        if (exito) {
            System.out.println("-- Transferencia exitosa");
        } else {
            System.out.println("-- Fondos insuficientes para realizar la transferencia");
        }
    }

    public void extraerDinero (double monto) {
        boolean exito = cuenta.extraerDinero(monto);
        if (exito) {
            System.out.println("-- Extraccion exitosa");
        } else {
            System.out.println("-- Fondos insuficientes para realizar la extraccion");
        }
    }

    public void imprimir () {
        System.out.println("Cliente: " + this.nombre);
        System.out.println("Cuenta: " + this.cuenta);
    }
}
