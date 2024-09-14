package br.edu.unisep.evento.model;

import java.util.Calendar;

public class Evento {
    private int id;
    private String NomeEvento;
    private Calendar DataInicio;
    private Calendar DataFim;
    private String Local;
    private Sessao sessao;
    public Evento() {
    }

    public Evento(int id, String NomeEvento, Calendar DataInicio, Calendar DataFim, String Local, Sessao sessao) {
        this.id = id;
        this.NomeEvento = NomeEvento;
        this.DataInicio = DataInicio;
        this.DataFim = DataFim;
        this.Local = Local;
        this.sessao = sessao;
}
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNomeEvento() {
        return NomeEvento;
    }
    public void setNomeEvento(String NomeEvento) {
        this.NomeEvento = NomeEvento;
    }
    public Calendar getDataInicio() {
        return DataInicio;
    }
    public void setDataInicio(Calendar DataInicio) {
        this.DataInicio = DataInicio;
    }
    public Calendar getDataFim() {
        return DataFim;
    }
    public void setDataFim(Calendar DataFim) {
        this.DataFim = DataFim;
    }
    public String getLocal() {
        return Local;
    }
    public void setLocal(String Local) {
        this.Local = Local;
    }

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }
}
