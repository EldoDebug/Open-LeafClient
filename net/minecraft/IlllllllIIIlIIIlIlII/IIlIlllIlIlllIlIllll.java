package net.minecraft.IlllllllIIIlIIIlIlII;

import net.minecraft.llIllIIIIIllIlIIIIlI.*;

public class IIlIlllIlIlllIlIllll extends RuntimeException
{
    private final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll;
    
    public IIlIlllIlIlllIlIllll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public Throwable getCause() {
        return this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
    }
    
    @Override
    public String getMessage() {
        return this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll();
    }
}
