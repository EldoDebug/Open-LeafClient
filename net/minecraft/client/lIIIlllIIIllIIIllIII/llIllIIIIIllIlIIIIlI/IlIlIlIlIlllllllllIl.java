package net.minecraft.client.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI;

import java.nio.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;

public class IlIlIlIlIlllllllllIl extends llllIIIIlIIIlIlllIll
{
    private static IlIlIlIlIlllllllllIl IllIIlllIIIIlllIIlIl;
    private FloatBuffer llllIIIlIlllIlIIIIIl;
    private FloatBuffer lIIIIlIIIIIlllIllIII;
    private FloatBuffer lIIIlllIIIllIIIllIII;
    
    static {
        IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl = new IlIlIlIlIlllllllllIl();
    }
    
    public IlIlIlIlIlllllllllIl() {
        this.llllIIIlIlllIlIIIIIl = llIIIlIlIllIIlIlIlII.IlIlIIIllIllIIIIIllI(16);
        this.lIIIIlIIIIIlllIllIII = llIIIlIlIllIIlIlIlII.IlIlIIIllIllIIIIIllI(16);
        this.lIIIlllIIIllIIIllIII = llIIIlIlIllIIlIlIlII.IlIlIIIllIllIIIIIllI(16);
    }
    
    public static llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll() {
        IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl();
        return IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl;
    }
    
    private void llllIIIIlIIIlIlllIll(final float[] array) {
        final float llIllIIIIIllIlIIIIlI = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(array[0] * array[0] + array[1] * array[1] + array[2] * array[2]);
        final int n = 0;
        array[n] /= llIllIIIIIllIlIIIIlI;
        final int n2 = 1;
        array[n2] /= llIllIIIIIllIlIIIIlI;
        final int n3 = 2;
        array[n3] /= llIllIIIIIllIlIIIIlI;
        final int n4 = 3;
        array[n4] /= llIllIIIIIllIlIIIIlI;
    }
    
