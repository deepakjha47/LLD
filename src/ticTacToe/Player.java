package ticTacToe;

public class Player {

    public String name;
    public PlayingPeice playingPeice;

    public String getName() {
        return name;
    }

    public Player(String name, PlayingPeice playingPeice) {
        this.name = name;
        this.playingPeice = playingPeice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayingPeice getPlayingPeice() {
        return playingPeice;
    }

    public void setPlayingPeice(PlayingPeice playingPeice) {
        this.playingPeice = playingPeice;
    }
}
