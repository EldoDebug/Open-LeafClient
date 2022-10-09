package net.minecraft.IIIlIIlIIIIlllIlllII;

import net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.*;

public final class IlllIIIIlIIIlIlIlIIl
{
    private final long llllIIIIlIIIlIlllIll;
    private final lllIllIIIllllllIllll IlIlIlIlIlllllllllIl;
    private final boolean llIllIIIIIllIlIIIIlI;
    private final boolean IlIIIlIlIIIllIlIlIIl;
    private final llIllIlIlIIIIIIIllII IlIlIIIllIllIIIIIllI;
    private boolean IllIIlllIIIIlllIIlIl;
    private boolean llllIIIlIlllIlIIIIIl;
    private String lIIIIlIIIIIlllIllIII;
    
    public IlllIIIIlIIIlIlIlIIl(final long llllIIIIlIIIlIlllIll, final lllIllIIIllllllIllll ilIlIlIlIlllllllllIl, final boolean llIllIIIIIllIlIIIIlI, final boolean ilIIIlIlIIIllIlIlIIl, final llIllIlIlIIIIIIIllII ilIlIIIllIllIIIIIllI) {
        this.lIIIIlIIIIIlllIllIII = "";
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    public IlllIIIIlIIIlIlIlIIl(final llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll) {
        this(llllIIllllIlIlIIIIll.IlIlIlIlIlllllllllIl(), llllIIllllIlIlIIIIll.IIlllIIlIllIllIlIIll(), llllIIllllIlIlIIIIll.lllIIIIlllllIlIIllIl(), llllIIllllIlIlIIIIll.IlIlIIIIIIlllIlIllIl(), llllIIllllIlIlIIIIll.IIllIIllIIIlIlIIIIlI());
    }
    
    public IlllIIIIlIIIlIlIlIIl llllIIIIlIIIlIlllIll() {
        this.llllIIIlIlllIlIIIIIl = true;
        return this;
    }
    
    public IlllIIIIlIIIlIlIlIIl IlIlIlIlIlllllllllIl() {
        this.IllIIlllIIIIlllIIlIl = true;
        return this;
    }
    
    public IlllIIIIlIIIlIlIlIIl llllIIIIlIIIlIlllIll(final String liiiIlIIIIIlllIllIII) {
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        return this;
    }
    
    public boolean llIllIIIIIllIlIIIIlI() {
        return this.llllIIIlIlllIlIIIIIl;
    }
    
    public long IlIIIlIlIIIllIlIlIIl() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public lllIllIIIllllllIllll IlIlIIIllIllIIIIIllI() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public boolean IllIIlllIIIIlllIIlIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public boolean llllIIIlIlllIlIIIIIl() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public llIllIlIlIIIIIIIllII lIIIIlIIIIIlllIllIII() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public boolean lIIIlllIIIllIIIllIII() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public static lllIllIIIllllllIllll llllIIIIlIIIlIlllIll(final int n) {
        return lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(n);
    }
    
    public String llIIlIIIlIIIllIlIIIl() {
        return this.lIIIIlIIIIIlllIllIII;
    }
}
