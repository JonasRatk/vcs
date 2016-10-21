package lt.vcs;

import lt.vcs.daiktai.AbstractDaiktas;
import lt.vcs.daiktai.Zaislas;
import lt.vcs.interfacas.User;
import lt.vcs.users.AbstractUser;
import lt.vcs.users.Tomas;


public class Main {

    public static void main(String[] args) {
        User Tomas1 = new Tomas("Tomas1", "email@email.lt");
        Tomas Tomas2 = new Tomas("Tomas2", "tomas@meska.lt");
        AbstractUser Tomas3 = new Tomas("Tomas3", "tomas@meska.lt");

        Zaislas zaislas = new Zaislas("pliusinis pimpockiukas");
        VcsUtils.println(zaislas.getID());




        if (Tomas2 instanceof User) {
            VcsUtils.println("Tomas2 yra objekta");
        }
        if (Tomas2 instanceof Tomas) {
            VcsUtils.println("Tomas2 yra class");
        }
//        VcsUtils.println(Tomas1.toString());
        if (Tomas2 instanceof AbstractUser) {
            VcsUtils.println("Tomas2 yra AbstractUser");
        }
        if (Tomas3 instanceof AbstractUser) {
            VcsUtils.println("Tomas3 yra AbstractUser");
        }
        if (Tomas1 instanceof AbstractUser) {
            VcsUtils.println("Tomas1 yra AbstractUser");
        }
    }
}