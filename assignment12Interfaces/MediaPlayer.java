package assignment12Interfaces;

import java.util.Scanner;

interface Playable {
	void play();

	void pause();

	void stop();
}

class MP3Player implements Playable {
	@Override
	public void play() {
		System.out.println("MP3 Player: Playing music...");
	}

	@Override
	public void pause() {
		System.out.println("MP3 Player: Music paused.");
	}

	@Override
	public void stop() {
		System.out.println("MP3 Player: Music stopped.");
	}
}

class CDPlayer implements Playable {
	@Override
	public void play() {
		System.out.println("CD Player: Playing CD...");
	}

	@Override
	public void pause() {
		System.out.println("CD Player: CD paused.");
	}

	@Override
	public void stop() {
		System.out.println("CD Player: CD stopped.");
	}
}

class StreamingPlayer implements Playable {
	@Override
	public void play() {
		System.out.println("Streaming Player: Streaming started...");
	}

	@Override
	public void pause() {
		System.out.println("Streaming Player: Streaming paused.");
	}

	@Override
	public void stop() {
		System.out.println("Streaming Player: Streaming stopped.");
	}
}

public class MediaPlayer {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Playable player = null;
		boolean stop = false;
		while (!stop) {
			System.out.println("Choose a music player:");
			System.out.println("1. MP3 Player");
			System.out.println("2. CD Player");
			System.out.println("3. Streaming Player");

			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				player = new MP3Player();
				stop = true;
				break;
			case 2:
				player = new CDPlayer();
				stop = true;
				break;
			case 3:
				player = new StreamingPlayer();
				stop = true;
				break;
			default:
				System.out.println("Invalid choice.");
				scanner.nextLine();
			}
		}
		boolean loop = true;
		while (loop) {
			System.out.println("\nChoose an action:");
			System.out.println("1. Play");
			System.out.println("2. Pause");
			System.out.println("3. Stop");
			System.out.println("4. Exit");

			int action = scanner.nextInt();

			switch (action) {
			case 1:
				player.play();
				break;
			case 2:
				player.pause();
				break;
			case 3:
				player.stop();
				break;
			case 4:
				System.out.println("Exiting player...");
				loop = false;
				break;
			default:
				System.out.println("Invalid action.");
			}
		}
	}

}
