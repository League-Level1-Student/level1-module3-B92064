
public class Netfix {
	public static void main(String[] args) {
		Movie m = new Movie("Twilight", 0);
		Movie m2 = new Movie("Infinity War", 5);
		Movie m3 = new Movie("Venom", 3);
		Movie m4 = new Movie("The Isle of Dogs", 4);
		Movie m5 = new Movie("The Shining", 5);
		m.getTitle();
		m.getRating();
		m.getTicketPrice();
		NetflixQueue netflix = new NetflixQueue();
		netflix.addMovie(m);
		netflix.addMovie(m2);
		netflix.addMovie(m3);
		netflix.addMovie(m4);
		netflix.addMovie(m5);
		netflix.getBestMovie();
		System.out.println(netflix);
	}
}
