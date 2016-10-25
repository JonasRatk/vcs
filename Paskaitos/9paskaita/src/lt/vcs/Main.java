package lt.vcs;

import java.sql.*;

public class Main {

    public static void main(String[] args) throws SQLException {

        //////-----main metodas-----//////

        Connection conn = VcsDbUtils.connect("antra");

        Statement state = conn.createStatement();
        int updatedCount = 0;
//        for (int i =1; i<6; i++){
//            updatedCount +=
//            state.executeUpdate("insert into person(vardas,pavarde) VALUES('Tomas"
//                    + i +"','Tomauskas"
//                    +i +"');");
//        }
//        VcsUtils.println("Viso pakeista: " + updatedCount);

        ResultSet result = state.executeQuery("SELECT * FROM person WHERE vardas like 'Tomas_'");
        while (result.next()){
            VcsUtils.println(result.getString("vardas") + "\t"
            + result.getString("pavarde"));

        }



        VcsDbUtils.Disconnect(conn);



        //////---baigesi main---//////

    }
}
