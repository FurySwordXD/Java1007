    public class Event
    {
        public static double pricePerGuest = 35.0;
        public static int largeEventCutoff = 50;

        private String eventNumber;
        private int guests;
        private double price;

        public Event(String eventNumber, int guests)
        {
            setEventNumber(eventNumber);
            setGuests(guests);
        }

        public Event()
        {
            this("A000", 0);
        }

        public void setEventNumber(String eventNumber) { this.eventNumber = eventNumber; }
        public void setGuests(int guests) { this.guests = guests; calculatePrice(); }
        public void calculatePrice() { price = guests * Event.pricePerGuest; }

        public void display()
        {
            System.out.println("Event number: " + eventNumber + "\nGuests: " + guests + "\nPrice: " + price);
        }
    }