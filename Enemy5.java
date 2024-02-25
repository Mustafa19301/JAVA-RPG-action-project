/**
 * Name: Mustafa Ahmed
 * Date: 06/06/2022
 * Class: Enemy5
 * Description: Enemy5 extends from Stats to grant value
 */
package rpgculminating;

public class Enemy5 extends Stats{
    //field
    private int mana;
    
    //arg-constructor
    public Enemy5 (int h, int a, int m) {
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