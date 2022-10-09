package net.minecraft.IlIlIlIlIlllllllllIl;

import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import com.google.common.collect.*;

class IlIIllIIllIIllIIlIIl implements Comparator
{
    private final /* synthetic */ IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll;
    
    IlIIllIIllIIllIIlIIl(final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public int llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI2) {
        return ComparisonChain.start().compare(llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll), llIllIIIIIllIlIIIIlI2.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll)).result();
    }
}
