package net.minecraft.IIIlIIIlIlIIlllIIlll;

import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class llllIIIIlIIIlIlllIll extends IllIIlllIIIIlllIIlIl
{
    public final int llllIIIIlIIIlIlllIll;
    public final int IlIlIlIlIlllllllllIl;
    public final llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI;
    private final String llIllIlIIIIllIlIIllI;
    private llIllIIIIIllIlIIIIlI lIlIlIIIllIIllIIIllI;
    public final lllIIIIlIlIllIIlIIIl IlIIIlIlIIIllIlIlIIl;
    private boolean IlIlIIIllIIllIlllllI;
    
    public llllIIIIlIIIlIlllIll(final String s, final String s2, final int n, final int n2, final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        this(s, s2, n, n2, new lllIIIIlIlIllIIlIIIl(ilIIIlIlIIIllIlIlIIl), llllIIIIlIIIlIlllIll);
    }
    
    public llllIIIIlIIIlIlllIll(final String s, final String s2, final int n, final int n2, final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2) {
        this(s, s2, n, n2, new lllIIIIlIlIllIIlIIIl(llllIIIIlIIIlIlllIll), llllIIIIlIIIlIlllIll2);
    }
    
    public llllIIIIlIIIlIlllIll(final String s, final String s2, final int llIllIIIIIllIlIIIIlI, final int ilIIIlIlIIIllIlIlIIl, final lllIIIIlIlIllIIlIIIl ilIIIlIlIIIllIlIlIIl2, final llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI2) {
        super(s, new IIllIIllIIIlIlIIIIlI("achievement." + s2, new Object[0]));
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl2;
        this.llIllIlIIIIllIlIIllI = "achievement." + s2 + ".desc";
        this.llllIIIIlIIIlIlllIll = llIllIIIIIllIlIIIIlI;
        this.IlIlIlIlIlllllllllIl = ilIIIlIlIIIllIlIlIIl;
        if (llIllIIIIIllIlIIIIlI < net.minecraft.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
            net.minecraft.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll = llIllIIIIIllIlIIIIlI;
        }
        if (ilIIIlIlIIIllIlIlIIl < net.minecraft.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl) {
            net.minecraft.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl = ilIIIlIlIIIllIlIlIIl;
        }
        if (llIllIIIIIllIlIIIIlI > net.minecraft.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI) {
            net.minecraft.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        }
        if (ilIIIlIlIIIllIlIlIIl > net.minecraft.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl) {
            net.minecraft.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        }
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI2;
    }
    
    public llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll() {
        this.IllIIlllIIIIlllIIlIl = true;
        return this;
    }
    
    public llllIIIIlIIIlIlllIll IlIlIlIlIlllllllllIl() {
        this.IlIlIIIllIIllIlllllI = true;
        return this;
    }
    
    public llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI() {
        super.lIIIlllIIIllIIIllIII();
        net.minecraft.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI.add(this);
        return this;
    }
    
    @Override
    public boolean IlIIIlIlIIIllIlIlIIl() {
        return true;
    }
    
    @Override
    public llIIIIIIlIllIIlIIIll IlIlIIIllIllIIIIIllI() {
        final llIIIIIIlIllIIlIIIll ilIlIIIllIllIIIIIllI = super.IlIlIIIllIllIIIIIllI();
        ilIlIIIllIllIIIIIllI.llllIIIlIlllIlIIIIIl().llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl() ? IlllIIIIlIIIlIlIlIIl.IllIIlllIIIIlllIIlIl : IlllIIIIlIIIlIlIlIIl.llIllIlIIIIllIlIIllI);
        return ilIlIIIllIllIIIIIllI;
    }
    
    public llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final Class clazz) {
        return (llllIIIIlIIIlIlllIll)super.IlIlIlIlIlllllllllIl(clazz);
    }
    
    public String IllIIlllIIIIlllIIlIl() {
        return (this.lIlIlIIIllIIllIIIllI != null) ? this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll(this.llIllIlIIIIllIlIIllI)) : lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll(this.llIllIlIIIIllIlIIllI);
    }
    
    public llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI lIlIlIIIllIIllIIIllI) {
        this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI;
        return this;
    }
    
    public boolean llllIIIlIlllIlIIIIIl() {
        return this.IlIlIIIllIIllIlllllI;
    }
}
