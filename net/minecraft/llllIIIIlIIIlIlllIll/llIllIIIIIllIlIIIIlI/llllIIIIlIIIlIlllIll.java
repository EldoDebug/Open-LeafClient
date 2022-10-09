package net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import com.google.common.collect.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import java.util.*;

public class llllIIIIlIIIlIlllIll
{
    private final IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll;
    private final IlIlIlIlIlllllllllIl IlIlIlIlIlllllllllIl;
    private final IlIlIlIlIlllllllllIl llIllIIIIIllIlIIIIlI;
    private final lllIllIIIllllllIllll IlIIIlIlIIIllIlIlIIl;
    private final List IlIlIIIllIllIIIIIllI;
    private final List IllIIlllIIIIlllIIlIl;
    
    public llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll ilIIIlIlIIIllIlIlIIl, final boolean b) {
        this.IlIlIIIllIllIIIIIllI = Lists.newArrayList();
        this.IllIIlllIIIIlllIIlIl = Lists.newArrayList();
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        if (b) {
            this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
            this.llIllIIIIIllIlIIIIlI = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl);
        }
        else {
            this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI();
            this.llIllIIIIIllIlIIIIlI = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, 2);
        }
    }
    
    public boolean llllIIIIlIIIlIlllIll() {
        this.IlIlIIIllIllIIIIIllI.clear();
        this.IllIIlllIIIIlllIIlIl.clear();
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this.llIllIIIIIllIlIIIIlI).llIllIIIIIllIlIIIIlI();
        if (!v.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, this.llllIIIIlIIIlIlllIll, this.llIllIIIIIllIlIIIIlI, this.IlIIIlIlIIIllIlIlIIl, false)) {
            if (llIllIIIIIllIlIIIIlI.IIlIIIIIllIlIIIlIIll() != 1) {
                return false;
            }
            this.IllIIlllIIIIlllIIlIl.add(this.llIllIIIIIllIlIIIIlI);
            return true;
        }
        else {
            if (!this.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI)) {
                return false;
            }
            for (int i = 0; i < this.IlIlIIIllIllIIIIIllI.size(); ++i) {
                final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = this.IlIlIIIllIllIIIIIllI.get(i);
                if (this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aI && !this.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl)) {
                    return false;
                }
            }
            return true;
        }
    }
    
    private boolean llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI();
        if (llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
            return true;
        }
        if (!v.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, this.llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl, this.IlIIIlIlIIIllIlIlIIl, false)) {
            return true;
        }
        if (ilIlIlIlIlllllllllIl.equals(this.IlIlIlIlIlllllllllIl)) {
            return true;
        }
        if (this.IlIlIIIllIllIIIIIllI.contains(ilIlIlIlIlllllllllIl)) {
            return true;
        }
        int n = 1;
        if (n + this.IlIlIIIllIllIIIIIllI.size() > 12) {
            return false;
        }
        while (llllIIIIlIIIlIlllIll == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aI) {
            final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2 = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI(), n);
            llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2).llIllIIIIIllIlIIIIlI();
            if (llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll || !v.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, this.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2, this.IlIIIlIlIIIllIlIlIIl, false)) {
                break;
            }
            if (llllIIIIlIIIlIlllIll2.equals(this.IlIlIlIlIlllllllllIl)) {
                break;
            }
            if (++n + this.IlIlIIIllIllIIIIIllI.size() > 12) {
                return false;
            }
        }
        int n2 = 0;
        for (int i = n - 1; i >= 0; --i) {
            this.IlIlIIIllIllIIIIIllI.add(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI(), i));
            ++n2;
        }
        int n3 = 1;
        while (true) {
            final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll3 = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl, n3);
            final int index = this.IlIlIIIllIllIIIIIllI.indexOf(llllIIIIlIIIlIlllIll3);
            if (index > -1) {
                this.llllIIIIlIIIlIlllIll(n2, index);
                for (int j = 0; j <= index + n2; ++j) {
                    final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2 = this.IlIlIIIllIllIIIIIllI.get(j);
                    if (this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl2).llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aI && !this.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl2)) {
                        return false;
                    }
                }
                return true;
            }
            final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll3).llIllIIIIIllIlIIIIlI();
            if (llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
                return true;
            }
            if (!v.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, this.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll3, this.IlIIIlIlIIIllIlIlIIl, true) || llllIIIIlIIIlIlllIll3.equals(this.IlIlIlIlIlllllllllIl)) {
                return false;
            }
            if (llIllIIIIIllIlIIIIlI.IIlIIIIIllIlIIIlIIll() == 1) {
                this.IllIIlllIIIIlllIIlIl.add(llllIIIIlIIIlIlllIll3);
                return true;
            }
            if (this.IlIlIIIllIllIIIIIllI.size() >= 12) {
                return false;
            }
            this.IlIlIIIllIllIIIIIllI.add(llllIIIIlIIIlIlllIll3);
            ++n2;
            ++n3;
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final int n, final int n2) {
        final ArrayList arrayList = Lists.newArrayList();
        final ArrayList arrayList2 = Lists.newArrayList();
        final ArrayList arrayList3 = Lists.newArrayList();
        arrayList.addAll(this.IlIlIIIllIllIIIIIllI.subList(0, n2));
        arrayList2.addAll(this.IlIlIIIllIllIIIIIllI.subList(this.IlIlIIIllIllIIIIIllI.size() - n, this.IlIlIIIllIllIIIIIllI.size()));
        arrayList3.addAll(this.IlIlIIIllIllIIIIIllI.subList(n2, this.IlIlIIIllIllIIIIIllI.size() - n));
        this.IlIlIIIllIllIIIIIllI.clear();
        this.IlIlIIIllIllIIIIIllI.addAll(arrayList);
        this.IlIlIIIllIllIIIIIllI.addAll(arrayList2);
        this.IlIlIIIllIllIIIIIllI.addAll(arrayList3);
    }
    
    private boolean IlIlIlIlIlllllllllIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        lllIllIIIllllllIllll[] values;
        for (int length = (values = lllIllIIIllllllIllll.values()).length, i = 0; i < length; ++i) {
            final lllIllIIIllllllIllll lllIllIIIllllllIllll = values[i];
            if (lllIllIIIllllllIllll.lIlIlIIIllIIllIIIllI() != this.IlIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI() && !this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll))) {
                return false;
            }
        }
        return true;
    }
    
    public List IlIlIlIlIlllllllllIl() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public List llIllIIIIIllIlIIIIlI() {
        return this.IllIIlllIIIIlllIIlIl;
    }
}
