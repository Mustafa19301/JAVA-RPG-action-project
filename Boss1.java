/**
 * Name: Mustafa Ahmed
 * Date: 06/06/2022
 * Class: Boss1
 * Description: Boss1 extends from Stats to grant value
 */
package rpgculminating;

public class Boss1 extends Stats{
    //field
    private int mana;
    
    //arg-constructor
    public Boss1 (int h, int a, int m) {
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