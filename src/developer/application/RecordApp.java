package developer.application;

import developer.data.LoginRequest;

public class RecordApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("arifin.ptsb@gmail.com","password");
        System.out.println(loginRequest);
        System.out.println(loginRequest.email());
        System.out.println(loginRequest.password());
        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("jack.ptsb@gmail.com"));
    }
}
