package net.minecraft.client.llIIlIIIlIIIllIlIIIl;

import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;
import java.util.*;

class IlIlIIIlIIlIlIIlllIl implements c
{
    final /* synthetic */ IIIlIIIlIlIIlllIIlll llllIIIIlIIIlIlllIll;
    
    IlIlIIIlIIlIlIIlllIl(final IIIlIIIlIlIIlllIIlll llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final boolean b, final int n) {
        final List ilIlIlIlIlllllllllIl = this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll);
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl);
        if (b) {
            ilIlIlIlIlllllllllIl.remove(this.llllIIIIlIIIlIlllIll);
            this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl().add(0, this.llllIIIIlIIIlIlllIll);
        }
    }
}
