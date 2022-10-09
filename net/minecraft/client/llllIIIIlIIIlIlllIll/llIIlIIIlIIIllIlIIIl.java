package net.minecraft.client.llllIIIIlIIIlIlllIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;

public enum llIIlIIIlIIIllIlIIIl
{
    llllIIIIlIIIlIlllIll("MENU", 0, new lIllllIllIllIIllllll("minecraft:music.menu"), 20, 600), 
    IlIlIlIlIlllllllllIl("GAME", 1, new lIllllIllIllIIllllll("minecraft:music.game"), 12000, 24000), 
    llIllIIIIIllIlIIIIlI("CREATIVE", 2, new lIllllIllIllIIllllll("minecraft:music.game.creative"), 1200, 3600), 
    IlIIIlIlIIIllIlIlIIl("CREDITS", 3, new lIllllIllIllIIllllll("minecraft:music.game.end.credits"), Integer.MAX_VALUE, Integer.MAX_VALUE), 
    IlIlIIIllIllIIIIIllI("NETHER", 4, new lIllllIllIllIIllllll("minecraft:music.game.nether"), 1200, 3600), 
    IllIIlllIIIIlllIIlIl("END_BOSS", 5, new lIllllIllIllIIllllll("minecraft:music.game.end.dragon"), 0, 0), 
    llllIIIlIlllIlIIIIIl("END", 6, new lIllllIllIllIIllllll("minecraft:music.game.end"), 6000, 24000);
    
    private final lIllllIllIllIIllllll lIIIIlIIIIIlllIllIII;
    private final int lIIIlllIIIllIIIllIII;
    private final int llIIlIIIlIIIllIlIIIl;
    
    static {
        llIllIlIIIIllIlIIllI = new llIIlIIIlIIIllIlIIIl[] { llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll, llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI, llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl, llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI, llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl, llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl };
    }
    
    private llIIlIIIlIIIllIlIIIl(final String s, final int n, final lIllllIllIllIIllllll liiiIlIIIIIlllIllIII, final int liiIlllIIIllIIIllIII, final int llIIlIIIlIIIllIlIIIl) {
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
    }
    
    public lIllllIllIllIIllllll llllIIIIlIIIlIlllIll() {
        return this.lIIIIlIIIIIlllIllIII;
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.lIIIlllIIIllIIIllIII;
    }
    
    public int llIllIIIIIllIlIIIIlI() {
        return this.llIIlIIIlIIIllIlIIIl;
    }
}
