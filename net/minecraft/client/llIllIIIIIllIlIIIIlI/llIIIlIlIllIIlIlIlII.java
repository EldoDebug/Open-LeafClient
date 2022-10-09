package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import java.util.*;
import net.minecraft.client.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import leaf.*;
import leaf.setting.*;
import net.minecraft.lllIIIIlllllIlIIllIl.*;
import net.optifine.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;

public class llIIIlIlIllIIlIlIlII extends llIllIIIIIllIlIIIIlI
{
    private static final lIllllIllIllIIllllll IllIIlllIIIIlllIIlIl;
    private static final lIllllIllIllIIllllll llllIIIlIlllIlIIIIIl;
    private static final lIllllIllIllIIllllll lIIIIlIIIIIlllIllIII;
    private final Random lIIIlllIIIllIIIllIII;
    private final Minecraft llIIlIIIlIIIllIlIIIl;
    private final IIlllIlIIllIlIlIlIIl llIllIlIIIIllIlIIllI;
    private final IllIllIlllIllllIIllI lIlIlIIIllIIllIIIllI;
    private final lIllIIlIlIlllllIIIII IlIlIIIllIIllIlllllI;
    private int IIIIlllIIIIIIlIIIlll;
    private String llllIIllllIlIlIIIIll;
    private int IlIllIlIlIIIlIlIlIII;
    private boolean IIlllIIlIllIllIlIIll;
    public float IlIlIIIllIllIIIIIllI;
    private int lllIIIIlllllIlIIllIl;
    private lllIIIIlIlIllIIlIIIl IlIlIIIIIIlllIlIllIl;
    private final llIIIIIIlIllIIlIIIll IIllIIllIIIlIlIIIIlI;
    private final lIIlllIlllllIIlllIll IIIlIIIlIlIIlllIIlll;
    private final IIIllIIIlIlIIllIIIlI IlIlIIIlIIlIlIIlllIl;
    private int IlllllllIIIlIIIlIlII;
    private String IIlIIIIlllIlllllIlII;
    private String IIIlIIlIIIIlllIlllII;
    private int IlIlIllllllllIIIIlII;
    private int IIlllIlIIllIlIlIlIIl;
    private int llIIIlIlIllIIlIlIlII;
    private int lllllIlIIIlIlIIlllII;
    private int lIllllllIIllIlIlIlII;
    private long llIIlllIIlllIIllIllI;
    private long IIlllIIIlIlllIIlllII;
    
    static {
        IllIIlllIIIIlllIIlIl = new lIllllIllIllIIllllll("textures/misc/vignette.png");
        llllIIIlIlllIlIIIIIl = new lIllllIllIllIIllllll("textures/gui/widgets.png");
        lIIIIlIIIIIlllIllIII = new lIllllIllIllIIllllll("textures/misc/pumpkinblur.png");
    }
    
    public llIIIlIlIllIIlIlIlII(final Minecraft llIIlIIIlIIIllIlIIIl) {
        this.lIIIlllIIIllIIIllIII = new Random();
        this.llllIIllllIlIlIIIIll = "";
        this.IlIlIIIllIllIIIIIllI = 1.0f;
        this.IIlIIIIlllIlllllIlII = "";
        this.IIIlIIlIIIIlllIlllII = "";
        this.lllllIlIIIlIlIIlllII = 0;
        this.lIllllllIIllIlIlIlII = 0;
        this.llIIlllIIlllIIllIllI = 0L;
        this.IIlllIIIlIlllIIlllII = 0L;
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        this.llIllIlIIIIllIlIIllI = llIIlIIIlIIIllIlIIIl.IllIIlllllIIllIIllIl();
        this.IIllIIllIIIlIlIIIIlI = new llIIIIIIlIllIIlIIIll(llIIlIIIlIIIllIlIIIl);
        this.IIIlIIIlIlIIlllIIlll = new lIIlllIlllllIIlllIll(llIIlIIIlIIIllIlIIIl);
        this.lIlIlIIIllIIllIIIllI = new IllIllIlllIllllIIllI(llIIlIIIlIIIllIlIIIl);
        this.IlIlIIIllIIllIlllllI = new lIllIIlIlIlllllIIIII(llIIlIIIlIIIllIlIIIl);
        this.IlIlIIIlIIlIlIIlllIl = new IIIllIIIlIlIIllIIIlI(llIIlIIIlIIIllIlIIIl, this);
        this.llllIIIIlIIIlIlllIll();
    }
    
    public void llllIIIIlIIIlIlllIll() {
        this.IlIlIllllllllIIIIlII = 10;
        this.IIlllIlIIllIlIlIlIIl = 70;
        this.llIIIlIlIllIIlIlIlII = 20;
    }
    
