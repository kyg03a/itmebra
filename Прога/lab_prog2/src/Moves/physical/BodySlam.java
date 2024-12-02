package Moves.physical;
import ru.ifmo.se.pokemon.*;


public class BodySlam extends PhysicalMove{
    public BodySlam() { super (Type.NORMAL , 85.0, 100.0); }

    protected String describe() {return "использует атаку Body Slam";}

    protected void applyOppDamage(Pokemon var1, double var2) {
        var1.setCondition((new Effect()).chance(0.3).condition(Status.PARALYZE));
    }
}
