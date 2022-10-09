package net.optifine.shaders;

public enum lllIIIIlllllIlIIllIl
{
    llllIIIIlIIIlIlllIll("NONE", 0, ""), 
    IlIlIlIlIlllllllllIl("SHADOW", 1, "shadow"), 
    llIllIIIIIllIlIIIIlI("GBUFFERS", 2, "gbuffers"), 
    IlIIIlIlIIIllIlIlIIl("DEFERRED", 3, "deferred"), 
    IlIlIIIllIllIIIIIllI("COMPOSITE", 4, "composite");
    
    private String IllIIlllIIIIlllIIlIl;
    
    static {
        llllIIIlIlllIlIIIIIl = new lllIIIIlllllIlIIllIl[] { lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll, lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl, lllIIIIlllllIlIIllIl.llIllIIIIIllIlIIIIlI, lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl, lllIIIIlllllIlIIllIl.IlIlIIIllIllIIIIIllI };
    }
    
    private lllIIIIlllllIlIIllIl(final String s, final int n, final String illIIlllIIIIlllIIlIl) {
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return this.IllIIlllIIIIlllIIlIl;
    }
}
