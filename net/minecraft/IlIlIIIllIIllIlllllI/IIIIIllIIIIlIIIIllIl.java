package net.minecraft.IlIlIIIllIIllIlllllI;

import org.apache.logging.log4j.*;
import java.net.*;
import com.google.common.base.*;
import net.minecraft.IlIlIIIIIIlllIlIllIl.*;
import io.netty.channel.*;
import io.netty.util.concurrent.*;
import io.netty.buffer.*;

public class IIIIIllIIIIlIIIIllIl extends ChannelInboundHandlerAdapter
{
    private static final Logger llllIIIIlIIIlIlllIll;
    private IIIlIIlIIIIlllIlllII IlIlIlIlIlllllllllIl;
    
    static {
        llllIIIIlIIIlIlllIll = LogManager.getLogger();
    }
    
    public IIIIIllIIIIlIIIIllIl(final IIIlIIlIIIIlllIlllII ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    @Override
    public void channelRead(final ChannelHandlerContext channelHandlerContext, final Object o) {
        final ByteBuf byteBuf = (ByteBuf)o;
        byteBuf.markReaderIndex();
        boolean b = true;
        try {
            if (byteBuf.readUnsignedByte() == 254) {
                final InetSocketAddress inetSocketAddress = (InetSocketAddress)channelHandlerContext.channel().remoteAddress();
                final llllIIIIlIIIlIlllIll ilIIIlIlIIIllIlIlIIl = this.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl();
                switch (byteBuf.readableBytes()) {
                    case 0: {
                        IIIIIllIIIIlIIIIllIl.llllIIIIlIIIlIlllIll.debug("Ping: (<1.3.x) from {}:{}", new Object[] { inetSocketAddress.getAddress(), inetSocketAddress.getPort() });
                        this.llllIIIIlIIIlIlllIll(channelHandlerContext, this.llllIIIIlIIIlIlllIll(String.format("%s˜%d˜%d", ilIIIlIlIIIllIlIlIIl.lIlIIlllIIlIIlIlllIl(), ilIIIlIlIIIllIlIlIIl.IIlllIIIlIlllIIlllII(), ilIIIlIlIIIllIlIlIIl.IIlIIIIIllIlIIIlIIll())));
                        break;
                    }
                    case 1: {
                        if (byteBuf.readUnsignedByte() != 1) {
                            return;
                        }
                        IIIIIllIIIIlIIIIllIl.llllIIIIlIIIlIlllIll.debug("Ping: (1.4-1.5.x) from {}:{}", new Object[] { inetSocketAddress.getAddress(), inetSocketAddress.getPort() });
                        this.llllIIIIlIIIlIlllIll(channelHandlerContext, this.llllIIIIlIIIlIlllIll(String.format("˜1\u0000%d\u0000%s\u0000%s\u0000%d\u0000%d", 127, ilIIIlIlIIIllIlIlIIl.llIIlllIIlllIIllIllI(), ilIIIlIlIIIllIlIlIIl.lIlIIlllIIlIIlIlllIl(), ilIIIlIlIIIllIlIlIIl.IIlllIIIlIlllIIlllII(), ilIIIlIlIIIllIlIlIIl.IIlIIIIIllIlIIIlIIll())));
                        break;
                    }
                    default: {
                        if (!(byteBuf.readUnsignedByte() == 1 & byteBuf.readUnsignedByte() == 250 & "MC|PingHost".equals(new String(byteBuf.readBytes(byteBuf.readShort() * 2).array(), Charsets.UTF_16BE)) & byteBuf.readUnsignedByte() >= 73 & 3 + byteBuf.readBytes(byteBuf.readShort() * 2).array().length + 4 == byteBuf.readUnsignedShort() & byteBuf.readInt() <= 65535 & byteBuf.readableBytes() == 0)) {
                            return;
                        }
                        IIIIIllIIIIlIIIIllIl.llllIIIIlIIIlIlllIll.debug("Ping: (1.6) from {}:{}", new Object[] { inetSocketAddress.getAddress(), inetSocketAddress.getPort() });
                        final ByteBuf llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(String.format("˜1\u0000%d\u0000%s\u0000%s\u0000%d\u0000%d", 127, ilIIIlIlIIIllIlIlIIl.llIIlllIIlllIIllIllI(), ilIIIlIlIIIllIlIlIIl.lIlIIlllIIlIIlIlllIl(), ilIIIlIlIIIllIlIlIIl.IIlllIIIlIlllIIlllII(), ilIIIlIlIIIllIlIlIIl.IIlIIIIIllIlIIIlIIll()));
                        try {
                            this.llllIIIIlIIIlIlllIll(channelHandlerContext, llllIIIIlIIIlIlllIll);
                        }
                        finally {
                            llllIIIIlIIIlIlllIll.release();
                        }
                        llllIIIIlIIIlIlllIll.release();
                        break;
                    }
                }
                byteBuf.release();
                b = false;
                return;
            }
        }
        catch (RuntimeException ex) {
            return;
        }
        finally {
            if (b) {
                byteBuf.resetReaderIndex();
                channelHandlerContext.channel().pipeline().remove("legacy_query");
                channelHandlerContext.fireChannelRead(o);
            }
        }
        if (b) {
            byteBuf.resetReaderIndex();
            channelHandlerContext.channel().pipeline().remove("legacy_query");
            channelHandlerContext.fireChannelRead(o);
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final ChannelHandlerContext channelHandlerContext, final ByteBuf byteBuf) {
        channelHandlerContext.pipeline().firstContext().writeAndFlush(byteBuf).addListener((GenericFutureListener<? extends Future<? super Void>>)ChannelFutureListener.CLOSE);
    }
    
    private ByteBuf llllIIIIlIIIlIlllIll(final String s) {
        final ByteBuf buffer = Unpooled.buffer();
        buffer.writeByte(255);
        final char[] charArray = s.toCharArray();
        buffer.writeShort(charArray.length);
        char[] array;
        for (int length = (array = charArray).length, i = 0; i < length; ++i) {
            buffer.writeChar(array[i]);
        }
        return buffer;
    }
}
