package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.client.*;
import net.minecraft.client.IlIlIIIllIllIIIIIllI.*;
import org.apache.logging.log4j.*;
import com.google.common.util.concurrent.*;
import java.util.concurrent.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import leaf.*;
import java.util.*;
import com.google.common.base.*;
import io.netty.handler.codec.base64.*;
import java.io.*;
import org.apache.commons.lang3.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import io.netty.buffer.*;
import java.awt.image.*;

public class k implements IIIIIIIIIlllIllIlIlI
{
    private static final Logger llllIIIIlIIIlIlllIll;
    private static final ThreadPoolExecutor IlIlIlIlIlllllllllIl;
    private static final lIllllIllIllIIllllll llIllIIIIIllIlIIIIlI;
    private static final lIllllIllIllIIllllll IlIIIlIlIIIllIlIlIIl;
    private final IlIllllIIlIIlIlIlIll IlIlIIIllIllIIIIIllI;
    private final Minecraft IllIIlllIIIIlllIIlIl;
    private final IllIIlllIIIIlllIIlIl llllIIIlIlllIlIIIIIl;
    private final lIllllIllIllIIllllll lIIIIlIIIIIlllIllIII;
    private String lIIIlllIIIllIIIllIII;
    private IlIlIlIlIlllllllllIl llIIlIIIlIIIllIlIIIl;
    private long llIllIlIIIIllIlIIllI;
    
    static {
        llllIIIIlIIIlIlllIll = LogManager.getLogger();
        IlIlIlIlIlllllllllIl = new ScheduledThreadPoolExecutor(5, new ThreadFactoryBuilder().setNameFormat("Server Pinger #%d").setDaemon(true).build());
        llIllIIIIIllIlIIIIlI = new lIllllIllIllIIllllll("textures/misc/unknown_server.png");
        IlIIIlIlIIIllIlIlIIl = new lIllllIllIllIIllllll("textures/gui/server_selection.png");
    }
    
