package HeldenSpiel;

import static java.lang.Math.random;

/**
 * @author RaHoni und Cat
 * @version 0.1
 */
public class Warrior extends Hero {
    // Bezugsobjekte

    // Attribute
    private int stamina;

    // Constructor
    public Warrior(String pNA, int pST, int pMaxLivePoints, int pLP, int pAU,int pLuck,int pIntelligence) {
        super(pNA,pST,pLP,pMaxLivePoints,pLuck,pIntelligence);
        stamina = pAU;
    }

    @Override
    public int getAttackDamage(int leveldifference) {
        return (int) (getStrength() * getWeaponBonus() * (stamina/leveldifference) * (random()*0.2 +0.9));
    }



    // Dienste



}
