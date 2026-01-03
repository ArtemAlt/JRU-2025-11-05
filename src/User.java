public class User implements EntityKey {
    private String name;
    private String password;
    private String email;
    private UserType type;

    public User(String name, String password, String email, UserType type) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.type = type;
    }

    public String getName() {
        return this.name;
    }

    public String getPassword() {
        return this.password;
    }

    public String getEmail() {
        return this.password;
    }

    public String getType() {
        return this.type.name();
    }

    public void setPassword (String newPass) {
        this.password = newPass;
    }

    public void setType (UserType newType) {
        this.type = newType;
    }

    @Override
    public String getKey() {
        return email;
    }

    /*
                Юзер
                - ИМЯ
                - пароль
                - почту
                - типы
    */


}