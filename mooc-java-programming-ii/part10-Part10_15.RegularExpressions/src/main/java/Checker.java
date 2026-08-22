

public class Checker {
    public boolean isDayOfWeek(String string){
        String regex = "mon|tue|wed|thu|fri|sat|sun";
        
        return string.matches(regex);
    }
    
    public boolean allVowels(String string){
        String regex = "(a|e|i|o|u|A|E|I|O|U)+";
        
        return string.matches(regex);
    }
    
    public boolean timeOfDay(String string){
        String regex = "([01][0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9])";
        
        return string.matches(regex);
    }
}
