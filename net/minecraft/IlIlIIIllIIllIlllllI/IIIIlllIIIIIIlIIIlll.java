package net.minecraft.IlIlIIIllIIllIlllllI;

import io.netty.handler.codec.*;
import javax.crypto.*;
import io.netty.channel.*;
import io.netty.buffer.*;
import java.util.*;

public class IIIIlllIIIIIIlIIIlll extends MessageToMessageDecoder
{
    private final IlIllIlIlIIIlIlIlIII llllIIIIlIIIlIlllIll;
    
    public IIIIlllIIIIIIlIIIlll(final Cipher cipher) {
        this.llllIIIIlIIIlIlllIll = new IlIllIlIlIIIlIlIlIII(cipher);
    }
    
    protected void llllIIIIlIIIlIlllIll(final ChannelHandlerContext channelHandlerContext, final ByteBuf byteBuf, final List list) {
        list.add(this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(channelHandlerContext, byteBuf));
    }
}
