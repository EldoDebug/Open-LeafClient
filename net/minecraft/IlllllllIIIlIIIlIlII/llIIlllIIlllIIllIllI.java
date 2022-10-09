package net.minecraft.IlllllllIIIlIIIlIlII;

import java.util.*;

public class llIIlllIIlllIIllIllI
{
    private static final llIIlllIIlllIIllIllI llllIIIIlIIIlIlllIll;
    private Random IlIlIlIlIlllllllllIl;
    private String[] llIllIIIIIllIlIIIIlI;
    
    static {
        llllIIIIlIIIlIlllIll = new llIIlllIIlllIIllIllI();
    }
    
    public llIIlllIIlllIIllIllI() {
        this.IlIlIlIlIlllllllllIl = new Random();
        this.llIllIIIIIllIlIIIIlI = "the elder scrolls klaatu berata niktu xyzzy bless curse light darkness fire air earth water hot dry cold wet ignite snuff embiggen twist shorten stretch fiddle destroy imbue galvanize enchant free limited range of towards inside sphere cube self other ball mental physical grow shrink demon elemental spirit animal creature beast humanoid undead fresh stale ".split(" ");
    }
    
    public static llIIlllIIlllIIllIllI llllIIIIlIIIlIlllIll() {
        return llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll;
    }
    
    public String IlIlIlIlIlllllllllIl() {
        final int n = this.IlIlIlIlIlllllllllIl.nextInt(2) + 3;
        String s = "";
        for (int i = 0; i < n; ++i) {
            if (i > 0) {
                s = String.valueOf(s) + " ";
            }
            s = String.valueOf(s) + this.llIllIIIIIllIlIIIIlI[this.IlIlIlIlIlllllllllIl.nextInt(this.llIllIIIIIllIlIIIIlI.length)];
        }
        return s;
    }
    
    public void llllIIIIlIIIlIlllIll(final long seed) {
        this.IlIlIlIlIlllllllllIl.setSeed(seed);
    }
}
