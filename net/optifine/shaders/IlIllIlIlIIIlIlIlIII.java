package net.optifine.shaders;

import net.optifine.lIIIlllIIIllIIIllIII.*;
import net.optifine.shaders.llllIIIIlIIIlIlllIll.*;
import java.nio.*;
import java.util.*;

public class IlIllIlIlIIIlIlIlIII
{
    private final int llllIIIIlIIIlIlllIll;
    private final String IlIlIlIlIlllllllllIl;
    private final lllIIIIlllllIlIIllIl llIllIIIIIllIlIIIIlI;
    private final IlIllIlIlIIIlIlIlIII IlIIIlIlIIIllIlIlIIl;
    private IlIlIIIllIllIIIIIllI IlIlIIIllIllIIIIIllI;
    private IllIIlllIIIIlllIIlIl IllIIlllIIIIlllIIlIl;
    private lIIIlllIIIllIIIllIII llllIIIlIlllIlIIIIIl;
    private final Boolean[] lIIIIlIIIIIlllIllIII;
    private int lIIIlllIIIllIIIllIII;
    private int llIIlIIIlIIIllIlIIIl;
    private String llIllIlIIIIllIlIIllI;
    private IntBuffer lIlIlIIIllIIllIIIllI;
    private IntBuffer IlIlIIIllIIllIlllllI;
    private int IIIIlllIIIIIIlIIIlll;
    private int llllIIllllIlIlIIIIll;
    private final boolean[] IlIllIlIlIIIlIlIlIII;
    
