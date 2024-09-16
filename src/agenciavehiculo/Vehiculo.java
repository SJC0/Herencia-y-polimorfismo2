
package agenciavehiculo;


public class Vehiculo {
    
    private String marca;
    private String modelo;
    private String año;
    private String nSerie;
    double precio;

    public Vehiculo(String marca, String modelo, String año, String nSerie, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.nSerie = nSerie;
        this.precio = precio;
    }
    
    

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getAño() {
        return año;
    }

    public String getnSerie() {
        return nSerie;
    }
    
    public double getPrecio(){
        return precio;
    }
    
    
}
