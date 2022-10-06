/*
 * Created by MixaDev
 * https://vk.com/mixadev
 */
package net.alephdev.pokemon;

import net.alephdev.pokemon.move.status.SwordsDance;

/**
 *
 * @author MixaDev
 */
public class Roserade extends Roselia {
    public Roserade(String name) {
        this(name, 60);
    }
    public Roserade(String name, int hp) {
        super(name, hp);
        this.setStats(hp, 70, 65, 125, 105, 90);
        this.addMove(new SwordsDance());
    }
}
