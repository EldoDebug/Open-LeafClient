package net.optifine.llIIlIIIlIIIllIlIIIl;

public enum llIllIIIIIllIlIIIIlI
{
    llllIIIIlIIIlIlllIll("BYTE", 0, 5120), 
    IlIlIlIlIlllllllllIl("SHORT", 1, 5122), 
    llIllIIIIIllIlIIIIlI("INT", 2, 5124), 
    IlIIIlIlIIIllIlIlIIl("HALF_FLOAT", 3, 5131), 
    IlIlIIIllIllIIIIIllI("FLOAT", 4, 5126), 
    IllIIlllIIIIlllIIlIl("UNSIGNED_BYTE", 5, 5121), 
    llllIIIlIlllIlIIIIIl("UNSIGNED_BYTE_3_3_2", 6, 32818), 
    lIIIIlIIIIIlllIllIII("UNSIGNED_BYTE_2_3_3_REV", 7, 33634), 
    lIIIlllIIIllIIIllIII("UNSIGNED_SHORT", 8, 5123), 
    llIIlIIIlIIIllIlIIIl("UNSIGNED_SHORT_5_6_5", 9, 33635), 
    llIllIlIIIIllIlIIllI("UNSIGNED_SHORT_5_6_5_REV", 10, 33636), 
    lIlIlIIIllIIllIIIllI("UNSIGNED_SHORT_4_4_4_4", 11, 32819), 
    IlIlIIIllIIllIlllllI("UNSIGNED_SHORT_4_4_4_4_REV", 12, 33637), 
    IIIIlllIIIIIIlIIIlll("UNSIGNED_SHORT_5_5_5_1", 13, 32820), 
    llllIIllllIlIlIIIIll("UNSIGNED_SHORT_1_5_5_5_REV", 14, 33638), 
    IlIllIlIlIIIlIlIlIII("UNSIGNED_INT", 15, 5125), 
    IIlllIIlIllIllIlIIll("UNSIGNED_INT_8_8_8_8", 16, 32821), 
    lllIIIIlllllIlIIllIl("UNSIGNED_INT_8_8_8_8_REV", 17, 33639), 
    IlIlIIIIIIlllIlIllIl("UNSIGNED_INT_10_10_10_2", 18, 32822), 
    IIllIIllIIIlIlIIIIlI("UNSIGNED_INT_2_10_10_10_REV", 19, 33640);
    
    private int IIIlIIIlIlIIlllIIlll;
    
    static {
        IlIlIIIlIIlIlIIlllIl = new llIllIIIIIllIlIIIIlI[] { llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll, llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl, llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI, llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl, llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI, llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl, llIllIIIIIllIlIIIIlI.llllIIIlIlllIlIIIIIl, llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII, llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII, llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl, llIllIIIIIllIlIIIIlI.llIllIlIIIIllIlIIllI, llIllIIIIIllIlIIIIlI.lIlIlIIIllIIllIIIllI, llIllIIIIIllIlIIIIlI.IlIlIIIllIIllIlllllI, llIllIIIIIllIlIIIIlI.IIIIlllIIIIIIlIIIlll, llIllIIIIIllIlIIIIlI.llllIIllllIlIlIIIIll, llIllIIIIIllIlIIIIlI.IlIllIlIlIIIlIlIlIII, llIllIIIIIllIlIIIIlI.IIlllIIlIllIllIlIIll, llIllIIIIIllIlIIIIlI.lllIIIIlllllIlIIllIl, llIllIIIIIllIlIIIIlI.IlIlIIIIIIlllIlIllIl, llIllIIIIIllIlIIIIlI.IIllIIllIIIlIlIIIIlI };
    }
    
    private llIllIIIIIllIlIIIIlI(final String s, final int n, final int iiIlIIIlIlIIlllIIlll) {
        this.IIIlIIIlIlIIlllIIlll = iiIlIIIlIlIIlllIIlll;
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return this.IIIlIIIlIlIIlllIIlll;
    }
}
