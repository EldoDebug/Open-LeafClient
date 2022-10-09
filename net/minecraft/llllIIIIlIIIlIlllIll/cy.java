package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;

public enum cy implements lIllIIIIIlllIIlIIllI
{
    llllIIIIlIIIlIlllIll("STONE", 0, 0, net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI, "stone"), 
    IlIlIlIlIlllllllllIl("SAND", 1, 1, net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl, "sandstone", "sand"), 
    llIllIIIIIllIlIIIIlI("WOOD", 2, 2, net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll, "wood_old", "wood"), 
    IlIIIlIlIIIllIlIlIIl("COBBLESTONE", 3, 3, net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI, "cobblestone", "cobble"), 
    IlIlIIIllIllIIIIIllI("BRICK", 4, 4, net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII, "brick"), 
    IllIIlllIIIIlllIIlIl("SMOOTHBRICK", 5, 5, net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI, "stone_brick", "smoothStoneBrick"), 
    llllIIIlIlllIlIIIIIl("NETHERBRICK", 6, 6, net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl, "nether_brick", "netherBrick"), 
    lIIIIlIIIIIlllIllIII("QUARTZ", 7, 7, net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIllIlIlIIIlIlIlIII, "quartz");
    
    private static final cy[] lIIIlllIIIllIIIllIII;
    private final int llIIlIIIlIIIllIlIIIl;
    private final llllIIIIlIIIlIlllIll llIllIlIIIIllIlIIllI;
    private final String lIlIlIIIllIIllIIIllI;
    private final String IlIlIIIllIIllIlllllI;
    
    static {
        IIIIlllIIIIIIlIIIlll = new cy[] { cy.llllIIIIlIIIlIlllIll, cy.IlIlIlIlIlllllllllIl, cy.llIllIIIIIllIlIIIIlI, cy.IlIIIlIlIIIllIlIlIIl, cy.IlIlIIIllIllIIIIIllI, cy.IllIIlllIIIIlllIIlIl, cy.llllIIIlIlllIlIIIIIl, cy.lIIIIlIIIIIlllIllIII };
        lIIIlllIIIllIIIllIII = new cy[values().length];
        cy[] values;
        for (int length = (values = values()).length, i = 0; i < length; ++i) {
            final cy cy = values[i];
            net.minecraft.llllIIIIlIIIlIlllIll.cy.lIIIlllIIIllIIIllIII[cy.IlIlIlIlIlllllllllIl()] = cy;
        }
    }
    
    private cy(final String s, final int n, final int n2, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final String s2) {
        this(s, n, n2, llllIIIIlIIIlIlllIll, s2, s2);
    }
    
    private cy(final String s, final int n, final int llIIlIIIlIIIllIlIIIl, final llllIIIIlIIIlIlllIll llIllIlIIIIllIlIIllI, final String lIlIlIIIllIIllIIIllI, final String ilIlIIIllIIllIlllllI) {
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI;
        this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI;
        this.IlIlIIIllIIllIlllllI = ilIlIIIllIIllIlllllI;
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.llIIlIIIlIIIllIlIIIl;
    }
    
    public llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI() {
        return this.llIllIlIIIIllIlIIllI;
    }
    
    @Override
    public String toString() {
        return this.lIlIlIIIllIIllIIIllI;
    }
    
    public static cy llllIIIIlIIIlIlllIll(int n) {
        if (n < 0 || n >= cy.lIIIlllIIIllIIIllIII.length) {
            n = 0;
        }
        return cy.lIIIlllIIIllIIIllIII[n];
    }
    
    @Override
    public String llllIIIIlIIIlIlllIll() {
        return this.lIlIlIIIllIIllIIIllI;
    }
    
    public String IlIIIlIlIIIllIlIlIIl() {
        return this.IlIlIIIllIIllIlllllI;
    }
}
