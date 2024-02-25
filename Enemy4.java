/**
 * Name: Mustafa Ahmed
 * Date: 06/06/2022
 * Class: Enemy4
 * Description: Enemy4 extends from Stats to grant value
 */
package rpgculminating;

public class Enemy4 extends Stats{
    //field
    private int mana;
    
    //arg-constructor
    public Enemy4 (int h, int a, int m) {
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