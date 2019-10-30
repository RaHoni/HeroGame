package HeldenSpiel;

public class queue {
    private Held[] bank;
    public queue(){bank = new Held[30];}

    public void addHeld(Held h){
        for(int i = 0; i<bank.length; i++){
            if(bank[i]==null){
                bank[i] = h;
                break;
            } } }

    public void removeHeld(){
        for(int i = 0; i<bank.length; i++) bank[i] = bank[i+1];
        bank[bank.length -1] = null;
    }

    public Held firstHeld(){return bank[0]; }

    public boolean bankEmpty(){return bank[0]==null;}
}
