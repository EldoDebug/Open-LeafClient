package net.optifine.util;

public class lIllllllIIllIlIlIlII
{
    public static float llllIIIIlIIIlIlllIll(final float n, final float n2, final float n3) {
        return (n < n2) ? n2 : ((n > n3) ? n3 : n);
    }
    
    public static int llllIIIIlIIIlIlllIll(final int n, final int n2) {
        int n3 = n % n2;
        if (n3 < 0) {
            n3 += n2;
        }
        return n3;
    }
}
