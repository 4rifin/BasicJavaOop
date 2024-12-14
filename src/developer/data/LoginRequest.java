package developer.data;

/**
 * Record Class
 *
 * @param email
 * @param password
 */
public record LoginRequest(String email, String password) {

    public LoginRequest {
        System.out.println("Java Record Class");
    }

    public LoginRequest(String emails) {
        this(emails, "");
    }

    public LoginRequest(){
        this("","");
    }


}
