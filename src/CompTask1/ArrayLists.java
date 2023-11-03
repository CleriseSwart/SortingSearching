package CompTask1;

import java.util.ArrayList;
import java.util.Collections;

class Album {
    private String albumName;
    private int numberOfSongs;
    private String albumArtist;

    public Album(String albumName, int numberOfSongs, String albumArtist) {
        this.albumName = albumName;
        this.numberOfSongs = numberOfSongs;
        this.albumArtist = albumArtist;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public int getNumberOfSongs() {
        return numberOfSongs;
    }

    public void setNumberOfSongs(int numberOfSongs) {
        this.numberOfSongs = numberOfSongs;
    }

    public String getAlbumArtist() {
        return albumArtist;
    }

    public void setAlbumArtist(String albumArtist) {
        this.albumArtist = albumArtist;
    }

    @Override
    public String toString() {
        return "(" + albumName + ", " + albumArtist + ", " + numberOfSongs + ")";
    }
}

public class ArrayLists {
    public static void main(String[] args) {
        // Create albums1 and add 5 albums
        ArrayList<Album> albums1 = new ArrayList<>();
        albums1.add(new Album("Thriller", 10, "Michael Jackson"));
        albums1.add(new Album("A Night at the Opera", 8, "Queen "));
        albums1.add(new Album("Back in Black", 12, "ACDC"));
        albums1.add(new Album("Supernatural", 7, "Santana "));
        albums1.add(new Album("Synchronicity", 9, "The Police"));

        System.out.println("Albums1:");
        System.out.println(albums1);

        // Sort albums1 by numberOfSongs
        Collections.sort(albums1, (a1, a2) -> Integer.compare(a1.getNumberOfSongs(), a2.getNumberOfSongs()));

        System.out.println("\nAlbums1 (sorted by numberOfSongs):");
        System.out.println(albums1);

        // Swap elements at position 1 and 2
        Collections.swap(albums1, 1, 2);

        System.out.println("\nAlbums1 (after swapping elements):");
        System.out.println(albums1);

        // Create albums2 and add 5 albums
        ArrayList<Album> albums2 = new ArrayList<>();
        albums2.addAll(albums1);

        System.out.println("\nalbums2:");
        System.out.println(albums2);

        // Copy all albums from albums1 to albums2
        albums2.addAll(albums1);

        // Add two more albums to albums2
        albums2.add(new Album("Dark Side of the Moon", 9, "Pink Floyd"));
        albums2.add(new Album("Oops!... I Did It Again", 16, "Britney Spears"));

        // Sort albums2 by album name
        Collections.sort(albums2, (a1, a2) -> a1.getAlbumName().compareTo(a2.getAlbumName()));

        System.out.println("\nalbums2 (sorted by album name):");
        System.out.println(albums2);

        // Search for "Dark Side of the Moon" in albums2
        String searchAlbum = "Dark Side of the Moon";
        int index = -1;
        for (int i = 0; i < albums2.size(); i++) {
            if (albums2.get(i).getAlbumName().equals(searchAlbum)) {
                index = i;
                break;
            }
        }

        System.out.println("\nIndex of \"" + searchAlbum + "\" in "
        		+ ": " + index);
    }
}
