package classes;

public class Producto {
    public String descripcion;
    public double precio;

    public Producto(String descripcion, double precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }
    public void imprimir (){
        System.out.println( String.valueOf(this.descripcion) +"/t/t/t"+this.precio);

    }

}
