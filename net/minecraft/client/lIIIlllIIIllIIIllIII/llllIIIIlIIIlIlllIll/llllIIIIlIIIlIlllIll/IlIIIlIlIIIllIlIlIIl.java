package net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll;

import org.lwjgl.util.vector.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

public class IlIIIlIlIIIllIlIlIIl
{
    public final Vector3f llllIIIIlIIIlIlllIll;
    public final Vector3f IlIlIlIlIlllllllllIl;
    public final Map llIllIIIIIllIlIIIIlI;
    public final lIIIIlIIIIIlllIllIII IlIIIlIlIIIllIlIlIIl;
    public final boolean IlIlIIIllIllIIIIIllI;
    private static volatile /* synthetic */ int[] IllIIlllIIIIlllIIlIl;
    
    public IlIIIlIlIIIllIlIlIIl(final Vector3f llllIIIIlIIIlIlllIll, final Vector3f ilIlIlIlIlllllllllIl, final Map llIllIIIIIllIlIIIIlI, final lIIIIlIIIIIlllIllIII ilIIIlIlIIIllIlIlIIl, final boolean ilIlIIIllIllIIIIIllI) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IlIlIlIlIlllllllllIl();
    }
    
    private void IlIlIlIlIlllllllllIl() {
        for (final Map.Entry<lllIllIIIllllllIllll, V> entry : this.llIllIIIIIllIlIIIIlI.entrySet()) {
            ((IllIIlllIIIIlllIIlIl)entry.getValue()).IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll(entry.getKey()));
        }
    }
    
    private float[] llllIIIIlIIIlIlllIll(final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        float[] array = null;
        switch (llllIIIIlIIIlIlllIll()[lllIllIIIllllllIllll.ordinal()]) {
            case 1:
            case 2: {
                array = new float[] { this.llllIIIIlIIIlIlllIll.x, this.llllIIIIlIIIlIlllIll.z, this.IlIlIlIlIlllllllllIl.x, this.IlIlIlIlIlllllllllIl.z };
                break;
            }
            case 3:
            case 4: {
                array = new float[] { this.llllIIIIlIIIlIlllIll.x, 16.0f - this.IlIlIlIlIlllllllllIl.y, this.IlIlIlIlIlllllllllIl.x, 16.0f - this.llllIIIIlIIIlIlllIll.y };
                break;
            }
            case 5:
            case 6: {
                array = new float[] { this.llllIIIIlIIIlIlllIll.z, 16.0f - this.IlIlIlIlIlllllllllIl.y, this.IlIlIlIlIlllllllllIl.z, 16.0f - this.llllIIIIlIIIlIlllIll.y };
                break;
            }
            default: {
                throw new NullPointerException();
            }
        }
        return array;
    }
    
    static /* synthetic */ int[] llllIIIIlIIIlIlllIll() {
        final int[] illIIlllIIIIlllIIlIl = IlIIIlIlIIIllIlIlIIl.IllIIlllIIIIlllIIlIl;
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
        return IlIIIlIlIIIllIlIlIIl.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl2;
    }
}
