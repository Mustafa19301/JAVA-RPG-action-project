/**
 * Name: Mustafa Ahmed
 * Date: 06/06/2022
 * Class: Stats
 * Description: Main Class that takes in Stats
 */
package rpgculminating;


public class Stats {
    //fields
    protected int Health;
    protected int Attack;
    
    //no-arg constructor
    Stats(){
        Health = 0;
        Attack = 0;
    }
    
    //arg constructor
    public Stats(int h, int a){
        Health = h;
        Attack = a;
    }
    
    //setters
    public void SetHP(int h){
        Health = h;
    }
    
    public void SetAtk(int a){
        Attack = a;
    }
    
    //getters
    public int GetHP(){
        return Health;
    }
    
    public int GetAtk(){
        return Attack;
    }
}