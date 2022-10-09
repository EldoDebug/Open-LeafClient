package net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl;

import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

class IlIlIIIllIllIIIIIllI implements llIllIIIIIllIlIIIIlI
{
    final /* synthetic */ net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll;
    private final /* synthetic */ Set IlIlIlIlIlllllllllIl;
    
    IlIlIIIllIllIIIIIllI(final net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll, final Set ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl) {
        for (final lIllllIllIllIIllllll lIllllIllIllIIllllll : this.IlIlIlIlIlllllllllIl) {
            this.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl.put(lIllllIllIllIIllllll, ilIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl(lIllllIllIllIIllllll));
        }
    }
}
