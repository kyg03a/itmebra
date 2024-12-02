package Moves.physical;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class QuickAttack extends PhysicalMove {
    public QuickAttack() { super (Type.NORMAL, 40.0, 60.0); }

    protected String describe() {
        return "использует атаку Quick Attack";
    }
}
