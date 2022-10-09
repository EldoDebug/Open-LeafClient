package net.minecraft.llIllIlIIIIllIlIIllI;

import com.google.common.base.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;

public class IIlIlIlIIlIllIIIIIIl extends IIllIIIlIIlIlIlIIIII
{
    public IIlIlIlIIlIllIIIIIIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2, final Function function) {
        super(llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2, function);
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final int n) {
        final lIlIlIlllIIlIlIlllIl llllIIIIlIIIlIlllIll = lIlIlIlllIIlIlIlllIl.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII());
        return (llllIIIIlIIIlIlllIll != lIlIlIlllIIlIlIlllIl.llIllIIIIIllIlIIIIlI && llllIIIIlIIIlIlllIll != lIlIlIlllIIlIlIlllIl.IlIIIlIlIIIllIlIlIIl) ? super.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl, n) : net.minecraft.IIIlIIlIIIIlllIlllII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(0.5, 1.0);
    }
}
