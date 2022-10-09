package net.minecraft.client.IllIIlllIIIIlllIIlIl;

import net.minecraft.client.IlIlIIIllIllIIIIIllI.*;
import io.netty.channel.*;
import io.netty.util.concurrent.*;
import io.netty.buffer.*;
import com.google.common.base.*;
import com.google.common.collect.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

class IlIlIIIIIIlllIlIllIl extends SimpleChannelInboundHandler
{
    final /* synthetic */ lllIIIIlllllIlIIllIl llllIIIIlIIIlIlllIll;
    private final /* synthetic */ IlIlIIIllIllIIIIIllI IlIlIlIlIlllllllllIl;
    private final /* synthetic */ IllIIlllIIIIlllIIlIl llIllIIIIIllIlIIIIlI;
    
    IlIlIIIIIIlllIlIllIl(final lllIIIIlllllIlIIllIl llllIIIIlIIIlIlllIll, final IlIlIIIllIllIIIIIllI ilIlIlIlIlllllllllIl, final IllIIlllIIIIlllIIlIl llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    public void channelActive(final ChannelHandlerContext ctx) {
        super.channelActive(ctx);
        final ByteBuf buffer = Unpooled.buffer();
        try {
            buffer.writeByte(254);
            buffer.writeByte(1);
            buffer.writeByte(250);
            final char[] charArray = "MC|PingHost".toCharArray();
            buffer.writeShort(charArray.length);
            char[] array;
            for (int length = (array = charArray).length, i = 0; i < length; ++i) {
                buffer.writeChar(array[i]);
            }
            buffer.writeShort(7 + 2 * this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll().length());
            buffer.writeByte(127);
            final char[] charArray2 = this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll().toCharArray();
            buffer.writeShort(charArray2.length);
            char[] array2;
            for (int length2 = (array2 = charArray2).length, j = 0; j < length2; ++j) {
                buffer.writeChar(array2[j]);
            }
            buffer.writeInt(this.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl());
            ctx.channel().writeAndFlush(buffer).addListener((GenericFutureListener<? extends Future<? super Void>>)ChannelFutureListener.CLOSE_ON_FAILURE);
        }
        finally {
            buffer.release();
        }
        buffer.release();
    }
    
    protected void llllIIIIlIIIlIlllIll(final ChannelHandlerContext channelHandlerContext, final ByteBuf byteBuf) {
        if (byteBuf.readUnsignedByte() == 255) {
            final String[] array = (String[])Iterables.toArray(IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll.split((CharSequence)new String(byteBuf.readBytes(byteBuf.readShort() * 2).array(), Charsets.UTF_16BE)), (Class)String.class);
            if ("Åò1".equals(array[0])) {
                llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(array[1], 0);
                final String llllIIIlIlllIlIIIIIl = array[2];
                final String ilIIIlIlIIIllIlIlIIl = array[3];
                final int llllIIIIlIIIlIlllIll = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(array[4], -1);
                final int llllIIIIlIIIlIlllIll2 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(array[5], -1);
                this.llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl = -1;
                this.llIllIIIIIllIlIIIIlI.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
                this.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
                this.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI = new StringBuilder().append(IlllIIIIlIIIlIlIlIIl.lIIIIlIIIIIlllIllIII).append(llllIIIIlIIIlIlllIll).append(IlllIIIIlIIIlIlIlIIl.lIIIlllIIIllIIIllIII).append("/").append(IlllIIIIlIIIlIlIlIIl.lIIIIlIIIIIlllIllIII).append(llllIIIIlIIIlIlllIll2).toString();
            }
        }
        channelHandlerContext.close();
    }
    
    @Override
    public void exceptionCaught(final ChannelHandlerContext channelHandlerContext, final Throwable t) {
        channelHandlerContext.close();
    }
}
