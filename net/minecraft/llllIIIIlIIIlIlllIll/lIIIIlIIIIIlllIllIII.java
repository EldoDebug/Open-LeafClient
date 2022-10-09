package net.minecraft.llllIIIIlIIIlIlllIll;

import java.util.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;

public class lIIIIlIIIIIlllIllIII extends llllIIIIlIIIlIlllIll
{
    private static Map IIIIIIIIIlllIllIlIlI;
    
    static {
        lIIIIlIIIIIlllIllIII.IIIIIIIIIlllIllIlIlI = new IdentityHashMap();
    }
    
    protected lIIIIlIIIIIlllIllIII() {
        super(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll);
    }
    
    @Override
    public int llIllIlIIIIllIlIIllI() {
        return -1;
    }
    
    @Override
    public net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return null;
    }
    
    @Override
    public boolean llllIIllllIlIlIIIIll() {
        return false;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final boolean b) {
        return false;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final float n, final int n2) {
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return true;
    }
    
    public static void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final int iIlllIIlIllIllIlIIll) {
        if (!lIIIIlIIIIIlllIllIII.IIIIIIIIIlllIllIlIlI.containsKey(llllIIIIlIIIlIlllIll)) {
            lIIIIlIIIIIlllIllIII.IIIIIIIIIlllIllIlIlI.put(llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll.IIlllIIlIllIllIlIIll);
        }
        llllIIIIlIIIlIlllIll.IIlllIIlIllIllIlIIll = iIlllIIlIllIllIlIIll;
    }
    
    public static void llIllIIIIIllIlIIIIlI(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (lIIIIlIIIIIlllIllIII.IIIIIIIIIlllIllIlIlI.containsKey(llllIIIIlIIIlIlllIll)) {
            llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, lIIIIlIIIIIlllIllIII.IIIIIIIIIlllIllIlIlI.get(llllIIIIlIIIlIlllIll));
        }
    }
}
