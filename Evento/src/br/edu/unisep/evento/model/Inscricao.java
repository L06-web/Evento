package br.edu.unisep.evento.model;

public class Inscricao {
    private int id;
    private Participante participante;
    public Inscricao() {
    }
    public Inscricao(int id, Participante participante) {
        this.id = id;
        this.participante = participante;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Participante getParticipante() {
        return participante;
    }
    public void setParticipante(Participante participante) {
        this.participante = participante;
    }

}
