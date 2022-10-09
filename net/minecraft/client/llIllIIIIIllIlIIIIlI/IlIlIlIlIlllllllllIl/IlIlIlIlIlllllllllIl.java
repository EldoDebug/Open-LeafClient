package net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import org.apache.logging.log4j.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;
import io.netty.buffer.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;
import java.util.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;

public class IlIlIlIlIlllllllllIl extends lIIIlllIIIllIIIllIII
{
    private static final Logger IlIlIIIllIllIIIIIllI;
    private static final lIllllIllIllIIllllll IllIIlllIIIIlllIIlIl;
    private llIIIlIlIllIIlIlIlII llllIIIlIlllIlIIIIIl;
    private IlIlIIIllIllIIIIIllI lIIIIlIIIIIlllIllIII;
    private boolean lIIIlllIIIllIIIllIII;
    
    static {
        IlIlIIIllIllIIIIIllI = LogManager.getLogger();
        IllIIlllIIIIlllIIlIl = new lIllllIllIllIIllllll("textures/gui/container/beacon.png");
    }
    
    public IlIlIlIlIlllllllllIl(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final llIIIlIlIllIIlIlIlII llllIIIlIlllIlIIIIIl) {
        super(new net.minecraft.llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI(illIIlllIIIIlllIIlIl, llllIIIlIlllIlIIIIIl));
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.IlIlIIIlIIlIlIIlllIl = 230;
        this.IlllllllIIIlIIIlIlII = 219;
    }
    
