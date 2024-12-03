package Pokemons;
import Moves.status.Swagger;


public class Wigglytuff extends Jigglypuff{
    public Wigglytuff(String var1, int var2){
        super(var1, var2);
        this.setStats(140, 70, 45, 85, 50, 45);
        this.setMove(new Swagger());
    }
}
