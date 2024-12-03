package Moves.status;
import ru.ifmo.se.pokemon.*;

public class DefenseCurl extends StatusMove {
    public DefenseCurl() {super (Type.NORMAL, 0.0, 0.0);}

    protected String describe() {
        return "использует DefenseCurl";
    }
    protected void applySelfDamage(Pokemon var1, double var2) {
        var1.setMod(Stat.SPECIAL_DEFENSE,1);
    }
}
