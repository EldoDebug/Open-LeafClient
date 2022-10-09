package net.minecraft.llIllIlIIIIllIlIIllI;

import net.minecraft.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import com.google.common.collect.*;
import com.google.common.base.*;

public class IlIIIlIlIIIllIlIlIIl
{
    public static final llIlIIIIllIlIIlIlIII llllIIIIlIIIlIlllIll;
    private static final Map llllIIIlIlllIlIIIIIl;
    protected static final UUID IlIlIlIlIlllllllllIl;
    private llllIIIIlIIIlIlllIll lIIIIlIIIIIlllIllIII;
    protected static Random llIllIIIIIllIlIIIIlI;
    protected int IlIIIlIlIIIllIlIlIIl;
    private int lIIIlllIIIllIIIllIII;
    protected boolean IlIlIIIllIllIIIIIllI;
    protected boolean IllIIlllIIIIlllIIlIl;
    private IlIIIlIlIIIllIlIlIIl llIIlIIIlIIIllIlIIIl;
    private String llIllIlIIIIllIlIIllI;
    private String lIlIlIIIllIIllIIIllI;
    
    static {
        llllIIIIlIIIlIlllIll = new llIlIIIIllIlIIlIlIII();
        llllIIIlIlllIlIIIIIl = Maps.newHashMap();
        IlIlIlIlIlllllllllIl = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
        IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI = new Random();
    }
    
    public IlIIIlIlIIIllIlIlIIl() {
        this.IlIIIlIlIIIllIlIlIIl = 64;
    }
    
