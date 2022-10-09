package net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI;

import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIIIlllIIIIIIlIIIlll.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

public class llIlIIIIIlIIlIlIIlll extends IIlllIlIIllIlIlIlIIl
{
    protected static final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll;
    private static final UUID IlIlIlIlIlllllllllIl;
    private static final llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI;
    private final llllIIIlIlllIlIIIIIl t;
    private int u;
    private boolean v;
    private float w;
    private float x;
    
    static {
        llllIIIIlIIIlIlllIll = new net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl(null, "zombie.spawnReinforcements", 0.0, 0.0, 1.0).llllIIIIlIIIlIlllIll("Spawn Reinforcements Chance");
        IlIlIlIlIlllllllllIl = UUID.fromString("B9766B59-9566-4402-BC1F-2EE2A276D836");
        llIllIIIIIllIlIIIIlI = new llllIIIIlIIIlIlllIll(llIlIIIIIlIIlIlIIlll.IlIlIlIlIlllllllllIl, "Baby speed boost", 0.5, 1);
    }
    
    public llIlIIIIIlIIlIlIIlll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
        this.t = new llllIIIlIlllIlIIIIIl(this);
        this.v = false;
        this.w = -1.0f;
        ((IllIIlllIIIIlllIIlIl)this.lIllllllIIllIlIlIlII()).IlIlIlIlIlllllllllIl(true);
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(0, new net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llIlIIIIIlIIlIlIIlll(this));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(2, new IlIlIlIlIlllllllllIl(this, net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.class, 1.0, false));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(5, new llIIlllIIlllIIllIllI(this, 1.0));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(7, new IlIIllIIllIIllIIlIIl(this, 1.0));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(8, new lllllIIIIIlIlIIIIIIl(this, net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.class, 8.0f));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(8, new IlIlIllllllllIIIIlII(this));
        this.lIIIIlIIIIIlllIllIII();
        this.llllIIIIlIIIlIlllIll(0.6f, 1.95f);
    }
    
    protected void lIIIIlIIIIIlllIllIII() {
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(4, new IlIlIlIlIlllllllllIl(this, net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IlIlIllllllllIIIIlII.class, 1.0, true));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(4, new IlIlIlIlIlllllllllIl(this, net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.IlllllllIIIlIIIlIlII.class, 1.0, true));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(6, new lllllIlIIIlIlIIlllII(this, 1.0, false));
        this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(1, new IlIlIIIlIIlIlIIlllIl(this, true, new Class[] { llIIIlIlIllIIlIlIlII.class }));
        this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(2, new IIlIIIIIllIlIIIlIIll(this, net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.class, true));
        this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(2, new IIlIIIIIllIlIIIlIIll(this, net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IlIlIllllllllIIIIlII.class, false));
        this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(2, new IIlIIIIIllIlIIIlIIll(this, net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.IlllllllIIIlIIIlIlII.class, true));
    }
    
    @Override
    protected void IlIlIllllllllIIIIlII() {
        super.IlIlIllllllllIIIIlII();
        this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.IlIlIlIlIlllllllllIl).llllIIIIlIIIlIlllIll(35.0);
        this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll(0.23000000417232513);
        this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.IlIlIIIllIllIIIIIllI).llllIIIIlIIIlIlllIll(3.0);
        this.X().IlIlIlIlIlllllllllIl(llIlIIIIIlIIlIlIIlll.llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll(this.IlIIllIIllIIllIIlIIl.nextDouble() * 0.10000000149011612);
    }
    
    @Override
    protected void a_() {
        super.a_();
        this.llIllIlIlIIIIIIIllII().llllIIIIlIIIlIlllIll(12, (Object)0);
        this.llIllIlIlIIIIIIIllII().llllIIIIlIIIlIlllIll(13, (Object)0);
        this.llIllIlIlIIIIIIIllII().llllIIIIlIIIlIlllIll(14, (Object)0);
    }
    
    @Override
    public int R() {
        int n = super.R() + 2;
        if (n > 20) {
            n = 20;
        }
        return n;
    }
    
    public boolean ap() {
        return this.v;
    }
    
    public void llllIIIIlIIIlIlllIll(final boolean v) {
        if (this.v != v) {
            this.v = v;
            if (v) {
                this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(1, this.t);
            }
            else {
                this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(this.t);
            }
        }
    }
    
    @Override
    public boolean e_() {
        return this.llIllIlIlIIIIIIIllII().llllIIIIlIIIlIlllIll(12) == 1;
    }
    
    @Override
    protected int IlIlIIIllIllIIIIIllI(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (this.e_()) {
            this.llllIIIlIlllIlIIIIIl *= (int)2.5f;
        }
        return super.IlIlIIIllIllIIIIIllI(llllIIIIlIIIlIlllIll);
    }
    
    public void lIlIlIIIllIIllIIIllI(final boolean b) {
        this.llIllIlIlIIIIIIIllII().IlIlIlIlIlllllllllIl(12, (byte)(byte)(b ? 1 : 0));
        if (this.IlllllllIIIlIIIlIlII != null && !this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.IlIIIlIlIIIllIlIlIIl);
            llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(llIlIIIIIlIIlIlIIlll.llIllIIIIIllIlIIIIlI);
            if (b) {
                llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(llIlIIIIIlIIlIlIIlll.llIllIIIIIllIlIIIIlI);
            }
        }
        this.IIIIlllIIIIIIlIIIlll(b);
    }
    
    public boolean aq() {
        return this.llIllIlIlIIIIIIIllII().llllIIIIlIIIlIlllIll(13) == 1;
    }
    
    public void IlIlIIIllIIllIlllllI(final boolean b) {
        this.llIllIlIlIIIIIIIllII().IlIlIlIlIlllllllllIl(13, (byte)(byte)(b ? 1 : 0));
    }
    
    @Override
    public void IIIlIIIlIlIIlllIIlll() {
        if (this.IlllllllIIIlIIIlIlII.lIlIlIIIllIIllIIIllI() && !this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && !this.e_()) {
            final float b_ = this.b_(1.0f);
            final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(this.IIlllIlIIllIlIlIlIIl, (double)Math.round(this.llIIIlIlIllIIlIlIlII), this.lllllIlIIIlIlIIlllII);
            if (b_ > 0.5f && this.IlIIllIIllIIllIIlIIl.nextFloat() * 30.0f < (b_ - 0.4f) * 2.0f && this.IlllllllIIIlIIIlIlII.llIIlIIIlIIIllIlIIIl(ilIlIlIlIlllllllllIl)) {
                boolean b = true;
                final lllIIIIlIlIllIIlIIIl llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI(4);
                if (llIllIIIIIllIlIIIIlI != null) {
                    if (llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl()) {
                        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI.llllIIIlIlllIlIIIIIl() + this.IlIIllIIllIIllIIlIIl.nextInt(2));
                        if (llIllIIIIIllIlIIIIlI.llllIIIlIlllIlIIIIIl() >= llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII()) {
                            this.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI);
                            this.llllIIIIlIIIlIlllIll(4, (lllIIIIlIlIllIIlIIIl)null);
                        }
                    }
                    b = false;
                }
                if (b) {
                    this.IlIlIIIllIllIIIIIllI(8);
                }
            }
        }
        if (this.IIllIIIlIIIIlIIlIIII() && this.IIlllIIIlIlllIIlllII() != null && this.IIIlIIIlIlIIlllIIlll instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl) {
            ((IlIllIlIlIIIlIlIlIII)this.IIIlIIIlIlIIlllIIlll).lIllllllIIllIlIlIlII().llllIIIIlIIIlIlllIll(this.lIllllllIIllIlIlIlII().llIllIIIIIllIlIIIIlI(), 1.5);
        }
        super.IIIlIIIlIlIIlllIIlll();
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII, final float n) {
        if (super.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII, n)) {
            lllIIIIlllllIlIIllIl iIlllIIIlIlllIIlllII = this.IIlllIIIlIlllIIlllII();
            if (iIlllIIIlIlllIIlllII == null && lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl() instanceof lllIIIIlllllIlIIllIl) {
                iIlllIIIlIlllIIlllII = (lllIIIIlllllIlIIllIl)lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl();
            }
            if (iIlllIIIlIlllIIlllII != null && this.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll() == net.minecraft.IIIlIIlIIIIlllIlllII.IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl && this.IlIIllIIllIIllIIlIIl.nextFloat() < this.llllIIIIlIIIlIlllIll(llIlIIIIIlIIlIlIIlll.llllIIIIlIIIlIlllIll).IlIlIIIllIllIIIIIllI()) {
                final int llIllIIIIIllIlIIIIlI = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.IIlllIlIIllIlIlIlIIl);
                final int llIllIIIIIllIlIIIIlI2 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.llIIIlIlIllIIlIlIlII);
                final int llIllIIIIIllIlIIIIlI3 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.lllllIlIIIlIlIIlllII);
                final llIlIIIIIlIIlIlIIlll llIlIIIIIlIIlIlIIlll = new llIlIIIIIlIIlIlIIlll(this.IlllllllIIIlIIIlIlII);
                for (int i = 0; i < 50; ++i) {
                    final int n2 = llIllIIIIIllIlIIIIlI + net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.IlIIllIIllIIllIIlIIl, 7, 40) * net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.IlIIllIIllIIllIIlIIl, -1, 1);
                    final int n3 = llIllIIIIIllIlIIIIlI2 + net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.IlIIllIIllIIllIIlIIl, 7, 40) * net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.IlIIllIIllIIllIIlIIl, -1, 1);
                    final int n4 = llIllIIIIIllIlIIIIlI3 + net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.IlIIllIIllIIllIIlIIl, 7, 40) * net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.IlIIllIIllIIllIIlIIl, -1, 1);
                    if (net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.IlllllllIIIlIIIlIlII, new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(n2, n3 - 1, n4)) && this.IlllllllIIIlIIIlIlII.IlIlIIIllIIllIlllllI(new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(n2, n3, n4)) < 10) {
                        llIlIIIIIlIIlIlIIlll.IlIlIlIlIlllllllllIl(n2, n3, (double)n4);
                        if (!this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(n2, n3, n4, 7.0) && this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llIlIIIIIlIIlIlIIlll.IlIIlllIIlIlllllIIlI(), llIlIIIIIlIIlIlIIlll) && this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llIlIIIIIlIIlIlIIlll, llIlIIIIIlIIlIlIIlll.IlIIlllIIlIlllllIIlI()).isEmpty() && !this.IlllllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl(llIlIIIIIlIIlIlIIlll.IlIIlllIIlIlllllIIlI())) {
                            this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llIlIIIIIlIIlIlIIlll);
                            llIlIIIIIlIIlIlIIlll.IlIlIlIlIlllllllllIl(iIlllIIIlIlllIIlllII);
                            llIlIIIIIlIIlIlIIlll.llllIIIIlIIIlIlllIll(this.IlllllllIIIlIIIlIlII.lIllllllIIllIlIlIlII(new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llIlIIIIIlIIlIlIIlll)), null);
                            this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.llIlIIIIIlIIlIlIIlll.llllIIIIlIIIlIlllIll).IlIlIlIlIlllllllllIl(new llllIIIIlIIIlIlllIll("Zombie reinforcement caller charge", -0.05000000074505806, 0));
                            llIlIIIIIlIIlIlIIlll.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.llIlIIIIIlIIlIlIIlll.llllIIIIlIIIlIlllIll).IlIlIlIlIlllllllllIl(new llllIIIIlIIIlIlllIll("Zombie reinforcement callee charge", -0.05000000074505806, 0));
                            break;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
    
    @Override
    public void IIllIIllIIIlIlIIIIlI() {
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && this.ar()) {
            this.u -= this.at();
            if (this.u <= 0) {
                this.as();
            }
        }
        super.IIllIIllIIIlIlIIIIlI();
    }
    
    @Override
    public boolean llllIIllllIlIlIIIIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        final boolean llllIIllllIlIlIIIIll = super.llllIIllllIlIlIIIIll(llIllIIIIIllIlIIIIlI);
        if (llllIIllllIlIlIIIIll) {
            final int llllIIIIlIIIlIlllIll = this.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll();
            if (this.n() == null && this.lIIIIIlIlIIIlIIIIlIl() && this.IlIIllIIllIIllIIlIIl.nextFloat() < llllIIIIlIIIlIlllIll * 0.3f) {
                llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI(2 * llllIIIIlIIIlIlllIll);
            }
        }
        return llllIIllllIlIlIIIIll;
    }
    
    @Override
    protected String e() {
        return "mob.zombie.say";
    }
    
    @Override
    protected String O() {
        return "mob.zombie.hurt";
    }
    
    @Override
    protected String P() {
        return "mob.zombie.death";
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll("mob.zombie.step", 0.15f, 1.0f);
    }
    
    @Override
    protected net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl f() {
        return net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.x;
    }
    
    @Override
    public net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIllllllllIIIIlII Y() {
        return net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIllllllllIIIIlII.IlIlIlIlIlllllllllIl;
    }
    
    @Override
    protected void Q() {
        switch (this.IlIIllIIllIIllIIlIIl.nextInt(3)) {
            case 0: {
                this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.llIIlIIIlIIIllIlIIIl, 1);
                break;
            }
            case 1: {
                this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.V, 1);
                break;
            }
            case 2: {
                this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.W, 1);
                break;
            }
        }
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI) {
        super.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI);
        if (this.IlIIllIIllIIllIIlIIl.nextFloat() < ((this.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll() == net.minecraft.IIIlIIlIIIIlllIlllII.IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl) ? 0.05f : 0.01f)) {
            if (this.IlIIllIIllIIllIIlIIl.nextInt(3) == 0) {
                this.llllIIIIlIIIlIlllIll(0, new lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.lIlIlIIIllIIllIIIllI));
            }
            else {
                this.llllIIIIlIIIlIlllIll(0, new lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll));
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        if (this.e_()) {
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("IsBaby", true);
        }
        if (this.aq()) {
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("IsVillager", true);
        }
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("ConversionTime", this.ar() ? this.u : -1);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("CanBreakDoors", this.ap());
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        if (iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("IsBaby")) {
            this.lIlIlIIIllIIllIIIllI(true);
        }
        if (iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("IsVillager")) {
            this.IlIlIIIllIIllIlllllI(true);
        }
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("ConversionTime", 99) && iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("ConversionTime") > -1) {
            this.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("ConversionTime"));
        }
        this.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("CanBreakDoors"));
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        super.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl);
        if ((this.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll() == net.minecraft.IIIlIIlIIIIlllIlllII.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI || this.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll() == net.minecraft.IIIlIIlIIIIlllIlllII.IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl) && lllIIIIlllllIlIIllIl instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IlIlIllllllllIIIIlII) {
            if (this.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll() != net.minecraft.IIIlIIlIIIIlllIlllII.IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl && this.IlIIllIIllIIllIIlIIl.nextBoolean()) {
                return;
            }
            final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII = (IlIllIlIlIIIlIlIlIII)lllIIIIlllllIlIIllIl;
            final llIlIIIIIlIIlIlIIlll llIlIIIIIlIIlIlIIlll = new llIlIIIIIlIIlIlIIlll(this.IlllllllIIIlIIIlIlII);
            llIlIIIIIlIIlIlIIlll.llIIlIIIlIIIllIlIIIl(lllIIIIlllllIlIIllIl);
            this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(lllIIIIlllllIlIIllIl);
            llIlIIIIIlIIlIlIIlll.llllIIIIlIIIlIlllIll(this.IlllllllIIIlIIIlIlII.lIllllllIIllIlIlIlII(new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llIlIIIIIlIIlIlIIlll)), null);
            llIlIIIIIlIIlIlIIlll.IlIlIIIllIIllIlllllI(true);
            if (lllIIIIlllllIlIIllIl.e_()) {
                llIlIIIIIlIIlIlIIlll.lIlIlIIIllIIllIIIllI(true);
            }
            llIlIIIIIlIIlIlIIlll.llIIlIIIlIIIllIlIIIl(ilIllIlIlIIIlIlIlIII.v());
            if (ilIllIlIlIIIlIlIlIII.w_()) {
                llIlIIIIIlIIlIlIIlll.IlIIIlIlIIIllIlIlIIl(ilIllIlIlIIIlIlIlIII.lIllIlIIIllllllIIlII());
                llIlIIIIIlIIlIlIIlll.lIIIIlIIIIIlllIllIII(ilIllIlIlIIIlIlIlIII.IlIllIIllIIlIIIIlIIl());
            }
            this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llIlIIIIIlIIlIlIIlll);
            this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(null, 1016, new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl((int)this.IIlllIlIIllIlIlIlIIl, (int)this.llIIIlIlIllIIlIlIlII, (int)this.lllllIlIIIlIlIIlllII), 0);
        }
    }
    
    @Override
    public float llllIlIllllIIlIIlIlI() {
        float n = 1.74f;
        if (this.e_()) {
            n -= (float)0.81;
        }
        return n;
    }
    
    @Override
    protected boolean a_(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return (lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() != net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.lIllIlIIIllllllIIlII || !this.e_() || !this.IIllIIIlIIIIlIIlIIII()) && super.a_(lllIIIIlIlIllIIlIIIl);
    }
    
    @Override
    public net.minecraft.llllIIIlIlllIlIIIIIl.llIIIlIlIllIIlIlIlII llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI, net.minecraft.llllIIIlIlllIlIIIIIl.llIIIlIlIllIIlIlIlII llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll = super.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, (net.minecraft.llllIIIlIlllIlIIIIIl.llIIIlIlIllIIlIlIlII)llllIIIIlIIIlIlllIll);
        final float ilIlIlIlIlllllllllIl = ilIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl();
        this.IlIlIlIlIlllllllllIl(this.IlIIllIIllIIllIIlIIl.nextFloat() < 0.55f * ilIlIlIlIlllllllllIl);
        if (llllIIIIlIIIlIlllIll == null) {
            llllIIIIlIIIlIlllIll = new IlIIlIlIIIlIIlIlIlII(this, this.IlllllllIIIlIIIlIlII.llllIIllllIlIlIIIIll.nextFloat() < 0.05f, this.IlllllllIIIlIIIlIlII.llllIIllllIlIlIIIIll.nextFloat() < 0.05f, null);
        }
        if (llllIIIIlIIIlIlllIll instanceof IlIIlIlIIIlIIlIlIlII) {
            final IlIIlIlIIIlIIlIlIlII ilIIlIlIIIlIIlIlIlII = (IlIIlIlIIIlIIlIlIlII)llllIIIIlIIIlIlllIll;
            if (ilIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl) {
                this.IlIlIIIllIIllIlllllI(true);
            }
            if (ilIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll) {
                this.lIlIlIIIllIIllIIIllI(true);
                if (this.IlllllllIIIlIIIlIlII.llllIIllllIlIlIIIIll.nextFloat() < 0.05) {
                    final List llllIIIIlIIIlIlllIll2 = this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl.class, this.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl(5.0, 3.0, 5.0), net.minecraft.IlllllllIIIlIIIlIlII.llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl);
                    if (!llllIIIIlIIIlIlllIll2.isEmpty()) {
                        final net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = llllIIIIlIIIlIlllIll2.get(0);
                        ilIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI(true);
                        this.llllIIIIlIIIlIlllIll((llIllIIIIIllIlIIIIlI)ilIIIlIlIIIllIlIlIIl);
                    }
                }
                else if (this.IlllllllIIIlIIIlIlII.llllIIllllIlIlIIIIll.nextFloat() < 0.05) {
                    final net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl2 = new net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl(this.IlllllllIIIlIIIlIlII);
                    ilIIIlIlIIIllIlIlIIl2.IlIlIlIlIlllllllllIl(this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII, this.IIlIIIIIllIlIIIlIIll, 0.0f);
                    ilIIIlIlIIIllIlIlIIl2.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, null);
                    ilIIIlIlIIIllIlIlIIl2.lIlIlIIIllIIllIIIllI(true);
                    this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl2);
                    this.llllIIIIlIIIlIlllIll((llIllIIIIIllIlIIIIlI)ilIIIlIlIIIllIlIlIIl2);
                }
            }
        }
        this.llllIIIIlIIIlIlllIll(this.IlIIllIIllIIllIIlIIl.nextFloat() < ilIlIlIlIlllllllllIl * 0.1f);
        this.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI);
        this.IlIlIlIlIlllllllllIl(ilIlIIIllIllIIIIIllI);
        if (this.llIllIIIIIllIlIIIIlI(4) == null) {
            final Calendar iIllllIIIlIIIIIIllIl = this.IlllllllIIIlIIIlIlII.IIllllIIIlIIIIIIllIl();
            if (iIllllIIIlIIIIIIllIl.get(2) + 1 == 10 && iIllllIIIlIIIIIIllIl.get(5) == 31 && this.IlIIllIIllIIllIIlIIl.nextFloat() < 0.25f) {
                this.llllIIIIlIIIlIlllIll(4, new lllIIIIlIlIllIIlIIIl((this.IlIIllIIllIIllIIlIIl.nextFloat() < 0.1f) ? net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.d : net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIlllIIlIlllllIIlI));
                this.IlIlIIIllIIllIlllllI[4] = 0.0f;
            }
        }
        this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.llIllIIIIIllIlIIIIlI).IlIlIlIlIlllllllllIl(new llllIIIIlIIIlIlllIll("Random spawn bonus", this.IlIIllIIllIIllIIlIIl.nextDouble() * 0.05000000074505806, 0));
        final double n = this.IlIIllIIllIIllIIlIIl.nextDouble() * 1.5 * ilIlIlIlIlllllllllIl;
        if (n > 1.0) {
            this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.IlIlIlIlIlllllllllIl).IlIlIlIlIlllllllllIl(new llllIIIIlIIIlIlllIll("Random zombie-spawn bonus", n, 2));
        }
        if (this.IlIIllIIllIIllIIlIIl.nextFloat() < ilIlIlIlIlllllllllIl * 0.05f) {
            this.llllIIIIlIIIlIlllIll(llIlIIIIIlIIlIlIIlll.llllIIIIlIIIlIlllIll).IlIlIlIlIlllllllllIl(new llllIIIIlIIIlIlllIll("Leader zombie bonus", this.IlIIllIIllIIllIIlIIl.nextDouble() * 0.25 + 0.5, 0));
            this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll).IlIlIlIlIlllllllllIl(new llllIIIIlIIIlIlllIll("Leader zombie bonus", this.IlIIllIIllIIllIIlIIl.nextDouble() * 3.0 + 1.0, 2));
            this.llllIIIIlIIIlIlllIll(true);
        }
        return (net.minecraft.llllIIIlIlllIlIIIIIl.llIIIlIlIllIIlIlIlII)llllIIIIlIIIlIlllIll;
    }
    
    public boolean IlIIIlIlIIIllIlIlIIl(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final lllIIIIlIlIllIIlIIIl p = llllIIIIlIIIlIlllIll.p();
        if (p != null && p.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.llllIllllIllllIlIlII && p.lIIIIlIIIIIlllIllIII() == 0 && this.aq() && this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI)) {
            if (!llllIIIIlIIIlIlllIll.K.IlIIIlIlIIIllIlIlIIl) {
                final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = p;
                --lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl;
            }
            if (p.IlIlIlIlIlllllllllIl <= 0) {
                llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI, null);
            }
            if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
                this.llllIIIIlIIIlIlllIll(this.IlIIllIIllIIllIIlIIl.nextInt(2401) + 3600);
            }
            return true;
        }
        return false;
    }
    
    protected void llllIIIIlIIIlIlllIll(final int u) {
        this.u = u;
        this.llIllIlIlIIIIIIIllII().IlIlIlIlIlllllllllIl(14, 1);
        this.llllIIllllIlIlIIIIll(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI.llllllIllIllIlIllllI);
        this.llllIIIIlIIIlIlllIll(new net.minecraft.llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl.llllllIllIllIlIllllI, u, Math.min(this.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll() - 1, 0)));
        this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this, (byte)16);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final byte b) {
        if (b == 16) {
            if (!this.lIlIlIlllIIlIlIlllIl()) {
                this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.IIlllIlIIllIlIlIlIIl + 0.5, this.llIIIlIlIllIIlIlIlII + 0.5, this.lllllIlIIIlIlIIlllII + 0.5, "mob.zombie.remedy", 1.0f + this.IlIIllIIllIIllIIlIIl.nextFloat(), this.IlIIllIIllIIllIIlIIl.nextFloat() * 0.7f + 0.3f, false);
            }
        }
        else {
            super.llllIIIIlIIIlIlllIll(b);
        }
    }
    
    @Override
    protected boolean g() {
        return !this.ar();
    }
    
    public boolean ar() {
        return this.llIllIlIlIIIIIIIllII().llllIIIIlIIIlIlllIll(14) == 1;
    }
    
    protected void as() {
        final net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IlIlIllllllllIIIIlII ilIlIllllllllIIIIlII = new net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IlIlIllllllllIIIIlII(this.IlllllllIIIlIIIlIlII);
        ilIlIllllllllIIIIlII.llIIlIIIlIIIllIlIIIl(this);
        ilIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll(this.IlllllllIIIlIIIlIlII.lIllllllIIllIlIlIlII(new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIllllllllIIIIlII)), null);
        ilIlIllllllllIIIIlII.ar();
        if (this.e_()) {
            ilIlIllllllllIIIIlII.IlIlIlIlIlllllllllIl(-24000);
        }
        this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(this);
        ilIlIllllllllIIIIlII.llIIlIIIlIIIllIlIIIl(this.v());
        if (this.w_()) {
            ilIlIllllllllIIIIlII.IlIIIlIlIIIllIlIlIIl(this.lIllIlIIIllllllIIlII());
            ilIlIllllllllIIIIlII.lIIIIlIIIIIlllIllIII(this.IlIllIIllIIlIIIIlIIl());
        }
        this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIllllllllIIIIlII);
        ilIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll(new net.minecraft.llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI.llllllIllIllIlIllllI, 200, 0));
        this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(null, 1017, new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl((int)this.IIlllIlIIllIlIlIlIIl, (int)this.llIIIlIlIllIIlIlIlII, (int)this.lllllIlIIIlIlIIlllII), 0);
    }
    
    protected int at() {
        int n = 1;
        if (this.IlIIllIIllIIllIIlIIl.nextFloat() < 0.01f) {
            int n2 = 0;
            final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = new net.minecraft.IlllllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl();
            for (int n3 = (int)this.IIlllIlIIllIlIlIlIIl - 4; n3 < (int)this.IIlllIlIIllIlIlIlIIl + 4 && n2 < 14; ++n3) {
                for (int n4 = (int)this.llIIIlIlIllIIlIlIlII - 4; n4 < (int)this.llIIIlIlIllIIlIlIlII + 4 && n2 < 14; ++n4) {
                    for (int n5 = (int)this.lllllIlIIIlIlIIlllII - 4; n5 < (int)this.lllllIlIIIlIlIIlllII + 4 && n2 < 14; ++n5) {
                        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(n3, n4, n5)).llIllIIIIIllIlIIIIlI();
                        if (llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.m || llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII) {
                            if (this.IlIIllIIllIIllIIlIIl.nextFloat() < 0.3f) {
                                ++n;
                            }
                            ++n2;
                        }
                    }
                }
            }
        }
        return n;
    }
    
    public void IIIIlllIIIIIIlIIIlll(final boolean b) {
        this.IlIIIlIlIIIllIlIlIIl(b ? 0.5f : 1.0f);
    }
    
    @Override
    protected final void llllIIIIlIIIlIlllIll(final float w, final float x) {
        final boolean b = this.w > 0.0f && this.x > 0.0f;
        this.w = w;
        this.x = x;
        if (!b) {
            this.IlIIIlIlIIIllIlIlIIl(1.0f);
        }
    }
    
    protected final void IlIIIlIlIIIllIlIlIIl(final float n) {
        super.llllIIIIlIIIlIlllIll(this.w * n, this.x * n);
    }
    
    @Override
    public double IIllIIIlIIlIlIlIIIII() {
        return this.e_() ? 0.0 : -0.35;
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII) {
        super.IlIlIlIlIlllllllllIl(lIllllllIIllIlIlIlII);
        if (lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl() instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl && !(this instanceof llIIIlIlIllIIlIlIlII) && ((net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl)lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl()).lIIIIlIIIIIlllIllIII() && ((net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl)lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl()).ar()) {
            ((net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl)lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl()).as();
            this.llllIIIIlIIIlIlllIll(new lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.ab, 1, 2), 0.0f);
        }
    }
}
