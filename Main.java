import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Welcome to Pitch Prophet =====");
        System.out.println();

        // Read match format
        System.out.print("Enter match format (T20 / ODI / Test): ");
        String matchFormat = sc.nextLine();

        // Read pitch details
        System.out.print("Enter pitch type (Flat / Green / Dusty): ");
        String pitchType = sc.nextLine();

        System.out.print("Enter venue name: ");
        String venue = sc.nextLine();

        System.out.print("Enter weather (Sunny / Cloudy / Damp): ");
        String weather = sc.nextLine();

        // Read team details
        System.out.print("Enter team name: ");
        String teamName = sc.nextLine();

        System.out.print("Enter team strength (Strong / Average / Weak): ");
        String strength = sc.nextLine();

        // Create objects
        Pitch pitch = new Pitch(pitchType, venue, weather);
        Team team = new Team(teamName, strength);

        // Create predictor
        ScorePredictor predictor = new ScorePredictor(pitch, team, matchFormat);

        // Predict and display score
        String prediction = predictor.predictScore();
        System.out.println();
        System.out.println("===== RESULT =====");
        // System.out.println("Match Format: " + matchFormat);
        // System.out.println("Team: " + teamName + " (" + strength + ")");
        // System.out.println("Pitch: " + pitchType + ", Weather: " + weather + ", Venue: " + venue);
        System.out.println(prediction);

        sc.close();
    }
}
