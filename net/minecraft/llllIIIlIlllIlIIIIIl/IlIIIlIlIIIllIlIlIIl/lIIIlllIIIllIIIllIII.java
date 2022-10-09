package net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import org.apache.logging.log4j.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import java.util.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IIIlIIIlIlIIlllIIlll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class lIIIlllIIIllIIIllIII extends llIllIIIIIllIlIIIIlI
{
    private static final Logger IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    private int IlIlIIIllIllIIIIIllI;
    private String IllIIlllIIIIlllIIlIl;
    private String llllIIIlIlllIlIIIIIl;
    public float llllIIIIlIIIlIlllIll;
    
    static {
        IlIlIlIlIlllllllllIl = LogManager.getLogger();
    }
    
    public lIIIlllIIIllIIIllIII(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double n, final double n2, final double n3) {
        super(illlllllIIIlIIIlIlII);
        this.IlIlIIIllIllIIIIIllI = 5;
        this.llllIIIIlIIIlIlllIll = (float)(Math.random() * 3.141592653589793 * 2.0);
        this.llllIIIIlIIIlIlllIll(0.25f, 0.25f);
        this.IlIlIlIlIlllllllllIl(n, n2, n3);
        this.IIlIIIIIllIlIIIlIIll = (float)(Math.random() * 360.0);
        this.lIllllllIIllIlIlIlII = (float)(Math.random() * 0.20000000298023224 - 0.10000000149011612);
        this.llIIlllIIlllIIllIllI = 0.20000000298023224;
        this.IIlllIIIlIlllIIlllII = (float)(Math.random() * 0.20000000298023224 - 0.10000000149011612);
    }
    
    public lIIIlllIIIllIIIllIII(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double n, final double n2, final double n3, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        this(illlllllIIIlIIIlIlII, n, n2, n3);
        this.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl);
    }
    
    @Override
    protected boolean c_() {
        return false;
    }
    
    public lIIIlllIIIllIIIllIII(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
        this.IlIlIIIllIllIIIIIllI = 5;
        this.llllIIIIlIIIlIlllIll = (float)(Math.random() * 3.141592653589793 * 2.0);
        this.llllIIIIlIIIlIlllIll(0.25f, 0.25f);
        this.llllIIIIlIIIlIlllIll(new lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll, 0));
    }
    
    @Override
    protected void a_() {
        this.llIllIlIlIIIIIIIllII().llllIIIIlIIIlIlllIll(10, 5);
    }
    
    @Override
    public void IIllIIllIIIlIlIIIIlI() {
        if (this.lIIIIlIIIIIlllIllIII() == null) {
            this.IllIllIIIIlIIlIlllII();
        }
        else {
            super.IIllIIllIIIlIlIIIIlI();
            if (this.IlIIIlIlIIIllIlIlIIl > 0 && this.IlIIIlIlIIIllIlIlIIl != 32767) {
                --this.IlIIIlIlIIIllIlIlIIl;
            }
            this.IIlIIIIlllIlllllIlII = this.IIlllIlIIllIlIlIlIIl;
            this.IIIlIIlIIIIlllIlllII = this.llIIIlIlIllIIlIlIlII;
            this.IlIlIllllllllIIIIlII = this.lllllIlIIIlIlIIlllII;
            this.llIIlllIIlllIIllIllI -= 0.03999999910593033;
            this.lIIIIlIlIllllIIlIllI = this.llllIIIIlIIIlIlllIll(this.IIlllIlIIllIlIlIlIIl, (this.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl + this.IlIIlllIIlIlllllIIlI().IlIlIIIllIllIIIIIllI) / 2.0, this.lllllIlIIIlIlIIlllII);
            this.IlIIIlIlIIIllIlIlIIl(this.lIllllllIIllIlIlIlII, this.llIIlllIIlllIIllIllI, this.IIlllIIIlIlllIIlllII);
            if ((int)this.IIlIIIIlllIlllllIlII != (int)this.IIlllIlIIllIlIlIlIIl || (int)this.IIIlIIlIIIIlllIlllII != (int)this.llIIIlIlIllIIlIlIlII || (int)this.IlIlIllllllllIIIIlII != (int)this.lllllIlIIIlIlIIlllII || this.lllllIIIIIlIlIIIIIIl % 25 == 0) {
                if (this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(new IlIlIlIlIlllllllllIl(this)).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII) {
                    this.llIIlllIIlllIIllIllI = 0.20000000298023224;
                    this.lIllllllIIllIlIlIlII = (this.IlIIllIIllIIllIIlIIl.nextFloat() - this.IlIIllIIllIIllIIlIIl.nextFloat()) * 0.2f;
                    this.IIlllIIIlIlllIIlllII = (this.IlIIllIIllIIllIIlIIl.nextFloat() - this.IlIIllIIllIIllIIlIIl.nextFloat()) * 0.2f;
                    this.llllIIIIlIIIlIlllIll("random.fizz", 0.4f, 2.0f + this.IlIIllIIllIIllIIlIIl.nextFloat() * 0.4f);
                }
                if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
                    this.IIlIIIIlllIlllllIlII();
                }
            }
            float n = 0.98f;
            if (this.IIIIIllIIIIlIIIIllIl) {
                n = this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(new IlIlIlIlIlllllllllIl(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.IIlllIlIIllIlIlIlIIl), net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl) - 1, net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.lllllIlIIIlIlIIlllII))).llIllIIIIIllIlIIIIlI().IlIIIlIIIllllIlIlIlI * 0.98f;
            }
            this.lIllllllIIllIlIlIlII *= n;
            this.llIIlllIIlllIIllIllI *= 0.9800000190734863;
            this.IIlllIIIlIlllIIlllII *= n;
            if (this.IIIIIllIIIIlIIIIllIl) {
                this.llIIlllIIlllIIllIllI *= -0.5;
            }
            if (this.llIllIIIIIllIlIIIIlI != -32768) {
                ++this.llIllIIIIIllIlIIIIlI;
            }
            this.IlIIllIIllIIllIIlIIl();
            if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && this.llIllIIIIIllIlIIIIlI >= 6000) {
                this.IllIllIIIIlIIlIlllII();
            }
        }
    }
    
    private void IIlIIIIlllIlllllIlII() {
        final Iterator<lIIIlllIIIllIIIllIII> iterator = this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(lIIIlllIIIllIIIllIII.class, this.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl(0.5, 0.0, 0.5)).iterator();
        while (iterator.hasNext()) {
            this.llllIIIIlIIIlIlllIll(iterator.next());
        }
    }
    
    private boolean llllIIIIlIIIlIlllIll(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
        if (liiIlllIIIllIIIllIII == this) {
            return false;
        }
        if (!liiIlllIIIllIIIllIII.llllIllllIllllIlIlII() || !this.llllIllllIllllIlIlII()) {
            return false;
        }
        final lllIIIIlIlIllIIlIIIl liiiIlIIIIIlllIllIII = this.lIIIIlIIIIIlllIllIII();
        final lllIIIIlIlIllIIlIIIl liiiIlIIIIIlllIllIII2 = liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII();
        if (this.IlIIIlIlIIIllIlIlIIl == 32767 || liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl == 32767) {
            return false;
        }
        if (this.llIllIIIIIllIlIIIIlI == -32768 || liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI == -32768) {
            return false;
        }
        if (liiiIlIIIIIlllIllIII2.llllIIIIlIIIlIlllIll() != liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll()) {
            return false;
        }
        if (liiiIlIIIIIlllIllIII2.IIIIlllIIIIIIlIIIlll() ^ liiiIlIIIIIlllIllIII.IIIIlllIIIIIIlIIIlll()) {
            return false;
        }
        if (liiiIlIIIIIlllIllIII2.IIIIlllIIIIIIlIIIlll() && !liiiIlIIIIIlllIllIII2.llllIIllllIlIlIIIIll().equals(liiiIlIIIIIlllIllIII.llllIIllllIlIlIIIIll())) {
            return false;
        }
        if (liiiIlIIIIIlllIllIII2.llllIIIIlIIIlIlllIll() == null) {
            return false;
        }
        if (liiiIlIIIIIlllIllIII2.llllIIIIlIIIlIlllIll().IlIlIlIlIlllllllllIl() && liiiIlIIIIIlllIllIII2.lIIIIlIIIIIlllIllIII() != liiiIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII()) {
            return false;
        }
        if (liiiIlIIIIIlllIllIII2.IlIlIlIlIlllllllllIl < liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl) {
            return liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(this);
        }
        if (liiiIlIIIIIlllIllIII2.IlIlIlIlIlllllllllIl + liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl > liiiIlIIIIIlllIllIII2.IlIlIlIlIlllllllllIl()) {
            return false;
        }
        final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = liiiIlIIIIIlllIllIII2;
        lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl += liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl;
        liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl = Math.max(liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl, this.IlIIIlIlIIIllIlIlIIl);
        liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI = Math.min(liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI, this.llIllIIIIIllIlIIIIlI);
        liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII2);
        this.IllIllIIIIlIIlIlllII();
        return true;
    }
    
    public void llllIIIlIlllIlIIIIIl() {
        this.llIllIIIIIllIlIIIIlI = 4800;
    }
    
    @Override
    public boolean IlIIllIIllIIllIIlIIl() {
        if (this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.IlIIlllIIlIlllllIIlI(), net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII, this)) {
            if (!this.lIllIIIIIlllIIlIIllI && !this.llIIIllIlIllIllIIIIl) {
                this.lllllIIIIIlIlIIIIIIl();
            }
            this.lIllIIIIIlllIIlIIllI = true;
        }
        else {
            this.lIllIIIIIlllIIlIIllI = false;
        }
        return this.lIllIIIIIlllIIlIIllI;
    }
    
    @Override
    protected void IllIIlllIIIIlllIIlIl(final int n) {
        this.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll, (float)n);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII, final float n) {
        if (this.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII)) {
            return false;
        }
        if (this.lIIIIlIIIIIlllIllIII() != null && this.lIIIIlIIIIIlllIllIII().llllIIIIlIIIlIlllIll() == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.ad && lIllllllIIllIlIlIlII.llIllIIIIIllIlIIIIlI()) {
            return false;
        }
        this.IIIllIIIlIlIIllIIIlI();
        this.IlIlIIIllIllIIIIIllI -= (int)n;
        if (this.IlIlIIIllIllIIIIIllI <= 0) {
            this.IllIllIIIIlIIlIlllII();
        }
        return false;
    }
    
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Health", (short)(byte)this.IlIlIIIllIllIIIIIllI);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Age", (short)this.llIllIIIIIllIlIIIIlI);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("PickupDelay", (short)this.IlIIIlIlIIIllIlIlIIl);
        if (this.lIlIlIIIllIIllIIIllI() != null) {
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Thrower", this.IllIIlllIIIIlllIIlIl);
        }
        if (this.lIIIlllIIIllIIIllIII() != null) {
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Owner", this.llllIIIlIlllIlIIIIIl);
        }
        if (this.lIIIIlIIIIIlllIllIII() != null) {
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Item", this.lIIIIlIIIIIlllIllIII().IlIlIlIlIlllllllllIl(new IIIIlllIIIIIIlIIIlll()));
        }
    }
    
    public void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        this.IlIlIIIllIllIIIIIllI = (iiiIlllIIIIIIlIIIlll.IlIlIIIllIllIIIIIllI("Health") & 0xFF);
        this.llIllIIIIIllIlIIIIlI = iiiIlllIIIIIIlIIIlll.IlIlIIIllIllIIIIIllI("Age");
        if (iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI("PickupDelay")) {
            this.IlIIIlIlIIIllIlIlIIl = iiiIlllIIIIIIlIIIlll.IlIlIIIllIllIIIIIllI("PickupDelay");
        }
        if (iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI("Owner")) {
            this.llllIIIlIlllIlIIIIIl = iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl("Owner");
        }
        if (iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI("Thrower")) {
            this.IllIIlllIIIIlllIIlIl = iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl("Thrower");
        }
        this.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll.IlIlIIIllIIllIlllllI("Item")));
        if (this.lIIIIlIIIIIlllIllIII() == null) {
            this.IllIllIIIIlIIlIlllII();
        }
    }
    
    @Override
    public void b_(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            final lllIIIIlIlIllIIlIIIl liiiIlIIIIIlllIllIII = this.lIIIIlIIIIIlllIllIII();
            final int ilIlIlIlIlllllllllIl = liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl;
            if (this.IlIIIlIlIIIllIlIlIIl == 0 && (this.llllIIIlIlllIlIIIIIl == null || 6000 - this.llIllIIIIIllIlIIIIlI <= 200 || this.llllIIIlIlllIlIIIIIl.equals(llllIIIIlIIIlIlllIll.s_())) && llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII)) {
                if (liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll() == net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl)) {
                    llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl);
                }
                if (liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll() == net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl)) {
                    llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl);
                }
                if (liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.lllllIlIlIlllIlllIlI) {
                    llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl.IIllIIllIIIlIlIIIIlI);
                }
                if (liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.lIIIlllIIIllIIIllIII) {
                    llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl.IlllllllIIIlIIIlIlII);
                }
                if (liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.z) {
                    llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl.IIlllIlIIllIlIlIlIIl);
                }
                if (liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.lIIIlllIIIllIIIllIII && this.lIlIlIIIllIIllIIIllI() != null) {
                    final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.lIlIlIIIllIIllIIIllI());
                    if (llllIIIIlIIIlIlllIll2 != null && llllIIIIlIIIlIlllIll2 != llllIIIIlIIIlIlllIll) {
                        llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl.IIlIIIIlllIlllllIlII);
                    }
                }
                if (!this.lIlIlIlllIIlIlIlllIl()) {
                    this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll((llIllIIIIIllIlIIIIlI)llllIIIIlIIIlIlllIll, "random.pop", 0.2f, ((this.IlIIllIIllIIllIIlIIl.nextFloat() - this.IlIIllIIllIIllIIlIIl.nextFloat()) * 0.7f + 1.0f) * 2.0f);
                }
                llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this, ilIlIlIlIlllllllllIl);
                if (liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl <= 0) {
                    this.IllIllIIIIlIIlIlllII();
                }
            }
        }
    }
    
    @Override
    public String s_() {
        return this.w_() ? this.lIllIlIIIllllllIIlII() : lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll("item." + this.lIIIIlIIIIIlllIllIII().llIllIlIIIIllIlIIllI());
    }
    
    @Override
    public boolean i_() {
        return false;
    }
    
    @Override
    public void lIIIlllIIIllIIIllIII(final int n) {
        super.lIIIlllIIIllIIIllIII(n);
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            this.IIlIIIIlllIlllllIlII();
        }
    }
    
    public lllIIIIlIlIllIIlIIIl lIIIIlIIIIIlllIllIII() {
        final lllIIIIlIlIllIIlIIIl illIIlllIIIIlllIIlIl = this.llIllIlIlIIIIIIIllII().IllIIlllIIIIlllIIlIl(10);
        if (illIIlllIIIIlllIIlIl == null) {
            if (this.IlllllllIIIlIIIlIlII != null) {
                lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl.error("Item entity " + this.IlllIIIIlIIIlIlIlIIl() + " has no item?!");
            }
            return new lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl);
        }
        return illIIlllIIIIlllIIlIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        this.llIllIlIlIIIIIIIllII().IlIlIlIlIlllllllllIl(10, lllIIIIlIlIllIIlIIIl);
        this.llIllIlIlIIIIIIIllII().lIIIIlIIIIIlllIllIII(10);
    }
    
    public String lIIIlllIIIllIIIllIII() {
        return this.llllIIIlIlllIlIIIIIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final String llllIIIlIlllIlIIIIIl) {
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
    }
    
    public String lIlIlIIIllIIllIIIllI() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public void IlIlIlIlIlllllllllIl(final String illIIlllIIIIlllIIlIl) {
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
    }
    
    public int llllIIllllIlIlIIIIll() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public void IlIllIlIlIIIlIlIlIII() {
        this.IlIIIlIlIIIllIlIlIIl = 10;
    }
    
    public void IIlllIIlIllIllIlIIll() {
        this.IlIIIlIlIIIllIlIlIIl = 0;
    }
    
    public void lllIIIIlllllIlIIllIl() {
        this.IlIIIlIlIIIllIlIlIIl = 32767;
    }
    
    public void llllIIIIlIIIlIlllIll(final int ilIIIlIlIIIllIlIlIIl) {
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public boolean IlIlIIIIIIlllIlIllIl() {
        return this.IlIIIlIlIIIllIlIlIIl > 0;
    }
    
    public void IIIlIIIlIlIIlllIIlll() {
        this.llIllIIIIIllIlIIIIlI = -6000;
    }
    
    public void IlllllllIIIlIIIlIlII() {
        this.lllIIIIlllllIlIIllIl();
        this.llIllIIIIIllIlIIIIlI = 5999;
    }
}
