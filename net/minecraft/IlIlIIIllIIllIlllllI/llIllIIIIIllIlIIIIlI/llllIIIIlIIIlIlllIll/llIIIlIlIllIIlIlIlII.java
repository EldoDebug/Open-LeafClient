package net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll;

import java.io.*;
import io.netty.buffer.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class llIIIlIlIllIIlIlIlII implements IIlIIIIIllIlIIIlIIll
{
    private String llllIIIIlIIIlIlllIll;
    private llllllIllIllIlIllllI IlIlIlIlIlllllllllIl;
    
    public llIIIlIlIllIIlIlIlII() {
    }
    
    public llIIIlIlIllIIlIlIlII(final String llllIIIIlIIIlIlllIll, final llllllIllIllIlIllllI ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        if (ilIlIlIlIlllllllllIl.writerIndex() > 32767) {
            throw new IllegalArgumentException("Payload may not be larger than 32767 bytes");
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llllIIIIlIIIlIlllIll = llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI(20);
        final int readableBytes = llllllIllIllIlIllllI.readableBytes();
        if (readableBytes >= 0 && readableBytes <= 32767) {
            this.IlIlIlIlIlllllllllIl = new llllllIllIllIlIllllI(llllllIllIllIlIllllI.readBytes(readableBytes));
            return;
        }
        throw new IOException("Payload may not be larger than 32767 bytes");
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll);
        llllllIllIllIlIllllI.writeBytes(this.IlIlIlIlIlllllllllIl);
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this);
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public llllllIllIllIlIllllI IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
}
