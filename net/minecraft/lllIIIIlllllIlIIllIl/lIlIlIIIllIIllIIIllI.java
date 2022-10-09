package net.minecraft.lllIIIIlllllIlIIllIl;

import net.minecraft.IlIlIIIIIIlllIlIllIl.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.*;
import com.google.common.collect.*;
import java.util.*;

public class lIlIlIIIllIIllIIIllI extends llIIlIIIlIIIllIlIIIl
{
    private final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll;
    private final Set IlIlIlIlIlllllllllIl;
    private llIllIlIIIIllIlIIllI llIllIIIIIllIlIIIIlI;
    
    public lIlIlIIIllIIllIIIllI(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        this.IlIlIlIlIlllllllllIl = Sets.newHashSet();
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        super.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl);
        if (this.IlIlIlIlIlllllllllIl.contains(ilIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI())) {
            this.llllIIIIlIIIlIlllIll.IIlllIIlllIIIlIlllII().llllIIIIlIIIlIlllIll(new llllIllllIllllIlIlII(ilIIIlIlIIIllIlIlIIl));
        }
        this.llllIIIlIlllIlIIIIIl();
    }
    
    @Override
    public void llllIIIlIlllIlIIIIIl(final String s) {
        super.llllIIIlIlllIlIIIIIl(s);
        this.llllIIIIlIIIlIlllIll.IIlllIIlllIIIlIlllII().llllIIIIlIIIlIlllIll(new llllIllllIllllIlIlII(s));
        this.llllIIIlIlllIlIIIIIl();
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl(final String s, final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        super.IlIIIlIlIIIllIlIlIIl(s, liiiIlIIIIIlllIllIII);
        this.llllIIIIlIIIlIlllIll.IIlllIIlllIIIlIlllII().llllIIIIlIIIlIlllIll(new llllIllllIllllIlIlII(s, liiiIlIIIIIlllIllIII));
        this.llllIIIlIlllIlIIIIIl();
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        final lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(n);
        super.llllIIIIlIIIlIlllIll(n, liiiIlIIIIIlllIllIII);
        if (llllIIIIlIIIlIlllIll != liiiIlIIIIIlllIllIII && llllIIIIlIIIlIlllIll != null) {
            if (this.llIIlIIIlIIIllIlIIIl(llllIIIIlIIIlIlllIll) > 0) {
                this.llllIIIIlIIIlIlllIll.IIlllIIlllIIIlIlllII().llllIIIIlIIIlIlllIll(new lIIllIIIllllIlllIllI(n, liiiIlIIIIIlllIllIII));
            }
            else {
                this.lIIIlllIIIllIIIllIII(llllIIIIlIIIlIlllIll);
            }
        }
        if (liiiIlIIIIIlllIllIII != null) {
            if (this.IlIlIlIlIlllllllllIl.contains(liiiIlIIIIIlllIllIII)) {
                this.llllIIIIlIIIlIlllIll.IIlllIIlllIIIlIlllII().llllIIIIlIIIlIlllIll(new lIIllIIIllllIlllIllI(n, liiiIlIIIIIlllIllIII));
            }
            else {
                this.llllIIIlIlllIlIIIIIl(liiiIlIIIIIlllIllIII);
            }
        }
        this.llllIIIlIlllIlIIIIIl();
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final String s, final String s2) {
        if (super.llllIIIIlIIIlIlllIll(s, s2)) {
            this.llllIIIIlIIIlIlllIll.IIlllIIlllIIIlIlllII().llllIIIIlIIIlIlllIll(new IllIlIllIllIlllIIlll(this.llIllIIIIIllIlIIIIlI(s2), Arrays.asList(s), 3));
            this.llllIIIlIlllIlIIIIIl();
            return true;
        }
        return false;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final String s, final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
        super.llllIIIIlIIIlIlllIll(s, liiIlllIIIllIIIllIII);
        this.llllIIIIlIIIlIlllIll.IIlllIIlllIIIlIlllII().llllIIIIlIIIlIlllIll(new IllIlIllIllIlllIIlll(liiIlllIIIllIIIllIII, Arrays.asList(s), 4));
        this.llllIIIlIlllIlIIIIIl();
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        super.llIllIIIIIllIlIIIIlI(liiiIlIIIIIlllIllIII);
        this.llllIIIlIlllIlIIIIIl();
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        super.IlIIIlIlIIIllIlIlIIl(liiiIlIIIIIlllIllIII);
        if (this.IlIlIlIlIlllllllllIl.contains(liiiIlIIIIIlllIllIII)) {
            this.llllIIIIlIIIlIlllIll.IIlllIIlllIIIlIlllII().llllIIIIlIIIlIlllIll(new IIlllllIllIllIlIlIII(liiiIlIIIIIlllIllIII, 2));
        }
        this.llllIIIlIlllIlIIIIIl();
    }
    
    @Override
    public void IlIlIIIllIllIIIIIllI(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        super.IlIlIIIllIllIIIIIllI(liiiIlIIIIIlllIllIII);
        if (this.IlIlIlIlIlllllllllIl.contains(liiiIlIIIIIlllIllIII)) {
            this.lIIIlllIIIllIIIllIII(liiiIlIIIIIlllIllIII);
        }
        this.llllIIIlIlllIlIIIIIl();
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
        super.IlIlIlIlIlllllllllIl(liiIlllIIIllIIIllIII);
        this.llllIIIIlIIIlIlllIll.IIlllIIlllIIIlIlllII().llllIIIIlIIIlIlllIll(new IllIlIllIllIlllIIlll(liiIlllIIIllIIIllIII, 0));
        this.llllIIIlIlllIlIIIIIl();
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
        super.llIllIIIIIllIlIIIIlI(liiIlllIIIllIIIllIII);
        this.llllIIIIlIIIlIlllIll.IIlllIIlllIIIlIlllII().llllIIIIlIIIlIlllIll(new IllIlIllIllIlllIIlll(liiIlllIIIllIIIllIII, 2));
        this.llllIIIlIlllIlIIIIIl();
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
        super.IlIIIlIlIIIllIlIlIIl(liiIlllIIIllIIIllIII);
        this.llllIIIIlIIIlIlllIll.IIlllIIlllIIIlIlllII().llllIIIIlIIIlIlllIll(new IllIlIllIllIlllIIlll(liiIlllIIIllIIIllIII, 1));
        this.llllIIIlIlllIlIIIIIl();
    }
    
    public void llllIIIIlIIIlIlllIll(final llIllIlIIIIllIlIIllI llIllIIIIIllIlIIIIlI) {
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    protected void llllIIIlIlllIlIIIIIl() {
        if (this.llIllIIIIIllIlIIIIlI != null) {
            this.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl();
        }
    }
    
    public List IllIIlllIIIIlllIIlIl(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        final ArrayList arrayList = Lists.newArrayList();
        arrayList.add(new IIlllllIllIllIlIlIII(liiiIlIIIIIlllIllIII, 0));
        for (int i = 0; i < 19; ++i) {
            if (this.llllIIIIlIIIlIlllIll(i) == liiiIlIIIIIlllIllIII) {
                arrayList.add(new lIIllIIIllllIlllIllI(i, liiiIlIIIIIlllIllIII));
            }
        }
        final Iterator<IlIIIlIlIIIllIlIlIIl> iterator = (Iterator<IlIIIlIlIIIllIlIlIIl>)this.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII).iterator();
        while (iterator.hasNext()) {
            arrayList.add(new llllIllllIllllIlIlII(iterator.next()));
        }
        return arrayList;
    }
    
    public void llllIIIlIlllIlIIIIIl(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        final List illIIlllIIIIlllIIlIl = this.IllIIlllIIIIlllIIlIl(liiiIlIIIIIlllIllIII);
        for (final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl : this.llllIIIIlIIIlIlllIll.IIlllIIlllIIIlIlllII().IIIlIIIlIlIIlllIIlll()) {
            final Iterator<IIlIIIIIllIlIIIlIIll> iterator2 = illIIlllIIIIlllIIlIl.iterator();
            while (iterator2.hasNext()) {
                ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(iterator2.next());
            }
        }
        this.IlIlIlIlIlllllllllIl.add(liiiIlIIIIIlllIllIII);
    }
    
    public List lIIIIlIIIIIlllIllIII(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        final ArrayList arrayList = Lists.newArrayList();
        arrayList.add(new IIlllllIllIllIlIlIII(liiiIlIIIIIlllIllIII, 1));
        for (int i = 0; i < 19; ++i) {
            if (this.llllIIIIlIIIlIlllIll(i) == liiiIlIIIIIlllIllIII) {
                arrayList.add(new lIIllIIIllllIlllIllI(i, liiiIlIIIIIlllIllIII));
            }
        }
        return arrayList;
    }
    
    public void lIIIlllIIIllIIIllIII(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        final List liiiIlIIIIIlllIllIII2 = this.lIIIIlIIIIIlllIllIII(liiiIlIIIIIlllIllIII);
        for (final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl : this.llllIIIIlIIIlIlllIll.IIlllIIlllIIIlIlllII().IIIlIIIlIlIIlllIIlll()) {
            final Iterator<IIlIIIIIllIlIIIlIIll> iterator2 = liiiIlIIIIIlllIllIII2.iterator();
            while (iterator2.hasNext()) {
                ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(iterator2.next());
            }
        }
        this.IlIlIlIlIlllllllllIl.remove(liiiIlIIIIIlllIllIII);
    }
    
    public int llIIlIIIlIIIllIlIIIl(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        int n = 0;
        for (int i = 0; i < 19; ++i) {
            if (this.llllIIIIlIIIlIlllIll(i) == liiiIlIIIIIlllIllIII) {
                ++n;
            }
        }
        return n;
    }
}
