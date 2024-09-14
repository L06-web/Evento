package br.edu.unisep.evento.view;

import br.edu.unisep.evento.model.*;

import javax.swing.*;
import java.util.Calendar;

public class Principal {
    public static void main(String[] args) {
        Participante part = new Participante(1, "Lucas", "lucasdanielpinheiro825@gmail.com", "46 99975-9127");
        Inscricao inscricao = new Inscricao(1, part);
        Palestrante palestrante = new Palestrante(1, "Ariel", "Programação");
        Sessao sessao = new Sessao(1, "Brainstorming", "Palestra sobre Brainstorming", "10:00", "12:00", palestrante, inscricao);
        Evento evento = new Evento(1, "Startup Weekend", Calendar.getInstance(), Calendar.getInstance(), "Dois Vizinhos", sessao);

        System.out.println("Ola, seja bem vindo ao Evento " +  evento.getId() + " - " + evento.getNomeEvento() + "\n" + "Temos a sessão " + evento.getSessao().getTitulo() + "\n" + "Na sessão temos o palestrante " + evento.getSessao().getPalestrante().getNome() + "\n" +
                "A especialidade dele é " + evento.getSessao().getPalestrante().getEspecialidade() + "\n" +
                "E contamos com o participante " + evento.getSessao().getInscricao().getParticipante().getNome()
        );
    }
}