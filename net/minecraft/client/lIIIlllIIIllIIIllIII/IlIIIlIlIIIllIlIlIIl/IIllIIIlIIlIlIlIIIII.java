package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import java.nio.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import org.apache.logging.log4j.*;
import com.google.common.collect.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.*;
import net.optifine.lIIIIlIIIIIlllIllIII.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.client.*;
import org.lwjgl.opengl.*;
import net.optifine.shaders.*;
import leaf.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import java.util.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.lllIIIIlllllIlIIllIl.*;

public abstract class IIllIIIlIIlIlIlIIIII extends llIllIIIIIllIlIIIIlI
{
    private static final Logger llllIIIIlIIIlIlllIll;
    private static final IlIlIlIlIlllllllllIl IlIlIIIllIllIIIIIllI;
    public IlIIIlIlIIIllIlIlIIl IllIIlllIIIIlllIIlIl;
    protected FloatBuffer llllIIIlIlllIlIIIIIl;
    protected List lIIIIlIIIIIlllIllIII;
    protected boolean lIIIlllIIIllIIIllIII;
    public static float llIIlIIIlIIIllIlIIIl;
    public static float llIllIlIIIIllIlIIllI;
    public lllIIIIlllllIlIIllIl lIlIlIIIllIIllIIIllI;
    public float IlIlIIIllIIllIlllllI;
    public float IIIIlllIIIIIIlIIIlll;
    public float llllIIllllIlIlIIIIll;
    public float IlIllIlIlIIIlIlIlIII;
    public float IIlllIIlIllIllIlIIll;
    public float lllIIIIlllllIlIIllIl;
    public float IlIlIIIIIIlllIlIllIl;
    private boolean IIIlIIIlIlIIlllIIlll;
    private boolean IlIlIIIlIIlIlIIlllIl;
    public static final boolean IIllIIllIIIlIlIIIIlI;
    private static volatile /* synthetic */ int[] IlllllllIIIlIIIlIlII;
    
    static {
        llllIIIIlIIIlIlllIll = LogManager.getLogger();
        IlIlIIIllIllIIIIIllI = new IlIlIlIlIlllllllllIl(16, 16);
        IIllIIIlIIlIlIlIIIII.llIIlIIIlIIIllIlIIIl = 64.0f;
        IIllIIIlIIlIlIlIIIII.llIllIlIIIIllIlIIllI = 32.0f;
        IIllIIllIIIlIlIIIIlI = Boolean.getBoolean("animate.model.living");
        final int[] llIllIIIIIllIlIIIIlI = IIllIIIlIIlIlIlIIIII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI();
        for (int i = 0; i < 256; ++i) {
            llIllIIIIIllIlIIIIlI[i] = -1;
        }
        IIllIIIlIIlIlIlIIIII.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl();
    }
    
    public IIllIIIlIIlIlIlIIIII(final lllIllIIIllllllIllll lllIllIIIllllllIllll, final IlIIIlIlIIIllIlIlIIl illIIlllIIIIlllIIlIl, final float llIllIIIIIllIlIIIIlI) {
        super(lllIllIIIllllllIllll);
        this.llllIIIlIlllIlIIIIIl = llIIIlIlIllIIlIlIlII.IlIlIIIllIllIIIIIllI(4);
        this.lIIIIlIIIIIlllIllIII = Lists.newArrayList();
        this.lIIIlllIIIllIIIllIII = false;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IIIlIIIlIlIIlllIIlll = (this.IllIIlllIIIIlllIIlIl instanceof llIllIlIlIIIIIIIllII);
    }
    
    public boolean llllIIIIlIIIlIlllIll(final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII) {
        return this.lIIIIlIIIIIlllIllIII.add(ilIllIlIlIIIlIlIlIII);
    }
    
    protected boolean IlIlIlIlIlllllllllIl(final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII) {
        return this.lIIIIlIIIIIlllIllIII.remove(ilIllIlIlIIIlIlIlIII);
    }
    
    public IlIIIlIlIIIllIlIlIIl IlIlIlIlIlllllllllIl() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    protected float llllIIIIlIIIlIlllIll(final float n, final float n2, final float n3) {
        float n4;
        for (n4 = n2 - n; n4 < -180.0f; n4 += 360.0f) {}
        while (n4 >= 180.0f) {
            n4 -= 360.0f;
        }
        return n + n3 * n4;
    }
    
    public void r_() {
    }
    
