package leaf.setting;

public class Setting
{
    private static final int llllIIIIlIIIlIlllIll = 50;
    private static int IlIlIlIlIlllllllllIl;
    private static double llIllIIIIIllIlIIIIlI;
    private static double IlIIIlIlIIIllIlIlIIl;
    private static double IlIlIIIllIllIIIIIllI;
    private static double IllIIlllIIIIlllIIlIl;
    
    public static int llllIIIIlIIIlIlllIll(final int n) {
        return (int)(n / Setting.IlIlIlIlIlllllllllIl * Setting.llIllIIIIIllIlIIIIlI * Setting.IlIlIIIllIllIIIIIllI);
    }
    
    public static int IlIlIlIlIlllllllllIl(final int n) {
        return (int)(n / Setting.IlIlIlIlIlllllllllIl * Setting.IlIIIlIlIIIllIlIlIIl * Setting.IllIIlllIIIIlllIIlIl);
    }
    
    public static int llIllIIIIIllIlIIIIlI(final int n) {
        return (int)(n * Setting.IlIlIlIlIlllllllllIl / Setting.llIllIIIIIllIlIIIIlI / Setting.IlIlIIIllIllIIIIIllI);
    }
    
    public static int llllIIIIlIIIlIlllIll() {
        return (int)(50 / Setting.IlIlIlIlIlllllllllIl * Setting.IlIIIlIlIIIllIlIlIIl * Setting.IllIIlllIIIIlllIIlIl);
    }
    
    public static void llllIIIIlIIIlIlllIll(final int ilIlIlIlIlllllllllIl, final double llIllIIIIIllIlIIIIlI, final double ilIIIlIlIIIllIlIlIIl, final double ilIlIIIllIllIIIIIllI, final double illIIlllIIIIlllIIlIl) {
        Setting.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        Setting.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        Setting.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        Setting.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        Setting.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
    }
}
