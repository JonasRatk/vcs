package lt.vcs;

import javax.swing.plaf.basic.BasicScrollPaneUI;

public class Main {

    public static void main(String[] args) {
        //----------------------------------

        int p1Cash = 150; //pradine zaideju turima suma
        int p2Cash = 150;
        int bet;
        int bet2;
        int betsum;
        String didint;
        Random dice1 = new Random();


        VcsUtils.println("Kauliuku pokeris");
        VcsUtils.println("Zaidejas 1, iveskite savo varda");
        String player1 = VcsUtils.inputWord();
        VcsUtils.println("Zaidejas 2, iveskite savo varda");
        String player2 = VcsUtils.inputWord();

        VcsUtils.println("Zaidejas 1,jus turite " + p1Cash + " pinigu");
        VcsUtils.println("Pasirinkite statymo suma");
        bet = VcsUtils.inputInt();
        VcsUtils.println("Zaidejas 2, jus turite " + p2Cash);
        VcsUtils.println("Pasirinkite statymo suma");
        bet2 = VcsUtils.inputInt();

        while (bet < 0 || bet > p1Cash){
                VcsUtils.println("Turite pasirinkti nuo 0 iki " + p1Cash);
                bet = VcsUtils.inputInt();
        }
        if (bet2 <0 || bet > p2Cash ){
            VcsUtils.println("Zaidejas 2 iveskite statyma " + "jusu turimi" + p2Cash);
            bet2 = VcsUtils.inputInt();
        }
        else if (bet > bet2){
            VcsUtils.println("Zaidejas 2 ar norite islyginti statyma?");
            VcsUtils.println("Iveskite T jeigu norite");
            didint = VcsUtils.inputWord();
            if (didint.equals("T"));{
                VcsUtils.println("Zaidejas 2 padidinkit savo statyba daugiau negu "+bet);
                bet2 = VcsUtils.inputInt();

            }


        }
        else if (bet2 >bet){
            VcsUtils.println("Zaidejas 1 ar norite didinti statyma?");
            VcsUtils.println("Iveskite T jeigu norite");
            didint = VcsUtils.inputWord();
            if (didint.equals("T"));{
                VcsUtils.println("Zaidejas 1 padidinkit savo statyba daugiau negu "+bet2);
                bet = VcsUtils.inputInt();

            }

        }
//            else if (bet < 0 || bet < p1Cash);{
//                VcsUtils.println("Zaidejas 2, ar norite padidinti statyma? " + " Jusu turimi pinigai " + p2Cash);
//                VcsUtils.println("Jeigu taip parasykite T");
//                String start = VcsUtils.inputWord();
//                if(start.equalsIgnoreCase("T")){
//
//                }
//            }

        }

//        int[] arr = {15,30,50};// pavyzdys :)
//        VcsUtils.println(intArrayToString(arr));//pagalbinio metodo naudojimo pvz, kuri issitrinkit arba uzsikomentuokit :)
//        VcsUtils.println("" + arr[1]);//priminimas kaip galima pasiekti masyvo elementus :)

        //TODO: jums prireiks jau naudotu metodu is String klases
        //P.S. nepamirskit apziureti klasiu turimu metodu dokumentacijos pagalba (Ctrl+q  arba  View->Quick Documentation)
        //P.P.S. Jei iskyla klausimu nebijokit ju uzduoti FB komentaruose po namu darbu ar rasyti PM, nors geriau komentuoti,
        // nes gali buti naudinga ir kitiems :)
        //TODO: Google is your friend ;)



        //----------------------------------
    //-----main end-----\\

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
