package net.minecraft.client.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll;

import net.minecraft.IIIlIIIlIlIIlllIIlll.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.client.*;
import org.lwjgl.input.*;
import java.util.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IlIlIlIlIlllllllllIl extends lIIllIIIllllIlllIllI implements d
{
    private static final int IIIlIIlIIIIlllIlllII;
    private static final int IlIlIllllllllIIIIlII;
    private static final int IIlllIlIIllIlIlIlIIl;
    private static final int llIIIlIlIllIIlIlIlII;
    private static final lIllllIllIllIIllllll lllllIlIIIlIlIIlllII;
    protected lIIllIIIllllIlllIllI IlIlIIIllIllIIIIIllI;
    protected int IllIIlllIIIIlllIIlIl;
    protected int llllIIIlIlllIlIIIIIl;
    protected int lIIIIlIIIIIlllIllIII;
    protected int lIIIlllIIIllIIIllIII;
    protected float llIIlIIIlIIIllIlIIIl;
    protected double llIllIlIIIIllIlIIllI;
    protected double lIlIlIIIllIIllIIIllI;
    protected double IIIlIIIlIlIIlllIIlll;
    protected double IlIlIIIlIIlIlIIlllIl;
    protected double IlllllllIIIlIIIlIlII;
    protected double IIlIIIIlllIlllllIlII;
    private int lIllllllIIllIlIlIlII;
    private IlIlIIIllIIllIlllllI llIIlllIIlllIIllIllI;
    private boolean IIlllIIIlIlllIIlllII;
    
    static {
        IIIlIIlIIIIlllIlllII = net.minecraft.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll * 24 - 112;
        IlIlIllllllllIIIIlII = net.minecraft.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl * 24 - 112;
        IIlllIlIIllIlIlIlIIl = net.minecraft.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI * 24 - 77;
        llIIIlIlIllIIlIlIlII = net.minecraft.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl * 24 - 77;
        lllllIlIIIlIlIIlllII = new lIllllIllIllIIllllll("textures/gui/achievement/achievement_background.png");
    }
    
    public IlIlIlIlIlllllllllIl(final lIIllIIIllllIlllIllI ilIlIIIllIllIIIIIllI, final IlIlIIIllIIllIlllllI llIIlllIIlllIIllIllI) {
        this.IllIIlllIIIIlllIIlIl = 256;
        this.llllIIIlIlllIlIIIIIl = 202;
        this.llIIlIIIlIIIllIlIIIl = 1.0f;
        this.IIlllIIIlIlllIIlllII = true;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.llIIlllIIlllIIllIllI = llIIlllIIlllIIllIllI;
        final int n = 141;
        final int n2 = 141;
        final double llIllIlIIIIllIlIIllI = net.minecraft.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll * 24 - n / 2 - 12;
        this.IlllllllIIIlIIIlIlII = llIllIlIIIIllIlIIllI;
        this.IIIlIIIlIlIIlllIIlll = llIllIlIIIIllIlIIllI;
        this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI;
        final double lIlIlIIIllIIllIIIllI = net.minecraft.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl * 24 - n2 / 2;
        this.IIlIIIIlllIlllllIlII = lIlIlIIIllIIllIIIllI;
        this.IlIlIIIlIIlIlIIlllIl = lIlIlIIIllIIllIIIllI;
        this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI;
    }
    
    @Override
    public void n_() {
        this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll().llllIIIIlIIIlIlllIll(new IlIlIllllllllIIIIlII(net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.IlIlIlIlIlllllllllIl));
        this.IIlllIIlIllIllIlIIll.clear();
        this.IIlllIIlIllIllIlIIll.add(new llIlIIIIIlIIlIlIIlll(1, this.llllIIllllIlIlIIIIll / 2 + 24, this.IlIllIlIlIIIlIlIlIII / 2 + 74, 80, 20, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("gui.done", new Object[0])));
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (!this.IIlllIIIlIlllIIlllII && ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == 1) {
            this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(this.IlIlIIIllIllIIIIIllI);
        }
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final char c, final int n) {
        if (n == this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IllIIlllllIIllIIllIl.lIIIlllIIIllIIIllIII()) {
            this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll((lIIllIIIllllIlllIllI)null);
            this.IlIlIIIllIIllIlllllI.IIIIlllIIIIIIlIIIlll();
        }
        else {
            super.llllIIIIlIIIlIlllIll(c, n);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int liiiIlIIIIIlllIllIII, final int liiIlllIIIllIIIllIII, final float n) {
        if (this.IIlllIIIlIlllIIlllII) {
            this.IlIlIIIllIIllIlllllI();
            this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("multiplayer.downloadingStats", new Object[0]), this.llllIIllllIlIlIIIIll / 2, this.IlIllIlIlIIIlIlIlIII / 2, 16777215);
            this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, IlIlIlIlIlllllllllIl.a_[(int)(Minecraft.IIIllllllIllIIIlllIl() / 150L % IlIlIlIlIlllllllllIl.a_.length)], this.llllIIllllIlIlIIIIll / 2, this.IlIllIlIlIIIlIlIlIII / 2 + this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll * 2, 16777215);
        }
        else {
            if (Mouse.isButtonDown(0)) {
                final int n2 = (this.llllIIllllIlIlIIIIll - this.IllIIlllIIIIlllIIlIl) / 2;
                final int n3 = (this.IlIllIlIlIIIlIlIlIII - this.llllIIIlIlllIlIIIIIl) / 2;
                final int n4 = n2 + 8;
                final int n5 = n3 + 17;
                if ((this.lIllllllIIllIlIlIlII == 0 || this.lIllllllIIllIlIlIlII == 1) && liiiIlIIIIIlllIllIII >= n4 && liiiIlIIIIIlllIllIII < n4 + 224 && liiIlllIIIllIIIllIII >= n5 && liiIlllIIIllIIIllIII < n5 + 155) {
                    if (this.lIllllllIIllIlIlIlII == 0) {
                        this.lIllllllIIllIlIlIlII = 1;
                    }
                    else {
                        this.IIIlIIIlIlIIlllIIlll -= (liiiIlIIIIIlllIllIII - this.lIIIIlIIIIIlllIllIII) * this.llIIlIIIlIIIllIlIIIl;
                        this.IlIlIIIlIIlIlIIlllIl -= (liiIlllIIIllIIIllIII - this.lIIIlllIIIllIIIllIII) * this.llIIlIIIlIIIllIlIIIl;
                        final double iiIlIIIlIlIIlllIIlll = this.IIIlIIIlIlIIlllIIlll;
                        this.llIllIlIIIIllIlIIllI = iiIlIIIlIlIIlllIIlll;
                        this.IlllllllIIIlIIIlIlII = iiIlIIIlIlIIlllIIlll;
                        final double ilIlIIIlIIlIlIIlllIl = this.IlIlIIIlIIlIlIIlllIl;
                        this.lIlIlIIIllIIllIIIllI = ilIlIIIlIIlIlIIlllIl;
                        this.IIlIIIIlllIlllllIlII = ilIlIIIlIIlIlIIlllIl;
                    }
                    this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
                    this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
                }
            }
            else {
                this.lIllllllIIllIlIlIlII = 0;
            }
            final int dWheel = Mouse.getDWheel();
            final float llIIlIIIlIIIllIlIIIl = this.llIIlIIIlIIIllIlIIIl;
            if (dWheel < 0) {
                this.llIIlIIIlIIIllIlIIIl += 0.25f;
            }
            else if (dWheel > 0) {
                this.llIIlIIIlIIIllIlIIIl -= 0.25f;
            }
            this.llIIlIIIlIIIllIlIIIl = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.llIIlIIIlIIIllIlIIIl, 1.0f, 2.0f);
            if (this.llIIlIIIlIIIllIlIIIl != llIIlIIIlIIIllIlIIIl) {
                final float n6 = llIIlIIIlIIIllIlIIIl - this.llIIlIIIlIIIllIlIIIl;
                final float n7 = llIIlIIIlIIIllIlIIIl * this.IllIIlllIIIIlllIIlIl;
                final float n8 = llIIlIIIlIIIllIlIIIl * this.llllIIIlIlllIlIIIIIl;
                final float n9 = this.llIIlIIIlIIIllIlIIIl * this.IllIIlllIIIIlllIIlIl;
                final float n10 = this.llIIlIIIlIIIllIlIIIl * this.llllIIIlIlllIlIIIIIl;
                this.IIIlIIIlIlIIlllIIlll -= (n9 - n7) * 0.5f;
                this.IlIlIIIlIIlIlIIlllIl -= (n10 - n8) * 0.5f;
                final double iiIlIIIlIlIIlllIIlll2 = this.IIIlIIIlIlIIlllIIlll;
                this.llIllIlIIIIllIlIIllI = iiIlIIIlIlIIlllIIlll2;
                this.IlllllllIIIlIIIlIlII = iiIlIIIlIlIIlllIIlll2;
                final double ilIlIIIlIIlIlIIlllIl2 = this.IlIlIIIlIIlIlIIlllIl;
                this.lIlIlIIIllIIllIIIllI = ilIlIIIlIIlIlIIlllIl2;
                this.IIlIIIIlllIlllllIlII = ilIlIIIlIIlIlIIlllIl2;
            }
            if (this.IlllllllIIIlIIIlIlII < IlIlIlIlIlllllllllIl.IIIlIIlIIIIlllIlllII) {
                this.IlllllllIIIlIIIlIlII = IlIlIlIlIlllllllllIl.IIIlIIlIIIIlllIlllII;
            }
            if (this.IIlIIIIlllIlllllIlII < IlIlIlIlIlllllllllIl.IlIlIllllllllIIIIlII) {
                this.IIlIIIIlllIlllllIlII = IlIlIlIlIlllllllllIl.IlIlIllllllllIIIIlII;
            }
            if (this.IlllllllIIIlIIIlIlII >= IlIlIlIlIlllllllllIl.IIlllIlIIllIlIlIlIIl) {
                this.IlllllllIIIlIIIlIlII = IlIlIlIlIlllllllllIl.IIlllIlIIllIlIlIlIIl - 1;
            }
            if (this.IIlIIIIlllIlllllIlII >= IlIlIlIlIlllllllllIl.llIIIlIlIllIIlIlIlII) {
                this.IIlIIIIlllIlllllIlII = IlIlIlIlIlllllllllIl.llIIIlIlIllIIlIlIlII - 1;
            }
            this.IlIlIIIllIIllIlllllI();
            this.IlIlIlIlIlllllllllIl(liiiIlIIIIIlllIllIII, liiIlllIIIllIIIllIII, n);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII();
            this.IlIlIIIllIllIIIIIllI();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIIIllIllIIIIIllI();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIIlIIIlIIIllIlIIIl();
        }
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI() {
        if (this.IIlllIIIlIlllIIlllII) {
            this.IIlllIIIlIlllIIlllII = false;
        }
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        if (!this.IIlllIIIlIlllIIlllII) {
            this.llIllIlIIIIllIlIIllI = this.IIIlIIIlIlIIlllIIlll;
            this.lIlIlIIIllIIllIIIllI = this.IlIlIIIlIIlIlIIlllIl;
            final double n = this.IlllllllIIIlIIIlIlII - this.IIIlIIIlIlIIlllIIlll;
            final double n2 = this.IIlIIIIlllIlllllIlII - this.IlIlIIIlIIlIlIIlllIl;
            if (n * n + n2 * n2 < 4.0) {
                this.IIIlIIIlIlIIlllIIlll += n;
                this.IlIlIIIlIIlIlIIlllIl += n2;
            }
            else {
                this.IIIlIIIlIlIIlllIIlll += n * 0.85;
                this.IlIlIIIlIIlIlIIlllIl += n2 * 0.85;
            }
        }
    }
    
    protected void IlIlIIIllIllIIIIIllI() {
        this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("gui.achievements", new Object[0]), (this.llllIIllllIlIlIIIIll - this.IllIIlllIIIIlllIIlIl) / 2 + 15, (this.IlIllIlIlIIIlIlIlIII - this.llllIIIlIlllIlIIIIIl) / 2 + 5, 4210752);
    }
    
    protected void IlIlIlIlIlllllllllIl(final int n, final int n2, final float n3) {
        int n4 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.llIllIlIIIIllIlIIllI + (this.IIIlIIIlIlIIlllIIlll - this.llIllIlIIIIllIlIIllI) * n3);
        int n5 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.lIlIlIIIllIIllIIIllI + (this.IlIlIIIlIIlIlIIlllIl - this.lIlIlIIIllIIllIIIllI) * n3);
        if (n4 < IlIlIlIlIlllllllllIl.IIIlIIlIIIIlllIlllII) {
            n4 = IlIlIlIlIlllllllllIl.IIIlIIlIIIIlllIlllII;
        }
        if (n5 < IlIlIlIlIlllllllllIl.IlIlIllllllllIIIIlII) {
            n5 = IlIlIlIlIlllllllllIl.IlIlIllllllllIIIIlII;
        }
        if (n4 >= IlIlIlIlIlllllllllIl.IIlllIlIIllIlIlIlIIl) {
            n4 = IlIlIlIlIlllllllllIl.IIlllIlIIllIlIlIlIIl - 1;
        }
        if (n5 >= IlIlIlIlIlllllllllIl.llIIIlIlIllIIlIlIlII) {
            n5 = IlIlIlIlIlllllllllIl.llIIIlIlIllIIlIlIlII - 1;
        }
        final int n6 = (this.llllIIllllIlIlIIIIll - this.IllIIlllIIIIlllIIlIl) / 2;
        final int n7 = (this.IlIllIlIlIIIlIlIlIII - this.llllIIIlIlllIlIIIIIl) / 2;
        final int n8 = n6 + 16;
        final int n9 = n7 + 17;
        this.IlIIIlIlIIIllIlIlIIl = 0.0f;
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(518);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl((float)n8, (float)n9, -200.0f);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(1.0f / this.llIIlIIIlIIIllIlIIIl, 1.0f / this.llIIlIIIlIIIllIlIIIl, 0.0f);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIllllllllIIIIlII();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl();
        final int n10 = n4 + 288 >> 4;
        final int n11 = n5 + 288 >> 4;
        final int n12 = (n4 + 288) % 16;
        final int n13 = (n5 + 288) % 16;
        final Random random = new Random();
        final float n14 = 16.0f / this.llIIlIIIlIIIllIlIIIl;
        final float n15 = 16.0f / this.llIIlIIIlIIIllIlIIIl;
        for (int n16 = 0; n16 * n14 - n13 < 155.0f; ++n16) {
            final float n17 = 0.6f - (n11 + n16) / 25.0f * 0.3f;
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(n17, n17, n17, 1.0f);
            for (int n18 = 0; n18 * n15 - n12 < 224.0f; ++n18) {
                random.setSeed(this.IlIlIIIllIIllIlllllI.IIIIIllIIIIlIIIIllIl().IlIlIlIlIlllllllllIl().hashCode() + n10 + n18 + (n11 + n16) * 16);
                final int n19 = random.nextInt(1 + n11 + n16) + (n11 + n16) / 2;
                net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI = this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI);
                if (n19 <= 37 && n11 + n16 != 35) {
                    if (n19 == 22) {
                        if (random.nextInt(2) == 0) {
                            ilIlIIIllIIllIlllllI = this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIllIIIIIlllIIlIIllI);
                        }
                        else {
                            ilIlIIIllIIllIlllllI = this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIIIIllllIlIIIIIII);
                        }
                    }
                    else if (n19 == 10) {
                        ilIlIIIllIIllIlllllI = this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIllIlIlIIIlIlIlIII);
                    }
                    else if (n19 == 8) {
                        ilIlIIIllIIllIlllllI = this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIIlIllIllIlIIll);
                    }
                    else if (n19 > 4) {
                        ilIlIIIllIIllIlllllI = this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl);
                    }
                    else if (n19 > 0) {
                        ilIlIIIllIIllIlllllI = this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl);
                    }
                }
                else {
                    ilIlIIIllIIllIlllllI = this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII);
                }
                this.IlIlIIIllIIllIlllllI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl);
                this.llllIIIIlIIIlIlllIll(n18 * 16 - n12, n16 * 16 - n13, ilIlIIIllIIllIlllllI, 16, 16);
            }
        }
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIIlIIIlIIIllIlIIIl();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(515);
        this.IlIlIIIllIIllIlllllI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(IlIlIlIlIlllllllllIl.lllllIlIIIlIlIIlllII);
        for (int i = 0; i < net.minecraft.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI.size(); ++i) {
            final net.minecraft.IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = net.minecraft.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI.get(i);
            if (llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI != null) {
                final int n20 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll * 24 - n4 + 11;
                final int n21 = llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl * 24 - n5 + 11;
                final int n22 = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll * 24 - n4 + 11;
                final int n23 = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl * 24 - n5 + 11;
                final boolean llllIIIIlIIIlIlllIll2 = this.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
                final boolean ilIlIlIlIlllllllllIl = this.llIIlllIIlllIIllIllI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
                if (this.llIIlllIIlllIIllIllI.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll) <= 4) {
                    int n24 = -16777216;
                    if (llllIIIIlIIIlIlllIll2) {
                        n24 = -6250336;
                    }
                    else if (ilIlIlIlIlllllllllIl) {
                        n24 = -16711936;
                    }
                    this.llllIIIIlIIIlIlllIll(n20, n22, n21, n24);
                    this.IlIlIlIlIlllllllllIl(n22, n21, n23, n24);
                    if (n20 > n22) {
                        this.IlIlIlIlIlllllllllIl(n20 - 11 - 7, n21 - 5, 114, 234, 7, 11);
                    }
                    else if (n20 < n22) {
                        this.IlIlIlIlIlllllllllIl(n20 + 11, n21 - 5, 107, 234, 7, 11);
                    }
                    else if (n21 > n23) {
                        this.IlIlIlIlIlllllllllIl(n20 - 5, n21 - 11 - 7, 96, 234, 11, 7);
                    }
                    else if (n21 < n23) {
                        this.IlIlIlIlIlllllllllIl(n20 - 5, n21 + 11, 96, 241, 11, 7);
                    }
                }
            }
        }
        net.minecraft.IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll3 = null;
        final float n25 = (n - n8) * this.llIIlIIIlIIIllIlIIIl;
        final float n26 = (n2 - n9) * this.llIIlIIIlIIIllIlIIIl;
        lIlIIlllIIlIIlIlllIl.llIllIIIIIllIlIIIIlI();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIllllllllIIIIlII();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl();
        for (int j = 0; j < net.minecraft.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI.size(); ++j) {
            final net.minecraft.IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll4 = net.minecraft.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI.get(j);
            final int n27 = llllIIIIlIIIlIlllIll4.llllIIIIlIIIlIlllIll * 24 - n4;
            final int n28 = llllIIIIlIIIlIlllIll4.IlIlIlIlIlllllllllIl * 24 - n5;
            if (n27 >= -24 && n28 >= -24 && n27 <= 224.0f * this.llIIlIIIlIIIllIlIIIl && n28 <= 155.0f * this.llIIlIIIlIIIllIlIIIl) {
                final int llIllIIIIIllIlIIIIlI = this.llIIlllIIlllIIllIllI.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll4);
                if (this.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll4)) {
                    final float n29 = 0.75f;
                    net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(n29, n29, n29, 1.0f);
                }
                else if (this.llIIlllIIlllIIllIllI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll4)) {
                    final float n30 = 1.0f;
                    net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(n30, n30, n30, 1.0f);
                }
                else if (llIllIIIIIllIlIIIIlI < 3) {
                    final float n31 = 0.3f;
                    net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(n31, n31, n31, 1.0f);
                }
                else if (llIllIIIIIllIlIIIIlI == 3) {
                    final float n32 = 0.2f;
                    net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(n32, n32, n32, 1.0f);
                }
                else {
                    if (llIllIIIIIllIlIIIIlI != 4) {
                        continue;
                    }
                    final float n33 = 0.1f;
                    net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(n33, n33, n33, 1.0f);
                }
                this.IlIlIIIllIIllIlllllI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(IlIlIlIlIlllllllllIl.lllllIlIIIlIlIIlllII);
                if (llllIIIIlIIIlIlllIll4.llllIIIlIlllIlIIIIIl()) {
                    this.IlIlIlIlIlllllllllIl(n27 - 2, n28 - 2, 26, 202, 26, 26);
                }
                else {
                    this.IlIlIlIlIlllllllllIl(n27 - 2, n28 - 2, 0, 202, 26, 26);
                }
                if (!this.llIIlllIIlllIIllIllI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll4)) {
                    final float n34 = 0.1f;
                    net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(n34, n34, n34, 1.0f);
                    this.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(false);
                }
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIIIllIllIIIIIllI();
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIllllIlIlIIIIll();
                this.IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll4.IlIIIlIlIIIllIlIlIIl, n27 + 3, n28 + 3);
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(770, 771);
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl();
                if (!this.llIIlllIIlllIIllIllI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll4)) {
                    this.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(true);
                }
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
                if (n25 >= n27 && n25 <= n27 + 22 && n26 >= n28 && n26 <= n28 + 22) {
                    llllIIIIlIIIlIlllIll3 = llllIIIIlIIIlIlllIll4;
                }
            }
        }
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
        this.IlIlIIIllIIllIlllllI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(IlIlIlIlIlllllllllIl.lllllIlIIIlIlIIlllII);
        this.IlIlIlIlIlllllllllIl(n6, n7, 0, 0, this.IllIIlllIIIIlllIIlIl, this.llllIIIlIlllIlIIIIIl);
        this.IlIIIlIlIIIllIlIlIIl = 0.0f;
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(515);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll();
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
        if (llllIIIIlIIIlIlllIll3 != null) {
            String s = llllIIIIlIIIlIlllIll3.IlIlIIIllIllIIIIIllI().lIIIIlIIIIIlllIllIII();
            final String illIIlllIIIIlllIIlIl = llllIIIIlIIIlIlllIll3.IllIIlllIIIIlllIIlIl();
            final int n35 = n + 12;
            final int n36 = n2 - 4;
            final int llIllIIIIIllIlIIIIlI2 = this.llIIlllIIlllIIllIllI.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll3);
            if (this.llIIlllIIlllIIllIllI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll3)) {
                final int max = Math.max(this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(s), 120);
                int ilIlIlIlIlllllllllIl2 = this.IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl(illIIlllIIIIlllIIlIl, max);
                if (this.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3)) {
                    ilIlIlIlIlllllllllIl2 += 12;
                }
                this.llllIIIIlIIIlIlllIll(n35 - 3, n36 - 3, n35 + max + 3, n36 + ilIlIlIlIlllllllllIl2 + 3 + 12, -1073741824, -1073741824);
                this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl, n35, n36 + 12, max, -6250336);
                if (this.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3)) {
                    this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("achievement.taken", new Object[0]), (float)n35, (float)(n36 + ilIlIlIlIlllllllllIl2 + 4), -7302913);
                }
            }
            else if (llIllIIIIIllIlIIIIlI2 == 3) {
                s = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("achievement.unknown", new Object[0]);
                final int max2 = Math.max(this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(s), 120);
                final String liiiIlIIIIIlllIllIII = new IIllIIllIIIlIlIIIIlI("achievement.requires", new Object[] { llllIIIIlIIIlIlllIll3.llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI() }).lIIIIlIIIIIlllIllIII();
                this.llllIIIIlIIIlIlllIll(n35 - 3, n36 - 3, n35 + max2 + 3, n36 + this.IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl(liiiIlIIIIIlllIllIII, max2) + 12 + 3, -1073741824, -1073741824);
                this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII, n35, n36 + 12, max2, -9416624);
            }
            else if (llIllIIIIIllIlIIIIlI2 < 3) {
                final int max3 = Math.max(this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(s), 120);
                final String liiiIlIIIIIlllIllIII2 = new IIllIIllIIIlIlIIIIlI("achievement.requires", new Object[] { llllIIIIlIIIlIlllIll3.llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI() }).lIIIIlIIIIIlllIllIII();
                this.llllIIIIlIIIlIlllIll(n35 - 3, n36 - 3, n35 + max3 + 3, n36 + this.IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl(liiiIlIIIIIlllIllIII2, max3) + 12 + 3, -1073741824, -1073741824);
                this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII2, n35, n36 + 12, max3, -9416624);
            }
            else {
                s = null;
            }
            if (s != null) {
                this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(s, (float)n35, (float)n36, this.llIIlllIIlllIIllIllI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll3) ? (llllIIIIlIIIlIlllIll3.llllIIIlIlllIlIIIIIl() ? -128 : -1) : (llllIIIIlIIIlIlllIll3.llllIIIlIlllIlIIIIIl() ? -8355776 : -8355712));
            }
        }
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIIlIIIlIIIllIlIIIl();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIIIllIllIIIIIllI();
        lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll();
    }
    
    private net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlIlIIIllIIllIlllllI llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return Minecraft.getMinecraft().IlIIllIIllIIllIIlIIl().llllIIIIlIIIlIlllIll().llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll());
    }
    
    @Override
    public boolean IllIIlllIIIIlllIIlIl() {
        return !this.IIlllIIIlIlllIIlllII;
    }
}
