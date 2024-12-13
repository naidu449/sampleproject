package com.jsp.MavenProject;

import javax.security.auth.login.AppConfigurationEntry;
import javax.security.auth.login.Configuration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Alien naidu= new Alien();
        naidu.setAid(101);
        naidu.setName("tirupathi");
        naidu.setColor("black");
        System.out.println(naidu.getName());
    }
}
