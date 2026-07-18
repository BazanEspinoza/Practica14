public class Caramelo extends DecoradorCafe {
    public Caramelo(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescrpcion() {
        return cafe.getDescrpcion() + "Caramelo";
    }

    @Override
    public double getCosto() {
        return cafe.getCosto() + 1.2;
    }
}
