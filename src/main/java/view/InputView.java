package view;

import java.util.Scanner;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);

    public static String inputPlayers(){
        System.out.println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)");
        return scanner.nextLine();
    }

    public static String inputResults(){
        System.out.println("\n"+"실행 결과를 입력하세요. (결과는 쉼표(,)로 구분하세요)");
        return scanner.nextLine();
    }

    public static Integer inputLadderHeight(){
        System.out.println("\n"+"최대 사다리 높이는 몇 개인가요?");
        return Integer.parseInt(scanner.nextLine());
    }

    public static String inputPlayerToWantResult(){
        System.out.println("\n"+"결과를 보고 싶은 사람은?");
        return scanner.nextLine();
    }
}
