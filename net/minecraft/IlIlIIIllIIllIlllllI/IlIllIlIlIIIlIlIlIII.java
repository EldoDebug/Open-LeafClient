package net.minecraft.IlIlIIIllIIllIlllllI;

import javax.crypto.*;
import io.netty.buffer.*;
import io.netty.channel.*;

public class IlIllIlIlIIIlIlIlIII
{
    private final Cipher llllIIIIlIIIlIlllIll;
    private byte[] IlIlIlIlIlllllllllIl;
    private byte[] llIllIIIIIllIlIIIIlI;
    
    protected IlIllIlIlIIIlIlIlIII(final Cipher llllIIIIlIIIlIlllIll) {
        this.IlIlIlIlIlllllllllIl = new byte[0];
        this.llIllIIIIIllIlIIIIlI = new byte[0];
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    private byte[] llllIIIIlIIIlIlllIll(final ByteBuf byteBuf) {
        final int readableBytes = byteBuf.readableBytes();
        if (this.IlIlIlIlIlllllllllIl.length < readableBytes) {
            this.IlIlIlIlIlllllllllIl = new byte[readableBytes];
        }
        byteBuf.readBytes(this.IlIlIlIlIlllllllllIl, 0, readableBytes);
        return this.IlIlIlIlIlllllllllIl;
    }
    
    protected ByteBuf llllIIIIlIIIlIlllIll(final ChannelHandlerContext channelHandlerContext, final ByteBuf byteBuf) {
        final int readableBytes = byteBuf.readableBytes();
        final byte[] llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(byteBuf);
        final ByteBuf heapBuffer = channelHandlerContext.alloc().heapBuffer(this.llllIIIIlIIIlIlllIll.getOutputSize(readableBytes));
        heapBuffer.writerIndex(this.llllIIIIlIIIlIlllIll.update(llllIIIIlIIIlIlllIll, 0, readableBytes, heapBuffer.array(), heapBuffer.arrayOffset()));
        return heapBuffer;
    }
    
    protected void llllIIIIlIIIlIlllIll(final ByteBuf byteBuf, final ByteBuf byteBuf2) {
        final int readableBytes = byteBuf.readableBytes();
        final byte[] llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(byteBuf);
        final int outputSize = this.llllIIIIlIIIlIlllIll.getOutputSize(readableBytes);
        if (this.llIllIIIIIllIlIIIIlI.length < outputSize) {
            this.llIllIIIIIllIlIIIIlI = new byte[outputSize];
        }
        byteBuf2.writeBytes(this.llIllIIIIIllIlIIIIlI, 0, this.llllIIIIlIIIlIlllIll.update(llllIIIIlIIIlIlllIll, 0, readableBytes, this.llIllIIIIIllIlIIIIlI));
    }
}
