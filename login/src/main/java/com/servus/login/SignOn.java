package com.servus.login;

import java.sql.SQLException;

import com.google.gson.Gson;
import com.servus.db.Login;
import com.servus.db.Message;
import com.servus.db.Result;
import com.servus.db.sql.LoginSQL;

public class SignOn
{
	public static void main( String[] args )
    {
    	
    	
    	
    	Gson gson = new Gson();
        LoginSQL loginSQL = new LoginSQL();
        String mail = "esteban@gmail.com";
        String code = "sancochito69";
        Login user = null;
        Message message = new Message(mail,code);
    	Result resultOk = new Result("OK","Usuario encontrado",mail);
    	Result resultUser = new Result("Not OK","User not ok",mail);
    	Result resultPassword = new Result("Not OK","Password not ok",mail);
    	Result active = new Result("activo","Usuario activo",mail);

        try{
            user = loginSQL.getUser( mail );
            System.out.println(gson.toJson(message));
        }
        catch( SQLException e )
        {
            System.err.println( e.getLocalizedMessage() );
            e.printStackTrace();
        }

        if( user == null )
        {
            System.out.println( gson.toJson(resultUser) );
        }
        
        else if( !user.isActive() )
        {	
            System.out.println( gson.toJson(active) );
        }
        else if( !user.getCode()
            .equals( code ) )
        {
            System.out.println( gson.toJson(resultPassword) );
        }
        else
        {
            System.out.println( gson.toJson(resultOk) );
        }
    }
}


