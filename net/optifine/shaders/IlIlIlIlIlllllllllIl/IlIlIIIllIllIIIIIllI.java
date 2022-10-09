package net.optifine.shaders.IlIlIlIlIlllllllllIl;

import net.minecraft.client.llIllIlIIIIllIlIIllI.*;
import net.optifine.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import net.optifine.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;
import java.util.*;
import java.net.*;
import java.io.*;
import org.lwjgl.*;
import net.optifine.shaders.*;
import net.minecraft.client.*;

public class IlIlIIIllIllIIIIIllI extends lIlIlIIIllIIllIIIllI
{
    protected lIIllIIIllllIlllIllI IlIlIIIllIllIIIIIllI;
    protected String IllIIlllIIIIlllIIlIl;
    private IIIIlllIIIIIIlIIIlll lIlIlIIIllIIllIIIllI;
    private int IIIlIIIlIlIIlllIIlll;
    private llllIIIlIlllIlIIIIIl IlIlIIIlIIlIlIIlllIl;
    private boolean IlllllllIIIlIIIlIlII;
    private static float[] IIlIIIIlllIlllllIlII;
    private static String[] IIIlIIlIIIIlllIlllII;
    private static float IlIlIllllllllIIIIlII;
    private static float[] IIlllIlIIllIlIlIlIIl;
    private static String[] llIIIlIlIllIIlIlIlII;
    private static float lllllIlIIIlIlIIlllII;
    public static final int llllIIIlIlllIlIIIIIl = 0;
    public static final int lIIIIlIIIIIlllIllIII = 1;
    public static final int lIIIlllIIIllIIIllIII = 2;
    public static final int llIIlIIIlIIIllIlIIIl = 3;
    public static final int llIllIlIIIIllIlIIllI = 4;
    private static volatile /* synthetic */ int[] lIllllllIIllIlIlIlII;
    
    static {
        IlIlIIIllIllIIIIIllI.IIlIIIIlllIlllllIlII = new float[] { 0.5f, 0.6f, 0.6666667f, 0.75f, 0.8333333f, 0.9f, 1.0f, 1.1666666f, 1.3333334f, 1.5f, 1.6666666f, 1.8f, 2.0f };
        IlIlIIIllIllIIIIIllI.IIIlIIlIIIIlllIlllII = new String[] { "0.5x", "0.6x", "0.66x", "0.75x", "0.83x", "0.9x", "1x", "1.16x", "1.33x", "1.5x", "1.66x", "1.8x", "2x" };
        IlIlIIIllIllIIIIIllI.IlIlIllllllllIIIIlII = 1.0f;
        IlIlIIIllIllIIIIIllI.IIlllIlIIllIlIlIlIIl = new float[] { 0.0625f, 0.125f, 0.25f };
        IlIlIIIllIllIIIIIllI.llIIIlIlIllIIlIlIlII = new String[] { "0.5x", "1x", "2x" };
        IlIlIIIllIllIIIIIllI.lllllIlIIIlIlIIlllII = 0.125f;
    }
    
