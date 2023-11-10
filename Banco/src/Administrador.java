import java.util.ArrayList;

public class Administrador {

    private ArrayList<Cliente> clientes;

    public Administrador () {
        clientes = new ArrayList<>();
    }

    public void agregarCliente (Cliente cliente) {
        clientes.add(cliente);
    }


}
