package br.edu.unisep.evento.model;
import java.sql.Time;

public class Sessao {
    private int id;
    private String Titulo;
    private String Descricao;
    private String HoraInicio;
    private String HoraFim;
    private Palestrante palestrante;
    private Inscricao inscricao;
    public Sessao() {
    }
    public Sessao (int id, String Titulo, String Descricao, String HoraInicio, String HoraFim, Palestrante palestrante, Inscricao inscricao) {
        this.id = id;
        this.Titulo = Titulo;
        this.Descricao = Descricao;
        this.HoraInicio = HoraInicio;
        this.HoraFim = HoraFim;
        this.palestrante = palestrante;
        this.inscricao = inscricao;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitulo() {
        return Titulo;
    }
    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }
    public String getDescricao() {
        return Descricao;
    }
    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }
    public String getHoraInicio() {
        return HoraInicio;
    }
    public void setHoraInicio(String horaInicio) {
        HoraInicio = horaInicio;
    }
    public String getHoraFim() {
        return HoraFim;
    }
    public void setHoraFim(String horaFim) {
        HoraFim = horaFim;
    }
    public Palestrante getPalestrante() {
        return palestrante;
    }
    public void setPalestrante(Palestrante palestrante) {
        this.palestrante = palestrante;
    }
    public Inscricao getInscricao() {
        return inscricao;
    }
    public void setInscricao(Inscricao inscricao) {
        this.inscricao = inscricao;
    }
}
