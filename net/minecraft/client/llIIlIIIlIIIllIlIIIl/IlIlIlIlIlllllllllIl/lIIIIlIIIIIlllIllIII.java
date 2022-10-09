package net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl;

import net.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import java.util.*;
import com.google.common.collect.*;
import org.lwjgl.util.vector.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import com.google.common.base.*;
import javax.llllIIIIlIIIlIlllIll.*;

public enum lIIIIlIIIIIlllIllIII implements IlIIIlIlIIIllIlIlIIl, IlIlIlIlIlllllllllIl
{
    llllIIIIlIIIlIlllIll("X0_Y0", 0, 0, 0), 
    IlIlIlIlIlllllllllIl("X0_Y90", 1, 0, 90), 
    llIllIIIIIllIlIIIIlI("X0_Y180", 2, 0, 180), 
    IlIIIlIlIIIllIlIlIIl("X0_Y270", 3, 0, 270), 
    IlIlIIIllIllIIIIIllI("X90_Y0", 4, 90, 0), 
    IllIIlllIIIIlllIIlIl("X90_Y90", 5, 90, 90), 
    llllIIIlIlllIlIIIIIl("X90_Y180", 6, 90, 180), 
    lIIIIlIIIIIlllIllIII("X90_Y270", 7, 90, 270), 
    lIIIlllIIIllIIIllIII("X180_Y0", 8, 180, 0), 
    llIIlIIIlIIIllIlIIIl("X180_Y90", 9, 180, 90), 
    llIllIlIIIIllIlIIllI("X180_Y180", 10, 180, 180), 
    lIlIlIIIllIIllIIIllI("X180_Y270", 11, 180, 270), 
    IlIlIIIllIIllIlllllI("X270_Y0", 12, 270, 0), 
    IIIIlllIIIIIIlIIIlll("X270_Y90", 13, 270, 90), 
    llllIIllllIlIlIIIIll("X270_Y180", 14, 270, 180), 
    IlIllIlIlIIIlIlIlIII("X270_Y270", 15, 270, 270);
    
    private static final Map IIlllIIlIllIllIlIIll;
    private final int lllIIIIlllllIlIIllIl;
    private final Matrix4f IlIlIIIIIIlllIlIllIl;
    private final int IIllIIllIIIlIlIIIIlI;
    private final int IIIlIIIlIlIIlllIIlll;
    
    static {
        IlIlIIIlIIlIlIIlllIl = new lIIIIlIIIIIlllIllIII[] { lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll, lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl, lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI, lIIIIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl, lIIIIlIIIIIlllIllIII.IlIlIIIllIllIIIIIllI, lIIIIlIIIIIlllIllIII.IllIIlllIIIIlllIIlIl, lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl, lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII, lIIIIlIIIIIlllIllIII.lIIIlllIIIllIIIllIII, lIIIIlIIIIIlllIllIII.llIIlIIIlIIIllIlIIIl, lIIIIlIIIIIlllIllIII.llIllIlIIIIllIlIIllI, lIIIIlIIIIIlllIllIII.lIlIlIIIllIIllIIIllI, lIIIIlIIIIIlllIllIII.IlIlIIIllIIllIlllllI, lIIIIlIIIIIlllIllIII.IIIIlllIIIIIIlIIIlll, lIIIIlIIIIIlllIllIII.llllIIllllIlIlIIIIll, lIIIIlIIIIIlllIllIII.IlIllIlIlIIIlIlIlIII };
        IIlllIIlIllIllIlIIll = Maps.newHashMap();
        lIIIIlIIIIIlllIllIII[] values;
        for (int length = (values = values()).length, i = 0; i < length; ++i) {
            final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII = values[i];
            lIIIIlIIIIIlllIllIII.IIlllIIlIllIllIlIIll.put(liiiIlIIIIIlllIllIII.lllIIIIlllllIlIIllIl, liiiIlIIIIIlllIllIII);
        }
    }
    
    private static int IlIlIlIlIlllllllllIl(final int n, final int n2) {
        return n * 360 + n2;
    }
    
