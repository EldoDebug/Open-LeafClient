package net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll;

import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.*;
import net.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import net.optifine.shaders.*;
import net.optifine.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import org.lwjgl.util.vector.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class llIIlIIIlIIIllIlIIIl
{
    private static final float llllIIIIlIIIlIlllIll;
    private static final float IlIlIlIlIlllllllllIl;
    private static volatile /* synthetic */ int[] llIllIIIIIllIlIIIIlI;
    private static volatile /* synthetic */ int[] IlIIIlIlIIIllIlIlIIl;
    
    static {
        llllIIIIlIIIlIlllIll = 1.0f / (float)Math.cos(0.39269909262657166) - 1.0f;
        IlIlIlIlIlllllllllIl = 1.0f / (float)Math.cos(0.7853981633974483) - 1.0f;
    }
    
    public llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final Vector3f vector3f, final Vector3f vector3f2, final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII, final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII2, final boolean b, final boolean b2) {
        return this.llllIIIIlIIIlIlllIll(vector3f, vector3f2, illIIlllIIIIlllIIlIl, ilIlIIIllIIllIlllllI, lllIllIIIllllllIllll, (IlIIIlIlIIIllIlIlIIl)liiiIlIIIIIlllIllIII, liiiIlIIIIIlllIllIII2, b, b2);
    }
    
    public llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final Vector3f vector3f, final Vector3f vector3f2, final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII, final boolean b, final boolean b2) {
        final int[] llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl, ilIlIIIllIIllIlllllI, lllIllIIIllllllIllll, this.llllIIIIlIIIlIlllIll(vector3f, vector3f2), ilIIIlIlIIIllIlIlIIl, liiiIlIIIIIlllIllIII, b, b2);
        final lllIllIIIllllllIllll llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
        if (b) {
            this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2, illIIlllIIIIlllIIlIl.IlIlIIIllIllIIIIIllI, ilIlIIIllIIllIlllllI);
        }
        if (liiiIlIIIIIlllIllIII == null) {
            this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2);
        }
        if (net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.lIllIlIIIllllllIIlII.llIllIIIIIllIlIIIIlI()) {
            net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl(net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.lIllIlIIIllllllIIlII, llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2);
        }
        return new llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, illIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI, llllIIIIlIIIlIlllIll2);
    }
    
    private int[] llllIIIIlIIIlIlllIll(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final float[] array, final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII, final boolean b, final boolean b2) {
        int n = 28;
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
            n = 56;
        }
        final int[] array2 = new int[n];
        for (int i = 0; i < 4; ++i) {
            this.llllIIIIlIIIlIlllIll(array2, i, lllIllIIIllllllIllll, illIIlllIIIIlllIIlIl, array, ilIlIIIllIIllIlllllI, ilIIIlIlIIIllIlIlIIl, liiiIlIIIIIlllIllIII, b, b2);
        }
        return array2;
    }
    
    private int IlIlIlIlIlllllllllIl(final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        final int llllIIIIlIIIlIlllIll = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll((int)(llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll) * 255.0f), 0, 255);
        return 0xFF000000 | llllIIIIlIIIlIlllIll << 16 | llllIIIIlIIIlIlllIll << 8 | llllIIIIlIIIlIlllIll;
    }
    
    public static float llllIIIIlIIIlIlllIll(final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        switch (llllIIIIlIIIlIlllIll()[lllIllIIIllllllIllll.ordinal()]) {
            case 1: {
                if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
                    return llIIlllIIlllIIllIllI.cZ;
                }
                return 0.5f;
            }
            case 2: {
                return 1.0f;
            }
            case 3:
            case 4: {
                if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
                    return llIIlllIIlllIIllIllI.db;
                }
                return 0.8f;
            }
            case 5:
            case 6: {
                if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
                    return llIIlllIIlllIIllIllI.da;
                }
                return 0.6f;
            }
            default: {
                return 1.0f;
            }
        }
    }
    
    private float[] llllIIIIlIIIlIlllIll(final Vector3f vector3f, final Vector3f vector3f2) {
        final float[] array = new float[lllIllIIIllllllIllll.values().length];
        array[IlIlIllllllllIIIIlII.IllIIlllIIIIlllIIlIl] = vector3f.x / 16.0f;
        array[IlIlIllllllllIIIIlII.IlIlIIIllIllIIIIIllI] = vector3f.y / 16.0f;
        array[IlIlIllllllllIIIIlII.IlIIIlIlIIIllIlIlIIl] = vector3f.z / 16.0f;
        array[IlIlIllllllllIIIIlII.llIllIIIIIllIlIIIIlI] = vector3f2.x / 16.0f;
        array[IlIlIllllllllIIIIlII.IlIlIlIlIlllllllllIl] = vector3f2.y / 16.0f;
        array[IlIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll] = vector3f2.z / 16.0f;
        return array;
    }
    
    private void llllIIIIlIIIlIlllIll(final int[] array, final int n, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final float[] array2, final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI, final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII, final boolean b, final boolean b2) {
        final lllIllIIIllllllIllll ilIlIlIlIlllllllllIl = ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(lllIllIIIllllllIllll);
        final int n2 = b2 ? this.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl) : -1;
        final IIlllIlIIllIlIlIlIIl llllIIIIlIIIlIlllIll = IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll).llllIIIIlIIIlIlllIll(n);
        final Vector3f vector3f = new Vector3f(array2[llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll], array2[llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl], array2[llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI]);
        this.llllIIIIlIIIlIlllIll(vector3f, liiiIlIIIIIlllIllIII);
        final int llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll(vector3f, lllIllIIIllllllIllll, n, ilIIIlIlIIIllIlIlIIl, b);
        net.optifine.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(vector3f);
        this.llllIIIIlIIIlIlllIll(array, llllIIIIlIIIlIlllIll2, n, vector3f, n2, ilIlIIIllIIllIlllllI, illIIlllIIIIlllIIlIl.IlIlIIIllIllIIIIIllI);
    }
    
    private void llllIIIIlIIIlIlllIll(final int[] array, final int n, final int n2, final Vector3f vector3f, final int n3, final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI, final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final int n4 = n * (array.length / 4);
        array[n4] = Float.floatToRawIntBits(vector3f.x);
        array[n4 + 1] = Float.floatToRawIntBits(vector3f.y);
        array[n4 + 2] = Float.floatToRawIntBits(vector3f.z);
        array[n4 + 3] = n3;
        array[n4 + 4] = Float.floatToRawIntBits(ilIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n2) * 0.999 + ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll((n2 + 2) % 4) * 0.001));
        array[n4 + 4 + 1] = Float.floatToRawIntBits(ilIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(n2) * 0.999 + ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl((n2 + 2) % 4) * 0.001));
    }
    
    private void llllIIIIlIIIlIlllIll(final Vector3f vector3f, final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        if (liiiIlIIIIIlllIllIII != null) {
            final Matrix4f llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI();
            final Vector3f vector3f2 = new Vector3f(0.0f, 0.0f, 0.0f);
            switch (IlIlIlIlIlllllllllIl()[liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl.ordinal()]) {
                case 1: {
                    Matrix4f.rotate(liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI * 0.017453292f, new Vector3f(1.0f, 0.0f, 0.0f), llIllIIIIIllIlIIIIlI, llIllIIIIIllIlIIIIlI);
                    vector3f2.set(0.0f, 1.0f, 1.0f);
                    break;
                }
                case 2: {
                    Matrix4f.rotate(liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI * 0.017453292f, new Vector3f(0.0f, 1.0f, 0.0f), llIllIIIIIllIlIIIIlI, llIllIIIIIllIlIIIIlI);
                    vector3f2.set(1.0f, 0.0f, 1.0f);
                    break;
                }
                case 3: {
                    Matrix4f.rotate(liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI * 0.017453292f, new Vector3f(0.0f, 0.0f, 1.0f), llIllIIIIIllIlIIIIlI, llIllIIIIIllIlIIIIlI);
                    vector3f2.set(1.0f, 1.0f, 0.0f);
                    break;
                }
            }
            if (liiiIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl) {
                if (Math.abs(liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI) == 22.5f) {
                    vector3f2.scale(llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll);
                }
                else {
                    vector3f2.scale(llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl);
                }
                Vector3f.add(vector3f2, new Vector3f(1.0f, 1.0f, 1.0f), vector3f2);
            }
            else {
                vector3f2.set(1.0f, 1.0f, 1.0f);
            }
            this.llllIIIIlIIIlIlllIll(vector3f, new Vector3f((ReadableVector3f)liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll), llIllIIIIIllIlIIIIlI, vector3f2);
        }
    }
    
    public int llllIIIIlIIIlIlllIll(final Vector3f vector3f, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final int n, final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII, final boolean b) {
        return this.llllIIIIlIIIlIlllIll(vector3f, lllIllIIIllllllIllll, n, liiiIlIIIIIlllIllIII, b);
    }
    
    public int llllIIIIlIIIlIlllIll(final Vector3f vector3f, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final int n, final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final boolean b) {
        if (ilIIIlIlIIIllIlIlIIl == lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll) {
            return n;
        }
        if (net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.m.llIllIIIIIllIlIIIIlI()) {
            net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl(net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.m, vector3f, ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl());
        }
        else {
            this.llllIIIIlIIIlIlllIll(vector3f, new Vector3f(0.5f, 0.5f, 0.5f), ((lIIIIlIIIIIlllIllIII)ilIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll(), new Vector3f(1.0f, 1.0f, 1.0f));
        }
        return ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(lllIllIIIllllllIllll, n);
    }
    
    private void llllIIIIlIIIlIlllIll(final Vector3f vector3f, final Vector3f vector3f2, final Matrix4f matrix4f, final Vector3f vector3f3) {
        final Vector4f vector4f = new Vector4f(vector3f.x - vector3f2.x, vector3f.y - vector3f2.y, vector3f.z - vector3f2.z, 1.0f);
        Matrix4f.transform(matrix4f, vector4f, vector4f);
        final Vector4f vector4f2 = vector4f;
        vector4f2.x *= vector3f3.x;
        final Vector4f vector4f3 = vector4f;
        vector4f3.y *= vector3f3.y;
        final Vector4f vector4f4 = vector4f;
        vector4f4.z *= vector3f3.z;
        vector3f.set(vector4f.x + vector3f2.x, vector4f.y + vector3f2.y, vector4f.z + vector3f2.z);
    }
    
    private Matrix4f llIllIIIIIllIlIIIIlI() {
        final Matrix4f matrix4f = new Matrix4f();
        matrix4f.setIdentity();
        return matrix4f;
    }
    
    public static lllIllIIIllllllIllll llllIIIIlIIIlIlllIll(final int[] array) {
        final int n = array.length / 4;
        final int n2 = n * 2;
        final Vector3f vector3f = new Vector3f(Float.intBitsToFloat(array[0]), Float.intBitsToFloat(array[1]), Float.intBitsToFloat(array[2]));
        final Vector3f vector3f2 = new Vector3f(Float.intBitsToFloat(array[n]), Float.intBitsToFloat(array[n + 1]), Float.intBitsToFloat(array[n + 2]));
        final Vector3f vector3f3 = new Vector3f(Float.intBitsToFloat(array[n2]), Float.intBitsToFloat(array[n2 + 1]), Float.intBitsToFloat(array[n2 + 2]));
        final Vector3f vector3f4 = new Vector3f();
        final Vector3f vector3f5 = new Vector3f();
        final Vector3f vector3f6 = new Vector3f();
        Vector3f.sub(vector3f, vector3f2, vector3f4);
        Vector3f.sub(vector3f3, vector3f2, vector3f5);
        Vector3f.cross(vector3f5, vector3f4, vector3f6);
        final float n3 = (float)Math.sqrt(vector3f6.x * vector3f6.x + vector3f6.y * vector3f6.y + vector3f6.z * vector3f6.z);
        final Vector3f vector3f7 = vector3f6;
        vector3f7.x /= n3;
        final Vector3f vector3f8 = vector3f6;
        vector3f8.y /= n3;
        final Vector3f vector3f9 = vector3f6;
        vector3f9.z /= n3;
        lllIllIIIllllllIllll lllIllIIIllllllIllll = null;
        float n4 = 0.0f;
        lllIllIIIllllllIllll[] values;
        for (int length = (values = net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.values()).length, i = 0; i < length; ++i) {
            final lllIllIIIllllllIllll lllIllIIIllllllIllll2 = values[i];
            final f ilIlIIIllIIllIlllllI = lllIllIIIllllllIllll2.IlIlIIIllIIllIlllllI();
            final float dot = Vector3f.dot(vector3f6, new Vector3f((float)ilIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII(), (float)ilIlIIIllIIllIlllllI.lIIIlllIIIllIIIllIII(), (float)ilIlIIIllIIllIlllllI.llIIlIIIlIIIllIlIIIl()));
            if (dot >= 0.0f && dot > n4) {
                n4 = dot;
                lllIllIIIllllllIllll = lllIllIIIllllllIllll2;
            }
        }
        if (lllIllIIIllllllIllll == null) {
            return net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl;
        }
        return lllIllIIIllllllIllll;
    }
    
    public void llllIIIIlIIIlIlllIll(final int[] array, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI) {
        for (int i = 0; i < 4; ++i) {
            this.llllIIIIlIIIlIlllIll(i, array, lllIllIIIllllllIllll, ilIlIlIlIlllllllllIl, ilIlIIIllIIllIlllllI);
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final int[] array, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        final int[] array2 = new int[array.length];
        System.arraycopy(array, 0, array2, 0, array.length);
        final float[] array3 = new float[lllIllIIIllllllIllll.values().length];
        array3[IlIlIllllllllIIIIlII.IllIIlllIIIIlllIIlIl] = 999.0f;
        array3[IlIlIllllllllIIIIlII.IlIlIIIllIllIIIIIllI] = 999.0f;
        array3[IlIlIllllllllIIIIlII.IlIIIlIlIIIllIlIlIIl] = 999.0f;
        array3[IlIlIllllllllIIIIlII.llIllIIIIIllIlIIIIlI] = -999.0f;
        array3[IlIlIllllllllIIIIlII.IlIlIlIlIlllllllllIl] = -999.0f;
        array3[IlIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll] = -999.0f;
        final int n = array.length / 4;
        for (int i = 0; i < 4; ++i) {
            final int n2 = n * i;
            final float intBitsToFloat = Float.intBitsToFloat(array2[n2]);
            final float intBitsToFloat2 = Float.intBitsToFloat(array2[n2 + 1]);
            final float intBitsToFloat3 = Float.intBitsToFloat(array2[n2 + 2]);
            if (intBitsToFloat < array3[IlIlIllllllllIIIIlII.IllIIlllIIIIlllIIlIl]) {
                array3[IlIlIllllllllIIIIlII.IllIIlllIIIIlllIIlIl] = intBitsToFloat;
            }
            if (intBitsToFloat2 < array3[IlIlIllllllllIIIIlII.IlIlIIIllIllIIIIIllI]) {
                array3[IlIlIllllllllIIIIlII.IlIlIIIllIllIIIIIllI] = intBitsToFloat2;
            }
            if (intBitsToFloat3 < array3[IlIlIllllllllIIIIlII.IlIIIlIlIIIllIlIlIIl]) {
                array3[IlIlIllllllllIIIIlII.IlIIIlIlIIIllIlIlIIl] = intBitsToFloat3;
            }
            if (intBitsToFloat > array3[IlIlIllllllllIIIIlII.llIllIIIIIllIlIIIIlI]) {
                array3[IlIlIllllllllIIIIlII.llIllIIIIIllIlIIIIlI] = intBitsToFloat;
            }
            if (intBitsToFloat2 > array3[IlIlIllllllllIIIIlII.IlIlIlIlIlllllllllIl]) {
                array3[IlIlIllllllllIIIIlII.IlIlIlIlIlllllllllIl] = intBitsToFloat2;
            }
            if (intBitsToFloat3 > array3[IlIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll]) {
                array3[IlIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll] = intBitsToFloat3;
            }
        }
        final IIIlIIlIIIIlllIlllII llllIIIIlIIIlIlllIll = IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll);
        for (int j = 0; j < 4; ++j) {
            final int n3 = n * j;
            final IIlllIlIIllIlIlIlIIl llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(j);
            final float n4 = array3[llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll];
            final float n5 = array3[llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl];
            final float n6 = array3[llllIIIIlIIIlIlllIll2.llIllIIIIIllIlIIIIlI];
            array[n3] = Float.floatToRawIntBits(n4);
            array[n3 + 1] = Float.floatToRawIntBits(n5);
            array[n3 + 2] = Float.floatToRawIntBits(n6);
            for (int k = 0; k < 4; ++k) {
                final int n7 = n * k;
                final float intBitsToFloat4 = Float.intBitsToFloat(array2[n7]);
                final float intBitsToFloat5 = Float.intBitsToFloat(array2[n7 + 1]);
                final float intBitsToFloat6 = Float.intBitsToFloat(array2[n7 + 2]);
                if (llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n4, intBitsToFloat4) && llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n5, intBitsToFloat5) && llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n6, intBitsToFloat6)) {
                    array[n3 + 4] = array2[n7 + 4];
                    array[n3 + 4 + 1] = array2[n7 + 4 + 1];
                }
            }
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final int n, final int[] array, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI) {
        final int n2 = array.length / 4;
        final int n3 = n2 * n;
        float intBitsToFloat = Float.intBitsToFloat(array[n3]);
        float intBitsToFloat2 = Float.intBitsToFloat(array[n3 + 1]);
        float intBitsToFloat3 = Float.intBitsToFloat(array[n3 + 2]);
        if (intBitsToFloat < -0.1f || intBitsToFloat >= 1.1f) {
            intBitsToFloat -= llIllIIlllllllllllll.IlIIIlIlIIIllIlIlIIl(intBitsToFloat);
        }
        if (intBitsToFloat2 < -0.1f || intBitsToFloat2 >= 1.1f) {
            intBitsToFloat2 -= llIllIIlllllllllllll.IlIIIlIlIIIllIlIlIIl(intBitsToFloat2);
        }
        if (intBitsToFloat3 < -0.1f || intBitsToFloat3 >= 1.1f) {
            intBitsToFloat3 -= llIllIIlllllllllllll.IlIIIlIlIIIllIlIlIIl(intBitsToFloat3);
        }
        float n4 = 0.0f;
        float n5 = 0.0f;
        switch (llllIIIIlIIIlIlllIll()[lllIllIIIllllllIllll.ordinal()]) {
            case 1: {
                n4 = intBitsToFloat * 16.0f;
                n5 = (1.0f - intBitsToFloat3) * 16.0f;
                break;
            }
            case 2: {
                n4 = intBitsToFloat * 16.0f;
                n5 = intBitsToFloat3 * 16.0f;
                break;
            }
            case 3: {
                n4 = (1.0f - intBitsToFloat) * 16.0f;
                n5 = (1.0f - intBitsToFloat2) * 16.0f;
                break;
            }
            case 4: {
                n4 = intBitsToFloat * 16.0f;
                n5 = (1.0f - intBitsToFloat2) * 16.0f;
                break;
            }
            case 5: {
                n4 = intBitsToFloat3 * 16.0f;
                n5 = (1.0f - intBitsToFloat2) * 16.0f;
                break;
            }
            case 6: {
                n4 = (1.0f - intBitsToFloat3) * 16.0f;
                n5 = (1.0f - intBitsToFloat2) * 16.0f;
                break;
            }
        }
        final int n6 = ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(n) * n2;
        array[n6 + 4] = Float.floatToRawIntBits(ilIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll((double)n4));
        array[n6 + 4 + 1] = Float.floatToRawIntBits(ilIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl((double)n5));
    }
    
    static /* synthetic */ int[] llllIIIIlIIIlIlllIll() {
        final int[] llIllIIIIIllIlIIIIlI = llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI;
        if (llIllIIIIIllIlIIIIlI != null) {
            return llIllIIIIIllIlIIIIlI;
        }
        final int[] llIllIIIIIllIlIIIIlI2 = new int[lllIllIIIllllllIllll.values().length];
        try {
            llIllIIIIIllIlIIIIlI2[lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            llIllIIIIIllIlIIIIlI2[lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            llIllIIIIIllIlIIIIlI2[lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            llIllIIIIIllIlIIIIlI2[lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            llIllIIIIIllIlIIIIlI2[lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        try {
            llIllIIIIIllIlIIIIlI2[lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError6) {}
        return llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI2;
    }
    
    static /* synthetic */ int[] IlIlIlIlIlllllllllIl() {
        final int[] ilIIIlIlIIIllIlIlIIl = llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl;
        if (ilIIIlIlIIIllIlIlIIl != null) {
            return ilIIIlIlIIIllIlIlIIl;
        }
        final int[] ilIIIlIlIIIllIlIlIIl2 = new int[llIllIlIlIIIIIIIllII.values().length];
        try {
            ilIIIlIlIIIllIlIlIIl2[llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ilIIIlIlIIIllIlIlIIl2[llIllIlIlIIIIIIIllII.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            ilIIIlIlIIIllIlIlIIl2[llIllIlIlIIIIIIIllII.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        return llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl2;
    }
}
