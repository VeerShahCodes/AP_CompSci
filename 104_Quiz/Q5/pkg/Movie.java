package pkg;

public class Movie{
    String movieName;
    double rating;
    int numRatings;
    int revenue;
    
    public Movie() {
        movieName = "Avengers";
        rating = 8.0;
        numRatings = 33;
        revenue = 623357910;
    }
    public Movie(String movieName, double rating, int numRatings, int revenue) {
        this.movieName = movieName;
        this.rating = rating;
        this.numRatings = numRatings;
        this.revenue = revenue;
    }

    public void movieToString() {
        System.out.println("Movie: " + movieName);
        System.out.println("Rating: " + rating);
        System.out.println("Number of Ratings: " + numRatings);
        System.out.println("Revenue: " + revenue);
        System.out.println();
    }
    
    public String getMovieName() {
        return movieName;
    }
    
    public int getRevenue() {
        return revenue;
    }
    
    public void addRating(double rating) {
        this.rating = ((this.rating * numRatings) + rating) / (numRatings + 1);
        numRatings++;
    }    
    
    public boolean compareRatings(Movie movie) {
        if(rating > movie.rating) return true;
        else return false;
    }
    
    public Movie pirateMovie() {
        return new Movie(movieName, rating, numRatings, revenue);
    }
    
    public String revenueToString() {
        int a = revenue;
        
        String b = "" + a % 1000;
        a = a / 1000;
        String c = "" + a % 1000;
        a = a / 1000;
        String d = "" + a % 1000;
        
        return d + "," + c + "," + b;
    }

}