    private lIIIIlIIIIIlllIllIII(final String s, final int n, final int n2, final int n3) {
        this.lllIIIIlllllIlIIllIl = IlIlIlIlIlllllllllIl(n2, n3);
        this.IlIlIIIIIIlllIlIllIl = new Matrix4f();
        final Matrix4f matrix4f = new Matrix4f();
        matrix4f.setIdentity();
        Matrix4f.rotate(-n2 * 0.017453292f, new Vector3f(1.0f, 0.0f, 0.0f), matrix4f, matrix4f);
        this.IIllIIllIIIlIlIIIIlI = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n2 / 90);
        final Matrix4f matrix4f2 = new Matrix4f();
        matrix4f2.setIdentity();
        Matrix4f.rotate(-n3 * 0.017453292f, new Vector3f(0.0f, 1.0f, 0.0f), matrix4f2, matrix4f2);
        this.IIIlIIIlIlIIlllIIlll = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n3 / 90);
        Matrix4f.mul(matrix4f2, matrix4f, this.IlIlIIIIIIlllIlIllIl);
    }
    
    public Matrix4f llllIIIIlIIIlIlllIll() {
        return this.IlIlIIIIIIlllIlIllIl;
    }
    
    public lllIllIIIllllllIllll llllIIIIlIIIlIlllIll(final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        lllIllIIIllllllIllll lllIllIIIllllllIllll2 = lllIllIIIllllllIllll;
        for (int i = 0; i < this.IIllIIllIIIlIlIIIIlI; ++i) {
            lllIllIIIllllllIllll2 = lllIllIIIllllllIllll2.llllIIIIlIIIlIlllIll(llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll);
        }
        if (lllIllIIIllllllIllll2.lIlIlIIIllIIllIIIllI() != llIllIlIlIIIIIIIllII.IlIlIlIlIlllllllllIl) {
            for (int j = 0; j < this.IIIlIIIlIlIIlllIIlll; ++j) {
                lllIllIIIllllllIllll2 = lllIllIIIllllllIllll2.llllIIIIlIIIlIlllIll(llIllIlIlIIIIIIIllII.IlIlIlIlIlllllllllIl);
            }
        }
        return lllIllIIIllllllIllll2;
    }
    
    public int llllIIIIlIIIlIlllIll(final lllIllIIIllllllIllll lllIllIIIllllllIllll, final int n) {
        int n2 = n;
        if (lllIllIIIllllllIllll.lIlIlIIIllIIllIIIllI() == llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll) {
            n2 = (n + this.IIllIIllIIIlIlIIIIlI) % 4;
        }
        lllIllIIIllllllIllll llllIIIIlIIIlIlllIll = lllIllIIIllllllIllll;
        for (int i = 0; i < this.IIllIIllIIIlIlIIIIlI; ++i) {
            llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll);
        }
        if (llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI() == llIllIlIlIIIIIIIllII.IlIlIlIlIlllllllllIl) {
            n2 = (n2 + this.IIIlIIIlIlIIlllIIlll) % 4;
        }
        return n2;
    }
    
    public static lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll(final int n, final int n2) {
        return lIIIIlIIIIIlllIllIII.IIlllIIlIllIllIlIIll.get(IlIlIlIlIlllllllllIl(llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n, 360), llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n2, 360)));
    }
    
    @Override
    public Optional llllIIIIlIIIlIlllIll(final Optional optional) {
        return (Optional)net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl(net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.lIllllIllIllIIllllll, this.IlIlIlIlIlllllllllIl(), optional);
    }
    
    @Override
    public lIlIlIIIllIIllIIIllI IlIlIlIlIlllllllllIl() {
        return (lIlIlIIIllIIllIIIllI)(net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIlIllllIIlIIlIlI.llIllIIIIIllIlIIIIlI() ? net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl(net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIlIllllIIlIIlIlI, this) : new lIlIlIIIllIIllIIIllI());
    }
    
    @Override
    public lllIllIIIllllllIllll IlIlIlIlIlllllllllIl(final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        return this.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll);
    }
    
    @Override
    public int IlIlIlIlIlllllllllIl(final lllIllIIIllllllIllll lllIllIIIllllllIllll, final int n) {
        return this.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll, n);
    }
}
