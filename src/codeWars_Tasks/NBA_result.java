package codeWars_Tasks;
import java.util.*;

public class NBA_result {

    public static String NBA(String resultSheet, String to_find){
        if (to_find.equals(""))
        { 
          return "";
        }
        String[] teams = new String[]{"Los Angeles Clippers", "Dallas Mavericks", "New York Knicks", "Atlanta Hawks", "Indiana Pacers", "Memphis Grizzlies",
                "Los Angeles Lakers", "Minnesota Timberwolves", "Phoenix Suns", "Portland Trail Blazers", "New Orleans Pelicans",
                "Sacramento Kings", "Los Angeles Clippers", "Houston Rockets", "Denver Nuggets", "Cleveland Cavaliers", "Milwaukee Bucks",
                "Oklahoma City Thunder", "San Antonio Spurs", "Boston Celtics", "Philadelphia 76ers", "Brooklyn Nets", "Chicago Bulls",
                "Detroit Pistons", "Utah Jazz", "Miami Heat", "Charlotte Hornets", "Toronto Raptors", "Orlando Magic", "Washington Wizards",
                "Golden State Warriors"};

        if (!Arrays.asList(teams).contains(to_find))
        {
          return to_find + ":This team did not play! ";
        }

        String[] pairs = resultSheet.split(",");
        int matches = 0;
        int draws = 0;
        int loses = 0;
        int scored = 0;
        int conceded = 0;
        int points = 0;
        for (String s : pairs) {
            if (s.contains(".")) 
            {
            	return "Error(float number):" + s;
            }
            if (s.contains(to_find))
            {
                int first = Integer.parseInt(s.substring(0, s.length() - 10).replaceAll("[\\D]", ""));
                String reverse = new StringBuilder(s).reverse().toString();
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < reverse.length(); i++) {
                    if (Character.isDigit(reverse.charAt(i))) {
                        sb.insert(i, reverse.charAt(i));
                    } else {
                        break;
                    }
                }
                int second = Integer.parseInt(sb.reverse().toString());

                if (s.contains(to_find + " " + first))
                {
                    scored += first;
                    conceded += second;
                    if (first > second)
                    {
                        points += 3;
                        matches++;
                    }
                    if (first == second) {
                        points += 1;
                        draws++;
                    }
                    if (first < second) {
                        loses++;
                    }
                }
                if (s.contains(to_find + " " + second))
                   {
                    scored += second;
                    conceded += first;
                    if (second > first)
                    {
                        points += 3;
                        matches++;
                    }
                    if (first == second)
                    {
                        points += 1;
                        draws++;
                    }
                    if (second < first)
                    {
                        loses++;
                    }
                }
            }
        }

        return to_find + ":W=" + matches + ";D=" + draws + ";L=" + loses + ";Scored=" + scored + ";Conceded=" + conceded + ";Points=" + points;
    }

public static void main(String[] args) {
	String resultSheet = "Los Angeles Clippers 104 Dallas Mavericks 88,New York Knicks 101 Atlanta Hawks 112,Indiana Pacers 103 Memphis Grizzlies 112,"
            + "Los Angeles Lakers 111 Minnesota Timberwolves 112,Phoenix Suns 95 Dallas Mavericks 111,Portland Trail Blazers 112 New Orleans Pelicans 94,"
            + "Sacramento Kings 104 Los Angeles Clippers 111,Houston Rockets 85 Denver Nuggets 105,Memphis Grizzlies 76 Cleveland Cavaliers 106,"
            + "Milwaukee Bucks 97 New York Knicks 122,Oklahoma City Thunder 112 San Antonio Spurs 106,Boston Celtics 112 Philadelphia 76ers 95,"
            + "Brooklyn Nets 100 Chicago Bulls 115,Detroit Pistons 92 Utah Jazz 87,Miami Heat 104 Charlotte Hornets 94,"
            + "Toronto Raptors 106 Indiana Pacers 99,Orlando Magic 87 Washington Wizards 88,Golden State Warriors 111 New Orleans Pelicans 95,"
            + "Atlanta Hawks 94 Detroit Pistons 106,Chicago Bulls 97 Cleveland Cavaliers 95,";
	
	
	
	System.out.println(NBA(resultSheet, "Boston Celtics"));
	System.out.println(NBA(resultSheet,"Boston Celt"));
}

	
}