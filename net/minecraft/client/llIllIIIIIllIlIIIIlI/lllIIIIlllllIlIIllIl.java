package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import com.google.common.base.*;
import com.google.common.primitives.*;

class lllIIIIlllllIlIIllIl implements Predicate
{
    final /* synthetic */ IIlllIIlIllIllIlIIll llllIIIIlIIIlIlllIll;
    
    lllIIIIlllllIlIIllIl(final IIlllIIlIllIllIlIIll llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final String s) {
        final Float tryParse = Floats.tryParse(s);
        return s.length() == 0 || (tryParse != null && Floats.isFinite((float)tryParse) && tryParse >= 0.0f);
    }
}
