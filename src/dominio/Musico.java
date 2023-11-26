class Musico extends Participante {
    protected String instrumento;

    public Musico(String nombre, String instrumento) {
        super(nombre);
        this.instrumento = instrumento;
    }

    @Override
    public String toString() {
        return nombre + ", " + instrumento;
    }
}
