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
public class PinMissle extends PhysicalMove {
    int restore = 0;
    public PinMissle() {
        super(Type.BUG, 25, 95);
    }
    @Override
    protected double calcRandomDamage(Pokemon att, Pokemon def) {
        double result = super.calcRandomDamage(att, def);
        if((this.power < 100 && Math.random()*8 < 3) || (this.power < 125 && Math.random()*8 < 1)) {
            this.power += 25;
            restore++;
            attack(att, def);
        }
        return result;
    }
    @Override
    protected void applySelfEffects(Pokemon pkmn) {
        if(restore > 0) {
            if(restore == 1)
                this.power = 25;
            restore--;
        }
    }
    @Override
    protected String describe() {
        return "использовал атаку зарядами";
    }
}
