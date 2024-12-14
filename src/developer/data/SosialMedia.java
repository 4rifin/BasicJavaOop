package developer.data;

class SosialMedia {
String name;

}

class Instagram extends SosialMedia {
    /**
     * Final Modifier in Method
     * "Error :ogin(String, String)' cannot override 'login(String, String)' in 'developer. data. Instagram'; overridden method is final'"
     */
    final void login(String username, String password) {

    }

}

final class FaceBook extends Instagram {
    //void login (String username, String password) {

    //}
}

/**
 * Final Modifier in Class
 * "Error :Cannot inherit from final 'developer. data. FaceBook'"
 */
//class FakeFaceBook extends FaceBook {

//}