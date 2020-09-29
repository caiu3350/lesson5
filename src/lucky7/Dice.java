package lucky7;

public class Dice {
    private int number;
    
    public Dice(int number){
        this.number = number;
    }
    
    public void setNumber(int num){
        int number = num;
    }
    
    public int getNumber(){
        return number;
    }
    
    public void roll(){
        number = (int)(Math.random() * 6 + 1);
    }
}
