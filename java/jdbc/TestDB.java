/*
 *  CopyLeft 2023 Niraj
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.*;
import java.util.Properties;
/**
 *
 * @author niraj
 */
public class TestDB {
    public static void main(String[] args) throws IOException {
    try {
      testRun();
    }catch (SQLException e) {
      for (Throwable t: e) {
        t.printStackTrace();
      }
    }
  }
  public static void testRun() throws SQLException, IOException {
    try (
        Connection connection = getConnection();
        Statement statement = connection.createStatement()
    ){
      statement.executeUpdate("CREATE TABLE GREETINGS (Message char(20))");
      statement.executeUpdate("insert into GREETINGS VALUES('Hello, World !')");

      try(ResultSet result = 
              statement.executeQuery("SELECT * FROM GREETINGS")) {
        if(result.next()) {
          System.out.println("result = " + result.getString(1));
        }
        statement.executeUpdate("drop table greetings");
      }
    }
  }

  public static Connection getConnection() throws SQLException, IOException {
    Properties props = new Properties();
    try (InputStream in = Files.newInputStream(
            Paths.get("database/database.properties")))
    {
      props.load(in);
    }
    String drivers = props.getProperty("jdbc.drivers");
    if (drivers != null) System.setProperty("jdbc.drivers", drivers);
    // DriverManager.registerDriver(new org.apache.derby.jdbc.ClientDriver());
    String url = props.getProperty("jdbc.url");
    String username = props.getProperty("jdbc.username");
    String password = props.getProperty("jdbc.password");

    return DriverManager.getConnection(url, username, password);
  }
}
