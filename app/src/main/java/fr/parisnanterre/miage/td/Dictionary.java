package fr.parisnanterre.miage.td;

import java.util.Map;

public class Dictionary {

    private String name ;
    private Map<String, String> translations ;

    //Constructeur
    public Dictionary()
    {
        this.name = "against";
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
        return false;
    }

    public String getTranslation(String contre)
    {
        return this.name;
    }

    public void addTranslation(String contre, String against) {}
}
