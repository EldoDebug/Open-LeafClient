package net.optifine.util;

import java.util.*;
import org.lwjgl.opengl.*;

public class lIIIlllIIIllIIIllIII implements Comparator
{
    @Override
    public int compare(final Object o, final Object o2) {
        final DisplayMode displayMode = (DisplayMode)o;
        final DisplayMode displayMode2 = (DisplayMode)o2;
        return (displayMode.getWidth() != displayMode2.getWidth()) ? (displayMode.getWidth() - displayMode2.getWidth()) : ((displayMode.getHeight() != displayMode2.getHeight()) ? (displayMode.getHeight() - displayMode2.getHeight()) : ((displayMode.getBitsPerPixel() != displayMode2.getBitsPerPixel()) ? (displayMode.getBitsPerPixel() - displayMode2.getBitsPerPixel()) : ((displayMode.getFrequency() != displayMode2.getFrequency()) ? (displayMode.getFrequency() - displayMode2.getFrequency()) : 0)));
    }
}
