package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class lIlIIlllIIlIIlIlllIl extends IIllllIIIlIIIIIIllIl
{
    private static final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll;
    
    static {
        llllIIIIlIIIlIlllIll = new lIllllIllIllIIllllll("textures/entity/spider/spider.png");
    }
    
    public lIlIIlllIIlIIlIlllIl(final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        super(lllIllIIIllllllIllll, new llIllIlIlIIIIIIIllII(), 1.0f);
        this.llllIIIIlIIIlIlllIll(new IIIlIIIlIlIIlllIIlll(this));
    }
    
    protected float IlIlIlIlIlllllllllIl(final net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.llIllIlIlIIIIIIIllII llIllIlIlIIIIIIIllII) {
        return 180.0f;
    }
    
    protected lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.llIllIlIlIIIIIIIllII llIllIlIlIIIIIIIllII) {
        return lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll;
    }
}
