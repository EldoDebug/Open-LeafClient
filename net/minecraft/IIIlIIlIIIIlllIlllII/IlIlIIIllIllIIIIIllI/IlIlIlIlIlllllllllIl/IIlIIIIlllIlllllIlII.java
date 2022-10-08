package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl;

import com.google.common.collect.*;
import java.util.*;

public class IIlIIIIlllIlllllIlII
{
    private static int llllIIIIlIIIlIlllIll;
    private static List IlIlIlIlIlllllllllIl;
    private static List llIllIIIIIllIlIIIIlI;
    private static List IlIIIlIlIIIllIlIlIIl;
    private static List IlIlIIIllIllIIIIIllI;
    
    static {
        IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll = 256;
        IIlIIIIlllIlllllIlII.IlIlIlIlIlllllllllIl = Lists.newArrayList();
        IIlIIIIlllIlllllIlII.llIllIIIIIllIlIIIIlI = Lists.newArrayList();
        IIlIIIIlllIlllllIlII.IlIIIlIlIIIllIlIlIIl = Lists.newArrayList();
        IIlIIIIlllIlllllIlII.IlIlIIIllIllIIIIIllI = Lists.newArrayList();
    }
    
    public static synchronized int[] llllIIIIlIIIlIlllIll(final int llllIIIIlIIIlIlllIll) {
        if (llllIIIIlIIIlIlllIll <= 256) {
            if (IIlIIIIlllIlllllIlII.IlIlIlIlIlllllllllIl.isEmpty()) {
                final int[] array = new int[256];
                IIlIIIIlllIlllllIlII.llIllIIIIIllIlIIIIlI.add(array);
                return array;
            }
            final int[] array2 = IIlIIIIlllIlllllIlII.IlIlIlIlIlllllllllIl.remove(IIlIIIIlllIlllllIlII.IlIlIlIlIlllllllllIl.size() - 1);
            IIlIIIIlllIlllllIlII.llIllIIIIIllIlIIIIlI.add(array2);
            return array2;
        }
        else {
            if (llllIIIIlIIIlIlllIll > IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll) {
                IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
                IIlIIIIlllIlllllIlII.IlIIIlIlIIIllIlIlIIl.clear();
                IIlIIIIlllIlllllIlII.IlIlIIIllIllIIIIIllI.clear();
                final int[] array3 = new int[IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll];
                IIlIIIIlllIlllllIlII.IlIlIIIllIllIIIIIllI.add(array3);
                return array3;
            }
            if (IIlIIIIlllIlllllIlII.IlIIIlIlIIIllIlIlIIl.isEmpty()) {
                final int[] array4 = new int[IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll];
                IIlIIIIlllIlllllIlII.IlIlIIIllIllIIIIIllI.add(array4);
                return array4;
            }
            final int[] array5 = IIlIIIIlllIlllllIlII.IlIIIlIlIIIllIlIlIIl.remove(IIlIIIIlllIlllllIlII.IlIIIlIlIIIllIlIlIIl.size() - 1);
            IIlIIIIlllIlllllIlII.IlIlIIIllIllIIIIIllI.add(array5);
            return array5;
        }
    }
    
    public static synchronized void llllIIIIlIIIlIlllIll() {
        if (!IIlIIIIlllIlllllIlII.IlIIIlIlIIIllIlIlIIl.isEmpty()) {
            IIlIIIIlllIlllllIlII.IlIIIlIlIIIllIlIlIIl.remove(IIlIIIIlllIlllllIlII.IlIIIlIlIIIllIlIlIIl.size() - 1);
        }
        if (!IIlIIIIlllIlllllIlII.IlIlIlIlIlllllllllIl.isEmpty()) {
            IIlIIIIlllIlllllIlII.IlIlIlIlIlllllllllIl.remove(IIlIIIIlllIlllllIlII.IlIlIlIlIlllllllllIl.size() - 1);
        }
        IIlIIIIlllIlllllIlII.IlIIIlIlIIIllIlIlIIl.addAll(IIlIIIIlllIlllllIlII.IlIlIIIllIllIIIIIllI);
        IIlIIIIlllIlllllIlII.IlIlIlIlIlllllllllIl.addAll(IIlIIIIlllIlllllIlII.llIllIIIIIllIlIIIIlI);
        IIlIIIIlllIlllllIlII.IlIlIIIllIllIIIIIllI.clear();
        IIlIIIIlllIlllllIlII.llIllIIIIIllIlIIIIlI.clear();
    }
    
    public static synchronized String IlIlIlIlIlllllllllIl() {
        return "cache: " + IIlIIIIlllIlllllIlII.IlIIIlIlIIIllIlIlIIl.size() + ", tcache: " + IIlIIIIlllIlllllIlII.IlIlIlIlIlllllllllIl.size() + ", allocated: " + IIlIIIIlllIlllllIlII.IlIlIIIllIllIIIIIllI.size() + ", tallocated: " + IIlIIIIlllIlllllIlII.llIllIIIIIllIlIIIIlI.size();
    }
}
