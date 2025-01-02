import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws SQLException {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        // Task - Create a table in Database
        // Host , port - IP address of a machine // localhost: 127.0.0.1
        // Mysql --3306 postgres-5432
        // ps -ef | grep "mysql"
        // In mac go to activity monitor search
// create table person ( id int , name varchar(30));
        System.out.println("Hello and welcome!");
        Connection connection = DriverManager.getConnection("jdbc:mysql://sql5.freemysqlhosting.net:3306/sql5704093","sql5704093","a4leWxfsCY");
        Statement statement = connection.createStatement();
        statement.execute("create table person ( id int , name varchar(30));");

        // Task - Create a table in Database


    }
}