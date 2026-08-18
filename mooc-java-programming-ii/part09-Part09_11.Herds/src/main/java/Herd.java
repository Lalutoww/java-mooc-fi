
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
public class Herd implements Movable{
    private List<Movable> members;

    public Herd() {
        this.members = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable){
        this.members.add(movable);
    }
    
    @Override
    public void move(int dx, int dy) {
        for(Movable member : this.members){
            member.move(dx, dy);
        }
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        
        for(Movable m : this.members){
            sb.append(m.toString()).append("\n");
        }
        
        return sb.toString();
    }
    
}
