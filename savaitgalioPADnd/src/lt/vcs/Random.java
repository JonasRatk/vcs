package lt.vcs;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Jon on 2016-10-17.
 */
public class Random {
    public static void main(String[] args){
        for (int i =0; i < 2; i++) {
            int random = ThreadLocalRandom.current().nextInt(1, 6 + 1);
            VcsUtils.println("" + random);
        }
    }
}
