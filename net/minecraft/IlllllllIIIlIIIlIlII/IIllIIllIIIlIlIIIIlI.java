package net.minecraft.IlllllllIIIlIIIlIlII;

import java.util.regex.*;
import com.google.common.collect.*;
import java.util.*;

public class IIllIIllIIIlIlIIIIlI extends IlIllIlIlIIIlIlIlIII
{
    private final String IlIIIlIlIIIllIlIlIIl;
    private final Object[] IlIlIIIllIllIIIIIllI;
    private final Object IllIIlllIIIIlllIIlIl;
    private long llllIIIlIlllIlIIIIIl;
    List IlIlIlIlIlllllllllIl;
    public static final Pattern llIllIIIIIllIlIIIIlI;
    
    static {
        llIllIIIIIllIlIIIIlI = Pattern.compile("%(?:(\\d+)\\$)?([A-Za-z%]|$)");
    }
    
    public IIllIIllIIIlIlIIIIlI(final String ilIIIlIlIIIllIlIlIIl, final Object... ilIlIIIllIllIIIIIllI) {
        this.IllIIlllIIIIlllIIlIl = new Object();
        this.llllIIIlIlllIlIIIIIl = -1L;
        this.IlIlIlIlIlllllllllIl = Lists.newArrayList();
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        for (final Object o : ilIlIIIllIllIIIIIllI) {
            if (o instanceof llIIIIIIlIllIIlIIIll) {
                ((llIIIIIIlIllIIlIIIll)o).llllIIIlIlllIlIIIIIl().llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl());
            }
        }
    }
    
    synchronized void llllIIIIlIIIlIlllIll() {
        synchronized (this.IllIIlllIIIIlllIIlIl) {
            final long llllIIIIlIIIlIlllIll = lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll();
            if (llllIIIIlIIIlIlllIll == this.llllIIIlIlllIlIIIIIl) {
                // monitorexit(this.IllIIlllIIIIlllIIlIl)
                return;
            }
            this.llllIIIlIlllIlIIIIIl = llllIIIIlIIIlIlllIll;
            this.IlIlIlIlIlllllllllIl.clear();
        }
        // monitorexit(this.IllIIlllIIIIlllIIlIl)
        try {
            this.llllIIIIlIIIlIlllIll(lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl));
        }
        catch (IIIlIIIlIlIIlllIIlll iiIlIIIlIlIIlllIIlll) {
            this.IlIlIlIlIlllllllllIl.clear();
            try {
                this.llllIIIIlIIIlIlllIll(lIIlllIlllllIIlllIll.IlIlIlIlIlllllllllIl(this.IlIIIlIlIIIllIlIlIIl));
            }
            catch (IIIlIIIlIlIIlllIIlll iiIlIIIlIlIIlllIIlll2) {
                throw iiIlIIIlIlIIlllIIlll;
            }
        }
    }
    
    protected void llllIIIIlIIIlIlllIll(final String s) {
        final Matcher matcher = IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI.matcher(s);
        int n = 0;
        int n2 = 0;
        try {
            while (matcher.find(n2)) {
                final int start = matcher.start();
                final int end = matcher.end();
                if (start > n2) {
                    final IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl = new IlIlIIIIIIlllIlIllIl(String.format(s.substring(n2, start), new Object[0]));
                    ilIlIIIIIIlllIlIllIl.llllIIIlIlllIlIIIIIl().llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl());
                    this.IlIlIlIlIlllllllllIl.add(ilIlIIIIIIlllIlIllIl);
                }
                final String group = matcher.group(2);
                final String substring = s.substring(start, end);
                if ("%".equals(group) && "%%".equals(substring)) {
                    final IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl2 = new IlIlIIIIIIlllIlIllIl("%");
                    ilIlIIIIIIlllIlIllIl2.llllIIIlIlllIlIIIIIl().llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl());
                    this.IlIlIlIlIlllllllllIl.add(ilIlIIIIIIlllIlIllIl2);
                }
                else {
                    if (!"s".equals(group)) {
                        throw new IIIlIIIlIlIIlllIIlll(this, "Unsupported format: '" + substring + "'");
                    }
                    final String group2 = matcher.group(1);
                    final int n3 = (group2 != null) ? (Integer.parseInt(group2) - 1) : n++;
                    if (n3 < this.IlIlIIIllIllIIIIIllI.length) {
                        this.IlIlIlIlIlllllllllIl.add(this.llllIIIIlIIIlIlllIll(n3));
                    }
                }
                n2 = end;
            }
            if (n2 < s.length()) {
                final IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl3 = new IlIlIIIIIIlllIlIllIl(String.format(s.substring(n2), new Object[0]));
                ilIlIIIIIIlllIlIllIl3.llllIIIlIlllIlIIIIIl().llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl());
                this.IlIlIlIlIlllllllllIl.add(ilIlIIIIIIlllIlIllIl3);
            }
        }
        catch (IllegalFormatException ex) {
            throw new IIIlIIIlIlIIlllIIlll(this, ex);
        }
    }
    
    private llIIIIIIlIllIIlIIIll llllIIIIlIIIlIlllIll(final int n) {
        if (n >= this.IlIlIIIllIllIIIIIllI.length) {
            throw new IIIlIIIlIlIIlllIIlll(this, n);
        }
        final Object o = this.IlIlIIIllIllIIIIIllI[n];
        llIIIIIIlIllIIlIIIll llIIIIIIlIllIIlIIIll;
        if (o instanceof llIIIIIIlIllIIlIIIll) {
            llIIIIIIlIllIIlIIIll = (llIIIIIIlIllIIlIIIll)o;
        }
        else {
            llIIIIIIlIllIIlIIIll = new IlIlIIIIIIlllIlIllIl((o == null) ? "null" : o.toString());
            llIIIIIIlIllIIlIIIll.llllIIIlIlllIlIIIIIl().llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl());
        }
        return llIIIIIIlIllIIlIIIll;
    }
    
    @Override
    public llIIIIIIlIllIIlIIIll llllIIIIlIIIlIlllIll(final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        super.llllIIIIlIIIlIlllIll(ilIlIIIlIIlIlIIlllIl);
        Object[] ilIlIIIllIllIIIIIllI;
        for (int length = (ilIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI).length, i = 0; i < length; ++i) {
            final Object o = ilIlIIIllIllIIIIIllI[i];
            if (o instanceof llIIIIIIlIllIIlIIIll) {
                ((llIIIIIIlIllIIlIIIll)o).llllIIIlIlllIlIIIIIl().llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl());
            }
        }
        if (this.llllIIIlIlllIlIIIIIl > -1L) {
            final Iterator<llIIIIIIlIllIIlIIIll> iterator = (Iterator<llIIIIIIlIllIIlIIIll>)this.IlIlIlIlIlllllllllIl.iterator();
            while (iterator.hasNext()) {
                iterator.next().llllIIIlIlllIlIIIIIl().llllIIIIlIIIlIlllIll(ilIlIIIlIIlIlIIlllIl);
            }
        }
        return this;
    }
    
    @Override
    public Iterator iterator() {
        this.llllIIIIlIIIlIlllIll();
        return Iterators.concat(IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl), IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll));
    }
    
    @Override
    public String llIllIIIIIllIlIIIIlI() {
        this.llllIIIIlIIIlIlllIll();
        final StringBuilder sb = new StringBuilder();
        final Iterator<llIIIIIIlIllIIlIIIll> iterator = this.IlIlIlIlIlllllllllIl.iterator();
        while (iterator.hasNext()) {
            sb.append(iterator.next().llIllIIIIIllIlIIIIlI());
        }
        return sb.toString();
    }
    
    public IIllIIllIIIlIlIIIIlI IlIlIlIlIlllllllllIl() {
        final Object[] array = new Object[this.IlIlIIIllIllIIIIIllI.length];
        for (int i = 0; i < this.IlIlIIIllIllIIIIIllI.length; ++i) {
            if (this.IlIlIIIllIllIIIIIllI[i] instanceof llIIIIIIlIllIIlIIIll) {
                array[i] = ((llIIIIIIlIllIIlIIIll)this.IlIlIIIllIllIIIIIllI[i]).IlIlIIIllIllIIIIIllI();
            }
            else {
                array[i] = this.IlIlIIIllIllIIIIIllI[i];
            }
        }
        final IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI = new IIllIIllIIIlIlIIIIlI(this.IlIIIlIlIIIllIlIlIIl, array);
        illIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl().lIlIlIIIllIIllIIIllI());
        final Iterator<llIIIIIIlIllIIlIIIll> iterator = this.IllIIlllIIIIlllIIlIl().iterator();
        while (iterator.hasNext()) {
            illIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(iterator.next().IlIlIIIllIllIIIIIllI());
        }
        return illIIllIIIlIlIIIIlI;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IIllIIllIIIlIlIIIIlI)) {
            return false;
        }
        final IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI = (IIllIIllIIIlIlIIIIlI)o;
        return Arrays.equals(this.IlIlIIIllIllIIIIIllI, illIIllIIIlIlIIIIlI.IlIlIIIllIllIIIIIllI) && this.IlIIIlIlIIIllIlIlIIl.equals(illIIllIIIlIlIIIIlI.IlIIIlIlIIIllIlIlIIl) && super.equals(o);
    }
    
    @Override
    public int hashCode() {
        return 31 * (31 * super.hashCode() + this.IlIIIlIlIIIllIlIlIIl.hashCode()) + Arrays.hashCode(this.IlIlIIIllIllIIIIIllI);
    }
    
    @Override
    public String toString() {
        return "TranslatableComponent{key='" + this.IlIIIlIlIIIllIlIlIIl + '\'' + ", args=" + Arrays.toString(this.IlIlIIIllIllIIIIIllI) + ", siblings=" + this.llllIIIIlIIIlIlllIll + ", style=" + this.llllIIIlIlllIlIIIIIl() + '}';
    }
    
    public String IlIIIlIlIIIllIlIlIIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public Object[] llIIlIIIlIIIllIlIIIl() {
        return this.IlIlIIIllIllIIIIIllI;
    }
}
