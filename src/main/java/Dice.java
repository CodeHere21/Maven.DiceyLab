public class Dice {
public int value;

public Dice(){
    this.value=(int)(Math.random()*6+1);//toss
}
public Integer tossAndSum(){
    Dice dice1=new Dice();
    Dice dice2=new Dice();
    Integer sum;
    sum=dice1.value+ dice2.value;
    return sum;
}
}
