package com.wmb.simplerpg.gameobject;

import com.wmb.simplerpg.gameobject.BaseGameObject;

/**
 * Created by rob on 7/9/15.
 */
public class NonPlayerCharacter extends BaseGameObject {
    
    private int gold;

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }
}