    public static int llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        return (ilIIIlIlIIIllIlIlIIl == null) ? 0 : IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl(ilIIIlIlIIIllIlIlIIl);
    }
    
    public static IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final int n) {
        return (IlIIIlIlIIIllIlIlIIl)IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n);
    }
    
    public static IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return IlIIIlIlIIIllIlIlIIl.llllIIIlIlllIlIIIIIl.get(llllIIIIlIIIlIlllIll);
    }
    
    public static IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final String s) {
        final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = (IlIIIlIlIIIllIlIlIIl)IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new lIllllIllIllIIllllll(s));
        if (ilIIIlIlIIIllIlIlIIl == null) {
            try {
                return llllIIIIlIIIlIlllIll(Integer.parseInt(s));
            }
            catch (NumberFormatException ex) {}
        }
        return ilIIIlIlIIIllIlIlIIl;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        return false;
    }
    
    public IlIIIlIlIIIllIlIlIIl IlIlIlIlIlllllllllIl(final int ilIIIlIlIIIllIlIlIIl) {
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        return this;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final float n, final float n2, final float n3) {
        return false;
    }
    
    public float llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return 1.0f;
    }
    
    public lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return lllIIIIlIlIllIIlIIIl;
    }
    
    public lllIIIIlIlIllIIlIIIl IlIlIlIlIlllllllllIl(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return lllIIIIlIlIllIIlIIIl;
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public int llIllIIIIIllIlIIIIlI(final int n) {
        return 0;
    }
    
    public boolean IlIlIlIlIlllllllllIl() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    protected IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final boolean illIIlllIIIIlllIIlIl) {
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        return this;
    }
    
    public int llIllIIIIIllIlIIIIlI() {
        return this.lIIIlllIIIllIIIllIII;
    }
    
    protected IlIIIlIlIIIllIlIlIIl IlIIIlIlIIIllIlIlIIl(final int liiIlllIIIllIIIllIII) {
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
        return this;
    }
    
    public boolean IlIIIlIlIIIllIlIlIIl() {
        return this.lIIIlllIIIllIIIllIII > 0 && !this.IllIIlllIIIIlllIIlIl;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl2) {
        return false;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        return false;
    }
    
    public boolean IlIlIlIlIlllllllllIl(final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return false;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        return false;
    }
    
    public IlIIIlIlIIIllIlIlIIl IlIlIIIllIllIIIIIllI() {
        this.IlIlIIIllIllIIIIIllI = true;
        return this;
    }
    
    public boolean IllIIlllIIIIlllIIlIl() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public boolean llllIIIlIlllIlIIIIIl() {
        return false;
    }
    
    public IlIIIlIlIIIllIlIlIIl IlIlIlIlIlllllllllIl(final String lIlIlIIIllIIllIIIllI) {
        this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI;
        return this;
    }
    
    public String llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        final String ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl(lllIIIIlIlIllIIlIIIl);
        return (ilIlIlIlIlllllllllIl == null) ? "" : lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
    }
    
    public String lIIIIlIIIIIlllIllIII() {
        return "item." + this.lIlIlIIIllIIllIIIllI;
    }
    
    public String IlIlIlIlIlllllllllIl(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return "item." + this.lIlIlIIIllIIllIIIllI;
    }
    
    public IlIIIlIlIIIllIlIlIIl IlIlIlIlIlllllllllIl(final IlIIIlIlIIIllIlIlIIl llIIlIIIlIIIllIlIIIl) {
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        return this;
    }
    
    public boolean lIIIlllIIIllIIIllIII() {
        return true;
    }
    
    public IlIIIlIlIIIllIlIlIIl llIIlIIIlIIIllIlIIIl() {
        return this.llIIlIIIlIIIllIlIIIl;
    }
    
    public boolean llIllIlIIIIllIlIIllI() {
        return this.llIIlIIIlIIIllIlIIIl != null;
    }
    
    public int llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final int n) {
        return 16777215;
    }
    
    public void llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final int n, final boolean b) {
    }
    
    public void llIllIIIIIllIlIIIIlI(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
    }
    
    public boolean lIlIlIIIllIIllIIIllI() {
        return false;
    }
    
    public net.minecraft.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return net.minecraft.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll;
    }
    
    public int IlIIIlIlIIIllIlIlIIl(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return 0;
    }
    
    public void llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final int n) {
    }
    
    protected IlIIIlIlIIIllIlIlIIl llIllIIIIIllIlIIIIlI(final String llIllIlIIIIllIlIIllI) {
        this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI;
        return this;
    }
    
    public String IlIlIIIllIllIIIIIllI(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return this.llIllIlIIIIllIlIIllI;
    }
    
    public boolean IllIIlllIIIIlllIIlIl(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return this.IlIlIIIllIllIIIIIllI(lllIIIIlIlIllIIlIIIl) != null;
    }
    
    public void llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final List list, final boolean b) {
    }
    
    public String llllIIIlIlllIlIIIIIl(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return new StringBuilder().append(lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll(String.valueOf(this.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl)) + ".name")).toString().trim();
    }
    
    public boolean lIIIIlIIIIIlllIllIII(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return lllIIIIlIlIllIIlIIIl.IlllllllIIIlIIIlIlII();
    }
    
    public net.minecraft.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI lIIIlllIIIllIIIllIII(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return lllIIIIlIlIllIIlIIIl.IlllllllIIIlIIIlIlII() ? net.minecraft.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI : net.minecraft.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll;
    }
    
    public boolean llIIlIIIlIIIllIlIIIl(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return this.llllIIIIlIIIlIlllIll() == 1 && this.IlIIIlIlIIIllIlIlIIl();
    }
    
    protected llIlllIlllllIIllIIII llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final boolean b) {
        final float llllllIllIllIlIllllI = llllIIIIlIIIlIlllIll.llllllIllIllIlIllllI;
        final float iIlIIIIIllIlIIIlIIll = llllIIIIlIIIlIlllIll.IIlIIIIIllIlIIIlIIll;
        final e e = new e(llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl, llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII + llllIIIIlIIIlIlllIll.llllIlIllllIIlIIlIlI(), llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII);
        final float ilIlIlIlIlllllllllIl = llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(-iIlIIIIIllIlIIIlIIll * 0.017453292f - 3.1415927f);
        final float llllIIIIlIIIlIlllIll2 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(-iIlIIIIIllIlIIIlIIll * 0.017453292f - 3.1415927f);
        final float n = -llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(-llllllIllIllIlIllllI * 0.017453292f);
        final float llllIIIIlIIIlIlllIll3 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(-llllllIllIllIlIllllI * 0.017453292f);
        final float n2 = llllIIIIlIIIlIlllIll2 * n;
        final float n3 = ilIlIlIlIlllllllllIl * n;
        final double n4 = 5.0;
        return illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(e, e.IlIlIlIlIlllllllllIl(n2 * n4, llllIIIIlIIIlIlllIll3 * n4, n3 * n4), b, !b, false);
    }
    
    public int IlIlIIIllIIllIlllllI() {
        return 0;
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final List list) {
        list.add(new lllIIIIlIlIllIIlIIIl(ilIIIlIlIIIllIlIlIIl, 1, 0));
    }
    
    public llllIIIIlIIIlIlllIll IIIIlllIIIIIIlIIIlll() {
        return this.lIIIIlIIIIIlllIllIII;
    }
    
    public IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll liiiIlIIIIIlllIllIII) {
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        return this;
    }
    
    public boolean llllIIllllIlIlIIIIll() {
        return false;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl2) {
        return false;
    }
    
    public Multimap IlIllIlIlIIIlIlIlIII() {
        return (Multimap)HashMultimap.create();
    }
    
    public static void IIlllIIlIllIllIlIIll() {
        llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl, new IIllIIIlIIlIlIlIIIII(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl, (Function)new IlIlIIIllIllIIIIIllI()).IlIIIlIlIIIllIlIlIIl("stone"));
        llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI, new net.minecraft.llIllIlIIIIllIlIIllI.lllIllIIIllllllIllll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI, false));
        llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl, new IIllIIIlIIlIlIlIIIII(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl, (Function)new net.minecraft.llIllIlIIIIllIlIIllI.IIIIlllIIIIIIlIIIlll()).IlIIIlIlIIIllIlIlIIl("dirt"));
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI);
        llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl, new IIllIIIlIIlIlIlIIIII(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl, (Function)new llllIIllllIlIlIIIIll()).IlIIIlIlIIIllIlIlIIl("wood"));
        llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl, new IIllIIIlIIlIlIlIIIII(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl, (Function)new IlIllIlIlIIIlIlIlIII()).IlIIIlIlIIIllIlIlIIl("sapling"));
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII);
        llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI, new IIllIIIlIIlIlIlIIIII(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI, (Function)new IIlllIIlIllIllIlIIll()).IlIIIlIlIIIllIlIlIIl("sand"));
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIlllIIIIIIlIIIlll);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIllIlIlIIIlIlIlIII);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIIlIllIllIlIIll);
        llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl, new IIllIIIlIIlIlIlIIIII(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl, (Function)new net.minecraft.llIllIlIIIIllIlIIllI.lllIIIIlllllIlIIllIl()).IlIIIlIlIIIllIlIlIIl("log"));
        llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl, new IIllIIIlIIlIlIlIIIII(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl, (Function)new IlIlIIIIIIlllIlIllIl()).IlIIIlIlIIIllIlIlIIl("log"));
        llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI, new IlIIlllllIIllIIlllll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI).IlIIIlIlIIIllIlIlIIl("leaves"));
        llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll, new IlIIlllllIIllIIlllll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll).IlIIIlIlIIIllIlIlIIl("leaves"));
        llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIlIIlIlIIlllIl, new IIllIIIlIIlIlIlIIIII(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIlIIlIlIIlllIl, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIlIIlIlIIlllIl, (Function)new IIllIIllIIIlIlIIIIlI()).IlIIIlIlIIIllIlIlIIl("sponge"));
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIllllllllIIIIlII);
        llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl, new IIllIIIlIIlIlIlIIIII(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl, (Function)new IIIlIIIlIlIIlllIIlll()).IlIIIlIlIIIllIlIlIIl("sandStone"));
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIlllIIlllIIllIllI);
        llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIIIlIlllIIlllII, new IllllIIlIlIllIIIllII(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIIIlIlllIIlllII));
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlIIIIIllIlIIIlIIll);
        llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllllIllIllIlIllllI, new net.minecraft.llIllIlIIIIllIlIIllI.lllIllIIIllllllIllll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllllIllIllIlIllllI, true).llllIIIIlIIIlIlllIll(new String[] { "shrub", "grass", "fern" }));
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIllllllIllIIIlllIl);
        llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIlIIIllllIlIlIlI, new IllllIIlIlIllIIIllII(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIlIIIllllIlIlIlI));
        llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIIIIIIlllIllIlIlI, new IIllllIIIlIIIIIIllIl(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIIIIIIlllIllIlIlI).IlIIIlIlIIIllIlIlIIl("cloth"));
        llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlllIIIIlIIIlIlIlIIl, new IIllIIIlIIlIlIlIIIII(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlllIIIIlIIIlIlIlIIl, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlllIIIIlIIIlIlIlIIl, (Function)new IllIIlllIIIIlllIIlIl()).IlIIIlIlIIIllIlIlIIl("flower"));
        llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll, new IIllIIIlIIlIlIlIIIII(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll, (Function)new llllIIIlIlllIlIIIIIl()).IlIIIlIlIIIllIlIlIIl("rose"));
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIlIlIIIIIIIllII);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlIlIlIIlIllIIIIIIl);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIllIIIIlIIlIlllII);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIllllIIlIIlIlIlIll);
        llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIlIIIIIlIIlIlIIlll, new net.minecraft.llIllIlIIIIllIlIIllI.llIlIIIIllIlIIlIlIII(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIlIIIIIlIIlIlIIlll, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIlIIIIIlIIlIlIIlll, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIllIlllIllllIIllI).IlIIIlIlIIIllIlIlIIl("stoneSlab"));
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIlIlIIIlIIlIlIlII);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIlIIllIllIIlIllII);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIlIIIlIllIlIllIIIl);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlIIIlllIllIllIlIII);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIlIlIlllIIlIlIlllIl);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIIIIIlIllIIlIIIll);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIIlIlllIllIIlIllI);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIllIIllIIllIIlIIl);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllllIIIIIlIlIIIIIIl);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIllIIIIIlllIIlIIllI);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIlIIlllIIlIIlIlllIl);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIIllIlIllIllIIIIl);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIIlllIIIlIlllII);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIlllllIIllIIlllll);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllllIIlIlIIIlIlIIIl);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllllIIllIlIllIllllI);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIIIlIIllIIlIlIll);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllllIIlIlIllIIIllII);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIllllIIIlIllIlIIll);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIIlIlIIIlIIIIlIl);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIllIIllIIIIIIlIIlI);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIIIIllllIlIIIIIII);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllllIlIlIlllIlllIlI);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIllllIIlIllIlIlIll);
        llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIlIIIIIlIlllllIlI, new IIIIIlllIlIIIIIIIllI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIlIIIIIlIlllllIlI));
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIlIIIIllIlIIlIlIII);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIIlllIlIIIIIIIllI);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllllIIIIIIIlllIIll);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlIlllIlIlllIlIllll);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlIlIllIIlIIIl);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIlllIllIIIIllllII);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIllIlIIIllllllIIlII);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIllIIllIIlIIIIlIIl);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIlllIlllllIIlllIll);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIllIIlIlIlllllIIIII);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIlIIIIIIIlIIlIlIIl);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIlllIIlIlllllIIlI);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIlIllllIIlIIlIlI);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.a);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.b);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.d);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.h);
        llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.i, new IIllIIIlIIlIlIlIIIII(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.i, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.i, (Function)new lIIIIlIIIIIlllIllIII()).IlIIIlIlIIIllIlIlIIl("monsterStoneEgg"));
        llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.j, new IIllIIIlIIlIlIlIIIII(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.j, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.j, (Function)new lIIIlllIIIllIIIllIII()).IlIIIlIlIIIllIlIlIIl("stonebricksmooth"));
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.k);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.l);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.m);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.n);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.o);
        llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.r, new net.minecraft.llIllIlIIIIllIlIIllI.lllIllIIIllllllIllll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.r, false));
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.s);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.t);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.u);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.v);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.w);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.x);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.y);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.z);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.A);
        llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.B, new lllllIIlIlIIIlIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.B));
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.D);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.E);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.G);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.K);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.L);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.M);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.N);
        llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.Q, new net.minecraft.llIllIlIIIIllIlIIllI.llIlIIIIllIlIIlIlIII(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.Q, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.Q, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.P).IlIIIlIlIIIllIlIlIIl("woodSlab"));
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.S);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.T);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.U);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.V);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.X);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.Y);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.Z);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aa);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ab);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ac);
        llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ad, new IIllIIIlIIlIlIlIIIII(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ad, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ad, (Function)new llIIlIIIlIIIllIlIIIl()).IlIIIlIlIIIllIlIlIIl("cobbleWall"));
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ah);
        llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aj, new net.minecraft.llIllIlIIIIllIlIIllI.IlllllllIIIlIIIlIlII(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aj).IlIIIlIlIIIllIlIlIIl("anvil"));
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ak);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.al);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.am);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ap);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ar);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.as);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.at);
        llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.au, new IIllIIIlIIlIlIlIIIII(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.au, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.au, new String[] { "default", "chiseled", "lines" }).IlIIIlIlIIIllIlIlIIl("quartzBlock"));
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.av);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aw);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ax);
        llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay, new IIllllIIIlIIIIIIllIl(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay).IlIIIlIlIIIllIlIlIIl("clayHardenedStained"));
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.az);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aA);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aB);
        llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aC, new IIllllIIIlIIIIIIllIl(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aC).IlIIIlIlIIIllIlIlIIl("woolCarpet"));
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aD);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aE);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aF);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aG);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aH);
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aI);
        llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aJ, new IIlIlIlIIlIllIIIIIIl(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aJ, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aJ, (Function)new llIllIlIIIIllIlIIllI()).IlIIIlIlIIIllIlIlIIl("doublePlant"));
        llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aK, new IIllllIIIlIIIIIIllIl(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aK).IlIIIlIlIIIllIlIlIIl("stainedGlass"));
        llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aL, new IIllllIIIlIIIIIIllIl(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aL).IlIIIlIlIIIllIlIlIIl("stainedGlassPane"));
        llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aM, new IIllIIIlIIlIlIlIIIII(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aM, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aM, (Function)new lIlIlIIIllIIllIIIllI()).IlIIIlIlIIIllIlIlIIl("prismarine"));
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aN);
        llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aQ, new IIllIIIlIIlIlIlIIIII(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aQ, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aQ, (Function)new IlIlIIIllIIllIlllllI()).IlIIIlIlIIIllIlIlIIl("redSandStone"));
        llIllIIIIIllIlIIIIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aR);
        llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aT, new net.minecraft.llIllIlIIIIllIlIIllI.llIlIIIIllIlIIlIlIII(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aT, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aT, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aS).IlIIIlIlIIIllIlIlIIl("stoneSlab2"));
        llllIIIIlIIIlIlllIll(256, "iron_shovel", new net.minecraft.llIllIlIIIIllIlIIllI.lIllllIllIllIIllllll(IlIlIIIlIIlIlIIlllIl.llIllIIIIIllIlIIIIlI).IlIlIlIlIlllllllllIl("shovelIron"));
        llllIIIIlIIIlIlllIll(257, "iron_pickaxe", new IlIIIIIlIIllIIlIlIll(IlIlIIIlIIlIlIIlllIl.llIllIIIIIllIlIIIIlI).IlIlIlIlIlllllllllIl("pickaxeIron"));
        llllIIIIlIIIlIlllIll(258, "iron_axe", new lllllIlIIIlIlIIlllII(IlIlIIIlIIlIlIIlllIl.llIllIIIIIllIlIIIIlI).IlIlIlIlIlllllllllIl("hatchetIron"));
        llllIIIIlIIIlIlllIll(259, "flint_and_steel", new IllIIlllllIIllIIllIl().IlIlIlIlIlllllllllIl("flintAndSteel"));
        llllIIIIlIIIlIlllIll(260, "apple", new lIllIIIIIlllIIlIIllI(4, 0.3f, false).IlIlIlIlIlllllllllIl("apple"));
        llllIIIIlIIIlIlllIll(261, "bow", new IIIllllllIllIIIlllIl().IlIlIlIlIlllllllllIl("bow"));
        llllIIIIlIIIlIlllIll(262, "arrow", new IlIIIlIlIIIllIlIlIIl().IlIlIlIlIlllllllllIl("arrow").llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl));
        llllIIIIlIIIlIlllIll(263, "coal", new IlllIIIIlIIIlIlIlIIl().IlIlIlIlIlllllllllIl("coal"));
        llllIIIIlIIIlIlllIll(264, "diamond", new IlIIIlIlIIIllIlIlIIl().IlIlIlIlIlllllllllIl("diamond").llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI));
        llllIIIIlIIIlIlllIll(265, "iron_ingot", new IlIIIlIlIIIllIlIlIIl().IlIlIlIlIlllllllllIl("ingotIron").llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI));
        llllIIIIlIIIlIlllIll(266, "gold_ingot", new IlIIIlIlIIIllIlIlIIl().IlIlIlIlIlllllllllIl("ingotGold").llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI));
        llllIIIIlIIIlIlllIll(267, "iron_sword", new IllIlllIllIIIIllllII(IlIlIIIlIIlIlIIlllIl.llIllIIIIIllIlIIIIlI).IlIlIlIlIlllllllllIl("swordIron"));
        llllIIIIlIIIlIlllIll(268, "wooden_sword", new IllIlllIllIIIIllllII(IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll).IlIlIlIlIlllllllllIl("swordWood"));
        llllIIIIlIIIlIlllIll(269, "wooden_shovel", new net.minecraft.llIllIlIIIIllIlIIllI.lIllllIllIllIIllllll(IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll).IlIlIlIlIlllllllllIl("shovelWood"));
        llllIIIIlIIIlIlllIll(270, "wooden_pickaxe", new IlIIIIIlIIllIIlIlIll(IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll).IlIlIlIlIlllllllllIl("pickaxeWood"));
        llllIIIIlIIIlIlllIll(271, "wooden_axe", new lllllIlIIIlIlIIlllII(IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll).IlIlIlIlIlllllllllIl("hatchetWood"));
        llllIIIIlIIIlIlllIll(272, "stone_sword", new IllIlllIllIIIIllllII(IlIlIIIlIIlIlIIlllIl.IlIlIlIlIlllllllllIl).IlIlIlIlIlllllllllIl("swordStone"));
        llllIIIIlIIIlIlllIll(273, "stone_shovel", new net.minecraft.llIllIlIIIIllIlIIllI.lIllllIllIllIIllllll(IlIlIIIlIIlIlIIlllIl.IlIlIlIlIlllllllllIl).IlIlIlIlIlllllllllIl("shovelStone"));
        llllIIIIlIIIlIlllIll(274, "stone_pickaxe", new IlIIIIIlIIllIIlIlIll(IlIlIIIlIIlIlIIlllIl.IlIlIlIlIlllllllllIl).IlIlIlIlIlllllllllIl("pickaxeStone"));
        llllIIIIlIIIlIlllIll(275, "stone_axe", new lllllIlIIIlIlIIlllII(IlIlIIIlIIlIlIIlllIl.IlIlIlIlIlllllllllIl).IlIlIlIlIlllllllllIl("hatchetStone"));
        llllIIIIlIIIlIlllIll(276, "diamond_sword", new IllIlllIllIIIIllllII(IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl).IlIlIlIlIlllllllllIl("swordDiamond"));
        llllIIIIlIIIlIlllIll(277, "diamond_shovel", new net.minecraft.llIllIlIIIIllIlIIllI.lIllllIllIllIIllllll(IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl).IlIlIlIlIlllllllllIl("shovelDiamond"));
        llllIIIIlIIIlIlllIll(278, "diamond_pickaxe", new IlIIIIIlIIllIIlIlIll(IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl).IlIlIlIlIlllllllllIl("pickaxeDiamond"));
        llllIIIIlIIIlIlllIll(279, "diamond_axe", new lllllIlIIIlIlIIlllII(IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl).IlIlIlIlIlllllllllIl("hatchetDiamond"));
        llllIIIIlIIIlIlllIll(280, "stick", new IlIIIlIlIIIllIlIlIIl().IlIlIIIllIllIIIIIllI().IlIlIlIlIlllllllllIl("stick").llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI));
        llllIIIIlIIIlIlllIll(281, "bowl", new IlIIIlIlIIIllIlIlIIl().IlIlIlIlIlllllllllIl("bowl").llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI));
        llllIIIIlIIIlIlllIll(282, "mushroom_stew", new IIlIlllIlIlllIlIllll(6).IlIlIlIlIlllllllllIl("mushroomStew"));
        llllIIIIlIIIlIlllIll(283, "golden_sword", new IllIlllIllIIIIllllII(IlIlIIIlIIlIlIIlllIl.IlIlIIIllIllIIIIIllI).IlIlIlIlIlllllllllIl("swordGold"));
        llllIIIIlIIIlIlllIll(284, "golden_shovel", new net.minecraft.llIllIlIIIIllIlIIllI.lIllllIllIllIIllllll(IlIlIIIlIIlIlIIlllIl.IlIlIIIllIllIIIIIllI).IlIlIlIlIlllllllllIl("shovelGold"));
        llllIIIIlIIIlIlllIll(285, "golden_pickaxe", new IlIIIIIlIIllIIlIlIll(IlIlIIIlIIlIlIIlllIl.IlIlIIIllIllIIIIIllI).IlIlIlIlIlllllllllIl("pickaxeGold"));
        llllIIIIlIIIlIlllIll(286, "golden_axe", new lllllIlIIIlIlIIlllII(IlIlIIIlIIlIlIIlllIl.IlIlIIIllIllIIIIIllI).IlIlIlIlIlllllllllIl("hatchetGold"));
        llllIIIIlIIIlIlllIll(287, "string", new IIllIIIlIIIIlIIlIIII(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.W).IlIlIlIlIlllllllllIl("string").llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI));
        llllIIIIlIIIlIlllIll(288, "feather", new IlIIIlIlIIIllIlIlIIl().IlIlIlIlIlllllllllIl("feather").llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI));
        llllIIIIlIIIlIlllIll(289, "gunpowder", new IlIIIlIlIIIllIlIlIIl().IlIlIlIlIlllllllllIl("sulphur").llIllIIIIIllIlIIIIlI("+14&13-13").llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI));
        llllIIIIlIIIlIlllIll(290, "wooden_hoe", new IIIllIIIlIlIIllIIIlI(IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll).IlIlIlIlIlllllllllIl("hoeWood"));
        llllIIIIlIIIlIlllIll(291, "stone_hoe", new IIIllIIIlIlIIllIIIlI(IlIlIIIlIIlIlIIlllIl.IlIlIlIlIlllllllllIl).IlIlIlIlIlllllllllIl("hoeStone"));
        llllIIIIlIIIlIlllIll(292, "iron_hoe", new IIIllIIIlIlIIllIIIlI(IlIlIIIlIIlIlIIlllIl.llIllIIIIIllIlIIIIlI).IlIlIlIlIlllllllllIl("hoeIron"));
        llllIIIIlIIIlIlllIll(293, "diamond_hoe", new IIIllIIIlIlIIllIIIlI(IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl).IlIlIlIlIlllllllllIl("hoeDiamond"));
        llllIIIIlIIIlIlllIll(294, "golden_hoe", new IIIllIIIlIlIIllIIIlI(IlIlIIIlIIlIlIIlllIl.IlIlIIIllIllIIIIIllI).IlIlIlIlIlllllllllIl("hoeGold"));
        llllIIIIlIIIlIlllIll(295, "wheat_seeds", new IIlllIIIllIllIIlIlIl(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIllIIIlIlIIllIIIlI, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIIlllIIIlIlllII).IlIlIlIlIlllllllllIl("seeds"));
        llllIIIIlIIIlIlllIll(296, "wheat", new IlIIIlIlIIIllIlIlIIl().IlIlIlIlIlllllllllIl("wheat").llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI));
        llllIIIIlIIIlIlllIll(297, "bread", new lIllIIIIIlllIIlIIllI(5, 0.6f, false).IlIlIlIlIlllllllllIl("bread"));
        llllIIIIlIIIlIlllIll(298, "leather_helmet", new IIIlIIlIIIIlllIlllII(IIlllIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll, 0, 0).IlIlIlIlIlllllllllIl("helmetCloth"));
        llllIIIIlIIIlIlllIll(299, "leather_chestplate", new IIIlIIlIIIIlllIlllII(IIlllIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll, 0, 1).IlIlIlIlIlllllllllIl("chestplateCloth"));
        llllIIIIlIIIlIlllIll(300, "leather_leggings", new IIIlIIlIIIIlllIlllII(IIlllIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll, 0, 2).IlIlIlIlIlllllllllIl("leggingsCloth"));
        llllIIIIlIIIlIlllIll(301, "leather_boots", new IIIlIIlIIIIlllIlllII(IIlllIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll, 0, 3).IlIlIlIlIlllllllllIl("bootsCloth"));
        llllIIIIlIIIlIlllIll(302, "chainmail_helmet", new IIIlIIlIIIIlllIlllII(IIlllIlIIllIlIlIlIIl.IlIlIlIlIlllllllllIl, 1, 0).IlIlIlIlIlllllllllIl("helmetChain"));
        llllIIIIlIIIlIlllIll(303, "chainmail_chestplate", new IIIlIIlIIIIlllIlllII(IIlllIlIIllIlIlIlIIl.IlIlIlIlIlllllllllIl, 1, 1).IlIlIlIlIlllllllllIl("chestplateChain"));
        llllIIIIlIIIlIlllIll(304, "chainmail_leggings", new IIIlIIlIIIIlllIlllII(IIlllIlIIllIlIlIlIIl.IlIlIlIlIlllllllllIl, 1, 2).IlIlIlIlIlllllllllIl("leggingsChain"));
        llllIIIIlIIIlIlllIll(305, "chainmail_boots", new IIIlIIlIIIIlllIlllII(IIlllIlIIllIlIlIlIIl.IlIlIlIlIlllllllllIl, 1, 3).IlIlIlIlIlllllllllIl("bootsChain"));
        llllIIIIlIIIlIlllIll(306, "iron_helmet", new IIIlIIlIIIIlllIlllII(IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI, 2, 0).IlIlIlIlIlllllllllIl("helmetIron"));
        llllIIIIlIIIlIlllIll(307, "iron_chestplate", new IIIlIIlIIIIlllIlllII(IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI, 2, 1).IlIlIlIlIlllllllllIl("chestplateIron"));
        llllIIIIlIIIlIlllIll(308, "iron_leggings", new IIIlIIlIIIIlllIlllII(IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI, 2, 2).IlIlIlIlIlllllllllIl("leggingsIron"));
        llllIIIIlIIIlIlllIll(309, "iron_boots", new IIIlIIlIIIIlllIlllII(IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI, 2, 3).IlIlIlIlIlllllllllIl("bootsIron"));
        llllIIIIlIIIlIlllIll(310, "diamond_helmet", new IIIlIIlIIIIlllIlllII(IIlllIlIIllIlIlIlIIl.IlIlIIIllIllIIIIIllI, 3, 0).IlIlIlIlIlllllllllIl("helmetDiamond"));
        llllIIIIlIIIlIlllIll(311, "diamond_chestplate", new IIIlIIlIIIIlllIlllII(IIlllIlIIllIlIlIlIIl.IlIlIIIllIllIIIIIllI, 3, 1).IlIlIlIlIlllllllllIl("chestplateDiamond"));
        llllIIIIlIIIlIlllIll(312, "diamond_leggings", new IIIlIIlIIIIlllIlllII(IIlllIlIIllIlIlIlIIl.IlIlIIIllIllIIIIIllI, 3, 2).IlIlIlIlIlllllllllIl("leggingsDiamond"));
        llllIIIIlIIIlIlllIll(313, "diamond_boots", new IIIlIIlIIIIlllIlllII(IIlllIlIIllIlIlIlIIl.IlIlIIIllIllIIIIIllI, 3, 3).IlIlIlIlIlllllllllIl("bootsDiamond"));
        llllIIIIlIIIlIlllIll(314, "golden_helmet", new IIIlIIlIIIIlllIlllII(IIlllIlIIllIlIlIlIIl.IlIIIlIlIIIllIlIlIIl, 4, 0).IlIlIlIlIlllllllllIl("helmetGold"));
        llllIIIIlIIIlIlllIll(315, "golden_chestplate", new IIIlIIlIIIIlllIlllII(IIlllIlIIllIlIlIlIIl.IlIIIlIlIIIllIlIlIIl, 4, 1).IlIlIlIlIlllllllllIl("chestplateGold"));
        llllIIIIlIIIlIlllIll(316, "golden_leggings", new IIIlIIlIIIIlllIlllII(IIlllIlIIllIlIlIlIIl.IlIIIlIlIIIllIlIlIIl, 4, 2).IlIlIlIlIlllllllllIl("leggingsGold"));
        llllIIIIlIIIlIlllIll(317, "golden_boots", new IIIlIIlIIIIlllIlllII(IIlllIlIIllIlIlIlIIl.IlIIIlIlIIIllIlIlIIl, 4, 3).IlIlIlIlIlllllllllIl("bootsGold"));
        llllIIIIlIIIlIlllIll(318, "flint", new IlIIIlIlIIIllIlIlIIl().IlIlIlIlIlllllllllIl("flint").llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI));
        llllIIIIlIIIlIlllIll(319, "porkchop", new lIllIIIIIlllIIlIIllI(3, 0.3f, true).IlIlIlIlIlllllllllIl("porkchopRaw"));
        llllIIIIlIIIlIlllIll(320, "cooked_porkchop", new lIllIIIIIlllIIlIIllI(8, 0.8f, true).IlIlIlIlIlllllllllIl("porkchopCooked"));
        llllIIIIlIIIlIlllIll(321, "painting", new llIIIllIlIllIllIIIIl(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.IlIlIIIIIIlllIlIllIl.class).IlIlIlIlIlllllllllIl("painting"));
        llllIIIIlIIIlIlllIll(322, "golden_apple", new IIlIIIIlllIlllllIlII(4, 1.2f, false).IlIlIIIIIIlllIlIllIl().llllIIIIlIIIlIlllIll(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llllllIllIllIlIllllI, 5, 1, 1.0f).IlIlIlIlIlllllllllIl("appleGold"));
        llllIIIIlIIIlIlllIll(323, "sign", new lllllIlIlIlllIlllIlI().IlIlIlIlIlllllllllIl("sign"));
        llllIIIIlIIIlIlllIll(324, "wooden_door", new llIllIlIlIIIIIIIllII(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIllllIllllIlIlII).IlIlIlIlIlllllllllIl("doorOak"));
        final IlIIIlIlIIIllIlIlIIl ilIlIlIlIlllllllllIl = new IlIIIlIIIllllIlIlIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll).IlIlIlIlIlllllllllIl("bucket").IlIlIlIlIlllllllllIl(16);
        llllIIIIlIIIlIlllIll(325, "bucket", ilIlIlIlIlllllllllIl);
        llllIIIIlIIIlIlllIll(326, "water_bucket", new IlIIIlIIIllllIlIlIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII).IlIlIlIlIlllllllllIl("bucketWater").IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl));
        llllIIIIlIIIlIlllIll(327, "lava_bucket", new IlIIIlIIIllllIlIlIlI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI).IlIlIlIlIlllllllllIl("bucketLava").IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl));
        llllIIIIlIIIlIlllIll(328, "minecart", new IIlIlIllllIlllIIIIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll).IlIlIlIlIlllllllllIl("minecart"));
        llllIIIIlIIIlIlllIll(329, "saddle", new IIIllIIllIIIIIIlIIlI().IlIlIlIlIlllllllllIl("saddle"));
        llllIIIIlIIIlIlllIll(330, "iron_door", new llIllIlIlIIIIIIIllII(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIllIIIlIIIIlIIlIIII).IlIlIlIlIlllllllllIl("doorIron"));
        llllIIIIlIIIlIlllIll(331, "redstone", new lIIIIIlIlIIIlIIIIlIl().IlIlIlIlIlllllllllIl("redstone").llIllIIIIIllIlIIIIlI("-5+6-7"));
        llllIIIIlIIIlIlllIll(332, "snowball", new llllllIIIIIIIlllIIll().IlIlIlIlIlllllllllIl("snowball"));
        llllIIIIlIIIlIlllIll(333, "boat", new IIlIIIIIllIlIIIlIIll().IlIlIlIlIlllllllllIl("boat"));
        llllIIIIlIIIlIlllIll(334, "leather", new IlIIIlIlIIIllIlIlIIl().IlIlIlIlIlllllllllIl("leather").llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI));
        llllIIIIlIIIlIlllIll(335, "milk_bucket", new IIIIIllIIIIlIIIIllIl().IlIlIlIlIlllllllllIl("milk").IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl));
        llllIIIIlIIIlIlllIll(336, "brick", new IlIIIlIlIIIllIlIlIIl().IlIlIlIlIlllllllllIl("brick").llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI));
        llllIIIIlIIIlIlllIll(337, "clay_ball", new IlIIIlIlIIIllIlIlIIl().IlIlIlIlIlllllllllIl("clay").llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI));
        llllIIIIlIIIlIlllIll(338, "reeds", new IIllIIIlIIIIlIIlIIII(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIllllIllIllIIllllll).IlIlIlIlIlllllllllIl("reeds").llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI));
        llllIIIIlIIIlIlllIll(339, "paper", new IlIIIlIlIIIllIlIlIIl().IlIlIlIlIlllllllllIl("paper").llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl));
        llllIIIIlIIIlIlllIll(340, "book", new llllllIllIllIlIllllI().IlIlIlIlIlllllllllIl("book").llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl));
        llllIIIIlIIIlIlllIll(341, "slime_ball", new IlIIIlIlIIIllIlIlIIl().IlIlIlIlIlllllllllIl("slimeball").llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl));
        llllIIIIlIIIlIlllIll(342, "chest_minecart", new IIlIlIllllIlllIIIIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl).IlIlIlIlIlllllllllIl("minecartChest"));
        llllIIIIlIIIlIlllIll(343, "furnace_minecart", new IIlIlIllllIlllIIIIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI).IlIlIlIlIlllllllllIl("minecartFurnace"));
        llllIIIIlIIIlIlllIll(344, "egg", new IllIllIlllIllllIIllI().IlIlIlIlIlllllllllIl("egg"));
        llllIIIIlIIIlIlllIll(345, "compass", new IlIIIlIlIIIllIlIlIIl().IlIlIlIlIlllllllllIl("compass").llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII));
        llllIIIIlIIIlIlllIll(346, "fishing_rod", new lllllIIIIIlIlIIIIIIl().IlIlIlIlIlllllllllIl("fishingRod"));
        llllIIIIlIIIlIlllIll(347, "clock", new IlIIIlIlIIIllIlIlIIl().IlIlIlIlIlllllllllIl("clock").llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII));
        llllIIIIlIIIlIlllIll(348, "glowstone_dust", new IlIIIlIlIIIllIlIlIIl().IlIlIlIlIlllllllllIl("yellowDust").llIllIIIIIllIlIIIIlI("+5-6-7").llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI));
        llllIIIIlIIIlIlllIll(349, "fish", new llIIIlIlllIllIIlIllI(false).IlIlIlIlIlllllllllIl("fish").llllIIIIlIIIlIlllIll(true));
        llllIIIIlIIIlIlllIll(350, "cooked_fish", new llIIIlIlllIllIIlIllI(true).IlIlIlIlIlllllllllIl("fish").llllIIIIlIIIlIlllIll(true));
        llllIIIIlIIIlIlllIll(351, "dye", new IllIllIIIIlIIlIlllII().IlIlIlIlIlllllllllIl("dyePowder"));
        llllIIIIlIIIlIlllIll(352, "bone", new IlIIIlIlIIIllIlIlIIl().IlIlIlIlIlllllllllIl("bone").IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl));
        llllIIIIlIIIlIlllIll(353, "sugar", new IlIIIlIlIIIllIlIlIIl().IlIlIlIlIlllllllllIl("sugar").llIllIIIIIllIlIIIIlI("-0+1-2-3&4-4+13").llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI));
        llllIIIIlIIIlIlllIll(354, "cake", new IIllIIIlIIIIlIIlIIII(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.e).IlIlIlIlIlllllllllIl(1).IlIlIlIlIlllllllllIl("cake").llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII));
        llllIIIIlIIIlIlllIll(355, "bed", new llIIlllIIlllIIllIllI().IlIlIlIlIlllllllllIl(1).IlIlIlIlIlllllllllIl("bed"));
        llllIIIIlIIIlIlllIll(356, "repeater", new IIllIIIlIIIIlIIlIIII(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.f).IlIlIlIlIlllllllllIl("diode").llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl));
        llllIIIIlIIIlIlllIll(357, "cookie", new lIllIIIIIlllIIlIIllI(2, 0.1f, false).IlIlIlIlIlllllllllIl("cookie"));
        llllIIIIlIIIlIlllIll(358, "filled_map", new IIlllllIllIllIlIlIII().IlIlIlIlIlllllllllIl("map"));
        llllIIIIlIIIlIlllIll(359, "shears", new net.minecraft.llIllIlIIIIllIlIIllI.llIlllIlllllIIllIIII().IlIlIlIlIlllllllllIl("shears"));
        llllIIIIlIIIlIlllIll(360, "melon", new lIllIIIIIlllIIlIIllI(2, 0.3f, false).IlIlIlIlIlllllllllIl("melon"));
        llllIIIIlIIIlIlllIll(361, "pumpkin_seeds", new IIlllIIIllIllIIlIlIl(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.p, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIIlllIIIlIlllII).IlIlIlIlIlllllllllIl("seeds_pumpkin"));
        llllIIIIlIIIlIlllIll(362, "melon_seeds", new IIlllIIIllIllIIlIlIl(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.q, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIIlllIIIlIlllII).IlIlIlIlIlllllllllIl("seeds_melon"));
        llllIIIIlIIIlIlllIll(363, "beef", new lIllIIIIIlllIIlIIllI(3, 0.3f, true).IlIlIlIlIlllllllllIl("beefRaw"));
        llllIIIIlIIIlIlllIll(364, "cooked_beef", new lIllIIIIIlllIIlIIllI(8, 0.8f, true).IlIlIlIlIlllllllllIl("beefCooked"));
        llllIIIIlIIIlIlllIll(365, "chicken", new lIllIIIIIlllIIlIIllI(2, 0.3f, true).llllIIIIlIIIlIlllIll(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl.llllllIllIllIlIllllI, 30, 0, 0.3f).IlIlIlIlIlllllllllIl("chickenRaw"));
        llllIIIIlIIIlIlllIll(366, "cooked_chicken", new lIllIIIIIlllIIlIIllI(6, 0.6f, true).IlIlIlIlIlllllllllIl("chickenCooked"));
        llllIIIIlIIIlIlllIll(367, "rotten_flesh", new lIllIIIIIlllIIlIIllI(4, 0.1f, true).llllIIIIlIIIlIlllIll(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl.llllllIllIllIlIllllI, 30, 0, 0.8f).IlIlIlIlIlllllllllIl("rottenFlesh"));
        llllIIIIlIIIlIlllIll(368, "ender_pearl", new lIIlIIIlIllIlIllIIIl().IlIlIlIlIlllllllllIl("enderPearl"));
        llllIIIIlIIIlIlllIll(369, "blaze_rod", new IlIIIlIlIIIllIlIlIIl().IlIlIlIlIlllllllllIl("blazeRod").llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI).IlIlIIIllIllIIIIIllI());
        llllIIIIlIIIlIlllIll(370, "ghast_tear", new IlIIIlIlIIIllIlIlIIl().IlIlIlIlIlllllllllIl("ghastTear").llIllIIIIIllIlIIIIlI("+0-1-2-3&4-4+13").llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI));
        llllIIIIlIIIlIlllIll(371, "gold_nugget", new IlIIIlIlIIIllIlIlIIl().IlIlIlIlIlllllllllIl("goldNugget").llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI));
        llllIIIIlIIIlIlllIll(372, "nether_wart", new IIlllIIIllIllIIlIlIl(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.F, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.a).IlIlIlIlIlllllllllIl("netherStalkSeeds").llIllIIIIIllIlIIIIlI("+4"));
        llllIIIIlIIIlIlllIll(373, "potion", new lllllIIIIIlIIlllIlIl().IlIlIlIlIlllllllllIl("potion"));
        llllIIIIlIIIlIlllIll(374, "glass_bottle", new lIlIIlllIIlIIlIlllIl().IlIlIlIlIlllllllllIl("glassBottle"));
        llllIIIIlIIIlIlllIll(375, "spider_eye", new lIllIIIIIlllIIlIIllI(2, 0.8f, false).llllIIIIlIIIlIlllIll(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll.llllllIllIllIlIllllI, 5, 0, 1.0f).IlIlIlIlIlllllllllIl("spiderEye").llIllIIIIIllIlIIIIlI("-0-1+2-3&4-4+13"));
        llllIIIIlIIIlIlllIll(376, "fermented_spider_eye", new IlIIIlIlIIIllIlIlIIl().IlIlIlIlIlllllllllIl("fermentedSpiderEye").llIllIIIIIllIlIIIIlI("-0+3-4+13").llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI));
        llllIIIIlIIIlIlllIll(377, "blaze_powder", new IlIIIlIlIIIllIlIlIIl().IlIlIlIlIlllllllllIl("blazePowder").llIllIIIIIllIlIIIIlI("+0-1-2+3&4-4+13").llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI));
        llllIIIIlIIIlIlllIll(378, "magma_cream", new IlIIIlIlIIIllIlIlIIl().IlIlIlIlIlllllllllIl("magmaCream").llIllIIIIIllIlIIIIlI("+0+1-2-3&4-4+13").llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI));
        llllIIIIlIIIlIlllIll(379, "brewing_stand", new IIllIIIlIIIIlIIlIIII(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.H).IlIlIlIlIlllllllllIl("brewingStand").llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI));
        llllIIIIlIIIlIlllIll(380, "cauldron", new IIllIIIlIIIIlIIlIIII(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.I).IlIlIlIlIlllllllllIl("cauldron").llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI));
        llllIIIIlIIIlIlllIll(381, "ender_eye", new IllIlIIllIllIIlIllII().IlIlIlIlIlllllllllIl("eyeOfEnder"));
        llllIIIIlIIIlIlllIll(382, "speckled_melon", new IlIIIlIlIIIllIlIlIIl().IlIlIlIlIlllllllllIl("speckledMelon").llIllIIIIIllIlIIIIlI("+0-1+2-3&4-4+13").llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI));
        llllIIIIlIIIlIlllIll(383, "spawn_egg", new IllIlIllIllIlllIIlll().IlIlIlIlIlllllllllIl("monsterPlacer"));
        llllIIIIlIIIlIlllIll(384, "experience_bottle", new IIlIIIlllIllIllIlIII().IlIlIlIlIlllllllllIl("expBottle"));
        llllIIIIlIIIlIlllIll(385, "fire_charge", new lIlIlIlllIIlIlIlllIl().IlIlIlIlIlllllllllIl("fireball"));
        llllIIIIlIIIlIlllIll(386, "writable_book", new IlIllIIllIIlIIIIlIIl().IlIlIlIlIlllllllllIl("writingBook").llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl));
        llllIIIIlIIIlIlllIll(387, "written_book", new IlIllllIIlIIlIlIlIll().IlIlIlIlIlllllllllIl("writtenBook").IlIlIlIlIlllllllllIl(16));
        llllIIIIlIIIlIlllIll(388, "emerald", new IlIIIlIlIIIllIlIlIIl().IlIlIlIlIlllllllllIl("emerald").llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI));
        llllIIIIlIIIlIlllIll(389, "item_frame", new llIIIllIlIllIllIIIIl(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llIIlIIIlIIIllIlIIIl.class).IlIlIlIlIlllllllllIl("frame"));
        llllIIIIlIIIlIlllIll(390, "flower_pot", new IIllIIIlIIIIlIIlIIII(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ae).IlIlIlIlIlllllllllIl("flowerPot").llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI));
        llllIIIIlIIIlIlllIll(391, "carrot", new IIIIIIIllllIlIIIIIII(3, 0.6f, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.af, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIIlllIIIlIlllII).IlIlIlIlIlllllllllIl("carrots"));
        llllIIIIlIIIlIlllIll(392, "potato", new IIIIIIIllllIlIIIIIII(1, 0.3f, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ag, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIIlllIIIlIlllII).IlIlIlIlIlllllllllIl("potato"));
        llllIIIIlIIIlIlllIll(393, "baked_potato", new lIllIIIIIlllIIlIIllI(5, 0.6f, false).IlIlIlIlIlllllllllIl("potatoBaked"));
        llllIIIIlIIIlIlllIll(394, "poisonous_potato", new lIllIIIIIlllIIlIIllI(2, 0.3f, false).llllIIIIlIIIlIlllIll(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll.llllllIllIllIlIllllI, 5, 0, 0.6f).IlIlIlIlIlllllllllIl("potatoPoisonous"));
        llllIIIIlIIIlIlllIll(395, "map", new llIlIIIIIlIIlIlIIlll().IlIlIlIlIlllllllllIl("emptyMap"));
        llllIIIIlIIIlIlllIll(396, "golden_carrot", new lIllIIIIIlllIIlIIllI(6, 1.2f, false).IlIlIlIlIlllllllllIl("carrotGolden").llIllIIIIIllIlIIIIlI("-0+1+2-3+13&4-4").llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI));
        llllIIIIlIIIlIlllIll(397, "skull", new lllIlIIIIIlIlllllIlI().IlIlIlIlIlllllllllIl("skull"));
        llllIIIIlIIIlIlllIll(398, "carrot_on_a_stick", new IIIIIIIIIlllIllIlIlI().IlIlIlIlIlllllllllIl("carrotOnAStick"));
        llllIIIIlIIIlIlllIll(399, "nether_star", new IlIllllIIlIllIlIlIll().IlIlIlIlIlllllllllIl("netherStar").llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI));
        llllIIIIlIIIlIlllIll(400, "pumpkin_pie", new lIllIIIIIlllIIlIIllI(8, 0.3f, false).IlIlIlIlIlllllllllIl("pumpkinPie").llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII));
        llllIIIIlIIIlIlllIll(401, "fireworks", new llIIIIIIlIllIIlIIIll().IlIlIlIlIlllllllllIl("fireworks"));
        llllIIIIlIIIlIlllIll(402, "firework_charge", new lIIIIlIlIllllIIlIllI().IlIlIlIlIlllllllllIl("fireworksCharge").llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl));
        llllIIIIlIIIlIlllIll(403, "enchanted_book", new IlIIlIlIIIlIIlIlIlII().IlIlIlIlIlllllllllIl(1).IlIlIlIlIlllllllllIl("enchantedBook"));
        llllIIIIlIIIlIlllIll(404, "comparator", new IIllIIIlIIIIlIIlIIII(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.an).IlIlIlIlIlllllllllIl("comparator").llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl));
        llllIIIIlIIIlIlllIll(405, "netherbrick", new IlIIIlIlIIIllIlIlIIl().IlIlIlIlIlllllllllIl("netherbrick").llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI));
        llllIIIIlIIIlIlllIll(406, "quartz", new IlIIIlIlIIIllIlIlIIl().IlIlIlIlIlllllllllIl("netherquartz").llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI));
        llllIIIIlIIIlIlllIll(407, "tnt_minecart", new IIlIlIllllIlllIIIIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl).IlIlIlIlIlllllllllIl("minecartTnt"));
        llllIIIIlIIIlIlllIll(408, "hopper_minecart", new IIlIlIllllIlllIIIIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl).IlIlIlIlIlllllllllIl("minecartHopper"));
        llllIIIIlIIIlIlllIll(409, "prismarine_shard", new IlIIIlIlIIIllIlIlIIl().IlIlIlIlIlllllllllIl("prismarineShard").llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI));
        llllIIIIlIIIlIlllIll(410, "prismarine_crystals", new IlIIIlIlIIIllIlIlIIl().IlIlIlIlIlllllllllIl("prismarineCrystals").llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI));
        llllIIIIlIIIlIlllIll(411, "rabbit", new lIllIIIIIlllIIlIIllI(3, 0.3f, true).IlIlIlIlIlllllllllIl("rabbitRaw"));
        llllIIIIlIIIlIlllIll(412, "cooked_rabbit", new lIllIIIIIlllIIlIIllI(5, 0.6f, true).IlIlIlIlIlllllllllIl("rabbitCooked"));
        llllIIIIlIIIlIlllIll(413, "rabbit_stew", new IIlIlllIlIlllIlIllll(10).IlIlIlIlIlllllllllIl("rabbitStew"));
        llllIIIIlIIIlIlllIll(414, "rabbit_foot", new IlIIIlIlIIIllIlIlIIl().IlIlIlIlIlllllllllIl("rabbitFoot").llIllIIIIIllIlIIIIlI("+0+1-2+3&4-4+13").llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI));
        llllIIIIlIIIlIlllIll(415, "rabbit_hide", new IlIIIlIlIIIllIlIlIIl().IlIlIlIlIlllllllllIl("rabbitHide").llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI));
        llllIIIIlIIIlIlllIll(416, "armor_stand", new llIIIlIlIllIIlIlIlII().IlIlIlIlIlllllllllIl("armorStand").IlIlIlIlIlllllllllIl(16));
        llllIIIIlIIIlIlllIll(417, "iron_horse_armor", new IlIIIlIlIIIllIlIlIIl().IlIlIlIlIlllllllllIl("horsearmormetal").IlIlIlIlIlllllllllIl(1).llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl));
        llllIIIIlIIIlIlllIll(418, "golden_horse_armor", new IlIIIlIlIIIllIlIlIIl().IlIlIlIlIlllllllllIl("horsearmorgold").IlIlIlIlIlllllllllIl(1).llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl));
        llllIIIIlIIIlIlllIll(419, "diamond_horse_armor", new IlIIIlIlIIIllIlIlIIl().IlIlIlIlIlllllllllIl("horsearmordiamond").IlIlIlIlIlllllllllIl(1).llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl));
        llllIIIIlIIIlIlllIll(420, "lead", new IIlllIIlllIIIlIlllII().IlIlIlIlIlllllllllIl("leash"));
        llllIIIIlIIIlIlllIll(421, "name_tag", new lllllIIllIlIllIllllI().IlIlIlIlIlllllllllIl("nameTag"));
        llllIIIIlIIIlIlllIll(422, "command_block_minecart", new IIlIlIllllIlllIIIIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl).IlIlIlIlIlllllllllIl("minecartCommandBlock").llllIIIIlIIIlIlllIll((llllIIIIlIIIlIlllIll)null));
        llllIIIIlIIIlIlllIll(423, "mutton", new lIllIIIIIlllIIlIIllI(2, 0.3f, true).IlIlIlIlIlllllllllIl("muttonRaw"));
        llllIIIIlIIIlIlllIll(424, "cooked_mutton", new lIllIIIIIlllIIlIIllI(6, 0.8f, true).IlIlIlIlIlllllllllIl("muttonCooked"));
        llllIIIIlIIIlIlllIll(425, "banner", new lIllllllIIllIlIlIlII().IlIIIlIlIIIllIlIlIIl("banner"));
        llllIIIIlIIIlIlllIll(427, "spruce_door", new llIllIlIlIIIIIIIllII(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlIlIllllIlllIIIIll).IlIlIlIlIlllllllllIl("doorSpruce"));
        llllIIIIlIIIlIlllIll(428, "birch_door", new llIllIlIlIIIIIIIllII(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIllIIIllllIlllIllI).IlIlIlIlIlllllllllIl("doorBirch"));
        llllIIIIlIIIlIlllIll(429, "jungle_door", new llIllIlIlIIIIIIIllII(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIlIllIllIlllIIlll).IlIlIlIlIlllllllllIl("doorJungle"));
        llllIIIIlIIIlIlllIll(430, "acacia_door", new llIllIlIlIIIIIIIllII(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIllIIIlIIlIlIlIIIII).IlIlIlIlIlllllllllIl("doorAcacia"));
        llllIIIIlIIIlIlllIll(431, "dark_oak_door", new llIllIlIlIIIIIIIllII(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIIlllllllllllll).IlIlIlIlIlllllllllIl("doorDarkOak"));
        llllIIIIlIIIlIlllIll(2256, "record_13", new IlIllllIIIlIllIlIIll("13").IlIlIlIlIlllllllllIl("record"));
        llllIIIIlIIIlIlllIll(2257, "record_cat", new IlIllllIIIlIllIlIIll("cat").IlIlIlIlIlllllllllIl("record"));
        llllIIIIlIIIlIlllIll(2258, "record_blocks", new IlIllllIIIlIllIlIIll("blocks").IlIlIlIlIlllllllllIl("record"));
        llllIIIIlIIIlIlllIll(2259, "record_chirp", new IlIllllIIIlIllIlIIll("chirp").IlIlIlIlIlllllllllIl("record"));
        llllIIIIlIIIlIlllIll(2260, "record_far", new IlIllllIIIlIllIlIIll("far").IlIlIlIlIlllllllllIl("record"));
        llllIIIIlIIIlIlllIll(2261, "record_mall", new IlIllllIIIlIllIlIIll("mall").IlIlIlIlIlllllllllIl("record"));
        llllIIIIlIIIlIlllIll(2262, "record_mellohi", new IlIllllIIIlIllIlIIll("mellohi").IlIlIlIlIlllllllllIl("record"));
        llllIIIIlIIIlIlllIll(2263, "record_stal", new IlIllllIIIlIllIlIIll("stal").IlIlIlIlIlllllllllIl("record"));
        llllIIIIlIIIlIlllIll(2264, "record_strad", new IlIllllIIIlIllIlIIll("strad").IlIlIlIlIlllllllllIl("record"));
        llllIIIIlIIIlIlllIll(2265, "record_ward", new IlIllllIIIlIllIlIIll("ward").IlIlIlIlIlllllllllIl("record"));
        llllIIIIlIIIlIlllIll(2266, "record_11", new IlIllllIIIlIllIlIIll("11").IlIlIlIlIlllllllllIl("record"));
        llllIIIIlIIIlIlllIll(2267, "record_wait", new IlIllllIIIlIllIlIIll("wait").IlIlIlIlIlllllllllIl("record"));
    }
    
    private static void llIllIIIIIllIlIIIIlI(final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, new IIlllIIIlIlllIIlllII(llllIIIIlIIIlIlllIll));
    }
    
    protected static void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll), (lIllllIllIllIIllllll)net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll), ilIIIlIlIIIllIlIlIIl);
        IlIIIlIlIIIllIlIlIIl.llllIIIlIlllIlIIIIIl.put(llllIIIIlIIIlIlllIll, ilIIIlIlIIIllIlIlIIl);
    }
    
    private static void llllIIIIlIIIlIlllIll(final int n, final String s, final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        llllIIIIlIIIlIlllIll(n, new lIllllIllIllIIllllll(s), ilIIIlIlIIIllIlIlIIl);
    }
    
    private static void llllIIIIlIIIlIlllIll(final int n, final lIllllIllIllIIllllll lIllllIllIllIIllllll, final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n, lIllllIllIllIIllllll, ilIIIlIlIIIllIlIlIIl);
    }
}
