package net.minecraft.IlllllllIIIlIIIlIlII;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;

public class IIlIIIIIllIlIIIlIIll extends IIlllIIIlIlllIIlllII
{
    private llIllIIIIIllIlIIIIlI lllIIIIlllllIlIIllIl;
    
    public IIlIIIIIllIlIIIlIIll(final String s, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final llIllIIIIIllIlIIIIlI lllIIIIlllllIlIIllIl) {
        super(s, llIllIIIIIllIlIIIIlI);
        this.lllIIIIlllllIlIIllIl = lllIIIIlllllIlIIllIl;
    }
    
    @Override
    public llIllIIIIIllIlIIIIlI lIIIlllIIIllIIIllIII() {
        return this.IIlllIIlIllIllIlIIll;
    }
    
    @Override
    public llIllIIIIIllIlIIIIlI llIIlIIIlIIIllIlIIIl() {
        return this.lllIIIIlllllIlIIllIl;
    }
    
    @Override
    public llIIIIIIlIllIIlIIIll IlIlIlIlIlllllllllIl(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        final llIIIIIIlIllIIlIIIll llIIIIIIlIllIIlIIIll = (this.lllIIIIlllllIlIIllIl == null) ? this.IIlllIIlIllIllIlIIll.v_() : this.lllIIIIlllllIlIIllIl.v_();
        final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = (this.lllIIIIlllllIlIIllIl instanceof lllIIIIlllllIlIIllIl) ? ((lllIIIIlllllIlIIllIl)this.lllIIIIlllllIlIIllIl).n() : null;
        final String string = "death.attack." + this.IlIllIlIlIIIlIlIlIII;
        final String string2 = String.valueOf(string) + ".item";
        return (lllIIIIlIlIllIIlIIIl != null && lllIIIIlIlIllIIlIIIl.IlIlIIIIIIlllIlIllIl() && lIIlllIlllllIIlllIll.llIllIIIIIllIlIIIIlI(string2)) ? new IIllIIllIIIlIlIIIIlI(string2, new Object[] { lllIIIIlllllIlIIllIl.v_(), llIIIIIIlIllIIlIIIll, lllIIIIlIlIllIIlIIIl.lllllIlIIIlIlIIlllII() }) : new IIllIIllIIIlIlIIIIlI(string, new Object[] { lllIIIIlllllIlIIllIl.v_(), llIIIIIIlIllIIlIIIll });
    }
}
