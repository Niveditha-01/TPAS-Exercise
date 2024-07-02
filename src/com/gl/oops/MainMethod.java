package com.gl.oops;

public class MainMethod {
	    
  public static void main(String[] args) {
    MusicLibrary library = new MusicLibrary();

    library.addSong(new Song("Raktha Sambandhagala", "YY"));
    library.addSong(new Song("Jolly Days", "Karthik"));
    library.addSong(new Song("Malleyalli Jotheyalli", "Menon"));

    System.out.println("All songs:");
    for (Song song : library.getSongs()) {
        System.out.println(song.getTitle() + " by " + song.getArtist());
    }

    System.out.println("\n*Playing Random Song*");
    library.playRandomSong();
    System.out.println();
    library.playRandomSong();
    System.out.println();
    library.playRandomSong();
}
}