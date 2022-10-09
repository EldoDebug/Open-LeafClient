package net.minecraft.IlIlIIIllIIllIlllllI;

import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlIlIIIIIIlllIlIllIl.*;
import org.apache.logging.log4j.*;
import io.netty.util.concurrent.*;
import com.google.common.util.concurrent.*;
import com.google.common.primitives.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llIIlIIIlIIIllIlIIIl.*;
import java.util.concurrent.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import org.apache.commons.lang3.*;
import net.minecraft.IlIlIlIlIlllllllllIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.*;
import com.google.common.collect.*;
import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.*;
import java.util.*;
import io.netty.buffer.*;
import java.io.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.*;

public class lIIIIlIIIIIlllIllIII implements IlIlIlIlIlllllllllIl, llIIIllIlIllIllIIIIl
{
    private static final Logger llIllIIIIIllIlIIIIlI;
    public final IIlllIIlIllIllIlIIll llllIIIIlIIIlIlllIll;
    private final llllIIIIlIIIlIlllIll IlIIIlIlIIIllIlIlIIl;
    public IlIIIlIlIIIllIlIlIIl IlIlIlIlIlllllllllIl;
    private int IlIlIIIllIllIIIIIllI;
    private int IllIIlllIIIIlllIIlIl;
    private int llllIIIlIlllIlIIIIIl;
    private boolean lIIIIlIIIIIlllIllIII;
    private int lIIIlllIIIllIIIllIII;
    private long llIIlIIIlIIIllIlIIIl;
    private long llIllIlIIIIllIlIIllI;
    private int lIlIlIIIllIIllIIIllI;
    private int IlIlIIIllIIllIlllllI;
    private IIIllIIIlIlIIllIIIlI IIIIlllIIIIIIlIIIlll;
    private double llllIIllllIlIlIIIIll;
    private double IlIllIlIlIIIlIlIlIII;
    private double IIlllIIlIllIllIlIIll;
    private boolean lllIIIIlllllIlIIllIl;
    private static volatile /* synthetic */ int[] IlIlIIIIIIlllIlIllIl;
    private static volatile /* synthetic */ int[] IIllIIllIIIlIlIIIIlI;
    private static volatile /* synthetic */ int[] IIIlIIIlIlIIlllIIlll;
    
    static {
        llIllIIIIIllIlIIIIlI = LogManager.getLogger();
    }
    
    public lIIIIlIIIIIlllIllIII(final llllIIIIlIIIlIlllIll ilIIIlIlIIIllIlIlIIl, final IIlllIIlIllIllIlIIll llllIIIIlIIIlIlllIll, final IlIIIlIlIIIllIlIlIIl ilIlIlIlIlllllllllIl) {
        this.IIIIlllIIIIIIlIIIlll = new IIIllIIIlIlIIllIIIlI();
        this.lllIIIIlllllIlIIllIl = true;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        (this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll(this);
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll = this;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll() {
        this.lIIIIlIIIIIlllIllIII = false;
        ++this.IlIlIIIllIllIIIIIllI;
        this.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll("keepAlive");
        if (this.IlIlIIIllIllIIIIIllI - this.llIllIlIIIIllIlIIllI > 40L) {
            this.llIllIlIIIIllIlIIllI = this.IlIlIIIllIllIIIIIllI;
            this.llIIlIIIlIIIllIlIIIl = this.IllIIlllIIIIlllIIlIl();
            this.lIIIlllIIIllIIIllIII = (int)this.llIIlIIIlIIIllIlIIIl;
            this.llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.lIIIlllIIIllIIIllIII));
        }
        this.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl();
        if (this.lIlIlIIIllIIllIIIllI > 0) {
            --this.lIlIlIIIllIIllIIIllI;
        }
        if (this.IlIlIIIllIIllIlllllI > 0) {
            --this.IlIlIIIllIIllIlllllI;
        }
        if (this.IlIlIlIlIlllllllllIl.IIIllllllIllIIIlllIl() > 0L && this.IlIIIlIlIIIllIlIlIIl.IlIIIIIlIIllIIlIlIll() > 0 && net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.lllllIIllIlIllIllllI() - this.IlIlIlIlIlllllllllIl.IIIllllllIllIIIlllIl() > this.IlIIIlIlIIIllIlIlIIl.IlIIIIIlIIllIIlIlIll() * 1000 * 60) {
            this.llllIIIIlIIIlIlllIll("You have been idle for too long!");
        }
    }
    
