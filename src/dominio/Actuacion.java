class Actuacion {
    private LocalDate fecha;
    private List<Musico> participantes;

    public Actuacion(LocalDate fecha) {
        this.fecha = fecha;
        this.participantes = new ArrayList<>();
    }

    public void añadirParticipante(Musico participante) {
        participantes.add(participante);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Fecha de actuación: ").append(fecha.toString()).append("\n");

        for (Musico participante : participantes) {
            sb.append(participante).append("\n");
        }

        return sb.toString();
    }
}
