/**
 * Name: Mustafa Ahmed
 * Date: 06/06/2022
 * Class: Boss2
 * Description: Boss2 extends from Stats to grant value
 */
package rpgculminating;

public class Boss2 extends Stats{
    //field
    private int mana;
    
    //arg-constructor
    public Boss2 (int h, int a, int m) {
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