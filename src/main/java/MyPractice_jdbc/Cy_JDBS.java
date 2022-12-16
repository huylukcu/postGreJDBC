package MyPractice_jdbc;

import java.sql.*;

public class Cy_JDBS {
    public static void main(String[] args) throws SQLException,ClassNotFoundException{
 /*
 CONNECTION:
  */
        String url = "jdbc:postgresql://localhost:5433/postgres";
        String username = "postgres";
        String pwd ="Keret27";

     Connection con = DriverManager.getConnection(url,username,pwd);
     Statement st = con.createStatement();
     ResultSet resultSet = st.getResultSet();


     con.close();
     st.close();








}}