    public void IlIlIlIlIlllllllllIl() {
        this.llllIIIlIlllIlIIIIIl.clear();
        this.lIIIIlIIIIIlllIllIII.clear();
        this.lIIIlllIIIllIIIllIII.clear();
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(2983, this.llllIIIlIlllIlIIIIIl);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(2982, this.lIIIIlIIIIIlllIllIII);
        final float[] ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl;
        final float[] llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI;
        this.llllIIIlIlllIlIIIIIl.flip().limit(16);
        this.llllIIIlIlllIlIIIIIl.get(ilIlIlIlIlllllllllIl);
        this.lIIIIlIIIIIlllIllIII.flip().limit(16);
        this.lIIIIlIIIIIlllIllIII.get(llIllIIIIIllIlIIIIlI);
        this.IlIIIlIlIIIllIlIlIIl[0] = llIllIIIIIllIlIIIIlI[0] * ilIlIlIlIlllllllllIl[0] + llIllIIIIIllIlIIIIlI[1] * ilIlIlIlIlllllllllIl[4] + llIllIIIIIllIlIIIIlI[2] * ilIlIlIlIlllllllllIl[8] + llIllIIIIIllIlIIIIlI[3] * ilIlIlIlIlllllllllIl[12];
        this.IlIIIlIlIIIllIlIlIIl[1] = llIllIIIIIllIlIIIIlI[0] * ilIlIlIlIlllllllllIl[1] + llIllIIIIIllIlIIIIlI[1] * ilIlIlIlIlllllllllIl[5] + llIllIIIIIllIlIIIIlI[2] * ilIlIlIlIlllllllllIl[9] + llIllIIIIIllIlIIIIlI[3] * ilIlIlIlIlllllllllIl[13];
        this.IlIIIlIlIIIllIlIlIIl[2] = llIllIIIIIllIlIIIIlI[0] * ilIlIlIlIlllllllllIl[2] + llIllIIIIIllIlIIIIlI[1] * ilIlIlIlIlllllllllIl[6] + llIllIIIIIllIlIIIIlI[2] * ilIlIlIlIlllllllllIl[10] + llIllIIIIIllIlIIIIlI[3] * ilIlIlIlIlllllllllIl[14];
        this.IlIIIlIlIIIllIlIlIIl[3] = llIllIIIIIllIlIIIIlI[0] * ilIlIlIlIlllllllllIl[3] + llIllIIIIIllIlIIIIlI[1] * ilIlIlIlIlllllllllIl[7] + llIllIIIIIllIlIIIIlI[2] * ilIlIlIlIlllllllllIl[11] + llIllIIIIIllIlIIIIlI[3] * ilIlIlIlIlllllllllIl[15];
        this.IlIIIlIlIIIllIlIlIIl[4] = llIllIIIIIllIlIIIIlI[4] * ilIlIlIlIlllllllllIl[0] + llIllIIIIIllIlIIIIlI[5] * ilIlIlIlIlllllllllIl[4] + llIllIIIIIllIlIIIIlI[6] * ilIlIlIlIlllllllllIl[8] + llIllIIIIIllIlIIIIlI[7] * ilIlIlIlIlllllllllIl[12];
        this.IlIIIlIlIIIllIlIlIIl[5] = llIllIIIIIllIlIIIIlI[4] * ilIlIlIlIlllllllllIl[1] + llIllIIIIIllIlIIIIlI[5] * ilIlIlIlIlllllllllIl[5] + llIllIIIIIllIlIIIIlI[6] * ilIlIlIlIlllllllllIl[9] + llIllIIIIIllIlIIIIlI[7] * ilIlIlIlIlllllllllIl[13];
        this.IlIIIlIlIIIllIlIlIIl[6] = llIllIIIIIllIlIIIIlI[4] * ilIlIlIlIlllllllllIl[2] + llIllIIIIIllIlIIIIlI[5] * ilIlIlIlIlllllllllIl[6] + llIllIIIIIllIlIIIIlI[6] * ilIlIlIlIlllllllllIl[10] + llIllIIIIIllIlIIIIlI[7] * ilIlIlIlIlllllllllIl[14];
        this.IlIIIlIlIIIllIlIlIIl[7] = llIllIIIIIllIlIIIIlI[4] * ilIlIlIlIlllllllllIl[3] + llIllIIIIIllIlIIIIlI[5] * ilIlIlIlIlllllllllIl[7] + llIllIIIIIllIlIIIIlI[6] * ilIlIlIlIlllllllllIl[11] + llIllIIIIIllIlIIIIlI[7] * ilIlIlIlIlllllllllIl[15];
        this.IlIIIlIlIIIllIlIlIIl[8] = llIllIIIIIllIlIIIIlI[8] * ilIlIlIlIlllllllllIl[0] + llIllIIIIIllIlIIIIlI[9] * ilIlIlIlIlllllllllIl[4] + llIllIIIIIllIlIIIIlI[10] * ilIlIlIlIlllllllllIl[8] + llIllIIIIIllIlIIIIlI[11] * ilIlIlIlIlllllllllIl[12];
        this.IlIIIlIlIIIllIlIlIIl[9] = llIllIIIIIllIlIIIIlI[8] * ilIlIlIlIlllllllllIl[1] + llIllIIIIIllIlIIIIlI[9] * ilIlIlIlIlllllllllIl[5] + llIllIIIIIllIlIIIIlI[10] * ilIlIlIlIlllllllllIl[9] + llIllIIIIIllIlIIIIlI[11] * ilIlIlIlIlllllllllIl[13];
        this.IlIIIlIlIIIllIlIlIIl[10] = llIllIIIIIllIlIIIIlI[8] * ilIlIlIlIlllllllllIl[2] + llIllIIIIIllIlIIIIlI[9] * ilIlIlIlIlllllllllIl[6] + llIllIIIIIllIlIIIIlI[10] * ilIlIlIlIlllllllllIl[10] + llIllIIIIIllIlIIIIlI[11] * ilIlIlIlIlllllllllIl[14];
        this.IlIIIlIlIIIllIlIlIIl[11] = llIllIIIIIllIlIIIIlI[8] * ilIlIlIlIlllllllllIl[3] + llIllIIIIIllIlIIIIlI[9] * ilIlIlIlIlllllllllIl[7] + llIllIIIIIllIlIIIIlI[10] * ilIlIlIlIlllllllllIl[11] + llIllIIIIIllIlIIIIlI[11] * ilIlIlIlIlllllllllIl[15];
        this.IlIIIlIlIIIllIlIlIIl[12] = llIllIIIIIllIlIIIIlI[12] * ilIlIlIlIlllllllllIl[0] + llIllIIIIIllIlIIIIlI[13] * ilIlIlIlIlllllllllIl[4] + llIllIIIIIllIlIIIIlI[14] * ilIlIlIlIlllllllllIl[8] + llIllIIIIIllIlIIIIlI[15] * ilIlIlIlIlllllllllIl[12];
        this.IlIIIlIlIIIllIlIlIIl[13] = llIllIIIIIllIlIIIIlI[12] * ilIlIlIlIlllllllllIl[1] + llIllIIIIIllIlIIIIlI[13] * ilIlIlIlIlllllllllIl[5] + llIllIIIIIllIlIIIIlI[14] * ilIlIlIlIlllllllllIl[9] + llIllIIIIIllIlIIIIlI[15] * ilIlIlIlIlllllllllIl[13];
        this.IlIIIlIlIIIllIlIlIIl[14] = llIllIIIIIllIlIIIIlI[12] * ilIlIlIlIlllllllllIl[2] + llIllIIIIIllIlIIIIlI[13] * ilIlIlIlIlllllllllIl[6] + llIllIIIIIllIlIIIIlI[14] * ilIlIlIlIlllllllllIl[10] + llIllIIIIIllIlIIIIlI[15] * ilIlIlIlIlllllllllIl[14];
        this.IlIIIlIlIIIllIlIlIIl[15] = llIllIIIIIllIlIIIIlI[12] * ilIlIlIlIlllllllllIl[3] + llIllIIIIIllIlIIIIlI[13] * ilIlIlIlIlllllllllIl[7] + llIllIIIIIllIlIIIIlI[14] * ilIlIlIlIlllllllllIl[11] + llIllIIIIIllIlIIIIlI[15] * ilIlIlIlIlllllllllIl[15];
        final float[] array = this.llllIIIIlIIIlIlllIll[0];
        array[0] = this.IlIIIlIlIIIllIlIlIIl[3] - this.IlIIIlIlIIIllIlIlIIl[0];
        array[1] = this.IlIIIlIlIIIllIlIlIIl[7] - this.IlIIIlIlIIIllIlIlIIl[4];
        array[2] = this.IlIIIlIlIIIllIlIlIIl[11] - this.IlIIIlIlIIIllIlIlIIl[8];
        array[3] = this.IlIIIlIlIIIllIlIlIIl[15] - this.IlIIIlIlIIIllIlIlIIl[12];
        this.llllIIIIlIIIlIlllIll(array);
        final float[] array2 = this.llllIIIIlIIIlIlllIll[1];
        array2[0] = this.IlIIIlIlIIIllIlIlIIl[3] + this.IlIIIlIlIIIllIlIlIIl[0];
        array2[1] = this.IlIIIlIlIIIllIlIlIIl[7] + this.IlIIIlIlIIIllIlIlIIl[4];
        array2[2] = this.IlIIIlIlIIIllIlIlIIl[11] + this.IlIIIlIlIIIllIlIlIIl[8];
        array2[3] = this.IlIIIlIlIIIllIlIlIIl[15] + this.IlIIIlIlIIIllIlIlIIl[12];
        this.llllIIIIlIIIlIlllIll(array2);
        final float[] array3 = this.llllIIIIlIIIlIlllIll[2];
        array3[0] = this.IlIIIlIlIIIllIlIlIIl[3] + this.IlIIIlIlIIIllIlIlIIl[1];
        array3[1] = this.IlIIIlIlIIIllIlIlIIl[7] + this.IlIIIlIlIIIllIlIlIIl[5];
        array3[2] = this.IlIIIlIlIIIllIlIlIIl[11] + this.IlIIIlIlIIIllIlIlIIl[9];
        array3[3] = this.IlIIIlIlIIIllIlIlIIl[15] + this.IlIIIlIlIIIllIlIlIIl[13];
        this.llllIIIIlIIIlIlllIll(array3);
        final float[] array4 = this.llllIIIIlIIIlIlllIll[3];
        array4[0] = this.IlIIIlIlIIIllIlIlIIl[3] - this.IlIIIlIlIIIllIlIlIIl[1];
        array4[1] = this.IlIIIlIlIIIllIlIlIIl[7] - this.IlIIIlIlIIIllIlIlIIl[5];
        array4[2] = this.IlIIIlIlIIIllIlIlIIl[11] - this.IlIIIlIlIIIllIlIlIIl[9];
        array4[3] = this.IlIIIlIlIIIllIlIlIIl[15] - this.IlIIIlIlIIIllIlIlIIl[13];
        this.llllIIIIlIIIlIlllIll(array4);
        final float[] array5 = this.llllIIIIlIIIlIlllIll[4];
        array5[0] = this.IlIIIlIlIIIllIlIlIIl[3] - this.IlIIIlIlIIIllIlIlIIl[2];
        array5[1] = this.IlIIIlIlIIIllIlIlIIl[7] - this.IlIIIlIlIIIllIlIlIIl[6];
        array5[2] = this.IlIIIlIlIIIllIlIlIIl[11] - this.IlIIIlIlIIIllIlIlIIl[10];
        array5[3] = this.IlIIIlIlIIIllIlIlIIl[15] - this.IlIIIlIlIIIllIlIlIIl[14];
        this.llllIIIIlIIIlIlllIll(array5);
        final float[] array6 = this.llllIIIIlIIIlIlllIll[5];
        array6[0] = this.IlIIIlIlIIIllIlIlIIl[3] + this.IlIIIlIlIIIllIlIlIIl[2];
        array6[1] = this.IlIIIlIlIIIllIlIlIIl[7] + this.IlIIIlIlIIIllIlIlIIl[6];
        array6[2] = this.IlIIIlIlIIIllIlIlIIl[11] + this.IlIIIlIlIIIllIlIlIIl[10];
        array6[3] = this.IlIIIlIlIIIllIlIlIIl[15] + this.IlIIIlIlIIIllIlIlIIl[14];
        this.llllIIIIlIIIlIlllIll(array6);
    }
}
