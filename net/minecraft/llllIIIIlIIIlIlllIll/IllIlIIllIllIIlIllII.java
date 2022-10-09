package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;

public enum IllIlIIllIllIIlIllII implements lIllIIIIIlllIIlIIllI
{
    llllIIIIlIIIlIlllIll("LEFT", 0), 
    IlIlIlIlIlllllllllIl("RIGHT", 1);
    
    static {
        llIllIIIIIllIlIIIIlI = new IllIlIIllIllIIlIllII[] { IllIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll, IllIlIIllIllIIlIllII.IlIlIlIlIlllllllllIl };
    }
    
    private IllIlIIllIllIIlIllII(final String s, final int n) {
    }
    
    @Override
    public String toString() {
        return this.llllIIIIlIIIlIlllIll();
    }
    
    @Override
    public String llllIIIIlIIIlIlllIll() {
        return (this == IllIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll) ? "left" : "right";
    }
}
