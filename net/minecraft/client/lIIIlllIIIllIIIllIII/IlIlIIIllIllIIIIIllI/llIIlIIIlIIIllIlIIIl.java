package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI;

import com.google.common.collect.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

public class llIIlIIIlIIIllIlIIIl
{
    private final int llllIIIIlIIIlIlllIll;
    private final Set IlIlIlIlIlllllllllIl;
    private final List llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    private int IlIlIIIllIllIIIIIllI;
    private final int IllIIlllIIIIlllIIlIl;
    private final int llllIIIlIlllIlIIIIIl;
    private final boolean lIIIIlIIIIIlllIllIII;
    private final int lIIIlllIIIllIIIllIII;
    
    public llIIlIIIlIIIllIlIIIl(final int illIIlllIIIIlllIIlIl, final int llllIIIlIlllIlIIIIIl, final boolean liiiIlIIIIIlllIllIII, final int liiIlllIIIllIIIllIII, final int llllIIIIlIIIlIlllIll) {
        this.IlIlIlIlIlllllllllIl = Sets.newHashSetWithExpectedSize(256);
        this.llIllIIIIIllIlIIIIlI = Lists.newArrayListWithCapacity(256);
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI) {
        final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI = new llIllIlIIIIllIlIIllI(ilIlIIIllIIllIlllllI, this.llllIIIIlIIIlIlllIll);
        if (this.lIIIlllIIIllIIIllIII > 0) {
            llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(this.lIIIlllIIIllIIIllIII);
        }
        this.IlIlIlIlIlllllllllIl.add(llIllIlIIIIllIlIIllI);
    }
    
    public void llIllIIIIIllIlIIIIlI() {
        final llIllIlIIIIllIlIIllI[] array = this.IlIlIlIlIlllllllllIl.toArray(new llIllIlIIIIllIlIIllI[this.IlIlIlIlIlllllllllIl.size()]);
        Arrays.sort(array);
        llIllIlIIIIllIlIIllI[] array2;
        for (int length = (array2 = array).length, i = 0; i < length; ++i) {
            final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI = array2[i];
            if (!this.llllIIIIlIIIlIlllIll(llIllIlIIIIllIlIIllI)) {
                throw new IIIllIIIlIlIIllIIIlI(llIllIlIIIIllIlIIllI, String.format("Unable to fit: %s, size: %dx%d, atlas: %dx%d, atlasMax: %dx%d - Maybe try a lower resolution resourcepack?", llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll().lIIIlllIIIllIIIllIII(), llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll().llIllIIIIIllIlIIIIlI(), llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll().IlIIIlIlIIIllIlIlIIl(), this.IlIIIlIlIIIllIlIlIIl, this.IlIlIIIllIllIIIIIllI, this.IllIIlllIIIIlllIIlIl, this.llllIIIlIlllIlIIIIIl));
            }
        }
        if (this.lIIIIlIIIIIlllIllIII) {
            this.IlIIIlIlIIIllIlIlIIl = llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(this.IlIIIlIlIIIllIlIlIIl);
            this.IlIlIIIllIllIIIIIllI = llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(this.IlIlIIIllIllIIIIIllI);
        }
    }
    
