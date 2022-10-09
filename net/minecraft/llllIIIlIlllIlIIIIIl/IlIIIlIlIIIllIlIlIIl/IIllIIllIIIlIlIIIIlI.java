package net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl;

public enum IIllIIllIIIlIlIIIIlI
{
    llllIIIIlIIIlIlllIll("KEBAB", 0, "Kebab", 16, 16, 0, 0), 
    IlIlIlIlIlllllllllIl("AZTEC", 1, "Aztec", 16, 16, 16, 0), 
    llIllIIIIIllIlIIIIlI("ALBAN", 2, "Alban", 16, 16, 32, 0), 
    IlIIIlIlIIIllIlIlIIl("AZTEC_2", 3, "Aztec2", 16, 16, 48, 0), 
    IlIlIIIllIllIIIIIllI("BOMB", 4, "Bomb", 16, 16, 64, 0), 
    IllIIlllIIIIlllIIlIl("PLANT", 5, "Plant", 16, 16, 80, 0), 
    llllIIIlIlllIlIIIIIl("WASTELAND", 6, "Wasteland", 16, 16, 96, 0), 
    lIIIIlIIIIIlllIllIII("POOL", 7, "Pool", 32, 16, 0, 32), 
    lIIIlllIIIllIIIllIII("COURBET", 8, "Courbet", 32, 16, 32, 32), 
    llIIlIIIlIIIllIlIIIl("SEA", 9, "Sea", 32, 16, 64, 32), 
    llIllIlIIIIllIlIIllI("SUNSET", 10, "Sunset", 32, 16, 96, 32), 
    lIlIlIIIllIIllIIIllI("CREEBET", 11, "Creebet", 32, 16, 128, 32), 
    IlIlIIIllIIllIlllllI("WANDERER", 12, "Wanderer", 16, 32, 0, 64), 
    IIIIlllIIIIIIlIIIlll("GRAHAM", 13, "Graham", 16, 32, 16, 64), 
    llllIIllllIlIlIIIIll("MATCH", 14, "Match", 32, 32, 0, 128), 
    IlIllIlIlIIIlIlIlIII("BUST", 15, "Bust", 32, 32, 32, 128), 
    IIlllIIlIllIllIlIIll("STAGE", 16, "Stage", 32, 32, 64, 128), 
    lllIIIIlllllIlIIllIl("VOID", 17, "Void", 32, 32, 96, 128), 
    IlIlIIIIIIlllIlIllIl("SKULL_AND_ROSES", 18, "SkullAndRoses", 32, 32, 128, 128), 
    IIllIIllIIIlIlIIIIlI("WITHER", 19, "Wither", 32, 32, 160, 128), 
    IIIlIIIlIlIIlllIIlll("FIGHTERS", 20, "Fighters", 64, 32, 0, 96), 
    IlIlIIIlIIlIlIIlllIl("POINTER", 21, "Pointer", 64, 64, 0, 192), 
    IlllllllIIIlIIIlIlII("PIGSCENE", 22, "Pigscene", 64, 64, 64, 192), 
    IIlIIIIlllIlllllIlII("BURNING_SKULL", 23, "BurningSkull", 64, 64, 128, 192), 
    IIIlIIlIIIIlllIlllII("SKELETON", 24, "Skeleton", 64, 48, 192, 64), 
    IlIlIllllllllIIIIlII("DONKEY_KONG", 25, "DonkeyKong", 64, 48, 192, 112);
    
    public static final int IIlllIlIIllIlIlIlIIl;
    public final String llIIIlIlIllIIlIlIlII;
    public final int lllllIlIIIlIlIIlllII;
    public final int lIllllllIIllIlIlIlII;
    public final int llIIlllIIlllIIllIllI;
    public final int IIlllIIIlIlllIIlllII;
    
    static {
        IIlIIIIIllIlIIIlIIll = new IIllIIllIIIlIlIIIIlI[] { IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll, IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl, IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI, IIllIIllIIIlIlIIIIlI.IlIIIlIlIIIllIlIlIIl, IIllIIllIIIlIlIIIIlI.IlIlIIIllIllIIIIIllI, IIllIIllIIIlIlIIIIlI.IllIIlllIIIIlllIIlIl, IIllIIllIIIlIlIIIIlI.llllIIIlIlllIlIIIIIl, IIllIIllIIIlIlIIIIlI.lIIIIlIIIIIlllIllIII, IIllIIllIIIlIlIIIIlI.lIIIlllIIIllIIIllIII, IIllIIllIIIlIlIIIIlI.llIIlIIIlIIIllIlIIIl, IIllIIllIIIlIlIIIIlI.llIllIlIIIIllIlIIllI, IIllIIllIIIlIlIIIIlI.lIlIlIIIllIIllIIIllI, IIllIIllIIIlIlIIIIlI.IlIlIIIllIIllIlllllI, IIllIIllIIIlIlIIIIlI.IIIIlllIIIIIIlIIIlll, IIllIIllIIIlIlIIIIlI.llllIIllllIlIlIIIIll, IIllIIllIIIlIlIIIIlI.IlIllIlIlIIIlIlIlIII, IIllIIllIIIlIlIIIIlI.IIlllIIlIllIllIlIIll, IIllIIllIIIlIlIIIIlI.lllIIIIlllllIlIIllIl, IIllIIllIIIlIlIIIIlI.IlIlIIIIIIlllIlIllIl, IIllIIllIIIlIlIIIIlI.IIllIIllIIIlIlIIIIlI, IIllIIllIIIlIlIIIIlI.IIIlIIIlIlIIlllIIlll, IIllIIllIIIlIlIIIIlI.IlIlIIIlIIlIlIIlllIl, IIllIIllIIIlIlIIIIlI.IlllllllIIIlIIIlIlII, IIllIIllIIIlIlIIIIlI.IIlIIIIlllIlllllIlII, IIllIIllIIIlIlIIIIlI.IIIlIIlIIIIlllIlllII, IIllIIllIIIlIlIIIIlI.IlIlIllllllllIIIIlII };
        IIlllIlIIllIlIlIlIIl = "SkullAndRoses".length();
    }
    
    private IIllIIllIIIlIlIIIIlI(final String s, final int n, final String llIIIlIlIllIIlIlIlII, final int lllllIlIIIlIlIIlllII, final int lIllllllIIllIlIlIlII, final int llIIlllIIlllIIllIllI, final int iIlllIIIlIlllIIlllII) {
        this.llIIIlIlIllIIlIlIlII = llIIIlIlIllIIlIlIlII;
        this.lllllIlIIIlIlIIlllII = lllllIlIIIlIlIIlllII;
        this.lIllllllIIllIlIlIlII = lIllllllIIllIlIlIlII;
        this.llIIlllIIlllIIllIllI = llIIlllIIlllIIllIllI;
        this.IIlllIIIlIlllIIlllII = iIlllIIIlIlllIIlllII;
    }
}
