package developer.util;

import developer.annotation.NotBlank;
import developer.data.LoginRequest;
import developer.error.BlankException;
import developer.error.ValidationException;

import java.lang.reflect.Field;

public class ValidationUtil {
    public static void validate(LoginRequest loginRequest) throws ValidationException,NullPointerException {
        if (loginRequest.email() == null) {
            throw new NullPointerException("username is null");
        } else if (loginRequest.email().isBlank()) {
            throw new ValidationException("username is blank");
        } else if (loginRequest.password().isBlank()) {
            throw new NullPointerException("password is null");
        } else if (loginRequest.password() == null) {
            throw new ValidationException("password is blank");
        }
    }

    public static void validateRuntime(LoginRequest loginRequest){
        if (loginRequest.email() == null) {
            throw new NullPointerException("username is null");
        } else if (loginRequest.email().isBlank()) {
            throw new RuntimeException("username is blank");
        } else if (loginRequest.password().isBlank()) {
            throw new NullPointerException("password is null");
        } else if (loginRequest.password() == null) {
            throw new RuntimeException("password is blank");
        }
    }

    public static void validationReflection(Object object){
        Class clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            if(field.getAnnotation(NotBlank.class) != null){
                try{
                    String value=(String) field.get(object);
                    if(value == null || value.isEmpty()){
                        throw new BlankException("error " + field.getName() + " field is Blank");
                    }
                }catch (IllegalAccessException e){
                    System.out.println("No access " + field.getName());
                }

            }
        }
    }

}
