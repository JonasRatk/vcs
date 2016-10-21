package lt.vcs.daiktai;

import lt.vcs.interfacas.Daiktas;
import lt.vcs.interfacas.VcsEntity;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Jon on 2016-10-20.
 */
public abstract class AbstractDaiktas implements Daiktas, VcsEntity {
    private String name;
    private Date purchaseDate;



    public AbstractDaiktas(String name, Date purchaseDate){

        this.name = name;
        this.purchaseDate = purchaseDate;
    }
    @Override
    public String getName(){
        return name;
    }
    @Override
    public Date getPurchaseDate(){
        return purchaseDate;
    }
    @Override
    public String getID(){
        SimpleDateFormat sdf = new SimpleDateFormat("'['ss']['mm']['HH']'");
        return name + " - " + sdf.format(purchaseDate);
    }


}
