package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.client.llIllIlIIIIllIlIIllI.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import net.optifine.*;
import net.optifine.llIllIIIIIllIlIIIIlI.*;
import net.optifine.shaders.IlIlIlIlIlllllllllIl.*;

public class llllIlIllllIIlIIlIlI extends lIlIlIIIllIIllIIIllI
{
    private lIIllIIIllllIlllIllI IllIIlllIIIIlllIIlIl;
    protected String IlIlIIIllIllIIIIIllI;
    private llllIIIIlIIIlIlllIll llllIIIlIlllIlIIIIIl;
    private static net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI[] lIIIIlIIIIIlllIllIII;
    private IIIIlllIIIIIIlIIIlll lIIIlllIIIllIIIllIII;
    
    static {
        llllIlIllllIIlIIlIlI.lIIIIlIIIIIlllIllIII = new net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI[] { net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.lIlIlIIIllIIllIIIllI, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.IlIlIIIllIIllIlllllI, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.IllIIlllllIIllIIllIl, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.llllIIIlIlllIlIIIIIl, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.IIIIlllIIIIIIlIIIlll, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.IIlIIIIlllIlllllIlII, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.llIllIlIlIIIIIIIllII, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.i, net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.h };
    }
    
    public llllIlIllllIIlIIlIlI(final lIIllIIIllllIlllIllI illIIlllIIIIlllIIlIl, final llllIIIIlIIIlIlllIll llllIIIlIlllIlIIIIIl) {
        this.IlIlIIIllIllIIIIIllI = "Video Settings";
        this.lIIIlllIIIllIIIllIII = new IIIIlllIIIIIIlIIIlll(this, new IIlllIIlIllIllIlIIll());
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
    }
    
