package net.minecraft.client.llllIIIIlIIIlIlllIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.net.*;
import java.io.*;
import net.minecraft.client.*;

class IIlllIlIIllIlIlIlIIl extends URLConnection
{
    final /* synthetic */ IlIlIllllllllIIIIlII llllIIIIlIIIlIlllIll;
    private final /* synthetic */ lIllllIllIllIIllllll IlIlIlIlIlllllllllIl;
    
    IIlllIlIIllIlIlIlIIl(final IlIlIllllllllIIIIlII llllIIIIlIIIlIlllIll, final URL url, final lIllllIllIllIIllllll ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        super(url);
    }
    
    @Override
    public void connect() {
    }
    
    @Override
    public InputStream getInputStream() {
        return Minecraft.getMinecraft().llIllIlIlIIIIIIIllII().llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl).IlIlIlIlIlllllllllIl();
    }
}
