package net.optifine.shaders.IlIlIlIlIlllllllllIl;

import net.minecraft.client.llIllIlIIIIllIlIIllI.*;
import net.optifine.llIllIIIIIllIlIIIIlI.*;
import net.optifine.shaders.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.optifine.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;
import java.util.*;

public class IlIIIlIlIIIllIlIlIIl extends lIlIlIIIllIIllIIIllI
{
    private lIIllIIIllllIlllIllI lIIIlllIIIllIIIllIII;
    protected String IlIlIIIllIllIIIIIllI;
    private llllIIIIlIIIlIlllIll llIIlIIIlIIIllIlIIIl;
    private IIIIlllIIIIIIlIIIlll llIllIlIIIIllIlIIllI;
    private String lIlIlIIIllIIllIIIllI;
    private String IIIlIIIlIlIIlllIIlll;
    private boolean IlIlIIIlIIlIlIIlllIl;
    public static final String IllIIlllIIIIlllIIlIl = "<profile>";
    public static final String llllIIIlIlllIlIIIIIl = "<empty>";
    public static final String lIIIIlIIIIIlllIllIII = "*";
    
    public IlIIIlIlIIIllIlIlIIl(final lIIllIIIllllIlllIllI liiIlllIIIllIIIllIII, final llllIIIIlIIIlIlllIll llIIlIIIlIIIllIlIIIl) {
        this.llIllIlIIIIllIlIIllI = new IIIIlllIIIIIIlIIIlll(this, new lllIIIIlllllIlIIllIl());
        this.lIlIlIIIllIIllIIIllI = null;
        this.IIIlIIIlIlIIlllIIlll = null;
        this.IlIlIIIlIIlIlIIlllIl = false;
        this.IlIlIIIllIllIIIIIllI = "Shader Options";
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
    }
    
    public IlIIIlIlIIIllIlIlIIl(final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final String lIlIlIIIllIIllIIIllI) {
        this(liIllIIIllllIlllIllI, llllIIIIlIIIlIlllIll);
        this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI;
        if (lIlIlIIIllIIllIIIllI != null) {
            this.IIIlIIIlIlIIlllIIlll = llIIlllIIlllIIllIllI.IlIlIlIlIlllllllllIl("screen." + lIlIlIIIllIIllIIIllI, lIlIlIIIllIIllIIIllI);
        }
    }
    
