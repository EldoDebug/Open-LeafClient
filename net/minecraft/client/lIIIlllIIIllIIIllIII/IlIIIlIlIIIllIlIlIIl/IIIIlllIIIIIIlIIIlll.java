package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IIIIlllIIIIIIlIIIlll extends IIllllIIIlIIIIIIllIl
{
    private static final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll;
    private lllIIIIlllllIlIIllIl IlIlIIIllIllIIIIIllI;
    private Random IIIlIIIlIlIIlllIIlll;
    
    static {
        llllIIIIlIIIlIlllIll = new lIllllIllIllIIllllll("textures/entity/enderman/enderman.png");
    }
    
    public IIIIlllIIIIIIlIIIlll(final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        super(lllIllIIIllllllIllll, new lllIIIIlllllIlIIllIl(0.0f), 0.5f);
        this.IIIlIIIlIlIIlllIIlll = new Random();
        this.IlIlIIIllIllIIIIIllI = (lllIIIIlllllIlIIllIl)super.IllIIlllIIIIlllIIlIl;
        this.llllIIIIlIIIlIlllIll(new llIIlIIIlIIIllIlIIIl(this));
        this.llllIIIIlIIIlIlllIll(new llIllIlIIIIllIlIIllI(this));
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI, double n, final double n2, double n3, final float n4, final float n5) {
        this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll = (ilIlIIIllIllIIIIIllI.ao().llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll);
        this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl = ilIlIIIllIllIIIIIllI.ap();
        if (ilIlIIIllIllIIIIIllI.ap()) {
            final double n6 = 0.02;
            n += this.IIIlIIIlIlIIlllIIlll.nextGaussian() * n6;
            n3 += this.IIIlIIIlIlIIlllIIlll.nextGaussian() * n6;
        }
        super.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, n, n2, n3, n4, n5);
    }
    
    protected lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI) {
        return IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll;
    }
}
