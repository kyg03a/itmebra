package Moves.status;
import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove{
    public Swagger() {super (Type.NORMAL, 0.0, 85);}

    protected String describe() {return "использует Swagger";}
    protected void applyOppEffects(Pokemon var1){
        Effect.confuse(var1);
        var1.setMod(Stat.ATTACK, +2);
    }

}
