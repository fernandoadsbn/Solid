/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import classes.Portao;

/**
 *
 * @author Fernando
 */
public interface IEventos {

    public int abrindo(Portao p);

    public int fechando(Portao p);

    public int parado(Portao p);

}
