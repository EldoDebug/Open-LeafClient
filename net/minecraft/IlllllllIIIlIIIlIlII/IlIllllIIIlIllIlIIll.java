package net.minecraft.IlllllllIIIlIIIlIlII;

import io.netty.handler.codec.*;
import io.netty.channel.*;
import io.netty.buffer.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class IlIllllIIIlIllIlIIll extends MessageToByteEncoder
{
    protected void llllIIIIlIIIlIlllIll(final ChannelHandlerContext channelHandlerContext, final ByteBuf byteBuf, final ByteBuf byteBuf2) {
        final int readableBytes = byteBuf.readableBytes();
        final int llllIIIIlIIIlIlllIll = llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(readableBytes);
        if (llllIIIIlIIIlIlllIll > 3) {
            throw new IllegalArgumentException("unable to fit " + readableBytes + " into " + 3);
        }
        final llllllIllIllIlIllllI llllllIllIllIlIllllI = new llllllIllIllIlIllllI(byteBuf2);
        llllllIllIllIlIllllI.ensureWritable(llllIIIIlIIIlIlllIll + readableBytes);
        llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl(readableBytes);
        llllllIllIllIlIllllI.writeBytes(byteBuf, byteBuf.readerIndex(), readableBytes);
    }
}
