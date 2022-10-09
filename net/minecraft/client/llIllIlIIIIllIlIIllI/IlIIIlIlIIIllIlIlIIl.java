package net.minecraft.client.llIllIlIIIIllIlIIllI;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import com.google.common.collect.*;
import java.util.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;

public class IlIIIlIlIIIllIlIlIIl implements Comparable
{
    private static final List llllIIIIlIIIlIlllIll;
    private static final IIIllIIIlIlIIllIIIlI IlIlIlIlIlllllllllIl;
    private static final Set llIllIIIIIllIlIIIIlI;
    private final String IlIIIlIlIIIllIlIlIIl;
    private final int IlIlIIIllIllIIIIIllI;
    private final String IllIIlllIIIIlllIIlIl;
    private int llllIIIlIlllIlIIIIIl;
    private boolean lIIIIlIIIIIlllIllIII;
    private int lIIIlllIIIllIIIllIII;
    
    static {
        llllIIIIlIIIlIlllIll = Lists.newArrayList();
        IlIlIlIlIlllllllllIl = new IIIllIIIlIlIIllIIIlI();
        llIllIIIIIllIlIIIIlI = Sets.newHashSet();
    }
    
    public static void llllIIIIlIIIlIlllIll(final int n) {
        if (n != 0) {
            final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = (IlIIIlIlIIIllIlIlIIl)IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n);
            if (ilIIIlIlIIIllIlIlIIl != null) {
                final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl2 = ilIIIlIlIIIllIlIlIIl;
                ++ilIIIlIlIIIllIlIlIIl2.lIIIlllIIIllIIIllIII;
            }
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(final int n, final boolean liiiIlIIIIIlllIllIII) {
        if (n != 0) {
            final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = (IlIIIlIlIIIllIlIlIIl)IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n);
            if (ilIIIlIlIIIllIlIlIIl != null) {
                ilIIIlIlIIIllIlIlIIl.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
            }
        }
    }
    
    public static void llllIIIIlIIIlIlllIll() {
        final Iterator<IlIIIlIlIIIllIlIlIIl> iterator = IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.iterator();
        while (iterator.hasNext()) {
            iterator.next().llIIlIIIlIIIllIlIIIl();
        }
    }
    
    public static void IlIlIlIlIlllllllllIl() {
        IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll();
        for (final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl : IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll) {
            IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl.llllIIIlIlllIlIIIIIl, ilIIIlIlIIIllIlIlIIl);
        }
    }
    
    public static Set llIllIIIIIllIlIIIIlI() {
        return IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI;
    }
    
    public IlIIIlIlIIIllIlIlIIl(final String ilIIIlIlIIIllIlIlIIl, final int n, final String illIIlllIIIIlllIIlIl) {
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.llllIIIlIlllIlIIIIIl = n;
        this.IlIlIIIllIllIIIIIllI = n;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        net.minecraft.client.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.add(this);
        net.minecraft.client.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n, this);
        net.minecraft.client.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI.add(illIIlllIIIIlllIIlIl);
    }
    
    public boolean IlIIIlIlIIIllIlIlIIl() {
        return this.lIIIIlIIIIIlllIllIII;
    }
    
    public String IlIlIIIllIllIIIIIllI() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public boolean IllIIlllIIIIlllIIlIl() {
        if (this.lIIIlllIIIllIIIllIII == 0) {
            return false;
        }
        --this.lIIIlllIIIllIIIllIII;
        return true;
    }
    
    private void llIIlIIIlIIIllIlIIIl() {
        this.lIIIlllIIIllIIIllIII = 0;
        this.lIIIIlIIIIIlllIllIII = false;
    }
    
    public String llllIIIlIlllIlIIIIIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public int lIIIIlIIIIIlllIllIII() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public int lIIIlllIIIllIIIllIII() {
        return this.llllIIIlIlllIlIIIIIl;
    }
    
    public void IlIlIlIlIlllllllllIl(final int llllIIIlIlllIlIIIIIl) {
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
    }
    
    public int llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        int n = llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl, new Object[0]).compareTo(llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl.IllIIlllIIIIlllIIlIl, new Object[0]));
        if (n == 0) {
            n = llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl, new Object[0]).compareTo(llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl, new Object[0]));
        }
        return n;
    }
}
