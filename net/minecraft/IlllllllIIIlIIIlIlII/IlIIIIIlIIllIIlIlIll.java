package net.minecraft.IlllllllIIIlIIIlIlII;

import io.netty.handler.codec.*;
import org.apache.logging.log4j.*;
import io.netty.channel.*;
import io.netty.buffer.*;
import java.util.*;
import io.netty.util.*;
import java.io.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class IlIIIIIlIIllIIlIlIll extends ByteToMessageDecoder
{
    private static final Logger llllIIIIlIIIlIlllIll;
    private static final Marker IlIlIlIlIlllllllllIl;
    private final IllIIlllIIIIlllIIlIl llIllIIIIIllIlIIIIlI;
    
    static {
        llllIIIIlIIIlIlllIll = LogManager.getLogger();
        IlIlIlIlIlllllllllIl = MarkerManager.getMarker("PACKET_RECEIVED", IIlllIIlIllIllIlIIll.IlIlIlIlIlllllllllIl);
    }
    
    public IlIIIIIlIIllIIlIlIll(final IllIIlllIIIIlllIIlIl llIllIIIIIllIlIIIIlI) {
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    protected void decode(final ChannelHandlerContext channelHandlerContext, final ByteBuf byteBuf, final List list) {
        if (byteBuf.readableBytes() != 0) {
            final llllllIllIllIlIllllI llllllIllIllIlIllllI = new llllllIllIllIlIllllI(byteBuf);
            final int ilIIIlIlIIIllIlIlIIl = llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl();
            final IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll = channelHandlerContext.channel().attr((AttributeKey<llllIIIIlIIIlIlllIll>)IIlllIIlIllIllIlIIll.llIllIIIIIllIlIIIIlI).get().llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI, ilIIIlIlIIIllIlIlIIl);
            if (llllIIIIlIIIlIlllIll == null) {
                throw new IOException("Bad packet id " + ilIIIlIlIIIllIlIlIIl);
            }
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllllIllIllIlIllllI);
            if (llllllIllIllIlIllllI.readableBytes() > 0) {
                throw new IOException("Packet " + channelHandlerContext.channel().attr((AttributeKey<llllIIIIlIIIlIlllIll>)IIlllIIlIllIllIlIIll.llIllIIIIIllIlIIIIlI).get().llllIIIIlIIIlIlllIll() + "/" + ilIIIlIlIIIllIlIlIIl + " (" + llllIIIIlIIIlIlllIll.getClass().getSimpleName() + ") was larger than I expected, found " + llllllIllIllIlIllllI.readableBytes() + " bytes extra whilst reading packet " + ilIIIlIlIIIllIlIlIIl);
            }
            list.add(llllIIIIlIIIlIlllIll);
            if (IlIIIIIlIIllIIlIlIll.llllIIIIlIIIlIlllIll.isDebugEnabled()) {
                IlIIIIIlIIllIIlIlIll.llllIIIIlIIIlIlllIll.debug(IlIIIIIlIIllIIlIlIll.IlIlIlIlIlllllllllIl, " IN: [{}:{}] {}", new Object[] { channelHandlerContext.channel().attr((AttributeKey<Object>)IIlllIIlIllIllIlIIll.llIllIIIIIllIlIIIIlI).get(), ilIIIlIlIIIllIlIlIIl, llllIIIIlIIIlIlllIll.getClass().getName() });
            }
        }
    }
}
