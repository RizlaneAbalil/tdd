package fr.parisnanterre.miage.td;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class DictionaryTest
{
    private Dictionary dict;

    public DictionaryTest()
    {
        this.dict = new Dictionary();
    }

    @Test
    public void TestIsEmpty()
    {
        assertThat(dict.isEmpty(), equalTo(false));
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
        assertThat(dict.getTranslation("contre"), equalTo("play"));
    }
}
