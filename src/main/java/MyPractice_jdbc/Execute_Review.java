package MyPractice_jdbc;

import java.sql.*;

public class Execute_Review {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
       //2.Step :Registration to the driver, it is like registering to communication company like AT&T
        Class.forName("org.postgresql.Driver");

        //3.Step: Create a connection with database, it is like calling your friend
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5433/postgres","postgres","Keret27");

        //4.Step:Create Statement, it is like talking with your friend
        Statement st = con.createStatement();

        //5.Step: Execute the query,it is like sending your message to your friend(invite dinner)

        //6.Step: sometimes my friend will say something.burda sadece ben execute yaptim.

        //7.Step: Close the con, and st
        con.close();
        st.close();


    }
}
