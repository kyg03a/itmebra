package Moves.physical;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class BrutalSwing extends PhysicalMove{
    public BrutalSwing() { super (Type.DARK, 60.0, 100.0); }

    protected String describe() {
        return "использует атаку Brutal Swing";
    }
}
