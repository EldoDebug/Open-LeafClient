package net.minecraft.IIIlIIlIIIIlllIlllII;

public enum IllIIlllIIIIlllIIlIl
{
    llllIIIIlIIIlIlllIll("PEACEFUL", 0, 0, "options.difficulty.peaceful"), 
    IlIlIlIlIlllllllllIl("EASY", 1, 1, "options.difficulty.easy"), 
    llIllIIIIIllIlIIIIlI("NORMAL", 2, 2, "options.difficulty.normal"), 
    IlIIIlIlIIIllIlIlIIl("HARD", 3, 3, "options.difficulty.hard");
    
    private static final IllIIlllIIIIlllIIlIl[] IlIlIIIllIllIIIIIllI;
    private final int IllIIlllIIIIlllIIlIl;
    private final String llllIIIlIlllIlIIIIIl;
    
    static {
        lIIIIlIIIIIlllIllIII = new IllIIlllIIIIlllIIlIl[] { IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll, IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl, IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI, IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl };
        IlIlIIIllIllIIIIIllI = new IllIIlllIIIIlllIIlIl[values().length];
        IllIIlllIIIIlllIIlIl[] values;
        for (int length = (values = values()).length, i = 0; i < length; ++i) {
            final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl = values[i];
            IllIIlllIIIIlllIIlIl.IlIlIIIllIllIIIIIllI[illIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl] = illIIlllIIIIlllIIlIl;
        }
    }
    
    private IllIIlllIIIIlllIIlIl(final String s, final int n, final int illIIlllIIIIlllIIlIl, final String llllIIIlIlllIlIIIIIl) {
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public static IllIIlllIIIIlllIIlIl llllIIIIlIIIlIlllIll(final int n) {
        return IllIIlllIIIIlllIIlIl.IlIlIIIllIllIIIIIllI[n % IllIIlllIIIIlllIIlIl.IlIlIIIllIllIIIIIllI.length];
    }
    
    public String IlIlIlIlIlllllllllIl() {
        return this.llllIIIlIlllIlIIIIIl;
    }
}
