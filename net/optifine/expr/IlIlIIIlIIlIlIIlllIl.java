package net.optifine.expr;

public enum IlIlIIIlIIlIlIIlllIl
{
    llllIIIIlIIIlIlllIll("IDENTIFIER", 0, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_:."), 
    IlIlIlIlIlllllllllIl("NUMBER", 1, "0123456789", "0123456789."), 
    llIllIIIIIllIlIIIIlI("OPERATOR", 2, "+-*/%!&|<>=", "&|="), 
    IlIIIlIlIIIllIlIlIIl("COMMA", 3, ","), 
    IlIlIIIllIllIIIIIllI("BRACKET_OPEN", 4, "("), 
    IllIIlllIIIIlllIIlIl("BRACKET_CLOSE", 5, ")");
    
    private String lIIIIlIIIIIlllIllIII;
    private String lIIIlllIIIllIIIllIII;
    public static final IlIlIIIlIIlIlIIlllIl[] llllIIIlIlllIlIIIIIl;
    
    static {
        llIIlIIIlIIIllIlIIIl = new IlIlIIIlIIlIlIIlllIl[] { IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll, IlIlIIIlIIlIlIIlllIl.IlIlIlIlIlllllllllIl, IlIlIIIlIIlIlIIlllIl.llIllIIIIIllIlIIIIlI, IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl, IlIlIIIlIIlIlIIlllIl.IlIlIIIllIllIIIIIllI, IlIlIIIlIIlIlIIlllIl.IllIIlllIIIIlllIIlIl };
        llllIIIlIlllIlIIIIIl = values();
    }
    
    private IlIlIIIlIIlIlIIlllIl(final String s, final int n, final String s2) {
        this(s, n, s2, "");
    }
    
    private IlIlIIIlIIlIlIIlllIl(final String s, final int n, final String liiiIlIIIIIlllIllIII, final String liiIlllIIIllIIIllIII) {
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return this.lIIIIlIIIIIlllIllIII;
    }
    
    public String IlIlIlIlIlllllllllIl() {
        return this.lIIIlllIIIllIIIllIII;
    }
    
    public static IlIlIIIlIIlIlIIlllIl llllIIIIlIIIlIlllIll(final char c) {
        for (int i = 0; i < IlIlIIIlIIlIlIIlllIl.llllIIIlIlllIlIIIIIl.length; ++i) {
            final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl = IlIlIIIlIIlIlIIlllIl.llllIIIlIlllIlIIIIIl[i];
            if (ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll().indexOf(c) >= 0) {
                return ilIlIIIlIIlIlIIlllIl;
            }
        }
        return null;
    }
    
    public boolean IlIlIlIlIlllllllllIl(final char c) {
        return this.lIIIlllIIIllIIIllIII.indexOf(c) >= 0;
    }
}
