package lt.vcs.users;

import lt.vcs.interfacas.Daiktas;
import lt.vcs.interfacas.User;
import lt.vcs.interfacas.VcsEntity;

/**
 * Standartine User klases implementacija
 */
public abstract class AbstractUser implements User, VcsEntity, Daiktas {
    private String name;
    private String lastname;
    protected String email;

    public AbstractUser(String name,String lastname,String email){
        this.name = name;
        this.lastname = lastname;
        this.email = email;

    }

    public String getName(){
        return name;
    }
    public String getLastName(){
       return lastname;
    }
    public String getEmail(){
        return email;
    }
    public String getID(){
        return email;
    }

    /**
     * Metodas turi apibudinti Useri
     * @return User apibudinima
     */
    public abstract String describe();



}
