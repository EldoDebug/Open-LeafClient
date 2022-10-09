package net.minecraft.IlIlIIIllIIllIlllllI;

class IlIIIlIIIllllIlIlIlI implements Runnable
{
    private final /* synthetic */ IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll;
    private final /* synthetic */ llllIIIlIlllIlIIIIIl IlIlIlIlIlllllllllIl;
    
    IlIIIlIIIllllIlIlIlI(final IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll, final llllIIIlIlllIlIIIIIl ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    @Override
    public void run() {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll);
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl);
    }
}
