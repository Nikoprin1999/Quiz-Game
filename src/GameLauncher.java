import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.util.Scanner;

public class GameLauncher {
    ListOfQuestions list = new ListOfQuestions();
    Scanner scanner = new Scanner(System.in);
    int userWining = 0;

    public void run() {
        String userAnswer;
        list.run();
        while (true) {
            JOptionPane.showMessageDialog(null, "<html><center>Привет, я хочу сыграть с тобой в игру. Нажми ОК чтобы продолжить");
            userAnswer = JOptionPane.showInputDialog(list.questions[0].question + "\n"
                    + list.questions[0].firstOption + "\n" + list.questions[0].secondOption + "\n" + list.questions[0].thirdOption);
            if (userAnswer.equals(list.questions[0].firstOption)) {
                userWining += 1000;
                JOptionPane.showMessageDialog(null, "Правильно. Ваш выигрыш составляет " + userWining + " долларов");
                userAnswer = JOptionPane.showInputDialog(list.questions[1].question + "\n"
                        + list.questions[1].firstOption + "\n" + list.questions[1].secondOption + "\n" + list.questions[1].thirdOption);
                if (userAnswer.equals(list.questions[1].secondOption)) {
                    userWining += 5000;
                    JOptionPane.showMessageDialog(null, "Правильно. Ваш выигрыш составляет " + userWining + " долларов");
                    userAnswer = JOptionPane.showInputDialog(list.questions[2].question + "\n"
                            + list.questions[2].firstOption + "\n" + list.questions[2].secondOption + "\n" + list.questions[2].thirdOption);
                    if (userAnswer.equals(list.questions[2].secondOption)) {
                        userWining += 10000;
                        JOptionPane.showMessageDialog(null, "Правильно. Ваш выигрыш составляет " + userWining + " долларов");
                        userAnswer = JOptionPane.showInputDialog(list.questions[3].question + "\n"
                                + list.questions[3].firstOption + "\n" + list.questions[3].secondOption + "\n" + list.questions[3].thirdOption);
                        if (userAnswer.equals(list.questions[3].firstOption)) {
                            userWining += 15000;
                            JOptionPane.showMessageDialog(null, "Правильно. Ваш выигрыш составляет " + userWining + " долларов");
                            userAnswer = JOptionPane.showInputDialog(list.questions[4].question + "\n"
                                    + list.questions[4].firstOption + "\n" + list.questions[4].secondOption + "\n" + list.questions[4].thirdOption);
                            if (userAnswer.equals(list.questions[4].thirdOption)) {
                                userWining += 20000;
                                JOptionPane.showMessageDialog(null, "Вы выиграли. Ваш выигрыш составляет " + userWining + " долларов");
                                break;
                            } else {
                                JOptionPane.showMessageDialog(null, "Вы проиграли");
                                break;
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Вы проиграли");
                            break;
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Вы проиграли");
                        break;
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Вы проиграли");
                    break;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Вы проиграли");
                break;
            }
        }
    }
}
