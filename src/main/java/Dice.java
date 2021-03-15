public class Dice {
public int numberOfDice;

public Dice(int numberOfDice){
    this.numberOfDice=numberOfDice;
}
public Integer diceRoll(){
    int sum=0;
    for(int i=0;i<numberOfDice;i++){
        sum+=(int)(Math.random()*6)+1;
    }
    return sum;
}
public int getNumberOfDice(){
    return numberOfDice;
}

}