package com.codeup.adlister.dao;

import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


//class com.codeup.adlister.dao.Config {
//    private String Url="jdbc:mysql://localhost/adlister_db?serverTimezone=UTC&useSSL=false";
//
//
//
//    private String username="adlisterUser";
//    private String password="password";
//   public String getUrl() {
//      return "jdbc:mysql://localhost/adlister_db?serverTimezone=UTC&useSSL=false";
//    }
//    public String getUsername() {
//       return "user";
//    }
//    public String getPassword() {
//        return "password";
//   }
//
//
//}

public class Config {

    private String url="jdbc:mysql://localhost/adlister_db?serverTimezone=UTC&useSSL=false";
    private String user="adlisteruser";
    private String password="momo";

    public Config(){};

    public String getUrl(){
        return url;
    }
    public String getUser(){
        return user;
    }
    public String getPassword(){
        return password;
    }




}