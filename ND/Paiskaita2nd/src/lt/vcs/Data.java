package lt.vcs;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Jon on 2016-10-14.
 */
public class Data {
    public static void main(String[] args) {


        Date date = new Date();
        String formatas = "yyyy-MM-dd";
        SimpleDateFormat sdf = new SimpleDateFormat(formatas);
        String musuData = sdf.format(date);
        System.out.println(musuData);

    }
}
