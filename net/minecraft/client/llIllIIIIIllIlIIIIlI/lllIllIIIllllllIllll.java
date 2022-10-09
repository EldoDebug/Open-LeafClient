package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import leaf.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import leaf.setting.*;
import leaf.font.*;
import net.minecraft.client.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import org.lwjgl.util.glu.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.*;
import net.optifine.*;
import org.lwjgl.opengl.*;
import org.lwjgl.input.*;
import leaf.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.*;
import java.util.*;
import java.awt.*;
import java.net.*;

public class lllIllIIIllllllIllll extends lIIllIIIllllIlllIllI
{
    private float IlIlIIIllIllIIIIIllI;
    private int IllIIlllIIIIlllIIlIl;
    private static final lIllllIllIllIIllllll[] llllIIIlIlllIlIIIIIl;
    private lIllllIllIllIIllllll lIIIIlIIIIIlllIllIII;
    private ArrayList lIIIlllIIIllIIIllIII;
    
    static {
        llllIIIlIlllIlIIIIIl = new lIllllIllIllIIllllll[] { new lIllllIllIllIIllllll("client/panorama_0.png"), new lIllllIllIllIIllllll("client/panorama_1.png"), new lIllllIllIllIIllllll("client/panorama_2.png"), new lIllllIllIllIIllllll("client/panorama_3.png"), new lIllllIllIllIIllllll("client/panorama_4.png"), new lIllllIllIllIIllllll("client/panorama_5.png") };
    }
    
    public lllIllIIIllllllIllll() {
        this.lIIIlllIIIllIIIllIII = new ArrayList();
        Leaf.instance.setDiscordStatus();
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        ++this.IllIIlllIIIIlllIIlIl;
    }
    
    @Override
    public boolean IllIIlllIIIIlllIIlIl() {
        return false;
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final char c, final int n) {
    }
    
