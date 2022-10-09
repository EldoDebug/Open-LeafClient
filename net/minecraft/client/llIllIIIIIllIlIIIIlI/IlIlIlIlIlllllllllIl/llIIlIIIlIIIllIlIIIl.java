package net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;

import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import com.google.common.collect.*;
import net.minecraft.llIIlIIIlIIIllIlIIIl.*;
import org.lwjgl.input.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.*;

public class llIIlIIIlIIIllIlIIIl extends lIIlIIIlIllIlIllIIIl
{
    private static final lIllllIllIllIIllllll IlIlIIIllIllIIIIIllI;
    private static lIllllllIIllIlIlIlII IllIIlllIIIIlllIIlIl;
    private static int llllIIIlIlllIlIIIIIl;
    private float lIIIIlIIIIIlllIllIII;
    private boolean lIIIlllIIIllIIIllIII;
    private boolean llIIlIIIlIIIllIlIIIl;
    private lIIlIIIIIIIlIIlIlIIl llIllIlIIIIllIlIIllI;
    private List lIlIlIIIllIIllIIIllI;
    private IIIIIllIIIIlIIIIllIl lllllIlIIIlIlIIlllII;
    private boolean lIllllllIIllIlIlIlII;
    private llllIIIIlIIIlIlllIll llIIlllIIlllIIllIllI;
    
    static {
        IlIlIIIllIllIIIIIllI = new lIllllIllIllIIllllll("textures/gui/container/creative_inventory/tabs.png");
        llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl = new lIllllllIIllIlIlIlII("tmp", true, 45);
        llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl = net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll();
    }
    
