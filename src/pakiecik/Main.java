package pakiecik;


import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ilu łyżwiarzy bierze udział w wyścigu?: ");
        int amount = scanner.nextInt();
        Track track = new Track();
        track.CreateTrack();
        Trainer t = new Trainer(track, amount);
        t.start();

    }
}
