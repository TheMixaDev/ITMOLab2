/*
 * Created by MixaDev
 * https://vk.com/mixadev
 */
package net.alephdev.pokemon;

import net.alephdev.pokemon.move.physical.StoneEdge;

/**
 *
 * @author MixaDev
 */
public class Marowak extends Cubone {
    public Marowak(String name) {
        super(name);
        this.setStats(60, 80, 110, 50, 80, 45);
        this.addMove(new StoneEdge());
    }
}
