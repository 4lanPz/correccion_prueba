public class festividad extends precio{
    String nom_fest;

    public festividad(String nombre, String lugar, double precio, String nom_fest) {
        super(nombre, lugar, precio);
        this.nom_fest = nom_fest;
    }

    public String getNom_fest() {
        return nom_fest;
    }

    public void setNom_fest(String nom_fest) {
        this.nom_fest = nom_fest;
    }

}
