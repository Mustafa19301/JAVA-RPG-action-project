/**
 * Name: Mustafa Ahmed
 * Date: 06/06/2022
 * Class: User1
 * Description: User1 extends from Stats to gain value
 */
package rpgculminating;

public class User1 extends Stats{
    //field
    private int mana;
    
    //arg constructor
    public User1 (int h, int a, int m) {
        super(h, a);
        mana = m;
    }
    
    //setter
    public void SetMana(int m){
        mana = m;
    }
    
    //getter
    public int GetMana(){
        return mana;
    }
}