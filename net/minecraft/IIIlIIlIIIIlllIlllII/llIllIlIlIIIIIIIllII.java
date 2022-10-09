package net.minecraft.IIIlIIlIIIIlllIlllII;

public class llIllIlIlIIIIIIIllII
{
    public static final llIllIlIlIIIIIIIllII[] llllIIIIlIIIlIlllIll;
    public static final llIllIlIlIIIIIIIllII IlIlIlIlIlllllllllIl;
    public static final llIllIlIlIIIIIIIllII llIllIIIIIllIlIIIIlI;
    public static final llIllIlIlIIIIIIIllII IlIIIlIlIIIllIlIlIIl;
    public static final llIllIlIlIIIIIIIllII IlIlIIIllIllIIIIIllI;
    public static final llIllIlIlIIIIIIIllII IllIIlllIIIIlllIIlIl;
    public static final llIllIlIlIIIIIIIllII llllIIIlIlllIlIIIIIl;
    public static final llIllIlIlIIIIIIIllII lIIIIlIIIIIlllIllIII;
    private final int lIIIlllIIIllIIIllIII;
    private final String llIIlIIIlIIIllIlIIIl;
    private final int llIllIlIIIIllIlIIllI;
    private boolean lIlIlIIIllIIllIIIllI;
    private boolean IlIlIIIllIIllIlllllI;
    private boolean IIIIlllIIIIIIlIIIlll;
    
    static {
        llllIIIIlIIIlIlllIll = new llIllIlIlIIIIIIIllII[16];
        IlIlIlIlIlllllllllIl = new llIllIlIlIIIIIIIllII(0, "default", 1).lIIIlllIIIllIIIllIII();
        llIllIIIIIllIlIIIIlI = new llIllIlIlIIIIIIIllII(1, "flat");
        IlIIIlIlIIIllIlIlIIl = new llIllIlIlIIIIIIIllII(2, "largeBiomes");
        IlIlIIIllIllIIIIIllI = new llIllIlIlIIIIIIIllII(3, "amplified").llIIlIIIlIIIllIlIIIl();
        IllIIlllIIIIlllIIlIl = new llIllIlIlIIIIIIIllII(4, "customized");
        llllIIIlIlllIlIIIIIl = new llIllIlIlIIIIIIIllII(5, "debug_all_block_states");
        lIIIIlIIIIIlllIllIII = new llIllIlIlIIIIIIIllII(8, "default_1_1", 0).llllIIIIlIIIlIlllIll(false);
    }
    
    private llIllIlIlIIIIIIIllII(final int n, final String s) {
        this(n, s, 0);
    }
    
    private llIllIlIlIIIIIIIllII(final int liiIlllIIIllIIIllIII, final String llIIlIIIlIIIllIlIIIl, final int llIllIlIIIIllIlIIllI) {
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI;
        this.lIlIlIIIllIIllIIIllI = true;
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
        llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll[liiIlllIIIllIIIllIII] = this;
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return this.llIIlIIIlIIIllIlIIIl;
    }
    
    public String IlIlIlIlIlllllllllIl() {
        return "generator." + this.llIIlIIIlIIIllIlIIIl;
    }
    
    public String llIllIIIIIllIlIIIIlI() {
        return String.valueOf(this.IlIlIlIlIlllllllllIl()) + ".info";
    }
    
    public int IlIIIlIlIIIllIlIlIIl() {
        return this.llIllIlIIIIllIlIIllI;
    }
    
    public llIllIlIlIIIIIIIllII llllIIIIlIIIlIlllIll(final int n) {
        return (this == llIllIlIlIIIIIIIllII.IlIlIlIlIlllllllllIl && n == 0) ? llIllIlIlIIIIIIIllII.lIIIIlIIIIIlllIllIII : this;
    }
    
    private llIllIlIlIIIIIIIllII llllIIIIlIIIlIlllIll(final boolean lIlIlIIIllIIllIIIllI) {
        this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI;
        return this;
    }
    
    public boolean IlIlIIIllIllIIIIIllI() {
        return this.lIlIlIIIllIIllIIIllI;
    }
    
    private llIllIlIlIIIIIIIllII lIIIlllIIIllIIIllIII() {
        this.IlIlIIIllIIllIlllllI = true;
        return this;
    }
    
    public boolean IllIIlllIIIIlllIIlIl() {
        return this.IlIlIIIllIIllIlllllI;
    }
    
    public static llIllIlIlIIIIIIIllII llllIIIIlIIIlIlllIll(final String s) {
        for (int i = 0; i < llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll.length; ++i) {
            if (llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll[i] != null && llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll[i].llIIlIIIlIIIllIlIIIl.equalsIgnoreCase(s)) {
                return llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll[i];
            }
        }
        return null;
    }
    
    public int llllIIIlIlllIlIIIIIl() {
        return this.lIIIlllIIIllIIIllIII;
    }
    
    public boolean lIIIIlIIIIIlllIllIII() {
        return this.IIIIlllIIIIIIlIIIlll;
    }
    
    private llIllIlIlIIIIIIIllII llIIlIIIlIIIllIlIIIl() {
        this.IIIIlllIIIIIIlIIIlll = true;
        return this;
    }
}
