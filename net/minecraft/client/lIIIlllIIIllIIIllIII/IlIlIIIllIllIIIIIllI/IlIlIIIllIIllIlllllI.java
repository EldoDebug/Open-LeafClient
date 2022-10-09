package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI;

import net.minecraft.client.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll.*;
import com.google.common.collect.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.optifine.*;
import java.awt.image.*;
import java.util.concurrent.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llIllIIIIIllIlIIIIlI.*;
import net.optifine.util.*;
import java.util.*;
import net.optifine.shaders.*;

public class IlIlIIIllIIllIlllllI
{
    private final String IlllllllIIIlIIIlIlII;
    protected List llllIIIIlIIIlIlllIll;
    protected int[][] IlIlIlIlIlllllllllIl;
    private IlIlIlIlIlllllllllIl IIlIIIIlllIlllllIlII;
    protected boolean llIllIIIIIllIlIIIIlI;
    protected int IlIIIlIlIIIllIlIlIIl;
    protected int IlIlIIIllIllIIIIIllI;
    protected int IllIIlllIIIIlllIIlIl;
    protected int llllIIIlIlllIlIIIIIl;
    private float IIIlIIlIIIIlllIlllII;
    private float IlIlIllllllllIIIIlII;
    private float IIlllIlIIllIlIlIlIIl;
    private float llIIIlIlIllIIlIlIlII;
    protected int lIIIIlIIIIIlllIllIII;
    protected int lIIIlllIIIllIIIllIII;
    private static String lllllIlIIIlIlIIlllII;
    private static String lIllllllIIllIlIlIlII;
    private int llIIlllIIlllIIllIllI;
    public float llIIlIIIlIIIllIlIIIl;
    public float llIllIlIIIIllIlIIllI;
    public int lIlIlIIIllIIllIIIllI;
    public int IlIlIIIllIIllIlllllI;
    public int IIIIlllIIIIIIlIIIlll;
    public IlIlIIIllIIllIlllllI llllIIllllIlIlIIIIll;
    public boolean IlIllIlIlIIIlIlIlIII;
    public int IIlllIIlIllIllIlIIll;
    public IlIlIIIllIIllIlllllI lllIIIIlllllIlIIllIl;
    public IlIlIIIllIIllIlllllI IlIlIIIIIIlllIlIllIl;
    public boolean IIllIIllIIIlIlIIIIlI;
    public boolean IIIlIIIlIlIIlllIIlll;
    public IlIlIIIllIIllIlllllI IlIlIIIlIIlIlIIlllIl;
    private int IIlllIIIlIlllIIlllII;
    private boolean IIlIIIIIllIlIIIlIIll;
    
    static {
        IlIlIIIllIIllIlllllI.lllllIlIIIlIlIIlllII = "builtin/clock";
        IlIlIIIllIIllIlllllI.lIllllllIIllIlIlIlII = "builtin/compass";
    }
    
    private IlIlIIIllIIllIlllllI(final String illlllllIIIlIIIlIlII, final boolean ilIllIlIlIIIlIlIlIII) {
        this.llllIIIIlIIIlIlllIll = Lists.newArrayList();
        this.llIIlllIIlllIIllIllI = -1;
        this.IIIIlllIIIIIIlIIIlll = -1;
        this.llllIIllllIlIlIIIIll = null;
        this.IlIllIlIlIIIlIlIlIII = false;
        this.IIlllIIlIllIllIlIIll = 0;
        this.lllIIIIlllllIlIIllIl = null;
        this.IlIlIIIIIIlllIlIllIl = null;
        this.IIllIIllIIIlIlIIIIlI = false;
        this.IIIlIIIlIlIIlllIIlll = false;
        this.IlIlIIIlIIlIlIIlllIl = null;
        this.IIlllIIIlIlllIIlllII = -1;
        this.IIlIIIIIllIlIIIlIIll = false;
        this.IlllllllIIIlIIIlIlII = illlllllIIIlIIIlIlII;
        this.IlIllIlIlIIIlIlIlIII = ilIllIlIlIIIlIlIlIII;
    }
    
