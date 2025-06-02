import java.util.*;

public class Playlist {
  public static void main(String[] args){
    // initializing an array of 10 strings (songs) called favoriteSongs
    String[] favoriteSongs = {
      "Beyonce - Love on Top",
      "Beyonce - Drunk in Love",
      "Beyonce - Crazy in Love",
      "Beyonce - Dangerously in Love",
      "Beyonce - Party",
      "Beyonce - Blackbird",
      "Beyonce - My House",
      "Beyonce - Savage",
      "Beyonce - Bodyguard",
      "Beyonce - Green Light"
    };

    // print the first 3 elements of favoriteSongs
    System.out.println("First song from favoriteSongs is: " + favoriteSongs[0]);
    System.out.println("Second song from favoriteSongs is: " + favoriteSongs[1]);
    System.out.println("Third song from favoriteSongs is: " + favoriteSongs[2]);

    // create a desertIslandPlaylist ArrayList
    ArrayList<String> desertIslandPlaylist = new ArrayList<>();

    // add 5 songs to desertIslandPlaylist
    desertIslandPlaylist.add("Andre Nickatina - Ayo for Yayo");
    desertIslandPlaylist.add("Drake - Nokia");
    desertIslandPlaylist.add("Princess Nokia - Green Line");
    desertIslandPlaylist.add("Rico Nasty - Smack a Bitch");
    desertIslandPlaylist.add("bbymutha - Freestyle");

    // print desertIslandPlaylist
    System.out.println("Desert Island Playlist: " + desertIslandPlaylist);

    // convert favoriteSongs array into arraylist
    List<String> list = Arrays.asList(favoriteSongs);

    // add all songs from favoriteSongs to desertIslandPlaylist
    desertIslandPlaylist.addAll(list);

    // check the desertIslandPlaylist size; should be 15
    System.out.println(desertIslandPlaylist.size());

    // keep only top 5 songs on desertIslandPlaylist
    desertIslandPlaylist.remove("Beyonce - Blackbird");
    desertIslandPlaylist.remove(3);
    desertIslandPlaylist.remove("Beyonce - My House");
    desertIslandPlaylist.remove("Beyonce - Savage");
    desertIslandPlaylist.remove("Beyonce - Love on Top");
    desertIslandPlaylist.remove("Beyonce - Dangerously in Love");
    desertIslandPlaylist.remove("Beyonce - Crazy in Love");
    desertIslandPlaylist.remove("Beyonce - Drunk in Love");
    desertIslandPlaylist.remove(2);
    desertIslandPlaylist.remove(desertIslandPlaylist.size() - 1);

    // System.out.println(desertIslandPlaylist);

    // check size of desertIslandPlaylist
    System.out.println(desertIslandPlaylist.size());

    // swap 2 songs
    // find the index of both songs to swap
    int index1 = desertIslandPlaylist.indexOf("Andre Nickatina - Ayo for Yayo");
    int index2 = desertIslandPlaylist.indexOf("Beyonce - Party");

    // create temp variable for first song to swap
    String tempA = desertIslandPlaylist.get(index1);

    // swap first song
    // insert tempA song into song B spot
    desertIslandPlaylist.set(index2, tempA);
    //System.out.println(desertIslandPlaylist);

    // swap second song
    // insert second song into first song's index
    desertIslandPlaylist.set(index1, "Beyonce - Party");
    System.out.println(desertIslandPlaylist);

  }
}