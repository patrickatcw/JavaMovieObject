package com.me;

public class Main {

    public static void main(String[] args) {

        //building new instances, creating new objects
        Movie a = new Movie("The Thing", 1979, "R", "horror", 123);
        Movie b = new Movie("White Nights", 1987, "R", "drama", 147);
        Movie c = new Movie("Popeye", 1985, "PG", "comedy", 136);
        Movie d = new Movie("The Shop", 2012, "PG", "comedy", 106);

        //printout logic
        System.out.println("Here is some movie information;");
        System.out.println("Movie Info: " + a.getTitle() + ", " + a.getYear() + ", " + a.getRating()
                + ", " + a.getGenre() + ", " + a.getLength() + " minutes");
        System.out.println("Movie Info: " + b.getTitle() + ", " + b.getYear() + ", " + b.getRating()
                + ", " + b.getGenre() + ", " + b.getLength() + " minutes");
        System.out.println("Movie Info: " + c.getTitle() + ", " + c.getYear() + ", " + c.getRating()
                + ", " + c.getGenre() + ", " + c.getLength() + " minutes");
        System.out.println("Movie Info: " + d.getTitle() + ", " + d.getYear() + ", " + d.getRating()
                + ", " + d.getGenre() + ", " + d.getLength() + " minutes");

    }

}

//Results
   /*   Here is some movie information;
        Movie Info: The Thing, 1979, R, horror, 123 minutes
        Movie Info: White Nights, 1987, R, drama, 147 minutes
        Movie Info: Popeye, 1985, PG, comedy, 136 minutes
        Movie Info: The Shop, 2012, PG, comedy, 106 minutes*/