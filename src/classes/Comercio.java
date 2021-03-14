package classes;

import java.util.ArrayList;
import java.util.List;

public class Comercio {
    public String nombre;
    public String categoria;
    public List<Producto> productos;

    public Comercio(String nombre,String categoria, List<Producto> productos){
    this.nombre = nombre;
    this.categoria = categoria;
    this.productos = new ArrayList<Producto>();
    }

}
