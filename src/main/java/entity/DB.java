package entity;

import java.sql.*;
import java.util.logging.Logger;
import utils.*;
public class DB {

    private static Logger LOGGER = Utils.getLogger(Connection.class.getName());
	private static Connection connect;

    public static Connection getConnection() {
        if (connect != null) return connect;
        try {
			Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://ep-cool-sky-a1koh1my.ap-southeast-1.aws.neon.tech/AIMS?user=AIMS_owner&password=PcSJ68htwiKE&sslmode=require";
            connect = DriverManager.getConnection(url);
            LOGGER.info("Connect database successfully");
        } catch (Exception e) {
            LOGGER.info(e.getMessage());
        } 
        return connect;
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection connection = DB.getConnection();
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery( "SELECT * FROM MEDIA;" );
        while ( rs.next() ) {
            String id = rs.getString("id");

            System.out.println( "ID = " + id );

            System.out.println();
        }
    }
}
