
import java.util.Random;

public class AllotHostel {

    static void allotRooms(String[] male, String[] female) {

        String[][] rooms = new String[10][2];
        Random random = new Random();

        // Shuffle male students
        for (int i = male.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);

            String temp = male[i];
            male[i] = male[j];
            male[j] = temp;
        }

        // Shuffle female students
        for (int i = female.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);

            String temp = female[i];
            female[i] = female[j];
            female[j] = temp;
        }

        int roomNo = 0;

        // Allot 5 rooms to 10 male students
        for (int i = 0; i < 10; i += 2) {
            rooms[roomNo][0] = male[i];
            rooms[roomNo][1] = male[i + 1];
            roomNo++;
        }

        // Allot 5 rooms to 10 female students
        for (int i = 0; i < 10; i += 2) {
            rooms[roomNo][0] = female[i];
            rooms[roomNo][1] = female[i + 1];
            roomNo++;
        }

        System.out.println("Room Allotment Students");

        for (int i = 0; i < 10; i++) {
            System.out.println(
                "Room " + (i + 1) + " : "
                + rooms[i][0] + " , "
                + rooms[i][1]
            );
        }

        System.out.println("\nLeft Out Students");
        System.out.println(male[10] + " (Male)");
    }

    public static void main(String[] args) {

        String[] male = {
            "Vikash", "Anirudh", "Aditya", "OM", "Arjun",
            "Rahul", "Kartikey", "Rohit", "Aman", "Ishaan",
            "Kishan"
        };

        String[] female = {
            "Ananya", "Neha", "Isha", "Meera", "Nisha",
            "Pooja", "Riya", "Sneha", "Laxmi", "Zara"
        };

        allotRooms(male, female);
    }
}
