package net.minecraft.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl;

import java.io.*;
import com.google.gson.*;
import java.net.*;

public class IlIlIlIlIlllllllllIl extends lllIIIIlllllIlIIllIl
{
    public IlIlIlIlIlllllllllIl(final File file) {
        super(file);
    }
    
    @Override
    protected IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll(final JsonObject jsonObject) {
        return new llIllIIIIIllIlIIIIlI(jsonObject);
    }
    
    public boolean llllIIIIlIIIlIlllIll(final SocketAddress socketAddress) {
        return this.IlIIIlIlIIIllIlIlIIl(this.llIllIIIIIllIlIIIIlI(socketAddress));
    }
    
    public llIllIIIIIllIlIIIIlI IlIlIlIlIlllllllllIl(final SocketAddress socketAddress) {
        return (llIllIIIIIllIlIIIIlI)this.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI(socketAddress));
    }
    
    private String llIllIIIIIllIlIIIIlI(final SocketAddress socketAddress) {
        String s = socketAddress.toString();
        if (s.contains("/")) {
            s = s.substring(s.indexOf(47) + 1);
        }
        if (s.contains(":")) {
            s = s.substring(0, s.indexOf(58));
        }
        return s;
    }
}
