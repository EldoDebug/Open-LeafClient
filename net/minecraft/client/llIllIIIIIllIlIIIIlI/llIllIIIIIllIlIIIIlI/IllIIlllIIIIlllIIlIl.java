package net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI;

import com.google.common.collect.*;
import com.google.common.base.*;
import java.util.*;

public class IllIIlllIIIIlllIIlIl
{
    private static final IlIlIlIlIlllllllllIl IlIlIlIlIlllllllllIl;
    private static final IlIlIlIlIlllllllllIl llIllIIIIIllIlIIIIlI;
    private static final IlIlIlIlIlllllllllIl IlIIIlIlIIIllIlIlIIl;
    private static final IlIlIlIlIlllllllllIl IlIlIIIllIllIIIIIllI;
    public static final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll;
    private final llIllIIIIIllIlIIIIlI IllIIlllIIIIlllIIlIl;
    private final List llllIIIlIlllIlIIIIIl;
    private IlIIIlIlIIIllIlIlIIl lIIIIlIIIIIlllIllIII;
    private int lIIIlllIIIllIIIllIII;
    private int llIIlIIIlIIIllIlIIIl;
    
    static {
        IlIlIlIlIlllllllllIl = new lIIIIlIIIIIlllIllIII(null);
        llIllIIIIIllIlIIIIlI = new lIIIlllIIIllIIIllIII(-1, true);
        IlIIIlIlIIIllIlIlIIl = new lIIIlllIIIllIIIllIII(1, true);
        IlIlIIIllIllIIIIIllI = new lIIIlllIIIllIIIllIII(1, false);
        llllIIIIlIIIlIlllIll = new llllIIIlIlllIlIIIIIl();
    }
    
    public IllIIlllIIIIlllIIlIl(final llIllIIIIIllIlIIIIlI illIIlllIIIIlllIIlIl) {
        this.llllIIIlIlllIlIIIIIl = Lists.newArrayList();
        this.lIIIIlIIIIIlllIllIII = new llllIIIIlIIIlIlllIll();
        this.lIIIlllIIIllIIIllIII = -1;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
    }
    
    public IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final int n) {
        final int n2 = n + this.llIIlIIIlIIIllIlIIIl * 6;
        return (IlIlIlIlIlllllllllIl)((this.llIIlIIIlIIIllIlIIIl > 0 && n == 0) ? net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI : ((n == 7) ? ((n2 < this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll().size()) ? net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl : net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl.IlIlIIIllIllIIIIIllI) : ((n == 8) ? net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl : ((n2 >= 0 && n2 < this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll().size()) ? Objects.firstNonNull((Object)this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll().get(n2), (Object)net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll) : net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll))));
    }
    
    public List llllIIIIlIIIlIlllIll() {
        final ArrayList arrayList = Lists.newArrayList();
        for (int i = 0; i <= 8; ++i) {
            arrayList.add(this.llllIIIIlIIIlIlllIll(i));
        }
        return arrayList;
    }
    
    public IlIlIlIlIlllllllllIl IlIlIlIlIlllllllllIl() {
        return this.llllIIIIlIIIlIlllIll(this.lIIIlllIIIllIIIllIII);
    }
    
    public IlIIIlIlIIIllIlIlIIl llIllIIIIIllIlIIIIlI() {
        return this.lIIIIlIIIIIlllIllIII;
    }
    
    public void IlIlIlIlIlllllllllIl(final int liiIlllIIIllIIIllIII) {
        final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII);
        if (llllIIIIlIIIlIlllIll != net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll) {
            if (this.lIIIlllIIIllIIIllIII == liiIlllIIIllIIIllIII && llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl()) {
                llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this);
            }
            else {
                this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
            }
        }
    }
    
    public void IlIIIlIlIIIllIlIlIIl() {
        this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(this);
    }
    
    public int IlIlIIIllIllIIIIIllI() {
        return this.lIIIlllIIIllIIIllIII;
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl liiiIlIIIIIlllIllIII) {
        this.llllIIIlIlllIlIIIIIl.add(this.IllIIlllIIIIlllIIlIl());
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = -1;
        this.llIIlIIIlIIIllIlIIIl = 0;
    }
    
    public net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll IllIIlllIIIIlllIIlIl() {
        return new net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII, this.llllIIIIlIIIlIlllIll(), this.lIIIlllIIIllIIIllIII);
    }
}
