package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll;

import java.util.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IIIllllllIllIIIlllIl implements Comparator
{
    private final llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll;
    
    public IIIllllllIllIIIlllIl(final llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public int llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI2) {
        final double ilIlIIIllIllIIIIIllI = this.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI(llIllIIIIIllIlIIIIlI);
        final double ilIlIIIllIllIIIIIllI2 = this.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI(llIllIIIIIllIlIIIIlI2);
        return (ilIlIIIllIllIIIIIllI < ilIlIIIllIllIIIIIllI2) ? -1 : (ilIlIIIllIllIIIIIllI > ilIlIIIllIllIIIIIllI2);
    }
}
