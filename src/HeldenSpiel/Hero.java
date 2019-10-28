package HeldenSpiel;

/**
 * @author RaHoni und Cat
 * @version 0.1
 */

public class Hero
{
    // Bezugsobjekte

    // Attribute
    private final String name;
    private int strength;
    private int attackDamage;
    private int livePoints;
    private final int maxLivePoints;
    private Weapon myWeapon;

    // Konstruktor
    Hero(String pNa, int pSt, int pAW, int pLP)
    {
        name = pNa;
        strength = pSt;
        attackDamage = pAW;
        livePoints = pLP;
        maxLivePoints = pLP;
    }

    int getMaxLivePoints() {
        return maxLivePoints;
    }

    // Dienste


    public void setStrength(int pSt) {
        strength = pSt;}

    int getStrength() {return strength;}

    void setAttackDamage(int pAW) {
        attackDamage = pAW;}

    public int getAttackDamage() {
        calculateAttackDamage();
        return attackDamage;}

    void setLivePoints(int pLP) {
        livePoints =pLP;}

    int getLivePoints() {return livePoints;}

    public void calculateAttackDamage() {
        if (myWeapon != null){
            attackDamage = strength + myWeapon.getBonus();
        } else {
            attackDamage = strength;
        }
    }
    
    public int getWaffenBonus() {
        if (myWeapon != null) {
            return myWeapon.getBonus();
        } else return 0;
    }
    
    public int getWaffenMagie() {
        if (myWeapon != null) {
            return myWeapon.getMagic();
        } else return 0;}

    public String getName() {
        return name;
    }
}
