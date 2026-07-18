public class Chocolate extends DecoradorCafe {
    public Chocolate(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescrpcion() {
        return cafe.getDescrpcion() + "Chocolate";
    }

    @Override
    public double getCosto() {
        return cafe.getCosto() + 1.5;
    }
}