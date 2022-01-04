package ss8_clean_code_refactoring.bai_tap;

public class TennisGame implements InterfaceTennisGame {
    private int player1_score = 0;
    private int player2_score = 0;
    private String player1Name;
    private String player2Name;
    private boolean isEqualScore = player1_score == player2_score;
    private boolean isGreaterThan4 = player1_score >= 4 || player2_score >= 4;

    public TennisGame(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (playerName == "player1")
            player1_score += 1;
        else
            player2_score += 1;
    }

    private String displayResult() {
        String score = "";
        int minusResult = player1_score - player2_score;
        if (minusResult == 1) score = "Advantage player1";
        else if (minusResult == -1) score = "Advantage player2";
        else if (minusResult >= 2) score = "Win for player1";
        else score = "Win for player2";
        return score;
    }

    private String displayScore() {
        String score = "";
        int tempScore = 0;
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = player1_score;
            else {
                score += "-";
                tempScore = player2_score;
            }
            switch (tempScore) {
                case 0:
                    score += "Love";
                    break;
                case 1:
                    score += "Fifteen";
                    break;
                case 2:
                    score += "Thirty";
                    break;
                case 3:
                    score += "Forty";
                    break;
            }
        }
        return score;
    }

    public String getScore() {
        String score = "";
        if (isEqualScore) {
            switch (player1_score) {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        } else if (isGreaterThan4) {
            displayResult();
        } else {
            displayScore();
        }
        return score;
    }
}
