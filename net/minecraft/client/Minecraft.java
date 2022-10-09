package net.minecraft.client;

import net.minecraft.IlIllIlIlIIIlIlIlIII.*;
import net.minecraft.client.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.IlIlIlIlIlllllllllIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.client.llllIIIIlIIIlIlllIll.*;
import com.mojang.authlib.minecraft.*;
import org.apache.logging.log4j.*;
import com.mojang.authlib.yggdrasil.*;
import javax.imageio.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import leaf.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll.*;
import com.mojang.authlib.properties.*;
import net.minecraft.client.IlIlIIIllIIllIlllllI.*;
import org.lwjgl.*;
import org.apache.commons.io.*;
import java.io.*;
import java.awt.image.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import org.lwjgl.util.glu.*;
import java.text.*;
import org.lwjgl.input.*;
import leaf.setting.*;
import java.net.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import java.nio.*;
import org.lwjgl.opengl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import org.apache.commons.lang3.*;
import com.google.common.util.concurrent.*;
import java.util.concurrent.*;
import com.google.common.collect.*;
import java.util.*;

public class Minecraft implements llllIIIIlIIIlIlllIll, lIlIIlllIIlIIlIlllIl
{
    private static final Logger IIIIIIIIIlllIllIlIlI;
    private static final lIllllIllIllIIllllll IIllllIIIlIIIIIIllIl;
    public static final boolean llllIIIIlIIIlIlllIll;
    public static byte[] IlIlIlIlIlllllllllIl;
    private static final List IlllIIIIlIIIlIlIlIIl;
    private final File lllIllIIIllllllIllll;
    private final PropertyMap llIllIlIlIIIIIIIllII;
    private final PropertyMap IIlIlIlIIlIllIIIIIIl;
    private IllIIlllIIIIlllIIlIl IllIllIIIIlIIlIlllII;
    private IIlllIIlIllIllIlIIll IlIllllIIlIIlIlIlIll;
    private static Minecraft IllIllIlllIllllIIllI;
    public IlIIIlIlIIIllIlIlIIl llIllIIIIIllIlIIIIlI;
    private boolean llIlIIIIIlIIlIlIIlll;
    private boolean IlIIlIlIIIlIIlIlIlII;
    private boolean IllIlIIllIllIIlIllII;
    private net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll lIIlIIIlIllIlIllIIIl;
    public int IlIIIlIlIIIllIlIlIIl;
    public int IlIlIIIllIllIIIIIllI;
    private boolean IIlIIIlllIllIllIlIII;
    private llllIlIllllIIlIIlIlI lIlIlIlllIIlIlIlllIl;
    private IlIlIlIlIlllllllllIl llIIIIIIlIllIIlIIIll;
    public llIIlIIIlIIIllIlIIIl IllIIlllIIIIlllIIlIl;
    public lllllIIIIIlIlIIIIIIl llllIIIlIlllIlIIIIIl;
    private lllIllIIIllllllIllll lIIIIlIlIllllIIlIllI;
    private IIlllIlIIllIlIlIlIIl llIIIlIlllIllIIlIllI;
    private llIIIIIIlIllIIlIIIll IlIIllIIllIIllIIlIIl;
    public llIllIIIIIllIlIIIIlI lIIIIlIIIIIlllIllIII;
    private net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI lllllIIIIIlIlIIIIIIl;
    public net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI lIIIlllIIIllIIIllIII;
    public net.minecraft.client.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIIlIIIlIIIllIlIIIl;
    public Session session;
    private boolean IllIIlllllIIllIIllIl;
    public FontRenderer lIlIlIIIllIIllIIIllI;
    public FontRenderer IlIlIIIllIIllIlllllI;
    public lIIllIIIllllIlllIllI IIIIlllIIIIIIlIIIlll;
    public net.minecraft.client.llIllIIIIIllIlIIIIlI llllIIllllIlIlIIIIll;
    public IIllIIllIIIlIlIIIIlI IlIllIlIlIIIlIlIlIII;
    private int lIllIIIIIlllIIlIIllI;
    private int lIlIIlllIIlIIlIlllIl;
    private int llIIIllIlIllIllIIIIl;
    private net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl IIIllIIIlIlIIllIIIlI;
    public net.minecraft.client.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll IIlllIIlIllIllIlIIll;
    public llIIIlIlIllIIlIlIlII lllIIIIlllllIlIIllIl;
    public boolean IlIlIIIIIIlllIlIllIl;
    public llIlllIlllllIIllIIII IIllIIllIIIlIlIIIIlI;
    public net.minecraft.client.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll IIIlIIIlIlIIlllIIlll;
    public IIIllIIllIIIIIIlIIlI IlIlIIIlIIlIlIIlllIl;
    public final File mcDataDir;
    private final File IIlllIIlllIIIlIlllII;
    private final String IlIIlllllIIllIIlllll;
    private final Proxy lllllIIlIlIIIlIlIIIl;
    private net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI IIlllllIllIllIlIlIII;
    private static int llllIllllIllllIlIlII;
    private int IIlIlIllllIlllIIIIll;
    private String lIIllIIIllllIlllIllI;
    private int IllIlIllIllIlllIIlll;
    public boolean IIlIIIIlllIlllllIlII;
    long IIIlIIlIIIIlllIlllII;
    private int IIllIIIlIIlIlIlIIIII;
    public final lIIlIIIlIllIlIllIIIl IlIlIllllllllIIIIlII;
    long IIlllIlIIllIlIlIlIIl;
    private final boolean llIllIIlllllllllllll;
    private final boolean lllllIIllIlIllIllllI;
    private net.minecraft.IlIlIIIllIIllIlllllI.IIlllIIlIllIllIlIIll IlIIIIIlIIllIIlIlIll;
    private boolean IllllIIlIlIllIIIllII;
    public final net.minecraft.IlIllIlIlIIIlIlIlIII.IlIIIlIlIIIllIlIlIIl llIIIlIlIllIIlIlIlII;
    private long lllllIIIIIlIIlllIlIl;
    private llIllIlIIIIllIlIIllI IlIllllIIIlIllIlIIll;
    private final lIIIlllIIIllIIIllIII lIIIIIlIlIIIlIIIIlIl;
    private final List IIllIIIlIIIIlIIlIIII;
    private final net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI IIIllIIllIIIIIIlIIlI;
    private IIIlIIlIIIIlllIlllII IIIIIIIllllIlIIIIIII;
    private net.minecraft.client.llIIlIIIlIIIllIlIIIl.IIlllIIlIllIllIlIIll IIlllIIIllIllIIlIlIl;
    private IlIlIIIllIIllIlllllI llIlllIlllllIIllIIII;
    private net.minecraft.client.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll lllllIlIlIlllIlllIlI;
    private IlIlIIIIIIlllIlIllIl IlIllllIIlIllIlIlIll;
    private IlIllIlIlIIIlIlIlIII lllIlIIIIIlIlllllIlI;
    private net.minecraft.client.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII llIlIIIIllIlIIlIlIII;
    private lIllllIllIllIIllllll IIIIIlllIlIIIIIIIllI;
    private final MinecraftSessionService llllllIIIIIIIlllIIll;
    private IIlIIIIIllIlIIIlIIll IIlIlllIlIlllIlIllll;
    private final Queue lIllllIllIllIIllllll;
    private long lllIIIIlIlIllIIlIIIl;
    private final Thread IllIlllIllIIIIllllII;
    private net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl lIllIlIIIllllllIIlII;
    private net.minecraft.client.lIIIlllIIIllIIIllIII.IlIllIlIlIIIlIlIlIII IlIllIIllIIlIIIIlIIl;
    volatile boolean lllllIlIIIlIlIIlllII;
    public String lIllllllIIllIlIlIlII;
    public boolean llIIlllIIlllIIllIllI;
    public boolean IIlllIIIlIlllIIlllII;
    public boolean IIlIIIIIllIlIIIlIIll;
    public boolean llllllIllIllIlIllllI;
    long IIIllllllIllIIIlllIl;
    int IlIIIlIIIllllIlIlIlI;
    long IIIIIllIIIIlIIIIllIl;
    private String lIIlllIlllllIIlllIll;
    private static volatile /* synthetic */ int[] lIllIIlIlIlllllIIIII;
    private static volatile /* synthetic */ int[] lIIlIIIIIIIlIIlIlIIl;
    
    static {
        IIIIIIIIIlllIllIlIlI = LogManager.getLogger();
        IIllllIIIlIIIIIIllIl = new lIllllIllIllIIllllll("textures/gui/title/mojang.png");
        llllIIIIlIIIlIlllIll = (c.llllIIIIlIIIlIlllIll() == d.IlIIIlIlIIIllIlIlIIl);
        Minecraft.IlIlIlIlIlllllllllIl = new byte[10485760];
        IlllIIIIlIIIlIlIlIIl = Lists.newArrayList((Object[])new DisplayMode[] { new DisplayMode(2560, 1600), new DisplayMode(2880, 1800) });
    }
    
    public Minecraft(final net.minecraft.client.main.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        this.IlIIlIlIIIlIIlIlIlII = true;
        this.IIlIIIlllIllIllIlIII = false;
        this.lIlIlIlllIIlIlIlllIl = new llllIlIllllIIlIIlIlI(20.0f);
        this.llIIIIIIlIllIIlIIIll = new IlIlIlIlIlllllllllIl("client", this, net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.lllllIIllIlIllIllllI());
        this.IIIlIIlIIIIlllIlllII = IIIllllllIllIIIlllIl();
        this.IlIlIllllllllIIIIlII = new lIIlIIIlIllIlIllIIIl();
        this.IIlllIlIIllIlIlIlIIl = System.nanoTime();
        this.llIIIlIlIllIIlIlIlII = new net.minecraft.IlIllIlIlIIIlIlIlIII.IlIIIlIlIIIllIlIlIIl();
        this.lllllIIIIIlIIlllIlIl = -1L;
        this.lIIIIIlIlIIIlIIIIlIl = new lIIIlllIIIllIIIllIII();
        this.IIllIIIlIIIIlIIlIIII = Lists.newArrayList();
        this.lIllllIllIllIIllllll = Queues.newArrayDeque();
        this.lllIIIIlIlIllIIlIIIl = 0L;
        this.IllIlllIllIIIIllllII = Thread.currentThread();
        this.lllllIlIIIlIlIIlllII = true;
        this.lIllllllIIllIlIlIlII = "";
        this.llIIlllIIlllIIllIllI = false;
        this.IIlllIIIlIlllIIlllII = false;
        this.IIlIIIIIllIlIIIlIIll = false;
        this.llllllIllIllIlIllllI = true;
        this.IIIllllllIllIIIlllIl = IIIllllllIllIIIlllIl();
        this.IIIIIllIIIIlIIIIllIl = -1L;
        this.lIIlllIlllllIIlllIll = "root";
        Minecraft.IllIllIlllIllllIIllI = this;
        this.mcDataDir = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll;
        this.IIlllIIlllIIIlIlllII = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI;
        this.lllIllIIIllllllIllll = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;
        this.IlIIlllllIIllIIlllll = llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl;
        this.llIllIlIlIIIIIIIllII = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl;
        this.IIlIlIlIIlIllIIIIIIl = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI;
        this.IIIllIIllIIIIIIlIIlI = new net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI(new net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIIIIIIlllIlIllIl(llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI, llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll());
        this.lllllIIlIlIIIlIlIIIl = ((llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl == null) ? Proxy.NO_PROXY : llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl);
        this.llllllIIIIIIIlllIIll = new YggdrasilAuthenticationService(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl, UUID.randomUUID().toString()).createMinecraftSessionService();
        this.session = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll;
        Minecraft.IIIIIIIIIlllIllIlIlI.info("Setting user: " + this.session.llIllIIIIIllIlIIIIlI());
        Minecraft.IIIIIIIIIlllIllIlIlI.info("(Session ID is " + this.session.llllIIIIlIIIlIlllIll() + ")");
        this.lllllIIllIlIllIllllI = llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll;
        this.IlIIIlIlIIIllIlIlIIl = ((llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll > 0) ? llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll : 1);
        this.IlIlIIIllIllIIIIIllI = ((llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl > 0) ? llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl : 1);
        this.lIlIIlllIIlIIlIlllIl = llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;
        this.llIIIllIlIllIllIIIIl = llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl;
        this.llIlIIIIIlIIlIlIIlll = llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI;
        this.llIllIIlllllllllllll = llIllIIlllllllllllll();
        this.IIIllIIIlIlIIllIIIlI = new net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this);
        if (llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll != null) {
            this.lIIllIIIllllIlllIllI = llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll;
            this.IllIlIllIllIlllIIlll = llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl;
        }
        ImageIO.setUseCache(false);
        net.minecraft.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI();
    }
    
