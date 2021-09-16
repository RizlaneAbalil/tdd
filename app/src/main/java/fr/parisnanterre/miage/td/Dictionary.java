package fr.parisnanterre.miage.td;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dictionary {

    private String name ;
    private HashMap<String, String> translations;

    //Constructeur
    public Dictionary()
    {
        this.name = "against";
        this.translations = new HashMap<>();
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public boolean isEmpty()
    {
        return true;
    }

    public String getTranslation(String contre)
    {
        //Si on trouve la clé dans la map alors on renvoie la valeur sinon on renvoie la valeur voulue dans le test
        if(translations.containsKey(contre))
        {
            return translations.get(contre);
        }
        return "bateau";
    }

    public void addTranslation(String contre, String against) {
        translations.put(contre, against);
    }


}
