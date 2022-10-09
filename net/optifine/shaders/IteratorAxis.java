package net.optifine.shaders;

import net.optifine.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

public class IteratorAxis implements Iterator
{
    private double llllIIIIlIIIlIlllIll;
    private double IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    private double IlIlIIIllIllIIIIIllI;
    private double IllIIlllIIIIlllIIlIl;
    private double llllIIIlIlllIlIIIIIl;
    private double lIIIIlIIIIIlllIllIII;
    private int lIIIlllIIIllIIIllIII;
    private double llIIlIIIlIIIllIlIIIl;
    private double llIllIlIIIIllIlIIllI;
    private IlIIIlIlIIIllIlIlIIl lIlIlIIIllIIllIIIllI;
    private boolean IlIlIIIllIIllIlllllI;
    
    public IteratorAxis(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2, final double llllIIIIlIIIlIlllIll, final double ilIlIlIlIlllllllllIl3) {
        this.lIlIlIIIllIIllIIIllI = new IlIIIlIlIIIllIlIlIIl(0, 0, 0);
        this.IlIlIIIllIIllIlllllI = false;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl3;
        this.llIllIIIIIllIlIIIIlI = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII();
        this.IlIIIlIlIIIllIlIlIIl = ilIlIlIlIlllllllllIl2.lIIIIlIIIIIlllIllIII();
        this.IlIlIIIllIllIIIIIllI = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII();
        this.IllIIlllIIIIlllIIlIl = ilIlIlIlIlllllllllIl2.lIIIlllIIIllIIIllIII() - 0.5;
        this.llllIIIlIlllIlIIIIIl = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl();
        this.lIIIIlIIIIIlllIllIII = ilIlIlIlIlllllllllIl2.llIIlIIIlIIIllIlIIIl() - 0.5;
        this.lIIIlllIIIllIIIllIII = this.llIllIIIIIllIlIIIIlI;
        this.llIIlIIIlIIIllIlIIIl = this.IlIlIIIllIllIIIIIllI;
        this.llIllIlIIIIllIlIIllI = this.llllIIIlIlllIlIIIIIl;
        this.IlIlIIIllIIllIlllllI = (this.lIIIlllIIIllIIIllIII < this.IlIIIlIlIIIllIlIlIIl && this.llIIlIIIlIIIllIlIIIl < this.IllIIlllIIIIlllIIlIl && this.llIllIlIIIIllIlIIllI < this.lIIIIlIIIIIlllIllIII);
    }
    
    @Override
    public boolean hasNext() {
        return this.IlIlIIIllIIllIlllllI;
    }
    
    public IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll() {
        if (!this.IlIlIIIllIIllIlllllI) {
            throw new NoSuchElementException();
        }
        this.lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl(this.lIIIlllIIIllIIIllIII, this.llIIlIIIlIIIllIlIIIl, this.llIllIlIIIIllIlIIllI);
        this.IlIlIlIlIlllllllllIl();
        this.IlIlIIIllIIllIlllllI = (this.lIIIlllIIIllIIIllIII < this.IlIIIlIlIIIllIlIlIIl && this.llIIlIIIlIIIllIlIIIl < this.IllIIlllIIIIlllIIlIl && this.llIllIlIIIIllIlIIllI < this.lIIIIlIIIIIlllIllIII);
        return this.lIlIlIIIllIIllIIIllI;
    }
    
    private void IlIlIlIlIlllllllllIl() {
        ++this.llIllIlIIIIllIlIIllI;
        if (this.llIllIlIIIIllIlIIllI >= this.lIIIIlIIIIIlllIllIII) {
            this.llIllIlIIIIllIlIIllI = this.llllIIIlIlllIlIIIIIl;
            ++this.llIIlIIIlIIIllIlIIIl;
            if (this.llIIlIIIlIIIllIlIIIl >= this.IllIIlllIIIIlllIIlIl) {
                this.llIIlIIIlIIIllIlIIIl = this.IlIlIIIllIllIIIIIllI;
                this.IlIlIIIllIllIIIIIllI += this.llllIIIIlIIIlIlllIll;
                this.IllIIlllIIIIlllIIlIl += this.llllIIIIlIIIlIlllIll;
                this.llIIlIIIlIIIllIlIIIl = this.IlIlIIIllIllIIIIIllI;
                this.llllIIIlIlllIlIIIIIl += this.IlIlIlIlIlllllllllIl;
                this.lIIIIlIIIIIlllIllIII += this.IlIlIlIlIlllllllllIl;
                this.llIllIlIIIIllIlIIllI = this.llllIIIlIlllIlIIIIIl;
                ++this.lIIIlllIIIllIIIllIII;
                if (this.lIIIlllIIIllIIIllIII >= this.IlIIIlIlIIIllIlIlIIl) {}
            }
        }
    }
    
    @Override
    public void remove() {
        throw new RuntimeException("Not implemented");
    }
    
    public static void main(final String[] array) {
        final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(-2, 10, 20);
        final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2 = new IlIlIlIlIlllllllllIl(2, 12, 22);
        final double n = -0.5;
        final double n2 = 0.5;
        final IteratorAxis iteratorAxis = new IteratorAxis(ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl2, n, n2);
        System.out.println("Start: " + ilIlIlIlIlllllllllIl + ", end: " + ilIlIlIlIlllllllllIl2 + ", yDelta: " + n + ", zDelta: " + n2);
        while (iteratorAxis.hasNext()) {
            System.out.println(new StringBuilder().append(iteratorAxis.llllIIIIlIIIlIlllIll()).toString());
        }
    }
}
