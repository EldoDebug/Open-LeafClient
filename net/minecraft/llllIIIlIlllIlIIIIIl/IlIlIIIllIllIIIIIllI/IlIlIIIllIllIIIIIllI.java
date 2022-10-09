package net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI;

import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import java.util.*;
import com.google.common.collect.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.*;
import com.google.common.base.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IlIlIIIllIllIIIIIllI extends IIlllIlIIllIlIlIlIIl
{
    private static final UUID llllIIIIlIIIlIlllIll;
    private static final llllIIIIlIIIlIlllIll IlIlIlIlIlllllllllIl;
    private static final Set llIllIIIIIllIlIIIIlI;
    private boolean t;
    
    static {
        llllIIIIlIIIlIlllIll = UUID.fromString("020E0DFB-87AE-4653-9556-831010E291A0");
        IlIlIlIlIlllllllllIl = new llllIIIIlIIIlIlllIll(IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, "Attacking speed boost", 0.15000000596046448, 0).llllIIIIlIIIlIlllIll(false);
        (llIllIIIIIllIlIIIIlI = Sets.newIdentityHashSet()).add(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI);
        IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI.add(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl);
        IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI.add(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI);
        IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI.add(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIlllIIIIIIlIIIlll);
        IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI.add(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlllIIIIlIIIlIlIlIIl);
        IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI.add(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll);
        IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI.add(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIlIlIIIIIIIllII);
        IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI.add(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlIlIlIIlIllIIIIIIl);
        IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI.add(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIlIIllIllIIlIllII);
        IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI.add(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllllIIIIIIIlllIIll);
        IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI.add(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlIlllIlIlllIlIllll);
        IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI.add(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIlllIIlIlllllIIlI);
        IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI.add(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.o);
        IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI.add(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.A);
    }
    
    public IlIlIIIllIllIIIIIllI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
        this.llllIIIIlIIIlIlllIll(0.6f, 2.9f);
        this.llIIIIIIlIllIIlIIIll = 1.0f;
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(0, new llIlIIIIIlIIlIlIIlll(this));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(2, new IlIlIlIlIlllllllllIl(this, 1.0, false));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(7, new IlIIllIIllIIllIIlIIl(this, 1.0));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(8, new lllllIIIIIlIlIIIIIIl(this, net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.class, 8.0f));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(8, new IlIlIllllllllIIIIlII(this));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(10, new lIIIIlIIIIIlllIllIII(this));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(11, new lIIIlllIIIllIIIllIII(this));
        this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(1, new IlIlIIIlIIlIlIIlllIl(this, false, new Class[0]));
        this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(2, new llllIIIlIlllIlIIIIIl(this));
        this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(3, new IIlIIIIIllIlIIIlIIll(this, net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.llIIlIIIlIIIllIlIIIl.class, 10, true, false, (Predicate)new IllIIlllIIIIlllIIlIl(this)));
    }
    
    @Override
    protected void IlIlIllllllllIIIIlII() {
        super.IlIlIllllllllIIIIlII();
        this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll(40.0);
        this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll(0.30000001192092896);
        this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.IlIlIIIllIllIIIIIllI).llllIIIIlIIIlIlllIll(7.0);
        this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.IlIlIlIlIlllllllllIl).llllIIIIlIIIlIlllIll(64.0);
    }
    
    @Override
    protected void a_() {
        super.a_();
        this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(16, new Short((short)0));
        this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(17, new Byte((byte)0));
        this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(18, new Byte((byte)0));
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl ao = this.ao();
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("carried", (short)net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ao.llIllIIIIIllIlIIIIlI()));
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("carriedData", (short)ao.llIllIIIIIllIlIIIIlI().llIllIIIIIllIlIIIIlI(ao));
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl;
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("carried", 8)) {
            llIIlIIIlIIIllIlIIIl = net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl("carried")).llIllIIIIIllIlIIIIlI(iiiIlllIIIIIIlIIIlll.IlIlIIIllIllIIIIIllI("carriedData") & 0xFFFF);
        }
        else {
            llIIlIIIlIIIllIlIIIl = net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll.IlIlIIIllIllIIIIIllI("carried")).llIllIIIIIllIlIIIIlI(iiiIlllIIIIIIlIIIlll.IlIlIIIllIllIIIIIllI("carriedData") & 0xFFFF);
        }
        this.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl);
    }
    
    private boolean IllIIlllIIIIlllIIlIl(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl[3];
        if (lllIIIIlIlIllIIlIIIl != null && lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() == net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIlllIIlIlllllIIlI)) {
            return false;
        }
        final e llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(1.0f).llllIIIIlIIIlIlllIll();
        final e e = new e(this.IIlllIlIIllIlIlIlIIl - llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl, this.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl + this.IlIllllIIlIIlIlIlIll / 2.0f - (llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII + llllIIIIlIIIlIlllIll.llllIlIllllIIlIIlIlI()), this.lllllIlIIIlIlIIlllII - llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII);
        return llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl(e.llllIIIIlIIIlIlllIll()) > 1.0 - 0.025 / e.IlIlIlIlIlllllllllIl() && llllIIIIlIIIlIlllIll.IIlllIIlIllIllIlIIll(this);
    }
    
    @Override
    public float llllIlIllllIIlIIlIlI() {
        return 2.55f;
    }
    
    @Override
    public void IIIlIIIlIlIIlllIIlll() {
        if (this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            for (int i = 0; i < 2; ++i) {
                this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IIIlIIlIIIIlllIlllII, this.IIlllIlIIllIlIlIlIIl + (this.IlIIllIIllIIllIIlIIl.nextDouble() - 0.5) * this.IllIllIIIIlIIlIlllII, this.llIIIlIlIllIIlIlIlII + this.IlIIllIIllIIllIIlIIl.nextDouble() * this.IlIllllIIlIIlIlIlIll - 0.25, this.lllllIlIIIlIlIIlllII + (this.IlIIllIIllIIllIIlIIl.nextDouble() - 0.5) * this.IllIllIIIIlIIlIlllII, (this.IlIIllIIllIIllIIlIIl.nextDouble() - 0.5) * 2.0, -this.IlIIllIIllIIllIIlIIl.nextDouble(), (this.IlIIllIIllIIllIIlIIl.nextDouble() - 0.5) * 2.0, new int[0]);
            }
        }
        this.j = false;
        super.IIIlIIIlIlIIlllIIlll();
    }
    
    @Override
    protected void i() {
        if (this.lIIIIlIlIllllIIlIllI()) {
            this.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.lIllllllIIllIlIlIlII.IllIIlllIIIIlllIIlIl, 1.0f);
        }
        if (this.ap() && !this.t && this.IlIIllIIllIIllIIlIIl.nextInt(100) == 0) {
            this.llllIIIIlIIIlIlllIll(false);
        }
        if (this.IlllllllIIIlIIIlIlII.lIlIlIIIllIIllIIIllI()) {
            final float b_ = this.b_(1.0f);
            if (b_ > 0.5f && this.IlllllllIIIlIIIlIlII.llIIlIIIlIIIllIlIIIl(new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(this)) && this.IlIIllIIllIIllIIlIIl.nextFloat() * 30.0f < (b_ - 0.4f) * 2.0f) {
                this.IlIlIlIlIlllllllllIl((lllIIIIlllllIlIIllIl)null);
                this.llllIIIIlIIIlIlllIll(false);
                this.t = false;
                this.lIIIIlIIIIIlllIllIII();
            }
        }
        super.i();
    }
    
    protected boolean lIIIIlIIIIIlllIllIII() {
        return this.llIllIlIIIIllIlIIllI(this.IIlllIlIIllIlIlIlIIl + (this.IlIIllIIllIIllIIlIIl.nextDouble() - 0.5) * 64.0, this.llIIIlIlIllIIlIlIlII + (this.IlIIllIIllIIllIIlIIl.nextInt(64) - 32), this.lllllIlIIIlIlIIlllII + (this.IlIIllIIllIIllIIlIIl.nextDouble() - 0.5) * 64.0);
    }
    
    protected boolean IlIlIlIlIlllllllllIl(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        final e llllIIIIlIIIlIlllIll = new e(this.IIlllIlIIllIlIlIlIIl - llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl, this.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl + this.IlIllllIIlIIlIlIlIll / 2.0f - llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII + llIllIIIIIllIlIIIIlI.llllIlIllllIIlIIlIlI(), this.lllllIlIIIlIlIIlllII - llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII).llllIIIIlIIIlIlllIll();
        final double n = 16.0;
        return this.llIllIlIIIIllIlIIllI(this.IIlllIlIIllIlIlIlIIl + (this.IlIIllIIllIIllIIlIIl.nextDouble() - 0.5) * 8.0 - llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll * n, this.llIIIlIlIllIIlIlIlII + (this.IlIIllIIllIIllIIlIIl.nextInt(16) - 8) - llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl * n, this.lllllIlIIIlIlIIlllII + (this.IlIIllIIllIIllIIlIIl.nextDouble() - 0.5) * 8.0 - llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI * n);
    }
    
    protected boolean llIllIlIIIIllIlIIllI(final double iIlllIlIIllIlIlIlIIl, final double llIIIlIlIllIIlIlIlII, final double lllllIlIIIlIlIIlllII) {
        final double iIlllIlIIllIlIlIlIIl2 = this.IIlllIlIIllIlIlIlIIl;
        final double llIIIlIlIllIIlIlIlII2 = this.llIIIlIlIllIIlIlIlII;
        final double lllllIlIIIlIlIIlllII2 = this.lllllIlIIIlIlIIlllII;
        this.IIlllIlIIllIlIlIlIIl = iIlllIlIIllIlIlIlIIl;
        this.llIIIlIlIllIIlIlIlII = llIIIlIlIllIIlIlIlII;
        this.lllllIlIIIlIlIIlllII = lllllIlIIIlIlIIlllII;
        boolean b = false;
        net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII);
        if (this.IlllllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl(ilIlIlIlIlllllllllIl)) {
            boolean b2 = false;
            while (!b2 && ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() > 0) {
                final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2 = ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl();
                if (this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl2).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl().IlIIIlIlIIIllIlIlIIl()) {
                    b2 = true;
                }
                else {
                    --this.llIIIlIlIllIIlIlIlII;
                    ilIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl2;
                }
            }
            if (b2) {
                super.llIIlIIIlIIIllIlIIIl(this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII);
                if (this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this, this.IlIIlllIIlIlllllIIlI()).isEmpty() && !this.IlllllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl(this.IlIIlllIIlIlllllIIlI())) {
                    b = true;
                }
            }
        }
        if (!b) {
            this.IlIlIlIlIlllllllllIl(iIlllIlIIllIlIlIlIIl2, llIIIlIlIllIIlIlIlII2, lllllIlIIIlIlIIlllII2);
            return false;
        }
        for (int n = 128, i = 0; i < n; ++i) {
            final double n2 = i / (n - 1.0);
            this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IIIlIIlIIIIlllIlllII, iIlllIlIIllIlIlIlIIl2 + (this.IIlllIlIIllIlIlIlIIl - iIlllIlIIllIlIlIlIIl2) * n2 + (this.IlIIllIIllIIllIIlIIl.nextDouble() - 0.5) * this.IllIllIIIIlIIlIlllII * 2.0, llIIIlIlIllIIlIlIlII2 + (this.llIIIlIlIllIIlIlIlII - llIIIlIlIllIIlIlIlII2) * n2 + this.IlIIllIIllIIllIIlIIl.nextDouble() * this.IlIllllIIlIIlIlIlIll, lllllIlIIIlIlIIlllII2 + (this.lllllIlIIIlIlIIlllII - lllllIlIIIlIlIIlllII2) * n2 + (this.IlIIllIIllIIllIIlIIl.nextDouble() - 0.5) * this.IllIllIIIIlIIlIlllII * 2.0, (this.IlIIllIIllIIllIIlIIl.nextFloat() - 0.5f) * 0.2f, (this.IlIIllIIllIIllIIlIIl.nextFloat() - 0.5f) * 0.2f, (this.IlIIllIIllIIllIIlIIl.nextFloat() - 0.5f) * 0.2f, new int[0]);
        }
        this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(iIlllIlIIllIlIlIlIIl2, llIIIlIlIllIIlIlIlII2, lllllIlIIIlIlIIlllII2, "mob.endermen.portal", 1.0f, 1.0f);
        this.llllIIIIlIIIlIlllIll("mob.endermen.portal", 1.0f, 1.0f);
        return true;
    }
    
    @Override
    protected String e() {
        return this.ap() ? "mob.endermen.scream" : "mob.endermen.idle";
    }
    
    @Override
    protected String O() {
        return "mob.endermen.hit";
    }
    
    @Override
    protected String P() {
        return "mob.endermen.death";
    }
    
    @Override
    protected IlIIIlIlIIIllIlIlIIl f() {
        return net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.y;
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final boolean b, final int n) {
        final IlIIIlIlIIIllIlIlIIl f = this.f();
        if (f != null) {
            for (int nextInt = this.IlIIllIIllIIllIIlIIl.nextInt(2 + n), i = 0; i < nextInt; ++i) {
                this.llllIIIIlIIIlIlllIll(f, 1);
            }
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(16, (short)(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl) & 0xFFFF));
    }
    
    public net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl ao() {
        return net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(16) & 0xFFFF);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII, final float n) {
        if (this.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII)) {
            return false;
        }
        if (lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl() == null || !(lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl() instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.llIIlIIIlIIIllIlIIIl)) {
            if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
                this.llllIIIIlIIIlIlllIll(true);
            }
            if (lIllllllIIllIlIlIlII instanceof IIlllIIIlIlllIIlllII && lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl() instanceof net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll) {
                if (lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl() instanceof net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl && ((net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl)lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl()).llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI()) {
                    this.llllIIIIlIIIlIlllIll(false);
                }
                else {
                    this.t = true;
                }
            }
            if (lIllllllIIllIlIlIlII instanceof net.minecraft.IlllllllIIIlIIIlIlII.IIlIIIIIllIlIIIlIIll) {
                this.t = false;
                for (int i = 0; i < 64; ++i) {
                    if (this.lIIIIlIIIIIlllIllIII()) {
                        return true;
                    }
                }
                return false;
            }
        }
        final boolean llllIIIIlIIIlIlllIll = super.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII, n);
        if (lIllllllIIllIlIlIlII.IlIlIIIllIllIIIIIllI() && this.IlIIllIIllIIllIIlIIl.nextInt(10) != 0) {
            this.lIIIIlIIIIIlllIllIII();
        }
        return llllIIIIlIIIlIlllIll;
    }
    
    public boolean ap() {
        return this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(18) > 0;
    }
    
    public void llllIIIIlIIIlIlllIll(final boolean b) {
        this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(18, (byte)(byte)(b ? 1 : 0));
    }
}
