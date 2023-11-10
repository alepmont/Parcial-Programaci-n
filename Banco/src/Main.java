public class Main {
    public static void main(String[] args) {

        System.out.println("Bienvenidos a la billetera virtual Zonda");

        Cliente pepito = new Cliente("Pepito Romero", "20687");
        Cuenta primera = new Cuenta("20687");

        primera.setTitular("Pepito Romero");

        Cliente chayanne = new Cliente("Chayanne Gomez", "30417");
        Cuenta segunda = new Cuenta("30417");

        segunda.setTitular("Chayanne Gomez");

        primera.setSaldo(5000);
        segunda.setSaldo(400);

        primera.imprimir();
        segunda.imprimir();

        primera.depositar(1000);
        primera.transferir(segunda, 2000);

        primera.imprimir();
        segunda.imprimir();






    }
}