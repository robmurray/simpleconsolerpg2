package com.wmb.simplerpg.gameobject;

import com.wmb.simplerpg.ConfigurationException;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by rob on 7/10/15.
 */
public class GameObjectFactory {


    static final Map<Character, Class<? extends GameObjectInterface>> KEY_MAPPINGS = new HashMap<Character, Class<? extends GameObjectInterface>>() {{
        put('P', PlayerCharacter.class);
        put('N', NonPlayerCharacter.class);
        put('S', StrongHold.class);
    }};


    public static GameObjectInterface createGameObject(Character gameObjectType) throws InvalidGameObjectTypeException {

        GameObjectInterface theGameObject = null;
        if (gameObjectType == null) {
            throw new InvalidGameObjectTypeException("gameObjecttype is null");
        }

        Class goClass = KEY_MAPPINGS.get(gameObjectType);

        if (goClass == null) {
            throw new InvalidGameObjectTypeException("unknown game object type: "+gameObjectType);
        }


        try {
            Class<GameObjectInterface> clazz = null;
            clazz = (Class<GameObjectInterface>) Class.forName(goClass.getName());
            theGameObject = clazz.newInstance();
            //Constructor<?> constructor = clazz.getConstructor(String.class, Integer.class);
            //Object instance = constructor.newInstance("stringparam", 42);
            //Object instance = constructor.newInstance();

        } catch (ClassNotFoundException e) {
            throw new ConfigurationException("Class ot found for : "+goClass.getName(),e);
        } catch (InstantiationException e) {
            throw new ConfigurationException("config is broken take a look at : "+goClass.getName(),e);
        } catch (IllegalAccessException e) {
            throw new ConfigurationException("config is broken take look at : "+goClass.getName(),e);
        }
        // will never happen but just in case
        if(theGameObject ==null){
            throw new ConfigurationException("weird the game object is null");
        }
        return theGameObject;

    }

}

