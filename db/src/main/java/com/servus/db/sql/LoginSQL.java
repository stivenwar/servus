package com.servus.db.sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.servus.db.Conn;
import com.servus.db.Login;

public class LoginSQL
{
    public Login getUser( String mail ) throws SQLException
    {
        Login login = null;
        Conn conn = new Conn();
        Connection connection = conn.getConnection();
        if( connection != null )
        {
            PreparedStatement ps = null;
            ResultSet rs = null;
            ps = connection.prepareStatement( "SELECT * FROM login WHERE mail = ?" );
            ps.setString( 1, mail );
            rs = ps.executeQuery();
            while( rs.next() )
            {
                login = new Login();
                login.setMail( rs.getString( "mail" ) );
                login.setCode( rs.getString( "code" ) );
                login.setActive( rs.getBoolean( "active" ) );
                login.setUserId( rs.getString( "userId" ) );
            }
        }
        return login;
    }
}
