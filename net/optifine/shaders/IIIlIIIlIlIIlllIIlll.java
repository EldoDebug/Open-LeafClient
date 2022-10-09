package net.optifine.shaders;

import java.util.*;
import java.nio.*;

public class IIIlIIIlIlIIlllIIlll
{
    static void llllIIIIlIIIlIlllIll(final float[] array, final float[] array2, final float[] array3) {
        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 4; ++j) {
                array[4 * i + j] = array2[4 * i + 0] * array3[0 + j] + array2[4 * i + 1] * array3[4 + j] + array2[4 * i + 2] * array3[8 + j] + array2[4 * i + 3] * array3[12 + j];
            }
        }
    }
    
    static void IlIlIlIlIlllllllllIl(final float[] array, final float[] array2, final float[] array3) {
        array[0] = array2[0] * array3[0] + array2[4] * array3[1] + array2[8] * array3[2] + array2[12] * array3[3];
        array[1] = array2[1] * array3[0] + array2[5] * array3[1] + array2[9] * array3[2] + array2[13] * array3[3];
        array[2] = array2[2] * array3[0] + array2[6] * array3[1] + array2[10] * array3[2] + array2[14] * array3[3];
        array[3] = array2[3] * array3[0] + array2[7] * array3[1] + array2[11] * array3[2] + array2[15] * array3[3];
    }
    
    static void llllIIIIlIIIlIlllIll(final float[] array, final float[] array2) {
        array[0] = array2[5] * array2[10] * array2[15] - array2[5] * array2[11] * array2[14] - array2[9] * array2[6] * array2[15] + array2[9] * array2[7] * array2[14] + array2[13] * array2[6] * array2[11] - array2[13] * array2[7] * array2[10];
        array[1] = -array2[1] * array2[10] * array2[15] + array2[1] * array2[11] * array2[14] + array2[9] * array2[2] * array2[15] - array2[9] * array2[3] * array2[14] - array2[13] * array2[2] * array2[11] + array2[13] * array2[3] * array2[10];
        array[2] = array2[1] * array2[6] * array2[15] - array2[1] * array2[7] * array2[14] - array2[5] * array2[2] * array2[15] + array2[5] * array2[3] * array2[14] + array2[13] * array2[2] * array2[7] - array2[13] * array2[3] * array2[6];
        array[3] = -array2[1] * array2[6] * array2[11] + array2[1] * array2[7] * array2[10] + array2[5] * array2[2] * array2[11] - array2[5] * array2[3] * array2[10] - array2[9] * array2[2] * array2[7] + array2[9] * array2[3] * array2[6];
        array[4] = -array2[4] * array2[10] * array2[15] + array2[4] * array2[11] * array2[14] + array2[8] * array2[6] * array2[15] - array2[8] * array2[7] * array2[14] - array2[12] * array2[6] * array2[11] + array2[12] * array2[7] * array2[10];
        array[5] = array2[0] * array2[10] * array2[15] - array2[0] * array2[11] * array2[14] - array2[8] * array2[2] * array2[15] + array2[8] * array2[3] * array2[14] + array2[12] * array2[2] * array2[11] - array2[12] * array2[3] * array2[10];
        array[6] = -array2[0] * array2[6] * array2[15] + array2[0] * array2[7] * array2[14] + array2[4] * array2[2] * array2[15] - array2[4] * array2[3] * array2[14] - array2[12] * array2[2] * array2[7] + array2[12] * array2[3] * array2[6];
        array[7] = array2[0] * array2[6] * array2[11] - array2[0] * array2[7] * array2[10] - array2[4] * array2[2] * array2[11] + array2[4] * array2[3] * array2[10] + array2[8] * array2[2] * array2[7] - array2[8] * array2[3] * array2[6];
        array[8] = array2[4] * array2[9] * array2[15] - array2[4] * array2[11] * array2[13] - array2[8] * array2[5] * array2[15] + array2[8] * array2[7] * array2[13] + array2[12] * array2[5] * array2[11] - array2[12] * array2[7] * array2[9];
        array[9] = -array2[0] * array2[9] * array2[15] + array2[0] * array2[11] * array2[13] + array2[8] * array2[1] * array2[15] - array2[8] * array2[3] * array2[13] - array2[12] * array2[1] * array2[11] + array2[12] * array2[3] * array2[9];
        array[10] = array2[0] * array2[5] * array2[15] - array2[0] * array2[7] * array2[13] - array2[4] * array2[1] * array2[15] + array2[4] * array2[3] * array2[13] + array2[12] * array2[1] * array2[7] - array2[12] * array2[3] * array2[5];
        array[11] = -array2[0] * array2[5] * array2[11] + array2[0] * array2[7] * array2[9] + array2[4] * array2[1] * array2[11] - array2[4] * array2[3] * array2[9] - array2[8] * array2[1] * array2[7] + array2[8] * array2[3] * array2[5];
        array[12] = -array2[4] * array2[9] * array2[14] + array2[4] * array2[10] * array2[13] + array2[8] * array2[5] * array2[14] - array2[8] * array2[6] * array2[13] - array2[12] * array2[5] * array2[10] + array2[12] * array2[6] * array2[9];
        array[13] = array2[0] * array2[9] * array2[14] - array2[0] * array2[10] * array2[13] - array2[8] * array2[1] * array2[14] + array2[8] * array2[2] * array2[13] + array2[12] * array2[1] * array2[10] - array2[12] * array2[2] * array2[9];
        array[14] = -array2[0] * array2[5] * array2[14] + array2[0] * array2[6] * array2[13] + array2[4] * array2[1] * array2[14] - array2[4] * array2[2] * array2[13] - array2[12] * array2[1] * array2[6] + array2[12] * array2[2] * array2[5];
        array[15] = array2[0] * array2[5] * array2[10] - array2[0] * array2[6] * array2[9] - array2[4] * array2[1] * array2[10] + array2[4] * array2[2] * array2[9] + array2[8] * array2[1] * array2[6] - array2[8] * array2[2] * array2[5];
        final float n = array2[0] * array[0] + array2[1] * array[4] + array2[2] * array[8] + array2[3] * array[12];
        if (n != 0.0) {
            for (int i = 0; i < 16; ++i) {
                final int n2 = i;
                array[n2] /= n;
            }
        }
        else {
            Arrays.fill(array, 0.0f);
        }
    }
    
    static void llllIIIIlIIIlIlllIll(final FloatBuffer floatBuffer, final FloatBuffer floatBuffer2, final float[] array, final float[] array2) {
        floatBuffer2.get(array2);
        llllIIIIlIIIlIlllIll(array, array2);
        floatBuffer.put(array);
    }
}
