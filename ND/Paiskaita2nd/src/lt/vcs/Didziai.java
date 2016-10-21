package lt.vcs;

/**
 * Created by Jon on 2016-10-14.
 */
public enum Didziai {
    SMALL("mazas", "small"),
    MEDIUM("vidutinis", "medium"),
    LARGE("didelis", "large");


    private final String lt;
    private final String en;

    private Didziai(String lt, String en){
        this.lt = lt;
        this.en = en;
    }
    public String getLt() {
        return lt;
    }
    public String getEn() {
        return en;
    }


}
