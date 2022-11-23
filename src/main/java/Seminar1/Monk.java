package Seminar1;

public class Monk extends BaseUnit{

    private final boolean magic;

    public Monk(){
        super(12, 7, new int[]{-4, -4}, 30, 5);
        magic = true;
    }

    @Override
    public String toString() {
        return  "Monk -" +
                " Atc: " + attack +
                " Dfn: " + defence +
                " Dmg: " + (damage[0] + damage[1]) / 2 +
                " Hlt: " + health +
                " Sp: " + speed +
                " Mgc: " + magic;
    }
}
