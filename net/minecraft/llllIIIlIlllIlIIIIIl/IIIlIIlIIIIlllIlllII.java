package net.minecraft.llllIIIlIlllIlIIIIIl;

import org.apache.logging.log4j.*;
import com.google.common.collect.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.*;

public class IIIlIIlIIIIlllIlllII
{
    private static final Logger IlIllIlIlIIIlIlIlIII;
    public llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll;
    public int IlIlIlIlIlllllllllIl;
    public int llIllIIIIIllIlIIIIlI;
    public int IlIIIlIlIIIllIlIlIIl;
    public int IlIlIIIllIllIIIIIllI;
    public int IllIIlllIIIIlllIIlIl;
    public int llllIIIlIlllIlIIIIIl;
    public int lIIIIlIIIIIlllIllIII;
    public int lIIIlllIIIllIIIllIII;
    public double llIIlIIIlIIIllIlIIIl;
    public double llIllIlIIIIllIlIIllI;
    public double lIlIlIIIllIIllIIIllI;
    public int IlIlIIIllIIllIlllllI;
    private double IIlllIIlIllIllIlIIll;
    private double lllIIIIlllllIlIIllIl;
    private double IlIlIIIIIIlllIlIllIl;
    private boolean IIllIIllIIIlIlIIIIlI;
    private boolean IIIlIIIlIlIIlllIIlll;
    private int IlIlIIIlIIlIlIIlllIl;
    private llIllIIIIIllIlIIIIlI IlllllllIIIlIIIlIlII;
    private boolean IIlIIIIlllIlllllIlII;
    private boolean IIIlIIlIIIIlllIlllII;
    public boolean IIIIlllIIIIIIlIIIlll;
    public Set llllIIllllIlIlIIIIll;
    
    static {
        IlIllIlIlIIIlIlIlIII = LogManager.getLogger();
    }
    
