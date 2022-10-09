package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl;

class IlIlIIIllIllIIIIIllI implements Runnable
{
    final /* synthetic */ IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll;
    private final /* synthetic */ llllIIIIlIIIlIlllIll IlIlIlIlIlllllllllIl;
    
    IlIlIIIllIllIIIIIllI(final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll, final llllIIIIlIIIlIlllIll ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    @Override
    public void run() {
        this.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl.remove(this.IlIlIlIlIlllllllllIl);
    }
}
