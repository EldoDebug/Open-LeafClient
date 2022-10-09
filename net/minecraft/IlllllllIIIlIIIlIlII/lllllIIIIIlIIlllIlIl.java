package net.minecraft.IlllllllIIIlIIIlIlII;

import io.netty.handler.codec.*;
import org.apache.logging.log4j.*;
import io.netty.channel.*;
import io.netty.buffer.*;
import io.netty.util.*;
import java.io.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class lllllIIIIIlIIlllIlIl extends MessageToByteEncoder
{
    private static final Logger llllIIIIlIIIlIlllIll;
    private static final Marker IlIlIlIlIlllllllllIl;
    private final IllIIlllIIIIlllIIlIl llIllIIIIIllIlIIIIlI;
    
    static {
        llllIIIIlIIIlIlllIll = LogManager.getLogger();
        IlIlIlIlIlllllllllIl = MarkerManager.getMarker("PACKET_SENT", IIlllIIlIllIllIlIIll.IlIlIlIlIlllllllllIl);
    }
    
    public lllllIIIIIlIIlllIlIl(final IllIIlllIIIIlllIIlIl llIllIIIIIllIlIIIIlI) {
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    protected void llllIIIIlIIIlIlllIll(final ChannelHandlerContext channelHandlerContext, final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll, final ByteBuf byteBuf) {
        final Integer llllIIIIlIIIlIlllIll = channelHandlerContext.channel().attr((AttributeKey<llllIIIIlIIIlIlllIll>)IIlllIIlIllIllIlIIll.llIllIIIIIllIlIIIIlI).get().llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI, ilIIIIIllIlIIIlIIll);
        if (lllllIIIIIlIIlllIlIl.llllIIIIlIIIlIlllIll.isDebugEnabled()) {
            lllllIIIIIlIIlllIlIl.llllIIIIlIIIlIlllIll.debug(lllllIIIIIlIIlllIlIl.IlIlIlIlIlllllllllIl, "OUT: [{}:{}] {}", new Object[] { channelHandlerContext.channel().attr((AttributeKey<Object>)IIlllIIlIllIllIlIIll.llIllIIIIIllIlIIIIlI).get(), llllIIIIlIIIlIlllIll, ilIIIIIllIlIIIlIIll.getClass().getName() });
        }
        if (llllIIIIlIIIlIlllIll == null) {
            throw new IOException("Can't serialize unregistered packet");
        }
        final llllllIllIllIlIllllI llllllIllIllIlIllllI = new llllllIllIllIlIllllI(byteBuf);
        llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
        try {
            ilIIIIIllIlIIIlIIll.IlIlIlIlIlllllllllIl(llllllIllIllIlIllllI);
        }
        catch (Throwable t) {
            lllllIIIIIlIIlllIlIl.llllIIIIlIIIlIlllIll.error((Object)t);
        }
    }
}
