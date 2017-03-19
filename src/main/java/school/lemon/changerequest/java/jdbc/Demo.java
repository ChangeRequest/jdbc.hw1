package school.lemon.changerequest.java.jdbc;

import org.h2.jdbcx.JdbcDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static school.lemon.changerequest.java.jdbc.DbConfigHolder.*;

public class Demo {
    public static void main(String[] args) throws SQLException {
        JdbcDataSource h2Ds = new JdbcDataSource();
        h2Ds.setUrl(getUrl());

        Connection conn = h2Ds.getConnection(getUserName(), getPassword());
        Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery("SELECT CATALOG.NAME, ITEM.TITLE, PROPERTY.NAME, CATEGORY.TITLE " +
                "FROM CATALOG, ITEM, PROPERTY, CATEGORY " +
                "WHERE CATALOG_ID=CATALOG.ID AND PROPERTY_ID=PROPERTY.ID AND CATEGORY_ID=CATEGORY.ID;");
        while (rs.next()) {
            System.out.println( String.format("%-10s %-20s %-10s %-10s", rs.getString("CATALOG.NAME"),rs.getString("ITEM.TITLE"),rs.getString("PROPERTY.NAME"),rs.getString("CATEGORY.TITLE")));



        }
        conn.close();


    }

}