package net.minecraft.IlIlIIIIIIlllIlIllIl;

import net.minecraft.IlIllIlIlIIIlIlIlIII.*;
import java.net.*;
import java.security.*;
import com.mojang.authlib.yggdrasil.*;
import com.mojang.authlib.minecraft.*;
import net.minecraft.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl.*;
import org.apache.logging.log4j.*;
import com.google.common.collect.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.*;
import java.text.*;
import javax.imageio.*;
import org.apache.commons.lang3.*;
import java.io.*;
import io.netty.handler.codec.base64.*;
import com.google.common.base.*;
import io.netty.buffer.*;
import java.awt.image.*;
import com.mojang.authlib.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;
import java.util.*;
import java.awt.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlIlIlIlIlllllllllIl.*;
import com.google.common.util.concurrent.*;
import java.util.concurrent.*;

public abstract class llllIIIIlIIIlIlllIll implements Runnable, IllIlIIllIllIIlIllII, net.minecraft.IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll, lIlIIlllIIlIIlIlllIl
{
    private static final Logger llIllIlIIIIllIlIIllI;
    public static final File llllIIIIlIIIlIlllIll;
    private static llllIIIIlIIIlIlllIll lIlIlIIIllIIllIIIllI;
    private final llIllIIIIIllIlIIIIlI IlIlIIIllIIllIlllllI;
    private final IlIlIlIlIlllllllllIl IIIIlllIIIIIIlIIIlll;
    private final File llllIIllllIlIlIIIIll;
    private final List IlIllIlIlIIIlIlIlIII;
    protected final IlIIlIlIIIlIIlIlIlII IlIlIlIlIlllllllllIl;
    public final IlIIIlIlIIIllIlIlIIl llIllIIIIIllIlIIIIlI;
    private final IIIlIIlIIIIlllIlllII IIlllIIlIllIllIlIIll;
    private final IIIIIIIIIlllIllIlIlI lllIIIIlllllIlIIllIl;
    private final Random IlIlIIIIIIlllIlIllIl;
    private int IIllIIllIIIlIlIIIIlI;
    public IIIllllllIllIIIlllIl[] IlIIIlIlIIIllIlIlIIl;
    private IlIllIlIlIIIlIlIlIII IIIlIIIlIlIIlllIIlll;
    private boolean IlIlIIIlIIlIlIIlllIl;
    private boolean IlllllllIIIlIIIlIlII;
    private int IIlIIIIlllIlllllIlII;
    protected final Proxy IlIlIIIllIllIIIIIllI;
    public String IllIIlllIIIIlllIIlIl;
    public int llllIIIlIlllIlIIIIIl;
    private boolean IIIlIIlIIIIlllIlllII;
    private boolean IlIlIllllllllIIIIlII;
    private boolean IIlllIlIIllIlIlIlIIl;
    private boolean llIIIlIlIllIIlIlIlII;
    private boolean lllllIlIIIlIlIIlllII;
    private String lIllllllIIllIlIlIlII;
    private int llIIlllIIlllIIllIllI;
    private int IIlllIIIlIlllIIlllII;
    public final long[] lIIIIlIIIIIlllIllIII;
    public long[][] lIIIlllIIIllIIIllIII;
    private KeyPair IIlIIIIIllIlIIIlIIll;
    private String llllllIllIllIlIllllI;
    private String IIIllllllIllIIIlllIl;
    private String IlIIIlIIIllllIlIlIlI;
    private boolean IIIIIllIIIIlIIIIllIl;
    private boolean IIIIIIIIIlllIllIlIlI;
    private boolean IIllllIIIlIIIIIIllIl;
    private String IlllIIIIlIIIlIlIlIIl;
    private String lllIllIIIllllllIllll;
    private boolean llIllIlIlIIIIIIIllII;
    private long IIlIlIlIIlIllIIIIIIl;
    private String IllIllIIIIlIIlIlllII;
    private boolean IlIllllIIlIIlIlIlIll;
    private boolean IllIllIlllIllllIIllI;
    private final YggdrasilAuthenticationService llIlIIIIIlIIlIlIIlll;
    private final MinecraftSessionService IlIIlIlIIIlIIlIlIlII;
    private long IllIlIIllIllIIlIllII;
    private final GameProfileRepository lIIlIIIlIllIlIllIIIl;
    private final lIIIIlIIIIIlllIllIII IIlIIIlllIllIllIlIII;
    protected final Queue llIIlIIIlIIIllIlIIIl;
    private Thread lIlIlIlllIIlIlIlllIl;
    private long llIIIIIIlIllIIlIIIll;
    
    static {
        llIllIlIIIIllIlIIllI = LogManager.getLogger();
        llllIIIIlIIIlIlllIll = new File("usercache.json");
    }
    
    public llllIIIIlIIIlIlllIll(final Proxy ilIlIIIllIllIIIIIllI, final File file) {
        this.IIIIlllIIIIIIlIIIlll = new IlIlIlIlIlllllllllIl("server", this, lllllIIllIlIllIllllI());
        this.IlIllIlIlIIIlIlIlIII = Lists.newArrayList();
        this.llIllIIIIIllIlIIIIlI = new IlIIIlIlIIIllIlIlIIl();
        this.lllIIIIlllllIlIIllIl = new IIIIIIIIIlllIllIlIlI();
        this.IlIlIIIIIIlllIlIllIl = new Random();
        this.IIllIIllIIIlIlIIIIlI = -1;
        this.IlIlIIIlIIlIlIIlllIl = true;
        this.IIlllIIIlIlllIIlllII = 0;
        this.lIIIIlIIIIIlllIllIII = new long[100];
        this.IlllIIIIlIIIlIlIlIIl = "";
        this.lllIllIIIllllllIllll = "";
        this.IllIlIIllIllIIlIllII = 0L;
        this.llIIlIIIlIIIllIlIIIl = Queues.newArrayDeque();
        this.llIIIIIIlIllIIlIIIll = lllllIIllIlIllIllllI();
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI = this;
        this.llllIIllllIlIlIIIIll = null;
        this.IIlllIIlIllIllIlIIll = null;
        this.IIlIIIlllIllIllIlIII = new lIIIIlIIIIIlllIllIII(this, file);
        this.IlIlIlIlIlllllllllIl = null;
        this.IlIlIIIllIIllIlllllI = null;
        this.llIlIIIIIlIIlIlIIlll = new YggdrasilAuthenticationService(ilIlIIIllIllIIIIIllI, UUID.randomUUID().toString());
        this.IlIIlIlIIIlIIlIlIlII = this.llIlIIIIIlIIlIlIIlll.createMinecraftSessionService();
        this.lIIlIIIlIllIlIllIIIl = this.llIlIIIIIlIIlIlIIlll.createProfileRepository();
    }
    
