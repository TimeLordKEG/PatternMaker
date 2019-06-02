package com.jetbrains;

public class CrossStitchWigglePattern extends Pattern
{
    public CrossStitchWigglePattern()
    {
        SmallCrossStitch smallCrossStitch = new SmallCrossStitch();
        LargeCrossStitch largeCrossStitch = new LargeCrossStitch();

        stitches.add(smallCrossStitch);
        stitches.add(largeCrossStitch);
    }
}