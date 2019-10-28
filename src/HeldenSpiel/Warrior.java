package HeldenSpiel;

/**
 * @author RaHoni und Cat
 * @version 0.1
 */
public class Warrior extends Hero {
    // Bezugsobjekte

    // Attribute
    private int stamina;

    // Constructor
    public Warrior(String pNA, int pST, int pAW, int pLP, int pAU) {
        super(pNA, pST, pAW, pLP);
        stamina = pAU;
    }


    // Dienste

    public void calculateAttackDamage() {
        setAttackDamage((getStrength() + getWaffenBonus()) * stamina);
    }

}
