//Clase cafe descafeinado que implementa cafe
public class Descafeinado implements Cafe {
    public Descafeinado (Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescrpcion() {
        return "Descafeinado";
    }

    @Override
    public double getCosto() {
        return 4.0;
    }
}
