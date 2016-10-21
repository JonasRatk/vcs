package lt.vcs.users;

import lt.vcs.interfacas.User;

import java.util.Date;

/**
 * Created by Jon on 2016-10-20.
 */
public class Tomas extends AbstractUser {

    public Tomas(String lastname,String email){
        super("Tomas",lastname,email);
    }


    @Override
    public String describe() {
        return "Visi Tomai - Tomai " + getLastName() + " " + email;
    }

    public Date getPurchaseDate() {
        return null;
    }
}
