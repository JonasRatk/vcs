package lt.vcs;

import sun.java2d.pipe.BufferedRenderPipe;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        File file = new File("D:\\Temp\\failas.txt");
        VcsUtils.println(file.toString());

        PvzKlase pvz = new PvzKlase<File>(file);
        Object kazkas = pvz.getReiksme();
        if (kazkas instanceof File ){
            File tikraiFailas
        }


        List<Integer> listas = new ArrayList<>();
        for (int i - 1; i < 6, i++){
            listas.add(i);
        }

//            BufferedWriter bw = VcsUtils.newWriter(file.toString());
//            bw.append(VcsUtils.NEW_LINE + "ketvirta");
//            bw.flush();
//            bw.close();
//
        try {
        BufferedReader br = VcsUtils.newReader(file.toString());
        String line;
        while ((line = br.readLine()) != null) {
            VcsUtils.println(line);
        }
        br.close();
        } catch(IOException ex){
            VcsUtils.println(ex.getMessage());
            throw new RuntimeException("NEPASISEKE ", ex);
        } catch(Exception ex){

        }
    }
}
