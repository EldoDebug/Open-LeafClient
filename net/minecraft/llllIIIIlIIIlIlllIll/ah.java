package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import java.util.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;

public class ah extends llllIIIIlIIIlIlllIll
{
    public static final IlIIIlIlIIIllIlIlIIl IIIIIIIIIlllIllIlIlI;
    public static final int IIllllIIIlIIIIIIllIl;
    public static final int IlllIIIIlIIIlIlIlIIl;
    public static final int lllIllIIIllllllIllll;
    
    static {
        IIIIIIIIIlllIllIlIlI = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll("variant", ai.class);
        IIllllIIIlIIIIIIllIl = ai.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
        IlllIIIIlIIIlIlIlIIl = ai.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl();
        lllIllIIIllllllIllll = ai.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl();
    }
    
    public ah() {
        super(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI);
        this.lIIIIlIIIIIlllIllIII(this.IIIIIllIIIIlIIIIllIl.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(ah.IIIIIIIIIlllIllIlIlI, ai.llllIIIIlIIIlIlllIll));
        this.llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl);
    }
    
    @Override
    public String lllllIlIIIlIlIIlllII() {
        return lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll(String.valueOf(this.lIllllllIIllIlIlIlII()) + "." + ai.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI() + ".name");
    }
    
    @Override
    public net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll IlIlIlIlIlllllllllIl(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return (llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(ah.IIIIIIIIIlllIllIlIlI) == ai.llllIIIIlIIIlIlllIll) ? net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII : net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IIlIIIIIllIlIIIlIIll;
    }
    
    @Override
    public int IlIIIlIlIIIllIlIlIIl(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return ((ai)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(ah.IIIIIIIIIlllIllIlIlI)).IlIlIlIlIlllllllllIl();
    }
    
    @Override
    public int llIllIIIIIllIlIIIIlI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return ((ai)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(ah.IIIIIIIIIlllIllIlIlI)).IlIlIlIlIlllllllllIl();
    }
    
    @Override
    protected net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl IIllllIIIlIIIIIIllIl() {
        return new net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this, new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { ah.IIIIIIIIIlllIllIlIlI });
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI(final int n) {
        return this.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(ah.IIIIIIIIIlllIllIlIlI, ai.llllIIIIlIIIlIlllIll(n));
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final List list) {
        list.add(new lllIIIIlIlIllIIlIIIl(ilIIIlIlIIIllIlIlIIl, 1, ah.IIllllIIIlIIIIIIllIl));
        list.add(new lllIIIIlIlIllIIlIIIl(ilIIIlIlIIIllIlIlIIl, 1, ah.IlllIIIIlIIIlIlIlIIl));
        list.add(new lllIIIIlIlIllIIlIIIl(ilIIIlIlIIIllIlIlIIl, 1, ah.lllIllIIIllllllIllll));
    }
}
