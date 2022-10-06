/*
 * Created by MixaDev
 * https://vk.com/mixadev
 */
package net.alephdev.pokemon;

import net.alephdev.pokemon.move.special.DazzlingGleam;
import net.alephdev.pokemon.move.special.DrainingKiss;
import net.alephdev.pokemon.move.status.Confide;
import net.alephdev.pokemon.move.status.Growth;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

/**
 *
 * @author MixaDev
 */
public class Confey extends Pokemon {
    public Confey(String name) {
        super(name, 1);
        this.setStats(51, 52, 90, 82, 110, 100);
        this.addType(Type.FAIRY);
        this.addMove(new DazzlingGleam());
        this.addMove(new Growth());
        this.addMove(new Confide());
        this.addMove(new DrainingKiss());
    }
}
