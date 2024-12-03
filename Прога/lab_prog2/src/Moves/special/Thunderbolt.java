package Moves.special;
import ru.ifmo.se.pokemon.*;

public class Thunderbolt extends SpecialMove {
    public Thunderbolt() {super(Type.ELECTRIC, 90.0, 100.0);}

    protected String describe() {
        return "использует атаку Thunderbolt";
    }

    protected void applyOppEffects(Pokemon var1) {
        var1.setCondition((new Effect()).chance(0.1).condition(Status.PARALYZE));
    }
}

