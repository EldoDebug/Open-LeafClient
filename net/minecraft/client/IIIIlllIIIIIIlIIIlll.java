package net.minecraft.client;

class IIIIlllIIIIIIlIIIlll extends Thread
{
    final /* synthetic */ Minecraft llllIIIIlIIIlIlllIll;
    
    IIIIlllIIIIIIlIIIlll(final Minecraft llllIIIIlIIIlIlllIll, final String s) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        super(s);
    }
    
    @Override
    public void run() {
        while (this.llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII) {
            try {
                Thread.sleep(2147483647L);
            }
            catch (InterruptedException ex) {}
        }
    }
}
