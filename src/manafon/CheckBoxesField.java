/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package manafon;

/**
 *
 * @author Staff
 */
public class CheckBoxesField extends Field{
    
    private int amount;
    
    public CheckBoxesField(int amount) {
        this.amount = amount;
        type = TYPE_CHECK_BOXES;
    }
}
