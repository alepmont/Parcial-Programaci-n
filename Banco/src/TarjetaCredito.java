public class TarjetaCredito {
    private int numeroTarjeta;
    private int codigoSeguridad;
    private int fechaVecimiento;
    private Cliente titular;
    private double saldo;
    private double comision = saldo * 0.5;
    private double limiteCredito = saldo * 2;


    public void imprimir() {
        System.out.println("Codigo de Seguridad: " + this.codigoSeguridad);
        System.out.println("Comision actual: " + this.comision);
        System.out.println("Limite de credito: $ " + this.limiteCredito);
        System.out.println("Vencimiento: " + this.fechaVecimiento);
        System.out.println("Titular: " + this.titular);
    }

    public boolean pagar (Cuenta cuentaDestino, double monto){
        if (monto <= this.saldo) {
            this.saldo -= monto;
            cuentaDestino.depositar(monto);
            return true;
        }
        return false;
    }

}
