package com.hbee.honeybee.entity;

import java.awt.Color;

import com.hbee.honeybee.enumeration.ShapeStyle;

public class ChartUserDefineOpt {
	private static Color[] colors = null;
    private static ShapeStyle[] shapes = null;
    private static int sizemin = 6;
    private static int sizemax = 50;

    public static Color[] getColors()
    {
		if(colors == null)
			colors = new Color[] { 
           new Color(33,162,239),
           new Color(66,199,115),
           new Color(247,81,82),
           new Color(247,215,66),
           new Color(181,162,231),
           new Color(255,154,16),
           new Color(156,199,222),
           new Color(132,219,165),
           new Color(115,195,247),
           new Color(247,142,140),
           new Color(255,231,132),
           new Color(206,195,239),
           new Color(255,190,99),
           new Color(189,219,239),
           new Color(24,93,49),
           new Color(16,77,115),
           new Color(115,36,33),
           new Color(115,101,33),
           new Color(82,77,107),
           new Color(123,73,8),
           new Color(74,97,107),
           new Color(198,239,214),
           new Color(189,227,255),
           new Color(255,203,206),
           new Color(255,243,206),
           new Color(231,239,247),
           new Color(255,227,189),
           new Color(231,239,247),
           new Color(49,150,82)};
		
		return colors;
    }

	public static void setColors(Color[] colors) {
		ChartUserDefineOpt.colors = colors;
	}

	public static ShapeStyle[] getShapes() {
		return shapes;
	}

	public static void setShapes(ShapeStyle[] shapes) {
		ChartUserDefineOpt.shapes = shapes;
	}

	public static int getSizemin() {
		return sizemin;
	}

	public static void setSizemin(int sizemin) {
		ChartUserDefineOpt.sizemin = sizemin;
	}

	public static int getSizemax() {
		return sizemax;
	}

	public static void setSizemax(int sizemax) {
		ChartUserDefineOpt.sizemax = sizemax;
	}

    public static int[] GetSizes(int iLength) {
        if (iLength == 0) return new int[] { sizemin };

        int[] result = new int[iLength];
        double mGap = (sizemax - sizemin) / (double)iLength;

        for (int i = 0; i < iLength; i++)
            result[i] = sizemin + (int)Math.round(i * mGap);

        return result;
    }

    public static Color[] FromColors(int[] argbs){
        if (argbs == null || argbs.length == 0) return null;
        Color[] colors = new Color[argbs.length];
        for (int i = 0; i < argbs.length; i++)
            colors[i] = new Color(argbs[i]);
        return colors;
    }
}
