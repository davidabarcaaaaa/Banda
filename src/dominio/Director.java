class Director extends Musico {
    public Director(String nombre) {
        super(nombre, "");
    }

    @Override
    public String toString() {
        return super.toString() + ", director";
    }
}
