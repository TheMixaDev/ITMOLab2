/*
 * Created by MixaDev
 * https://vk.com/mixadev
 */
package net.alephdev;

import net.alephdev.pokemon.Budew;
import net.alephdev.pokemon.Confey;
import net.alephdev.pokemon.Cubone;
import net.alephdev.pokemon.Marowak;
import net.alephdev.pokemon.Roselia;
import net.alephdev.pokemon.Roserade;
import ru.ifmo.se.pokemon.Battle;

/**
 *
 * @author MixaDev
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Battle battle = new Battle();
        
        battle.addAlly(new Budew("Дух"));
        battle.addAlly(new Roselia("Банши"));
        battle.addAlly(new Roserade("Джинн"));
        
        battle.addFoe(new Marowak("Они"));
        battle.addFoe(new Cubone("Демон"));
        battle.addFoe(new Confey("Тень"));
        
        battle.go();
    }
}
