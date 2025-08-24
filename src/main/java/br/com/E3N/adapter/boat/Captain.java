package br.com.E3N.adapter.boat;

public class Captain {
    private final RowingBoat rowingBoat;

    public Captain(RowingBoat rowingBoat) {
        this.rowingBoat = rowingBoat;
    }

    public void row(){
        rowingBoat.row("Rowing the boat.");
    }
}
