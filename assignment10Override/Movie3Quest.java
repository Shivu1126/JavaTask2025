package assignment10Override;

class Movie{
	String title;
	private String actor;
	private String actress;
	
	Movie(String title, String actor, String actress){
		this.title = title;
		this.actor = actor;
		this.actress = actress;
	}
	public void playSong() {
		System.out.println("No Song..");
	}
	public void playTrailer() {
		System.out.println("No Trailer..");
	}
	public void getMovieDetails() {
		System.out.println("Title - "+title);
		System.out.println("Actor - "+actor);
		System.out.println("Actress - "+actress);
	}
}

class RomComMovie extends Movie{
	String song;
	String trailer;
	public RomComMovie(String title, String actor, String actress, String song, String trailer) {
		super(title, actor, actress);
		this.song = song;
		this.trailer = trailer;
	}	
	public void playSong() {
		System.out.println(song+" song played from "+title);
	}
	public void playTrailer() {
		System.out.println(trailer+" trailer played..");
	}
	public void getMovieDetails() {
		super.getMovieDetails();
		if(song!=null)
			System.out.println("Song - "+song);
		else
			super.playSong();
	}
}
class ThrillerMovie extends Movie{
	String song;
	String trailer;
	public ThrillerMovie(String title, String actor, String actress, String song, String trailer) {
		super(title, actor, actress);
		this.song = song;
		this.trailer = trailer;
	}
	public void playSong() {
		if(song!=null)
			System.out.println(song+" song played from "+title);
		else
			super.playSong();
	}
	public void playTrailer() {
		System.out.println(trailer+" trailer played..");
	}
	public void getMovieDetails() {
		super.getMovieDetails();
		if(song!=null)
			System.out.println("Song - "+song);
		else
			super.playSong();
	}
}

public class Movie3Quest {

	public static void main(String[] args) {
		Movie movie = new RomComMovie("RajaRani", "Arya, Jai", "Nazirya, Nayanthra", "Chillena Oru Mazhai Thuli",
				"Raja Rani Trailer");
		movie.getMovieDetails();
		movie.playSong();
		System.out.println();
		movie = new ThrillerMovie("Kaithi", "Karthi", "No One", null, "Kaithi Trailer");
		movie.getMovieDetails();
		movie.playSong();
		System.out.println();
		movie = new RomComMovie("Unakkum Enakkum", "Ravi", "Trisha", "Aagayam Ithanai Naal", "UnakkumEnakkum Trailer");
		movie.getMovieDetails();
		movie.playSong();
	}

}
