package net.minecraft.IlllllllIIIlIIIlIlII;

import com.google.common.collect.*;
import java.util.*;

class llIllIlIIIIllIlIIllI extends UnmodifiableIterator
{
    private int llllIIIIlIIIlIlllIll;
    private final Iterable[] IlIlIlIlIlllllllllIl;
    private final Iterator[] llIllIIIIIllIlIIIIlI;
    private final Object[] IlIIIlIlIIIllIlIlIIl;
    
    private llIllIlIIIIllIlIIllI(final Class clazz, final Iterable[] ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = -2;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = (Iterator[])IlIlIlIlIlllllllllIl(Iterator.class, this.IlIlIlIlIlllllllllIl.length);
        for (int i = 0; i < this.IlIlIlIlIlllllllllIl.length; ++i) {
            this.llIllIIIIIllIlIIIIlI[i] = ilIlIlIlIlllllllllIl[i].iterator();
        }
        this.IlIIIlIlIIIllIlIlIIl = IlIlIlIlIlllllllllIl(clazz, this.llIllIIIIIllIlIIIIlI.length);
    }
    
    private void IlIlIlIlIlllllllllIl() {
        this.llllIIIIlIIIlIlllIll = -1;
        Arrays.fill(this.llIllIIIIIllIlIIIIlI, null);
        Arrays.fill(this.IlIIIlIlIIIllIlIlIIl, null);
    }
    
    public boolean hasNext() {
        if (this.llllIIIIlIIIlIlllIll == -2) {
            this.llllIIIIlIIIlIlllIll = 0;
            Iterator[] llIllIIIIIllIlIIIIlI;
            for (int length = (llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI).length, i = 0; i < length; ++i) {
                if (!llIllIIIIIllIlIIIIlI[i].hasNext()) {
                    this.IlIlIlIlIlllllllllIl();
                    break;
                }
            }
            return true;
        }
        if (this.llllIIIIlIIIlIlllIll >= this.llIllIIIIIllIlIIIIlI.length) {
            this.llllIIIIlIIIlIlllIll = this.llIllIIIIIllIlIIIIlI.length - 1;
            while (this.llllIIIIlIIIlIlllIll >= 0) {
                if (this.llIllIIIIIllIlIIIIlI[this.llllIIIIlIIIlIlllIll].hasNext()) {
                    break;
                }
                if (this.llllIIIIlIIIlIlllIll == 0) {
                    this.IlIlIlIlIlllllllllIl();
                    break;
                }
                final Iterator iterator = this.IlIlIlIlIlllllllllIl[this.llllIIIIlIIIlIlllIll].iterator();
                this.llIllIIIIIllIlIIIIlI[this.llllIIIIlIIIlIlllIll] = iterator;
                if (!iterator.hasNext()) {
                    this.IlIlIlIlIlllllllllIl();
                    break;
                }
                --this.llllIIIIlIIIlIlllIll;
            }
        }
        return this.llllIIIIlIIIlIlllIll >= 0;
    }
    
    public Object[] llllIIIIlIIIlIlllIll() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        while (this.llllIIIIlIIIlIlllIll < this.llIllIIIIIllIlIIIIlI.length) {
            this.IlIIIlIlIIIllIlIlIIl[this.llllIIIIlIIIlIlllIll] = this.llIllIIIIIllIlIIIIlI[this.llllIIIIlIIIlIlllIll].next();
            ++this.llllIIIIlIIIlIlllIll;
        }
        return this.IlIIIlIlIIIllIlIlIIl.clone();
    }
}
