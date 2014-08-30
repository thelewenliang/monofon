/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package manafon;

import java.util.ArrayList;

/**
 *
 * @author Staff
 */
public class ListField extends Field{
    
    public ArrayList<String> list = new ArrayList<>();
    
    public ListField() {
        type = TYPE_LIST;
        isCached = true; //*
        isDefault = false; //*
    }
}
