package net.minecraft.client.llllIIIIlIIIlIlllIll;

import paulscode.sound.*;

class IIlIIIIlllIlllllIlII implements Runnable
{
    final /* synthetic */ IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll;
    
    IIlIIIIlllIlllllIlII(final IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public void run() {
        SoundSystemConfig.setLogger((SoundSystemLogger)new IIIlIIlIIIIlllIlllII(this));
        final IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll;
        final IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll;
        llllIIIIlIIIlIlllIll2.getClass();
        IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, new llIIIlIlIllIIlIlIlII(llllIIIIlIIIlIlllIll2, null));
        IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, true);
        this.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.setMasterVolume(this.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll));
        IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl.info(IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll, "Sound engine started");
    }
}
