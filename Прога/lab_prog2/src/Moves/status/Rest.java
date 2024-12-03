package Moves.status;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest() {super (Type.PSYCHIC, 0.0, 0.0);}

    protected String describe() {return "использует Rest";}

    protected void applySelfEffects(Pokemon var1) {
        Effect.sleep(var1);

    }

}
