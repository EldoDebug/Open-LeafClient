package net.optifine.IlIlIIIllIllIIIIIllI;

import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IllIIlllIIIIlllIIlIl
{
    private float llllIIIIlIIIlIlllIll;
    private float IlIlIlIlIlllllllllIl;
    private float llIllIIIIIllIlIIIIlI;
    private float IlIIIlIlIIIllIlIlIIl;
    private float IlIlIIIllIllIIIIIllI;
    private float IllIIlllIIIIlllIIlIl;
    private static volatile /* synthetic */ int[] llllIIIlIlllIlIIIIIl;
    
    public IllIIlllIIIIlllIIlIl(final int[] array) {
        this.llllIIIIlIIIlIlllIll = Float.MAX_VALUE;
        this.IlIlIlIlIlllllllllIl = Float.MAX_VALUE;
        this.llIllIIIIIllIlIIIIlI = Float.MAX_VALUE;
        this.IlIIIlIlIIIllIlIlIIl = -3.4028235E38f;
        this.IlIlIIIllIllIIIIIllI = -3.4028235E38f;
        this.IllIIlllIIIIlllIIlIl = -3.4028235E38f;
        final int n = array.length / 4;
        for (int i = 0; i < 4; ++i) {
            final int n2 = i * n;
            final float intBitsToFloat = Float.intBitsToFloat(array[n2 + 0]);
            final float intBitsToFloat2 = Float.intBitsToFloat(array[n2 + 1]);
            final float intBitsToFloat3 = Float.intBitsToFloat(array[n2 + 2]);
            if (this.llllIIIIlIIIlIlllIll > intBitsToFloat) {
                this.llllIIIIlIIIlIlllIll = intBitsToFloat;
            }
            if (this.IlIlIlIlIlllllllllIl > intBitsToFloat2) {
                this.IlIlIlIlIlllllllllIl = intBitsToFloat2;
            }
            if (this.llIllIIIIIllIlIIIIlI > intBitsToFloat3) {
                this.llIllIIIIIllIlIIIIlI = intBitsToFloat3;
            }
            if (this.IlIIIlIlIIIllIlIlIIl < intBitsToFloat) {
                this.IlIIIlIlIIIllIlIlIIl = intBitsToFloat;
            }
            if (this.IlIlIIIllIllIIIIIllI < intBitsToFloat2) {
                this.IlIlIIIllIllIIIIIllI = intBitsToFloat2;
            }
            if (this.IllIIlllIIIIlllIIlIl < intBitsToFloat3) {
                this.IllIIlllIIIIlllIIlIl = intBitsToFloat3;
            }
        }
    }
    
    public float llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public float IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public float llIllIIIIIllIlIIIIlI() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public float IlIIIlIlIIIllIlIlIIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public float IlIlIIIllIllIIIIIllI() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public float IllIIlllIIIIlllIIlIl() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        float n = 0.0f;
        float n2 = 0.0f;
        float n3 = 0.0f;
        switch (llllIIIlIlllIlIIIIIl()[lllIllIIIllllllIllll.ordinal()]) {
            case 1: {
                n = this.IlIlIlIlIlllllllllIl();
                n2 = this.IlIlIIIllIllIIIIIllI();
                n3 = 0.0f;
                break;
            }
            case 2: {
                n = this.IlIlIlIlIlllllllllIl();
                n2 = this.IlIlIIIllIllIIIIIllI();
                n3 = 1.0f;
                break;
            }
            case 3: {
                n = this.llIllIIIIIllIlIIIIlI();
                n2 = this.IllIIlllIIIIlllIIlIl();
                n3 = 0.0f;
                break;
            }
            case 4: {
                n = this.llIllIIIIIllIlIIIIlI();
                n2 = this.IllIIlllIIIIlllIIlIl();
                n3 = 1.0f;
                break;
            }
            case 5: {
                n = this.llllIIIIlIIIlIlllIll();
                n2 = this.IlIIIlIlIIIllIlIlIIl();
                n3 = 0.0f;
                break;
            }
            case 6: {
                n = this.llllIIIIlIIIlIlllIll();
                n2 = this.IlIIIlIlIIIllIlIlIIl();
                n3 = 1.0f;
                break;
            }
            default: {
                return false;
            }
        }
        return n == n3 && n2 == n3;
    }
    
    public boolean IlIlIlIlIlllllllllIl(final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        float n = 0.0f;
        float n2 = 0.0f;
        float n3 = 0.0f;
        float n4 = 0.0f;
        switch (llllIIIlIlllIlIIIIIl()[lllIllIIIllllllIllll.ordinal()]) {
            case 1:
            case 2: {
                n = this.llllIIIIlIIIlIlllIll();
                n2 = this.IlIIIlIlIIIllIlIlIIl();
                n3 = this.llIllIIIIIllIlIIIIlI();
                n4 = this.IllIIlllIIIIlllIIlIl();
                break;
            }
            case 3:
            case 4: {
                n = this.llllIIIIlIIIlIlllIll();
                n2 = this.IlIIIlIlIIIllIlIlIIl();
                n3 = this.IlIlIlIlIlllllllllIl();
                n4 = this.IlIlIIIllIllIIIIIllI();
                break;
            }
            case 5:
            case 6: {
                n = this.IlIlIlIlIlllllllllIl();
                n2 = this.IlIlIIIllIllIIIIIllI();
                n3 = this.llIllIIIIIllIlIIIIlI();
                n4 = this.IllIIlllIIIIlllIIlIl();
                break;
            }
            default: {
                return false;
            }
        }
        return n == 0.0f && n2 == 1.0f && n3 == 0.0f && n4 == 1.0f;
    }
    
    static /* synthetic */ int[] llllIIIlIlllIlIIIIIl() {
        final int[] llllIIIlIlllIlIIIIIl = IllIIlllIIIIlllIIlIl.llllIIIlIlllIlIIIIIl;
        if (llllIIIlIlllIlIIIIIl != null) {
            return llllIIIlIlllIlIIIIIl;
        }
        final int[] llllIIIlIlllIlIIIIIl2 = new int[lllIllIIIllllllIllll.values().length];
        try {
            llllIIIlIlllIlIIIIIl2[lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            llllIIIlIlllIlIIIIIl2[lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            llllIIIlIlllIlIIIIIl2[lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            llllIIIlIlllIlIIIIIl2[lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            llllIIIlIlllIlIIIIIl2[lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        try {
            llllIIIlIlllIlIIIIIl2[lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError6) {}
        return IllIIlllIIIIlllIIlIl.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl2;
    }
}
