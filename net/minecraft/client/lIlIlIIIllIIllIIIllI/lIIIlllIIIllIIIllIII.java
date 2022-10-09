package net.minecraft.client.lIlIlIIIllIIllIIIllI;

import java.nio.*;
import org.apache.logging.log4j.*;
import org.lwjgl.*;
import org.lwjgl.util.vector.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;

public class lIIIlllIIIllIIIllIII
{
    private static final Logger llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    private final int llIllIIIIIllIlIIIIlI;
    private final int IlIIIlIlIIIllIlIlIIl;
    private final IntBuffer IlIlIIIllIllIIIIIllI;
    private final FloatBuffer IllIIlllIIIIlllIIlIl;
    private final String llllIIIlIlllIlIIIIIl;
    private boolean lIIIIlIIIIIlllIllIII;
    private final lIIIIlIIIIIlllIllIII lIIIlllIIIllIIIllIII;
    
    static {
        llllIIIIlIIIlIlllIll = LogManager.getLogger();
    }
    
    public lIIIlllIIIllIIIllIII(final String llllIIIlIlllIlIIIIIl, final int ilIIIlIlIIIllIlIlIIl, final int llIllIIIIIllIlIIIIlI, final lIIIIlIIIIIlllIllIII liiIlllIIIllIIIllIII) {
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
        if (ilIIIlIlIIIllIlIlIIl <= 3) {
            this.IlIlIIIllIllIIIIIllI = BufferUtils.createIntBuffer(llIllIIIIIllIlIIIIlI);
            this.IllIIlllIIIIlllIIlIl = null;
        }
        else {
            this.IlIlIIIllIllIIIIIllI = null;
            this.IllIIlllIIIIlllIIlIl = BufferUtils.createFloatBuffer(llIllIIIIIllIlIIIIlI);
        }
        this.IlIlIlIlIlllllllllIl = -1;
        this.llIllIIIIIllIlIIIIlI();
    }
    
    private void llIllIIIIIllIlIIIIlI() {
        this.lIIIIlIIIIIlllIllIII = true;
        if (this.lIIIlllIIIllIIIllIII != null) {
            this.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl();
        }
    }
    
    public static int llllIIIIlIIIlIlllIll(final String s) {
        int n = -1;
        if (s.equals("int")) {
            n = 0;
        }
        else if (s.equals("float")) {
            n = 4;
        }
        else if (s.startsWith("matrix")) {
            if (s.endsWith("2x2")) {
                n = 8;
            }
            else if (s.endsWith("3x3")) {
                n = 9;
            }
            else if (s.endsWith("4x4")) {
                n = 10;
            }
        }
        return n;
    }
    
    public void llllIIIIlIIIlIlllIll(final int ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return this.llllIIIlIlllIlIIIIIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final float n) {
        this.IllIIlllIIIIlllIIlIl.position(0);
        this.IllIIlllIIIIlllIIlIl.put(0, n);
        this.llIllIIIIIllIlIIIIlI();
    }
    
    public void llllIIIIlIIIlIlllIll(final float n, final float n2) {
        this.IllIIlllIIIIlllIIlIl.position(0);
        this.IllIIlllIIIIlllIIlIl.put(0, n);
        this.IllIIlllIIIIlllIIlIl.put(1, n2);
        this.llIllIIIIIllIlIIIIlI();
    }
    
    public void llllIIIIlIIIlIlllIll(final float n, final float n2, final float n3) {
        this.IllIIlllIIIIlllIIlIl.position(0);
        this.IllIIlllIIIIlllIIlIl.put(0, n);
        this.IllIIlllIIIIlllIIlIl.put(1, n2);
        this.IllIIlllIIIIlllIIlIl.put(2, n3);
        this.llIllIIIIIllIlIIIIlI();
    }
    
    public void llllIIIIlIIIlIlllIll(final float n, final float n2, final float n3, final float n4) {
        this.IllIIlllIIIIlllIIlIl.position(0);
        this.IllIIlllIIIIlllIIlIl.put(n);
        this.IllIIlllIIIIlllIIlIl.put(n2);
        this.IllIIlllIIIIlllIIlIl.put(n3);
        this.IllIIlllIIIIlllIIlIl.put(n4);
        this.IllIIlllIIIIlllIIlIl.flip();
        this.llIllIIIIIllIlIIIIlI();
    }
    
