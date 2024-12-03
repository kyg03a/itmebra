package Moves.status;
import ru.ifmo.se.pokemon.*;
public class Confide extends StatusMove{
    public Confide() {super (Type.NORMAL, 0.0, 0.0);}

    protected String describe() {return "использует Confide";}

    protected void applyOppEffects(Pokemon var1){
        var1.setMod(Stat.SPECIAL_ATTACK,-1);}
}