    public IIIlIIlIIIIlllIlllII(final llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll, final int ilIlIlIlIlllllllllIl, final int llIllIIIIIllIlIIIIlI, final boolean iiIlIIIlIlIIlllIIlll) {
        this.llllIIllllIlIlIIIIll = Sets.newHashSet();
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IIIlIIIlIlIIlllIIlll = iiIlIIIlIlIIlllIIlll;
        this.IlIIIlIlIIIllIlIlIIl = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl * 32.0);
        this.IlIlIIIllIllIIIIIllI = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII * 32.0);
        this.IllIIlllIIIIlllIIlIl = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII * 32.0);
        this.llllIIIlIlllIlIIIIIl = llIllIIlllllllllllll.IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll.IIlIIIIIllIlIIIlIIll * 256.0f / 360.0f);
        this.lIIIIlIIIIIlllIllIII = llIllIIlllllllllllll.IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll.llllllIllIllIlIllllI * 256.0f / 360.0f);
        this.lIIIlllIIIllIIIllIII = llIllIIlllllllllllll.IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll.lllIlIIIIIlIlllllIlI() * 256.0f / 360.0f);
        this.IIIlIIlIIIIlllIlllII = llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof IIIlIIlIIIIlllIlllII && ((IIIlIIlIIIIlllIlllII)o).llllIIIIlIIIlIlllIll.IlllIIIIlIIIlIlIlIIl() == this.llllIIIIlIIIlIlllIll.IlllIIIIlIIIlIlIlIIl();
    }
    
    @Override
    public int hashCode() {
        return this.llllIIIIlIIIlIlllIll.IlllIIIIlIIIlIlIlIIl();
    }
    
    public void llllIIIIlIIIlIlllIll(final List list) {
        this.IIIIlllIIIIIIlIIIlll = false;
        if (!this.IIllIIllIIIlIlIIIIlI || this.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI(this.IIlllIIlIllIllIlIIll, this.lllIIIIlllllIlIIllIl, this.IlIlIIIIIIlllIlIllIl) > 16.0) {
            this.IIlllIIlIllIllIlIIll = this.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl;
            this.lllIIIIlllllIlIIllIl = this.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII;
            this.IlIlIIIIIIlllIlIllIl = this.llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII;
            this.IIllIIllIIIlIlIIIIlI = true;
            this.IIIIlllIIIIIIlIIIlll = true;
            this.IlIlIlIlIlllllllllIl(list);
        }
        if (this.IlllllllIIIlIIIlIlII != this.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll || (this.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll != null && this.IlIlIIIllIIllIlllllI % 60 == 0)) {
            this.IlllllllIIIlIIIlIlII = this.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll;
            this.llllIIIIlIIIlIlllIll(new lllllIlIIIlIlIIlllII(0, this.llllIIIIlIIIlIlllIll, this.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll));
        }
        if (this.llllIIIIlIIIlIlllIll instanceof llIIlIIIlIIIllIlIIIl && this.IlIlIIIllIIllIlllllI % 10 == 0) {
            final lllIIIIlIlIllIIlIIIl llllIIllllIlIlIIIIll = ((llIIlIIIlIIIllIlIIIl)this.llllIIIIlIIIlIlllIll).llllIIllllIlIlIIIIll();
            if (llllIIllllIlIlIIIIll != null && llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll() instanceof IIlllllIllIllIlIlIII) {
                final IllIIlllIIIIlllIIlIl llllIIIIlIIIlIlllIll = net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.h.llllIIIIlIIIlIlllIll(llllIIllllIlIlIIIIll, this.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII);
                for (final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl : list) {
                    llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, llllIIllllIlIlIIIIll);
                    final IIlIIIIIllIlIIIlIIll ilIIIlIlIIIllIlIlIIl2 = net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.h.IlIIIlIlIIIllIlIlIIl(llllIIllllIlIlIIIIll, this.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII, ilIIIlIlIIIllIlIlIIl);
                    if (ilIIIlIlIIIllIlIlIIl2 != null) {
                        ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl2);
                    }
                }
            }
            this.IlIlIlIlIlllllllllIl();
        }
        if (this.IlIlIIIllIIllIlllllI % this.llIllIIIIIllIlIIIIlI == 0 || this.llllIIIIlIIIlIlllIll.llIllIIlllllllllllll || this.llllIIIIlIIIlIlllIll.llIllIlIlIIIIIIIllII().llllIIIIlIIIlIlllIll()) {
            if (this.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll == null) {
                ++this.IlIlIIIlIIlIlIIlllIl;
                final int llIllIIIIIllIlIIIIlI = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl * 32.0);
                final int llIllIIIIIllIlIIIIlI2 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII * 32.0);
                final int llIllIIIIIllIlIIIIlI3 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII * 32.0);
                final int ilIIIlIlIIIllIlIlIIl3 = llIllIIlllllllllllll.IlIIIlIlIIIllIlIlIIl(this.llllIIIIlIIIlIlllIll.IIlIIIIIllIlIIIlIIll * 256.0f / 360.0f);
                final int ilIIIlIlIIIllIlIlIIl4 = llIllIIlllllllllllll.IlIIIlIlIIIllIlIlIIl(this.llllIIIIlIIIlIlllIll.llllllIllIllIlIllllI * 256.0f / 360.0f);
                final int n = llIllIIIIIllIlIIIIlI - this.IlIIIlIlIIIllIlIlIIl;
                final int n2 = llIllIIIIIllIlIIIIlI2 - this.IlIlIIIllIllIIIIIllI;
                final int n3 = llIllIIIIIllIlIIIIlI3 - this.IllIIlllIIIIlllIIlIl;
                IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll = null;
                final boolean b = Math.abs(n) >= 4 || Math.abs(n2) >= 4 || Math.abs(n3) >= 4 || this.IlIlIIIllIIllIlllllI % 60 == 0;
                final boolean b2 = Math.abs(ilIIIlIlIIIllIlIlIIl3 - this.llllIIIlIlllIlIIIIIl) >= 4 || Math.abs(ilIIIlIlIIIllIlIlIIl4 - this.lIIIIlIIIIIlllIllIII) >= 4;
                if (this.IlIlIIIllIIllIlllllI > 0 || this.llllIIIIlIIIlIlllIll instanceof net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll) {
                    if (n >= -128 && n < 128 && n2 >= -128 && n2 < 128 && n3 >= -128 && n3 < 128 && this.IlIlIIIlIIlIlIIlllIl <= 400 && !this.IIlIIIIlllIlllllIlII && this.IIIlIIlIIIIlllIlllII == this.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl) {
                        if ((!b || !b2) && !(this.llllIIIIlIIIlIlllIll instanceof net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll)) {
                            if (b) {
                                ilIIIIIllIlIIIlIIll = new IlllllllIIIlIIIlIlII(this.llllIIIIlIIIlIlllIll.IlllIIIIlIIIlIlIlIIl(), (byte)n, (byte)n2, (byte)n3, this.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl);
                            }
                            else if (b2) {
                                ilIIIIIllIlIIIlIIll = new IIlIIIIlllIlllllIlII(this.llllIIIIlIIIlIlllIll.IlllIIIIlIIIlIlIlIIl(), (byte)ilIIIlIlIIIllIlIlIIl3, (byte)ilIIIlIlIIIllIlIlIIl4, this.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl);
                            }
                        }
                        else {
                            ilIIIIIllIlIIIlIIll = new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IIIlIIlIIIIlllIlllII(this.llllIIIIlIIIlIlllIll.IlllIIIIlIIIlIlIlIIl(), (byte)n, (byte)n2, (byte)n3, (byte)ilIIIlIlIIIllIlIlIIl3, (byte)ilIIIlIlIIIllIlIlIIl4, this.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl);
                        }
                    }
                    else {
                        this.IIIlIIlIIIIlllIlllII = this.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl;
                        this.IlIlIIIlIIlIlIIlllIl = 0;
                        ilIIIIIllIlIIIlIIll = new IlIlIllllllllIIIIlII(this.llllIIIIlIIIlIlllIll.IlllIIIIlIIIlIlIlIIl(), llIllIIIIIllIlIIIIlI, llIllIIIIIllIlIIIIlI2, llIllIIIIIllIlIIIIlI3, (byte)ilIIIlIlIIIllIlIlIIl3, (byte)ilIIIlIlIIIllIlIlIIl4, this.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl);
                    }
                }
                if (this.IIIlIIIlIlIIlllIIlll) {
                    final double n4 = this.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII - this.llIIlIIIlIIIllIlIIIl;
                    final double n5 = this.llllIIIIlIIIlIlllIll.llIIlllIIlllIIllIllI - this.llIllIlIIIIllIlIIllI;
                    final double n6 = this.llllIIIIlIIIlIlllIll.IIlllIIIlIlllIIlllII - this.lIlIlIIIllIIllIIIllI;
                    final double n7 = 0.02;
                    final double n8 = n4 * n4 + n5 * n5 + n6 * n6;
                    if (n8 > n7 * n7 || (n8 > 0.0 && this.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII == 0.0 && this.llllIIIIlIIIlIlllIll.llIIlllIIlllIIllIllI == 0.0 && this.llllIIIIlIIIlIlllIll.IIlllIIIlIlllIIlllII == 0.0)) {
                        this.llIIlIIIlIIIllIlIIIl = this.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII;
                        this.llIllIlIIIIllIlIIllI = this.llllIIIIlIIIlIlllIll.llIIlllIIlllIIllIllI;
                        this.lIlIlIIIllIIllIIIllI = this.llllIIIIlIIIlIlllIll.IIlllIIIlIlllIIlllII;
                        this.llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IIllIIllIIIlIlIIIIlI(this.llllIIIIlIIIlIlllIll.IlllIIIIlIIIlIlIlIIl(), this.llIIlIIIlIIIllIlIIIl, this.llIllIlIIIIllIlIIllI, this.lIlIlIIIllIIllIIIllI));
                    }
                }
                if (ilIIIIIllIlIIIlIIll != null) {
                    this.llllIIIIlIIIlIlllIll(ilIIIIIllIlIIIlIIll);
                }
                this.IlIlIlIlIlllllllllIl();
                if (b) {
                    this.IlIIIlIlIIIllIlIlIIl = llIllIIIIIllIlIIIIlI;
                    this.IlIlIIIllIllIIIIIllI = llIllIIIIIllIlIIIIlI2;
                    this.IllIIlllIIIIlllIIlIl = llIllIIIIIllIlIIIIlI3;
                }
                if (b2) {
                    this.llllIIIlIlllIlIIIIIl = ilIIIlIlIIIllIlIlIIl3;
                    this.lIIIIlIIIIIlllIllIII = ilIIIlIlIIIllIlIlIIl4;
                }
                this.IIlIIIIlllIlllllIlII = false;
            }
            else {
                final int ilIIIlIlIIIllIlIlIIl5 = llIllIIlllllllllllll.IlIIIlIlIIIllIlIlIIl(this.llllIIIIlIIIlIlllIll.IIlIIIIIllIlIIIlIIll * 256.0f / 360.0f);
                final int ilIIIlIlIIIllIlIlIIl6 = llIllIIlllllllllllll.IlIIIlIlIIIllIlIlIIl(this.llllIIIIlIIIlIlllIll.llllllIllIllIlIllllI * 256.0f / 360.0f);
                if (Math.abs(ilIIIlIlIIIllIlIlIIl5 - this.llllIIIlIlllIlIIIIIl) >= 4 || Math.abs(ilIIIlIlIIIllIlIlIIl6 - this.lIIIIlIIIIIlllIllIII) >= 4) {
                    this.llllIIIIlIIIlIlllIll(new IIlIIIIlllIlllllIlII(this.llllIIIIlIIIlIlllIll.IlllIIIIlIIIlIlIlIIl(), (byte)ilIIIlIlIIIllIlIlIIl5, (byte)ilIIIlIlIIIllIlIlIIl6, this.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl));
                    this.llllIIIlIlllIlIIIIIl = ilIIIlIlIIIllIlIlIIl5;
                    this.lIIIIlIIIIIlllIllIII = ilIIIlIlIIIllIlIlIIl6;
                }
                this.IlIIIlIlIIIllIlIlIIl = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl * 32.0);
                this.IlIlIIIllIllIIIIIllI = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII * 32.0);
                this.IllIIlllIIIIlllIIlIl = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII * 32.0);
                this.IlIlIlIlIlllllllllIl();
                this.IIlIIIIlllIlllllIlII = true;
            }
            final int ilIIIlIlIIIllIlIlIIl7 = llIllIIlllllllllllll.IlIIIlIlIIIllIlIlIIl(this.llllIIIIlIIIlIlllIll.lllIlIIIIIlIlllllIlI() * 256.0f / 360.0f);
            if (Math.abs(ilIIIlIlIIIllIlIlIIl7 - this.lIIIlllIIIllIIIllIII) >= 4) {
                this.llllIIIIlIIIlIlllIll(new IIlllIlIIllIlIlIlIIl(this.llllIIIIlIIIlIlllIll, (byte)ilIIIlIlIIIllIlIlIIl7));
                this.lIIIlllIIIllIIIllIII = ilIIIlIlIIIllIlIlIIl7;
            }
            this.llllIIIIlIIIlIlllIll.llIllIIlllllllllllll = false;
        }
        ++this.IlIlIIIllIIllIlllllI;
        if (this.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll) {
            this.IlIlIlIlIlllllllllIl(new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IIllIIllIIIlIlIIIIlI(this.llllIIIIlIIIlIlllIll));
            this.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll = false;
        }
    }
    
    private void IlIlIlIlIlllllllllIl() {
        final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llIllIlIlIIIIIIIllII = this.llllIIIIlIIIlIlllIll.llIllIlIlIIIIIIIllII();
        if (llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll()) {
            this.IlIlIlIlIlllllllllIl(new lIllllllIIllIlIlIlII(this.llllIIIIlIIIlIlllIll.IlllIIIIlIIIlIlIlIIl(), llIllIlIlIIIIIIIllII, false));
        }
        if (this.llllIIIIlIIIlIlllIll instanceof lllIIIIlllllIlIIllIl) {
            final Set ilIlIlIlIlllllllllIl = ((lIIIIlIIIIIlllIllIII)((lllIIIIlllllIlIIllIl)this.llllIIIIlIIIlIlllIll).X()).IlIlIlIlIlllllllllIl();
            if (!ilIlIlIlIlllllllllIl.isEmpty()) {
                this.IlIlIlIlIlllllllllIl(new llllllIllIllIlIllllI(this.llllIIIIlIIIlIlllIll.IlllIIIIlIIIlIlIlIIl(), ilIlIlIlIlllllllllIl));
            }
            ilIlIlIlIlllllllllIl.clear();
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll) {
        final Iterator<IlIIIlIlIIIllIlIlIIl> iterator = this.llllIIllllIlIlIIIIll.iterator();
        while (iterator.hasNext()) {
            iterator.next().llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIIIIIllIlIIIlIIll);
        }
    }
    
    public void IlIlIlIlIlllllllllIl(final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll) {
        this.llllIIIIlIIIlIlllIll(ilIIIIIllIlIIIlIIll);
        if (this.llllIIIIlIIIlIlllIll instanceof IlIIIlIlIIIllIlIlIIl) {
            ((IlIIIlIlIIIllIlIlIIl)this.llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIIIIIllIlIIIlIIll);
        }
    }
    
    public void llllIIIIlIIIlIlllIll() {
        final Iterator<IlIIIlIlIIIllIlIlIIl> iterator = this.llllIIllllIlIlIIIIll.iterator();
        while (iterator.hasNext()) {
            iterator.next().IIllIIllIIIlIlIIIIlI(this.llllIIIIlIIIlIlllIll);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (this.llllIIllllIlIlIIIIll.contains(ilIIIlIlIIIllIlIlIIl)) {
            ilIIIlIlIIIllIlIlIIl.IIllIIllIIIlIlIIIIlI(this.llllIIIIlIIIlIlllIll);
            this.llllIIllllIlIlIIIIll.remove(ilIIIlIlIIIllIlIlIIl);
        }
    }
    
    public void IlIlIlIlIlllllllllIl(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (ilIIIlIlIIIllIlIlIIl != this.llllIIIIlIIIlIlllIll) {
            if (this.llIllIIIIIllIlIIIIlI(ilIIIlIlIIIllIlIlIIl)) {
                if (!this.llllIIllllIlIlIIIIll.contains(ilIIIlIlIIIllIlIlIIl) && (this.IlIlIIIllIllIIIIIllI(ilIIIlIlIIIllIlIlIIl) || this.llllIIIIlIIIlIlllIll.IlIlIIIlIIlIlIIlllIl)) {
                    this.llllIIllllIlIlIIIIll.add(ilIIIlIlIIIllIlIlIIl);
                    final IIlIIIIIllIlIIIlIIll llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI();
                    ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI);
                    if (!this.llllIIIIlIIIlIlllIll.llIllIlIlIIIIIIIllII().IlIIIlIlIIIllIlIlIIl()) {
                        ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new lIllllllIIllIlIlIlII(this.llllIIIIlIIIlIlllIll.IlllIIIIlIIIlIlIlIIl(), this.llllIIIIlIIIlIlllIll.llIllIlIlIIIIIIIllII(), true));
                    }
                    final IIIIlllIIIIIIlIIIlll c = this.llllIIIIlIIIlIlllIll.c();
                    if (c != null) {
                        ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new lllllIlIlIlllIlllIlI(this.llllIIIIlIIIlIlllIll.IlllIIIIlIIIlIlIlIIl(), c));
                    }
                    if (this.llllIIIIlIIIlIlllIll instanceof lllIIIIlllllIlIIllIl) {
                        final Collection llIllIIIIIllIlIIIIlI2 = ((lIIIIlIIIIIlllIllIII)((lllIIIIlllllIlIIllIl)this.llllIIIIlIIIlIlllIll).X()).llIllIIIIIllIlIIIIlI();
                        if (!llIllIIIIIllIlIIIIlI2.isEmpty()) {
                            ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new llllllIllIllIlIllllI(this.llllIIIIlIIIlIlllIll.IlllIIIIlIIIlIlIlIIl(), llIllIIIIIllIlIIIIlI2));
                        }
                    }
                    this.llIIlIIIlIIIllIlIIIl = this.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII;
                    this.llIllIlIIIIllIlIIllI = this.llllIIIIlIIIlIlllIll.llIIlllIIlllIIllIllI;
                    this.lIlIlIIIllIIllIIIllI = this.llllIIIIlIIIlIlllIll.IIlllIIIlIlllIIlllII;
                    if (this.IIIlIIIlIlIIlllIIlll && !(llIllIIIIIllIlIIIIlI instanceof IIlllIIlIllIllIlIIll)) {
                        ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IIllIIllIIIlIlIIIIlI(this.llllIIIIlIIIlIlllIll.IlllIIIIlIIIlIlIlIIl(), this.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII, this.llllIIIIlIIIlIlllIll.llIIlllIIlllIIllIllI, this.llllIIIIlIIIlIlllIll.IIlllIIIlIlllIIlllII));
                    }
                    if (this.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll != null) {
                        ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new lllllIlIIIlIlIIlllII(0, this.llllIIIIlIIIlIlllIll, this.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll));
                    }
                    if (this.llllIIIIlIIIlIlllIll instanceof IlIllIlIlIIIlIlIlIII && ((IlIllIlIlIIIlIlIlIII)this.llllIIIIlIIIlIlllIll).u() != null) {
                        ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new lllllIlIIIlIlIIlllII(1, this.llllIIIIlIIIlIlllIll, ((IlIllIlIlIIIlIlIlIII)this.llllIIIIlIIIlIlllIll).u()));
                    }
                    if (this.llllIIIIlIIIlIlllIll instanceof lllIIIIlllllIlIIllIl) {
                        for (int i = 0; i < 5; ++i) {
                            final lllIIIIlIlIllIIlIIIl llIllIIIIIllIlIIIIlI3 = ((lllIIIIlllllIlIIllIl)this.llllIIIIlIIIlIlllIll).llIllIIIIIllIlIIIIlI(i);
                            if (llIllIIIIIllIlIIIIlI3 != null) {
                                ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new IlIlIIIllIllIIIIIllI(this.llllIIIIlIIIlIlllIll.IlllIIIIlIIIlIlIlIIl(), i, llIllIIIIIllIlIIIIlI3));
                            }
                        }
                    }
                    if (this.llllIIIIlIIIlIlllIll instanceof llllIIIIlIIIlIlllIll) {
                        final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = (llllIIIIlIIIlIlllIll)this.llllIIIIlIIIlIlllIll;
                        if (llllIIIIlIIIlIlllIll.ah()) {
                            ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new lIlIlIIIllIIllIIIllI(llllIIIIlIIIlIlllIll, new IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll)));
                        }
                    }
                    if (this.llllIIIIlIIIlIlllIll instanceof lllIIIIlllllIlIIllIl) {
                        final Iterator<net.minecraft.llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl> iterator = ((lllIIIIlllllIlIIllIl)this.llllIIIIlIIIlIlllIll).L().iterator();
                        while (iterator.hasNext()) {
                            ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new llIIlllIIlllIIllIllI(this.llllIIIIlIIIlIlllIll.IlllIIIIlIIIlIlIlIIl(), iterator.next()));
                        }
                    }
                }
            }
            else if (this.llllIIllllIlIlIIIIll.contains(ilIIIlIlIIIllIlIlIIl)) {
                this.llllIIllllIlIlIIIIll.remove(ilIIIlIlIIIllIlIlIIl);
                ilIIIlIlIIIllIlIlIIl.IIllIIllIIIlIlIIIIlI(this.llllIIIIlIIIlIlllIll);
            }
        }
    }
    
    public boolean llIllIIIIIllIlIIIIlI(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        final double n = ilIIIlIlIIIllIlIlIIl.IIlllIlIIllIlIlIlIIl - this.IlIIIlIlIIIllIlIlIIl / 32;
        final double n2 = ilIIIlIlIIIllIlIlIIl.lllllIlIIIlIlIIlllII - this.IllIIlllIIIIlllIIlIl / 32;
        return n >= -this.IlIlIlIlIlllllllllIl && n <= this.IlIlIlIlIlllllllllIl && n2 >= -this.IlIlIlIlIlllllllllIl && n2 <= this.IlIlIlIlIlllllllllIl && this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl);
    }
    
    private boolean IlIlIIIllIllIIIIIllI(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        return ilIIIlIlIIIllIlIlIIl.IlllllllIIIlIIIlIlII().IlIIllIIllIIllIIlIIl().llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, this.llllIIIIlIIIlIlllIll.lllllIIlIlIIIlIlIIIl, this.llllIIIIlIIIlIlllIll.llllIllllIllllIlIlII);
    }
    
    public void IlIlIlIlIlllllllllIl(final List list) {
        for (int i = 0; i < list.size(); ++i) {
            this.IlIlIlIlIlllllllllIl(list.get(i));
        }
    }
    
    private IIlIIIIIllIlIIIlIIll llIllIIIIIllIlIIIIlI() {
        if (this.llllIIIIlIIIlIlllIll.IIlIlIlIIlIllIIIIIIl) {
            net.minecraft.llllIIIlIlllIlIIIIIl.IIIlIIlIIIIlllIlllII.IlIllIlIlIIIlIlIlIII.warn("Fetching addPacket for removed entity");
        }
        if (this.llllIIIIlIIIlIlllIll instanceof lIIIlllIIIllIIIllIII) {
            return new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IlIllIlIlIIIlIlIlIII(this.llllIIIIlIIIlIlllIll, 2, 1);
        }
        if (this.llllIIIIlIIIlIlllIll instanceof IlIIIlIlIIIllIlIlIIl) {
            return new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IIIIlllIIIIIIlIIIlll((llllIIIIlIIIlIlllIll)this.llllIIIIlIIIlIlllIll);
        }
        if (this.llllIIIIlIIIlIlllIll instanceof llIllIlIIIIllIlIIllI) {
            return new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IlIllIlIlIIIlIlIlIII(this.llllIIIIlIIIlIlllIll, 10, ((llIllIlIIIIllIlIIllI)this.llllIIIIlIIIlIlllIll).llllIIIlIlllIlIIIIIl().llllIIIIlIIIlIlllIll());
        }
        if (this.llllIIIIlIIIlIlllIll instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl) {
            return new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IlIllIlIlIIIlIlIlIII(this.llllIIIIlIIIlIlllIll, 1);
        }
        if (this.llllIIIIlIIIlIlllIll instanceof IIIIIllIIIIlIIIIllIl) {
            this.lIIIlllIIIllIIIllIII = llIllIIlllllllllllll.IlIIIlIlIIIllIlIlIIl(this.llllIIIIlIIIlIlllIll.lllIlIIIIIlIlllllIlI() * 256.0f / 360.0f);
            return new IIlllIIlIllIllIlIIll((lllIIIIlllllIlIIllIl)this.llllIIIIlIIIlIlllIll);
        }
        if (this.llllIIIIlIIIlIlllIll instanceof net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl) {
            final llllIIIIlIIIlIlllIll ilIlIlIlIlllllllllIl = ((net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl)this.llllIIIIlIIIlIlllIll).IlIlIlIlIlllllllllIl;
            return new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IlIllIlIlIIIlIlIlIII(this.llllIIIIlIIIlIlllIll, 90, (ilIlIlIlIlllllllllIl != null) ? ilIlIlIlIlllllllllIl.IlllIIIIlIIIlIlIlIIl() : this.llllIIIIlIIIlIlllIll.IlllIIIIlIIIlIlIlIIl());
        }
        if (this.llllIIIIlIIIlIlllIll instanceof net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll) {
            final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI = ((net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll)this.llllIIIIlIIIlIlllIll).llIllIIIIIllIlIIIIlI;
            return new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IlIllIlIlIIIlIlIlIII(this.llllIIIIlIIIlIlllIll, 60, (llIllIIIIIllIlIIIIlI != null) ? llIllIIIIIllIlIIIIlI.IlllIIIIlIIIlIlIlIIl() : this.llllIIIIlIIIlIlllIll.IlllIIIIlIIIlIlIlIIl());
        }
        if (this.llllIIIIlIIIlIlllIll instanceof net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII) {
            return new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IlIllIlIlIIIlIlIlIII(this.llllIIIIlIIIlIlllIll, 61);
        }
        if (this.llllIIIIlIIIlIlllIll instanceof net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.IllIIlllIIIIlllIIlIl) {
            return new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IlIllIlIlIIIlIlIlIII(this.llllIIIIlIIIlIlllIll, 73, ((net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.IllIIlllIIIIlllIIlIl)this.llllIIIIlIIIlIlllIll).lIlIlIIIllIIllIIIllI());
        }
        if (this.llllIIIIlIIIlIlllIll instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.IllIIlllIIIIlllIIlIl) {
            return new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IlIllIlIlIIIlIlIlIII(this.llllIIIIlIIIlIlllIll, 75);
        }
        if (this.llllIIIIlIIIlIlllIll instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI) {
            return new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IlIllIlIlIIIlIlIlIII(this.llllIIIIlIIIlIlllIll, 65);
        }
        if (this.llllIIIIlIIIlIlllIll instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl) {
            return new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IlIllIlIlIIIlIlIlIII(this.llllIIIIlIIIlIlllIll, 72);
        }
        if (this.llllIIIIlIIIlIlllIll instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.lIIIIlIIIIIlllIllIII) {
            return new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IlIllIlIlIIIlIlIlIII(this.llllIIIIlIIIlIlllIll, 76);
        }
        if (this.llllIIIIlIIIlIlllIll instanceof net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI) {
            final net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI2 = (net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI)this.llllIIIIlIIIlIlllIll;
            int n = 63;
            if (this.llllIIIIlIIIlIlllIll instanceof llllIIIlIlllIlIIIIIl) {
                n = 64;
            }
            else if (this.llllIIIIlIIIlIlllIll instanceof net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.llIIlIIIlIIIllIlIIIl) {
                n = 66;
            }
            net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII;
            if (llIllIIIIIllIlIIIIlI2.llllIIIIlIIIlIlllIll != null) {
                ilIllIlIlIIIlIlIlIII = new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IlIllIlIlIIIlIlIlIII(this.llllIIIIlIIIlIlllIll, n, ((net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI)this.llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll.IlllIIIIlIIIlIlIlIIl());
            }
            else {
                ilIllIlIlIIIlIlIlIII = new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IlIllIlIlIIIlIlIlIII(this.llllIIIIlIIIlIlllIll, n, 0);
            }
            ilIllIlIlIIIlIlIlIII.IlIIIlIlIIIllIlIlIIl((int)(llIllIIIIIllIlIIIIlI2.IlIlIlIlIlllllllllIl * 8000.0));
            ilIllIlIlIIIlIlIlIII.IlIlIIIllIllIIIIIllI((int)(llIllIIIIIllIlIIIIlI2.llIllIIIIIllIlIIIIlI * 8000.0));
            ilIllIlIlIIIlIlIlIII.IllIIlllIIIIlllIIlIl((int)(llIllIIIIIllIlIIIIlI2.IlIIIlIlIIIllIlIlIIl * 8000.0));
            return ilIllIlIlIIIlIlIlIII;
        }
        if (this.llllIIIIlIIIlIlllIll instanceof net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl) {
            return new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IlIllIlIlIIIlIlIlIII(this.llllIIIIlIIIlIlllIll, 62);
        }
        if (this.llllIIIIlIIIlIlllIll instanceof IIIlIIIlIlIIlllIIlll) {
            return new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IlIllIlIlIIIlIlIlIII(this.llllIIIIlIIIlIlllIll, 50);
        }
        if (this.llllIIIIlIIIlIlllIll instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI) {
            return new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IlIllIlIlIIIlIlIlIII(this.llllIIIIlIIIlIlllIll, 51);
        }
        if (this.llllIIIIlIIIlIlllIll instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llllIIIlIlllIlIIIIIl) {
            return new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IlIllIlIlIIIlIlIlIII(this.llllIIIIlIIIlIlllIll, 70, net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(((net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llllIIIlIlllIlIIIIIl)this.llllIIIIlIIIlIlllIll).lIIIIlIIIIIlllIllIII()));
        }
        if (this.llllIIIIlIIIlIlllIll instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll) {
            return new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IlIllIlIlIIIlIlIlIII(this.llllIIIIlIIIlIlllIll, 78);
        }
        if (this.llllIIIIlIIIlIlllIll instanceof IlIlIIIIIIlllIlIllIl) {
            return new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.lllIIIIlllllIlIIllIl((IlIlIIIIIIlllIlIllIl)this.llllIIIIlIIIlIlllIll);
        }
        if (this.llllIIIIlIIIlIlllIll instanceof llIIlIIIlIIIllIlIIIl) {
            final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl = (llIIlIIIlIIIllIlIIIl)this.llllIIIIlIIIlIlllIll;
            final net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII2 = new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IlIllIlIlIIIlIlIlIII(this.llllIIIIlIIIlIlllIll, 71, llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI());
            final IlIlIlIlIlllllllllIl lIlIlIIIllIIllIIIllI = llIIlIIIlIIIllIlIIIl.lIlIlIIIllIIllIIIllI();
            ilIllIlIlIIIlIlIlIII2.llllIIIIlIIIlIlllIll(llIllIIlllllllllllll.IlIIIlIlIIIllIlIlIIl((float)(lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII() * 32)));
            ilIllIlIlIIIlIlIlIII2.IlIlIlIlIlllllllllIl(llIllIIlllllllllllll.IlIIIlIlIIIllIlIlIIl((float)(lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII() * 32)));
            ilIllIlIlIIIlIlIlIII2.llIllIIIIIllIlIIIIlI(llIllIIlllllllllllll.IlIIIlIlIIIllIlIlIIl((float)(lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl() * 32)));
            return ilIllIlIlIIIlIlIlIII2;
        }
        if (this.llllIIIIlIIIlIlllIll instanceof IlIlIIIllIIllIlllllI) {
            final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI = (IlIlIIIllIIllIlllllI)this.llllIIIIlIIIlIlllIll;
            final net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII3 = new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IlIllIlIlIIIlIlIlIII(this.llllIIIIlIIIlIlllIll, 77);
            final IlIlIlIlIlllllllllIl lIlIlIIIllIIllIIIllI2 = ilIlIIIllIIllIlllllI.lIlIlIIIllIIllIIIllI();
            ilIllIlIlIIIlIlIlIII3.llllIIIIlIIIlIlllIll(llIllIIlllllllllllll.IlIIIlIlIIIllIlIlIIl((float)(lIlIlIIIllIIllIIIllI2.lIIIIlIIIIIlllIllIII() * 32)));
            ilIllIlIlIIIlIlIlIII3.IlIlIlIlIlllllllllIl(llIllIIlllllllllllll.IlIIIlIlIIIllIlIlIIl((float)(lIlIlIIIllIIllIIIllI2.lIIIlllIIIllIIIllIII() * 32)));
            ilIllIlIlIIIlIlIlIII3.llIllIIIIIllIlIIIIlI(llIllIIlllllllllllll.IlIIIlIlIIIllIlIlIIl((float)(lIlIlIIIllIIllIIIllI2.llIIlIIIlIIIllIlIIIl() * 32)));
            return ilIllIlIlIIIlIlIlIII3;
        }
        if (this.llllIIIIlIIIlIlllIll instanceof IlIlIIIlIIlIlIIlllIl) {
            return new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IlIlIIIIIIlllIlIllIl((IlIlIIIlIIlIlIIlllIl)this.llllIIIIlIIIlIlllIll);
        }
        throw new IllegalArgumentException("Don't know how to add " + this.llllIIIIlIIIlIlllIll.getClass() + "!");
    }
    
    public void IlIIIlIlIIIllIlIlIIl(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (this.llllIIllllIlIlIIIIll.contains(ilIIIlIlIIIllIlIlIIl)) {
            this.llllIIllllIlIlIIIIll.remove(ilIIIlIlIIIllIlIlIIl);
            ilIIIlIlIIIllIlIlIIl.IIllIIllIIIlIlIIIIlI(this.llllIIIIlIIIlIlllIll);
        }
    }
}
