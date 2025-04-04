package assignment11Abstract.movie;

abstract class Movie {
	protected String title;
	protected String director;
	protected int duration;
	
	Movie(String title, String director, int duration){
		this.title = title;
		this.director = director;
		this.duration = duration;
	}
	public abstract String getGenre();
    public abstract double getRating();
    public abstract String getDescription();
    
    public void displayMovieDetails() {
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Genre: " + getGenre());
        System.out.println("Rating: " + getRating() + " / 10");
        System.out.println(getDescription());
        System.out.println("------------------------------------");
    }
}