    public List IlIIIlIlIIIllIlIlIIl() {
        final ArrayList arrayList = Lists.newArrayList();
        final Iterator<lIlIlIIIllIIllIIIllI> iterator = this.llIllIIIIIllIlIIIIlI.iterator();
        while (iterator.hasNext()) {
            iterator.next().llllIIIIlIIIlIlllIll(arrayList);
        }
        final ArrayList arrayList2 = Lists.newArrayList();
        for (final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI : arrayList) {
            final llIllIlIIIIllIlIIllI llllIIIIlIIIlIlllIll = lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll();
            final IlIlIIIllIIllIlllllI llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll();
            llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl, this.IlIlIIIllIllIIIIIllI, lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(), lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI(), llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI());
            arrayList2.add(llllIIIIlIIIlIlllIll2);
        }
        return arrayList2;
    }
    
    private static int IlIlIlIlIlllllllllIl(final int n, final int n2) {
        return (n >> n2) + (((n & (1 << n2) - 1) != 0x0) ? 1 : 0) << n2;
    }
    
    private boolean llllIIIIlIIIlIlllIll(final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI) {
        for (int i = 0; i < this.llIllIIIIIllIlIIIIlI.size(); ++i) {
            if (((lIlIlIIIllIIllIIIllI)this.llIllIIIIIllIlIIIIlI.get(i)).llllIIIIlIIIlIlllIll(llIllIlIIIIllIlIIllI)) {
                return true;
            }
            llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl();
            if (((lIlIlIIIllIIllIIIllI)this.llIllIIIIIllIlIIIIlI.get(i)).llllIIIIlIIIlIlllIll(llIllIlIIIIllIlIIllI)) {
                return true;
            }
            llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl();
        }
        return this.IlIlIlIlIlllllllllIl(llIllIlIIIIllIlIIllI);
    }
    
    private boolean IlIlIlIlIlllllllllIl(final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI) {
        final int min = Math.min(llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl(), llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI());
        final boolean b = this.IlIIIlIlIIIllIlIlIIl == 0 && this.IlIlIIIllIllIIIIIllI == 0;
        boolean b5;
        if (this.lIIIIlIIIIIlllIllIII) {
            final int ilIlIlIlIlllllllllIl = llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(this.IlIIIlIlIIIllIlIlIIl);
            final int ilIlIlIlIlllllllllIl2 = llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(this.IlIlIIIllIllIIIIIllI);
            final int ilIlIlIlIlllllllllIl3 = llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(this.IlIIIlIlIIIllIlIlIIl + min);
            final int ilIlIlIlIlllllllllIl4 = llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(this.IlIlIIIllIllIIIIIllI + min);
            final boolean b2 = ilIlIlIlIlllllllllIl3 <= this.IllIIlllIIIIlllIIlIl;
            final boolean b3 = ilIlIlIlIlllllllllIl4 <= this.llllIIIlIlllIlIIIIIl;
            if (!b2 && !b3) {
                return false;
            }
            final boolean b4 = ilIlIlIlIlllllllllIl != ilIlIlIlIlllllllllIl3;
            if (b4 ^ ilIlIlIlIlllllllllIl2 != ilIlIlIlIlllllllllIl4) {
                b5 = !b4;
            }
            else {
                b5 = (b2 && ilIlIlIlIlllllllllIl <= ilIlIlIlIlllllllllIl2);
            }
        }
        else {
            final boolean b6 = this.IlIIIlIlIIIllIlIlIIl + min <= this.IllIIlllIIIIlllIIlIl;
            final boolean b7 = this.IlIlIIIllIllIIIIIllI + min <= this.llllIIIlIlllIlIIIIIl;
            if (!b6 && !b7) {
                return false;
            }
            b5 = (b6 && (b || this.IlIIIlIlIIIllIlIlIIl <= this.IlIlIIIllIllIIIIIllI));
        }
        if (llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(((!b5) ? this.IlIlIIIllIllIIIIIllI : this.IlIIIlIlIIIllIlIlIIl) + Math.max(llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl(), llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI())) > ((!b5) ? this.llllIIIlIlllIlIIIIIl : this.IllIIlllIIIIlllIIlIl)) {
            return false;
        }
        lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI;
        if (b5) {
            if (llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl() > llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI()) {
                llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl();
            }
            if (this.IlIlIIIllIllIIIIIllI == 0) {
                this.IlIlIIIllIllIIIIIllI = llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI();
            }
            lIlIlIIIllIIllIIIllI = new lIlIlIIIllIIllIIIllI(this.IlIIIlIlIIIllIlIlIIl, 0, llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl(), this.IlIlIIIllIllIIIIIllI);
            this.IlIIIlIlIIIllIlIlIIl += llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl();
        }
        else {
            lIlIlIIIllIIllIIIllI = new lIlIlIIIllIIllIIIllI(0, this.IlIlIIIllIllIIIIIllI, this.IlIIIlIlIIIllIlIlIIl, llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI());
            this.IlIlIIIllIllIIIIIllI += llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI();
        }
        lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(llIllIlIIIIllIlIIllI);
        this.llIllIIIIIllIlIIIIlI.add(lIlIlIIIllIIllIIIllI);
        return true;
    }
}
