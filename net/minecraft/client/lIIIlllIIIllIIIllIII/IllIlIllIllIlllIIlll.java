package net.minecraft.client.lIIIlllIIIllIIIllIII;

import java.util.*;
import com.google.common.primitives.*;

class IllIlIllIllIlllIIlll implements Comparator
{
    final /* synthetic */ lIIllIIIllllIlllIllI llllIIIIlIIIlIlllIll;
    private final /* synthetic */ float[] IlIlIlIlIlllllllllIl;
    
    IllIlIllIllIlllIIlll(final lIIllIIIllllIlllIllI llllIIIIlIIIlIlllIll, final float[] ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public int llllIIIIlIIIlIlllIll(final Integer n, final Integer n2) {
        return Floats.compare(this.IlIlIlIlIlllllllllIl[n2], this.IlIlIlIlIlllllllllIl[n]);
    }
}
