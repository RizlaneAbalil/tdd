package fr.parisnanterre.miage.td;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class DictionaryTest
{
    private Dictionary dict;
    private List<String> liste;

    @Before
    public void initialize () {
        dict = new Dictionary();
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
        dict.addMultipleTranslation("bateau", "boat");
        dict.addMultipleTranslation("bateau", "porte");
        assertThat(dict.getTranslation("bateau"), equalTo("boat"));
    }

    @After
    public void clean ()
    {
        dict = null;
    }
}