    public llllIIIIlIIIlIlllIll(final File llllIIllllIlIlIIIIll, final Proxy ilIlIIIllIllIIIIIllI, final File file) {
        this.IIIIlllIIIIIIlIIIlll = new IlIlIlIlIlllllllllIl("server", this, lllllIIllIlIllIllllI());
        this.IlIllIlIlIIIlIlIlIII = Lists.newArrayList();
        this.llIllIIIIIllIlIIIIlI = new IlIIIlIlIIIllIlIlIIl();
        this.lllIIIIlllllIlIIllIl = new IIIIIIIIIlllIllIlIlI();
        this.IlIlIIIIIIlllIlIllIl = new Random();
        this.IIllIIllIIIlIlIIIIlI = -1;
        this.IlIlIIIlIIlIlIIlllIl = true;
        this.IIlllIIIlIlllIIlllII = 0;
        this.lIIIIlIIIIIlllIllIII = new long[100];
        this.IlllIIIIlIIIlIlIlIIl = "";
        this.lllIllIIIllllllIllll = "";
        this.IllIlIIllIllIIlIllII = 0L;
        this.llIIlIIIlIIIllIlIIIl = Queues.newArrayDeque();
        this.llIIIIIIlIllIIlIIIll = lllllIIllIlIllIllllI();
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI = this;
        this.llllIIllllIlIlIIIIll = llllIIllllIlIlIIIIll;
        this.IIlllIIlIllIllIlIIll = new IIIlIIlIIIIlllIlllII(this);
        this.IIlIIIlllIllIllIlIII = new lIIIIlIIIIIlllIllIII(this, file);
        this.IlIlIlIlIlllllllllIl = this.llllIIIlIlllIlIIIIIl();
        this.IlIlIIIllIIllIlllllI = new net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(llllIIllllIlIlIIIIll);
        this.llIlIIIIIlIIlIlIIlll = new YggdrasilAuthenticationService(ilIlIIIllIllIIIIIllI, UUID.randomUUID().toString());
        this.IlIIlIlIIIlIIlIlIlII = this.llIlIIIIIlIIlIlIIlll.createMinecraftSessionService();
        this.lIIlIIIlIllIlIllIIIl = this.llIlIIIIIlIIlIlIIlll.createProfileRepository();
    }
    
    protected lllllIIlIlIIIlIlIIIl llllIIIlIlllIlIIIIIl() {
        return new lllllIIlIlIIIlIlIIIl();
    }
    
    protected abstract boolean lIIIIlIIIIIlllIllIII();
    
    protected void llllIIIIlIIIlIlllIll(final String s) {
        if (this.llIlIIIIIlIIlIlIIlll().IlIlIlIlIlllllllllIl(s)) {
            net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI.info("Converting map!");
            this.IlIlIlIlIlllllllllIl("menu.convertingLevel");
            this.llIlIIIIIlIIlIlIIlll().llllIIIIlIIIlIlllIll(s, new net.minecraft.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl(this));
        }
    }
    
    protected synchronized void IlIlIlIlIlllllllllIl(final String illIllIIIIlIIlIlllII) {
        this.IllIllIIIIlIIlIlllII = illIllIIIIlIIlIlllII;
    }
    
    public synchronized String lIIIlllIIIllIIIllIII() {
        return this.IllIllIIIIlIIlIlllII;
    }
    
