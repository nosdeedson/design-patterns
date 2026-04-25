package br.com.E3N.builder.version3;

public class Calzone extends Pizza{
    private final boolean sauceInside = false;

    public static class Builder extends Pizza.Builder<Builder>{
        private boolean sauceInside = false;
        public Builder sauceInside(){
            sauceInside = true;
            return this;
        }
        @Override
        Pizza build() {
            return new Calzone(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private Calzone(Builder builder) {
        super(builder);
        boolean sauceInside = builder.sauceInside;
    }

    @Override
    public String toString() {
        return "Calzone{" +
                "sauceInside=" + sauceInside +
                ", toppings=" + toppings +
                '}';
    }
}
