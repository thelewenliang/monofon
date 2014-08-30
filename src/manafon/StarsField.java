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
public class StarsField extends Field {
    
    private final int amount;
    private final int min;
    private final int max;
    
    /**
     *
     * @param amount amount of questions
     * @param min minimum point
     * @param max maximum point
     */
    public StarsField(int amount, int min, int max) {
        this.amount = amount;
        this.min = min;
        this.max = max;
        isCached = true;
        isDefault = true;
        type = TYPE_STARS;
    }

    public int getAmount() {
        return amount;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }
}