    protected void llllIIIIlIIIlIlllIll(final String s, final String s2, final long n, final llIllIlIlIIIIIIIllII llIllIlIlIIIIIIIllII, final String s3) {
        this.llllIIIIlIIIlIlllIll(s);
        this.IlIlIlIlIlllllllllIl("menu.loadingLevel");
        this.IlIIIlIlIIIllIlIlIIl = new IIIllllllIllIIIlllIl[3];
        this.lIIIlllIIIllIIIllIII = new long[this.IlIIIlIlIIIllIlIlIIl.length][100];
        final net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(s, true);
        this.llllIIIIlIIIlIlllIll(this.IIlIlIlIIlIllIIIIIIl(), llllIIIIlIIIlIlllIll);
        llllIIllllIlIlIIIIll llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
        IlllIIIIlIIIlIlIlIIl llllllIllIllIlIllllI;
        if (llIllIIIIIllIlIIIIlI == null) {
            if (this.IllIllIlllIllllIIllI()) {
                llllllIllIllIlIllllI = net.minecraft.IIIlIIlIIIIlllIlllII.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl.llllllIllIllIlIllllI;
            }
            else {
                llllllIllIllIlIllllI = new IlllIIIIlIIIlIlIlIIl(n, this.lIlIlIIIllIIllIIIllI(), this.llIllIlIIIIllIlIIllI(), this.IIIIlllIIIIIIlIIIlll(), llIllIlIlIIIIIIIllII);
                llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(s3);
                if (this.IIIIIIIIIlllIllIlIlI) {
                    llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll();
                }
            }
            llIllIIIIIllIlIIIIlI = new llllIIllllIlIlIIIIll(llllllIllIllIlIllllI, s2);
        }
        else {
            llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(s2);
            llllllIllIllIlIllllI = new IlllIIIIlIIIlIlIlIIl(llIllIIIIIllIlIIIIlI);
        }
        for (int i = 0; i < this.IlIIIlIlIIIllIlIlIIl.length; ++i) {
            int n2 = 0;
            if (i == 1) {
                n2 = -1;
            }
            if (i == 2) {
                n2 = 1;
            }
            if (i == 0) {
                if (this.IllIllIlllIllllIIllI()) {
                    this.IlIIIlIlIIIllIlIlIIl[i] = (IIIllllllIllIIIlllIl)new net.minecraft.IIIlIIlIIIIlllIlllII.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(this, llllIIIIlIIIlIlllIll, llIllIIIIIllIlIIIIlI, n2, this.llIllIIIIIllIlIIIIlI).lIIIlllIIIllIIIllIII();
                }
                else {
                    this.IlIIIlIlIIIllIlIlIIl[i] = (IIIllllllIllIIIlllIl)new IIIllllllIllIIIlllIl(this, llllIIIIlIIIlIlllIll, llIllIIIIIllIlIIIIlI, n2, this.llIllIIIIIllIlIIIIlI).lIIIlllIIIllIIIllIII();
                }
                this.IlIIIlIlIIIllIlIlIIl[i].llllIIIIlIIIlIlllIll(llllllIllIllIlIllllI);
            }
            else {
                this.IlIIIlIlIIIllIlIlIIl[i] = (IIIllllllIllIIIlllIl)new net.minecraft.IIIlIIlIIIIlllIlllII.IIIIIIIIIlllIllIlIlI(this, llllIIIIlIIIlIlllIll, n2, this.IlIIIlIlIIIllIlIlIIl[0], this.llIllIIIIIllIlIIIIlI).lIIIlllIIIllIIIllIII();
            }
            this.IlIIIlIlIIIllIlIlIIl[i].llllIIIIlIIIlIlllIll(new llIIIlIlIllIIlIlIlII(this, this.IlIIIlIlIIIllIlIlIIl[i]));
            if (!this.llIllIlIlIIIIIIIllII()) {
                this.IlIIIlIlIIIllIlIlIIl[i].lIllllllIIllIlIlIlII().llllIIIIlIIIlIlllIll(this.lIlIlIIIllIIllIIIllI());
            }
        }
        this.IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl);
        this.llllIIIIlIIIlIlllIll(this.IlIlIIIllIIllIlllllI());
        this.llIIlIIIlIIIllIlIIIl();
    }
    
    protected void llIIlIIIlIIIllIlIIIl() {
        int n = 0;
        this.IlIlIlIlIlllllllllIl("menu.generatingTerrain");
        final int n2 = 0;
        net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI.info("Preparing start region for level " + n2);
        final IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl = this.IlIIIlIlIIIllIlIlIIl[n2];
        final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl iIlllIlIIllIlIlIlIIl = iiIllllllIllIIIlllIl.IIlllIlIIllIlIlIlIIl();
        long lllllIIllIlIllIllllI = lllllIIllIlIllIllllI();
        for (int n3 = -192; n3 <= 192 && this.IIllIIllIIIlIlIIIIlI(); n3 += 16) {
            for (int n4 = -192; n4 <= 192 && this.IIllIIllIIIlIlIIIIlI(); n4 += 16) {
                final long lllllIIllIlIllIllllI2 = lllllIIllIlIllIllllI();
                if (lllllIIllIlIllIllllI2 - lllllIIllIlIllIllllI > 1000L) {
                    this.llllIIIIlIIIlIlllIll("Preparing spawn area", n * 100 / 625);
                    lllllIIllIlIllIllllI = lllllIIllIlIllIllllI2;
                }
                ++n;
                iiIllllllIllIIIlllIl.llIIlllIIlllIIllIllI.llIllIIIIIllIlIIIIlI(iIlllIlIIllIlIlIlIIl.lIIIIlIIIIIlllIllIII() + n3 >> 4, iIlllIlIIllIlIlIlIIl.llIIlIIIlIIIllIlIIIl() + n4 >> 4);
            }
        }
        this.lllIIIIlllllIlIIllIl();
    }
    
    protected void llllIIIIlIIIlIlllIll(final String s, final net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        final File file = new File(ilIIIlIlIIIllIlIlIIl.IllIIlllIIIIlllIIlIl(), "resources.zip");
        if (file.isFile()) {
            this.llllIIIIlIIIlIlllIll("level://" + s + "/" + file.getName(), "");
        }
    }
    
    public abstract boolean llIllIlIIIIllIlIIllI();
    
    public abstract lllIllIIIllllllIllll lIlIlIIIllIIllIIIllI();
    
    public abstract IllIIlllIIIIlllIIlIl IlIlIIIllIIllIlllllI();
    
    public abstract boolean IIIIlllIIIIIIlIIIlll();
    
    public abstract int llllIIllllIlIlIIIIll();
    
    public abstract boolean IlIllIlIlIIIlIlIlIII();
    
    public abstract boolean IIlllIIlIllIllIlIIll();
    
    protected void llllIIIIlIIIlIlllIll(final String illIIlllIIIIlllIIlIl, final int llllIIIlIlllIlIIIIIl) {
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI.info(String.valueOf(illIIlllIIIIlllIIlIl) + ": " + llllIIIlIlllIlIIIIIl + "%");
    }
    
    protected void lllIIIIlllllIlIIllIl() {
        this.IllIIlllIIIIlllIIlIl = null;
        this.llllIIIlIlllIlIIIIIl = 0;
    }
    
    protected void llllIIIIlIIIlIlllIll(final boolean b) {
        if (!this.IIllllIIIlIIIIIIllIl) {
            IIIllllllIllIIIlllIl[] ilIIIlIlIIIllIlIlIIl;
            for (int length = (ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl).length, i = 0; i < length; ++i) {
                final IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl = ilIIIlIlIIIllIlIlIIl[i];
                if (iiIllllllIllIIIlllIl != null) {
                    if (!b) {
                        net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI.info("Saving chunks for level '" + iiIllllllIllIIIlllIl.lIllllllIIllIlIlIlII().llIIlIIIlIIIllIlIIIl() + "'/" + iiIllllllIllIIIlllIl.IlIllIlIlIIIlIlIlIII.llIllIlIIIIllIlIIllI());
                    }
                    try {
                        iiIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(true, null);
                    }
                    catch (lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
                        net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI.warn(lllIIIIlllllIlIIllIl.getMessage());
                    }
                }
            }
        }
    }
    
    public void IlIlIIIIIIlllIlIllIl() {
        if (!this.IIllllIIIlIIIIIIllIl) {
            net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI.info("Stopping server");
            if (this.IlIIlllllIIllIIlllll() != null) {
                this.IlIIlllllIIllIIlllll().IlIlIlIlIlllllllllIl();
            }
            if (this.IIIlIIIlIlIIlllIIlll != null) {
                net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI.info("Saving players");
                this.IIIlIIIlIlIIlllIIlll.llIIlIIIlIIIllIlIIIl();
                this.IIIlIIIlIlIIlllIIlll.IIllIIllIIIlIlIIIIlI();
            }
            if (this.IlIIIlIlIIIllIlIlIIl != null) {
                net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI.info("Saving worlds");
                this.llllIIIIlIIIlIlllIll(false);
                for (int i = 0; i < this.IlIIIlIlIIIllIlIlIIl.length; ++i) {
                    this.IlIIIlIlIIIllIlIlIIl[i].lIlIlIlllIIlIlIlllIl();
                }
            }
            if (this.IIIIlllIIIIIIlIIIlll.IlIIIlIlIIIllIlIlIIl()) {
                this.IIIIlllIIIIIIlIIIlll.IlIlIIIllIllIIIIIllI();
            }
        }
    }
    
    public boolean IIllIIllIIIlIlIIIIlI() {
        return this.IlIlIIIlIIlIlIIlllIl;
    }
    
    public void IIIlIIIlIlIIlllIIlll() {
        this.IlIlIIIlIIlIlIIlllIl = false;
    }
    
    protected void IlllllllIIIlIIIlIlII() {
        net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI = this;
    }
    
    @Override
    public void run() {
        try {
            if (this.lIIIIlIIIIIlllIllIII()) {
                this.llIIIIIIlIllIIlIIIll = lllllIIllIlIllIllllI();
                long n = 0L;
                this.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(new IlIlIIIIIIlllIlIllIl(this.lIllllllIIllIlIlIlII));
                this.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(new IIllllIIIlIIIIIIllIl("1.8.9", 47));
                this.llllIIIIlIIIlIlllIll(this.lllIIIIlllllIlIIllIl);
                while (this.IlIlIIIlIIlIlIIlllIl) {
                    final long lllllIIllIlIllIllllI = lllllIIllIlIllIllllI();
                    long n2 = lllllIIllIlIllIllllI - this.llIIIIIIlIllIIlIIIll;
                    if (n2 > 2000L && this.llIIIIIIlIllIIlIIIll - this.IIlIlIlIIlIllIIIIIIl >= 15000L) {
                        net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI.warn("Can't keep up! Did the system time change, or is the server overloaded? Running {}ms behind, skipping {} tick(s)", new Object[] { n2, n2 / 50L });
                        n2 = 2000L;
                        this.IIlIlIlIIlIllIIIIIIl = this.llIIIIIIlIllIIlIIIll;
                    }
                    if (n2 < 0L) {
                        net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI.warn("Time ran backwards! Did the system time change?");
                        n2 = 0L;
                    }
                    n += n2;
                    this.llIIIIIIlIllIIlIIIll = lllllIIllIlIllIllllI;
                    if (this.IlIIIlIlIIIllIlIlIIl[0].lIIIIlIIIIIlllIllIII()) {
                        this.IlIlIllllllllIIIIlII();
                        n = 0L;
                    }
                    else {
                        while (n > 50L) {
                            n -= 50L;
                            this.IlIlIllllllllIIIIlII();
                        }
                    }
                    Thread.sleep(Math.max(1L, 50L - n));
                    this.llIllIlIlIIIIIIIllII = true;
                }
            }
            else {
                this.llllIIIIlIIIlIlllIll((net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll)null);
            }
        }
        catch (Throwable t) {
            net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI.error("Encountered an unexpected exception", t);
            net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll;
            if (t instanceof IIlIlllIlIlllIlIllll) {
                llllIIIIlIIIlIlllIll = this.IlIlIlIlIlllllllllIl(((IIlIlllIlIlllIlIllll)t).llllIIIIlIIIlIlllIll());
            }
            else {
                llllIIIIlIIIlIlllIll = this.IlIlIlIlIlllllllllIl(new net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll("Exception in server tick loop", t));
            }
            final File file = new File(new File(this.IIlIIIIlllIlllllIlII(), "crash-reports"), "crash-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date()) + "-server.txt");
            if (llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(file)) {
                net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI.error("This crash report has been saved to: " + file.getAbsolutePath());
            }
            else {
                net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI.error("We were unable to save this crash report to disk.");
            }
            this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
            return;
        }
        finally {
            Label_0512: {
                try {
                    this.IlllllllIIIlIIIlIlII = true;
                    this.IlIlIIIIIIlllIlIllIl();
                }
                catch (Throwable t2) {
                    net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI.error("Exception stopping the server", t2);
                    this.IIIlIIlIIIIlllIlllII();
                    break Label_0512;
                }
                finally {
                    this.IIIlIIlIIIIlllIlllII();
                }
                this.IIIlIIlIIIIlllIlllII();
            }
        }
        try {
            this.IlllllllIIIlIIIlIlII = true;
            this.IlIlIIIIIIlllIlIllIl();
        }
        catch (Throwable t3) {
            net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI.error("Exception stopping the server", t3);
            return;
        }
        finally {
            this.IIIlIIlIIIIlllIlllII();
        }
        this.IIIlIIlIIIIlllIlllII();
    }
    
    private void llllIIIIlIIIlIlllIll(final IIIIIIIIIlllIllIlIlI iiiiiiiiIlllIllIlIlI) {
        final File llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI("server-icon.png");
        if (llIllIIIIIllIlIIIIlI.isFile()) {
            final ByteBuf buffer = Unpooled.buffer();
            try {
                final BufferedImage read = ImageIO.read(llIllIIIIIllIlIIIIlI);
                Validate.validState(read.getWidth() == 64, "Must be 64 pixels wide", new Object[0]);
                Validate.validState(read.getHeight() == 64, "Must be 64 pixels high", new Object[0]);
                ImageIO.write(read, "PNG", new ByteBufOutputStream(buffer));
                iiiiiiiiIlllIllIlIlI.llllIIIIlIIIlIlllIll("data:image/png;base64," + Base64.encode(buffer).toString(Charsets.UTF_8));
            }
            catch (Exception ex) {
                net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI.error("Couldn't load server icon", (Throwable)ex);
                return;
            }
            finally {
                buffer.release();
            }
            buffer.release();
        }
    }
    
    public File IIlIIIIlllIlllllIlII() {
        return new File(".");
    }
    
    protected void llllIIIIlIIIlIlllIll(final net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
    }
    
    protected void IIIlIIlIIIIlllIlllII() {
    }
    
    public void IlIlIllllllllIIIIlII() {
        final long nanoTime = System.nanoTime();
        ++this.IIlIIIIlllIlllllIlII;
        if (this.IlIllllIIlIIlIlIlIll) {
            this.IlIllllIIlIIlIlIlIll = false;
            this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll = true;
            this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll();
        }
        this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll("root");
        this.IIlllIlIIllIlIlIlIIl();
        if (nanoTime - this.IllIlIIllIllIIlIllII >= 5000000000L) {
            this.IllIlIIllIllIIlIllII = nanoTime;
            this.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIllIIllIlllllI.lllIllIIIllllllIllll(this.IIlIIIIIllIlIIIlIIll(), this.IIlllIIIlIlllIIlllII()));
            final GameProfile[] array = new GameProfile[Math.min(this.IIlllIIIlIlllIIlllII(), 12)];
            final int llllIIIIlIIIlIlllIll = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.IlIlIIIIIIlllIlIllIl, 0, this.IIlllIIIlIlllIIlllII() - array.length);
            for (int i = 0; i < array.length; ++i) {
                array[i] = ((net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl)this.IIIlIIIlIlIIlllIIlll.IIIlIIIlIlIIlllIIlll().get(llllIIIIlIIIlIlllIll + i)).r();
            }
            Collections.shuffle(Arrays.asList(array));
            this.lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(array);
        }
        if (this.IIlIIIIlllIlllllIlII % 900 == 0) {
            this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll("save");
            this.IIIlIIIlIlIIlllIIlll.llIIlIIIlIIIllIlIIIl();
            this.llllIIIIlIIIlIlllIll(true);
            this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl();
        }
        this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll("tallying");
        this.lIIIIlIIIIIlllIllIII[this.IIlIIIIlllIlllllIlII % 100] = System.nanoTime() - nanoTime;
        this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl();
        this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll("snooper");
        if (!this.IIIIlllIIIIIIlIIIlll.IlIIIlIlIIIllIlIlIIl() && this.IIlIIIIlllIlllllIlII > 100) {
            this.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll();
        }
        if (this.IIlIIIIlllIlllllIlII % 6000 == 0) {
            this.IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl();
        }
        this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl();
        this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl();
    }
    
    public void IIlllIlIIllIlIlIlIIl() {
        this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll("jobs");
        synchronized (this.llIIlIIIlIIIllIlIIIl) {
            while (!this.llIIlIIIlIIIllIlIIIl.isEmpty()) {
                c.llllIIIIlIIIlIlllIll(this.llIIlIIIlIIIllIlIIIl.poll(), net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI);
            }
        }
        // monitorexit(this.llIIlIIIlIIIllIlIIIl)
        this.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI("levels");
        for (int i = 0; i < this.IlIIIlIlIIIllIlIlIIl.length; ++i) {
            final long nanoTime = System.nanoTime();
            if (i == 0 || this.lllllIlIIIlIlIIlllII()) {
                final IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl = this.IlIIIlIlIIIllIlIlIIl[i];
                this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(iiIllllllIllIIIlllIl.lIllllllIIllIlIlIlII().llIIlIIIlIIIllIlIIIl());
                if (this.IIlIIIIlllIlllllIlII % 20 == 0) {
                    this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll("timeSync");
                    this.IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl(iiIllllllIllIIIlllIl.IIIlIIlIIIIlllIlllII(), iiIllllllIllIIIlllIl.IlIlIllllllllIIIIlII(), iiIllllllIllIIIlllIl.llIIlllIIlllIIllIllI().IlIlIlIlIlllllllllIl("doDaylightCycle")), iiIllllllIllIIIlllIl.IlIllIlIlIIIlIlIlIII.IIlllIIlIllIllIlIIll());
                    this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl();
                }
                this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll("tick");
                try {
                    iiIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll();
                }
                catch (Throwable t) {
                    final net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(t, "Exception ticking world");
                    iiIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
                    throw new IIlIlllIlIlllIlIllll(llllIIIIlIIIlIlllIll);
                }
                try {
                    iiIllllllIllIIIlllIl.llllIIllllIlIlIIIIll();
                }
                catch (Throwable t2) {
                    final net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(t2, "Exception ticking world entities");
                    iiIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2);
                    throw new IIlIlllIlIlllIlIllll(llllIIIIlIIIlIlllIll2);
                }
                this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl();
                this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll("tracker");
                iiIllllllIllIIIlllIl.lIIIIlIlIllllIIlIllI().llllIIIIlIIIlIlllIll();
                this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl();
                this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl();
            }
            this.lIIIlllIIIllIIIllIII[i][this.IIlIIIIlllIlllllIlII % 100] = System.nanoTime() - nanoTime;
        }
        this.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI("connection");
        this.IlIIlllllIIllIIlllll().llIllIIIIIllIlIIIIlI();
        this.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI("players");
        this.IIIlIIIlIlIIlllIIlll.IlIlIIIllIllIIIIIllI();
        this.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI("tickables");
        for (int j = 0; j < this.IlIllIlIlIIIlIlIlIII.size(); ++j) {
            ((llIIIllIlIllIllIIIIl)this.IlIllIlIlIIIlIlIlIII.get(j)).llllIIIIlIIIlIlllIll();
        }
        this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl();
    }
    
    public boolean lllllIlIIIlIlIIlllII() {
        return true;
    }
    
    public void lIllllllIIllIlIlIlII() {
        (this.lIlIlIlllIIlIlIlllIl = new Thread(this, "Server thread")).start();
    }
    
    public File llIllIIIIIllIlIIIIlI(final String s) {
        return new File(this.IIlIIIIlllIlllllIlII(), s);
    }
    
    public void IlIIIlIlIIIllIlIlIIl(final String s) {
        net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI.warn(s);
    }
    
    public IIIllllllIllIIIlllIl llllIIIIlIIIlIlllIll(final int n) {
        return (n == -1) ? this.IlIIIlIlIIIllIlIlIIl[1] : ((n == 1) ? this.IlIIIlIlIIIllIlIlIIl[2] : this.IlIIIlIlIIIllIlIlIIl[0]);
    }
    
    public String llIIlllIIlllIIllIllI() {
        return "1.8.9";
    }
    
    public int IIlllIIIlIlllIIlllII() {
        return this.IIIlIIIlIlIIlllIIlll.IlIllIlIlIIIlIlIlIII();
    }
    
    public int IIlIIIIIllIlIIIlIIll() {
        return this.IIIlIIIlIlIIlllIIlll.IIlllIIlIllIllIlIIll();
    }
    
    public String[] llllllIllIllIlIllllI() {
        return this.IIIlIIIlIlIIlllIIlll.IllIIlllIIIIlllIIlIl();
    }
    
    public GameProfile[] IIIllllllIllIIIlllIl() {
        return this.IIIlIIIlIlIIlllIIlll.llllIIIlIlllIlIIIIIl();
    }
    
    public String IlIIIlIIIllllIlIlIlI() {
        return "vanilla";
    }
    
    public net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll IlIlIlIlIlllllllllIl(final net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl().llllIIIIlIIIlIlllIll("Profiler Position", new net.minecraft.IlIlIIIIIIlllIlIllIl.llIllIIIIIllIlIIIIlI(this));
        if (this.IIIlIIIlIlIIlllIIlll != null) {
            llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl().llllIIIIlIIIlIlllIll("Player Count", new net.minecraft.IlIlIIIIIIlllIlIllIl.IlIIIlIlIIIllIlIlIIl(this));
        }
        return llllIIIIlIIIlIlllIll;
    }
    
    public List llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, String substring, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final ArrayList arrayList = Lists.newArrayList();
        if (substring.startsWith("/")) {
            substring = substring.substring(1);
            final boolean b = !substring.contains(" ");
            final List llllIIIIlIIIlIlllIll = this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, substring, ilIlIlIlIlllllllllIl);
            if (llllIIIIlIIIlIlllIll != null) {
                for (final String s : llllIIIIlIIIlIlllIll) {
                    if (b) {
                        arrayList.add("/" + s);
                    }
                    else {
                        arrayList.add(s);
                    }
                }
            }
            return arrayList;
        }
        final String[] split = substring.split(" ", -1);
        final String s2 = split[split.length - 1];
        String[] illIIlllIIIIlllIIlIl;
        for (int length = (illIIlllIIIIlllIIlIl = this.IIIlIIIlIlIIlllIIlll.IllIIlllIIIIlllIIlIl()).length, i = 0; i < length; ++i) {
            final String s3 = illIIlllIIIIlllIIlIl[i];
            if (net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s2, s3)) {
                arrayList.add(s3);
            }
        }
        return arrayList;
    }
    
    public static llllIIIIlIIIlIlllIll IIIIIllIIIIlIIIIllIl() {
        return net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI;
    }
    
    public boolean IIIIIIIIIlllIllIlIlI() {
        return this.llllIIllllIlIlIIIIll != null;
    }
    
    @Override
    public String s_() {
        return "Server";
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llIIIIIIlIllIIlIIIll llIIIIIIlIllIIlIIIll) {
        net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI.info(llIIIIIIlIllIIlIIIll.lIIIIlIIIIIlllIllIII());
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final int n, final String s) {
        return true;
    }
    
    public IlIIlIlIIIlIIlIlIlII IIllllIIIlIIIIIIllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public KeyPair IlllIIIIlIIIlIlIlIIl() {
        return this.IIlIIIIIllIlIIIlIIll;
    }
    
    public String lllIllIIIllllllIllll() {
        return this.llllllIllIllIlIllllI;
    }
    
    public void IlIlIIIllIllIIIIIllI(final String llllllIllIllIlIllllI) {
        this.llllllIllIllIlIllllI = llllllIllIllIlIllllI;
    }
    
    public boolean llIllIlIlIIIIIIIllII() {
        return this.llllllIllIllIlIllllI != null;
    }
    
    public String IIlIlIlIIlIllIIIIIIl() {
        return this.IIIllllllIllIIIlllIl;
    }
    
    public void IllIIlllIIIIlllIIlIl(final String iiIllllllIllIIIlllIl) {
        this.IIIllllllIllIIIlllIl = iiIllllllIllIIIlllIl;
    }
    
    public void llllIIIlIlllIlIIIIIl(final String ilIIIlIIIllllIlIlIlI) {
        this.IlIIIlIIIllllIlIlIlI = ilIIIlIIIllllIlIlIlI;
    }
    
    public String IllIllIIIIlIIlIlllII() {
        return this.IlIIIlIIIllllIlIlIlI;
    }
    
    public void llllIIIIlIIIlIlllIll(final KeyPair iIlIIIIIllIlIIIlIIll) {
        this.IIlIIIIIllIlIIIlIIll = iIlIIIIIllIlIIIlIIll;
    }
    
    public void llllIIIIlIIIlIlllIll(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl) {
        for (int i = 0; i < this.IlIIIlIlIIIllIlIlIIl.length; ++i) {
            final IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl = this.IlIIIlIlIIIllIlIlIIl[i];
            if (iiIllllllIllIIIlllIl != null) {
                if (iiIllllllIllIIIlllIl.lIllllllIIllIlIlIlII().IlIlIIIIIIlllIlIllIl()) {
                    iiIllllllIllIIIlllIl.lIllllllIIllIlIlIlII().llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIlIIIIlllIlllII.IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl);
                    iiIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(true, true);
                }
                else if (this.llIllIlIlIIIIIIIllII()) {
                    iiIllllllIllIIIlllIl.lIllllllIIllIlIlIlII().llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl);
                    iiIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(iiIllllllIllIIIlllIl.lllIllIIIllllllIllll() != net.minecraft.IIIlIIlIIIIlllIlllII.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll, true);
                }
                else {
                    iiIllllllIllIIIlllIl.lIllllllIIllIlIlIlII().llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl);
                    iiIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(this.IlIllllIIlIIlIlIlIll(), this.IlIlIllllllllIIIIlII);
                }
            }
        }
    }
    
    protected boolean IlIllllIIlIIlIlIlIll() {
        return true;
    }
    
    public boolean IllIllIlllIllllIIllI() {
        return this.IIIIIllIIIIlIIIIllIl;
    }
    
    public void IlIlIlIlIlllllllllIl(final boolean iiiiIllIIIIlIIIIllIl) {
        this.IIIIIllIIIIlIIIIllIl = iiiiIllIIIIlIIIIllIl;
    }
    
    public void llIllIIIIIllIlIIIIlI(final boolean iiiiiiiiIlllIllIlIlI) {
        this.IIIIIIIIIlllIllIlIlI = iiiiiiiiIlllIllIlIlI;
    }
    
    public llIllIIIIIllIlIIIIlI llIlIIIIIlIIlIlIIlll() {
        return this.IlIlIIIllIIllIlllllI;
    }
    
    public void IlIIlIlIIIlIIlIlIlII() {
        this.IIllllIIIlIIIIIIllIl = true;
        this.llIlIIIIIlIIlIlIIlll().IlIIIlIlIIIllIlIlIIl();
        for (int i = 0; i < this.IlIIIlIlIIIllIlIlIIl.length; ++i) {
            final IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl = this.IlIIIlIlIIIllIlIlIIl[i];
            if (iiIllllllIllIIIlllIl != null) {
                iiIllllllIllIIIlllIl.lIlIlIlllIIlIlIlllIl();
            }
        }
        this.llIlIIIIIlIIlIlIIlll().IlIlIIIllIllIIIIIllI(this.IlIIIlIlIIIllIlIlIIl[0].lllllIlIIIlIlIIlllII().llllIIIlIlllIlIIIIIl());
        this.IIIlIIIlIlIIlllIIlll();
    }
    
    public String IllIlIIllIllIIlIllII() {
        return this.IlllIIIIlIIIlIlIlIIl;
    }
    
    public String lIIlIIIlIllIlIllIIIl() {
        return this.lllIllIIIllllllIllll;
    }
    
    public void llllIIIIlIIIlIlllIll(final String illlIIIIlIIIlIlIlIIl, final String lllIllIIIllllllIllll) {
        this.IlllIIIIlIIIlIlIlIIl = illlIIIIlIIIlIlIlIIl;
        this.lllIllIIIllllllIllll = lllIllIIIllllllIllll;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("whitelist_enabled", false);
        ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("whitelist_count", 0);
        if (this.IIIlIIIlIlIIlllIIlll != null) {
            ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("players_current", this.IIlllIIIlIlllIIlllII());
            ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("players_max", this.IIlIIIIIllIlIIIlIIll());
            ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("players_seen", this.IIIlIIIlIlIIlllIIlll.lllIIIIlllllIlIIllIl().length);
        }
        ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("uses_auth", this.IIIlIIlIIIIlllIlllII);
        ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("gui_state", this.IIlllllIllIllIlIlIII() ? "enabled" : "disabled");
        ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("run_time", (lllllIIllIlIllIllllI() - ilIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl()) / 60L * 1000L);
        ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("avg_tick_ms", (int)(llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII) * 1.0E-6));
        int n = 0;
        if (this.IlIIIlIlIIIllIlIlIIl != null) {
            for (int i = 0; i < this.IlIIIlIlIIIllIlIlIIl.length; ++i) {
                if (this.IlIIIlIlIIIllIlIlIIl[i] != null) {
                    final IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl = this.IlIIIlIlIIIllIlIlIIl[i];
                    final llllIIllllIlIlIIIIll lIllllllIIllIlIlIlII = iiIllllllIllIIIlllIl.lIllllllIIllIlIlIlII();
                    ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("world[" + n + "][dimension]", iiIllllllIllIIIlllIl.IlIllIlIlIIIlIlIlIII.IIlllIIlIllIllIlIIll());
                    ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("world[" + n + "][mode]", lIllllllIIllIlIlIlII.IIlllIIlIllIllIlIIll());
                    ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("world[" + n + "][difficulty]", iiIllllllIllIIIlllIl.lllIllIIIllllllIllll());
                    ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("world[" + n + "][hardcore]", lIllllllIIllIlIlIlII.IlIlIIIIIIlllIlIllIl());
                    ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("world[" + n + "][generator_name]", lIllllllIIllIlIlIlII.IIllIIllIIIlIlIIIIlI().llllIIIIlIIIlIlllIll());
                    ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("world[" + n + "][generator_version]", lIllllllIIllIlIlIlII.IIllIIllIIIlIlIIIIlI().IlIIIlIlIIIllIlIlIIl());
                    ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("world[" + n + "][height]", this.llIIlllIIlllIIllIllI);
                    ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("world[" + n + "][chunks_loaded]", iiIllllllIllIIIlllIl.llIIIlIlIllIIlIlIlII().IlIlIIIllIllIIIIIllI());
                    ++n;
                }
            }
        }
        ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("worlds", n);
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("singleplayer", this.llIllIlIlIIIIIIIllII());
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("server_brand", this.IlIIIlIIIllllIlIlIlI());
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("gui_supported", GraphicsEnvironment.isHeadless() ? "headless" : "supported");
        ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl("dedicated", this.IIlIIIlllIllIllIlIII());
    }
    
    @Override
    public boolean llIIIlIlIllIIlIlIlII() {
        return true;
    }
    
    public abstract boolean IIlIIIlllIllIllIlIII();
    
    public boolean lIlIlIlllIIlIlIlllIl() {
        return this.IIIlIIlIIIIlllIlllII;
    }
    
    public void IlIIIlIlIIIllIlIlIIl(final boolean iiIlIIlIIIIlllIlllII) {
        this.IIIlIIlIIIIlllIlllII = iiIlIIlIIIIlllIlllII;
    }
    
    public boolean llIIIIIIlIllIIlIIIll() {
        return this.IlIlIllllllllIIIIlII;
    }
    
    public void IlIlIIIllIllIIIIIllI(final boolean ilIlIllllllllIIIIlII) {
        this.IlIlIllllllllIIIIlII = ilIlIllllllllIIIIlII;
    }
    
    public boolean lIIIIlIlIllllIIlIllI() {
        return this.IIlllIlIIllIlIlIlIIl;
    }
    
    public abstract boolean IlIIllIIllIIllIIlIIl();
    
    public void IllIIlllIIIIlllIIlIl(final boolean iIlllIlIIllIlIlIlIIl) {
        this.IIlllIlIIllIlIlIlIIl = iIlllIlIIllIlIlIlIIl;
    }
    
    public boolean lllllIIIIIlIlIIIIIIl() {
        return this.llIIIlIlIllIIlIlIlII;
    }
    
    public void llllIIIlIlllIlIIIIIl(final boolean llIIIlIlIllIIlIlIlII) {
        this.llIIIlIlIllIIlIlIlII = llIIIlIlIllIIlIlIlII;
    }
    
    public boolean IllIIlllllIIllIIllIl() {
        return this.lllllIlIIIlIlIIlllII;
    }
    
    public void lIIIIlIIIIIlllIllIII(final boolean lllllIlIIIlIlIIlllII) {
        this.lllllIlIIIlIlIIlllII = lllllIlIIIlIlIIlllII;
    }
    
    public abstract boolean lIllIIIIIlllIIlIIllI();
    
    public String lIlIIlllIIlIIlIlllIl() {
        return this.lIllllllIIllIlIlIlII;
    }
    
    public void lIIIIlIIIIIlllIllIII(final String lIllllllIIllIlIlIlII) {
        this.lIllllllIIllIlIlIlII = lIllllllIIllIlIlIlII;
    }
    
    public int llIIIllIlIllIllIIIIl() {
        return this.llIIlllIIlllIIllIllI;
    }
    
    public void IlIlIlIlIlllllllllIl(final int llIIlllIIlllIIllIllI) {
        this.llIIlllIIlllIIllIllI = llIIlllIIlllIIllIllI;
    }
    
    public boolean IIIllIIIlIlIIllIIIlI() {
        return this.IlllllllIIIlIIIlIlII;
    }
    
    public IlIllIlIlIIIlIlIlIII IIlllIIlllIIIlIlllII() {
        return this.IIIlIIIlIlIIlllIIlll;
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIllIlIlIIIlIlIlIII iiIlIIIlIlIIlllIIlll) {
        this.IIIlIIIlIlIIlllIIlll = iiIlIIIlIlIIlllIIlll;
    }
    
    public void llllIIIIlIIIlIlllIll(final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        for (int i = 0; i < this.IlIIIlIlIIIllIlIlIIl.length; ++i) {
            IIIIIllIIIIlIIIIllIl().IlIIIlIlIIIllIlIlIIl[i].lIllllllIIllIlIlIlII().llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll);
        }
    }
    
    public IIIlIIlIIIIlllIlllII IlIIlllllIIllIIlllll() {
        return this.IIlllIIlIllIllIlIIll;
    }
    
    public boolean lllllIIlIlIIIlIlIIIl() {
        return this.llIllIlIlIIIIIIIllII;
    }
    
    public boolean IIlllllIllIllIlIlIII() {
        return false;
    }
    
    public abstract String llllIIIIlIIIlIlllIll(final lllIllIIIllllllIllll p0, final boolean p1);
    
    public int llllIllllIllllIlIlII() {
        return this.IIlIIIIlllIlllllIlII;
    }
    
    public void IIlIlIllllIlllIIIIll() {
        this.IlIllllIIlIIlIlIlIll = true;
    }
    
    public IlIlIlIlIlllllllllIl lIIllIIIllllIlllIllI() {
        return this.IIIIlllIIIIIIlIIIlll;
    }
    
    @Override
    public net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl IlIlIIIlIIlIlIIlllIl() {
        return net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public e j_() {
        return new e(0.0, 0.0, 0.0);
    }
    
    @Override
    public IlllllllIIIlIIIlIlII k_() {
        return this.IlIIIlIlIIIllIlIlIIl[0];
    }
    
    @Override
    public net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI l_() {
        return null;
    }
    
    public int IllIlIllIllIlllIIlll() {
        return 16;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return false;
    }
    
    public boolean IIllIIIlIIlIlIlIIIII() {
        return this.IllIllIlllIllllIIllI;
    }
    
    public Proxy llIllIIlllllllllllll() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public static long lllllIIllIlIllIllllI() {
        return System.currentTimeMillis();
    }
    
    public int IlIIIIIlIIllIIlIlIll() {
        return this.IIlllIIIlIlllIIlllII;
    }
    
    public void llIllIIIIIllIlIIIIlI(final int iIlllIIIlIlllIIlllII) {
        this.IIlllIIIlIlllIIlllII = iIlllIIIlIlllIIlllII;
    }
    
    @Override
    public llIIIIIIlIllIIlIIIll v_() {
        return new IlIlIIIIIIlllIlIllIl(this.s_());
    }
    
    public boolean IllllIIlIlIllIIIllII() {
        return true;
    }
    
    public MinecraftSessionService lllllIIIIIlIIlllIlIl() {
        return this.IlIIlIlIIIlIIlIlIlII;
    }
    
    public GameProfileRepository IlIllllIIIlIllIlIIll() {
        return this.lIIlIIIlIllIlIllIIIl;
    }
    
    public lIIIIlIIIIIlllIllIII lIIIIIlIlIIIlIIIIlIl() {
        return this.IIlIIIlllIllIllIlIII;
    }
    
    public IIIIIIIIIlllIllIlIlI IIllIIIlIIIIlIIlIIII() {
        return this.lllIIIIlllllIlIIllIl;
    }
    
    public void IIIllIIllIIIIIIlIIlI() {
        this.IllIlIIllIllIIlIllII = 0L;
    }
    
    public net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll(final UUID uuid) {
        IIIllllllIllIIIlllIl[] ilIIIlIlIIIllIlIlIIl;
        for (int length = (ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl).length, i = 0; i < length; ++i) {
            final IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl = ilIIIlIlIIIllIlIlIIl[i];
            if (iiIllllllIllIIIlllIl != null) {
                final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI ilIlIlIlIlllllllllIl = iiIllllllIllIIIlllIl.IlIlIlIlIlllllllllIl(uuid);
                if (ilIlIlIlIlllllllllIl != null) {
                    return ilIlIlIlIlllllllllIl;
                }
            }
        }
        return null;
    }
    
    @Override
    public boolean d_() {
        return IIIIIllIIIIlIIIIllIl().IlIIIlIlIIIllIlIlIIl[0].llIIlllIIlllIIllIllI().IlIlIlIlIlllllllllIl("sendCommandFeedback");
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII, final int n) {
    }
    
    public int IIIIIIIllllIlIIIIIII() {
        return 29999984;
    }
    
    public ListenableFuture llllIIIIlIIIlIlllIll(final Callable callable) {
        Validate.notNull((Object)callable);
        if (!this.llIIIlIlllIllIIlIllI() && !this.IIIllIIIlIlIIllIIIlI()) {
            final ListenableFutureTask create = ListenableFutureTask.create(callable);
            synchronized (this.llIIlIIIlIIIllIlIIIl) {
                this.llIIlIIIlIIIllIlIIIl.add(create);
                final ListenableFutureTask listenableFutureTask = create;
                // monitorexit(this.llIIlIIIlIIIllIlIIIl)
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
        return Thread.currentThread() == this.lIlIlIlllIIlIlIlllIl;
    }
    
    public int IIlllIIIllIllIIlIlIl() {
        return 256;
    }
}