    public void llllIIIIlIIIlIlllIll(final lllIIIIlllllIlIIllIl lIlIlIIIllIIllIIIllI, final double n, final double n2, final double n3, final float n4, final float ilIlIIIIIIlllIlIllIl) {
        if (!net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.aF.llIllIIIIIllIlIIIIlI() || !net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.aF, lIlIlIIIllIIllIIIllI, this, n, n2, n3)) {
            if (IIllIIIlIIlIlIlIIIII.IIllIIllIIIlIlIIIIlI) {
                lIlIlIIIllIIllIIIllI.llIlIIIIllIlIIlIlIII = 1.0f;
            }
            lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
            lllllIlIIIlIlIIlllII.IlIllIlIlIIIlIlIlIII();
            this.IllIIlllIIIIlllIIlIl.IlIlIIIllIllIIIIIllI = this.IlIIIlIlIIIllIlIlIIl(lIlIlIIIllIIllIIIllI, ilIlIIIIIIlllIlIllIl);
            this.IllIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl = lIlIlIIIllIIllIIIllI.IIllIIIlIIIIlIIlIIII();
            if (net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI()) {
                this.IllIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl = (lIlIlIIIllIIllIIIllI.IIllIIIlIIIIlIIlIIII() && lIlIlIIIllIIllIIIllI.IIIlIIIlIlIIlllIIlll != null && net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(lIlIlIIIllIIllIIIllI.IIIlIIIlIlIIlllIIlll, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llIllIIlllllllllllll, new Object[0]));
            }
            this.IllIIlllIIIIlllIIlIl.llllIIIlIlllIlIIIIIl = lIlIlIIIllIIllIIIllI.e_();
            try {
                float llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI.IlIllIIllIIlIIIIlIIl, lIlIlIIIllIIllIIIllI.lIllIlIIIllllllIIlII, ilIlIIIIIIlllIlIllIl);
                final float llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI.lIllIIlIlIlllllIIIII, lIlIlIIIllIIllIIIllI.lIIlllIlllllIIlllIll, ilIlIIIIIIlllIlIllIl);
                float ilIllIlIlIIIlIlIlIII = llllIIIIlIIIlIlllIll2 - llllIIIIlIIIlIlllIll;
                if (this.IllIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl && lIlIlIIIllIIllIIIllI.IIIlIIIlIlIIlllIIlll instanceof lllIIIIlllllIlIIllIl) {
                    final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl = (lllIIIIlllllIlIIllIl)lIlIlIIIllIIllIIIllI.IIIlIIIlIlIIlllIIlll;
                    float llllIIIlIlllIlIIIIIl = llIllIIlllllllllllll.llllIIIlIlllIlIIIIIl(llllIIIIlIIIlIlllIll2 - this.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl.IlIllIIllIIlIIIIlIIl, lllIIIIlllllIlIIllIl.lIllIlIIIllllllIIlII, ilIlIIIIIIlllIlIllIl));
                    if (llllIIIlIlllIlIIIIIl < -85.0f) {
                        llllIIIlIlllIlIIIIIl = -85.0f;
                    }
                    if (llllIIIlIlllIlIIIIIl >= 85.0f) {
                        llllIIIlIlllIlIIIIIl = 85.0f;
                    }
                    llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll2 - llllIIIlIlllIlIIIIIl;
                    if (llllIIIlIlllIlIIIIIl * llllIIIlIlllIlIIIIIl > 2500.0f) {
                        llllIIIIlIIIlIlllIll += llllIIIlIlllIlIIIIIl * 0.2f;
                    }
                    ilIllIlIlIIIlIlIlIII = llllIIIIlIIIlIlllIll2 - llllIIIIlIIIlIlllIll;
                }
                final float iIlllIIlIllIllIlIIll = lIlIlIIIllIIllIIIllI.IlIIIlIIIllllIlIlIlI + (lIlIlIIIllIIllIIIllI.llllllIllIllIlIllllI - lIlIlIIIllIIllIIIllI.IlIIIlIIIllllIlIlIlI) * ilIlIIIIIIlllIlIllIl;
                this.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, n, n2, n3);
                final float ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl(lIlIlIIIllIIllIIIllI, ilIlIIIIIIlllIlIllIl);
                this.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll, ilIlIIIIIIlllIlIllIl);
                lllllIlIIIlIlIIlllII.IlIlIllllllllIIIIlII();
                lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(-1.0f, -1.0f, 1.0f);
                this.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIIIIIIlllIlIllIl);
                final float lllIIIIlllllIlIIllIl2 = 0.0625f;
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, -1.5078125f, 0.0f);
                float iiiIlllIIIIIIlIIIlll = lIlIlIIIllIIllIIIllI.lllIlIIIIIlIlllllIlI + (lIlIlIIIllIIllIIIllI.llIlIIIIllIlIIlIlIII - lIlIlIIIllIIllIIIllI.lllIlIIIIIlIlllllIlI) * ilIlIIIIIIlllIlIllIl;
                float ilIlIIIllIIllIlllllI = lIlIlIIIllIIllIIIllI.IIIIIlllIlIIIIIIIllI - lIlIlIIIllIIllIIIllI.llIlIIIIllIlIIlIlIII * (1.0f - ilIlIIIIIIlllIlIllIl);
                if (lIlIlIIIllIIllIIIllI.e_()) {
                    ilIlIIIllIIllIlllllI *= 3.0f;
                }
                if (iiiIlllIIIIIIlIIIlll > 1.0f) {
                    iiiIlllIIIIIIlIIIlll = 1.0f;
                }
                lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl();
                this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIIIllIIllIlllllI, iiiIlllIIIIIIlIIIlll, ilIlIIIIIIlllIlIllIl);
                this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI, iiiIlllIIIIIIlIIIlll, ilIlIlIlIlllllllllIl, ilIllIlIlIIIlIlIlIII, iIlllIIlIllIllIlIIll, 0.0625f, lIlIlIIIllIIllIIIllI);
                if (net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()) {
                    this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI;
                    this.IlIlIIIllIIllIlllllI = ilIlIIIllIIllIlllllI;
                    this.IIIIlllIIIIIIlIIIlll = iiiIlllIIIIIIlIIIlll;
                    this.llllIIllllIlIlIIIIll = ilIlIlIlIlllllllllIl;
                    this.IlIllIlIlIIIlIlIlIII = ilIllIlIlIIIlIlIlIII;
                    this.IIlllIIlIllIllIlIIll = iIlllIIlIllIllIlIIll;
                    this.lllIIIIlllllIlIIllIl = lllIIIIlllllIlIIllIl2;
                    this.IlIlIIIIIIlllIlIllIl = ilIlIIIIIIlllIlIllIl;
                }
                if (this.lIIIlllIIIllIIIllIII) {
                    final boolean llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI(lIlIlIIIllIIllIIIllI);
                    this.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIIIllIIllIlllllI, iiiIlllIIIIIIlIIIlll, ilIlIlIlIlllllllllIl, ilIllIlIlIIIlIlIlIII, iIlllIIlIllIllIlIIll, 0.0625f);
                    if (llIllIIIIIllIlIIIIlI) {
                        this.lIIIlllIIIllIIIllIII();
                    }
                }
                else {
                    final boolean llIllIIIIIllIlIIIIlI2 = this.llIllIIIIIllIlIIIIlI(lIlIlIIIllIIllIIIllI, ilIlIIIIIIlllIlIllIl);
                    if (net.optifine.llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll()) {
                        net.optifine.llIllIlIlIIIIIIIllII.llIllIIIIIllIlIIIIlI();
                    }
                    if (this.IIIlIIIlIlIIlllIIlll) {
                        lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
                    }
                    this.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIIIllIIllIlllllI, iiiIlllIIIIIIlIIIlll, ilIlIlIlIlllllllllIl, ilIllIlIlIIIlIlIlIII, iIlllIIlIllIllIlIIll, 0.0625f);
                    if (this.IIIlIIIlIlIIlllIIlll) {
                        lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
                    }
                    if (net.optifine.llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll()) {
                        if (net.optifine.llIllIlIlIIIIIIIllII.IlIIIlIlIIIllIlIlIIl()) {
                            this.IIIlIIIlIlIIlllIIlll = true;
                            net.optifine.llIllIlIlIIIIIIIllII.IlIlIIIllIllIIIIIllI();
                            lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
                            this.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIIIllIIllIlllllI, iiiIlllIIIIIIlIIIlll, ilIlIlIlIlllllllllIl, ilIllIlIlIIIlIlIlIII, iIlllIIlIllIllIlIIll, lllIIIIlllllIlIIllIl2);
                            lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
                            net.optifine.llIllIlIlIIIIIIIllII.IllIIlllIIIIlllIIlIl();
                        }
                        net.optifine.llIllIlIlIIIIIIIllII.llllIIIlIlllIlIIIIIl();
                    }
                    if (llIllIIIIIllIlIIIIlI2) {
                        this.llIIlIIIlIIIllIlIIIl();
                    }
                    lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(true);
                    if (!(lIlIlIIIllIIllIIIllI instanceof llllIIIIlIIIlIlllIll) || !((llllIIIIlIIIlIlllIll)lIlIlIIIllIIllIIIllI).IlIIIlIlIIIllIlIlIIl()) {
                        this.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIIIllIIllIlllllI, iiiIlllIIIIIIlIIIlll, ilIlIIIIIIlllIlIllIl, ilIlIlIlIlllllllllIl, ilIllIlIlIIIlIlIlIII, iIlllIIlIllIllIlIIll, 0.0625f);
                    }
                }
                if (net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()) {
                    this.lIlIlIIIllIIllIIIllI = null;
                }
                lllllIlIIIlIlIIlllII.IIlllIlIIllIlIlIlIIl();
            }
            catch (Exception ex) {
                IIllIIIlIIlIlIlIIIII.llllIIIIlIIIlIlllIll.error("Couldn't render entity", (Throwable)ex);
            }
            lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(lIIIIlIlIllllIIlIllI.lllIIIIlllllIlIIllIl);
            lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll();
            lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(lIIIIlIlIllllIIlIllI.IIlllIIlIllIllIlIIll);
            lllllIlIIIlIlIIlllII.llllIIllllIlIlIIIIll();
            lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
            if (!this.lIIIlllIIIllIIIllIII) {
                super.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, n, n2, n3, n4, ilIlIIIIIIlllIlIllIl);
            }
            if (net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.aH.llIllIIIIIllIlIIIIlI()) {
                net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.aH, lIlIlIIIllIIllIIIllI, this, n, n2, n3);
            }
        }
    }
    
    protected boolean llIllIIIIIllIlIIIIlI(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        int ilIlIlIlIlllllllllIl = 16777215;
        if (lllIIIIlllllIlIIllIl instanceof llllIIIIlIIIlIlllIll) {
            final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII = (lIIIlllIIIllIIIllIII)lllIIIIlllllIlIIllIl.w();
            if (liiIlllIIIllIIIllIII != null) {
                final String ilIlIlIlIlllllllllIl2 = FontRenderer.IlIlIlIlIlllllllllIl(liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl());
                if (ilIlIlIlIlllllllllIl2.length() >= 2) {
                    ilIlIlIlIlllllllllIl = this.llIllIIIIIllIlIIIIlI().IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl2.charAt(1));
                }
            }
        }
        final float n = (ilIlIlIlIlllllllllIl >> 16 & 0xFF) / 255.0f;
        final float n2 = (ilIlIlIlIlllllllllIl >> 8 & 0xFF) / 255.0f;
        final float n3 = (ilIlIlIlIlllllllllIl & 0xFF) / 255.0f;
        lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl();
        lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(lIIIIlIlIllllIIlIllI.IIlllIIlIllIllIlIIll);
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(n, n2, n3, 1.0f);
        lllllIlIIIlIlIIlllII.IlIlIIIlIIlIlIIlllIl();
        lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(lIIIIlIlIllllIIlIllI.lllIIIIlllllIlIIllIl);
        lllllIlIIIlIlIIlllII.IlIlIIIlIIlIlIIlllIl();
        lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(lIIIIlIlIllllIIlIllI.IIlllIIlIllIllIlIIll);
        return true;
    }
    
    protected void lIIIlllIIIllIIIllIII() {
        lllllIlIIIlIlIIlllII.IlIlIIIllIllIIIIIllI();
        lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(lIIIIlIlIllllIIlIllI.IIlllIIlIllIllIlIIll);
        lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll();
        lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(lIIIIlIlIllllIIlIllI.lllIIIIlllllIlIIllIl);
        lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll();
        lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(lIIIIlIlIllllIIlIllI.IIlllIIlIllIllIlIIll);
    }
    
    protected void llllIIIIlIIIlIlllIll(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        final boolean b = !lllIIIIlllllIlIIllIl.IIIIIIIllllIlIIIIIII();
        final boolean b2 = !b && !lllIIIIlllllIlIIllIl.llIllIIIIIllIlIIIIlI(Minecraft.getMinecraft().lIIIIlIIIIIlllIllIII);
        if (b || b2) {
            if (!this.llIllIIIIIllIlIIIIlI(lllIIIIlllllIlIIllIl)) {
                return;
            }
            if (b2) {
                lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
                lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 0.15f);
                lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(false);
                lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(770, 771);
                lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(516, 0.003921569f);
            }
            this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl, n, n2, n3, n4, n5, n6);
            if (b2) {
                lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
                lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(516, 0.1f);
                lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
                lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(true);
            }
        }
    }
    
    protected boolean llIllIIIIIllIlIIIIlI(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final float n) {
        return this.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl, n, true);
    }
    
    protected boolean llllIIIIlIIIlIlllIll(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final float n, final boolean b) {
        final int llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl, lllIIIIlllllIlIIllIl.b_(n), n);
        final boolean b2 = (llllIIIIlIIIlIlllIll >> 24 & 0xFF) > 0;
        final boolean b3 = lllIIIIlllllIlIIllIl.IIlllIIlIllIllIlIIll > 0 || lllIIIIlllllIlIIllIl.llIlllIlllllIIllIIII > 0;
        if (!b2 && !b3) {
            return false;
        }
        if (!b2 && !b) {
            return false;
        }
        lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(lIIIIlIlIllllIIlIllI.IIlllIIlIllIllIlIIll);
        lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll();
        GL11.glTexEnvi(8960, 8704, lIIIIlIlIllllIIlIllI.IIllIIllIIIlIlIIIIlI);
        GL11.glTexEnvi(8960, lIIIIlIlIllllIIlIllI.IIIlIIlIIIIlllIlllII, 8448);
        GL11.glTexEnvi(8960, lIIIIlIlIllllIIlIllI.IlIlIllllllllIIIIlII, lIIIIlIlIllllIIlIllI.IIlllIIlIllIllIlIIll);
        GL11.glTexEnvi(8960, lIIIIlIlIllllIIlIllI.IIlllIlIIllIlIlIlIIl, lIIIIlIlIllllIIlIllI.IlIlIIIlIIlIlIIlllIl);
        GL11.glTexEnvi(8960, lIIIIlIlIllllIIlIllI.lllllIlIIIlIlIIlllII, 768);
        GL11.glTexEnvi(8960, lIIIIlIlIllllIIlIllI.lIllllllIIllIlIlIlII, 768);
        GL11.glTexEnvi(8960, lIIIIlIlIllllIIlIllI.IIlllIIIlIlllIIlllII, 7681);
        GL11.glTexEnvi(8960, lIIIIlIlIllllIIlIllI.IIlIIIIIllIlIIIlIIll, lIIIIlIlIllllIIlIllI.IIlllIIlIllIllIlIIll);
        GL11.glTexEnvi(8960, lIIIIlIlIllllIIlIllI.IlIIIlIIIllllIlIlIlI, 770);
        lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(lIIIIlIlIllllIIlIllI.lllIIIIlllllIlIIllIl);
        lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll();
        GL11.glTexEnvi(8960, 8704, lIIIIlIlIllllIIlIllI.IIllIIllIIIlIlIIIIlI);
        GL11.glTexEnvi(8960, lIIIIlIlIllllIIlIllI.IIIlIIlIIIIlllIlllII, lIIIIlIlIllllIIlIllI.IIIlIIIlIlIIlllIIlll);
        GL11.glTexEnvi(8960, lIIIIlIlIllllIIlIllI.IlIlIllllllllIIIIlII, lIIIIlIlIllllIIlIllI.IlllllllIIIlIIIlIlII);
        GL11.glTexEnvi(8960, lIIIIlIlIllllIIlIllI.IIlllIlIIllIlIlIlIIl, lIIIIlIlIllllIIlIllI.IIlIIIIlllIlllllIlII);
        GL11.glTexEnvi(8960, lIIIIlIlIllllIIlIllI.llIIIlIlIllIIlIlIlII, lIIIIlIlIllllIIlIllI.IlllllllIIIlIIIlIlII);
        GL11.glTexEnvi(8960, lIIIIlIlIllllIIlIllI.lllllIlIIIlIlIIlllII, 768);
        GL11.glTexEnvi(8960, lIIIIlIlIllllIIlIllI.lIllllllIIllIlIlIlII, 768);
        GL11.glTexEnvi(8960, lIIIIlIlIllllIIlIllI.llIIlllIIlllIIllIllI, 770);
        GL11.glTexEnvi(8960, lIIIIlIlIllllIIlIllI.IIlllIIIlIlllIIlllII, 7681);
        GL11.glTexEnvi(8960, lIIIIlIlIllllIIlIllI.IIlIIIIIllIlIIIlIIll, lIIIIlIlIllllIIlIllI.IIlIIIIlllIlllllIlII);
        GL11.glTexEnvi(8960, lIIIIlIlIllllIIlIllI.IlIIIlIIIllllIlIlIlI, 770);
        this.llllIIIlIlllIlIIIIIl.position(0);
        if (b3) {
            this.llllIIIlIlllIlIIIIIl.put(1.0f);
            this.llllIIIlIlllIlIIIIIl.put(0.0f);
            this.llllIIIlIlllIlIIIIIl.put(0.0f);
            this.llllIIIlIlllIlIIIIIl.put(0.3f);
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
                llIIlllIIlllIIllIllI.IlIlIlIlIlllllllllIl(1.0f, 0.0f, 0.0f, 0.3f);
            }
        }
        else {
            final float n2 = (llllIIIIlIIIlIlllIll >> 24 & 0xFF) / 255.0f;
            final float n3 = (llllIIIIlIIIlIlllIll >> 16 & 0xFF) / 255.0f;
            final float n4 = (llllIIIIlIIIlIlllIll >> 8 & 0xFF) / 255.0f;
            final float n5 = (llllIIIIlIIIlIlllIll & 0xFF) / 255.0f;
            this.llllIIIlIlllIlIIIIIl.put(n3);
            this.llllIIIlIlllIlIIIIIl.put(n4);
            this.llllIIIlIlllIlIIIIIl.put(n5);
            this.llllIIIlIlllIlIIIIIl.put(1.0f - n2);
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
                llIIlllIIlllIIllIllI.IlIlIlIlIlllllllllIl(n3, n4, n5, 1.0f - n2);
            }
        }
        this.llllIIIlIlllIlIIIIIl.flip();
        GL11.glTexEnv(8960, 8705, this.llllIIIlIlllIlIIIIIl);
        lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(lIIIIlIlIllllIIlIllI.IlIlIIIIIIlllIlIllIl);
        lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll();
        lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(IIllIIIlIIlIlIlIIIII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll());
        GL11.glTexEnvi(8960, 8704, lIIIIlIlIllllIIlIllI.IIllIIllIIIlIlIIIIlI);
        GL11.glTexEnvi(8960, lIIIIlIlIllllIIlIllI.IIIlIIlIIIIlllIlllII, 8448);
        GL11.glTexEnvi(8960, lIIIIlIlIllllIIlIllI.IlIlIllllllllIIIIlII, lIIIIlIlIllllIIlIllI.IIlIIIIlllIlllllIlII);
        GL11.glTexEnvi(8960, lIIIIlIlIllllIIlIllI.IIlllIlIIllIlIlIlIIl, lIIIIlIlIllllIIlIllI.lllIIIIlllllIlIIllIl);
        GL11.glTexEnvi(8960, lIIIIlIlIllllIIlIllI.lllllIlIIIlIlIIlllII, 768);
        GL11.glTexEnvi(8960, lIIIIlIlIllllIIlIllI.lIllllllIIllIlIlIlII, 768);
        GL11.glTexEnvi(8960, lIIIIlIlIllllIIlIllI.IIlllIIIlIlllIIlllII, 7681);
        GL11.glTexEnvi(8960, lIIIIlIlIllllIIlIllI.IIlIIIIIllIlIIIlIIll, lIIIIlIlIllllIIlIllI.IIlIIIIlllIlllllIlII);
        GL11.glTexEnvi(8960, lIIIIlIlIllllIIlIllI.IlIIIlIIIllllIlIlIlI, 770);
        lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(lIIIIlIlIllllIIlIllI.IIlllIIlIllIllIlIIll);
        return true;
    }
    
    protected void llIIlIIIlIIIllIlIIIl() {
        lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(lIIIIlIlIllllIIlIllI.IIlllIIlIllIllIlIIll);
        lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll();
        GL11.glTexEnvi(8960, 8704, lIIIIlIlIllllIIlIllI.IIllIIllIIIlIlIIIIlI);
        GL11.glTexEnvi(8960, lIIIIlIlIllllIIlIllI.IIIlIIlIIIIlllIlllII, 8448);
        GL11.glTexEnvi(8960, lIIIIlIlIllllIIlIllI.IlIlIllllllllIIIIlII, lIIIIlIlIllllIIlIllI.IIlllIIlIllIllIlIIll);
        GL11.glTexEnvi(8960, lIIIIlIlIllllIIlIllI.IIlllIlIIllIlIlIlIIl, lIIIIlIlIllllIIlIllI.IlIlIIIlIIlIlIIlllIl);
        GL11.glTexEnvi(8960, lIIIIlIlIllllIIlIllI.lllllIlIIIlIlIIlllII, 768);
        GL11.glTexEnvi(8960, lIIIIlIlIllllIIlIllI.lIllllllIIllIlIlIlII, 768);
        GL11.glTexEnvi(8960, lIIIIlIlIllllIIlIllI.IIlllIIIlIlllIIlllII, 8448);
        GL11.glTexEnvi(8960, lIIIIlIlIllllIIlIllI.IIlIIIIIllIlIIIlIIll, lIIIIlIlIllllIIlIllI.IIlllIIlIllIllIlIIll);
        GL11.glTexEnvi(8960, lIIIIlIlIllllIIlIllI.llllllIllIllIlIllllI, lIIIIlIlIllllIIlIllI.IlIlIIIlIIlIlIIlllIl);
        GL11.glTexEnvi(8960, lIIIIlIlIllllIIlIllI.IlIIIlIIIllllIlIlIlI, 770);
        GL11.glTexEnvi(8960, lIIIIlIlIllllIIlIllI.IIIIIllIIIIlIIIIllIl, 770);
        lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(lIIIIlIlIllllIIlIllI.lllIIIIlllllIlIIllIl);
        GL11.glTexEnvi(8960, 8704, lIIIIlIlIllllIIlIllI.IIllIIllIIIlIlIIIIlI);
        GL11.glTexEnvi(8960, lIIIIlIlIllllIIlIllI.IIIlIIlIIIIlllIlllII, 8448);
        GL11.glTexEnvi(8960, lIIIIlIlIllllIIlIllI.lllllIlIIIlIlIIlllII, 768);
        GL11.glTexEnvi(8960, lIIIIlIlIllllIIlIllI.lIllllllIIllIlIlIlII, 768);
        GL11.glTexEnvi(8960, lIIIIlIlIllllIIlIllI.IlIlIllllllllIIIIlII, 5890);
        GL11.glTexEnvi(8960, lIIIIlIlIllllIIlIllI.IIlllIlIIllIlIlIlIIl, lIIIIlIlIllllIIlIllI.IIlIIIIlllIlllllIlII);
        GL11.glTexEnvi(8960, lIIIIlIlIllllIIlIllI.IIlllIIIlIlllIIlllII, 8448);
        GL11.glTexEnvi(8960, lIIIIlIlIllllIIlIllI.IlIIIlIIIllllIlIlIlI, 770);
        GL11.glTexEnvi(8960, lIIIIlIlIllllIIlIllI.IIlIIIIIllIlIIIlIIll, 5890);
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
        lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(lIIIIlIlIllllIIlIllI.IlIlIIIIIIlllIlIllIl);
        lllllIlIIIlIlIIlllII.IlIlIIIlIIlIlIIlllIl();
        lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(0);
        GL11.glTexEnvi(8960, 8704, lIIIIlIlIllllIIlIllI.IIllIIllIIIlIlIIIIlI);
        GL11.glTexEnvi(8960, lIIIIlIlIllllIIlIllI.IIIlIIlIIIIlllIlllII, 8448);
        GL11.glTexEnvi(8960, lIIIIlIlIllllIIlIllI.lllllIlIIIlIlIIlllII, 768);
        GL11.glTexEnvi(8960, lIIIIlIlIllllIIlIllI.lIllllllIIllIlIlIlII, 768);
        GL11.glTexEnvi(8960, lIIIIlIlIllllIIlIllI.IlIlIllllllllIIIIlII, 5890);
        GL11.glTexEnvi(8960, lIIIIlIlIllllIIlIllI.IIlllIlIIllIlIlIlIIl, lIIIIlIlIllllIIlIllI.IIlIIIIlllIlllllIlII);
        GL11.glTexEnvi(8960, lIIIIlIlIllllIIlIllI.IIlllIIIlIlllIIlllII, 8448);
        GL11.glTexEnvi(8960, lIIIIlIlIllllIIlIllI.IlIIIlIIIllllIlIlIlI, 770);
        GL11.glTexEnvi(8960, lIIIIlIlIllllIIlIllI.IIlIIIIIllIlIIIlIIll, 5890);
        lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(lIIIIlIlIllllIIlIllI.IIlllIIlIllIllIlIIll);
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
            llIIlllIIlllIIllIllI.IlIlIlIlIlllllllllIl(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }
    
    protected void llllIIIIlIIIlIlllIll(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final double n, final double n2, final double n3) {
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl((float)n, (float)n2, (float)n3);
    }
    
    protected void llllIIIIlIIIlIlllIll(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final float n, final float n2, final float n3) {
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(180.0f - n2, 0.0f, 1.0f, 0.0f);
        if (lllIIIIlllllIlIIllIl.llIlllIlllllIIllIIII > 0) {
            float llIllIIIIIllIlIIIIlI = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI((lllIIIIlllllIlIIllIl.llIlllIlllllIIllIIII + n3 - 1.0f) / 20.0f * 1.6f);
            if (llIllIIIIIllIlIIIIlI > 1.0f) {
                llIllIIIIIllIlIIIIlI = 1.0f;
            }
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI * this.IlIlIlIlIlllllllllIl(lllIIIIlllllIlIIllIl), 0.0f, 0.0f, 1.0f);
            if (!Leaf.instance.modManager.killEffectMod.lIlIlIIIllIIllIIIllI()) {
                return;
            }
            if (lllIIIIlllllIlIIllIl.llIlllIlllllIIllIIII == 1) {
                Leaf.instance.modManager.killEffectMod.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl);
            }
            if (lllIIIIlllllIlIIllIl.llIlllIlllllIIllIIII == 2) {
                Leaf.instance.modManager.killEffectMod.name = false;
            }
        }
        else {
            final String llllIIIIlIIIlIlllIll = IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl.s_());
            if (llllIIIIlIIIlIlllIll != null && (llllIIIIlIIIlIlllIll.equals("Dinnerbone") || llllIIIIlIIIlIlllIll.equals("Grumm")) && (!(lllIIIIlllllIlIIllIl instanceof llllIIIIlIIIlIlllIll) || ((llllIIIIlIIIlIlllIll)lllIIIIlllllIlIIllIl).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll))) {
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, lllIIIIlllllIlIIllIl.IlIllllIIlIIlIlIlIll + 0.1f, 0.0f);
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(180.0f, 0.0f, 0.0f, 1.0f);
            }
        }
    }
    
    protected float IlIIIlIlIIIllIlIlIIl(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final float n) {
        return lllIIIIlllllIlIIllIl.IlIlIIIllIIllIlllllI(n);
    }
    
    protected float IlIlIlIlIlllllllllIl(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final float n) {
        return lllIIIIlllllIlIIllIl.lllllIIIIIlIlIIIIIIl + n;
    }
    
    protected void llllIIIIlIIIlIlllIll(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7) {
        for (final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII : this.lIIIIlIIIIIlllIllIII) {
            final boolean llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl, n3, ilIllIlIlIIIlIlIlIII.IlIlIlIlIlllllllllIl());
            if (net.optifine.llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll()) {
                net.optifine.llIllIlIlIIIIIIIllII.llIllIIIIIllIlIIIIlI();
            }
            if (this.IlIlIIIlIIlIlIIlllIl) {
                lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
            }
            ilIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl, n, n2, n3, n4, n5, n6, n7);
            if (this.IlIlIIIlIIlIlIIlllIl) {
                lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
            }
            if (net.optifine.llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll()) {
                if (net.optifine.llIllIlIlIIIIIIIllII.IlIIIlIlIIIllIlIlIIl()) {
                    this.IlIlIIIlIIlIlIIlllIl = true;
                    net.optifine.llIllIlIlIIIIIIIllII.IlIlIIIllIllIIIIIllI();
                    lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
                    ilIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl, n, n2, n3, n4, n5, n6, n7);
                    lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
                    net.optifine.llIllIlIlIIIIIIIllII.IllIIlllIIIIlllIIlIl();
                }
                net.optifine.llIllIlIlIIIIIIIllII.llllIIIlIlllIlIIIIIl();
            }
            if (llllIIIIlIIIlIlllIll) {
                this.llIIlIIIlIIIllIlIIIl();
            }
        }
    }
    
    protected float IlIlIlIlIlllllllllIl(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        return 90.0f;
    }
    
    protected int llllIIIIlIIIlIlllIll(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final float n, final float n2) {
        return 0;
    }
    
    protected void llllIIIIlIIIlIlllIll(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final float n) {
    }
    
    public void IlIlIlIlIlllllllllIl(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final double n, final double n2, final double n3) {
        if (!net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.aJ.llIllIIIIIllIlIIIIlI() || !net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.aJ, lllIIIIlllllIlIIllIl, this, n, n2, n3)) {
            if (this.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl)) {
                final double ilIlIIIllIllIIIIIllI = lllIIIIlllllIlIIllIl.IlIlIIIllIllIIIIIllI(this.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI);
                final float n4 = lllIIIIlllllIlIIllIl.IIIIIllIIIIlIIIIllIl() ? IIllIIIlIIlIlIlIIIII.llIllIlIIIIllIlIIllI : IIllIIIlIIlIlIlIIIII.llIIlIIIlIIIllIlIIIl;
                if (ilIlIIIllIllIIIIIllI < n4 * n4) {
                    final String liiIlllIIIllIIIllIII = lllIIIIlllllIlIIllIl.v_().lIIIlllIIIllIIIllIII();
                    lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(516, 0.1f);
                    if (lllIIIIlllllIlIIllIl.IIIIIllIIIIlIIIIllIl()) {
                        final FontRenderer llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI();
                        lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
                        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl((float)n, (float)n2 + lllIIIIlllllIlIIllIl.IlIllllIIlIIlIlIlIll + 0.5f - (lllIIIIlllllIlIIllIl.e_() ? (lllIIIIlllllIlIIllIl.IlIllllIIlIIlIlIlIll / 2.0f) : 0.0f), (float)n3);
                        GL11.glNormal3f(0.0f, 1.0f, 0.0f);
                        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-this.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI, 0.0f, 1.0f, 0.0f);
                        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(this.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl, 1.0f, 0.0f, 0.0f);
                        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(-0.02666667f, -0.02666667f, 0.02666667f);
                        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, 9.374999f, 0.0f);
                        lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl();
                        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(false);
                        lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
                        lllllIlIIIlIlIIlllII.IlIlIIIlIIlIlIIlllIl();
                        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(770, 771, 1, 0);
                        final int n5 = llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII) / 2;
                        final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll = IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
                        final lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI2 = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
                        llIllIIIIIllIlIIIIlI2.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII);
                        llIllIIIIIllIlIIIIlI2.IlIlIlIlIlllllllllIl(-n5 - 1, -1.0, 0.0).llllIIIIlIIIlIlllIll(0.0f, 0.0f, 0.0f, 0.25f).IlIlIIIllIllIIIIIllI();
                        llIllIIIIIllIlIIIIlI2.IlIlIlIlIlllllllllIl(-n5 - 1, 8.0, 0.0).llllIIIIlIIIlIlllIll(0.0f, 0.0f, 0.0f, 0.25f).IlIlIIIllIllIIIIIllI();
                        llIllIIIIIllIlIIIIlI2.IlIlIlIlIlllllllllIl(n5 + 1, 8.0, 0.0).llllIIIIlIIIlIlllIll(0.0f, 0.0f, 0.0f, 0.25f).IlIlIIIllIllIIIIIllI();
                        llIllIIIIIllIlIIIIlI2.IlIlIlIlIlllllllllIl(n5 + 1, -1.0, 0.0).llllIIIIlIIIlIlllIll(0.0f, 0.0f, 0.0f, 0.25f).IlIlIIIllIllIIIIIllI();
                        llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
                        lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll();
                        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(true);
                        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII, -llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII) / 2, 0, 553648127);
                        lllllIlIIIlIlIIlllII.IlIlIIIllIllIIIIIllI();
                        lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
                        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
                        lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
                    }
                    else {
                        this.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl, n, n2 - (lllIIIIlllllIlIIllIl.e_() ? (lllIIIIlllllIlIIllIl.IlIllllIIlIIlIlIlIll / 2.0f) : 0.0), n3, liiIlllIIIllIIIllIII, 0.02666667f, ilIlIIIllIllIIIIIllI);
                    }
                }
            }
            if (net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.aL.llIllIIIIIllIlIIIIlI()) {
                net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.aL, lllIIIIlllllIlIIllIl, this, n, n2, n3);
            }
        }
    }
    
    protected boolean llllIIIIlIIIlIlllIll(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        final net.minecraft.client.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI liiiIlIIIIIlllIllIII = Minecraft.getMinecraft().lIIIIlIIIIIlllIllIII;
        if (lllIIIIlllllIlIIllIl instanceof llllIIIIlIIIlIlllIll && lllIIIIlllllIlIIllIl != liiiIlIIIIIlllIllIII) {
            final IlIlIIIllIIllIlllllI w = lllIIIIlllllIlIIllIl.w();
            final IlIlIIIllIIllIlllllI w2 = liiiIlIIIIIlllIllIII.w();
            if (w != null) {
                switch (lIlIlIIIllIIllIIIllI()[w.lIIIIlIIIIIlllIllIII().ordinal()]) {
                    case 1: {
                        return true;
                    }
                    case 2: {
                        return false;
                    }
                    case 3: {
                        return w2 == null || w.llllIIIIlIIIlIlllIll(w2);
                    }
                    case 4: {
                        return w2 == null || !w.llllIIIIlIIIlIlllIll(w2);
                    }
                    default: {
                        return true;
                    }
                }
            }
        }
        return Minecraft.IlIlIIIlIIlIlIIlllIl() && lllIIIIlllllIlIIllIl != this.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI && !lllIIIIlllllIlIIllIl.llIllIIIIIllIlIIIIlI(liiiIlIIIIIlllIllIII) && lllIIIIlllllIlIIllIl.IIllIIllIIIlIlIIIIlI == null;
    }
    
    public void llllIIIIlIIIlIlllIll(final boolean liiIlllIIIllIIIllIII) {
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
    }
    
    public List llIllIlIIIIllIlIIllI() {
        return this.lIIIIlIIIIIlllIllIII;
    }
    
    static /* synthetic */ int[] lIlIlIIIllIIllIIIllI() {
        final int[] illlllllIIIlIIIlIlII = IIllIIIlIIlIlIlIIIII.IlllllllIIIlIIIlIlII;
        if (illlllllIIIlIIIlIlII != null) {
            return illlllllIIIlIIIlIlII;
        }
        final int[] illlllllIIIlIIIlIlII2 = new int[IIIIlllIIIIIIlIIIlll.values().length];
        try {
            illlllllIIIlIIIlIlII2[IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            illlllllIIIlIIIlIlII2[IIIIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            illlllllIIIlIIIlIlII2[IIIIlllIIIIIIlIIIlll.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            illlllllIIIlIIIlIlII2[IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        return IIllIIIlIIlIlIlIIIII.IlllllllIIIlIIIlIlII = illlllllIIIlIIIlIlII2;
    }
}
