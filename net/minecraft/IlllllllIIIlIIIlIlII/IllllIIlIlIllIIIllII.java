package net.minecraft.IlllllllIIIlIIIlIlII;

import io.netty.channel.*;
import java.util.*;
import io.netty.buffer.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;
import io.netty.handler.codec.*;

public class IllllIIlIlIllIIIllII extends ByteToMessageDecoder
{
    @Override
    protected void decode(final ChannelHandlerContext channelHandlerContext, final ByteBuf byteBuf, final List list) {
        byteBuf.markReaderIndex();
        final byte[] array = new byte[3];
        for (int i = 0; i < array.length; ++i) {
            if (!byteBuf.isReadable()) {
                byteBuf.resetReaderIndex();
                return;
            }
            array[i] = byteBuf.readByte();
            if (array[i] >= 0) {
                final llllllIllIllIlIllllI llllllIllIllIlIllllI = new llllllIllIllIlIllllI(Unpooled.wrappedBuffer(array));
                try {
                    final int ilIIIlIlIIIllIlIlIIl = llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl();
                    if (byteBuf.readableBytes() >= ilIIIlIlIIIllIlIlIIl) {
                        list.add(byteBuf.readBytes(ilIIIlIlIIIllIlIlIIl));
                        return;
                    }
                    byteBuf.resetReaderIndex();
                }
                finally {
                    llllllIllIllIlIllllI.release();
                }
                llllllIllIllIlIllllI.release();
                return;
            }
        }
        throw new CorruptedFrameException("length wider than 21-bit");
    }
}
