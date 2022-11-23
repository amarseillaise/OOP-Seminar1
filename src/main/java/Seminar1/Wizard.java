package Seminar1;

public class Wizard extends BaseUnit{

    private final boolean magic;

    public Wizard(){
        super(17, 12, new int[]{-5, -5}, 30, 9);
        magic = true;
    }

    @Override
    public String toString() {
        return  "Wizard -" +
                " Atc: " + attack +
                " Dfn: " + defence +
                " Dmg: " + (damage[0] + damage[1]) / 2 +
                " Hlt: " + health +
                " Sp: " + speed +
                " Mgc: " + magic;
    }
}
