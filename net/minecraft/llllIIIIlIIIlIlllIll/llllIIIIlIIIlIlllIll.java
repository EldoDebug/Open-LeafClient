package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import leaf.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IIIlIIIlIlIIlllIIlll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

public class llllIIIIlIIIlIlllIll
{
    private static final lIllllIllIllIIllllll IIIIIIIIIlllIllIlIlI;
    public static final IIIIIlllIlIIIIIIIllI llllIIIIlIIIlIlllIll;
    public static final IlIllllIIlIllIlIlIll IlIlIlIlIlllllllllIl;
    private net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll IIllllIIIlIIIIIIllIl;
    public static final llllIIIlIlllIlIIIIIl llIllIIIIIllIlIIIIlI;
    public static final llllIIIlIlllIlIIIIIl IlIIIlIlIIIllIlIlIIl;
    public static final llllIIIlIlllIlIIIIIl IlIlIIIllIllIIIIIllI;
    public static final llllIIIlIlllIlIIIIIl IllIIlllIIIIlllIIlIl;
    public static final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl;
    public static final llllIIIlIlllIlIIIIIl lIIIIlIIIIIlllIllIII;
    public static final llllIIIlIlllIlIIIIIl lIIIlllIIIllIIIllIII;
    public static final llllIIIlIlllIlIIIIIl llIIlIIIlIIIllIlIIIl;
    public static final llllIIIlIlllIlIIIIIl llIllIlIIIIllIlIIllI;
    public static final llllIIIlIlllIlIIIIIl lIlIlIIIllIIllIIIllI;
    public static final llllIIIlIlllIlIIIIIl IlIlIIIllIIllIlllllI;
    public static final llllIIIlIlllIlIIIIIl IIIIlllIIIIIIlIIIlll;
    public static final llllIIIlIlllIlIIIIIl llllIIllllIlIlIIIIll;
    protected boolean IlIllIlIlIIIlIlIlIII;
    protected int IIlllIIlIllIllIlIIll;
    protected boolean lllIIIIlllllIlIIllIl;
    protected int IlIlIIIIIIlllIlIllIl;
    protected boolean IIllIIllIIIlIlIIIIlI;
    protected float IIIlIIIlIlIIlllIIlll;
    protected float IlIlIIIlIIlIlIIlllIl;
    protected boolean IlllllllIIIlIIIlIlII;
    protected boolean IIlIIIIlllIlllllIlII;
    protected boolean IIIlIIlIIIIlllIlllII;
    protected double IlIlIllllllllIIIIlII;
    protected double IIlllIlIIllIlIlIlIIl;
    protected double llIIIlIlIllIIlIlIlII;
    protected double lllllIlIIIlIlIIlllII;
    protected double lIllllllIIllIlIlIlII;
    protected double llIIlllIIlllIIllIllI;
    public llllIIIlIlllIlIIIIIl IIlllIIIlIlllIIlllII;
    public float IIlIIIIIllIlIIIlIIll;
    protected final IlIlIlIlIlllllllllIl llllllIllIllIlIllllI;
    protected final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll IIIllllllIllIIIlllIl;
    public float IlIIIlIIIllllIlIlIlI;
    protected final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl IIIIIllIIIIlIIIIllIl;
    private llIIlIIIlIIIllIlIIIl IlllIIIIlIIIlIlIlIIl;
    private String lllIllIIIllllllIllll;
    
    static {
        IIIIIIIIIlllIllIlIlI = new lIllllIllIllIIllllll("air");
        llllIIIIlIIIlIlllIll = new IIIIIlllIlIIIIIIIllI(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IIIIIIIIIlllIllIlIlI);
        IlIlIlIlIlllllllllIl = new IlIllllIIlIllIlIlIll();
        llIllIIIIIllIlIIIIlI = new llllIIIlIlllIlIIIIIl("stone", 1.0f, 1.0f);
        IlIIIlIlIIIllIlIlIIl = new llllIIIlIlllIlIIIIIl("wood", 1.0f, 1.0f);
        IlIlIIIllIllIIIIIllI = new llllIIIlIlllIlIIIIIl("gravel", 1.0f, 1.0f);
        IllIIlllIIIIlllIIlIl = new llllIIIlIlllIlIIIIIl("grass", 1.0f, 1.0f);
        llllIIIlIlllIlIIIIIl = new llllIIIlIlllIlIIIIIl("stone", 1.0f, 1.0f);
        lIIIIlIIIIIlllIllIII = new llllIIIlIlllIlIIIIIl("stone", 1.0f, 1.5f);
        lIIIlllIIIllIIIllIII = new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl("stone", 1.0f, 1.0f);
        llIIlIIIlIIIllIlIIIl = new llllIIIlIlllIlIIIIIl("cloth", 1.0f, 1.0f);
        llIllIlIIIIllIlIIllI = new llllIIIlIlllIlIIIIIl("sand", 1.0f, 1.0f);
        lIlIlIIIllIIllIIIllI = new llllIIIlIlllIlIIIIIl("snow", 1.0f, 1.0f);
        IlIlIIIllIIllIlllllI = new llIllIIIIIllIlIIIIlI("ladder", 1.0f, 1.0f);
        IIIIlllIIIIIIlIIIlll = new IlIIIlIlIIIllIlIlIIl("anvil", 0.3f, 1.0f);
        llllIIllllIlIlIIIIll = new IlIlIIIllIllIIIIIllI("slime", 1.0f, 1.0f);
    }
    
