public abstract class DecoradorCafe implements Cafe {
    protected Cafe cafe;

    public DecoradorCafe(Cafe cafe) {
        this.cafe = cafe;

    }

    public String getDescripcion() {
        return cafe.getDescrpcion();
    }

    @Override
    public double getCosto() {
        return cafe.getCosto();
    }
}
