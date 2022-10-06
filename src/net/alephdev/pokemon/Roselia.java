/*
 * Created by MixaDev
 * https://vk.com/mixadev
 */
package net.alephdev.pokemon;

import net.alephdev.pokemon.move.physical.PinMissle;

/**
 *
 * @author MixaDev
 */
public class Roselia extends Budew {
    public Roselia(String name) {
        this(name, 50);
    }
    public Roselia(String name, int hp) {
        super(name, hp);
        this.setStats(hp, 60, 45, 100, 80, 65);
        this.addMove(new PinMissle());
    }
}
