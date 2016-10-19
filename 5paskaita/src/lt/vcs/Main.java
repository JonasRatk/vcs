package lt.vcs;

import lt.vcs.Useris.Jonas;
import lt.vcs.Useris.Tomas;
import lt.vcs.paketas.PaketoKlase;
import lt.vcs.paskaita5.User;

public class Main {
// skirtingas klases atskirti package pvz lt.vcs.main
//    modifikatorius yra( public,private )

    public static void main(String[] args) {
        User tomas = new Tomas(" tinginiauti");
        User spalva = new Jonas(" Juoda ");
        User useris = new User("vardauskas ", "pavardauskas");
        User pk = new Tomas("tekstas");
        if (tomas instanceof Tomas) {
            VcsUtils.println("Tomas valio");
            Tomas  tikraiTomas = (Tomas)tomas;
            VcsUtils.println(tikraiTomas.getHobis());
        }
        if (pk instanceof User){
            VcsUtils.println("tekstas valio");
        }

        VcsUtils.println(( useris.toString()));
        VcsUtils.println(( tomas.toString()));
        VcsUtils.println(( spalva.toString()));
    }

}
