/*
 * Created by MixaDev
 * https://vk.com/mixadev
 */
package net.alephdev.pokemon.move.status;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

/**
 *
 * @author MixaDev
 */
public class DoubleTeam extends StatusMove {
    public DoubleTeam() {
        super(Type.NORMAL, 0, 100);
    }
    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.EVASION, 1);
    }
    @Override
    protected String describe() {
        return "использовал двойную команду";
    }
}