    public IlIlIIIllIIllIlllllI(final String illlllllIIIlIIIlIlII) {
        this.llllIIIIlIIIlIlllIll = Lists.newArrayList();
        this.llIIlllIIlllIIllIllI = -1;
        this.IIIIlllIIIIIIlIIIlll = -1;
        this.llllIIllllIlIlIIIIll = null;
        this.IlIllIlIlIIIlIlIlIII = false;
        this.IIlllIIlIllIllIlIIll = 0;
        this.lllIIIIlllllIlIIllIl = null;
        this.IlIlIIIIIIlllIlIllIl = null;
        this.IIllIIllIIIlIlIIIIlI = false;
        this.IIIlIIIlIlIIlllIIlll = false;
        this.IlIlIIIlIIlIlIIlllIl = null;
        this.IIlllIIIlIlllIIlllII = -1;
        this.IIlIIIIIllIlIIIlIIll = false;
        this.IlllllllIIIlIIIlIlII = illlllllIIIlIIIlIlII;
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIllIIIlIIIIlIIlIIII()) {
            this.llllIIllllIlIlIIIIll = new IlIlIIIllIIllIlllllI(String.valueOf(this.lIIIlllIIIllIIIllIII()) + ".spriteSingle", true);
        }
    }
    
    protected static IlIlIIIllIIllIlllllI llllIIIIlIIIlIlllIll(final lIllllIllIllIIllllll lIllllIllIllIIllllll) {
        final String string = lIllllIllIllIIllllll.toString();
        return IlIlIIIllIIllIlllllI.lllllIlIIIlIlIIlllII.equals(string) ? new llllIIllllIlIlIIIIll(string) : (IlIlIIIllIIllIlllllI.lIllllllIIllIlIlIlII.equals(string) ? new IlIllIlIlIIIlIlIlIII(string) : new IlIlIIIllIIllIlllllI(string));
    }
    
    public static void llllIIIIlIIIlIlllIll(final String lllllIlIIIlIlIIlllII) {
        IlIlIIIllIIllIlllllI.lllllIlIIIlIlIIlllII = lllllIlIIIlIlIIlllII;
    }
    
    public static void IlIlIlIlIlllllllllIl(final String lIllllllIIllIlIlIlII) {
        IlIlIIIllIIllIlllllI.lIllllllIIllIlIlIlII = lIllllllIIllIlIlIlII;
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final int ilIIIlIlIIIllIlIlIIl, final int ilIlIIIllIllIIIIIllI, final boolean llIllIIIIIllIlIIIIlI) {
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        final float n3 = (float)(0.009999999776482582 / n);
        final float n4 = (float)(0.009999999776482582 / n2);
        this.IIIlIIlIIIIlllIlllII = ilIIIlIlIIIllIlIlIIl / (float)n + n3;
        this.IlIlIllllllllIIIIlII = (ilIIIlIlIIIllIlIlIIl + this.IllIIlllIIIIlllIIlIl) / (float)n - n3;
        this.IIlllIlIIllIlIlIlIIl = ilIlIIIllIllIIIIIllI / (float)n2 + n4;
        this.llIIIlIlIllIIlIlIlII = (ilIlIIIllIllIIIIIllI + this.llllIIIlIlllIlIIIIIl) / (float)n2 - n4;
        this.llIIlIIIlIIIllIlIIIl = Math.min(this.IIIlIIlIIIIlllIlllII, this.IlIlIllllllllIIIIlII);
        this.llIllIlIIIIllIlIIllI = Math.min(this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII);
        if (this.llllIIllllIlIlIIIIll != null) {
            this.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl, this.llllIIIlIlllIlIIIIIl, 0, 0, false);
        }
        if (this.lllIIIIlllllIlIIllIl != null) {
            this.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(this);
        }
        if (this.IlIlIIIIIIlllIlIllIl != null) {
            this.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll(this);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI) {
        this.IlIIIlIlIIIllIlIlIIl = ilIlIIIllIIllIlllllI.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = ilIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = ilIlIIIllIIllIlllllI.llllIIIlIlllIlIIIIIl;
        this.llIllIIIIIllIlIIIIlI = ilIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI;
        this.IIIlIIlIIIIlllIlllII = ilIlIIIllIIllIlllllI.IIIlIIlIIIIlllIlllII;
        this.IlIlIllllllllIIIIlII = ilIlIIIllIIllIlllllI.IlIlIllllllllIIIIlII;
        this.IIlllIlIIllIlIlIlIIl = ilIlIIIllIIllIlllllI.IIlllIlIIllIlIlIlIIl;
        this.llIIIlIlIllIIlIlIlII = ilIlIIIllIIllIlllllI.llIIIlIlIllIIlIlIlII;
        if (ilIlIIIllIIllIlllllI != net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.w().IlIIIlIlIIIllIlIlIIl()) {
            this.llIIlllIIlllIIllIllI = ilIlIIIllIIllIlllllI.llIIlllIIlllIIllIllI;
        }
        this.llIIlIIIlIIIllIlIIIl = ilIlIIIllIIllIlllllI.llIIlIIIlIIIllIlIIIl;
        this.llIllIlIIIIllIlIIllI = ilIlIIIllIIllIlllllI.llIllIlIIIIllIlIIllI;
        this.lIlIlIIIllIIllIIIllI = ilIlIIIllIIllIlllllI.lIlIlIIIllIIllIIIllI;
        this.IlIlIIIllIIllIlllllI = ilIlIIIllIIllIlllllI.IlIlIIIllIIllIlllllI;
        this.IIIIlllIIIIIIlIIIlll = ilIlIIIllIIllIlllllI.IIIIlllIIIIIIlIIIlll;
        this.IIlllIIlIllIllIlIIll = ilIlIIIllIIllIlllllI.IIlllIIlIllIllIlIIll;
        if (this.llllIIllllIlIlIIIIll != null) {
            this.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl, this.llllIIIlIlllIlIIIIIl, 0, 0, false);
        }
        this.IIlllIIIlIlllIIlllII = ilIlIIIllIIllIlllllI.IIlllIIIlIlllIIlllII;
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public int llIllIIIIIllIlIIIIlI() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public int IlIIIlIlIIIllIlIlIIl() {
        return this.llllIIIlIlllIlIIIIIl;
    }
    
    public float IlIlIIIllIllIIIIIllI() {
        return this.IIIlIIlIIIIlllIlllII;
    }
    
    public float IllIIlllIIIIlllIIlIl() {
        return this.IlIlIllllllllIIIIlII;
    }
    
    public float llllIIIIlIIIlIlllIll(final double n) {
        return this.IIIlIIlIIIIlllIlllII + (this.IlIlIllllllllIIIIlII - this.IIIlIIlIIIIlllIlllII) * (float)n / 16.0f;
    }
    
    public float llllIIIlIlllIlIIIIIl() {
        return this.IIlllIlIIllIlIlIlIIl;
    }
    
    public float lIIIIlIIIIIlllIllIII() {
        return this.llIIIlIlIllIIlIlIlII;
    }
    
    public float IlIlIlIlIlllllllllIl(final double n) {
        return this.IIlllIlIIllIlIlIlIIl + (this.llIIIlIlIllIIlIlIlII - this.IIlllIlIIllIlIlIlIIl) * ((float)n / 16.0f);
    }
    
    public String lIIIlllIIIllIIIllIII() {
        return this.IlllllllIIIlIIIlIlII;
    }
    
    public void llIIlIIIlIIIllIlIIIl() {
        if (this.IIlIIIIlllIlllllIlII != null) {
            this.IIlIIIIIllIlIIIlIIll = (!llIIIllIlIllIllIIIIl.llllIIIIlIIIlIlllIll() || llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl(this.IIlllIIIlIlllIIlllII));
            ++this.lIIIlllIIIllIIIllIII;
            if (this.lIIIlllIIIllIIIllIII >= this.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII)) {
                final int llIllIIIIIllIlIIIIlI = this.IIlIIIIlllIlllllIlII.llIllIIIIIllIlIIIIlI(this.lIIIIlIIIIIlllIllIII);
                this.lIIIIlIIIIIlllIllIII = (this.lIIIIlIIIIIlllIllIII + 1) % ((this.IIlIIIIlllIlllllIlII.llIllIIIIIllIlIIIIlI() == 0) ? this.llllIIIIlIIIlIlllIll.size() : this.IIlIIIIlllIlllllIlII.llIllIIIIIllIlIIIIlI());
                this.lIIIlllIIIllIIIllIII = 0;
                final int llIllIIIIIllIlIIIIlI2 = this.IIlIIIIlllIlllllIlII.llIllIIIIIllIlIIIIlI(this.lIIIIlIIIIIlllIllIII);
                final boolean b = false;
                final boolean ilIllIlIlIIIlIlIlIII = this.IlIllIlIlIIIlIlIlIII;
                if (!this.IIlIIIIIllIlIIIlIIll) {
                    return;
                }
                if (llIllIIIIIllIlIIIIlI != llIllIIIIIllIlIIIIlI2 && llIllIIIIIllIlIIIIlI2 >= 0 && llIllIIIIIllIlIIIIlI2 < this.llllIIIIlIIIlIlllIll.size()) {
                    net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.get(llIllIIIIIllIlIIIIlI2), this.IllIIlllIIIIlllIIlIl, this.llllIIIlIlllIlIIIIIl, this.IlIIIlIlIIIllIlIlIIl, this.IlIlIIIllIllIIIIIllI, b, ilIllIlIlIIIlIlIlIII);
                }
            }
            else if (this.IIlIIIIlllIlllllIlII.IlIlIIIllIllIIIIIllI()) {
                if (!this.IIlIIIIIllIlIIIlIIll) {
                    return;
                }
                this.IIIlIIIlIlIIlllIIlll();
            }
        }
    }
    
    private void IIIlIIIlIlIIlllIIlll() {
        final double n = 1.0 - this.lIIIlllIIIllIIIllIII / (double)this.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII);
        final int llIllIIIIIllIlIIIIlI = this.IIlIIIIlllIlllllIlII.llIllIIIIIllIlIIIIlI(this.lIIIIlIIIIIlllIllIII);
        final int llIllIIIIIllIlIIIIlI2 = this.IIlIIIIlllIlllllIlII.llIllIIIIIllIlIIIIlI((this.lIIIIlIIIIIlllIllIII + 1) % ((this.IIlIIIIlllIlllllIlII.llIllIIIIIllIlIIIIlI() == 0) ? this.llllIIIIlIIIlIlllIll.size() : this.IIlIIIIlllIlllllIlII.llIllIIIIIllIlIIIIlI()));
        if (llIllIIIIIllIlIIIIlI != llIllIIIIIllIlIIIIlI2 && llIllIIIIIllIlIIIIlI2 >= 0 && llIllIIIIIllIlIIIIlI2 < this.llllIIIIlIIIlIlllIll.size()) {
            final int[][] array = this.llllIIIIlIIIlIlllIll.get(llIllIIIIIllIlIIIIlI);
            final int[][] array2 = this.llllIIIIlIIIlIlllIll.get(llIllIIIIIllIlIIIIlI2);
            if (this.IlIlIlIlIlllllllllIl == null || this.IlIlIlIlIlllllllllIl.length != array.length) {
                this.IlIlIlIlIlllllllllIl = new int[array.length][];
            }
            for (int i = 0; i < array.length; ++i) {
                if (this.IlIlIlIlIlllllllllIl[i] == null) {
                    this.IlIlIlIlIlllllllllIl[i] = new int[array[i].length];
                }
                if (i < array2.length && array2[i].length == array[i].length) {
                    for (int j = 0; j < array[i].length; ++j) {
                        final int n2 = array[i][j];
                        final int n3 = array2[i][j];
                        this.IlIlIlIlIlllllllllIl[i][j] = ((n2 & 0xFF000000) | (int)(((n2 & 0xFF0000) >> 16) * n + ((n3 & 0xFF0000) >> 16) * (1.0 - n)) << 16 | (int)(((n2 & 0xFF00) >> 8) * n + ((n3 & 0xFF00) >> 8) * (1.0 - n)) << 8 | (int)((n2 & 0xFF) * n + (n3 & 0xFF) * (1.0 - n)));
                    }
                }
            }
            net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, this.IllIIlllIIIIlllIIlIl, this.llllIIIlIlllIlIIIIIl, this.IlIIIlIlIIIllIlIlIIl, this.IlIlIIIllIllIIIIIllI, false, false);
        }
    }
    
    public int[][] llllIIIIlIIIlIlllIll(final int n) {
        return this.llllIIIIlIIIlIlllIll.get(n);
    }
    
    public int llIllIlIIIIllIlIIllI() {
        return this.llllIIIIlIIIlIlllIll.size();
    }
    
    public void IlIlIlIlIlllllllllIl(final int illIIlllIIIIlllIIlIl) {
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        if (this.llllIIllllIlIlIIIIll != null) {
            this.llllIIllllIlIlIIIIll.IlIlIlIlIlllllllllIl(this.IllIIlllIIIIlllIIlIl);
        }
    }
    
    public void llIllIIIIIllIlIIIIlI(final int llllIIIlIlllIlIIIIIl) {
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        if (this.llllIIllllIlIlIIIIll != null) {
            this.llllIIllllIlIlIIIIll.llIllIIIIIllIlIIIIlI(this.llllIIIlIlllIlIIIIIl);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final BufferedImage[] array, final IlIlIlIlIlllllllllIl iIlIIIIlllIlllllIlII) {
        this.IlIlIIIlIIlIlIIlllIl();
        final int width = array[0].getWidth();
        final int height = array[0].getHeight();
        this.IllIIlllIIIIlllIIlIl = width;
        this.llllIIIlIlllIlIIIIIl = height;
        if (this.llllIIllllIlIlIIIIll != null) {
            this.llllIIllllIlIlIIIIll.IllIIlllIIIIlllIIlIl = this.IllIIlllIIIIlllIIlIl;
            this.llllIIllllIlIlIIIIll.llllIIIlIlllIlIIIIIl = this.llllIIIlIlllIlIIIIIl;
        }
        final int[][] array2 = new int[array.length][];
        for (int i = 0; i < array.length; ++i) {
            BufferedImage llllIIIIlIIIlIlllIll = array[i];
            if (llllIIIIlIIIlIlllIll != null) {
                if (this.IllIIlllIIIIlllIIlIl >> i != llllIIIIlIIIlIlllIll.getWidth()) {
                    llllIIIIlIIIlIlllIll = IlIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, this.IllIIlllIIIIlllIIlIl >> i);
                }
                if (i > 0 && (llllIIIIlIIIlIlllIll.getWidth() != width >> i || llllIIIIlIIIlIlllIll.getHeight() != height >> i)) {
                    throw new RuntimeException(String.format("Unable to load miplevel: %d, image is size: %dx%d, expected %dx%d", i, llllIIIIlIIIlIlllIll.getWidth(), llllIIIIlIIIlIlllIll.getHeight(), width >> i, height >> i));
                }
                array2[i] = new int[llllIIIIlIIIlIlllIll.getWidth() * llllIIIIlIIIlIlllIll.getHeight()];
                llllIIIIlIIIlIlllIll.getRGB(0, 0, llllIIIIlIIIlIlllIll.getWidth(), llllIIIIlIIIlIlllIll.getHeight(), array2[i], 0, llllIIIIlIIIlIlllIll.getWidth());
            }
        }
        if (iIlIIIIlllIlllllIlII == null) {
            if (height != width) {
                throw new RuntimeException("broken aspect ratio and not an animation");
            }
            this.llllIIIIlIIIlIlllIll.add(array2);
        }
        else {
            final int n = height / width;
            final int n2 = width;
            final int n3 = width;
            this.llllIIIlIlllIlIIIIIl = this.IllIIlllIIIIlllIIlIl;
            if (iIlIIIIlllIlllllIlII.llIllIIIIIllIlIIIIlI() > 0) {
                for (final int intValue : iIlIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl()) {
                    if (intValue >= n) {
                        throw new RuntimeException("invalid frameindex " + intValue);
                    }
                    this.llllIIIlIlllIlIIIIIl(intValue);
                    this.llllIIIIlIIIlIlllIll.set(intValue, llllIIIIlIIIlIlllIll(array2, n2, n3, intValue));
                }
                this.IIlIIIIlllIlllllIlII = iIlIIIIlllIlllllIlII;
            }
            else {
                final ArrayList arrayList = Lists.newArrayList();
                for (int j = 0; j < n; ++j) {
                    this.llllIIIIlIIIlIlllIll.add(llllIIIIlIIIlIlllIll(array2, n2, n3, j));
                    arrayList.add(new net.minecraft.client.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(j, -1));
                }
                this.IIlIIIIlllIlllllIlII = new IlIlIlIlIlllllllllIl(arrayList, this.IllIIlllIIIIlllIIlIl, this.llllIIIlIlllIlIIIIIl, iIlIIIIlllIlllllIlII.IlIIIlIlIIIllIlIlIIl(), iIlIIIIlllIlllllIlII.IlIlIIIllIllIIIIIllI());
            }
        }
        if (!this.IIllIIllIIIlIlIIIIlI) {
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
                this.IlllllllIIIlIIIlIlII();
            }
            for (int k = 0; k < this.llllIIIIlIIIlIlllIll.size(); ++k) {
                final int[][] array3 = this.llllIIIIlIIIlIlllIll.get(k);
                if (array3 != null && !this.IlllllllIIIlIIIlIlII.startsWith("minecraft:blocks/leaves_")) {
                    for (int l = 0; l < array3.length; ++l) {
                        this.llllIIIIlIIIlIlllIll(array3[l]);
                    }
                }
            }
            if (this.llllIIllllIlIlIIIIll != null) {
                this.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll(array, iIlIIIIlllIlllllIlII);
            }
        }
    }
    
    public void IlIIIlIlIIIllIlIlIIl(final int n) {
        final ArrayList arrayList = Lists.newArrayList();
        for (int i = 0; i < this.llllIIIIlIIIlIlllIll.size(); ++i) {
            final int[][] array = this.llllIIIIlIIIlIlllIll.get(i);
            if (array != null) {
                try {
                    arrayList.add(net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(n, this.IllIIlllIIIIlllIIlIl, array));
                }
                catch (Throwable t) {
                    final net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(t, "Generating mipmaps for frame");
                    final lIIIlllIIIllIIIllIII llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll("Frame being iterated");
                    llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll("Frame index", i);
                    llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll("Frame sizes", new IIIIlllIIIIIIlIIIlll(this, array));
                    throw new IIlIlllIlIlllIlIllll(llllIIIIlIIIlIlllIll);
                }
            }
        }
        this.llllIIIIlIIIlIlllIll(arrayList);
        if (this.llllIIllllIlIlIIIIll != null) {
            this.llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl(n);
        }
    }
    
    private void llllIIIlIlllIlIIIIIl(final int n) {
        if (this.llllIIIIlIIIlIlllIll.size() <= n) {
            for (int i = this.llllIIIIlIIIlIlllIll.size(); i <= n; ++i) {
                this.llllIIIIlIIIlIlllIll.add(null);
            }
        }
        if (this.llllIIllllIlIlIIIIll != null) {
            this.llllIIllllIlIlIIIIll.llllIIIlIlllIlIIIIIl(n);
        }
    }
    
    private static int[][] llllIIIIlIIIlIlllIll(final int[][] array, final int n, final int n2, final int n3) {
        final int[][] array2 = new int[array.length][];
        for (int i = 0; i < array.length; ++i) {
            final int[] array3 = array[i];
            if (array3 != null) {
                array2[i] = new int[(n >> i) * (n2 >> i)];
                System.arraycopy(array3, n3 * array2[i].length, array2[i], 0, array2[i].length);
            }
        }
        return array2;
    }
    
    public void lIlIlIIIllIIllIIIllI() {
        this.llllIIIIlIIIlIlllIll.clear();
        if (this.llllIIllllIlIlIIIIll != null) {
            this.llllIIllllIlIlIIIIll.lIlIlIIIllIIllIIIllI();
        }
    }
    
    public boolean IlIlIIIllIIllIlllllI() {
        return this.IIlIIIIlllIlllllIlII != null;
    }
    
    public void llllIIIIlIIIlIlllIll(final List llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        if (this.llllIIllllIlIlIIIIll != null) {
            this.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
        }
    }
    
    private void IlIlIIIlIIlIlIIlllIl() {
        this.IIlIIIIlllIlllllIlII = null;
        this.llllIIIIlIIIlIlllIll(Lists.newArrayList());
        this.lIIIIlIIIIIlllIllIII = 0;
        this.lIIIlllIIIllIIIllIII = 0;
        if (this.llllIIllllIlIlIIIIll != null) {
            this.llllIIllllIlIlIIIIll.IlIlIIIlIIlIlIIlllIl();
        }
    }
    
    @Override
    public String toString() {
        return "TextureAtlasSprite{name='" + this.IlllllllIIIlIIIlIlII + '\'' + ", frameCount=" + this.llllIIIIlIIIlIlllIll.size() + ", rotated=" + this.llIllIIIIIllIlIIIIlI + ", x=" + this.IlIIIlIlIIIllIlIlIIl + ", y=" + this.IlIlIIIllIllIIIIIllI + ", height=" + this.llllIIIlIlllIlIIIIIl + ", width=" + this.IllIIlllIIIIlllIIlIl + ", u0=" + this.IIIlIIlIIIIlllIlllII + ", u1=" + this.IlIlIllllllllIIIIlII + ", v0=" + this.IIlllIlIIllIlIlIlIIl + ", v1=" + this.llIIIlIlIllIIlIlIlII + '}';
    }
    
    public boolean llllIIIIlIIIlIlllIll(final net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI, final lIllllIllIllIIllllll lIllllIllIllIIllllll) {
        return false;
    }
    
    public boolean IlIlIlIlIlllllllllIl(final net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI, final lIllllIllIllIIllllll lIllllIllIllIIllllll) {
        return true;
    }
    
    public int IIIIlllIIIIIIlIIIlll() {
        return this.llIIlllIIlllIIllIllI;
    }
    
    public void IlIlIIIllIllIIIIIllI(final int llIIlllIIlllIIllIllI) {
        this.llIIlllIIlllIIllIllI = llIIlllIIlllIIllIllI;
    }
    
    public void llllIIIIlIIIlIlllIll(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        if (this.llIIlllIIlllIIllIllI < 0) {
            this.llIIlllIIlllIIllIllI = liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll();
        }
    }
    
    public int llllIIllllIlIlIIIIll() {
        return this.IIlllIIIlIlllIIlllII;
    }
    
    public void IllIIlllIIIIlllIIlIl(final int iIlllIIIlIlllIIlllII) {
        this.IIlllIIIlIlllIIlllII = iIlllIIIlIlllIIlllII;
        if (this.lllIIIIlllllIlIIllIl != null) {
            this.lllIIIIlllllIlIIllIl.IllIIlllIIIIlllIIlIl(iIlllIIIlIlllIIlllII);
        }
        if (this.IlIlIIIIIIlllIlIllIl != null) {
            this.IlIlIIIIIIlllIlIllIl.IllIIlllIIIIlllIIlIl(iIlllIIIlIlllIIlllII);
        }
    }
    
    public boolean IlIllIlIlIIIlIlIlIII() {
        return this.IIlIIIIIllIlIIIlIIll;
    }
    
    private void llllIIIIlIIIlIlllIll(final int[] array) {
        if (array != null) {
            long n = 0L;
            long n2 = 0L;
            long n3 = 0L;
            long n4 = 0L;
            for (int i = 0; i < array.length; ++i) {
                final int n5 = array[i];
                if ((n5 >> 24 & 0xFF) >= 16) {
                    final int n6 = n5 >> 16 & 0xFF;
                    final int n7 = n5 >> 8 & 0xFF;
                    final int n8 = n5 & 0xFF;
                    n += n6;
                    n2 += n7;
                    n3 += n8;
                    ++n4;
                }
            }
            if (n4 > 0L) {
                final int n9 = (int)(n / n4) << 16 | (int)(n2 / n4) << 8 | (int)(n3 / n4);
                for (int j = 0; j < array.length; ++j) {
                    if ((array[j] >> 24 & 0xFF) <= 16) {
                        array[j] = n9;
                    }
                }
            }
        }
    }
    
    public double llllIIIIlIIIlIlllIll(final float n) {
        return (n - this.IIIlIIlIIIIlllIlllII) / (this.IlIlIllllllllIIIIlII - this.IIIlIIlIIIIlllIlllII) * 16.0f;
    }
    
    public double IlIlIlIlIlllllllllIl(final float n) {
        return (n - this.IIlllIlIIllIlIlIlIIl) / (this.llIIIlIlIllIIlIlIlII - this.IIlllIlIIllIlIlIlIIl) * 16.0f;
    }
    
    public void IIlllIIlIllIllIlIIll() {
        if (this.IIIIlllIIIIIIlIIIlll < 0) {
            net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.IIIIlllIIIIIIlIIIlll = net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(), this.IIlllIIlIllIllIlIIll, this.IllIIlllIIIIlllIIlIl, this.llllIIIlIlllIlIIIIIl);
            IlIIIlIIIllllIlIlIlI.IlIIIlIlIIIllIlIlIIl();
        }
        IlIIIlIIIllllIlIlIlI.IlIIIlIlIIIllIlIlIIl(this.IIIIlllIIIIIIlIIIlll);
    }
    
    public void lllIIIIlllllIlIIllIl() {
        if (this.IIIIlllIIIIIIlIIIlll >= 0) {
            net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.IIIIlllIIIIIIlIIIlll);
            this.IIIIlllIIIIIIlIIIlll = -1;
        }
    }
    
    public float llIllIIIIIllIlIIIIlI(float n) {
        n -= this.llIIlIIIlIIIllIlIIIl;
        n *= this.lIlIlIIIllIIllIIIllI / (float)this.IllIIlllIIIIlllIIlIl;
        return n;
    }
    
    public float IlIIIlIlIIIllIlIlIIl(float n) {
        n -= this.llIllIlIIIIllIlIIllI;
        n *= this.IlIlIIIllIIllIlllllI / (float)this.llllIIIlIlllIlIIIIIl;
        return n;
    }
    
    public List IlIlIIIIIIlllIlIllIl() {
        final ArrayList list = new ArrayList();
        list.addAll(this.llllIIIIlIIIlIlllIll);
        return list;
    }
    
    public IlIlIlIlIlllllllllIl IIllIIllIIIlIlIIIIlI() {
        return this.IIlIIIIlllIlllllIlII;
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl iIlIIIIlllIlllllIlII) {
        this.IIlIIIIlllIlllllIlII = iIlIIIIlllIlllllIlII;
    }
    
    private void IlllllllIIIlIIIlIlII() {
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.cj) {
            final String string = String.valueOf(this.IlllllllIIIlIIIlIlII) + "_n";
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.w().llllIIIIlIIIlIlllIll(new lIllllIllIllIIllllll(string)))) {
                this.lllIIIIlllllIlIIllIl = new IlIlIIIllIIllIlllllI(string);
                this.lllIIIIlllllIlIIllIl.IIllIIllIIIlIlIIIIlI = true;
                this.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(this);
                this.lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl(this.IIlllIIlIllIllIlIIll);
            }
        }
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.ck) {
            final String string2 = String.valueOf(this.IlllllllIIIlIIIlIlII) + "_s";
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.w().llllIIIIlIIIlIlllIll(new lIllllIllIllIIllllll(string2)))) {
                this.IlIlIIIIIIlllIlIllIl = new IlIlIIIllIIllIlllllI(string2);
                this.IlIlIIIIIIlllIlIllIl.IIllIIllIIIlIlIIIIlI = true;
                this.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll(this);
                this.IlIlIIIIIIlllIlIllIl.IlIIIlIlIIIllIlIlIIl(this.IIlllIIlIllIllIlIIll);
            }
        }
    }
}
