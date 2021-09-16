package fr.parisnanterre.miage.td;

import java.io.IOException;
import java.io.Reader;

public class BufferedReader
{
    private Reader in ;

    public BufferedReader(Reader in)
    {
        this.in = in;
    }

    public String readLine() throws IOException
    {
        return reader.readLine();
    }

}
