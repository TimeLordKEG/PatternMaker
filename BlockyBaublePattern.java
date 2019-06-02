package com.jetbrains;

public class BlockyBaublePattern extends Pattern
{
    public BlockyBaublePattern()
    {
        BlockStitch blockStitch = new BlockStitch();
        ShortLineStitch shortLineStitch = new ShortLineStitch();
        CircleStitch circleStitch = new CircleStitch();

        stitches.add(blockStitch);
        stitches.add(shortLineStitch);
        stitches.add(shortLineStitch);
        stitches.add(circleStitch);
        stitches.add(shortLineStitch);
        stitches.add(shortLineStitch);

    }
}
