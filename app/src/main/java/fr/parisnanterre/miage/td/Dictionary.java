package fr.parisnanterre.miage.td;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {

    private String name ;
    private HashMap<String, String> translations ;

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
        return translations.get(contre);
    }

    public void addTranslation(String contre, String against) {
        translations.put(contre, against);
    }
}
