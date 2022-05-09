package pakiecik;

import java.util.ArrayList;

public class Track {

    public ArrayList track = new ArrayList();
    public String enter = "_";
    public String exit = "_";


    public void CreateTrack() {

        for(int i = 0; i < 16; ++i) {
            track.add("_");
        }
    }

    public void ShowTrack() {

        System.out.println(" v" + enter + "    ^" + exit);
        System.out.println(track.get(0)+ " "+ track.get(15)+" " + track.get(14)+" " + track.get(13)+" " + track.get(12)+" " + track.get(11));
        System.out.println(track.get(1) + "         " + track.get(10));
        System.out.println(track.get(2) + "         " + track.get(9));
        System.out.println(track.get(3) +" "+ track.get(4)+" " + track.get(5)+" " + track.get(6)+" " + track.get(7)+" " + track.get(8)+"\n\n");
    }
}

