package org.dimigo.oop;

public class GameTest {
    public static void main(String[] args) {
        MediaPlayer mp = MediaPlayer.getInstance();
        System.out.println(mp.getVolume());

        new Player().Setvolume();
        System.out.println(mp.getVolume());

        new Enemy().Setvolume();
        System.out.println(mp.getVolume());
    }
}
