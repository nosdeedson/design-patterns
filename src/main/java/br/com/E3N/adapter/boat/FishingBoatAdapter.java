package br.com.E3N.adapter.boat;

public class FishingBoatAdapter implements RowingBoat{
    private final FishingBoat fishingBoat;

    public FishingBoatAdapter(FishingBoat fishingBoat) {
        this.fishingBoat = fishingBoat;
    }

    @Override
    public void row(String rowing) {
        this.fishingBoat.sail(rowing);
    }
}
