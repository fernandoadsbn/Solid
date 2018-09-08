/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fernando
 */
public class Controle {

    private List<String> comandos = new ArrayList<>();
    private int quantidaCliquesP;
    private int quantidadeCliquesObstaculo;

    public int getQuantidaCliquesP() {
        return quantidaCliquesP;
    }

    public void setQuantidaCliquesP(int quantidaCliquesP) {
        this.quantidaCliquesP = quantidaCliquesP;
    }

    public int getQuantidadeCliquesObstaculo() {
        return quantidadeCliquesObstaculo;
    }

    public void setQuantidadeCliquesObstaculo(int quantidadeCliquesObstaculo) {
        this.quantidadeCliquesObstaculo = quantidadeCliquesObstaculo;
    }

    public List<Integer> getResultadoComandos() {
        return resultadoComandos;
    }

    public void setResultadoComandos(List<Integer> resultadoComandos) {
        this.resultadoComandos = resultadoComandos;
    }
    private List<Integer> resultadoComandos = new ArrayList<>();

    public int getQuantidaDeCliquesP() {
        return quantidaCliquesP;
    }

    public void setQuantidaDeCliquesP(int quantidaDeCliquesP) {
        this.quantidaCliquesP = quantidaDeCliquesP;
    }

    public int getQuantidadeDeCliquesObstaculo() {
        return quantidadeCliquesObstaculo;
    }

    public void setQuantidadeDeCliquesObstaculo(int quantidadeDeCliquesObstaculo) {
        this.quantidadeCliquesObstaculo = quantidadeDeCliquesObstaculo;
    }
    private Comandos comando = new Comandos();

    public Comandos getComando() {
        return comando;
    }

    public void setComando(Comandos comando) {
        this.comando = comando;
    }

    public int getQuantidadeCliquesP() {
        return quantidaCliquesP;
    }

    public void setQuantidadeCliquesP(int quantidadeCliquesP) {
        this.quantidaCliquesP = quantidadeCliquesP;
    }

    public List<String> getComandos() {
        return comandos;
    }

    public void setComandos(ArrayList<String> comandos) {
        this.comandos = comandos;
    }

    public void armazenarComandos(String comandos) {
        for (int i = 0; i < comandos.length(); i++) {
            this.comandos.add(comandos.substring(i, i + 1));
        }
    }

    public void quantidadeClicksP() {
        this.quantidaCliquesP++;
    }

    public void verificarQuantidadeClicksP(Portao p) {
        if (p.validarStatusAuxiliarFechadoAberto() == StatusPortao.FECHADO) {
            switch (this.quantidaCliquesP) {
                case 1:
                    p.setStatusAtualPortao(StatusPortao.ABRINDO);
                    break;
                case 2:
                    p.setStatusAtualPortao(StatusPortao.PARADO);
                    break;
                case 3:
                    p.setStatusAtualPortao(StatusPortao.ABRINDO);
                    quantidadeClicksPReset();
                    break;
            }
        } else {
            if (this.quantidaCliquesP == 3) {
                p.setStatusAtualPortao(StatusPortao.PARADO);
            } else {
                p.setStatusAtualPortao(StatusPortao.FECHANDO);
            }
        }
    }

    public void quantidadeClicksPReset() {
        this.quantidaCliquesP = 1;
    }

    public void quantidadeClicksObstaculoReset() {
        this.quantidadeCliquesObstaculo = 0;
    }

    public void quantidadeClicksObstaculo() {
        this.quantidadeCliquesObstaculo++;
    }

    public void verificarQuantidadeClicksObstaculo(Portao p) {
        switch (this.quantidadeCliquesObstaculo) {
            case 1:
                p.setStatusAtualPortao(StatusPortao.FECHANDO);
                break;
            case 2:
                p.setStatusAtualPortao(StatusPortao.ABRINDO);
                break;
        }
    }
}
