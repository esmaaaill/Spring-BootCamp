package com.bootcamp.vehicle;

public class DatabaseOps {
    private String url;
    private String username;
    private String password;

   
    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void saveToDatabase(String vehicleType) {
        
        System.out.println("saving to databse URL: " + url + " (User: " + username + ")");
    }
}
