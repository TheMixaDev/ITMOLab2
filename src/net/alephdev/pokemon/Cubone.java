/*
 * Created by MixaDev
 * https://vk.com/mixadev
 */
package net.alephdev.pokemon;

import net.alephdev.pokemon.move.status.DoubleTeam;
import net.alephdev.pokemon.move.status.Growl;
import net.alephdev.pokemon.move.status.SwordsDance;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

/**
 *
 * @author MixaDev
 */
public class Cubone extends Pokemon {
    public Cubone(String name) {
        super(name, 1);
        this.setStats(50, 50, 95, 40, 50, 35);
        this.addType(Type.GROUND);
        
        this.addMove(new DoubleTeam());
        this.addMove(new Growl());
        this.addMove(new SwordsDance());
    }
}
