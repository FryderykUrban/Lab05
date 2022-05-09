package pakiecik;


public class Skater extends Thread {
    private String name;
    private int laps;
    private int index = 0;
    private int speed;
    Track tr;

    public void run() {
        while(true) {
            try {
                move();
            } catch (InterruptedException var2) {
                var2.printStackTrace();
            }
        }
    }

    public Skater(String n, int c, Track t, int s) {
        this.name = n;
        this.laps = c;
        this.tr = t;
        this.speed = s;
    }

    public void move() throws InterruptedException {
        sleep(1000L);
        if (tr.enter.equals("_")  && !tr.track.contains(name) && laps != 0) {
            tr.enter = name;
            sleep(100L);

        }
        else {
            sleep(500);}


        if (tr.enter.equals(name) && tr.track.get(15).equals("_")){
            tr.track.set(15, name);
            sleep(500L);
            tr.enter = "_";
        }
        else {sleep(300);}

        if ((tr.track.get(12)).equals(name)) {
            --laps;

            if (laps == 0) {
                tr.exit = name;
                tr.track.set(12, "_");
                sleep(500L);
                tr.exit = "_";
                index=0;
                return;
            }
        }

        int check2;
        if ( index >=16) {
            check2 = 0;
        } else {
            check2 = index;
        }

        if ((tr.track.get(check2)).equals("_")) {
            tr.track.set(check2, name);
            if (check2 == 0) {
                tr.track.set(15, "_");
            } else {
                tr.track.set(check2 - 1, "_");
            }

            ++index;
            if (index == tr.track.size()) {
                index = 0;
            }
        }

    }

    public String getSkaterName() {
        return name;
    }

    public int getLaps() {
        return laps;
    }

    public void setLaps(int l) {
        laps = l;
    }
}

