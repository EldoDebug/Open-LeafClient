package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI;

import com.google.common.collect.*;
import java.util.*;

public class lIlIlIIIllIIllIIIllI
{
    private final int llllIIIIlIIIlIlllIll;
    private final int IlIlIlIlIlllllllllIl;
    private final int llIllIIIIIllIlIIIIlI;
    private final int IlIIIlIlIIIllIlIlIIl;
    private List IlIlIIIllIllIIIIIllI;
    private llIllIlIIIIllIlIIllI IllIIlllIIIIlllIIlIl;
    
    public lIlIlIIIllIIllIIIllI(final int llllIIIIlIIIlIlllIll, final int ilIlIlIlIlllllllllIl, final int llIllIIIIIllIlIIIIlI, final int ilIIIlIlIIIllIlIlIIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public llIllIlIIIIllIlIIllI llllIIIIlIIIlIlllIll() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public int llIllIIIIIllIlIIIIlI() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final llIllIlIIIIllIlIIllI illIIlllIIIIlllIIlIl) {
        if (this.IllIIlllIIIIlllIIlIl != null) {
            return false;
        }
        final int ilIlIlIlIlllllllllIl = illIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl();
        final int llIllIIIIIllIlIIIIlI = illIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI();
        if (ilIlIlIlIlllllllllIl > this.llIllIIIIIllIlIIIIlI || llIllIIIIIllIlIIIIlI > this.IlIIIlIlIIIllIlIlIIl) {
            return false;
        }
        if (ilIlIlIlIlllllllllIl == this.llIllIIIIIllIlIIIIlI && llIllIIIIIllIlIIIIlI == this.IlIIIlIlIIIllIlIlIIl) {
            this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
            return true;
        }
        if (this.IlIlIIIllIllIIIIIllI == null) {
            (this.IlIlIIIllIllIIIIIllI = Lists.newArrayListWithCapacity(1)).add(new lIlIlIIIllIIllIIIllI(this.llllIIIIlIIIlIlllIll, this.IlIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl, llIllIIIIIllIlIIIIlI));
            final int n = this.llIllIIIIIllIlIIIIlI - ilIlIlIlIlllllllllIl;
            final int n2 = this.IlIIIlIlIIIllIlIlIIl - llIllIIIIIllIlIIIIlI;
            if (n2 > 0 && n > 0) {
                if (Math.max(this.IlIIIlIlIIIllIlIlIIl, n) >= Math.max(this.llIllIIIIIllIlIIIIlI, n2)) {
                    this.IlIlIIIllIllIIIIIllI.add(new lIlIlIIIllIIllIIIllI(this.llllIIIIlIIIlIlllIll, this.IlIlIlIlIlllllllllIl + llIllIIIIIllIlIIIIlI, ilIlIlIlIlllllllllIl, n2));
                    this.IlIlIIIllIllIIIIIllI.add(new lIlIlIIIllIIllIIIllI(this.llllIIIIlIIIlIlllIll + ilIlIlIlIlllllllllIl, this.IlIlIlIlIlllllllllIl, n, this.IlIIIlIlIIIllIlIlIIl));
                }
                else {
                    this.IlIlIIIllIllIIIIIllI.add(new lIlIlIIIllIIllIIIllI(this.llllIIIIlIIIlIlllIll + ilIlIlIlIlllllllllIl, this.IlIlIlIlIlllllllllIl, n, llIllIIIIIllIlIIIIlI));
                    this.IlIlIIIllIllIIIIIllI.add(new lIlIlIIIllIIllIIIllI(this.llllIIIIlIIIlIlllIll, this.IlIlIlIlIlllllllllIl + llIllIIIIIllIlIIIIlI, this.llIllIIIIIllIlIIIIlI, n2));
                }
            }
            else if (n == 0) {
                this.IlIlIIIllIllIIIIIllI.add(new lIlIlIIIllIIllIIIllI(this.llllIIIIlIIIlIlllIll, this.IlIlIlIlIlllllllllIl + llIllIIIIIllIlIIIIlI, ilIlIlIlIlllllllllIl, n2));
            }
            else if (n2 == 0) {
                this.IlIlIIIllIllIIIIIllI.add(new lIlIlIIIllIIllIIIllI(this.llllIIIIlIIIlIlllIll + ilIlIlIlIlllllllllIl, this.IlIlIlIlIlllllllllIl, n, llIllIIIIIllIlIIIIlI));
            }
        }
        final Iterator<lIlIlIIIllIIllIIIllI> iterator = this.IlIlIIIllIllIIIIIllI.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl)) {
                return true;
            }
        }
        return false;
    }
    
    public void llllIIIIlIIIlIlllIll(final List list) {
        if (this.IllIIlllIIIIlllIIlIl != null) {
            list.add(this);
        }
        else if (this.IlIlIIIllIllIIIIIllI != null) {
            final Iterator<lIlIlIIIllIIllIIIllI> iterator = (Iterator<lIlIlIIIllIIllIIIllI>)this.IlIlIIIllIllIIIIIllI.iterator();
            while (iterator.hasNext()) {
                iterator.next().llllIIIIlIIIlIlllIll(list);
            }
        }
    }
    
    @Override
    public String toString() {
        return "Slot{originX=" + this.llllIIIIlIIIlIlllIll + ", originY=" + this.IlIlIlIlIlllllllllIl + ", width=" + this.llIllIIIIIllIlIIIIlI + ", height=" + this.IlIIIlIlIIIllIlIlIIl + ", texture=" + this.IllIIlllIIIIlllIIlIl + ", subSlots=" + this.IlIlIIIllIllIIIIIllI + '}';
    }
}
