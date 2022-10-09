package net.minecraft.IlIlIIIllIIllIlllllI;

import io.netty.handler.codec.*;
import javax.crypto.*;
import io.netty.channel.*;
import io.netty.buffer.*;

public class llllIIllllIlIlIIIIll extends MessageToByteEncoder
{
    private final IlIllIlIlIIIlIlIlIII llllIIIIlIIIlIlllIll;
    
    public llllIIllllIlIlIIIIll(final Cipher cipher) {
        this.llllIIIIlIIIlIlllIll = new IlIllIlIlIIIlIlIlIII(cipher);
    }
    
    protected void llllIIIIlIIIlIlllIll(final ChannelHandlerContext channelHandlerContext, final ByteBuf byteBuf, final ByteBuf byteBuf2) {
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(byteBuf, byteBuf2);
    }
}
