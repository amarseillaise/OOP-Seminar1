package Seminar1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static BaseUnit getRandomUnit(){
        int unit = new Random().nextInt(7);
        return switch(unit) {
            case 0 -> new Robber();
            case 1 -> new Sniper();
            case 2 -> new Wizard();
            case 3 -> new Peaceant();
            case 4 -> new Spearman();
            case 5 -> new CrossBowMan();
            default -> new Monk();
        };
    }

    public static void selectTypeUnit(List<BaseUnit> list, String type ){
        for (BaseUnit unit : list) {
            if (unit.toString().split(" ")[0].equals(type)) System.out.println(unit);
        }
    }

    public static void main(String[] args) {
        
    List<BaseUnit> gang = new ArrayList<>();
    while (gang.size()< 50) gang.add(getRandomUnit());
    selectTypeUnit(gang, "Robber");
    }
}
