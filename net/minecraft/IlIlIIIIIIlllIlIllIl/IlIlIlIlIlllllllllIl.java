package net.minecraft.IlIlIIIIIIlllIlIllIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;

class IlIlIlIlIlllllllllIl implements lllllIIIIIlIlIIIIIIl
{
    private long IlIlIlIlIlllllllllIl;
    final /* synthetic */ llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll;
    
    IlIlIlIlIlllllllllIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = System.currentTimeMillis();
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final String s) {
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final String s) {
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n) {
        if (System.currentTimeMillis() - this.IlIlIlIlIlllllllllIl >= 1000L) {
            this.IlIlIlIlIlllllllllIl = System.currentTimeMillis();
            net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI.info("Converting... " + n + "%");
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll() {
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final String s) {
    }
}
