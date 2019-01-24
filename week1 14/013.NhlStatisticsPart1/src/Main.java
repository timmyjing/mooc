
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        System.out.println("Top ten by goal");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        System.out.println("Top 25 by penalty amounts");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        System.out.println("Sidney Crosby's stats");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        System.out.println("Stats for the Philadelphia Flyers");
        NHLStatistics.teamStatistics("PHI");
        NHLStatistics.sortByPoints();
        System.out.println("Stats for Anaheim Ducks");
        NHLStatistics.teamStatistics("ANA");
    }
}
