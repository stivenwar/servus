package com.servus.login;

import java.sql.SQLException;

import com.servus.db.Login;
import com.servus.db.sql.LoginSQL;

public class SignOn
{
    public static void main( String[] args )
    {
        LoginSQL loginSQL = new LoginSQL();
        String mail = "juan@gmail.com";
        String code = "12344";
        Login user = null;

        try
        {
            user = loginSQL.getUser( mail );
        }
        catch( SQLException e )
        {
            System.err.println( e.getLocalizedMessage() );
            e.printStackTrace();
        }

        if( user == null )
        {
            System.out.println( "Usuario no existe" );
        }
        else if( !user.isActive() )
        {
            System.out.println( "Usuario no activo" );
        }
        else if( !user.getCode()
            .equals( code ) )
        {
            System.out.println( "password incorrecto" );
        }
        else
        {
            System.out.println( user.getUserId() );
        }
    }
}


