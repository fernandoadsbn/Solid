/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package executor;

import classes.Comandos;
import classes.Controle;
import classes.Eventos;
import classes.Portao;

/**
 *
 * @author Fernando
 */
public class Main {

    public static void main(String[] args) {

        Eventos e = new Eventos();
        Portao p = new Portao();
        Comandos comandos = new Comandos();
        Controle c = new Controle();
        c.armazenarComandos("p...o.o.p...p..");
        comandos.verificarComandos(c, p, e);
    }
}
