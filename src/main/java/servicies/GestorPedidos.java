package servicies;

import entities.Pedido;

import java.util.HashMap;
import java.util.Map;

public class GestorPedidos {

    private String nombreRestaurante;
    private Map<String, Pedido> pedidos;

    public GestorPedidos(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
        this.pedidos = new HashMap<>();
    }

    public void agregarPedido(Pedido pedido){
        this.pedidos.put(nombreRestaurante.substring(0, 3).toUpperCase() +"_" + pedido.getId(), pedido);
    }

    public void mostrarPedidos() {
        IO.println("--- Pedidos ---");
        for(String codigo : pedidos.keySet()){
            IO.println(codigo + "\n" + pedidos.get(codigo).mostrarPedido());
        }
    }



}
