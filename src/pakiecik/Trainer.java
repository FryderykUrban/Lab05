package pakiecik;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Trainer extends Thread {

    public List<Skater> team = new ArrayList();
    Track track;
    int amount;
    String trainer;


    public Trainer(Track t, int a) {
        this.track = t;
        this.amount = a;
    }

    public void run() {

        Random rand = new Random();
        char n = 'a';

        for(int i = 0; i < amount; ++i) {

            int laps = rand.nextInt(5) + 1;
            System.out.println("t" + n + laps);
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int speed = (rand.nextInt(9) + 1) * 100;
            Skater skater = new Skater(Character.toString(n), laps, track, speed);
            team.add(skater);
            n++;

        }

        Iterator check;
        Skater s;
        for(check = team.iterator(); check.hasNext(); s.start()) {
            s = (Skater)check.next();

            try {
                sleep(150L);
            } catch (InterruptedException var9) {
                var9.printStackTrace();
            }
        }

        for(;;) {
            trainer = "";
            check = team.iterator();

            while(check.hasNext()) {
                s = (Skater)check.next();

                trainer =trainer + s.getSkaterName() + s.getLaps() + " ";
                if (s.getLaps() == 0) {
                    int c = rand.nextInt(5) + 1;
                    s.setLaps(c);
                }
            }

            System.out.println(trainer);
            track.ShowTrack();

            try {
                sleep(550L);
            } catch (InterruptedException var8) {
                var8.printStackTrace();
            }
        }
    }


}
