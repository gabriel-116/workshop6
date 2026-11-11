// Exercise 1 (Easy)
// Store 10 favourite songs in one String array and the artists in a second String array,
// then output the list of songs and artists.
public class Exercise1 {

    public static void main(String[] args) {

        // 10 songs, each one is a String
        String[] songs = {
                "Bohemian Rhapsody",
                "Shape of You",
                "Blinding Lights",
                "Rolling in the Deep",
                "Hotel California",
                "Yellow",
                "Bad Guy",
                "Counting Stars",
                "Fix You",
                "Someone Like You"
        };

        // the artist of each song, the index must match the song array
        String[] artists = {
                "Queen",
                "Ed Sheeran",
                "The Weeknd",
                "Adele",
                "Eagles",
                "Coldplay",
                "Billie Eilish",
                "OneRepublic",
                "Coldplay",
                "Adele"
        };

        System.out.println("My 10 favourite songs:");
        System.out.println("----------------------");

        // loop through both arrays at the same time
        for (int i = 0; i < songs.length; i++) {
            System.out.println((i + 1) + ". " + songs[i] + " - " + artists[i]);
        }
    }
}
