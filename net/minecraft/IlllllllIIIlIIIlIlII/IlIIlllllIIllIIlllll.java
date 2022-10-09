package net.minecraft.IlllllllIIIlIIIlIlII;

public class IlIIlllllIIllIIlllll
{
    private static final Integer[] llllIIIIlIIIlIlllIll;
    
    static {
        llllIIIIlIIIlIlllIll = new Integer[65535];
        for (int i = 0; i < IlIIlllllIIllIIlllll.llllIIIIlIIIlIlllIll.length; ++i) {
            IlIIlllllIIllIIlllll.llllIIIIlIIIlIlllIll[i] = i;
        }
    }
    
    public static Integer llllIIIIlIIIlIlllIll(final int n) {
        return (n >= 0 && n < IlIIlllllIIllIIlllll.llllIIIIlIIIlIlllIll.length) ? IlIIlllllIIllIIlllll.llllIIIIlIIIlIlllIll[n] : new Integer(n);
    }
}
