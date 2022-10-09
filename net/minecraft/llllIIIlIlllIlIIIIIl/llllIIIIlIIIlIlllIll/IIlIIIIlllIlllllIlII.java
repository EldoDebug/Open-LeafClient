package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IIlIIIIlllIlllllIlII extends lllllIIIIIlIlIIIIIIl
{
    private final IlIlIllllllllIIIIlII IlIlIIIllIllIIIIIllI;
    
    public IIlIIIIlllIlllllIlII(final IlIlIllllllllIIIIlII ilIlIIIllIllIIIIIllI) {
        super(ilIlIIIllIllIIIIIllI, llllIIIIlIIIlIlllIll.class, 8.0f);
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll() {
        if (this.IlIlIIIllIllIIIIIllI.aq()) {
            this.IlIlIlIlIlllllllllIl = this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll();
            return true;
        }
        return false;
    }
}
