package net.optifine.shaders;

import java.nio.*;
import java.util.*;

public class lIIIlllIIIllIIIllIII
{
    private IntBuffer llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    private boolean[] llIllIIIIIllIlIIIIlI;
    private boolean[] IlIIIlIlIIIllIlIlIIl;
    
    public lIIIlllIIIllIIIllIII(final IntBuffer llllIIIIlIIIlIlllIll, final int ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = new boolean[llllIIIIlIIIlIlllIll.capacity()];
        this.IlIIIlIlIIIllIlIlIIl = new boolean[llllIIIIlIIIlIlllIll.capacity()];
    }
    
    public int llllIIIIlIIIlIlllIll(final int n) {
        return this.llllIIIIlIIIlIlllIll(n, this.llIllIIIIIllIlIIIIlI[n]);
    }
    
    public int IlIlIlIlIlllllllllIl(final int n) {
        return this.llllIIIIlIIIlIlllIll(n, !this.llIllIIIIIllIlIIIIlI[n]);
    }
    
    private int llllIIIIlIIIlIlllIll(final int n, final boolean b) {
        return this.llllIIIIlIIIlIlllIll.get((b ? this.IlIlIlIlIlllllllllIl : 0) + n);
    }
    
    public void llIllIIIIIllIlIIIIlI(final int n) {
        this.llIllIIIIIllIlIIIIlI[n] = !this.llIllIIIIIllIlIIIIlI[n];
        this.IlIIIlIlIIIllIlIlIIl[n] = true;
    }
    
    public boolean IlIIIlIlIIIllIlIlIIl(final int n) {
        return this.IlIIIlIlIIIllIlIlIIl[n];
    }
    
    public void llllIIIIlIIIlIlllIll() {
        Arrays.fill(this.llIllIIIIIllIlIIIIlI, false);
        Arrays.fill(this.IlIIIlIlIIIllIlIlIIl, false);
    }
}
