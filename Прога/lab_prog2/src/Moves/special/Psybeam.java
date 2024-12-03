package Moves.special;
import ru.ifmo.se.pokemon.*;

public class Psybeam extends SpecialMove{
    public Psybeam() {super (Type.PSYCHIC, 65, 100);}

    protected String describe() {
        return "использует атаку Psybeam";
    }

    protected void applyOppEffects(Pokemon var1){Effect.confuse(var1);}
}
