package com.wmb.simplerpg.gameobject;

/**
 * Created by rob on 7/9/15.
 */
public class BaseGameObject implements GameObjectInterface {
    private int gameObjectID;
    private int x,y, hitpoints;
    private String name;

    public BaseGameObject() {
    }

    public BaseGameObject(int gameObjectID, int x, int y, int hitpoints, String name) {
        this.gameObjectID = gameObjectID;
        this.x = x;
        this.y = y;
        this.hitpoints = hitpoints;
        this.name = name;
    }

    public int getGameObjectID() {
        return gameObjectID;
    }

    public void setGameObjectID(int gameObjectID) {
        this.gameObjectID = gameObjectID;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getHitpoints() {
        return hitpoints;
    }

    public void setHitpoints(int hitpoints) {
        this.hitpoints = hitpoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BaseGameObject)) return false;

        BaseGameObject that = (BaseGameObject) o;

        if (gameObjectID != that.gameObjectID) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return gameObjectID;
    }

    @Override
    public BaseGameObject clone() throws CloneNotSupportedException {
        return (BaseGameObject) super.clone();
    }
}
