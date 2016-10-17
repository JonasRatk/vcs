package lt.vcs;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Jon on 2016-10-17.
 */
public class Random {
    public static void Bekoks(String[] args){
        for (int i =0; i < 3; i++) {
            int random = ThreadLocalRandom.current().nextInt(1, 6 + 1);
            VcsUtils.println("" + random);
        }
    }
}