    @Override
    public void n_() {
        this.lIIIIlIIIIIlllIllIII = this.IlIlIIIllIIllIlllllI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll("background", new IlIlIlIlIlllllllllIl(256, 256));
        final g g = new g(this.IlIlIIIllIIllIlllllI);
        final int n = (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth();
        final int n2 = (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight();
        Setting.llllIIIIlIIIlIlllIll(g.IlIlIIIllIllIIIIIllI(), (n / g.IlIlIIIllIllIIIIIllI() > g.llllIIIIlIIIlIlllIll()) ? (g.llllIIIIlIIIlIlllIll() / (n / (double)g.IlIlIIIllIllIIIIIllI())) : 1.0, (n2 / g.IlIlIIIllIllIIIIIllI() > g.IlIlIlIlIlllllllllIl()) ? (g.IlIlIlIlIlllllllllIl() / (n2 / (double)g.IlIlIIIllIllIIIIIllI())) : 1.0, (n < 1920) ? (n / 1920.0) : 1.0, (n2 < 1080) ? (n2 / 1080.0) : 1.0);
        LoadFont.minecraftFontRenderer.llllIIIIlIIIlIlllIll(Setting.llllIIIIlIIIlIlllIll());
        this.lIIIlllIIIllIIIllIII.add(new llllIIIlIlllIlIIIIIl("single", 760, 550, 400, 80));
        this.lIIIlllIIIllIIIllIII.add(new llllIIIlIlllIlIIIIIl("multi", 760, 670, 400, 80));
        this.lIIIlllIIIllIIIllIII.add(new llllIIIlIlllIlIIIIIl("account", 760, 790, 185, 80));
        this.lIIIlllIIIllIIIllIII.add(new llllIIIlIlllIlIIIIIl("settings", 975, 790, 185, 80));
        this.lIIIlllIIIllIIIllIII.add(new llllIIIlIlllIlIIIIIl("close", 1820, 20, 80, 80));
        this.lIIIlllIIIllIIIllIII.add(new lIIIlllIIIllIIIllIII(Minecraft.getMinecraft().IIIIIllIIIIlIIIIllIl(), 5, 5));
    }
    
    private void IlIlIlIlIlllllllllIl(final int n, final int n2, final float n3) {
        final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll = IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
        final net.minecraft.client.lIIIlllIIIllIIIllIII.lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
        lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5889);
        lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
        lllllIlIIIlIlIIlllII.llIIIlIlIllIIlIlIlII();
        Project.gluPerspective(120.0f, 1.0f, 0.05f, 10.0f);
        lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5888);
        lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
        lllllIlIIIlIlIIlllII.llIIIlIlIllIIlIlIlII();
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(180.0f, 1.0f, 0.0f, 0.0f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(90.0f, 0.0f, 0.0f, 1.0f);
        lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI();
        lllllIlIIIlIlIIlllII.IlIllIlIlIIIlIlIlIII();
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(false);
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(770, 771, 1, 0);
        final int n4 = 8;
        int llIllIIIIIllIlIIIIlI2 = 64;
        final IlIIIlIIIllllIlIlIlI llllIIIIlIIIlIlllIll2 = IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll();
        if (llllIIIIlIIIlIlllIll2 != null) {
            llIllIIIIIllIlIIIIlI2 = llllIIIIlIIIlIlllIll2.llIllIIIIIllIlIIIIlI();
        }
        for (int i = 0; i < llIllIIIIIllIlIIIIlI2; ++i) {
            lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl((i % n4 / (float)n4 - 0.5f) / 64.0f, (i / n4 / (float)n4 - 0.5f) / 64.0f, 0.0f);
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(llIllIIlllllllllllll.llllIIIIlIIIlIlllIll((this.IllIIlllIIIIlllIIlIl + n3) / 400.0f) * 25.0f + 20.0f, 1.0f, 0.0f, 0.0f);
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-(this.IllIIlllIIIIlllIIlIl + n3) * 0.1f, 0.0f, 1.0f, 0.0f);
            for (int j = 0; j < 6; ++j) {
                lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
                if (j == 1) {
                    lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(90.0f, 0.0f, 1.0f, 0.0f);
                }
                if (j == 2) {
                    lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(180.0f, 0.0f, 1.0f, 0.0f);
                }
                if (j == 3) {
                    lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-90.0f, 0.0f, 1.0f, 0.0f);
                }
                if (j == 4) {
                    lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(90.0f, 1.0f, 0.0f, 0.0f);
                }
                if (j == 5) {
                    lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-90.0f, 1.0f, 0.0f, 0.0f);
                }
                lIllllIllIllIIllllll[] array = lllIllIIIllllllIllll.llllIIIlIlllIlIIIIIl;
                if (llllIIIIlIIIlIlllIll2 != null) {
                    array = llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll();
                }
                this.IlIlIIIllIIllIlllllI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(array[j]);
                llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI);
                final int n5 = 255 / (i + 1);
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(-1.0, -1.0, 1.0).llllIIIIlIIIlIlllIll(0.0, 0.0).IlIlIlIlIlllllllllIl(255, 255, 255, n5).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(1.0, -1.0, 1.0).llllIIIIlIIIlIlllIll(1.0, 0.0).IlIlIlIlIlllllllllIl(255, 255, 255, n5).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(1.0, 1.0, 1.0).llllIIIIlIIIlIlllIll(1.0, 1.0).IlIlIlIlIlllllllllIl(255, 255, 255, n5).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(-1.0, 1.0, 1.0).llllIIIIlIIIlIlllIll(0.0, 1.0).IlIlIlIlIlllllllllIl(255, 255, 255, n5).IlIlIIIllIllIIIIIllI();
                llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
                lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
            }
            lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(true, true, true, false);
        }
        llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI(0.0, 0.0, 0.0);
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(true, true, true, true);
        lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5889);
        lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
        lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5888);
        lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(true);
        lllllIlIIIlIlIIlllII.llllIIllllIlIlIIIIll();
        lllllIlIIIlIlIIlllII.llIIlIIIlIIIllIlIIIl();
    }
    
    private void llllIIIIlIIIlIlllIll(final float n) {
        this.IlIlIIIllIIllIlllllI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII);
        GL11.glTexParameteri(3553, 10241, 9729);
        GL11.glTexParameteri(3553, 10240, 9729);
        GL11.glCopyTexSubImage2D(3553, 0, 0, 0, 0, 0, 256, 256);
        lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(770, 771, 1, 0);
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(true, true, true, false);
        final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll = IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
        final net.minecraft.client.lIIIlllIIIllIIIllIII.lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI);
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI();
        final int n2 = 3;
        int ilIIIlIlIIIllIlIlIIl = 3;
        final IlIIIlIIIllllIlIlIlI llllIIIIlIIIlIlllIll2 = IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll();
        if (llllIIIIlIIIlIlllIll2 != null) {
            ilIIIlIlIIIllIlIlIIl = llllIIIIlIIIlIlllIll2.IlIIIlIlIIIllIlIlIIl();
        }
        for (int i = 0; i < ilIIIlIlIIIllIlIlIIl; ++i) {
            final float n3 = 1.0f / (i + 1);
            final int llllIIllllIlIlIIIIll = this.llllIIllllIlIlIIIIll;
            final int ilIllIlIlIIIlIlIlIII = this.IlIllIlIlIIIlIlIlIII;
            final float n4 = (i - n2 / 2) / 256.0f;
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIllllIlIlIIIIll, ilIllIlIlIIIlIlIlIII, (double)this.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll(0.0f + n4, 1.0).llllIIIIlIIIlIlllIll(1.0f, 1.0f, 1.0f, n3).IlIlIIIllIllIIIIIllI();
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIllllIlIlIIIIll, 0.0, this.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll(1.0f + n4, 1.0).llllIIIIlIIIlIlllIll(1.0f, 1.0f, 1.0f, n3).IlIlIIIllIllIIIIIllI();
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(0.0, 0.0, this.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll(1.0f + n4, 0.0).llllIIIIlIIIlIlllIll(1.0f, 1.0f, 1.0f, n3).IlIlIIIllIllIIIIIllI();
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(0.0, ilIllIlIlIIIlIlIlIII, this.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll(0.0f + n4, 0.0).llllIIIIlIIIlIlllIll(1.0f, 1.0f, 1.0f, n3).IlIlIIIllIllIIIIIllI();
        }
        llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
        lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl();
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(true, true, true, true);
    }
    
    private void llIllIIIIIllIlIIIIlI(final int n, final int n2, final float n3) {
        this.IlIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl().IlIlIIIllIllIIIIIllI();
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0, 0, 256, 256);
        this.IlIlIlIlIlllllllllIl(n, n2, n3);
        this.llllIIIIlIIIlIlllIll(n3);
        int ilIlIIIllIllIIIIIllI = 3;
        final IlIIIlIIIllllIlIlIlI llllIIIIlIIIlIlllIll = IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll();
        if (llllIIIIlIIIlIlllIll != null) {
            ilIlIIIllIllIIIIIllI = llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI();
        }
        for (int i = 0; i < ilIlIIIllIllIIIIIllI; ++i) {
            this.llllIIIIlIIIlIlllIll(n3);
            this.llllIIIIlIIIlIlllIll(n3);
        }
        this.IlIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(true);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0, 0, this.IlIlIIIllIIllIlllllI.IlIIIlIlIIIllIlIlIIl, this.IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI);
        final float n4 = (this.llllIIllllIlIlIIIIll > this.IlIllIlIlIIIlIlIlIII) ? (120.0f / this.llllIIllllIlIlIIIIll) : (120.0f / this.IlIllIlIlIIIlIlIlIII);
        final float n5 = this.IlIllIlIlIIIlIlIlIII * n4 / 256.0f;
        final float n6 = this.llllIIllllIlIlIIIIll * n4 / 256.0f;
        final int llllIIllllIlIlIIIIll = this.llllIIllllIlIlIIIIll;
        final int ilIllIlIlIIIlIlIlIII = this.IlIllIlIlIIIlIlIlIII;
        final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll2 = IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
        final net.minecraft.client.lIIIlllIIIllIIIllIII.lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll2.llIllIIIIIllIlIIIIlI();
        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI);
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(0.0, ilIllIlIlIIIlIlIlIII, this.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll(0.5f - n5, 0.5f + n6).llllIIIIlIIIlIlllIll(1.0f, 1.0f, 1.0f, 1.0f).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIllllIlIlIIIIll, ilIllIlIlIIIlIlIlIII, (double)this.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll(0.5f - n5, 0.5f - n6).llllIIIIlIIIlIlllIll(1.0f, 1.0f, 1.0f, 1.0f).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIllllIlIlIIIIll, 0.0, this.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll(0.5f + n5, 0.5f - n6).llllIIIIlIIIlIlllIll(1.0f, 1.0f, 1.0f, 1.0f).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(0.0, 0.0, this.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll(0.5f + n5, 0.5f + n6).llllIIIIlIIIlIlllIll(1.0f, 1.0f, 1.0f, 1.0f).IlIlIIIllIllIIIIIllI();
        llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl();
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3) {
        GL11.glDisable(3008);
        this.llIllIIIIIllIlIIIIlI(n, n2, n3);
        GL11.glEnable(3008);
        this.llllIIIIlIIIlIlllIll(Mouse.getX() * this.llllIIllllIlIlIIIIll / this.IlIlIIIllIIllIlllllI.IlIIIlIlIIIllIlIlIIl, this.IlIllIlIlIIIlIlIlIII - Mouse.getY() * this.IlIllIlIlIIIlIlIlIII / this.IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI - 1);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.IlIlIIIllIIllIlllllI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(new lIllllIllIllIIllllll("client/leaf.png"));
        net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.llllIIllllIlIlIIIIll / 2 - Setting.llllIIIIlIIIlIlllIll(200), this.IlIllIlIlIIIlIlIlIII / 2 - Setting.IlIlIlIlIlllllllllIl(290), 0.0f, 0.0f, Setting.llllIIIIlIIIlIlllIll(400), Setting.IlIlIlIlIlllllllllIl(320), (float)Setting.llllIIIIlIIIlIlllIll(400), (float)Setting.IlIlIlIlIlllllllllIl(320));
        this.IlIlIIIllIIllIlllllI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(new lIllllIllIllIIllllll("client/discord.png"));
        net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(5, this.IlIllIlIlIIIlIlIlIII - 25, 0.0f, 0.0f, 20, 20, 20.0f, 20.0f);
        this.IlIlIIIllIIllIlllllI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(new lIllllIllIllIIllllll("client/twitter.png"));
        net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(30, this.IlIllIlIlIIIlIlIlIII - 25, 0.0f, 0.0f, 20, 20, 20.0f, 20.0f);
        this.IlIlIIIllIIllIlllllI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(new lIllllIllIllIIllllll("client/yt.png"));
        net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(55, this.IlIllIlIlIIIlIlIlIII - 25, 0.0f, 0.0f, 20, 20, 20.0f, 20.0f);
        final String s = "Copyright Mojang Studio.";
        LoadFont.minecraftFontRenderer.IlIlIlIlIlllllllllIl(s, this.llllIIllllIlIlIIIIll - LoadFont.minecraftFontRenderer.llllIIIIlIIIlIlllIll(s) - 5.0, (float)(this.IlIllIlIlIIIlIlIlIII - Setting.IlIlIlIlIlllllllllIl(30)), -1);
        final Iterator<llIIlIIIlIIIllIlIIIl> iterator = this.lIIIlllIIIllIIIllIII.iterator();
        while (iterator.hasNext()) {
            iterator.next().IlIlIlIlIlllllllllIl();
        }
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
        final Iterator<llIIlIIIlIIIllIlIIIl> iterator = this.lIIIlllIIIllIIIllIII.iterator();
        while (iterator.hasNext()) {
            iterator.next().llllIIIIlIIIlIlllIll(n, n2, n3);
        }
        try {
            if (n >= 5 && n <= 25 && n2 >= this.IlIllIlIlIIIlIlIlIII - 25 && n2 <= this.IlIllIlIlIIIlIlIlIII - 5) {
                Desktop.getDesktop().browse(new URI("https://discord.gg/eJtRwnhxdY"));
            }
            if (n >= 30 && n <= 50 && n2 >= this.IlIllIlIlIIIlIlIlIII - 25 && n2 <= this.IlIllIlIlIIIlIlIlIII - 5) {
                Desktop.getDesktop().browse(new URI("https://twitter.com/Leaf_Client"));
            }
            if (n >= 55 && n <= 75 && n2 >= this.IlIllIlIlIIIlIlIlIII - 25 && n2 <= this.IlIllIlIlIIIlIlIlIII - 5) {
                Desktop.getDesktop().browse(new URI("https://www.youtube.com/c/Lefiy_MC"));
            }
        }
        catch (Exception ex) {}
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final Minecraft minecraft, final int n, final int n2) {
        this.lIIIlllIIIllIIIllIII.clear();
        super.llllIIIIlIIIlIlllIll(minecraft, n, n2);
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final int n2) {
        final Iterator<llIIlIIIlIIIllIlIIIl> iterator = this.lIIIlllIIIllIIIllIII.iterator();
        while (iterator.hasNext()) {
            iterator.next().llllIIIIlIIIlIlllIll(n, n2);
        }
    }
}
