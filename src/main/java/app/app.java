package app;

import entities.Cliente;
import entities.Pedido;
import entities.Plato;
import servicies.GestorPedidos;

public class app {
    static void main(String[] args) {

        GestorPedidos gestPed = new GestorPedidos("Casita Alfonso");

        Cliente cli1 = new Cliente("123456","Radamel","677564312","rdm@gmail.com");
        Cliente cli2 = new Cliente("123326","Alfonso","677221312","ALF@gmail.com");

        Pedido ped1 = new Pedido(cli1,"Aqui al lado");
        Pedido ped2 = new Pedido(cli2,"Aqui enfrente");

        Pedido pr1 = new Pedido(cli1, "Calle Sevilla 33, Vera");
        pr1.agregarPlato(new Plato(14,"Smash burguer doble barbacoa", 15.50, ""));
        pr1.agregarPlato(new Plato(15,"Dichosa", 16.50, ""));
        pr1.agregarPlato(new Plato(25,"Ración patatas fritas", 12.50, ""));

        Pedido pr2 = new Pedido(cli2, "Calle Córdoba 2, Garrucha");
        pr2.agregarPlato(new Plato(14,"Smash burguer doble barbacoa", 15.50, ""));
        pr2.agregarPlato(new Plato(14,"Smash burguer doble barbacoa", 15.50, ""));
        pr2.agregarPlato(new Plato(25,"Ración patatas fritas", 12.50, ""));

        gestPed.agregarPedido(pr1);
        gestPed.agregarPedido(pr2);

        gestPed.mostrarPedidos();



    }
}
