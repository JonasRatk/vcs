package lt.vcs.paskaita5;

/**
 * Created by Jon on 2016-10-20.
 */
public class Zenklas  {

    private String prekinisZenklas;

    public Zenklas(String prekinisZenklas){


        super();
        this.prekinisZenklas = prekinisZenklas;
    }


    @Override
    public String toString(){
        return super.toString() + " Prekinis Zenklas: " + prekinisZenklas;
    }

    public String getZenklas() {
        return prekinisZenklas;
    }

    public void setZenklas(String prekinisZenklas) {
        this.prekinisZenklas = prekinisZenklas;
    }
}

