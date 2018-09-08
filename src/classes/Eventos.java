/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import interfaces.IEventos;

/**
 *
 * @author Fernando
 */
public class Eventos implements IEventos {

    @Override
    public int abrindo(Portao p) {
        p.setTempo(p.getTempo() + 1);
        return p.getTempo();
    }

    @Override
    public int fechando(Portao p) {
        return p.tempoFechar();
    }

    @Override
    public int parado(Portao p) {
        return p.getTempo();
    }

}
