package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl;

import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import java.util.*;
import com.google.common.collect.*;
import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class llIllIlIIIIllIlIIllI
{
    public static final llIllIlIIIIllIlIIllI llllIIIIlIIIlIlllIll;
    private final boolean[] IlIlIlIlIlllllllllIl;
    private final boolean[] llIllIIIIIllIlIIIIlI;
    private boolean IlIIIlIlIIIllIlIlIIl;
    private final List IlIlIIIllIllIIIIIllI;
    private IIlllIIlIllIllIlIIll IllIIlllIIIIlllIIlIl;
    private IIllIIIlIIlIlIlIIIII llllIIIlIlllIlIIIIIl;
    private BitSet[] lIIIIlIIIIIlllIllIII;
    
    static {
        llllIIIIlIIIlIlllIll = new lIlIlIIIllIIllIIIllI();
    }
    
    public llIllIlIIIIllIlIIllI() {
        this.IlIlIlIlIlllllllllIl = new boolean[IlIllIlIlIIIlIlIlIII.IlIIIlIlIIIllIlIlIIl.length];
        this.llIllIIIIIllIlIIIIlI = new boolean[IlIllIlIlIIIlIlIlIII.IlIIIlIlIIIllIlIlIIl.length];
        this.IlIIIlIlIIIllIlIlIIl = true;
        this.IlIlIIIllIllIIIIIllI = Lists.newArrayList();
        this.IllIIlllIIIIlllIIlIl = new IIlllIIlIllIllIlIIll();
        this.lIIIIlIIIIIlllIllIII = new BitSet[IlIllIlIlIIIlIlIlIII.IlIIIlIlIIIllIlIlIIl.length];
    }
    
    public boolean llllIIIIlIIIlIlllIll() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    protected void llllIIIIlIIIlIlllIll(final IlIIlIlIIIlIIlIlIlII ilIIlIlIIIlIIlIlIlII) {
        this.IlIIIlIlIIIllIlIlIIl = false;
        this.IlIlIlIlIlllllllllIl[ilIIlIlIIIlIIlIlIlII.ordinal()] = true;
    }
    
    public boolean IlIlIlIlIlllllllllIl(final IlIIlIlIIIlIIlIlIlII ilIIlIlIIIlIIlIlIlII) {
        return !this.IlIlIlIlIlllllllllIl[ilIIlIlIIIlIIlIlIlII.ordinal()];
    }
    
    public void llIllIIIIIllIlIIIIlI(final IlIIlIlIIIlIIlIlIlII ilIIlIlIIIlIIlIlIlII) {
        this.llIllIIIIIllIlIIIIlI[ilIIlIlIIIlIIlIlIlII.ordinal()] = true;
    }
    
    public boolean IlIIIlIlIIIllIlIlIIl(final IlIIlIlIIIlIIlIlIlII ilIIlIlIIIlIIlIlIlII) {
        return this.llIllIIIIIllIlIIIIlI[ilIIlIlIIIlIIlIlIlII.ordinal()];
    }
    
    public List IlIlIlIlIlllllllllIl() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        this.IlIlIIIllIllIIIIIllI.add(ilIIIlIlIIIllIlIlIIl);
    }
    
    public boolean llllIIIIlIIIlIlllIll(final lllIllIIIllllllIllll lllIllIIIllllllIllll, final lllIllIIIllllllIllll lllIllIIIllllllIllll2) {
        return this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll, lllIllIIIllllllIllll2);
    }
    
    public void llllIIIIlIIIlIlllIll(final IIlllIIlIllIllIlIIll illIIlllIIIIlllIIlIl) {
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
    }
    
    public IIllIIIlIIlIlIlIIIII llIllIIIIIllIlIIIIlI() {
        return this.llllIIIlIlllIlIIIIIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final IIllIIIlIIlIlIlIIIII llllIIIlIlllIlIIIIIl) {
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
    }
    
    public BitSet IlIlIIIllIllIIIIIllI(final IlIIlIlIIIlIIlIlIlII ilIIlIlIIIlIIlIlIlII) {
        return this.lIIIIlIIIIIlllIllIII[ilIIlIlIIIlIIlIlIlII.ordinal()];
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIIlIlIIIlIIlIlIlII ilIIlIlIIIlIIlIlIlII, final BitSet set) {
        this.lIIIIlIIIIIlllIllIII[ilIIlIlIIIlIIlIlIlII.ordinal()] = set;
    }
}
