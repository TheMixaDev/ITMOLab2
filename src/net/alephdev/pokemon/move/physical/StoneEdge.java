/*
 * Created by MixaDev
 * https://vk.com/mixadev
 */
package net.alephdev.pokemon.move.physical;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

/**
 *
 * @author MixaDev
 */
public class StoneEdge extends PhysicalMove {
    public StoneEdge() {
        super(Type.ROCK, 100, 80);
    }
    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        return Math.random() < 0.125 ? 2 : 1;
    }
    @Override
    protected String describe() {
        return "использовал каменный край";
    }
}