    public void llllIIIIlIIIlIlllIll(final float n) {
        final g g = new g(this.llIIlIIIlIIIllIlIIIl);
        final int llllIIIIlIIIlIlllIll = g.llllIIIIlIIIlIlllIll();
        final int ilIlIlIlIlllllllllIl = g.IlIlIlIlIlllllllllIl();
        this.llIIlIIIlIIIllIlIIIl.IlIllIlIlIIIlIlIlIII.lIIIlllIIIllIIIllIII();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIlIllllIlllIIIIll()) {
            this.llllIIIIlIIIlIlllIll(this.llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII.b_(n), g);
        }
        else {
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(770, 771, 1, 0);
        }
        final lllIIIIlIlIllIIlIIIl llIllIIIIIllIlIIIIlI = this.llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI(3);
        if (this.llIIlIIIlIIIllIlIIIl.IIIlIIIlIlIIlllIIlll.IIIllIIllIIIIIIlIIlI == 0 && llIllIIIIIllIlIIIIlI != null && llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll() == net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIlllIIlIlllllIIlI)) {
            this.IlIlIIIllIllIIIIIllI(g);
        }
        if (!this.llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI)) {
            final float n2 = this.llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII.llIllIlIIIIllIlIIllI + (this.llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII.llIIlIIIlIIIllIlIIIl - this.llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII.llIllIlIIIIllIlIIllI) * n;
            if (n2 > 0.0f) {
                this.IlIlIlIlIlllllllllIl(n2, g);
            }
        }
        if (this.llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll()) {
            this.IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll(g, n);
        }
        else {
            this.llllIIIIlIIIlIlllIll(g, n);
        }
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
        this.llIIlIIIlIIIllIlIIIl.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(net.minecraft.client.llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
        if (this.IlIlIlIlIlllllllllIl()) {
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(775, 769, 1, 0);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl();
            this.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll / 2 - 7, ilIlIlIlIlllllllllIl / 2 - 7, 0, 0, 16, 16);
        }
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(770, 771, 1, 0);
        this.llIIlIIIlIIIllIlIIIl.llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll("bossHealth");
        if (Leaf.instance.modManager.bossBarMod.lIlIlIIIllIIllIIIllI()) {
            this.llIllIlIIIIllIlIIllI();
        }
        this.llIIlIIIlIIIllIlIIIl.llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl();
        if (this.llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()) {
            this.IlIIIlIlIIIllIlIlIIl(g);
        }
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
        if (this.llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII.u() > 0) {
            this.llIIlIIIlIIIllIlIIIl.llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll("sleep");
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI();
            final int u = this.llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII.u();
            float n3 = u / 100.0f;
            if (n3 > 1.0f) {
                n3 = 1.0f - (u - 100) / 10.0f;
            }
            net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(0, 0, llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl, (int)(220.0f * n3) << 24 | 0x101020);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIIlIIIlIIIllIlIIIl();
            this.llIIlIIIlIIIllIlIIIl.llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl();
        }
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
        final int n4 = llllIIIIlIIIlIlllIll / 2 - 91;
        if (this.llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII.IIIllllllIllIIIlllIl()) {
            this.llllIIIIlIIIlIlllIll(g, n4);
        }
        else if (this.llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl()) {
            this.IlIlIlIlIlllllllllIl(g, n4);
        }
        if (this.llIIlIIIlIIIllIlIIIl.IIIlIIIlIlIIlllIIlll.lIllllllIIllIlIlIlII && !this.llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll()) {
            this.llllIIIIlIIIlIlllIll(g);
        }
        else if (this.llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl()) {
            this.IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll(g);
        }
        if (this.llIIlIIIlIIIllIlIIIl.IIllIIllIIIlIlIIIIlI()) {
            this.IlIlIlIlIlllllllllIl(g);
        }
        if (this.llIIlIIIlIIIllIlIIIl.IIIlIIIlIlIIlllIIlll.IIIIIIIllllIlIIIIIII) {
            this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(g);
        }
        if (this.IlIllIlIlIIIlIlIlIII > 0) {
            this.llIIlIIIlIIIllIlIIIl.llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll("overlayMessage");
            final float n5 = this.IlIllIlIlIIIlIlIlIII - n;
            int n6 = (int)(n5 * 255.0f / 20.0f);
            if (n6 > 255) {
                n6 = 255;
            }
            if (n6 > 8) {
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl((float)(llllIIIIlIIIlIlllIll / 2), (float)(ilIlIlIlIlllllllllIl - 68), 0.0f);
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(770, 771, 1, 0);
                int n7 = 16777215;
                if (this.IIlllIIlIllIllIlIIll) {
                    n7 = (llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n5 / 50.0f, 0.7f, 0.6f) & 0xFFFFFF);
                }
                this.IllIIlllIIIIlllIIlIl().llllIIIIlIIIlIlllIll(this.llllIIllllIlIlIIIIll, -this.IllIIlllIIIIlllIIlIl().llllIIIIlIIIlIlllIll(this.llllIIllllIlIlIIIIll) / 2, -4, n7 + (n6 << 24 & 0xFF000000));
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
            }
            this.llIIlIIIlIIIllIlIIIl.llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl();
        }
        if (this.IlllllllIIIlIIIlIlII > 0) {
            this.llIIlIIIlIIIllIlIIIl.llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll("titleAndSubtitle");
            final float n8 = this.IlllllllIIIlIIIlIlII - n;
            int n9 = 255;
            if (this.IlllllllIIIlIIIlIlII > this.llIIIlIlIllIIlIlIlII + this.IIlllIlIIllIlIlIlIIl) {
                n9 = (int)((this.IlIlIllllllllIIIIlII + this.IIlllIlIIllIlIlIlIIl + this.llIIIlIlIllIIlIlIlII - n8) * 255.0f / this.IlIlIllllllllIIIIlII);
            }
            if (this.IlllllllIIIlIIIlIlII <= this.llIIIlIlIllIIlIlIlII) {
                n9 = (int)(n8 * 255.0f / this.llIIIlIlIllIIlIlIlII);
            }
            final int llllIIIIlIIIlIlllIll2 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n9, 0, 255);
            if (llllIIIIlIIIlIlllIll2 > 8) {
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl((float)(llllIIIIlIIIlIlllIll / 2), (float)(ilIlIlIlIlllllllllIl / 2), 0.0f);
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(770, 771, 1, 0);
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(4.0f, 4.0f, 4.0f);
                final int n10 = llllIIIIlIIIlIlllIll2 << 24 & 0xFF000000;
                this.IllIIlllIIIIlllIIlIl().llllIIIIlIIIlIlllIll(this.IIlIIIIlllIlllllIlII, (float)(-this.IllIIlllIIIIlllIIlIl().llllIIIIlIIIlIlllIll(this.IIlIIIIlllIlllllIlII) / 2), -10.0f, 0xFFFFFF | n10, true);
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(2.0f, 2.0f, 2.0f);
                this.IllIIlllIIIIlllIIlIl().llllIIIIlIIIlIlllIll(this.IIIlIIlIIIIlllIlllII, (float)(-this.IllIIlllIIIIlllIIlIl().llllIIIIlIIIlIlllIll(this.IIIlIIlIIIIlllIlllII) / 2), 5.0f, 0xFFFFFF | n10, true);
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
            }
            this.llIIlIIIlIIIllIlIIIl.llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl();
        }
        final llIIlIIIlIIIllIlIIIl illlIIIIlIIIlIlIlIIl = this.llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl.IlllIIIIlIIIlIlIlIIl();
        lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll3 = null;
        final lIIIlllIIIllIIIllIII illIIlllIIIIlllIIlIl = illlIIIIlIIIlIlIlIIl.IllIIlllIIIIlllIIlIl(this.llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII.s_());
        if (illIIlllIIIIlllIIlIl != null) {
            final int llllIIIIlIIIlIlllIll4 = illIIlllIIIIlllIIlIl.llIllIlIIIIllIlIIllI().llllIIIIlIIIlIlllIll();
            if (llllIIIIlIIIlIlllIll4 >= 0) {
                llllIIIIlIIIlIlllIll3 = illlIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll(3 + llllIIIIlIIIlIlllIll4);
            }
        }
        final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII = (llllIIIIlIIIlIlllIll3 != null) ? llllIIIIlIIIlIlllIll3 : illlIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll(1);
        if (liiiIlIIIIIlllIllIII != null && Leaf.instance.modManager.scoreBoardMod.lIlIlIIIllIIllIIIllI()) {
            this.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII, g);
        }
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(770, 771, 1, 0);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, (float)(ilIlIlIlIlllllllllIl - 48), 0.0f);
        this.llIIlIIIlIIIllIlIIIl.llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll("chat");
        this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(this.IIIIlllIIIIIIlIIIlll);
        this.llIIlIIIlIIIllIlIIIl.llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
        final lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll5 = illlIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll(0);
        if (this.llIIlIIIlIIIllIlIIIl.IIIlIIIlIlIIlllIIlll.IlIIlllllIIllIIlllll.IlIIIlIlIIIllIlIlIIl() && (!this.llIIlIIIlIIIllIlIIIl.lIllllllIIllIlIlIlII() || this.llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI().size() > 1 || llllIIIIlIIIlIlllIll5 != null)) {
            this.IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(true);
            this.IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, illlIIIIlIIIlIlIlIIl, llllIIIIlIIIlIlllIll5);
        }
        else {
            this.IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(false);
        }
        if (!(this.llIIlIIIlIIIllIlIIIl.IIIIlllIIIIIIlIIIlll instanceof ModList)) {
            Leaf.instance.modManager.getMods();
        }
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl();
    }
    
    protected void llllIIIIlIIIlIlllIll(final g g, final float n) {
        if (this.llIIlIIIlIIIllIlIIIl.lIIIIlIlIllllIIlIllI() instanceof net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll) {
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
            this.llIIlIIIlIIIllIlIIIl.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(net.minecraft.client.llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII.llllIIIlIlllIlIIIIIl);
            final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = (net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll)this.llIIlIIIlIIIllIlIIIl.lIIIIlIlIllllIIlIllI();
            final int n2 = g.llllIIIIlIIIlIlllIll() / 2;
            final float ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl;
            this.IlIIIlIlIIIllIlIlIIl = -90.0f;
            this.IlIlIlIlIlllllllllIl(n2 - 91, g.IlIlIlIlIlllllllllIl() - 22, 0, 0, 182, 22);
            this.IlIlIlIlIlllllllllIl(n2 - 91 - 1 + llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI * 20, g.IlIlIlIlIlllllllllIl() - 22 - 1, 0, 22, 24, 22);
            this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIllllllllIIIIlII();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(770, 771, 1, 0);
            lIlIIlllIIlIIlIlllIl.llIllIIIIIllIlIIIIlI();
            for (int i = 0; i < 9; ++i) {
                this.llllIIIIlIIIlIlllIll(i, g.llllIIIIlIIIlIlllIll() / 2 - 90 + i * 20 + 2, g.IlIlIlIlIlllllllllIl() - 16 - 3, n, llllIIIIlIIIlIlllIll);
            }
            lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IIlllIlIIllIlIlIlIIl();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final g g, final int n) {
        this.llIIlIIIlIIIllIlIIIl.llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll("jumpBar");
        this.llIIlIIIlIIIllIlIIIl.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI);
        final float ilIIIlIIIllllIlIlIlI = this.llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII.IlIIIlIIIllllIlIlIlI();
        final int n2 = 182;
        final int n3 = (int)(ilIIIlIIIllllIlIlIlI * (n2 + 1));
        final int n4 = g.IlIlIlIlIlllllllllIl() - 32 + 3;
        this.IlIlIlIlIlllllllllIl(n, n4, 0, 84, n2, 5);
        if (n3 > 0) {
            this.IlIlIlIlIlllllllllIl(n, n4, 0, 89, n3, 5);
        }
        this.llIIlIIIlIIIllIlIIIl.llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl();
    }
    
    public void IlIlIlIlIlllllllllIl(final g g, final int n) {
        this.llIIlIIIlIIIllIlIIIl.llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll("expBar");
        this.llIIlIIIlIIIllIlIIIl.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI);
        if (this.llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII.ap() > 0) {
            final int n2 = 182;
            final int n3 = (int)(this.llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII.N * (n2 + 1));
            final int n4 = g.IlIlIlIlIlllllllllIl() - 32 + 3;
            this.IlIlIlIlIlllllllllIl(n, n4, 0, 64, n2, 5);
            if (n3 > 0) {
                this.IlIlIlIlIlllllllllIl(n, n4, 0, 69, n3, 5);
            }
        }
        this.llIIlIIIlIIIllIlIIIl.llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl();
        if (this.llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII.L > 0) {
            this.llIIlIIIlIIIllIlIIIl.llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll("expLevel");
            int ilIlIlIlIlllllllllIl = 8453920;
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lllIIIIlIlIllIIlIIIl()) {
                ilIlIlIlIlllllllllIl = net.optifine.lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
            }
            final String string = new StringBuilder().append(this.llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII.L).toString();
            final int n5 = (g.llllIIIIlIIIlIlllIll() - this.IllIIlllIIIIlllIIlIl().llllIIIIlIIIlIlllIll(string)) / 2;
            final int n6 = g.IlIlIlIlIlllllllllIl() - 31 - 4;
            this.IllIIlllIIIIlllIIlIl().llllIIIIlIIIlIlllIll(string, n5 + 1, n6, 0);
            this.IllIIlllIIIIlllIIlIl().llllIIIIlIIIlIlllIll(string, n5 - 1, n6, 0);
            this.IllIIlllIIIIlllIIlIl().llllIIIIlIIIlIlllIll(string, n5, n6 + 1, 0);
            this.IllIIlllIIIIlllIIlIl().llllIIIIlIIIlIlllIll(string, n5, n6 - 1, 0);
            this.IllIIlllIIIIlllIIlIl().llllIIIIlIIIlIlllIll(string, n5, n6, ilIlIlIlIlllllllllIl);
            this.llIIlIIIlIIIllIlIIIl.llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl();
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final g g) {
        this.llIIlIIIlIIIllIlIIIl.llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll("selectedItemName");
        if (this.lllIIIIlllllIlIIllIl > 0 && this.IlIlIIIIIIlllIlIllIl != null) {
            String s = this.IlIlIIIIIIlllIlIllIl.IIlllIIlIllIllIlIIll();
            if (this.IlIlIIIIIIlllIlIllIl.IlIlIIIIIIlllIlIllIl()) {
                s = IlllIIIIlIIIlIlIlIIl.IIIlIIIlIlIIlllIIlll + s;
            }
            final int n = (g.llllIIIIlIIIlIlllIll() - this.IllIIlllIIIIlllIIlIl().llllIIIIlIIIlIlllIll(s)) / 2;
            int n2 = g.IlIlIlIlIlllllllllIl() - 59;
            if (!this.llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()) {
                n2 += 14;
            }
            int n3 = (int)(this.lllIIIIlllllIlIIllIl * 256.0f / 10.0f);
            if (n3 > 255) {
                n3 = 255;
            }
            if (n3 > 0) {
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(770, 771, 1, 0);
                this.IllIIlllIIIIlllIIlIl().llllIIIIlIIIlIlllIll(s, (float)n, (float)n2, 16777215 + (n3 << 24));
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
            }
        }
        this.llIIlIIIlIIIllIlIIIl.llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl();
    }
    
    public void IlIlIlIlIlllllllllIl(final g g) {
        this.llIIlIIIlIIIllIlIIIl.llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll("demo");
        String s;
        if (this.llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl.IIIlIIlIIIIlllIlllII() >= 120500L) {
            s = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("demo.demoExpired", new Object[0]);
        }
        else {
            s = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("demo.remainingTime", lIIlIIIIIIIlIIlIlIIl.llllIIIIlIIIlIlllIll((int)(120500L - this.llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl.IIIlIIlIIIIlllIlllII())));
        }
        this.IllIIlllIIIIlllIIlIl().llllIIIIlIIIlIlllIll(s, (float)(g.llllIIIIlIIIlIlllIll() - this.IllIIlllIIIIlllIIlIl().llllIIIIlIIIlIlllIll(s) - 10), 5.0f, 16777215);
        this.llIIlIIIlIIIllIlIIIl.llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl();
    }
    
    protected boolean IlIlIlIlIlllllllllIl() {
        return (!this.llIIlIIIlIIIllIlIIIl.IIIlIIIlIlIIlllIIlll.IIIIIIIllllIlIIIIIII || this.llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII.av() || this.llIIlIIIlIIIllIlIIIl.IIIlIIIlIlIIlllIIlll.IlllllllIIIlIIIlIlII) && (!this.llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll() || this.llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII != null || (this.llIIlIIIlIIIllIlIIIl.IIllIIllIIIlIlIIIIlI != null && this.llIIlIIIlIIIllIlIIIl.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll == lllllIlIlIlllIlllIlI.IlIlIlIlIlllllllllIl && this.llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(this.llIIlIIIlIIIllIlIIIl.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll()) instanceof net.minecraft.llIIlIIIlIIIllIlIIIl.llIIIlIlIllIIlIlIlII));
    }
    
    public void llIllIIIIIllIlIIIIlI(final g g) {
        this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(g.llllIIIIlIIIlIlllIll() - 10, 10);
    }
    
    private void llllIIIIlIIIlIlllIll(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII, final g g) {
        Leaf.instance.modManager.scoreBoardMod.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII, this.IllIIlllIIIIlllIIlIl());
    }
    
    private void IlIIIlIlIIIllIlIlIIl(final g g) {
        if (this.llIIlIIIlIIIllIlIIIl.lIIIIlIlIllllIIlIllI() instanceof net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll) {
            final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = (net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll)this.llIIlIIIlIIIllIlIIIl.lIIIIlIlIllllIIlIllI();
            final int illIIlllIIIIlllIIlIl = llIllIIlllllllllllll.IllIIlllIIIIlllIIlIl(llllIIIIlIIIlIlllIll.N());
            final boolean b = this.IIlllIIIlIlllIIlllII > this.IIIIlllIIIIIIlIIIlll && (this.IIlllIIIlIlllIIlllII - this.IIIIlllIIIIIIlIIIlll) / 3L % 2L == 1L;
            if (illIIlllIIIIlllIIlIl < this.lllllIlIIIlIlIIlllII && llllIIIIlIIIlIlllIll.lIlIIlllIIlIIlIlllIl > 0) {
                this.llIIlllIIlllIIllIllI = Minecraft.IIIllllllIllIIIlllIl();
                this.IIlllIIIlIlllIIlllII = this.IIIIlllIIIIIIlIIIlll + 20;
            }
            else if (illIIlllIIIIlllIIlIl > this.lllllIlIIIlIlIIlllII && llllIIIIlIIIlIlllIll.lIlIIlllIIlIIlIlllIl > 0) {
                this.llIIlllIIlllIIllIllI = Minecraft.IIIllllllIllIIIlllIl();
                this.IIlllIIIlIlllIIlllII = this.IIIIlllIIIIIIlIIIlll + 10;
            }
            if (Minecraft.IIIllllllIllIIIlllIl() - this.llIIlllIIlllIIllIllI > 1000L) {
                this.lllllIlIIIlIlIIlllII = illIIlllIIIIlllIIlIl;
                this.lIllllllIIllIlIlIlII = illIIlllIIIIlllIIlIl;
                this.llIIlllIIlllIIllIllI = Minecraft.IIIllllllIllIIIlllIl();
            }
            this.lllllIlIIIlIlIIlllII = illIIlllIIIIlllIIlIl;
            final int lIllllllIIllIlIlIlII = this.lIllllllIIllIlIlIlII;
            this.lIIIlllIIIllIIIllIII.setSeed(this.IIIIlllIIIIIIlIIIlll * 312871);
            final boolean b2 = false;
            final IllIlIIllIllIIlIllII aq = llllIIIIlIIIlIlllIll.aq();
            final int llllIIIIlIIIlIlllIll2 = aq.llllIIIIlIIIlIlllIll();
            final int ilIlIlIlIlllllllllIl = aq.IlIlIlIlIlllllllllIl();
            final IlIlIIIllIllIIIIIllI llllIIIIlIIIlIlllIll3 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(IlIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll);
            final int n = g.llllIIIIlIIIlIlllIll() / 2 - 91;
            final int n2 = g.llllIIIIlIIIlIlllIll() / 2 + 91;
            final int n3 = g.IlIlIlIlIlllllllllIl() - 39;
            final float n4 = (float)llllIIIIlIIIlIlllIll3.IlIlIIIllIllIIIIIllI();
            final float aj = llllIIIIlIIIlIlllIll.aj();
            final int illIIlllIIIIlllIIlIl2 = llIllIIlllllllllllll.IllIIlllIIIIlllIIlIl((n4 + aj) / 2.0f / 10.0f);
            final int max = Math.max(10 - (illIIlllIIIIlllIIlIl2 - 2), 3);
            final int n5 = n3 - (illIIlllIIIIlllIIlIl2 - 1) * max - 10;
            float n6 = aj;
            final int r = llllIIIIlIIIlIlllIll.R();
            int n7 = -1;
            if (llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI)) {
                n7 = this.IIIIlllIIIIIIlIIIlll % llIllIIlllllllllllll.IllIIlllIIIIlllIIlIl(n4 + 5.0f);
            }
            this.llIIlIIIlIIIllIlIIIl.llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll("armor");
            for (int i = 0; i < 10; ++i) {
                if (r > 0) {
                    final int n8 = n + i * 8;
                    if (i * 2 + 1 < r) {
                        this.IlIlIlIlIlllllllllIl(n8, n5, 34, 9, 9, 9);
                    }
                    if (i * 2 + 1 == r) {
                        this.IlIlIlIlIlllllllllIl(n8, n5, 25, 9, 9, 9);
                    }
                    if (i * 2 + 1 > r) {
                        this.IlIlIlIlIlllllllllIl(n8, n5, 16, 9, 9, 9);
                    }
                }
            }
            this.llIIlIIIlIIIllIlIIIl.llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI("health");
            for (int j = llIllIIlllllllllllll.IllIIlllIIIIlllIIlIl((n4 + aj) / 2.0f) - 1; j >= 0; --j) {
                int n9 = 16;
                if (llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll)) {
                    n9 += 36;
                }
                else if (llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.IlIlIIIlIIlIlIIlllIl)) {
                    n9 += 72;
                }
                int n10 = 0;
                if (b) {
                    n10 = 1;
                }
                final int n11 = llIllIIlllllllllllll.IllIIlllIIIIlllIIlIl((j + 1) / 10.0f) - 1;
                final int n12 = n + j % 10 * 8;
                int n13 = n3 - n11 * max;
                if (illIIlllIIIIlllIIlIl <= 4) {
                    n13 += this.lIIIlllIIIllIIIllIII.nextInt(2);
                }
                if (j == n7) {
                    n13 -= 2;
                }
                int n14 = 0;
                if (llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII.lIllllllIIllIlIlIlII().IlIlIIIIIIlllIlIllIl()) {
                    n14 = 5;
                }
                this.IlIlIlIlIlllllllllIl(n12, n13, 16 + n10 * 9, 9 * n14, 9, 9);
                if (b) {
                    if (j * 2 + 1 < lIllllllIIllIlIlIlII) {
                        this.IlIlIlIlIlllllllllIl(n12, n13, n9 + 54, 9 * n14, 9, 9);
                    }
                    if (j * 2 + 1 == lIllllllIIllIlIlIlII) {
                        this.IlIlIlIlIlllllllllIl(n12, n13, n9 + 63, 9 * n14, 9, 9);
                    }
                }
                if (n6 <= 0.0f) {
                    if (j * 2 + 1 < illIIlllIIIIlllIIlIl) {
                        this.IlIlIlIlIlllllllllIl(n12, n13, n9 + 36, 9 * n14, 9, 9);
                    }
                    if (j * 2 + 1 == illIIlllIIIIlllIIlIl) {
                        this.IlIlIlIlIlllllllllIl(n12, n13, n9 + 45, 9 * n14, 9, 9);
                    }
                }
                else {
                    if (n6 == aj && aj % 2.0f == 1.0f) {
                        this.IlIlIlIlIlllllllllIl(n12, n13, n9 + 153, 9 * n14, 9, 9);
                    }
                    else {
                        this.IlIlIlIlIlllllllllIl(n12, n13, n9 + 144, 9 * n14, 9, 9);
                    }
                    n6 -= 2.0f;
                }
            }
            final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI iiIlIIIlIlIIlllIIlll = llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll;
            if (iiIlIIIlIlIIlllIIlll == null) {
                this.llIIlIIIlIIIllIlIIIl.llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI("food");
                for (int k = 0; k < 10; ++k) {
                    int n15 = n3;
                    int n16 = 16;
                    int n17 = 0;
                    if (llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl)) {
                        n16 += 36;
                        n17 = 13;
                    }
                    if (llllIIIIlIIIlIlllIll.aq().IlIIIlIlIIIllIlIlIIl() <= 0.0f && this.IIIIlllIIIIIIlIIIlll % (llllIIIIlIIIlIlllIll2 * 3 + 1) == 0) {
                        n15 = n3 + (this.lIIIlllIIIllIIIllIII.nextInt(3) - 1);
                    }
                    if (b2) {
                        n17 = 1;
                    }
                    final int n18 = n2 - k * 8 - 9;
                    this.IlIlIlIlIlllllllllIl(n18, n15, 16 + n17 * 9, 27, 9, 9);
                    if (b2) {
                        if (k * 2 + 1 < ilIlIlIlIlllllllllIl) {
                            this.IlIlIlIlIlllllllllIl(n18, n15, n16 + 54, 27, 9, 9);
                        }
                        if (k * 2 + 1 == ilIlIlIlIlllllllllIl) {
                            this.IlIlIlIlIlllllllllIl(n18, n15, n16 + 63, 27, 9, 9);
                        }
                    }
                    if (k * 2 + 1 < llllIIIIlIIIlIlllIll2) {
                        this.IlIlIlIlIlllllllllIl(n18, n15, n16 + 36, 27, 9, 9);
                    }
                    if (k * 2 + 1 == llllIIIIlIIIlIlllIll2) {
                        this.IlIlIlIlIlllllllllIl(n18, n15, n16 + 45, 27, 9, 9);
                    }
                }
            }
            else if (iiIlIIIlIlIIlllIIlll instanceof net.minecraft.llllIIIlIlllIlIIIIIl.lllIIIIlllllIlIIllIl) {
                this.llIIlIIIlIIIllIlIIIl.llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI("mountHealth");
                final net.minecraft.llllIIIlIlllIlIIIIIl.lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl = (net.minecraft.llllIIIlIlllIlIIIIIl.lllIIIIlllllIlIIllIl)iiIlIIIlIlIIlllIIlll;
                final int n19 = (int)Math.ceil(lllIIIIlllllIlIIllIl.N());
                int l = (int)(lllIIIIlllllIlIIllIl.U() + 0.5f) / 2;
                if (l > 30) {
                    l = 30;
                }
                int n20 = n3;
                int n21 = 0;
                while (l > 0) {
                    final int min = Math.min(l, 10);
                    l -= min;
                    for (int n22 = 0; n22 < min; ++n22) {
                        final int n23 = 52;
                        int n24 = 0;
                        if (b2) {
                            n24 = 1;
                        }
                        final int n25 = n2 - n22 * 8 - 9;
                        this.IlIlIlIlIlllllllllIl(n25, n20, n23 + n24 * 9, 9, 9, 9);
                        if (n22 * 2 + 1 + n21 < n19) {
                            this.IlIlIlIlIlllllllllIl(n25, n20, n23 + 36, 9, 9, 9);
                        }
                        if (n22 * 2 + 1 + n21 == n19) {
                            this.IlIlIlIlIlllllllllIl(n25, n20, n23 + 45, 9, 9, 9);
                        }
                    }
                    n20 -= 10;
                    n21 += 20;
                }
            }
            this.llIIlIIIlIIIllIlIIIl.llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI("air");
            if (llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII)) {
                final int llIlllIlllllIIllIIII = this.llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII.llIlllIlllllIIllIIII();
                for (int illIIlllIIIIlllIIlIl3 = llIllIIlllllllllllll.IllIIlllIIIIlllIIlIl((llIlllIlllllIIllIIII - 2) * 10.0 / 300.0), n26 = llIllIIlllllllllllll.IllIIlllIIIIlllIIlIl(llIlllIlllllIIllIIII * 10.0 / 300.0) - illIIlllIIIIlllIIlIl3, n27 = 0; n27 < illIIlllIIIIlllIIlIl3 + n26; ++n27) {
                    if (n27 < illIIlllIIIIlllIIlIl3) {
                        this.IlIlIlIlIlllllllllIl(n2 - n27 * 8 - 9, n5, 16, 18, 9, 9);
                    }
                    else {
                        this.IlIlIlIlIlllllllllIl(n2 - n27 * 8 - 9, n5, 25, 18, 9, 9);
                    }
                }
            }
            this.llIIlIIIlIIIllIlIIIl.llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl();
        }
    }
    
    private void llIllIlIIIIllIlIIllI() {
        Leaf.instance.modManager.bossBarMod.llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl());
    }
    
    private void IlIlIIIllIllIIIIIllI(final g g) {
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(false);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(770, 771, 1, 0);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI();
        this.llIIlIIIlIIIllIlIIIl.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(net.minecraft.client.llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII.lIIIIlIIIIIlllIllIII);
        final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll = IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
        final lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII);
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(0.0, g.IlIlIlIlIlllllllllIl(), -90.0).llllIIIIlIIIlIlllIll(0.0, 1.0).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(g.llllIIIIlIIIlIlllIll(), g.IlIlIlIlIlllllllllIl(), -90.0).llllIIIIlIIIlIlllIll(1.0, 1.0).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(g.llllIIIIlIIIlIlllIll(), 0.0, -90.0).llllIIIIlIIIlIlllIll(1.0, 0.0).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(0.0, 0.0, -90.0).llllIIIIlIIIlIlllIll(0.0, 0.0).IlIlIIIllIllIIIIIllI();
        llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(true);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIIlIIIlIIIllIlIIIl();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
    }
    
    private void llllIIIIlIIIlIlllIll(float llllIIIIlIIIlIlllIll, final g g) {
        if (!llllIIIIlIIIlIlllIll.IIlIlIllllIlllIIIIll()) {
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIIlIIIlIIIllIlIIIl();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(770, 771, 1, 0);
        }
        else {
            llllIIIIlIIIlIlllIll = 1.0f - llllIIIIlIIIlIlllIll;
            llllIIIIlIIIlIlllIll = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, 0.0f, 1.0f);
            final net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI illIllIlllIllllIIllI = this.llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl.IllIllIlllIllllIIllI();
            final float n = (float)illIllIlllIllllIIllI.llllIIIIlIIIlIlllIll(this.llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII);
            final double max = Math.max(illIllIlllIllllIIllI.IIlllIIlIllIllIlIIll(), Math.min(illIllIlllIllllIIllI.llllIIllllIlIlIIIIll() * illIllIlllIllllIIllI.IlIllIlIlIIIlIlIlIII() * 1000.0, Math.abs(illIllIlllIllllIIllI.llIIlIIIlIIIllIlIIIl() - illIllIlllIllllIIllI.lIIIIlIIIIIlllIllIII())));
            float n2;
            if (n < max) {
                n2 = 1.0f - (float)(n / max);
            }
            else {
                n2 = 0.0f;
            }
            this.IlIlIIIllIllIIIIIllI += (float)((llllIIIIlIIIlIlllIll - this.IlIlIIIllIllIIIIIllI) * 0.01);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(false);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(0, 769, 1, 0);
            if (n2 > 0.0f) {
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(0.0f, n2, n2, 1.0f);
            }
            else {
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(this.IlIlIIIllIllIIIIIllI, this.IlIlIIIllIllIIIIIllI, this.IlIlIIIllIllIIIIIllI, 1.0f);
            }
            this.llIIlIIIlIIIllIlIIIl.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(net.minecraft.client.llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII.IllIIlllIIIIlllIIlIl);
            final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll2 = IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
            final lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll2.llIllIIIIIllIlIIIIlI();
            llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII);
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(0.0, g.IlIlIlIlIlllllllllIl(), -90.0).llllIIIIlIIIlIlllIll(0.0, 1.0).IlIlIIIllIllIIIIIllI();
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(g.llllIIIIlIIIlIlllIll(), g.IlIlIlIlIlllllllllIl(), -90.0).llllIIIIlIIIlIlllIll(1.0, 1.0).IlIlIIIllIllIIIIIllI();
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(g.llllIIIIlIIIlIlllIll(), 0.0, -90.0).llllIIIIlIIIlIlllIll(1.0, 0.0).IlIlIIIllIllIIIIIllI();
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(0.0, 0.0, -90.0).llllIIIIlIIIlIlllIll(0.0, 0.0).IlIlIIIllIllIIIIIllI();
            llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(true);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIIlIIIlIIIllIlIIIl();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(770, 771, 1, 0);
        }
    }
    
    private void IlIlIlIlIlllllllllIl(float n, final g g) {
        if (n < 1.0f) {
            n *= n;
            n *= n;
            n = n * 0.8f + 0.2f;
        }
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(false);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(770, 771, 1, 0);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, n);
        this.llIIlIIIlIIIllIlIIIl.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl);
        final IlIlIIIllIIllIlllllI llllIIIIlIIIlIlllIll = this.llIIlIIIlIIIllIlIIIl.IlIIllIIllIIllIIlIIl().llllIIIIlIIIlIlllIll().llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.c.lllIllIIIllllllIllll());
        final float ilIlIIIllIllIIIIIllI = llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI();
        final float llllIIIlIlllIlIIIIIl = llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl();
        final float illIIlllIIIIlllIIlIl = llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl();
        final float liiiIlIIIIIlllIllIII = llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII();
        final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll2 = IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
        final lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll2.llIllIIIIIllIlIIIIlI();
        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII);
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(0.0, g.IlIlIlIlIlllllllllIl(), -90.0).llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, liiiIlIIIIIlllIllIII).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(g.llllIIIIlIIIlIlllIll(), g.IlIlIlIlIlllllllllIl(), -90.0).llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl, liiiIlIIIIIlllIllIII).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(g.llllIIIIlIIIlIlllIll(), 0.0, -90.0).llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl, llllIIIlIlllIlIIIIIl).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(0.0, 0.0, -90.0).llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, llllIIIlIlllIlIIIIIl).IlIlIIIllIllIIIIIllI();
        llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(true);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIIlIIIlIIIllIlIIIl();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
    }
    
    private void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final float n4, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll[n];
        if (lllIIIIlIlIllIIlIIIl != null) {
            final float n5 = lllIIIIlIlIllIIlIIIl.llIllIIIIIllIlIIIIlI - n4;
            if (n5 > 0.0f) {
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
                final float n6 = 1.0f + n5 / 5.0f;
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl((float)(n2 + 8), (float)(n3 + 12), 0.0f);
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(1.0f / n6, (n6 + 1.0f) / 2.0f, 1.0f);
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl((float)(-(n2 + 8)), (float)(-(n3 + 12)), 0.0f);
            }
            this.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl(lllIIIIlIlIllIIlIIIl, n2, n3);
            if (n5 > 0.0f) {
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
            }
            this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(this.llIIlIIIlIIIllIlIIIl.lIlIlIIIllIIllIIIllI, lllIIIIlIlIllIIlIIIl, n2, n3);
        }
    }
    
    public void llIllIIIIIllIlIIIIlI() {
        if (this.IlIllIlIlIIIlIlIlIII > 0) {
            --this.IlIllIlIlIIIlIlIlIII;
        }
        if (this.IlllllllIIIlIIIlIlII > 0) {
            --this.IlllllllIIIlIIIlIlII;
            if (this.IlllllllIIIlIIIlIlII <= 0) {
                this.IIlIIIIlllIlllllIlII = "";
                this.IIIlIIlIIIIlllIlllII = "";
            }
        }
        ++this.IIIIlllIIIIIIlIIIlll;
        this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll();
        if (this.llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII != null) {
            final lllIIIIlIlIllIIlIIIl ilIIIlIlIIIllIlIlIIl = this.llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII.lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl();
            if (ilIIIlIlIIIllIlIlIIl == null) {
                this.lllIIIIlllllIlIIllIl = 0;
            }
            else if (this.IlIlIIIIIIlllIlIllIl != null && ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll() == this.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll() && lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, this.IlIlIIIIIIlllIlIllIl) && (ilIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl() || ilIIIlIlIIIllIlIlIIl.lIIIIlIIIIIlllIllIII() == this.IlIlIIIIIIlllIlIllIl.lIIIIlIIIIIlllIllIII())) {
                if (this.lllIIIIlllllIlIIllIl > 0) {
                    --this.lllIIIIlllllIlIIllIl;
                }
            }
            else {
                this.lllIIIIlllllIlIIllIl = 40;
            }
            this.IlIlIIIIIIlllIlIllIl = ilIIIlIlIIIllIlIlIIl;
            this.lIlIlIIIllIIllIIIllI();
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final String s) {
        this.llllIIIIlIIIlIlllIll(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("record.nowPlaying", s), true);
    }
    
    public void llllIIIIlIIIlIlllIll(final String llllIIllllIlIlIIIIll, final boolean iIlllIIlIllIllIlIIll) {
        this.llllIIllllIlIlIIIIll = llllIIllllIlIlIIIIll;
        this.IlIllIlIlIIIlIlIlIII = 60;
        this.IIlllIIlIllIllIlIIll = iIlllIIlIllIllIlIIll;
    }
    
    public void llllIIIIlIIIlIlllIll(final String iIlIIIIlllIlllllIlII, final String iiIlIIlIIIIlllIlllII, final int ilIlIllllllllIIIIlII, final int iIlllIlIIllIlIlIlIIl, final int llIIIlIlIllIIlIlIlII) {
        if (iIlIIIIlllIlllllIlII == null && iiIlIIlIIIIlllIlllII == null && ilIlIllllllllIIIIlII < 0 && iIlllIlIIllIlIlIlIIl < 0 && llIIIlIlIllIIlIlIlII < 0) {
            this.IIlIIIIlllIlllllIlII = "";
            this.IIIlIIlIIIIlllIlllII = "";
            this.IlllllllIIIlIIIlIlII = 0;
        }
        else if (iIlIIIIlllIlllllIlII != null) {
            this.IIlIIIIlllIlllllIlII = iIlIIIIlllIlllllIlII;
            this.IlllllllIIIlIIIlIlII = this.IlIlIllllllllIIIIlII + this.IIlllIlIIllIlIlIlIIl + this.llIIIlIlIllIIlIlIlII;
        }
        else if (iiIlIIlIIIIlllIlllII != null) {
            this.IIIlIIlIIIIlllIlllII = iiIlIIlIIIIlllIlllII;
        }
        else {
            if (ilIlIllllllllIIIIlII >= 0) {
                this.IlIlIllllllllIIIIlII = ilIlIllllllllIIIIlII;
            }
            if (iIlllIlIIllIlIlIlIIl >= 0) {
                this.IIlllIlIIllIlIlIlIIl = iIlllIlIIllIlIlIlIIl;
            }
            if (llIIIlIlIllIIlIlIlII >= 0) {
                this.llIIIlIlIllIIlIlIlII = llIIIlIlIllIIlIlIlII;
            }
            if (this.IlllllllIIIlIIIlIlII > 0) {
                this.IlllllllIIIlIIIlIlII = this.IlIlIllllllllIIIIlII + this.IIlllIlIIllIlIlIlIIl + this.llIIIlIlIllIIlIlIlII;
            }
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlllllllIIIlIIIlIlII.llIIIIIIlIllIIlIIIll llIIIIIIlIllIIlIIIll, final boolean b) {
        this.llllIIIIlIIIlIlllIll(llIIIIIIlIllIIlIIIll.lIIIIlIIIIIlllIllIII(), b);
    }
    
    public IllIllIlllIllllIIllI IlIIIlIlIIIllIlIlIIl() {
        return this.lIlIlIIIllIIllIIIllI;
    }
    
    public int IlIlIIIllIllIIIIIllI() {
        return this.IIIIlllIIIIIIlIIIlll;
    }
    
    public FontRenderer IllIIlllIIIIlllIIlIl() {
        return this.llIIlIIIlIIIllIlIIIl.lIlIlIIIllIIllIIIllI;
    }
    
    public lIIlllIlllllIIlllIll llllIIIlIlllIlIIIIIl() {
        return this.IIIlIIIlIlIIlllIIlll;
    }
    
    public IIIllIIIlIlIIllIIIlI lIIIIlIIIIIlllIllIII() {
        return this.IlIlIIIlIIlIlIIlllIl;
    }
    
    public void lIIIlllIIIllIIIllIII() {
        this.IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll();
    }
    
    public final IIlllIlIIllIlIlIlIIl llIIlIIIlIIIllIlIIIl() {
        return this.llIllIlIIIIllIlIIllI;
    }
    
    private void lIlIlIIIllIIllIIIllI() {
        if (Leaf.instance.modManager.oldAnimationMod.lIlIlIIIllIIllIIIllI() && this.llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII.f() > 0 && (this.llIIlIIIlIIIllIlIIIl.IIIlIIIlIlIIlllIIlll.llIIIllIlIllIllIIIIl.IlIIIlIlIIIllIlIlIIl() && this.llIIlIIIlIIIllIlIIIl.IIIlIIIlIlIIlllIIlll.lIllIIIIIlllIIlIIllI.IlIIIlIlIIIllIlIlIIl()) && this.llIIlIIIlIIIllIlIIIl.IIllIIllIIIlIlIIIIlI != null && this.llIIlIIIlIIIllIlIIIl.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll == lllllIlIlIlllIlllIlI.IlIlIlIlIlllllllllIl) {
            this.llllIIIIlIIIlIlllIll(this.llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII);
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final net.minecraft.client.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        final int n = llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI) ? (6 - (1 + llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI).llIllIIIIIllIlIIIIlI()) * 1) : (llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl) ? (6 + (1 + llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl).llIllIIIIIllIlIIIIlI()) * 2) : 6);
        if (!llIllIIIIIllIlIIIIlI.IIIIlllIIIIIIlIIIlll || llIllIIIIIllIlIIIIlI.llllIIllllIlIlIIIIll >= n / 2 || llIllIIIIIllIlIIIIlI.llllIIllllIlIlIIIIll < 0) {
            llIllIIIIIllIlIIIIlI.llllIIllllIlIlIIIIll = -1;
            llIllIIIIIllIlIIIIlI.IIIIlllIIIIIIlIIIlll = true;
        }
    }
}
