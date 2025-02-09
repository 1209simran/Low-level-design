package BuilderPattern;

public class Car {
    private String type;
    private int seats;

    public Car(Builder builder) {
        this.seats = builder.seats;
        this.type = builder.type;
    }

    public static class Builder{
        private String type;
        private int seats;

        public Builder setType(String type) {
            this.type = type;
            return this;
        }
        public Builder setSeats(int seats) {
            this.seats = seats;
            return this;
        }

        public Car build(){
            return new Car(this);
        }
    }
}
