package net.optifine.shaders;

import net.minecraft.client.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class llIllIIIIIllIlIIIIlI extends llllIIIIlIIIlIlllIll
{
    private static llIllIIIIIllIlIIIIlI llIllIlIIIIllIlIIllI;
    float[] IllIIlllIIIIlllIIlIl;
    float[][] llllIIIlIlllIlIIIIIl;
    int lIIIIlIIIIIlllIllIII;
    float[] lIIIlllIIIllIIIllIII;
    float[] llIIlIIIlIIIllIlIIIl;
    
    static {
        llIllIIIIIllIlIIIIlI.llIllIlIIIIllIlIIllI = new llIllIIIIIllIlIIIIlI();
    }
    
    public llIllIIIIIllIlIIIIlI() {
        this.IllIIlllIIIIlllIIlIl = new float[6];
        this.llllIIIlIlllIlIIIIIl = new float[10][4];
        this.lIIIlllIIIllIIIllIII = new float[16];
        this.llIIlIIIlIIIllIlIIIl = new float[4];
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        for (int i = 0; i < this.lIIIIlIIIIIlllIllIII; ++i) {
            final float[] array = this.llllIIIlIlllIlIIIIIl[i];
            if (this.llllIIIIlIIIlIlllIll(array, n, n2, n3) <= 0.0 && this.llllIIIIlIIIlIlllIll(array, n4, n2, n3) <= 0.0 && this.llllIIIIlIIIlIlllIll(array, n, n5, n3) <= 0.0 && this.llllIIIIlIIIlIlllIll(array, n4, n5, n3) <= 0.0 && this.llllIIIIlIIIlIlllIll(array, n, n2, n6) <= 0.0 && this.llllIIIIlIIIlIlllIll(array, n4, n2, n6) <= 0.0 && this.llllIIIIlIIIlIlllIll(array, n, n5, n6) <= 0.0 && this.llllIIIIlIIIlIlllIll(array, n4, n5, n6) <= 0.0) {
                return false;
            }
        }
        return true;
    }
    
    private double llllIIIIlIIIlIlllIll(final float[] array, final double n, final double n2, final double n3) {
        return array[0] * n + array[1] * n2 + array[2] * n3 + array[3];
    }
    
    private double llllIIIIlIIIlIlllIll(final float[] array, final float[] array2) {
        return array[0] * (double)array2[0] + array[1] * (double)array2[1] + array[2] * (double)array2[2];
    }
    
    public static llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll() {
        llIllIIIIIllIlIIIIlI.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl();
        return llIllIIIIIllIlIIIIlI.llIllIlIIIIllIlIIllI;
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
    
    private void IlIlIlIlIlllllllllIl(final float[] array) {
        float llIllIIIIIllIlIIIIlI = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(array[0] * array[0] + array[1] * array[1] + array[2] * array[2]);
        if (llIllIIIIIllIlIIIIlI == 0.0f) {
            llIllIIIIIllIlIIIIlI = 1.0f;
        }
        final int n = 0;
        array[n] /= llIllIIIIIllIlIIIIlI;
        final int n2 = 1;
        array[n2] /= llIllIIIIIllIlIIIIlI;
        final int n3 = 2;
        array[n3] /= llIllIIIIIllIlIIIIlI;
    }
    
    private void llllIIIIlIIIlIlllIll(final float[] array, final float n, final float n2, final float n3, final float n4) {
        final float n5 = (float)Math.sqrt(n * n + n2 * n2 + n3 * n3);
        array[0] = n / n5;
        array[1] = n2 / n5;
        array[2] = n3 / n5;
        array[3] = n4 / n5;
    }
    
    private void IlIlIlIlIlllllllllIl(final float[] array, final float[] array2) {
        array[0] = array2[0];
        array[1] = array2[1];
        array[2] = array2[2];
        array[3] = array2[3];
    }
    
    private void llllIIIIlIIIlIlllIll(final float[] array, final float[] array2, final float[] array3) {
        array[0] = array2[1] * array3[2] - array2[2] * array3[1];
        array[1] = array2[2] * array3[0] - array2[0] * array3[2];
        array[2] = array2[0] * array3[1] - array2[1] * array3[0];
    }
    
    private void llIllIIIIIllIlIIIIlI(final float[] array) {
        this.IlIlIlIlIlllllllllIl(this.llllIIIlIlllIlIIIIIl[this.lIIIIlIIIIIlllIllIII++], array);
    }
    
    private float llllIIIIlIIIlIlllIll(final float n, final float n2, final float n3) {
        return (float)Math.sqrt(n * n + n2 * n2 + n3 * n3);
    }
    
    private float llllIIIIlIIIlIlllIll(final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        return this.llllIIIIlIIIlIlllIll(n - n4, n2 - n5, n3 - n6);
    }
    
    private void llllIIIIlIIIlIlllIll(final float[] array, final float[] array2, final float[] array3, final float[] array4) {
        this.llllIIIIlIIIlIlllIll(this.llIIlIIIlIIIllIlIIIl, array2, array3);
        this.llllIIIIlIIIlIlllIll(array, this.llIIlIIIlIIIllIlIIIl, array4);
        this.IlIlIlIlIlllllllllIl(array);
        final float n = (float)this.llllIIIIlIIIlIlllIll(array2, array3);
        final float n2 = (float)this.llllIIIIlIIIlIlllIll(array, array3);
        final float n3 = this.llllIIIIlIIIlIlllIll(array[0], array[1], array[2], array3[0] * n2, array3[1] * n2, array3[2] * n2) / this.llllIIIIlIIIlIlllIll(array2[0], array2[1], array2[2], array3[0] * n, array3[1] * n, array3[2] * n);
        final float n4 = (float)this.llllIIIIlIIIlIlllIll(array, array2);
        array[3] = array2[3] * n3 + array3[3] * (this.llllIIIIlIIIlIlllIll(array[0], array[1], array[2], array2[0] * n4, array2[1] * n4, array2[2] * n4) / this.llllIIIIlIIIlIlllIll(array3[0], array3[1], array3[2], array2[0] * n, array2[1] * n, array2[2] * n));
    }
    
    public void IlIlIlIlIlllllllllIl() {
        final float[] ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl;
        final float[] llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI;
        final float[] ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl;
        System.arraycopy(llIIlllIIlllIIllIllI.do, 0, ilIlIlIlIlllllllllIl, 0, 16);
        System.arraycopy(llIIlllIIlllIIllIllI.dq, 0, llIllIIIIIllIlIIIIlI, 0, 16);
        IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, llIllIIIIIllIlIIIIlI, ilIlIlIlIlllllllllIl);
        this.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll[0], ilIIIlIlIIIllIlIlIIl[3] - ilIIIlIlIIIllIlIlIIl[0], ilIIIlIlIIIllIlIlIIl[7] - ilIIIlIlIIIllIlIlIIl[4], ilIIIlIlIIIllIlIlIIl[11] - ilIIIlIlIIIllIlIlIIl[8], ilIIIlIlIIIllIlIlIIl[15] - ilIIIlIlIIIllIlIlIIl[12]);
        this.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll[1], ilIIIlIlIIIllIlIlIIl[3] + ilIIIlIlIIIllIlIlIIl[0], ilIIIlIlIIIllIlIlIIl[7] + ilIIIlIlIIIllIlIlIIl[4], ilIIIlIlIIIllIlIlIIl[11] + ilIIIlIlIIIllIlIlIIl[8], ilIIIlIlIIIllIlIlIIl[15] + ilIIIlIlIIIllIlIlIIl[12]);
        this.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll[2], ilIIIlIlIIIllIlIlIIl[3] + ilIIIlIlIIIllIlIlIIl[1], ilIIIlIlIIIllIlIlIIl[7] + ilIIIlIlIIIllIlIlIIl[5], ilIIIlIlIIIllIlIlIIl[11] + ilIIIlIlIIIllIlIlIIl[9], ilIIIlIlIIIllIlIlIIl[15] + ilIIIlIlIIIllIlIlIIl[13]);
        this.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll[3], ilIIIlIlIIIllIlIlIIl[3] - ilIIIlIlIIIllIlIlIIl[1], ilIIIlIlIIIllIlIlIIl[7] - ilIIIlIlIIIllIlIlIIl[5], ilIIIlIlIIIllIlIlIIl[11] - ilIIIlIlIIIllIlIlIIl[9], ilIIIlIlIIIllIlIlIIl[15] - ilIIIlIlIIIllIlIlIIl[13]);
        this.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll[4], ilIIIlIlIIIllIlIlIIl[3] - ilIIIlIlIIIllIlIlIIl[2], ilIIIlIlIIIllIlIlIIl[7] - ilIIIlIlIIIllIlIlIIl[6], ilIIIlIlIIIllIlIlIIl[11] - ilIIIlIlIIIllIlIlIIl[10], ilIIIlIlIIIllIlIlIIl[15] - ilIIIlIlIIIllIlIlIIl[14]);
        this.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll[5], ilIIIlIlIIIllIlIlIIl[3] + ilIIIlIlIIIllIlIlIIl[2], ilIIIlIlIIIllIlIlIIl[7] + ilIIIlIlIIIllIlIlIIl[6], ilIIIlIlIIIllIlIlIIl[11] + ilIIIlIlIIIllIlIlIIl[10], ilIIIlIlIIIllIlIlIIl[15] + ilIIIlIlIIIllIlIlIIl[14]);
        final float[] iIlllIlIIllIlIlIlIIl = llIIlllIIlllIIllIllI.IIlllIlIIllIlIlIlIIl;
        final float n = (float)this.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll[0], iIlllIlIIllIlIlIlIIl);
        final float n2 = (float)this.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll[1], iIlllIlIIllIlIlIlIIl);
        final float n3 = (float)this.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll[2], iIlllIlIIllIlIlIlIIl);
        final float n4 = (float)this.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll[3], iIlllIlIIllIlIlIlIIl);
        final float n5 = (float)this.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll[4], iIlllIlIIllIlIlIlIIl);
        final float n6 = (float)this.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll[5], iIlllIlIIllIlIlIlIIl);
        this.lIIIIlIIIIIlllIllIII = 0;
        if (n >= 0.0f) {
            this.IlIlIlIlIlllllllllIl(this.llllIIIlIlllIlIIIIIl[this.lIIIIlIIIIIlllIllIII++], this.llllIIIIlIIIlIlllIll[0]);
            if (n > 0.0f) {
                if (n3 < 0.0f) {
                    this.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl[this.lIIIIlIIIIIlllIllIII++], this.llllIIIIlIIIlIlllIll[0], this.llllIIIIlIIIlIlllIll[2], iIlllIlIIllIlIlIlIIl);
                }
                if (n4 < 0.0f) {
                    this.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl[this.lIIIIlIIIIIlllIllIII++], this.llllIIIIlIIIlIlllIll[0], this.llllIIIIlIIIlIlllIll[3], iIlllIlIIllIlIlIlIIl);
                }
                if (n5 < 0.0f) {
                    this.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl[this.lIIIIlIIIIIlllIllIII++], this.llllIIIIlIIIlIlllIll[0], this.llllIIIIlIIIlIlllIll[4], iIlllIlIIllIlIlIlIIl);
                }
                if (n6 < 0.0f) {
                    this.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl[this.lIIIIlIIIIIlllIllIII++], this.llllIIIIlIIIlIlllIll[0], this.llllIIIIlIIIlIlllIll[5], iIlllIlIIllIlIlIlIIl);
                }
            }
        }
        if (n2 >= 0.0f) {
            this.IlIlIlIlIlllllllllIl(this.llllIIIlIlllIlIIIIIl[this.lIIIIlIIIIIlllIllIII++], this.llllIIIIlIIIlIlllIll[1]);
            if (n2 > 0.0f) {
                if (n3 < 0.0f) {
                    this.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl[this.lIIIIlIIIIIlllIllIII++], this.llllIIIIlIIIlIlllIll[1], this.llllIIIIlIIIlIlllIll[2], iIlllIlIIllIlIlIlIIl);
                }
                if (n4 < 0.0f) {
                    this.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl[this.lIIIIlIIIIIlllIllIII++], this.llllIIIIlIIIlIlllIll[1], this.llllIIIIlIIIlIlllIll[3], iIlllIlIIllIlIlIlIIl);
                }
                if (n5 < 0.0f) {
                    this.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl[this.lIIIIlIIIIIlllIllIII++], this.llllIIIIlIIIlIlllIll[1], this.llllIIIIlIIIlIlllIll[4], iIlllIlIIllIlIlIlIIl);
                }
                if (n6 < 0.0f) {
                    this.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl[this.lIIIIlIIIIIlllIllIII++], this.llllIIIIlIIIlIlllIll[1], this.llllIIIIlIIIlIlllIll[5], iIlllIlIIllIlIlIlIIl);
                }
            }
        }
        if (n3 >= 0.0f) {
            this.IlIlIlIlIlllllllllIl(this.llllIIIlIlllIlIIIIIl[this.lIIIIlIIIIIlllIllIII++], this.llllIIIIlIIIlIlllIll[2]);
            if (n3 > 0.0f) {
                if (n < 0.0f) {
                    this.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl[this.lIIIIlIIIIIlllIllIII++], this.llllIIIIlIIIlIlllIll[2], this.llllIIIIlIIIlIlllIll[0], iIlllIlIIllIlIlIlIIl);
                }
                if (n2 < 0.0f) {
                    this.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl[this.lIIIIlIIIIIlllIllIII++], this.llllIIIIlIIIlIlllIll[2], this.llllIIIIlIIIlIlllIll[1], iIlllIlIIllIlIlIlIIl);
                }
                if (n5 < 0.0f) {
                    this.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl[this.lIIIIlIIIIIlllIllIII++], this.llllIIIIlIIIlIlllIll[2], this.llllIIIIlIIIlIlllIll[4], iIlllIlIIllIlIlIlIIl);
                }
                if (n6 < 0.0f) {
                    this.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl[this.lIIIIlIIIIIlllIllIII++], this.llllIIIIlIIIlIlllIll[2], this.llllIIIIlIIIlIlllIll[5], iIlllIlIIllIlIlIlIIl);
                }
            }
        }
        if (n4 >= 0.0f) {
            this.IlIlIlIlIlllllllllIl(this.llllIIIlIlllIlIIIIIl[this.lIIIIlIIIIIlllIllIII++], this.llllIIIIlIIIlIlllIll[3]);
            if (n4 > 0.0f) {
                if (n < 0.0f) {
                    this.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl[this.lIIIIlIIIIIlllIllIII++], this.llllIIIIlIIIlIlllIll[3], this.llllIIIIlIIIlIlllIll[0], iIlllIlIIllIlIlIlIIl);
                }
                if (n2 < 0.0f) {
                    this.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl[this.lIIIIlIIIIIlllIllIII++], this.llllIIIIlIIIlIlllIll[3], this.llllIIIIlIIIlIlllIll[1], iIlllIlIIllIlIlIlIIl);
                }
                if (n5 < 0.0f) {
                    this.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl[this.lIIIIlIIIIIlllIllIII++], this.llllIIIIlIIIlIlllIll[3], this.llllIIIIlIIIlIlllIll[4], iIlllIlIIllIlIlIlIIl);
                }
                if (n6 < 0.0f) {
                    this.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl[this.lIIIIlIIIIIlllIllIII++], this.llllIIIIlIIIlIlllIll[3], this.llllIIIIlIIIlIlllIll[5], iIlllIlIIllIlIlIlIIl);
                }
            }
        }
        if (n5 >= 0.0f) {
            this.IlIlIlIlIlllllllllIl(this.llllIIIlIlllIlIIIIIl[this.lIIIIlIIIIIlllIllIII++], this.llllIIIIlIIIlIlllIll[4]);
            if (n5 > 0.0f) {
                if (n < 0.0f) {
                    this.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl[this.lIIIIlIIIIIlllIllIII++], this.llllIIIIlIIIlIlllIll[4], this.llllIIIIlIIIlIlllIll[0], iIlllIlIIllIlIlIlIIl);
                }
                if (n2 < 0.0f) {
                    this.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl[this.lIIIIlIIIIIlllIllIII++], this.llllIIIIlIIIlIlllIll[4], this.llllIIIIlIIIlIlllIll[1], iIlllIlIIllIlIlIlIIl);
                }
                if (n3 < 0.0f) {
                    this.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl[this.lIIIIlIIIIIlllIllIII++], this.llllIIIIlIIIlIlllIll[4], this.llllIIIIlIIIlIlllIll[2], iIlllIlIIllIlIlIlIIl);
                }
                if (n4 < 0.0f) {
                    this.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl[this.lIIIIlIIIIIlllIllIII++], this.llllIIIIlIIIlIlllIll[4], this.llllIIIIlIIIlIlllIll[3], iIlllIlIIllIlIlIlIIl);
                }
            }
        }
        if (n6 >= 0.0f) {
            this.IlIlIlIlIlllllllllIl(this.llllIIIlIlllIlIIIIIl[this.lIIIIlIIIIIlllIllIII++], this.llllIIIIlIIIlIlllIll[5]);
            if (n6 > 0.0f) {
                if (n < 0.0f) {
                    this.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl[this.lIIIIlIIIIIlllIllIII++], this.llllIIIIlIIIlIlllIll[5], this.llllIIIIlIIIlIlllIll[0], iIlllIlIIllIlIlIlIIl);
                }
                if (n2 < 0.0f) {
                    this.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl[this.lIIIIlIIIIIlllIllIII++], this.llllIIIIlIIIlIlllIll[5], this.llllIIIIlIIIlIlllIll[1], iIlllIlIIllIlIlIlIIl);
                }
                if (n3 < 0.0f) {
                    this.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl[this.lIIIIlIIIIIlllIllIII++], this.llllIIIIlIIIlIlllIll[5], this.llllIIIIlIIIlIlllIll[2], iIlllIlIIllIlIlIlIIl);
                }
                if (n4 < 0.0f) {
                    this.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl[this.lIIIIlIIIIIlllIllIII++], this.llllIIIIlIIIlIlllIll[5], this.llllIIIIlIIIlIlllIll[3], iIlllIlIIllIlIlIlIIl);
                }
            }
        }
    }
}
