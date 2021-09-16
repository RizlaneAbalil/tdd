package fr.parisnanterre.miage.td;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dictionary {

    private String name ;
    private HashMap<String, String> translations;
    private HashMap<String, List<String>> translationsMultiple;

    //Constructeur
    public Dictionary()
    {
        this.name = "against";
        this.translations = new HashMap<>();
        this.translationsMultiple = new HashMap<>();
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
        //Si on trouve le string en tant que clé dans la map alors on renvoie la valeur
        if(translations.containsKey(contre))
        {
            return translations.get(contre);
        }
        //Sinon le string est une value alors je vérifie qu'elle est dans la map
        else
        {
            //Si elle est dans la map alors je renvoie la clé
            if(translations.containsValue(contre))
            {
                for(Map.Entry<String, String> entry : this.translations.entrySet())
                {
                    if(contre.equals(entry.getValue()))
                    {
                        return entry.getKey();
                    }
                }
            }
            return "N'existe pas";
        }
    }

    public List getMultipleTranslation(String contre)
    {
        return translationsMultiple.get(contre);
    }

    public void addTranslation(String contre, String against) {
        translations.put(contre, against);
    }

    public void addMultipleTranslation(String contre, List liste)
    {
        this.translationsMultiple.put(contre, liste);
    }


}
