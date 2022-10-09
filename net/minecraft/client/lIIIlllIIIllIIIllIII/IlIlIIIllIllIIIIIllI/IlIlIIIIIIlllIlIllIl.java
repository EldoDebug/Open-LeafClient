package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI;

import org.apache.logging.log4j.*;
import com.google.common.collect.*;
import net.optifine.util.*;
import java.awt.image.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll.*;
import net.optifine.lIIIIlIIIIIlllIllIII.*;
import java.util.concurrent.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.optifine.shaders.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.llIllIIIIIllIlIIIIlI.*;
import java.util.*;
import java.io.*;
import java.awt.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.optifine.*;

public class IlIlIIIIIIlllIlIllIl extends llllIIIIlIIIlIlllIll implements IllIIlllIIIIlllIIlIl
{
    private static final boolean llIllIlIIIIllIlIIllI;
    private static final Logger lIlIlIIIllIIllIIIllI;
    public static final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll;
    public static final lIllllIllIllIIllllll IlIlIlIlIlllllllllIl;
    private final List IlIlIIIllIIllIlllllI;
    private final Map IIIIlllIIIIIIlIIIlll;
    private final Map llllIIllllIlIlIIIIll;
    private final String IlIllIlIlIIIlIlIlIII;
    private final llIllIIIIIllIlIIIIlI IIlllIIlIllIllIlIIll;
    private int lllIIIIlllllIlIIllIl;
    private final IlIlIIIllIIllIlllllI IlIlIIIIIIlllIlIllIl;
    private boolean IIllIIllIIIlIlIIIIlI;
    private IlIlIIIllIIllIlllllI[] IIIlIIIlIlIIlllIIlll;
    private int IlIlIIIlIIlIlIIlllIl;
    private int IlllllllIIIlIIIlIlII;
    private int IIlIIIIlllIlllllIlII;
    private double IIIlIIlIIIIlllIlllII;
    private double IlIlIllllllllIIIIlII;
    private lIIIIlIIIIIlllIllIII IIlllIlIIllIlIlIlIIl;
    public int lIIIlllIIIllIIIllIII;
    public int llIIlIIIlIIIllIlIIIl;
    private int llIIIlIlIllIIlIlIlII;
    private int lllllIlIIIlIlIIlllII;
    
    static {
        llIllIlIIIIllIlIIllI = Boolean.parseBoolean(System.getProperty("fml.skipFirstTextureLoad", "true"));
        lIlIlIIIllIIllIIIllI = LogManager.getLogger();
        llllIIIIlIIIlIlllIll = new lIllllIllIllIIllllll("missingno");
        IlIlIlIlIlllllllllIl = new lIllllIllIllIIllllll("textures/atlas/blocks.png");
    }
    
    public IlIlIIIIIIlllIlIllIl(final String s) {
        this(s, null);
    }
    
    public IlIlIIIIIIlllIlIllIl(final String s, final boolean b) {
        this(s, null, b);
    }
    
    public IlIlIIIIIIlllIlIllIl(final String s, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        this(s, llIllIIIIIllIlIIIIlI, false);
    }
    
    public IlIlIIIIIIlllIlIllIl(final String ilIllIlIlIIIlIlIlIII, final llIllIIIIIllIlIIIIlI iIlllIIlIllIllIlIIll, final boolean b) {
        this.IIllIIllIIIlIlIIIIlI = false;
        this.IIIlIIIlIlIIlllIIlll = null;
        this.IlIlIIIlIIlIlIIlllIl = -1;
        this.IlllllllIIIlIIIlIlII = -1;
        this.IIlIIIIlllIlllllIlII = -1;
        this.IIIlIIlIIIIlllIlllII = -1.0;
        this.IlIlIllllllllIIIIlII = -1.0;
        this.IIlllIlIIllIlIlIlIIl = new lIIIIlIIIIIlllIllIII(0);
        this.lIIIlllIIIllIIIllIII = 0;
        this.llIIlIIIlIIIllIlIIIl = 0;
        this.IlIlIIIllIIllIlllllI = Lists.newArrayList();
        this.IIIIlllIIIIIIlIIIlll = Maps.newHashMap();
        this.llllIIllllIlIlIIIIll = Maps.newHashMap();
        this.IlIlIIIIIIlllIlIllIl = new IlIlIIIllIIllIlllllI("missingno");
        this.IlIllIlIlIIIlIlIlIII = ilIllIlIlIIIlIlIlIII;
        this.IIlllIIlIllIllIlIIll = iIlllIIlIllIllIlIIll;
        this.IIllIIllIIIlIlIIIIlI = (b && net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlIlIIIIIIlllIlIllIl.llIllIlIIIIllIlIIllI);
    }
    
