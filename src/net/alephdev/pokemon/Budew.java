/*
 * Created by MixaDev
 * https://vk.com/mixadev
 */
package net.alephdev.pokemon;

import net.alephdev.pokemon.move.status.Confide;
import net.alephdev.pokemon.move.status.Rest;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

/**
 *
 * @author MixaDev
 */
public class Budew extends Pokemon {
    public Budew(String name) {
        this(name, 40);
    }
    public Budew(String name, int hp) {
        super(name, 1);
        this.setStats(hp, 30, 35, 50, 70, 55);
        this.addType(Type.GRASS);
        this.addType(Type.POISON);
        
        this.addMove(new Confide());
        this.addMove(new Rest(40));
    }
}