    public IlIlIIIllIllIIIIIllI(final lIIllIIIllllIlllIllI ilIlIIIllIllIIIIIllI, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        this.IllIIlllIIIIlllIIlIl = "Shaders";
        this.lIlIlIIIllIIllIIIllI = new IIIIlllIIIIIIlIIIlll(this, new IlIllIlIlIIIlIlIlIII());
        this.IIIlIIIlIlIIlllIIlll = -1;
        this.IlllllllIIIlIIIlIlII = false;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    @Override
    public void n_() {
        this.IllIIlllIIIIlllIIlIl = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("of.options.shadersTitle", new Object[0]);
        if (llIIlllIIlllIIllIllI.bQ == null) {
            llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll();
        }
        final int n = 120;
        final int n2 = 20;
        final int n3 = this.llllIIllllIlIlIIIIll - n - 10;
        final int n4 = 30;
        final int n5 = 20;
        final int n6 = this.llllIIllllIlIlIIIIll - n - 20;
        (this.IlIlIIIlIIlIlIIlllIl = new llllIIIlIlllIlIIIIIl(this, n6, this.IlIllIlIlIIIlIlIlIII, n4, this.IlIllIlIlIIIlIlIlIII - 50, 16)).IlIIIlIlIIIllIlIlIIl(7, 8);
        this.IIlllIIlIllIllIlIIll.add(new IlIlIlIlIlllllllllIl(net.optifine.shaders.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll, n3, 0 * n5 + n4, n, n2));
        this.IIlllIIlIllIllIlIIll.add(new IlIlIlIlIlllllllllIl(net.optifine.shaders.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl, n3, 1 * n5 + n4, n, n2));
        this.IIlllIIlIllIllIlIIll.add(new IlIlIlIlIlllllllllIl(net.optifine.shaders.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI, n3, 2 * n5 + n4, n, n2));
        this.IIlllIIlIllIllIlIIll.add(new IlIlIlIlIlllllllllIl(net.optifine.shaders.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl, n3, 3 * n5 + n4, n, n2));
        this.IIlllIIlIllIllIlIIll.add(new IlIlIlIlIlllllllllIl(net.optifine.shaders.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI, n3, 4 * n5 + n4, n, n2));
        this.IIlllIIlIllIllIlIIll.add(new IlIlIlIlIlllllllllIl(net.optifine.shaders.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl, n3, 5 * n5 + n4, n, n2));
        this.IIlllIIlIllIllIlIIll.add(new IlIlIlIlIlllllllllIl(net.optifine.shaders.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII, n3, 6 * n5 + n4, n, n2));
        this.IIlllIIlIllIllIlIIll.add(new IlIlIlIlIlllllllllIl(net.optifine.shaders.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII, n3, 7 * n5 + n4, n, n2));
        final int min = Math.min(150, n6 / 2 - 10);
        final int n7 = n6 / 4 - min / 2;
        final int n8 = this.IlIllIlIlIIIlIlIlIII - 25;
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(201, n7, n8, min - 22 + 1, n2, IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll("of.options.shaders.shadersFolder")));
        this.IIlllIIlIllIllIlIIll.add(new net.optifine.shaders.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(210, n7 + min - 22 - 1, n8));
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(202, n6 / 4 * 3 - min / 2, this.IlIllIlIlIIIlIlIlIII - 25, min, n2, net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("gui.done", new Object[0])));
        this.IIlllIIlIllIllIlIIll.add(new IlIIIlIlIIIllIlIlIIl(203, n3, this.IlIllIlIlIIIlIlIlIII - 25, n, n2, IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll("of.options.shaders.shaderOptions")));
        this.IlIlIIIllIllIIIIIllI();
    }
    
    public void IlIlIIIllIllIIIIIllI() {
        final boolean b = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b();
        for (final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl : this.IIlllIIlIllIllIlIIll) {
            if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI != 201 && ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI != 202 && ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI != 210 && ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI != net.optifine.shaders.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.ordinal()) {
                ilIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI = b;
            }
        }
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl() {
        super.IlIlIlIlIlllllllllIl();
        this.IlIlIIIlIIlIlIIlllIl.lIIIIlIIIIIlllIllIII();
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        this.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, false);
    }
    
    @Override
    protected void IlIlIlIlIlllllllllIl(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        this.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, true);
    }
    
    private void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final boolean b) {
        if (ilIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI) {
            if (!(ilIIIlIlIIIllIlIlIIl instanceof IlIlIlIlIlllllllllIl)) {
                if (!b) {
                    switch (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI) {
                        case 201: {
                            switch (lIIIIlIIIIIlllIllIII()) {
                                case 1: {
                                    final String format = String.format("cmd.exe /C start \"Open file\" \"%s\"", llIIlllIIlllIIllIllI.cA.getAbsolutePath());
                                    try {
                                        Runtime.getRuntime().exec(format);
                                        return;
                                    }
                                    catch (IOException ex) {
                                        ex.printStackTrace();
                                        break;
                                    }
                                }
                                case 2: {
                                    try {
                                        Runtime.getRuntime().exec(new String[] { "/usr/bin/open", llIIlllIIlllIIllIllI.cA.getAbsolutePath() });
                                        return;
                                    }
                                    catch (IOException ex2) {
                                        ex2.printStackTrace();
                                    }
                                    break;
                                }
                            }
                            boolean b2 = false;
                            try {
                                final Class<?> forName = Class.forName("java.awt.Desktop");
                                forName.getMethod("browse", URI.class).invoke(forName.getMethod("getDesktop", (Class<?>[])new Class[0]).invoke(null, new Object[0]), new File(this.IlIlIIIllIIllIlllllI.mcDataDir, "shaderpacks").toURI());
                            }
                            catch (Throwable t) {
                                t.printStackTrace();
                                b2 = true;
                            }
                            if (b2) {
                                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl("Opening via system class!");
                                Sys.openURL("file://" + llIIlllIIlllIIllIllI.cA.getAbsolutePath());
                            }
                            return;
                        }
                        case 202: {
                            llIIlllIIlllIIllIllI.IlIlIlIlIlllllllllIl();
                            this.IlllllllIIIlIIIlIlII = true;
                            this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(this.IlIlIIIllIllIIIIIllI);
                            return;
                        }
                        case 203: {
                            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI().llllIIIIlIIIlIlllIll(new net.optifine.shaders.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl(this, net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.c()));
                            return;
                        }
                        case 210: {
                            try {
                                final Class<?> forName2 = Class.forName("java.awt.Desktop");
                                forName2.getMethod("browse", URI.class).invoke(forName2.getMethod("getDesktop", (Class<?>[])new Class[0]).invoke(null, new Object[0]), new URI("http://optifine.net/shaderPacks"));
                            }
                            catch (Throwable t2) {
                                t2.printStackTrace();
                            }
                            break;
                        }
                    }
                    this.IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl);
                }
            }
            else {
                final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = (IlIlIlIlIlllllllllIl)ilIIIlIlIIIllIlIlIIl;
                switch (IIlllIIlIllIllIlIIll()[ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI().ordinal()]) {
                    case 1: {
                        llIIlllIIlllIIllIllI.IlIlIlIlIlllllllllIl(!b);
                        if (this.lIIIlllIIIllIIIllIII()) {
                            llIIlllIIlllIIllIllI.cn = 0;
                        }
                        llIIlllIIlllIIllIllI.IlllllllIIIlIIIlIlII();
                        break;
                    }
                    case 2: {
                        llIIlllIIlllIIllIllI.cj = !llIIlllIIlllIIllIllI.cj;
                        if (this.lIIIlllIIIllIIIllIII()) {
                            llIIlllIIlllIIllIllI.cj = true;
                        }
                        llIIlllIIlllIIllIllI.IlllllllIIIlIIIlIlII();
                        this.IlIlIIIllIIllIlllllI.IlIlIllllllllIIIIlII();
                        break;
                    }
                    case 3: {
                        llIIlllIIlllIIllIllI.ck = !llIIlllIIlllIIllIllI.ck;
                        if (this.lIIIlllIIIllIIIllIII()) {
                            llIIlllIIlllIIllIllI.ck = true;
                        }
                        llIIlllIIlllIIllIllI.IlllllllIIIlIIIlIlII();
                        this.IlIlIIIllIIllIlllllI.IlIlIllllllllIIIIlII();
                        break;
                    }
                    case 4: {
                        llIIlllIIlllIIllIllI.ca = this.llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI.ca, net.optifine.shaders.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI.IIlIIIIlllIlllllIlII, net.optifine.shaders.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI.IlIlIllllllllIIIIlII, !b, this.lIIIlllIIIllIIIllIII());
                        llIIlllIIlllIIllIllI.IlllllllIIIlIIIlIlII();
                        llIIlllIIlllIIllIllI.IIlIIIIlllIlllllIlII();
                        break;
                    }
                    case 5: {
                        llIIlllIIlllIIllIllI.cb = this.llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI.cb, net.optifine.shaders.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI.IIlIIIIlllIlllllIlII, net.optifine.shaders.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI.IlIlIllllllllIIIIlII, !b, this.lIIIlllIIIllIIIllIII());
                        llIIlllIIlllIIllIllI.IlllllllIIIlIIIlIlII();
                        llIIlllIIlllIIllIllI.IIIlIIlIIIIlllIlllII();
                        break;
                    }
                    case 6: {
                        llIIlllIIlllIIllIllI.bZ = this.llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI.bZ, net.optifine.shaders.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI.IIlllIlIIllIlIlIlIIl, net.optifine.shaders.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI.lllllIlIIIlIlIIlllII, !b, this.lIIIlllIIIllIIIllIII());
                        llIIlllIIlllIIllIllI.IlllllllIIIlIIIlIlII();
                        break;
                    }
                    case 8: {
                        llIIlllIIlllIIllIllI.cm.llllIIIIlIIIlIlllIll(!b);
                        if (this.lIIIlllIIIllIIIllIII()) {
                            llIIlllIIlllIIllIllI.cm.IllIIlllIIIIlllIIlIl();
                        }
                        llIIlllIIlllIIllIllI.IlllllllIIIlIIIlIlII();
                        break;
                    }
                    case 9: {
                        llIIlllIIlllIIllIllI.cl.llllIIIIlIIIlIlllIll(!b);
                        if (this.lIIIlllIIIllIIIllIII()) {
                            llIIlllIIlllIIllIllI.cl.IllIIlllIIIIlllIIlIl();
                        }
                        llIIlllIIlllIIllIllI.lIIIIlIIIIIlllIllIII();
                        llIIlllIIlllIIllIllI.IlllllllIIIlIIIlIlII();
                        this.IlIlIIIllIIllIlllllI.IlIlIllllllllIIIIlII();
                        break;
                    }
                    case 11: {
                        llIIlllIIlllIIllIllI.bX = !llIIlllIIlllIIllIllI.bX;
                        break;
                    }
                    case 7: {
                        llIIlllIIlllIIllIllI.bY = !llIIlllIIlllIIllIllI.bY;
                        break;
                    }
                    case 13: {
                        llIIlllIIlllIIllIllI.cc = (llIIlllIIlllIIllIllI.cc + 1) % 3;
                        llIIlllIIlllIIllIllI.cd = (llIIlllIIlllIIllIllI.ce = llIIlllIIlllIIllIllI.cc);
                        ilIIIlIlIIIllIlIlIIl.llIIlIIIlIIIllIlIIIl = "Tex Min: " + llIIlllIIlllIIllIllI.cq[llIIlllIIlllIIllIllI.cc];
                        IIlIIIIIllIlIIIlIIll.IlIlIlIlIlllllllllIl();
                        break;
                    }
                    case 17: {
                        llIIlllIIlllIIllIllI.cg = (llIIlllIIlllIIllIllI.cg + 1) % 2;
                        ilIIIlIlIIIllIlIlIIl.llIIlIIIlIIIllIlIIIl = "Tex_n Mag: " + llIIlllIIlllIIllIllI.cr[llIIlllIIlllIIllIllI.cg];
                        IIlIIIIIllIlIIIlIIll.IlIlIlIlIlllllllllIl();
                        break;
                    }
                    case 18: {
                        llIIlllIIlllIIllIllI.ch = (llIIlllIIlllIIllIllI.ch + 1) % 2;
                        ilIIIlIlIIIllIlIlIIl.llIIlIIIlIIIllIlIIIl = "Tex_s Mag: " + llIIlllIIlllIIllIllI.cr[llIIlllIIlllIIllIllI.ch];
                        IIlIIIIIllIlIIIlIIll.IlIlIlIlIlllllllllIl();
                        break;
                    }
                    case 12: {
                        llIIlllIIlllIIllIllI.ci = !llIIlllIIlllIIllIllI.ci;
                        ilIIIlIlIIIllIlIlIIl.llIIlIIIlIIIllIlIIIl = "ShadowClipFrustrum: " + llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI.ci);
                        IIlIIIIIllIlIIIlIIll.IlIlIlIlIlllllllllIl();
                        break;
                    }
                }
                ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl();
            }
        }
    }
    
    @Override
    public void o_() {
        super.o_();
        if (!this.IlllllllIIIlIIIlIlII) {
            llIIlllIIlllIIllIllI.IlIlIlIlIlllllllllIl();
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3) {
        this.IlIlIIIllIIllIlllllI();
        this.IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(n, n2, n3);
        if (this.IIIlIIIlIlIIlllIIlll <= 0) {
            this.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl();
            this.IIIlIIIlIlIIlllIIlll += 20;
        }
        this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, String.valueOf(this.IllIIlllIIIIlllIIlIl) + " ", this.llllIIllllIlIlIIIIll / 2, 15, 16777215);
        final String string = "OpenGL: " + llIIlllIIlllIIllIllI.IllIIlllIIIIlllIIlIl + ", " + llIIlllIIlllIIllIllI.llllIIIlIlllIlIIIIIl + ", " + llIIlllIIlllIIllIllI.lIIIIlIIIIIlllIllIII;
        if (this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(string) < this.llllIIllllIlIlIIIIll - 5) {
            this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, string, this.llllIIllllIlIlIIIIll / 2, this.IlIllIlIlIIIlIlIlIII - 40, 8421504);
        }
        else {
            this.IlIlIlIlIlllllllllIl(this.IIllIIllIIIlIlIIIIlI, string, 5, this.IlIllIlIlIIIlIlIlIII - 40, 8421504);
        }
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
        this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(n, n2, this.IIlllIIlIllIllIlIIll);
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        super.IlIIIlIlIIIllIlIlIIl();
        --this.IIIlIIIlIlIIlllIIlll;
    }
    
    public Minecraft llllIIIlIlllIlIIIIIl() {
        return this.IlIlIIIllIIllIlllllI;
    }
    
    public void llllIIIIlIIIlIlllIll(final String s, final int n, final int n2, final int n3) {
        this.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, s, n, n2, n3);
    }
    
    public static String llllIIIIlIIIlIlllIll(final boolean b) {
        final String ilIlIlIlIlllllllllIl = IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl();
        final String llIllIIIIIllIlIIIIlI = IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI();
        return b ? ilIlIlIlIlllllllllIl : llIllIIIIIllIlIIIIlI;
    }
    
    public static String llllIIIIlIIIlIlllIll(final int n) {
        return (n == 2) ? "FXAA 2x" : ((n == 4) ? "FXAA 4x" : IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI());
    }
    
    public static String llllIIIIlIIIlIlllIll(final float n, final float[] array, final String[] array2) {
        return array2[llllIIIIlIIIlIlllIll(n, array)];
    }
    
    private float llllIIIIlIIIlIlllIll(final float n, final float[] array, final float n2, final boolean b, final boolean b2) {
        if (b2) {
            return n2;
        }
        int llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(n, array);
        if (b) {
            if (++llllIIIIlIIIlIlllIll >= array.length) {
                llllIIIIlIIIlIlllIll = 0;
            }
        }
        else if (--llllIIIIlIIIlIlllIll < 0) {
            llllIIIIlIIIlIlllIll = array.length - 1;
        }
        return array[llllIIIIlIIIlIlllIll];
    }
    
    public static int llllIIIIlIIIlIlllIll(final float n, final float[] array) {
        for (int i = 0; i < array.length; ++i) {
            if (array[i] >= n) {
                return i;
            }
        }
        return array.length - 1;
    }
    
    public static String llllIIIIlIIIlIlllIll(final float n) {
        return llllIIIIlIIIlIlllIll(n, IlIlIIIllIllIIIIIllI.IIlIIIIlllIlllllIlII, IlIlIIIllIllIIIIIllI.IIIlIIlIIIIlllIlllII);
    }
    
    public static String IlIlIlIlIlllllllllIl(final float n) {
        return llllIIIIlIIIlIlllIll(n, IlIlIIIllIllIIIIIllI.IIlllIlIIllIlIlIlIIl, IlIlIIIllIllIIIIIllI.llIIIlIlIllIIlIlIlII);
    }
    
    public static int lIIIIlIIIIIlllIllIII() {
        final String lowerCase = System.getProperty("os.name").toLowerCase();
        return lowerCase.contains("win") ? 1 : (lowerCase.contains("mac") ? 2 : (lowerCase.contains("solaris") ? 3 : (lowerCase.contains("sunos") ? 3 : (lowerCase.contains("linux") ? 4 : (lowerCase.contains("unix") ? 4 : 0)))));
    }
    
    public boolean lIIIlllIIIllIIIllIII() {
        return lIIllIIIllllIlllIllI.llllIIllllIlIlIIIIll();
    }
    
    static /* synthetic */ int[] IIlllIIlIllIllIlIIll() {
        final int[] lIllllllIIllIlIlIlII = IlIlIIIllIllIIIIIllI.lIllllllIIllIlIlIlII;
        if (lIllllllIIllIlIlIlII != null) {
            return lIllllllIIllIlIlIlII;
        }
        final int[] lIllllllIIllIlIlIlII2 = new int[net.optifine.shaders.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.values().length];
        try {
            lIllllllIIllIlIlIlII2[net.optifine.shaders.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            lIllllllIIllIlIlIlII2[net.optifine.shaders.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            lIllllllIIllIlIlIlII2[net.optifine.shaders.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            lIllllllIIllIlIlIlII2[net.optifine.shaders.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            lIllllllIIllIlIlIlII2[net.optifine.shaders.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII.ordinal()] = 8;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        try {
            lIllllllIIllIlIlIlII2[net.optifine.shaders.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII.ordinal()] = 9;
        }
        catch (NoSuchFieldError noSuchFieldError6) {}
        try {
            lIllllllIIllIlIlIlII2[net.optifine.shaders.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError7) {}
        try {
            lIllllllIIllIlIlIlII2[net.optifine.shaders.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.ordinal()] = 10;
        }
        catch (NoSuchFieldError noSuchFieldError8) {}
        try {
            lIllllllIIllIlIlIlII2[net.optifine.shaders.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.ordinal()] = 12;
        }
        catch (NoSuchFieldError noSuchFieldError9) {}
        try {
            lIllllllIIllIlIlIlII2[net.optifine.shaders.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError10) {}
        try {
            lIllllllIIllIlIlIlII2[net.optifine.shaders.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError11) {}
        try {
            lIllllllIIllIlIlIlII2[net.optifine.shaders.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIllIlIlIIIlIlIlIII.ordinal()] = 16;
        }
        catch (NoSuchFieldError noSuchFieldError12) {}
        try {
            lIllllllIIllIlIlIlII2[net.optifine.shaders.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IIlllIIlIllIllIlIIll.ordinal()] = 17;
        }
        catch (NoSuchFieldError noSuchFieldError13) {}
        try {
            lIllllllIIllIlIlIlII2[net.optifine.shaders.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl.ordinal()] = 18;
        }
        catch (NoSuchFieldError noSuchFieldError14) {}
        try {
            lIllllllIIllIlIlIlII2[net.optifine.shaders.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI.ordinal()] = 13;
        }
        catch (NoSuchFieldError noSuchFieldError15) {}
        try {
            lIllllllIIllIlIlIlII2[net.optifine.shaders.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IIIIlllIIIIIIlIIIlll.ordinal()] = 14;
        }
        catch (NoSuchFieldError noSuchFieldError16) {}
        try {
            lIllllllIIllIlIlIlII2[net.optifine.shaders.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll.ordinal()] = 15;
        }
        catch (NoSuchFieldError noSuchFieldError17) {}
        try {
            lIllllllIIllIlIlIlII2[net.optifine.shaders.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI.ordinal()] = 11;
        }
        catch (NoSuchFieldError noSuchFieldError18) {}
        return IlIlIIIllIllIIIIIllI.lIllllllIIllIlIlIlII = lIllllllIIllIlIlIlII2;
    }
}