    private void IIIIlllIIIIIIlIIIlll() {
        final int llllIIllllIlIlIIIIll = this.llllIIllllIlIlIIIIll();
        final int[] ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl(llllIIllllIlIlIIIIll);
        this.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl(llllIIllllIlIlIIIIll);
        this.IlIlIIIIIIlllIlIllIl.llIllIIIIIllIlIIIIlI(llllIIllllIlIlIIIIll);
        final int[][] array = new int[this.lllIIIIlllllIlIIllIl + 1][];
        array[0] = ilIlIlIlIlllllllllIl;
        this.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll(Lists.newArrayList((Object[])new int[][][] { array }));
        this.IlIlIIIIIIlllIlIllIl.IlIlIIIllIllIIIIIllI(this.IIlllIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll());
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI) {
        if (this.IIlllIIlIllIllIlIIll != null) {
            this.llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI, this.IIlllIIlIllIllIlIIll);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        this.IIIIlllIIIIIIlIIIlll.clear();
        this.IIlllIlIIllIlIlIlIIl.IlIlIlIlIlllllllllIl();
        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this);
        if (this.lllIIIIlllllIlIIllIl >= 4) {
            this.lllIIIIlllllIlIIllIl = this.llllIIIIlIIIlIlllIll(this.IIIIlllIIIIIIlIIIlll, ilIlIIIllIIllIlllllI);
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI("Mipmap levels: " + this.lllIIIIlllllIlIIllIl);
        }
        this.IIIIlllIIIIIIlIIIlll();
        this.IllIIlllIIIIlllIIlIl();
        this.IlIlIlIlIlllllllllIl(ilIlIIIllIIllIlllllI);
    }
    
    public void IlIlIlIlIlllllllllIl(final net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI) {
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl("Multitexture: " + net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIllIIIlIIIIlIIlIIII());
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIllIIIlIIIIlIIlIIII()) {
            final Iterator<IlIlIIIllIIllIlllllI> iterator = this.llllIIllllIlIlIIIIll.values().iterator();
            while (iterator.hasNext()) {
                iterator.next().lllIIIIlllllIlIIllIl();
            }
        }
        net.optifine.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(this);
        lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll(this);
        net.optifine.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this);
        final int ilIlIIIllIllIIIIIllI = IlIIIlIIIllllIlIlIlI.IlIlIIIllIllIIIIIllI();
        final net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl = new net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.llIIlIIIlIIIllIlIIIl(ilIlIIIllIllIIIIIllI, ilIlIIIllIllIIIIIllI, true, 0, this.lllIIIIlllllIlIIllIl);
        this.llllIIllllIlIlIIIIll.clear();
        this.IlIlIIIllIIllIlllllI.clear();
        int n = Integer.MAX_VALUE;
        net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.e, this);
        final int llllIIllllIlIlIIIIll = this.llllIIllllIlIlIIIIll();
        this.IlIlIIIlIIlIlIIlllIl = llllIIllllIlIlIIIIll;
        int n2 = 1 << this.lllIIIIlllllIlIIllIl;
        int n3 = 0;
        int n4 = 0;
        for (final Map.Entry<K, IlIlIIIllIIllIlllllI> entry : this.IIIIlllIIIIIIlIIIlll.entrySet()) {
            if (this.IIllIIllIIIlIlIIIIlI) {
                break;
            }
            final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI2 = entry.getValue();
            final lIllllIllIllIIllllll lIllllIllIllIIllllll = new lIllllIllIllIIllllll(ilIlIIIllIIllIlllllI2.lIIIlllIIIllIIIllIII());
            final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll, 0);
            ilIlIIIllIIllIlllllI2.llllIIIIlIIIlIlllIll(this.IIlllIlIIllIlIlIlIIl);
            if (ilIlIIIllIIllIlllllI2.llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI, lIllllIllIllIIllllll)) {
                if (!ilIlIIIllIIllIlllllI2.IlIlIlIlIlllllllllIl(ilIlIIIllIIllIlllllI, lIllllIllIllIIllllll)) {
                    n = Math.min(n, Math.min(ilIlIIIllIIllIlllllI2.llIllIIIIIllIlIIIIlI(), ilIlIIIllIIllIlllllI2.IlIIIlIlIIIllIlIlIIl()));
                    llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI2);
                    net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll("Custom loader (skipped): " + ilIlIIIllIIllIlllllI2);
                    ++n4;
                }
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll("Custom loader: " + ilIlIIIllIIllIlllllI2);
                ++n3;
            }
            else {
                try {
                    final lIlIlIIIllIIllIIIllI llllIIIIlIIIlIlllIll2 = ilIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
                    final BufferedImage[] array = new BufferedImage[1 + this.lllIIIIlllllIlIIllIl];
                    array[0] = net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl());
                    final int width = array[0].getWidth();
                    final int height = array[0].getHeight();
                    if (width < 1 || height < 1) {
                        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Invalid sprite size: " + ilIlIIIllIIllIlllllI2);
                        continue;
                    }
                    if (width < llllIIllllIlIlIIIIll || this.lllIIIIlllllIlIIllIl > 0) {
                        final int n5 = (this.lllIIIIlllllIlIIllIl > 0) ? IlIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll(width, llllIIllllIlIlIIIIll) : IlIIIlIIIllllIlIlIlI.IlIlIlIlIlllllllllIl(width, llllIIllllIlIlIIIIll);
                        if (n5 != width) {
                            if (!IlIIIlIIIllllIlIlIlI.IlIlIIIllIllIIIIIllI(width)) {
                                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI("Scaled non power of 2: " + ilIlIIIllIIllIlllllI2.lIIIlllIIIllIIIllIII() + ", " + width + " -> " + n5);
                            }
                            else {
                                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI("Scaled too small texture: " + ilIlIIIllIIllIlllllI2.lIIIlllIIIllIIIllIII() + ", " + width + " -> " + n5);
                            }
                            array[0] = IlIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll(array[0], n5);
                        }
                    }
                    final llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll2 = (llllIIllllIlIlIIIIll)llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll("texture");
                    if (llllIIllllIlIlIIIIll2 != null) {
                        final List llIllIIIIIllIlIIIIlI = llllIIllllIlIlIIIIll2.llIllIIIIIllIlIIIIlI();
                        if (!llIllIIIIIllIlIIIIlI.isEmpty()) {
                            final int width2 = array[0].getWidth();
                            final int height2 = array[0].getHeight();
                            if (llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(width2) != width2 || llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(height2) != height2) {
                                throw new RuntimeException("Unable to load extra miplevels, source-texture is not power of two");
                            }
                        }
                        for (final int intValue : llIllIIIIIllIlIIIIlI) {
                            if (intValue > 0 && intValue < array.length - 1 && array[intValue] == null) {
                                final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll3 = this.llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll, intValue);
                                try {
                                    array[intValue] = net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3).IlIlIlIlIlllllllllIl());
                                }
                                catch (IOException ex) {
                                    net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlIlIIIIIIlllIlIllIl.lIlIlIIIllIIllIIIllI.error("Unable to load miplevel {} from: {}", new Object[] { intValue, llllIIIIlIIIlIlllIll3, ex });
                                }
                            }
                        }
                    }
                    ilIlIIIllIIllIlllllI2.llllIIIIlIIIlIlllIll(array, (IlIlIlIlIlllllllllIl)llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll("animation"));
                }
                catch (RuntimeException ex2) {
                    net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlIlIIIIIIlllIlIllIl.lIlIlIIIllIIllIIIllI.error("Unable to parse metadata from " + llllIIIIlIIIlIlllIll, (Throwable)ex2);
                    net.optifine.lIIIIlIIIIIlllIllIII.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, ex2.getMessage());
                    continue;
                }
                catch (IOException ex3) {
                    net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlIlIIIIIIlllIlIllIl.lIlIlIIIllIIllIIIllI.error("Using missing texture, unable to load " + llllIIIIlIIIlIlllIll + ", " + ex3.getClass().getName());
                    net.optifine.lIIIIlIIIIIlllIllIII.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
                    continue;
                }
                n = Math.min(n, Math.min(ilIlIIIllIIllIlllllI2.llIllIIIIIllIlIIIIlI(), ilIlIIIllIIllIlllllI2.IlIIIlIlIIIllIlIlIIl()));
                final int min = Math.min(Integer.lowestOneBit(ilIlIIIllIIllIlllllI2.llIllIIIIIllIlIIIIlI()), Integer.lowestOneBit(ilIlIIIllIIllIlllllI2.IlIIIlIlIIIllIlIlIIl()));
                if (min < n2) {
                    net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlIlIIIIIIlllIlIllIl.lIlIlIIIllIIllIIIllI.warn("Texture {} with size {}x{} limits mip level from {} to {}", new Object[] { llllIIIIlIIIlIlllIll, ilIlIIIllIIllIlllllI2.llIllIIIIIllIlIIIIlI(), ilIlIIIllIIllIlllllI2.IlIIIlIlIIIllIlIlIIl(), llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n2), llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(min) });
                    n2 = min;
                }
                llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI2);
            }
        }
        if (n3 > 0) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl("Custom loader sprites: " + n3);
        }
        if (n4 > 0) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl("Custom loader sprites (skipped): " + n4);
        }
        final int min2 = Math.min(n, n2);
        int llIllIIIIIllIlIIIIlI2 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(min2);
        if (llIllIIIIIllIlIIIIlI2 < 0) {
            llIllIIIIIllIlIIIIlI2 = 0;
        }
        if (llIllIIIIIllIlIIIIlI2 < this.lllIIIIlllllIlIIllIl) {
            net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlIlIIIIIIlllIlIllIl.lIlIlIIIllIIllIIIllI.warn("{}: dropping miplevel from {} to {}, because of minimum power of two: {}", new Object[] { this.IlIllIlIlIIIlIlIlIII, this.lllIIIIlllllIlIIllIl, llIllIIIIIllIlIIIIlI2, min2 });
            this.lllIIIIlllllIlIIllIl = llIllIIIIIllIlIIIIlI2;
        }
        for (final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI3 : this.IIIIlllIIIIIIlIIIlll.values()) {
            if (this.IIllIIllIIIlIlIIIIlI) {
                break;
            }
            try {
                ilIlIIIllIIllIlllllI3.IlIIIlIlIIIllIlIlIIl(this.lllIIIIlllllIlIIllIl);
            }
            catch (Throwable t) {
                final net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll4 = net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(t, "Applying mipmap");
                final lIIIlllIIIllIIIllIII llllIIIIlIIIlIlllIll5 = llllIIIIlIIIlIlllIll4.llllIIIIlIIIlIlllIll("Sprite being mipmapped");
                llllIIIIlIIIlIlllIll5.llllIIIIlIIIlIlllIll("Sprite name", new IIllIIllIIIlIlIIIIlI(this, ilIlIIIllIIllIlllllI3));
                llllIIIIlIIIlIlllIll5.llllIIIIlIIIlIlllIll("Sprite size", new IIIlIIIlIlIIlllIIlll(this, ilIlIIIllIIllIlllllI3));
                llllIIIIlIIIlIlllIll5.llllIIIIlIIIlIlllIll("Sprite frames", new IlIlIIIlIIlIlIIlllIl(this, ilIlIIIllIIllIlllllI3));
                llllIIIIlIIIlIlllIll5.llllIIIIlIIIlIlllIll("Mipmap levels", this.lllIIIIlllllIlIIllIl);
                throw new IIlIlllIlIlllIlIllll(llllIIIIlIIIlIlllIll4);
            }
        }
        this.IlIlIIIIIIlllIlIllIl.IlIIIlIlIIIllIlIlIIl(this.lllIIIIlllllIlIIllIl);
        llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(this.IlIlIIIIIIlllIlIllIl);
        this.IIllIIllIIIlIlIIIIlI = false;
        try {
            llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI();
        }
        catch (IIIllIIIlIlIIllIIIlI iiIllIIIlIlIIllIIIlI) {
            throw iiIllIIIlIlIIllIIIlI;
        }
        net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlIlIIIIIIlllIlIllIl.lIlIlIIIllIIllIIIllI.info("Created: {}x{} {}-atlas", new Object[] { llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(), llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl(), this.IlIllIlIlIIIlIlIlIII });
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
            IIlIIIIIllIlIIIlIIll.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll(), this.lllIIIIlllllIlIIllIl, llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(), llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl(), llIIlIIIlIIIllIlIIIl, this);
        }
        else {
            net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll(), this.lllIIIIlllllIlIIllIl, llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(), llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl());
        }
        final HashMap hashMap = Maps.newHashMap(this.IIIIlllIIIIIIlIIIlll);
        for (final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI4 : llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl()) {
            final String liiIlllIIIllIIIllIII = ilIlIIIllIIllIlllllI4.lIIIlllIIIllIIIllIII();
            hashMap.remove(liiIlllIIIllIIIllIII);
            this.llllIIllllIlIlIIIIll.put(liiIlllIIIllIIIllIII, ilIlIIIllIIllIlllllI4);
            try {
                if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
                    IIlIIIIIllIlIIIlIIll.llllIIIIlIIIlIlllIll(this, ilIlIIIllIIllIlllllI4.lIIIlllIIIllIIIllIII(), ilIlIIIllIIllIlllllI4.llllIIIIlIIIlIlllIll(0), ilIlIIIllIIllIlllllI4.llIllIIIIIllIlIIIIlI(), ilIlIIIllIIllIlllllI4.IlIIIlIlIIIllIlIlIIl(), ilIlIIIllIIllIlllllI4.llllIIIIlIIIlIlllIll(), ilIlIIIllIIllIlllllI4.IlIlIlIlIlllllllllIl(), false, false);
                }
                else {
                    net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI4.llllIIIIlIIIlIlllIll(0), ilIlIIIllIIllIlllllI4.llIllIIIIIllIlIIIIlI(), ilIlIIIllIIllIlllllI4.IlIIIlIlIIIllIlIlIIl(), ilIlIIIllIIllIlllllI4.llllIIIIlIIIlIlllIll(), ilIlIIIllIIllIlllllI4.IlIlIlIlIlllllllllIl(), false, false);
                }
            }
            catch (Throwable t2) {
                final net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll6 = net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(t2, "Stitching texture atlas");
                final lIIIlllIIIllIIIllIII llllIIIIlIIIlIlllIll7 = llllIIIIlIIIlIlllIll6.llllIIIIlIIIlIlllIll("Texture being stitched together");
                llllIIIIlIIIlIlllIll7.llllIIIIlIIIlIlllIll("Atlas path", this.IlIllIlIlIIIlIlIlIII);
                llllIIIIlIIIlIlllIll7.llllIIIIlIIIlIlllIll("Sprite", ilIlIIIllIIllIlllllI4);
                throw new IIlIlllIlIlllIlIllll(llllIIIIlIIIlIlllIll6);
            }
            if (ilIlIIIllIIllIlllllI4.IlIlIIIllIIllIlllllI()) {
                ilIlIIIllIIllIlllllI4.IllIIlllIIIIlllIIlIl(this.IlIlIIIllIIllIlllllI.size());
                this.IlIlIIIllIIllIlllllI.add(ilIlIIIllIIllIlllllI4);
            }
        }
        final Iterator<IlIlIIIllIIllIlllllI> iterator6 = hashMap.values().iterator();
        while (iterator6.hasNext()) {
            iterator6.next().llllIIIIlIIIlIlllIll(this.IlIlIIIIIIlllIlIllIl);
        }
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI("Animated sprites: " + this.IlIlIIIllIIllIlllllI.size());
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIllIIIlIIIIlIIlIIII()) {
            final int llllIIIIlIIIlIlllIll8 = llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll();
            final int ilIlIlIlIlllllllllIl = llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl();
            for (final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI5 : llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl()) {
                ilIlIIIllIIllIlllllI5.lIlIlIIIllIIllIIIllI = llllIIIIlIIIlIlllIll8;
                ilIlIIIllIIllIlllllI5.IlIlIIIllIIllIlllllI = ilIlIlIlIlllllllllIl;
                ilIlIIIllIIllIlllllI5.IIlllIIlIllIllIlIIll = this.lllIIIIlllllIlIIllIl;
                final IlIlIIIllIIllIlllllI llllIIllllIlIlIIIIll3 = ilIlIIIllIIllIlllllI5.llllIIllllIlIlIIIIll;
                if (llllIIllllIlIlIIIIll3 != null) {
                    if (llllIIllllIlIlIIIIll3.llIllIIIIIllIlIIIIlI() <= 0) {
                        llllIIllllIlIlIIIIll3.IlIlIlIlIlllllllllIl(ilIlIIIllIIllIlllllI5.llIllIIIIIllIlIIIIlI());
                        llllIIllllIlIlIIIIll3.llIllIIIIIllIlIIIIlI(ilIlIIIllIIllIlllllI5.IlIIIlIlIIIllIlIlIIl());
                        llllIIllllIlIlIIIIll3.llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI5.llIllIIIIIllIlIIIIlI(), ilIlIIIllIIllIlllllI5.IlIIIlIlIIIllIlIlIIl(), 0, 0, false);
                        llllIIllllIlIlIIIIll3.lIlIlIIIllIIllIIIllI();
                        llllIIllllIlIlIIIIll3.llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI5.IlIlIIIIIIlllIlIllIl());
                        llllIIllllIlIlIIIIll3.llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI5.IIllIIllIIIlIlIIIIlI());
                    }
                    llllIIllllIlIlIIIIll3.lIlIlIIIllIIllIIIllI = llllIIIIlIIIlIlllIll8;
                    llllIIllllIlIlIIIIll3.IlIlIIIllIIllIlllllI = ilIlIlIlIlllllllllIl;
                    llllIIllllIlIlIIIIll3.IIlllIIlIllIllIlIIll = this.lllIIIIlllllIlIIllIl;
                    llllIIllllIlIlIIIIll3.IllIIlllIIIIlllIIlIl(ilIlIIIllIIllIlllllI5.llllIIllllIlIlIIIIll());
                    ilIlIIIllIIllIlllllI5.IIlllIIlIllIllIlIIll();
                    final boolean b = false;
                    final boolean b2 = true;
                    try {
                        net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIllllIlIlIIIIll3.llllIIIIlIIIlIlllIll(0), llllIIllllIlIlIIIIll3.llIllIIIIIllIlIIIIlI(), llllIIllllIlIlIIIIll3.IlIIIlIlIIIllIlIlIIl(), llllIIllllIlIlIIIIll3.llllIIIIlIIIlIlllIll(), llllIIllllIlIlIIIIll3.IlIlIlIlIlllllllllIl(), b, b2);
                    }
                    catch (Exception ex4) {
                        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl("Error uploading sprite single: " + llllIIllllIlIlIIIIll3 + ", parent: " + ilIlIIIllIIllIlllllI5);
                        ex4.printStackTrace();
                    }
                }
            }
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI().lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl);
        }
        net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.f, this);
        this.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(), llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl());
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(System.getProperty("saveTextureMap"), (Object)"true")) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl("Exporting texture map: " + this.IlIllIlIlIIIlIlIlIII);
            IlIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll("debug/" + this.IlIllIlIlIIIlIlIlIII.replaceAll("/", "_"), this.llllIIIIlIIIlIlllIll(), this.lllIIIIlllllIlIIllIl, llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(), llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl());
        }
    }
    
    public lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final lIllllIllIllIIllllll lIllllIllIllIIllllll) {
        return this.llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll, 0);
    }
    
    public lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final lIllllIllIllIIllllll lIllllIllIllIIllllll, final int n) {
        return this.IlIIIlIlIIIllIlIlIIl(lIllllIllIllIIllllll) ? new lIllllIllIllIIllllll(lIllllIllIllIIllllll.llIllIIIIIllIlIIIIlI(), String.valueOf(lIllllIllIllIIllllll.IlIlIlIlIlllllllllIl()) + ".png") : ((n == 0) ? new lIllllIllIllIIllllll(lIllllIllIllIIllllll.llIllIIIIIllIlIIIIlI(), String.format("%s/%s%s", this.IlIllIlIlIIIlIlIlIII, lIllllIllIllIIllllll.IlIlIlIlIlllllllllIl(), ".png")) : new lIllllIllIllIIllllll(lIllllIllIllIIllllll.llIllIIIIIllIlIIIIlI(), String.format("%s/mipmaps/%s.%d%s", this.IlIllIlIlIIIlIlIlIII, lIllllIllIllIIllllll.IlIlIlIlIlllllllllIl(), n, ".png")));
    }
    
    public IlIlIIIllIIllIlllllI llllIIIIlIIIlIlllIll(final String s) {
        IlIlIIIllIIllIlllllI ilIlIIIIIIlllIlIllIl = this.llllIIllllIlIlIIIIll.get(s);
        if (ilIlIIIIIIlllIlIllIl == null) {
            ilIlIIIIIIlllIlIllIl = this.IlIlIIIIIIlllIlIllIl;
        }
        return ilIlIIIIIIlllIlIllIl;
    }
    
    public void llIllIIIIIllIlIIIIlI() {
        boolean b = false;
        boolean b2 = false;
        net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll());
        int llIIIlIlIllIIlIlIlII = 0;
        for (final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI : this.IlIlIIIllIIllIlllllI) {
            if (this.IlIlIlIlIlllllllllIl(ilIlIIIllIIllIlllllI)) {
                ilIlIIIllIIllIlllllI.llIIlIIIlIIIllIlIIIl();
                if (ilIlIIIllIIllIlllllI.IlIllIlIlIIIlIlIlIII()) {
                    ++llIIIlIlIllIIlIlIlII;
                }
                if (ilIlIIIllIIllIlllllI.lllIIIIlllllIlIIllIl != null) {
                    b = true;
                }
                if (ilIlIIIllIIllIlllllI.IlIlIIIIIIlllIlIllIl == null) {
                    continue;
                }
                b2 = true;
            }
        }
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIllIIIlIIIIlIIlIIII()) {
            for (final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI2 : this.IlIlIIIllIIllIlllllI) {
                if (this.IlIlIlIlIlllllllllIl(ilIlIIIllIIllIlllllI2)) {
                    final IlIlIIIllIIllIlllllI llllIIllllIlIlIIIIll = ilIlIIIllIIllIlllllI2.llllIIllllIlIlIIIIll;
                    if (llllIIllllIlIlIIIIll == null) {
                        continue;
                    }
                    if (ilIlIIIllIIllIlllllI2 == IlIIIlIIIllllIlIlIlI.llIlllIlllllIIllIIII || ilIlIIIllIIllIlllllI2 == IlIIIlIIIllllIlIlIlI.IIlllIIIllIllIIlIlIl) {
                        llllIIllllIlIlIIIIll.lIIIIlIIIIIlllIllIII = ilIlIIIllIIllIlllllI2.lIIIIlIIIIIlllIllIII;
                    }
                    ilIlIIIllIIllIlllllI2.IIlllIIlIllIllIlIIll();
                    llllIIllllIlIlIIIIll.llIIlIIIlIIIllIlIIIl();
                    if (!llllIIllllIlIlIIIIll.IlIllIlIlIIIlIlIlIII()) {
                        continue;
                    }
                    ++llIIIlIlIllIIlIlIlII;
                }
            }
            net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll());
        }
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
            if (b) {
                net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(this.llllIIIlIlllIlIIIIIl().IlIlIlIlIlllllllllIl);
                for (final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI3 : this.IlIlIIIllIIllIlllllI) {
                    if (ilIlIIIllIIllIlllllI3.lllIIIIlllllIlIIllIl != null && this.IlIlIlIlIlllllllllIl(ilIlIIIllIIllIlllllI3)) {
                        if (ilIlIIIllIIllIlllllI3 == IlIIIlIIIllllIlIlIlI.llIlllIlllllIIllIIII || ilIlIIIllIIllIlllllI3 == IlIIIlIIIllllIlIlIlI.IIlllIIIllIllIIlIlIl) {
                            ilIlIIIllIIllIlllllI3.lllIIIIlllllIlIIllIl.lIIIIlIIIIIlllIllIII = ilIlIIIllIIllIlllllI3.lIIIIlIIIIIlllIllIII;
                        }
                        ilIlIIIllIIllIlllllI3.lllIIIIlllllIlIIllIl.llIIlIIIlIIIllIlIIIl();
                        if (!ilIlIIIllIIllIlllllI3.lllIIIIlllllIlIIllIl.IlIllIlIlIIIlIlIlIII()) {
                            continue;
                        }
                        ++llIIIlIlIllIIlIlIlII;
                    }
                }
            }
            if (b2) {
                net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(this.llllIIIlIlllIlIIIIIl().llIllIIIIIllIlIIIIlI);
                for (final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI4 : this.IlIlIIIllIIllIlllllI) {
                    if (ilIlIIIllIIllIlllllI4.IlIlIIIIIIlllIlIllIl != null && this.IlIlIlIlIlllllllllIl(ilIlIIIllIIllIlllllI4)) {
                        if (ilIlIIIllIIllIlllllI4 == IlIIIlIIIllllIlIlIlI.llIlllIlllllIIllIIII || ilIlIIIllIIllIlllllI4 == IlIIIlIIIllllIlIlIlI.IIlllIIIllIllIIlIlIl) {
                            ilIlIIIllIIllIlllllI4.lllIIIIlllllIlIIllIl.lIIIIlIIIIIlllIllIII = ilIlIIIllIIllIlllllI4.lIIIIlIIIIIlllIllIII;
                        }
                        ilIlIIIllIIllIlllllI4.IlIlIIIIIIlllIlIllIl.llIIlIIIlIIIllIlIIIl();
                        if (!ilIlIIIllIIllIlllllI4.IlIlIIIIIIlllIlIllIl.IlIllIlIlIIIlIlIlIII()) {
                            continue;
                        }
                        ++llIIIlIlIllIIlIlIlII;
                    }
                }
            }
            if (b || b2) {
                net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll());
            }
        }
        final int liiiIlIIIIIlllIllIII = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI().IlIllIlIlIIIlIlIlIII.lIIIIlIIIIIlllIllIII;
        if (liiiIlIIIIIlllIllIII != this.lllllIlIIIlIlIIlllII) {
            this.llIIIlIlIllIIlIlIlII = llIIIlIlIllIIlIlIlII;
            this.lllllIlIIIlIlIIlllII = liiiIlIIIIIlllIllIII;
        }
        if (llIIIllIlIllIllIIIIl.llllIIIIlIIIlIlllIll()) {
            llIIIllIlIllIllIIIIl.llIllIIIIIllIlIIIIlI();
        }
    }
    
    public IlIlIIIllIIllIlllllI IlIlIlIlIlllllllllIl(final lIllllIllIllIIllllll lIllllIllIllIIllllll) {
        if (lIllllIllIllIIllllll == null) {
            throw new IllegalArgumentException("Location cannot be null!");
        }
        IlIlIIIllIIllIlllllI llllIIIIlIIIlIlllIll = this.IIIIlllIIIIIIlIIIlll.get(lIllllIllIllIIllllll.toString());
        if (llllIIIIlIIIlIlllIll == null) {
            llllIIIIlIIIlIlllIll = net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll);
            this.IIIIlllIIIIIIlIIIlll.put(lIllllIllIllIIllllll.toString(), llllIIIIlIIIlIlllIll);
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IIlllIlIIllIlIlIlIIl);
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIIlIIIIIIIlIIlIlIIl()) {
                this.llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll, llllIIIIlIIIlIlllIll);
            }
        }
        return llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl() {
        this.llIllIIIIIllIlIIIIlI();
    }
    
    public void llllIIIIlIIIlIlllIll(final int lllIIIIlllllIlIIllIl) {
        this.lllIIIIlllllIlIIllIl = lllIIIIlllllIlIIllIl;
    }
    
    public IlIlIIIllIIllIlllllI IlIIIlIlIIIllIlIlIIl() {
        return this.IlIlIIIIIIlllIlIllIl;
    }
    
    public IlIlIIIllIIllIlllllI IlIlIlIlIlllllllllIl(final String s) {
        return this.IIIIlllIIIIIIlIIIlll.get(s);
    }
    
    public boolean llllIIIIlIIIlIlllIll(final String s, final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI) {
        if (!this.IIIIlllIIIIIIlIIIlll.containsKey(s)) {
            this.IIIIlllIIIIIIlIIIlll.put(s, ilIlIIIllIIllIlllllI);
            ilIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(this.IIlllIlIIllIlIlIlIIl);
            return true;
        }
        return false;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI) {
        return this.llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI.lIIIlllIIIllIIIllIII(), ilIlIIIllIIllIlllllI);
    }
    
    public String lIIIIlIIIIIlllIllIII() {
        return this.IlIllIlIlIIIlIlIlIII;
    }
    
    public int lIIIlllIIIllIIIllIII() {
        return this.lllIIIIlllllIlIIllIl;
    }
    
    private boolean IlIIIlIlIIIllIlIlIIl(final lIllllIllIllIIllllll lIllllIllIllIIllllll) {
        return this.IlIIIlIlIIIllIlIlIIl(lIllllIllIllIIllllll.IlIlIlIlIlllllllllIl());
    }
    
    private boolean IlIIIlIlIIIllIlIlIIl(final String s) {
        final String lowerCase = s.toLowerCase();
        return lowerCase.startsWith("mcpatcher/") || lowerCase.startsWith("optifine/");
    }
    
    public IlIlIIIllIIllIlllllI llIllIIIIIllIlIIIIlI(final String s) {
        return this.IIIIlllIIIIIIlIIIlll.get(new lIllllIllIllIIllllll(s).toString());
    }
    
    public IlIlIIIllIIllIlllllI llIllIIIIIllIlIIIIlI(final lIllllIllIllIIllllll lIllllIllIllIIllllll) {
        return this.IIIIlllIIIIIIlIIIlll.get(lIllllIllIllIIllllll.toString());
    }
    
    private boolean IlIlIlIlIlllllllllIl(final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI) {
        return (ilIlIIIllIIllIlllllI != IlIIIlIIIllllIlIlIlI.lllllIIllIlIllIllllI && ilIlIIIllIIllIlllllI != IlIIIlIIIllllIlIlIlI.IlIIIIIlIIllIIlIlIll) ? ((ilIlIIIllIIllIlllllI != IlIIIlIIIllllIlIlIlI.IllllIIlIlIllIIIllII && ilIlIIIllIIllIlllllI != IlIIIlIIIllllIlIlIlI.lllllIIIIIlIIlllIlIl) ? ((ilIlIIIllIIllIlllllI != IlIIIlIIIllllIlIlIlI.lIIIIIlIlIIIlIIIIlIl && ilIlIIIllIIllIlllllI != IlIIIlIIIllllIlIlIlI.IIllIIIlIIIIlIIlIIII) ? ((ilIlIIIllIIllIlllllI == IlIIIlIIIllllIlIlIlI.IlIllllIIIlIllIlIIll) ? net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIllllIIIlIIIIIIllIl() : (ilIlIIIllIIllIlllllI == IlIIIlIIIllllIlIlIlI.llIlllIlllllIIllIIII || ilIlIIIllIIllIlllllI == IlIIIlIIIllllIlIlIlI.IIlllIIIllIllIIlIlIl || net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIlIIIIllIlIIlIlIII())) : net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIlIlIIIIIIIllII()) : net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlllIIIIlIIIlIlIlIIl()) : net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl();
    }
    
    public int llIIlIIIlIIIllIlIIIl() {
        return this.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI();
    }
    
    private int llllIIIIlIIIlIlllIll(final Map map, final net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI) {
        int llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(map, ilIlIIIllIIllIlllllI, 20);
        if (llllIIIIlIIIlIlllIll < 16) {
            llllIIIIlIIIlIlllIll = 16;
        }
        final int ilIlIlIlIlllllllllIl = llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
        if (ilIlIlIlIlllllllllIl > 16) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI("Sprite size: " + ilIlIlIlIlllllllllIl);
        }
        int llIllIIIIIllIlIIIIlI = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl);
        if (llIllIIIIIllIlIIIIlI < 4) {
            llIllIIIIIllIlIIIIlI = 4;
        }
        return llIllIIIIIllIlIIIIlI;
    }
    
    private int llllIIIIlIIIlIlllIll(final Map map, final net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI, final int n) {
        final HashMap<Object, Integer> hashMap = new HashMap<Object, Integer>();
        final Iterator<Map.Entry<K, IlIlIIIllIIllIlllllI>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI2 = iterator.next().getValue();
            final lIllllIllIllIIllllll lIllllIllIllIIllllll = new lIllllIllIllIIllllll(ilIlIIIllIIllIlllllI2.lIIIlllIIIllIIIllIII());
            final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll);
            if (!ilIlIIIllIIllIlllllI2.llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI, lIllllIllIllIIllllll)) {
                try {
                    final lIlIlIIIllIIllIIIllI llllIIIIlIIIlIlllIll2 = ilIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
                    if (llllIIIIlIIIlIlllIll2 == null) {
                        continue;
                    }
                    final InputStream ilIlIlIlIlllllllllIl = llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl();
                    if (ilIlIlIlIlllllllllIl == null) {
                        continue;
                    }
                    final Dimension llllIIIIlIIIlIlllIll3 = IlIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, "png");
                    ilIlIlIlIlllllllllIl.close();
                    if (llllIIIIlIIIlIlllIll3 == null) {
                        continue;
                    }
                    final int ilIlIlIlIlllllllllIl2 = llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll3.width);
                    if (!hashMap.containsKey(ilIlIlIlIlllllllllIl2)) {
                        hashMap.put(ilIlIlIlIlllllllllIl2, 1);
                    }
                    else {
                        hashMap.put(ilIlIlIlIlllllllllIl2, hashMap.get(ilIlIlIlIlllllllllIl2) + 1);
                    }
                }
                catch (Exception ex) {}
            }
        }
        int n2 = 0;
        final TreeSet set = new TreeSet<Integer>(hashMap.keySet());
        final Iterator<Integer> iterator2 = set.iterator();
        while (iterator2.hasNext()) {
            n2 += hashMap.get(iterator2.next());
        }
        int n3 = 16;
        int n4 = 0;
        final int n5 = n2 * n / 100;
        for (final int intValue : set) {
            n4 += hashMap.get(intValue);
            if (intValue > n3) {
                n3 = intValue;
            }
            if (n4 > n5) {
                return n3;
            }
        }
        return n3;
    }
    
    private int llllIIllllIlIlIIIIll() {
        int n = 1 << this.lllIIIIlllllIlIIllIl;
        if (n < 8) {
            n = 8;
        }
        return n;
    }
    
    private int[] IlIlIlIlIlllllllllIl(final int n) {
        final BufferedImage bufferedImage = new BufferedImage(16, 16, 2);
        bufferedImage.setRGB(0, 0, 16, 16, net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl, 0, 16);
        final BufferedImage llllIIIIlIIIlIlllIll = IlIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll(bufferedImage, n);
        final int[] array = new int[n * n];
        llllIIIIlIIIlIlllIll.getRGB(0, 0, n, n, array, 0, n);
        return array;
    }
    
    public boolean llIllIlIIIIllIlIIllI() {
        return net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IIIIIllIIIIlIIIIllIl() == this.llllIIIIlIIIlIlllIll();
    }
    
    private void llllIIIIlIIIlIlllIll(final int n, final int n2) {
        this.IlllllllIIIlIIIlIlII = -1;
        this.IIlIIIIlllIlllllIlII = -1;
        this.IIIlIIIlIlIIlllIIlll = null;
        if (this.IlIlIIIlIIlIlIIlllIl > 0) {
            this.IlllllllIIIlIIIlIlII = n / this.IlIlIIIlIIlIlIIlllIl;
            this.IIlIIIIlllIlllllIlII = n2 / this.IlIlIIIlIIlIlIIlllIl;
            this.IIIlIIIlIlIIlllIIlll = new IlIlIIIllIIllIlllllI[this.IlllllllIIIlIIIlIlII * this.IIlIIIIlllIlllllIlII];
            this.IIIlIIlIIIIlllIlllII = 1.0 / this.IlllllllIIIlIIIlIlII;
            this.IlIlIllllllllIIIIlII = 1.0 / this.IIlIIIIlllIlllllIlII;
            for (final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI : this.llllIIllllIlIlIIIIll.values()) {
                final double n3 = 0.5 / n;
                final double n4 = 0.5 / n2;
                final double n5 = Math.min(ilIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI(), ilIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl()) + n3;
                final double n6 = Math.min(ilIlIIIllIIllIlllllI.llllIIIlIlllIlIIIIIl(), ilIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII()) + n4;
                final double n7 = Math.max(ilIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI(), ilIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl()) - n3;
                final double n8 = Math.max(ilIlIIIllIIllIlllllI.llllIIIlIlllIlIIIIIl(), ilIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII()) - n4;
                final int n9 = (int)(n5 / this.IIIlIIlIIIIlllIlllII);
                final int n10 = (int)(n6 / this.IlIlIllllllllIIIIlII);
                final int n11 = (int)(n7 / this.IIIlIIlIIIIlllIlllII);
                final int n12 = (int)(n8 / this.IlIlIllllllllIIIIlII);
                for (int i = n9; i <= n11; ++i) {
                    if (i >= 0 && i < this.IlllllllIIIlIIIlIlII) {
                        for (int j = n10; j <= n12; ++j) {
                            if (j >= 0 && j < this.IlllllllIIIlIIIlIlII) {
                                this.IIIlIIIlIlIIlllIIlll[j * this.IlllllllIIIlIIIlIlII + i] = ilIlIIIllIIllIlllllI;
                            }
                            else {
                                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Invalid grid V: " + j + ", icon: " + ilIlIIIllIIllIlllllI.lIIIlllIIIllIIIllIII());
                            }
                        }
                    }
                    else {
                        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Invalid grid U: " + i + ", icon: " + ilIlIIIllIIllIlllllI.lIIIlllIIIllIIIllIII());
                    }
                }
            }
        }
    }
    
    public IlIlIIIllIIllIlllllI llllIIIIlIIIlIlllIll(final double n, final double n2) {
        if (this.IIIlIIIlIlIIlllIIlll == null) {
            return null;
        }
        final int n3 = (int)(n2 / this.IlIlIllllllllIIIIlII) * this.IlllllllIIIlIIIlIlII + (int)(n / this.IIIlIIlIIIIlllIlllII);
        return (n3 >= 0 && n3 <= this.IIIlIIIlIlIIlllIIlll.length) ? this.IIIlIIIlIlIIlllIIlll[n3] : null;
    }
    
    private void llllIIIIlIIIlIlllIll(final lIllllIllIllIIllllll lIllllIllIllIIllllll, final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI) {
        final String ilIlIlIlIlllllllllIl = llIllIlIlIIIIIIIllII.IlIlIlIlIlllllllllIl();
        if (ilIlIlIlIlllllllllIl != null && !lIllllIllIllIIllllll.IlIlIlIlIlllllllllIl().endsWith(ilIlIlIlIlllllllllIl)) {
            final lIllllIllIllIIllllll lIllllIllIllIIllllll2 = new lIllllIllIllIIllllll(lIllllIllIllIIllllll.llIllIIIIIllIlIIIIlI(), String.valueOf(lIllllIllIllIIllllll.IlIlIlIlIlllllllllIl()) + ilIlIlIlIlllllllllIl);
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(this.llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll2))) {
                final IlIlIIIllIIllIlllllI ilIlIlIlIlllllllllIl2 = this.IlIlIlIlIlllllllllIl(lIllllIllIllIIllllll2);
                ilIlIlIlIlllllllllIl2.IIIlIIIlIlIIlllIIlll = true;
                ilIlIIIllIIllIlllllI.IlIlIIIlIIlIlIIlllIl = ilIlIlIlIlllllllllIl2;
            }
        }
    }
    
    public int lIlIlIIIllIIllIIIllI() {
        return this.IlIlIIIllIIllIlllllI.size();
    }
    
    public int IlIlIIIllIIllIlllllI() {
        return this.llIIIlIlIllIIlIlIlII;
    }
}
