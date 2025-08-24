package br.com.E3N.adapter.boat;

public class App {

    /*
    Implementation of the code in the site
    https://java-design-patterns.com/patterns/adapter/#detailed-explanation-of-adapter-pattern-with-real-world-examples
    */
    public static void execute() {
        try {
            /*
                Just to show that Captain can not be instantiated, there is not an implementation of RowingBoat
             */
            var captain = new Captain((RowingBoat) new FishingBoatImpl());
            captain.row();
        } catch (ClassCastException e) {
            System.out.println(e.getMessage());
        }
        FishingBoat fishingBoat = new FishingBoatImpl();
        var captain2 = new Captain(new FishingBoatAdapter(fishingBoat));
        captain2.row();
    }
}
