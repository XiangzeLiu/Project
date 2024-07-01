package P_C;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //输入两副手牌信息
        Scanner in = new Scanner(System.in);

        String[] hand_1 = in.nextLine().split(" ");

        String[] hand_2 = in.nextLine().split(" ");

        //生成并管理player
        ArrayList<Player> playerArrayList = new ArrayList<>();
        Player player1 = new Player("name1");
        Player player2 = new Player("name2");
        playerArrayList.add(player1);
        playerArrayList.add(player2);

        //生成两幅hand
        Hand hand1 = new Hand(hand_1);
        Hand hand2 = new Hand(hand_2);
        player1.setHand(hand1);
        player2.setHand(hand2);

        //比较hand大小
        WinnerDecider winnerDecider = new WinnerDecider();
        GameResult gameResult = winnerDecider.getWinner(playerArrayList);


        //输出比较结果
        System.out.println(gameResult);

    }
}