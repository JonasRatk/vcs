package lt.vcs.users;

import lt.vcs.interfacas.User;

/**
 * Created by Jon on 2016-10-20.
 */
public class Anonimas implements User {

    @Override
    public String getName() {
        return "Anonimas";
    }

    @Override
    public String getLastName() {
        return "Anonimas";
    }

    @Override
    public String getEmail() {
        return null;
    }
}