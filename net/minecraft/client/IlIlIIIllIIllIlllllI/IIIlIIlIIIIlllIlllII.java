package net.minecraft.client.IlIlIIIllIIllIlllllI;

import net.minecraft.client.*;
import org.apache.logging.log4j.*;
import com.mojang.authlib.properties.*;
import com.google.common.collect.*;
import com.google.common.base.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import tv.twitch.*;
import tv.twitch.broadcast.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.lIIIIlIIIIIlllIllIII.*;
import java.util.*;
import tv.twitch.chat.*;

public class IIIlIIlIIIIlllIlllII implements IlIIIlIlIIIllIlIlIIl, IlIlIIIllIIllIlllllI, lIIIlllIIIllIIIllIII, lllIIIIlllllIlIIllIl
{
    private static final Logger IlIlIlIlIlllllllllIl;
    public static final Marker llllIIIIlIIIlIlllIll;
    private final llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI;
    private final IllIIlllIIIIlllIIlIl IlIIIlIlIIIllIlIlIIl;
    private String IlIlIIIllIllIIIIIllI;
    private final Minecraft IllIIlllIIIIlllIIlIl;
    private final llIIIIIIlIllIIlIIIll llllIIIlIlllIlIIIIIl;
    private final Map lIIIIlIIIIIlllIllIII;
    private net.minecraft.client.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll lIIIlllIIIllIIIllIII;
    private boolean llIIlIIIlIIIllIlIIIl;
    private int llIllIlIIIIllIlIIllI;
    private long lIlIlIIIllIIllIIIllI;
    private boolean IlIlIIIllIIllIlllllI;
    private boolean IIIIlllIIIIIIlIIIlll;
    private boolean llllIIllllIlIlIIIIll;
    private boolean IlIllIlIlIIIlIlIlIII;
    private IIIIlllIIIIIIlIIIlll IIlllIIlIllIllIlIIll;
    private static boolean lllIIIIlllllIlIIllIl;
    
    static {
        IlIlIlIlIlllllllllIl = LogManager.getLogger();
        llllIIIIlIIIlIlllIll = MarkerManager.getMarker("STREAM");
        try {
            if (c.llllIIIIlIIIlIlllIll() == d.llIllIIIIIllIlIIIIlI) {
                System.loadLibrary("avutil-ttv-51");
                System.loadLibrary("swresample-ttv-0");
                System.loadLibrary("libmp3lame-ttv");
                if (System.getProperty("os.arch").contains("64")) {
                    System.loadLibrary("libmfxsw64");
                }
                else {
                    System.loadLibrary("libmfxsw32");
                }
            }
            IIIlIIlIIIIlllIlllII.lllIIIIlllllIlIIllIl = true;
        }
        catch (Throwable t) {
            IIIlIIlIIIIlllIlllII.lllIIIIlllllIlIIllIl = false;
        }
    }
    
