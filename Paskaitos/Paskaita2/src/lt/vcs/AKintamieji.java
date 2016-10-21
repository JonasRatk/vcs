package lt.vcs;

public class AKintamieji {

    public static void main(String[] args) {
        System.out.println("Sveiki atvyke i VCS!!!");
        /*
        *
        * kintamųjų aprašymas:
        *
        * [tipas] [pavadinimas] = [pradinė reikšmė];
        *
        * [type] [idendifier] = [initial value];
        *
        * */
        int sveikasSkaicius = 5;
        sveikasSkaicius += 6;
        ++sveikasSkaicius; // pries veiksma prides 1
        sveikasSkaicius++; // po veiksmo prides 1
        System.out.println(sveikasSkaicius % 2);

        int ilgiausiasSveikasSkaicius = Integer.MAX_VALUE;
        System.out.println(ilgiausiasSveikasSkaicius);

		int kint = 5;
        Integer sk = 6;

		long ilgasSkaicius = 10L;
		System.out.println(ilgasSkaicius);

        long ilgiausiasIlgasSveikasSkaicius = Long.MAX_VALUE;
        System.out.println(ilgiausiasIlgasSveikasSkaicius);

        long ilgasSveikasSkaicius = Long.MAX_VALUE - Integer.MAX_VALUE;
        System.out.println(ilgasSveikasSkaicius);

        char raide = 'c';
        System.out.println(raide);

        float suKableliu = 3.14f;
        System.out.println(suKableliu);
		
		double dbl = 3.14d;
		System.out.println(dbl);

        boolean loginis = true; //or false
        System.out.println(loginis);

        String zodis = "Simboliu eilute";
        System.out.println(zodis);

    }
}
