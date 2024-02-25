/**
 * Name: Mustafa Ahmed
 * Date: 06/06/2022
 * Class: Enemy3
 * Description: Enemy3 extends from Stats to grant value
 */
package rpgculminating;

public class Enemy3 extends Stats{
    //field
    private int mana;
    
    //arg-constructor
    public Enemy3 (int h, int a, int m) {
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