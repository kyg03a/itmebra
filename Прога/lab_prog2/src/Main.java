import ru.ifmo.se.pokemon.*;
import Pokemons.*;



public class Main {
    public static void main(String[] var0) {
        Battle var1 = new Battle();
        Kecleon var2 = new Kecleon("Кеклеон", 1);
        Buneary var3= new Buneary("Банири", 1);
        Lopunny var4= new Lopunny("Лопанни", 1);
        Igglybuff var5= new Igglybuff("Иглибаф", 1);
        Jigglypuff var6= new Jigglypuff("Джиглипаф", 1);
        Wigglytuff var7= new Wigglytuff("Виглитаф", 1);
        var1.addAlly(var2);
        var1.addAlly(var4);
        var1.addAlly(var6);
        var1.addFoe(var3);
        var1.addFoe(var5);
        var1.addFoe(var7);
        var1.go();
    }
}
