package net.minecraft.IlIlIlIlIlllllllllIl;

public enum lIllllllIIllIlIlIlII
{
    llllIIIIlIIIlIlllIll("SUCCESS_COUNT", 0, 0, "SuccessCount"), 
    IlIlIlIlIlllllllllIl("AFFECTED_BLOCKS", 1, 1, "AffectedBlocks"), 
    llIllIIIIIllIlIIIIlI("AFFECTED_ENTITIES", 2, 2, "AffectedEntities"), 
    IlIIIlIlIIIllIlIlIIl("AFFECTED_ITEMS", 3, 3, "AffectedItems"), 
    IlIlIIIllIllIIIIIllI("QUERY_RESULT", 4, 4, "QueryResult");
    
    final int IllIIlllIIIIlllIIlIl;
    final String llllIIIlIlllIlIIIIIl;
    
    static {
        lIIIIlIIIIIlllIllIII = new lIllllllIIllIlIlIlII[] { lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll, lIllllllIIllIlIlIlII.IlIlIlIlIlllllllllIl, lIllllllIIllIlIlIlII.llIllIIIIIllIlIIIIlI, lIllllllIIllIlIlIlII.IlIIIlIlIIIllIlIlIIl, lIllllllIIllIlIlIlII.IlIlIIIllIllIIIIIllI };
    }
    
    private lIllllllIIllIlIlIlII(final String s, final int n, final int illIIlllIIIIlllIIlIl, final String llllIIIlIlllIlIIIIIl) {
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public String IlIlIlIlIlllllllllIl() {
        return this.llllIIIlIlllIlIIIIIl;
    }
    
    public static String[] llIllIIIIIllIlIIIIlI() {
        final String[] array = new String[values().length];
        int n = 0;
        lIllllllIIllIlIlIlII[] values;
        for (int length = (values = values()).length, i = 0; i < length; ++i) {
            array[n++] = values[i].IlIlIlIlIlllllllllIl();
        }
        return array;
    }
    
    public static lIllllllIIllIlIlIlII llllIIIIlIIIlIlllIll(final String s) {
        lIllllllIIllIlIlIlII[] values;
        for (int length = (values = values()).length, i = 0; i < length; ++i) {
            final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII = values[i];
            if (lIllllllIIllIlIlIlII.IlIlIlIlIlllllllllIl().equals(s)) {
                return lIllllllIIllIlIlIlII;
            }
        }
        return null;
    }
}
