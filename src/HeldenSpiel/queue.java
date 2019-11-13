package HeldenSpiel;

public class queue {
    private Hero[] bank;

    public queue() {
        bank = new Hero[30];
    }

    public void addHeld(Hero h) {
        for (int i = 0; i < bank.length; i++) {
            if (bank[i] == null) {
                bank[i] = h;
            }
        }
    }

    public void removeHeld() {
        for (int i = 0; i < bank.length; i++) bank[i] = bank[i + 1];
        bank[bank.length - 1] = null;
    }

    public Hero firstHeld() {
        return bank[0];
    }

    public boolean bankEmpty() {
        return bank[0] == null;
    }
}
