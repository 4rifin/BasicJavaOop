package developer.application;

import developer.data.CreateUserRequest;
import developer.util.ValidationUtil;

public class ReflectionApp {
    public static void main(String[] args) {
        CreateUserRequest createUserRequest = new CreateUserRequest();
        createUserRequest.setUserName("arifin");
        createUserRequest.setPassword("123456");
        ValidationUtil.validationReflection(createUserRequest);

    }


}
