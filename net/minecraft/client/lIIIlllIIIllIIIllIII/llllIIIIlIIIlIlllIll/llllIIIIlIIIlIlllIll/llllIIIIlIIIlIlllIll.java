package net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll;

import net.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import net.optifine.IlIlIIIllIllIIIIIllI.*;
import net.optifine.lIIIIlIIIIIlllIllIII.*;
import net.minecraft.client.*;

public class llllIIIIlIIIlIlllIll implements IlIlIlIlIlllllllllIl
{
    protected int[] llllIIIIlIIIlIlllIll;
    protected final int IlIlIlIlIlllllllllIl;
    protected lllIllIIIllllllIllll llIllIIIIIllIlIIIIlI;
    protected IlIlIIIllIIllIlllllI IlIIIlIlIIIllIlIlIIl;
    private int[] IlIlIIIllIllIIIIIllI;
    private IllIIlllIIIIlllIIlIl IllIIlllIIIIlllIIlIl;
    private boolean llllIIIlIlllIlIIIIIl;
    private llllIIIIlIIIlIlllIll lIIIIlIIIIIlllIllIII;
    
    public llllIIIIlIIIlIlllIll(final int[] llllIIIIlIIIlIlllIll, final int ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll llIllIIIIIllIlIIIIlI, final IlIlIIIllIIllIlllllI ilIIIlIlIIIllIlIlIIl) {
        this.IlIlIIIllIllIIIIIllI = null;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.llllIIIlIlllIlIIIIIl();
    }
    
    public llllIIIIlIIIlIlllIll(final int[] llllIIIIlIIIlIlllIll, final int ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll llIllIIIIIllIlIIIIlI) {
        this.IlIlIIIllIllIIIIIllI = null;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.llllIIIlIlllIlIIIIIl();
    }
    
    public IlIlIIIllIIllIlllllI llllIIIIlIIIlIlllIll() {
        if (this.IlIIIlIlIIIllIlIlIIl == null) {
            this.IlIIIlIlIIIllIlIlIIl = llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl());
        }
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public int[] IlIlIlIlIlllllllllIl() {
        this.llllIIIlIlllIlIIIIIl();
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public boolean llIllIIIIIllIlIIIIlI() {
        return this.IlIlIlIlIlllllllllIl != -1;
    }
    
    public int IlIIIlIlIIIllIlIlIIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public lllIllIIIllllllIllll IlIlIIIllIllIIIIIllI() {
        if (this.llIllIIIIIllIlIIIIlI == null) {
            this.llIllIIIIIllIlIIIIlI = llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl());
        }
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public int[] IllIIlllIIIIlllIIlIl() {
        if (this.IlIlIIIllIllIIIIIllI == null) {
            this.IlIlIIIllIllIIIIIllI = llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl(), this.llllIIIIlIIIlIlllIll());
        }
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    private static int[] llllIIIIlIIIlIlllIll(final int[] array, final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI) {
        final int[] array2 = array.clone();
        final int n = array2.length / 4;
        for (int i = 0; i < 4; ++i) {
            final int n2 = i * n;
            final float intBitsToFloat = Float.intBitsToFloat(array2[n2 + 4]);
            final float intBitsToFloat2 = Float.intBitsToFloat(array2[n2 + 4 + 1]);
            final float llIllIIIIIllIlIIIIlI = ilIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI(intBitsToFloat);
            final float ilIIIlIlIIIllIlIlIIl = ilIlIIIllIIllIlllllI.IlIIIlIlIIIllIlIlIIl(intBitsToFloat2);
            array2[n2 + 4] = Float.floatToRawIntBits(llIllIIIIIllIlIIIIlI);
            array2[n2 + 4 + 1] = Float.floatToRawIntBits(ilIIIlIlIIIllIlIlIIl);
        }
        return array2;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.ad, llllIIIIlIIIlIlllIll, this);
    }
    
    private static IlIlIIIllIIllIlllllI llllIIIIlIIIlIlllIll(final int[] array) {
        float min = 1.0f;
        float min2 = 1.0f;
        float max = 0.0f;
        float max2 = 0.0f;
        final int n = array.length / 4;
        for (int i = 0; i < 4; ++i) {
            final int n2 = i * n;
            final float intBitsToFloat = Float.intBitsToFloat(array[n2 + 4]);
            final float intBitsToFloat2 = Float.intBitsToFloat(array[n2 + 4 + 1]);
            min = Math.min(min, intBitsToFloat);
            min2 = Math.min(min2, intBitsToFloat2);
            max = Math.max(max, intBitsToFloat);
            max2 = Math.max(max2, intBitsToFloat2);
        }
        return Minecraft.getMinecraft().IlIllllIIlIIlIlIlIll().llllIIIIlIIIlIlllIll((min + max) / 2.0f, (min2 + max2) / 2.0f);
    }
    
