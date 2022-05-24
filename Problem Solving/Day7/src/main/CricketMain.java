package main;

import beans.Cricket;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//Using cricket, declare an array player with 10 elements and write a program to read the information	about
//        all the 10 players and
//        print a team wise list containing names of players with their battingAverage.

public class CricketMain {
    private static Object String;

    public static void main(String[] args)
    {
        ArrayList<Cricket> players = new ArrayList<Cricket>(10);
        Cricket cricket = new Cricket("priya "," IPL" , 23);
        Cricket cricket2 = new Cricket("priya2 "," IPL2" ,26);
        Cricket cricket3 = new Cricket("priya2 "," IPL2" ,26);
        Cricket cricket4 = new Cricket("priya3 "," IPL2" ,26);
        Cricket cricket5 = new Cricket("priya4 "," IPL2" ,26);
        Cricket cricket6 = new Cricket("priya4 "," IPL2" ,26);
        Cricket cricket7 = new Cricket("priya4 "," IPL2" ,26);
        Cricket cricket8 = new Cricket("priya4 "," IPL2" ,26);
        Cricket cricket9 = new Cricket("priya4 "," IPL2" ,26);
        Cricket cricket10 = new Cricket("priya4 "," IPL2" ,26);

        Scanner scanner = new Scanner(System.in);

        players.add(cricket);
        players.add(cricket2);
        players.add(cricket3);
        players.add(cricket4);
        players.add(cricket5);
        players.add(cricket6);
        players.add(cricket7);
        players.add(cricket8);
        players.add(cricket9);
        players.add(cricket10);

        /*for (int i =0 ;i<10;i++){
            System.out.println("Enter batting average  =");
            int next = scanner.nextInt();
            cricket.setBattingAverage(next);

            System.out.println("Enter Player name");
            String s = scanner.next();
            cricket.setPlayerName(s);

            System.out.println("Enter team -name");
            String s1 = scanner.next();
            cricket.setTeamName(s1);

            System.out.println("=================================");
        }*/



        for (int i=0 ;i<10;i++){

            System.out.println("Average = " +cricket.getBattingAverage());
            System.out.println("Player Name = " +cricket.getPlayerName());
            System.out.println("Team Name = " +cricket.getTeamName());
        }
        // using get() method
        //print all info
        for (int i=0 ;i<5;i++) {
            if (players.get(i).getTeamName() != null) {
                String teamName = players.get(i).getTeamName();
                System.out.println("=============="+teamName+"===========");
                System.out.println(players.get(i).getPlayerName() + players.get(i).getBattingAverage() + players.get(i).getTeamName());

            }
        }

        //specific team wise list containing names of players with their battingAverage.

            for (int i =0 ;i<10;i++){
                String teamName = players.get(i).getTeamName();
                String playerName = players.get(i).getPlayerName();
                int battingAverage = players.get(i).getBattingAverage();
                String strBattingAverage = Integer.toString(battingAverage);
//                System.out.println("str"+strBattingAverage);
                List<String> playersList = new ArrayList<>();
                List<List<String>> teamNameList = new ArrayList<>();

                //single list for teamname
                playersList.add(teamName);
                teamNameList.add(Collections.singletonList(teamName));

                //adding element in 2nd list
                playersList.add(playerName);
                playersList.add(strBattingAverage);

                System.out.println("===="+playersList+"=======");
                //adding list into list
                teamNameList.add(playersList);
                System.out.println(teamNameList);




        }



    }
}
