package HeldenSpiel;


public class Weapon {
    private int bonus;
    private String material;
    private int magic;

    public Weapon(int pBo, String pMat, int pMag) {
        bonus = pBo;
        material = pMat;
        magic = pMag;
    }

    public void setBonus(int pBo) {
        bonus = pBo;
    }

    public int getBonus() {
        return bonus;
    }

    public void setMaterial(String pMat) {
        material = pMat;
    }

    public String getMaterial() {
        return material;
    }

    public void setMagic(int pMag) {
        magic = pMag;
    }

    public int getMagic() {
        return magic;
    }
}
