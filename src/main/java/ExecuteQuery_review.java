import java.sql.*;

public class ExecuteQuery_review {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //1.Step: Registration to the driver
        Class.forName("org.postgresql.Driver");

        //2.Step: Create connection with dataBase
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5433/postgres","postgres","Keret27");

        //3.Step: Create Statement
        Statement st = con.createStatement();

        //1.Example: Select the country names whose region id's are 1
        String sql1 = "SELECT country_name FROM countries WHERE region_id=1";

        //If you use execute() method, you will get true or false as return. But I want to see the records.
        boolean result1 = st.execute(sql1);
        System.out.println("result1= " + result1);

        //To see the records we have another method which is "executeQuery()".
        ResultSet rs = st.executeQuery(sql1); //get the data see the console

        while(rs.next()) {
            System.out.println(rs.getString("country_name"));

            //2.Example: Select the country_id and country_name whose region_id's are greater than 2

            String sql2 = "SELECT country_id, country_name FROM countries WHERE region_id>2";
            ResultSet resultSet;


        }}}