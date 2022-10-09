package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;

import com.google.common.collect.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.*;

public class g extends j
{
    public IIIllllllIllIIIlllIl llllIIIIlIIIlIlllIll;
    public boolean IlIlIlIlIlllllllllIl;
    public int llIllIIIIIllIlIIIIlI;
    public e IlIIIlIlIIIllIlIlIIl;
    public List lIIIIlIIIIIlllIllIII;
    public List lIIIlllIIIllIIIllIII;
    public List llIIlIIIlIIIllIlIIIl;
    
    public g() {
        this.lIIIlllIIIllIIIllIII = Lists.newArrayList();
        this.llIIlIIIlIIIllIlIIIl = Lists.newArrayList();
    }
    
    public g(final IIIllllllIllIIIlllIl llllIIIIlIIIlIlllIll, final int n, final Random random, final int n2, final int n3, final List liiiIlIIIIIlllIllIII, final int llIllIIIIIllIlIIIIlI) {
        super(null, 0, random, n2, n3);
        this.lIIIlllIIIllIIIllIII = Lists.newArrayList();
        this.llIIlIIIlIIIllIlIIIl = Lists.newArrayList();
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new IlIlIlIlIlllllllllIl(n2, 0, n3), net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IlIIllIIllIIllIIlIIl);
        this.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl = (llllIIIIlIIIlIlllIll2 == net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.lllIIIIlllllIlIIllIl || llllIIIIlIIIlIlllIll2 == net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IIlIIIIIllIlIIIlIIll));
    }
    
    public IIIllllllIllIIIlllIl llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
}
