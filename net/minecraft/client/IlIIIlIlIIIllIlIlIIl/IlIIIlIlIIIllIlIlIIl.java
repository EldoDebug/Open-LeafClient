package net.minecraft.client.IlIIIlIlIIIllIlIlIIl;

import com.google.common.collect.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import java.util.*;

public abstract class IlIIIlIlIIIllIlIlIIl
{
    public float IlIlIIIllIllIIIIIllI;
    public boolean IllIIlllIIIIlllIIlIl;
    public boolean llllIIIlIlllIlIIIIIl;
    public List lIIIIlIIIIIlllIllIII;
    private Map llllIIIIlIIIlIlllIll;
    public int lIIIlllIIIllIIIllIII;
    public int llIIlIIIlIIIllIlIIIl;
    
    public IlIIIlIlIIIllIlIlIIl() {
        this.llllIIIlIlllIlIIIIIl = true;
        this.lIIIIlIIIIIlllIllIII = Lists.newArrayList();
        this.llllIIIIlIIIlIlllIll = Maps.newHashMap();
        this.lIIIlllIIIllIIIllIII = 64;
        this.llIIlIIIlIIIllIlIIIl = 32;
    }
    
    public void llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
    }
    
    public void llllIIIIlIIIlIlllIll(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
    }
    
    public void llllIIIIlIIIlIlllIll(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final float n, final float n2, final float n3) {
    }
    
    public IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll(final Random random) {
        return this.lIIIIlIIIIIlllIllIII.get(random.nextInt(this.lIIIIlIIIIIlllIllIII.size()));
    }
    
    public void llllIIIIlIIIlIlllIll(final String s, final int n, final int n2) {
        this.llllIIIIlIIIlIlllIll.put(s, new IIlIIIlllIllIllIlIII(n, n2));
    }
    
    public IIlIIIlllIllIllIlIII llllIIIIlIIIlIlllIll(final String s) {
        return this.llllIIIIlIIIlIlllIll.get(s);
    }
    
    public static void llllIIIIlIIIlIlllIll(final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll, final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll2) {
        ilIIIIIllIlIIIlIIll2.IllIIlllIIIIlllIIlIl = ilIIIIIllIlIIIlIIll.IllIIlllIIIIlllIIlIl;
        ilIIIIIllIlIIIlIIll2.llllIIIlIlllIlIIIIIl = ilIIIIIllIlIIIlIIll.llllIIIlIlllIlIIIIIl;
        ilIIIIIllIlIIIlIIll2.lIIIIlIIIIIlllIllIII = ilIIIIIllIlIIIlIIll.lIIIIlIIIIIlllIllIII;
        ilIIIIIllIlIIIlIIll2.llIllIIIIIllIlIIIIlI = ilIIIIIllIlIIIlIIll.llIllIIIIIllIlIIIIlI;
        ilIIIIIllIlIIIlIIll2.IlIIIlIlIIIllIlIlIIl = ilIIIIIllIlIIIlIIll.IlIIIlIlIIIllIlIlIIl;
        ilIIIIIllIlIIIlIIll2.IlIlIIIllIllIIIIIllI = ilIIIIIllIlIIIlIIll.IlIlIIIllIllIIIIIllI;
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        this.IlIlIIIllIllIIIIIllI = ilIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = ilIIIlIlIIIllIlIlIIl.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = ilIIIlIlIIIllIlIlIIl.llllIIIlIlllIlIIIIIl;
    }
}
