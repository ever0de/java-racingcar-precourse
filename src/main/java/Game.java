import racing.CarList;
import racing.CarNameList;
import racing.RoundNumber;
import winner.Winner;

import java.util.*;

public class Game {

    private static final String INPUT_NAME_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String INPUT_ROUND_NUMBER_MESSAGE = "시도할 회수는 몇회인가요?";
    private static final String SPLIT_REGEX = ",";
    private static final Scanner scanner = new Scanner(System.in);

    private final Winner winner = new Winner();
    private final CarNameList nameList = new CarNameList();
    private CarList carList;
    private RoundNumber roundNumber;

    public Game() {
        inputNameList();
        initializedCarList();
        inputRoundNumber();
    }

    public void start() {
        int number = roundNumber.getRoundNumber();
        for (int index = 0; index < number; index++) {
            carList.moveCars(winner);
            carList.printResult();
        }
    }

    public void printWinners() {
        winner.printWinners(carList);
    }

    public void inputNameList() {
        System.out.println(INPUT_NAME_MESSAGE);
        String nameListString = scanner.nextLine();
        for (String name : nameListString.split(SPLIT_REGEX)) {
            nameList.add(name);
        }
    }

    public void initializedCarList() {
        carList = nameList.toCarList();
    }

    public void inputRoundNumber() {
        System.out.println(INPUT_ROUND_NUMBER_MESSAGE);
        int number = scanner.nextInt();
        roundNumber = new RoundNumber(number);
    }
}