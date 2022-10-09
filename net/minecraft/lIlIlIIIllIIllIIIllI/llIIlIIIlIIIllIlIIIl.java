package net.minecraft.lIlIlIIIllIIllIIIllI;

public class llIIlIIIlIIIllIlIIIl
{
    public static final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll;
    private final long IlIlIlIlIlllllllllIl;
    private long llIllIIIIIllIlIIIIlI;
    
    static {
        llllIIIIlIIIlIlllIll = new llIllIlIIIIllIlIIllI(0L);
    }
    
    public llIIlIIIlIIIllIlIIIl(final long ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final long n) {
        this.llIllIIIIIllIlIIIIlI += n / 8L;
        if (this.llIllIIIIIllIlIIIIlI > this.IlIlIlIlIlllllllllIl) {
            throw new RuntimeException("Tried to read NBT tag that was too big; tried to allocate: " + this.llIllIIIIIllIlIIIIlI + "bytes where max allowed: " + this.IlIlIlIlIlllllllllIl);
        }
    }
}
