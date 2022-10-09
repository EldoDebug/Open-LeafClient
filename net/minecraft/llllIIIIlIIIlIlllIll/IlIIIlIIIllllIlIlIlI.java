package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import java.util.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;

public class IlIIIlIIIllllIlIlIlI extends llllIIIIlIIIlIlllIll
{
    public static final IlIIIlIlIIIllIlIlIIl IIIIIIIIIlllIllIlIlI;
    
    static {
        IIIIIIIIIlllIllIlIlI = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll("color", IlIlIlIlIlllllllllIl.class);
    }
    
    public IlIIIlIIIllllIlIlIlI(final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        super(ilIlIlIlIlllllllllIl);
        this.lIIIIlIIIIIlllIllIII(this.IIIIIllIIIIlIIIIllIl.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(IlIIIlIIIllllIlIlIlI.IIIIIIIIIlllIllIlIlI, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll));
        this.llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl);
    }
    
    @Override
    public int IlIIIlIlIIIllIlIlIIl(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return ((IlIlIlIlIlllllllllIl)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IlIIIlIIIllllIlIlIlI.IIIIIIIIIlllIllIlIlI)).IlIlIlIlIlllllllllIl();
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final List list) {
        IlIlIlIlIlllllllllIl[] values;
        for (int length = (values = net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.values()).length, i = 0; i < length; ++i) {
            list.add(new lllIIIIlIlIllIIlIIIl(ilIIIlIlIIIllIlIlIIl, 1, values[i].IlIlIlIlIlllllllllIl()));
        }
    }
    
    @Override
    public net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll IlIlIlIlIlllllllllIl(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return ((IlIlIlIlIlllllllllIl)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IlIIIlIIIllllIlIlIlI.IIIIIIIIIlllIllIlIlI)).IlIlIIIllIllIIIIIllI();
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI(final int n) {
        return this.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(IlIIIlIIIllllIlIlIlI.IIIIIIIIIlllIllIlIlI, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(n));
    }
    
    @Override
    public int llIllIIIIIllIlIIIIlI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return ((IlIlIlIlIlllllllllIl)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IlIIIlIIIllllIlIlIlI.IIIIIIIIIlllIllIlIlI)).IlIlIlIlIlllllllllIl();
    }
    
    @Override
    protected net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl IIllllIIIlIIIIIIllIl() {
        return new net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this, new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { IlIIIlIIIllllIlIlIlI.IIIIIIIIIlllIllIlIlI });
    }
}
