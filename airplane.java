class Airplane {
    String flightNumber, destination, departureTime;

    Airplane(String flightNumber, String destination, String departureTime) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
    }

    void checkFlightStatus() {
        System.out.println("Flight " + flightNumber + " to " + destination + " is on time.");
    }

    public static void main(String[] args) {
        Airplane flight = new Airplane("AI202", "New York", "10:00 AM");
        flight.checkFlightStatus();
    }
}