    public IlIllIlIlIIIlIlIlIII(final int llllIIIIlIIIlIlllIll, final String ilIlIlIlIlllllllllIl, final lllIIIIlllllIlIIllIl llIllIIIIIllIlIIIIlI, final IlIllIlIlIIIlIlIlIII ilIIIlIlIIIllIlIlIIl) {
        this.lIIIIlIIIIIlllIllIII = new Boolean[8];
        this.IlIllIlIlIIIlIlIlIII = new boolean[8];
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public IlIllIlIlIIIlIlIlIII(final int llllIIIIlIIIlIlllIll, final String ilIlIlIlIlllllllllIl, final lllIIIIlllllIlIIllIl llIllIIIIIllIlIIIIlI, final boolean b) {
        this.lIIIIlIIIIIlllIllIII = new Boolean[8];
        this.IlIllIlIlIIIlIlIlIII = new boolean[8];
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = (b ? this : null);
    }
    
    public void llllIIIIlIIIlIlllIll() {
        this.IlIlIIIllIllIIIIIllI = null;
        this.IllIIlllIIIIlllIIlIl = null;
        this.llllIIIlIlllIlIIIIIl = null;
        Arrays.fill(this.lIIIIlIIIIIlllIllIII, null);
    }
    
    public void IlIlIlIlIlllllllllIl() {
        this.lIIIlllIIIllIIIllIII = 0;
        this.llIIlIIIlIIIllIlIIIl = 0;
    }
    
    public void llIllIIIIIllIlIIIIlI() {
        this.llIllIlIIIIllIlIIllI = null;
        this.IIIIlllIIIIIIlIIIlll = 0;
        this.llllIIllllIlIlIIIIll = 0;
        if (this.IlIlIIIllIIllIlllllI == null) {
            this.IlIlIIIllIIllIlllllI = llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll(8);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII) {
        this.lIIIlllIIIllIIIllIII = ilIllIlIlIIIlIlIlIII.lIIIIlIIIIIlllIllIII();
        this.IlIlIIIllIllIIIIIllI = ilIllIlIlIIIlIlIlIII.llllIIllllIlIlIIIIll();
        this.IllIIlllIIIIlllIIlIl = ilIllIlIlIIIlIlIlIII.IlIllIlIlIIIlIlIlIII();
        this.llllIIIlIlllIlIIIIIl = ilIllIlIlIIIlIlIlIII.IIlllIIlIllIllIlIIll();
        System.arraycopy(ilIllIlIlIIIlIlIlIII.lllIIIIlllllIlIIllIl(), 0, this.lIIIIlIIIIIlllIllIII, 0, this.lIIIIlIIIIIlllIllIII.length);
        this.llIllIlIIIIllIlIIllI = ilIllIlIlIIIlIlIlIII.llIIlIIIlIIIllIlIIIl();
        this.lIlIlIIIllIIllIIIllI = ilIllIlIlIIIlIlIlIII.llIllIlIIIIllIlIIllI();
        this.IIIIlllIIIIIIlIIIlll = ilIllIlIlIIIlIlIlIII.IlIlIIIllIIllIlllllI();
        this.llllIIllllIlIlIIIIll = ilIllIlIlIIIlIlIlIII.IIIIlllIIIIIIlIIIlll();
        System.arraycopy(ilIllIlIlIIIlIlIlIII.IlIlIIIIIIlllIlIllIl(), 0, this.IlIllIlIlIIIlIlIlIII, 0, this.IlIllIlIlIIIlIlIlIII.length);
    }
    
    public int IlIIIlIlIIIllIlIlIIl() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public String IlIlIIIllIllIIIIIllI() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public lllIIIIlllllIlIIllIl IllIIlllIIIIlllIIlIl() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public IlIllIlIlIIIlIlIlIII llllIIIlIlllIlIIIIIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public int lIIIIlIIIIIlllIllIII() {
        return this.lIIIlllIIIllIIIllIII;
    }
    
    public int lIIIlllIIIllIIIllIII() {
        return this.llIIlIIIlIIIllIlIIIl;
    }
    
    public String llIIlIIIlIIIllIlIIIl() {
        return this.llIllIlIIIIllIlIIllI;
    }
    
    public IntBuffer llIllIlIIIIllIlIIllI() {
        return this.lIlIlIIIllIIllIIIllI;
    }
    
    public IntBuffer lIlIlIIIllIIllIIIllI() {
        return this.IlIlIIIllIIllIlllllI;
    }
    
    public int IlIlIIIllIIllIlllllI() {
        return this.IIIIlllIIIIIIlIIIlll;
    }
    
    public int IIIIlllIIIIIIlIIIlll() {
        return this.llllIIllllIlIlIIIIll;
    }
    
    public IlIlIIIllIllIIIIIllI llllIIllllIlIlIIIIll() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public IllIIlllIIIIlllIIlIl IlIllIlIlIIIlIlIlIII() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public lIIIlllIIIllIIIllIII IIlllIIlIllIllIlIIll() {
        return this.llllIIIlIlllIlIIIIIl;
    }
    
    public Boolean[] lllIIIIlllllIlIIllIl() {
        return this.lIIIIlIIIIIlllIllIII;
    }
    
    public boolean[] IlIlIIIIIIlllIlIllIl() {
        return this.IlIllIlIlIIIlIlIlIII;
    }
    
    public void llllIIIIlIIIlIlllIll(final int liiIlllIIIllIIIllIII) {
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
    }
    
    public void IlIlIlIlIlllllllllIl(final int llIIlIIIlIIIllIlIIIl) {
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final String llIllIlIIIIllIlIIllI) {
        this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI;
    }
    
    public void llllIIIIlIIIlIlllIll(final IntBuffer lIlIlIIIllIIllIIIllI) {
        this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI;
    }
    
    public void llIllIIIIIllIlIIIIlI(final int iiiIlllIIIIIIlIIIlll) {
        this.IIIIlllIIIIIIlIIIlll = iiiIlllIIIIIIlIIIlll;
    }
    
    public void IlIIIlIlIIIllIlIlIIl(final int llllIIllllIlIlIIIIll) {
        this.llllIIllllIlIlIIIIll = llllIIllllIlIlIIIIll;
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI) {
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    public void llllIIIIlIIIlIlllIll(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl) {
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final lIIIlllIIIllIIIllIII llllIIIlIlllIlIIIIIl) {
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
    }
    
    public String IIllIIllIIIlIlIIIIlI() {
        if (this.lIIIlllIIIllIIIllIII == 0) {
            return "none";
        }
        IlIllIlIlIIIlIlIlIII llllIIIlIlllIlIIIIIl;
        for (llllIIIlIlllIlIIIIIl = this; llllIIIlIlllIlIIIIIl.lIIIlllIIIllIIIllIII() != this.lIIIlllIIIllIIIllIII; llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl()) {
            if (llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl() == null || llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl() == llllIIIlIlllIlIIIIIl) {
                return "unknown";
            }
        }
        return llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI();
    }
    
    @Override
    public String toString() {
        return "name: " + this.IlIlIlIlIlllllllllIl + ", id: " + this.lIIIlllIIIllIIIllIII + ", ref: " + this.llIIlIIIlIIIllIlIIIl + ", real: " + this.IIllIIllIIIlIlIIIIlI();
    }
}
