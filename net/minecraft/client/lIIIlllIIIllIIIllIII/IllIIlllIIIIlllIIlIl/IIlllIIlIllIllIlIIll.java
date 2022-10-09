package net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl;

import net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;

public abstract class IIlllIIlIllIllIlIIll implements llllIIIlIlllIlIIIIIl
{
    protected static final lIllllIllIllIIllllll[] IlIlIlIlIlllllllllIl;
    protected IIIIlllIIIIIIlIIIlll llIllIIIIIllIlIIIIlI;
    private Class llllIIIIlIIIlIlllIll;
    private lIllllIllIllIIllllll IlIIIlIlIIIllIlIlIIl;
    
    static {
        IlIlIlIlIlllllllllIl = new lIllllIllIllIIllllll[] { new lIllllIllIllIIllllll("textures/blocks/destroy_stage_0.png"), new lIllllIllIllIIllllll("textures/blocks/destroy_stage_1.png"), new lIllllIllIllIIllllll("textures/blocks/destroy_stage_2.png"), new lIllllIllIllIIllllll("textures/blocks/destroy_stage_3.png"), new lIllllIllIllIIllllll("textures/blocks/destroy_stage_4.png"), new lIllllIllIllIIllllll("textures/blocks/destroy_stage_5.png"), new lIllllIllIllIIllllll("textures/blocks/destroy_stage_6.png"), new lIllllIllIllIIllllll("textures/blocks/destroy_stage_7.png"), new lIllllIllIllIIllllll("textures/blocks/destroy_stage_8.png"), new lIllllIllIllIIllllll("textures/blocks/destroy_stage_9.png") };
    }
    
    public IIlllIIlIllIllIlIIll() {
        this.llllIIIIlIIIlIlllIll = null;
        this.IlIIIlIlIIIllIlIlIIl = null;
    }
    
    public abstract void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl p0, final double p1, final double p2, final double p3, final float p4, final int p5);
    
    protected void llllIIIIlIIIlIlllIll(final lIllllIllIllIIllllll lIllllIllIllIIllllll) {
        final net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IIlllIIlIllIllIlIIll llllIIIlIlllIlIIIIIl = this.llIllIIIIIllIlIIIIlI.llllIIIlIlllIlIIIIIl;
        if (llllIIIlIlllIlIIIIIl != null) {
            llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll);
        }
    }
    
    protected IlllllllIIIlIIIlIlII llIllIIIIIllIlIIIIlI() {
        return this.llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII;
    }
    
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll llIllIIIIIllIlIIIIlI) {
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    public FontRenderer IlIIIlIlIIIllIlIlIIl() {
        return this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll();
    }
    
    public boolean llllIIIIlIIIlIlllIll() {
        return false;
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final double n, final double n2, final double n3, final float n4, final int n5, final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI) {
    }
    
    @Override
    public Class IllIIlllIIIIlllIIlIl() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final Class llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public lIllllIllIllIIllllll llllIIIlIlllIlIIIIIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final lIllllIllIllIIllllll ilIIIlIlIIIllIlIlIIl) {
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
}
