package lt.vcs.paskaita5;

/**
 * Created by Jon on 2016-10-19.
 */
public class User {
    private String vardas;
    private String pavarde;
    private final String classesVardas;
    private int amzius = 77;
    private String prekinisZenklas;


    /**
     *
     * @param arg vardas
     * @param arg2 pavarde
     */  /**
     *
     * @param arg vardas
     * @param arg2 pavarde
     */

    public User(String vardas, String pavarde,String prekinisZenklas){
        this(vardas);
        this.pavarde = pavarde;
        this.prekinisZenklas = prekinisZenklas;

    }
    public User(String vardas){
        super();
        this.vardas = vardas;
        this.classesVardas = this.getClass().getName();
    }


    public int getAmzius() {
        return amzius;
    }
    public int getAmzius(int plius) {
        return amzius + plius;
    }
    public int getAmzius(String plius) {

        return amzius + new Integer(plius);
    }

    @Override
    public String toString(){
        String rezult = super.toString() +
               " " + this.classesVardas + " : " +
                " Vardas - " + this.vardas +
                " Pavarde - " + this.pavarde +
                " Prekinis Zenklas - " + this.prekinisZenklas;
        return rezult;
    }
    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public String getClassesVardas() {
        return classesVardas;
    }
}