    public void IlIlIlIlIlllllllllIl(final float n, final float n2, final float n3, final float n4) {
        this.IllIIlllIIIIlllIIlIl.position(0);
        if (this.IlIIIlIlIIIllIlIlIIl >= 4) {
            this.IllIIlllIIIIlllIIlIl.put(0, n);
        }
        if (this.IlIIIlIlIIIllIlIlIIl >= 5) {
            this.IllIIlllIIIIlllIIlIl.put(1, n2);
        }
        if (this.IlIIIlIlIIIllIlIlIIl >= 6) {
            this.IllIIlllIIIIlllIIlIl.put(2, n3);
        }
        if (this.IlIIIlIlIIIllIlIlIIl >= 7) {
            this.IllIIlllIIIIlllIIlIl.put(3, n4);
        }
        this.llIllIIIIIllIlIIIIlI();
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4) {
        this.IlIlIIIllIllIIIIIllI.position(0);
        if (this.IlIIIlIlIIIllIlIlIIl >= 0) {
            this.IlIlIIIllIllIIIIIllI.put(0, n);
        }
        if (this.IlIIIlIlIIIllIlIlIIl >= 1) {
            this.IlIlIIIllIllIIIIIllI.put(1, n2);
        }
        if (this.IlIIIlIlIIIllIlIlIIl >= 2) {
            this.IlIlIIIllIllIIIIIllI.put(2, n3);
        }
        if (this.IlIIIlIlIIIllIlIlIIl >= 3) {
            this.IlIlIIIllIllIIIIIllI.put(3, n4);
        }
        this.llIllIIIIIllIlIIIIlI();
    }
    
    public void llllIIIIlIIIlIlllIll(final float[] array) {
        if (array.length < this.llIllIIIIIllIlIIIIlI) {
            net.minecraft.client.lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.warn("Uniform.set called with a too-small value array (expected " + this.llIllIIIIIllIlIIIIlI + ", got " + array.length + "). Ignoring.");
        }
        else {
            this.IllIIlllIIIIlllIIlIl.position(0);
            this.IllIIlllIIIIlllIIlIl.put(array);
            this.IllIIlllIIIIlllIIlIl.position(0);
            this.llIllIIIIIllIlIIIIlI();
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7, final float n8, final float n9, final float n10, final float n11, final float n12, final float n13, final float n14, final float n15, final float n16) {
        this.IllIIlllIIIIlllIIlIl.position(0);
        this.IllIIlllIIIIlllIIlIl.put(0, n);
        this.IllIIlllIIIIlllIIlIl.put(1, n2);
        this.IllIIlllIIIIlllIIlIl.put(2, n3);
        this.IllIIlllIIIIlllIIlIl.put(3, n4);
        this.IllIIlllIIIIlllIIlIl.put(4, n5);
        this.IllIIlllIIIIlllIIlIl.put(5, n6);
        this.IllIIlllIIIIlllIIlIl.put(6, n7);
        this.IllIIlllIIIIlllIIlIl.put(7, n8);
        this.IllIIlllIIIIlllIIlIl.put(8, n9);
        this.IllIIlllIIIIlllIIlIl.put(9, n10);
        this.IllIIlllIIIIlllIIlIl.put(10, n11);
        this.IllIIlllIIIIlllIIlIl.put(11, n12);
        this.IllIIlllIIIIlllIIlIl.put(12, n13);
        this.IllIIlllIIIIlllIIlIl.put(13, n14);
        this.IllIIlllIIIIlllIIlIl.put(14, n15);
        this.IllIIlllIIIIlllIIlIl.put(15, n16);
        this.llIllIIIIIllIlIIIIlI();
    }
    
    public void llllIIIIlIIIlIlllIll(final Matrix4f matrix4f) {
        this.llllIIIIlIIIlIlllIll(matrix4f.m00, matrix4f.m01, matrix4f.m02, matrix4f.m03, matrix4f.m10, matrix4f.m11, matrix4f.m12, matrix4f.m13, matrix4f.m20, matrix4f.m21, matrix4f.m22, matrix4f.m23, matrix4f.m30, matrix4f.m31, matrix4f.m32, matrix4f.m33);
    }
    
    public void IlIlIlIlIlllllllllIl() {
        if (!this.lIIIIlIIIIIlllIllIII) {}
        this.lIIIIlIIIIIlllIllIII = false;
        if (this.IlIIIlIlIIIllIlIlIIl <= 3) {
            this.IlIIIlIlIIIllIlIlIIl();
        }
        else if (this.IlIIIlIlIIIllIlIlIIl <= 7) {
            this.IlIlIIIllIllIIIIIllI();
        }
        else {
            if (this.IlIIIlIlIIIllIlIlIIl > 10) {
                net.minecraft.client.lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.warn("Uniform.upload called, but type value (" + this.IlIIIlIlIIIllIlIlIIl + ") is not " + "a valid type. Ignoring.");
                return;
            }
            this.IllIIlllIIIIlllIIlIl();
        }
    }
    
    private void IlIIIlIlIIIllIlIlIIl() {
        switch (this.IlIIIlIlIIIllIlIlIIl) {
            case 0: {
                lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, this.IlIlIIIllIllIIIIIllI);
                break;
            }
            case 1: {
                lIIIIlIlIllllIIlIllI.IlIlIlIlIlllllllllIl(this.IlIlIlIlIlllllllllIl, this.IlIlIIIllIllIIIIIllI);
                break;
            }
            case 2: {
                lIIIIlIlIllllIIlIllI.llIllIIIIIllIlIIIIlI(this.IlIlIlIlIlllllllllIl, this.IlIlIIIllIllIIIIIllI);
                break;
            }
            case 3: {
                lIIIIlIlIllllIIlIllI.IlIIIlIlIIIllIlIlIIl(this.IlIlIlIlIlllllllllIl, this.IlIlIIIllIllIIIIIllI);
                break;
            }
            default: {
                net.minecraft.client.lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.warn("Uniform.upload called, but count value (" + this.llIllIIIIIllIlIIIIlI + ") is " + " not in the range of 1 to 4. Ignoring.");
                break;
            }
        }
    }
    
