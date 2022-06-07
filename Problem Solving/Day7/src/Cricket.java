import javafx.scene.Parent;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Q1.	Define a structure called cricket that will describe the following information
//Player name
//Team name
//Batting average
//Using cricket, declare an array player with 10 elements and write a program to read the information
// about all the 10 players and print a team wise list containing names of players with their battingaverage.
/*public class Cricket {
    static String playerName;
    static String teamName = "IPL";
    static int[] battingAvg = {23,45,56,34,2,3,2,2,1,233};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String[] playerName = new String[10];
        String[] playerName = {"SACHIN", "VIRAT", "YUSUF", "SURAJ", "HARI", "NARAYNA", "PRIYA", "SONI", "SOFIA", "TATYA"};

        List<String> mylist = Arrays.asList(playerName);
        List<int[]> battingavg = Arrays.asList(battingAvg);
        //print the list
        System.out.println("Immutable list:");
        for(String val : mylist){
            System.out.print(val + " " );
        }
        System.out.println();
        for (int[] bat : battingavg){
            System.out.print(Arrays.toString(bat) + " " );
        }

        List<String> newList1 = Stream.of(playerName,battingAvg )
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        List<?> newList =
                Stream.of(playerName, battingAvg).flatMap(List::stream).collect(Collectors.toList());
        System.out.println("\n");

        List<Parent> result = Stream.concat(playerName.stream(), battingAvg.stream())
                .distinct()
                .collect(Collectors.toList());

        if (teamName == "IPL") {
            for (int i = 0,j=0; i < playerName.length; i++ ,j++) {
//                System.out.println(playerName[i] + " ");
                System.out.println();

//                System.out.println(playerName[i] + " = "+battingAvg[j]);
//                System.out.println("=====================================");
            }



        }
    }
}


//java does not support struture and union complex data type
//you can achieve the same effect simply by declaring a class with the appropriate instance variables

*/