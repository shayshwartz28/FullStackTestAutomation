package Utilities;

import java.sql.DriverManager;

public class ManageDB extends CommonOps
{
    public static void initConnection(String dbURL, String user, String password)
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(dbURL, user, password);
            stmt = con.createStatement();
        }
        catch (Exception e)
        {
            System.out.println("Error occurred while connecting to DB, See details: " + e);
        }
    }

    public static void closeConnection()
    {
        try
        {
            con.close();
        }
        catch (Exception e)
        {
            System.out.println("Error occurred while connecting to DB, See details: " + e);
        }
    }
}
