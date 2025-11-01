public class ScorePredictor {
    private Pitch pitch;
    private Team team;
    private String matchFormat; // ODI, T20, Test

    public ScorePredictor(Pitch pitch, Team team, String matchFormat) {
        this.pitch = pitch;
        this.team = team;
        this.matchFormat = matchFormat;
    }

    public String predictScore() {
        int baseScore;

        switch (matchFormat.toLowerCase()) {
            case "t20":
                baseScore = 150;
                break;
            case "odi":
                baseScore = 250;
                break;
            case "test":
                baseScore = 300;
                break;
            default:
                baseScore = 200;
                break;
        }

        int pitchFactor = pitch.getPitchRating();
        int teamFactor = team.getTeamFactor();

        // total predicted score
        int predicted = baseScore + pitchFactor + teamFactor;

        // give a range instead of one number
        int low = predicted - 15;
        int high = predicted + 15;

        return "Predicted Score Range: " + low + " - " + high + " runs";
    }
}
