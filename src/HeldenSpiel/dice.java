package HeldenSpiel;

public class dice {
    private int pages;

    public dice(int pPages) {
        pages = pPages;
    }

    public int getPages() {
        return pages;
    }

    public int roll() {
        return (int) ((Math.random() * pages) + 1);
    }
}