    protected void llllIIIlIlllIlIIIIIl() {
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
            if (this.llllIIIIlIIIlIlllIll.length == 28) {
                this.llllIIIIlIIIlIlllIll = IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll);
            }
        }
        else if (this.llllIIIIlIIIlIlllIll.length == 56) {
            this.llllIIIIlIIIlIlllIll = llIllIIIIIllIlIIIIlI(this.llllIIIIlIIIlIlllIll);
        }
    }
    
    private static int[] IlIlIlIlIlllllllllIl(final int[] array) {
        final int n = array.length / 4;
        final int n2 = n * 2;
        final int[] array2 = new int[n2 * 4];
        for (int i = 0; i < 4; ++i) {
            System.arraycopy(array, i * n, array2, i * n2, n);
        }
        return array2;
    }
    
    private static int[] llIllIIIIIllIlIIIIlI(final int[] array) {
        final int n = array.length / 4;
        final int n2 = n / 2;
        final int[] array2 = new int[n2 * 4];
        for (int i = 0; i < 4; ++i) {
            System.arraycopy(array, i * n, array2, i * n2, n2);
        }
        return array2;
    }
    
    public IllIIlllIIIIlllIIlIl lIIIIlIIIIIlllIllIII() {
        if (this.IllIIlllIIIIlllIIlIl == null) {
            this.IllIIlllIIIIlllIIlIl = new IllIIlllIIIIlllIIlIl(this.IlIlIlIlIlllllllllIl());
        }
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public float lIIIlllIIIllIIIllIII() {
        final IllIIlllIIIIlllIIlIl liiiIlIIIIIlllIllIII = this.lIIIIlIIIIIlllIllIII();
        return (liiiIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl() + liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll()) / 2.0f;
    }
    
    public double llIIlIIIlIIIllIlIIIl() {
        final IllIIlllIIIIlllIIlIl liiiIlIIIIIlllIllIII = this.lIIIIlIIIIIlllIllIII();
        return (liiiIlIIIIIlllIllIII.IlIlIIIllIllIIIIIllI() + liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl()) / 2.0f;
    }
    
    public double llIllIlIIIIllIlIIllI() {
        final IllIIlllIIIIlllIIlIl liiiIlIIIIIlllIllIII = this.lIIIIlIIIIIlllIllIII();
        return (liiiIlIIIIIlllIllIII.IllIIlllIIIIlllIIlIl() + liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI()) / 2.0f;
    }
    
    public boolean lIlIlIIIllIIllIIIllI() {
        return this.lIIIIlIIIIIlllIllIII().llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI);
    }
    
    public boolean IlIlIIIllIIllIlllllI() {
        return this.lIIIIlIIIIIlllIllIII().IlIlIlIlIlllllllllIl(this.llIllIIIIIllIlIIIIlI);
    }
    
    public boolean IIIIlllIIIIIIlIIIlll() {
        return this.IlIlIIIllIIllIlllllI() && this.lIlIlIIIllIIllIIIllI();
    }
    
    public llllIIIIlIIIlIlllIll llllIIllllIlIlIIIIll() {
        if (this.llllIIIlIlllIlIIIIIl) {
            return this.lIIIIlIIIIIlllIllIII;
        }
        if (this.lIIIIlIIIIIlllIllIII == null && this.IlIIIlIlIIIllIlIlIIl != null && this.IlIIIlIlIIIllIlIlIIl.IlIlIIIlIIlIlIIlllIl != null) {
            this.lIIIIlIIIIIlllIllIII = new lIIIlllIIIllIIIllIII(this, this.IlIIIlIlIIIllIlIlIIl.IlIlIIIlIIlIlIIlllIl);
        }
        this.llllIIIlIlllIlIIIIIl = true;
        return this.lIIIIlIIIIIlllIllIII;
    }
    
    @Override
    public String toString() {
        return "vertex: " + this.llllIIIIlIIIlIlllIll.length / 7 + ", tint: " + this.IlIlIlIlIlllllllllIl + ", facing: " + this.llIllIIIIIllIlIIIIlI + ", sprite: " + this.IlIIIlIlIIIllIlIlIIl;
    }
}
