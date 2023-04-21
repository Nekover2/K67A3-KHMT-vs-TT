package neko.oop.lab9.Library;

public class Library {
    Rent[] rents;

    public Library(Rent[] rents) {
        this.rents = rents;
    }

    public Rent getLongestRent() {
        Rent longestRent = rents[0];
        long longestDuration = 0;
        for (Rent rent : rents) {
            long duration = rent.getEnd().getTime() - rent.getBegin().getTime();
            if (duration > longestDuration) {
                longestDuration = duration;
                longestRent = rent;
            }
        }
        return longestRent;
    }
}
