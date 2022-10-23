package com.example.oop.basic;

class DBConnection {

    private static DBConnection instance;

    private DBConnection(){
    }

    public static DBConnection getInstance(){
        if(instance == null){
        instance = new DBConnection();
        }
        return instance;
    }

    public void getFromDB(){
        System.out.println("dane z bazy");
    }
}


public class SingletonExample {
    public static void main(String[] args) {
        DBConnection connection = DBConnection.getInstance();
        DBConnection connection2 = DBConnection.getInstance();

        connection2.getFromDB();

        System.out.println(connection == connection2);
        System.out.println(connection);
        System.out.println(connection2);

    }
}
