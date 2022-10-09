package net.minecraft.client.llllIIIIlIIIlIlllIll;

import paulscode.sound.*;

class IIIlIIlIIIIlllIlllII extends SoundSystemLogger
{
    final /* synthetic */ IIlIIIIlllIlllllIlII llllIIIIlIIIlIlllIll;
    
    IIIlIIlIIIIlllIlllII(final IIlIIIIlllIlllllIlII llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public void message(final String s, final int n) {
        if (!s.isEmpty()) {
            IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl.info(s);
        }
    }
    
    public void importantMessage(final String s, final int n) {
        if (!s.isEmpty()) {
            IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl.warn(s);
        }
    }
    
    public void errorMessage(final String s, final String s2, final int n) {
        if (!s2.isEmpty()) {
            IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl.error("Error in class '" + s + "'");
            IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl.error(s2);
        }
    }
}
