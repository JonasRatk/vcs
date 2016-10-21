package lt.vcs;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Jon on 2016-10-14.
 */
public class VscUntils {


    /**
     *Metodas isveda nauja eilute i cmd su laiku prieki
     */
    public static void printLn(String text){
        Date date = new Date();
        String formatas = "[HH:mm]";
        SimpleDateFormat sdf = new SimpleDateFormat(formatas);
        String musuData = sdf.format(date);
        System.out.println(musuData + text);
}


}
