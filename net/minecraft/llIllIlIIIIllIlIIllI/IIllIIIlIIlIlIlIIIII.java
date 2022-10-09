package net.minecraft.llIllIlIIIIllIlIIllI;

import net.minecraft.llllIIIIlIIIlIlllIll.*;
import com.google.common.base.*;

public class IIllIIIlIIlIlIlIIIII extends IIlllIIIlIlllIIlllII
{
    protected final llllIIIIlIIIlIlllIll lIIIIlIIIIIlllIllIII;
    protected final Function lIIIlllIIIllIIIllIII;
    
    public IIllIIIlIIlIlIlIIIII(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final llllIIIIlIIIlIlllIll liiiIlIIIIIlllIllIII, final Function liiIlllIIIllIIIllIII) {
        super(llllIIIIlIIIlIlllIll);
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
        this.IlIIIlIlIIIllIlIlIIl(0);
        this.llllIIIIlIIIlIlllIll(true);
    }
    
    public IIllIIIlIIlIlIlIIIII(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2, final String[] array) {
        this(llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2, (Function)new llIllIIlllllllllllll(array));
    }
    
    @Override
    public int llIllIIIIIllIlIIIIlI(final int n) {
        return n;
    }
    
    @Override
    public String IlIlIlIlIlllllllllIl(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return String.valueOf(super.lIIIIlIIIIIlllIllIII()) + "." + (String)this.lIIIlllIIIllIIIllIII.apply((Object)lllIIIIlIlIllIIlIIIl);
    }
}
