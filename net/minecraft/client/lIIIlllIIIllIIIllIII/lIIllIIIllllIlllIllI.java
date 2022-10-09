package net.minecraft.client.lIIIlllIIIllIIIllIII;

import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import net.optifine.shaders.*;
import net.optifine.lIIIlllIIIllIIIllIII.*;
import org.apache.logging.log4j.*;
import java.util.*;
import net.optifine.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import java.nio.*;
import net.optifine.util.*;
import org.lwjgl.opengl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.*;

public class lIIllIIIllllIlllIllI
{
    private ByteBuffer lIIIlllIIIllIIIllIII;
    public IntBuffer llllIIIIlIIIlIlllIll;
    private ShortBuffer llIIlIIIlIIIllIlIIIl;
    public FloatBuffer IlIlIlIlIlllllllllIl;
    public int llIllIIIIIllIlIIIIlI;
    private IlIIIlIlIIIllIlIlIIl llIllIlIIIIllIlIIllI;
    private int lIlIlIIIllIIllIIIllI;
    private boolean IlIlIIIllIIllIlllllI;
    public int IlIIIlIlIIIllIlIlIIl;
    private double IIIIlllIIIIIIlIIIlll;
    private double llllIIllllIlIlIIIIll;
    private double IlIllIlIlIIIlIlIlIII;
    private llIllIIIIIllIlIIIIlI IIlllIIlIllIllIlIIll;
    private boolean lllIIIIlllllIlIIllIl;
    private IlIIlIlIIIlIIlIlIlII IlIlIIIIIIlllIlIllIl;
    private boolean[] IIllIIllIIIlIlIIIIlI;
    private IlIlIIIllIIllIlllllI[] IIIlIIIlIlIIlllIIlll;
    private IlIlIIIllIIllIlllllI[] IlIlIIIlIIlIlIIlllIl;
    private IlIlIIIllIIllIlllllI IlllllllIIIlIIIlIlII;
    public IlllllllIIIlIIIlIlII IlIlIIIllIllIIIIIllI;
    public llllIIIlIlllIlIIIIIl IllIIlllIIIIlllIIlIl;
    public BitSet llllIIIlIlllIlIIIIIl;
    public BitSet lIIIIlIIIIIlllIllIII;
    private boolean IIlIIIIlllIlllllIlII;
    private ByteBuffer IIIlIIlIIIIlllIlllII;
    private static volatile /* synthetic */ int[] IlIlIllllllllIIIIlII;
    
