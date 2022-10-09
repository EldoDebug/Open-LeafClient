package net.minecraft.client.lIIIlllIIIllIIIllIII;

import com.google.common.collect.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.optifine.lIIIIlIIIIIlllIllIII.*;
import net.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.optifine.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.*;
import java.util.*;

public class lIlIlIlllIIlIlIlllIl
{
    private final Map llllIIIIlIIIlIlllIll;
    private final Map IlIlIlIlIlllllllllIl;
    private final Map llIllIIIIIllIlIIIIlI;
    private final IllIIlllIIIIlllIIlIl IlIIIlIlIIIllIlIlIIl;
    
    public lIlIlIlllIIlIlIlllIl(final IllIIlllIIIIlllIIlIl ilIIIlIlIIIllIlIlIIl) {
        this.llllIIIIlIIIlIlllIll = Maps.newHashMap();
        this.IlIlIlIlIlllllllllIl = Maps.newHashMap();
        this.llIllIIIIIllIlIIIIlI = Maps.newHashMap();
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public IlIlIIIllIIllIlllllI llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        return this.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, 0);
    }
    
    public IlIlIIIllIIllIlllllI llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final int n) {
        return this.llllIIIIlIIIlIlllIll(new lllIIIIlIlIllIIlIIIl(ilIIIlIlIIIllIlIlIIl, 1, n)).IlIlIIIllIllIIIIIllI();
    }
    
    public IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll();
        IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll, this.IlIlIlIlIlllllllllIl(lllIIIIlIlIllIIlIIIl));
        if (ilIlIlIlIlllllllllIl == null) {
            final IIlIIIlllIllIllIlIII ilIIIlllIllIllIlIII = this.llIllIIIIIllIlIIIIlI.get(llllIIIIlIIIlIlllIll);
            if (ilIIIlllIllIllIlIII != null) {
                ilIlIlIlIlllllllllIl = this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(ilIIIlllIllIllIlIII.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl));
            }
        }
        if (lIIIIlIIIIIlllIllIII.IIlIlllIlIlllIlIllll.llIllIIIIIllIlIIIIlI() && ilIlIlIlIlllllllllIl instanceof llIllIIIIIllIlIIIIlI) {
            ilIlIlIlIlllllllllIl = ((llIllIIIIIllIlIIIIlI)ilIlIlIlIlllllllllIl).llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl);
        }
        if (ilIlIlIlIlllllllllIl == null) {
            ilIlIlIlIlllllllllIl = this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll();
        }
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.p()) {
            ilIlIlIlIlllllllllIl = lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl, ilIlIlIlIlllllllllIl, null, true);
        }
        return ilIlIlIlIlllllllllIl;
    }
    
    protected int IlIlIlIlIlllllllllIl(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return lllIIIIlIlIllIIlIIIl.IlIIIlIlIIIllIlIlIIl() ? 0 : lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII();
    }
    
    protected IlIlIlIlIlllllllllIl IlIlIlIlIlllllllllIl(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final int n) {
        return this.IlIlIlIlIlllllllllIl.get(this.llIllIIIIIllIlIIIIlI(ilIIIlIlIIIllIlIlIIl, n));
    }
    
    private int llIllIIIIIllIlIIIIlI(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final int n) {
        return net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl) << 16 | n;
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final int n, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl) {
        this.llllIIIIlIIIlIlllIll.put(this.llIllIIIIIllIlIIIIlI(ilIIIlIlIIIllIlIlIIl, n), llllIIIlIlllIlIIIIIl);
        this.IlIlIlIlIlllllllllIl.put(this.llIllIIIIIllIlIIIIlI(ilIIIlIlIIIllIlIlIIl, n), this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl));
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final IIlIIIlllIllIllIlIII ilIIIlllIllIllIlIII) {
        this.llIllIIIIIllIlIIIIlI.put(ilIIIlIlIIIllIlIlIIl, ilIIIlllIllIllIlIII);
    }
    
    public IllIIlllIIIIlllIIlIl llllIIIIlIIIlIlllIll() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public void IlIlIlIlIlllllllllIl() {
        this.IlIlIlIlIlllllllllIl.clear();
        for (final Map.Entry<Integer, V> entry : this.llllIIIIlIIIlIlllIll.entrySet()) {
            this.IlIlIlIlIlllllllllIl.put(entry.getKey(), this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll((llllIIIlIlllIlIIIIIl)entry.getValue()));
        }
    }
}
