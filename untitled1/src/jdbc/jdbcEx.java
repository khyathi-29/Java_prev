package jdbc;
import java.sql.*;

public class jdbcEx {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
       //Loading Driver class
        Class.forName("oracle.jdbc.driver.OracleDriver");

        //Creating the connection
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","SYSTEM","oracle");

        //Creating the statement
        Statement stmt = conn.createStatement();

        //Executing the query
        stmt.execute("create table person(age number(10),name varchar2(20), id number(10)");
       //DML operation
       /* stmt.executeUpdate("insert into person values(45,'Ramesh',10)");
       to add multiple values
        stmt.addBatch("insert into person values(45,'Ramesh',10)");
         stmt.addBatch("insert into person values(45,'Ramesh',10)");
*/
        //

        //DRL
        /* ResultSet result = stmt.executeQuery("select * from person");
         while(result.next())
        {
            System.out.println(result.getInt("age")+" "+result.getString("name"));
        }*/
        //PreparedStatement when we are taking input from scan
       /* System.out.println("Register Here");

        System.out.println("Enter UserName");
        username = scan.next();
        System.out.println("Enter password");
        password = scan.next();
        System.out.println("Enter Contact");
        contact = scan.nextLong();
        userid = (int) (contact - 1000000);
        PreparedStatement psmt = conn.prepareStatement("insert into gmail values(?,?,?,?)");
        psmt.setInt(1, userid);
        psmt.setString(2, username);
        psmt.setString(3, password);
        psmt.setLong(4, contact);
        int result = psmt.executeUpdate();
        if (result > 0)
            System.out.println("Registration Success!!!Try with login");
        else
            System.out.println("Registration failed!!!....");
*/


        conn.close();
    }
    }
