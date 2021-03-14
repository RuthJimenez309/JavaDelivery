package classes;

import java.util.ArrayList;
import java.util.List;
import classes.Orden;
import classes.Producto;


public class Cliente {
    public String nombre;

   /*der*/
    public List<Producto> carrito;
    public List<Orden> orden;

    public Cliente(String nombre){
        this.nombre = nombre;
        this.carrito = new ArrayList<Producto>();
    }
       /*Registra*/
    public void registrar( ){
        this.carrito.add((Producto) this.carrito);
    }

    /*Agregar*/
    public void agregar(){
        this.carrito.add((Producto) this.carrito);
    }

    /*Vaciar*/
    public void vaciar_carrito(){
        this.carrito.removeAll(this.carrito);
    }



    void  imprimir_carrito(){

    }
}
/*por cada distinto comercio que el cliente
     registre el servicio de delivery aumentara 70 lempiras.
     Ejemplo, si yo seleccione un combo de mega
     baleadas y otro combo de Wendy’s el total del
     delivery será 140, si hubiera seleccionado solo un
     comercio el total seria 70, si hubieran sido tres
     lugares distintos, 70*3.*/

