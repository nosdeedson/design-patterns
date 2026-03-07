package br.com.E3N.combinatorPattern.v2;

public class User {
    private final String name;
    private final String password;
    private final String email;

    private User(String name, String password, String email) {
        this.name = name;
        this.password = password;
        this.email = email;
    }

    public static User getInstance(final String name, final String password, final String email){
        var user = new User(name, password, email);
        var validation = UserValidators.defaultValidator().validate(user);
        if (!validation.isValid()){
            throw new IllegalArgumentException(validation.message());
        }
        return user;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
