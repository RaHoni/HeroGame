package HeldenSpiel;

public class Monster {
    private int attackDamage;
    private int livePoints;

    public Monster(int pAW, int pLP) {
        attackDamage = pAW;
        livePoints = pLP;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setLivePoints(int pLP) {
        livePoints = pLP;
    }

    public int getLivePoints() {
        return livePoints;
    }

}