    public llIIlIIIlIIIllIlIIIl(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        super(new llIllIlIIIIllIlIIllI(llllIIIIlIIIlIlllIll));
        llllIIIIlIIIlIlllIll.t = this.IIlIIIIlllIlllllIlII;
        this.IlIlIIIIIIlllIlIllIl = true;
        this.IlllllllIIIlIIIlIlII = 136;
        this.IlIlIIIlIIlIlIIlllIl = 195;
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        if (!this.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII()) {
            this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(new IIlllIIlIllIllIlIIll(this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII));
        }
        this.IlIlIIIllIllIIIIIllI();
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl, final int n, final int n2, int n3) {
        this.lIllllllIIllIlIlIlII = true;
        final boolean b = n3 == 1;
        n3 = ((n == -999 && n3 == 0) ? 4 : n3);
        if (iiiiIllIIIIlIIIIllIl == null && net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl != net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll() && n3 != 5) {
            final IllIIlllIIIIlllIIlIl lIlIlIIIllIIllIIIllI = this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.lIlIlIIIllIIllIIIllI;
            if (lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI() != null) {
                if (n2 == 0) {
                    this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI(), true);
                    this.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI());
                    lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl((lllIIIIlIlIllIIlIIIl)null);
                }
                if (n2 == 1) {
                    final lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll = lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI().llllIIIIlIIIlIlllIll(1);
                    this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, true);
                    this.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
                    if (lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI().IlIlIlIlIlllllllllIl == 0) {
                        lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl((lllIIIIlIlIllIIlIIIl)null);
                    }
                }
            }
        }
        else if (iiiiIllIIIIlIIIIllIl == this.lllllIlIIIlIlIIlllII && b) {
            for (int i = 0; i < this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.IlIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl().size(); ++i) {
                this.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(null, i);
            }
        }
        else if (net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl == net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll()) {
            if (iiiiIllIIIIlIIIIllIl == this.lllllIlIIIlIlIIlllII) {
                this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl((lllIIIIlIlIllIIlIIIl)null);
            }
            else if (n3 == 4 && iiiiIllIIIIlIIIIllIl != null && iiiiIllIIIIlIIIIllIl.IlIlIlIlIlllllllllIl()) {
                final lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll2 = iiiiIllIIIIlIIIIllIl.llllIIIIlIIIlIlllIll((n2 == 0) ? 1 : iiiiIllIIIIlIIIIllIl.llllIIIIlIIIlIlllIll().IlIlIlIlIlllllllllIl());
                this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, true);
                this.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2);
            }
            else if (n3 == 4 && this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI() != null) {
                this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI(), true);
                this.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI());
                this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl((lllIIIIlIlIllIIlIIIl)null);
            }
            else {
                this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll((iiiiIllIIIIlIIIIllIl == null) ? n : ((lIlIlIIIllIIllIIIllI)iiiiIllIIIIlIIIIllIl).IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI, n2, n3, this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII);
                this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI();
            }
        }
        else if (n3 != 5 && iiiiIllIIIIlIIIIllIl.IlIlIlIlIlllllllllIl == net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl) {
            final IllIIlllIIIIlllIIlIl lIlIlIIIllIIllIIIllI2 = this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.lIlIlIIIllIIllIIIllI;
            final lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI3 = lIlIlIIIllIIllIIIllI2.lIlIlIIIllIIllIIIllI();
            final lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll3 = iiiiIllIIIIlIIIIllIl.llllIIIIlIIIlIlllIll();
            if (n3 == 2) {
                if (llllIIIIlIIIlIlllIll3 != null && n2 >= 0 && n2 < 9) {
                    final lllIIIIlIlIllIIlIIIl llIIlIIIlIIIllIlIIIl = llllIIIIlIIIlIlllIll3.llIIlIIIlIIIllIlIIIl();
                    llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl = llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl();
                    this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI(n2, llIIlIIIlIIIllIlIIIl);
                    this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI();
                }
                return;
            }
            if (n3 == 3) {
                if (lIlIlIIIllIIllIIIllI2.lIlIlIIIllIIllIIIllI() == null && iiiiIllIIIIlIIIIllIl.IlIlIlIlIlllllllllIl()) {
                    final lllIIIIlIlIllIIlIIIl llIIlIIIlIIIllIlIIIl2 = iiiiIllIIIIlIIIIllIl.llllIIIIlIIIlIlllIll().llIIlIIIlIIIllIlIIIl();
                    llIIlIIIlIIIllIlIIIl2.IlIlIlIlIlllllllllIl = llIIlIIIlIIIllIlIIIl2.IlIlIlIlIlllllllllIl();
                    lIlIlIIIllIIllIIIllI2.IlIlIlIlIlllllllllIl(llIIlIIIlIIIllIlIIIl2);
                }
                return;
            }
            if (n3 == 4) {
                if (llllIIIIlIIIlIlllIll3 != null) {
                    final lllIIIIlIlIllIIlIIIl llIIlIIIlIIIllIlIIIl3 = llllIIIIlIIIlIlllIll3.llIIlIIIlIIIllIlIIIl();
                    llIIlIIIlIIIllIlIIIl3.IlIlIlIlIlllllllllIl = ((n2 == 0) ? 1 : llIIlIIIlIIIllIlIIIl3.IlIlIlIlIlllllllllIl());
                    this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl3, true);
                    this.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl3);
                }
                return;
            }
            if (lIlIlIIIllIIllIIIllI3 != null && llllIIIIlIIIlIlllIll3 != null && lIlIlIIIllIIllIIIllI3.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3)) {
                if (n2 == 0) {
                    if (b) {
                        lIlIlIIIllIIllIIIllI3.IlIlIlIlIlllllllllIl = lIlIlIIIllIIllIIIllI3.IlIlIlIlIlllllllllIl();
                    }
                    else if (lIlIlIIIllIIllIIIllI3.IlIlIlIlIlllllllllIl < lIlIlIIIllIIllIIIllI3.IlIlIlIlIlllllllllIl()) {
                        final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = lIlIlIIIllIIllIIIllI3;
                        ++lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl;
                    }
                }
                else if (lIlIlIIIllIIllIIIllI3.IlIlIlIlIlllllllllIl <= 1) {
                    lIlIlIIIllIIllIIIllI2.IlIlIlIlIlllllllllIl((lllIIIIlIlIllIIlIIIl)null);
                }
                else {
                    final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl2 = lIlIlIIIllIIllIIIllI3;
                    --lllIIIIlIlIllIIlIIIl2.IlIlIlIlIlllllllllIl;
                }
            }
            else if (llllIIIIlIIIlIlllIll3 != null && lIlIlIIIllIIllIIIllI3 == null) {
                lIlIlIIIllIIllIIIllI2.IlIlIlIlIlllllllllIl(lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll3));
                final lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI4 = lIlIlIIIllIIllIIIllI2.lIlIlIIIllIIllIIIllI();
                if (b) {
                    lIlIlIIIllIIllIIIllI4.IlIlIlIlIlllllllllIl = lIlIlIIIllIIllIIIllI4.IlIlIlIlIlllllllllIl();
                }
            }
            else {
                lIlIlIIIllIIllIIIllI2.IlIlIlIlIlllllllllIl((lllIIIIlIlIllIIlIIIl)null);
            }
        }
        else {
            this.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll((iiiiIllIIIIlIIIIllIl == null) ? n : iiiiIllIIIIlIIIIllIl.llIllIIIIIllIlIIIIlI, n2, n3, this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII);
            if (net.minecraft.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(n2) == 2) {
                for (int j = 0; j < 9; ++j) {
                    this.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll(45 + j).llllIIIIlIIIlIlllIll(), 36 + j);
                }
            }
            else if (iiiiIllIIIIlIIIIllIl != null) {
                this.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll(iiiiIllIIIIlIIIIllIl.llIllIIIIIllIlIIIIlI).llllIIIIlIIIlIlllIll(), iiiiIllIIIIlIIIIllIl.llIllIIIIIllIlIIIIlI - this.IIlIIIIlllIlllllIlII.llIllIIIIIllIlIIIIlI.size() + 9 + 36);
            }
        }
    }
    
    @Override
    protected void IlIlIIIllIllIIIIIllI() {
        final int iiIlIIlIIIIlllIlllII = this.IIIlIIlIIIIlllIlllII;
        super.IlIlIIIllIllIIIIIllI();
        if (this.llIllIlIIIIllIlIIllI != null && this.IIIlIIlIIIIlllIlllII != iiIlIIlIIIIlllIlllII) {
            this.llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI = this.IIIlIIlIIIIlllIlllII + 82;
        }
    }
    
    @Override
    public void n_() {
        if (this.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII()) {
            super.n_();
            this.IIlllIIlIllIllIlIIll.clear();
            Keyboard.enableRepeatEvents(true);
            (this.llIllIlIIIIllIlIIllI = new lIIlIIIIIIIlIIlIlIIl(0, this.IIllIIllIIIlIlIIIIlI, this.IIIlIIlIIIIlllIlllII + 82, this.IlIlIllllllllIIIIlII + 6, 89, this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll)).IllIIlllIIIIlllIIlIl(15);
            this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(false);
            this.llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI(false);
            this.llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl(16777215);
            final int llllIIIlIlllIlIIIIIl = net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl;
            net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl = -1;
            this.IlIlIlIlIlllllllllIl(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll[llllIIIlIlllIlIIIIIl]);
            this.llIIlllIIlllIIllIllI = new llllIIIIlIIIlIlllIll(this.IlIlIIIllIIllIlllllI);
            this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(this.llIIlllIIlllIIllIllI);
        }
        else {
            this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(new IIlllIIlIllIllIlIIll(this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII));
        }
    }
    
    @Override
    public void o_() {
        super.o_();
        if (this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII != null && this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.lIlIlIIIllIIllIIIllI != null) {
            this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.IlIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl(this.llIIlllIIlllIIllIllI);
        }
        Keyboard.enableRepeatEvents(false);
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final char c, final int n) {
        if (net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl != net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll()) {
            if (net.minecraft.client.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IIlllIIlllIIIlIlllII)) {
                this.IlIlIlIlIlllllllllIl(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl);
            }
            else {
                super.llllIIIIlIIIlIlllIll(c, n);
            }
        }
        else {
            if (this.lIllllllIIllIlIlIlII) {
                this.lIllllllIIllIlIlIlII = false;
                this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll("");
            }
            if (!this.llllIIIIlIIIlIlllIll(n)) {
                if (this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(c, n)) {
                    this.lIIIlllIIIllIIIllIII();
                }
                else {
                    super.llllIIIIlIIIlIlllIll(c, n);
                }
            }
        }
    }
    
    private void lIIIlllIIIllIIIllIII() {
        final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI = (llIllIlIIIIllIlIIllI)this.IIlIIIIlllIlllllIlII;
        llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.clear();
        for (final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl : net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll) {
            if (ilIIIlIlIIIllIlIlIIl != null && ilIIIlIlIIIllIlIlIIl.IIIIlllIIIIIIlIIIlll() != null) {
                ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, null, llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll);
            }
        }
        net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll[] llllIIIIlIIIlIlllIll;
        for (int length = (llllIIIIlIIIlIlllIll = net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll).length, i = 0; i < length; ++i) {
            final net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll[i];
            if (llllIIIIlIIIlIlllIll2 != null && llllIIIIlIIIlIlllIll2.llIIIlIlIllIIlIlIlII != null) {
                net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.ah.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll);
            }
        }
        final Iterator iterator2 = llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.iterator();
        final String lowerCase = this.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl().toLowerCase();
        while (iterator2.hasNext()) {
            final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = iterator2.next();
            boolean b = false;
            final Iterator iterator3 = lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll(this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII, this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IIIlIIlIIIIlllIlllII).iterator();
            while (iterator3.hasNext()) {
                if (net.minecraft.IlllllllIIIlIIIlIlII.IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll(iterator3.next()).toLowerCase().contains(lowerCase)) {
                    b = true;
                    break;
                }
            }
            if (!b) {
                iterator2.remove();
            }
        }
        llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII = 0.0f);
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int n, final int n2) {
        final net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll[net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl];
        if (llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII()) {
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
            this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(), new Object[0]), 8, 6, 4210752);
        }
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
        if (n3 == 0) {
            final int n4 = n - this.IIIlIIlIIIIlllIlllII;
            final int n5 = n2 - this.IlIlIllllllllIIIIlII;
            net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll[] llllIIIIlIIIlIlllIll;
            for (int length = (llllIIIIlIIIlIlllIll = net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll).length, i = 0; i < length; ++i) {
                if (this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll[i], n4, n5)) {
                    return;
                }
            }
        }
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
    }
    
    @Override
    protected void IlIlIlIlIlllllllllIl(final int n, final int n2, final int n3) {
        if (n3 == 0) {
            final int n4 = n - this.IIIlIIlIIIIlllIlllII;
            final int n5 = n2 - this.IlIlIllllllllIIIIlII;
            net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll[] llllIIIIlIIIlIlllIll;
            for (int length = (llllIIIIlIIIlIlllIll = net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll).length, i = 0; i < length; ++i) {
                final net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll[i];
                if (this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, n4, n5)) {
                    this.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2);
                    return;
                }
            }
        }
        super.IlIlIlIlIlllllllllIl(n, n2, n3);
    }
    
    private boolean IIlllIIlIllIllIlIIll() {
        return net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl != net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll() && net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll[net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl].llIIlIIIlIIIllIlIIIl() && ((llIllIlIIIIllIlIIllI)this.IIlIIIIlllIlllllIlII).llllIIIIlIIIlIlllIll();
    }
    
    private void IlIlIlIlIlllllllllIl(final net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final int llllIIIlIlllIlIIIIIl = net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl;
        net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll();
        final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI = (llIllIlIIIIllIlIIllI)this.IIlIIIIlllIlllllIlII;
        this.IIlllIlIIllIlIlIlIIl.clear();
        llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.clear();
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll);
        if (llllIIIIlIIIlIlllIll == net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI) {
            final IlIlIlIlIlllllllllIl ilIlIIIllIIllIlllllI = this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.IlIlIIIllIIllIlllllI;
            if (this.lIlIlIIIllIIllIIIllI == null) {
                this.lIlIlIIIllIIllIIIllI = llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI;
            }
            llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI = Lists.newArrayList();
            for (int i = 0; i < ilIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.size(); ++i) {
                final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI = new lIlIlIIIllIIllIIIllI(this, ilIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.get(i), i);
                llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.add(lIlIlIIIllIIllIIIllI);
                if (i >= 5 && i < 9) {
                    final int n = i - 5;
                    final int n2 = n / 2;
                    final int n3 = n % 2;
                    lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl = 9 + n2 * 54;
                    lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI = 6 + n3 * 27;
                }
                else if (i >= 0 && i < 5) {
                    lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI = -2000;
                    lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl = -2000;
                }
                else if (i < ilIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.size()) {
                    final int n4 = i - 9;
                    final int n5 = n4 % 9;
                    final int n6 = n4 / 9;
                    lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl = 9 + n5 * 18;
                    if (i >= 36) {
                        lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI = 112;
                    }
                    else {
                        lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI = 54 + n6 * 18;
                    }
                }
            }
            this.lllllIlIIIlIlIIlllII = new IIIIIllIIIIlIIIIllIl(net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl, 0, 173, 112);
            llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.add(this.lllllIlIIIlIlIIlllII);
        }
        else if (llllIIIlIlllIlIIIIIl == net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll()) {
            llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI = this.lIlIlIIIllIIllIIIllI;
            this.lIlIlIIIllIIllIIIllI = null;
        }
        if (this.llIllIlIIIIllIlIIllI != null) {
            if (llllIIIIlIIIlIlllIll == net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl) {
                this.llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI(true);
                this.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl(false);
                this.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl(true);
                this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll("");
                this.lIIIlllIIIllIIIllIII();
            }
            else {
                this.llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI(false);
                this.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl(true);
                this.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl(false);
            }
        }
        llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII = 0.0f);
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl() {
        super.IlIlIlIlIlllllllllIl();
        int eventDWheel = Mouse.getEventDWheel();
        if (eventDWheel != 0 && this.IIlllIIlIllIllIlIIll()) {
            final int n = ((llIllIlIIIIllIlIIllI)this.IIlIIIIlllIlllllIlII).llllIIIIlIIIlIlllIll.size() / 9 - 5;
            if (eventDWheel > 0) {
                eventDWheel = 1;
            }
            if (eventDWheel < 0) {
                eventDWheel = -1;
            }
            this.lIIIIlIIIIIlllIllIII -= (float)(eventDWheel / (double)n);
            this.lIIIIlIIIIIlllIllIII = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII, 0.0f, 1.0f);
            ((llIllIlIIIIllIlIIllI)this.IIlIIIIlllIlllllIlII).llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3) {
        final boolean buttonDown = Mouse.isButtonDown(0);
        final int iiIlIIlIIIIlllIlllII = this.IIIlIIlIIIIlllIlllII;
        final int ilIlIllllllllIIIIlII = this.IlIlIllllllllIIIIlII;
        final int n4 = iiIlIIlIIIIlllIlllII + 175;
        final int n5 = ilIlIllllllllIIIIlII + 18;
        final int n6 = n4 + 14;
        final int n7 = n5 + 112;
        if (!this.llIIlIIIlIIIllIlIIIl && buttonDown && n >= n4 && n2 >= n5 && n < n6 && n2 < n7) {
            this.lIIIlllIIIllIIIllIII = this.IIlllIIlIllIllIlIIll();
        }
        if (!buttonDown) {
            this.lIIIlllIIIllIIIllIII = false;
        }
        this.llIIlIIIlIIIllIlIIIl = buttonDown;
        if (this.lIIIlllIIIllIIIllIII) {
            this.lIIIIlIIIIIlllIllIII = (n2 - n5 - 7.5f) / (n7 - n5 - 15.0f);
            this.lIIIIlIIIIIlllIllIII = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII, 0.0f, 1.0f);
            ((llIllIlIIIIllIlIIllI)this.IIlIIIIlllIlllllIlII).llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII);
        }
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
        net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll[] llllIIIIlIIIlIlllIll;
        for (int length = (llllIIIIlIIIlIlllIll = net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll).length, n8 = 0; n8 < length && !this.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll[n8], n, n2); ++n8) {}
        if (this.lllllIlIIIlIlIIlllII != null && net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl == net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll() && this.llIllIIIIIllIlIIIIlI(this.lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl, this.lllllIlIIIlIlIIlllII.IlIlIIIllIllIIIIIllI, 16, 16, n, n2)) {
            this.llllIIIIlIIIlIlllIll(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("inventory.binSlot", new Object[0]), n, n2);
        }
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl();
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final int n, final int n2) {
        if (net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl == net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll()) {
            final List llllIIIIlIIIlIlllIll = lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll(this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII, this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IIIlIIlIIIIlllIlllII);
            net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll iiiIlllIIIIIIlIIIlll = lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll().IIIIlllIIIIIIlIIIlll();
            if (iiiIlllIIIIIIlIIIlll == null && lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.ah) {
                final Map llllIIIIlIIIlIlllIll2 = net.minecraft.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl);
                if (llllIIIIlIIIlIlllIll2.size() == 1) {
                    final net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll3 = net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2.keySet().iterator().next());
                    net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll[] llllIIIIlIIIlIlllIll4;
                    for (int length = (llllIIIIlIIIlIlllIll4 = net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll).length, i = 0; i < length; ++i) {
                        final net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll5 = llllIIIIlIIIlIlllIll4[i];
                        if (llllIIIIlIIIlIlllIll5.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3.llIIIlIlIllIIlIlIlII)) {
                            iiiIlllIIIIIIlIIIlll = llllIIIIlIIIlIlllIll5;
                            break;
                        }
                    }
                }
            }
            if (iiiIlllIIIIIIlIIIlll != null) {
                llllIIIIlIIIlIlllIll.add(1, new StringBuilder().append(net.minecraft.IlllllllIIIlIIIlIlII.IlllIIIIlIIIlIlIlIIl.lllIIIIlllllIlIIllIl).append(net.minecraft.IlllllllIIIlIIIlIlII.IlllIIIIlIIIlIlIlIIl.llIIlIIIlIIIllIlIIIl).append(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI(), new Object[0])).toString());
            }
            for (int j = 0; j < llllIIIIlIIIlIlllIll.size(); ++j) {
                if (j == 0) {
                    llllIIIIlIIIlIlllIll.set(j, lllIIIIlIlIllIIlIIIl.IIIlIIIlIlIIlllIIlll().IlIlIIIllIllIIIIIllI + llllIIIIlIIIlIlllIll.get(j));
                }
                else {
                    llllIIIIlIIIlIlllIll.set(j, net.minecraft.IlllllllIIIlIIIlIlII.IlllIIIIlIIIlIlIlIIl.lIIIIlIIIIIlllIllIII + llllIIIIlIIIlIlllIll.get(j));
                }
            }
            this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, n, n2);
        }
        else {
            super.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl, n, n2);
        }
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final float n, final int n2, final int n3) {
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
        lIlIIlllIIlIIlIlllIl.llIllIIIIIllIlIIIIlI();
        final net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll[net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl];
        net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll[] llllIIIIlIIIlIlllIll2;
        for (int length = (llllIIIIlIIIlIlllIll2 = net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll).length, i = 0; i < length; ++i) {
            final net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll3 = llllIIIIlIIIlIlllIll2[i];
            this.IlIlIIIllIIllIlllllI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI);
            if (llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll() != net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl) {
                this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3);
            }
        }
        this.IlIlIIIllIIllIlllllI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(new lIllllIllIllIIllllll("textures/gui/container/creative_inventory/tab_" + llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl()));
        this.IlIlIlIlIlllllllllIl(this.IIIlIIlIIIIlllIlllII, this.IlIlIllllllllIIIIlII, 0, 0, this.IlIlIIIlIIlIlIIlllIl, this.IlllllllIIIlIIIlIlII);
        this.llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
        final int n4 = this.IIIlIIlIIIIlllIlllII + 175;
        final int n5 = this.IlIlIllllllllIIIIlII + 18;
        final int n6 = n5 + 112;
        this.IlIlIIIllIIllIlllllI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI);
        if (llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl()) {
            this.IlIlIlIlIlllllllllIl(n4, n5 + (int)((n6 - n5 - 17) * this.lIIIIlIIIIIlllIllIII), 232 + (this.IIlllIIlIllIllIlIIll() ? 0 : 12), 0, 12, 15);
        }
        this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
        if (llllIIIIlIIIlIlllIll == net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI) {
            net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(this.IIIlIIlIIIIlllIlllII + 43, this.IlIlIllllllllIIIIlII + 45, 20, (float)(this.IIIlIIlIIIIlllIlllII + 43 - n2), (float)(this.IlIlIllllllllIIIIlII + 45 - 30 - n3), this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII);
        }
    }
    
    protected boolean llllIIIIlIIIlIlllIll(final net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final int n, final int n2) {
        final int lIlIlIIIllIIllIIIllI = llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI();
        int n3 = 28 * lIlIlIIIllIIllIIIllI;
        int n4 = 0;
        if (lIlIlIIIllIIllIIIllI == 5) {
            n3 = this.IlIlIIIlIIlIlIIlllIl - 28 + 2;
        }
        else if (lIlIlIIIllIIllIIIllI > 0) {
            n3 += lIlIlIIIllIIllIIIllI;
        }
        if (llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI()) {
            n4 -= 32;
        }
        else {
            n4 += this.IlllllllIIIlIIIlIlII;
        }
        return n >= n3 && n <= n3 + 28 && n2 >= n4 && n2 <= n4 + 32;
    }
    
    protected boolean IlIlIlIlIlllllllllIl(final net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final int n, final int n2) {
        final int lIlIlIIIllIIllIIIllI = llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI();
        int n3 = 28 * lIlIlIIIllIIllIIIllI;
        int n4 = 0;
        if (lIlIlIIIllIIllIIIllI == 5) {
            n3 = this.IlIlIIIlIIlIlIIlllIl - 28 + 2;
        }
        else if (lIlIlIIIllIIllIIIllI > 0) {
            n3 += lIlIlIIIllIIllIIIllI;
        }
        if (llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI()) {
            n4 -= 32;
        }
        else {
            n4 += this.IlllllllIIIlIIIlIlII;
        }
        if (this.llIllIIIIIllIlIIIIlI(n3 + 3, n4 + 3, 23, 27, n, n2)) {
            this.llllIIIIlIIIlIlllIll(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(), new Object[0]), n, n2);
            return true;
        }
        return false;
    }
    
    protected void llllIIIIlIIIlIlllIll(final net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final boolean b = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll() == net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl;
        final boolean ilIlIIIllIIllIlllllI = llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI();
        final int lIlIlIIIllIIllIIIllI = llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI();
        final int n = lIlIlIIIllIIllIIIllI * 28;
        int n2 = 0;
        int n3 = this.IIIlIIlIIIIlllIlllII + 28 * lIlIlIIIllIIllIIIllI;
        int ilIlIllllllllIIIIlII = this.IlIlIllllllllIIIIlII;
        final int n4 = 32;
        if (b) {
            n2 += 32;
        }
        if (lIlIlIIIllIIllIIIllI == 5) {
            n3 = this.IIIlIIlIIIIlllIlllII + this.IlIlIIIlIIlIlIIlllIl - 28;
        }
        else if (lIlIlIIIllIIllIIIllI > 0) {
            n3 += lIlIlIIIllIIllIIIllI;
        }
        if (ilIlIIIllIIllIlllllI) {
            ilIlIllllllllIIIIlII -= 28;
        }
        else {
            n2 += 64;
            ilIlIllllllllIIIIlII += this.IlllllllIIIlIIIlIlII - 4;
        }
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl();
        this.IlIlIlIlIlllllllllIl(n3, ilIlIllllllllIIIIlII, n, n2, 28, n4);
        this.IlIIIlIlIIIllIlIlIIl = 100.0f;
        this.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll = 100.0f;
        n3 += 6;
        final int n5 = ilIlIllllllllIIIIlII + 8 + (ilIlIIIllIIllIlllllI ? 1 : -1);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIIIllIllIIIIIllI();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIllllllllIIIIlII();
        final lllIIIIlIlIllIIlIIIl ilIIIlIlIIIllIlIlIIl = llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl();
        this.IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl(ilIIIlIlIIIllIlIlIIl, n3, n5);
        this.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, ilIIIlIlIIIllIlIlIIl, n3, n5);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl();
        this.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll = 0.0f;
        this.IlIIIlIlIIIllIlIlIIl = 0.0f;
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 0) {
            this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(new net.minecraft.client.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this, this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.IIlIIIIIllIlIIIlIIll()));
        }
        if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 1) {
            this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(new net.minecraft.client.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(this, this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.IIlIIIIIllIlIIIlIIll()));
        }
    }
    
    public int llllIIIlIlllIlIIIIIl() {
        return net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl;
    }
}
