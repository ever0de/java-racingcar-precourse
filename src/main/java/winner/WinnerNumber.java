package winner;

public class WinnerNumber {

    private Integer number = 0;

    public boolean isBiggerThanWinnerNumber(Integer number) {
        return this.number < number;
    }

    public void swapWinnerNumber(Integer number) {
        this.number = number;
    }

    public Integer getWinnerNumber() {
        return number;
    }
}
