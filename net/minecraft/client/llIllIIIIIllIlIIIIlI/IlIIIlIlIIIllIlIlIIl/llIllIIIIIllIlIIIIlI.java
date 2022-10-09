package net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.client.llIllIlIIIIllIlIIllI.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class llIllIIIIIllIlIIIIlI extends lIIllIIIllllIlllIllI
{
    private static final net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI[] IlIlIIIllIllIIIIIllI;
    private static final net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI[] IllIIlllIIIIlllIIlIl;
    private final lIIllIIIllllIlllIllI llllIIIlIlllIlIIIIIl;
    private final llllIIIIlIIIlIlllIll lIIIIlIIIIIlllIllIII;
    private String lIIIlllIIIllIIIllIII;
    private String llIIlIIIlIIIllIlIIIl;
    private int llIllIlIIIIllIlIIllI;
    private boolean lIlIlIIIllIIllIIIllI;
    
    static {
        IlIlIIIllIllIIIIIllI = new net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI[] { net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.IIlllIIIlIlllIIlllII, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.IlIIIlIIIllllIlIlIlI, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.IIIllllllIllIIIlllIl, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.IIIIIIIIIlllIllIlIlI, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.IIlIIIIIllIlIIIlIIll, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.llllllIllIllIlIllllI, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.lllIllIIIllllllIllll, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.IIIIIllIIIIlIIIIllIl };
        IllIIlllIIIIlllIIlIl = new net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI[] { net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.IIllllIIIlIIIIIIllIl, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.IlllIIIIlIIIlIlIlIIl };
    }
    
    public llIllIIIIIllIlIIIIlI(final lIIllIIIllllIlllIllI llllIIIlIlllIlIIIIIl, final llllIIIIlIIIlIlllIll liiiIlIIIIIlllIllIII) {
        this.lIlIlIIIllIIllIIIllI = false;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
    }
    
    @Override
    public void n_() {
        int n = 0;
        this.lIIIlllIIIllIIIllIII = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("options.stream.title", new Object[0]);
        this.llIIlIIIlIIIllIlIIIl = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("options.stream.chat.title", new Object[0]);
        net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI[] ilIlIIIllIllIIIIIllI;
        for (int length = (ilIlIIIllIllIIIIIllI = llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI).length, i = 0; i < length; ++i) {
            final net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI = ilIlIIIllIllIIIIIllI[i];
            if (llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll()) {
                this.IIlllIIlIllIllIlIIll.add(new IlIIlIlIIIlIIlIlIlII(llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI(), this.llllIIllllIlIlIIIIll / 2 - 155 + n % 2 * 160, this.IlIllIlIlIIIlIlIlIII / 6 + 24 * (n >> 1), llIllIIIIIllIlIIIIlI));
            }
            else {
                this.IIlllIIlIllIllIlIIll.add(new llIlIIIIIlIIlIlIIlll(llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI(), this.llllIIllllIlIlIIIIll / 2 - 155 + n % 2 * 160, this.IlIllIlIlIIIlIlIlIII / 6 + 24 * (n >> 1), llIllIIIIIllIlIIIIlI, this.lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI)));
            }
            ++n;
        }
        if (n % 2 == 1) {
            ++n;
        }
        this.llIllIlIIIIllIlIIllI = this.IlIllIlIlIIIlIlIlIII / 6 + 24 * (n >> 1) + 6;
        n += 2;
        net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI[] illIIlllIIIIlllIIlIl;
        for (int length2 = (illIIlllIIIIlllIIlIl = llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl).length, j = 0; j < length2; ++j) {
            final net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI2 = illIIlllIIIIlllIIlIl[j];
            if (llIllIIIIIllIlIIIIlI2.llllIIIIlIIIlIlllIll()) {
                this.IIlllIIlIllIllIlIIll.add(new IlIIlIlIIIlIIlIlIlII(llIllIIIIIllIlIIIIlI2.llIllIIIIIllIlIIIIlI(), this.llllIIllllIlIlIIIIll / 2 - 155 + n % 2 * 160, this.IlIllIlIlIIIlIlIlIII / 6 + 24 * (n >> 1), llIllIIIIIllIlIIIIlI2));
            }
            else {
                this.IIlllIIlIllIllIlIIll.add(new llIlIIIIIlIIlIlIIlll(llIllIIIIIllIlIIIIlI2.llIllIIIIIllIlIIIIlI(), this.llllIIllllIlIlIIIIll / 2 - 155 + n % 2 * 160, this.IlIllIlIlIIIlIlIlIII / 6 + 24 * (n >> 1), llIllIIIIIllIlIIIIlI2, this.lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI2)));
            }
            ++n;
        }
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(200, this.llllIIllllIlIlIIIIll / 2 - 155, this.IlIllIlIlIIIlIlIlIII / 6 + 168, 150, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("gui.done", new Object[0])));
        final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = new IlIIIlIlIIIllIlIlIIl(201, this.llllIIllllIlIlIIIIll / 2 + 5, this.IlIllIlIlIIIlIlIlIII / 6 + 168, 150, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("options.stream.ingestSelection", new Object[0]));
        ilIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI = ((this.IlIlIIIllIIllIlllllI.lIIlIIIlIllIlIllIIIl().llIIlIIIlIIIllIlIIIl() && this.IlIlIIIllIIllIlllllI.lIIlIIIlIllIlIllIIIl().IlIlIIIIIIlllIlIllIl().length > 0) || this.IlIlIIIllIIllIlllllI.lIIlIIIlIllIlIllIIIl().IlIlIIIlIIlIlIIlllIl());
        this.IIlllIIlIllIllIlIIll.add(ilIIIlIlIIIllIlIlIIl);
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (ilIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI) {
            if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI < 100 && ilIIIlIlIIIllIlIlIIl instanceof llIlIIIIIlIIlIlIIlll) {
                final net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI = ((llIlIIIIIlIIlIlIIlll)ilIIIlIlIIIllIlIlIIl).llIllIIIIIllIlIIIIlI();
                this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, 1);
                ilIIIlIlIIIllIlIlIIl.llIIlIIIlIIIllIlIIIl = this.lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI(net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI));
                if (this.IlIlIIIllIIllIlllllI.lIIlIIIlIllIlIllIIIl().llIllIlIIIIllIlIIllI() && llIllIIIIIllIlIIIIlI != net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.IIllllIIIlIIIIIIllIl && llIllIIIIIllIlIIIIlI != net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.IlllIIIIlIIIlIlIlIIl) {
                    this.lIlIlIIIllIIllIIIllI = true;
                }
            }
            else if (ilIIIlIlIIIllIlIlIIl instanceof IlIIlIlIIIlIIlIlIlII) {
                if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.IIlIIIIIllIlIIIlIIll.llIllIIIIIllIlIIIIlI()) {
                    this.IlIlIIIllIIllIlllllI.lIIlIIIlIllIlIllIIIl().IlIllIlIlIIIlIlIlIII();
                }
                else if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI()) {
                    this.IlIlIIIllIIllIlllllI.lIIlIIIlIllIlIllIIIl().IlIllIlIlIIIlIlIlIII();
                }
                else if (this.IlIlIIIllIIllIlllllI.lIIlIIIlIllIlIllIIIl().llIllIlIIIIllIlIIllI()) {
                    this.lIlIlIIIllIIllIIIllI = true;
                }
            }
            if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 200) {
                this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl();
                this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl);
            }
            else if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 201) {
                this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl();
                this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(new net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this));
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3) {
        this.IlIlIIIllIIllIlllllI();
        this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, this.lIIIlllIIIllIIIllIII, this.llllIIllllIlIlIIIIll / 2, 20, 16777215);
        this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, this.llIIlIIIlIIIllIlIIIl, this.llllIIllllIlIlIIIIll / 2, this.llIllIlIIIIllIlIIllI, 16777215);
        if (this.lIlIlIIIllIIllIIIllI) {
            this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, IlllIIIIlIIIlIlIlIIl.IlIlIIIllIIllIlllllI + net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("options.stream.changes", new Object[0]), this.llllIIllllIlIlIIIIll / 2, 20 + this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll, 16777215);
        }
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
    }
}
