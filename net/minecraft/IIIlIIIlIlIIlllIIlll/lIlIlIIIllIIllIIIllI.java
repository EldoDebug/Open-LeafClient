package net.minecraft.IIIlIIIlIlIIlllIIlll;

import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.lllIIIIlllllIlIIllIl.*;

public class lIlIlIIIllIIllIIIllI extends IllIIlllIIIIlllIIlIl
{
    private final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll;
    
    public lIlIlIIIllIIllIIIllI(final String s, final String s2, final llIIIIIIlIllIIlIIIll llIIIIIIlIllIIlIIIll, final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll) {
        super(String.valueOf(s) + s2, llIIIIIIlIllIIlIIIll);
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        final int llllIIIIlIIIlIlllIll2 = net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
        if (llllIIIIlIIIlIlllIll2 != 0) {
            net.minecraft.lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.put(String.valueOf(s) + llllIIIIlIIIlIlllIll2, this.llIllIlIIIIllIlIIllI());
        }
    }
    
    public IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
}
