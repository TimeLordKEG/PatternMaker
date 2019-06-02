package com.jetbrains;


public class TapestryController
{

    public static void main(String[] args)
    {
        tapestryExample(new BaublePattern());
        tapestryExample(new BlockyBaublePattern());
        tapestryExample(new ZigZagLinesPattern());
        tapestryExample(new CrossStitchWigglePattern());
    }

    private static void printBandPattern(Pattern pattern,int length, int rows)
    {
        for (int k = 0; k< rows; k++)
        {
            for (int i = 0; i < length; i++)
            {
                pattern.sew();
            }
            System.out.println();
        }
    }

    public static void tapestryExample(Pattern pattern)
    {
        printBandPattern(pattern, 8,3);

        System.out.print("\n\n");

        printBandPattern(pattern, 6, 8);

        System.out.println("\n\n");

    }
}
