package net.minecraft.IIlllIIlIllIllIlIIll;

import net.minecraft.client.IlIlIIIllIllIIIIIllI.*;

public class IlIllIlIlIIIlIlIlIII
{
    private final String llllIIIIlIIIlIlllIll;
    private final int IlIlIlIlIlllllllllIl;
    
    protected IlIllIlIlIIIlIlIlIII(final String llllIIIIlIIIlIlllIll, final int ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public static IlIllIlIlIIIlIlIlIII llllIIIIlIIIlIlllIll(final String s) {
        final IlIlIIIllIllIIIIIllI llllIIIIlIIIlIlllIll = IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(s);
        return new IlIllIlIlIIIlIlIlIII(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(), llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl());
    }
}
