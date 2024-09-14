package br.edu.unisep.evento.model;

public class Palestrante {
    private int id;
    private String nome;
    private String Especialidade;
    public Palestrante() {
    }
    public Palestrante(int id, String nome, String Especialidade) {
        this.id = id;
        this.nome = nome;
        this.Especialidade = Especialidade;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEspecialidade() {
        return Especialidade;
    }
    public void setEspecialidade(String Especialidade) {
        this.Especialidade = Especialidade;
    }
}
