package net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;

import java.util.*;

public enum llIIlIIIlIIIllIlIIIl
{
    llllIIIIlIIIlIlllIll("X", 0, 0), 
    IlIlIlIlIlllllllllIl("Y", 1, 1), 
    llIllIIIIIllIlIIIIlI("Z", 2, 2), 
    IlIIIlIlIIIllIlIlIIl("Y_ROT", 3, 3), 
    IlIlIIIllIllIIIIIllI("X_ROT", 4, 4);
    
    private int IllIIlllIIIIlllIIlIl;
    
    static {
        llllIIIlIlllIlIIIIIl = new llIIlIIIlIIIllIlIIIl[] { llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll, llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI, llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl, llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI };
    }
    
    private llIIlIIIlIIIllIlIIIl(final String s, final int n, final int illIIlllIIIIlllIIlIl) {
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
    }
    
    private int llllIIIIlIIIlIlllIll() {
        return 1 << this.IllIIlllIIIIlllIIlIl;
    }
    
    private boolean IlIlIlIlIlllllllllIl(final int n) {
        return (n & this.llllIIIIlIIIlIlllIll()) == this.llllIIIIlIIIlIlllIll();
    }
    
    public static Set llllIIIIlIIIlIlllIll(final int n) {
        final EnumSet<llIIlIIIlIIIllIlIIIl> none = EnumSet.noneOf(llIIlIIIlIIIllIlIIIl.class);
        llIIlIIIlIIIllIlIIIl[] values;
        for (int length = (values = values()).length, i = 0; i < length; ++i) {
            final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl = values[i];
            if (llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl(n)) {
                none.add(llIIlIIIlIIIllIlIIIl);
            }
        }
        return none;
    }
    
    public static int llllIIIIlIIIlIlllIll(final Set set) {
        int n = 0;
        final Iterator<llIIlIIIlIIIllIlIIIl> iterator = set.iterator();
        while (iterator.hasNext()) {
            n |= iterator.next().llllIIIIlIIIlIlllIll();
        }
        return n;
    }
}
