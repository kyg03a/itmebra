package Pokemons;

import Moves.physical.BrutalSwing;

public class Lopunny extends Buneary{
    public Lopunny(String var1, int var2) {
        super(var1, var2);
        this.setStats(65.0, 76.0, 84.0, 54.0, 96.0, 105.0);
        this.setMove(new BrutalSwing());

    }
}
