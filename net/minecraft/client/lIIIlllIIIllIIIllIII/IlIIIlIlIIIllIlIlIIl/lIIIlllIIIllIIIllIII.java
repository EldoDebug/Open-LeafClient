package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.*;

public class lIIIlllIIIllIIIllIII extends lIlIIlllIIlIIlIlllIl
{
    private static final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll;
    
    static {
        llllIIIIlIIIlIlllIll = new lIllllIllIllIIllllll("textures/entity/spider/cave_spider.png");
    }
    
    public lIIIlllIIIllIIIllIII(final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        super(lllIllIIIllllllIllll);
        this.llIllIIIIIllIlIIIIlI *= 0.7f;
    }
    
    protected void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final float n) {
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(0.7f, 0.7f, 0.7f);
    }
    
    protected lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        return lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll;
    }
}
