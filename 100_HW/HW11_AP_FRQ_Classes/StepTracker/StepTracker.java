import java.util.*;

public class StepTracker{
    public int days;
    public int steps;
    public int ActiveDays
    public boolean isActive;
    public StepTracker()
    {
        ActiveDays = 0;
        days = 0;
        steps = 0;
        isActive = true;
    }
    public void StepTracker(int num)
    {
        if (num >= 10000)
        {
            isActive = true;
        }
        else
        {
            isActive = false;
        }
    }
    public int activeDays(int num)
    {
        boolean Value = StepTracker(num);
        if (StepTracker == true)
        {
            ActiveDays+=1;
            return ActiveDays;
        }
        else
        {
            return ActiveDays;
        }
    }
    public double averageSteps()
    {
        double average = steps/days;
        return average;
    }
    public void addDailySteps(int num)
    {
        steps+=num;
    }
}