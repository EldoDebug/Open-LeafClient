package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;

import java.util.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;

public abstract class IlIIIIIlIIllIIlIlIll
{
    protected LinkedList llllIIIIlIIIlIlllIll;
    protected IlIlIIIlIIlIlIIlllIl IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    
    public IlIIIIIlIIllIIlIlIll() {
        this.llllIIIIlIIIlIlllIll = new LinkedList();
    }
    
    public IlIIIIIlIIllIIlIlIll(final int llIllIIIIIllIlIIIIlI, final int ilIIIlIlIIIllIlIlIIl) {
        this.llllIIIIlIIIlIlllIll = new LinkedList();
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public IlIlIIIlIIlIlIIlllIl IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public LinkedList llIllIIIIIllIlIIIIlI() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        final Iterator iterator = this.llllIIIIlIIIlIlllIll.iterator();
        while (iterator.hasNext()) {
            final net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII2 = iterator.next();
            if (illlllllIIIlIIIlIlII2.llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll(ilIlIIIlIIlIlIIlllIl) && !illlllllIIIlIIIlIlII2.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, random, ilIlIIIlIIlIlIIlllIl)) {
                iterator.remove();
            }
        }
    }
    
    protected void IlIIIlIlIIIllIlIlIIl() {
        this.IlIlIlIlIlllllllllIl = IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll();
        final Iterator iterator = this.llllIIIIlIIIlIlllIll.iterator();
        while (iterator.hasNext()) {
            this.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(iterator.next().llIllIIIIIllIlIIIIlI());
        }
    }
    
    public IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll(final int n, final int n2) {
        final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = new IIIIlllIIIIIIlIIIlll();
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("id", IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll(this));
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("ChunkX", n);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("ChunkZ", n2);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("BB", this.IlIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl());
        final net.minecraft.lIlIlIIIllIIllIIIllI.IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl = new net.minecraft.lIlIlIIIllIIllIIIllI.IlIlIIIlIIlIlIIlllIl();
        final Iterator iterator = this.llllIIIIlIIIlIlllIll.iterator();
        while (iterator.hasNext()) {
            ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(iterator.next().IlIlIlIlIlllllllllIl());
        }
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Children", ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        return iiiIlllIIIIIIlIIIlll;
    }
    
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
    }
    
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        this.llIllIIIIIllIlIIIIlI = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("ChunkX");
        this.IlIIIlIlIIIllIlIlIIl = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("ChunkZ");
        if (iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI("BB")) {
            this.IlIlIlIlIlllllllllIl = new IlIlIIIlIIlIlIIlllIl(iiiIlllIIIIIIlIIIlll.lIlIlIIIllIIllIIIllI("BB"));
        }
        final net.minecraft.lIlIlIIIllIIllIIIllI.IlIlIIIlIIlIlIIlllIl llIllIIIIIllIlIIIIlI = iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI("Children", 10);
        for (int i = 0; i < llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI(); ++i) {
            this.llllIIIIlIIIlIlllIll.add(IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(i), illlllllIIIlIIIlIlII));
        }
        this.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
    }
    
    public void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
    }
    
    protected void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final int n) {
        final int n2 = illlllllIIIlIIIlIlII.IlIlIIIlIIlIlIIlllIl() - n;
        int n3 = this.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl() + 1;
        if (n3 < n2) {
            n3 += random.nextInt(n2 - n3);
        }
        final int n4 = n3 - this.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI;
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(0, n4, 0);
        final Iterator iterator = this.llllIIIIlIIIlIlllIll.iterator();
        while (iterator.hasNext()) {
            iterator.next().llllIIIIlIIIlIlllIll(0, n4, 0);
        }
    }
    
    protected void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final int n, final int n2) {
        final int n3 = n2 - n + 1 - this.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl();
        int n4;
        if (n3 > 1) {
            n4 = n + random.nextInt(n3);
        }
        else {
            n4 = n;
        }
        final int n5 = n4 - this.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl;
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(0, n5, 0);
        final Iterator iterator = this.llllIIIIlIIIlIlllIll.iterator();
        while (iterator.hasNext()) {
            iterator.next().llllIIIIlIIIlIlllIll(0, n5, 0);
        }
    }
    
    public boolean llllIIIIlIIIlIlllIll() {
        return true;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return true;
    }
    
    public void IlIlIlIlIlllllllllIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
    }
    
    public int IlIlIIIllIllIIIIIllI() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public int IllIIlllIIIIlllIIlIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
}
