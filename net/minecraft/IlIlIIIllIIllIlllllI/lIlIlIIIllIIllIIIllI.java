package net.minecraft.IlIlIIIllIIllIlllllI;

import java.util.zip.*;
import io.netty.channel.*;
import java.util.*;
import io.netty.handler.codec.*;
import io.netty.buffer.*;

public class lIlIlIIIllIIllIIIllI extends ByteToMessageDecoder
{
    private final Inflater llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    
    public lIlIlIIIllIIllIIIllI(final int ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llllIIIIlIIIlIlllIll = new Inflater();
    }
    
    @Override
    protected void decode(final ChannelHandlerContext channelHandlerContext, final ByteBuf byteBuf, final List list) {
        if (byteBuf.readableBytes() != 0) {
            final llllllIllIllIlIllllI llllllIllIllIlIllllI = new llllllIllIllIlIllllI(byteBuf);
            final int ilIIIlIlIIIllIlIlIIl = llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl();
            if (ilIIIlIlIIIllIlIlIIl == 0) {
                list.add(llllllIllIllIlIllllI.readBytes(llllllIllIllIlIllllI.readableBytes()));
            }
            else {
                if (ilIIIlIlIIIllIlIlIIl < this.IlIlIlIlIlllllllllIl) {
                    throw new DecoderException("Badly compressed packet - size of " + ilIIIlIlIIIllIlIlIIl + " is below server threshold of " + this.IlIlIlIlIlllllllllIl);
                }
                if (ilIIIlIlIIIllIlIlIIl > 2097152) {
                    throw new DecoderException("Badly compressed packet - size of " + ilIIIlIlIIIllIlIlIIl + " is larger than protocol maximum of " + 2097152);
                }
                final byte[] input = new byte[llllllIllIllIlIllllI.readableBytes()];
                llllllIllIllIlIllllI.readBytes(input);
                this.llllIIIIlIIIlIlllIll.setInput(input);
                final byte[] array = new byte[ilIIIlIlIIIllIlIlIIl];
                this.llllIIIIlIIIlIlllIll.inflate(array);
                list.add(Unpooled.wrappedBuffer(array));
                this.llllIIIIlIIIlIlllIll.reset();
            }
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final int ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
}
