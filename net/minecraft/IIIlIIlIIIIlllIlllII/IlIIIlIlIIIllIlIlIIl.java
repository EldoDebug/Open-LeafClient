package net.minecraft.IIIlIIlIIIIlllIlllII;

public class IlIIIlIlIIIllIlIlIIl
{
    private static int[] llllIIIIlIIIlIlllIll;
    
    static {
        IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll = new int[65536];
    }
    
    public static void llllIIIIlIIIlIlllIll(final int[] llllIIIIlIIIlIlllIll) {
        IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public static int llllIIIIlIIIlIlllIll(final double n, double n2) {
        n2 *= n;
        final int n3 = (int)((1.0 - n2) * 255.0) << 8 | (int)((1.0 - n) * 255.0);
        return (n3 > IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.length) ? -65281 : IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll[n3];
    }
}
