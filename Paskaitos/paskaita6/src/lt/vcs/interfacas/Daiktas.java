package lt.vcs.interfacas;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Jon on 2016-10-20.
 */
public interface Daiktas {
    String getName();
    Date getPurchaseDate();
// SimpleDateFormat getPurchaseDate();
}



//daiktas  nauja absract clase AbstractDaiktas
//paketas lt.vcs.Interfeisas naujas interfeisas daiktas
//gauti daikto pavadiima(name) ir isigyjimo daikta(purchaseDate)
//implementuoja daiktas ir VcsEntity interfeisius
//turi tureti konstrukturiu su isigijimo data ir pavadimu
//implementacija getID() metodu, kuri grazina pavadinima ir isigijimo data formatu
// <name - [purchaseDate_sekundes][purchaseDate_minutes][purchaseDate_valandos]
