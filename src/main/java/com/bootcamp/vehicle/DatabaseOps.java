package com.bootcamp.vehicle;

public class DatabaseOps {
    private String url;
    private String username;
    private String password;

    // Student note: setters needed for Spring to inject properties from
    // applicationContext.xml
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
        // Deliberate typo: "saving to databse" instead of "database"
        System.out.println("saving to databse URL: " + url + " (User: " + username + ")");
    }
}
