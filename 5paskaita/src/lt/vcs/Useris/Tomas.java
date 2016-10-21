package lt.vcs.Useris;

import lt.vcs.paskaita5.User;

/**
 * Created by Jon on 2016-10-19.
 */
public class Tomas extends User {

    private String hobis;

    public Tomas(String hobis){
        super("Tomas ","Krabas ","Adidas ");
        this.hobis = hobis;
    }

    public String getHobis() { return hobis;}

    public void setHobis(String hobis) { this.hobis = hobis;
    }

    @Override
    public String toString(){return super.toString() + " Megsta: " + hobis;}
}
