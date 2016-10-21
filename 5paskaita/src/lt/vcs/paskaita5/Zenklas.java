package lt.vcs.paskaita5;

/**
 * Created by Jon on 2016-10-20.
 */
public class Zenklas extends User {

    private String prekinisZenklas;

    public Zenklas(String prekinisZenklas){


        super("Karolis","Suo","2ru2ra");
        this.prekinisZenklas = prekinisZenklas;
    }

    public String getZenklas() {
        return prekinisZenklas;
    }

    public void setZenklas(String prekinisZenklas) {
        this.prekinisZenklas = prekinisZenklas;
    }

    @Override
    public String toString(){
        return super.toString() + " Prekinis Zenklas: " + prekinisZenklas;
    }


}