    @Override
    public void n_() {
        this.IlIlIIIllIllIIIIIllI = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("options.videoTitle", new Object[0]);
        this.IIlllIIlIllIllIlIIll.clear();
        for (int i = 0; i < llllIlIllllIIlIIlIlI.lIIIIlIIIIIlllIllIII.length; ++i) {
            final net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI = llllIlIllllIIlIIlIlI.lIIIIlIIIIIlllIllIII[i];
            if (llIllIIIIIllIlIIIIlI != null) {
                final int n = this.llllIIllllIlIlIIIIll / 2 - 155 + i % 2 * 160;
                final int n2 = this.IlIllIlIlIIIlIlIlIII / 6 + 21 * (i / 2) - 12;
                if (llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll()) {
                    this.IIlllIIlIllIllIlIIll.add(new llllIIIlIlllIlIIIIIl(llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI(), n, n2, llIllIIIIIllIlIIIIlI));
                }
                else {
                    this.IIlllIIlIllIllIlIIll.add(new IllIIlllIIIIlllIIlIl(llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI(), n, n2, llIllIIIIIllIlIIIIlI, this.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI)));
                }
            }
        }
        int n3 = this.IlIllIlIlIIIlIlIlIII / 6 + 21 * (llllIlIllllIIlIIlIlI.lIIIIlIIIIIlllIllIII.length / 2) - 12;
        this.IIlllIIlIllIllIlIIll.add(new llIlIIIIIlIIlIlIIlll(231, this.llllIIllllIlIlIIIIll / 2 - 155 + 0, n3, IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll("of.options.shaders")));
        this.IIlllIIlIllIllIlIIll.add(new llIlIIIIIlIIlIlIIlll(202, this.llllIIllllIlIlIIIIll / 2 - 155 + 160, n3, IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll("of.options.quality")));
        n3 += 21;
        this.IIlllIIlIllIllIlIIll.add(new llIlIIIIIlIIlIlIIlll(201, this.llllIIllllIlIlIIIIll / 2 - 155 + 0, n3, IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll("of.options.details")));
        this.IIlllIIlIllIllIlIIll.add(new llIlIIIIIlIIlIlIIlll(212, this.llllIIllllIlIlIIIIll / 2 - 155 + 160, n3, IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll("of.options.performance")));
        n3 += 21;
        this.IIlllIIlIllIllIlIIll.add(new llIlIIIIIlIIlIlIIlll(211, this.llllIIllllIlIlIIIIll / 2 - 155 + 0, n3, IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll("of.options.animations")));
        this.IIlllIIlIllIllIlIIll.add(new llIlIIIIIlIIlIlIIlll(222, this.llllIIllllIlIlIIIIll / 2 - 155 + 160, n3, IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll("of.options.other")));
        n3 += 21;
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(200, this.llllIIllllIlIlIIIIll / 2 - 100, this.IlIllIlIlIIIlIlIlIII / 6 + 168 + 11, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("gui.done", new Object[0])));
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        this.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, 1);
    }
    
    @Override
    protected void IlIlIlIlIlllllllllIl(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.IIIIlllIIIIIIlIIIlll.ordinal()) {
            this.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, -1);
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final int n) {
        if (ilIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI) {
            final int iIlIlllIlIlllIlIllll = this.llllIIIlIlllIlIIIIIl.IIlIlllIlIlllIlIllll;
            if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI < 200 && ilIIIlIlIIIllIlIlIIl instanceof llIlIIIIIlIIlIlIIlll) {
                this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(((llIlIIIIIlIIlIlIIlll)ilIIIlIlIIIllIlIlIIl).llIllIIIIIllIlIIIIlI(), n);
                ilIIIlIlIIIllIlIlIIl.llIIlIIIlIIIllIlIIIl = this.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI(net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI));
            }
            if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 200) {
                this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl();
                this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl);
            }
            if (this.llllIIIlIlllIlIIIIIl.IIlIlllIlIlllIlIllll != iIlIlllIlIlllIlIllll) {
                final g g = new g(this.IlIlIIIllIIllIlllllI);
                this.llllIIIIlIIIlIlllIll(this.IlIlIIIllIIllIlllllI, g.llllIIIIlIIIlIlllIll(), g.IlIlIlIlIlllllllllIl());
            }
            if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 201) {
                this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl();
                this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(new net.optifine.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl(this, this.llllIIIlIlllIlIIIIIl));
            }
            if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 202) {
                this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl();
                this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(new net.optifine.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl(this, this.llllIIIlIlllIlIIIIIl));
            }
            if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 211) {
                this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl();
                this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(new net.optifine.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this, this.llllIIIlIlllIlIIIIIl));
            }
            if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 212) {
                this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl();
                this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(new lIIIlllIIIllIIIllIII(this, this.llllIIIlIlllIlIIIIIl));
            }
            if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 222) {
                this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl();
                this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(new lIIIIlIIIIIlllIllIII(this, this.llllIIIlIlllIlIIIIIl));
            }
            if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 231) {
                if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIllllIIIlIllIlIIll() || net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIIIIIlIlIIIlIIIIlIl()) {
                    net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll("of.message.shaders.aa1"), IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll("of.message.shaders.aa2"));
                    return;
                }
                if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IllllIIlIlIllIIIllII()) {
                    net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll("of.message.shaders.af1"), IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll("of.message.shaders.af2"));
                    return;
                }
                if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIlIllllIIlIIlIlI()) {
                    net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll("of.message.shaders.fr1"), IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll("of.message.shaders.fr2"));
                    return;
                }
                if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.c().IlIlIIIllIllIIIIIllI) {
                    net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll("of.message.shaders.an1"), IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll("of.message.shaders.an2"));
                    return;
                }
                this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl();
                this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(new IlIlIIIllIllIIIIIllI(this, this.llllIIIlIlllIlIIIIIl));
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3) {
        this.IlIlIIIllIIllIlllllI();
        this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, this.IlIlIIIllIllIIIIIllI, this.llllIIllllIlIlIIIIll / 2, 15, 16777215);
        String llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll();
        final String s = "HD_U";
        if (s.equals("HD")) {
            llllIIIIlIIIlIlllIll = "OptiFine HD M5";
        }
        if (s.equals("HD_U")) {
            llllIIIIlIIIlIlllIll = "OptiFine HD M5 Ultra";
        }
        if (s.equals("L")) {
            llllIIIIlIIIlIlllIll = "OptiFine M5 Light";
        }
        this.IlIlIlIlIlllllllllIl(this.IIllIIllIIIlIlIIIIlI, llllIIIIlIIIlIlllIll, 2, this.IlIllIlIlIIIlIlIlIII - 10, 8421504);
        final String s2 = "Minecraft 1.8.9";
        this.IlIlIlIlIlllllllllIl(this.IIllIIllIIIlIlIIIIlI, s2, this.llllIIllllIlIlIIIIll - this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(s2) - 2, this.IlIllIlIlIIIlIlIlIII - 10, 8421504);
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
        this.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(n, n2, this.IIlllIIlIllIllIlIIll);
    }
    
    public static int llIllIIIIIllIlIIIIlI(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        return ilIIIlIlIIIllIlIlIIl.IllIIlllIIIIlllIIlIl;
    }
    
    public static int IlIIIlIlIIIllIlIlIIl(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        return ilIIIlIlIIIllIlIlIIl.llllIIIlIlllIlIIIIIl;
    }
    
    public static void llllIIIIlIIIlIlllIll(final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI, final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        liIllIIIllllIlllIllI.llllIIIIlIIIlIlllIll(n, n2, n3, n4, n5, n6);
    }
    
    public static String llllIIIIlIIIlIlllIll(final net.minecraft.client.llIllIIIIIllIlIIIIlI.llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl) {
        return llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl();
    }
}
