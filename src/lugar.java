public class lugar extends comida{
    String lugar;

    public lugar(String nombre, String lugar) {
        super(nombre);
        this.lugar = lugar;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
}
