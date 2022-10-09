package net.minecraft.client.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI;

public class llllIIIIlIIIlIlllIll
{
    public float[][] llllIIIIlIIIlIlllIll;
    public float[] IlIlIlIlIlllllllllIl;
    public float[] llIllIIIIIllIlIIIIlI;
    public float[] IlIIIlIlIIIllIlIlIIl;
    public boolean IlIlIIIllIllIIIIIllI;
    
    public llllIIIIlIIIlIlllIll() {
        this.llllIIIIlIIIlIlllIll = new float[6][4];
        this.IlIlIlIlIlllllllllIl = new float[16];
        this.llIllIIIIIllIlIIIIlI = new float[16];
        this.IlIIIlIlIIIllIlIlIIl = new float[16];
        this.IlIlIIIllIllIIIIIllI = false;
    }
    
    private float llllIIIIlIIIlIlllIll(final float[] array, final float n, final float n2, final float n3) {
        return array[0] * n + array[1] * n2 + array[2] * n3 + array[3];
    }
    
    public boolean llllIIIIlIIIlIlllIll(final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        if (this.IlIlIIIllIllIIIIIllI) {
            return true;
        }
        final float n7 = (float)n;
        final float n8 = (float)n2;
        final float n9 = (float)n3;
        final float n10 = (float)n4;
        final float n11 = (float)n5;
        final float n12 = (float)n6;
        for (int i = 0; i < 6; ++i) {
            final float[] array = this.llllIIIIlIIIlIlllIll[i];
            final float n13 = array[0];
            final float n14 = array[1];
            final float n15 = array[2];
            final float n16 = array[3];
            if (n13 * n7 + n14 * n8 + n15 * n9 + n16 <= 0.0f && n13 * n10 + n14 * n8 + n15 * n9 + n16 <= 0.0f && n13 * n7 + n14 * n11 + n15 * n9 + n16 <= 0.0f && n13 * n10 + n14 * n11 + n15 * n9 + n16 <= 0.0f && n13 * n7 + n14 * n8 + n15 * n12 + n16 <= 0.0f && n13 * n10 + n14 * n8 + n15 * n12 + n16 <= 0.0f && n13 * n7 + n14 * n11 + n15 * n12 + n16 <= 0.0f && n13 * n10 + n14 * n11 + n15 * n12 + n16 <= 0.0f) {
                return false;
            }
        }
        return true;
    }
    
    public boolean IlIlIlIlIlllllllllIl(final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        if (this.IlIlIIIllIllIIIIIllI) {
            return true;
        }
        final float n7 = (float)n;
        final float n8 = (float)n2;
        final float n9 = (float)n3;
        final float n10 = (float)n4;
        final float n11 = (float)n5;
        final float n12 = (float)n6;
        for (int i = 0; i < 6; ++i) {
            final float[] array = this.llllIIIIlIIIlIlllIll[i];
            final float n13 = array[0];
            final float n14 = array[1];
            final float n15 = array[2];
            final float n16 = array[3];
            if (i < 4) {
                if (n13 * n7 + n14 * n8 + n15 * n9 + n16 <= 0.0f || n13 * n10 + n14 * n8 + n15 * n9 + n16 <= 0.0f || n13 * n7 + n14 * n11 + n15 * n9 + n16 <= 0.0f || n13 * n10 + n14 * n11 + n15 * n9 + n16 <= 0.0f || n13 * n7 + n14 * n8 + n15 * n12 + n16 <= 0.0f || n13 * n10 + n14 * n8 + n15 * n12 + n16 <= 0.0f || n13 * n7 + n14 * n11 + n15 * n12 + n16 <= 0.0f || n13 * n10 + n14 * n11 + n15 * n12 + n16 <= 0.0f) {
                    return false;
                }
            }
            else if (n13 * n7 + n14 * n8 + n15 * n9 + n16 <= 0.0f && n13 * n10 + n14 * n8 + n15 * n9 + n16 <= 0.0f && n13 * n7 + n14 * n11 + n15 * n9 + n16 <= 0.0f && n13 * n10 + n14 * n11 + n15 * n9 + n16 <= 0.0f && n13 * n7 + n14 * n8 + n15 * n12 + n16 <= 0.0f && n13 * n10 + n14 * n8 + n15 * n12 + n16 <= 0.0f && n13 * n7 + n14 * n11 + n15 * n12 + n16 <= 0.0f && n13 * n10 + n14 * n11 + n15 * n12 + n16 <= 0.0f) {
                return false;
            }
        }
        return true;
    }
}
