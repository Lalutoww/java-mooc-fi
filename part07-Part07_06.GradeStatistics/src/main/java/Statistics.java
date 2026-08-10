
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lalutoww
 */
public class Statistics {
    private List<Integer> pointsList;

    public Statistics() {
        this.pointsList = new ArrayList<>();
    }
    
    public void addPoints(int points){
        if(points < 0 || points > 100){
            return;
        }
        
        this.pointsList.add(points);
    }
    
    public int getParticipantsCount(){
        return this.pointsList.size();
    }
    
    public double getAverage(){
        if(pointsList.isEmpty()){
            return -1;
        }
        
        int sum = 0;
        for(Integer points : pointsList){
            sum+=points;
        }
        
        return (double) sum / pointsList.size();
    }
    
    public double getPassingAverage(){
        if(pointsList.isEmpty()){
            return -1;
        }
        
        int sum = 0;
        int count = 0;
        for(Integer points : pointsList){
            if(points >= 50){
                sum+=points;   
                count++;
            }
        }
        
        if(count == 0){
            return -1;
        }
        
        return (double) sum / count;
    }
    
    public int getPassingCount(){
        int count = 0;
        for(Integer points : pointsList){
            if(points >= 50){
                count++;
            }
        }
        
        return count;
    }
    
    private int getTotalPointsCount(int lowerBound, int higherBound){
        int count = 0;
        for(Integer points : pointsList){
            if(points >= lowerBound && points < higherBound){
                count++;
            }
        }
        return count;
    }
    
    public int getPointsDistribution(int grade){
        switch (grade) {
            case 0:
                return getTotalPointsCount(0, 50);
            case 1:
                return getTotalPointsCount(50, 60);
            case 2:
                return getTotalPointsCount(60, 70);
            case 3:
                return getTotalPointsCount(70, 80);
            case 4:
                return getTotalPointsCount(80, 90);
            case 5:
                return getTotalPointsCount(90, 101);
            default:
                return -1;
        }
    }
}
