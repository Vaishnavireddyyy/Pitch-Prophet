public class Team {
    private String teamName;
    private String strength; // weak, average, strong

    public Team(String teamName, String strength) {
        this.teamName = teamName;
        this.strength = strength;
    }

    public int getTeamFactor() {
        switch (strength.toLowerCase()) {
            case "strong":
                return 50;
            case "average":
                return 30;
            case "weak":
                return 10;
            default:
                return 20;
        }
    }

    public String getTeamName() {
        return teamName;
    }

    public String getStrength() {
        return strength;
    }
}
