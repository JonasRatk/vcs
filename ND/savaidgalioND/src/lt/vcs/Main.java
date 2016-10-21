package lt.vcs;

public class Main {

    public static void main(String[] args) {
            //----------------------------------

            int p1Cash = 150; //pradine zaideju turima suma
            int p2Cash = 150;
            final int stafk1 = 15;
            final int stafk2 = 30;
            final int stafk3 = 50;
            int bet;
            int choice;
            boolean userWins;

            VcsUtils.println("Kauliuku pokeris");
            VcsUtils.println("Zaidejas 1, iveskite savo varda");
            String player1 = VcsUtils.inputWord();
            VcsUtils.println("Zaidejas 2, iveskite savo varda");
            String player2 = VcsUtils.inputWord();



            while (true){
                VcsUtils.println("Zaidejas 1 jus turite " + p1Cash + " pasirinkite statymo suma");
                do {
                    VcsUtils.println("Kiek norite pastatyti?");
                    VcsUtils.println("?");
                    bet = VcsUtils.inputInt();
                    if (bet < 0 || bet > p1Cash)
                        VcsUtils.println("Turite statyti nuo 0 iki " + p1Cash + '.');
                } while (bet < 0 || bet > p1Cash);
                if (bet == 0)
                    break;
                userWins = ();
                if (userWins)
                    p1Cash = p1Cash + bet;
                else
                    p1Cash = p1Cash - bet;
                VcsUtils.println("");
                if (p1Cash == 0) {
                    VcsUtils.println("");
                    break;
                }
            }


            VcsUtils.println("Zaidejas 1, pastate: " + bet);
            VcsUtils.println("Zaidejas 2, jeigu norite suma pakelti iveskite 1, jeigu norit islygit iveskite 2");
            choice = VcsUtils.inputInt();
            if (choice == 1);{
                int[] arr1 = {15,30,50};// pavyzdys :)
                VcsUtils.println("Zaidejas 2, kiek norite pakelti? ");
                int pastate1 = VcsUtils.inputInt();
                if (choice == 2);{

                }
            }











            VcsUtils.println("Kauliukai metami..");


//            int[] arr = {15,30,50};// pavyzdys :)
            VcsUtils.println("" + intArrayToString(arr));//pagalbinio metodo naudojimo pvz, kuri issitrinkit arba uzsikomentuokit :)
           //to VcsUtils.println("" + arr[1]);//priminimas kaip galima pasiekti masyvo elementus :)

            //TODO: jums prireiks jau naudotu metodu is String klases
            //P.S. nepamirskit apziureti klasiu turimu metodu dokumentacijos pagalba (Ctrl+q  arba  View->Quick Documentation)
            //P.P.S. Jei iskyla klausimu nebijokit ju uzduoti FB komentaruose po namu darbu ar rasyti PM, nors geriau komentuoti,
            // nes gali buti naudinga ir kitiems :)
            //TODO: Google is your friend ;)



            //----------------------------------
    }//-----main end-----\\

    /**
     * isvercia masyvo reiksmes i suprantama formata
     * @param arr masyvas, kuri versim
     * @return suprantama masyvo tekstine reprezentacija
     */
    private static String intArrayToString(int[] arr) {
        String result = "";
        for (int val : arr) {
            result += "[" + val + "] ";
        }
        return result.trim();
    }


    //TODO: nebijokit pasirasyti sau pagalbiniu metodu, jei reikia/norit, jie padaro koda tvarkingesni
    // pvz galit pasirasyti metoda pagalbini random generavimui kad nereiktu pastoviai rasyti ilgu litaniju
    // ThreadLocalRandom.current().nextInt(min, max + 1);
    //TODO: nepamirskit kad main metodas statinis todel ir pagalbiniai metodai turetu buti statiniai, kad
    //juos butu galima naudoti main metode

}
