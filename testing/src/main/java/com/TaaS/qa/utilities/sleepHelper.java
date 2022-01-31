package com.TaaS.qa.utilities;

public class sleepHelper 
{

    public static void sleep( long millis )
    {
        try
        {
            Thread.sleep( millis );
        }
        catch ( InterruptedException e )
        {

        }
    }

}
