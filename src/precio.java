public class precio extends lugar{
    double precio;

    public precio(String nombre, String lugar, double precio) {
        super(nombre, lugar);
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
