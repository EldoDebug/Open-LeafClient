package net.minecraft.IlllllllIIIlIIIlIlII;

import net.minecraft.IlIlIIIIIIlllIlIllIl.*;
import net.minecraft.lllIIIIlllllIlIIllIl.*;
import java.util.*;

public class IIIIlllIIIIIIlIIIlll extends IlIllIlIlIIIlIlIlIII
{
    private final String IlIlIlIlIlllllllllIl;
    private final String llIllIIIIIllIlIIIIlI;
    private String IlIIIlIlIIIllIlIlIIl;
    
    public IIIIlllIIIIIIlIIIlll(final String ilIlIlIlIlllllllllIl, final String llIllIIIIIllIlIIIIlI) {
        this.IlIIIlIlIIIllIlIlIIl = "";
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public String IlIlIlIlIlllllllllIl() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public void llllIIIIlIIIlIlllIll(final String ilIIIlIlIIIllIlIlIIl) {
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    @Override
    public String llIllIIIIIllIlIIIIlI() {
        final llllIIIIlIIIlIlllIll iiiiIllIIIIlIIIIllIl = net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl();
        if (iiiiIllIIIIlIIIIllIl != null && iiiiIllIIIIlIIIIllIl.IIIIIIIIIlllIllIlIlI() && lIIlIIIIIIIlIIlIlIIl.IlIlIlIlIlllllllllIl(this.IlIIIlIlIIIllIlIlIIl)) {
            final llIIlIIIlIIIllIlIIIl illlIIIIlIIIlIlIlIIl = iiiiIllIIIIlIIIIllIl.llllIIIIlIIIlIlllIll(0).IlllIIIIlIIIlIlIlIIl();
            final lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll = illlIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI);
            if (illlIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll)) {
                this.llllIIIIlIIIlIlllIll(String.format("%d", illlIIIIlIIIlIlIlIIl.IlIlIlIlIlllllllllIl(this.IlIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll).IlIlIlIlIlllllllllIl()));
            }
            else {
                this.IlIIIlIlIIIllIlIlIIl = "";
            }
        }
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public IIIIlllIIIIIIlIIIlll IlIIIlIlIIIllIlIlIIl() {
        final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = new IIIIlllIIIIIIlIIIlll(this.IlIlIlIlIlllllllllIl, this.llIllIIIIIllIlIIIIlI);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl().lIlIlIIIllIIllIIIllI());
        final Iterator<llIIIIIIlIllIIlIIIll> iterator = this.IllIIlllIIIIlllIIlIl().iterator();
        while (iterator.hasNext()) {
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(iterator.next().IlIlIIIllIllIIIIIllI());
        }
        return iiiIlllIIIIIIlIIIlll;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IIIIlllIIIIIIlIIIlll)) {
            return false;
        }
        final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = (IIIIlllIIIIIIlIIIlll)o;
        return this.IlIlIlIlIlllllllllIl.equals(iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl) && this.llIllIIIIIllIlIIIIlI.equals(iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI) && super.equals(o);
    }
    
    @Override
    public String toString() {
        return "ScoreComponent{name='" + this.IlIlIlIlIlllllllllIl + '\'' + "objective='" + this.llIllIIIIIllIlIIIIlI + '\'' + ", siblings=" + this.llllIIIIlIIIlIlllIll + ", style=" + this.llllIIIlIlllIlIIIIIl() + '}';
    }
}
