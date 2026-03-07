package br.com.E3N.combinatorPattern.v2;

public class App {

    public static void execute(){
        try{
            var user = User.getInstance("Edson", "1234", "teste");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            var user = User.getInstance("Edson", "1234", "test@test");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            var user = User.getInstance("Edson", "12345678", "test@test");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        var user = User.getInstance("Edson Jose", "12345678", "test@test");
        System.out.println(user.toString());
    }
}
