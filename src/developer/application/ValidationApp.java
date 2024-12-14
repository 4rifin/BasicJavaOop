package developer.application;

import developer.annotation.Fency;
import developer.annotation.NotBlank;
import developer.data.LoginRequest;
import developer.error.BlankException;
import developer.error.ValidationException;
import developer.util.ValidationUtil;

import java.lang.reflect.Field;

/**
 * Exception
 */
public class ValidationApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest(null,"arifin.ptsb");
        try{
            ValidationUtil.validate(loginRequest);
            System.out.println("Data Validation Successful");
        }catch (ValidationException e){
            System.out.println("Data Error : " + e.getMessage());
        }catch (NullPointerException e){
            System.out.println("Data Null : " + e.getMessage());
        }finally {
            System.out.println("Data Validation selalu di eksekusi");
        }

        LoginRequest loginRequest2 = new LoginRequest("arifin.ptsb@gmail.com","passowrd");
        ValidationUtil.validateRuntime(loginRequest2);
    }
}
