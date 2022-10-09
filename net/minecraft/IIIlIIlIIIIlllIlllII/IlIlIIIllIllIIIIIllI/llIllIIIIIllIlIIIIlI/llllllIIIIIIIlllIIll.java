package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;

import com.google.common.collect.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class llllllIIIIIIIlllIIll extends IIIIIlllIlIIIIIIIllI
{
    public llIlllIlllllIIllIIII llllIIIIlIIIlIlllIll;
    public lllllIlIlIlllIlllIlI IlIlIlIlIlllllllllIl;
    public List llIllIIIIIllIlIIIIlI;
    
    public llllllIIIIIIIlllIIll() {
        this.llIllIIIIIllIlIIIIlI = Lists.newArrayList();
    }
    
    public llllllIIIIIIIlllIIll(final int n, final Random random, final int n2, final int n3) {
        super(0, random, n2, n3);
        this.llIllIIIIIllIlIIIIlI = Lists.newArrayList();
    }
    
    @Override
    public IlIlIlIlIlllllllllIl IlIlIIIllIllIIIIIllI() {
        return (this.IlIlIlIlIlllllllllIl != null) ? this.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI() : super.IlIlIIIllIllIIIIIllI();
    }
}
