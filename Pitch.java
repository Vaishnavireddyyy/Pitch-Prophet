public class Pitch {
    private String pitchType;
    private String venue;
    private String weather;

    public Pitch(String pitchType, String venue, String weather) {
        this.pitchType = pitchType;
        this.venue = venue;
        this.weather = weather;
    }

    public int getPitchRating() {
        int rating = 0;
        // basic pitch effect
        switch (pitchType.toLowerCase()) {
            case "flat":
                rating += 50;
                break;
            case "green":
                rating += 10;
                break;
            case "dusty":
                rating += 25;
                break;
            default:
                rating += 20;
                break;
        }
        // weather effect with smaller weight
        switch (weather.toLowerCase()) {
            case "sunny":
                rating += 10;
                break;
            case "cloudy":
                rating -= 5; // small penalty only
                break;
            case "damp":
                rating -= 10;
                break;
            default:
                rating += 0;
                break;
        }
        return rating;
    }

    public String getPitchType() {
        return pitchType;
    }

    public String getVenue() {
        return venue;
    }

    public String getWeather() {
        return weather;
    }
}