    @Override
    public void n_() {
        this.IlIlIIIllIllIIIIIllI = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("of.options.shaderOptionsTitle", new Object[0]);
        final int n = 100;
        final int n2 = 30;
        final int n3 = 20;
        final int n4 = 120;
        final int n5 = 20;
        int llllIIIIlIIIlIlllIll = llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll(this.lIlIlIIIllIIllIIIllI, 2);
        final net.optifine.shaders.llllIIIIlIIIlIlllIll.IIIIlllIIIIIIlIIIlll[] llIllIIIIIllIlIIIIlI = llIIlllIIlllIIllIllI.llIllIIIIIllIlIIIIlI(this.lIlIlIIIllIIllIIIllI);
        if (llIllIIIIIllIlIIIIlI != null) {
            final int illIIlllIIIIlllIIlIl = llIllIIlllllllllllll.IllIIlllIIIIlllIIlIl(llIllIIIIIllIlIIIIlI.length / 9.0);
            if (llllIIIIlIIIlIlllIll < illIIlllIIIIlllIIlIl) {
                llllIIIIlIIIlIlllIll = illIIlllIIIIlllIIlIl;
            }
            for (int i = 0; i < llIllIIIIIllIlIIIIlI.length; ++i) {
                final net.optifine.shaders.llllIIIIlIIIlIlllIll.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = llIllIIIIIllIlIIIIlI[i];
                if (iiiIlllIIIIIIlIIIlll != null && iiiIlllIIIIIIlIIIlll.lIlIlIIIllIIllIIIllI()) {
                    final int n6 = i % llllIIIIlIIIlIlllIll;
                    final int n7 = i / llllIIIIlIIIlIlllIll;
                    final int min = Math.min(this.llllIIllllIlIlIIIIll / llllIIIIlIIIlIlllIll, 200);
                    final int n8 = n6 * min + 5 + (this.llllIIllllIlIlIIIIll - min * llllIIIIlIIIlIlllIll) / 2;
                    final int n9 = n2 + n7 * n3;
                    final int n10 = min - 10;
                    final String llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll, n10);
                    net.optifine.shaders.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI2;
                    if (llIIlllIIlllIIllIllI.IlIlIIIllIllIIIIIllI(iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll())) {
                        llIllIIIIIllIlIIIIlI2 = new IllIIlllIIIIlllIIlIl(n + i, n8, n9, n10, n5, iiiIlllIIIIIIlIIIlll, llllIIIIlIIIlIlllIll2);
                    }
                    else {
                        llIllIIIIIllIlIIIIlI2 = new net.optifine.shaders.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(n + i, n8, n9, n10, n5, iiiIlllIIIIIIlIIIlll, llllIIIIlIIIlIlllIll2);
                    }
                    llIllIIIIIllIlIIIIlI2.lIlIlIIIllIIllIIIllI = iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl();
                    this.IIlllIIlIllIllIlIIll.add(llIllIIIIIllIlIIIIlI2);
                }
            }
        }
        this.IIlllIIlIllIllIlIIll.add(new net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl(201, this.llllIIllllIlIlIIIIll / 2 - n4 - 20, this.IlIllIlIlIIIlIlIlIII / 6 + 168 + 11, n4, n5, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("controls.reset", new Object[0])));
        this.IIlllIIlIllIllIlIIll.add(new net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl(200, this.llllIIllllIlIlIIIIll / 2 + 20, this.IlIllIlIlIIIlIlIlIII / 6 + 168 + 11, n4, n5, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("gui.done", new Object[0])));
    }
    
    public static String llllIIIIlIIIlIlllIll(final net.optifine.shaders.llllIIIIlIIIlIlllIll.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll, final int n) {
        String s = iiiIlllIIIIIIlIIIlll.IlIlIIIllIIllIlllllI();
        if (iiiIlllIIIIIIlIIIlll instanceof net.optifine.shaders.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl) {
            final net.optifine.shaders.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl = (net.optifine.shaders.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl)iiiIlllIIIIIIlIIIlll;
            return String.valueOf(s) + "...";
        }
        for (FontRenderer lIlIlIIIllIIllIIIllI = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI().lIlIlIIIllIIllIIIllI; lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(s) + (lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(": " + IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI()) + 5) >= n && s.length() > 0; s = s.substring(0, s.length() - 1)) {}
        return String.valueOf(s) + ": " + (iiiIlllIIIIIIlIIIlll.llIllIlIIIIllIlIIllI() ? iiiIlllIIIIIIlIIIlll.IlIlIIIllIllIIIIIllI(iiiIlllIIIIIIlIIIlll.IlIIIlIlIIIllIlIlIIl()) : "") + iiiIlllIIIIIIlIIIlll.IlIIIlIlIIIllIlIlIIl(iiiIlllIIIIIIlIIIlll.IlIIIlIlIIIllIlIlIIl());
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (ilIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI) {
            if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI < 200 && ilIIIlIlIIIllIlIlIIl instanceof net.optifine.shaders.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI) {
                final net.optifine.shaders.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI = (net.optifine.shaders.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI)ilIIIlIlIIIllIlIlIIl;
                final net.optifine.shaders.llllIIIIlIIIlIlllIll.IIIIlllIIIIIIlIIIlll llIllIIIIIllIlIIIIlI2 = llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI();
                if (llIllIIIIIllIlIIIIlI2 instanceof net.optifine.shaders.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl) {
                    this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(new IlIIIlIlIIIllIlIlIIl(this, this.llIIlIIIlIIIllIlIIIl, llIllIIIIIllIlIIIIlI2.llllIIIIlIIIlIlllIll()));
                    return;
                }
                if (llllIIllllIlIlIIIIll()) {
                    llIllIIIIIllIlIIIIlI2.IllIIlllIIIIlllIIlIl();
                }
                else if (llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI()) {
                    llIllIIIIIllIlIIIIlI2.llllIIIlIlllIlIIIIIl();
                }
                this.IlIlIIIllIllIIIIIllI();
                this.IlIlIIIlIIlIlIIlllIl = true;
            }
            if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 201) {
                final net.optifine.shaders.llllIIIIlIIIlIlllIll.IIIIlllIIIIIIlIIIlll[] llllIIIIlIIIlIlllIll = llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI.IlIlIIIllIllIIIIIllI());
                for (int i = 0; i < llllIIIIlIIIlIlllIll.length; ++i) {
                    llllIIIIlIIIlIlllIll[i].IllIIlllIIIIlllIIlIl();
                    this.IlIlIIIlIIlIlIIlllIl = true;
                }
                this.IlIlIIIllIllIIIIIllI();
            }
            if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 200) {
                if (this.IlIlIIIlIIlIlIIlllIl) {
                    llIIlllIIlllIIllIllI.IllIIlllIIIIlllIIlIl();
                    this.IlIlIIIlIIlIlIIlllIl = false;
                    llIIlllIIlllIIllIllI.IlllllllIIIlIIIlIlII();
                }
                this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(this.lIIIlllIIIllIIIllIII);
            }
        }
    }
    
    @Override
    protected void IlIlIlIlIlllllllllIl(final net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (ilIIIlIlIIIllIlIlIIl instanceof net.optifine.shaders.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI) {
            final net.optifine.shaders.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI = (net.optifine.shaders.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI)ilIIIlIlIIIllIlIlIIl;
            final net.optifine.shaders.llllIIIIlIIIlIlllIll.IIIIlllIIIIIIlIIIlll llIllIIIIIllIlIIIIlI2 = llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI();
            if (llllIIllllIlIlIIIIll()) {
                llIllIIIIIllIlIIIIlI2.IllIIlllIIIIlllIIlIl();
            }
            else if (llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI()) {
                llIllIIIIIllIlIIIIlI2.lIIIIlIIIIIlllIllIII();
            }
            this.IlIlIIIllIllIIIIIllI();
            this.IlIlIIIlIIlIlIIlllIl = true;
        }
    }
    
    @Override
    public void o_() {
        super.o_();
        if (this.IlIlIIIlIIlIlIIlllIl) {
            llIIlllIIlllIIllIllI.IllIIlllIIIIlllIIlIl();
            this.IlIlIIIlIIlIlIIlllIl = false;
            llIIlllIIlllIIllIllI.IlllllllIIIlIIIlIlII();
        }
    }
    
    private void IlIlIIIllIllIIIIIllI() {
        for (final net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl : this.IIlllIIlIllIllIlIIll) {
            if (ilIIIlIlIIIllIlIlIIl instanceof net.optifine.shaders.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI) {
                final net.optifine.shaders.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI = (net.optifine.shaders.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI)ilIIIlIlIIIllIlIlIIl;
                final net.optifine.shaders.llllIIIIlIIIlIlllIll.IIIIlllIIIIIIlIIIlll llIllIIIIIllIlIIIIlI2 = llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI();
                if (llIllIIIIIllIlIIIIlI2 instanceof net.optifine.shaders.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll) {
                    ((net.optifine.shaders.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll)llIllIIIIIllIlIIIIlI2).lllIIIIlllllIlIIllIl();
                }
                llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl = llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI2, llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl());
                llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl();
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3) {
        this.IlIlIIIllIIllIlllllI();
        if (this.IIIlIIIlIlIIlllIIlll != null) {
            this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, this.IIIlIIIlIlIIlllIIlll, this.llllIIllllIlIlIIIIll / 2, 15, 16777215);
        }
        else {
            this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, this.IlIlIIIllIllIIIIIllI, this.llllIIllllIlIlIIIIll / 2, 15, 16777215);
        }
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(n, n2, this.IIlllIIlIllIllIlIIll);
    }
}
