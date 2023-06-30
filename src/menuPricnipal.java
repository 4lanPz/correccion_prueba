import java.util.ArrayList;
import java.util.List;

public class menuPricnipal {
    private static List<comida> comidas = new ArrayList();

    public static void main(String[] arg) {
        comida comida1 = new festividad("Encebollado", "Costa", 2.50, "Ninguna");
        comida comida2 = new precio("Ceviche", "Costa", 2.50);
        comida comida3 = new festividad("Yahuarlocro", "Costa", 2.50, "Ninguna");
        comida comida4 = new festividad("Caldo de pata", "Costa", 2.50, "Ninguna");
        comidas.add( comida1 );
        comidas.add( comida2 );
        comidas.add( comida3 );
        comidas.add( comida4 );
        for (comida model : comidas) {
            System.out.println(model.getNombre());
        }
        }
    }


