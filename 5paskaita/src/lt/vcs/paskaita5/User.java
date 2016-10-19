package lt.vcs.paskaita5;

/**
 * Created by Jon on 2016-10-19.
 */
public class User {
    private String vardas;
    private String pavarde;
    private final String ClassVardas;
    private int amzius = 77;


    /**
     *
     * @param arg vardas
     * @param arg2 pavarde
     */

    public User(String vardas, String pavarde){
        this(vardas);
        this.pavarde = pavarde;

    }
    public User(String vardas){
        super();
        this.vardas = vardas;
        this.ClassVardas = this.getClass().getName();
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
               " " + this.ClassVardas + " : " +
                "vardas - " + this.vardas +
                "pavarde - " + this.pavarde;
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

    public String getClassVardas() {
        return ClassVardas;
    }
}
