package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IllIIlllllIIllIIllIl extends IIllllIIIlIIIIIIllIl
{
    private static final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll;
    
    static {
        llllIIIIlIIIlIlllIll = new lIllllIllIllIIllllll("textures/entity/snowman.png");
    }
    
    public IllIIlllllIIllIIllIl(final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        super(lllIllIIIllllllIllll, new net.minecraft.client.IlIIIlIlIIIllIlIlIIl.lllIllIIIllllllIllll(), 0.5f);
        this.llllIIIIlIIIlIlllIll(new IIllIIllIIIlIlIIIIlI(this));
    }
    
    protected lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        return IllIIlllllIIllIIllIl.llllIIIIlIIIlIlllIll;
    }
    
    public net.minecraft.client.IlIIIlIlIIIllIlIlIIl.lllIllIIIllllllIllll lIIIIlIIIIIlllIllIII() {
        return (net.minecraft.client.IlIIIlIlIIIllIlIlIIl.lllIllIIIllllllIllll)super.IlIlIlIlIlllllllllIl();
    }
}
