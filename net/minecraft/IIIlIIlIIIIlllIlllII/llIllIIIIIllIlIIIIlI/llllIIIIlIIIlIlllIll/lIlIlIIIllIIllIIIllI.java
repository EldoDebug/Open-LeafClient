package net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll;

import com.google.common.collect.*;
import java.util.*;
import java.io.*;

public class lIlIlIIIllIIllIIIllI
{
    private static final Map llllIIIIlIIIlIlllIll;
    
    static {
        llllIIIIlIIIlIlllIll = Maps.newHashMap();
    }
    
    public static synchronized llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(final File file, final int n, final int n2) {
        final File file2 = new File(file, "region");
        final File file3 = new File(file2, "r." + (n >> 5) + "." + (n2 >> 5) + ".mca");
        final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl = lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll.get(file3);
        if (llIIlIIIlIIIllIlIIIl != null) {
            return llIIlIIIlIIIllIlIIIl;
        }
        if (!file2.exists()) {
            file2.mkdirs();
        }
        if (lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll.size() >= 256) {
            llllIIIIlIIIlIlllIll();
        }
        final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl2 = new llIIlIIIlIIIllIlIIIl(file3);
        lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll.put(file3, llIIlIIIlIIIllIlIIIl2);
        return llIIlIIIlIIIllIlIIIl2;
    }
    
    public static synchronized void llllIIIIlIIIlIlllIll() {
        for (final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl : lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll.values()) {
            try {
                if (llIIlIIIlIIIllIlIIIl == null) {
                    continue;
                }
                llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll();
            }
            catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll.clear();
    }
    
    public static DataInputStream IlIlIlIlIlllllllllIl(final File file, final int n, final int n2) {
        return llllIIIIlIIIlIlllIll(file, n, n2).llllIIIIlIIIlIlllIll(n & 0x1F, n2 & 0x1F);
    }
    
    public static DataOutputStream llIllIIIIIllIlIIIIlI(final File file, final int n, final int n2) {
        return llllIIIIlIIIlIlllIll(file, n, n2).IlIlIlIlIlllllllllIl(n & 0x1F, n2 & 0x1F);
    }
}
