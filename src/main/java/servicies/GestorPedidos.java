package servicies;

import entities.Pedido;

import java.lang.invoke.CallSite;
import java.util.*;

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

    public void mostrarPedidosPorFecha() {
        List<Pedido> pedidosFecha = new ArrayList<Pedido>(pedidos.values());
        pedidosFecha.sort(Comparator.comparing(Pedido::getFecha));
        IO.println("--- Pedidos ordenados por fecha");

    }



}
