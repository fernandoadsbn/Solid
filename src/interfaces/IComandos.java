/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import classes.Controle;
import classes.Eventos;
import classes.Portao;

/**
 *
 * @author Fernando
 */
public interface IComandos {

    public int comandoP(Portao p, Controle c);

    public int comandoPonto(Portao p);

    public int comandoObstaculo(Portao p);

    public void verificarComandos(Controle c, Portao p, Eventos e);

}
