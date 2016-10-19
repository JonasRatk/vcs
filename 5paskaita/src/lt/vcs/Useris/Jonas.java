package lt.vcs.Useris;

import lt.vcs.paskaita5.User;

/**
 * Created by Jon on 2016-10-19.
 */
public class Jonas extends User {


    private String spalva;

    public Jonas(String spalva){
        
        super("Jonas ");
        
        this.spalva = spalva;
    }
    
    
    @Override
    public String toString(){
        return super.toString() + " Spalva: " + spalva;
    }

    public String getSpalva() {
        return spalva;
    }

    public void setSpalva(String spalva) {
        this.spalva = spalva;
    }
}
