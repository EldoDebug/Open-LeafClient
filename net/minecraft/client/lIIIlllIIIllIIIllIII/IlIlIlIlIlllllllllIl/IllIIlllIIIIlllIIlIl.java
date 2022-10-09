package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl;

class IllIIlllIIIIlllIIlIl implements Runnable
{
    final /* synthetic */ IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll;
    private final /* synthetic */ llllIIIIlIIIlIlllIll IlIlIlIlIlllllllllIl;
    
    IllIIlllIIIIlllIIlIl(final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll, final llllIIIIlIIIlIlllIll ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    @Override
    public void run() {
        this.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl.remove(this.IlIlIlIlIlllllllllIl);
    }
}
