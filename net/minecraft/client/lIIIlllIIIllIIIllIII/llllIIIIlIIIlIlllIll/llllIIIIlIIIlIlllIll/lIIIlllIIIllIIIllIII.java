package net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll;

import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class lIIIlllIIIllIIIllIII extends llllIIIIlIIIlIlllIll
{
    private final IlIlIIIllIIllIlllllI IlIlIIIllIllIIIIIllI;
    private static volatile /* synthetic */ int[] IllIIlllIIIIlllIIlIl;
    
    public lIIIlllIIIllIIIllIII(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final IlIlIIIllIIllIlllllI ilIlIIIllIllIIIIIllI) {
        super(Arrays.copyOf(llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(), llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl().length), llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl()));
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IIlllIIlIllIllIlIIll();
        this.llllIIIlIlllIlIIIIIl();
    }
    
    private void IIlllIIlIllIllIlIIll() {
        for (int i = 0; i < 4; ++i) {
            this.llllIIIIlIIIlIlllIll(i);
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final int n) {
        final int n2 = this.llllIIIIlIIIlIlllIll.length / 4 * n;
        final float intBitsToFloat = Float.intBitsToFloat(this.llllIIIIlIIIlIlllIll[n2]);
        final float intBitsToFloat2 = Float.intBitsToFloat(this.llllIIIIlIIIlIlllIll[n2 + 1]);
        final float intBitsToFloat3 = Float.intBitsToFloat(this.llllIIIIlIIIlIlllIll[n2 + 2]);
        float n3 = 0.0f;
        float n4 = 0.0f;
        switch (IlIllIlIlIIIlIlIlIII()[this.llIllIIIIIllIlIIIIlI.ordinal()]) {
            case 1: {
                n3 = intBitsToFloat * 16.0f;
                n4 = (1.0f - intBitsToFloat3) * 16.0f;
                break;
            }
            case 2: {
                n3 = intBitsToFloat * 16.0f;
                n4 = intBitsToFloat3 * 16.0f;
                break;
            }
            case 3: {
                n3 = (1.0f - intBitsToFloat) * 16.0f;
                n4 = (1.0f - intBitsToFloat2) * 16.0f;
                break;
            }
            case 4: {
                n3 = intBitsToFloat * 16.0f;
                n4 = (1.0f - intBitsToFloat2) * 16.0f;
                break;
            }
            case 5: {
                n3 = intBitsToFloat3 * 16.0f;
                n4 = (1.0f - intBitsToFloat2) * 16.0f;
                break;
            }
            case 6: {
                n3 = (1.0f - intBitsToFloat3) * 16.0f;
                n4 = (1.0f - intBitsToFloat2) * 16.0f;
                break;
            }
        }
        this.llllIIIIlIIIlIlllIll[n2 + 4] = Float.floatToRawIntBits(this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll((double)n3));
        this.llllIIIIlIIIlIlllIll[n2 + 4 + 1] = Float.floatToRawIntBits(this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl((double)n4));
    }
    
    static /* synthetic */ int[] IlIllIlIlIIIlIlIlIII() {
        final int[] illIIlllIIIIlllIIlIl = lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl;
        if (illIIlllIIIIlllIIlIl != null) {
            return illIIlllIIIIlllIIlIl;
        }
        final int[] illIIlllIIIIlllIIlIl2 = new int[lllIllIIIllllllIllll.values().length];
        try {
            illIIlllIIIIlllIIlIl2[lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            illIIlllIIIIlllIIlIl2[lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            illIIlllIIIIlllIIlIl2[lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            illIIlllIIIIlllIIlIl2[lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            illIIlllIIIIlllIIlIl2[lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        try {
            illIIlllIIIIlllIIlIl2[lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError6) {}
        return lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl2;
    }
}
