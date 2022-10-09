package net.optifine;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

class IlIlIIIllIllIIIIIllI implements Iterable
{
    private final /* synthetic */ IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll;
    private final /* synthetic */ IlIlIlIlIlllllllllIl IlIlIlIlIlllllllllIl;
    
    IlIlIIIllIllIIIIIllI(final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    @Override
    public Iterator iterator() {
        return (Iterator)new IllIIlllIIIIlllIIlIl(this, this.llllIIIIlIIIlIlllIll, this.IlIlIlIlIlllllllllIl);
    }
}