    protected k(final IlIllllIIlIIlIlIlIll ilIlIIIllIllIIIIIllI, final IllIIlllIIIIlllIIlIl llllIIIlIlllIlIIIIIl) {
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.IllIIlllIIIIlllIIlIl = Minecraft.getMinecraft();
        this.lIIIIlIIIIIlllIllIII = new lIllllIllIllIIllllll("servers/" + llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl + "/icon");
        this.llIIlIIIlIIIllIlIIIl = (IlIlIlIlIlllllllllIl)this.IllIIlllIIIIlllIIlIl.lllIllIIIllllllIllll().IlIlIlIlIlllllllllIl(this.lIIIIlIIIIIlllIllIII);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final boolean b) {
        if (!this.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII) {
            this.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII = true;
            this.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI = -2L;
            this.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl = "";
            this.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI = "";
            k.IlIlIlIlIlllllllllIl.submit(new l(this));
        }
        final boolean b2 = this.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl > 47;
        final boolean b3 = this.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl < 47;
        final boolean b4 = b2 || b3;
        this.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll, n2 + 32 + 3, n3 + 1, 16777215);
        final List llIllIIIIIllIlIIIIlI = this.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI(this.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl, n4 - 32 - 2);
        for (int i = 0; i < Math.min(llIllIIIIIllIlIIIIlI.size(), 2); ++i) {
            this.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI.get(i), n2 + 32 + 3, n3 + 12 + this.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll * i, 8421504);
        }
        final String s = b4 ? (IlllIIIIlIIIlIlIlIIl.IlIlIIIllIllIIIIIllI + this.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl) : this.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI;
        final int llllIIIIlIIIlIlllIll = this.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(s);
        this.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(s, n2 + n4 - llllIIIIlIIIlIlllIll - 15 - 2, n3 + 1, 8421504);
        int n8 = 0;
        String s2 = null;
        int n9;
        String string;
        if (b4) {
            n9 = 5;
            string = (b2 ? "Client out of date!" : "Server out of date!");
            s2 = this.llllIIIlIlllIlIIIIIl.lIIIlllIIIllIIIllIII;
        }
        else if (this.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII && this.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI != -2L) {
            if (this.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI < 0L) {
                n9 = 5;
            }
            else if (this.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI < 150L) {
                n9 = 0;
            }
            else if (this.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI < 300L) {
                n9 = 1;
            }
            else if (this.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI < 600L) {
                n9 = 2;
            }
            else if (this.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI < 1000L) {
                n9 = 3;
            }
            else {
                n9 = 4;
            }
            if (this.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI < 0L) {
                string = "(no connection)";
            }
            else {
                string = String.valueOf(this.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI) + "ms";
                s2 = this.llllIIIlIlllIlIIIIIl.lIIIlllIIIllIIIllIII;
            }
        }
        else {
            n8 = 1;
            n9 = (int)(Minecraft.IIIllllllIllIIIlllIl() / 100L + n * 2 & 0x7L);
            if (n9 > 4) {
                n9 = 8 - n9;
            }
            string = "Pinging...";
        }
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
        this.IllIIlllIIIIlllIIlIl.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI);
        net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(n2 + n4 - 15, n3, (float)(n8 * 10), (float)(176 + n9 * 8), 10, 8, 256.0f, 256.0f);
        if (this.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI() != null && !this.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI().equals(this.lIIIlllIIIllIIIllIII)) {
            this.lIIIlllIIIllIIIllIII = this.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI();
            this.llIllIIIIIllIlIIIIlI();
            this.IlIlIIIllIllIIIIIllI.lIIIlllIIIllIIIllIII().IlIlIlIlIlllllllllIl();
        }
        if (this.llIIlIIIlIIIllIlIIIl != null) {
            this.llllIIIIlIIIlIlllIll(n2, n3, this.lIIIIlIIIIIlllIllIII);
        }
        else {
            this.llllIIIIlIIIlIlllIll(n2, n3, k.llIllIIIIIllIlIIIIlI);
        }
        final int n10 = n6 - n2;
        final int n11 = n7 - n3;
        if (n10 >= n4 - 15 && n10 <= n4 - 5 && n11 >= 0 && n11 <= 8) {
            this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(string);
        }
        else if (n10 >= n4 - llllIIIIlIIIlIlllIll - 15 - 2 && n10 <= n4 - 15 - 2 && n11 >= 0 && n11 <= 8) {
            this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(s2);
        }
        if (this.IllIIlllIIIIlllIIlIl.IIIlIIIlIlIIlllIIlll.IIlllIlIIllIlIlIlIIl || b) {
            this.IllIIlllIIIIlllIIlIl.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(k.IlIIIlIlIIIllIlIlIIl);
            net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(n2, n3, n2 + 32, n3 + 32, -1601138544);
            lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
            final int n12 = n6 - n2;
            final int n13 = n7 - n3;
            if (this.IlIlIlIlIlllllllllIl()) {
                if (n12 < 32 && n12 > 16) {
                    net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(n2, n3, 0.0f, 32.0f, 32, 32, 256.0f, 256.0f);
                }
                else {
                    net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(n2, n3, 0.0f, 0.0f, 32, 32, 256.0f, 256.0f);
                }
            }
            if (this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(this, n)) {
                if (n12 < 16 && n13 < 16) {
                    net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(n2, n3, 96.0f, 32.0f, 32, 32, 256.0f, 256.0f);
                }
                else {
                    net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(n2, n3, 96.0f, 0.0f, 32, 32, 256.0f, 256.0f);
                }
            }
            if (this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl(this, n)) {
                if (n12 < 16 && n13 > 16) {
                    net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(n2, n3, 64.0f, 32.0f, 32, 32, 256.0f, 256.0f);
                }
                else {
                    net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(n2, n3, 64.0f, 0.0f, 32, 32, 256.0f, 256.0f);
                }
            }
        }
        if (Leaf.instance.downloadPlayerData.serverData.contains(this.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl)) {
            this.IllIIlllIIIIlllIIlIl.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(new lIllllIllIllIIllllll("client/leaf.png"));
            net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(n2 - 45, n3 - 3, 0.0f, 0.0f, 50, 40, 50.0f, 40.0f);
        }
    }
    
    protected void llllIIIIlIIIlIlllIll(final int n, final int n2, final lIllllIllIllIIllllll lIllllIllIllIIllllll) {
        this.IllIIlllIIIIlllIIlIl.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll);
        lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
        net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(n, n2, 0.0f, 0.0f, 32, 32, 32.0f, 32.0f);
        lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
    }
    
    private boolean IlIlIlIlIlllllllllIl() {
        return true;
    }
    
    private void llIllIIIIIllIlIIIIlI() {
        if (this.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI() == null) {
            this.IllIIlllIIIIlllIIlIl.lllIllIIIllllllIllll().llIllIIIIIllIlIIIIlI(this.lIIIIlIIIIIlllIllIII);
            this.llIIlIIIlIIIllIlIIIl = null;
        }
        else {
            final ByteBuf copiedBuffer = Unpooled.copiedBuffer(this.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI(), Charsets.UTF_8);
            final ByteBuf decode = Base64.decode(copiedBuffer);
            BufferedImage llllIIIIlIIIlIlllIll = null;
            Label_0218: {
                try {
                    llllIIIIlIIIlIlllIll = IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(new ByteBufInputStream(decode));
                    Validate.validState(llllIIIIlIIIlIlllIll.getWidth() == 64, "Must be 64 pixels wide", new Object[0]);
                    Validate.validState(llllIIIIlIIIlIlllIll.getHeight() == 64, "Must be 64 pixels high", new Object[0]);
                    break Label_0218;
                }
                catch (Throwable t) {
                    k.llllIIIIlIIIlIlllIll.error("Invalid icon for server " + this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll + " (" + this.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl + ")", t);
                    this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll((String)null);
                }
                finally {
                    copiedBuffer.release();
                    decode.release();
                }
                return;
            }
            if (this.llIIlIIIlIIIllIlIIIl == null) {
                this.llIIlIIIlIIIllIlIIIl = new IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.getWidth(), llllIIIIlIIIlIlllIll.getHeight());
                this.IllIIlllIIIIlllIIlIl.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII, this.llIIlIIIlIIIllIlIIIl);
            }
            llllIIIIlIIIlIlllIll.getRGB(0, 0, llllIIIIlIIIlIlllIll.getWidth(), llllIIIIlIIIlIlllIll.getHeight(), this.llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI(), 0, llllIIIIlIIIlIlllIll.getWidth());
            this.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl();
        }
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        if (n5 <= 32) {
            if (n5 < 32 && n5 > 16 && this.IlIlIlIlIlllllllllIl()) {
                this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(n);
                this.IlIlIIIllIllIIIIIllI.llllIIIlIlllIlIIIIIl();
                return true;
            }
            if (n5 < 16 && n6 < 16 && this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(this, n)) {
                this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(this, n, lIIllIIIllllIlllIllI.llllIIllllIlIlIIIIll());
                return true;
            }
            if (n5 < 16 && n6 > 16 && this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl(this, n)) {
                this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl(this, n, lIIllIIIllllIlllIllI.llllIIllllIlIlIIIIll());
                return true;
            }
        }
        this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(n);
        if (Minecraft.IIIllllllIllIIIlllIl() - this.llIllIlIIIIllIlIIllI < 250L) {
            this.IlIlIIIllIllIIIIIllI.llllIIIlIlllIlIIIIIl();
        }
        this.llIllIlIIIIllIlIIllI = Minecraft.IIIllllllIllIIIlllIl();
        return false;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
    }
    
    public IllIIlllIIIIlllIIlIl llllIIIIlIIIlIlllIll() {
        return this.llllIIIlIlllIlIIIIIl;
    }
}
