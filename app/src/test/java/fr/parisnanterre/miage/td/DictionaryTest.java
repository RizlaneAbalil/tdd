package fr.parisnanterre.miage.td;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class DictionaryTest
{
    private Dictionary dict;
    private List<String> liste;

    @Before
    public void initialize () {
        dict = new Dictionary();
        liste = new ArrayList<>();
    }

    public DictionaryTest()
    {
        this.dict = new Dictionary();
    }

    @Test
    public void TestIsEmpty()
    {
        assertThat(dict.isEmpty(), equalTo(true));
    }

    @Test
    public void testDictionaryName()
    {
        assertThat(dict.getName(), equalTo("against"));
    }

    @Test
    public void testOneTranslation()
    {
        dict.addTranslation("contre", "against");
        assertThat(dict.getTranslation("contre"), equalTo("against"));
    }

    @Test
    public void testOneTranslation2()
    {
        dict.addTranslation("bateau", "boat");
        assertThat(dict.getTranslation("bateau"), equalTo("boat"));
    }

    @Test
    public void testOneTranslation3()
    {
        liste.add("against");
        liste.add("versus");
        dict.addMultipleTranslation("contre", liste);
        assertThat(dict.getMultipleTranslation("contre"), equalTo(liste));
    }

    @Test
    public void testOneTranslationInverse()
    {
        dict.addTranslation("bateau", "boat");
        assertThat(dict.getTranslation("boat"), equalTo("bateau"));
    }


    @After
    public void clean ()
    {
        dict = null;
    }
}
