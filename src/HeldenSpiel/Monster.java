package HeldenSpiel;

/**
 * @author RaHoni und Cat
 * @version 0.1
 */
public class Monster
{
    // Bezugsobjekte

    // Attribute
    private int attackDamage;
    private int livePoints;

    // Konstruktor
    public Monster(int pAW,int pLP)
    {
        attackDamage = pAW;
        livePoints = pLP;
    }

    // Dienste
    public int getAttackDamage() {
        return attackDamage;
    }
    
    public void setLivePoints(int pLP) {
        livePoints = pLP;
    }
    
    public int getLivePoints() {return livePoints;}

}
