package net.minecraft.IlIlIIIllIIllIlllllI;

import io.netty.handler.codec.*;
import java.util.zip.*;
import io.netty.channel.*;
import io.netty.buffer.*;

public class IlIlIIIllIIllIlllllI extends MessageToByteEncoder
{
    private final byte[] llllIIIIlIIIlIlllIll;
    private final Deflater IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    
    public IlIlIIIllIIllIlllllI(final int llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll = new byte[8192];
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIlIlIlIlllllllllIl = new Deflater();
    }
    
    protected void llllIIIIlIIIlIlllIll(final ChannelHandlerContext channelHandlerContext, final ByteBuf byteBuf, final ByteBuf byteBuf2) {
        final int readableBytes = byteBuf.readableBytes();
        final llllllIllIllIlIllllI llllllIllIllIlIllllI = new llllllIllIllIlIllllI(byteBuf2);
        if (readableBytes < this.llIllIIIIIllIlIIIIlI) {
            llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl(0);
            llllllIllIllIlIllllI.writeBytes(byteBuf);
        }
        else {
            final byte[] array = new byte[readableBytes];
            byteBuf.readBytes(array);
            llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl(array.length);
            this.IlIlIlIlIlllllllllIl.setInput(array, 0, readableBytes);
            this.IlIlIlIlIlllllllllIl.finish();
            while (!this.IlIlIlIlIlllllllllIl.finished()) {
                llllllIllIllIlIllllI.writeBytes(this.llllIIIIlIIIlIlllIll, 0, this.IlIlIlIlIlllllllllIl.deflate(this.llllIIIIlIIIlIlllIll));
            }
            this.IlIlIlIlIlllllllllIl.reset();
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final int llIllIIIIIllIlIIIIlI) {
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
}