    private void IlIlIIIllIllIIIIIllI() {
        switch (this.IlIIIlIlIIIllIlIlIIl) {
            case 4: {
                lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, this.IllIIlllIIIIlllIIlIl);
                break;
            }
            case 5: {
                lIIIIlIlIllllIIlIllI.IlIlIlIlIlllllllllIl(this.IlIlIlIlIlllllllllIl, this.IllIIlllIIIIlllIIlIl);
                break;
            }
            case 6: {
                lIIIIlIlIllllIIlIllI.llIllIIIIIllIlIIIIlI(this.IlIlIlIlIlllllllllIl, this.IllIIlllIIIIlllIIlIl);
                break;
            }
            case 7: {
                lIIIIlIlIllllIIlIllI.IlIIIlIlIIIllIlIlIIl(this.IlIlIlIlIlllllllllIl, this.IllIIlllIIIIlllIIlIl);
                break;
            }
            default: {
                net.minecraft.client.lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.warn("Uniform.upload called, but count value (" + this.llIllIIIIIllIlIIIIlI + ") is " + "not in the range of 1 to 4. Ignoring.");
                break;
            }
        }
    }
    
    private void IllIIlllIIIIlllIIlIl() {
        switch (this.IlIIIlIlIIIllIlIlIIl) {
            case 8: {
                lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, true, this.IllIIlllIIIIlllIIlIl);
                break;
            }
            case 9: {
                lIIIIlIlIllllIIlIllI.IlIlIlIlIlllllllllIl(this.IlIlIlIlIlllllllllIl, true, this.IllIIlllIIIIlllIIlIl);
                break;
            }
            case 10: {
                lIIIIlIlIllllIIlIllI.llIllIIIIIllIlIIIIlI(this.IlIlIlIlIlllllllllIl, true, this.IllIIlllIIIIlllIIlIl);
                break;
            }
        }
    }
}
