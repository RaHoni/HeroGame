package HeldenSpiel;

/**
 * @author RaHoni und Cat
 * @version 0.1
 */

public abstract class Hero {
    // Bezugsobjekte

    // Attribute
    private final String name;
    private int strength;
    private int livePoints;
    private final int maxLivePoints;
    private int luck;
    private int intelligence;
    private Weapon myWeapon;

    // Konstruktor
    Hero(String pName, int pStrength, int pLifePoints, int pMaxLivePoints, int pLuck, int pIntelligence) {
        name = pName;
        strength = pStrength;
        livePoints = pLifePoints;
        maxLivePoints = pMaxLivePoints;
        luck = pLuck;
        intelligence = pIntelligence;
    }

    int getMaxLivePoints() {
        return maxLivePoints;
    }

    // Dienste


    public void setStrength(int pSt) {
        strength = pSt;
    }

    int getStrength() {
        return strength;
    }

    int getWeaponBonus() {
        if (myWeapon != null) return myWeapon.getBonus();
        else return 1;

    }


    abstract public int getAttackDamage(int leveldifference);

    void setLivePoints(int pLP) {
        livePoints = pLP;
    }

    int getLivePoints() {
        return livePoints;
    }


    public int getWeaponMagic() {
        if (myWeapon != null) {
            return myWeapon.getMagic();
        } else return 0;
    }

    public String getName() {
        return name;
    }
}
