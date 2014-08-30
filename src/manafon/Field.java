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
public abstract class Field {
    
    protected String text;
    protected int type;
    protected boolean isDefault = false;
    protected boolean isCached = true;

    public void setText(String text) {
        this.text = text;
    }
    
    public void setDefault(boolean bool) {
        this.isDefault = bool;
    }

    public void setCache(boolean bool) {
        this.isCached = bool;
    }

    public String getText() {
        return text;
    }

    public int getType() {
        return type;
    }

    public boolean isDefault() {
        return isDefault;
    }

    public boolean isCache() {
        return isCached;
    }
    
    
    public final int TYPE_LIST = 0;
    public final int TYPE_STARS = 2;
    public final int TYPE_CHECK_BOXES = 3;
    public final int TYPE_TEXT = 4;
}
