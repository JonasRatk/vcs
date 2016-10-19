package lt.vcs;

import lt.vcs.paskaita5.User;

public class Main {
// skirtingas klases atskirti package pvz lt.vcs.main
//    modifikatorius yra( public,private )

    public static void main(String[] args) {

        VcsUtils.println(( new User("vardauskas ", "pavardauskas")).toString());

    }
}
