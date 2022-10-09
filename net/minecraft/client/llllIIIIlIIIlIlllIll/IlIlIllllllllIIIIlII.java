package net.minecraft.client.llllIIIIlIIIlIlllIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.net.*;

class IlIlIllllllllIIIIlII extends URLStreamHandler
{
    private final /* synthetic */ lIllllIllIllIIllllll llllIIIIlIIIlIlllIll;
    
    IlIlIllllllllIIIIlII(final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    protected URLConnection openConnection(final URL url) {
        return new IIlllIlIIllIlIlIlIIl(this, url, this.llllIIIIlIIIlIlllIll);
    }
}
