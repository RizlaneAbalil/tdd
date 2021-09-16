package fr.parisnanterre.miage.td;

public class Dictionary {

    private String name ;
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

    public String getTranslation(String contre)
    {
        return this.name;
    }

    public void addTranslation(String contre, String against) {}
}
