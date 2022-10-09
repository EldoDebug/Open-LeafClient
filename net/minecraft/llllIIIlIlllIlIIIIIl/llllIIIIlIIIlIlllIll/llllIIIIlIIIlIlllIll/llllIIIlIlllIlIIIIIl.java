package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class llllIIIlIlllIlIIIIIl extends IlIlIlIlIlllllllllIl
{
    private final double llllIIIIlIIIlIlllIll;
    private final double IlIlIlIlIlllllllllIl;
    private String llIllIIIIIllIlIIIIlI;
    
    public llllIIIlIlllIlIIIIIl(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final String s, final double n, final double llllIIIIlIIIlIlllIll, final double ilIlIlIlIlllllllllIl) {
        super(ilIIIlIlIIIllIlIlIIl, s, n);
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        if (llllIIIIlIIIlIlllIll > ilIlIlIlIlllllllllIl) {
            throw new IllegalArgumentException("Minimum value cannot be bigger than maximum value!");
        }
        if (n < llllIIIIlIIIlIlllIll) {
            throw new IllegalArgumentException("Default value cannot be lower than minimum value!");
        }
        if (n > ilIlIlIlIlllllllllIl) {
            throw new IllegalArgumentException("Default value cannot be bigger than maximum value!");
        }
    }
    
    public llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll(final String llIllIIIIIllIlIIIIlI) {
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        return this;
    }
    
    public String IlIlIIIllIllIIIIIllI() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    public double llllIIIIlIIIlIlllIll(double llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, this.llllIIIIlIIIlIlllIll, this.IlIlIlIlIlllllllllIl);
        return llllIIIIlIIIlIlllIll;
    }
}
