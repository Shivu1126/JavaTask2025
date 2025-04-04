package assignment11Abstract.movie;

class LoveMovie extends Movie{
	private double rating;
	LoveMovie(String title, String director, int duration, double rating) {
		super(title, director, duration);
		this.rating = rating;
	}

	@Override
	public String getGenre() {
		return "Love";
	}

	@Override
	public double getRating() {
		return rating;
	}

	@Override
	public String getDescription() {
		return "A hilarious movie with lots of love and fun moments.";
	}
}

class ThrillerMovie extends Movie{
	private double rating;

    public ThrillerMovie(String title, String director, int duration, double rating) {
        super(title, director, duration);
        this.rating = rating;
    }

    @Override
    public String getGenre() {
        return "Action";
    }

    @Override
    public double getRating() {
        return rating;
    }

    @Override
    public String getDescription() {
        return "An action-packed thriller full of stunts and adventure.";
    }
}

public class MovieApp {

	public static void main(String[] args) {

        Movie loveMovie = new LoveMovie("Pannaiyarum Pathminium", "S. U. Arun Kumar", 150, 8.0);
		Movie actionMovie = new ThrillerMovie("Fast and Furious 8", "F. Gary Gray", 100, 8.1);

        loveMovie.displayMovieDetails();
        actionMovie.displayMovieDetails();
	}

}
