/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Fernando
 */
public class Portao {

    private int tempo;
    private Enum statusAtualPortao;
    private Enum statusAuxilairPortao;

    public Enum getStatusAuxilairPortao() {
        return statusAuxilairPortao;
    }

    public void setStatusAuxilairPortao(Enum statusAuxilairPortao) {
        this.statusAuxilairPortao = statusAuxilairPortao;
    }

    public Portao() {
        this.tempo = 0;
        this.statusAtualPortao = StatusPortao.FECHADO;
    }

    public Enum getStatusAtualPortao() {
        return statusAtualPortao;
    }

    public void setStatusAtualPortao(Enum statusAtualPortao) {
        this.statusAtualPortao = statusAtualPortao;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public int tempoFechar() {
        return this.tempo = this.tempo - 1;
    }

    public boolean validarTempo() {
        return tempo >= 0 && tempo < 5;
    }

    public Enum validarStatusAuxiliarFechadoAberto() {
        if (this.tempo == 0) {
            this.statusAuxilairPortao = StatusPortao.FECHADO;
        } else if (this.tempo == 5) {
            this.statusAuxilairPortao = StatusPortao.ABERTO;
        }
        return this.statusAuxilairPortao;
    }

}
