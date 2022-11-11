import java.util.Scanner;

public class GameLauncher {
    ListOfQuestions list = new ListOfQuestions();
    Scanner scanner = new Scanner(System.in);
    int userWining = 0;

    public void run() {
        String userAnswer;
        list.run();
        while (true) {
            System.out.println("Welcome. I want to play a game with you. Are you ready? Let's get it started");
            System.out.println(list.questions[0].question + "\n"
                    + list.questions[0].firstOption + "\n" + list.questions[0].secondOption + "\n" + list.questions[0].thirdOption);
            userAnswer = scanner.nextLine();
            if (userAnswer.equals(list.questions[0].firstOption)) {
                userWining += 1000;
                System.out.println("Правильно. Ваш выигрыш составляет " + userWining + " долларов");
                System.out.println(list.questions[1].question + "\n"
                        + list.questions[1].firstOption + "\n" + list.questions[1].secondOption + "\n" + list.questions[1].thirdOption);
                userAnswer = scanner.nextLine();
                if (userAnswer.equals(list.questions[1].secondOption)) {
                    userWining += 5000;
                    System.out.println("Правильно. Ваш выигрыш составляет " + userWining + " долларов");
                    System.out.println(list.questions[2].question + "\n"
                            + list.questions[2].firstOption + "\n" + list.questions[2].secondOption + "\n" + list.questions[2].thirdOption);
                    userAnswer = scanner.nextLine();
                    if (userAnswer.equals(list.questions[2].secondOption)) {
                        userWining += 10000;
                        System.out.println("Правильно. Ваш выигрыш составляет " + userWining + " долларов");
                        System.out.println(list.questions[3].question + "\n"
                                + list.questions[3].firstOption + "\n" + list.questions[3].secondOption + "\n" + list.questions[3].thirdOption);
                        userAnswer = scanner.nextLine();
                        if (userAnswer.equals(list.questions[3].firstOption)) {
                            userWining += 15000;
                            System.out.println("Правильно. Ваш выигрыш составляет " + userWining + " долларов");
                            System.out.println(list.questions[4].question + "\n"
                                    + list.questions[4].firstOption + "\n" + list.questions[4].secondOption + "\n" + list.questions[4].thirdOption);
                            userAnswer = scanner.nextLine();
                            if (userAnswer.equals(list.questions[4].thirdOption)) {
                                userWining += 20000;
                                System.out.println("Вы выиграли. Ваш выигрыш составляет " + userWining + " долларов");
                                break;
                            } else {
                                System.out.println("Вы проиграли");
                                break;
                            }
                        } else {
                            System.out.println("Вы проиграли");
                            break;
                        }
                    } else {
                        System.out.println("Вы проиграли");
                        break;
                    }
                } else {
                    System.out.println("Вы проиграли");
                    break;
                }
            } else {
                System.out.println("Вы проиграли");
                break;
            }
        }
    }
}
