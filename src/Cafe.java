public class Cafe {
    String descripcion;
    int precio;


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;

    }

    public int getPrecio(int precio) {
        return precio;
    }

    public void setPrecio () {
        this.precio = precio;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
