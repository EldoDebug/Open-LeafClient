package net.minecraft.client.llllIIIIlIIIlIlllIll;

import paulscode.sound.*;

class llIIIlIlIllIIlIlIlII extends SoundSystem
{
    final /* synthetic */ IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll;
    
    private llIIIlIlIllIIlIlIlII(final IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public boolean playing(final String s) {
        synchronized (SoundSystemConfig.THREAD_SYNC) {
            if (this.soundLibrary == null) {
                // monitorexit(SoundSystemConfig.THREAD_SYNC)
                return false;
            }
            final Source source = this.soundLibrary.getSources().get(s);
            // monitorexit(SoundSystemConfig.THREAD_SYNC)
            return source != null && (source.playing() || source.paused() || source.preLoad);
        }
    }
}
