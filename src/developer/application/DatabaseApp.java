package developer.application;

import developer.error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
        connectionDB("ndms.arifin@gmail.com",null);
        System.out.println("Success");
    }
    public static void connectionDB(String email, String password) {
        if(email == null || password == null) {
            throw new DatabaseError("Error");
        }

    }
}