    public lIIllIIIllllIlllIllI(final int n) {
        this.IlIlIIIIIIlllIlIllIl = null;
        this.IIllIIllIIIlIlIIIIlI = new boolean[256];
        this.IIIlIIIlIlIIlllIIlll = null;
        this.IlIlIIIlIIlIlIIlllIl = null;
        this.IlllllllIIIlIIIlIlII = null;
        this.IllIIlllIIIIlllIIlIl = null;
        this.llllIIIlIlllIlIIIIIl = null;
        this.lIIIIlIIIIIlllIllIII = new BitSet();
        this.IIlIIIIlllIlllllIlII = false;
        this.lIIIlllIIIllIIIllIII = llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI(n * 4);
        this.llllIIIIlIIIlIlllIll = this.lIIIlllIIIllIIIllIII.asIntBuffer();
        this.llIIlIIIlIIIllIlIIIl = this.lIIIlllIIIllIIIllIII.asShortBuffer();
        this.IlIlIlIlIlllllllllIl = this.lIIIlllIIIllIIIllIII.asFloatBuffer();
        net.optifine.shaders.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this);
    }
    
    private void llIllIIIIIllIlIIIIlI(final int n) {
        if (n > this.llllIIIIlIIIlIlllIll.remaining()) {
            final int capacity = this.lIIIlllIIIllIIIllIII.capacity();
            final int n2 = capacity % 2097152;
            final int n3 = n2 + (((this.llllIIIIlIIIlIlllIll.position() + n) * 4 - n2) / 2097152 + 1) * 2097152;
            LogManager.getLogger().warn("Needed to grow BufferBuilder buffer: Old size " + capacity + " bytes, new size " + n3 + " bytes.");
            final int position = this.llllIIIIlIIIlIlllIll.position();
            final ByteBuffer llIllIIIIIllIlIIIIlI = llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI(n3);
            this.lIIIlllIIIllIIIllIII.position(0);
            llIllIIIIIllIlIIIIlI.put(this.lIIIlllIIIllIIIllIII);
            llIllIIIIIllIlIIIIlI.rewind();
            this.lIIIlllIIIllIIIllIII = llIllIIIIIllIlIIIIlI;
            this.IlIlIlIlIlllllllllIl = this.lIIIlllIIIllIIIllIII.asFloatBuffer();
            (this.llllIIIIlIIIlIlllIll = this.lIIIlllIIIllIIIllIII.asIntBuffer()).position(position);
            (this.llIIlIIIlIIIllIlIIIl = this.lIIIlllIIIllIIIllIII.asShortBuffer()).position(position << 1);
            if (this.IIIlIIIlIlIIlllIIlll != null) {
                final IlIlIIIllIIllIlllllI[] iiIlIIIlIlIIlllIIlll = this.IIIlIIIlIlIIlllIIlll;
                System.arraycopy(iiIlIIIlIlIIlllIIlll, 0, this.IIIlIIIlIlIIlllIIlll = new IlIlIIIllIIllIlllllI[this.IlIlIIIlIIlIlIIlllIl()], 0, Math.min(iiIlIIIlIlIIlllIIlll.length, this.IIIlIIIlIlIIlllIIlll.length));
                this.IlIlIIIlIIlIlIIlllIl = null;
            }
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final float n, final float n2, final float n3) {
        final int n4 = this.llIllIIIIIllIlIIIIlI / 4;
        final float[] array = new float[n4];
        for (int i = 0; i < n4; ++i) {
            array[i] = llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, (float)(n + this.IIIIlllIIIIIIlIIIlll), (float)(n2 + this.llllIIllllIlIlIIIIll), (float)(n3 + this.IlIllIlIlIIIlIlIlIII), this.IIlllIIlIllIllIlIIll.IllIIlllIIIIlllIIlIl(), i * this.IIlllIIlIllIllIlIIll.llllIIIlIlllIlIIIIIl());
        }
        final Integer[] array2 = new Integer[n4];
        for (int j = 0; j < array2.length; ++j) {
            array2[j] = j;
        }
        Arrays.sort(array2, new IllIlIllIllIlllIIlll(this, array));
        final BitSet set = new BitSet();
        final int llllIIIlIlllIlIIIIIl = this.IIlllIIlIllIllIlIIll.llllIIIlIlllIlIIIIIl();
        final int[] array3 = new int[llllIIIlIlllIlIIIIIl];
        for (int nextClearBit = 0; (nextClearBit = set.nextClearBit(nextClearBit)) < array2.length; ++nextClearBit) {
            final int intValue = array2[nextClearBit];
            if (intValue != nextClearBit) {
                this.llllIIIIlIIIlIlllIll.limit(intValue * llllIIIlIlllIlIIIIIl + llllIIIlIlllIlIIIIIl);
                this.llllIIIIlIIIlIlllIll.position(intValue * llllIIIlIlllIlIIIIIl);
                this.llllIIIIlIIIlIlllIll.get(array3);
                for (int k = intValue, n5 = array2[intValue]; k != nextClearBit; k = n5, n5 = array2[n5]) {
                    this.llllIIIIlIIIlIlllIll.limit(n5 * llllIIIlIlllIlIIIIIl + llllIIIlIlllIlIIIIIl);
                    this.llllIIIIlIIIlIlllIll.position(n5 * llllIIIlIlllIlIIIIIl);
                    final IntBuffer slice = this.llllIIIIlIIIlIlllIll.slice();
                    this.llllIIIIlIIIlIlllIll.limit(k * llllIIIlIlllIlIIIIIl + llllIIIlIlllIlIIIIIl);
                    this.llllIIIIlIIIlIlllIll.position(k * llllIIIlIlllIlIIIIIl);
                    this.llllIIIIlIIIlIlllIll.put(slice);
                    set.set(k);
                }
                this.llllIIIIlIIIlIlllIll.limit(nextClearBit * llllIIIlIlllIlIIIIIl + llllIIIlIlllIlIIIIIl);
                this.llllIIIIlIIIlIlllIll.position(nextClearBit * llllIIIlIlllIlIIIIIl);
                this.llllIIIIlIIIlIlllIll.put(array3);
            }
            set.set(nextClearBit);
        }
        this.llllIIIIlIIIlIlllIll.limit(this.llllIIIIlIIIlIlllIll.capacity());
        this.llllIIIIlIIIlIlllIll.position(this.IlIlIlIlIlllllllllIl());
        if (this.IIIlIIIlIlIIlllIIlll != null) {
            final IlIlIIIllIIllIlllllI[] array4 = new IlIlIIIllIIllIlllllI[this.llIllIIIIIllIlIIIIlI / 4];
            final int n6 = this.IIlllIIlIllIllIlIIll.llllIIIlIlllIlIIIIIl() / 4 * 4;
            for (int l = 0; l < array2.length; ++l) {
                array4[l] = this.IIIlIIIlIlIIlllIIlll[array2[l]];
            }
            System.arraycopy(array4, 0, this.IIIlIIIlIlIIlllIIlll, 0, array4.length);
        }
    }
    
    public IIllIIIlIIlIlIlIIIII llllIIIIlIIIlIlllIll() {
        this.llllIIIIlIIIlIlllIll.rewind();
        final int ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl();
        this.llllIIIIlIIIlIlllIll.limit(ilIlIlIlIlllllllllIl);
        final int[] array = new int[ilIlIlIlIlllllllllIl];
        this.llllIIIIlIIIlIlllIll.get(array);
        this.llllIIIIlIIIlIlllIll.limit(this.llllIIIIlIIIlIlllIll.capacity());
        this.llllIIIIlIIIlIlllIll.position(ilIlIlIlIlllllllllIl);
        IlIlIIIllIIllIlllllI[] array2 = null;
        if (this.IIIlIIIlIlIIlllIIlll != null) {
            final int n = this.llIllIIIIIllIlIIIIlI / 4;
            array2 = new IlIlIIIllIIllIlllllI[n];
            System.arraycopy(this.IIIlIIIlIlIIlllIIlll, 0, array2, 0, n);
        }
        return new IIllIIIlIIlIlIlIIIII(this, array, new llIllIIIIIllIlIIIIlI(this.IIlllIIlIllIllIlIIll), array2);
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.llIllIIIIIllIlIIIIlI * this.IIlllIIlIllIllIlIIll.IllIIlllIIIIlllIIlIl();
    }
    
    private static float llllIIIIlIIIlIlllIll(final FloatBuffer floatBuffer, final float n, final float n2, final float n3, final int n4, final int n5) {
        final float value = floatBuffer.get(n5 + n4 * 0 + 0);
        final float value2 = floatBuffer.get(n5 + n4 * 0 + 1);
        final float value3 = floatBuffer.get(n5 + n4 * 0 + 2);
        final float value4 = floatBuffer.get(n5 + n4 * 1 + 0);
        final float value5 = floatBuffer.get(n5 + n4 * 1 + 1);
        final float value6 = floatBuffer.get(n5 + n4 * 1 + 2);
        final float value7 = floatBuffer.get(n5 + n4 * 2 + 0);
        final float value8 = floatBuffer.get(n5 + n4 * 2 + 1);
        final float value9 = floatBuffer.get(n5 + n4 * 2 + 2);
        final float value10 = floatBuffer.get(n5 + n4 * 3 + 0);
        final float value11 = floatBuffer.get(n5 + n4 * 3 + 1);
        final float value12 = floatBuffer.get(n5 + n4 * 3 + 2);
        final float n6 = (value + value4 + value7 + value10) * 0.25f - n;
        final float n7 = (value2 + value5 + value8 + value11) * 0.25f - n2;
        final float n8 = (value3 + value6 + value9 + value12) * 0.25f - n3;
        return n6 * n6 + n7 * n7 + n8 * n8;
    }
    
    public void llllIIIIlIIIlIlllIll(final IIllIIIlIIlIlIlIIIII illIIIlIIlIlIlIIIII) {
        this.llllIIIIlIIIlIlllIll.clear();
        this.llIllIIIIIllIlIIIIlI(illIIIlIIlIlIlIIIII.llllIIIIlIIIlIlllIll().length);
        this.llllIIIIlIIIlIlllIll.put(illIIIlIIlIlIlIIIII.llllIIIIlIIIlIlllIll());
        this.llIllIIIIIllIlIIIIlI = illIIIlIIlIlIlIIIII.IlIlIlIlIlllllllllIl();
        this.IIlllIIlIllIllIlIIll = new llIllIIIIIllIlIIIIlI(illIIIlIIlIlIlIIIII.llIllIIIIIllIlIIIIlI());
        if (illIIIlIIlIlIlIIIII.IlIIIlIlIIIllIlIlIIl != null) {
            if (this.IIIlIIIlIlIIlllIIlll == null) {
                this.IIIlIIIlIlIIlllIIlll = this.IlIlIIIlIIlIlIIlllIl;
            }
            if (this.IIIlIIIlIlIIlllIIlll == null || this.IIIlIIIlIlIIlllIIlll.length < this.IlIlIIIlIIlIlIIlllIl()) {
                this.IIIlIIIlIlIIlllIIlll = new IlIlIIIllIIllIlllllI[this.IlIlIIIlIIlIlIIlllIl()];
            }
            final IlIlIIIllIIllIlllllI[] llllIIIIlIIIlIlllIll = illIIIlIIlIlIlIIIII.IlIIIlIlIIIllIlIlIIl;
            System.arraycopy(llllIIIIlIIIlIlllIll, 0, this.IIIlIIIlIlIIlllIIlll, 0, llllIIIIlIIIlIlllIll.length);
        }
        else {
            if (this.IIIlIIIlIlIIlllIIlll != null) {
                this.IlIlIIIlIIlIlIIlllIl = this.IIIlIIIlIlIIlllIIlll;
            }
            this.IIIlIIIlIlIIlllIIlll = null;
        }
    }
    
    public void llIllIIIIIllIlIIIIlI() {
        this.llIllIIIIIllIlIIIIlI = 0;
        this.llIllIlIIIIllIlIIllI = null;
        this.lIlIlIIIllIIllIIIllI = 0;
        this.IlllllllIIIlIIIlIlII = null;
        if (llIIIllIlIllIllIIIIl.llllIIIIlIIIlIlllIll()) {
            if (this.llllIIIlIlllIlIIIIIl == null) {
                this.llllIIIlIlllIlIIIIIl = this.lIIIIlIIIIIlllIllIII;
            }
            this.llllIIIlIlllIlIIIIIl.clear();
        }
        else if (this.llllIIIlIlllIlIIIIIl != null) {
            this.llllIIIlIlllIlIIIIIl = null;
        }
        this.IIlIIIIlllIlllllIlII = false;
    }
    
    public void llllIIIIlIIIlIlllIll(final int ilIIIlIlIIIllIlIlIIl, final llIllIIIIIllIlIIIIlI iIlllIIlIllIllIlIIll) {
        if (this.lllIIIIlllllIlIIllIl) {
            throw new IllegalStateException("Already building!");
        }
        this.lllIIIIlllllIlIIllIl = true;
        this.llIllIIIIIllIlIIIIlI();
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IIlllIIlIllIllIlIIll = iIlllIIlIllIllIlIIll;
        this.llIllIlIIIIllIlIIllI = iIlllIIlIllIllIlIIll.llIllIIIIIllIlIIIIlI(this.lIlIlIIIllIIllIIIllI);
        this.IlIlIIIllIIllIlllllI = false;
        this.lIIIlllIIIllIIIllIII.limit(this.lIIIlllIIIllIIIllIII.capacity());
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
            net.optifine.shaders.IlllllllIIIlIIIlIlII.llIllIIIIIllIlIIIIlI(this);
        }
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIllIIIlIIIIlIIlIIII()) {
            if (this.IlIlIIIIIIlllIlIllIl != null) {
                if (this.IIIlIIIlIlIIlllIIlll == null) {
                    this.IIIlIIIlIlIIlllIIlll = this.IlIlIIIlIIlIlIIlllIl;
                }
                if (this.IIIlIIIlIlIIlllIIlll == null || this.IIIlIIIlIlIIlllIIlll.length < this.IlIlIIIlIIlIlIIlllIl()) {
                    this.IIIlIIIlIlIIlllIIlll = new IlIlIIIllIIllIlllllI[this.IlIlIIIlIIlIlIIlllIl()];
                }
            }
        }
        else {
            if (this.IIIlIIIlIlIIlllIIlll != null) {
                this.IlIlIIIlIIlIlIIlllIl = this.IIIlIIIlIlIIlllIIlll;
            }
            this.IIIlIIIlIlIIlllIIlll = null;
        }
    }
    
    public lIIllIIIllllIlllIllI llllIIIIlIIIlIlllIll(double n, double n2) {
        if (this.IlllllllIIIlIIIlIlII != null && this.IIIlIIIlIlIIlllIIlll != null) {
            n = this.IlllllllIIIlIIIlIlII.llIllIIIIIllIlIIIIlI((float)n);
            n2 = this.IlllllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl((float)n2);
            this.IIIlIIIlIlIIlllIIlll[this.llIllIIIIIllIlIIIIlI / 4] = this.IlllllllIIIlIIIlIlII;
        }
        final int n3 = this.llIllIIIIIllIlIIIIlI * this.IIlllIIlIllIllIlIIll.llllIIIlIlllIlIIIIIl() + this.IIlllIIlIllIllIlIIll.IlIIIlIlIIIllIlIlIIl(this.lIlIlIIIllIIllIIIllI);
        switch (IIllIIllIIIlIlIIIIlI()[this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll().ordinal()]) {
            case 1: {
                this.lIIIlllIIIllIIIllIII.putFloat(n3, (float)n);
                this.lIIIlllIIIllIIIllIII.putFloat(n3 + 4, (float)n2);
                break;
            }
            case 6:
            case 7: {
                this.lIIIlllIIIllIIIllIII.putInt(n3, (int)n);
                this.lIIIlllIIIllIIIllIII.putInt(n3 + 4, (int)n2);
                break;
            }
            case 4:
            case 5: {
                this.lIIIlllIIIllIIIllIII.putShort(n3, (short)n2);
                this.lIIIlllIIIllIIIllIII.putShort(n3 + 2, (short)n);
                break;
            }
            case 2:
            case 3: {
                this.lIIIlllIIIllIIIllIII.put(n3, (byte)n2);
                this.lIIIlllIIIllIIIllIII.put(n3 + 1, (byte)n);
                break;
            }
        }
        this.IIIlIIIlIlIIlllIIlll();
        return this;
    }
    
    public lIIllIIIllllIlllIllI llllIIIIlIIIlIlllIll(final int n, final int n2) {
        final int n3 = this.llIllIIIIIllIlIIIIlI * this.IIlllIIlIllIllIlIIll.llllIIIlIlllIlIIIIIl() + this.IIlllIIlIllIllIlIIll.IlIIIlIlIIIllIlIlIIl(this.lIlIlIIIllIIllIIIllI);
        switch (IIllIIllIIIlIlIIIIlI()[this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll().ordinal()]) {
            case 1: {
                this.lIIIlllIIIllIIIllIII.putFloat(n3, (float)n);
                this.lIIIlllIIIllIIIllIII.putFloat(n3 + 4, (float)n2);
                break;
            }
            case 6:
            case 7: {
                this.lIIIlllIIIllIIIllIII.putInt(n3, n);
                this.lIIIlllIIIllIIIllIII.putInt(n3 + 4, n2);
                break;
            }
            case 4:
            case 5: {
                this.lIIIlllIIIllIIIllIII.putShort(n3, (short)n2);
                this.lIIIlllIIIllIIIllIII.putShort(n3 + 2, (short)n);
                break;
            }
            case 2:
            case 3: {
                this.lIIIlllIIIllIIIllIII.put(n3, (byte)n2);
                this.lIIIlllIIIllIIIllIII.put(n3 + 1, (byte)n);
                break;
            }
        }
        this.IIIlIIIlIlIIlllIIlll();
        return this;
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4) {
        final int n5 = (this.llIllIIIIIllIlIIIIlI - 4) * this.IIlllIIlIllIllIlIIll.IllIIlllIIIIlllIIlIl() + this.IIlllIIlIllIllIlIIll.IlIlIlIlIlllllllllIl(1) / 4;
        final int n6 = this.IIlllIIlIllIllIlIIll.llllIIIlIlllIlIIIIIl() >> 2;
        this.llllIIIIlIIIlIlllIll.put(n5, n);
        this.llllIIIIlIIIlIlllIll.put(n5 + n6, n2);
        this.llllIIIIlIIIlIlllIll.put(n5 + n6 * 2, n3);
        this.llllIIIIlIIIlIlllIll.put(n5 + n6 * 3, n4);
    }
    
    public void llllIIIIlIIIlIlllIll(final double n, final double n2, final double n3) {
        final int illIIlllIIIIlllIIlIl = this.IIlllIIlIllIllIlIIll.IllIIlllIIIIlllIIlIl();
        final int n4 = (this.llIllIIIIIllIlIIIIlI - 4) * illIIlllIIIIlllIIlIl;
        for (int i = 0; i < 4; ++i) {
            final int n5 = n4 + i * illIIlllIIIIlllIIlIl;
            final int n6 = n5 + 1;
            final int n7 = n6 + 1;
            this.llllIIIIlIIIlIlllIll.put(n5, Float.floatToRawIntBits((float)(n + this.IIIIlllIIIIIIlIIIlll) + Float.intBitsToFloat(this.llllIIIIlIIIlIlllIll.get(n5))));
            this.llllIIIIlIIIlIlllIll.put(n6, Float.floatToRawIntBits((float)(n2 + this.llllIIllllIlIlIIIIll) + Float.intBitsToFloat(this.llllIIIIlIIIlIlllIll.get(n6))));
            this.llllIIIIlIIIlIlllIll.put(n7, Float.floatToRawIntBits((float)(n3 + this.IlIllIlIlIIIlIlIlIII) + Float.intBitsToFloat(this.llllIIIIlIIIlIlllIll.get(n7))));
        }
    }
    
    public int llllIIIIlIIIlIlllIll(final int n) {
        return ((this.llIllIIIIIllIlIIIIlI - n) * this.IIlllIIlIllIllIlIIll.llllIIIlIlllIlIIIIIl() + this.IIlllIIlIllIllIlIIll.IlIlIIIllIllIIIIIllI()) / 4;
    }
    
    public void llllIIIIlIIIlIlllIll(final float n, final float n2, final float n3, final int n4) {
        final int llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(n4);
        int n5 = -1;
        if (!this.IlIlIIIllIIllIlllllI) {
            final int value = this.llllIIIIlIIIlIlllIll.get(llllIIIIlIIIlIlllIll);
            if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
                n5 = ((value & 0xFF000000) | (int)((value >> 16 & 0xFF) * n3) << 16 | (int)((value >> 8 & 0xFF) * n2) << 8 | (int)((value & 0xFF) * n));
            }
            else {
                n5 = ((value & 0xFF) | (int)((value >> 24 & 0xFF) * n) << 24 | (int)((value >> 16 & 0xFF) * n2) << 16 | (int)((value >> 8 & 0xFF) * n3) << 8);
            }
        }
        this.llllIIIIlIIIlIlllIll.put(llllIIIIlIIIlIlllIll, n5);
    }
    
    private void IlIlIlIlIlllllllllIl(final int n, final int n2) {
        this.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll(n2), n >> 16 & 0xFF, n >> 8 & 0xFF, n & 0xFF, n >> 24 & 0xFF);
    }
    
    public void IlIlIlIlIlllllllllIl(final float n, final float n2, final float n3, final int n4) {
        this.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll(n4), llIllIIlllllllllllll.llllIIIIlIIIlIlllIll((int)(n * 255.0f), 0, 255), llIllIIlllllllllllll.llllIIIIlIIIlIlllIll((int)(n2 * 255.0f), 0, 255), llIllIIlllllllllllll.llllIIIIlIIIlIlllIll((int)(n3 * 255.0f), 0, 255), 255);
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4, final int n5) {
        if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
            this.llllIIIIlIIIlIlllIll.put(n, n5 << 24 | n4 << 16 | n3 << 8 | n2);
        }
        else {
            this.llllIIIIlIIIlIlllIll.put(n, n2 << 24 | n3 << 16 | n4 << 8 | n5);
        }
    }
    
    public void IlIIIlIlIIIllIlIlIIl() {
        this.IlIlIIIllIIllIlllllI = true;
    }
    
    public lIIllIIIllllIlllIllI llllIIIIlIIIlIlllIll(final float n, final float n2, final float n3, final float n4) {
        return this.IlIlIlIlIlllllllllIl((int)(n * 255.0f), (int)(n2 * 255.0f), (int)(n3 * 255.0f), (int)(n4 * 255.0f));
    }
    
    public lIIllIIIllllIlllIllI IlIlIlIlIlllllllllIl(final int n, final int n2, final int n3, final int n4) {
        if (this.IlIlIIIllIIllIlllllI) {
            return this;
        }
        final int n5 = this.llIllIIIIIllIlIIIIlI * this.IIlllIIlIllIllIlIIll.llllIIIlIlllIlIIIIIl() + this.IIlllIIlIllIllIlIIll.IlIIIlIlIIIllIlIlIIl(this.lIlIlIIIllIIllIIIllI);
        switch (IIllIIllIIIlIlIIIIlI()[this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll().ordinal()]) {
            case 1: {
                this.lIIIlllIIIllIIIllIII.putFloat(n5, n / 255.0f);
                this.lIIIlllIIIllIIIllIII.putFloat(n5 + 4, n2 / 255.0f);
                this.lIIIlllIIIllIIIllIII.putFloat(n5 + 8, n3 / 255.0f);
                this.lIIIlllIIIllIIIllIII.putFloat(n5 + 12, n4 / 255.0f);
                break;
            }
            case 6:
            case 7: {
                this.lIIIlllIIIllIIIllIII.putFloat(n5, (float)n);
                this.lIIIlllIIIllIIIllIII.putFloat(n5 + 4, (float)n2);
                this.lIIIlllIIIllIIIllIII.putFloat(n5 + 8, (float)n3);
                this.lIIIlllIIIllIIIllIII.putFloat(n5 + 12, (float)n4);
                break;
            }
            case 4:
            case 5: {
                this.lIIIlllIIIllIIIllIII.putShort(n5, (short)n);
                this.lIIIlllIIIllIIIllIII.putShort(n5 + 2, (short)n2);
                this.lIIIlllIIIllIIIllIII.putShort(n5 + 4, (short)n3);
                this.lIIIlllIIIllIIIllIII.putShort(n5 + 6, (short)n4);
                break;
            }
            case 2:
            case 3: {
                if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
                    this.lIIIlllIIIllIIIllIII.put(n5, (byte)n);
                    this.lIIIlllIIIllIIIllIII.put(n5 + 1, (byte)n2);
                    this.lIIIlllIIIllIIIllIII.put(n5 + 2, (byte)n3);
                    this.lIIIlllIIIllIIIllIII.put(n5 + 3, (byte)n4);
                    break;
                }
                this.lIIIlllIIIllIIIllIII.put(n5, (byte)n4);
                this.lIIIlllIIIllIIIllIII.put(n5 + 1, (byte)n3);
                this.lIIIlllIIIllIIIllIII.put(n5 + 2, (byte)n2);
                this.lIIIlllIIIllIIIllIII.put(n5 + 3, (byte)n);
                break;
            }
        }
        this.IIIlIIIlIlIIlllIIlll();
        return this;
    }
    
    public void llllIIIIlIIIlIlllIll(final int[] array) {
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
            net.optifine.shaders.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this, array);
        }
        this.llIllIIIIIllIlIIIIlI(array.length);
        this.llllIIIIlIIIlIlllIll.position(this.IlIlIlIlIlllllllllIl());
        this.llllIIIIlIIIlIlllIll.put(array);
        this.llIllIIIIIllIlIIIIlI += array.length / this.IIlllIIlIllIllIlIIll.IllIIlllIIIIlllIIlIl();
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
            net.optifine.shaders.IlllllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl(this);
        }
    }
    
    public void IlIlIIIllIllIIIIIllI() {
        ++this.llIllIIIIIllIlIIIIlI;
        this.llIllIIIIIllIlIIIIlI(this.IIlllIIlIllIllIlIIll.IllIIlllIIIIlllIIlIl());
        this.lIlIlIIIllIIllIIIllI = 0;
        this.llIllIlIIIIllIlIIllI = this.IIlllIIlIllIllIlIIll.llIllIIIIIllIlIIIIlI(this.lIlIlIIIllIIllIIIllI);
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
            net.optifine.shaders.IlllllllIIIlIIIlIlII.IlIlIIIllIllIIIIIllI(this);
        }
    }
    
    public lIIllIIIllllIlllIllI IlIlIlIlIlllllllllIl(final double n, final double n2, final double n3) {
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
            net.optifine.shaders.IlllllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl(this);
        }
        final int n4 = this.llIllIIIIIllIlIIIIlI * this.IIlllIIlIllIllIlIIll.llllIIIlIlllIlIIIIIl() + this.IIlllIIlIllIllIlIIll.IlIIIlIlIIIllIlIlIIl(this.lIlIlIIIllIIllIIIllI);
        switch (IIllIIllIIIlIlIIIIlI()[this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll().ordinal()]) {
            case 1: {
                this.lIIIlllIIIllIIIllIII.putFloat(n4, (float)(n + this.IIIIlllIIIIIIlIIIlll));
                this.lIIIlllIIIllIIIllIII.putFloat(n4 + 4, (float)(n2 + this.llllIIllllIlIlIIIIll));
                this.lIIIlllIIIllIIIllIII.putFloat(n4 + 8, (float)(n3 + this.IlIllIlIlIIIlIlIlIII));
                break;
            }
            case 6:
            case 7: {
                this.lIIIlllIIIllIIIllIII.putInt(n4, Float.floatToRawIntBits((float)(n + this.IIIIlllIIIIIIlIIIlll)));
                this.lIIIlllIIIllIIIllIII.putInt(n4 + 4, Float.floatToRawIntBits((float)(n2 + this.llllIIllllIlIlIIIIll)));
                this.lIIIlllIIIllIIIllIII.putInt(n4 + 8, Float.floatToRawIntBits((float)(n3 + this.IlIllIlIlIIIlIlIlIII)));
                break;
            }
            case 4:
            case 5: {
                this.lIIIlllIIIllIIIllIII.putShort(n4, (short)(n + this.IIIIlllIIIIIIlIIIlll));
                this.lIIIlllIIIllIIIllIII.putShort(n4 + 2, (short)(n2 + this.llllIIllllIlIlIIIIll));
                this.lIIIlllIIIllIIIllIII.putShort(n4 + 4, (short)(n3 + this.IlIllIlIlIIIlIlIlIII));
                break;
            }
            case 2:
            case 3: {
                this.lIIIlllIIIllIIIllIII.put(n4, (byte)(n + this.IIIIlllIIIIIIlIIIlll));
                this.lIIIlllIIIllIIIllIII.put(n4 + 1, (byte)(n2 + this.llllIIllllIlIlIIIIll));
                this.lIIIlllIIIllIIIllIII.put(n4 + 2, (byte)(n3 + this.IlIllIlIlIIIlIlIlIII));
                break;
            }
        }
        this.IIIlIIIlIlIIlllIIlll();
        return this;
    }
    
    public void IlIlIlIlIlllllllllIl(final float n, final float n2, final float n3) {
        final int n4 = ((byte)(n * 127.0f) & 0xFF) | ((byte)(n2 * 127.0f) & 0xFF) << 8 | ((byte)(n3 * 127.0f) & 0xFF) << 16;
        final int n5 = this.IIlllIIlIllIllIlIIll.llllIIIlIlllIlIIIIIl() >> 2;
        final int n6 = (this.llIllIIIIIllIlIIIIlI - 4) * n5 + this.IIlllIIlIllIllIlIIll.llIllIIIIIllIlIIIIlI() / 4;
        this.llllIIIIlIIIlIlllIll.put(n6, n4);
        this.llllIIIIlIIIlIlllIll.put(n6 + n5, n4);
        this.llllIIIIlIIIlIlllIll.put(n6 + n5 * 2, n4);
        this.llllIIIIlIIIlIlllIll.put(n6 + n5 * 3, n4);
    }
    
    private void IIIlIIIlIlIIlllIIlll() {
        ++this.lIlIlIIIllIIllIIIllI;
        this.lIlIlIIIllIIllIIIllI %= this.IIlllIIlIllIllIlIIll.lIIIlllIIIllIIIllIII();
        this.llIllIlIIIIllIlIIllI = this.IIlllIIlIllIllIlIIll.llIllIIIIIllIlIIIIlI(this.lIlIlIIIllIIllIIIllI);
        if (this.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl() == net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.llllIIIlIlllIlIIIIIl) {
            this.IIIlIIIlIlIIlllIIlll();
        }
    }
    
    public lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI(final float n, final float n2, final float n3) {
        final int n4 = this.llIllIIIIIllIlIIIIlI * this.IIlllIIlIllIllIlIIll.llllIIIlIlllIlIIIIIl() + this.IIlllIIlIllIllIlIIll.IlIIIlIlIIIllIlIlIIl(this.lIlIlIIIllIIllIIIllI);
        switch (IIllIIllIIIlIlIIIIlI()[this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll().ordinal()]) {
            case 1: {
                this.lIIIlllIIIllIIIllIII.putFloat(n4, n);
                this.lIIIlllIIIllIIIllIII.putFloat(n4 + 4, n2);
                this.lIIIlllIIIllIIIllIII.putFloat(n4 + 8, n3);
                break;
            }
            case 6:
            case 7: {
                this.lIIIlllIIIllIIIllIII.putInt(n4, (int)n);
                this.lIIIlllIIIllIIIllIII.putInt(n4 + 4, (int)n2);
                this.lIIIlllIIIllIIIllIII.putInt(n4 + 8, (int)n3);
                break;
            }
            case 4:
            case 5: {
                this.lIIIlllIIIllIIIllIII.putShort(n4, (short)((int)(n * 32767.0f) & 0xFFFF));
                this.lIIIlllIIIllIIIllIII.putShort(n4 + 2, (short)((int)(n2 * 32767.0f) & 0xFFFF));
                this.lIIIlllIIIllIIIllIII.putShort(n4 + 4, (short)((int)(n3 * 32767.0f) & 0xFFFF));
                break;
            }
            case 2:
            case 3: {
                this.lIIIlllIIIllIIIllIII.put(n4, (byte)((int)(n * 127.0f) & 0xFF));
                this.lIIIlllIIIllIIIllIII.put(n4 + 1, (byte)((int)(n2 * 127.0f) & 0xFF));
                this.lIIIlllIIIllIIIllIII.put(n4 + 2, (byte)((int)(n3 * 127.0f) & 0xFF));
                break;
            }
        }
        this.IIIlIIIlIlIIlllIIlll();
        return this;
    }
    
    public void llIllIIIIIllIlIIIIlI(final double iiiIlllIIIIIIlIIIlll, final double llllIIllllIlIlIIIIll, final double ilIllIlIlIIIlIlIlIII) {
        this.IIIIlllIIIIIIlIIIlll = iiiIlllIIIIIIlIIIlll;
        this.llllIIllllIlIlIIIIll = llllIIllllIlIlIIIIll;
        this.IlIllIlIlIIIlIlIlIII = ilIllIlIlIIIlIlIlIII;
    }
    
    public void IllIIlllIIIIlllIIlIl() {
        if (!this.lllIIIIlllllIlIIllIl) {
            throw new IllegalStateException("Not building!");
        }
        this.lllIIIIlllllIlIIllIl = false;
        this.lIIIlllIIIllIIIllIII.position(0);
        this.lIIIlllIIIllIIIllIII.limit(this.IlIlIlIlIlllllllllIl() * 4);
    }
    
    public ByteBuffer llllIIIlIlllIlIIIIIl() {
        return this.IIlIIIIlllIlllllIlII ? this.IIIlIIlIIIIlllIlllII : this.lIIIlllIIIllIIIllIII;
    }
    
    public llIllIIIIIllIlIIIIlI lIIIIlIIIIIlllIllIII() {
        return this.IIlllIIlIllIllIlIIll;
    }
    
    public int lIIIlllIIIllIIIllIII() {
        return this.IIlIIIIlllIlllllIlII ? (this.llIllIIIIIllIlIIIIlI / 4 * 6) : this.llIllIIIIIllIlIIIIlI;
    }
    
    public int llIIlIIIlIIIllIlIIIl() {
        return this.IIlIIIIlllIlllllIlII ? 4 : this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public void IlIlIlIlIlllllllllIl(final int n) {
        for (int i = 0; i < 4; ++i) {
            this.IlIlIlIlIlllllllllIl(n, i + 1);
        }
    }
    
    public void IlIIIlIlIIIllIlIlIIl(final float n, final float n2, final float n3) {
        for (int i = 0; i < 4; ++i) {
            this.IlIlIlIlIlllllllllIl(n, n2, n3, i + 1);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI) {
        if (this.llllIIIlIlllIlIIIIIl != null && ilIlIIIllIIllIlllllI != null && ilIlIIIllIIllIlllllI.llllIIllllIlIlIIIIll() >= 0) {
            this.llllIIIlIlllIlIIIIIl.set(ilIlIIIllIIllIlllllI.llllIIllllIlIlIIIIll());
        }
        if (this.IIIlIIIlIlIIlllIIlll != null) {
            this.IIIlIIIlIlIIlllIIlll[this.llIllIIIIIllIlIIIIlI / 4 - 1] = ilIlIIIllIIllIlllllI;
        }
    }
    
    public void IlIlIlIlIlllllllllIl(final IlIlIIIllIIllIlllllI illlllllIIIlIIIlIlII) {
        if (this.llllIIIlIlllIlIIIIIl != null && illlllllIIIlIIIlIlII != null && illlllllIIIlIIIlIlII.llllIIllllIlIlIIIIll() >= 0) {
            this.llllIIIlIlllIlIIIIIl.set(illlllllIIIlIIIlIlII.llllIIllllIlIlIIIIll());
        }
        if (this.IIIlIIIlIlIIlllIIlll != null) {
            this.IlllllllIIIlIIIlIlII = illlllllIIIlIIIlIlII;
        }
    }
    
    public boolean llIllIlIIIIllIlIIllI() {
        return this.IIIlIIIlIlIIlllIIlll != null;
    }
    
    public void lIlIlIIIllIIllIIIllI() {
        if (this.IIIlIIIlIlIIlllIIlll != null) {
            final int llIIlIIIlIIIllIlIIIl = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI().IlIllllIIlIIlIlIlIll().llIIlIIIlIIIllIlIIIl();
            if (this.IIllIIllIIIlIlIIIIlI.length <= llIIlIIIlIIIllIlIIIl) {
                this.IIllIIllIIIlIlIIIIlI = new boolean[llIIlIIIlIIIllIlIIIl + 1];
            }
            Arrays.fill(this.IIllIIllIIIlIlIIIIlI, false);
            int n = 0;
            int n2 = -1;
            for (int n3 = this.llIllIIIIIllIlIIIIlI / 4, i = 0; i < n3; ++i) {
                final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI = this.IIIlIIIlIlIIlllIIlll[i];
                if (ilIlIIIllIIllIlllllI != null) {
                    final int iiiIlllIIIIIIlIIIlll = ilIlIIIllIIllIlllllI.IIIIlllIIIIIIlIIIlll();
                    if (!this.IIllIIllIIIlIlIIIIlI[iiiIlllIIIIIIlIIIlll]) {
                        if (ilIlIIIllIIllIlllllI == IlIIIlIIIllllIlIlIlI.IIlIlIllllIlllIIIIll) {
                            if (n2 < 0) {
                                n2 = i;
                            }
                        }
                        else {
                            i = this.llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI, i) - 1;
                            ++n;
                            if (this.IlIlIIIIIIlllIlIllIl != IlIIlIlIIIlIIlIlIlII.IlIIIlIlIIIllIlIlIIl) {
                                this.IIllIIllIIIlIlIIIIlI[iiiIlllIIIIIIlIIIlll] = true;
                            }
                        }
                    }
                }
            }
            if (n2 >= 0) {
                this.llllIIIIlIIIlIlllIll(IlIIIlIIIllllIlIlIlI.IIlIlIllllIlllIIIIll, n2);
                ++n;
            }
            if (n > 0) {}
        }
    }
    
    private int llllIIIIlIIIlIlllIll(final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI, final int n) {
        GL11.glBindTexture(3553, ilIlIIIllIIllIlllllI.IIIIlllIIIIIIlIIIlll);
        int n2 = -1;
        int n3 = -1;
        final int n4 = this.llIllIIIIIllIlIIIIlI / 4;
        for (int i = n; i < n4; ++i) {
            if (this.IIIlIIIlIlIIlllIIlll[i] == ilIlIIIllIIllIlllllI) {
                if (n3 < 0) {
                    n3 = i;
                }
            }
            else if (n3 >= 0) {
                this.llIllIIIIIllIlIIIIlI(n3, i);
                if (this.IlIlIIIIIIlllIlIllIl == IlIIlIlIIIlIIlIlIlII.IlIIIlIlIIIllIlIlIIl) {
                    return i;
                }
                n3 = -1;
                if (n2 < 0) {
                    n2 = i;
                }
            }
        }
        if (n3 >= 0) {
            this.llIllIIIIIllIlIIIIlI(n3, n4);
        }
        if (n2 < 0) {
            n2 = n4;
        }
        return n2;
    }
    
    private void llIllIIIIIllIlIIIIlI(final int n, final int n2) {
        final int n3 = n2 - n;
        if (n3 > 0) {
            GL11.glDrawArrays(this.IlIIIlIlIIIllIlIlIIl, n * 4, n3 * 4);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIIlIlIIIlIIlIlIlII ilIlIIIIIIlllIlIllIl) {
        this.IlIlIIIIIIlllIlIllIl = ilIlIIIIIIlllIlIllIl;
        if (ilIlIIIIIIlllIlIllIl == null) {
            if (this.IIIlIIIlIlIIlllIIlll != null) {
                this.IlIlIIIlIIlIlIIlllIl = this.IIIlIIIlIlIIlllIIlll;
            }
            this.IIIlIIIlIlIIlllIIlll = null;
            this.IlllllllIIIlIIIlIlII = null;
        }
    }
    
    private int IlIlIIIlIIlIlIIlllIl() {
        return this.llllIIIIlIIIlIlllIll.capacity() * 4 / (this.IIlllIIlIllIllIlIIll.IllIIlllIIIIlllIIlIl() * 4);
    }
    
    public llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (this.IllIIlllIIIIlllIIlIl == null) {
            return this.IllIIlllIIIIlllIIlIl = new llllIIIlIlllIlIIIIIl(llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl);
        }
        this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl);
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public boolean IlIlIIIllIIllIlllllI() {
        return this.lllIIIIlllllIlIIllIl;
    }
    
    public double IIIIlllIIIIIIlIIIlll() {
        return this.IIIIlllIIIIIIlIIIlll;
    }
    
    public double llllIIllllIlIlIIIIll() {
        return this.llllIIllllIlIlIIIIll;
    }
    
    public double IlIllIlIlIIIlIlIlIII() {
        return this.IlIllIlIlIIIlIlIlIII;
    }
    
    public IlIIlIlIIIlIIlIlIlII IIlllIIlIllIllIlIIll() {
        return this.IlIlIIIIIIlllIlIllIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final float n, final float n2, final float n3, final float n4, final int n5) {
        final int llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(n5);
        int n6 = -1;
        if (!this.IlIlIIIllIIllIlllllI) {
            final int value = this.llllIIIIlIIIlIlllIll.get(llllIIIIlIIIlIlllIll);
            if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
                n6 = ((int)((value >> 24 & 0xFF) * n4) << 24 | (int)((value >> 16 & 0xFF) * n3) << 16 | (int)((value >> 8 & 0xFF) * n2) << 8 | (int)((value & 0xFF) * n));
            }
            else {
                n6 = ((int)((value >> 24 & 0xFF) * n) << 24 | (int)((value >> 16 & 0xFF) * n2) << 16 | (int)((value >> 8 & 0xFF) * n3) << 8 | (int)((value & 0xFF) * n4));
            }
        }
        this.llllIIIIlIIIlIlllIll.put(llllIIIIlIIIlIlllIll, n6);
    }
    
    public void lllIIIIlllllIlIIllIl() {
        if (this.IlIIIlIlIIIllIlIlIIl == 7) {
            if (this.IIIlIIlIIIIlllIlllII == null) {
                this.IIIlIIlIIIIlllIlllII = llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI(this.lIIIlllIIIllIIIllIII.capacity() * 2);
            }
            if (this.IIIlIIlIIIIlllIlllII.capacity() < this.lIIIlllIIIllIIIllIII.capacity() * 2) {
                this.IIIlIIlIIIIlllIlllII = llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI(this.lIIIlllIIIllIIIllIII.capacity() * 2);
            }
            final int llllIIIlIlllIlIIIIIl = this.IIlllIIlIllIllIlIIll.llllIIIlIlllIlIIIIIl();
            final int limit = this.lIIIlllIIIllIIIllIII.limit();
            this.lIIIlllIIIllIIIllIII.rewind();
            this.IIIlIIlIIIIlllIlllII.clear();
            for (int i = 0; i < this.llIllIIIIIllIlIIIIlI; i += 4) {
                this.lIIIlllIIIllIIIllIII.limit((i + 3) * llllIIIlIlllIlIIIIIl);
                this.lIIIlllIIIllIIIllIII.position(i * llllIIIlIlllIlIIIIIl);
                this.IIIlIIlIIIIlllIlllII.put(this.lIIIlllIIIllIIIllIII);
                this.lIIIlllIIIllIIIllIII.limit((i + 1) * llllIIIlIlllIlIIIIIl);
                this.lIIIlllIIIllIIIllIII.position(i * llllIIIlIlllIlIIIIIl);
                this.IIIlIIlIIIIlllIlllII.put(this.lIIIlllIIIllIIIllIII);
                this.lIIIlllIIIllIIIllIII.limit((i + 2 + 2) * llllIIIlIlllIlIIIIIl);
                this.lIIIlllIIIllIIIllIII.position((i + 2) * llllIIIlIlllIlIIIIIl);
                this.IIIlIIlIIIIlllIlllII.put(this.lIIIlllIIIllIIIllIII);
            }
            this.lIIIlllIIIllIIIllIII.limit(limit);
            this.lIIIlllIIIllIIIllIII.rewind();
            this.IIIlIIlIIIIlllIlllII.flip();
            this.IIlIIIIlllIlllllIlII = true;
        }
    }
    
    public boolean IlIlIIIIIIlllIlIllIl() {
        return this.IlIlIIIllIIllIlllllI;
    }
    
    static /* synthetic */ int[] IIllIIllIIIlIlIIIIlI() {
        final int[] ilIlIllllllllIIIIlII = lIIllIIIllllIlllIllI.IlIlIllllllllIIIIlII;
        if (ilIlIllllllllIIIIlII != null) {
            return ilIlIllllllllIIIIlII;
        }
        final int[] ilIlIllllllllIIIIlII2 = new int[IlIlIIIllIllIIIIIllI.values().length];
        try {
            ilIlIllllllllIIIIlII2[IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ilIlIllllllllIIIIlII2[IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            ilIlIllllllllIIIIlII2[IlIlIIIllIllIIIIIllI.llllIIIlIlllIlIIIIIl.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            ilIlIllllllllIIIIlII2[IlIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            ilIlIllllllllIIIIlII2[IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        try {
            ilIlIllllllllIIIIlII2[IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError6) {}
        try {
            ilIlIllllllllIIIIlII2[IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError7) {}
        return lIIllIIIllllIlllIllI.IlIlIllllllllIIIIlII = ilIlIllllllllIIIIlII2;
    }
}
