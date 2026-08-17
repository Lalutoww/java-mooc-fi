
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lalutoww
 */
public class IOU {

    private HashMap<String, Double> iou;

    public IOU() {
        this.iou = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        if (iou.containsKey(toWhom)) {
            amount += iou.get(toWhom);
        }

        iou.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom){
        return iou.getOrDefault(toWhom, 0.0);
    }

}
