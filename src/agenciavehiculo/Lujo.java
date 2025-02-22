
package agenciavehiculo;

public class Lujo extends Vehiculo {

    public Lujo(String marca, String modelo, String año, String nSerie, double precio) {
        super(marca, modelo, año, nSerie, precio);
    }

    public double calcularPrecioConDescuento(double descuento) {
        return precio * (1 - descuento / 100);
    }

    public void mostrarPrecio() {
        System.out.printf("Modelo: %s%nMarca: %s%nAño: %s%nNúmero de serie: %s%nPrecio base: $%.2f%n",
                getModelo(), getMarca(), getAño(), getnSerie(), precio);

        
        double precioConDescuento = calcularPrecioConDescuento(10); 
        System.out.printf("Precio con descuento (10%%): $%.2f%n", precioConDescuento);
    }

   
}