    public static int llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll);
    }
    
    public static int llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        final llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI();
        return llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI) + (llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI(llIIlIIIlIIIllIlIIIl) << 12);
    }
    
    public static llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final int n) {
        return (llllIIIIlIIIlIlllIll)net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n);
    }
    
    public static llIIlIIIlIIIllIlIIIl IlIlIlIlIlllllllllIl(final int n) {
        return llllIIIIlIIIlIlllIll(n & 0xFFF).llIllIIIIIllIlIIIIlI(n >> 12 & 0xF);
    }
    
    public static llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        return (ilIIIlIlIIIllIlIlIIl instanceof IIlllIIIlIlllIIlllII) ? ((IIlllIIIlIlllIIlllII)ilIIIlIlIIIllIlIlIIl).lllIIIIlllllIlIIllIl() : null;
    }
    
    public static llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final String s) {
        final lIllllIllIllIIllllll lIllllIllIllIIllllll = new lIllllIllIllIIllllll(s);
        if (net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(lIllllIllIllIIllllll)) {
            return (llllIIIIlIIIlIlllIll)net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll);
        }
        try {
            return (llllIIIIlIIIlIlllIll)net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(Integer.parseInt(s));
        }
        catch (NumberFormatException ex) {
            return null;
        }
    }
    
    public boolean llllIIIIlIIIlIlllIll() {
        return this.IlIllIlIlIIIlIlIlIII;
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.IIlllIIlIllIllIlIIll;
    }
    
    public boolean llIllIIIIIllIlIIIIlI() {
        return this.lllIIIIlllllIlIIllIl;
    }
    
    public int IlIIIlIlIIIllIlIlIIl() {
        if (Leaf.instance.modManager.fullbright) {
            return 15;
        }
        return this.IlIlIIIIIIlllIlIllIl;
    }
    
    public boolean IlIlIIIllIllIIIIIllI() {
        return this.IIllIIllIIIlIlIIIIlI;
    }
    
    public IlIlIlIlIlllllllllIl IllIIlllIIIIlllIIlIl() {
        return this.llllllIllIllIlIllllI;
    }
    
    public net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll IlIlIlIlIlllllllllIl(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return this.IIIllllllIllIIIlllIl;
    }
    
    public llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI(final int n) {
        return this.lllIllIIIllllllIllll();
    }
    
    public int llIllIIIIIllIlIIIIlI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        if (llIIlIIIlIIIllIlIIIl != null && !llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll().isEmpty()) {
            throw new IllegalArgumentException("Don't know how to convert " + llIIlIIIlIIIllIlIIIl + " back into data...");
        }
        return 0;
    }
    
    public llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return llIIlIIIlIIIllIlIIIl;
    }
    
    public llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl llllllIllIllIlIllllI, final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll iiIllllllIllIIIlllIl) {
        this.IlllllllIIIlIIIlIlII = true;
        this.IIlllIIIlIlllIIlllII = net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI;
        this.IIlIIIIIllIlIIIlIIll = 1.0f;
        this.IlIIIlIIIllllIlIlIlI = 0.6f;
        this.llllllIllIllIlIllllI = llllllIllIllIlIllllI;
        this.IIIllllllIllIIIlllIl = iiIllllllIllIIIlllIl;
        this.llllIIIIlIIIlIlllIll(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        this.IlIllIlIlIIIlIlIlIII = this.llllIIllllIlIlIIIIll();
        this.IIlllIIlIllIllIlIIll = (this.llllIIllllIlIlIIIIll() ? 255 : 0);
        this.lllIIIIlllllIlIIllIl = !llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI();
        this.IIIIIllIIIIlIIIIllIl = this.IIllllIIIlIIIIIIllIl();
        this.lIIIIlIIIIIlllIllIII(this.IIIIIllIIIIlIIIIllIl.IlIlIlIlIlllllllllIl());
    }
    
    protected llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        this(ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl.IlIllIlIlIIIlIlIlIII());
    }
    
    protected llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final llllIIIlIlllIlIIIIIl iIlllIIIlIlllIIlllII) {
        this.IIlllIIIlIlllIIlllII = iIlllIIIlIlllIIlllII;
        return this;
    }
    
    protected llllIIIIlIIIlIlllIll IlIIIlIlIIIllIlIlIIl(final int iIlllIIlIllIllIlIIll) {
        this.IIlllIIlIllIllIlIIll = iIlllIIlIllIllIlIIll;
        return this;
    }
    
    protected llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final float n) {
        this.IlIlIIIIIIlllIlIllIl = (int)(15.0f * n);
        return this;
    }
    
    protected llllIIIIlIIIlIlllIll IlIlIlIlIlllllllllIl(final float n) {
        this.IlIlIIIlIIlIlIIlllIl = n * 3.0f;
        return this;
    }
    
    public boolean llllIIIlIlllIlIIIIIl() {
        return this.llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl() && this.llIIlIIIlIIIllIlIIIl();
    }
    
    public boolean lIIIIlIIIIIlllIllIII() {
        return this.llllllIllIllIlIllllI.llIIlIIIlIIIllIlIIIl() && this.llIIlIIIlIIIllIlIIIl() && !this.IIIlIIlIIIIlllIlllII();
    }
    
    public boolean lIIIlllIIIllIIIllIII() {
        return this.llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl() && this.llIIlIIIlIIIllIlIIIl();
    }
    
    public boolean llIIlIIIlIIIllIlIIIl() {
        return true;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return !this.llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl();
    }
    
    public int llIllIlIIIIllIlIIllI() {
        return 3;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return false;
    }
    
    protected llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI(final float iiIlIIIlIlIIlllIIlll) {
        this.IIIlIIIlIlIIlllIIlll = iiIlIIIlIlIIlllIIlll;
        if (this.IlIlIIIlIIlIlIIlllIl < iiIlIIIlIlIIlllIIlll * 5.0f) {
            this.IlIlIIIlIIlIlIIlllIl = iiIlIIIlIlIIlllIIlll * 5.0f;
        }
        return this;
    }
    
    protected llllIIIIlIIIlIlllIll lIlIlIIIllIIllIIIllI() {
        this.llIllIIIIIllIlIIIIlI(-1.0f);
        return this;
    }
    
    public float IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return this.IIIlIIIlIlIIlllIIlll;
    }
    
    protected llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final boolean iIlIIIIlllIlllllIlII) {
        this.IIlIIIIlllIlllllIlII = iIlIIIIlllIlllllIlII;
        return this;
    }
    
    public boolean IlIlIIIllIIllIlllllI() {
        return this.IIlIIIIlllIlllllIlII;
    }
    
    public boolean IIIIlllIIIIIIlIIIlll() {
        return this.IIIlIIlIIIIlllIlllII;
    }
    
    protected final void llllIIIIlIIIlIlllIll(final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        this.IlIlIllllllllIIIIlII = n;
        this.IIlllIlIIllIlIlIlIIl = n2;
        this.llIIIlIlIllIIlIlIlII = n3;
        this.lllllIlIIIlIlIIlllII = n4;
        this.lIllllllIIllIlIlIlII = n5;
        this.llIIlllIIlllIIllIllI = n6;
    }
    
    public int IlIlIlIlIlllllllllIl(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI();
        final int llllIIIIlIIIlIlllIll = lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl());
        if (llllIIIIlIIIlIlllIll == 0 && llIllIIIIIllIlIIIIlI instanceof cc) {
            ilIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl();
            return lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI().IlIIIlIlIIIllIlIlIIl());
        }
        return llllIIIIlIIIlIlllIll;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        return (lllIllIIIllllllIllll == lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll && this.IIlllIlIIllIlIlIlIIl > 0.0) || (lllIllIIIllllllIllll == lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl && this.lIllllllIIllIlIlIlII < 1.0) || (lllIllIIIllllllIllll == lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI && this.llIIIlIlIllIIlIlIlII > 0.0) || (lllIllIIIllllllIllll == lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl && this.llIIlllIIlllIIllIllI < 1.0) || (lllIllIIIllllllIllll == lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI && this.IlIlIllllllllIIIIlII > 0.0) || (lllIllIIIllllllIllll == lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl && this.lllllIlIIIlIlIIlllII < 1.0) || !lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI().llllIIllllIlIlIIIIll();
    }
    
    public boolean IlIlIlIlIlllllllllIl(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        return lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl().IlIlIlIlIlllllllllIl();
    }
    
    public net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return new net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + this.IlIlIllllllllIIIIlII, ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + this.IIlllIlIIllIlIlIlIIl, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + this.llIIIlIlIllIIlIlIlII, ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + this.lllllIlIIIlIlIIlllII, ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + this.lIllllllIIllIlIlIlII, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + this.llIIlllIIlllIIllIllI);
    }
    
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final List list, final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl);
        if (llllIIIIlIIIlIlllIll2 != null && llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2)) {
            list.add(llllIIIIlIIIlIlllIll2);
        }
    }
    
    public net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return new net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + this.IlIlIllllllllIIIIlII, ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + this.IIlllIlIIllIlIlIlIIl, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + this.llIIIlIlIllIIlIlIlII, ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + this.lllllIlIIIlIlIIlllII, ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + this.lIllllllIIllIlIlIlII, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + this.llIIlllIIlllIIllIllI);
    }
    
    public boolean llllIIllllIlIlIIIIll() {
        return true;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final boolean b) {
        return this.IlIllIlIlIIIlIlIlIII();
    }
    
    public boolean IlIllIlIlIIIlIlIlIII() {
        return true;
    }
    
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Random random) {
        this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, random);
    }
    
    public void IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Random random) {
    }
    
    public void llIllIIIIIllIlIIIIlI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Random random) {
    }
    
    public void IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
    }
    
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
    }
    
    public int llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        return 10;
    }
    
    public void llIllIIIIIllIlIIIIlI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
    }
    
    public void IlIIIlIlIIIllIlIlIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
    }
    
    public int llllIIIIlIIIlIlllIll(final Random random) {
        return 1;
    }
    
    public net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Random random, final int n) {
        return net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this);
    }
    
    public float llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final float ilIlIlIlIlllllllllIl2 = this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl);
        return (ilIlIlIlIlllllllllIl2 < 0.0f) ? 0.0f : (llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this) ? (llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this) / ilIlIlIlIlllllllllIl2 / 30.0f) : (llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this) / ilIlIlIlIlllllllllIl2 / 100.0f));
    }
    
    public final void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final int n) {
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, 1.0f, n);
    }
    
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final float n, final int n2) {
        if (!illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            for (int llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(n2, illlllllIIIlIIIlIlII.llllIIllllIlIlIIIIll), i = 0; i < llllIIIIlIIIlIlllIll; ++i) {
                if (illlllllIIIlIIIlIlII.llllIIllllIlIlIIIIll.nextFloat() <= n) {
                    final net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl, illlllllIIIlIIIlIlII.llllIIllllIlIlIIIIll, n2);
                    if (llllIIIIlIIIlIlllIll2 != null) {
                        llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, new lllIIIIlIlIllIIlIIIl(llllIIIIlIIIlIlllIll2, 1, this.IlIIIlIlIIIllIlIlIIl(llIIlIIIlIIIllIlIIIl)));
                    }
                }
            }
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        if (!illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && illlllllIIIlIIIlIlII.llIIlllIIlllIIllIllI().IlIlIlIlIlllllllllIl("doTileDrops")) {
            final float n = 0.5f;
            final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII = new lIIIlllIIIllIIIllIII(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + (illlllllIIIlIIIlIlII.llllIIllllIlIlIIIIll.nextFloat() * n + (1.0f - n) * 0.5), ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + (illlllllIIIlIIIlIlII.llllIIllllIlIlIIIIll.nextFloat() * n + (1.0f - n) * 0.5), ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + (illlllllIIIlIIIlIlII.llllIIllllIlIlIIIIll.nextFloat() * n + (1.0f - n) * 0.5), lllIIIIlIlIllIIlIIIl);
            liiIlllIIIllIIIllIII.IlIllIlIlIIIlIlIlIII();
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII);
        }
    }
    
    protected void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, int i) {
        if (!illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            while (i > 0) {
                final int llllIIIIlIIIlIlllIll = net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(i);
                i -= llllIIIIlIIIlIlllIll;
                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(new IlIlIIIlIIlIlIIlllIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + 0.5, ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + 0.5, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + 0.5, llllIIIIlIIIlIlllIll));
            }
        }
    }
    
    public int IlIIIlIlIIIllIlIlIIl(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return 0;
    }
    
    public float llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        return this.IlIlIIIlIIlIlIIlllIl / 5.0f;
    }
    
    public llIlllIlllllIIllIIII llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, e ilIlIlIlIlllllllllIl2, e ilIlIlIlIlllllllllIl3) {
        this.llIllIIIIIllIlIIIIlI((lIlIlIIIllIIllIIIllI)illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl);
        ilIlIlIlIlllllllllIl2 = ilIlIlIlIlllllllllIl2.IlIlIlIlIlllllllllIl(-ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII(), -ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII(), -ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl());
        ilIlIlIlIlllllllllIl3 = ilIlIlIlIlllllllllIl3.IlIlIlIlIlllllllllIl(-ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII(), -ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII(), -ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl());
        e llllIIIIlIIIlIlllIll = ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl3, this.IlIlIllllllllIIIIlII);
        e llllIIIIlIIIlIlllIll2 = ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl3, this.lllllIlIIIlIlIIlllII);
        e ilIlIlIlIlllllllllIl4 = ilIlIlIlIlllllllllIl2.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl3, this.IIlllIlIIllIlIlIlIIl);
        e ilIlIlIlIlllllllllIl5 = ilIlIlIlIlllllllllIl2.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl3, this.lIllllllIIllIlIlIlII);
        e llIllIIIIIllIlIIIIlI = ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl3, this.llIIIlIlIllIIlIlIlII);
        e llIllIIIIIllIlIIIIlI2 = ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl3, this.llIIlllIIlllIIllIllI);
        if (!this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll)) {
            llllIIIIlIIIlIlllIll = null;
        }
        if (!this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2)) {
            llllIIIIlIIIlIlllIll2 = null;
        }
        if (!this.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl4)) {
            ilIlIlIlIlllllllllIl4 = null;
        }
        if (!this.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl5)) {
            ilIlIlIlIlllllllllIl5 = null;
        }
        if (!this.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI)) {
            llIllIIIIIllIlIIIIlI = null;
        }
        if (!this.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI2)) {
            llIllIIIIIllIlIIIIlI2 = null;
        }
        e e = null;
        if (llllIIIIlIIIlIlllIll != null && (e == null || ilIlIlIlIlllllllllIl2.llllIIIlIlllIlIIIIIl(llllIIIIlIIIlIlllIll) < ilIlIlIlIlllllllllIl2.llllIIIlIlllIlIIIIIl(e))) {
            e = llllIIIIlIIIlIlllIll;
        }
        if (llllIIIIlIIIlIlllIll2 != null && (e == null || ilIlIlIlIlllllllllIl2.llllIIIlIlllIlIIIIIl(llllIIIIlIIIlIlllIll2) < ilIlIlIlIlllllllllIl2.llllIIIlIlllIlIIIIIl(e))) {
            e = llllIIIIlIIIlIlllIll2;
        }
        if (ilIlIlIlIlllllllllIl4 != null && (e == null || ilIlIlIlIlllllllllIl2.llllIIIlIlllIlIIIIIl(ilIlIlIlIlllllllllIl4) < ilIlIlIlIlllllllllIl2.llllIIIlIlllIlIIIIIl(e))) {
            e = ilIlIlIlIlllllllllIl4;
        }
        if (ilIlIlIlIlllllllllIl5 != null && (e == null || ilIlIlIlIlllllllllIl2.llllIIIlIlllIlIIIIIl(ilIlIlIlIlllllllllIl5) < ilIlIlIlIlllllllllIl2.llllIIIlIlllIlIIIIIl(e))) {
            e = ilIlIlIlIlllllllllIl5;
        }
        if (llIllIIIIIllIlIIIIlI != null && (e == null || ilIlIlIlIlllllllllIl2.llllIIIlIlllIlIIIIIl(llIllIIIIIllIlIIIIlI) < ilIlIlIlIlllllllllIl2.llllIIIlIlllIlIIIIIl(e))) {
            e = llIllIIIIIllIlIIIIlI;
        }
        if (llIllIIIIIllIlIIIIlI2 != null && (e == null || ilIlIlIlIlllllllllIl2.llllIIIlIlllIlIIIIIl(llIllIIIIIllIlIIIIlI2) < ilIlIlIlIlllllllllIl2.llllIIIlIlllIlIIIIIl(e))) {
            e = llIllIIIIIllIlIIIIlI2;
        }
        if (e == null) {
            return null;
        }
        lllIllIIIllllllIllll lllIllIIIllllllIllll = null;
        if (e == llllIIIIlIIIlIlllIll) {
            lllIllIIIllllllIllll = net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI;
        }
        if (e == llllIIIIlIIIlIlllIll2) {
            lllIllIIIllllllIllll = net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl;
        }
        if (e == ilIlIlIlIlllllllllIl4) {
            lllIllIIIllllllIllll = net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll;
        }
        if (e == ilIlIlIlIlllllllllIl5) {
            lllIllIIIllllllIllll = net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl;
        }
        if (e == llIllIIIIIllIlIIIIlI) {
            lllIllIIIllllllIllll = net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI;
        }
        if (e == llIllIIIIIllIlIIIIlI2) {
            lllIllIIIllllllIllll = net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl;
        }
        return new llIlllIlllllIIllIIII(e.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII(), ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII(), ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl()), lllIllIIIllllllIllll, ilIlIlIlIlllllllllIl);
    }
    
    private boolean llllIIIIlIIIlIlllIll(final e e) {
        return e != null && (e.IlIlIlIlIlllllllllIl >= this.IIlllIlIIllIlIlIlIIl && e.IlIlIlIlIlllllllllIl <= this.lIllllllIIllIlIlIlII && e.llIllIIIIIllIlIIIIlI >= this.llIIIlIlIllIIlIlIlII && e.llIllIIIIIllIlIIIIlI <= this.llIIlllIIlllIIllIllI);
    }
    
    private boolean IlIlIlIlIlllllllllIl(final e e) {
        return e != null && (e.llllIIIIlIIIlIlllIll >= this.IlIlIllllllllIIIIlII && e.llllIIIIlIIIlIlllIll <= this.lllllIlIIIlIlIIlllII && e.llIllIIIIIllIlIIIIlI >= this.llIIIlIlIllIIlIlIlII && e.llIllIIIIIllIlIIIIlI <= this.llIIlllIIlllIIllIllI);
    }
    
    private boolean llIllIIIIIllIlIIIIlI(final e e) {
        return e != null && (e.llllIIIIlIIIlIlllIll >= this.IlIlIllllllllIIIIlII && e.llllIIIIlIIIlIlllIll <= this.lllllIlIIIlIlIIlllII && e.IlIlIlIlIlllllllllIl >= this.IIlllIlIIllIlIlIlIIl && e.IlIlIlIlIlllllllllIl <= this.lIllllllIIllIlIlIlII);
    }
    
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
    }
    
    public IlIIlIlIIIlIIlIlIlII IIlllIIlIllIllIlIIll() {
        return IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll);
    }
    
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        return this.IlIIIlIlIIIllIlIlIIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl);
    }
    
    public boolean IlIIIlIlIIIllIlIlIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI().llllllIllIllIlIllllI.lIIIlllIIIllIIIllIII();
    }
    
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final float n, final float n2, final float n3) {
        return false;
    }
    
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
    }
    
    public llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final float n, final float n2, final float n3, final int n4, final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        return this.llIllIIIIIllIlIIIIlI(n4);
    }
    
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
    }
    
    public e llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final e e) {
        return e;
    }
    
    public void llIllIIIIIllIlIIIIlI(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
    }
    
    public final double lllIIIIlllllIlIIllIl() {
        return this.IlIlIllllllllIIIIlII;
    }
    
    public final double IlIlIIIIIIlllIlIllIl() {
        return this.lllllIlIIIlIlIIlllII;
    }
    
    public final double IIllIIllIIIlIlIIIIlI() {
        return this.IIlllIlIIllIlIlIlIIl;
    }
    
    public final double IIIlIIIlIlIIlllIIlll() {
        return this.lIllllllIIllIlIlIlII;
    }
    
    public final double IlIlIIIlIIlIlIIlllIl() {
        return this.llIIIlIlIllIIlIlIlII;
    }
    
    public final double IlllllllIIIlIIIlIlII() {
        return this.llIIlllIIlllIIllIllI;
    }
    
    public int IIlIIIIlllIlllllIlII() {
        return 16777215;
    }
    
    public int IlIlIIIllIllIIIIIllI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return 16777215;
    }
    
    public int llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n) {
        return 16777215;
    }
    
    public final int IlIIIlIlIIIllIlIlIIl(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return this.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl, 0);
    }
    
    public int llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        return 0;
    }
    
    public boolean IIIlIIlIIIIlllIlllII() {
        return false;
    }
    
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
    }
    
    public int IlIlIlIlIlllllllllIl(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        return 0;
    }
    
    public void IlIlIllllllllIIIIlII() {
    }
    
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IIIIlllIIIIIIlIIIlll.lIIIIlIlIllllIIlIllI[llllIIIIlIIIlIlllIll(this)]);
        llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl(0.025f);
        if (this.IIlllIlIIllIlIlIlIIl() && net.minecraft.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll)) {
            final lllIIIIlIlIllIIlIIIl illIIlllIIIIlllIIlIl = this.IllIIlllIIIIlllIIlIl(llIIlIIIlIIIllIlIIIl);
            if (illIIlllIIIIlllIIlIl != null) {
                llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, illIIlllIIIIlllIIlIl);
            }
        }
        else {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, net.minecraft.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI(llllIIIIlIIIlIlllIll));
        }
    }
    
    protected boolean IIlllIlIIllIlIlIlIIl() {
        return this.llIIlIIIlIIIllIlIIIl() && !this.IIIlIIlIIIIlllIlllII;
    }
    
    protected lllIIIIlIlIllIIlIIIl IllIIlllIIIIlllIIlIl(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        int llIllIIIIIllIlIIIIlI = 0;
        final net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this);
        if (llllIIIIlIIIlIlllIll != null && llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl()) {
            llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI(llIIlIIIlIIIllIlIIIl);
        }
        return new lllIIIIlIlIllIIlIIIl(llllIIIIlIIIlIlllIll, 1, llIllIIIIIllIlIIIIlI);
    }
    
    public int llllIIIIlIIIlIlllIll(final int n, final Random random) {
        return this.llllIIIIlIIIlIlllIll(random);
    }
    
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
    }
    
    public boolean llIIIlIlIllIIlIlIlII() {
        return !this.llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl() && !this.llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll();
    }
    
    public llllIIIIlIIIlIlllIll IlIlIlIlIlllllllllIl(final String lllIllIIIllllllIllll) {
        this.lllIllIIIllllllIllll = lllIllIIIllllllIllll;
        return this;
    }
    
    public String lllllIlIIIlIlIIlllII() {
        return lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll(String.valueOf(this.lIllllllIIllIlIlIlII()) + ".name");
    }
    
    public String lIllllllIIllIlIlIlII() {
        return "tile." + this.lllIllIIIllllllIllll;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final int n, final int n2) {
        return false;
    }
    
    public boolean llIIlllIIlllIIllIllI() {
        return this.IlllllllIIIlIIIlIlII;
    }
    
    protected llllIIIIlIIIlIlllIll IIlllIIIlIlllIIlllII() {
        this.IlllllllIIIlIIIlIlII = false;
        return this;
    }
    
    public int IIlIIIIIllIlIIIlIIll() {
        return this.llllllIllIllIlIllllI.lIlIlIIIllIIllIIIllI();
    }
    
    public float llllllIllIllIlIllllI() {
        return this.llllIIIlIlllIlIIIIIl() ? 0.2f : 1.0f;
    }
    
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final float n) {
        llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl(n, 1.0f);
    }
    
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        llIllIIIIIllIlIIIIlI.llIIlllIIlllIIllIllI = 0.0;
    }
    
    public net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl IlIlIIIllIllIIIIIllI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this);
    }
    
    public int IllIIlllIIIIlllIIlIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return this.IlIIIlIlIIIllIlIlIIl(illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl));
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final List list) {
        list.add(new lllIIIIlIlIllIIlIIIl(ilIIIlIlIIIllIlIlIIl, 1, 0));
    }
    
    public net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll IIIllllllIllIIIlllIl() {
        return this.IIllllIIIlIIIIIIllIl;
    }
    
    public llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll iIllllIIIlIIIIIIllIl) {
        this.IIllllIIIlIIIIIIllIl = iIllllIIIlIIIIIIllIl;
        return this;
    }
    
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
    }
    
    public void llllIIIlIlllIlIIIIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
    }
    
    public boolean IlIIIlIIIllllIlIlIlI() {
        return false;
    }
    
    public boolean IIIIIllIIIIlIIIIllIl() {
        return true;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        return true;
    }
    
    public boolean IlIlIlIlIlllllllllIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return this == llllIIIIlIIIlIlllIll;
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2) {
        return llllIIIIlIIIlIlllIll != null && llllIIIIlIIIlIlllIll2 != null && (llllIIIIlIIIlIlllIll == llllIIIIlIIIlIlllIll2 || llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2));
    }
    
    public boolean IIIIIIIIIlllIllIlIlI() {
        return false;
    }
    
    public int lIIIIlIIIIIlllIllIII(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return 0;
    }
    
    public llIIlIIIlIIIllIlIIIl llllIIIlIlllIlIIIIIl(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return llIIlIIIlIIIllIlIIIl;
    }
    
    protected net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl IIllllIIIlIIIIIIllIl() {
        return new net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this, new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[0]);
    }
    
    public net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl IlllIIIIlIIIlIlIlIIl() {
        return this.IIIIIllIIIIlIIIIllIl;
    }
    
    protected final void lIIIIlIIIIIlllIllIII(final llIIlIIIlIIIllIlIIIl illlIIIIlIIIlIlIlIIl) {
        this.IlllIIIIlIIIlIlIlIIl = illlIIIIlIIIlIlIlIIl;
    }
    
    public final llIIlIIIlIIIllIlIIIl lllIllIIIllllllIllll() {
        return this.IlllIIIIlIIIlIlIlIIl;
    }
    
    public IllIIlllIIIIlllIIlIl llIllIlIlIIIIIIIllII() {
        return net.minecraft.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public String toString() {
        return "Block{" + net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this) + "}";
    }
    
    public static void IIlIlIlIIlIllIIIIIIl() {
        llllIIIIlIIIlIlllIll(0, net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IIIIIIIIIlllIllIlIlI, new net.minecraft.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII().IlIlIlIlIlllllllllIl("air"));
        llllIIIIlIIIlIlllIll(1, "stone", new ct().llIllIIIIIllIlIIIIlI(1.5f).IlIlIlIlIlllllllllIl(10.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl).IlIlIlIlIlllllllllIl("stone"));
        llllIIIIlIIIlIlllIll(2, "grass", new IIllIIIlIIIIlIIlIIII().llIllIIIIIllIlIIIIlI(0.6f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl).IlIlIlIlIlllllllllIl("grass"));
        llllIIIIlIIIlIlllIll(3, "dirt", new IllIllIIIIlIIlIlllII().llIllIIIIIllIlIIIIlI(0.5f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI).IlIlIlIlIlllllllllIl("dirt"));
        final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = new llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI).llIllIIIIIllIlIIIIlI(2.0f).IlIlIlIlIlllllllllIl(10.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl).IlIlIlIlIlllllllllIl("stonebrick").llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl);
        llllIIIIlIIIlIlllIll(4, "cobblestone", llllIIIIlIIIlIlllIll);
        final llllIIIIlIIIlIlllIll ilIlIlIlIlllllllllIl = new z().llIllIIIIIllIlIIIIlI(2.0f).IlIlIlIlIlllllllllIl(5.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl).IlIlIlIlIlllllllllIl("wood");
        llllIIIIlIIIlIlllIll(5, "planks", ilIlIlIlIlllllllllIl);
        llllIIIIlIIIlIlllIll(6, "sapling", new bp().llIllIIIIIllIlIIIIlI(0.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl).IlIlIlIlIlllllllllIl("sapling"));
        llllIIIIlIIIlIlllIll(7, "bedrock", new llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI).lIlIlIIIllIIllIIIllI().IlIlIlIlIlllllllllIl(6000000.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl).IlIlIlIlIlllllllllIl("bedrock").IIlllIIIlIlllIIlllII().llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl));
        llllIIIIlIIIlIlllIll(8, "flowing_water", new IllIIlllllIIllIIllIl(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII).llIllIIIIIllIlIIIIlI(100.0f).IlIIIlIlIIIllIlIlIIl(3).IlIlIlIlIlllllllllIl("water").IIlllIIIlIlllIIlllII());
        llllIIIIlIIIlIlllIll(9, "water", new cq(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII).llIllIIIIIllIlIIIIlI(100.0f).IlIIIlIlIIIllIlIlIIl(3).IlIlIlIlIlllllllllIl("water").IIlllIIIlIlllIIlllII());
        llllIIIIlIIIlIlllIll(10, "flowing_lava", new IllIIlllllIIllIIllIl(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII).llIllIIIIIllIlIIIIlI(100.0f).llllIIIIlIIIlIlllIll(1.0f).IlIlIlIlIlllllllllIl("lava").IIlllIIIlIlllIIlllII());
        llllIIIIlIIIlIlllIll(11, "lava", new cq(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII).llIllIIIIIllIlIIIIlI(100.0f).llllIIIIlIIIlIlllIll(1.0f).IlIlIlIlIlllllllllIl("lava").IIlllIIIlIlllIIlllII());
        llllIIIIlIIIlIlllIll(12, "sand", new bl().llIllIIIIIllIlIIIIlI(0.5f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI).IlIlIlIlIlllllllllIl("sand"));
        llllIIIIlIIIlIlllIll(13, "gravel", new IIIllIIllIIIIIIlIIlI().llIllIIIIIllIlIIIIlI(0.6f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI).IlIlIlIlIlllllllllIl("gravel"));
        llllIIIIlIIIlIlllIll(14, "gold_ore", new s().llIllIIIIIllIlIIIIlI(3.0f).IlIlIlIlIlllllllllIl(5.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl).IlIlIlIlIlllllllllIl("oreGold"));
        llllIIIIlIIIlIlllIll(15, "iron_ore", new s().llIllIIIIIllIlIIIIlI(3.0f).IlIlIlIlIlllllllllIl(5.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl).IlIlIlIlIlllllllllIl("oreIron"));
        llllIIIIlIIIlIlllIll(16, "coal_ore", new s().llIllIIIIIllIlIIIIlI(3.0f).IlIlIlIlIlllllllllIl(5.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl).IlIlIlIlIlllllllllIl("oreCoal"));
        llllIIIIlIIIlIlllIll(17, "log", new q().IlIlIlIlIlllllllllIl("log"));
        llllIIIIlIIIlIlllIll(18, "leaves", new o().IlIlIlIlIlllllllllIl("leaves"));
        llllIIIIlIIIlIlllIll(19, "sponge", new cj().llIllIIIIIllIlIIIIlI(0.6f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl).IlIlIlIlIlllllllllIl("sponge"));
        llllIIIIlIIIlIlllIll(20, "glass", new IlIllllIIIlIllIlIIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIIIIIIlllIlIllIl, false).llIllIIIIIllIlIIIIlI(0.3f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII).IlIlIlIlIlllllllllIl("glass"));
        llllIIIIlIIIlIlllIll(21, "lapis_ore", new s().llIllIIIIIllIlIIIIlI(3.0f).IlIlIlIlIlllllllllIl(5.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl).IlIlIlIlIlllllllllIl("oreLapis"));
        llllIIIIlIIIlIlllIll(22, "lapis_block", new llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl, net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllllIllIllIlIllllI).llIllIIIIIllIlIIIIlI(3.0f).IlIlIlIlIlllllllllIl(5.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl).IlIlIlIlIlllllllllIl("blockLapis").llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl));
        llllIIIIlIIIlIlllIll(23, "dispenser", new IllIllIlllIllllIIllI().llIllIIIIIllIlIIIIlI(3.5f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl).IlIlIlIlIlllllllllIl("dispenser"));
        final llllIIIIlIIIlIlllIll ilIlIlIlIlllllllllIl2 = new bn().llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl).llIllIIIIIllIlIIIIlI(0.8f).IlIlIlIlIlllllllllIl("sandStone");
        llllIIIIlIIIlIlllIll(24, "sandstone", ilIlIlIlIlllllllllIl2);
        llllIIIIlIIIlIlllIll(25, "noteblock", new m().llIllIIIIIllIlIIIIlI(0.8f).IlIlIlIlIlllllllllIl("musicBlock"));
        llllIIIIlIIIlIlllIll(26, "bed", new IlIlIIIIIIlllIlIllIl().llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl).llIllIIIIIllIlIIIIlI(0.2f).IlIlIlIlIlllllllllIl("bed").IIlllIIIlIlllIIlllII());
        llllIIIIlIIIlIlllIll(27, "golden_rail", new at().llIllIIIIIllIlIIIIlI(0.7f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII).IlIlIlIlIlllllllllIl("goldenRail"));
        llllIIIIlIIIlIlllIll(28, "detector_rail", new ar().llIllIIIIIllIlIIIIlI(0.7f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII).IlIlIlIlIlllllllllIl("detectorRail"));
        llllIIIIlIIIlIlllIll(29, "sticky_piston", new v(true).IlIlIlIlIlllllllllIl("pistonStickyBase"));
        llllIIIIlIIIlIlllIll(30, "web", new do().IlIIIlIlIIIllIlIlIIl(1).llIllIIIIIllIlIIIIlI(4.0f).IlIlIlIlIlllllllllIl("web"));
        llllIIIIlIIIlIlllIll(31, "tallgrass", new dc().llIllIIIIIllIlIIIIlI(0.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl).IlIlIlIlIlllllllllIl("tallgrass"));
        llllIIIIlIIIlIlllIll(32, "deadbush", new llIllIlIlIIIIIIIllII().llIllIIIIIllIlIIIIlI(0.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl).IlIlIlIlIlllllllllIl("deadbush"));
        llllIIIIlIIIlIlllIll(33, "piston", new v(false).IlIlIlIlIlllllllllIl("pistonBase"));
        llllIIIIlIIIlIlllIll(34, "piston_head", new w().IlIlIlIlIlllllllllIl("pistonBase"));
        llllIIIIlIIIlIlllIll(35, "wool", new IlIIIlIIIllllIlIlIlI(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IIIIlllIIIIIIlIIIlll).llIllIIIIIllIlIIIIlI(0.8f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl).IlIlIlIlIlllllllllIl("cloth"));
        llllIIIIlIIIlIlllIll(36, "piston_extension", new y());
        llllIIIIlIIIlIlllIll(37, "yellow_flower", new ds().llIllIIIIIllIlIIIIlI(0.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl).IlIlIlIlIlllllllllIl("flower1"));
        llllIIIIlIIIlIlllIll(38, "red_flower", new av().llIllIIIIIllIlIIIIlI(0.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl).IlIlIlIlIlllllllllIl("flower2"));
        final llllIIIIlIIIlIlllIll ilIlIlIlIlllllllllIl3 = new d().llIllIIIIIllIlIIIIlI(0.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl).llllIIIIlIIIlIlllIll(0.125f).IlIlIlIlIlllllllllIl("mushroom");
        llllIIIIlIIIlIlllIll(39, "brown_mushroom", ilIlIlIlIlllllllllIl3);
        final llllIIIIlIIIlIlllIll ilIlIlIlIlllllllllIl4 = new d().llIllIIIIIllIlIIIIlI(0.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl).IlIlIlIlIlllllllllIl("mushroom");
        llllIIIIlIIIlIlllIll(40, "red_mushroom", ilIlIlIlIlllllllllIl4);
        llllIIIIlIIIlIlllIll(41, "gold_block", new llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl, net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IIlllIIIlIlllIIlllII).llIllIIIIIllIlIIIIlI(3.0f).IlIlIlIlIlllllllllIl(10.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII).IlIlIlIlIlllllllllIl("blockGold").llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl));
        llllIIIIlIIIlIlllIll(42, "iron_block", new llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl, net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII).llIllIIIIIllIlIIIIlI(5.0f).IlIlIlIlIlllllllllIl(10.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII).IlIlIlIlIlllllllllIl("blockIron").llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl));
        llllIIIIlIIIlIlllIll(43, "double_stone_slab", new llIIIIIIlIllIIlIIIll().llIllIIIIIllIlIIIIlI(2.0f).IlIlIlIlIlllllllllIl(10.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl).IlIlIlIlIlllllllllIl("stoneSlab"));
        llllIIIIlIIIlIlllIll(44, "stone_slab", new IIIIIIIllllIlIIIIIII().llIllIIIIIllIlIIIIlI(2.0f).IlIlIlIlIlllllllllIl(10.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl).IlIlIlIlIlllllllllIl("stoneSlab"));
        final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = new llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI, net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII).llIllIIIIIllIlIIIIlI(2.0f).IlIlIlIlIlllllllllIl(10.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl).IlIlIlIlIlllllllllIl("brick").llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl);
        llllIIIIlIIIlIlllIll(45, "brick_block", llllIIIIlIIIlIlllIll2);
        llllIIIIlIIIlIlllIll(46, "tnt", new db().llIllIIIIIllIlIIIIlI(0.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl).IlIlIlIlIlllllllllIl("tnt"));
        llllIIIIlIIIlIlllIll(47, "bookshelf", new IIIlIIIlIlIIlllIIlll().llIllIIIIIllIlIIIIlI(1.5f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl).IlIlIlIlIlllllllllIl("bookshelf"));
        llllIIIIlIIIlIlllIll(48, "mossy_cobblestone", new llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI).llIllIIIIIllIlIIIIlI(2.0f).IlIlIlIlIlllllllllIl(10.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl).IlIlIlIlIlllllllllIl("stoneMoss").llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl));
        llllIIIIlIIIlIlllIll(49, "obsidian", new n().llIllIIIIIllIlIIIIlI(50.0f).IlIlIlIlIlllllllllIl(2000.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl).IlIlIlIlIlllllllllIl("obsidian"));
        llllIIIIlIIIlIlllIll(50, "torch", new de().llIllIIIIIllIlIIIIlI(0.0f).llllIIIIlIIIlIlllIll(0.9375f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl).IlIlIlIlIlllllllllIl("torch"));
        llllIIIIlIIIlIlllIll(51, "fire", new IIlIlIllllIlllIIIIll().llIllIIIIIllIlIIIIlI(0.0f).llllIIIIlIIIlIlllIll(1.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl).IlIlIlIlIlllllllllIl("fire").IIlllIIIlIlllIIlllII());
        llllIIIIlIIIlIlllIll(52, "mob_spawner", new c().llIllIIIIIllIlIIIIlI(5.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII).IlIlIlIlIlllllllllIl("mobSpawner").IIlllIIIlIlllIIlllII());
        llllIIIIlIIIlIlllIll(53, "oak_stairs", new cm(ilIlIlIlIlllllllllIl.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(z.IIIIIIIIIlllIllIlIlI, aa.llllIIIIlIIIlIlllIll)).IlIlIlIlIlllllllllIl("stairsWood"));
        llllIIIIlIIIlIlllIll(54, "chest", new IIlIIIIIllIlIIIlIIll(0).llIllIIIIIllIlIIIIlI(2.5f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl).IlIlIlIlIlllllllllIl("chest"));
        llllIIIIlIIIlIlllIll(55, "redstone_wire", new bh().llIllIIIIIllIlIIIIlI(0.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI).IlIlIlIlIlllllllllIl("redstoneDust").IIlllIIIlIlllIIlllII());
        llllIIIIlIIIlIlllIll(56, "diamond_ore", new s().llIllIIIIIllIlIIIIlI(3.0f).IlIlIlIlIlllllllllIl(5.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl).IlIlIlIlIlllllllllIl("oreDiamond"));
        llllIIIIlIIIlIlllIll(57, "diamond_block", new llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl, net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IIlIIIIIllIlIIIlIIll).llIllIIIIIllIlIIIIlI(5.0f).IlIlIlIlIlllllllllIl(10.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII).IlIlIlIlIlllllllllIl("blockDiamond").llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl));
        llllIIIIlIIIlIlllIll(58, "crafting_table", new dq().llIllIIIIIllIlIIIIlI(2.5f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl).IlIlIlIlIlllllllllIl("workbench"));
        llllIIIIlIIIlIlllIll(59, "wheat", new IlllIIIIlIIIlIlIlIIl().IlIlIlIlIlllllllllIl("crops"));
        final llllIIIIlIIIlIlllIll ilIlIlIlIlllllllllIl5 = new lllllIIlIlIIIlIlIIIl().llIllIIIIIllIlIIIIlI(0.6f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI).IlIlIlIlIlllllllllIl("farmland");
        llllIIIIlIIIlIlllIll(60, "farmland", ilIlIlIlIlllllllllIl5);
        llllIIIIlIIIlIlllIll(61, "furnace", new lllllIIIIIlIIlllIlIl(false).llIllIIIIIllIlIIIIlI(3.5f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl).IlIlIlIlIlllllllllIl("furnace").llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI));
        llllIIIIlIIIlIlllIll(62, "lit_furnace", new lllllIIIIIlIIlllIlIl(true).llIllIIIIIllIlIIIIlI(3.5f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl).llllIIIIlIIIlIlllIll(0.875f).IlIlIlIlIlllllllllIl("furnace"));
        llllIIIIlIIIlIlllIll(63, "standing_sign", new cp().llIllIIIIIllIlIIIIlI(1.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl).IlIlIlIlIlllllllllIl("sign").IIlllIIIlIlllIIlllII());
        llllIIIIlIIIlIlllIll(64, "wooden_door", new llIlIIIIIlIIlIlIIlll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl).llIllIIIIIllIlIIIIlI(3.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl).IlIlIlIlIlllllllllIl("doorOak").IIlllIIIlIlllIIlllII());
        llllIIIIlIIIlIlllIll(65, "ladder", new IllIlllIllIIIIllllII().llIllIIIIIllIlIIIIlI(0.4f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI).IlIlIlIlIlllllllllIl("ladder"));
        llllIIIIlIIIlIlllIll(66, "rail", new an().llIllIIIIIllIlIIIIlI(0.7f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII).IlIlIlIlIlllllllllIl("rail"));
        llllIIIIlIIIlIlllIll(67, "stone_stairs", new cm(llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll()).IlIlIlIlIlllllllllIl("stairsStone"));
        llllIIIIlIIIlIlllIll(68, "wall_sign", new dn().llIllIIIIIllIlIIIIlI(1.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl).IlIlIlIlIlllllllllIl("sign").IIlllIIIlIlllIIlllII());
        llllIIIIlIIIlIlllIll(69, "lever", new net.minecraft.llllIIIIlIIIlIlllIll.lIIlllIlllllIIlllIll().llIllIIIIIllIlIIIIlI(0.5f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl).IlIlIlIlIlllllllllIl("lever"));
        llllIIIIlIIIlIlllIll(70, "stone_pressure_plate", new ae(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI, af.IlIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI(0.5f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl).IlIlIlIlIlllllllllIl("pressurePlateStone"));
        llllIIIIlIIIlIlllIll(71, "iron_door", new llIlIIIIIlIIlIlIIlll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl).llIllIIIIIllIlIIIIlI(5.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII).IlIlIlIlIlllllllllIl("doorIron").IIlllIIIlIlllIIlllII());
        llllIIIIlIIIlIlllIll(72, "wooden_pressure_plate", new ae(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl, af.llllIIIIlIIIlIlllIll).llIllIIIIIllIlIIIIlI(0.5f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl).IlIlIlIlIlllllllllIl("pressurePlateWood"));
        llllIIIIlIIIlIlllIll(73, "redstone_ore", new bd(false).llIllIIIIIllIlIIIIlI(3.0f).IlIlIlIlIlllllllllIl(5.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl).IlIlIlIlIlllllllllIl("oreRedstone").llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl));
        llllIIIIlIIIlIlllIll(74, "lit_redstone_ore", new bd(true).llllIIIIlIIIlIlllIll(0.625f).llIllIIIIIllIlIIIIlI(3.0f).IlIlIlIlIlllllllllIl(5.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl).IlIlIlIlIlllllllllIl("oreRedstone"));
        llllIIIIlIIIlIlllIll(75, "unlit_redstone_torch", new bf(false).llIllIIIIIllIlIIIIlI(0.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl).IlIlIlIlIlllllllllIl("notGate"));
        llllIIIIlIIIlIlllIll(76, "redstone_torch", new bf(true).llIllIIIIIllIlIIIIlI(0.0f).llllIIIIlIIIlIlllIll(0.5f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl).IlIlIlIlIlllllllllIl("notGate").llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl));
        llllIIIIlIIIlIlllIll(77, "stone_button", new IlIlIllllllllIIIIlII().llIllIIIIIllIlIIIIlI(0.5f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl).IlIlIlIlIlllllllllIl("button"));
        llllIIIIlIIIlIlllIll(78, "snow_layer", new cf().llIllIIIIIllIlIIIIlI(0.1f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI).IlIlIlIlIlllllllllIl("snow").IlIIIlIlIIIllIlIlIIl(0));
        llllIIIIlIIIlIlllIll(79, "ice", new IIlIlllIlIlllIlIllll().llIllIIIIIllIlIIIIlI(0.5f).IlIIIlIlIIIllIlIlIIl(3).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII).IlIlIlIlIlllllllllIl("ice"));
        llllIIIIlIIIlIlllIll(80, "snow", new cg().llIllIIIIIllIlIIIIlI(0.2f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI).IlIlIlIlIlllllllllIl("snow"));
        llllIIIIlIIIlIlllIll(81, "cactus", new llIIIlIlIllIIlIlIlII().llIllIIIIIllIlIIIIlI(0.4f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl).IlIlIlIlIlllllllllIl("cactus"));
        llllIIIIlIIIlIlllIll(82, "clay", new llllllIllIllIlIllllI().llIllIIIIIllIlIIIIlI(0.6f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI).IlIlIlIlIlllllllllIl("clay"));
        llllIIIIlIIIlIlllIll(83, "reeds", new bj().llIllIIIIIllIlIIIIlI(0.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl).IlIlIlIlIlllllllllIl("reeds").IIlllIIIlIlllIIlllII());
        llllIIIIlIIIlIlllIll(84, "jukebox", new net.minecraft.llllIIIIlIIIlIlllIll.lIllllIllIllIIllllll().llIllIIIIIllIlIIIIlI(2.0f).IlIlIlIlIlllllllllIl(10.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl).IlIlIlIlIlllllllllIl("jukebox"));
        llllIIIIlIIIlIlllIll(85, "fence", new IIlllllIllIllIlIlIII(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl, aa.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI()).llIllIIIIIllIlIIIIlI(2.0f).IlIlIlIlIlllllllllIl(5.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl).IlIlIlIlIlllllllllIl("fence"));
        final llllIIIIlIIIlIlllIll ilIlIlIlIlllllllllIl6 = new aj().llIllIIIIIllIlIIIIlI(1.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl).IlIlIlIlIlllllllllIl("pumpkin");
        llllIIIIlIIIlIlllIll(86, "pumpkin", ilIlIlIlIlllllllllIl6);
        llllIIIIlIIIlIlllIll(87, "netherrack", new h().llIllIIIIIllIlIIIIlI(0.4f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl).IlIlIlIlIlllllllllIl("hellrock"));
        llllIIIIlIIIlIlllIll(88, "soul_sand", new ch().llIllIIIIIllIlIIIIlI(0.5f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI).IlIlIlIlIlllllllllIl("hellsand"));
        llllIIIIlIIIlIlllIll(89, "glowstone", new lIIIIIlIlIIIlIIIIlIl(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIIIIIIlllIlIllIl).llIllIIIIIllIlIIIIlI(0.3f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII).llllIIIIlIIIlIlllIll(1.0f).IlIlIlIlIlllllllllIl("lightgem"));
        llllIIIIlIIIlIlllIll(90, "portal", new ab().llIllIIIIIllIlIIIIlI(-1.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII).llllIIIIlIIIlIlllIll(0.75f).IlIlIlIlIlllllllllIl("portal"));
        llllIIIIlIIIlIlllIll(91, "lit_pumpkin", new aj().llIllIIIIIllIlIIIIlI(1.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll(1.0f).IlIlIlIlIlllllllllIl("litpumpkin"));
        llllIIIIlIIIlIlllIll(92, "cake", new lllllIlIIIlIlIIlllII().llIllIIIIIllIlIIIIlI(0.5f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl).IlIlIlIlIlllllllllIl("cake").IIlllIIIlIlllIIlllII());
        llllIIIIlIIIlIlllIll(93, "unpowered_repeater", new be(false).llIllIIIIIllIlIIIIlI(0.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl).IlIlIlIlIlllllllllIl("diode").IIlllIIIlIlllIIlllII());
        llllIIIIlIIIlIlllIll(94, "powered_repeater", new be(true).llIllIIIIIllIlIIIIlI(0.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl).IlIlIlIlIlllllllllIl("diode").IIlllIIIlIlllIIlllII());
        llllIIIIlIIIlIlllIll(95, "stained_glass", new ck(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIIIIIIlllIlIllIl).llIllIIIIIllIlIIIIlI(0.3f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII).IlIlIlIlIlllllllllIl("stainedGlass"));
        llllIIIIlIIIlIlllIll(96, "trapdoor", new dg(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl).llIllIIIIIllIlIIIIlI(3.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl).IlIlIlIlIlllllllllIl("trapdoor").IIlllIIIlIlllIIlllII());
        llllIIIIlIIIlIlllIll(97, "monster_egg", new bs().llIllIIIIIllIlIIIIlI(0.75f).IlIlIlIlIlllllllllIl("monsterStoneEgg"));
        final llllIIIIlIIIlIlllIll ilIlIlIlIlllllllllIl7 = new cv().llIllIIIIIllIlIIIIlI(1.5f).IlIlIlIlIlllllllllIl(10.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl).IlIlIlIlIlllllllllIl("stonebricksmooth");
        llllIIIIlIIIlIlllIll(98, "stonebrick", ilIlIlIlIlllllllllIl7);
        llllIIIIlIIIlIlllIll(99, "brown_mushroom_block", new net.minecraft.llllIIIIlIIIlIlllIll.IIIIIlllIlIIIIIIIllI(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl, net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl3).llIllIIIIIllIlIIIIlI(0.2f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl).IlIlIlIlIlllllllllIl("mushroom"));
        llllIIIIlIIIlIlllIll(100, "red_mushroom_block", new net.minecraft.llllIIIIlIIIlIlllIll.IIIIIlllIlIIIIIIIllI(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl, net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII, ilIlIlIlIlllllllllIl4).llIllIIIIIllIlIIIIlI(0.2f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl).IlIlIlIlIlllllllllIl("mushroom"));
        llllIIIIlIIIlIlllIll(101, "iron_bars", new u(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl, true).llIllIIIIIllIlIIIIlI(5.0f).IlIlIlIlIlllllllllIl(10.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII).IlIlIlIlIlllllllllIl("fenceIron"));
        llllIIIIlIIIlIlllIll(102, "glass_pane", new u(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIIIIIIlllIlIllIl, false).llIllIIIIIllIlIIIIlI(0.3f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII).IlIlIlIlIlllllllllIl("thinGlass"));
        final llllIIIIlIIIlIlllIll ilIlIlIlIlllllllllIl8 = new b().llIllIIIIIllIlIIIIlI(1.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl).IlIlIlIlIlllllllllIl("melon");
        llllIIIIlIIIlIlllIll(103, "melon_block", ilIlIlIlIlllllllllIl8);
        llllIIIIlIIIlIlllIll(104, "pumpkin_stem", new cr(ilIlIlIlIlllllllllIl6).llIllIIIIIllIlIIIIlI(0.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl).IlIlIlIlIlllllllllIl("pumpkinStem"));
        llllIIIIlIIIlIlllIll(105, "melon_stem", new cr(ilIlIlIlIlllllllllIl8).llIllIIIIIllIlIIIIlI(0.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl).IlIlIlIlIlllllllllIl("pumpkinStem"));
        llllIIIIlIIIlIlllIll(106, "vine", new dk().llIllIIIIIllIlIIIIlI(0.2f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl).IlIlIlIlIlllllllllIl("vine"));
        llllIIIIlIIIlIlllIll(107, "fence_gate", new llllIllllIllllIlIlII(aa.llllIIIIlIIIlIlllIll).llIllIIIIIllIlIIIIlI(2.0f).IlIlIlIlIlllllllllIl(5.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl).IlIlIlIlIlllllllllIl("fenceGate"));
        llllIIIIlIIIlIlllIll(108, "brick_stairs", new cm(llllIIIIlIIIlIlllIll2.lllIllIIIllllllIllll()).IlIlIlIlIlllllllllIl("stairsBrick"));
        llllIIIIlIIIlIlllIll(109, "stone_brick_stairs", new cm(ilIlIlIlIlllllllllIl7.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(cv.IIIIIIIIIlllIllIlIlI, cw.llllIIIIlIIIlIlllIll)).IlIlIlIlIlllllllllIl("stairsStoneBrickSmooth"));
        llllIIIIlIIIlIlllIll(110, "mycelium", new net.minecraft.llllIIIIlIIIlIlllIll.e().llIllIIIIIllIlIIIIlI(0.6f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl).IlIlIlIlIlllllllllIl("mycel"));
        llllIIIIlIIIlIlllIll(111, "waterlily", new lIIlIIIIIIIlIIlIlIIl().llIllIIIIIllIlIIIIlI(0.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl).IlIlIlIlIlllllllllIl("waterlily"));
        final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll3 = new f().llIllIIIIIllIlIIIIlI(2.0f).IlIlIlIlIlllllllllIl(10.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl).IlIlIlIlIlllllllllIl("netherBrick").llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl);
        llllIIIIlIIIlIlllIll(112, "nether_brick", llllIIIIlIIIlIlllIll3);
        llllIIIIlIIIlIlllIll(113, "nether_brick_fence", new IIlllllIllIllIlIlIII(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI, net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl).llIllIIIIIllIlIIIIlI(2.0f).IlIlIlIlIlllllllllIl(10.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl).IlIlIlIlIlllllllllIl("netherFence"));
        llllIIIIlIIIlIlllIll(114, "nether_brick_stairs", new cm(llllIIIIlIIIlIlllIll3.lllIllIIIllllllIllll()).IlIlIlIlIlllllllllIl("stairsNetherBrick"));
        llllIIIIlIIIlIlllIll(115, "nether_wart", new g().IlIlIlIlIlllllllllIl("netherStalk"));
        llllIIIIlIIIlIlllIll(116, "enchanting_table", new lIllIIIIIlllIIlIIllI().llIllIIIIIllIlIIIIlI(5.0f).IlIlIlIlIlllllllllIl(2000.0f).IlIlIlIlIlllllllllIl("enchantmentTable"));
        llllIIIIlIIIlIlllIll(117, "brewing_stand", new net.minecraft.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII().llIllIIIIIllIlIIIIlI(0.5f).llllIIIIlIIIlIlllIll(0.125f).IlIlIlIlIlllllllllIl("brewingStand"));
        llllIIIIlIIIlIlllIll(118, "cauldron", new net.minecraft.llllIIIIlIIIlIlllIll.IIlllIIIlIlllIIlllII().llIllIIIIIllIlIIIIlI(2.0f).IlIlIlIlIlllllllllIl("cauldron"));
        llllIIIIlIIIlIlllIll(119, "end_portal", new lIlIIlllIIlIIlIlllIl(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llIIlllIIlllIIllIllI).llIllIIIIIllIlIIIIlI(-1.0f).IlIlIlIlIlllllllllIl(6000000.0f));
        llllIIIIlIIIlIlllIll(120, "end_portal_frame", new llIIIllIlIllIllIIIIl().llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII).llllIIIIlIIIlIlllIll(0.125f).llIllIIIIIllIlIIIIlI(-1.0f).IlIlIlIlIlllllllllIl("endPortalFrame").IlIlIlIlIlllllllllIl(6000000.0f).llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI));
        llllIIIIlIIIlIlllIll(121, "end_stone", new llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI, net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl).llIllIIIIIllIlIIIIlI(3.0f).IlIlIlIlIlllllllllIl(15.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl).IlIlIlIlIlllllllllIl("whiteStone").llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl));
        llllIIIIlIIIlIlllIll(122, "dragon_egg", new IlIIllIIllIIllIIlIIl().llIllIIIIIllIlIIIIlI(3.0f).IlIlIlIlIlllllllllIl(15.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl).llllIIIIlIIIlIlllIll(0.125f).IlIlIlIlIlllllllllIl("dragonEgg"));
        llllIIIIlIIIlIlllIll(123, "redstone_lamp", new bc(false).llIllIIIIIllIlIIIIlI(0.3f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII).IlIlIlIlIlllllllllIl("redstoneLight").llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl));
        llllIIIIlIIIlIlllIll(124, "lit_redstone_lamp", new bc(true).llIllIIIIIllIlIIIIlI(0.3f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII).IlIlIlIlIlllllllllIl("redstoneLight"));
        llllIIIIlIIIlIlllIll(125, "double_wooden_slab", new llIIIlIlllIllIIlIllI().llIllIIIIIllIlIIIIlI(2.0f).IlIlIlIlIlllllllllIl(5.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl).IlIlIlIlIlllllllllIl("woodSlab"));
        llllIIIIlIIIlIlllIll(126, "wooden_slab", new net.minecraft.llllIIIIlIIIlIlllIll.llIlllIlllllIIllIIII().llIllIIIIIllIlIIIIlI(2.0f).IlIlIlIlIlllllllllIl(5.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl).IlIlIlIlIlllllllllIl("woodSlab"));
        llllIIIIlIIIlIlllIll(127, "cocoa", new IIIllllllIllIIIlllIl().llIllIIIIIllIlIIIIlI(0.2f).IlIlIlIlIlllllllllIl(5.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl).IlIlIlIlIlllllllllIl("cocoa"));
        llllIIIIlIIIlIlllIll(128, "sandstone_stairs", new cm(ilIlIlIlIlllllllllIl2.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(bn.IIIIIIIIIlllIllIlIlI, bo.llIllIIIIIllIlIIIIlI)).IlIlIlIlIlllllllllIl("stairsSandStone"));
        llllIIIIlIIIlIlllIll(129, "emerald_ore", new s().llIllIIIIIllIlIIIIlI(3.0f).IlIlIlIlIlllllllllIl(5.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl).IlIlIlIlIlllllllllIl("oreEmerald"));
        llllIIIIlIIIlIlllIll(130, "ender_chest", new IIIllIIIlIlIIllIIIlI().llIllIIIIIllIlIIIIlI(22.5f).IlIlIlIlIlllllllllIl(1000.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl).IlIlIlIlIlllllllllIl("enderChest").llllIIIIlIIIlIlllIll(0.5f));
        llllIIIIlIIIlIlllIll(131, "tripwire_hook", new dj().IlIlIlIlIlllllllllIl("tripWireSource"));
        llllIIIIlIIIlIlllIll(132, "tripwire", new di().IlIlIlIlIlllllllllIl("tripWire"));
        llllIIIIlIIIlIlllIll(133, "emerald_block", new llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl, net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IIIllllllIllIIIlllIl).llIllIIIIIllIlIIIIlI(5.0f).IlIlIlIlIlllllllllIl(10.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII).IlIlIlIlIlllllllllIl("blockEmerald").llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl));
        llllIIIIlIIIlIlllIll(134, "spruce_stairs", new cm(ilIlIlIlIlllllllllIl.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(z.IIIIIIIIIlllIllIlIlI, aa.IlIlIlIlIlllllllllIl)).IlIlIlIlIlllllllllIl("stairsWoodSpruce"));
        llllIIIIlIIIlIlllIll(135, "birch_stairs", new cm(ilIlIlIlIlllllllllIl.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(z.IIIIIIIIIlllIllIlIlI, aa.llIllIIIIIllIlIIIIlI)).IlIlIlIlIlllllllllIl("stairsWoodBirch"));
        llllIIIIlIIIlIlllIll(136, "jungle_stairs", new cm(ilIlIlIlIlllllllllIl.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(z.IIIIIIIIIlllIllIlIlI, aa.IlIIIlIlIIIllIlIlIIl)).IlIlIlIlIlllllllllIl("stairsWoodJungle"));
        llllIIIIlIIIlIlllIll(137, "command_block", new IIIIIllIIIIlIIIIllIl().lIlIlIIIllIIllIIIllI().IlIlIlIlIlllllllllIl(6000000.0f).IlIlIlIlIlllllllllIl("commandBlock"));
        llllIIIIlIIIlIlllIll(138, "beacon", new IlIllIlIlIIIlIlIlIII().IlIlIlIlIlllllllllIl("beacon").llllIIIIlIIIlIlllIll(1.0f));
        llllIIIIlIIIlIlllIll(139, "cobblestone_wall", new dl(llllIIIIlIIIlIlllIll).IlIlIlIlIlllllllllIl("cobbleWall"));
        llllIIIIlIIIlIlllIll(140, "flower_pot", new IlIIIIIlIIllIIlIlIll().llIllIIIIIllIlIIIIlI(0.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI).IlIlIlIlIlllllllllIl("flowerPot"));
        llllIIIIlIIIlIlllIll(141, "carrots", new llIIlllIIlllIIllIllI().IlIlIlIlIlllllllllIl("carrots"));
        llllIIIIlIIIlIlllIll(142, "potatoes", new ad().IlIlIlIlIlllllllllIl("potatoes"));
        llllIIIIlIIIlIlllIll(143, "wooden_button", new IIlllIlIIllIlIlIlIIl().llIllIIIIIllIlIIIIlI(0.5f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl).IlIlIlIlIlllllllllIl("button"));
        llllIIIIlIIIlIlllIll(144, "skull", new ca().llIllIIIIIllIlIIIIlI(1.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl).IlIlIlIlIlllllllllIl("skull"));
        llllIIIIlIIIlIlllIll(145, "anvil", new net.minecraft.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII().llIllIIIIIllIlIIIIlI(5.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IIIIlllIIIIIIlIIIlll).IlIlIlIlIlllllllllIl(2000.0f).IlIlIlIlIlllllllllIl("anvil"));
        llllIIIIlIIIlIlllIll(146, "trapped_chest", new IIlIIIIIllIlIIIlIIll(1).llIllIIIIIllIlIIIIlI(2.5f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl).IlIlIlIlIlllllllllIl("chestTrap"));
        llllIIIIlIIIlIlllIll(147, "light_weighted_pressure_plate", new ag(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl, 15, net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IIlllIIIlIlllIIlllII).llIllIIIIIllIlIIIIlI(0.5f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl).IlIlIlIlIlllllllllIl("weightedPlate_light"));
        llllIIIIlIIIlIlllIll(148, "heavy_weighted_pressure_plate", new ag(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl, 150).llIllIIIIIllIlIIIIlI(0.5f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl).IlIlIlIlIlllllllllIl("weightedPlate_heavy"));
        llllIIIIlIIIlIlllIll(149, "unpowered_comparator", new ay(false).llIllIIIIIllIlIIIIlI(0.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl).IlIlIlIlIlllllllllIl("comparator").IIlllIIIlIlllIIlllII());
        llllIIIIlIIIlIlllIll(150, "powered_comparator", new ay(true).llIllIIIIIllIlIIIIlI(0.0f).llllIIIIlIIIlIlllIll(0.625f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl).IlIlIlIlIlllllllllIl("comparator").IIlllIIIlIlllIIlllII());
        llllIIIIlIIIlIlllIll(151, "daylight_detector", new net.minecraft.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(false));
        llllIIIIlIIIlIlllIll(152, "redstone_block", new IIIIIIIIIlllIllIlIlI(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl, net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl).llIllIIIIIllIlIIIIlI(5.0f).IlIlIlIlIlllllllllIl(10.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII).IlIlIlIlIlllllllllIl("blockRedstone").llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl));
        llllIIIIlIIIlIlllIll(153, "quartz_ore", new s(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl).llIllIIIIIllIlIIIIlI(3.0f).IlIlIlIlIlllllllllIl(5.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl).IlIlIlIlIlllllllllIl("netherquartz"));
        llllIIIIlIIIlIlllIll(154, "hopper", new lllIlIIIIIlIlllllIlI().llIllIIIIIllIlIIIIlI(3.0f).IlIlIlIlIlllllllllIl(8.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII).IlIlIlIlIlllllllllIl("hopper"));
        final llllIIIIlIIIlIlllIll ilIlIlIlIlllllllllIl9 = new al().llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl).llIllIIIIIllIlIIIIlI(0.8f).IlIlIlIlIlllllllllIl("quartzBlock");
        llllIIIIlIIIlIlllIll(155, "quartz_block", ilIlIlIlIlllllllllIl9);
        llllIIIIlIIIlIlllIll(156, "quartz_stairs", new cm(ilIlIlIlIlllllllllIl9.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(al.IIIIIIIIIlllIllIlIlI, am.llllIIIIlIIIlIlllIll)).IlIlIlIlIlllllllllIl("stairsQuartz"));
        llllIIIIlIIIlIlllIll(157, "activator_rail", new at().llIllIIIIIllIlIIIIlI(0.7f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII).IlIlIlIlIlllllllllIl("activatorRail"));
        llllIIIIlIIIlIlllIll(158, "dropper", new lllllIIIIIlIlIIIIIIl().llIllIIIIIllIlIIIIlI(3.5f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl).IlIlIlIlIlllllllllIl("dropper"));
        llllIIIIlIIIlIlllIll(159, "stained_hardened_clay", new IlIIIlIIIllllIlIlIlI(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI).llIllIIIIIllIlIIIIlI(1.25f).IlIlIlIlIlllllllllIl(7.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl).IlIlIlIlIlllllllllIl("clayHardenedStained"));
        llllIIIIlIIIlIlllIll(160, "stained_glass_pane", new cl().llIllIIIIIllIlIIIIlI(0.3f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII).IlIlIlIlIlllllllllIl("thinStainedGlass"));
        llllIIIIlIIIlIlllIll(161, "leaves2", new i().IlIlIlIlIlllllllllIl("leaves"));
        llllIIIIlIIIlIlllIll(162, "log2", new k().IlIlIlIlIlllllllllIl("log"));
        llllIIIIlIIIlIlllIll(163, "acacia_stairs", new cm(ilIlIlIlIlllllllllIl.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(z.IIIIIIIIIlllIllIlIlI, aa.IlIlIIIllIllIIIIIllI)).IlIlIlIlIlllllllllIl("stairsWoodAcacia"));
        llllIIIIlIIIlIlllIll(164, "dark_oak_stairs", new cm(ilIlIlIlIlllllllllIl.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(z.IIIIIIIIIlllIllIlIlI, aa.IllIIlllIIIIlllIIlIl)).IlIlIlIlIlllllllllIl("stairsWoodDarkOak"));
        llllIIIIlIIIlIlllIll(165, "slime", new ce().IlIlIlIlIlllllllllIl("slime").llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll));
        llllIIIIlIIIlIlllIll(166, "barrier", new net.minecraft.llllIIIIlIIIlIlllIll.IIIIlllIIIIIIlIIIlll().IlIlIlIlIlllllllllIl("barrier"));
        llllIIIIlIIIlIlllIll(167, "iron_trapdoor", new dg(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl).llIllIIIIIllIlIIIIlI(5.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII).IlIlIlIlIlllllllllIl("ironTrapdoor").IIlllIIIlIlllIIlllII());
        llllIIIIlIIIlIlllIll(168, "prismarine", new ah().llIllIIIIIllIlIIIIlI(1.5f).IlIlIlIlIlllllllllIl(10.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl).IlIlIlIlIlllllllllIl("prismarine"));
        llllIIIIlIIIlIlllIll(169, "sea_lantern", new bq(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIIIIIIlllIlIllIl).llIllIIIIIllIlIIIIlI(0.3f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII).llllIIIIlIIIlIlllIll(1.0f).IlIlIlIlIlllllllllIl("seaLantern"));
        llllIIIIlIIIlIlllIll(170, "hay_block", new net.minecraft.llllIIIIlIIIlIlllIll.IlIllllIIlIllIlIlIll().llIllIIIIIllIlIIIIlI(0.5f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl).IlIlIlIlIlllllllllIl("hayBlock").llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl));
        llllIIIIlIIIlIlllIll(171, "carpet", new lIllllllIIllIlIlIlII().llIllIIIIIllIlIIIIlI(0.1f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl).IlIlIlIlIlllllllllIl("woolCarpet").IlIIIlIlIIIllIlIlIIl(0));
        llllIIIIlIIIlIlllIll(172, "hardened_clay", new lllllIlIlIlllIlllIlI().llIllIIIIIllIlIIIIlI(1.25f).IlIlIlIlIlllllllllIl(7.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl).IlIlIlIlIlllllllllIl("clayHardened"));
        llllIIIIlIIIlIlllIll(173, "coal_block", new llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI, net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llIIlllIIlllIIllIllI).llIllIIIIIllIlIIIIlI(5.0f).IlIlIlIlIlllllllllIl(10.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl).IlIlIlIlIlllllllllIl("blockCoal").llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl));
        llllIIIIlIIIlIlllIll(174, "packed_ice", new t().llIllIIIIIllIlIIIIlI(0.5f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII).IlIlIlIlIlllllllllIl("icePacked"));
        llllIIIIlIIIlIlllIll(175, "double_plant", new lIIlIIIlIllIlIllIIIl());
        llllIIIIlIIIlIlllIll(176, "standing_banner", new IlIlIIIllIIllIlllllI().llIllIIIIIllIlIIIIlI(1.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl).IlIlIlIlIlllllllllIl("banner").IIlllIIIlIlllIIlllII());
        llllIIIIlIIIlIlllIll(177, "wall_banner", new net.minecraft.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI().llIllIIIIIllIlIIIIlI(1.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl).IlIlIlIlIlllllllllIl("banner").IIlllIIIlIlllIIlllII());
        llllIIIIlIIIlIlllIll(178, "daylight_detector_inverted", new net.minecraft.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(true));
        final llllIIIIlIIIlIlllIll ilIlIlIlIlllllllllIl10 = new aw().llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl).llIllIIIIIllIlIIIIlI(0.8f).IlIlIlIlIlllllllllIl("redSandStone");
        llllIIIIlIIIlIlllIll(179, "red_sandstone", ilIlIlIlIlllllllllIl10);
        llllIIIIlIIIlIlllIll(180, "red_sandstone_stairs", new cm(ilIlIlIlIlllllllllIl10.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(aw.IIIIIIIIIlllIllIlIlI, ax.llIllIIIIIllIlIIIIlI)).IlIlIlIlIlllllllllIl("stairsRedSandStone"));
        llllIIIIlIIIlIlllIll(181, "double_stone_slab2", new lIIIIlIlIllllIIlIllI().llIllIIIIIllIlIIIIlI(2.0f).IlIlIlIlIlllllllllIl(10.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl).IlIlIlIlIlllllllllIl("stoneSlab2"));
        llllIIIIlIIIlIlllIll(182, "stone_slab2", new IIlllIIIllIllIIlIlIl().llIllIIIIIllIlIIIIlI(2.0f).IlIlIlIlIlllllllllIl(10.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl).IlIlIlIlIlllllllllIl("stoneSlab2"));
        llllIIIIlIIIlIlllIll(183, "spruce_fence_gate", new llllIllllIllllIlIlII(aa.IlIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI(2.0f).IlIlIlIlIlllllllllIl(5.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl).IlIlIlIlIlllllllllIl("spruceFenceGate"));
        llllIIIIlIIIlIlllIll(184, "birch_fence_gate", new llllIllllIllllIlIlII(aa.llIllIIIIIllIlIIIIlI).llIllIIIIIllIlIIIIlI(2.0f).IlIlIlIlIlllllllllIl(5.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl).IlIlIlIlIlllllllllIl("birchFenceGate"));
        llllIIIIlIIIlIlllIll(185, "jungle_fence_gate", new llllIllllIllllIlIlII(aa.IlIIIlIlIIIllIlIlIIl).llIllIIIIIllIlIIIIlI(2.0f).IlIlIlIlIlllllllllIl(5.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl).IlIlIlIlIlllllllllIl("jungleFenceGate"));
        llllIIIIlIIIlIlllIll(186, "dark_oak_fence_gate", new llllIllllIllllIlIlII(aa.IllIIlllIIIIlllIIlIl).llIllIIIIIllIlIIIIlI(2.0f).IlIlIlIlIlllllllllIl(5.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl).IlIlIlIlIlllllllllIl("darkOakFenceGate"));
        llllIIIIlIIIlIlllIll(187, "acacia_fence_gate", new llllIllllIllllIlIlII(aa.IlIlIIIllIllIIIIIllI).llIllIIIIIllIlIIIIlI(2.0f).IlIlIlIlIlllllllllIl(5.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl).IlIlIlIlIlllllllllIl("acaciaFenceGate"));
        llllIIIIlIIIlIlllIll(188, "spruce_fence", new IIlllllIllIllIlIlIII(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl, aa.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI()).llIllIIIIIllIlIIIIlI(2.0f).IlIlIlIlIlllllllllIl(5.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl).IlIlIlIlIlllllllllIl("spruceFence"));
        llllIIIIlIIIlIlllIll(189, "birch_fence", new IIlllllIllIllIlIlIII(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl, aa.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI()).llIllIIIIIllIlIIIIlI(2.0f).IlIlIlIlIlllllllllIl(5.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl).IlIlIlIlIlllllllllIl("birchFence"));
        llllIIIIlIIIlIlllIll(190, "jungle_fence", new IIlllllIllIllIlIlIII(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl, aa.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI()).llIllIIIIIllIlIIIIlI(2.0f).IlIlIlIlIlllllllllIl(5.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl).IlIlIlIlIlllllllllIl("jungleFence"));
        llllIIIIlIIIlIlllIll(191, "dark_oak_fence", new IIlllllIllIllIlIlIII(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl, aa.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI()).llIllIIIIIllIlIIIIlI(2.0f).IlIlIlIlIlllllllllIl(5.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl).IlIlIlIlIlllllllllIl("darkOakFence"));
        llllIIIIlIIIlIlllIll(192, "acacia_fence", new IIlllllIllIllIlIlIII(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl, aa.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI()).llIllIIIIIllIlIIIIlI(2.0f).IlIlIlIlIlllllllllIl(5.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl).IlIlIlIlIlllllllllIl("acaciaFence"));
        llllIIIIlIIIlIlllIll(193, "spruce_door", new llIlIIIIIlIIlIlIIlll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl).llIllIIIIIllIlIIIIlI(3.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl).IlIlIlIlIlllllllllIl("doorSpruce").IIlllIIIlIlllIIlllII());
        llllIIIIlIIIlIlllIll(194, "birch_door", new llIlIIIIIlIIlIlIIlll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl).llIllIIIIIllIlIIIIlI(3.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl).IlIlIlIlIlllllllllIl("doorBirch").IIlllIIIlIlllIIlllII());
        llllIIIIlIIIlIlllIll(195, "jungle_door", new llIlIIIIIlIIlIlIIlll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl).llIllIIIIIllIlIIIIlI(3.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl).IlIlIlIlIlllllllllIl("doorJungle").IIlllIIIlIlllIIlllII());
        llllIIIIlIIIlIlllIll(196, "acacia_door", new llIlIIIIIlIIlIlIIlll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl).llIllIIIIIllIlIIIIlI(3.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl).IlIlIlIlIlllllllllIl("doorAcacia").IIlllIIIlIlllIIlllII());
        llllIIIIlIIIlIlllIll(197, "dark_oak_door", new llIlIIIIIlIIlIlIIlll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl).llIllIIIIIllIlIIIIlI(3.0f).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl).IlIlIlIlIlllllllllIl("doorDarkOak").IIlllIIIlIlllIIlllII());
        net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
        for (final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll4 : net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll) {
            if (llllIIIIlIIIlIlllIll4.llllllIllIllIlIllllI == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
                llllIIIIlIIIlIlllIll4.IIllIIllIIIlIlIIIIlI = false;
            }
            else {
                boolean iIllIIllIIIlIlIIIIlI = false;
                final boolean b = llllIIIIlIIIlIlllIll4 instanceof cm;
                final boolean b2 = llllIIIIlIIIlIlllIll4 instanceof cc;
                final boolean b3 = llllIIIIlIIIlIlllIll4 == ilIlIlIlIlllllllllIl5;
                final boolean lllIIIIlllllIlIIllIl = llllIIIIlIIIlIlllIll4.lllIIIIlllllIlIIllIl;
                final boolean b4 = llllIIIIlIIIlIlllIll4.IIlllIIlIllIllIlIIll == 0;
                if (b || b2 || b3 || lllIIIIlllllIlIIllIl || b4) {
                    iIllIIllIIIlIlIIIIlI = true;
                }
                llllIIIIlIIIlIlllIll4.IIllIIllIIIlIlIIIIlI = iIllIIllIIIlIlIIIIlI;
            }
        }
        for (final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll5 : net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll) {
            for (final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl : llllIIIIlIIIlIlllIll5.IlllIIIIlIIIlIlIlIIl().llllIIIIlIIIlIlllIll()) {
                net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl, net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll5) << 4 | llllIIIIlIIIlIlllIll5.llIllIIIIIllIlIIIIlI(llIIlIIIlIIIllIlIIIl));
            }
        }
    }
    
    private static void llllIIIIlIIIlIlllIll(final int n, final lIllllIllIllIIllllll lIllllIllIllIIllllll, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n, lIllllIllIllIIllllll, llllIIIIlIIIlIlllIll);
    }
    
    private static void llllIIIIlIIIlIlllIll(final int n, final String s, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll(n, new lIllllIllIllIIllllll(s), llllIIIIlIIIlIlllIll);
    }
}