    public IIlllIIlIllIllIlIIll IlIlIlIlIlllllllllIl() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public void llllIIIIlIIIlIlllIll(final String s) {
        final IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl = new IlIlIIIIIIlllIlIllIl(s);
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new llIllIIlllllllllllll(ilIlIIIIIIlllIlIllIl), new lIIIlllIIIllIIIllIII(this, ilIlIIIIIIlllIlIllIl), new GenericFutureListener[0]);
        this.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII();
        Futures.getUnchecked((Future)this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(new llIIlIIIlIIIllIlIIIl(this)));
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(ilIllIlIlIIIlIlIlIII, this, this.IlIlIlIlIlllllllllIl.IlllllllIIIlIIIlIlII());
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(ilIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(), ilIllIlIlIIIlIlIlIII.IlIlIlIlIlllllllllIl(), ilIllIlIlIIIlIlIlIII.llIllIIIIIllIlIIIIlI(), ilIllIlIlIIIlIlIlIII.IlIIIlIlIIIllIlIlIIl());
    }
    
    private boolean IlIlIlIlIlllllllllIl(final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI) {
        return !Doubles.isFinite(ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll()) || !Doubles.isFinite(ilIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl()) || !Doubles.isFinite(ilIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI()) || !Floats.isFinite(ilIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI()) || !Floats.isFinite(ilIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl());
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, this, this.IlIlIlIlIlllllllllIl.IlllllllIIIlIIIlIlII());
        if (this.IlIlIlIlIlllllllllIl(ilIlIIIllIllIIIIIllI)) {
            this.llllIIIIlIIIlIlllIll("Invalid move packet received");
        }
        else {
            final net.minecraft.IIIlIIlIIIIlllIlllII.IIIllllllIllIIIlllIl llllIIIIlIIIlIlllIll = this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl.lllllIIIIIlIIlllIlIl);
            this.lIIIIlIIIIIlllIllIII = true;
            if (!this.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII) {
                final double iIlllIlIIllIlIlIlIIl = this.IlIlIlIlIlllllllllIl.IIlllIlIIllIlIlIlIIl;
                final double llIIIlIlIllIIlIlIlII = this.IlIlIlIlIlllllllllIl.llIIIlIlIllIIlIlIlII;
                final double lllllIlIIIlIlIIlllII = this.IlIlIlIlIlllllllllIl.lllllIlIIIlIlIIlllII;
                double n = 0.0;
                final double n2 = ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll() - this.llllIIllllIlIlIIIIll;
                final double n3 = ilIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl() - this.IlIllIlIlIIIlIlIlIII;
                final double n4 = ilIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI() - this.IIlllIIlIllIllIlIIll;
                if (ilIlIIIllIllIIIIIllI.llllIIIlIlllIlIIIIIl()) {
                    n = n2 * n2 + n3 * n3 + n4 * n4;
                    if (!this.lllIIIIlllllIlIIllIl && n < 0.25) {
                        this.lllIIIIlllllIlIIllIl = true;
                    }
                }
                if (this.lllIIIIlllllIlIIllIl) {
                    this.IllIIlllIIIIlllIIlIl = this.IlIlIIIllIllIIIIIllI;
                    if (this.IlIlIlIlIlllllllllIl.IIIlIIIlIlIIlllIIlll != null) {
                        float n5 = this.IlIlIlIlIlllllllllIl.IIlIIIIIllIlIIIlIIll;
                        float n6 = this.IlIlIlIlIlllllllllIl.llllllIllIllIlIllllI;
                        this.IlIlIlIlIlllllllllIl.IIIlIIIlIlIIlllIIlll.IllIlIllIllIlllIIlll();
                        final double iIlllIlIIllIlIlIlIIl2 = this.IlIlIlIlIlllllllllIl.IIlllIlIIllIlIlIlIIl;
                        final double llIIIlIlIllIIlIlIlII2 = this.IlIlIlIlIlllllllllIl.llIIIlIlIllIIlIlIlII;
                        final double lllllIlIIIlIlIIlllII2 = this.IlIlIlIlIlllllllllIl.lllllIlIIIlIlIIlllII;
                        if (ilIlIIIllIllIIIIIllI.lIIIIlIIIIIlllIllIII()) {
                            n5 = ilIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl();
                            n6 = ilIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI();
                        }
                        this.IlIlIlIlIlllllllllIl.IIIIIllIIIIlIIIIllIl = ilIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl();
                        this.IlIlIlIlIlllllllllIl.lIlIlIIIllIIllIIIllI();
                        this.IlIlIlIlIlllllllllIl.a_(iIlllIlIIllIlIlIlIIl2, llIIIlIlIllIIlIlIlII2, lllllIlIIIlIlIIlllII2, n5, n6);
                        if (this.IlIlIlIlIlllllllllIl.IIIlIIIlIlIIlllIIlll != null) {
                            this.IlIlIlIlIlllllllllIl.IIIlIIIlIlIIlllIIlll.IllIlIllIllIlllIIlll();
                        }
                        this.IlIIIlIlIIIllIlIlIIl.IIlllIIlllIIIlIlllII().IlIIIlIlIIIllIlIlIIl(this.IlIlIlIlIlllllllllIl);
                        if (this.IlIlIlIlIlllllllllIl.IIIlIIIlIlIIlllIIlll != null) {
                            if (n > 4.0) {
                                this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new IlIlIllllllllIIIIlII(this.IlIlIlIlIlllllllllIl.IIIlIIIlIlIIlllIIlll));
                                this.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl.IIlllIlIIllIlIlIlIIl, this.IlIlIlIlIlllllllllIl.llIIIlIlIllIIlIlIlII, this.IlIlIlIlIlllllllllIl.lllllIlIIIlIlIIlllII, this.IlIlIlIlIlllllllllIl.IIlIIIIIllIlIIIlIIll, this.IlIlIlIlIlllllllllIl.llllllIllIllIlIllllI);
                            }
                            this.IlIlIlIlIlllllllllIl.IIIlIIIlIlIIlllIIlll.llIllIIlllllllllllll = true;
                        }
                        if (this.lllIIIIlllllIlIIllIl) {
                            this.llllIIllllIlIlIIIIll = this.IlIlIlIlIlllllllllIl.IIlllIlIIllIlIlIlIIl;
                            this.IlIllIlIlIIIlIlIlIII = this.IlIlIlIlIlllllllllIl.llIIIlIlIllIIlIlIlII;
                            this.IIlllIIlIllIllIlIIll = this.IlIlIlIlIlllllllllIl.lllllIlIIIlIlIIlllII;
                        }
                        llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl(this.IlIlIlIlIlllllllllIl);
                        return;
                    }
                    if (this.IlIlIlIlIlllllllllIl.ah()) {
                        this.IlIlIlIlIlllllllllIl.lIlIlIIIllIIllIIIllI();
                        this.IlIlIlIlIlllllllllIl.a_(this.llllIIllllIlIlIIIIll, this.IlIllIlIlIIIlIlIlIII, this.IIlllIIlIllIllIlIIll, this.IlIlIlIlIlllllllllIl.IIlIIIIIllIlIIIlIIll, this.IlIlIlIlIlllllllllIl.llllllIllIllIlIllllI);
                        llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl(this.IlIlIlIlIlllllllllIl);
                        return;
                    }
                    final double llIIIlIlIllIIlIlIlII3 = this.IlIlIlIlIlllllllllIl.llIIIlIlIllIIlIlIlII;
                    this.llllIIllllIlIlIIIIll = this.IlIlIlIlIlllllllllIl.IIlllIlIIllIlIlIlIIl;
                    this.IlIllIlIlIIIlIlIlIII = this.IlIlIlIlIlllllllllIl.llIIIlIlIllIIlIlIlII;
                    this.IIlllIIlIllIllIlIIll = this.IlIlIlIlIlllllllllIl.lllllIlIIIlIlIIlllII;
                    double n7 = this.IlIlIlIlIlllllllllIl.IIlllIlIIllIlIlIlIIl;
                    double n8 = this.IlIlIlIlIlllllllllIl.llIIIlIlIllIIlIlIlII;
                    double n9 = this.IlIlIlIlIlllllllllIl.lllllIlIIIlIlIIlllII;
                    float n10 = this.IlIlIlIlIlllllllllIl.IIlIIIIIllIlIIIlIIll;
                    float n11 = this.IlIlIlIlIlllllllllIl.llllllIllIllIlIllllI;
                    if (ilIlIIIllIllIIIIIllI.llllIIIlIlllIlIIIIIl() && ilIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl() == -999.0) {
                        ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(false);
                    }
                    if (ilIlIIIllIllIIIIIllI.llllIIIlIlllIlIIIIIl()) {
                        n7 = ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll();
                        n8 = ilIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl();
                        n9 = ilIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI();
                        if (Math.abs(ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll()) > 3.0E7 || Math.abs(ilIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI()) > 3.0E7) {
                            this.llllIIIIlIIIlIlllIll("Illegal position");
                            return;
                        }
                    }
                    if (ilIlIIIllIllIIIIIllI.lIIIIlIIIIIlllIllIII()) {
                        n10 = ilIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl();
                        n11 = ilIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI();
                    }
                    this.IlIlIlIlIlllllllllIl.lIlIlIIIllIIllIIIllI();
                    this.IlIlIlIlIlllllllllIl.a_(this.llllIIllllIlIlIIIIll, this.IlIllIlIlIIIlIlIlIII, this.IIlllIIlIllIllIlIIll, n10, n11);
                    if (!this.lllIIIIlllllIlIIllIl) {
                        return;
                    }
                    final double n12 = n7 - this.IlIlIlIlIlllllllllIl.IIlllIlIIllIlIlIlIIl;
                    final double n13 = n8 - this.IlIlIlIlIlllllllllIl.llIIIlIlIllIIlIlIlII;
                    final double n14 = n9 - this.IlIlIlIlIlllllllllIl.lllllIlIIIlIlIIlllII;
                    if (n12 * n12 + n13 * n13 + n14 * n14 - (this.IlIlIlIlIlllllllllIl.lIllllllIIllIlIlIlII * this.IlIlIlIlIlllllllllIl.lIllllllIIllIlIlIlII + this.IlIlIlIlIlllllllllIl.llIIlllIIlllIIllIllI * this.IlIlIlIlIlllllllllIl.llIIlllIIlllIIllIllI + this.IlIlIlIlIlllllllllIl.IIlllIIIlIlllIIlllII * this.IlIlIlIlIlllllllllIl.IIlllIIIlIlllIIlllII) > 100.0 && (!this.IlIIIlIlIIIllIlIlIIl.llIllIlIlIIIIIIIllII() || !this.IlIIIlIlIIIllIlIlIIl.lllIllIIIllllllIllll().equals(this.IlIlIlIlIlllllllllIl.s_()))) {
                        net.minecraft.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI.warn(String.valueOf(this.IlIlIlIlIlllllllllIl.s_()) + " moved too quickly! " + n12 + "," + n13 + "," + n14 + " (" + n12 + ", " + n13 + ", " + n14 + ")");
                        this.llllIIIIlIIIlIlllIll(this.llllIIllllIlIlIIIIll, this.IlIllIlIlIIIlIlIlIII, this.IIlllIIlIllIllIlIIll, this.IlIlIlIlIlllllllllIl.IIlIIIIIllIlIIIlIIll, this.IlIlIlIlIlllllllllIl.llllllIllIllIlIllllI);
                        return;
                    }
                    final float n15 = 0.0625f;
                    final boolean empty = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, this.IlIlIlIlIlllllllllIl.IlIIlllIIlIlllllIIlI().IlIIIlIlIIIllIlIlIIl(n15, n15, n15)).isEmpty();
                    if (this.IlIlIlIlIlllllllllIl.IIIIIllIIIIlIIIIllIl && !ilIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl() && n13 > 0.0) {
                        this.IlIlIlIlIlllllllllIl.ad();
                    }
                    this.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl(n12, n13, n14);
                    this.IlIlIlIlIlllllllllIl.IIIIIllIIIIlIIIIllIl = ilIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl();
                    final double n16 = n7 - this.IlIlIlIlIlllllllllIl.IIlllIlIIllIlIlIlIIl;
                    double n17 = n8 - this.IlIlIlIlIlllllllllIl.llIIIlIlIllIIlIlIlII;
                    if (n17 > -0.5 || n17 < 0.5) {
                        n17 = 0.0;
                    }
                    final double n18 = n9 - this.IlIlIlIlIlllllllllIl.lllllIlIIIlIlIIlllII;
                    final double n19 = n16 * n16 + n17 * n17 + n18 * n18;
                    boolean b = false;
                    if (n19 > 0.0625 && !this.IlIlIlIlIlllllllllIl.ah() && !this.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI()) {
                        b = true;
                        net.minecraft.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI.warn(String.valueOf(this.IlIlIlIlIlllllllllIl.s_()) + " moved wrongly!");
                    }
                    this.IlIlIlIlIlllllllllIl.a_(n7, n8, n9, n10, n11);
                    this.IlIlIlIlIlllllllllIl.llIllIlIIIIllIlIIllI(this.IlIlIlIlIlllllllllIl.IIlllIlIIllIlIlIlIIl - iIlllIlIIllIlIlIlIIl, this.IlIlIlIlIlllllllllIl.llIIIlIlIllIIlIlIlII - llIIIlIlIllIIlIlIlII, this.IlIlIlIlIlllllllllIl.lllllIlIIIlIlIIlllII - lllllIlIIIlIlIIlllII);
                    if (!this.IlIlIlIlIlllllllllIl.lIIIIlIlIllllIIlIllI) {
                        final boolean empty2 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, this.IlIlIlIlIlllllllllIl.IlIIlllIIlIlllllIIlI().IlIIIlIlIIIllIlIlIIl(n15, n15, n15)).isEmpty();
                        if (empty && (b || !empty2) && !this.IlIlIlIlIlllllllllIl.ah()) {
                            this.llllIIIIlIIIlIlllIll(this.llllIIllllIlIlIIIIll, this.IlIllIlIlIIIlIlIlIII, this.IIlllIIlIllIllIlIIll, n10, n11);
                            return;
                        }
                    }
                    final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = this.IlIlIlIlIlllllllllIl.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl(n15, n15, n15).llllIIIIlIIIlIlllIll(0.0, -0.55, 0.0);
                    if (!this.IlIIIlIlIIIllIlIlIIl.IllIIlllllIIllIIllIl() && !this.IlIlIlIlIlllllllllIl.K.llIllIIIIIllIlIIIIlI && !llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll2)) {
                        if (n17 >= -0.03125) {
                            ++this.llllIIIlIlllIlIIIIIl;
                            if (this.llllIIIlIlllIlIIIIIl > 80) {
                                net.minecraft.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI.warn(String.valueOf(this.IlIlIlIlIlllllllllIl.s_()) + " was kicked for floating too long!");
                                this.llllIIIIlIIIlIlllIll("Flying is not enabled on this server");
                                return;
                            }
                        }
                    }
                    else {
                        this.llllIIIlIlllIlIIIIIl = 0;
                    }
                    this.IlIlIlIlIlllllllllIl.IIIIIllIIIIlIIIIllIl = ilIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl();
                    this.IlIIIlIlIIIllIlIlIIl.IIlllIIlllIIIlIlllII().IlIIIlIlIIIllIlIlIIl(this.IlIlIlIlIlllllllllIl);
                    this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl.llIIIlIlIllIIlIlIlII - llIIIlIlIllIIlIlIlII3, ilIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl());
                }
                else if (this.IlIlIIIllIllIIIIIllI - this.IllIIlllIIIIlllIIlIl > 20) {
                    this.llllIIIIlIIIlIlllIll(this.llllIIllllIlIlIIIIll, this.IlIllIlIlIIIlIlIlIII, this.IIlllIIlIllIllIlIIll, this.IlIlIlIlIlllllllllIl.IIlIIIIIllIlIIIlIIll, this.IlIlIlIlIlllllllllIl.llllllIllIllIlIllllI);
                }
            }
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final double n, final double n2, final double n3, final float n4, final float n5) {
        this.llllIIIIlIIIlIlllIll(n, n2, n3, n4, n5, Collections.emptySet());
    }
    
    public void llllIIIIlIIIlIlllIll(final double llllIIllllIlIlIIIIll, final double ilIllIlIlIIIlIlIlIII, final double iIlllIIlIllIllIlIIll, final float n, final float n2, final Set set) {
        this.lllIIIIlllllIlIIllIl = false;
        this.llllIIllllIlIlIIIIll = llllIIllllIlIlIIIIll;
        this.IlIllIlIlIIIlIlIlIII = ilIllIlIlIIIlIlIlIII;
        this.IIlllIIlIllIllIlIIll = iIlllIIlIllIllIlIIll;
        if (set.contains(net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll)) {
            this.llllIIllllIlIlIIIIll += this.IlIlIlIlIlllllllllIl.IIlllIlIIllIlIlIlIIl;
        }
        if (set.contains(net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl)) {
            this.IlIllIlIlIIIlIlIlIII += this.IlIlIlIlIlllllllllIl.llIIIlIlIllIIlIlIlII;
        }
        if (set.contains(net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI)) {
            this.IIlllIIlIllIllIlIIll += this.IlIlIlIlIlllllllllIl.lllllIlIIIlIlIIlllII;
        }
        float n3 = n;
        float n4 = n2;
        if (set.contains(net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl)) {
            n3 = n + this.IlIlIlIlIlllllllllIl.IIlIIIIIllIlIIIlIIll;
        }
        if (set.contains(net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI)) {
            n4 = n2 + this.IlIlIlIlIlllllllllIl.llllllIllIllIlIllllI;
        }
        this.IlIlIlIlIlllllllllIl.a_(this.llllIIllllIlIlIIIIll, this.IlIllIlIlIIIlIlIlIII, this.IIlllIIlIllIllIlIIll, n3, n4);
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII(llllIIllllIlIlIIIIll, ilIllIlIlIIIlIlIlIII, iIlllIIlIllIllIlIIll, n, n2, set));
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII, this, this.IlIlIlIlIlllllllllIl.IlllllllIIIlIIIlIlII());
        final net.minecraft.IIIlIIlIIIIlllIlllII.IIIllllllIllIIIlllIl llllIIIIlIIIlIlllIll = this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl.lllllIIIIIlIIlllIlIl);
        final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2 = liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll();
        this.IlIlIlIlIlllllllllIl.llIIlllIIlllIIllIllI();
        switch (llIllIIIIIllIlIIIIlI()[liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI().ordinal()]) {
            case 5: {
                if (!this.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl()) {
                    this.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(false);
                }
            }
            case 4: {
                if (!this.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl()) {
                    this.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(true);
                }
            }
            case 6: {
                this.IlIlIlIlIlllllllllIl.i();
            }
            case 1:
            case 2:
            case 3: {
                final double n = this.IlIlIlIlIlllllllllIl.IIlllIlIIllIlIlIlIIl - (llllIIIIlIIIlIlllIll2.lIIIIlIIIIIlllIllIII() + 0.5);
                final double n2 = this.IlIlIlIlIlllllllllIl.llIIIlIlIllIIlIlIlII - (llllIIIIlIIIlIlllIll2.lIIIlllIIIllIIIllIII() + 0.5) + 1.5;
                final double n3 = this.IlIlIlIlIlllllllllIl.lllllIlIIIlIlIIlllII - (llllIIIIlIIIlIlllIll2.llIIlIIIlIIIllIlIIIl() + 0.5);
                if (n * n + n2 * n2 + n3 * n3 > 36.0) {
                    return;
                }
                if (llllIIIIlIIIlIlllIll2.lIIIlllIIIllIIIllIII() >= this.IlIIIlIlIIIllIlIlIIl.llIIIllIlIllIllIIIIl()) {
                    return;
                }
                if (liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI() == net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll) {
                    if (!this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2, this.IlIlIlIlIlllllllllIl) && llllIIIIlIIIlIlllIll.IllIllIlllIllllIIllI().llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2)) {
                        this.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl());
                    }
                    else {
                        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new IlllIIIIlIIIlIlIlIIl(llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2));
                    }
                }
                else {
                    if (liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI() == net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI) {
                        this.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2);
                    }
                    else if (liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI() == net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl) {
                        this.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI();
                    }
                    if (llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
                        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new IlllIIIIlIIIlIlIlIIl(llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2));
                    }
                }
            }
            default: {
                throw new IllegalArgumentException("Invalid player action");
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(llIllIlIIIIllIlIIllI, this, this.IlIlIlIlIlllllllllIl.IlllllllIIIlIIIlIlII());
        final net.minecraft.IIIlIIlIIIIlllIlllII.IIIllllllIllIIIlllIl llllIIIIlIIIlIlllIll = this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl.lllllIIIIIlIIlllIlIl);
        final lllIIIIlIlIllIIlIIIl ilIIIlIlIIIllIlIlIIl = this.IlIlIlIlIlllllllllIl.lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl();
        boolean b = false;
        final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2 = llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll();
        final lllIllIIIllllllIllll llllIIIIlIIIlIlllIll3 = lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl());
        this.IlIlIlIlIlllllllllIl.llIIlllIIlllIIllIllI();
        if (llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl() == 255) {
            if (ilIIIlIlIIIllIlIlIIl == null) {
                return;
            }
            this.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll, ilIIIlIlIIIllIlIlIIl);
        }
        else if (llllIIIIlIIIlIlllIll2.lIIIlllIIIllIIIllIII() < this.IlIIIlIlIIIllIlIlIIl.llIIIllIlIllIllIIIIl() - 1 || (llllIIIIlIIIlIlllIll3 != lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl && llllIIIIlIIIlIlllIll2.lIIIlllIIIllIIIllIII() < this.IlIIIlIlIIIllIlIlIIl.llIIIllIlIllIllIIIIl())) {
            if (this.lllIIIIlllllIlIIllIl && this.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI(llllIIIIlIIIlIlllIll2.lIIIIlIIIIIlllIllIII() + 0.5, llllIIIIlIIIlIlllIll2.lIIIlllIIIllIIIllIII() + 0.5, llllIIIIlIIIlIlllIll2.llIIlIIIlIIIllIlIIIl() + 0.5) < 64.0 && !this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2, this.IlIlIlIlIlllllllllIl) && llllIIIIlIIIlIlllIll.IllIllIlllIllllIIllI().llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2)) {
                this.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll, ilIIIlIlIIIllIlIlIIl, llllIIIIlIIIlIlllIll2, llllIIIIlIIIlIlllIll3, llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl(), llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI(), llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl());
            }
            b = true;
        }
        else {
            final IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI = new IIllIIllIIIlIlIIIIlI("build.tooHigh", new Object[] { this.IlIIIlIlIIIllIlIlIIl.llIIIllIlIllIllIIIIl() });
            illIIllIIIlIlIIIIlI.llllIIIlIlllIlIIIIIl().llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlllIIIIlIIIlIlIlIIl.IlIlIIIllIIllIlllllI);
            this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(illIIllIIIlIlIIIIlI));
            b = true;
        }
        if (b) {
            this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new IlllIIIIlIIIlIlIlIIl(llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2));
            this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new IlllIIIIlIIIlIlIlIIl(llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3)));
        }
        lllIIIIlIlIllIIlIIIl ilIIIlIlIIIllIlIlIIl2 = this.IlIlIlIlIlllllllllIl.lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl();
        if (ilIIIlIlIIIllIlIlIIl2 != null && ilIIIlIlIIIllIlIlIIl2.IlIlIlIlIlllllllllIl == 0) {
            this.IlIlIlIlIlllllllllIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll[this.IlIlIlIlIlllllllllIl.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI] = null;
            ilIIIlIlIIIllIlIlIIl2 = null;
        }
        if (ilIIIlIlIIIllIlIlIIl2 == null || ilIIIlIlIIIllIlIlIIl2.lIlIlIIIllIIllIIIllI() == 0) {
            this.IlIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl = true;
            this.IlIlIlIlIlllllllllIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll[this.IlIlIlIlIlllllllllIl.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI] = lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl(this.IlIlIlIlIlllllllllIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll[this.IlIlIlIlIlllllllllIl.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI]);
            final IIIIIllIIIIlIIIIllIl llllIIIIlIIIlIlllIll4 = this.IlIlIlIlIlllllllllIl.t.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl.lIlIlIIIllIIllIIIllI, this.IlIlIlIlIlllllllllIl.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI);
            this.IlIlIlIlIlllllllllIl.t.llIllIIIIIllIlIIIIlI();
            this.IlIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl = false;
            if (!lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl(this.IlIlIlIlIlllllllllIl.lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl(), llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI())) {
                this.llllIIIIlIIIlIlllIll(new lIlIlIlllIIlIlIlllIl(this.IlIlIlIlIlllllllllIl.t.IlIIIlIlIIIllIlIlIIl, llllIIIIlIIIlIlllIll4.llIllIIIIIllIlIIIIlI, this.IlIlIlIlIlllllllllIl.lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl()));
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lllllIlIIIlIlIIlllII lllllIlIIIlIlIIlllII) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(lllllIlIIIlIlIIlllII, this, this.IlIlIlIlIlllllllllIl.IlllllllIIIlIIIlIlII());
        if (this.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl()) {
            llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll = null;
            net.minecraft.IIIlIIlIIIIlllIlllII.IIIllllllIllIIIlllIl[] ilIIIlIlIIIllIlIlIIl;
            for (int length = (ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl).length, i = 0; i < length; ++i) {
                final net.minecraft.IIIlIIlIIIIlllIlllII.IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl = ilIIIlIlIIIllIlIlIIl[i];
                if (iiIllllllIllIIIlllIl != null) {
                    llllIIIIlIIIlIlllIll = lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(iiIllllllIllIIIlllIl);
                    if (llllIIIIlIIIlIlllIll != null) {
                        break;
                    }
                }
            }
            if (llllIIIIlIIIlIlllIll != null) {
                this.IlIlIlIlIlllllllllIl.IIIlIIIlIlIIlllIIlll(this.IlIlIlIlIlllllllllIl);
                this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll((llIllIIIIIllIlIIIIlI)null);
                if (llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII != this.IlIlIlIlIlllllllllIl.IlllllllIIIlIIIlIlII) {
                    final net.minecraft.IIIlIIlIIIIlllIlllII.IIIllllllIllIIIlllIl illlllllIIIlIIIlIlII = this.IlIlIlIlIlllllllllIl.IlllllllIIIlIIIlIlII();
                    final net.minecraft.IIIlIIlIIIIlllIlllII.IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl2 = (net.minecraft.IIIlIIlIIIIlllIlllII.IIIllllllIllIIIlllIl)llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII;
                    this.IlIlIlIlIlllllllllIl.lllllIIIIIlIIlllIlIl = llllIIIIlIIIlIlllIll.lllllIIIIIlIIlllIlIl;
                    this.llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII(this.IlIlIlIlIlllllllllIl.lllllIIIIIlIIlllIlIl, illlllllIIIlIIIlIlII.lllIllIIIllllllIllll(), illlllllIIIlIIIlIlII.lIllllllIIllIlIlIlII().IIllIIllIIIlIlIIIIlI(), this.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll()));
                    illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl(this.IlIlIlIlIlllllllllIl);
                    this.IlIlIlIlIlllllllllIl.IIlIlIlIIlIllIIIIIIl = false;
                    this.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl, llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII, llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII, llllIIIIlIIIlIlllIll.IIlIIIIIllIlIIIlIIll, llllIIIIlIIIlIlllIll.llllllIllIllIlIllllI);
                    if (this.IlIlIlIlIlllllllllIl.llllIllllIllllIlIlII()) {
                        illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, false);
                        iiIllllllIllIIIlllIl2.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl);
                        iiIllllllIllIIIlllIl2.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, false);
                    }
                    this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(iiIllllllIllIIIlllIl2);
                    this.IlIIIlIlIIIllIlIlIIl.IIlllIIlllIIIlIlllII().llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, illlllllIIIlIIIlIlII);
                    this.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl(llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl, llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII, llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII);
                    this.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(iiIllllllIllIIIlllIl2);
                    this.IlIIIlIlIIIllIlIlIIl.IIlllIIlllIIIlIlllII().IlIlIlIlIlllllllllIl(this.IlIlIlIlIlllllllllIl, iiIllllllIllIIIlllIl2);
                    this.IlIIIlIlIIIllIlIlIIl.IIlllIIlllIIIlIlllII().IllIIlllIIIIlllIIlIl(this.IlIlIlIlIlllllllllIl);
                }
                else {
                    this.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl(llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl, llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII, llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII);
                }
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII) {
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llIIIIIIlIllIIlIIIll llIIIIIIlIllIIlIIIll) {
        net.minecraft.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI.info(String.valueOf(this.IlIlIlIlIlllllllllIl.s_()) + " lost connection: " + llIIIIIIlIllIIlIIIll);
        this.IlIIIlIlIIIllIlIlIIl.IIIllIIllIIIIIIlIIlI();
        final IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI = new IIllIIllIIIlIlIIIIlI("multiplayer.player.left", new Object[] { this.IlIlIlIlIlllllllllIl.v_() });
        illIIllIIIlIlIIIIlI.llllIIIlIlllIlIIIIIl().llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlllIIIIlIIIlIlIlIIl.llllIIllllIlIlIIIIll);
        this.IlIIIlIlIIIllIlIlIIl.IIlllIIlllIIIlIlllII().llllIIIIlIIIlIlllIll(illIIllIIIlIlIIIIlI);
        this.IlIlIlIlIlllllllllIl.lllIIIIlllllIlIIllIl();
        this.IlIIIlIlIIIllIlIlIIl.IIlllIIlllIIIlIlllII().IlIlIIIllIllIIIIIllI(this.IlIlIlIlIlllllllllIl);
        if (this.IlIIIlIlIIIllIlIlIIl.llIllIlIlIIIIIIIllII() && this.IlIlIlIlIlllllllllIl.s_().equals(this.IlIIIlIlIIIllIlIlIIl.lllIllIIIllllllIllll())) {
            net.minecraft.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI.info("Stopping singleplayer server as player logged out");
            this.IlIIIlIlIIIllIlIlIIl.IIIlIIIlIlIIlllIIlll();
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll) {
        if (ilIIIIIllIlIIIlIIll instanceof net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI) {
            final net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI = (net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI)ilIIIIIllIlIIIlIIll;
            final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl lIllllllIIllIlIlIlII = this.IlIlIlIlIlllllllllIl.lIllllllIIllIlIlIlII();
            if (lIllllllIIllIlIlIlII == net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI) {
                return;
            }
            if (lIllllllIIllIlIlIlII == net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl && !llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()) {
                return;
            }
        }
        try {
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIIIIIllIlIIIlIIll);
        }
        catch (Throwable t) {
            final net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(t, "Sending packet");
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll("Packet being sent").llllIIIIlIIIlIlllIll("Packet class", new net.minecraft.IlIlIIIllIIllIlllllI.llIllIlIIIIllIlIIllI(this, ilIIIIIllIlIIIlIIll));
            throw new IIlIlllIlIlllIlIllll(llllIIIIlIIIlIlllIll);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, this, this.IlIlIlIlIlllllllllIl.IlllllllIIIlIIIlIlII());
        if (lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll() >= 0 && lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll() < net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl()) {
            this.IlIlIlIlIlllllllllIl.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI = lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll();
            this.IlIlIlIlIlllllllllIl.llIIlllIIlllIIllIllI();
        }
        else {
            net.minecraft.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI.warn(String.valueOf(this.IlIlIlIlIlllllllllIl.s_()) + " tried to set an invalid carried item");
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, this, this.IlIlIlIlIlllllllllIl.IlllllllIIIlIIIlIlII());
        if (this.IlIlIlIlIlllllllllIl.lIllllllIIllIlIlIlII() == net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI) {
            final IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI = new IIllIIllIIIlIlIIIIlI("chat.cannotSend", new Object[0]);
            illIIllIIIlIlIIIIlI.llllIIIlIlllIlIIIIIl().llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlllIIIIlIIIlIlIlIIl.IlIlIIIllIIllIlllllI);
            this.llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(illIIllIIIlIlIIIIlI));
        }
        else {
            this.IlIlIlIlIlllllllllIl.llIIlllIIlllIIllIllI();
            final String normalizeSpace = StringUtils.normalizeSpace(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll());
            for (int i = 0; i < normalizeSpace.length(); ++i) {
                if (!net.minecraft.IlllllllIIIlIIIlIlII.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(normalizeSpace.charAt(i))) {
                    this.llllIIIIlIIIlIlllIll("Illegal characters in chat");
                    return;
                }
            }
            if (normalizeSpace.startsWith("/")) {
                this.IlIlIlIlIlllllllllIl(normalizeSpace);
            }
            else {
                this.IlIIIlIlIIIllIlIlIIl.IIlllIIlllIIIlIlllII().llllIIIIlIIIlIlllIll(new IIllIIllIIIlIlIIIIlI("chat.type.text", new Object[] { this.IlIlIlIlIlllllllllIl.v_(), normalizeSpace }), false);
            }
            this.lIlIlIIIllIIllIIIllI += 20;
            if (this.lIlIlIIIllIIllIIIllI > 200 && !this.IlIIIlIlIIIllIlIlIIl.IIlllIIlllIIIlIlllII().IlIlIIIllIllIIIIIllI(this.IlIlIlIlIlllllllllIl.r())) {
                this.llllIIIIlIIIlIlllIll("disconnect.spam");
            }
        }
    }
    
    private void IlIlIlIlIlllllllllIl(final String s) {
        this.IlIIIlIlIIIllIlIlIIl.IIllllIIIlIIIIIIllIl().llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, s);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI, this, this.IlIlIlIlIlllllllllIl.IlllllllIIIlIIIlIlII());
        this.IlIlIlIlIlllllllllIl.llIIlllIIlllIIllIllI();
        this.IlIlIlIlIlllllllllIl.IIlIIIIlllIlllllIlII();
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll, this, this.IlIlIlIlIlllllllllIl.IlllllllIIIlIIIlIlII());
        this.IlIlIlIlIlllllllllIl.llIIlllIIlllIIllIllI();
        switch (IlIIIlIlIIIllIlIlIIl()[iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll().ordinal()]) {
            case 1: {
                this.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI(true);
                break;
            }
            case 2: {
                this.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI(false);
                break;
            }
            case 4: {
                this.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(true);
                break;
            }
            case 5: {
                this.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(false);
                break;
            }
            case 3: {
                this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(false, true, true);
                this.lllIIIIlllllIlIIllIl = false;
                break;
            }
            case 6: {
                if (this.IlIlIlIlIlllllllllIl.IIIlIIIlIlIIlllIIlll instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl) {
                    ((net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl)this.IlIlIlIlIlllllllllIl.IIIlIIIlIlIIlllIIlll).IlIlIIIlIIlIlIIlllIl(iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl());
                    break;
                }
                break;
            }
            case 7: {
                if (this.IlIlIlIlIlllllllllIl.IIIlIIIlIlIIlllIIlll instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl) {
                    ((net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl)this.IlIlIlIlIlllllllllIl.IIIlIIIlIlIIlllIIlll).llllIIIlIlllIlIIIIIl(this.IlIlIlIlIlllllllllIl);
                    break;
                }
                break;
            }
            default: {
                throw new IllegalArgumentException("Invalid client command!");
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, this, this.IlIlIlIlIlllllllllIl.IlllllllIIIlIIIlIlII());
        final llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll = llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl.lllllIIIIIlIIlllIlIl));
        this.IlIlIlIlIlllllllllIl.llIIlllIIlllIIllIllI();
        if (llllIIIIlIIIlIlllIll != null) {
            final boolean iIlllIIlIllIllIlIIll = this.IlIlIlIlIlllllllllIl.IIlllIIlIllIllIlIIll(llllIIIIlIIIlIlllIll);
            double n = 36.0;
            if (!iIlllIIlIllIllIlIIll) {
                n = 9.0;
            }
            if (this.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI(llllIIIIlIIIlIlllIll) < n) {
                if (llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll() == net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll) {
                    this.IlIlIlIlIlllllllllIl.lllIIIIlllllIlIIllIl(llllIIIIlIIIlIlllIll);
                }
                else if (llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll() == net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI) {
                    llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl());
                }
                else if (llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll() == net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl) {
                    if (llllIIIIlIIIlIlllIll instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.lIIIlllIIIllIIIllIII || llllIIIIlIIIlIlllIll instanceof IlIlIIIlIIlIlIIlllIl || llllIIIIlIIIlIlllIll instanceof net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll || llllIIIIlIIIlIlllIll == this.IlIlIlIlIlllllllllIl) {
                        this.llllIIIIlIIIlIlllIll("Attempting to attack an invalid entity");
                        this.IlIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl("Player " + this.IlIlIlIlIlllllllllIl.s_() + " tried to attack an invalid entity");
                        return;
                    }
                    this.IlIlIlIlIlllllllllIl.IlIlIIIIIIlllIlIllIl(llllIIIIlIIIlIlllIll);
                }
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIllllllllIIIIlII ilIlIllllllllIIIIlII) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(ilIlIllllllllIIIIlII, this, this.IlIlIlIlIlllllllllIl.IlllllllIIIlIIIlIlII());
        this.IlIlIlIlIlllllllllIl.llIIlllIIlllIIllIllI();
        switch (IlIlIIIllIllIIIIIllI()[ilIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll().ordinal()]) {
            case 1: {
                if (this.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII) {
                    this.IlIlIlIlIlllllllllIl = this.IlIIIlIlIIIllIlIlIIl.IIlllIIlllIIIlIlllII().llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, 0, true);
                    break;
                }
                if (this.IlIlIlIlIlllllllllIl.IlllllllIIIlIIIlIlII().lIllllllIIllIlIlIlII().IlIlIIIIIIlllIlIllIl()) {
                    if (this.IlIIIlIlIIIllIlIlIIl.llIllIlIlIIIIIIIllII() && this.IlIlIlIlIlllllllllIl.s_().equals(this.IlIIIlIlIIIllIlIlIIl.lllIllIIIllllllIllll())) {
                        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll("You have died. Game over, man, it's game over!");
                        this.IlIIIlIlIIIllIlIlIIl.IlIIlIlIIIlIIlIlIlII();
                        break;
                    }
                    this.IlIIIlIlIIIllIlIlIIl.IIlllIIlllIIIlIlllII().lIIIIlIIIIIlllIllIII().llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl.IlIlIIIlIIlIlIIlllIl(this.IlIlIlIlIlllllllllIl.r(), null, "(You just lost the game)", null, "Death in Hardcore"));
                    this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll("You have died. Game over, man, it's game over!");
                    break;
                }
                else {
                    if (this.IlIlIlIlIlllllllllIl.N() > 0.0f) {
                        return;
                    }
                    this.IlIlIlIlIlllllllllIl = this.IlIIIlIlIIIllIlIlIIl.IIlllIIlllIIIlIlllII().llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, 0, false);
                    break;
                }
                break;
            }
            case 2: {
                this.IlIlIlIlIlllllllllIl.IIlllIIIlIlllIIlllII().llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl);
                break;
            }
            case 3: {
                this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl);
                break;
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.IIlllIIlIllIllIlIIll illlIIlIllIllIlIIll) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(illlIIlIllIllIlIIll, this, this.IlIlIlIlIlllllllllIl.IlllllllIIIlIIIlIlII());
        this.IlIlIlIlIlllllllllIl.IIlllIIlIllIllIlIIll();
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl, this, this.IlIlIlIlIlllllllllIl.IlllllllIIIlIIIlIlII());
        this.IlIlIlIlIlllllllllIl.llIIlllIIlllIIllIllI();
        if (this.IlIlIlIlIlllllllllIl.t.IlIIIlIlIIIllIlIlIIl == lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll() && this.IlIlIlIlIlllllllllIl.t.llIllIIIIIllIlIIIIlI(this.IlIlIlIlIlllllllllIl)) {
            if (this.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl()) {
                final ArrayList arrayList = Lists.newArrayList();
                for (int i = 0; i < this.IlIlIlIlIlllllllllIl.t.llIllIIIIIllIlIIIIlI.size(); ++i) {
                    arrayList.add(((IIIIIllIIIIlIIIIllIl)this.IlIlIlIlIlllllllllIl.t.llIllIIIIIllIlIIIIlI.get(i)).llllIIIIlIIIlIlllIll());
                }
                this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl.t, arrayList);
            }
            else if (lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl(lllIIIIlllllIlIIllIl.IlIlIIIllIllIIIIIllI(), this.IlIlIlIlIlllllllllIl.t.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl(), lllIIIIlllllIlIIllIl.llIllIIIIIllIlIIIIlI(), lllIIIIlllllIlIIllIl.IllIIlllIIIIlllIIlIl(), this.IlIlIlIlIlllllllllIl))) {
                this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new llIIIlIlllIllIIlIllI(lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(), lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl(), true));
                this.IlIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl = true;
                this.IlIlIlIlIlllllllllIl.t.llIllIIIIIllIlIIIIlI();
                this.IlIlIlIlIlllllllllIl.IlIllIlIlIIIlIlIlIII();
                this.IlIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl = false;
            }
            else {
                this.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl.t.IlIIIlIlIIIllIlIlIIl, (Object)lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl());
                this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new llIIIlIlllIllIIlIllI(lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(), lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl(), false));
                this.IlIlIlIlIlllllllllIl.t.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, false);
                final ArrayList arrayList2 = Lists.newArrayList();
                for (int j = 0; j < this.IlIlIlIlIlllllllllIl.t.llIllIIIIIllIlIIIIlI.size(); ++j) {
                    arrayList2.add(((IIIIIllIIIIlIIIIllIl)this.IlIlIlIlIlllllllllIl.t.llIllIIIIIllIlIIIIlI.get(j)).llllIIIIlIIIlIlllIll());
                }
                this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl.t, arrayList2);
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IIIlIIIlIlIIlllIIlll iiIlIIIlIlIIlllIIlll) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(iiIlIIIlIlIIlllIIlll, this, this.IlIlIlIlIlllllllllIl.IlllllllIIIlIIIlIlII());
        this.IlIlIlIlIlllllllllIl.llIIlllIIlllIIllIllI();
        if (this.IlIlIlIlIlllllllllIl.t.IlIIIlIlIIIllIlIlIIl == iiIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll() && this.IlIlIlIlIlllllllllIl.t.llIllIIIIIllIlIIIIlI(this.IlIlIlIlIlllllllllIl) && !this.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl()) {
            this.IlIlIlIlIlllllllllIl.t.IlIlIlIlIlllllllllIl(this.IlIlIlIlIlllllllllIl, iiIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl());
            this.IlIlIlIlIlllllllllIl.t.llIllIIIIIllIlIIIIlI();
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(illIIllIIIlIlIIIIlI, this, this.IlIlIlIlIlllllllllIl.IlllllllIIIlIIIlIlII());
        if (this.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI()) {
            final boolean b = illIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll() < 0;
            final lllIIIIlIlIllIIlIIIl ilIlIlIlIlllllllllIl = illIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl();
            if (ilIlIlIlIlllllllllIl != null && ilIlIlIlIlllllllllIl.IIIIlllIIIIIIlIIIlll() && ilIlIlIlIlllllllllIl.llllIIllllIlIlIIIIll().IlIlIlIlIlllllllllIl("BlockEntityTag", 10)) {
                final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll ilIlIIIllIIllIlllllI = ilIlIlIlIlllllllllIl.llllIIllllIlIlIIIIll().IlIlIIIllIIllIlllllI("BlockEntityTag");
                if (ilIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI("x") && ilIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI("y") && ilIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI("z")) {
                    final net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = this.IlIlIlIlIlllllllllIl.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl("x"), ilIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl("y"), ilIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl("z")));
                    if (llllIIIIlIIIlIlllIll != null) {
                        final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = new net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll();
                        llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
                        iiiIlllIIIIIIlIIIlll.llllIIllllIlIlIIIIll("x");
                        iiiIlllIIIIIIlIIIlll.llllIIllllIlIlIIIIll("y");
                        iiiIlllIIIIIIlIIIlll.llllIIllllIlIlIIIIll("z");
                        ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("BlockEntityTag", iiiIlllIIIIIIlIIIlll);
                    }
                }
            }
            final boolean b2 = illIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll() >= 1 && illIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll() < 36 + net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl();
            final boolean b3 = ilIlIlIlIlllllllllIl == null || ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll() != null;
            final boolean b4 = ilIlIlIlIlllllllllIl == null || (ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() >= 0 && ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl <= 64 && ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl > 0);
            if (b2 && b3 && b4) {
                if (ilIlIlIlIlllllllllIl == null) {
                    this.IlIlIlIlIlllllllllIl.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(illIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(), (lllIIIIlIlIllIIlIIIl)null);
                }
                else {
                    this.IlIlIlIlIlllllllllIl.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(illIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(), ilIlIlIlIlllllllllIl);
                }
                this.IlIlIlIlIlllllllllIl.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, true);
            }
            else if (b && b3 && b4 && this.IlIlIIIllIIllIlllllI < 200) {
                this.IlIlIIIllIIllIlllllI += 20;
                final net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.lIIIlllIIIllIIIllIII llllIIIIlIIIlIlllIll2 = this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, true);
                if (llllIIIIlIIIlIlllIll2 != null) {
                    llllIIIIlIIIlIlllIll2.llllIIIlIlllIlIIIIIl();
                }
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(ilIlIIIIIIlllIlIllIl, this, this.IlIlIlIlIlllllllllIl.IlllllllIIIlIIIlIlII());
        final Short n = (Short)this.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl.t.IlIIIlIlIIIllIlIlIIl);
        if (n != null && ilIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl() == n && this.IlIlIlIlIlllllllllIl.t.IlIIIlIlIIIllIlIlIIl == ilIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll() && !this.IlIlIlIlIlllllllllIl.t.llIllIIIIIllIlIIIIlI(this.IlIlIlIlIlllllllllIl) && !this.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl()) {
            this.IlIlIlIlIlllllllllIl.t.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, true);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(ilIlIIIlIIlIlIIlllIl, this, this.IlIlIlIlIlllllllllIl.IlllllllIIIlIIIlIlII());
        this.IlIlIlIlIlllllllllIl.llIIlllIIlllIIllIllI();
        final net.minecraft.IIIlIIlIIIIlllIlllII.IIIllllllIllIIIlllIl llllIIIIlIIIlIlllIll = this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl.lllllIIIIIlIIlllIlIl);
        final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2 = ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll();
        if (llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl(llllIIIIlIIIlIlllIll2)) {
            final net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll3 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2);
            if (!(llllIIIIlIIIlIlllIll3 instanceof llIIlllIIlllIIllIllI)) {
                return;
            }
            final llIIlllIIlllIIllIllI llIIlllIIlllIIllIllI = (llIIlllIIlllIIllIllI)llllIIIIlIIIlIlllIll3;
            if (!llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll() || llIIlllIIlllIIllIllI.IlIlIlIlIlllllllllIl() != this.IlIlIlIlIlllllllllIl) {
                this.IlIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl("Player " + this.IlIlIlIlIlllllllllIl.s_() + " just tried to change non-editable sign");
                return;
            }
            final llIIIIIIlIllIIlIIIll[] ilIlIlIlIlllllllllIl = ilIlIIIlIIlIlIIlllIl.IlIlIlIlIlllllllllIl();
            for (int i = 0; i < ilIlIlIlIlllllllllIl.length; ++i) {
                llIIlllIIlllIIllIllI.IlIlIIIllIllIIIIIllI[i] = new IlIlIIIIIIlllIlIllIl(net.minecraft.IlllllllIIIlIIIlIlII.IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl[i].lIIIIlIIIIIlllIllIII()));
            }
            llIIlllIIlllIIllIllI.llIIIlIlIllIIlIlIlII();
            llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII(llllIIIIlIIIlIlllIll2);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll() == this.lIIIlllIIIllIIIllIII) {
            this.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII = (this.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII * 3 + (int)(this.IllIIlllIIIIlllIIlIl() - this.llIIlIIIlIIIllIlIIIl)) / 4;
        }
    }
    
    private long IllIIlllIIIIlllIIlIl() {
        return System.nanoTime() / 1000000L;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, this, this.IlIlIlIlIlllllllllIl.IlllllllIIIlIIIlIlII());
        this.IlIlIlIlIlllllllllIl.K.IlIlIlIlIlllllllllIl = (illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl() && this.IlIlIlIlIlllllllllIl.K.llIllIIIIIllIlIIIIlI);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IIlIIIIlllIlllllIlII ilIIIIlllIlllllIlII) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(ilIIIIlllIlllllIlII, this, this.IlIlIlIlIlllllllllIl.IlllllllIIIlIIIlIlII());
        final ArrayList arrayList = Lists.newArrayList();
        final Iterator<String> iterator = this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, ilIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll(), ilIIIIlllIlllllIlII.IlIlIlIlIlllllllllIl()).iterator();
        while (iterator.hasNext()) {
            arrayList.add(iterator.next());
        }
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new lllllIIlIlIIIlIlIIIl(arrayList.toArray(new String[arrayList.size()])));
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IIIlIIlIIIIlllIlllII iiIlIIlIIIIlllIlllII) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(iiIlIIlIIIIlllIlllII, this, this.IlIlIlIlIlllllllllIl.IlllllllIIIlIIIlIlII());
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(iiIlIIlIIIIlllIlllII);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII llIIIlIlIllIIlIlIlII) {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(llIIIlIlIllIIlIlIlII, this, this.IlIlIlIlIlllllllllIl.IlllllllIIIlIIIlIlII());
        if ("MC|BEdit".equals(llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll())) {
            final llllllIllIllIlIllllI llllllIllIllIlIllllI = new llllllIllIllIlIllllI(Unpooled.wrappedBuffer(llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl()));
            try {
                final lllIIIIlIlIllIIlIIIl liiiIlIIIIIlllIllIII = llllllIllIllIlIllllI.lIIIIlIIIIIlllIllIII();
                if (liiiIlIIIIIlllIllIII != null) {
                    if (!IlIllIIllIIlIIIIlIIl.IlIlIlIlIlllllllllIl(liiiIlIIIIIlllIllIII.llllIIllllIlIlIIIIll())) {
                        throw new IOException("Invalid book tag!");
                    }
                    final lllIIIIlIlIllIIlIIIl ilIIIlIlIIIllIlIlIIl = this.IlIlIlIlIlllllllllIl.lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl();
                    if (ilIIIlIlIIIllIlIlIIl == null) {
                        return;
                    }
                    if (liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.Q && liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll() == ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll()) {
                        ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll("pages", liiiIlIIIIIlllIllIII.llllIIllllIlIlIIIIll().llIllIIIIIllIlIIIIlI("pages", 8));
                    }
                    return;
                }
            }
            catch (Exception ex) {
                net.minecraft.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI.error("Couldn't handle book info", (Throwable)ex);
                return;
            }
            finally {
                llllllIllIllIlIllllI.release();
            }
            llllllIllIllIlIllllI.release();
            return;
        }
        if ("MC|BSign".equals(llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll())) {
            final llllllIllIllIlIllllI llllllIllIllIlIllllI2 = new llllllIllIllIlIllllI(Unpooled.wrappedBuffer(llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl()));
            try {
                final lllIIIIlIlIllIIlIIIl liiiIlIIIIIlllIllIII2 = llllllIllIllIlIllllI2.lIIIIlIIIIIlllIllIII();
                if (liiiIlIIIIIlllIllIII2 != null) {
                    if (!IlIllllIIlIIlIlIlIll.IlIlIlIlIlllllllllIl(liiiIlIIIIIlllIllIII2.llllIIllllIlIlIIIIll())) {
                        throw new IOException("Invalid book tag!");
                    }
                    final lllIIIIlIlIllIIlIIIl ilIIIlIlIIIllIlIlIIl2 = this.IlIlIlIlIlllllllllIl.lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl();
                    if (ilIIIlIlIIIllIlIlIIl2 == null) {
                        return;
                    }
                    if (liiiIlIIIIIlllIllIII2.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.R && ilIIIlIlIIIllIlIlIIl2.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.Q) {
                        ilIIIlIlIIIllIlIlIIl2.llllIIIIlIIIlIlllIll("author", new net.minecraft.lIlIlIIIllIIllIIIllI.IIIlIIlIIIIlllIlllII(this.IlIlIlIlIlllllllllIl.s_()));
                        ilIIIlIlIIIllIlIlIIl2.llllIIIIlIIIlIlllIll("title", new net.minecraft.lIlIlIIIllIIllIIIllI.IIIlIIlIIIIlllIlllII(liiiIlIIIIIlllIllIII2.llllIIllllIlIlIIIIll().llIIlIIIlIIIllIlIIIl("title")));
                        ilIIIlIlIIIllIlIlIIl2.llllIIIIlIIIlIlllIll("pages", liiiIlIIIIIlllIllIII2.llllIIllllIlIlIIIIll().llIllIIIIIllIlIIIIlI("pages", 8));
                        ilIIIlIlIIIllIlIlIIl2.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.R);
                    }
                    return;
                }
            }
            catch (Exception ex2) {
                net.minecraft.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI.error("Couldn't sign book", (Throwable)ex2);
                return;
            }
            finally {
                llllllIllIllIlIllllI2.release();
            }
            llllllIllIllIlIllllI2.release();
            return;
        }
        if ("MC|TrSel".equals(llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll())) {
            try {
                final int int1 = llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl().readInt();
                final net.minecraft.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl t = this.IlIlIlIlIlllllllllIl.t;
                if (t instanceof net.minecraft.llIIlIIIlIIIllIlIIIl.IlIlIIIIIIlllIlIllIl) {
                    ((net.minecraft.llIIlIIIlIIIllIlIIIl.IlIlIIIIIIlllIlIllIl)t).IlIIIlIlIIIllIlIlIIl(int1);
                }
            }
            catch (Exception ex3) {
                net.minecraft.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI.error("Couldn't select trade", (Throwable)ex3);
            }
        }
        else if ("MC|AdvCdm".equals(llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll())) {
            if (!this.IlIIIlIlIIIllIlIlIIl.lIllIIIIIlllIIlIIllI()) {
                this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(new IIllIIllIIIlIlIIIIlI("advMode.notEnabled", new Object[0]));
            }
            else if (this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(2, "") && this.IlIlIlIlIlllllllllIl.K.IlIIIlIlIIIllIlIlIIl) {
                final llllllIllIllIlIllllI ilIlIlIlIlllllllllIl = llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl();
                try {
                    final byte byte1 = ilIlIlIlIlllllllllIl.readByte();
                    net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI = null;
                    if (byte1 == 0) {
                        final net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = this.IlIlIlIlIlllllllllIl.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.readInt(), ilIlIlIlIlllllllllIl.readInt(), ilIlIlIlIlllllllllIl.readInt()));
                        if (llllIIIIlIIIlIlllIll instanceof net.minecraft.IlIlIIIlIIlIlIIlllIl.IIIIlllIIIIIIlIIIlll) {
                            ilIlIIIllIllIIIIIllI = ((net.minecraft.IlIlIIIlIIlIlIIlllIl.IIIIlllIIIIIIlIIIlll)llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll();
                        }
                    }
                    else if (byte1 == 1) {
                        final llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll2 = this.IlIlIlIlIlllllllllIl.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.readInt());
                        if (llllIIIIlIIIlIlllIll2 instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IIllIIllIIIlIlIIIIlI) {
                            ilIlIIIllIllIIIIIllI = ((net.minecraft.llllIIIlIlllIlIIIIIl.IIllIIllIIIlIlIIIIlI)llllIIIIlIIIlIlllIll2).lIIIlllIIIllIIIllIII();
                        }
                    }
                    final String llIllIIIIIllIlIIIIlI = ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl.readableBytes());
                    final boolean boolean1 = ilIlIlIlIlllllllllIl.readBoolean();
                    if (ilIlIIIllIllIIIIIllI != null) {
                        ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI);
                        ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(boolean1);
                        if (!boolean1) {
                            ilIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl((llIIIIIIlIllIIlIIIll)null);
                        }
                        ilIlIIIllIllIIIIIllI.llIIlIIIlIIIllIlIIIl();
                        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(new IIllIIllIIIlIlIIIIlI("advMode.setCommand.success", new Object[] { llIllIIIIIllIlIIIIlI }));
                    }
                }
                catch (Exception ex4) {
                    net.minecraft.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI.error("Couldn't set command block", (Throwable)ex4);
                    return;
                }
                finally {
                    ilIlIlIlIlllllllllIl.release();
                }
                ilIlIlIlIlllllllllIl.release();
            }
            else {
                this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(new IIllIIllIIIlIlIIIIlI("advMode.notAllowed", new Object[0]));
            }
        }
        else if ("MC|Beacon".equals(llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll())) {
            if (this.IlIlIlIlIlllllllllIl.t instanceof net.minecraft.llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI) {
                try {
                    final llllllIllIllIlIllllI ilIlIlIlIlllllllllIl2 = llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl();
                    final int int2 = ilIlIlIlIlllllllllIl2.readInt();
                    final int int3 = ilIlIlIlIlllllllllIl2.readInt();
                    final net.minecraft.llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI2 = (net.minecraft.llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI)this.IlIlIlIlIlllllllllIl.t;
                    final IIIIIllIIIIlIIIIllIl llllIIIIlIIIlIlllIll3 = llIllIIIIIllIlIIIIlI2.llllIIIIlIIIlIlllIll(0);
                    if (llllIIIIlIIIlIlllIll3.IlIlIlIlIlllllllllIl()) {
                        llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll(1);
                        final llIIIlIlIllIIlIlIlII llllIIIIlIIIlIlllIll4 = llIllIIIIIllIlIIIIlI2.llllIIIIlIIIlIlllIll();
                        llllIIIIlIIIlIlllIll4.llllIIIIlIIIlIlllIll(1, int2);
                        llllIIIIlIIIlIlllIll4.llllIIIIlIIIlIlllIll(2, int3);
                        llllIIIIlIIIlIlllIll4.llIIIlIlIllIIlIlIlII();
                    }
                }
                catch (Exception ex5) {
                    net.minecraft.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI.error("Couldn't set beacon", (Throwable)ex5);
                }
            }
        }
        else if ("MC|ItemName".equals(llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll()) && this.IlIlIlIlIlllllllllIl.t instanceof net.minecraft.llIIlIIIlIIIllIlIIIl.IlIlIIIlIIlIlIIlllIl) {
            final net.minecraft.llIIlIIIlIIIllIlIIIl.IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl = (net.minecraft.llIIlIIIlIIIllIlIIIl.IlIlIIIlIIlIlIIlllIl)this.IlIlIlIlIlllllllllIl.t;
            if (llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl() != null && llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl().readableBytes() >= 1) {
                final String llllIIIIlIIIlIlllIll5 = net.minecraft.IlllllllIIIlIIIlIlII.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl().llIllIIIIIllIlIIIIlI(32767));
                if (llllIIIIlIIIlIlllIll5.length() <= 30) {
                    ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll5);
                }
            }
            else {
                ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll("");
            }
        }
    }
    
    static /* synthetic */ int[] llIllIIIIIllIlIIIIlI() {
        final int[] ilIlIIIIIIlllIlIllIl = lIIIIlIIIIIlllIllIII.IlIlIIIIIIlllIlIllIl;
        if (ilIlIIIIIIlllIlIllIl != null) {
            return ilIlIIIIIIlllIlIllIl;
        }
        final int[] ilIlIIIIIIlllIlIllIl2 = new int[net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.values().length];
        try {
            ilIlIIIIIIlllIlIllIl2[net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ilIlIIIIIIlllIlIllIl2[net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            ilIlIIIIIIlllIlIllIl2[net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            ilIlIIIIIIlllIlIllIl2[net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            ilIlIIIIIIlllIlIllIl2[net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        try {
            ilIlIIIIIIlllIlIllIl2[net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError6) {}
        return lIIIIlIIIIIlllIllIII.IlIlIIIIIIlllIlIllIl = ilIlIIIIIIlllIlIllIl2;
    }
    
    static /* synthetic */ int[] IlIIIlIlIIIllIlIlIIl() {
        final int[] iIllIIllIIIlIlIIIIlI = lIIIIlIIIIIlllIllIII.IIllIIllIIIlIlIIIIlI;
        if (iIllIIllIIIlIlIIIIlI != null) {
            return iIllIIllIIIlIlIIIIlI;
        }
        final int[] iIllIIllIIIlIlIIIIlI2 = new int[llllIIllllIlIlIIIIll.values().length];
        try {
            iIllIIllIIIlIlIIIIlI2[llllIIllllIlIlIIIIll.llllIIIlIlllIlIIIIIl.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            iIllIIllIIIlIlIIIIlI2[llllIIllllIlIlIIIIll.IllIIlllIIIIlllIIlIl.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            iIllIIllIIIlIlIIIIlI2[llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            iIllIIllIIIlIlIIIIlI2[llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            iIllIIllIIIlIlIIIIlI2[llllIIllllIlIlIIIIll.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        try {
            iIllIIllIIIlIlIIIIlI2[llllIIllllIlIlIIIIll.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError6) {}
        try {
            iIllIIllIIIlIlIIIIlI2[llllIIllllIlIlIIIIll.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError7) {}
        return lIIIIlIIIIIlllIllIII.IIllIIllIIIlIlIIIIlI = iIllIIllIIIlIlIIIIlI2;
    }
    
    static /* synthetic */ int[] IlIlIIIllIllIIIIIllI() {
        final int[] iiIlIIIlIlIIlllIIlll = lIIIIlIIIIIlllIllIII.IIIlIIIlIlIIlllIIlll;
        if (iiIlIIIlIlIIlllIIlll != null) {
            return iiIlIIIlIlIIlllIIlll;
        }
        final int[] iiIlIIIlIlIIlllIIlll2 = new int[IIlllIlIIllIlIlIlIIl.values().length];
        try {
            iiIlIIIlIlIIlllIIlll2[IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            iiIlIIIlIlIIlllIIlll2[IIlllIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            iiIlIIIlIlIIlllIIlll2[IIlllIlIIllIlIlIlIIl.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        return lIIIIlIIIIIlllIllIII.IIIlIIIlIlIIlllIIlll = iiIlIIIlIlIIlllIIlll2;
    }
}
