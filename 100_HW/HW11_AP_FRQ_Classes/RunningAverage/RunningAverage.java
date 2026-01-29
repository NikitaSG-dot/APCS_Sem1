import java.util.*;

public class RunningAverage{
    /** The number of ratings included in the running average. */
    private int count;

    /** The average of the ratings that have been entered. */
    private double average;

    // There are no other instance variables.

    /** Creates a RunningAverage object.
    * Postcondition: count is initialized to 0 and average is
    * initialized to 0.0.
    */
    public RunningAverage(){
        count = 0;
        average = 0.0;
    }

    /** Updates the running average to reflect the entry of a new
    * rating, as described in part (a).
    */
    public void updateAverage(double newVal){
        double total = 0.0;
        total = count*average;
        total = (total+newVal)/(count+1);
        System.out.println(total);
    }


    /** Processes num new ratings by considering them for inclusion
    * in the running average and updating the running average as
    * necessary. Returns an integer that represents the number of
    * invalid ratings, as described in part (b).
    * Precondition: num > 0
    */
    public int processNewRatings(int num){
        double newNum = 0.0;
        for (int counter = 0; counter < num; counter++)
        {
            newNum = getNewRating();
            if (newNum > 0)
            {
                return updateAverage(newNum);
            }
            else
            {
                return 0;
            }
        }
    }

    /** Returns a single numeric rating. */
    public double getNewRating(){
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        return num;
       
    }
}
