package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl;

public enum IlIlIlIlIlllllllllIl
{
    llllIIIIlIIIlIlllIll("FULL", 0, 0, "options.chat.visibility.full"), 
    IlIlIlIlIlllllllllIl("SYSTEM", 1, 1, "options.chat.visibility.system"), 
    llIllIIIIIllIlIIIIlI("HIDDEN", 2, 2, "options.chat.visibility.hidden");
    
    private static final IlIlIlIlIlllllllllIl[] IlIIIlIlIIIllIlIlIIl;
    private final int IlIlIIIllIllIIIIIllI;
    private final String IllIIlllIIIIlllIIlIl;
    
    static {
        llllIIIlIlllIlIIIIIl = new IlIlIlIlIlllllllllIl[] { IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll, IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl, IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI };
        IlIIIlIlIIIllIlIlIIl = new IlIlIlIlIlllllllllIl[values().length];
        IlIlIlIlIlllllllllIl[] values;
        for (int length = (values = values()).length, i = 0; i < length; ++i) {
            final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = values[i];
            IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl[ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI] = ilIlIlIlIlllllllllIl;
        }
    }
    
    private IlIlIlIlIlllllllllIl(final String s, final int n, final int ilIlIIIllIllIIIIIllI, final String illIIlllIIIIlllIIlIl) {
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public static IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final int n) {
        return IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl[n % IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl.length];
    }
    
    public String IlIlIlIlIlllllllllIl() {
        return this.IllIIlllIIIIlllIIlIl;
    }
}
