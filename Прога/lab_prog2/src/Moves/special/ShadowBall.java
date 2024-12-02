package Moves.special;


import ru.ifmo.se.pokemon.*;



public class ShadowBall extends SpecialMove{
    public ShadowBall() {super (Type.PSYCHIC, 80, 100);}
        protected String describe() {return "использует атаку Shadow Ball";}

    protected void applyOppDamage(Pokemon var1, double var2) {
        var1.setMod(Stat.SPECIAL_DEFENSE, -1);
    }
}
