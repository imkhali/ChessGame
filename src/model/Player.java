package model;

public class Player {
    private final String email;
    private String name;
    private int score;

    public Player(String email, String name) {
        this.email = email;
        this.name = name;
        this.score = 0;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
