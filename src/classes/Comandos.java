/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import interfaces.IComandos;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fernando
 */
public class Comandos implements IComandos {

    private Eventos evento = new Eventos();
    private List<Integer> resultadoEventos = new ArrayList<Integer>();

    public Eventos getEvento() {
        return evento;
    }

    public void setEvento(Eventos evento) {
        this.evento = evento;
    }

    @Override
    public int comandoP(Portao p, Controle c) {
        if (p.getStatusAtualPortao() == StatusPortao.ABRINDO) {
            evento.abrindo(p);
        } else if (p.getStatusAtualPortao() == StatusPortao.PARADO) {
            evento.parado(p);
        } else if (p.getStatusAtualPortao() == StatusPortao.ABRINDO) {
            evento.abrindo(p);
        } else if (p.getStatusAtualPortao() == StatusPortao.FECHANDO) {
            evento.fechando(p);
        }
        return p.getTempo();
    }

    @Override
    public int comandoPonto(Portao p) {
        if (p.getTempo() > 0 && p.getTempo() < 5) {
            if (p.getStatusAtualPortao() == StatusPortao.ABRINDO) {
                evento.abrindo(p);
            } else if (p.getStatusAtualPortao() == StatusPortao.PARADO) {
                evento.parado(p);
            } else if (p.getStatusAtualPortao() == StatusPortao.FECHANDO) {
                evento.fechando(p);
            }
        }
        return p.getTempo();
    }

    @Override
    public int comandoObstaculo(Portao p) {
        if (p.getTempo() > 0) {
            if (p.getStatusAtualPortao() == StatusPortao.FECHANDO) {
                evento.fechando(p);
            } else if ((p.getStatusAtualPortao() == StatusPortao.ABRINDO)) {
                evento.abrindo(p);
            }
        }
        return p.getTempo();
    }

    @Override
    public void verificarComandos(Controle c, Portao p, Eventos e) {
        for (int i = 0; i < c.getComandos().size(); i++) {
            switch (c.getComandos().get(i)) {
                case "p":
                    c.quantidadeClicksP();
                    c.verificarQuantidadeClicksP(p);
                    System.out.println(comandoP(p, c));
                    break;
                case ".":
                    System.out.println(comandoPonto(p));
                    break;
                case "o":
                    c.quantidadeClicksObstaculo();
                    c.verificarQuantidadeClicksObstaculo(p);
                    System.out.println(comandoObstaculo(p));
                    break;
                default:
                    System.out.println("Comando invalido.");
            }
        }

    }
}
