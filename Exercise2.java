// Exercise 2 (Hard)
// Same as Exercise 1 but the songs must be output in alphabetical order.
// Hint: bubble sort. String.compareTo() tells which word comes first.
public class Exercise2 {

    public static void main(String[] args) {

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

        // ---------------- bubble sort ----------------
        // outer loop: how many passes (n-1 passes are enough)
        for (int i = 0; i < songs.length - 1; i++) {

            // inner loop: compare two neighbours start from the front
            for (int j = 0; j < songs.length - 1 - i; j++) {

                // compareTo() returns a negative number when songs[j] comes first
                // alphabetically, so a positive number means the order is wrong
                if (songs[j].compareTo(songs[j + 1]) > 0) {

                    // swap the songs
                    String tempSong = songs[j];
                    songs[j] = songs[j + 1];
                    songs[j + 1] = tempSong;

                    // IMPORTANT: the artist must move together with the song
                    String tempArtist = artists[j];
                    artists[j] = artists[j + 1];
                    artists[j + 1] = tempArtist;
                }
            }
        }

        System.out.println("My 10 favourite songs (alphabetical order):");
        System.out.println("--------------------------------------------");

        for (int i = 0; i < songs.length; i++) {
            System.out.println((i + 1) + ". " + songs[i] + " - " + artists[i]);
        }
    }
}
