/*
 * Created by MixaDev
 * https://vk.com/mixadev
 */
package net.alephdev.pokemon.move.status;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

/**
 *
 * @author MixaDev
 */
public class Rest extends StatusMove {
    int maxHp = -1;
    public Rest(int maxHp) {
        super(Type.PSYCHIC, 0, 100);
        this.maxHp = maxHp;
    }
    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.addEffect(new Effect().chance(1).turns(2).condition(Status.SLEEP));
        pokemon.setMod(Stat.HP, -(maxHp-(int)Math.floor(pokemon.getHP())));
        pokemon.setMod(Stat.SPECIAL_ATTACK, 1);
    }
    @Override
    protected String describe() {
        return "перешел в режим отдыха";
    }
}
