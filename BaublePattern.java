package com.jetbrains;

public class BaublePattern extends Pattern
{
    public BaublePattern()
    {
        ShortLineStitch shortLineStitch = new ShortLineStitch();
        CircleStitch circleStitch = new CircleStitch();

        stitches.add(shortLineStitch);
        stitches.add(shortLineStitch);
        stitches.add(circleStitch);

    }
}
