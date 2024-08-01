package Operators;

/*
You are developing a system to help the staff of a football/soccer club's website report on matches.
Data is received from various sources and piped into a single stream after being cleaned up.
 */

public class FootballMatchReports {

    public static String onField(int shirtNum) {
        return switch (shirtNum) {
            case 1 ->  "goalie";
            case 2 -> "left back";
            case 3, 4 -> "center back";
            case 5 -> "right back";
            case 6, 7, 8 -> "midfielder";
            case 9 -> "left wing";
            case 10 -> "striker";
            case 11 -> "right wing";
            default -> throw new IllegalArgumentException();
        };
    }
}
