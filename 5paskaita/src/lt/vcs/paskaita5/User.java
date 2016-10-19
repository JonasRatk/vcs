package lt.vcs.paskaita5;

/**
 * Created by Jon on 2016-10-19.
 */
public class User {
    private String vardas;
    private String pavarde;
    private final String ClassVardas;

    /**
     *
     * @param arg vardas
     * @param arg2 pavarde
     */

    public User(String arg, String arg2){
        vardas = arg;
        pavarde = arg2;
        this.ClassVardas = this.getClass().getName();

    }
    @Override
    public String toString(){
        String rezult = this.ClassVardas + " : " +
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
