package HeldenSpiel;

import java.util.LinkedList;
import java.util.Queue;

public class Healer {

    private final String name;
    private final int healFactor;
    private Queue<Hero> queue;

    public Healer(String pName, int pHealFactor) {
        name = pName;
        queue = new LinkedList<>();
        healFactor = pHealFactor;
    }

    public void heroEnqueue(Hero pHero) {
        queue.add(pHero);
    }

    public void heal() {
        if (!queue.isEmpty()) {
            Hero tHero = queue.poll();
            int oldLivePoints = tHero.getLivePoints();

            if (oldLivePoints < tHero.getMaxLivePoints()) {
                int newLivePoints = oldLivePoints + healFactor;
                if (newLivePoints > tHero.getMaxLivePoints()) newLivePoints = tHero.getMaxLivePoints();
                tHero.setLivePoints(newLivePoints);
            }
        }
    }


}
