public class StepTracker {
    
    int dailyActiveMinSteps;
    int activeDays;
    double avg;
    int c;
    
    public StepTracker(int s) {
        dailyActiveMinSteps = s;
    }
    
    public int activeDays() {
        return activeDays;
    }
    
    public double averageSteps() {
        return avg;
    }
    
    public void addDailySteps(int s) {
        if(s >= dailyActiveMinSteps) {
            activeDays++;
        }
        c++;
        avg = (avg + s) / c;
    }

}