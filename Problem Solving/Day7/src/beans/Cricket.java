package beans;

public class Cricket {

   String playerName;
   String teamName;
   int  BattingAverage;


    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;

    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getBattingAverage() {
        return BattingAverage;
    }

    public void setBattingAverage(int battingAverage) {
        BattingAverage = battingAverage;

    }

    public Cricket(String playerName, String teamName, int battingAverage) {
        this.playerName = playerName;
        this.teamName = teamName;
        BattingAverage = battingAverage;
    }
}