    public void llllIIIIlIIIlIlllIll() {
        this.lllllIlIIIlIlIIlllII = true;
        try {
            this.IIlllllIllIllIlIlIII();
        }
        catch (Throwable t) {
            final net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(t, "Initializing game");
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll("Initialization");
            this.IlIlIlIlIlllllllllIl(this.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll));
            return;
        }
        try {
            do {
                if (this.IllIlIIllIllIIlIllII) {
                    if (this.lIIlIIIlIllIlIllIIIl != null) {
                        this.IlIlIlIlIlllllllllIl(this.lIIlIIIlIllIlIllIIIl);
                        continue;
                    }
                }
                try {
                    this.IllllIIlIlIllIIIllII();
                }
                catch (OutOfMemoryError outOfMemoryError) {
                    this.lIlIlIIIllIIllIIIllI();
                    this.llllIIIIlIIIlIlllIll(new llIllIlIlIIIIIIIllII());
                    System.gc();
                }
            } while (this.lllllIlIIIlIlIIlllII);
        }
        catch (lIIIIIlIlIIIlIIIIlIl liiiiIlIlIIIlIIIIlIl) {}
        catch (IIlIlllIlIlllIlIllll ilIlllIlIlllIlIllll) {
            this.llIllIIIIIllIlIIIIlI(ilIlllIlIlllIlIllll.llllIIIIlIIIlIlllIll());
            this.lIlIlIIIllIIllIIIllI();
            Minecraft.IIIIIIIIIlllIllIlIlI.fatal("Reported exception thrown!", (Throwable)ilIlllIlIlllIlIllll);
            this.IlIlIlIlIlllllllllIl(ilIlllIlIlllIlIllll.llllIIIIlIIIlIlllIll());
        }
        catch (Throwable t2) {
            final net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI(new net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll("Unexpected error", t2));
            this.lIlIlIIIllIIllIIIllI();
            Minecraft.IIIIIIIIIlllIllIlIlI.fatal("Unreported exception thrown!", t2);
            this.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI);
        }
        finally {
            this.llllIIIlIlllIlIIIIIl();
        }
        this.llllIIIlIlllIlIIIIIl();
    }
    
    private void IIlllllIllIllIlIlIII() {
        this.IIIlIIIlIlIIlllIIlll = new net.minecraft.client.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(this, this.mcDataDir);
        this.IIllIIIlIIIIlIIlIIII.add(this.IIIllIIllIIIIIIlIIlI);
        this.lllllIIllIlIllIllllI();
        if (this.IIIlIIIlIlIIlllIIlll.lllllIlIIIlIlIIlllII > 0 && this.IIIlIIIlIlIIlllIIlll.llIIIlIlIllIIlIlIlII > 0) {
            this.IlIIIlIlIIIllIlIlIIl = this.IIIlIIIlIlIIlllIIlll.llIIIlIlIllIIlIlIlII;
            this.IlIlIIIllIllIIIIIllI = this.IIIlIIIlIlIIlllIIlll.lllllIlIIIlIlIIlllII;
        }
        Minecraft.IIIIIIIIIlllIllIlIlI.info("LWJGL Version: " + Sys.getVersion());
        this.IIllIIIlIIlIlIlIIIII();
        this.IllIlIllIllIlllIIlll();
        this.lIIllIIIllllIlllIllI();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll();
        (this.lllllIlIlIlllIlllIlI = new net.minecraft.client.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl, this.IlIlIIIllIllIIIIIllI, true)).llllIIIIlIIIlIlllIll(0.0f, 0.0f, 0.0f, 0.0f);
        this.llllIllllIllllIlIlII();
        this.IIIIIIIllllIlIIIIIII = new IIIlIIlIIIIlllIlllII(this.lllIllIIIllllllIllll, new File(this.mcDataDir, "server-resource-packs"), this.IIIllIIllIIIIIIlIIlI, this.lIIIIIlIlIIIlIIIIlIl, this.IIIlIIIlIlIIlllIIlll);
        this.IlIllllIIIlIllIlIIll = new lIllllllIIllIlIlIlII(this.lIIIIIlIlIIIlIIIIlIl);
        this.IIlllIIIllIllIIlIlIl = new net.minecraft.client.llIIlIIIlIIIllIlIIIl.IIlllIIlIllIllIlIIll(this.lIIIIIlIlIIIlIIIIlIl, this.IIIlIIIlIlIIlllIIlll.lllIIIIlIlIllIIlIIIl);
        this.IlIllllIIIlIllIlIIll.llllIIIIlIIIlIlllIll(this.IIlllIIIllIllIIlIlIl);
        this.IlIlIIIllIllIIIIIllI();
        this.IlIllllIIlIIlIlIlIll = new IIlllIIlIllIllIlIIll(this.IlIllllIIIlIllIlIIll);
        this.IlIllllIIIlIllIlIIll.llllIIIIlIIIlIlllIll(this.IlIllllIIlIIlIlIlIll);
        this.llllIIIIlIIIlIlllIll(this.IlIllllIIlIIlIlIlIll);
        this.IIlIlIllllIlllIIIIll();
        this.IIlIlllIlIlllIlIllll = new IIlIIIIIllIlIIIlIIll(this.IlIllllIIlIIlIlIlIll, new File(this.IIlllIIlllIIIlIlllII, "skins"), this.llllllIIIIIIIlllIIll);
        this.IIlllllIllIllIlIlIII = new net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(new File(this.mcDataDir, "saves"));
        this.lllIlIIIIIlIlllllIlI = new IlIllIlIlIIIlIlIlIII(this.IlIllllIIIlIllIlIIll, this.IIIlIIIlIlIIlllIIlll);
        this.IlIllllIIIlIllIlIIll.llllIIIIlIIIlIlllIll(this.lllIlIIIIIlIlllllIlI);
        this.llIlIIIIllIlIIlIlIII = new net.minecraft.client.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII(this);
        this.lIlIlIIIllIIllIIIllI = new FontRenderer(this.IIIlIIIlIlIIlllIIlll, new lIllllIllIllIIllllll("textures/font/ascii.png"), this.IlIllllIIlIIlIlIlIll, false);
        if (this.IIIlIIIlIlIIlllIIlll.lllIIIIlIlIllIIlIIIl != null) {
            this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl());
            this.lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(this.IIlllIIIllIllIIlIlIl.IlIlIlIlIlllllllllIl());
        }
        this.IlIlIIIllIIllIlllllI = new FontRenderer(this.IIIlIIIlIlIIlllIIlll, new lIllllIllIllIIllllll("textures/font/ascii_sga.png"), this.IlIllllIIlIIlIlIlIll, false);
        this.IlIllllIIIlIllIlIIll.llllIIIIlIIIlIlllIll(this.lIlIlIIIllIIllIIIllI);
        this.IlIllllIIIlIllIlIIll.llllIIIIlIIIlIlllIll(this.IlIlIIIllIIllIlllllI);
        this.IlIllllIIIlIllIlIIll.llllIIIIlIIIlIlllIll(new net.minecraft.client.llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII());
        this.IlIllllIIIlIllIlIIll.llllIIIIlIIIlIlllIll(new lIIIIlIIIIIlllIllIII());
        net.minecraft.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(new IlIlIIIllIllIIIIIllI(this));
        this.IlIlIIIlIIlIlIIlllIl = new IIIllIIllIIIIIIlIIlI();
        this.llllIIIIlIIIlIlllIll("Pre startup");
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIIlIIIlIIIllIlIIIl(7425);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(1.0);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIIlIIIlIIIllIlIIIl();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(515);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(516, 0.1f);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIIIllIllIIIIIllI(1029);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5889);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIIIlIlIllIIlIlIlII();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5888);
        this.llllIIIIlIIIlIlllIll("Startup");
        (this.IlIllllIIlIllIlIlIll = new IlIlIIIIIIlllIlIllIl("textures")).llllIIIIlIIIlIlllIll(this.IIIlIIIlIlIIlllIIlll.IlIIIlIIIllllIlIlIlI);
        this.IlIllllIIlIIlIlIlIll.llllIIIIlIIIlIlllIll(net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl, this.IlIllllIIlIllIlIlIll);
        this.IlIllllIIlIIlIlIlIll.llllIIIIlIIIlIlllIll(net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl);
        this.IlIllllIIlIllIlIlIll.llllIIIIlIIIlIlllIll(false, this.IIIlIIIlIlIIlllIIlll.IlIIIlIIIllllIlIlIlI > 0);
        this.lIllIlIIIllllllIIlII = new net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl(this.IlIllllIIlIllIlIlIll);
        this.IlIllllIIIlIllIlIIll.llllIIIIlIIIlIlllIll(this.lIllIlIIIllllllIIlII);
        this.llIIIlIlllIllIIlIllI = new IIlllIlIIllIlIlIlIIl(this.IlIllllIIlIIlIlIlIll, this.lIllIlIIIllllllIIlII);
        this.lIIIIlIlIllllIIlIllI = new lllIllIIIllllllIllll(this.IlIllllIIlIIlIlIlIll, this.llIIIlIlllIllIIlIllI);
        this.IlIIllIIllIIllIIlIIl = new llIIIIIIlIllIIlIIIll(this);
        this.IlIllllIIIlIllIlIIll.llllIIIIlIIIlIlllIll(this.llIIIlIlllIllIIlIllI);
        this.IlIllIlIlIIIlIlIlIII = new IIllIIllIIIlIlIIIIlI(this, this.IlIllllIIIlIllIlIIll);
        this.IlIllllIIIlIllIlIIll.llllIIIIlIIIlIlllIll(this.IlIllIlIlIIIlIlIlIII);
        this.IlIllIIllIIlIIIIlIIl = new net.minecraft.client.lIIIlllIIIllIIIllIII.IlIllIlIlIIIlIlIlIII(this.lIllIlIIIllllllIIlII.llIllIIIIIllIlIIIIlI(), this.IIIlIIIlIlIIlllIIlll);
        this.IlIllllIIIlIllIlIIll.llllIIIIlIIIlIlllIll(this.IlIllIIllIIlIIIIlIIl);
        this.llllIIIlIlllIlIIIIIl = new lllllIIIIIlIlIIIIIIl(this);
        this.IlIllllIIIlIllIlIIll.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl);
        this.IIlllIIlIllIllIlIIll = new net.minecraft.client.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0, 0, this.IlIIIlIlIIIllIlIlIIl, this.IlIlIIIllIllIIIIIllI);
        this.llIIlIIIlIIIllIlIIIl = new net.minecraft.client.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI(this.IllIIlllIIIIlllIIlIl, this.IlIllllIIlIIlIlIlIll);
        this.llllIIIIlIIIlIlllIll("Post startup");
        this.lllIIIIlllllIlIIllIl = new llIIIlIlIllIIlIlIlII(this);
        Leaf.instance.init();
        Leaf.instance.startDiscord("954367073415471106");
        if (this.lIIllIIIllllIlllIllI != null) {
            this.llllIIIIlIIIlIlllIll(new net.minecraft.client.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl(new net.minecraft.client.llIllIIIIIllIlIIIIlI.lllIllIIIllllllIllll(), this, this.lIIllIIIllllIlllIllI, this.IllIlIllIllIlllIIlll));
        }
        else {
            this.llllIIIIlIIIlIlllIll(new net.minecraft.client.llIllIIIIIllIlIIIIlI.lllIllIIIllllllIllll());
        }
        this.IlIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI(this.IIIIIlllIlIIIIIIIllI);
        this.IIIIIlllIlIIIIIIIllI = null;
        this.llllIIllllIlIlIIIIll = new net.minecraft.client.llIllIIIIIllIlIIIIlI(this);
        if (this.IIIlIIIlIlIIlllIIlll.IlIlIIIIIIlllIlIllIl && !this.llIlIIIIIlIIlIlIIlll) {
            this.IIlllIIlIllIllIlIIll();
        }
        try {
            Display.setVSyncEnabled(this.IIIlIIIlIlIIlllIIlll.IIllIIllIIIlIlIIIIlI);
        }
        catch (OpenGLException ex) {
            this.IIIlIIIlIlIIlllIIlll.IIllIIllIIIlIlIIIIlI = false;
            this.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl();
        }
        this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll();
    }
    
    private void llllIllllIllllIlIlII() {
        this.lIIIIIlIlIIIlIIIIlIl.llllIIIIlIIIlIlllIll(new net.minecraft.client.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll.IlIllIlIlIIIlIlIlIII(), net.minecraft.client.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll.class);
        this.lIIIIIlIlIIIlIIIIlIl.llllIIIIlIIIlIlllIll(new net.minecraft.client.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl(), net.minecraft.client.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.class);
        this.lIIIIIlIlIIIlIIIIlIl.llllIIIIlIIIlIlllIll(new net.minecraft.client.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(), net.minecraft.client.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.class);
        this.lIIIIIlIlIIIlIIIIlIl.llllIIIIlIIIlIlllIll(new net.minecraft.client.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll.IIIIlllIIIIIIlIIIlll(), net.minecraft.client.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI.class);
        this.lIIIIIlIlIIIlIIIIlIl.llllIIIIlIIIlIlllIll(new lIlIlIIIllIIllIIIllI(), net.minecraft.client.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI.class);
    }
    
    private void IIlIlIllllIlllIIIIll() {
        try {
            this.llIlllIlllllIIllIIII = new net.minecraft.client.IlIlIIIllIIllIlllllI.IIIlIIlIIIIlllIlllII(this, (Property)Iterables.getFirst((Iterable)this.llIllIlIlIIIIIIIllII.get((Object)"twitch_access_token"), (Object)null));
        }
        catch (Throwable t) {
            this.llIlllIlllllIIllIIII = new IIlIIIIlllIlllllIlII(t);
            Minecraft.IIIIIIIIIlllIllIlIlI.error("Couldn't initialize twitch stream");
        }
    }
    
    private void lIIllIIIllllIlllIllI() {
        Display.setResizable(true);
        Display.setTitle("LeafClient 4.0");
        try {
            Display.create(new PixelFormat().withDepthBits(24));
        }
        catch (LWJGLException ex) {
            Minecraft.IIIIIIIIIlllIllIlIlI.error("Couldn't set pixel format", (Throwable)ex);
            try {
                Thread.sleep(1000L);
            }
            catch (InterruptedException ex2) {}
            if (this.llIlIIIIIlIIlIlIIlll) {
                this.IlIIIIIlIIllIIlIlIll();
            }
            Display.create();
        }
    }
    
    private void IllIlIllIllIlllIIlll() {
        if (this.llIlIIIIIlIIlIlIIlll) {
            Display.setFullscreen(true);
            final DisplayMode displayMode = Display.getDisplayMode();
            this.IlIIIlIlIIIllIlIlIIl = Math.max(1, displayMode.getWidth());
            this.IlIlIIIllIllIIIIIllI = Math.max(1, displayMode.getHeight());
        }
        else {
            Display.setDisplayMode(new DisplayMode(this.IlIIIlIlIIIllIlIlIIl, this.IlIlIIIllIllIIIIIllI));
        }
    }
    
    private void IIllIIIlIIlIlIlIIIII() {
        if (c.llllIIIIlIIIlIlllIll() != d.IlIIIlIlIIIllIlIlIIl) {
            InputStream llIllIIIIIllIlIIIIlI = null;
            InputStream llIllIIIIIllIlIIIIlI2 = null;
            try {
                llIllIIIIIllIlIIIIlI = this.IIIllIIllIIIIIIlIIlI.llIllIIIIIllIlIIIIlI(new lIllllIllIllIIllllll("icons/icon_16x16.png"));
                llIllIIIIIllIlIIIIlI2 = this.IIIllIIllIIIIIIlIIlI.llIllIIIIIllIlIIIIlI(new lIllllIllIllIIllllll("icons/icon_32x32.png"));
                if (llIllIIIIIllIlIIIIlI != null && llIllIIIIIllIlIIIIlI2 != null) {
                    Display.setIcon(new ByteBuffer[] { this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI), this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI2) });
                }
            }
            catch (IOException ex) {
                Minecraft.IIIIIIIIIlllIllIlIlI.error("Couldn't set icon", (Throwable)ex);
                return;
            }
            finally {
                IOUtils.closeQuietly(llIllIIIIIllIlIIIIlI);
                IOUtils.closeQuietly(llIllIIIIIllIlIIIIlI2);
            }
            IOUtils.closeQuietly(llIllIIIIIllIlIIIIlI);
            IOUtils.closeQuietly(llIllIIIIIllIlIIIIlI2);
        }
    }
    
    private static boolean llIllIIlllllllllllll() {
        String[] array;
        for (int length = (array = new String[] { "sun.arch.data.model", "com.ibm.vm.bitmode", "os.arch" }).length, i = 0; i < length; ++i) {
            final String property = System.getProperty(array[i]);
            if (property != null && property.contains("64")) {
                return true;
            }
        }
        return false;
    }
    
    public net.minecraft.client.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll IlIlIlIlIlllllllllIl() {
        return this.lllllIlIlIlllIlllIlI;
    }
    
    public String llIllIIIIIllIlIIIIlI() {
        return this.IlIIlllllIIllIIlllll;
    }
    
    private void lllllIIllIlIllIllllI() {
        final net.minecraft.client.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = new net.minecraft.client.IIIIlllIIIIIIlIIIlll(this, "Timer hack thread");
        iiiIlllIIIIIIlIIIlll.setDaemon(true);
        iiiIlllIIIIIIlIIIlll.start();
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll liIlIIIlIllIlIllIIIl) {
        this.IllIlIIllIllIIlIllII = true;
        this.lIIlIIIlIllIlIllIIIl = liIlIIIlIllIlIllIIIl;
    }
    
    public void IlIlIlIlIlllllllllIl(final net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final File file = new File(new File(getMinecraft().mcDataDir, "crash-reports"), "crash-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date()) + "-client.txt");
        net.minecraft.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl());
        if (llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI() != null) {
            net.minecraft.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("#@!@# Game crashed! Crash report saved to: #@!@# " + llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI());
            System.exit(-1);
        }
        else if (llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(file)) {
            net.minecraft.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("#@!@# Game crashed! Crash report saved to: #@!@# " + file.getAbsolutePath());
            System.exit(-1);
        }
        else {
            net.minecraft.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("#@?@# Game crashed! Crash report could not be saved. #@?@#");
            System.exit(-2);
        }
    }
    
    public boolean IlIIIlIlIIIllIlIlIIl() {
        return this.IIlllIIIllIllIIlIlIl.llllIIIIlIIIlIlllIll() || this.IIIlIIIlIlIIlllIIlll.IllIlllIllIIIIllllII;
    }
    
    public void IlIlIIIllIllIIIIIllI() {
        final ArrayList arrayList = Lists.newArrayList((Iterable)this.IIllIIIlIIIIlIIlIIII);
        final Iterator<net.minecraft.client.llIIlIIIlIIIllIlIIIl.lllllIlIIIlIlIIlllII> iterator = this.IIIIIIIllllIlIIIIIII.llIllIIIIIllIlIIIIlI().iterator();
        while (iterator.hasNext()) {
            arrayList.add(iterator.next().llIllIIIIIllIlIIIIlI());
        }
        if (this.IIIIIIIllllIlIIIIIII.IlIlIIIllIllIIIIIllI() != null) {
            arrayList.add(this.IIIIIIIllllIlIIIIIII.IlIlIIIllIllIIIIIllI());
        }
        try {
            this.IlIllllIIIlIllIlIIll.llllIIIIlIIIlIlllIll(arrayList);
        }
        catch (RuntimeException ex) {
            Minecraft.IIIIIIIIIlllIllIlIlI.info("Caught error stitching, removing all assigned resourcepacks", (Throwable)ex);
            arrayList.clear();
            arrayList.addAll(this.IIllIIIlIIIIlIIlIIII);
            this.IIIIIIIllllIlIIIIIII.llllIIIIlIIIlIlllIll(Collections.emptyList());
            this.IlIllllIIIlIllIlIIll.llllIIIIlIIIlIlllIll(arrayList);
            this.IIIlIIIlIlIIlllIIlll.llIllIlIIIIllIlIIllI.clear();
            this.IIIlIIIlIlIIlllIIlll.lIlIlIIIllIIllIIIllI.clear();
            this.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl();
        }
        this.IIlllIIIllIllIIlIlIl.llllIIIIlIIIlIlllIll(arrayList);
        if (this.llllIIIlIlllIlIIIIIl != null) {
            this.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl();
        }
    }
    
    private ByteBuffer llllIIIIlIIIlIlllIll(final InputStream inputStream) {
        final BufferedImage read = ImageIO.read(inputStream);
        final int[] rgb = read.getRGB(0, 0, read.getWidth(), read.getHeight(), null, 0, read.getWidth());
        final ByteBuffer allocate = ByteBuffer.allocate(4 * rgb.length);
        int[] array;
        for (int length = (array = rgb).length, i = 0; i < length; ++i) {
            final int n = array[i];
            allocate.putInt(n << 8 | (n >> 24 & 0xFF));
        }
        allocate.flip();
        return allocate;
    }
    
    private void IlIIIIIlIIllIIlIlIll() {
        final HashSet hashSet = Sets.newHashSet();
        Collections.addAll(hashSet, Display.getAvailableDisplayModes());
        DisplayMode desktopDisplayMode = Display.getDesktopDisplayMode();
        if (!hashSet.contains(desktopDisplayMode) && c.llllIIIIlIIIlIlllIll() == d.IlIIIlIlIIIllIlIlIIl) {
            for (final DisplayMode displayMode : Minecraft.IlllIIIIlIIIlIlIlIIl) {
                boolean b = true;
                for (final DisplayMode displayMode2 : hashSet) {
                    if (displayMode2.getBitsPerPixel() == 32 && displayMode2.getWidth() == displayMode.getWidth() && displayMode2.getHeight() == displayMode.getHeight()) {
                        b = false;
                        break;
                    }
                }
                if (!b) {
                    for (final DisplayMode displayMode3 : hashSet) {
                        if (displayMode3.getBitsPerPixel() == 32 && displayMode3.getWidth() == displayMode.getWidth() / 2 && displayMode3.getHeight() == displayMode.getHeight() / 2) {
                            desktopDisplayMode = displayMode3;
                            break;
                        }
                    }
                }
            }
        }
        Display.setDisplayMode(desktopDisplayMode);
        this.IlIIIlIlIIIllIlIlIIl = desktopDisplayMode.getWidth();
        this.IlIlIIIllIllIIIIIllI = desktopDisplayMode.getHeight();
    }
    
    private void llllIIIIlIIIlIlllIll(final IIlllIIlIllIllIlIIll illlIIlIllIllIlIIll) {
        final g g = new g(this);
        final int ilIlIIIllIllIIIIIllI = g.IlIlIIIllIllIIIIIllI();
        final net.minecraft.client.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = new net.minecraft.client.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(g.llllIIIIlIIIlIlllIll() * ilIlIIIllIllIIIIIllI, g.IlIlIlIlIlllllllllIl() * ilIlIIIllIllIIIIIllI, true);
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(false);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5889);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIIIlIlIllIIlIlIlII();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(0.0, g.llllIIIIlIIIlIlllIll(), g.IlIlIlIlIlllllllllIl(), 0.0, 1000.0, 3000.0);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5888);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIIIlIlIllIIlIlIlII();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, 0.0f, -2000.0f);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IIIIlllIIIIIIlIIIlll();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll();
        InputStream llllIIIIlIIIlIlllIll2 = null;
        Label_0204: {
            try {
                llllIIIIlIIIlIlllIll2 = this.IIIllIIllIIIIIIlIIlI.llllIIIIlIIIlIlllIll(Minecraft.IIllllIIIlIIIIIIllIl);
                illlIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(this.IIIIIlllIlIIIIIIIllI = illlIIlIllIllIlIIll.llllIIIIlIIIlIlllIll("logo", new net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl(ImageIO.read(llllIIIIlIIIlIlllIll2))));
            }
            catch (IOException ex) {
                Minecraft.IIIIIIIIIlllIllIlIlI.error("Unable to load logo: " + Minecraft.IIllllIIIlIIIIIIllIl, (Throwable)ex);
                break Label_0204;
            }
            finally {
                IOUtils.closeQuietly(llllIIIIlIIIlIlllIll2);
            }
            IOUtils.closeQuietly(llllIIIIlIIIlIlllIll2);
        }
        final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll3 = net.minecraft.client.lIIIlllIIIllIIIllIII.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
        final net.minecraft.client.lIIIlllIIIllIIIllIII.lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll3.llIllIIIIIllIlIIIIlI();
        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI);
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(0.0, this.IlIlIIIllIllIIIIIllI, 0.0).llllIIIIlIIIlIlllIll(0.0, 0.0).IlIlIlIlIlllllllllIl(255, 255, 255, 255).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this.IlIIIlIlIIIllIlIlIIl, this.IlIlIIIllIllIIIIIllI, 0.0).llllIIIIlIIIlIlllIll(0.0, 0.0).IlIlIlIlIlllllllllIl(255, 255, 255, 255).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this.IlIIIlIlIIIllIlIlIIl, 0.0, 0.0).llllIIIIlIIIlIlllIll(0.0, 0.0).IlIlIlIlIlllllllllIl(255, 255, 255, 255).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(0.0, 0.0, 0.0).llllIIIIlIIIlIlllIll(0.0, 0.0).IlIlIlIlIlllllllllIl(255, 255, 255, 255).IlIlIIIllIllIIIIIllI();
        llllIIIIlIIIlIlllIll3.IlIlIlIlIlllllllllIl();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
        final int n = 256;
        final int n2 = 256;
        this.llllIIIIlIIIlIlllIll((g.llllIIIIlIIIlIlllIll() - n) / 2, (g.IlIlIlIlIlllllllllIl() - n2) / 2, 0, 0, n, n2, 255, 255, 255, 255);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IIIIlllIIIIIIlIIIlll();
        llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI();
        llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(g.llllIIIIlIIIlIlllIll() * ilIlIIIllIllIIIIIllI, g.IlIlIlIlIlllllllllIl() * ilIlIIIllIllIIIIIllI);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(516, 0.1f);
        this.lIIIIlIIIIIlllIllIII();
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final int n9, final int n10) {
        final float n11 = 0.00390625f;
        final float n12 = 0.00390625f;
        final net.minecraft.client.lIIIlllIIIllIIIllIII.lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = net.minecraft.client.lIIIlllIIIllIIIllIII.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll().llIllIIIIIllIlIIIIlI();
        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI);
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n, n2 + n6, 0.0).llllIIIIlIIIlIlllIll(n3 * n11, (n4 + n6) * n12).IlIlIlIlIlllllllllIl(n7, n8, n9, n10).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + n5, n2 + n6, 0.0).llllIIIIlIIIlIlllIll((n3 + n5) * n11, (n4 + n6) * n12).IlIlIlIlIlllllllllIl(n7, n8, n9, n10).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + n5, n2, 0.0).llllIIIIlIIIlIlllIll((n3 + n5) * n11, n4 * n12).IlIlIlIlIlllllllllIl(n7, n8, n9, n10).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n, n2, 0.0).llllIIIIlIIIlIlllIll(n3 * n11, n4 * n12).IlIlIlIlIlllllllllIl(n7, n8, n9, n10).IlIlIIIllIllIIIIIllI();
        net.minecraft.client.lIIIlllIIIllIIIllIII.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll().IlIlIlIlIlllllllllIl();
    }
    
    public net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI IllIIlllIIIIlllIIlIl() {
        return this.IIlllllIllIllIlIlIII;
    }
    
    public void llllIIIIlIIIlIlllIll(lIIllIIIllllIlllIllI iiiIlllIIIIIIlIIIlll) {
        if (this.IIIIlllIIIIIIlIIIlll != null) {
            this.IIIIlllIIIIIIlIIIlll.o_();
        }
        if (iiiIlllIIIIIIlIIIlll == null && this.IllIIlllIIIIlllIIlIl == null) {
            iiiIlllIIIIIIlIIIlll = new net.minecraft.client.llIllIIIIIllIlIIIIlI.lllIllIIIllllllIllll();
        }
        else if (iiiIlllIIIIIIlIIIlll == null && this.lIIIIlIIIIIlllIllIII.N() <= 0.0f) {
            iiiIlllIIIIIIlIIIlll = new IlIlIllllllllIIIIlII();
        }
        if (iiiIlllIIIIIIlIIIlll instanceof net.minecraft.client.llIllIIIIIllIlIIIIlI.lllIllIIIllllllIllll) {
            this.IIIlIIIlIlIIlllIIlll.IIIIIIIllllIlIIIIIII = false;
            this.lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl().llllIIIIlIIIlIlllIll();
        }
        if ((this.IIIIlllIIIIIIlIIIlll = iiiIlllIIIIIIlIIIlll) != null) {
            this.llllIIllllIlIlIIIIll();
            final g g = new g(this);
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(this, g.llllIIIIlIIIlIlllIll(), g.IlIlIlIlIlllllllllIl());
            this.IlIlIIIIIIlllIlIllIl = false;
        }
        else {
            this.lllIlIIIIIlIlllllIlI.IlIlIIIllIllIIIIIllI();
            this.IIIIlllIIIIIIlIIIlll();
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final String s) {
        if (this.IlIIlIlIIIlIIlIlIlII) {
            final int glGetError = GL11.glGetError();
            if (glGetError != 0) {
                final String gluErrorString = GLU.gluErrorString(glGetError);
                Minecraft.IIIIIIIIIlllIllIlIlI.error("########## GL ERROR ##########");
                Minecraft.IIIIIIIIIlllIllIlIlI.error("@ " + s);
                Minecraft.IIIIIIIIIlllIllIlIlI.error(String.valueOf(glGetError) + ": " + gluErrorString);
            }
        }
    }
    
    public void llllIIIlIlllIlIIIIIl() {
        try {
            this.llIlllIlllllIIllIIII.IllIIlllIIIIlllIIlIl();
            Minecraft.IIIIIIIIIlllIllIlIlI.info("Stopping!");
            try {
                this.llllIIIIlIIIlIlllIll((llIIlIIIlIIIllIlIIIl)null);
            }
            catch (Throwable t) {}
            this.lllIlIIIIIlIlllllIlI.IlIIIlIlIIIllIlIlIIl();
        }
        finally {
            Display.destroy();
            if (!this.IllIlIIllIllIIlIllII) {
                System.exit(0);
            }
        }
        Display.destroy();
        if (!this.IllIlIIllIllIIlIllII) {
            System.exit(0);
        }
        System.gc();
    }
    
    private void IllllIIlIlIllIIIllII() {
        final long nanoTime = System.nanoTime();
        this.llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll("root");
        if (Display.isCreated() && Display.isCloseRequested()) {
            this.IlIlIIIllIIllIlllllI();
        }
        if (this.IllIIlllllIIllIIllIl && this.IllIIlllIIIIlllIIlIl != null) {
            final float llIllIIIIIllIlIIIIlI = this.lIlIlIlllIIlIlIlllIl.llIllIIIIIllIlIIIIlI;
            this.lIlIlIlllIIlIlIlllIl.llllIIIIlIIIlIlllIll();
            this.lIlIlIlllIIlIlIlllIl.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        }
        else {
            this.lIlIlIlllIIlIlIlllIl.llllIIIIlIIIlIlllIll();
        }
        this.llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll("scheduledExecutables");
        synchronized (this.lIllllIllIllIIllllll) {
            while (!this.lIllllIllIllIIllllll.isEmpty()) {
                c.llllIIIIlIIIlIlllIll(this.lIllllIllIllIIllllll.poll(), Minecraft.IIIIIIIIIlllIllIlIlI);
            }
        }
        // monitorexit(this.lIllllIllIllIIllllll)
        this.llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl();
        final long nanoTime2 = System.nanoTime();
        this.llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll("tick");
        for (int i = 0; i < this.lIlIlIlllIIlIlIlllIl.IlIlIlIlIlllllllllIl; ++i) {
            this.IlIlIIIIIIlllIlIllIl();
        }
        this.llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI("preRenderErrors");
        final long n = System.nanoTime() - nanoTime2;
        this.llllIIIIlIIIlIlllIll("Pre render");
        this.llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI("sound");
        this.lllIlIIIIIlIlllllIlI.llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII, this.lIlIlIlllIIlIlIlllIl.llIllIIIIIllIlIIIIlI);
        this.llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl();
        this.llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll("render");
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI(16640);
        this.lllllIlIlIlllIlllIlI.llllIIIIlIIIlIlllIll(true);
        this.llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll("display");
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll();
        if (this.lIIIIlIIIIIlllIllIII != null && this.lIIIIlIIIIIlllIllIII.IIlIlIllllIlllIIIIll()) {
            this.IIIlIIIlIlIIlllIIlll.IIIllIIllIIIIIIlIIlI = 0;
        }
        this.llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl();
        if (!this.IlIlIIIIIIlllIlIllIl) {
            this.llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI("gameRenderer");
            this.IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(this.lIlIlIlllIIlIlIlllIl.llIllIIIIIllIlIIIIlI, nanoTime);
            this.llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl();
        }
        this.llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl();
        if (this.IIIlIIIlIlIIlllIIlll.IIIIIIIllllIlIIIIIII && this.IIIlIIIlIlIIlllIIlll.IIlllIIIllIllIIlIlIl && !this.IIIlIIIlIlIIlllIIlll.IIllIIIlIIIIlIIlIIII) {
            if (!this.llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll) {
                this.llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll();
            }
            this.llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll = true;
            this.llllIIIIlIIIlIlllIll(n);
        }
        else {
            this.llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll = false;
            this.IIIIIllIIIIlIIIIllIl = System.nanoTime();
        }
        this.IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll();
        this.lllllIlIlIlllIlllIlI.IlIlIIIllIllIIIIIllI();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
        this.lllllIlIlIlllIlllIlI.llIllIIIIIllIlIIIIlI(this.IlIIIlIlIIIllIlIlIIl, this.IlIlIIIllIllIIIIIllI);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
        this.IlIllIlIlIIIlIlIlIII.IlIlIlIlIlllllllllIl(this.lIlIlIlllIIlIlIlllIl.llIllIIIIIllIlIIIIlI);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
        this.llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll("root");
        this.lIIIIlIIIIIlllIllIII();
        Thread.yield();
        this.llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll("stream");
        this.llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll("update");
        this.llIlllIlllllIIllIIII.llllIIIlIlllIlIIIIIl();
        this.llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI("submit");
        this.llIlllIlllllIIllIIII.lIIIIlIIIIIlllIllIII();
        this.llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl();
        this.llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl();
        this.llllIIIIlIIIlIlllIll("Post render");
        ++this.IlIIIlIIIllllIlIlIlI;
        this.IllIIlllllIIllIIllIl = (this.llIIlllIIlllIIllIllI() && this.IIIIlllIIIIIIlIIIlll != null && this.IIIIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl() && !this.IIIllIIIlIlIIllIIIlI.IlIllllIIlIllIlIlIll());
        final long nanoTime3 = System.nanoTime();
        this.IlIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll(nanoTime3 - this.IIlllIlIIllIlIlIlIIl);
        this.IIlllIlIIllIlIlIlIIl = nanoTime3;
        while (IIIllllllIllIIIlllIl() >= this.IIIllllllIllIIIlllIl + 1000L) {
            Minecraft.llllIllllIllllIlIlII = this.IlIIIlIIIllllIlIlIlI;
            this.lIllllllIIllIlIlIlII = String.format("%d fps (%d chunk update%s) T: %s%s%s%s%s", Minecraft.llllIllllIllllIlIlII, net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl.IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll, (net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl.IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll != 1) ? "s" : "", (this.IIIlIIIlIlIIlllIIlll.llllIIIlIlllIlIIIIIl == net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI()) ? "inf" : Integer.valueOf(this.IIIlIIIlIlIIlllIIlll.llllIIIlIlllIlIIIIIl), this.IIIlIIIlIlIIlllIIlll.IIllIIllIIIlIlIIIIlI ? " vsync" : "", this.IIIlIIIlIlIIlllIIlll.lIIIlllIIIllIIIllIII ? "" : " fast", (this.IIIlIIIlIlIIlllIIlll.lIIIIlIIIIIlllIllIII == 0) ? "" : ((this.IIIlIIIlIlIIlllIIlll.lIIIIlIIIIIlllIllIII == 1) ? " fast-clouds" : " fancy-clouds"), net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IllIIlllIIIIlllIIlIl() ? " vbo" : "");
            net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl.IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll = 0;
            this.IIIllllllIllIIIlllIl += 1000L;
            this.IlIIIlIIIllllIlIlIlI = 0;
            this.llIIIIIIlIllIIlIIIll.IlIlIlIlIlllllllllIl();
            if (!this.llIIIIIIlIllIIlIIIll.IlIIIlIlIIIllIlIlIIl()) {
                this.llIIIIIIlIllIIlIIIll.llllIIIIlIIIlIlllIll();
            }
        }
        if (this.llIllIlIIIIllIlIIllI()) {
            this.llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll("fpslimit_wait");
            Display.sync(this.llIIlIIIlIIIllIlIIIl());
            this.llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl();
        }
        this.llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl();
    }
    
    public void lIIIIlIIIIIlllIllIII() {
        this.llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll("display_update");
        Display.update();
        this.llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl();
        this.lIIIlllIIIllIIIllIII();
    }
    
    protected void lIIIlllIIIllIIIllIII() {
        if (!this.llIlIIIIIlIIlIlIIlll && Display.wasResized()) {
            final int ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl;
            final int ilIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI;
            this.IlIIIlIlIIIllIlIlIIl = Display.getWidth();
            this.IlIlIIIllIllIIIIIllI = Display.getHeight();
            if (this.IlIIIlIlIIIllIlIlIIl != ilIIIlIlIIIllIlIlIIl || this.IlIlIIIllIllIIIIIllI != ilIlIIIllIllIIIIIllI) {
                if (this.IlIIIlIlIIIllIlIlIIl <= 0) {
                    this.IlIIIlIlIIIllIlIlIIl = 1;
                }
                if (this.IlIlIIIllIllIIIIIllI <= 0) {
                    this.IlIlIIIllIllIIIIIllI = 1;
                }
                this.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl, this.IlIlIIIllIllIIIIIllI);
            }
        }
    }
    
    public int llIIlIIIlIIIllIlIIIl() {
        return (this.IllIIlllIIIIlllIIlIl == null && this.IIIIlllIIIIIIlIIIlll != null) ? 30 : this.IIIlIIIlIlIIlllIIlll.llllIIIlIlllIlIIIIIl;
    }
    
    public boolean llIllIlIIIIllIlIIllI() {
        return this.llIIlIIIlIIIllIlIIIl() < net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI();
    }
    
    public void lIlIlIIIllIIllIIIllI() {
        try {
            Minecraft.IlIlIlIlIlllllllllIl = new byte[0];
            this.llllIIIlIlllIlIIIIIl.lIIIlllIIIllIIIllIII();
        }
        catch (Throwable t) {}
        try {
            System.gc();
            this.llllIIIIlIIIlIlllIll((llIIlIIIlIIIllIlIIIl)null);
        }
        catch (Throwable t2) {}
        System.gc();
    }
    
    private void IlIlIlIlIlllllllllIl(int n) {
        final List ilIlIlIlIlllllllllIl = this.llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl(this.lIIlllIlllllIIlllIll);
        if (ilIlIlIlIlllllllllIl != null && !ilIlIlIlIlllllllllIl.isEmpty()) {
            final net.minecraft.IlIllIlIlIIIlIlIlIII.IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI = ilIlIlIlIlllllllllIl.remove(0);
            if (n == 0) {
                if (ilIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI.length() > 0) {
                    final int lastIndex = this.lIIlllIlllllIIlllIll.lastIndexOf(".");
                    if (lastIndex >= 0) {
                        this.lIIlllIlllllIIlllIll = this.lIIlllIlllllIIlllIll.substring(0, lastIndex);
                    }
                }
            }
            else if (--n < ilIlIlIlIlllllllllIl.size() && !ilIlIlIlIlllllllllIl.get(n).llIllIIIIIllIlIIIIlI.equals("unspecified")) {
                if (this.lIIlllIlllllIIlllIll.length() > 0) {
                    this.lIIlllIlllllIIlllIll = String.valueOf(this.lIIlllIlllllIIlllIll) + ".";
                }
                this.lIIlllIlllllIIlllIll = String.valueOf(this.lIIlllIlllllIIlllIll) + ilIlIlIlIlllllllllIl.get(n).llIllIIIIIllIlIIIIlI;
            }
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final long n) {
        if (this.llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll) {
            final List ilIlIlIlIlllllllllIl = this.llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl(this.lIIlllIlllllIIlllIll);
            final net.minecraft.IlIllIlIlIIIlIlIlIII.IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI = ilIlIlIlIlllllllllIl.remove(0);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI(256);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5889);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIIIlIlIllIIlIlIlII();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(0.0, this.IlIIIlIlIIIllIlIlIIl, this.IlIlIIIllIllIIIIIllI, 0.0, 1000.0, 3000.0);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5888);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIIIlIlIllIIlIlIlII();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, 0.0f, -2000.0f);
            GL11.glLineWidth(1.0f);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIIIlIIlIlIIlllIl();
            final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll = net.minecraft.client.lIIIlllIIIllIIIllIII.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
            final net.minecraft.client.lIIIlllIIIllIIIllIII.lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
            final int n2 = 160;
            final int n3 = this.IlIIIlIlIIIllIlIlIIl - n2 - 10;
            final int n4 = this.IlIlIIIllIllIIIIIllI - n2 * 2;
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
            llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII);
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n3 - n2 * 1.1f, n4 - n2 * 0.6f - 16.0f, 0.0).IlIlIlIlIlllllllllIl(200, 0, 0, 0).IlIlIIIllIllIIIIIllI();
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n3 - n2 * 1.1f, n4 + n2 * 2, 0.0).IlIlIlIlIlllllllllIl(200, 0, 0, 0).IlIlIIIllIllIIIIIllI();
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n3 + n2 * 1.1f, n4 + n2 * 2, 0.0).IlIlIlIlIlllllllllIl(200, 0, 0, 0).IlIlIIIllIllIIIIIllI();
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n3 + n2 * 1.1f, n4 - n2 * 0.6f - 16.0f, 0.0).IlIlIlIlIlllllllllIl(200, 0, 0, 0).IlIlIIIllIllIIIIIllI();
            llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
            double n5 = 0.0;
            for (int i = 0; i < ilIlIlIlIlllllllllIl.size(); ++i) {
                final net.minecraft.IlIllIlIlIIIlIlIlIII.IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI2 = ilIlIlIlIlllllllllIl.get(i);
                final int n6 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(ilIlIIIllIllIIIIIllI2.llllIIIIlIIIlIlllIll / 4.0) + 1;
                llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(6, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII);
                final int llllIIIIlIIIlIlllIll2 = ilIlIIIllIllIIIIIllI2.llllIIIIlIIIlIlllIll();
                final int n7 = llllIIIIlIIIlIlllIll2 >> 16 & 0xFF;
                final int n8 = llllIIIIlIIIlIlllIll2 >> 8 & 0xFF;
                final int n9 = llllIIIIlIIIlIlllIll2 & 0xFF;
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n3, n4, 0.0).IlIlIlIlIlllllllllIl(n7, n8, n9, 255).IlIlIIIllIllIIIIIllI();
                for (int j = n6; j >= 0; --j) {
                    final float n10 = (float)((n5 + ilIlIIIllIllIIIIIllI2.llllIIIIlIIIlIlllIll * j / n6) * 3.141592653589793 * 2.0 / 100.0);
                    llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n3 + net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n10) * n2, n4 - net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n10) * n2 * 0.5f, 0.0).IlIlIlIlIlllllllllIl(n7, n8, n9, 255).IlIlIIIllIllIIIIIllI();
                }
                llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
                llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(5, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII);
                for (int k = n6; k >= 0; --k) {
                    final float n11 = (float)((n5 + ilIlIIIllIllIIIIIllI2.llllIIIIlIIIlIlllIll * k / n6) * 3.141592653589793 * 2.0 / 100.0);
                    final float n12 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n11) * n2;
                    final float n13 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n11) * n2 * 0.5f;
                    llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n3 + n12, n4 - n13, 0.0).IlIlIlIlIlllllllllIl(n7 >> 1, n8 >> 1, n9 >> 1, 255).IlIlIIIllIllIIIIIllI();
                    llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n3 + n12, n4 - n13 + 10.0f, 0.0).IlIlIlIlIlllllllllIl(n7 >> 1, n8 >> 1, n9 >> 1, 255).IlIlIIIllIllIIIIIllI();
                }
                llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
                n5 += ilIlIIIllIllIIIIIllI2.llllIIIIlIIIlIlllIll;
            }
            final DecimalFormat decimalFormat = new DecimalFormat("##0.00");
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll();
            String string = "";
            if (!ilIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI.equals("unspecified")) {
                string = String.valueOf(string) + "[0] ";
            }
            String s;
            if (ilIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI.length() == 0) {
                s = String.valueOf(string) + "ROOT ";
            }
            else {
                s = String.valueOf(string) + ilIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI + " ";
            }
            final int n14 = 16777215;
            this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(s, (float)(n3 - n2), (float)(n4 - n2 / 2 - 16), n14);
            final FontRenderer lIlIlIIIllIIllIIIllI = this.lIlIlIIIllIIllIIIllI;
            final String string2 = String.valueOf(decimalFormat.format(ilIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl)) + "%";
            lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(string2, (float)(n3 + n2 - this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(string2)), (float)(n4 - n2 / 2 - 16), n14);
            for (int l = 0; l < ilIlIlIlIlllllllllIl.size(); ++l) {
                final net.minecraft.IlIllIlIlIIIlIlIlIII.IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI3 = ilIlIlIlIlllllllllIl.get(l);
                final String s2 = "";
                String s3;
                if (ilIlIIIllIllIIIIIllI3.llIllIIIIIllIlIIIIlI.equals("unspecified")) {
                    s3 = String.valueOf(s2) + "[?] ";
                }
                else {
                    s3 = String.valueOf(s2) + "[" + (l + 1) + "] ";
                }
                this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(String.valueOf(s3) + ilIlIIIllIllIIIIIllI3.llIllIIIIIllIlIIIIlI, (float)(n3 - n2), (float)(n4 + n2 / 2 + l * 8 + 20), ilIlIIIllIllIIIIIllI3.llllIIIIlIIIlIlllIll());
                final FontRenderer lIlIlIIIllIIllIIIllI2 = this.lIlIlIIIllIIllIIIllI;
                final String string3 = String.valueOf(decimalFormat.format(ilIlIIIllIllIIIIIllI3.llllIIIIlIIIlIlllIll)) + "%";
                lIlIlIIIllIIllIIIllI2.llllIIIIlIIIlIlllIll(string3, (float)(n3 + n2 - 50 - this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(string3)), (float)(n4 + n2 / 2 + l * 8 + 20), ilIlIIIllIllIIIIIllI3.llllIIIIlIIIlIlllIll());
                final FontRenderer lIlIlIIIllIIllIIIllI3 = this.lIlIlIIIllIIllIIIllI;
                final String string4 = String.valueOf(decimalFormat.format(ilIlIIIllIllIIIIIllI3.IlIlIlIlIlllllllllIl)) + "%";
                lIlIlIIIllIIllIIIllI3.llllIIIIlIIIlIlllIll(string4, (float)(n3 + n2 - this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(string4)), (float)(n4 + n2 / 2 + l * 8 + 20), ilIlIIIllIllIIIIIllI3.llllIIIIlIIIlIlllIll());
            }
        }
    }
    
    public void IlIlIIIllIIllIlllllI() {
        this.lllllIlIIIlIlIIlllII = false;
    }
    
    public void IIIIlllIIIIIIlIIIlll() {
        if (Display.isActive() && !this.IIlIIIIlllIlllllIlII) {
            this.IIlIIIIlllIlllllIlII = true;
            this.IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll();
            this.llllIIIIlIIIlIlllIll((lIIllIIIllllIlllIllI)null);
            this.lIllIIIIIlllIIlIIllI = 10000;
        }
    }
    
    public void llllIIllllIlIlIIIIll() {
        if (this.IIlIIIIlllIlllllIlII) {
            net.minecraft.client.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll();
            this.IIlIIIIlllIlllllIlII = false;
            this.IlIlIIIlIIlIlIIlllIl.IlIlIlIlIlllllllllIl();
        }
    }
    
    public void IlIllIlIlIIIlIlIlIII() {
        if (this.IIIIlllIIIIIIlIIIlll == null) {
            this.llllIIIIlIIIlIlllIll(new net.minecraft.client.llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII());
            if (this.llIIlllIIlllIIllIllI() && !this.IIIllIIIlIlIIllIIIlI.IlIllllIIlIllIlIlIll()) {
                this.lllIlIIIIIlIlllllIlI.IlIlIlIlIlllllllllIl();
            }
        }
    }
    
    private void IlIlIlIlIlllllllllIl(final boolean b) {
        if (!b) {
            this.lIllIIIIIlllIIlIIllI = 0;
        }
        if (this.lIllIIIIIlllIIlIIllI <= 0 && !this.lIIIIlIIIIIlllIllIII.g()) {
            if (b && this.IIllIIllIIIlIlIIIIlI != null && this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll == net.minecraft.IlllllllIIIlIIIlIlII.lllllIlIlIlllIlllIlI.IlIlIlIlIlllllllllIl) {
                final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll();
                if (this.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll && this.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll, this.IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl)) {
                    this.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, this.IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl);
                    this.lIIIIlIIIIIlllIllIII.IIlIIIIlllIlllllIlII();
                }
            }
            else {
                this.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI();
            }
        }
    }
    
    private void lllllIIIIIlIIlllIlIl() {
        if (this.lIllIIIIIlllIIlIIllI <= 0) {
            this.lIIIIlIIIIIlllIllIII.IIlIIIIlllIlllllIlII();
            if (this.IIllIIllIIIlIlIIIIlI == null) {
                Minecraft.IIIIIIIIIlllIllIlIlI.error("Null returned as 'hitResult', this shouldn't happen!");
                if (this.llIllIIIIIllIlIIIIlI.llllIIIlIlllIlIIIIIl()) {
                    this.lIllIIIIIlllIIlIIllI = 10;
                }
            }
            else {
                switch (IlIIlllllIIllIIlllll()[this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.ordinal()]) {
                    case 3: {
                        this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII, this.IIllIIllIIIlIlIIIIlI.IlIIIlIlIIIllIlIlIIl);
                        return;
                    }
                    case 2: {
                        final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll();
                        if (this.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
                            this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll, this.IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl);
                            return;
                        }
                        break;
                    }
                }
                if (this.llIllIIIIIllIlIIIIlI.llllIIIlIlllIlIIIIIl()) {
                    this.lIllIIIIIlllIIlIIllI = 10;
                }
            }
        }
    }
    
    private void IlIllllIIIlIllIlIIll() {
        if (!this.llIllIIIIIllIlIIIIlI.IlIlIIIllIIllIlllllI()) {
            this.IIlIlIllllIlllIIIIll = 4;
            boolean b = true;
            final lllIIIIlIlIllIIlIIIl ilIIIlIlIIIllIlIlIIl = this.lIIIIlIIIIIlllIllIII.lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl();
            if (this.IIllIIllIIIlIlIIIIlI == null) {
                Minecraft.IIIIIIIIIlllIllIlIlI.warn("Null returned as 'hitResult', this shouldn't happen!");
            }
            else {
                switch (IlIIlllllIIllIIlllll()[this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.ordinal()]) {
                    case 3: {
                        if (this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII, this.IIllIIllIIIlIlIIIIlI.IlIIIlIlIIIllIlIlIIl, this.IIllIIllIIIlIlIIIIlI)) {
                            b = false;
                            break;
                        }
                        if (this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this.lIIIIlIIIIIlllIllIII, this.IIllIIllIIIlIlIIIIlI.IlIIIlIlIIIllIlIlIIl)) {
                            b = false;
                            break;
                        }
                        break;
                    }
                    case 2: {
                        final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll();
                        if (this.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
                            break;
                        }
                        final int n = (ilIIIlIlIIIllIlIlIIl != null) ? ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl : 0;
                        if (this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII, this.IllIIlllIIIIlllIIlIl, ilIIIlIlIIIllIlIlIIl, llllIIIIlIIIlIlllIll, this.IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl, this.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI)) {
                            b = false;
                            this.lIIIIlIIIIIlllIllIII.IIlIIIIlllIlllllIlII();
                        }
                        if (ilIIIlIlIIIllIlIlIIl == null) {
                            return;
                        }
                        if (ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl == 0) {
                            this.lIIIIlIIIIIlllIllIII.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll[this.lIIIIlIIIIIlllIllIII.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI] = null;
                            break;
                        }
                        if (ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl != n || this.llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII()) {
                            this.IlIllIlIlIIIlIlIlIII.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl();
                            break;
                        }
                        break;
                    }
                }
            }
            if (b) {
                final lllIIIIlIlIllIIlIIIl ilIIIlIlIIIllIlIlIIl2 = this.lIIIIlIIIIIlllIllIII.lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl();
                if (ilIIIlIlIIIllIlIlIIl2 != null && this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII, this.IllIIlllIIIIlllIIlIl, ilIIIlIlIIIllIlIlIIl2)) {
                    this.IlIllIlIlIIIlIlIlIII.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI();
                }
            }
        }
    }
    
    public void IIlllIIlIllIllIlIIll() {
        try {
            this.llIlIIIIIlIIlIlIIlll = !this.llIlIIIIIlIIlIlIIlll;
            this.IIIlIIIlIlIIlllIIlll.IlIlIIIIIIlllIlIllIl = this.llIlIIIIIlIIlIlIIlll;
            if (this.llIlIIIIIlIIlIlIIlll) {
                this.IlIIIIIlIIllIIlIlIll();
                this.IlIIIlIlIIIllIlIlIIl = Display.getDisplayMode().getWidth();
                this.IlIlIIIllIllIIIIIllI = Display.getDisplayMode().getHeight();
                if (this.IlIIIlIlIIIllIlIlIIl <= 0) {
                    this.IlIIIlIlIIIllIlIlIIl = 1;
                }
                if (this.IlIlIIIllIllIIIIIllI <= 0) {
                    this.IlIlIIIllIllIIIIIllI = 1;
                }
            }
            else {
                Display.setDisplayMode(new DisplayMode(this.lIlIIlllIIlIIlIlllIl, this.llIIIllIlIllIllIIIIl));
                this.IlIIIlIlIIIllIlIlIIl = this.lIlIIlllIIlIIlIlllIl;
                this.IlIlIIIllIllIIIIIllI = this.llIIIllIlIllIllIIIIl;
                if (this.IlIIIlIlIIIllIlIlIIl <= 0) {
                    this.IlIIIlIlIIIllIlIlIIl = 1;
                }
                if (this.IlIlIIIllIllIIIIIllI <= 0) {
                    this.IlIlIIIllIllIIIIIllI = 1;
                }
            }
            if (this.IIIIlllIIIIIIlIIIlll != null) {
                this.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl, this.IlIlIIIllIllIIIIIllI);
            }
            else {
                this.lIIIIIlIlIIIlIIIIlIl();
            }
            Display.setFullscreen(this.llIlIIIIIlIIlIlIIlll);
            Display.setVSyncEnabled(this.IIIlIIIlIlIIlllIIlll.IIllIIllIIIlIlIIIIlI);
            this.lIIIIlIIIIIlllIllIII();
        }
        catch (Exception ex) {
            Minecraft.IIIIIIIIIlllIllIlIlI.error("Couldn't toggle fullscreen", (Throwable)ex);
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final int n, final int n2) {
        this.IlIIIlIlIIIllIlIlIIl = Math.max(1, n);
        this.IlIlIIIllIllIIIIIllI = Math.max(1, n2);
        if (this.IIIIlllIIIIIIlIIIlll != null) {
            final g g = new g(this);
            this.IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl(this, g.llllIIIIlIIIlIlllIll(), g.IlIlIlIlIlllllllllIl());
        }
        this.llllIIllllIlIlIIIIll = new net.minecraft.client.llIllIIIIIllIlIIIIlI(this);
        this.lIIIIIlIlIIIlIIIIlIl();
    }
    
    private void lIIIIIlIlIIIlIIIIlIl() {
        this.lllllIlIlIlllIlllIlI.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl, this.IlIlIIIllIllIIIIIllI);
        if (this.IlIllIlIlIIIlIlIlIII != null) {
            this.IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl, this.IlIlIIIllIllIIIIIllI);
        }
    }
    
    public net.minecraft.client.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII lllIIIIlllllIlIIllIl() {
        return this.llIlIIIIllIlIIlIlIII;
    }
    
    public void IlIlIIIIIIlllIlIllIl() {
        if (this.IIlIlIllllIlllIIIIll > 0) {
            --this.IIlIlIllllIlllIIIIll;
        }
        this.llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll("gui");
        if (!this.IllIIlllllIIllIIllIl) {
            this.lllIIIIlllllIlIIllIl.llIllIIIIIllIlIIIIlI();
        }
        this.llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl();
        this.IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(1.0f);
        this.llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll("gameMode");
        if (!this.IllIIlllllIIllIIllIl && this.IllIIlllIIIIlllIIlIl != null) {
            this.llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI();
        }
        this.llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI("textures");
        if (!this.IllIIlllllIIllIIllIl) {
            this.IlIllllIIlIIlIlIlIll.IlIlIlIlIlllllllllIl();
        }
        if (this.IIIIlllIIIIIIlIIIlll == null && this.lIIIIlIIIIIlllIllIII != null) {
            if (this.lIIIIlIIIIIlllIllIII.N() <= 0.0f) {
                this.llllIIIIlIIIlIlllIll((lIIllIIIllllIlllIllI)null);
            }
            else if (this.lIIIIlIIIIIlllIllIII.ah() && this.IllIIlllIIIIlllIIlIl != null) {
                this.llllIIIIlIIIlIlllIll(new llllllIIIIIIIlllIIll());
            }
        }
        else if (this.IIIIlllIIIIIIlIIIlll != null && this.IIIIlllIIIIIIlIIIlll instanceof llllllIIIIIIIlllIIll && !this.lIIIIlIIIIIlllIllIII.ah()) {
            this.llllIIIIlIIIlIlllIll((lIIllIIIllllIlllIllI)null);
        }
        if (this.IIIIlllIIIIIIlIIIlll != null) {
            this.lIllIIIIIlllIIlIIllI = 10000;
        }
        if (this.IIIIlllIIIIIIlIIIlll != null) {
            try {
                this.IIIIlllIIIIIIlIIIlll.llIllIlIIIIllIlIIllI();
            }
            catch (Throwable t) {
                final net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(t, "Updating screen events");
                llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll("Affected screen").llllIIIIlIIIlIlllIll("Screen name", new net.minecraft.client.llllIIllllIlIlIIIIll(this));
                throw new IIlIlllIlIlllIlIllll(llllIIIIlIIIlIlllIll);
            }
            if (this.IIIIlllIIIIIIlIIIlll != null) {
                try {
                    this.IIIIlllIIIIIIlIIIlll.IlIIIlIlIIIllIlIlIIl();
                }
                catch (Throwable t2) {
                    final net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(t2, "Ticking screen");
                    llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll("Affected screen").llllIIIIlIIIlIlllIll("Screen name", new net.minecraft.client.IlIllIlIlIIIlIlIlIII(this));
                    throw new IIlIlllIlIlllIlIllll(llllIIIIlIIIlIlllIll2);
                }
            }
        }
        if (this.IIIIlllIIIIIIlIIIlll == null || this.IIIIlllIIIIIIlIIIlll.IlIlIIIIIIlllIlIllIl) {
            this.llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI("mouse");
            while (Mouse.next()) {
                final int eventButton = Mouse.getEventButton();
                net.minecraft.client.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(eventButton - 100, Mouse.getEventButtonState());
                if (Mouse.getEventButtonState()) {
                    if (this.lIIIIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl() && eventButton == 2) {
                        this.lllIIIIlllllIlIIllIl.llllIIIlIlllIlIIIIIl().IlIlIlIlIlllllllllIl();
                    }
                    else {
                        net.minecraft.client.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(eventButton - 100);
                    }
                }
                if (IIIllllllIllIIIlllIl() - this.IIIlIIlIIIIlllIlllII <= 200L) {
                    final int eventDWheel = Mouse.getEventDWheel();
                    if (eventDWheel != 0) {
                        if (this.lIIIIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl()) {
                            final int n = (eventDWheel < 0) ? -1 : 1;
                            if (this.lllIIIIlllllIlIIllIl.llllIIIlIlllIlIIIIIl().llllIIIIlIIIlIlllIll()) {
                                this.lllIIIIlllllIlIIllIl.llllIIIlIlllIlIIIIIl().IlIlIlIlIlllllllllIl(-n);
                            }
                            else {
                                this.lIIIIlIIIIIlllIllIII.K.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII.K.llllIIIIlIIIlIlllIll() + n * 0.005f, 0.0f, 0.2f));
                            }
                        }
                        else {
                            this.lIIIIlIIIIIlllIllIII.lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(eventDWheel);
                        }
                    }
                    if (this.IIIIlllIIIIIIlIIIlll == null) {
                        if (this.IIlIIIIlllIlllllIlII || !Mouse.getEventButtonState()) {
                            continue;
                        }
                        this.IIIIlllIIIIIIlIIIlll();
                    }
                    else {
                        if (this.IIIIlllIIIIIIlIIIlll == null) {
                            continue;
                        }
                        this.IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl();
                    }
                }
            }
            if (this.lIllIIIIIlllIIlIIllI > 0) {
                --this.lIllIIIIIlllIIlIIllI;
            }
            this.llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI("keyboard");
            while (Keyboard.next()) {
                if (Leaf.instance.modManager.freeLookMod.lIlIlIIIllIIllIIIllI()) {
                    Leaf.instance.modManager.freeLookMod.onKey(Keyboard.getEventKey());
                }
                final int n2 = (Keyboard.getEventKey() == 0) ? (Keyboard.getEventCharacter() + '\u0100') : Keyboard.getEventKey();
                net.minecraft.client.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(n2, Keyboard.getEventKeyState());
                if (Keyboard.getEventKeyState()) {
                    net.minecraft.client.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(n2);
                }
                if (this.lllllIIIIIlIIlllIlIl > 0L) {
                    if (IIIllllllIllIIIlllIl() - this.lllllIIIIIlIIlllIlIl >= 6000L) {
                        throw new IIlIlllIlIlllIlIllll(new net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll("Manually triggered debug crash", new Throwable()));
                    }
                    if (!Keyboard.isKeyDown(46) || !Keyboard.isKeyDown(61)) {
                        this.lllllIIIIIlIIlllIlIl = -1L;
                    }
                }
                else if (Keyboard.isKeyDown(46) && Keyboard.isKeyDown(61)) {
                    this.lllllIIIIIlIIlllIlIl = IIIllllllIllIIIlllIl();
                }
                this.IIlIIIlllIllIllIlIII();
                if (Keyboard.getEventKeyState()) {
                    if (n2 == 62 && this.IlIllIlIlIIIlIlIlIII != null) {
                        this.IlIllIlIlIIIlIlIlIII.llIllIIIIIllIlIIIIlI();
                    }
                    if (this.IIIIlllIIIIIIlIIIlll != null) {
                        this.IIIIlllIIIIIIlIIIlll.lIlIlIIIllIIllIIIllI();
                    }
                    else {
                        if (n2 == 1) {
                            this.IlIllIlIlIIIlIlIlIII();
                        }
                        if (n2 == 32 && Keyboard.isKeyDown(61) && this.lllIIIIlllllIlIIllIl != null) {
                            this.lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl().llllIIIIlIIIlIlllIll();
                        }
                        if (n2 == 31 && Keyboard.isKeyDown(61)) {
                            this.IlIlIIIllIllIIIIIllI();
                        }
                        if (n2 != 17 || Keyboard.isKeyDown(61)) {}
                        if (n2 != 18 || Keyboard.isKeyDown(61)) {}
                        if (n2 != 47 || Keyboard.isKeyDown(61)) {}
                        if (n2 != 38 || Keyboard.isKeyDown(61)) {}
                        if (n2 != 22 || Keyboard.isKeyDown(61)) {}
                        if (n2 == 20 && Keyboard.isKeyDown(61)) {
                            this.IlIlIIIllIllIIIIIllI();
                        }
                        if (n2 == 33 && Keyboard.isKeyDown(61)) {
                            this.IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll(net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl, net.minecraft.client.llIllIIIIIllIlIIIIlI.lIIllIIIllllIlllIllI.llllIIllllIlIlIIIIll() ? -1 : 1);
                        }
                        if (n2 == 30 && Keyboard.isKeyDown(61)) {
                            this.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl();
                        }
                        if (n2 == 35 && Keyboard.isKeyDown(61)) {
                            this.IIIlIIIlIlIIlllIIlll.IIIlIIlIIIIlllIlllII = !this.IIIlIIIlIlIIlllIIlll.IIIlIIlIIIIlllIlllII;
                            this.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl();
                        }
                        if (n2 == 48 && Keyboard.isKeyDown(61)) {
                            this.lIIIIlIlIllllIIlIllI.IlIlIlIlIlllllllllIl(!this.lIIIIlIlIllllIIlIllI.IlIlIlIlIlllllllllIl());
                        }
                        if (n2 == 25 && Keyboard.isKeyDown(61)) {
                            this.IIIlIIIlIlIIlllIIlll.IlIlIllllllllIIIIlII = !this.IIIlIIIlIlIIlllIIlll.IlIlIllllllllIIIIlII;
                            this.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl();
                        }
                        if (n2 == 59) {
                            this.IIIlIIIlIlIIlllIIlll.IIllIIIlIIIIlIIlIIII = !this.IIIlIIIlIlIIlllIIlll.IIllIIIlIIIIlIIlIIII;
                        }
                        if (n2 == 61) {
                            this.IIIlIIIlIlIIlllIIlll.IIIIIIIllllIlIIIIIII = !this.IIIlIIIlIlIIlllIIlll.IIIIIIIllllIlIIIIIII;
                            this.IIIlIIIlIlIIlllIIlll.IIlllIIIllIllIIlIlIl = net.minecraft.client.llIllIIIIIllIlIIIIlI.lIIllIIIllllIlllIllI.llllIIllllIlIlIIIIll();
                            this.IIIlIIIlIlIIlllIIlll.llIlllIlllllIIllIIII = net.minecraft.client.llIllIIIIIllIlIIIIlI.lIIllIIIllllIlllIllI.IlIllIlIlIIIlIlIlIII();
                        }
                        if (this.IIIlIIIlIlIIlllIIlll.llllIllllIllllIlIlII.IllIIlllIIIIlllIIlIl()) {
                            final net.minecraft.client.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll iiIlIIIlIlIIlllIIlll = this.IIIlIIIlIlIIlllIIlll;
                            ++iiIlIIIlIlIIlllIIlll.IIIllIIllIIIIIIlIIlI;
                            if (this.IIIlIIIlIlIIlllIIlll.IIIllIIllIIIIIIlIIlI > 2) {
                                this.IIIlIIIlIlIIlllIIlll.IIIllIIllIIIIIIlIIlI = 0;
                            }
                            if (this.IIIlIIIlIlIIlllIIlll.IIIllIIllIIIIIIlIIlI == 0) {
                                this.IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(this.lIIIIlIlIllllIIlIllI());
                            }
                            else if (this.IIIlIIIlIlIIlllIIlll.IIIllIIllIIIIIIlIIlI == 1) {
                                this.IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll((net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI)null);
                            }
                            this.llllIIIlIlllIlIIIIIl.llIIlIIIlIIIllIlIIIl();
                        }
                        if (this.IIIlIIIlIlIIlllIIlll.IIlIlIllllIlllIIIIll.IllIIlllIIIIlllIIlIl()) {
                            this.IIIlIIIlIlIIlllIIlll.IlIllllIIlIllIlIlIll = !this.IIIlIIIlIlIIlllIIlll.IlIllllIIlIllIlIlIll;
                        }
                        if (this.IIIlIIIlIlIIlllIIlll.ay.IllIIlllIIIIlllIIlIl()) {
                            Leaf.instance.modManager.toggleSprintMod.toggle();
                        }
                        if (this.IIIlIIIlIlIIlllIIlll.aw.IllIIlllIIIIlllIIlIl()) {
                            this.llllIIIIlIIIlIlllIll(new CosmeticSetting());
                        }
                    }
                    if (!this.IIIlIIIlIlIIlllIIlll.IIIIIIIllllIlIIIIIII || !this.IIIlIIIlIlIIlllIIlll.IIlllIIIllIllIIlIlIl) {
                        continue;
                    }
                    if (n2 == 11) {
                        this.IlIlIlIlIlllllllllIl(0);
                    }
                    for (int i = 0; i < 9; ++i) {
                        if (n2 == 2 + i) {
                            this.IlIlIlIlIlllllllllIl(i + 1);
                        }
                    }
                }
            }
            for (int j = 0; j < 9; ++j) {
                if (this.IIIlIIIlIlIIlllIIlll.IllllIIlIlIllIIIllII[j].IllIIlllIIIIlllIIlIl()) {
                    if (this.lIIIIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl()) {
                        this.lllIIIIlllllIlIIllIl.llllIIIlIlllIlIIIIIl().llllIIIIlIIIlIlllIll(j);
                    }
                    else {
                        this.lIIIIlIIIIIlllIllIII.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI = j;
                    }
                }
            }
            final boolean b = this.IIIlIIIlIlIIlllIIlll.IlIlIIIllIIllIlllllI != net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI;
            while (this.IIIlIIIlIlIIlllIIlll.IllIIlllllIIllIIllIl.IllIIlllIIIIlllIIlIl()) {
                if (this.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl()) {
                    this.lIIIIlIIIIIlllIllIII.llIIlllIIlllIIllIllI();
                }
                else {
                    this.IIIlIIIlIlIIlllIIlll().llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIllllllllIIIIlII(net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI));
                    this.llllIIIIlIIIlIlllIll(new net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IIlllIIlIllIllIlIIll(this.lIIIIlIIIIIlllIllIII));
                }
            }
            while (this.IIIlIIIlIlIIlllIIlll.lIlIIlllIIlIIlIlllIl.IllIIlllIIIIlllIIlIl()) {
                if (!this.lIIIIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl()) {
                    this.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(net.minecraft.client.llIllIIIIIllIlIIIIlI.lIIllIIIllllIlllIllI.IIIIlllIIIIIIlIIIlll());
                }
            }
            while (this.IIIlIIIlIlIIlllIIlll.IIlllIIlllIIIlIlllII.IllIIlllIIIIlllIIlIl() && b) {
                this.llllIIIIlIIIlIlllIll(new llllIIIlIlllIlIIIIIl());
            }
            if (this.IIIIlllIIIIIIlIIIlll == null && this.IIIlIIIlIlIIlllIIlll.lllllIIlIlIIIlIlIIIl.IllIIlllIIIIlllIIlIl() && b) {
                this.llllIIIIlIIIlIlllIll(new llllIIIlIlllIlIIIIIl("/"));
            }
            if (this.lIIIIlIIIIIlllIllIII.g()) {
                if (!this.IIIlIIIlIlIIlllIIlll.lIllIIIIIlllIIlIIllI.IlIIIlIlIIIllIlIlIIl()) {
                    this.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI(this.lIIIIlIIIIIlllIllIII);
                }
                while (this.IIIlIIIlIlIIlllIIlll.llIIIllIlIllIllIIIIl.IllIIlllIIIIlllIIlIl()) {}
                while (this.IIIlIIIlIlIIlllIIlll.lIllIIIIIlllIIlIIllI.IllIIlllIIIIlllIIlIl()) {}
                while (this.IIIlIIIlIlIIlllIIlll.IIIllIIIlIlIIllIIIlI.IllIIlllIIIIlllIIlIl()) {}
            }
            else {
                while (this.IIIlIIIlIlIIlllIIlll.llIIIllIlIllIllIIIIl.IllIIlllIIIIlllIIlIl()) {
                    this.lllllIIIIIlIIlllIlIl();
                }
                while (this.IIIlIIIlIlIIlllIIlll.lIllIIIIIlllIIlIIllI.IllIIlllIIIIlllIIlIl()) {
                    this.IlIllllIIIlIllIlIIll();
                }
                while (this.IIIlIIIlIlIIlllIIlll.IIIllIIIlIlIIllIIIlI.IllIIlllIIIIlllIIlIl()) {
                    this.IIllIIIlIIIIlIIlIIII();
                }
            }
            if (this.IIIlIIIlIlIIlllIIlll.lIllIIIIIlllIIlIIllI.IlIIIlIlIIIllIlIlIIl() && this.IIlIlIllllIlllIIIIll == 0 && !this.lIIIIlIIIIIlllIllIII.g()) {
                this.IlIllllIIIlIllIlIIll();
            }
            this.IlIlIlIlIlllllllllIl(this.IIIIlllIIIIIIlIIIlll == null && this.IIIlIIIlIlIIlllIIlll.llIIIllIlIllIllIIIIl.IlIIIlIlIIIllIlIlIIl() && this.IIlIIIIlllIlllllIlII);
        }
        if (this.IllIIlllIIIIlllIIlIl != null) {
            if (this.lIIIIlIIIIIlllIllIII != null) {
                ++this.IIllIIIlIIlIlIlIIIII;
                if (this.IIllIIIlIIlIlIlIIIII == 30) {
                    this.IIllIIIlIIlIlIlIIIII = 0;
                    this.IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII(this.lIIIIlIIIIIlllIllIII);
                }
            }
            this.llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI("gameRenderer");
            if (!this.IllIIlllllIIllIIllIl) {
                this.IlIllIlIlIIIlIlIlIII.IlIlIIIllIllIIIIIllI();
            }
            this.llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI("levelRenderer");
            if (!this.IllIIlllllIIllIIllIl) {
                this.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII();
            }
            this.llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI("level");
            if (!this.IllIIlllllIIllIIllIl) {
                if (this.IllIIlllIIIIlllIIlIl.IIlIlIlIIlIllIIIIIIl() > 0) {
                    this.IllIIlllIIIIlllIIlIl.IlIlIIIllIllIIIIIllI(this.IllIIlllIIIIlllIIlIl.IIlIlIlIIlIllIIIIIIl() - 1);
                }
                this.IllIIlllIIIIlllIIlIl.llllIIllllIlIlIIIIll();
            }
        }
        else if (this.IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll()) {
            this.IlIllIlIlIIIlIlIlIII.IlIlIlIlIlllllllllIl();
        }
        if (!this.IllIIlllllIIllIIllIl) {
            this.llIlIIIIllIlIIlIlIII.llllIIIIlIIIlIlllIll();
            this.lllIlIIIIIlIlllllIlI.llllIIIIlIIIlIlllIll();
        }
        if (this.IllIIlllIIIIlllIIlIl != null) {
            if (!this.IllIIlllllIIllIIllIl) {
                this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl.lllIllIIIllllllIllll() != net.minecraft.IIIlIIlIIIIlllIlllII.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll, true);
                try {
                    this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll();
                }
                catch (Throwable t3) {
                    final net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll3 = net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(t3, "Exception in world tick");
                    if (this.IllIIlllIIIIlllIIlIl == null) {
                        llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll("Affected level").llllIIIIlIIIlIlllIll("Problem", "Level is null!");
                    }
                    else {
                        this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3);
                    }
                    throw new IIlIlllIlIlllIlIllll(llllIIIIlIIIlIlllIll3);
                }
            }
            this.llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI("animateTick");
            if (!this.IllIIlllllIIllIIllIl && this.IllIIlllIIIIlllIIlIl != null) {
                this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.lIIIIlIIIIIlllIllIII.IIlllIlIIllIlIlIlIIl), net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.lIIIIlIIIIIlllIllIII.llIIIlIlIllIIlIlIlII), net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.lIIIIlIIIIIlllIllIII.lllllIlIIIlIlIIlllII));
            }
            this.llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI("particles");
            if (!this.IllIIlllllIIllIIllIl) {
                this.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll();
            }
        }
        else if (this.IlIIIIIlIIllIIlIlIll != null) {
            this.llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI("pendingConnection");
            this.IlIIIIIlIIllIIlIlIll.llllIIIIlIIIlIlllIll();
        }
        this.llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl();
        this.IIIlIIlIIIIlllIlllII = IIIllllllIllIIIlllIl();
    }
    
    public void llllIIIIlIIIlIlllIll(final String s, final String s2, IlllIIIIlIIIlIlIlIIl illlIIIIlIIIlIlIlIIl) {
        this.llllIIIIlIIIlIlllIll((llIIlIIIlIIIllIlIIIl)null);
        System.gc();
        final net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = this.IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(s, false);
        net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.llllIIllllIlIlIIIIll llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
        if (llIllIIIIIllIlIIIIlI == null && illlIIIIlIIIlIlIlIIl != null) {
            llIllIIIIIllIlIIIIlI = new net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.llllIIllllIlIlIIIIll(illlIIIIlIIIlIlIlIIl, s);
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI);
        }
        if (illlIIIIlIIIlIlIlIIl == null) {
            illlIIIIlIIIlIlIlIIl = new IlllIIIIlIIIlIlIlIIl(llIllIIIIIllIlIIIIlI);
        }
        try {
            (this.IIIllIIIlIlIIllIIIlI = new net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this, s, s2, illlIIIIlIIIlIlIlIIl)).lIllllllIIllIlIlIlII();
            this.IllllIIlIlIllIIIllII = true;
        }
        catch (Throwable t) {
            final net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(t, "Starting integrated server");
            final net.minecraft.llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII llllIIIIlIIIlIlllIll3 = llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll("Starting integrated server");
            llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll("Level ID", s);
            llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll("Level Name", s2);
            throw new IIlIlllIlIlllIlIllll(llllIIIIlIIIlIlllIll2);
        }
        this.llllIIllllIlIlIIIIll.IlIlIlIlIlllllllllIl(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("menu.loadingLevel", new Object[0]));
        while (!this.IIIllIIIlIlIIllIIIlI.lllllIIlIlIIIlIlIIIl()) {
            final String liiIlllIIIllIIIllIII = this.IIIllIIIlIlIIllIIIlI.lIIIlllIIIllIIIllIII();
            if (liiIlllIIIllIIIllIII != null) {
                this.llllIIllllIlIlIIIIll.llIllIIIIIllIlIIIIlI(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII, new Object[0]));
            }
            else {
                this.llllIIllllIlIlIIIIll.llIllIIIIIllIlIIIIlI("");
            }
            try {
                Thread.sleep(200L);
            }
            catch (InterruptedException ex) {}
        }
        this.llllIIIIlIIIlIlllIll((lIIllIIIllllIlllIllI)null);
        final SocketAddress llllIIIIlIIIlIlllIll4 = this.IIIllIIIlIlIIllIIIlI.IlIIlllllIIllIIlllll().llllIIIIlIIIlIlllIll();
        final net.minecraft.IlIlIIIllIIllIlllllI.IIlllIIlIllIllIlIIll llllIIIIlIIIlIlllIll5 = net.minecraft.IlIlIIIllIIllIlllllI.IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll4);
        llllIIIIlIIIlIlllIll5.llllIIIIlIIIlIlllIll(new net.minecraft.client.IllIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl(llllIIIIlIIIlIlllIll5, this, null));
        llllIIIIlIIIlIlllIll5.llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(47, llllIIIIlIIIlIlllIll4.toString(), 0, net.minecraft.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl));
        llllIIIIlIIIlIlllIll5.llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IIIIIllIIIIlIIIIllIl().IlIlIIIllIllIIIIIllI()));
        this.IlIIIIIlIIllIIlIlIll = llllIIIIlIIIlIlllIll5;
    }
    
    public void llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        this.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl, "");
    }
    
    public void llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl illIIlllIIIIlllIIlIl, final String s) {
        if (illIIlllIIIIlllIIlIl == null) {
            final net.minecraft.client.IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII iiIlIIIlIlIIlllIIlll = this.IIIlIIIlIlIIlllIIlll();
            if (iiIlIIIlIlIIlllIIlll != null) {
                iiIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll();
            }
            if (this.IIIllIIIlIlIIllIIIlI != null && this.IIIllIIIlIlIIllIIIlI.IIIIIIIIIlllIllIlIlI()) {
                this.IIIllIIIlIlIIllIIIlI.IIIlIIIlIlIIlllIIlll();
                this.IIIllIIIlIlIIllIIIlI.lllllIlIlIlllIlllIlI();
            }
            this.IIIllIIIlIlIIllIIIlI = null;
            this.IIlllIIlIllIllIlIIll.IlIlIlIlIlllllllllIl();
            this.IlIllIlIlIIIlIlIlIII.llIIlIIIlIIIllIlIIIl().llllIIIIlIIIlIlllIll();
        }
        this.lllllIIIIIlIlIIIIIIl = null;
        this.IlIIIIIlIIllIIlIlIll = null;
        if (this.llllIIllllIlIlIIIIll != null) {
            this.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll(s);
            this.llllIIllllIlIlIIIIll.llIllIIIIIllIlIIIIlI("");
        }
        if (illIIlllIIIIlllIIlIl == null && this.IllIIlllIIIIlllIIlIl != null) {
            this.IIIIIIIllllIlIIIIIII.IllIIlllIIIIlllIIlIl();
            this.lllIIIIlllllIlIIllIl.lIIIlllIIIllIIIllIII();
            this.llllIIIIlIIIlIlllIll((IllIIlllIIIIlllIIlIl)null);
            this.IllllIIlIlIllIIIllII = false;
        }
        this.lllIlIIIIIlIlllllIlI.llIllIIIIIllIlIIIIlI();
        if ((this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl) != null) {
            if (this.llllIIIlIlllIlIIIIIl != null) {
                this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl);
            }
            if (this.llIIlIIIlIIIllIlIIIl != null) {
                this.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl);
            }
            if (this.lIIIIlIIIIIlllIllIII == null) {
                this.lIIIIlIIIIIlllIllIII = this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl, new net.minecraft.IIIlIIIlIlIIlllIIlll.IlIlIIIllIIllIlllllI());
                this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this.lIIIIlIIIIIlllIllIII);
            }
            this.lIIIIlIIIIIlllIllIII.IIlIlIlIIlIllIIIIIIl();
            illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII);
            this.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl = new IIlllIIIllIllIIlIlIl(this.IIIlIIIlIlIIlllIIlll);
            this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII);
            this.lllllIIIIIlIlIIIIIIl = this.lIIIIlIIIIIlllIllIII;
        }
        else {
            this.IIlllllIllIllIlIlIII.IlIIIlIlIIIllIlIlIIl();
            this.lIIIIlIIIIIlllIllIII = null;
        }
        System.gc();
        this.IIIlIIlIIIIlllIlllII = 0L;
    }
    
    public void llllIIIIlIIIlIlllIll(final int lllllIIIIIlIIlllIlIl) {
        this.IllIIlllIIIIlllIIlIl.llIllIlIIIIllIlIIllI();
        this.IllIIlllIIIIlllIIlIl.llllIIIlIlllIlIIIIIl();
        int illlIIIIlIIIlIlIlIIl = 0;
        String iIlllIIIlIlllIIlllII = null;
        if (this.lIIIIlIIIIIlllIllIII != null) {
            illlIIIIlIIIlIlIlIIl = this.lIIIIlIIIIIlllIllIII.IlllIIIIlIIIlIlIlIIl();
            this.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl(this.lIIIIlIIIIIlllIllIII);
            iIlllIIIlIlllIIlllII = this.lIIIIlIIIIIlllIllIII.IIlllIIIlIlllIIlllII();
        }
        this.lllllIIIIIlIlIIIIIIl = null;
        final llIllIIIIIllIlIIIIlI liiiIlIIIIIlllIllIII = this.lIIIIlIIIIIlllIllIII;
        this.lIIIIlIIIIIlllIllIII = this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl, (this.lIIIIlIIIIIlllIllIII == null) ? new net.minecraft.IIIlIIIlIlIIlllIIlll.IlIlIIIllIIllIlllllI() : this.lIIIIlIIIIIlllIllIII.IIlIIIIIllIlIIIlIIll());
        this.lIIIIlIIIIIlllIllIII.llIllIlIlIIIIIIIllII().llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII.llIllIlIlIIIIIIIllII().llIllIIIIIllIlIIIIlI());
        this.lIIIIlIIIIIlllIllIII.lllllIIIIIlIIlllIlIl = lllllIIIIIlIIlllIlIl;
        this.lllllIIIIIlIlIIIIIIl = this.lIIIIlIIIIIlllIllIII;
        this.lIIIIlIIIIIlllIllIII.IIlIlIlIIlIllIIIIIIl();
        this.lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI(iIlllIIIlIlllIIlllII);
        this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII);
        this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this.lIIIIlIIIIIlllIllIII);
        this.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl = new IIlllIIIllIllIIlIlIl(this.IIIlIIIlIlIIlllIIlll);
        this.lIIIIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl(illlIIIIlIIIlIlIlIIl);
        this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII);
        this.lIIIIlIIIIIlllIllIII.lIlIlIIIllIIllIIIllI(liiiIlIIIIIlllIllIII.av());
        if (this.IIIIlllIIIIIIlIIIlll instanceof IlIlIllllllllIIIIlII) {
            this.llllIIIIlIIIlIlllIll((lIIllIIIllllIlllIllI)null);
        }
    }
    
    public final boolean IIllIIllIIIlIlIIIIlI() {
        return this.lllllIIllIlIllIllllI;
    }
    
    public net.minecraft.client.IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII IIIlIIIlIlIIlllIIlll() {
        return (this.lIIIIlIIIIIlllIllIII != null) ? this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll : null;
    }
    
    public static boolean IlIlIIIlIIlIlIIlllIl() {
        return Minecraft.IllIllIlllIllllIIllI == null || !Minecraft.IllIllIlllIllllIIllI.IIIlIIIlIlIIlllIIlll.IIllIIIlIIIIlIIlIIII;
    }
    
    public static boolean IlllllllIIIlIIIlIlII() {
        return Minecraft.IllIllIlllIllllIIllI != null && Minecraft.IllIllIlllIllllIIllI.IIIlIIIlIlIIlllIIlll.lIIIlllIIIllIIIllIII;
    }
    
    public static boolean IIlIIIIlllIlllllIlII() {
        return Minecraft.IllIllIlllIllllIIllI != null && Minecraft.IllIllIlllIllllIIllI.IIIlIIIlIlIIlllIIlll.llIIlIIIlIIIllIlIIIl != 0;
    }
    
    private void IIllIIIlIIIIlIIlIIII() {
        if (this.IIllIIllIIIlIlIIIIlI != null) {
            final boolean ilIIIlIlIIIllIlIlIIl = this.lIIIIlIIIIIlllIllIII.K.IlIIIlIlIIIllIlIlIIl;
            int n = 0;
            boolean ilIlIlIlIlllllllllIl = false;
            net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = null;
            net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl2;
            if (this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll == net.minecraft.IlllllllIIIlIIIlIlII.lllllIlIlIlllIlllIlI.IlIlIlIlIlllllllllIl) {
                final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2 = this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll();
                final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = this.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2).llIllIIIIIllIlIIIIlI();
                if (llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
                    return;
                }
                ilIIIlIlIIIllIlIlIIl2 = llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI(this.IllIIlllIIIIlllIIlIl, llllIIIIlIIIlIlllIll2);
                if (ilIIIlIlIIIllIlIlIIl2 == null) {
                    return;
                }
                if (ilIIIlIlIIIllIlIlIIl && net.minecraft.client.llIllIIIIIllIlIIIIlI.lIIllIIIllllIlllIllI.IIIIlllIIIIIIlIIIlll()) {
                    llllIIIIlIIIlIlllIll = this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2);
                }
                n = ((ilIIIlIlIIIllIlIlIIl2 instanceof IIlllIIIlIlllIIlllII && !llIllIIIIIllIlIIIIlI.IlIIIlIIIllllIlIlIlI()) ? net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl2) : llIllIIIIIllIlIIIIlI).IllIIlllIIIIlllIIlIl(this.IllIIlllIIIIlllIIlIl, llllIIIIlIIIlIlllIll2);
                ilIlIlIlIlllllllllIl = ilIIIlIlIIIllIlIlIIl2.IlIlIlIlIlllllllllIl();
            }
            else {
                if (this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll != net.minecraft.IlllllllIIIlIIIlIlII.lllllIlIlIlllIlllIlI.llIllIIIIIllIlIIIIlI || this.IIllIIllIIIlIlIIIIlI.IlIIIlIlIIIllIlIlIIl == null || !ilIIIlIlIIIllIlIlIIl) {
                    return;
                }
                if (this.IIllIIllIIIlIlIIIIlI.IlIIIlIlIIIllIlIlIIl instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.IlIlIIIIIIlllIlIllIl) {
                    ilIIIlIlIIIllIlIlIIl2 = net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IIlllllIllIllIlIlIII;
                }
                else if (this.IIllIIllIIIlIlIIIIlI.IlIIIlIlIIIllIlIlIIl instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIIllIlllllI) {
                    ilIIIlIlIIIllIlIlIIl2 = net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.ar;
                }
                else if (this.IIllIIllIIIlIlIIIIlI.IlIIIlIlIIIllIlIlIIl instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llIIlIIIlIIIllIlIIIl) {
                    final lllIIIIlIlIllIIlIIIl llllIIllllIlIlIIIIll = ((net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llIIlIIIlIIIllIlIIIl)this.IIllIIllIIIlIlIIIIlI.IlIIIlIlIIIllIlIlIIl).llllIIllllIlIlIIIIll();
                    if (llllIIllllIlIlIIIIll == null) {
                        ilIIIlIlIIIllIlIlIIl2 = net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.T;
                    }
                    else {
                        ilIIIlIlIIIllIlIlIIl2 = llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll();
                        n = llllIIllllIlIlIIIIll.lIIIIlIIIIIlllIllIII();
                        ilIlIlIlIlllllllllIl = true;
                    }
                }
                else if (this.IIllIIllIIIlIlIIIIlI.IlIIIlIlIIIllIlIlIIl instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI) {
                    switch (lllllIIlIlIIIlIlIIIl()[((net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI)this.IIllIIllIIIlIlIIIIlI.IlIIIlIlIIIllIlIlIIl).llllIIIlIlllIlIIIIIl().ordinal()]) {
                        case 3: {
                            ilIIIlIlIIIllIlIlIIl2 = net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IllIlllIllIIIIllllII;
                            break;
                        }
                        case 2: {
                            ilIIIlIlIIIllIlIlIIl2 = net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.lllIIIIlIlIllIIlIIIl;
                            break;
                        }
                        case 4: {
                            ilIIIlIlIIIllIlIlIIl2 = net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.al;
                            break;
                        }
                        case 6: {
                            ilIIIlIlIIIllIlIlIIl2 = net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.am;
                            break;
                        }
                        case 7: {
                            ilIIIlIlIIIllIlIlIIl2 = net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.at;
                            break;
                        }
                        default: {
                            ilIIIlIlIIIllIlIlIIl2 = net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.lIIIIIlIlIIIlIIIIlIl;
                            break;
                        }
                    }
                }
                else if (this.IIllIIllIIIlIlIIIIlI.IlIIIlIlIIIllIlIlIIl instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl) {
                    ilIIIlIlIIIllIlIlIIl2 = net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.llIlllIlllllIIllIIII;
                }
                else if (this.IIllIIllIIIlIlIIIIlI.IlIIIlIlIIIllIlIlIIl instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll) {
                    ilIIIlIlIIIllIlIlIIl2 = net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.an;
                }
                else {
                    ilIIIlIlIIIllIlIlIIl2 = net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.N;
                    n = net.minecraft.llllIIIlIlllIlIIIIIl.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI.IlIIIlIlIIIllIlIlIIl);
                    ilIlIlIlIlllllllllIl = true;
                    if (!net.minecraft.llllIIIlIlllIlIIIIIl.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll.containsKey(n)) {
                        return;
                    }
                }
            }
            final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl lIlIlIIIllIIllIIIllI = this.lIIIIlIIIIIlllIllIII.lIlIlIIIllIIllIIIllI;
            if (llllIIIIlIIIlIlllIll == null) {
                lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl2, n, ilIlIlIlIlllllllllIl, ilIIIlIlIIIllIlIlIIl);
            }
            else {
                lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI(lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI, this.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl2, n, llllIIIIlIIIlIlllIll));
            }
            if (ilIIIlIlIIIllIlIlIIl) {
                this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI(lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI), this.lIIIIlIIIIIlllIllIII.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.size() - 9 + lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI);
            }
        }
    }
    
    private lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll(final net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final int n, final net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl2) {
        final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = new lllIIIIlIlIllIIlIIIl(ilIIIlIlIIIllIlIlIIl, 1, n);
        final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = new net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll();
        ilIIIlIlIIIllIlIlIIl2.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        if (ilIIIlIlIIIllIlIlIIl == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.ab && iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI("Owner")) {
            final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll ilIlIIIllIIllIlllllI = iiiIlllIIIIIIlIIIlll.IlIlIIIllIIllIlllllI("Owner");
            final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll2 = new net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll();
            iiiIlllIIIIIIlIIIlll2.llllIIIIlIIIlIlllIll("SkullOwner", ilIlIIIllIIllIlllllI);
            lllIIIIlIlIllIIlIIIl.IlIIIlIlIIIllIlIlIIl(iiiIlllIIIIIIlIIIlll2);
            return lllIIIIlIlIllIIlIIIl;
        }
        lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll("BlockEntityTag", iiiIlllIIIIIIlIIIlll);
        final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll3 = new net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll();
        final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl = new IlIlIIIlIIlIlIIlllIl();
        ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(new net.minecraft.lIlIlIIIllIIllIIIllI.IIIlIIlIIIIlllIlllII("(+NBT)"));
        iiiIlllIIIIIIlIIIlll3.llllIIIIlIIIlIlllIll("Lore", ilIlIIIlIIlIlIIlllIl);
        lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll("display", iiiIlllIIIIIIlIIIlll3);
        return lllIIIIlIlIllIIlIIIl;
    }
    
    public net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI(final net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl().llllIIIIlIIIlIlllIll("Launched Version", new net.minecraft.client.IIlllIIlIllIllIlIIll(this));
        llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl().llllIIIIlIIIlIlllIll("LWJGL", new lllIIIIlllllIlIIllIl(this));
        llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl().llllIIIIlIIIlIlllIll("OpenGL", new net.minecraft.client.IlIlIIIIIIlllIlIllIl(this));
        llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl().llllIIIIlIIIlIlllIll("GL Caps", new net.minecraft.client.IIllIIllIIIlIlIIIIlI(this));
        llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl().llllIIIIlIIIlIlllIll("Using VBOs", new IIIlIIIlIlIIlllIIlll(this));
        llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl().llllIIIIlIIIlIlllIll("Is Modded", new net.minecraft.client.IllIIlllIIIIlllIIlIl(this));
        llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl().llllIIIIlIIIlIlllIll("Type", new net.minecraft.client.llllIIIlIlllIlIIIIIl(this));
        llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl().llllIIIIlIIIlIlllIll("Resource Packs", new net.minecraft.client.lIIIIlIIIIIlllIllIII(this));
        llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl().llllIIIIlIIIlIlllIll("Current Language", new net.minecraft.client.lIIIlllIIIllIIIllIII(this));
        llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl().llllIIIIlIIIlIlllIll("Profiler Position", new net.minecraft.client.llIIlIIIlIIIllIlIIIl(this));
        llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl().llllIIIIlIIIlIlllIll("CPU", new net.minecraft.client.llIllIlIIIIllIlIIllI(this));
        if (this.IllIIlllIIIIlllIIlIl != null) {
            this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
        }
        return llllIIIIlIIIlIlllIll;
    }
    
    public static Minecraft getMinecraft() {
        return Minecraft.IllIllIlllIllllIIllI;
    }
    
    public ListenableFuture IlIlIllllllllIIIIlII() {
        return this.llllIIIIlIIIlIlllIll(new net.minecraft.client.lIlIlIIIllIIllIIIllI(this));
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("fps", Minecraft.llllIllllIllllIlIlII);
        ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("vsync_enabled", this.IIIlIIIlIlIIlllIIlll.IIllIIllIIIlIlIIIIlI);
        ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("display_frequency", Display.getDisplayMode().getFrequency());
        ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("display_type", this.llIlIIIIIlIIlIlIIlll ? "fullscreen" : "windowed");
        ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("run_time", (net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.lllllIIllIlIllIllllI() - ilIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl()) / 60L * 1000L);
        ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("current_action", this.IIIllIIllIIIIIIlIIlI());
        ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("endianness", (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) ? "little" : "big");
        ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("resource_packs", this.IIIIIIIllllIlIIIIIII.llIllIIIIIllIlIIIIlI().size());
        int n = 0;
        final Iterator<net.minecraft.client.llIIlIIIlIIIllIlIIIl.lllllIlIIIlIlIIlllII> iterator = this.IIIIIIIllllIlIIIIIII.llIllIIIIIllIlIIIIlI().iterator();
        while (iterator.hasNext()) {
            ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("resource_pack[" + n++ + "]", iterator.next().IlIIIlIlIIIllIlIlIIl());
        }
        if (this.IIIllIIIlIlIIllIIIlI != null && this.IIIllIIIlIlIIllIIIlI.lIIllIIIllllIlllIllI() != null) {
            ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("snooper_partner", this.IIIllIIIlIlIIllIIIlI.lIIllIIIllllIlllIllI().IllIIlllIIIIlllIIlIl());
        }
    }
    
    private String IIIllIIllIIIIIIlIIlI() {
        return (this.IIIllIIIlIlIIllIIIlI != null) ? (this.IIIllIIIlIlIIllIIIlI.IlIllllIIlIllIlIlIll() ? "hosting_lan" : "singleplayer") : ((this.IllIllIIIIlIIlIlllII != null) ? (this.IllIllIIIIlIIlIlllII.IlIIIlIlIIIllIlIlIIl() ? "playing_lan" : "multiplayer") : "out_of_game");
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("opengl_version", GL11.glGetString(7938));
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("opengl_vendor", GL11.glGetString(7936));
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("client_brand", net.minecraft.client.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll());
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("launched_version", this.IlIIlllllIIllIIlllll);
        final ContextCapabilities capabilities = GLContext.getCapabilities();
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[ARB_arrays_of_arrays]", capabilities.GL_ARB_arrays_of_arrays);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[ARB_base_instance]", capabilities.GL_ARB_base_instance);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[ARB_blend_func_extended]", capabilities.GL_ARB_blend_func_extended);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[ARB_clear_buffer_object]", capabilities.GL_ARB_clear_buffer_object);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[ARB_color_buffer_float]", capabilities.GL_ARB_color_buffer_float);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[ARB_compatibility]", capabilities.GL_ARB_compatibility);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[ARB_compressed_texture_pixel_storage]", capabilities.GL_ARB_compressed_texture_pixel_storage);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[ARB_compute_shader]", capabilities.GL_ARB_compute_shader);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[ARB_copy_buffer]", capabilities.GL_ARB_copy_buffer);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[ARB_copy_image]", capabilities.GL_ARB_copy_image);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[ARB_depth_buffer_float]", capabilities.GL_ARB_depth_buffer_float);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[ARB_compute_shader]", capabilities.GL_ARB_compute_shader);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[ARB_copy_buffer]", capabilities.GL_ARB_copy_buffer);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[ARB_copy_image]", capabilities.GL_ARB_copy_image);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[ARB_depth_buffer_float]", capabilities.GL_ARB_depth_buffer_float);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[ARB_depth_clamp]", capabilities.GL_ARB_depth_clamp);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[ARB_depth_texture]", capabilities.GL_ARB_depth_texture);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[ARB_draw_buffers]", capabilities.GL_ARB_draw_buffers);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[ARB_draw_buffers_blend]", capabilities.GL_ARB_draw_buffers_blend);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[ARB_draw_elements_base_vertex]", capabilities.GL_ARB_draw_elements_base_vertex);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[ARB_draw_indirect]", capabilities.GL_ARB_draw_indirect);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[ARB_draw_instanced]", capabilities.GL_ARB_draw_instanced);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[ARB_explicit_attrib_location]", capabilities.GL_ARB_explicit_attrib_location);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[ARB_explicit_uniform_location]", capabilities.GL_ARB_explicit_uniform_location);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[ARB_fragment_layer_viewport]", capabilities.GL_ARB_fragment_layer_viewport);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[ARB_fragment_program]", capabilities.GL_ARB_fragment_program);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[ARB_fragment_shader]", capabilities.GL_ARB_fragment_shader);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[ARB_fragment_program_shadow]", capabilities.GL_ARB_fragment_program_shadow);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[ARB_framebuffer_object]", capabilities.GL_ARB_framebuffer_object);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[ARB_framebuffer_sRGB]", capabilities.GL_ARB_framebuffer_sRGB);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[ARB_geometry_shader4]", capabilities.GL_ARB_geometry_shader4);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[ARB_gpu_shader5]", capabilities.GL_ARB_gpu_shader5);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[ARB_half_float_pixel]", capabilities.GL_ARB_half_float_pixel);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[ARB_half_float_vertex]", capabilities.GL_ARB_half_float_vertex);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[ARB_instanced_arrays]", capabilities.GL_ARB_instanced_arrays);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[ARB_map_buffer_alignment]", capabilities.GL_ARB_map_buffer_alignment);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[ARB_map_buffer_range]", capabilities.GL_ARB_map_buffer_range);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[ARB_multisample]", capabilities.GL_ARB_multisample);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[ARB_multitexture]", capabilities.GL_ARB_multitexture);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[ARB_occlusion_query2]", capabilities.GL_ARB_occlusion_query2);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[ARB_pixel_buffer_object]", capabilities.GL_ARB_pixel_buffer_object);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[ARB_seamless_cube_map]", capabilities.GL_ARB_seamless_cube_map);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[ARB_shader_objects]", capabilities.GL_ARB_shader_objects);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[ARB_shader_stencil_export]", capabilities.GL_ARB_shader_stencil_export);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[ARB_shader_texture_lod]", capabilities.GL_ARB_shader_texture_lod);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[ARB_shadow]", capabilities.GL_ARB_shadow);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[ARB_shadow_ambient]", capabilities.GL_ARB_shadow_ambient);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[ARB_stencil_texturing]", capabilities.GL_ARB_stencil_texturing);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[ARB_sync]", capabilities.GL_ARB_sync);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[ARB_tessellation_shader]", capabilities.GL_ARB_tessellation_shader);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[ARB_texture_border_clamp]", capabilities.GL_ARB_texture_border_clamp);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[ARB_texture_buffer_object]", capabilities.GL_ARB_texture_buffer_object);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[ARB_texture_cube_map]", capabilities.GL_ARB_texture_cube_map);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[ARB_texture_cube_map_array]", capabilities.GL_ARB_texture_cube_map_array);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[ARB_texture_non_power_of_two]", capabilities.GL_ARB_texture_non_power_of_two);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[ARB_uniform_buffer_object]", capabilities.GL_ARB_uniform_buffer_object);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[ARB_vertex_blend]", capabilities.GL_ARB_vertex_blend);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[ARB_vertex_buffer_object]", capabilities.GL_ARB_vertex_buffer_object);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[ARB_vertex_program]", capabilities.GL_ARB_vertex_program);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[ARB_vertex_shader]", capabilities.GL_ARB_vertex_shader);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[EXT_bindable_uniform]", capabilities.GL_EXT_bindable_uniform);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[EXT_blend_equation_separate]", capabilities.GL_EXT_blend_equation_separate);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[EXT_blend_func_separate]", capabilities.GL_EXT_blend_func_separate);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[EXT_blend_minmax]", capabilities.GL_EXT_blend_minmax);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[EXT_blend_subtract]", capabilities.GL_EXT_blend_subtract);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[EXT_draw_instanced]", capabilities.GL_EXT_draw_instanced);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[EXT_framebuffer_multisample]", capabilities.GL_EXT_framebuffer_multisample);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[EXT_framebuffer_object]", capabilities.GL_EXT_framebuffer_object);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[EXT_framebuffer_sRGB]", capabilities.GL_EXT_framebuffer_sRGB);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[EXT_geometry_shader4]", capabilities.GL_EXT_geometry_shader4);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[EXT_gpu_program_parameters]", capabilities.GL_EXT_gpu_program_parameters);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[EXT_gpu_shader4]", capabilities.GL_EXT_gpu_shader4);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[EXT_multi_draw_arrays]", capabilities.GL_EXT_multi_draw_arrays);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[EXT_packed_depth_stencil]", capabilities.GL_EXT_packed_depth_stencil);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[EXT_paletted_texture]", capabilities.GL_EXT_paletted_texture);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[EXT_rescale_normal]", capabilities.GL_EXT_rescale_normal);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[EXT_separate_shader_objects]", capabilities.GL_EXT_separate_shader_objects);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[EXT_shader_image_load_store]", capabilities.GL_EXT_shader_image_load_store);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[EXT_shadow_funcs]", capabilities.GL_EXT_shadow_funcs);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[EXT_shared_texture_palette]", capabilities.GL_EXT_shared_texture_palette);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[EXT_stencil_clear_tag]", capabilities.GL_EXT_stencil_clear_tag);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[EXT_stencil_two_side]", capabilities.GL_EXT_stencil_two_side);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[EXT_stencil_wrap]", capabilities.GL_EXT_stencil_wrap);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[EXT_texture_3d]", capabilities.GL_EXT_texture_3d);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[EXT_texture_array]", capabilities.GL_EXT_texture_array);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[EXT_texture_buffer_object]", capabilities.GL_EXT_texture_buffer_object);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[EXT_texture_integer]", capabilities.GL_EXT_texture_integer);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[EXT_texture_lod_bias]", capabilities.GL_EXT_texture_lod_bias);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[EXT_texture_sRGB]", capabilities.GL_EXT_texture_sRGB);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[EXT_vertex_shader]", capabilities.GL_EXT_vertex_shader);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[EXT_vertex_weighting]", capabilities.GL_EXT_vertex_weighting);
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[gl_max_vertex_uniforms]", GL11.glGetInteger(35658));
        GL11.glGetError();
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[gl_max_fragment_uniforms]", GL11.glGetInteger(35657));
        GL11.glGetError();
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[gl_max_vertex_attribs]", GL11.glGetInteger(34921));
        GL11.glGetError();
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[gl_max_vertex_texture_image_units]", GL11.glGetInteger(35660));
        GL11.glGetError();
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[gl_max_texture_image_units]", GL11.glGetInteger(34930));
        GL11.glGetError();
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_caps[gl_max_texture_image_units]", GL11.glGetInteger(35071));
        GL11.glGetError();
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gl_max_texture_size", IIlllIlIIllIlIlIlIIl());
    }
    
    public static int IIlllIlIIllIlIlIlIIl() {
        for (int i = 16384; i > 0; i >>= 1) {
            GL11.glTexImage2D(32868, 0, 6408, i, i, 0, 6408, 5121, (ByteBuffer)null);
            if (GL11.glGetTexLevelParameteri(32868, 0, 4096) != 0) {
                return i;
            }
        }
        return -1;
    }
    
    @Override
    public boolean llIIIlIlIllIIlIlIlII() {
        return this.IIIlIIIlIlIIlllIIlll.lllIIIIlllllIlIIllIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final IllIIlllIIIIlllIIlIl illIllIIIIlIIlIlllII) {
        this.IllIllIIIIlIIlIlllII = illIllIIIIlIIlIlllII;
    }
    
    public IllIIlllIIIIlllIIlIl lllllIlIIIlIlIIlllII() {
        return this.IllIllIIIIlIIlIlllII;
    }
    
    public boolean lIllllllIIllIlIlIlII() {
        return this.IllllIIlIlIllIIIllII;
    }
    
    public boolean llIIlllIIlllIIllIllI() {
        return this.IllllIIlIlIllIIIllII && this.IIIllIIIlIlIIllIIIlI != null;
    }
    
    public net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl IIlllIIIlIlllIIlllII() {
        return this.IIIllIIIlIlIIllIIIlI;
    }
    
    public static void IIlIIIIIllIlIIIlIIll() {
        if (Minecraft.IllIllIlllIllllIIllI != null) {
            final net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl iIlllIIIlIlllIIlllII = Minecraft.IllIllIlllIllllIIllI.IIlllIIIlIlllIIlllII();
            if (iIlllIIIlIlllIIlllII != null) {
                iIlllIIIlIlllIIlllII.IlIlIIIIIIlllIlIllIl();
            }
        }
    }
    
    public IlIlIlIlIlllllllllIl llllllIllIllIlIllllI() {
        return this.llIIIIIIlIllIIlIIIll;
    }
    
    public static long IIIllllllIllIIIlllIl() {
        return Sys.getTime() * 1000L / Sys.getTimerResolution();
    }
    
    public boolean IlIIIlIIIllllIlIlIlI() {
        return this.llIlIIIIIlIIlIlIIlll;
    }
    
    public Session IIIIIllIIIIlIIIIllIl() {
        return this.session;
    }
    
    public PropertyMap IIIIIIIIIlllIllIlIlI() {
        return this.llIllIlIlIIIIIIIllII;
    }
    
    public PropertyMap IIllllIIIlIIIIIIllIl() {
        if (this.IIlIlIlIIlIllIIIIIIl.isEmpty()) {
            this.IIlIlIlIIlIllIIIIIIl.putAll((Multimap)this.lIlIlIlllIIlIlIlllIl().fillProfileProperties(this.session.IlIlIIIllIllIIIIIllI(), false).getProperties());
        }
        return this.IIlIlIlIIlIllIIIIIIl;
    }
    
    public Proxy IlllIIIIlIIIlIlIlIIl() {
        return this.lllllIIlIlIIIlIlIIIl;
    }
    
    public IIlllIIlIllIllIlIIll lllIllIIIllllllIllll() {
        return this.IlIllllIIlIIlIlIlIll;
    }
    
    public net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIIIllIIllIlllllI llIllIlIlIIIIIIIllII() {
        return this.IlIllllIIIlIllIlIIll;
    }
    
    public IIIlIIlIIIIlllIlllII IIlIlIlIIlIllIIIIIIl() {
        return this.IIIIIIIllllIlIIIIIII;
    }
    
    public net.minecraft.client.llIIlIIIlIIIllIlIIIl.IIlllIIlIllIllIlIIll IllIllIIIIlIIlIlllII() {
        return this.IIlllIIIllIllIIlIlIl;
    }
    
    public IlIlIIIIIIlllIlIllIl IlIllllIIlIIlIlIlIll() {
        return this.IlIllllIIlIllIlIlIll;
    }
    
    public boolean IllIllIlllIllllIIllI() {
        return this.llIllIIlllllllllllll;
    }
    
    public boolean llIlIIIIIlIIlIlIIlll() {
        return this.IllIIlllllIIllIIllIl;
    }
    
    public IlIllIlIlIIIlIlIlIII IlIIlIlIIIlIIlIlIlII() {
        return this.lllIlIIIIIlIlllllIlI;
    }
    
    public net.minecraft.client.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl IllIlIIllIllIIlIllII() {
        return (this.lIIIIlIIIIIlllIllIII != null) ? ((this.lIIIIlIIIIIlllIllIII.IlllllllIIIlIIIlIlII.IlIllIlIlIIIlIlIlIII instanceof llIIlllIIlllIIllIllI) ? net.minecraft.client.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI : ((this.lIIIIlIIIIIlllIllIII.IlllllllIIIlIIIlIlII.IlIllIlIlIIIlIlIlIII instanceof net.minecraft.IIIlIIlIIIIlllIlllII.lIllllllIIllIlIlIlII) ? ((net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI != null && net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl > 0) ? net.minecraft.client.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl : net.minecraft.client.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl) : ((this.lIIIIlIIIIIlllIllIII.K.IlIIIlIlIIIllIlIlIIl && this.lIIIIlIIIIIlllIllIII.K.llIllIIIIIllIlIIIIlI) ? net.minecraft.client.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI : net.minecraft.client.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl))) : net.minecraft.client.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll;
    }
    
    public IlIlIIIllIIllIlllllI lIIlIIIlIllIlIllIIIl() {
        return this.llIlllIlllllIIllIIII;
    }
    
    public void IIlIIIlllIllIllIlIII() {
        final int n = (Keyboard.getEventKey() == 0) ? Keyboard.getEventCharacter() : Keyboard.getEventKey();
        if (n != 0 && !Keyboard.isRepeatEvent() && (!(this.IIIIlllIIIIIIlIIIlll instanceof net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIlIIIIllIlIIllI) || ((net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIlIIIIllIlIIllI)this.IIIIlllIIIIIIlIIIlll).llllIIIlIlllIlIIIIIl <= IIIllllllIllIIIlllIl() - 20L)) {
            if (Keyboard.getEventKeyState()) {
                if (n == this.IIIlIIIlIlIIlllIIlll.IIllIIIlIIlIlIlIIIII.lIIIlllIIIllIIIllIII()) {
                    if (this.lIIlIIIlIllIlIllIIIl().llIllIlIIIIllIlIIllI()) {
                        this.lIIlIIIlIllIlIllIIIl().lllIIIIlllllIlIIllIl();
                    }
                    else if (this.lIIlIIIlIllIlIllIIIl().llIIlIIIlIIIllIlIIIl()) {
                        this.llllIIIIlIIIlIlllIll(new b(new net.minecraft.client.IlIlIIIllIIllIlllllI(this), net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("stream.confirm_start", new Object[0]), "", 0));
                    }
                    else if (this.lIIlIIIlIllIlIllIIIl().IlIlIllllllllIIIIlII() && this.lIIlIIIlIllIlIllIIIl().lIIIlllIIIllIIIllIII()) {
                        if (this.IllIIlllIIIIlllIIlIl != null) {
                            this.lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl().llllIIIIlIIIlIlllIll(new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIIIIIIlllIlIllIl("Not ready to start streaming yet!"));
                        }
                    }
                    else {
                        net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this.IIIIlllIIIIIIlIIIlll);
                    }
                }
                else if (n == this.IIIlIIIlIlIIlllIIlll.llIllIIlllllllllllll.lIIIlllIIIllIIIllIII()) {
                    if (this.lIIlIIIlIllIlIllIIIl().llIllIlIIIIllIlIIllI()) {
                        if (this.lIIlIIIlIllIlIllIIIl().lIlIlIIIllIIllIIIllI()) {
                            this.lIIlIIIlIllIlIllIIIl().llllIIllllIlIlIIIIll();
                        }
                        else {
                            this.lIIlIIIlIllIlIllIIIl().IIIIlllIIIIIIlIIIlll();
                        }
                    }
                }
                else if (n == this.IIIlIIIlIlIIlllIIlll.lllllIIllIlIllIllllI.lIIIlllIIIllIIIllIII()) {
                    if (this.lIIlIIIlIllIlIllIIIl().llIllIlIIIIllIlIIllI()) {
                        this.lIIlIIIlIllIlIllIIIl().IlIlIIIllIIllIlllllI();
                    }
                }
                else if (n == this.IIIlIIIlIlIIlllIIlll.IlIIIIIlIIllIIlIlIll.lIIIlllIIIllIIIllIII()) {
                    this.llIlllIlllllIIllIIII.llllIIIIlIIIlIlllIll(true);
                }
                else if (n == this.IIIlIIIlIlIIlllIIlll.lIIllIIIllllIlllIllI.lIIIlllIIIllIIIllIII()) {
                    this.IIlllIIlIllIllIlIIll();
                }
                else if (n == this.IIIlIIIlIlIIlllIIlll.IIlllllIllIllIlIlIII.lIIIlllIIIllIIIllIII()) {
                    this.lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl().llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IllIlllIllIIIIllllII.llllIIIIlIIIlIlllIll(this.mcDataDir, this.IlIIIlIlIIIllIlIlIIl, this.IlIlIIIllIllIIIIIllI, this.lllllIlIlIlllIlllIlI));
                }
            }
            else if (n == this.IIIlIIIlIlIIlllIIlll.IlIIIIIlIIllIIlIlIll.lIIIlllIIIllIIIllIII()) {
                this.llIlllIlllllIIllIIII.llllIIIIlIIIlIlllIll(false);
            }
        }
    }
    
    public MinecraftSessionService lIlIlIlllIIlIlIlllIl() {
        return this.llllllIIIIIIIlllIIll;
    }
    
    public IIlIIIIIllIlIIIlIIll llIIIIIIlIllIIlIIIll() {
        return this.IIlIlllIlIlllIlIllll;
    }
    
    public net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI lIIIIlIlIllllIIlIllI() {
        return this.lllllIIIIIlIlIIIIIIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI lllllIIIIIlIlIIIIIIl) {
        this.lllllIIIIIlIlIIIIIIl = lllllIIIIIlIlIIIIIIl;
        this.IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(lllllIIIIIlIlIIIIIIl);
    }
    
    public ListenableFuture llllIIIIlIIIlIlllIll(final Callable callable) {
        Validate.notNull((Object)callable);
        if (!this.llIIIlIlllIllIIlIllI()) {
            final ListenableFutureTask create = ListenableFutureTask.create(callable);
            synchronized (this.lIllllIllIllIIllllll) {
                this.lIllllIllIllIIllllll.add(create);
                final ListenableFutureTask listenableFutureTask = create;
                // monitorexit(this.lIllllIllIllIIllllll)
                return (ListenableFuture)listenableFutureTask;
            }
        }
        try {
            return Futures.immediateFuture(callable.call());
        }
        catch (Exception ex) {
            return (ListenableFuture)Futures.immediateFailedCheckedFuture(ex);
        }
    }
    
    @Override
    public ListenableFuture llllIIIIlIIIlIlllIll(final Runnable runnable) {
        Validate.notNull((Object)runnable);
        return this.llllIIIIlIIIlIlllIll(Executors.callable(runnable));
    }
    
    @Override
    public boolean llIIIlIlllIllIIlIllI() {
        return Thread.currentThread() == this.IllIlllIllIIIIllllII;
    }
    
    public net.minecraft.client.lIIIlllIIIllIIIllIII.IlIllIlIlIIIlIlIlIII IlIIllIIllIIllIIlIIl() {
        return this.IlIllIIllIIlIIIIlIIl;
    }
    
    public lllIllIIIllllllIllll lllllIIIIIlIlIIIIIIl() {
        return this.lIIIIlIlIllllIIlIllI;
    }
    
    public IIlllIlIIllIlIlIlIIl IllIIlllllIIllIIllIl() {
        return this.llIIIlIlllIllIIlIllI;
    }
    
    public llIIIIIIlIllIIlIIIll lIllIIIIIlllIIlIIllI() {
        return this.IlIIllIIllIIllIIlIIl;
    }
    
    public static int lIlIIlllIIlIIlIlllIl() {
        return Minecraft.llllIllllIllllIlIlII;
    }
    
    public lIIlIIIlIllIlIllIIIl llIIIllIlIllIllIIIIl() {
        return this.IlIlIllllllllIIIIlII;
    }
    
    public static Map IIIllIIIlIlIIllIIIlI() {
        final HashMap hashMap = Maps.newHashMap();
        hashMap.put("X-Minecraft-Username", getMinecraft().IIIIIllIIIIlIIIIllIl().llIllIIIIIllIlIIIIlI());
        hashMap.put("X-Minecraft-UUID", getMinecraft().IIIIIllIIIIlIIIIllIl().IlIlIlIlIlllllllllIl());
        hashMap.put("X-Minecraft-Version", "1.8.9");
        return hashMap;
    }
    
    public boolean IIlllIIlllIIIlIlllII() {
        return this.IIlIIIlllIllIllIlIII;
    }
    
    public void llllIIIIlIIIlIlllIll(final boolean iIlIIIlllIllIllIlIII) {
        this.IIlIIIlllIllIllIlIII = iIlIIIlllIllIllIlIII;
    }
    
    static /* synthetic */ int[] IlIIlllllIIllIIlllll() {
        final int[] lIllIIlIlIlllllIIIII = Minecraft.lIllIIlIlIlllllIIIII;
        if (lIllIIlIlIlllllIIIII != null) {
            return lIllIIlIlIlllllIIIII;
        }
        final int[] lIllIIlIlIlllllIIIII2 = new int[lllllIlIlIlllIlllIlI.values().length];
        try {
            lIllIIlIlIlllllIIIII2[lllllIlIlIlllIlllIlI.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            lIllIIlIlIlllllIIIII2[lllllIlIlIlllIlllIlI.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            lIllIIlIlIlllllIIIII2[lllllIlIlIlllIlllIlI.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        return Minecraft.lIllIIlIlIlllllIIIII = lIllIIlIlIlllllIIIII2;
    }
    
    static /* synthetic */ int[] lllllIIlIlIIIlIlIIIl() {
        final int[] liIlIIIIIIIlIIlIlIIl = Minecraft.lIIlIIIIIIIlIIlIlIIl;
        if (liIlIIIIIIIlIIlIlIIl != null) {
            return liIlIIIIIIIlIIlIlIIl;
        }
        final int[] liIlIIIIIIIlIIlIlIIl2 = new int[net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI.values().length];
        try {
            liIlIIIIIIIlIIlIlIIl2[net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            liIlIIIIIIIlIIlIlIIl2[net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            liIlIIIIIIIlIIlIlIIl2[net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            liIlIIIIIIIlIIlIlIIl2[net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            liIlIIIIIIIlIIlIlIIl2[net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        try {
            liIlIIIIIIIlIIlIlIIl2[net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError6) {}
        try {
            liIlIIIIIIIlIIlIlIIl2[net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError7) {}
        return Minecraft.lIIlIIIIIIIlIIlIlIIl = liIlIIIIIIIlIIlIlIIl2;
    }
}
