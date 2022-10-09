package net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI;

import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import java.util.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IllIllIlllIllllIIllI extends IIlllIlIIllIlIlIlIIl implements llllllIllIllIlIllllI
{
    private static final UUID llllIIIIlIIIlIlllIll;
    private static final llllIIIIlIIIlIlllIll IlIlIlIlIlllllllllIl;
    private static final IlIIIlIlIIIllIlIlIIl[] llIllIIIIIllIlIIIIlI;
    private int t;
    
    static {
        llllIIIIlIIIlIlllIll = UUID.fromString("5CD17E52-A79A-43D3-A529-90FDE04B181E");
        IlIlIlIlIlllllllllIl = new llllIIIIlIIIlIlllIll(IllIllIlllIllllIIllI.llllIIIIlIIIlIlllIll, "Drinking speed penalty", -0.25, 0).llllIIIIlIIIlIlllIll(false);
        llIllIIIIIllIlIIIIlI = new IlIIIlIlIIIllIlIlIIl[] { IIllIIllIIIlIlIIIIlI.lIIlIIIIIIIlIIlIlIIl, IIllIIllIIIlIlIIIIlI.c, IIllIIllIIIlIlIIIIlI.IIIIIIIllllIlIIIIIII, IIllIIllIIIlIlIIIIlI.F, IIllIIllIIIlIlIIIIlI.E, IIllIIllIIIlIlIIIIlI.llllllIllIllIlIllllI, IIllIIllIIIlIlIIIIlI.IIIlIIlIIIIlllIlllII, IIllIIllIIIlIlIIIIlI.IIIlIIlIIIIlllIlllII };
    }
    
    public IllIllIlllIllllIIllI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
        this.llllIIIIlIIIlIlllIll(0.6f, 1.95f);
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(1, new llIlIIIIIlIIlIlIIlll(this));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(2, new net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this, 1.0, 60, 10.0f));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(2, new IlIIllIIllIIllIIlIIl(this, 1.0));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(3, new lllllIIIIIlIlIIIIIIl(this, net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.class, 8.0f));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(3, new IlIlIllllllllIIIIlII(this));
        this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(1, new IlIlIIIlIIlIlIIlllIl(this, false, new Class[0]));
        this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(2, new IIlIIIIIllIlIIIlIIll(this, net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.class, true));
    }
    
    @Override
    protected void a_() {
        super.a_();
        this.llIllIlIlIIIIIIIllII().llllIIIIlIIIlIlllIll(21, (Object)0);
    }
    
    @Override
    protected String e() {
        return null;
    }
    
    @Override
    protected String O() {
        return null;
    }
    
    @Override
    protected String P() {
        return null;
    }
    
    public void llllIIIIlIIIlIlllIll(final boolean b) {
        this.llIllIlIlIIIIIIIllII().IlIlIlIlIlllllllllIl(21, (byte)(byte)(b ? 1 : 0));
    }
    
    public boolean lIIIIlIIIIIlllIllIII() {
        return this.llIllIlIlIIIIIIIllII().llllIIIIlIIIlIlllIll(21) == 1;
    }
    
    @Override
    protected void IlIlIllllllllIIIIlII() {
        super.IlIlIllllllllIIIIlII();
        this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll(26.0);
        this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll(0.25);
    }
    
    @Override
    public void IIIlIIIlIlIIlllIIlll() {
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            if (this.lIIIIlIIIIIlllIllIII()) {
                if (this.t-- <= 0) {
                    this.llllIIIIlIIIlIlllIll(false);
                    final lllIIIIlIlIllIIlIIIl n = this.n();
                    this.llllIIIIlIIIlIlllIll(0, (lllIIIIlIlIllIIlIIIl)null);
                    if (n != null && n.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.D) {
                        final List llIllIlIIIIllIlIIllI = net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.D.llIllIlIIIIllIlIIllI(n);
                        if (llIllIlIIIIllIlIIllI != null) {
                            final Iterator<net.minecraft.llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl> iterator = llIllIlIIIIllIlIIllI.iterator();
                            while (iterator.hasNext()) {
                                this.llllIIIIlIIIlIlllIll(new net.minecraft.llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl(iterator.next()));
                            }
                        }
                    }
                    this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.IlIIIlIlIIIllIlIlIIl).llIllIIIIIllIlIIIIlI(IllIllIlllIllllIIllI.IlIlIlIlIlllllllllIl);
                }
            }
            else {
                int n2 = -1;
                if (this.IlIIllIIllIIllIIlIIl.nextFloat() < 0.15f && this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII) && !this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll)) {
                    n2 = 8237;
                }
                else if (this.IlIIllIIllIIllIIlIIl.nextFloat() < 0.15f && this.lIIIIIlIlIIIlIIIIlIl() && !this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.IIIIlllIIIIIIlIIIlll)) {
                    n2 = 16307;
                }
                else if (this.IlIIllIIllIIllIIlIIl.nextFloat() < 0.05f && this.N() < this.U()) {
                    n2 = 16341;
                }
                else if (this.IlIIllIIllIIllIIlIIl.nextFloat() < 0.25f && this.IIlllIIIlIlllIIlllII() != null && !this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI) && this.IIlllIIIlIlllIIlllII().IlIlIIIllIllIIIIIllI(this) > 121.0) {
                    n2 = 16274;
                }
                else if (this.IlIIllIIllIIllIIlIIl.nextFloat() < 0.25f && this.IIlllIIIlIlllIIlllII() != null && !this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI) && this.IIlllIIIlIlllIIlllII().IlIlIIIllIllIIIIIllI(this) > 121.0) {
                    n2 = 16274;
                }
                if (n2 > -1) {
                    this.llllIIIIlIIIlIlllIll(0, new lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.D, 1, n2));
                    this.t = this.n().lIlIlIIIllIIllIIIllI();
                    this.llllIIIIlIIIlIlllIll(true);
                    final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.IlIIIlIlIIIllIlIlIIl);
                    llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(IllIllIlllIllllIIllI.IlIlIlIlIlllllllllIl);
                    llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(IllIllIlllIllllIIllI.IlIlIlIlIlllllllllIl);
                }
            }
            if (this.IlIIllIIllIIllIIlIIl.nextFloat() < 7.5E-4f) {
                this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this, (byte)15);
            }
        }
        super.IIIlIIIlIlIIlllIIlll();
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final byte b) {
        if (b == 15) {
            for (int i = 0; i < this.IlIIllIIllIIllIIlIIl.nextInt(35) + 10; ++i) {
                this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.lllIIIIlllllIlIIllIl, this.IIlllIlIIllIlIlIlIIl + this.IlIIllIIllIIllIIlIIl.nextGaussian() * 0.12999999523162842, this.IlIIlllIIlIlllllIIlI().IlIlIIIllIllIIIIIllI + 0.5 + this.IlIIllIIllIIllIIlIIl.nextGaussian() * 0.12999999523162842, this.lllllIlIIIlIlIIlllII + this.IlIIllIIllIIllIIlIIl.nextGaussian() * 0.12999999523162842, 0.0, 0.0, 0.0, new int[0]);
            }
        }
        else {
            super.llllIIIIlIIIlIlllIll(b);
        }
    }
    
    @Override
    protected float IlIIIlIlIIIllIlIlIIl(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII, float ilIIIlIlIIIllIlIlIIl) {
        ilIIIlIlIIIllIlIlIIl = super.IlIIIlIlIIIllIlIlIIl(lIllllllIIllIlIlIlII, ilIIIlIlIIIllIlIlIIl);
        if (lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl() == this) {
            ilIIIlIlIIIllIlIlIIl = 0.0f;
        }
        if (lIllllllIIllIlIlIlII.IlIlIIIIIIlllIlIllIl()) {
            ilIIIlIlIIIllIlIlIIl *= (float)0.15;
        }
        return ilIIIlIlIIIllIlIlIIl;
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final boolean b, final int n) {
        for (int n2 = this.IlIIllIIllIIllIIlIIl.nextInt(3) + 1, i = 0; i < n2; ++i) {
            int nextInt = this.IlIIllIIllIIllIIlIIl.nextInt(3);
            final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = IllIllIlllIllllIIllI.llIllIIIIIllIlIIIIlI[this.IlIIllIIllIIllIIlIIl.nextInt(IllIllIlllIllllIIllI.llIllIIIIIllIlIIIIlI.length)];
            if (n > 0) {
                nextInt += this.IlIIllIIllIIllIIlIIl.nextInt(n + 1);
            }
            for (int j = 0; j < nextInt; ++j) {
                this.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, 1);
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final float n) {
        if (!this.lIIIIlIIIIIlllIllIII()) {
            final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl = new IllIIlllIIIIlllIIlIl(this.IlllllllIIIlIIIlIlII, this, 32732);
            final double n2 = lllIIIIlllllIlIIllIl.llIIIlIlIllIIlIlIlII + lllIIIIlllllIlIIllIl.llllIlIllllIIlIIlIlI() - 1.100000023841858;
            final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl2 = illIIlllIIIIlllIIlIl;
            illIIlllIIIIlllIIlIl2.llllllIllIllIlIllllI += 20.0f;
            final double n3 = lllIIIIlllllIlIIllIl.IIlllIlIIllIlIlIlIIl + lllIIIIlllllIlIIllIl.lIllllllIIllIlIlIlII - this.IIlllIlIIllIlIlIlIIl;
            final double n4 = n2 - this.llIIIlIlIllIIlIlIlII;
            final double n5 = lllIIIIlllllIlIIllIl.lllllIlIIIlIlIIlllII + lllIIIIlllllIlIIllIl.IIlllIIIlIlllIIlllII - this.lllllIlIIIlIlIIlllII;
            final float llllIIIIlIIIlIlllIll = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n3 * n3 + n5 * n5);
            if (llllIIIIlIIIlIlllIll >= 8.0f && !lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl)) {
                illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(32698);
            }
            else if (lllIIIIlllllIlIIllIl.N() >= 8.0f && !lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll)) {
                illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(32660);
            }
            else if (llllIIIIlIIIlIlllIll <= 3.0f && !lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI) && this.IlIIllIIllIIllIIlIIl.nextFloat() < 0.25f) {
                illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(32696);
            }
            illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(n3, n4 + llllIIIIlIIIlIlllIll * 0.2f, n5, 0.75f, 8.0f);
            this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl);
        }
    }
    
    @Override
    public float llllIlIllllIIlIIlIlI() {
        return 1.62f;
    }
}
