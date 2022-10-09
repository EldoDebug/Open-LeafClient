package net.minecraft.IlllllllIIIlIIIlIlII;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;

public class IIlllIIIlIlllIIlllII extends lIllllllIIllIlIlIlII
{
    protected llIllIIIIIllIlIIIIlI IIlllIIlIllIllIlIIll;
    private boolean lllIIIIlllllIlIIllIl;
    
    public IIlllIIIlIlllIIlllII(final String s, final llIllIIIIIllIlIIIIlI iIlllIIlIllIllIlIIll) {
        super(s);
        this.lllIIIIlllllIlIIllIl = false;
        this.IIlllIIlIllIllIlIIll = iIlllIIlIllIllIlIIll;
    }
    
    public IIlllIIIlIlllIIlllII IlIlIIIlIIlIlIIlllIl() {
        this.lllIIIIlllllIlIIllIl = true;
        return this;
    }
    
    public boolean IlllllllIIIlIIIlIlII() {
        return this.lllIIIIlllllIlIIllIl;
    }
    
    @Override
    public llIllIIIIIllIlIIIIlI llIIlIIIlIIIllIlIIIl() {
        return this.IIlllIIlIllIllIlIIll;
    }
    
    @Override
    public llIIIIIIlIllIIlIIIll IlIlIlIlIlllllllllIl(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = (this.IIlllIIlIllIllIlIIll instanceof lllIIIIlllllIlIIllIl) ? ((lllIIIIlllllIlIIllIl)this.IIlllIIlIllIllIlIIll).n() : null;
        final String string = "death.attack." + this.IlIllIlIlIIIlIlIlIII;
        final String string2 = String.valueOf(string) + ".item";
        return (lllIIIIlIlIllIIlIIIl != null && lllIIIIlIlIllIIlIIIl.IlIlIIIIIIlllIlIllIl() && lIIlllIlllllIIlllIll.llIllIIIIIllIlIIIIlI(string2)) ? new IIllIIllIIIlIlIIIIlI(string2, new Object[] { lllIIIIlllllIlIIllIl.v_(), this.IIlllIIlIllIllIlIIll.v_(), lllIIIIlIlIllIIlIIIl.lllllIlIIIlIlIIlllII() }) : new IIllIIllIIIlIlIIIIlI(string, new Object[] { lllIIIIlllllIlIIllIl.v_(), this.IIlllIIlIllIllIlIIll.v_() });
    }
    
    @Override
    public boolean lllIIIIlllllIlIIllIl() {
        return this.IIlllIIlIllIllIlIIll != null && this.IIlllIIlIllIllIlIIll instanceof lllIIIIlllllIlIIllIl && !(this.IIlllIIlIllIllIlIIll instanceof llllIIIIlIIIlIlllIll);
    }
}