    public IIIlIIlIIIIlllIlllII(final Minecraft illIIlllIIIIlllIIlIl, final Property property) {
        this.llllIIIlIlllIlIIIIIl = new IlIlIIIIIIlllIlIllIl("Twitch");
        this.lIIIIlIIIIIlllIllIII = Maps.newHashMap();
        this.llIllIlIIIIllIlIIllI = 30;
        this.lIlIlIIIllIIllIIIllI = 0L;
        this.IlIlIIIllIIllIlllllI = false;
        this.IIlllIIlIllIllIlIIll = net.minecraft.client.IlIlIIIllIIllIlllllI.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llIllIIIIIllIlIIIIlI = new llllIIIIlIIIlIlllIll();
        this.IlIIIlIlIIIllIlIlIIl = new IllIIlllIIIIlllIIlIl();
        this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this);
        this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this);
        this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll("nmt37qblda36pvonovdkbopzfzw3wlq");
        this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll("nmt37qblda36pvonovdkbopzfzw3wlq");
        this.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl().llllIIIIlIIIlIlllIll(IlllIIIIlIIIlIlIlIIl.IllIIlllIIIIlllIIlIl);
        if (property != null && !Strings.isNullOrEmpty(property.getValue()) && lIIIIlIlIllllIIlIllI.lIlIlIIIllIIllIIIllI) {
            final IlIlIllllllllIIIIlII ilIlIllllllllIIIIlII = new IlIlIllllllllIIIIlII(this, "Twitch authenticator", property);
            ilIlIllllllllIIIIlII.setDaemon(true);
            ilIlIllllllllIIIIlII.start();
        }
    }
    
    @Override
    public void IllIIlllIIIIlllIIlIl() {
        IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.debug(IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll, "Shutdown streaming");
        this.llIllIIIIIllIlIIIIlI.lllIIIIlllllIlIIllIl();
        this.IlIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl();
    }
    
    @Override
    public void llllIIIlIlllIlIIIIIl() {
        final int ilIllllIIlIIlIlIlIll = this.IllIIlllIIIIlllIIlIl.IIIlIIIlIlIIlllIIlll.IlIllllIIlIIlIlIlIll;
        final boolean b = this.IlIlIIIllIllIIIIIllI != null && this.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI(this.IlIlIIIllIllIIIIIllI);
        final boolean b2 = this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll() == net.minecraft.client.IlIlIIIllIIllIlllllI.llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI && (this.IlIlIIIllIllIIIIIllI == null || this.IlIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl(this.IlIlIIIllIllIIIIIllI) == net.minecraft.client.IlIlIIIllIIllIlllllI.llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI);
        if (ilIllllIIlIIlIlIlIll == 2) {
            if (b) {
                IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.debug(IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll, "Disconnecting from twitch chat per user options");
                this.IlIIIlIlIIIllIlIlIIl.IllIIlllIIIIlllIIlIl(this.IlIlIIIllIllIIIIIllI);
            }
        }
        else if (ilIllllIIlIIlIlIlIll == 1) {
            if (b2 && this.llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII()) {
                IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.debug(IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll, "Connecting to twitch chat per user options");
                this.llIIlllIIlllIIllIllI();
            }
        }
        else if (ilIllllIIlIIlIlIlIll == 0) {
            if (b && !this.llIllIlIIIIllIlIIllI()) {
                IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.debug(IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll, "Disconnecting from twitch chat as user is no longer streaming");
                this.IlIIIlIlIIIllIlIlIIl.IllIIlllIIIIlllIIlIl(this.IlIlIIIllIllIIIIIllI);
            }
            else if (b2 && this.llIllIlIIIIllIlIIllI()) {
                IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.debug(IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll, "Connecting to twitch chat as user is streaming");
                this.llIIlllIIlllIIllIllI();
            }
        }
        this.llIllIIIIIllIlIIIIlI.IIlIIIIlllIlllllIlII();
        this.IlIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI();
    }
    
    protected void llIIlllIIlllIIllIllI() {
        final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll = this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll();
        final String name = this.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI().name;
        this.IlIlIIIllIllIIIIIllI = name;
        if (llllIIIIlIIIlIlllIll != net.minecraft.client.IlIlIIIllIIllIlllllI.llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI) {
            IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.warn("Invalid twitch chat state {}", new Object[] { llllIIIIlIIIlIlllIll });
        }
        else if (this.IlIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl(this.IlIlIIIllIllIIIIIllI) == net.minecraft.client.IlIlIIIllIIllIlllllI.llIllIlIIIIllIlIIllI.IlIlIIIllIllIIIIIllI) {
            this.IlIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI(name);
        }
        else {
            IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.warn("Invalid twitch chat state {}", new Object[] { llllIIIIlIIIlIlllIll });
        }
    }
    
    @Override
    public void lIIIIlIIIIIlllIllIII() {
        if (this.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl() && !this.llIllIIIIIllIlIIIIlI.llllIIIlIlllIlIIIIIl()) {
            final long nanoTime = System.nanoTime();
            if (nanoTime - this.lIlIlIIIllIIllIIIllI >= 1000000000 / this.llIllIlIIIIllIlIIllI) {
                final FrameBuffer lllllIlIIIlIlIIlllII = this.llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII();
                final net.minecraft.client.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll ilIlIlIlIlllllllllIl = this.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl();
                this.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(true);
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5889);
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIIIlIlIllIIlIlIlII();
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(0.0, this.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI, this.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl, 0.0, 1000.0, 3000.0);
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5888);
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIIIlIlIllIIlIlIlII();
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, 0.0f, -2000.0f);
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0, 0, this.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI, this.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl);
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll();
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI();
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
                final float n = (float)this.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI;
                final float n2 = (float)this.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl;
                final float n3 = ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI / (float)ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;
                final float n4 = ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl / (float)ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl;
                ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI();
                GL11.glTexParameterf(3553, 10241, 9729.0f);
                GL11.glTexParameterf(3553, 10240, 9729.0f);
                final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll = IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
                final lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
                llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII);
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(0.0, n2, 0.0).llllIIIIlIIIlIlllIll(0.0, n4).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n, n2, 0.0).llllIIIIlIIIlIlllIll(n3, n4).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n, 0.0, 0.0).llllIIIIlIIIlIlllIll(n3, 0.0).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(0.0, 0.0, 0.0).llllIIIIlIIIlIlllIll(0.0, 0.0).IlIlIIIllIllIIIIIllI();
                llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
                ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl();
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5889);
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5888);
                this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(lllllIlIIIlIlIIlllII);
                this.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI();
                this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(lllllIlIIIlIlIIlllII);
                this.lIlIlIIIllIIllIIIllI = nanoTime;
            }
        }
    }
    
    @Override
    public boolean lIIIlllIIIllIIIllIII() {
        return this.llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII();
    }
    
    @Override
    public boolean llIIlIIIlIIIllIlIIIl() {
        return this.llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI();
    }
    
    @Override
    public boolean llIllIlIIIIllIlIIllI() {
        return this.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl();
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI, final long n) {
        if (this.llIllIlIIIIllIlIIllI() && this.llIIlIIIlIIIllIlIIIl) {
            final long lIlIlIIIllIIllIIIllI = this.llIllIIIIIllIlIIIIlI.lIlIlIIIllIIllIIIllI();
            if (!this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(illIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI(), lIlIlIIIllIIllIIIllI + n, illIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(), illIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl())) {
                IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.warn(IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll, "Couldn't send stream metadata action at {}: {}", new Object[] { lIlIlIIIllIIllIIIllI + n, illIIllIIIlIlIIIIlI });
            }
            else {
                IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.debug(IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll, "Sent stream metadata action at {}: {}", new Object[] { lIlIlIIIllIIllIIIllI + n, illIIllIIIlIlIIIIlI });
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI, final long n, final long n2) {
        if (this.llIllIlIIIIllIlIIllI() && this.llIIlIIIlIIIllIlIIIl) {
            final long lIlIlIIIllIIllIIIllI = this.llIllIIIIIllIlIIIIlI.lIlIlIIIllIIllIIIllI();
            final String llllIIIIlIIIlIlllIll = illIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll();
            final String ilIlIlIlIlllllllllIl = illIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl();
            final long ilIlIlIlIlllllllllIl2 = this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(illIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI(), lIlIlIIIllIIllIIIllI + n, llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl);
            if (ilIlIlIlIlllllllllIl2 < 0L) {
                IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.warn(IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll, "Could not send stream metadata sequence from {} to {}: {}", new Object[] { lIlIlIIIllIIllIIIllI + n, lIlIlIIIllIIllIIIllI + n2, illIIllIIIlIlIIIIlI });
            }
            else if (this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(illIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI(), lIlIlIIIllIIllIIIllI + n2, ilIlIlIlIlllllllllIl2, llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl)) {
                IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.debug(IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll, "Sent stream metadata sequence from {} to {}: {}", new Object[] { lIlIlIIIllIIllIIIllI + n, lIlIlIIIllIIllIIIllI + n2, illIIllIIIlIlIIIIlI });
            }
            else {
                IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.warn(IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll, "Half-sent stream metadata sequence from {} to {}: {}", new Object[] { lIlIlIIIllIIllIIIllI + n, lIlIlIIIllIIllIIIllI + n2, illIIllIIIlIlIIIIlI });
            }
        }
    }
    
    @Override
    public boolean lIlIlIIIllIIllIIIllI() {
        return this.llIllIIIIIllIlIIIIlI.llllIIIlIlllIlIIIIIl();
    }
    
    @Override
    public void IlIlIIIllIIllIlllllI() {
        if (this.llIllIIIIIllIlIIIIlI.IIllIIllIIIlIlIIIIlI()) {
            IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.debug(IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll, "Requested commercial from Twitch");
        }
        else {
            IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.warn(IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll, "Could not request commercial from Twitch");
        }
    }
    
    @Override
    public void IIIIlllIIIIIIlIIIlll() {
        this.llIllIIIIIllIlIIIIlI.IlIlIIIlIIlIlIIlllIl();
        this.llllIIllllIlIlIIIIll = true;
        this.IlIllIlIlIIIlIlIlIII();
    }
    
    @Override
    public void llllIIllllIlIlIIIIll() {
        this.llIllIIIIIllIlIIIIlI.IlllllllIIIlIIIlIlII();
        this.llllIIllllIlIlIIIIll = false;
        this.IlIllIlIlIIIlIlIlIII();
    }
    
    @Override
    public void IlIllIlIlIIIlIlIlIII() {
        if (this.llIllIlIIIIllIlIIllI()) {
            final float iIllllIIIlIIIIIIllIl = this.IllIIlllIIIIlllIIlIl.IIIlIIIlIlIIlllIIlll.IIllllIIIlIIIIIIllIl;
            this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl((this.llllIIllllIlIlIIIIll || iIllllIIIlIIIIIIllIl <= 0.0f) ? 0.0f : iIllllIIIlIIIIIIllIl);
            this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.lllllIlIIIlIlIIlllII() ? 0.0f : this.IllIIlllIIIIlllIIlIl.IIIlIIIlIlIIlllIIlll.IIIIIIIIIlllIllIlIlI);
        }
    }
    
    @Override
    public void IIlllIIlIllIllIlIIll() {
        final net.minecraft.client.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll iiIlIIIlIlIIlllIIlll = this.IllIIlllIIIIlllIIlIl.IIIlIIIlIlIIlllIIlll;
        final VideoParams llllIIIIlIIIlIlllIll = this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(IlIlIlIlIlllllllllIl(iiIlIIIlIlIIlllIIlll.IlllIIIIlIIIlIlIlIIl), llllIIIIlIIIlIlllIll(iiIlIIIlIlIIlllIIlll.lllIllIIIllllllIllll), llIllIIIIIllIlIIIIlI(iiIlIIIlIlIIlllIIlll.IIIIIllIIIIlIIIIllIl), this.IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl / (float)this.IllIIlllIIIIlllIIlIl.IlIlIIIllIllIIIIIllI);
        switch (iiIlIIIlIlIIlllIIlll.llIllIlIlIIIIIIIllII) {
            case 0: {
                llllIIIIlIIIlIlllIll.encodingCpuUsage = EncodingCpuUsage.TTV_ECU_LOW;
                break;
            }
            case 1: {
                llllIIIIlIIIlIlllIll.encodingCpuUsage = EncodingCpuUsage.TTV_ECU_MEDIUM;
                break;
            }
            case 2: {
                llllIIIIlIIIlIlllIll.encodingCpuUsage = EncodingCpuUsage.TTV_ECU_HIGH;
                break;
            }
        }
        if (this.lIIIlllIIIllIIIllIII == null) {
            this.lIIIlllIIIllIIIllIII = new net.minecraft.client.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.outputWidth, llllIIIIlIIIlIlllIll.outputHeight, false);
        }
        else {
            this.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.outputWidth, llllIIIIlIIIlIlllIll.outputHeight);
        }
        if (iiIlIIIlIlIIlllIIlll.IllIllIIIIlIIlIlllII != null && iiIlIIIlIlIIlllIIlll.IllIllIIIIlIIlIlllII.length() > 0) {
            IngestServer[] ilIlIIIIIIlllIlIllIl;
            for (int length = (ilIlIIIIIIlllIlIllIl = this.IlIlIIIIIIlllIlIllIl()).length, i = 0; i < length; ++i) {
                final IngestServer ingestServer = ilIlIIIIIIlllIlIllIl[i];
                if (ingestServer.serverUrl.equals(iiIlIIIlIlIIlllIIlll.IllIllIIIIlIIlIlllII)) {
                    this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(ingestServer);
                    break;
                }
            }
        }
        this.llIllIlIIIIllIlIIllI = llllIIIIlIIIlIlllIll.targetFps;
        this.llIIlIIIlIIIllIlIIIl = iiIlIIIlIlIIlllIIlll.IIlIlIlIIlIllIIIIIIl;
        this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
        IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.info(IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll, "Streaming at {}/{} at {} kbps to {}", new Object[] { llllIIIIlIIIlIlllIll.outputWidth, llllIIIIlIIIlIlllIll.outputHeight, llllIIIIlIIIlIlllIll.maxKbps, this.llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII().serverUrl });
        this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(null, "Minecraft", null);
    }
    
    @Override
    public void lllIIIIlllllIlIIllIl() {
        if (this.llIllIIIIIllIlIIIIlI.IIIlIIIlIlIIlllIIlll()) {
            IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.info(IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll, "Stopped streaming to Twitch");
        }
        else {
            IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.warn(IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll, "Could not stop streaming to Twitch");
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final ErrorCode errorCode, final AuthToken authToken) {
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final ErrorCode errorCode) {
        if (ErrorCode.succeeded(errorCode)) {
            IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.debug(IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll, "Login attempt successful");
            this.IIIIlllIIIIIIlIIIlll = true;
        }
        else {
            IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.warn(IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll, "Login attempt unsuccessful: {} (error code {})", new Object[] { ErrorCode.getString(errorCode), errorCode.getValue() });
            this.IIIIlllIIIIIIlIIIlll = false;
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final ErrorCode errorCode, final GameInfo[] array) {
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI) {
        IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.debug(IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll, "Broadcast state changed to {}", new Object[] { ilIlIIIllIllIIIIIllI });
        if (ilIlIIIllIllIIIIIllI == net.minecraft.client.IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl) {
            this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(net.minecraft.client.IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll() {
        IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.info(IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll, "Logged out of twitch");
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final StreamInfo streamInfo) {
        IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.debug(IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll, "Stream info updated; {} viewers on stream ID {}", new Object[] { streamInfo.viewers, streamInfo.streamId });
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IngestList list) {
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final ErrorCode errorCode) {
        IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.warn(IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll, "Issue submitting frame: {} (Error code {})", new Object[] { ErrorCode.getString(errorCode), errorCode.getValue() });
        this.IllIIlllIIIIlllIIlIl.lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl().llllIIIIlIIIlIlllIll(new IlIlIIIIIIlllIlIllIl("Issue streaming frame: " + errorCode + " (" + ErrorCode.getString(errorCode) + ")"), 2);
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl() {
        this.IlIllIlIlIIIlIlIlIII();
        IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.info(IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll, "Broadcast to Twitch has started");
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI() {
        IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.info(IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll, "Broadcast to Twitch has stopped");
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final ErrorCode errorCode) {
        if (errorCode == ErrorCode.TTV_EC_SOUNDFLOWER_NOT_INSTALLED) {
            final net.minecraft.IlllllllIIIlIIIlIlII.IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI = new net.minecraft.IlllllllIIIlIIIlIlII.IIllIIllIIIlIlIIIIlI("stream.unavailable.soundflower.chat.link", new Object[0]);
            illIIllIIIlIlIIIIlI.llllIIIlIlllIlIIIIIl().llllIIIIlIIIlIlllIll(new net.minecraft.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(net.minecraft.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll, "https://help.mojang.com/customer/portal/articles/1374877-configuring-soundflower-for-streaming-on-apple-computers"));
            illIIllIIIlIlIIIIlI.llllIIIlIlllIlIIIIIl().IlIIIlIlIIIllIlIlIIl(true);
            final net.minecraft.IlllllllIIIlIIIlIlII.IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI2 = new net.minecraft.IlllllllIIIlIIIlIlII.IIllIIllIIIlIlIIIIlI("stream.unavailable.soundflower.chat", new Object[] { illIIllIIIlIlIIIIlI });
            illIIllIIIlIlIIIIlI2.llllIIIlIlllIlIIIIIl().llllIIIIlIIIlIlllIll(IlllIIIIlIIIlIlIlIIl.IlIlIIIllIllIIIIIllI);
            this.IllIIlllIIIIlllIIlIl.lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl().llllIIIIlIIIlIlllIll(illIIllIIIlIlIIIIlI2);
        }
        else {
            final net.minecraft.IlllllllIIIlIIIlIlII.IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI3 = new net.minecraft.IlllllllIIIlIIIlIlII.IIllIIllIIIlIlIIIIlI("stream.unavailable.unknown.chat", new Object[] { ErrorCode.getString(errorCode) });
            illIIllIIIlIlIIIIlI3.llllIIIlIlllIlIIIIIl().llllIIIIlIIIlIlllIll(IlllIIIIlIIIlIlIlIIl.IlIlIIIllIllIIIIIllI);
            this.IllIIlllIIIIlllIIlIl.lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl().llllIIIIlIIIlIlllIll(illIIllIIIlIlIIIIlI3);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll, final net.minecraft.client.IlIlIIIllIIllIlllllI.IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl) {
        IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.debug(IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll, "Ingest test state changed to {}", new Object[] { ilIlIIIIIIlllIlIllIl });
        if (ilIlIIIIIIlllIlIllIl == net.minecraft.client.IlIlIIIllIIllIlllllI.IlIlIIIIIIlllIlIllIl.IllIIlllIIIIlllIIlIl) {
            this.IlIlIIIllIIllIlllllI = true;
        }
    }
    
    public static int llllIIIIlIIIlIlllIll(final float n) {
        return llIllIIlllllllllllll.IlIIIlIlIIIllIlIlIIl(10.0f + n * 50.0f);
    }
    
    public static int IlIlIlIlIlllllllllIl(final float n) {
        return llIllIIlllllllllllll.IlIIIlIlIIIllIlIlIIl(230.0f + n * 3270.0f);
    }
    
    public static float llIllIIIIIllIlIIIIlI(final float n) {
        return 0.1f + n * 0.1f;
    }
    
    @Override
    public IngestServer[] IlIlIIIIIIlllIlIllIl() {
        return this.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl().getServers();
    }
    
    @Override
    public void IIllIIllIIIlIlIIIIlI() {
        final llllIIllllIlIlIIIIll ilIlIllllllllIIIIlII = this.llIllIIIIIllIlIIIIlI.IlIlIllllllllIIIIlII();
        if (ilIlIllllllllIIIIlII != null) {
            ilIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll(this);
        }
    }
    
    @Override
    public llllIIllllIlIlIIIIll IIIlIIIlIlIIlllIIlll() {
        return this.llIllIIIIIllIlIIIIlI.llIllIlIIIIllIlIIllI();
    }
    
    @Override
    public boolean IlIlIIIlIIlIlIIlllIl() {
        return this.llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl();
    }
    
    @Override
    public int IlllllllIIIlIIIlIlII() {
        return this.llIllIlIIIIllIlIIllI() ? this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl().viewers : 0;
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl(final ErrorCode errorCode) {
        if (ErrorCode.failed(errorCode)) {
            IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.error(IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll, "Chat failed to initialize");
        }
    }
    
    @Override
    public void IlIlIIIllIllIIIIIllI(final ErrorCode errorCode) {
        if (ErrorCode.failed(errorCode)) {
            IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.error(IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll, "Chat failed to shutdown");
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final String s, final ChatRawMessage[] array) {
        for (final ChatRawMessage chatRawMessage : array) {
            this.llllIIIIlIIIlIlllIll(chatRawMessage.userName, chatRawMessage);
            if (this.llllIIIIlIIIlIlllIll(chatRawMessage.modes, chatRawMessage.subscriptions, this.IllIIlllIIIIlllIIlIl.IIIlIIIlIlIIlllIIlll.IllIllIlllIllllIIllI)) {
                final IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl = new IlIlIIIIIIlllIlIllIl(chatRawMessage.userName);
                final net.minecraft.IlllllllIIIlIIIlIlII.IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI = new net.minecraft.IlllllllIIIlIIIlIlII.IIllIIllIIIlIlIIIIlI("chat.stream." + (chatRawMessage.action ? "emote" : "text"), new Object[] { this.llllIIIlIlllIlIIIIIl, ilIlIIIIIIlllIlIllIl, IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll(chatRawMessage.message) });
                if (chatRawMessage.action) {
                    illIIllIIIlIlIIIIlI.llllIIIlIlllIlIIIIIl().IlIlIlIlIlllllllllIl(true);
                }
                final IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl2 = new IlIlIIIIIIlllIlIllIl("");
                ilIlIIIIIIlllIlIllIl2.llllIIIIlIIIlIlllIll(new net.minecraft.IlllllllIIIlIIIlIlII.IIllIIllIIIlIlIIIIlI("stream.userinfo.chatTooltip", new Object[0]));
                for (final llIIIIIIlIllIIlIIIll llIIIIIIlIllIIlIIIll : net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(chatRawMessage.modes, chatRawMessage.subscriptions, null)) {
                    ilIlIIIIIIlllIlIllIl2.IlIlIlIlIlllllllllIl("\n");
                    ilIlIIIIIIlllIlIllIl2.llllIIIIlIIIlIlllIll(llIIIIIIlIllIIlIIIll);
                }
                ilIlIIIIIIlllIlIllIl.llllIIIlIlllIlIIIIIl().llllIIIIlIIIlIlllIll(new llIllIIIIIllIlIIIIlI(net.minecraft.lIIIIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll, ilIlIIIIIIlllIlIllIl2));
                ilIlIIIIIIlllIlIllIl.llllIIIlIlllIlIIIIIl().llllIIIIlIIIlIlllIll(new net.minecraft.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(net.minecraft.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl, chatRawMessage.userName));
                this.IllIIlllIIIIlllIIlIl.lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl().llllIIIIlIIIlIlllIll(illIIllIIIlIlIIIIlI);
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final String s, final ChatTokenizedMessage[] array) {
    }
    
    private void llllIIIIlIIIlIlllIll(final String displayName, final ChatRawMessage chatRawMessage) {
        ChatUserInfo chatUserInfo = this.lIIIIlIIIIIlllIllIII.get(displayName);
        if (chatUserInfo == null) {
            chatUserInfo = new ChatUserInfo();
            chatUserInfo.displayName = displayName;
            this.lIIIIlIIIIIlllIllIII.put(displayName, chatUserInfo);
        }
        chatUserInfo.subscriptions = chatRawMessage.subscriptions;
        chatUserInfo.modes = chatRawMessage.modes;
        chatUserInfo.nameColorARGB = chatRawMessage.nameColorARGB;
    }
    
    private boolean llllIIIIlIIIlIlllIll(final Set set, final Set set2, final int n) {
        return !set.contains(ChatUserMode.TTV_CHAT_USERMODE_BANNED) && (set.contains(ChatUserMode.TTV_CHAT_USERMODE_ADMINSTRATOR) || set.contains(ChatUserMode.TTV_CHAT_USERMODE_MODERATOR) || set.contains(ChatUserMode.TTV_CHAT_USERMODE_STAFF) || n == 0 || (n == 1 && set2.contains(ChatUserSubscription.TTV_CHAT_USERSUB_SUBSCRIBER)));
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final String s, final ChatUserInfo[] array, final ChatUserInfo[] array2, final ChatUserInfo[] array3) {
        for (int length = array2.length, i = 0; i < length; ++i) {
            this.lIIIIlIIIIIlllIllIII.remove(array2[i].displayName);
        }
        for (final ChatUserInfo chatUserInfo : array3) {
            this.lIIIIlIIIIIlllIllIII.put(chatUserInfo.displayName, chatUserInfo);
        }
        for (final ChatUserInfo chatUserInfo2 : array) {
            this.lIIIIlIIIIIlllIllIII.put(chatUserInfo2.displayName, chatUserInfo2);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final String s) {
        IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.debug(IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll, "Chat connected");
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final String s) {
        IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.debug(IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll, "Chat disconnected");
        this.lIIIIlIIIIIlllIllIII.clear();
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final String s, final String s2) {
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
    }
    
    @Override
    public void IlIlIIIllIllIIIIIllI() {
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final String s) {
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl(final String s) {
    }
    
    @Override
    public boolean IIlIIIIlllIlllllIlII() {
        return this.IlIlIIIllIllIIIIIllI != null && this.IlIlIIIllIllIIIIIllI.equals(this.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI().name);
    }
    
    @Override
    public String IIIlIIlIIIIlllIlllII() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    @Override
    public ChatUserInfo IlIlIIIllIllIIIIIllI(final String s) {
        return this.lIIIIlIIIIIlllIllIII.get(s);
    }
    
    @Override
    public void IllIIlllIIIIlllIIlIl(final String s) {
        this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this.IlIlIIIllIllIIIIIllI, s);
    }
    
    @Override
    public boolean IlIlIllllllllIIIIlII() {
        return IIIlIIlIIIIlllIlllII.lllIIIIlllllIlIIllIl && this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll();
    }
    
    @Override
    public ErrorCode IIlllIlIIllIlIlIlIIl() {
        return IIIlIIlIIIIlllIlllII.lllIIIIlllllIlIIllIl ? this.llIllIIIIIllIlIIIIlI.IIIIlllIIIIIIlIIIlll() : ErrorCode.TTV_EC_OS_TOO_OLD;
    }
    
    @Override
    public boolean llIIIlIlIllIIlIlIlII() {
        return this.IIIIlllIIIIIIlIIIlll;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final boolean ilIllIlIlIIIlIlIlIII) {
        this.IlIllIlIlIIIlIlIlIII = ilIllIlIlIIIlIlIlIII;
        this.IlIllIlIlIIIlIlIlIII();
    }
    
    @Override
    public boolean lllllIlIIIlIlIIlllII() {
        final boolean b = this.IllIIlllIIIIlllIIlIl.IIIlIIIlIlIIlllIIlll.llIlIIIIIlIIlIlIIlll == 1;
        return this.llllIIllllIlIlIIIIll || this.IllIIlllIIIIlllIIlIl.IIIlIIIlIlIIlllIIlll.IIIIIIIIIlllIllIlIlI <= 0.0f || b != this.IlIllIlIlIIIlIlIlIII;
    }
    
    @Override
    public IIIIlllIIIIIIlIIIlll lIllllllIIllIlIlIlII() {
        return this.IIlllIIlIllIllIlIIll;
    }
}
