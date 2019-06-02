package com.jetbrains;

import java.util.ArrayList;

public class Pattern
{
    ArrayList <Stitch> stitches = new ArrayList<Stitch>();

    public void sew()
    {
        for (Stitch stitch : stitches)
        {
            stitch.sew();
        }
    }




}