    @Override
    public void n_() {
        super.n_();
        this.IIlllIIlIllIllIlIIll.add(this.lIIIIlIIIIIlllIllIII = new IlIlIIIllIllIIIIIllI(this, -1, this.IIIlIIlIIIIlllIlllII + 164, this.IlIlIllllllllIIIIlII + 107));
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(this, -2, this.IIIlIIlIIIIlllIlllII + 190, this.IlIlIllllllllIIIIlII + 107));
        this.lIIIlllIIIllIIIllIII = true;
        this.lIIIIlIIIIIlllIllIII.lIlIlIIIllIIllIIIllI = false;
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        super.IlIIIlIlIIIllIlIlIIl();
        final int llllIIIIlIIIlIlllIll = this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(0);
        final int llllIIIIlIIIlIlllIll2 = this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(1);
        final int llllIIIIlIIIlIlllIll3 = this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(2);
        if (this.lIIIlllIIIllIIIllIII && llllIIIIlIIIlIlllIll >= 0) {
            this.lIIIlllIIIllIIIllIII = false;
            for (int i = 0; i <= 2; ++i) {
                final int length = net.minecraft.IlIlIIIlIIlIlIIlllIl.llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI[i].length;
                final int n = length * 22 + (length - 1) * 2;
                for (int j = 0; j < length; ++j) {
                    final int llllllIllIllIlIllllI = net.minecraft.IlIlIIIlIIlIlIIlllIl.llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI[i][j].llllllIllIllIlIllllI;
                    final net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl = new net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl(this, i << 8 | llllllIllIllIlIllllI, this.IIIlIIlIIIIlllIlllII + 76 + j * 24 - n / 2, this.IlIlIllllllllIIIIlII + 22 + i * 25, llllllIllIllIlIllllI, i);
                    this.IIlllIIlIllIllIlIIll.add(illIIlllIIIIlllIIlIl);
                    if (i >= llllIIIIlIIIlIlllIll) {
                        illIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI = false;
                    }
                    else if (llllllIllIllIlIllllI == llllIIIIlIIIlIlllIll2) {
                        illIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl(true);
                    }
                }
            }
            final int n2 = 3;
            final int n3 = net.minecraft.IlIlIIIlIIlIlIIlllIl.llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI[n2].length + 1;
            final int n4 = n3 * 22 + (n3 - 1) * 2;
            for (int k = 0; k < n3 - 1; ++k) {
                final int llllllIllIllIlIllllI2 = net.minecraft.IlIlIIIlIIlIlIIlllIl.llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI[n2][k].llllllIllIllIlIllllI;
                final net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl2 = new net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl(this, n2 << 8 | llllllIllIllIlIllllI2, this.IIIlIIlIIIIlllIlllII + 167 + k * 24 - n4 / 2, this.IlIlIllllllllIIIIlII + 47, llllllIllIllIlIllllI2, n2);
                this.IIlllIIlIllIllIlIIll.add(illIIlllIIIIlllIIlIl2);
                if (n2 >= llllIIIIlIIIlIlllIll) {
                    illIIlllIIIIlllIIlIl2.lIlIlIIIllIIllIIIllI = false;
                }
                else if (llllllIllIllIlIllllI2 == llllIIIIlIIIlIlllIll3) {
                    illIIlllIIIIlllIIlIl2.IlIlIlIlIlllllllllIl(true);
                }
            }
            if (llllIIIIlIIIlIlllIll2 > 0) {
                final net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl3 = new net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl(this, n2 << 8 | llllIIIIlIIIlIlllIll2, this.IIIlIIlIIIIlllIlllII + 167 + (n3 - 1) * 24 - n4 / 2, this.IlIlIllllllllIIIIlII + 47, llllIIIIlIIIlIlllIll2, n2);
                this.IIlllIIlIllIllIlIIll.add(illIIlllIIIIlllIIlIl3);
                if (n2 >= llllIIIIlIIIlIlllIll) {
                    illIIlllIIIIlllIIlIl3.lIlIlIIIllIIllIIIllI = false;
                }
                else if (llllIIIIlIIIlIlllIll2 == llllIIIIlIIIlIlllIll3) {
                    illIIlllIIIIlllIIlIl3.IlIlIlIlIlllllllllIl(true);
                }
            }
        }
        this.lIIIIlIIIIIlllIllIII.lIlIlIIIllIIllIIIllI = (this.llllIIIlIlllIlIIIIIl.lIlIlIIIllIIllIIIllI(0) != null && llllIIIIlIIIlIlllIll2 > 0);
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == -2) {
            this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll((lIIllIIIllllIlllIllI)null);
        }
        else if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == -1) {
            final String s = "MC|Beacon";
            final llllllIllIllIlIllllI llllllIllIllIlIllllI = new llllllIllIllIlIllllI(Unpooled.buffer());
            llllllIllIllIlIllllI.writeInt(this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(1));
            llllllIllIllIlIllllI.writeInt(this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(2));
            this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll().llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII(s, llllllIllIllIlIllllI));
            this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll((lIIllIIIllllIlllIllI)null);
        }
        else if (ilIIIlIlIIIllIlIlIIl instanceof net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl) {
            if (((net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl)ilIIIlIlIIIllIlIlIIl).llIllIIIIIllIlIIIIlI()) {
                return;
            }
            final int llIllIlIIIIllIlIIllI = ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI;
            final int n = llIllIlIIIIllIlIIllI & 0xFF;
            if (llIllIlIIIIllIlIIllI >> 8 < 3) {
                this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(1, n);
            }
            else {
                this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(2, n);
            }
            this.IIlllIIlIllIllIlIIll.clear();
            this.n_();
            this.IlIIIlIlIIIllIlIlIIl();
        }
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int n, final int n2) {
        lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll();
        this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("tile.beacon.primary", new Object[0]), 62, 10, 14737632);
        this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("tile.beacon.secondary", new Object[0]), 169, 10, 14737632);
        for (final net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl : this.IIlllIIlIllIllIlIIll) {
            if (ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll()) {
                ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(n - this.IIIlIIlIIIIlllIlllII, n2 - this.IlIlIllllllllIIIIlII);
                break;
            }
        }
        lIlIIlllIIlIIlIlllIl.llIllIIIIIllIlIIIIlI();
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final float n, final int n2, final int n3) {
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
        this.IlIlIIIllIIllIlllllI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl);
        final int n4 = (this.llllIIllllIlIlIIIIll - this.IlIlIIIlIIlIlIIlllIl) / 2;
        final int n5 = (this.IlIllIlIlIIIlIlIlIII - this.IlllllllIIIlIIIlIlII) / 2;
        this.IlIlIlIlIlllllllllIl(n4, n5, 0, 0, this.IlIlIIIlIIlIlIIlllIl, this.IlllllllIIIlIIIlIlII);
        this.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll = 100.0f;
        this.IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl(new lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.S), n4 + 42, n5 + 109);
        this.IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl(new lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.lIIIlllIIIllIIIllIII), n4 + 42 + 22, n5 + 109);
        this.IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl(new lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.llIllIlIIIIllIlIIllI), n4 + 42 + 44, n5 + 109);
        this.IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl(new lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.llIIlIIIlIIIllIlIIIl), n4 + 42 + 66, n5 + 109);
        this.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll = 0.0f;
    }
}
