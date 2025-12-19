package loose.coupling.injection;

public class UserDatabase implements UserDataProvider {

    @Override
    public String getUserDetails() {
        return "User Details from Database";
    }
}
