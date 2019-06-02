package com.jetbrains;

public class ZigZagLinesPattern extends Pattern
{
    public ZigZagLinesPattern()
    {
        ZigZagStitch zigZagStitch = new ZigZagStitch();
        FillStitch fillStitch = new FillStitch();

        stitches.add(zigZagStitch);
        stitches.add(zigZagStitch);
        stitches.add(zigZagStitch);
        stitches.add(fillStitch);
        stitches.add(fillStitch);
        stitches.add(fillStitch);
    }
}
