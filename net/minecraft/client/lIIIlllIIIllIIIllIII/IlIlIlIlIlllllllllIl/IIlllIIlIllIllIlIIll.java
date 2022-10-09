package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

public class IIlllIIlIllIllIlIIll
{
    private static final int llllIIIIlIIIlIlllIll;
    private long IlIlIlIlIlllllllllIl;
    
    static {
        llllIIIIlIIIlIlllIll = lllIllIIIllllllIllll.values().length;
    }
    
    public void llllIIIIlIIIlIlllIll(final Set set) {
        for (final lllIllIIIllllllIllll lllIllIIIllllllIllll : set) {
            final Iterator<lllIllIIIllllllIllll> iterator2 = set.iterator();
            while (iterator2.hasNext()) {
                this.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll, iterator2.next(), true);
            }
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final lllIllIIIllllllIllll lllIllIIIllllllIllll, final lllIllIIIllllllIllll lllIllIIIllllllIllll2, final boolean b) {
        this.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.ordinal() + lllIllIIIllllllIllll2.ordinal() * IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll, b);
        this.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll2.ordinal() + lllIllIIIllllllIllll.ordinal() * IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll, b);
    }
    
    public void llllIIIIlIIIlIlllIll(final boolean b) {
        if (b) {
            this.IlIlIlIlIlllllllllIl = -1L;
        }
        else {
            this.IlIlIlIlIlllllllllIl = 0L;
        }
    }
    
    public boolean llllIIIIlIIIlIlllIll(final lllIllIIIllllllIllll lllIllIIIllllllIllll, final lllIllIIIllllllIllll lllIllIIIllllllIllll2) {
        return this.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.ordinal() + lllIllIIIllllllIllll2.ordinal() * IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(' ');
        lllIllIIIllllllIllll[] values;
        for (int length = (values = lllIllIIIllllllIllll.values()).length, i = 0; i < length; ++i) {
            sb.append(' ').append(values[i].toString().toUpperCase().charAt(0));
        }
        sb.append('\n');
        lllIllIIIllllllIllll[] values2;
        for (int length2 = (values2 = lllIllIIIllllllIllll.values()).length, j = 0; j < length2; ++j) {
            final lllIllIIIllllllIllll lllIllIIIllllllIllll = values2[j];
            sb.append(lllIllIIIllllllIllll.toString().toUpperCase().charAt(0));
            lllIllIIIllllllIllll[] values3;
            for (int length3 = (values3 = net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.values()).length, k = 0; k < length3; ++k) {
                final lllIllIIIllllllIllll lllIllIIIllllllIllll2 = values3[k];
                if (lllIllIIIllllllIllll == lllIllIIIllllllIllll2) {
                    sb.append("  ");
                }
                else {
                    sb.append(' ').append((char)(this.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll, lllIllIIIllllllIllll2) ? 89 : 110));
                }
            }
            sb.append('\n');
        }
        return sb.toString();
    }
    
    private boolean llllIIIIlIIIlIlllIll(final int n) {
        return (this.IlIlIlIlIlllllllllIl & (long)(1 << n)) != 0x0L;
    }
    
    private void llllIIIIlIIIlIlllIll(final int n, final boolean b) {
        if (b) {
            this.IlIlIlIlIlllllllllIl(n);
        }
        else {
            this.llIllIIIIIllIlIIIIlI(n);
        }
    }
    
    private void IlIlIlIlIlllllllllIl(final int n) {
        this.IlIlIlIlIlllllllllIl |= 1 << n;
    }
    
    private void llIllIIIIIllIlIIIIlI(final int n) {
        this.IlIlIlIlIlllllllllIl &= ~(1 << n);
    }
}
