package net.minecraft.llIllIlIIIIllIlIIllI;

import net.minecraft.llllIIIIlIIIlIlllIll.*;

public class IlIIlllllIIllIIlllll extends IIlllIIIlIlllIIlllII
{
    private final lIllIlIIIllllllIIlII lIIIIlIIIIIlllIllIII;
    
    public IlIIlllllIIllIIlllll(final lIllIlIIIllllllIIlII liiiIlIIIIIlllIllIII) {
        super(liiiIlIIIIIlllIllIII);
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        this.IlIIIlIlIIIllIlIlIIl(0);
        this.llllIIIIlIIIlIlllIll(true);
    }
    
    @Override
    public int llIllIIIIIllIlIIIIlI(final int n) {
        return n | 0x4;
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final int n) {
        return this.lIIIIlIIIIIlllIllIII.IlIlIIIllIllIIIIIllI(this.lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI(lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII()));
    }
    
    @Override
    public String IlIlIlIlIlllllllllIl(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return String.valueOf(super.lIIIIlIIIIIlllIllIII()) + "." + this.lIIIIlIIIIIlllIllIII.IlIlIIIllIllIIIIIllI(lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII()).IlIIIlIlIIIllIlIlIIl();
    }
}
