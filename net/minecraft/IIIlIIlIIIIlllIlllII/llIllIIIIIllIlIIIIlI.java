package net.minecraft.IIIlIIlIIIIlllIlllII;

public class llIllIIIIIllIlIIIIlI
{
    private static int[] llllIIIIlIIIlIlllIll;
    
    static {
        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll = new int[65536];
    }
    
    public static void llllIIIIlIIIlIlllIll(final int[] llllIIIIlIIIlIlllIll) {
        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public static int llllIIIIlIIIlIlllIll(final double n, double n2) {
        n2 *= n;
        return llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll[(int)((1.0 - n2) * 255.0) << 8 | (int)((1.0 - n) * 255.0)];
    }
    
    public static int llllIIIIlIIIlIlllIll() {
        return 6396257;
    }
    
    public static int IlIlIlIlIlllllllllIl() {
        return 8431445;
    }
    
    public static int llIllIIIIIllIlIIIIlI() {
        return 4764952;
    }
}
