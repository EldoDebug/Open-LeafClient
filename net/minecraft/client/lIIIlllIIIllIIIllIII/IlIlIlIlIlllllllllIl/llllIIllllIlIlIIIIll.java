package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;

public class llllIIllllIlIlIIIIll extends IlIllIlIlIIIlIlIlIII
{
    private final int lIIIIlIIIIIlllIllIII;
    
    public llllIIllllIlIlIIIIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final lllllIIIIIlIlIIIIIIl lllllIIIIIlIlIIIIIIl, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n) {
        super(illlllllIIIlIIIlIlII, lllllIIIIIlIlIIIIIIl, ilIlIlIlIlllllllllIl, n);
        this.lIIIIlIIIIIlllIllIII = net.minecraft.client.lIIIlllIIIllIIIllIII.llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll(IlIIlIlIIIlIIlIlIlII.values().length);
    }
    
    public int llllIIIIlIIIlIlllIll(final IlIIlIlIIIlIIlIlIlII ilIIlIlIIIlIIlIlIlII, final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI) {
        return llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl(ilIIlIlIIIlIIlIlIlII) ? -1 : (this.lIIIIlIIIIIlllIllIII + ilIIlIlIIIlIIlIlIlII.ordinal());
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll() {
        super.llllIIIIlIIIlIlllIll();
        net.minecraft.client.lIIIlllIIIllIIIllIII.llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII, IlIIlIlIIIlIIlIlIlII.values().length);
    }
}
