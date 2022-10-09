package net.minecraft.client.llllIIIlIlllIlIIIIIl;

import java.util.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IllIlIllIllIlllIIlll extends IIIllllllIllIIIlllIl
{
    private static final Random llllIIIIlIIIlIlllIll;
    private int IIIIIIIllllIlIIIIIII;
    
    static {
        llllIIIIlIIIlIlllIll = new Random();
    }
    
    protected IllIlIllIllIlllIIlll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        super(illlllllIIIlIIIlIlII, n, n2, n3, 0.5 - IllIlIllIllIlllIIlll.llllIIIIlIIIlIlllIll.nextDouble(), n5, 0.5 - IllIlIllIllIlllIIlll.llllIIIIlIIIlIlllIll.nextDouble());
        this.IIIIIIIllllIlIIIIIII = 128;
        this.llIIlllIIlllIIllIllI *= 0.20000000298023224;
        if (n4 == 0.0 && n6 == 0.0) {
            this.lIllllllIIllIlIlIlII *= 0.10000000149011612;
            this.IIlllIIIlIlllIIlllII *= 0.10000000149011612;
        }
        this.lIIIIlIIIIIlllIllIII *= 0.75f;
        this.llllIIIlIlllIlIIIIIl = (int)(8.0 / (Math.random() * 0.8 + 0.2));
        this.lIIIIlIlIllllIIlIllI = false;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll((this.IllIIlllIIIIlllIIlIl + n) / this.llllIIIlIlllIlIIIIIl * 32.0f, 0.0f, 1.0f);
        super.llllIIIIlIIIlIlllIll(liIllIIIllllIlllIllI, llIllIIIIIllIlIIIIlI, n, n2, n3, n4, n5, n6);
    }
    
    @Override
    public void IIllIIllIIIlIlIIIIlI() {
        this.IIlIIIIlllIlllllIlII = this.IIlllIlIIllIlIlIlIIl;
        this.IIIlIIlIIIIlllIlllII = this.llIIIlIlIllIIlIlIlII;
        this.IlIlIllllllllIIIIlII = this.lllllIlIIIlIlIIlllII;
        if (this.IllIIlllIIIIlllIIlIl++ >= this.llllIIIlIlllIlIIIIIl) {
            this.IllIllIIIIlIIlIlllII();
        }
        this.llllIIIIlIIIlIlllIll(this.IIIIIIIllllIlIIIIIII + (7 - this.IllIIlllIIIIlllIIlIl * 8 / this.llllIIIlIlllIlIIIIIl));
        this.llIIlllIIlllIIllIllI += 0.004;
        this.IlIIIlIlIIIllIlIlIIl(this.lIllllllIIllIlIlIlII, this.llIIlllIIlllIIllIllI, this.IIlllIIIlIlllIIlllII);
        if (this.llIIIlIlIllIIlIlIlII == this.IIIlIIlIIIIlllIlllII) {
            this.lIllllllIIllIlIlIlII *= 1.1;
            this.IIlllIIIlIlllIIlllII *= 1.1;
        }
        this.lIllllllIIllIlIlIlII *= 0.9599999785423279;
        this.llIIlllIIlllIIllIllI *= 0.9599999785423279;
        this.IIlllIIIlIlllIIlllII *= 0.9599999785423279;
        if (this.IIIIIllIIIIlIIIIllIl) {
            this.lIllllllIIllIlIlIlII *= 0.699999988079071;
            this.IIlllIIIlIlllIIlllII *= 0.699999988079071;
        }
    }
    
    public void IlIlIlIlIlllllllllIl(final int iiiiiiIllllIlIIIIIII) {
        this.IIIIIIIllllIlIIIIIII = iiiiiiIllllIlIIIIIII;
    }
}
