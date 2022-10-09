package net.minecraft.client.lIIIlllIIIllIIIllIII;

import net.minecraft.client.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import java.nio.*;
import net.minecraft.client.lIlIlIIIllIIllIIIllI.*;
import org.apache.logging.log4j.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import java.io.*;
import com.google.gson.*;
import com.google.common.base.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import leaf.*;
import org.lwjgl.util.glu.*;
import net.optifine.shaders.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;
import java.util.concurrent.*;
import net.minecraft.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import org.lwjgl.opengl.*;
import net.optifine.lIIIIlIIIIIlllIllIII.*;
import net.optifine.*;
import net.optifine.util.*;
import java.util.*;
import org.lwjgl.input.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl.*;

public class IIllIIllIIIlIlIIIIlI implements IIIIlllIIIIIIlIIIlll
{
    private static final Logger llIIlIIIlIIIllIlIIIl;
    private static final lIllllIllIllIIllllll llIllIlIIIIllIlIIllI;
    private static final lIllllIllIllIIllllll lIlIlIIIllIIllIIIllI;
    public static boolean llllIIIIlIIIlIlllIll;
    public static int IlIlIlIlIlllllllllIl;
    private Minecraft IlIlIIIllIIllIlllllI;
    private final IlIlIIIllIIllIlllllI IIIIlllIIIIIIlIIIlll;
    private Random llllIIllllIlIlIIIIll;
    private float IlIllIlIlIIIlIlIlIII;
    public llIIIIIIlIllIIlIIIll llIllIIIIIllIlIIIIlI;
    private final e IIlllIIlIllIllIlIIll;
    private int lllIIIIlllllIlIIllIl;
    private llIllIIIIIllIlIIIIlI IlIlIIIIIIlllIlIllIl;
    private IIllIIIlIIIIlIIlIIII IIllIIllIIIlIlIIIIlI;
    private IIllIIIlIIIIlIIlIIII IIIlIIIlIlIIlllIIlll;
    private float IlIlIIIlIIlIlIIlllIl;
    private float IlllllllIIIlIIIlIlII;
    private float IIlIIIIlllIlllllIlII;
    private float IIIlIIlIIIIlllIlllII;
    private float IlIlIllllllllIIIIlII;
    private float IIlllIlIIllIlIlIlIIl;
    private float llIIIlIlIllIIlIlIlII;
    private float lllllIlIIIlIlIIlllII;
    private float lIllllllIIllIlIlIlII;
    private float llIIlllIIlllIIllIllI;
    private float IIlllIIIlIlllIIlllII;
    private boolean IIlIIIIIllIlIIIlIIll;
    private boolean llllllIllIllIlIllllI;
    private boolean IIIllllllIllIIIlllIl;
    private long IlIIIlIIIllllIlIlIlI;
    private long IIIIIllIIIIlIIIIllIl;
    private final IlIlIlIlIlllllllllIl IIIIIIIIIlllIllIlIlI;
    private final int[] IIllllIIIlIIIIIIllIl;
    private final lIllllIllIllIIllllll IlllIIIIlIIIlIlIlIIl;
    private boolean lllIllIIIllllllIllll;
    private float llIllIlIlIIIIIIIllII;
    private float IIlIlIlIIlIllIIIIIIl;
    private int IllIllIIIIlIIlIlllII;
    private float[] IlIllllIIlIIlIlIlIll;
    private float[] IllIllIlllIllllIIllI;
    private FloatBuffer llIlIIIIIlIIlIlIIlll;
    public float IlIIIlIlIIIllIlIlIIl;
    public float IlIlIIIllIllIIIIIllI;
    public float IllIIlllIIIIlllIIlIl;
    private float IlIIlIlIIIlIIlIlIlII;
    private float IllIlIIllIllIIlIllII;
    private int lIIlIIIlIllIlIllIIIl;
    private boolean IIlIIIlllIllIllIlIII;
    private double lIlIlIlllIIlIlIlllIl;
    private double llIIIIIIlIllIIlIIIll;
    private double lIIIIlIlIllllIIlIllI;
    private IlIIIlIlIIIllIlIlIIl llIIIlIlllIllIIlIllI;
    private static final lIllllIllIllIIllllll[] IlIIllIIllIIllIIlIIl;
    public static final int llllIIIlIlllIlIIIIIl;
    private int lllllIIIIIlIlIIIIIIl;
    private boolean IllIIlllllIIllIIllIl;
    public int lIIIIlIIIIIlllIllIII;
    private boolean lIllIIIIIlllIIlIIllI;
    private IlllllllIIIlIIIlIlII lIlIIlllIIlIIlIlllIl;
    private boolean llIIIllIlIllIllIIIIl;
    public boolean lIIIlllIIIllIIIllIII;
    private float IIIllIIIlIlIIllIIIlI;
    private long IIlllIIlllIIIlIlllII;
    private int IlIIlllllIIllIIlllll;
    private int lllllIIlIlIIIlIlIIIl;
    private int IIlllllIllIllIlIlIII;
    private float llllIllllIllllIlIlII;
    private float IIlIlIllllIlllIIIIll;
    private IlIIIlIlIIIllIlIlIIl[] lIIllIIIllllIlllIllI;
    private boolean IllIlIllIllIlllIIlll;
    
    static {
        llIIlIIIlIIIllIlIIIl = LogManager.getLogger();
        llIllIlIIIIllIlIIllI = new lIllllIllIllIIllllll("textures/environment/rain.png");
        lIlIlIIIllIIllIIIllI = new lIllllIllIllIIllllll("textures/environment/snow.png");
        IlIIllIIllIIllIIlIIl = new lIllllIllIllIIllllll[] { new lIllllIllIllIIllllll("shaders/post/notch.json"), new lIllllIllIllIIllllll("shaders/post/fxaa.json"), new lIllllIllIllIIllllll("shaders/post/art.json"), new lIllllIllIllIIllllll("shaders/post/bumpy.json"), new lIllllIllIllIIllllll("shaders/post/blobs2.json"), new lIllllIllIllIIllllll("shaders/post/pencil.json"), new lIllllIllIllIIllllll("shaders/post/color_convolve.json"), new lIllllIllIllIIllllll("shaders/post/deconverge.json"), new lIllllIllIllIIllllll("shaders/post/flip.json"), new lIllllIllIllIIllllll("shaders/post/invert.json"), new lIllllIllIllIIllllll("shaders/post/ntsc.json"), new lIllllIllIllIIllllll("shaders/post/outline.json"), new lIllllIllIllIIllllll("shaders/post/phosphor.json"), new lIllllIllIllIIllllll("shaders/post/scan_pincushion.json"), new lIllllIllIllIIllllll("shaders/post/sobel.json"), new lIllllIllIllIIllllll("shaders/post/bits.json"), new lIllllIllIllIIllllll("shaders/post/desaturate.json"), new lIllllIllIllIIllllll("shaders/post/green.json"), new lIllllIllIllIIllllll("shaders/post/blur.json"), new lIllllIllIllIIllllll("shaders/post/wobble.json"), new lIllllIllIllIIllllll("shaders/post/blobs.json"), new lIllllIllIllIIllllll("shaders/post/antialias.json"), new lIllllIllIllIIllllll("shaders/post/creeper.json"), new lIllllIllIllIIllllll("shaders/post/spider.json") };
        llllIIIlIlllIlIIIIIl = IIllIIllIIIlIlIIIIlI.IlIIllIIllIIllIIlIIl.length;
    }
    
    public IIllIIllIIIlIlIIIIlI(final Minecraft ilIlIIIllIIllIlllllI, final IlIlIIIllIIllIlllllI iiiIlllIIIIIIlIIIlll) {
        this.llllIIllllIlIlIIIIll = new Random();
        this.IIllIIllIIIlIlIIIIlI = new IIllIIIlIIIIlIIlIIII();
        this.IIIlIIIlIlIIlllIIlll = new IIllIIIlIIIIlIIlIIII();
        this.IlIlIIIlIIlIlIIlllIl = 4.0f;
        this.IlllllllIIIlIIIlIlII = 4.0f;
        this.llllllIllIllIlIllllI = true;
        this.IIIllllllIllIIIlllIl = true;
        this.IlIIIlIIIllllIlIlIlI = Minecraft.IIIllllllIllIIIlllIl();
        this.IlIllllIIlIIlIlIlIll = new float[1024];
        this.IllIllIlllIllllIIllI = new float[1024];
        this.llIlIIIIIlIIlIlIIlll = net.minecraft.client.lIIIlllIIIllIIIllIII.llIIIlIlIllIIlIlIlII.IlIlIIIllIllIIIIIllI(16);
        this.lIIlIIIlIllIlIllIIIl = 0;
        this.IIlIIIlllIllIllIlIII = false;
        this.lIlIlIlllIIlIlIlllIl = 1.0;
        this.lIllIIIIIlllIIlIIllI = false;
        this.lIlIIlllIIlIIlIlllIl = null;
        this.llIIIllIlIllIllIIIIl = false;
        this.lIIIlllIIIllIIIllIII = false;
        this.IIIllIIIlIlIIllIIIlI = 128.0f;
        this.IIlllIIlllIIIlIlllII = 0L;
        this.IlIIlllllIIllIIlllll = 0;
        this.lllllIIlIlIIIlIlIIIl = 0;
        this.IIlllllIllIllIlIlIII = 0;
        this.llllIllllIllllIlIlII = 0.0f;
        this.IIlIlIllllIlllIIIIll = 0.0f;
        this.lIIllIIIllllIlllIllI = new IlIIIlIlIIIllIlIlIIl[10];
        this.IllIlIllIllIlllIIlll = false;
        this.lllllIIIIIlIlIIIIIIl = net.minecraft.client.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.llllIIIlIlllIlIIIIIl;
        this.IllIIlllllIIllIIllIl = false;
        this.lIIIIlIIIIIlllIllIII = 0;
        this.IlIlIIIllIIllIlllllI = ilIlIIIllIIllIlllllI;
        this.IIIIlllIIIIIIlIIIlll = iiiIlllIIIIIIlIIIlll;
        this.llIllIIIIIllIlIIIIlI = ilIlIIIllIIllIlllllI.lIllIIIIIlllIIlIIllI();
        this.IIlllIIlIllIllIlIIll = new e(ilIlIIIllIIllIlllllI.lllIllIIIllllllIllll());
        this.IIIIIIIIIlllIllIlIlI = new IlIlIlIlIlllllllllIl(16, 16);
        this.IlllIIIIlIIIlIlIlIIl = ilIlIIIllIIllIlllllI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll("lightMap", this.IIIIIIIIIlllIllIlIlI);
        this.IIllllIIIlIIIIIIllIl = this.IIIIIIIIIlllIllIlIlI.llIllIIIIIllIlIIIIlI();
        this.llIIIlIlllIllIIlIllI = null;
        for (int i = 0; i < 32; ++i) {
            for (int j = 0; j < 32; ++j) {
                final float n = (float)(j - 16);
                final float n2 = (float)(i - 16);
                final float llIllIIIIIllIlIIIIlI = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n * n + n2 * n2);
                this.IlIllllIIlIIlIlIlIll[i << 5 | j] = -n2 / llIllIIIIIllIlIIIIlI;
                this.IllIllIlllIllllIIllI[i << 5 | j] = n / llIllIIIIIllIlIIIIlI;
            }
        }
    }
    
    public boolean llllIIIIlIIIlIlllIll() {
        return net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lllIllIIIllllllIllll && this.llIIIlIlllIllIIlIllI != null;
    }
    
    public void IlIlIlIlIlllllllllIl() {
        if (this.llIIIlIlllIllIIlIllI != null) {
            this.llIIIlIlllIllIIlIllI.llllIIIIlIIIlIlllIll();
        }
        this.llIIIlIlllIllIIlIllI = null;
        this.lllllIIIIIlIlIIIIIIl = net.minecraft.client.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.llllIIIlIlllIlIIIIIl;
    }
    
    public void llIllIIIIIllIlIIIIlI() {
        this.IllIIlllllIIllIIllIl = !this.IllIIlllllIIllIIllIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        if (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lllIllIIIllllllIllll) {
            if (this.llIIIlIlllIllIIlIllI != null) {
                this.llIIIlIlllIllIIlIllI.llllIIIIlIIIlIlllIll();
            }
            this.llIIIlIlllIllIIlIllI = null;
            if (llIllIIIIIllIlIIIIlI instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl) {
                this.llllIIIIlIIIlIlllIll(new lIllllIllIllIIllllll("shaders/post/creeper.json"));
            }
            else if (llIllIIIIIllIlIIIIlI instanceof llIllIlIlIIIIIIIllII) {
                this.llllIIIIlIIIlIlllIll(new lIllllIllIllIIllllll("shaders/post/spider.json"));
            }
            else if (llIllIIIIIllIlIIIIlI instanceof IlIlIIIllIllIIIIIllI) {
                this.llllIIIIlIIIlIlllIll(new lIllllIllIllIIllllll("shaders/post/invert.json"));
            }
            else if (net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.b.llIllIIIIIllIlIIIIlI()) {
                net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl(net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.b, llIllIIIIIllIlIIIIlI, this);
            }
        }
    }
    
    public void IlIIIlIlIIIllIlIlIIl() {
        if (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lllIllIIIllllllIllll && this.IlIlIIIllIIllIlllllI.lIIIIlIlIllllIIlIllI() instanceof llllIIIIlIIIlIlllIll) {
            if (this.llIIIlIlllIllIIlIllI != null) {
                this.llIIIlIlllIllIIlIllI.llllIIIIlIIIlIlllIll();
            }
            this.lllllIIIIIlIlIIIIIIl = (this.lllllIIIIIlIlIIIIIIl + 1) % (net.minecraft.client.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IlIIllIIllIIllIIlIIl.length + 1);
            if (this.lllllIIIIIlIlIIIIIIl != net.minecraft.client.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.llllIIIlIlllIlIIIIIl) {
                this.llllIIIIlIIIlIlllIll(net.minecraft.client.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IlIIllIIllIIllIIlIIl[this.lllllIIIIIlIlIIIIIIl]);
            }
            else {
                this.llIIIlIlllIllIIlIllI = null;
            }
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final lIllllIllIllIIllllll lIllllIllIllIIllllll) {
        if (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIIIlllIIIllIIIllIII()) {
            try {
                (this.llIIIlIlllIllIIlIllI = new IlIIIlIlIIIllIlIlIIl(this.IlIlIIIllIIllIlllllI.lllIllIIIllllllIllll(), this.IIIIlllIIIIIIlIIIlll, this.IlIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl(), lIllllIllIllIIllllll)).llllIIIIlIIIlIlllIll(this.IlIlIIIllIIllIlllllI.IlIIIlIlIIIllIlIlIIl, this.IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI);
                this.IllIIlllllIIllIIllIl = true;
            }
            catch (IOException ex) {
                net.minecraft.client.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.llIIlIIIlIIIllIlIIIl.warn("Failed to load shader: " + lIllllIllIllIIllllll, (Throwable)ex);
                this.lllllIIIIIlIlIIIIIIl = net.minecraft.client.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.llllIIIlIlllIlIIIIIl;
                this.IllIIlllllIIllIIllIl = false;
            }
            catch (JsonSyntaxException ex2) {
                net.minecraft.client.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.llIIlIIIlIIIllIlIIIl.warn("Failed to load shader: " + lIllllIllIllIIllllll, (Throwable)ex2);
                this.lllllIIIIIlIlIIIIIIl = net.minecraft.client.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.llllIIIlIlllIlIIIIIl;
                this.IllIIlllllIIllIIllIl = false;
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI) {
        if (this.llIIIlIlllIllIIlIllI != null) {
            this.llIIIlIlllIllIIlIllI.llllIIIIlIIIlIlllIll();
        }
        this.llIIIlIlllIllIIlIllI = null;
        if (this.lllllIIIIIlIlIIIIIIl != net.minecraft.client.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.llllIIIlIlllIlIIIIIl) {
            this.llllIIIIlIIIlIlllIll(net.minecraft.client.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IlIIllIIllIIllIIlIIl[this.lllllIIIIIlIlIIIIIIl]);
        }
        else {
            this.llllIIIIlIIIlIlllIll(this.IlIlIIIllIIllIlllllI.lIIIIlIlIllllIIlIllI());
        }
    }
    
    public void IlIlIIIllIllIIIIIllI() {
        if (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lllIllIIIllllllIllll && net.minecraft.client.lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl() == null) {
            net.minecraft.client.lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll();
        }
        this.llIllIlIIIIllIlIIllI();
        this.lIlIlIIIllIIllIIIllI();
        this.IlIIlIlIIIlIIlIlIlII = this.IllIlIIllIllIIlIllII;
        this.IlllllllIIIlIIIlIlII = this.IlIlIIIlIIlIlIIlllIl;
        if (this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IlIllllIIlIllIlIlIll) {
            final float n = this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll * 0.6f + 0.2f;
            final float n2 = n * n * n * 8.0f;
            this.IlIlIllllllllIIIIlII = this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(this.IIlIIIIlllIlllllIlII, 0.05f * n2);
            this.IIlllIlIIllIlIlIlIIl = this.IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll(this.IIIlIIlIIIIlllIlllII, 0.05f * n2);
            this.llIIIlIlIllIIlIlIlII = 0.0f;
            this.IIlIIIIlllIlllllIlII = 0.0f;
            this.IIIlIIlIIIIlllIlllII = 0.0f;
        }
        else {
            this.IlIlIllllllllIIIIlII = 0.0f;
            this.IIlllIlIIllIlIlIlIIl = 0.0f;
            this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll();
            this.IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll();
        }
        if (this.IlIlIIIllIIllIlllllI.lIIIIlIlIllllIIlIllI() == null) {
            this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII);
        }
        final llIllIIIIIllIlIIIIlI liiiIlIlIllllIIlIllI = this.IlIlIIIllIIllIlllllI.lIIIIlIlIllllIIlIllI();
        final float ilIllIlIlIIIlIlIlIII = this.IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl.IlIllIlIlIIIlIlIlIII(new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(liiiIlIlIllllIIlIllI.IIlllIlIIllIlIlIlIIl, liiiIlIlIllllIIlIllI.llIIIlIlIllIIlIlIlII + liiiIlIlIllllIIlIllI.llllIlIllllIIlIIlIlI(), liiiIlIlIllllIIlIllI.lllllIlIIIlIlIIlllII));
        final float llllIIIIlIIIlIlllIll = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.llIllIIIIIllIlIIIIlI / 16.0f, 0.0f, 1.0f);
        this.IllIlIIllIllIIlIllII += (ilIllIlIlIIIlIlIlIII * (1.0f - llllIIIIlIIIlIlllIll) + llllIIIIlIIIlIlllIll - this.IllIlIIllIllIIlIllII) * 0.1f;
        ++this.lllIIIIlllllIlIIllIl;
        this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll();
        this.IIIIlllIIIIIIlIIIlll();
        this.IIlllIIIlIlllIIlllII = this.llIIlllIIlllIIllIllI;
        if (net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl) {
            this.llIIlllIIlllIIllIllI += 0.05f;
            if (this.llIIlllIIlllIIllIllI > 1.0f) {
                this.llIIlllIIlllIIllIllI = 1.0f;
            }
            net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl = false;
        }
        else if (this.llIIlllIIlllIIllIllI > 0.0f) {
            this.llIIlllIIlllIIllIllI -= 0.0125f;
        }
    }
    
    public IlIIIlIlIIIllIlIlIIl IllIIlllIIIIlllIIlIl() {
        return this.llIIIlIlllIllIIlIllI;
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final int n2) {
        if (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lllIllIIIllllllIllll) {
            if (this.llIIIlIlllIllIIlIllI != null) {
                this.llIIIlIlllIllIIlIllI.llllIIIIlIIIlIlllIll(n, n2);
            }
            this.IlIlIIIllIIllIlllllI.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(n, n2);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final float n) {
        final llIllIIIIIllIlIIIIlI liiiIlIlIllllIIlIllI = this.IlIlIIIllIIllIlllllI.lIIIIlIlIllllIIlIllI();
        if (liiiIlIlIllllIIlIllI != null && this.IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl != null) {
            this.IlIlIIIllIIllIlllllI.llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll("pick");
            this.IlIlIIIllIIllIlllllI.lIIIlllIIIllIIIllIII = null;
            double n2 = this.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl();
            this.IlIlIIIllIIllIlllllI.IIllIIllIIIlIlIIIIlI = liiiIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(n2, n);
            double illIIlllIIIIlllIIlIl = n2;
            final net.minecraft.IlllllllIIIlIIIlIlII.e llllIIIlIlllIlIIIIIl = liiiIlIlIllllIIlIllI.llllIIIlIlllIlIIIIIl(n);
            boolean b = false;
            if (this.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII()) {
                n2 = 6.0;
                illIIlllIIIIlllIIlIl = 6.0;
            }
            else if (n2 > 3.0) {
                b = true;
            }
            if (this.IlIlIIIllIIllIlllllI.IIllIIllIIIlIlIIIIlI != null) {
                illIIlllIIIIlllIIlIl = this.IlIlIIIllIIllIlllllI.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl(llllIIIlIlllIlIIIIIl);
            }
            final net.minecraft.IlllllllIIIlIIIlIlII.e llllIIIIlIIIlIlllIll = liiiIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(n);
            final net.minecraft.IlllllllIIIlIIIlIlII.e ilIlIlIlIlllllllllIl = llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll * n2, llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl * n2, llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI * n2);
            this.IlIlIIIIIIlllIlIllIl = null;
            net.minecraft.IlllllllIIIlIIIlIlII.e e = null;
            final float n3 = 1.0f;
            final List llllIIIIlIIIlIlllIll2 = this.IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(liiiIlIlIllllIIlIllI, liiiIlIlIllllIIlIllI.IlIIlllIIlIlllllIIlI().llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll * n2, llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl * n2, llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI * n2).IlIlIlIlIlllllllllIl(n3, n3, n3), Predicates.and(net.minecraft.IlllllllIIIlIIIlIlII.llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl, (Predicate)new IIIlIIIlIlIIlllIIlll(this)));
            double n4 = illIIlllIIIIlllIIlIl;
            for (int i = 0; i < llllIIIIlIIIlIlllIll2.size(); ++i) {
                final llIllIIIIIllIlIIIIlI ilIlIIIIIIlllIlIllIl = llllIIIIlIIIlIlllIll2.get(i);
                final float lllllIIllIlIllIllllI = ilIlIIIIIIlllIlIllIl.lllllIIllIlIllIllllI();
                final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll ilIlIlIlIlllllllllIl2 = ilIlIIIIIIlllIlIllIl.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl(lllllIIllIlIllIllllI, lllllIIllIlIllIllllI, lllllIIllIlIllIllllI);
                final llIlllIlllllIIllIIII llllIIIIlIIIlIlllIll3 = ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl, ilIlIlIlIlllllllllIl);
                if (ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl)) {
                    if (n4 >= 0.0) {
                        this.IlIlIIIIIIlllIlIllIl = ilIlIIIIIIlllIlIllIl;
                        e = ((llllIIIIlIIIlIlllIll3 == null) ? llllIIIlIlllIlIIIIIl : llllIIIIlIIIlIlllIll3.llIllIIIIIllIlIIIIlI);
                        n4 = 0.0;
                    }
                }
                else if (llllIIIIlIIIlIlllIll3 != null) {
                    final double illIIlllIIIIlllIIlIl2 = llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl(llllIIIIlIIIlIlllIll3.llIllIIIIIllIlIIIIlI);
                    if (illIIlllIIIIlllIIlIl2 < n4 || n4 == 0.0) {
                        boolean ilIlIlIlIlllllllllIl3 = false;
                        if (net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IIlIlIllllIlllIIIIll.llIllIIIIIllIlIIIIlI()) {
                            ilIlIlIlIlllllllllIl3 = net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(ilIlIIIIIIlllIlIllIl, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IIlIlIllllIlllIIIIll, new Object[0]);
                        }
                        if (!ilIlIlIlIlllllllllIl3 && ilIlIIIIIIlllIlIllIl == liiiIlIlIllllIIlIllI.IIIlIIIlIlIIlllIIlll) {
                            if (n4 == 0.0) {
                                this.IlIlIIIIIIlllIlIllIl = ilIlIIIIIIlllIlIllIl;
                                e = llllIIIIlIIIlIlllIll3.llIllIIIIIllIlIIIIlI;
                            }
                        }
                        else {
                            this.IlIlIIIIIIlllIlIllIl = ilIlIIIIIIlllIlIllIl;
                            e = llllIIIIlIIIlIlllIll3.llIllIIIIIllIlIIIIlI;
                            n4 = illIIlllIIIIlllIIlIl2;
                        }
                    }
                }
            }
            if (this.IlIlIIIIIIlllIlIllIl != null && b && llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl(e) > 3.0) {
                this.IlIlIIIIIIlllIlIllIl = null;
                this.IlIlIIIllIIllIlllllI.IIllIIllIIIlIlIIIIlI = new llIlllIlllllIIllIIII(lllllIlIlIlllIlllIlI.llllIIIIlIIIlIlllIll, e, null, new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(e));
            }
            if (this.IlIlIIIIIIlllIlIllIl != null && (n4 < illIIlllIIIIlllIIlIl || this.IlIlIIIllIIllIlllllI.IIllIIllIIIlIlIIIIlI == null)) {
                this.IlIlIIIllIIllIlllllI.IIllIIllIIIlIlIIIIlI = new llIlllIlllllIIllIIII(this.IlIlIIIIIIlllIlIllIl, e);
                if (this.IlIlIIIIIIlllIlIllIl instanceof lllIIIIlllllIlIIllIl || this.IlIlIIIIIIlllIlIllIl instanceof llIIlIIIlIIIllIlIIIl) {
                    this.IlIlIIIllIIllIlllllI.lIIIlllIIIllIIIllIII = this.IlIlIIIIIIlllIlIllIl;
                }
            }
            this.IlIlIIIllIIllIlllllI.llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl();
        }
    }
    
    private void llIllIlIIIIllIlIIllI() {
        float ilIlIIIllIIllIlllllI = 1.0f;
        if (this.IlIlIIIllIIllIlllllI.lIIIIlIlIllllIIlIllI() instanceof net.minecraft.client.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
            ilIlIIIllIIllIlllllI = ((net.minecraft.client.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll)this.IlIlIIIllIIllIlllllI.lIIIIlIlIllllIIlIllI()).IlIlIIIllIIllIlllllI();
        }
        this.lIllllllIIllIlIlIlII = this.lllllIlIIIlIlIIlllII;
        this.lllllIlIIIlIlIIlllII += (ilIlIIIllIIllIlllllI - this.lllllIlIIIlIlIIlllII) * 0.5f;
        if (this.lllllIlIIIlIlIIlllII > 1.5f) {
            this.lllllIlIIIlIlIIlllII = 1.5f;
        }
        if (this.lllllIlIIIlIlIIlllII < 0.1f) {
            this.lllllIlIIIlIlIIlllII = 0.1f;
        }
    }
    
    private float llllIIIIlIIIlIlllIll(final float n, final boolean b) {
        if (this.IIlIIIlllIllIllIlIII) {
            return 90.0f;
        }
        final llIllIIIIIllIlIIIIlI liiiIlIlIllllIIlIllI = this.IlIlIIIllIIllIlllllI.lIIIIlIlIllllIIlIllI();
        float llIlIIIIllIlIIlIlIII = 70.0f;
        if (b) {
            llIlIIIIllIlIIlIlIII = this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.llIlIIIIllIlIIlIlIII;
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.j()) {
                llIlIIIIllIlIIlIlIII *= this.lIllllllIIllIlIlIlII + (this.lllllIlIIIlIlIIlllII - this.lIllllllIIllIlIlIlII) * n;
            }
        }
        boolean llllIIIIlIIIlIlllIll = false;
        if (this.IlIlIIIllIIllIlllllI.IIIIlllIIIIIIlIIIlll == null) {
            final net.minecraft.client.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll iiIlIIIlIlIIlllIIlll = this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll;
            llllIIIIlIIIlIlllIll = net.minecraft.client.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.av);
        }
        if (llllIIIIlIIIlIlllIll) {
            if (!net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll) {
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll = true;
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIllIlIlIIIlIlIlIII = this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IlIllllIIlIllIlIlIll;
                this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IlIllllIIlIllIlIlIll = true;
                this.IlIlIIIllIIllIlllllI.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl = true;
            }
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll) {
                llIlIIIIllIlIIlIlIII /= 4.0f;
            }
        }
        else if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll = false;
            this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IlIllllIIlIllIlIlIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIllIlIlIIIlIlIlIII;
            this.IIllIIllIIIlIlIIIIlI = new IIllIIIlIIIIlIIlIIII();
            this.IIIlIIIlIlIIlllIIlll = new IIllIIIlIIIIlIIlIIII();
            this.IlIlIIIllIIllIlllllI.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl = true;
        }
        if (liiiIlIlIllllIIlIllI instanceof lllIIIIlllllIlIIllIl && ((lllIIIIlllllIlIIllIl)liiiIlIlIllllIIlIllI).N() <= 0.0f) {
            llIlIIIIllIlIIlIlIII /= (1.0f - 500.0f / (((lllIIIIlllllIlIIllIl)liiiIlIlIllllIIlIllI).llIlllIlllllIIllIIII + n + 500.0f)) * 2.0f + 1.0f;
        }
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl, liiiIlIlIllllIIlIllI, n);
        if (llllIIIIlIIIlIlllIll2.IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII) {
            llIlIIIIllIlIIlIlIII = llIlIIIIllIlIIlIlIII * 60.0f / 70.0f;
        }
        return net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IlIIlllIIlIlllllIIlI.llIllIIIIIllIlIIIIlI() ? net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl(net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IlIIlllIIlIlllllIIlI, this, liiiIlIlIllllIIlIllI, llllIIIIlIIIlIlllIll2, n, llIlIIIIllIlIIlIlIII) : llIlIIIIllIlIIlIlIII;
    }
    
    private void IlIIIlIlIIIllIlIlIIl(final float n) {
        if (this.IlIlIIIllIIllIlllllI.lIIIIlIlIllllIIlIllI() instanceof lllIIIIlllllIlIIllIl) {
            final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl = (lllIIIIlllllIlIIllIl)this.IlIlIIIllIIllIlllllI.lIIIIlIlIllllIIlIllI();
            final float n2 = lllIIIIlllllIlIIllIl.IIlllIIlIllIllIlIIll - n;
            if (lllIIIIlllllIlIIllIl.N() <= 0.0f) {
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(40.0f - 8000.0f / (lllIIIIlllllIlIIllIl.llIlllIlllllIIllIIII + n + 200.0f), 0.0f, 0.0f, 1.0f);
            }
            if (n2 < 0.0f) {
                return;
            }
            final float n3 = n2 / lllIIIIlllllIlIIllIl.IIIIIIIllllIlIIIIIII;
            final float llllIIIIlIIIlIlllIll = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n3 * n3 * n3 * n3 * 3.1415927f);
            final float iIlllIIIllIllIIlIlIl = lllIIIIlllllIlIIllIl.IIlllIIIllIllIIlIlIl;
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-iIlllIIIllIllIIlIlIl, 0.0f, 1.0f, 0.0f);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-llllIIIIlIIIlIlllIll * 14.0f, 0.0f, 0.0f, 1.0f);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(iIlllIIIllIllIIlIlIl, 0.0f, 1.0f, 0.0f);
        }
    }
    
    private void IlIlIIIllIllIIIIIllI(final float n) {
        if (this.IlIlIIIllIIllIlllllI.lIIIIlIlIllllIIlIllI() instanceof llllIIIIlIIIlIlllIll) {
            final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = (llllIIIIlIIIlIlllIll)this.IlIlIIIllIIllIlllllI.lIIIIlIlIllllIIlIllI();
            final float n2 = -(llllIIIIlIIIlIlllIll.llIlIIIIIlIIlIlIIlll + (llllIIIIlIIIlIlllIll.llIlIIIIIlIIlIlIIlll - llllIIIIlIIIlIlllIll.IllIllIlllIllllIIllI) * n);
            final float n3 = llllIIIIlIIIlIlllIll.w + (llllIIIIlIIIlIlllIll.x - llllIIIIlIIIlIlllIll.w) * n;
            final float n4 = llllIIIIlIIIlIlllIll.IIlIlllIlIlllIlIllll + (llllIIIIlIIIlIlllIll.lIllllIllIllIIllllll - llllIIIIlIIIlIlllIll.IIlIlllIlIlllIlIllll) * n;
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n2 * 3.1415927f) * n3 * 0.5f, -Math.abs(llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n2 * 3.1415927f) * n3), 0.0f);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n2 * 3.1415927f) * n3 * 3.0f, 0.0f, 0.0f, 1.0f);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(Math.abs(llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n2 * 3.1415927f - 0.2f) * n3) * 5.0f, 1.0f, 0.0f, 0.0f);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(n4, 1.0f, 0.0f, 0.0f);
        }
    }
    
    private void IllIIlllIIIIlllIIlIl(final float n) {
        final llIllIIIIIllIlIIIIlI liiiIlIlIllllIIlIllI = this.IlIlIIIllIIllIlllllI.lIIIIlIlIllllIIlIllI();
        float llllIlIllllIIlIIlIlI = liiiIlIlIllllIIlIllI.llllIlIllllIIlIIlIlI();
        final double n2 = liiiIlIlIllllIIlIllI.IIlIIIIlllIlllllIlII + (liiiIlIlIllllIIlIllI.IIlllIlIIllIlIlIlIIl - liiiIlIlIllllIIlIllI.IIlIIIIlllIlllllIlII) * n;
        final double n3 = liiiIlIlIllllIIlIllI.IIIlIIlIIIIlllIlllII + (liiiIlIlIllllIIlIllI.llIIIlIlIllIIlIlIlII - liiiIlIlIllllIIlIllI.IIIlIIlIIIIlllIlllII) * n + llllIlIllllIIlIIlIlI;
        final double n4 = liiiIlIlIllllIIlIllI.IlIlIllllllllIIIIlII + (liiiIlIlIllllIIlIllI.lllllIlIIIlIlIIlllII - liiiIlIlIllllIIlIllI.IlIlIllllllllIIIIlII) * n;
        if (liiiIlIlIllllIIlIllI instanceof lllIIIIlllllIlIIllIl && ((lllIIIIlllllIlIIllIl)liiiIlIlIllllIIlIllI).ah()) {
            ++llllIlIllllIIlIIlIlI;
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, 0.3f, 0.0f);
            if (!this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.lllIlIIIIIlIlllllIlI) {
                final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(liiiIlIlIllllIIlIllI);
                final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = this.IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
                final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI();
                if (net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.g.llIllIIIIIllIlIIIIlI()) {
                    net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.g, this.IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl, ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl2, liiiIlIlIllllIIlIllI);
                }
                else if (llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII) {
                    net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl((float)(((lllIllIIIllllllIllll)ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl.IlllIIIIlIIIlIlIlIIl)).llIllIIIIIllIlIIIIlI() * 90), 0.0f, 1.0f, 0.0f);
                }
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(liiiIlIlIllllIIlIllI.IIIllllllIllIIIlllIl + (liiiIlIlIllllIIlIllI.IIlIIIIIllIlIIIlIIll - liiiIlIlIllllIIlIllI.IIIllllllIllIIIlllIl) * n + 180.0f, 0.0f, -1.0f, 0.0f);
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(liiiIlIlIllllIIlIllI.IlIIIlIIIllllIlIlIlI + (liiiIlIlIllllIIlIllI.llllllIllIllIlIllllI - liiiIlIlIllllIIlIllI.IlIIIlIIIllllIlIlIlI) * n, -1.0f, 0.0f, 0.0f);
            }
        }
        else if (this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IIIllIIllIIIIIIlIIlI > 0) {
            double n5 = this.IlllllllIIIlIIIlIlII + (this.IlIlIIIlIIlIlIIlllIl - this.IlllllllIIIlIIIlIlII) * n;
            if (this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.lllIlIIIIIlIlllllIlI) {
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, 0.0f, (float)(-n5));
            }
            else {
                final float yaw = Leaf.instance.modManager.freeLookMod.getYaw();
                float pitch = Leaf.instance.modManager.freeLookMod.getPitch();
                if (this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IIIllIIllIIIIIIlIIlI == 2) {
                    pitch += 180.0f;
                }
                final double n6 = -llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(yaw / 180.0f * 3.1415927f) * llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(pitch / 180.0f * 3.1415927f) * n5;
                final double n7 = llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(yaw / 180.0f * 3.1415927f) * llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(pitch / 180.0f * 3.1415927f) * n5;
                final double n8 = -llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(pitch / 180.0f * 3.1415927f) * n5;
                for (int i = 0; i < 8; ++i) {
                    final float n9 = (float)((i & 0x1) * 2 - 1);
                    final float n10 = (float)((i >> 1 & 0x1) * 2 - 1);
                    final float n11 = (float)((i >> 2 & 0x1) * 2 - 1);
                    final float n12 = n9 * 0.1f;
                    final float n13 = n10 * 0.1f;
                    final float n14 = n11 * 0.1f;
                    final llIlllIlllllIIllIIII llllIIIIlIIIlIlllIll = this.IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(new net.minecraft.IlllllllIIIlIIIlIlII.e(n2 + n12, n3 + n13, n4 + n14), new net.minecraft.IlllllllIIIlIIIlIlII.e(n2 - n6 + n12 + n14, n3 - n8 + n13, n4 - n7 + n14));
                    if (llllIIIIlIIIlIlllIll != null) {
                        final double illIIlllIIIIlllIIlIl = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl(new net.minecraft.IlllllllIIIlIIIlIlII.e(n2, n3, n4));
                        if (illIIlllIIIIlllIIlIl < n5) {
                            n5 = illIIlllIIIIlllIIlIl;
                        }
                    }
                }
                if (this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IIIllIIllIIIIIIlIIlI == 2) {
                    net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(180.0f, 0.0f, 1.0f, 0.0f);
                }
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(Leaf.instance.modManager.freeLookMod.getPitch() - pitch, 1.0f, 0.0f, 0.0f);
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(Leaf.instance.modManager.freeLookMod.getYaw() - yaw, 0.0f, 1.0f, 0.0f);
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, 0.0f, (float)(-n5));
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(yaw - Leaf.instance.modManager.freeLookMod.getYaw(), 0.0f, 1.0f, 0.0f);
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(pitch - Leaf.instance.modManager.freeLookMod.getPitch(), 1.0f, 0.0f, 0.0f);
            }
        }
        else {
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, 0.0f, -0.1f);
        }
        if (net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IlIllIlIlIIIlIlIlIII.llIllIIIIIllIlIIIIlI()) {
            if (!this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.lllIlIIIIIlIlllllIlI) {
                float n15 = Leaf.instance.modManager.freeLookMod.getYaw() + (Leaf.instance.modManager.freeLookMod.getYaw() - Leaf.instance.modManager.freeLookMod.getYaw()) * n + 180.0f;
                final float n16 = Leaf.instance.modManager.freeLookMod.getPitch() + (Leaf.instance.modManager.freeLookMod.getPitch() - Leaf.instance.modManager.freeLookMod.getPitch()) * n;
                final float n17 = 0.0f;
                if (liiiIlIlIllllIIlIllI instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl) {
                    final net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl3 = (net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl)liiiIlIlIllllIIlIllI;
                    n15 = ilIlIlIlIlllllllllIl3.lIllIIlIlIlllllIIIII + (ilIlIlIlIlllllllllIl3.lIIlllIlllllIIlllIll - ilIlIlIlIlllllllllIl3.lIllIIlIlIlllllIIIII) * n + 180.0f;
                }
                final Object ilIlIlIlIlllllllllIl4 = net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IlIllIlIlIIIlIlIlIII, this, liiiIlIlIllllIIlIllI, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl, liiiIlIlIllllIIlIllI, n), n, n15, n16, n17);
                net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl4);
                final float llllIIIIlIIIlIlllIll2 = net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl4, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IlIlIIIIIIlllIlIllIl, n17);
                final float llllIIIIlIIIlIlllIll3 = net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl4, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.lllIIIIlllllIlIIllIl, n16);
                final float llllIIIIlIIIlIlllIll4 = net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl4, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IIlllIIlIllIllIlIIll, n15);
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2, 0.0f, 0.0f, 1.0f);
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll3, 1.0f, 0.0f, 0.0f);
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll4, 0.0f, 1.0f, 0.0f);
            }
        }
        else if (!this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.lllIlIIIIIlIlllllIlI) {
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(Leaf.instance.modManager.freeLookMod.getPitch() + (Leaf.instance.modManager.freeLookMod.getPitch() - Leaf.instance.modManager.freeLookMod.getPitch()) * n, 1.0f, 0.0f, 0.0f);
            if (liiiIlIlIllllIIlIllI instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl) {
                final net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl5 = (net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl)liiiIlIlIllllIIlIllI;
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl5.lIllIIlIlIlllllIIIII + (ilIlIlIlIlllllllllIl5.lIIlllIlllllIIlllIll - ilIlIlIlIlllllllllIl5.lIllIIlIlIlllllIIIII) * n + 180.0f, 0.0f, 1.0f, 0.0f);
            }
            else {
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(Leaf.instance.modManager.freeLookMod.getYaw() + (Leaf.instance.modManager.freeLookMod.getYaw() - Leaf.instance.modManager.freeLookMod.getYaw()) * n + 180.0f, 0.0f, 1.0f, 0.0f);
            }
        }
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, -llllIlIllllIIlIIlIlI, 0.0f);
        this.IIlIIIIIllIlIIIlIIll = this.IlIlIIIllIIllIlllllI.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(liiiIlIlIllllIIlIllI.IIlIIIIlllIlllllIlII + (liiiIlIlIllllIIlIllI.IIlllIlIIllIlIlIlIIl - liiiIlIlIllllIIlIllI.IIlIIIIlllIlllllIlII) * n, liiiIlIlIllllIIlIllI.IIIlIIlIIIIlllIlllII + (liiiIlIlIllllIIlIllI.llIIIlIlIllIIlIlIlII - liiiIlIlIllllIIlIllI.IIIlIIlIIIIlllIlllII) * n + llllIlIllllIIlIIlIlI, liiiIlIlIllllIIlIllI.IlIlIllllllllIIIIlII + (liiiIlIlIllllIIlIllI.lllllIlIIIlIlIIlllII - liiiIlIlIllllIIlIllI.IlIlIllllllllIIIIlII) * n, n);
    }
    
    public void llllIIIIlIIIlIlllIll(final float n, final int n2) {
        this.IlIllIlIlIIIlIlIlIII = (float)(this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.llIllIIIIIllIlIIIIlI * 16);
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI()) {
            this.IlIllIlIlIIIlIlIlIII *= 0.95f;
        }
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll()) {
            this.IlIllIlIlIIIlIlIlIII *= 0.83f;
        }
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5889);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIIIlIlIllIIlIlIlII();
        final float n3 = 0.07f;
        if (this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IlIlIIIllIllIIIIIllI) {
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-(n2 * 2 - 1) * n3, 0.0f, 0.0f);
        }
        this.IIIllIIIlIlIIllIIIlI = this.IlIllIlIlIIIlIlIlIII * 2.0f;
        if (this.IIIllIIIlIlIIllIIIlI < 173.0f) {
            this.IIIllIIIlIlIIllIIIlI = 173.0f;
        }
        if (this.lIlIlIlllIIlIlIlllIl != 1.0) {
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl((float)this.llIIIIIIlIllIIlIIIll, (float)(-this.lIIIIlIlIllllIIlIllI), 0.0f);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(this.lIlIlIlllIIlIlIlllIl, this.lIlIlIlllIIlIlIlllIl, 1.0);
        }
        Project.gluPerspective(this.llllIIIIlIIIlIlllIll(n, true), this.IlIlIIIllIIllIlllllI.IlIIIlIlIIIllIlIlIIl / (float)this.IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI, 0.05f, this.IIIllIIIlIlIIllIIIlI);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5888);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIIIlIlIllIIlIlIlII();
        if (this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IlIlIIIllIllIIIIIllI) {
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl((n2 * 2 - 1) * 0.1f, 0.0f, 0.0f);
        }
        this.IlIIIlIlIIIllIlIlIIl(n);
        if (this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IlIIIlIlIIIllIlIlIIl) {
            this.IlIlIIIllIllIIIIIllI(n);
        }
        final float n4 = this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.llIllIlIIIIllIlIIllI + (this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.llIIlIIIlIIIllIlIIIl - this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.llIllIlIIIIllIlIIllI) * n;
        if (n4 > 0.0f) {
            int n5 = 20;
            if (this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI)) {
                n5 = 7;
            }
            final float n6 = 5.0f / (n4 * n4 + 5.0f) - n4 * 0.04f;
            final float n7 = n6 * n6;
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl((this.lllIIIIlllllIlIIllIl + n) * n5, 0.0f, 1.0f, 1.0f);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(1.0f / n7, 1.0f, 1.0f);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-(this.lllIIIIlllllIlIIllIl + n) * n5, 0.0f, 1.0f, 1.0f);
        }
        this.IllIIlllIIIIlllIIlIl(n);
        if (this.IIlIIIlllIllIllIlIII) {
            switch (this.lIIlIIIlIllIlIllIIIl) {
                case 0: {
                    net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(90.0f, 0.0f, 1.0f, 0.0f);
                    break;
                }
                case 1: {
                    net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(180.0f, 0.0f, 1.0f, 0.0f);
                    break;
                }
                case 2: {
                    net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-90.0f, 0.0f, 1.0f, 0.0f);
                    break;
                }
                case 3: {
                    net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(90.0f, 1.0f, 0.0f, 0.0f);
                    break;
                }
                case 4: {
                    net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-90.0f, 1.0f, 0.0f, 0.0f);
                    break;
                }
            }
        }
    }
    
    private void IlIlIlIlIlllllllllIl(final float n, final int n2) {
        this.llllIIIIlIIIlIlllIll(n, n2, true, true, false);
    }
    
    public void llllIIIIlIIIlIlllIll(final float n, final int n2, final boolean b, final boolean b2, final boolean b3) {
        if (!this.IIlIIIlllIllIllIlIII) {
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5889);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIIIlIlIllIIlIlIlII();
            final float n3 = 0.07f;
            if (this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IlIlIIIllIllIIIIIllI) {
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-(n2 * 2 - 1) * n3, 0.0f, 0.0f);
            }
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
                net.optifine.shaders.llIIlllIIlllIIllIllI.IIIllIIIlIlIIllIIIlI();
            }
            Project.gluPerspective(this.llllIIIIlIIIlIlllIll(n, false), this.IlIlIIIllIIllIlllllI.IlIIIlIlIIIllIlIlIIl / (float)this.IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI, 0.05f, this.IlIllIlIlIIIlIlIlIII * 2.0f);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5888);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIIIlIlIllIIlIlIlII();
            if (this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IlIlIIIllIllIIIIIllI) {
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl((n2 * 2 - 1) * 0.1f, 0.0f, 0.0f);
            }
            boolean b4 = false;
            if (b) {
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
                this.IlIIIlIlIIIllIlIlIIl(n);
                if (this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IlIIIlIlIIIllIlIlIIl) {
                    this.IlIlIIIllIllIIIIIllI(n);
                }
                b4 = (this.IlIlIIIllIIllIlllllI.lIIIIlIlIllllIIlIllI() instanceof lllIIIIlllllIlIIllIl && ((lllIIIIlllllIlIIllIl)this.IlIlIIIllIIllIlllllI.lIIIIlIlIllllIIlIllI()).ah());
                if (!net.optifine.lIIIIlIIIIIlllIllIII.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(this.IlIlIIIllIIllIlllllI.llllIIIlIlllIlIIIIIl, n, n2) && this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IIIllIIllIIIIIIlIIlI == 0 && !b4 && !this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IIllIIIlIIIIlIIlIIII && !this.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll()) {
                    this.lIIIIlIIIIIlllIllIII();
                    if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
                        net.optifine.shaders.IIlllIIIlIlllIIlllII.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI, n, b3);
                    }
                    else {
                        this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(n);
                    }
                    this.llllIIIlIlllIlIIIIIl();
                }
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
            }
            if (!b2) {
                return;
            }
            this.llllIIIlIlllIlIIIIIl();
            if (this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IIIllIIllIIIIIIlIIlI == 0 && !b4) {
                this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n);
                this.IlIIIlIlIIIllIlIlIIl(n);
            }
            if (this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IlIIIlIlIIIllIlIlIIl) {
                this.IlIlIIIllIllIIIIIllI(n);
            }
        }
    }
    
    public void llllIIIlIlllIlIIIIIl() {
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lllIIIIlllllIlIIllIl);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIIIlIIlIlIIlllIl();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IIlllIIlIllIllIlIIll);
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
            net.optifine.shaders.llIIlllIIlllIIllIllI.IllllIIlIlIllIIIllII();
        }
    }
    
    public void lIIIIlIIIIIlllIllIII() {
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lllIIIIlllllIlIIllIl);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5890);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIIIlIlIllIIlIlIlII();
        final float n = 0.00390625f;
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(n, n, n);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(8.0f, 8.0f, 8.0f);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5888);
        this.IlIlIIIllIIllIlllllI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(this.IlllIIIIlIIIlIlIlIIl);
        GL11.glTexParameteri(3553, 10241, 9729);
        GL11.glTexParameteri(3553, 10240, 9729);
        GL11.glTexParameteri(3553, 10242, 33071);
        GL11.glTexParameteri(3553, 10243, 33071);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IIlllIIlIllIllIlIIll);
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
            net.optifine.shaders.llIIlllIIlllIIllIllI.IlIIIIIlIIllIIlIlIll();
        }
    }
    
    private void lIlIlIIIllIIllIIIllI() {
        this.IIlIlIlIIlIllIIIIIIl += (float)((Math.random() - Math.random()) * Math.random() * Math.random());
        this.IIlIlIlIIlIllIIIIIIl *= (float)0.9;
        this.llIllIlIlIIIIIIIllII += (this.IIlIlIlIIlIllIIIIIIl - this.llIllIlIlIIIIIIIllII) * 1.0f;
        this.lllIllIIIllllllIllll = true;
    }
    
    private void llllIIIlIlllIlIIIIIl(final float n) {
        if (this.lllIllIIIllllllIllll) {
            this.IlIlIIIllIIllIlllllI.llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll("lightTex");
            final net.minecraft.client.IlIlIIIllIllIIIIIllI.llIIlIIIlIIIllIlIIIl illIIlllIIIIlllIIlIl = this.IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl;
            if (illIIlllIIIIlllIIlIl != null) {
                if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lllIIIIlIlIllIIlIIIl() && net.optifine.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl, this.llIllIlIlIIIIIIIllII, this.IIllllIIIlIIIIIIllIl, this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl), n)) {
                    this.IIIIIIIIIlllIllIlIlI.IlIlIlIlIlllllllllIl();
                    this.lllIllIIIllllllIllll = false;
                    this.IlIlIIIllIIllIlllllI.llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl();
                    return;
                }
                final float ilIlIlIlIlllllllllIl = illIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl(1.0f);
                final float n2 = ilIlIlIlIlllllllllIl * 0.95f + 0.05f;
                for (int i = 0; i < 256; ++i) {
                    float n3 = illIIlllIIIIlllIIlIl.IlIllIlIlIIIlIlIlIII.IlIllIlIlIIIlIlIlIII()[i / 16] * n2;
                    final float n4 = illIIlllIIIIlllIIlIl.IlIllIlIlIIIlIlIlIII.IlIllIlIlIIIlIlIlIII()[i % 16] * (this.llIllIlIlIIIIIIIllII * 0.1f + 1.5f);
                    if (illIIlllIIIIlllIIlIl.IIlIlIlIIlIllIIIIIIl() > 0) {
                        n3 = illIIlllIIIIlllIIlIl.IlIllIlIlIIIlIlIlIII.IlIllIlIlIIIlIlIlIII()[i / 16];
                    }
                    final float n5 = n3 * (ilIlIlIlIlllllllllIl * 0.65f + 0.35f);
                    final float n6 = n3 * (ilIlIlIlIlllllllllIl * 0.65f + 0.35f);
                    final float n7 = n4 * ((n4 * 0.6f + 0.4f) * 0.6f + 0.4f);
                    final float n8 = n4 * (n4 * n4 * 0.6f + 0.4f);
                    final float n9 = n5 + n4;
                    final float n10 = n6 + n7;
                    final float n11 = n3 + n8;
                    float n12 = n9 * 0.96f + 0.03f;
                    float n13 = n10 * 0.96f + 0.03f;
                    float n14 = n11 * 0.96f + 0.03f;
                    if (this.llIIlllIIlllIIllIllI > 0.0f) {
                        final float n15 = this.IIlllIIIlIlllIIlllII + (this.llIIlllIIlllIIllIllI - this.IIlllIIIlIlllIIlllII) * n;
                        n12 = n12 * (1.0f - n15) + n12 * 0.7f * n15;
                        n13 = n13 * (1.0f - n15) + n13 * 0.6f * n15;
                        n14 = n14 * (1.0f - n15) + n14 * 0.6f * n15;
                    }
                    if (illIIlllIIIIlllIIlIl.IlIllIlIlIIIlIlIlIII.IIlllIIlIllIllIlIIll() == 1) {
                        n12 = 0.22f + n4 * 0.75f;
                        n13 = 0.28f + n7 * 0.75f;
                        n14 = 0.25f + n8 * 0.75f;
                    }
                    if (this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl)) {
                        final float llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII, n);
                        float n16 = 1.0f / n12;
                        if (n16 > 1.0f / n13) {
                            n16 = 1.0f / n13;
                        }
                        if (n16 > 1.0f / n14) {
                            n16 = 1.0f / n14;
                        }
                        n12 = n12 * (1.0f - llllIIIIlIIIlIlllIll) + n12 * n16 * llllIIIIlIIIlIlllIll;
                        n13 = n13 * (1.0f - llllIIIIlIIIlIlllIll) + n13 * n16 * llllIIIIlIIIlIlllIll;
                        n14 = n14 * (1.0f - llllIIIIlIIIlIlllIll) + n14 * n16 * llllIIIIlIIIlIlllIll;
                    }
                    if (n12 > 1.0f) {
                        n12 = 1.0f;
                    }
                    if (n13 > 1.0f) {
                        n13 = 1.0f;
                    }
                    if (n14 > 1.0f) {
                        n14 = 1.0f;
                    }
                    final float iiiiIlllIlIIIIIIIllI = this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IIIIIlllIlIIIIIIIllI;
                    final float n17 = 1.0f - n12;
                    final float n18 = 1.0f - n13;
                    final float n19 = 1.0f - n14;
                    final float n20 = 1.0f - n17 * n17 * n17 * n17;
                    final float n21 = 1.0f - n18 * n18 * n18 * n18;
                    final float n22 = 1.0f - n19 * n19 * n19 * n19;
                    final float n23 = n12 * (1.0f - iiiiIlllIlIIIIIIIllI) + n20 * iiiiIlllIlIIIIIIIllI;
                    final float n24 = n13 * (1.0f - iiiiIlllIlIIIIIIIllI) + n21 * iiiiIlllIlIIIIIIIllI;
                    final float n25 = n14 * (1.0f - iiiiIlllIlIIIIIIIllI) + n22 * iiiiIlllIlIIIIIIIllI;
                    float n26 = n23 * 0.96f + 0.03f;
                    float n27 = n24 * 0.96f + 0.03f;
                    float n28 = n25 * 0.96f + 0.03f;
                    if (n26 > 1.0f) {
                        n26 = 1.0f;
                    }
                    if (n27 > 1.0f) {
                        n27 = 1.0f;
                    }
                    if (n28 > 1.0f) {
                        n28 = 1.0f;
                    }
                    if (n26 < 0.0f) {
                        n26 = 0.0f;
                    }
                    if (n27 < 0.0f) {
                        n27 = 0.0f;
                    }
                    if (n28 < 0.0f) {
                        n28 = 0.0f;
                    }
                    this.IIllllIIIlIIIIIIllIl[i] = (255 << 24 | (int)(n26 * 255.0f) << 16 | (int)(n27 * 255.0f) << 8 | (int)(n28 * 255.0f));
                }
                this.IIIIIIIIIlllIllIlIlI.IlIlIlIlIlllllllllIl();
                this.lllIllIIIllllllIllll = false;
                this.IlIlIIIllIIllIlllllI.llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl();
            }
        }
    }
    
    public float llllIIIIlIIIlIlllIll(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final float n) {
        final int ilIlIlIlIlllllllllIl = lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl).IlIlIlIlIlllllllllIl();
        return (ilIlIlIlIlllllllllIl > 200) ? 1.0f : (0.7f + llIllIIlllllllllllll.llllIIIIlIIIlIlllIll((ilIlIlIlIlllllllllIl - n) * 3.1415927f * 0.2f) * 0.3f);
    }
    
    public void llllIIIIlIIIlIlllIll(final float n, final long n2) {
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI = n;
        this.IlIllIlIlIIIlIlIlIII();
        final boolean active = Display.isActive();
        if (!active && this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IlIlIllllllllIIIIlII && (!this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IIlllIlIIllIlIlIlIIl || !Mouse.isButtonDown(1))) {
            if (Minecraft.IIIllllllIllIIIlllIl() - this.IlIIIlIIIllllIlIlIlI > 500L) {
                this.IlIlIIIllIIllIlllllI.IlIllIlIlIIIlIlIlIII();
            }
        }
        else {
            this.IlIIIlIIIllllIlIlIlI = Minecraft.IIIllllllIllIIIlllIl();
        }
        this.IlIlIIIllIIllIlllllI.llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll("mouse");
        if (active && Minecraft.llllIIIIlIIIlIlllIll && this.IlIlIIIllIIllIlllllI.IIlIIIIlllIlllllIlII && !Mouse.isInsideWindow()) {
            Mouse.setGrabbed(false);
            Mouse.setCursorPosition(Display.getWidth() / 2, Display.getHeight() / 2);
            Mouse.setGrabbed(true);
        }
        if (this.IlIlIIIllIIllIlllllI.IIlIIIIlllIlllllIlII && active && Leaf.instance.modManager.freeLookMod.getMouseOver()) {
            this.IlIlIIIllIIllIlllllI.IlIlIIIlIIlIlIIlllIl.llIllIIIIIllIlIIIIlI();
            final float n3 = this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll * 0.6f + 0.2f;
            final float n4 = n3 * n3 * n3 * 8.0f;
            final float n5 = this.IlIlIIIllIIllIlllllI.IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll * n4;
            final float n6 = this.IlIlIIIllIIllIlllllI.IlIlIIIlIIlIlIIlllIl.IlIlIlIlIlllllllllIl * n4;
            int n7 = 1;
            if (this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl) {
                n7 = -1;
            }
            if (this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IlIllllIIlIllIlIlIll) {
                this.IIlIIIIlllIlllllIlII += n5;
                this.IIIlIIlIIIIlllIlllII += n6;
                final float n8 = n - this.llIIIlIlIllIIlIlIlII;
                this.llIIIlIlIllIIlIlIlII = n;
                this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI(this.IlIlIllllllllIIIIlII * n8, this.IIlllIlIIllIlIlIlIIl * n8 * n7);
            }
            else {
                this.IIlIIIIlllIlllllIlII = 0.0f;
                this.IIIlIIlIIIIlllIlllII = 0.0f;
                this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI(n5, n6 * n7);
            }
        }
        this.IlIlIIIllIIllIlllllI.llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl();
        if (!this.IlIlIIIllIIllIlllllI.IlIlIIIIIIlllIlIllIl) {
            net.minecraft.client.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll = this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IlIlIIIllIllIIIIIllI;
            final g g = new g(this.IlIlIIIllIIllIlllllI);
            final int llllIIIIlIIIlIlllIll = g.llllIIIIlIIIlIlllIll();
            final int ilIlIlIlIlllllllllIl = g.IlIlIlIlIlllllllllIl();
            final int n9 = Mouse.getX() * llllIIIIlIIIlIlllIll / this.IlIlIIIllIIllIlllllI.IlIIIlIlIIIllIlIlIIl;
            final int n10 = ilIlIlIlIlllllllllIl - Mouse.getY() * ilIlIlIlIlllllllllIl / this.IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI - 1;
            final int llllIIIlIlllIlIIIIIl = this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.llllIIIlIlllIlIIIIIl;
            if (this.IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl != null) {
                this.IlIlIIIllIIllIlllllI.llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll("level");
                this.IlIlIlIlIlllllllllIl(n, System.nanoTime() + Math.max(1000000000 / Math.max(Math.min(Minecraft.lIlIIlllIIlIIlIlllIl(), llllIIIlIlllIlIIIIIl), 60) / 4 - (System.nanoTime() - n2), 0L));
                if (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lllIllIIIllllllIllll) {
                    this.IlIlIIIllIIllIlllllI.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl();
                    if (this.llIIIlIlllIllIIlIllI != null && this.IllIIlllllIIllIIllIl) {
                        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5890);
                        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
                        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIIIlIlIllIIlIlIlII();
                        this.llIIIlIlllIllIIlIllI.llllIIIIlIIIlIlllIll(n);
                        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
                    }
                    this.IlIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(true);
                }
                this.IIIIIllIIIIlIIIIllIl = System.nanoTime();
                this.IlIlIIIllIIllIlllllI.llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI("gui");
                if (!this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IIllIIIlIIIIlIIlIIII || this.IlIlIIIllIIllIlllllI.IIIIlllIIIIIIlIIIlll != null) {
                    net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(516, 0.1f);
                    this.IlIlIIIllIIllIlllllI.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(n);
                    if (this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.o && !this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IIIIIIIllllIlIIIIIII) {
                        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.q();
                    }
                    if (this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IIIIIIIllllIlIIIIIII) {
                        net.optifine.IllIllIlllIllllIIllI.llllIIIIlIIIlIlllIll(g);
                    }
                }
                this.IlIlIIIllIIllIlllllI.llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl();
            }
            else {
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0, 0, this.IlIlIIIllIIllIlllllI.IlIIIlIlIIIllIlIlIIl, this.IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI);
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5889);
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIIIlIlIllIIlIlIlII();
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5888);
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIIIlIlIllIIlIlIlII();
                this.lIIIlllIIIllIIIllIII();
                this.IIIIIllIIIIlIIIIllIl = System.nanoTime();
                net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl = this.IlIlIIIllIIllIlllllI.lllIllIIIllllllIllll();
                net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI = this.IlIlIIIllIIllIlllllI.lIlIlIIIllIIllIIIllI;
            }
            if (this.IlIlIIIllIIllIlllllI.IIIIlllIIIIIIlIIIlll != null) {
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI(256);
                try {
                    if (net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IllIlllIllIIIIllllII.llIllIIIIIllIlIIIIlI()) {
                        net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IllIlllIllIIIIllllII, this.IlIlIIIllIIllIlllllI.IIIIlllIIIIIIlIIIlll, n9, n10, n);
                    }
                    else {
                        this.IlIlIIIllIIllIlllllI.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(n9, n10, n);
                    }
                }
                catch (Throwable t) {
                    final net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(t, "Rendering screen");
                    final lIIIlllIIIllIIIllIII llllIIIIlIIIlIlllIll3 = llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll("Screen render details");
                    llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll("Screen name", new IlIlIIIlIIlIlIIlllIl(this));
                    llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll("Mouse location", new net.minecraft.client.lIIIlllIIIllIIIllIII.IlllllllIIIlIIIlIlII(this, n9, n10));
                    llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll("Screen size", new IIlIIIIlllIlllllIlII(this, g));
                    throw new IIlIlllIlIlllIlIllll(llllIIIIlIIIlIlllIll2);
                }
            }
        }
        this.IIlllIIlIllIllIlIIll();
        this.llllIIllllIlIlIIIIll();
        net.optifine.util.IIlllIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll();
        net.optifine.IllIllIlllIllllIIllI.llllIIIIlIIIlIlllIll();
        if (this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.n) {
            this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IIlllIIIllIllIIlIlIl = true;
        }
    }
    
    public void IlIlIlIlIlllllllllIl(final float n) {
        this.lIIIlllIIIllIIIllIII();
        this.IlIlIIIllIIllIlllllI.lllIIIIlllllIlIIllIl.llIllIIIIIllIlIIIIlI(new g(this.IlIlIIIllIIllIlllllI));
    }
    
    private boolean IlIlIIIllIIllIlllllI() {
        if (!this.IIIllllllIllIIIlllIl) {
            return false;
        }
        final llIllIIIIIllIlIIIIlI liiiIlIlIllllIIlIllI = this.IlIlIIIllIIllIlllllI.lIIIIlIlIllllIIlIllI();
        boolean b = liiiIlIlIllllIIlIllI instanceof llllIIIIlIIIlIlllIll && !this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IIllIIIlIIIIlIIlIIII;
        if (b && !((llllIIIIlIIIlIlllIll)liiiIlIlIllllIIlIllI).K.IlIlIIIllIllIIIIIllI) {
            final lllIIIIlIlIllIIlIIIl p = ((llllIIIIlIIIlIlllIll)liiiIlIlIllllIIlIllI).p();
            if (this.IlIlIIIllIIllIlllllI.IIllIIllIIIlIlIIIIlI != null && this.IlIlIIIllIIllIlllllI.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll == lllllIlIlIlllIlllIlI.IlIlIlIlIlllllllllIl) {
                final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = this.IlIlIIIllIIllIlllllI.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll();
                final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl = this.IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
                final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI();
                if (this.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.lIlIlIIIllIIllIIIllI() == net.minecraft.IIIlIIlIIIIlllIlllII.lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI) {
                    b = (net.optifine.lIIIIlIIIIIlllIllIII.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl) && this.IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll) instanceof net.minecraft.llIIlIIIlIIIllIlIIIl.llIIIlIlIllIIlIlIlII);
                }
                else {
                    b = (p != null && (p.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI) || p.IlIIIlIlIIIllIlIlIIl(llIllIIIIIllIlIIIIlI)));
                }
            }
        }
        return b;
    }
    
    private void lIIIIlIIIIIlllIllIII(final float n) {
        if (this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IIIIIIIllllIlIIIIIII && !this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IIllIIIlIIIIlIIlIIII && !this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.av() && !this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IlllllllIIIlIIIlIlII) {
            final llIllIIIIIllIlIIIIlI liiiIlIlIllllIIlIllI = this.IlIlIIIllIIllIlllllI.lIIIIlIlIllllIIlIllI();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(770, 771, 1, 0);
            GL11.glLineWidth(1.0f);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIIIlIIlIlIIlllIl();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(false);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5888);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIIIlIlIllIIlIlIlII();
            this.IllIIlllIIIIlllIIlIl(n);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, liiiIlIlIllllIIlIllI.llllIlIllllIIlIIlIlI(), 0.0f);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIIIIIlIlIIIIIIl.llllIIIIlIIIlIlllIll(new net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(0.0, 0.0, 0.0, 0.005, 1.0E-4, 1.0E-4), 255, 0, 0, 255);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIIIIIlIlIIIIIIl.llllIIIIlIIIlIlllIll(new net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(0.0, 0.0, 0.0, 1.0E-4, 1.0E-4, 0.005), 0, 0, 255, 255);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIIIIIlIlIIIIIIl.llllIIIIlIIIlIlllIll(new net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(0.0, 0.0, 0.0, 1.0E-4, 0.0033, 1.0E-4), 0, 255, 0, 255);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(true);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
        }
    }
    
    public void IlIlIlIlIlllllllllIl(final float n, final long n2) {
        this.llllIIIlIlllIlIIIIIl(n);
        if (this.IlIlIIIllIIllIlllllI.lIIIIlIlIllllIIlIllI() == null) {
            this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII);
        }
        this.llllIIIIlIIIlIlllIll(n);
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
            net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll(this.IlIlIIIllIIllIlllllI, n, n2);
        }
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIIlIIIlIIIllIlIIIl();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(516, 0.1f);
        this.IlIlIIIllIIllIlllllI.llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll("center");
        if (this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IlIlIIIllIllIIIIIllI) {
            net.minecraft.client.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl = 0;
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(false, true, true, false);
            this.llllIIIIlIIIlIlllIll(0, n, n2);
            net.minecraft.client.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl = 1;
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(true, false, false, false);
            this.llllIIIIlIIIlIlllIll(1, n, n2);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(true, true, true, false);
        }
        else {
            this.llllIIIIlIIIlIlllIll(2, n, n2);
        }
        this.IlIlIIIllIIllIlllllI.llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl();
    }
    
    private void llllIIIIlIIIlIlllIll(final int n, final float n2, final long n3) {
        final boolean b = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b();
        if (b) {
            net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll(n, n2, n3);
        }
        final lllllIIIIIlIlIIIIIIl llllIIIlIlllIlIIIIIl = this.IlIlIIIllIIllIlllllI.llllIIIlIlllIlIIIIIl;
        final net.minecraft.client.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIIlIIIlIIIllIlIIIl = this.IlIlIIIllIIllIlllllI.llIIlIIIlIIIllIlIIIl;
        final boolean ilIlIIIllIIllIlllllI = this.IlIlIIIllIIllIlllllI();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIllllIlIlIIIIll();
        this.IlIlIIIllIIllIlllllI.llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI("clear");
        if (b) {
            net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll(0, 0, this.IlIlIIIllIIllIlllllI.IlIIIlIlIIIllIlIlIIl, this.IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI);
        }
        else {
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0, 0, this.IlIlIIIllIIllIlllllI.IlIIIlIlIIIllIlIlIIl, this.IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI);
        }
        this.lIIIlllIIIllIIIllIII(n2);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI(16640);
        if (b) {
            net.optifine.shaders.llIIlllIIlllIIllIllI.IlIlIllllllllIIIIlII();
        }
        this.IlIlIIIllIIllIlllllI.llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI("camera");
        this.llllIIIIlIIIlIlllIll(n2, n);
        if (b) {
            net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll(n2);
        }
        net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII, this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IIIllIIllIIIIIIlIIlI == 2);
        this.IlIlIIIllIIllIlllllI.llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI("frustum");
        final net.minecraft.client.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = net.minecraft.client.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll();
        this.IlIlIIIllIIllIlllllI.llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI("culling");
        llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI = (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b() && !net.optifine.shaders.llIIlllIIlllIIllIllI.IIllIIllIIIlIlIIIIlI());
        final net.minecraft.client.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI = new net.minecraft.client.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll);
        final llIllIIIIIllIlIIIIlI liiiIlIlIllllIIlIllI = this.IlIlIIIllIIllIlllllI.lIIIIlIlIllllIIlIllI();
        final double n4 = liiiIlIlIllllIIlIllI.lIIlIIIlIllIlIllIIIl + (liiiIlIlIllllIIlIllI.IIlllIlIIllIlIlIlIIl - liiiIlIlIllllIIlIllI.lIIlIIIlIllIlIllIIIl) * n2;
        final double n5 = liiiIlIlIllllIIlIllI.IIlIIIlllIllIllIlIII + (liiiIlIlIllllIIlIllI.llIIIlIlIllIIlIlIlII - liiiIlIlIllllIIlIllI.IIlIIIlllIllIllIlIII) * n2;
        final double n6 = liiiIlIlIllllIIlIllI.lIlIlIlllIIlIlIlllIl + (liiiIlIlIllllIIlIllI.lllllIlIIIlIlIIlllII - liiiIlIlIllllIIlIllI.lIlIlIlllIIlIlIlllIl) * n2;
        if (b) {
            net.optifine.shaders.IIlllIIIlIlllIIlllII.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, n4, n5, n6);
        }
        else {
            llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(n4, n5, n6);
        }
        if ((net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIIlllllIIllIIlllll() || net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lllllIIlIlIIIlIlIIIl() || net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIIllIIIllllIlllIllI()) && !net.optifine.shaders.llIIlllIIlllIIllIllI.IIlllIIlIllIllIlIIll) {
            this.llllIIIIlIIIlIlllIll(-1, n2);
            this.IlIlIIIllIIllIlllllI.llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI("sky");
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5889);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIIIlIlIllIIlIlIlII();
            Project.gluPerspective(this.llllIIIIlIIIlIlllIll(n2, true), this.IlIlIIIllIIllIlllllI.IlIIIlIlIIIllIlIlIIl / (float)this.IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI, 0.05f, this.IIIllIIIlIlIIllIIIlI);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5888);
            if (b) {
                net.optifine.shaders.llIIlllIIlllIIllIllI.IIIllllllIllIIIlllIl();
            }
            llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(n2, n);
            if (b) {
                net.optifine.shaders.llIIlllIIlllIIllIllI.IIIIIIIIIlllIllIlIlI();
            }
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5889);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIIIlIlIllIIlIlIlII();
            Project.gluPerspective(this.llllIIIIlIIIlIlllIll(n2, true), this.IlIlIIIllIIllIlllllI.IlIIIlIlIIIllIlIlIIl / (float)this.IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI, 0.05f, this.IIIllIIIlIlIIllIIIlI);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5888);
        }
        else {
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
        }
        this.llllIIIIlIIIlIlllIll(0, n2);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIIlIIIlIIIllIlIIIl(7425);
        if (liiiIlIlIllllIIlIllI.llIIIlIlIllIIlIlIlII + liiiIlIlIllllIIlIllI.llllIlIllllIIlIIlIlI() < 128.0 + this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.g * 128.0f) {
            this.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl, n2, n);
        }
        this.IlIlIIIllIIllIlllllI.llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI("prepareterrain");
        this.llllIIIIlIIIlIlllIll(0, n2);
        this.IlIlIIIllIIllIlllllI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll();
        this.IlIlIIIllIIllIlllllI.llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI("terrain_setup");
        this.llllIIIIlIIIlIlllIll(liiiIlIlIllllIIlIllI, n2, llIllIIIIIllIlIIIIlI, this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl());
        if (b) {
            net.optifine.shaders.IIlllIIIlIlllIIlllII.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl, liiiIlIlIllllIIlIllI, n2, llIllIIIIIllIlIIIIlI, this.lIIIIlIIIIIlllIllIII++, this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl());
        }
        else {
            llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(liiiIlIlIllllIIlIllI, n2, llIllIIIIIllIlIIIIlI, this.lIIIIlIIIIIlllIllIII++, this.IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl());
        }
        if (n == 0 || n == 2) {
            this.IlIlIIIllIIllIlllllI.llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI("updatechunks");
            net.optifine.IllIllIlllIllllIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll();
            this.IlIlIIIllIIllIlllllI.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(n3);
            net.optifine.IllIllIlllIllllIIllI.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl();
        }
        this.IlIlIIIllIIllIlllllI.llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI("terrain");
        net.optifine.IllIllIlllIllllIIllI.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll();
        if (this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.lIIlIIIIIIIlIIlIlIIl && n > 0) {
            this.IlIlIIIllIIllIlllllI.llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI("finish");
            GL11.glFinish();
            this.IlIlIIIllIIllIlllllI.llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI("terrain");
        }
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5888);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI();
        if (b) {
            net.optifine.shaders.IIlllIIIlIlllIIlllII.llllIIIIlIIIlIlllIll();
        }
        llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll, n2, n, liiiIlIlIllllIIlIllI);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl();
        if (b) {
            net.optifine.shaders.IIlllIIIlIlllIIlllII.IlIlIlIlIlllllllllIl();
        }
        this.IlIlIIIllIIllIlllllI.lllIllIIIllllllIllll().IlIlIlIlIlllllllllIl(net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl).IlIlIlIlIlllllllllIl(false, this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IlIIIlIIIllllIlIlIlI > 0);
        llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl, n2, n, liiiIlIlIllllIIlIllI);
        this.IlIlIIIllIIllIlllllI.lllIllIIIllllllIllll().IlIlIlIlIlllllllllIl(net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl).IlIlIIIllIllIIIIIllI();
        this.IlIlIIIllIIllIlllllI.lllIllIIIllllllIllll().IlIlIlIlIlllllllllIl(net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl).IlIlIlIlIlllllllllIl(false, false);
        if (b) {
            net.optifine.shaders.IIlllIIIlIlllIIlllII.llIllIIIIIllIlIIIIlI();
        }
        llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI, n2, n, liiiIlIlIllllIIlIllI);
        this.IlIlIIIllIIllIlllllI.lllIllIIIllllllIllll().IlIlIlIlIlllllllllIl(net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl).IlIlIIIllIllIIIIIllI();
        if (b) {
            net.optifine.shaders.IIlllIIIlIlllIIlllII.IlIIIlIlIIIllIlIlIIl();
        }
        net.optifine.IllIllIlllIllllIIllI.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIIlIIIlIIIllIlIIIl(7424);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(516, 0.1f);
        if (!this.IIlIIIlllIllIllIlIII) {
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5888);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl();
            this.IlIlIIIllIIllIlllllI.llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI("entities");
            if (net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.l.llIllIIIIIllIlIIIIlI()) {
                net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.l, 0);
            }
            llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(liiiIlIlIllllIIlIllI, llIllIIIIIllIlIIIIlI, n2);
            if (net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.l.llIllIIIIIllIlIIIIlI()) {
                net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.l, -1);
            }
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll();
            this.llllIIIlIlllIlIIIIIl();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5888);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
            if (this.IlIlIIIllIIllIlllllI.IIllIIllIIIlIlIIIIlI != null && liiiIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII) && ilIlIIIllIIllIlllllI) {
                final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = (llllIIIIlIIIlIlllIll)liiiIlIlIllllIIlIllI;
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI();
                this.IlIlIIIllIIllIlllllI.llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI("outline");
                llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, this.IlIlIIIllIIllIlllllI.IIllIIllIIIlIlIIIIlI, 0, n2);
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl();
            }
        }
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5888);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
        if (ilIlIIIllIIllIlllllI && this.IlIlIIIllIIllIlllllI.IIllIIllIIIlIlIIIIlI != null && !liiiIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII)) {
            final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll3 = (llllIIIIlIIIlIlllIll)liiiIlIlIllllIIlIllI;
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI();
            this.IlIlIIIllIIllIlllllI.llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI("outline");
            if ((!net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.c.llIllIIIIIllIlIIIIlI() || !net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.c, llllIIIlIlllIlIIIIIl, llllIIIIlIIIlIlllIll3, this.IlIlIIIllIIllIlllllI.IIllIIllIIIlIlIIIIlI, 0, llllIIIIlIIIlIlllIll3.n(), n2)) && !this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IIllIIIlIIIIlIIlIIII) {
                llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3, this.IlIlIIIllIIllIlllllI.IIllIIllIIIlIlIIIIlI, 0, n2);
            }
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl();
        }
        if (!llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.isEmpty()) {
            this.IlIlIIIllIIllIlllllI.llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI("destroyProgress");
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(770, 1, 1, 0);
            this.IlIlIIIllIIllIlllllI.lllIllIIIllllllIllll().IlIlIlIlIlllllllllIl(net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl).IlIlIlIlIlllllllllIl(false, false);
            llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(net.minecraft.client.lIIIlllIIIllIIIllIII.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(), net.minecraft.client.lIIIlllIIIllIIIllIII.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll().llIllIIIIIllIlIIIIlI(), liiiIlIlIllllIIlIllI, n2);
            this.IlIlIIIllIIllIlllllI.lllIllIIIllllllIllll().IlIlIlIlIlllllllllIl(net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl).IlIlIIIllIllIIIIIllI();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
        }
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(770, 771, 1, 0);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
        if (!this.IIlIIIlllIllIllIlIII) {
            this.lIIIIlIIIIIlllIllIII();
            this.IlIlIIIllIIllIlllllI.llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI("litParticles");
            if (b) {
                net.optifine.shaders.llIIlllIIlllIIllIllI.llIIIIIIlIllIIlIIIll();
            }
            llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl(liiiIlIlIllllIIlIllI, n2);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll();
            this.llllIIIIlIIIlIlllIll(0, n2);
            this.IlIlIIIllIIllIlllllI.llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI("particles");
            if (b) {
                net.optifine.shaders.llIIlllIIlllIIllIllI.lIIIIlIlIllllIIlIllI();
            }
            llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(liiiIlIlIllllIIlIllI, n2);
            if (b) {
                net.optifine.shaders.llIIlllIIlllIIllIllI.llIIIlIlllIllIIlIllI();
            }
            this.llllIIIlIlllIlIIIIIl();
        }
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(false);
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.IIlllIIlIllIllIlIIll());
        }
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIllllIlIlIIIIll();
        this.IlIlIIIllIIllIlllllI.llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI("weather");
        if (b) {
            net.optifine.shaders.llIIlllIIlllIIllIllI.lllllIIIIIlIlIIIIIIl();
        }
        this.llIllIIIIIllIlIIIIlI(n2);
        if (b) {
            net.optifine.shaders.llIIlllIIlllIIllIllI.IllIIlllllIIllIIllIl();
        }
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(true);
        llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(liiiIlIlIllllIIlIllI, n2);
        if (b) {
            net.optifine.shaders.IIlllIIIlIlllIIlllII.llllIIIIlIIIlIlllIll(this, n2, n);
            net.optifine.shaders.llIIlllIIlllIIllIllI.lIllIIIIIlllIIlIIllI();
        }
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIllllIlIlIIIIll();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(770, 771, 1, 0);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(516, 0.1f);
        this.llllIIIIlIIIlIlllIll(0, n2);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(false);
        this.IlIlIIIllIIllIlllllI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIIlIIIlIIIllIlIIIl(7425);
        this.IlIlIIIllIIllIlllllI.llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI("translucent");
        if (b) {
            net.optifine.shaders.llIIlllIIlllIIllIllI.lIlIIlllIIlIIlIlllIl();
        }
        llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIIlIlIIIlIIlIlIlII.IlIIIlIlIIIllIlIlIIl, n2, n, liiiIlIlIllllIIlIllI);
        if (b) {
            net.optifine.shaders.llIIlllIIlllIIllIllI.llIIIllIlIllIllIIIIl();
        }
        if (net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.l.llIllIIIIIllIlIIIIlI() && !this.IIlIIIlllIllIllIlIII) {
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl();
            this.IlIlIIIllIIllIlllllI.llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI("entities");
            net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.l, 1);
            this.IlIlIIIllIIllIlllllI.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(liiiIlIlIllllIIlIllI, llIllIIIIIllIlIIIIlI, n2);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(770, 771, 1, 0);
            net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.l, -1);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll();
        }
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIIlIIIlIIIllIlIIIl(7424);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(true);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIllllIlIlIIIIll();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IIIIlllIIIIIIlIIIlll();
        if (liiiIlIlIllllIIlIllI.llIIIlIlIllIIlIlIlII + liiiIlIlIllllIIlIllI.llllIlIllllIIlIIlIlI() >= 128.0 + this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.g * 128.0f) {
            this.IlIlIIIllIIllIlllllI.llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI("aboveClouds");
            this.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl, n2, n);
        }
        if (net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.lllIIIIlIlIllIIlIIIl.llIllIIIIIllIlIIIIlI()) {
            this.IlIlIIIllIIllIlllllI.llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI("forge_render_last");
            net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.lllIIIIlIlIllIIlIIIl, llllIIIlIlllIlIIIIIl, n2);
        }
        this.IlIlIIIllIIllIlllllI.llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI("hand");
        if (this.llllllIllIllIlIllllI && !net.optifine.shaders.llIIlllIIlllIIllIllI.IIlllIIlIllIllIlIIll) {
            if (b) {
                net.optifine.shaders.IIlllIIIlIlllIIlllII.IlIlIlIlIlllllllllIl(this, n2, n);
                net.optifine.shaders.llIIlllIIlllIIllIllI.IIlIIIIIllIlIIIlIIll();
            }
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI(256);
            if (b) {
                net.optifine.shaders.IIlllIIIlIlllIIlllII.llIllIIIIIllIlIIIIlI(this, n2, n);
            }
            else {
                this.IlIlIlIlIlllllllllIl(n2, n);
            }
            this.lIIIIlIIIIIlllIllIII(n2);
        }
        if (b) {
            net.optifine.shaders.llIIlllIIlllIIllIllI.llllllIllIllIlIllllI();
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final lllllIIIIIlIlIIIIIIl lllllIIIIIlIlIIIIIIl, final float n, final int n2) {
        if (this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.llIllIIIIIllIlIIIIlI >= 4 && !net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII() && net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll(this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll)) {
            this.IlIlIIIllIIllIlllllI.llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI("clouds");
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5889);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIIIlIlIllIIlIlIlII();
            Project.gluPerspective(this.llllIIIIlIIIlIlllIll(n, true), this.IlIlIIIllIIllIlllllI.IlIIIlIlIIIllIlIlIIl / (float)this.IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI, 0.05f, this.IIIllIIIlIlIIllIIIlI * 4.0f);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5888);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
            this.llllIIIIlIIIlIlllIll(0, n);
            lllllIIIIIlIlIIIIIIl.IlIlIlIlIlllllllllIl(n, n2);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IIIIlllIIIIIIlIIIlll();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5889);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIIIlIlIllIIlIlIlII();
            Project.gluPerspective(this.llllIIIIlIIIlIlllIll(n, true), this.IlIlIIIllIIllIlllllI.IlIIIlIlIIIllIlIlIIl / (float)this.IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI, 0.05f, this.IIIllIIIlIlIIllIIIlI);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5888);
        }
    }
    
    private void IIIIlllIIIIIIlIIIlll() {
        float llIIlIIIlIIIllIlIIIl = this.IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl.llIIlIIIlIIIllIlIIIl(1.0f);
        if (!net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl()) {
            llIIlIIIlIIIllIlIIIl /= 2.0f;
        }
        if (llIIlIIIlIIIllIlIIIl != 0.0f && net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IllIlIIllIllIIlIllII()) {
            this.llllIIllllIlIlIIIIll.setSeed(this.lllIIIIlllllIlIIllIl * 312987231L);
            final llIllIIIIIllIlIIIIlI liiiIlIlIllllIIlIllI = this.IlIlIIIllIIllIlllllI.lIIIIlIlIllllIIlIllI();
            final net.minecraft.client.IlIlIIIllIllIIIIIllI.llIIlIIIlIIIllIlIIIl illIIlllIIIIlllIIlIl = this.IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl;
            final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(liiiIlIlIllllIIlIllI);
            final int n = 10;
            double n2 = 0.0;
            double n3 = 0.0;
            double n4 = 0.0;
            int n5 = 0;
            int n6 = (int)(100.0f * llIIlIIIlIIIllIlIIIl * llIIlIIIlIIIllIlIIIl);
            if (this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.lIllllIllIllIIllllll == 1) {
                n6 >>= 1;
            }
            else if (this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.lIllllIllIllIIllllll == 2) {
                n6 = 0;
            }
            for (int i = 0; i < n6; ++i) {
                final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl iIlllIIlIllIllIlIIll = illIIlllIIIIlllIIlIl.IIlllIIlIllIllIlIIll(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.llllIIllllIlIlIIIIll.nextInt(n) - this.llllIIllllIlIlIIIIll.nextInt(n), 0, this.llllIIllllIlIlIIIIll.nextInt(n) - this.llllIIllllIlIlIIIIll.nextInt(n)));
                final net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI = illIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI(iIlllIIlIllIllIlIIll);
                final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2 = iIlllIIlIllIllIlIIll.IlIlIlIlIlllllllllIl();
                final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI2 = illIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl2).llIllIIIIIllIlIIIIlI();
                if (iIlllIIlIllIllIlIIll.lIIIlllIIIllIIIllIII() <= ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + n && iIlllIIlIllIllIlIIll.lIIIlllIIIllIIIllIII() >= ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() - n && llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI() && llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(iIlllIIlIllIllIlIIll) >= 0.15f) {
                    final double nextDouble = this.llllIIllllIlIlIIIIll.nextDouble();
                    final double nextDouble2 = this.llllIIllllIlIlIIIIll.nextDouble();
                    if (llIllIIIIIllIlIIIIlI2.IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII) {
                        this.IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.lIlIlIIIllIIllIIIllI, iIlllIIlIllIllIlIIll.lIIIIlIIIIIlllIllIII() + nextDouble, iIlllIIlIllIllIlIIll.lIIIlllIIIllIIIllIII() + 0.1f - llIllIIIIIllIlIIIIlI2.IIllIIllIIIlIlIIIIlI(), iIlllIIlIllIllIlIIll.llIIlIIIlIIIllIlIIIl() + nextDouble2, 0.0, 0.0, 0.0, new int[0]);
                    }
                    else if (llIllIIIIIllIlIIIIlI2.IllIIlllIIIIlllIIlIl() != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
                        llIllIIIIIllIlIIIIlI2.llIllIIIIIllIlIIIIlI((lIlIlIIIllIIllIIIllI)illIIlllIIIIlllIIlIl, ilIlIlIlIlllllllllIl2);
                        ++n5;
                        if (this.llllIIllllIlIlIIIIll.nextInt(n5) == 0) {
                            n2 = ilIlIlIlIlllllllllIl2.lIIIIlIIIIIlllIllIII() + nextDouble;
                            n3 = ilIlIlIlIlllllllllIl2.lIIIlllIIIllIIIllIII() + 0.1f + llIllIIIIIllIlIIIIlI2.IIIlIIIlIlIIlllIIlll() - 1.0;
                            n4 = ilIlIlIlIlllllllllIl2.llIIlIIIlIIIllIlIIIl() + nextDouble2;
                        }
                        this.IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IlllIIIIlIIIlIlIlIIl, ilIlIlIlIlllllllllIl2.lIIIIlIIIIIlllIllIII() + nextDouble, ilIlIlIlIlllllllllIl2.lIIIlllIIIllIIIllIII() + 0.1f + llIllIIIIIllIlIIIIlI2.IIIlIIIlIlIIlllIIlll(), ilIlIlIlIlllllllllIl2.llIIlIIIlIIIllIlIIIl() + nextDouble2, 0.0, 0.0, 0.0, new int[0]);
                    }
                }
            }
            if (n5 > 0 && this.llllIIllllIlIlIIIIll.nextInt(3) < this.IllIllIIIIlIIlIlllII++) {
                this.IllIllIIIIlIIlIlllII = 0;
                if (n3 > ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + 1 && illIIlllIIIIlllIIlIl.IIlllIIlIllIllIlIIll(ilIlIlIlIlllllllllIl).lIIIlllIIIllIIIllIII() > llIllIIlllllllllllll.IlIIIlIlIIIllIlIlIIl((float)ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII())) {
                    this.IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(n2, n3, n4, "ambient.weather.rain", 0.1f, 0.5f, false);
                }
                else {
                    this.IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(n2, n3, n4, "ambient.weather.rain", 0.2f, 1.0f, false);
                }
            }
        }
    }
    
    protected void llIllIIIIIllIlIIIIlI(final float n) {
        if (net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.M.llIllIIIIIllIlIIIIlI()) {
            final Object llllIIIlIlllIlIIIIIl = net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl(this.IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl.IlIllIlIlIIIlIlIlIII, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.M, new Object[0]);
            if (llllIIIlIlllIlIIIIIl != null) {
                net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.W, n, this.IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl, this.IlIlIIIllIIllIlllllI);
                return;
            }
        }
        final float llIIlIIIlIIIllIlIIIl = this.IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl.llIIlIIIlIIIllIlIIIl(n);
        if (llIIlIIIlIIIllIlIIIl > 0.0f) {
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII()) {
                return;
            }
            this.lIIIIlIIIIIlllIllIII();
            final llIllIIIIIllIlIIIIlI liiiIlIlIllllIIlIllI = this.IlIlIIIllIIllIlllllI.lIIIIlIlIllllIIlIllI();
            final net.minecraft.client.IlIlIIIllIllIIIIIllI.llIIlIIIlIIIllIlIIIl illIIlllIIIIlllIIlIl = this.IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl;
            final int llIllIIIIIllIlIIIIlI = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(liiiIlIlIllllIIlIllI.IIlllIlIIllIlIlIlIIl);
            final int llIllIIIIIllIlIIIIlI2 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(liiiIlIlIllllIIlIllI.llIIIlIlIllIIlIlIlII);
            final int llIllIIIIIllIlIIIIlI3 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(liiiIlIlIllllIIlIllI.lllllIlIIIlIlIIlllII);
            final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll = net.minecraft.client.lIIIlllIIIllIIIllIII.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
            final lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI4 = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIllIlIlIIIlIlIlIII();
            GL11.glNormal3f(0.0f, 1.0f, 0.0f);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(770, 771, 1, 0);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(516, 0.1f);
            final double n2 = liiiIlIlIllllIIlIllI.lIIlIIIlIllIlIllIIIl + (liiiIlIlIllllIIlIllI.IIlllIlIIllIlIlIlIIl - liiiIlIlIllllIIlIllI.lIIlIIIlIllIlIllIIIl) * n;
            final double n3 = liiiIlIlIllllIIlIllI.IIlIIIlllIllIllIlIII + (liiiIlIlIllllIIlIllI.llIIIlIlIllIIlIlIlII - liiiIlIlIllllIIlIllI.IIlIIIlllIllIllIlIII) * n;
            final double n4 = liiiIlIlIllllIIlIllI.lIlIlIlllIIlIlIlllIl + (liiiIlIlIllllIIlIllI.lllllIlIIIlIlIIlllII - liiiIlIlIllllIIlIllI.lIlIlIlllIIlIlIlllIl) * n;
            final int llIllIIIIIllIlIIIIlI5 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n3);
            int n5 = 5;
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl()) {
                n5 = 10;
            }
            int n6 = -1;
            final float n7 = this.lllIIIIlllllIlIIllIl + n;
            llIllIIIIIllIlIIIIlI4.llIllIIIIIllIlIIIIlI(-n2, -n3, -n4);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
            final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl2 = new llllIIIlIlllIlIIIIIl();
            for (int i = llIllIIIIIllIlIIIIlI3 - n5; i <= llIllIIIIIllIlIIIIlI3 + n5; ++i) {
                for (int j = llIllIIIIIllIlIIIIlI - n5; j <= llIllIIIIIllIlIIIIlI + n5; ++j) {
                    final int n8 = (i - llIllIIIIIllIlIIIIlI3 + 16) * 32 + j - llIllIIIIIllIlIIIIlI + 16;
                    final double n9 = this.IlIllllIIlIIlIlIlIll[n8] * 0.5;
                    final double n10 = this.IllIllIlllIllllIIllI[n8] * 0.5;
                    llllIIIlIlllIlIIIIIl2.IlIlIlIlIlllllllllIl(j, 0, i);
                    final net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI6 = illIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI(llllIIIlIlllIlIIIIIl2);
                    if (llIllIIIIIllIlIIIIlI6.IlIlIIIllIllIIIIIllI() || llIllIIIIIllIlIIIIlI6.IlIIIlIlIIIllIlIlIIl()) {
                        final int liiIlllIIIllIIIllIII = illIIlllIIIIlllIIlIl.IIlllIIlIllIllIlIIll(llllIIIlIlllIlIIIIIl2).lIIIlllIIIllIIIllIII();
                        int n11 = llIllIIIIIllIlIIIIlI2 - n5;
                        int n12 = llIllIIIIIllIlIIIIlI2 + n5;
                        if (n11 < liiIlllIIIllIIIllIII) {
                            n11 = liiIlllIIIllIIIllIII;
                        }
                        if (n12 < liiIlllIIIllIIIllIII) {
                            n12 = liiIlllIIIllIIIllIII;
                        }
                        int n13;
                        if ((n13 = liiIlllIIIllIIIllIII) < llIllIIIIIllIlIIIIlI5) {
                            n13 = llIllIIIIIllIlIIIIlI5;
                        }
                        if (n11 != n12) {
                            this.llllIIllllIlIlIIIIll.setSeed(j * j * 3121 + j * 45238971 ^ i * i * 418711 + i * 13761);
                            llllIIIlIlllIlIIIIIl2.IlIlIlIlIlllllllllIl(j, n11, i);
                            if (illIIlllIIIIlllIIlIl.llIIlIIIlIIIllIlIIIl().llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI6.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl2), liiIlllIIIllIIIllIII) >= 0.15f) {
                                if (n6 != 0) {
                                    if (n6 >= 0) {
                                        llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
                                    }
                                    n6 = 0;
                                    this.IlIlIIIllIIllIlllllI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(net.minecraft.client.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.llIllIlIIIIllIlIIllI);
                                    llIllIIIIIllIlIIIIlI4.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl);
                                }
                                final double n14 = ((this.lllIIIIlllllIlIIllIl + j * j * 3121 + j * 45238971 + i * i * 418711 + i * 13761 & 0x1F) + (double)n) / 32.0 * (3.0 + this.llllIIllllIlIlIIIIll.nextDouble());
                                final double n15 = j + 0.5f - liiiIlIlIllllIIlIllI.IIlllIlIIllIlIlIlIIl;
                                final double n16 = i + 0.5f - liiiIlIlIllllIIlIllI.lllllIlIIIlIlIIlllII;
                                final float n17 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n15 * n15 + n16 * n16) / n5;
                                final float n18 = ((1.0f - n17 * n17) * 0.5f + 0.5f) * llIIlIIIlIIIllIlIIIl;
                                llllIIIlIlllIlIIIIIl2.IlIlIlIlIlllllllllIl(j, n13, i);
                                final int llllIIIIlIIIlIlllIll2 = illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl2, 0);
                                final int n19 = llllIIIIlIIIlIlllIll2 >> 16 & 0xFFFF;
                                final int n20 = llllIIIIlIIIlIlllIll2 & 0xFFFF;
                                llIllIIIIIllIlIIIIlI4.IlIlIlIlIlllllllllIl(j - n9 + 0.5, n11, i - n10 + 0.5).llllIIIIlIIIlIlllIll(0.0, n11 * 0.25 + n14).llllIIIIlIIIlIlllIll(1.0f, 1.0f, 1.0f, n18).llllIIIIlIIIlIlllIll(n19, n20).IlIlIIIllIllIIIIIllI();
                                llIllIIIIIllIlIIIIlI4.IlIlIlIlIlllllllllIl(j + n9 + 0.5, n11, i + n10 + 0.5).llllIIIIlIIIlIlllIll(1.0, n11 * 0.25 + n14).llllIIIIlIIIlIlllIll(1.0f, 1.0f, 1.0f, n18).llllIIIIlIIIlIlllIll(n19, n20).IlIlIIIllIllIIIIIllI();
                                llIllIIIIIllIlIIIIlI4.IlIlIlIlIlllllllllIl(j + n9 + 0.5, n12, i + n10 + 0.5).llllIIIIlIIIlIlllIll(1.0, n12 * 0.25 + n14).llllIIIIlIIIlIlllIll(1.0f, 1.0f, 1.0f, n18).llllIIIIlIIIlIlllIll(n19, n20).IlIlIIIllIllIIIIIllI();
                                llIllIIIIIllIlIIIIlI4.IlIlIlIlIlllllllllIl(j - n9 + 0.5, n12, i - n10 + 0.5).llllIIIIlIIIlIlllIll(0.0, n12 * 0.25 + n14).llllIIIIlIIIlIlllIll(1.0f, 1.0f, 1.0f, n18).llllIIIIlIIIlIlllIll(n19, n20).IlIlIIIllIllIIIIIllI();
                            }
                            else {
                                if (n6 != 1) {
                                    if (n6 >= 0) {
                                        llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
                                    }
                                    n6 = 1;
                                    this.IlIlIIIllIIllIlllllI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(net.minecraft.client.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.lIlIlIIIllIIllIIIllI);
                                    llIllIIIIIllIlIIIIlI4.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl);
                                }
                                final double n21 = ((this.lllIIIIlllllIlIIllIl & 0x1FF) + n) / 512.0f;
                                final double n22 = this.llllIIllllIlIlIIIIll.nextDouble() + n7 * 0.01 * (float)this.llllIIllllIlIlIIIIll.nextGaussian();
                                final double n23 = this.llllIIllllIlIlIIIIll.nextDouble() + n7 * (float)this.llllIIllllIlIlIIIIll.nextGaussian() * 0.001;
                                final double n24 = j + 0.5f - liiiIlIlIllllIIlIllI.IIlllIlIIllIlIlIlIIl;
                                final double n25 = i + 0.5f - liiiIlIlIllllIIlIllI.lllllIlIIIlIlIIlllII;
                                final float n26 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n24 * n24 + n25 * n25) / n5;
                                final float n27 = ((1.0f - n26 * n26) * 0.3f + 0.5f) * llIIlIIIlIIIllIlIIIl;
                                llllIIIlIlllIlIIIIIl2.IlIlIlIlIlllllllllIl(j, n13, i);
                                final int n28 = (illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl2, 0) * 3 + 15728880) / 4;
                                final int n29 = n28 >> 16 & 0xFFFF;
                                final int n30 = n28 & 0xFFFF;
                                llIllIIIIIllIlIIIIlI4.IlIlIlIlIlllllllllIl(j - n9 + 0.5, n11, i - n10 + 0.5).llllIIIIlIIIlIlllIll(0.0 + n22, n11 * 0.25 + n21 + n23).llllIIIIlIIIlIlllIll(1.0f, 1.0f, 1.0f, n27).llllIIIIlIIIlIlllIll(n29, n30).IlIlIIIllIllIIIIIllI();
                                llIllIIIIIllIlIIIIlI4.IlIlIlIlIlllllllllIl(j + n9 + 0.5, n11, i + n10 + 0.5).llllIIIIlIIIlIlllIll(1.0 + n22, n11 * 0.25 + n21 + n23).llllIIIIlIIIlIlllIll(1.0f, 1.0f, 1.0f, n27).llllIIIIlIIIlIlllIll(n29, n30).IlIlIIIllIllIIIIIllI();
                                llIllIIIIIllIlIIIIlI4.IlIlIlIlIlllllllllIl(j + n9 + 0.5, n12, i + n10 + 0.5).llllIIIIlIIIlIlllIll(1.0 + n22, n12 * 0.25 + n21 + n23).llllIIIIlIIIlIlllIll(1.0f, 1.0f, 1.0f, n27).llllIIIIlIIIlIlllIll(n29, n30).IlIlIIIllIllIIIIIllI();
                                llIllIIIIIllIlIIIIlI4.IlIlIlIlIlllllllllIl(j - n9 + 0.5, n12, i - n10 + 0.5).llllIIIIlIIIlIlllIll(0.0 + n22, n12 * 0.25 + n21 + n23).llllIIIIlIIIlIlllIll(1.0f, 1.0f, 1.0f, n27).llllIIIIlIIIlIlllIll(n29, n30).IlIlIIIllIllIIIIIllI();
                            }
                        }
                    }
                }
            }
            if (n6 >= 0) {
                llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
            }
            llIllIIIIIllIlIIIIlI4.llIllIIIIIllIlIIIIlI(0.0, 0.0, 0.0);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIllllIlIlIIIIll();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(516, 0.1f);
            this.llllIIIlIlllIlIIIIIl();
        }
    }
    
    public void lIIIlllIIIllIIIllIII() {
        final g g = new g(this.IlIlIIIllIIllIlllllI);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI(256);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5889);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIIIlIlIllIIlIlIlII();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(0.0, g.llIllIIIIIllIlIIIIlI(), g.IlIIIlIlIIIllIlIlIIl(), 0.0, 1000.0, 3000.0);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5888);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIIIlIlIllIIlIlIlII();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, 0.0f, -2000.0f);
    }
    
    private void lIIIlllIIIllIIIllIII(final float n) {
        final net.minecraft.client.IlIlIIIllIllIIIIIllI.llIIlIIIlIIIllIlIIIl illIIlllIIIIlllIIlIl = this.IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl;
        final llIllIIIIIllIlIIIIlI liiiIlIlIllllIIlIllI = this.IlIlIIIllIIllIlllllI.lIIIIlIlIllllIIlIllI();
        final float n2 = 1.0f - (float)Math.pow(0.25f + 0.75f * this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.llIllIIIIIllIlIIIIlI / 32.0f, 0.25);
        final net.minecraft.IlllllllIIIlIIIlIlII.e ilIlIlIlIlllllllllIl = net.optifine.lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl(illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(this.IlIlIIIllIIllIlllllI.lIIIIlIlIllllIIlIllI(), n), illIIlllIIIIlllIIlIl, this.IlIlIIIllIIllIlllllI.lIIIIlIlIllllIIlIllI(), n);
        final float n3 = (float)ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;
        final float n4 = (float)ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl;
        final float n5 = (float)ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI;
        final net.minecraft.IlllllllIIIlIIIlIlII.e llllIIIIlIIIlIlllIll = net.optifine.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl(n), illIIlllIIIIlllIIlIl, this.IlIlIIIllIIllIlllllI.lIIIIlIlIllllIIlIllI(), n);
        this.IlIIIlIlIIIllIlIlIIl = (float)llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll;
        this.IlIlIIIllIllIIIIIllI = (float)llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl;
        this.IllIIlllIIIIlllIIlIl = (float)llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI;
        if (this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.llIllIIIIIllIlIIIIlI >= 4) {
            final double n6 = -1.0;
            float n7 = (float)liiiIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(n).IlIlIlIlIlllllllllIl((llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl(n)) > 0.0f) ? new net.minecraft.IlllllllIIIlIIIlIlII.e(n6, 0.0, 0.0) : new net.minecraft.IlllllllIIIlIIIlIlII.e(1.0, 0.0, 0.0));
            if (n7 < 0.0f) {
                n7 = 0.0f;
            }
            if (n7 > 0.0f) {
                final float[] llllIIIIlIIIlIlllIll2 = illIIlllIIIIlllIIlIl.IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI(n), n);
                if (llllIIIIlIIIlIlllIll2 != null) {
                    final float n8 = n7 * llllIIIIlIIIlIlllIll2[3];
                    this.IlIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl * (1.0f - n8) + llllIIIIlIIIlIlllIll2[0] * n8;
                    this.IlIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI * (1.0f - n8) + llllIIIIlIIIlIlllIll2[1] * n8;
                    this.IllIIlllIIIIlllIIlIl = this.IllIIlllIIIIlllIIlIl * (1.0f - n8) + llllIIIIlIIIlIlllIll2[2] * n8;
                }
            }
        }
        this.IlIIIlIlIIIllIlIlIIl += (n3 - this.IlIIIlIlIIIllIlIlIIl) * n2;
        this.IlIlIIIllIllIIIIIllI += (n4 - this.IlIlIIIllIllIIIIIllI) * n2;
        this.IllIIlllIIIIlllIIlIl += (n5 - this.IllIIlllIIIIlllIIlIl) * n2;
        final float llIIlIIIlIIIllIlIIIl = illIIlllIIIIlllIIlIl.llIIlIIIlIIIllIlIIIl(n);
        if (llIIlIIIlIIIllIlIIIl > 0.0f) {
            final float n9 = 1.0f - llIIlIIIlIIIllIlIIIl * 0.5f;
            final float n10 = 1.0f - llIIlIIIlIIIllIlIIIl * 0.4f;
            this.IlIIIlIlIIIllIlIlIIl *= n9;
            this.IlIlIIIllIllIIIIIllI *= n9;
            this.IllIIlllIIIIlllIIlIl *= n10;
        }
        final float liiiIlIIIIIlllIllIII = illIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII(n);
        if (liiiIlIIIIIlllIllIII > 0.0f) {
            final float n11 = 1.0f - liiiIlIIIIIlllIllIII * 0.5f;
            this.IlIIIlIlIIIllIlIlIIl *= n11;
            this.IlIlIIIllIllIIIIIllI *= n11;
            this.IllIIlllIIIIlllIIlIl *= n11;
        }
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll3 = net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl, liiiIlIlIllllIIlIllI, n);
        if (this.IIlIIIIIllIlIIIlIIll) {
            final net.minecraft.IlllllllIIIlIIIlIlII.e ilIlIIIllIllIIIIIllI = illIIlllIIIIlllIIlIl.IlIlIIIllIllIIIIIllI(n);
            this.IlIIIlIlIIIllIlIlIIl = (float)ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll;
            this.IlIlIIIllIllIIIIIllI = (float)ilIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl;
            this.IllIIlllIIIIlllIIlIl = (float)ilIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;
        }
        else if (llllIIIIlIIIlIlllIll3.IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII) {
            float llllIIIIlIIIlIlllIll4 = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(net.minecraft.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(liiiIlIlIllllIIlIllI) * 0.2f, 0.0f, 0.6f);
            if (liiiIlIlIllllIIlIllI instanceof lllIIIIlllllIlIIllIl && ((lllIIIIlllllIlIIllIl)liiiIlIlIllllIIlIllI).llllIIIIlIIIlIlllIll(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll)) {
                llllIIIIlIIIlIlllIll4 = llllIIIIlIIIlIlllIll4 * 0.3f + 0.6f;
            }
            this.IlIIIlIlIIIllIlIlIIl = 0.02f + llllIIIIlIIIlIlllIll4;
            this.IlIlIIIllIllIIIIIllI = 0.02f + llllIIIIlIIIlIlllIll4;
            this.IllIIlllIIIIlllIIlIl = 0.2f + llllIIIIlIIIlIlllIll4;
            final net.minecraft.IlllllllIIIlIIIlIlII.e llllIIIIlIIIlIlllIll5 = net.optifine.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(this.IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl, this.IlIlIIIllIIllIlllllI.lIIIIlIlIllllIIlIllI().IIlllIlIIllIlIlIlIIl, this.IlIlIIIllIIllIlllllI.lIIIIlIlIllllIIlIllI().llIIIlIlIllIIlIlIlII + 1.0, this.IlIlIIIllIIllIlllllI.lIIIIlIlIllllIIlIllI().lllllIlIIIlIlIIlllII);
            if (llllIIIIlIIIlIlllIll5 != null) {
                this.IlIIIlIlIIIllIlIlIIl = (float)llllIIIIlIIIlIlllIll5.llllIIIIlIIIlIlllIll;
                this.IlIlIIIllIllIIIIIllI = (float)llllIIIIlIIIlIlllIll5.IlIlIlIlIlllllllllIl;
                this.IllIIlllIIIIlllIIlIl = (float)llllIIIIlIIIlIlllIll5.llIllIIIIIllIlIIIIlI;
            }
        }
        else if (llllIIIIlIIIlIlllIll3.IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII) {
            this.IlIIIlIlIIIllIlIlIIl = 0.6f;
            this.IlIlIIIllIllIIIIIllI = 0.1f;
            this.IllIIlllIIIIlllIIlIl = 0.0f;
            final net.minecraft.IlllllllIIIlIIIlIlII.e ilIlIlIlIlllllllllIl2 = net.optifine.lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl(this.IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl, this.IlIlIIIllIIllIlllllI.lIIIIlIlIllllIIlIllI().IIlllIlIIllIlIlIlIIl, this.IlIlIIIllIIllIlllllI.lIIIIlIlIllllIIlIllI().llIIIlIlIllIIlIlIlII + 1.0, this.IlIlIIIllIIllIlllllI.lIIIIlIlIllllIIlIllI().lllllIlIIIlIlIIlllII);
            if (ilIlIlIlIlllllllllIl2 != null) {
                this.IlIIIlIlIIIllIlIlIIl = (float)ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll;
                this.IlIlIIIllIllIIIIIllI = (float)ilIlIlIlIlllllllllIl2.IlIlIlIlIlllllllllIl;
                this.IllIIlllIIIIlllIIlIl = (float)ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI;
            }
        }
        final float n12 = this.IlIIlIlIIIlIIlIlIlII + (this.IllIlIIllIllIIlIllII - this.IlIIlIlIIIlIIlIlIlII) * n;
        this.IlIIIlIlIIIllIlIlIIl *= n12;
        this.IlIlIIIllIllIIIIIllI *= n12;
        this.IllIIlllIIIIlllIIlIl *= n12;
        double n13 = (liiiIlIlIllllIIlIllI.IIlIIIlllIllIllIlIII + (liiiIlIlIllllIIlIllI.llIIIlIlIllIIlIlIlII - liiiIlIlIllllIIlIllI.IIlIIIlllIllIllIlIII) * n) * illIIlllIIIIlllIIlIl.IlIllIlIlIIIlIlIlIII.llIIlIIIlIIIllIlIIIl();
        if (liiiIlIlIllllIIlIllI instanceof lllIIIIlllllIlIIllIl && ((lllIIIIlllllIlIIllIl)liiiIlIlIllllIIlIllI).llllIIIIlIIIlIlllIll(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.IIlllIIlIllIllIlIIll)) {
            final int ilIlIlIlIlllllllllIl3 = ((lllIIIIlllllIlIIllIl)liiiIlIlIllllIIlIllI).IlIlIlIlIlllllllllIl(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.IIlllIIlIllIllIlIIll).IlIlIlIlIlllllllllIl();
            if (ilIlIlIlIlllllllllIl3 < 20) {
                n13 *= 1.0f - ilIlIlIlIlllllllllIl3 / 20.0f;
            }
            else {
                n13 = 0.0;
            }
        }
        if (n13 < 1.0) {
            if (n13 < 0.0) {
                n13 = 0.0;
            }
            final double n14 = n13 * n13;
            this.IlIIIlIlIIIllIlIlIIl *= (float)n14;
            this.IlIlIIIllIllIIIIIllI *= (float)n14;
            this.IllIIlllIIIIlllIIlIl *= (float)n14;
        }
        if (this.llIIlllIIlllIIllIllI > 0.0f) {
            final float n15 = this.IIlllIIIlIlllIIlllII + (this.llIIlllIIlllIIllIllI - this.IIlllIIIlIlllIIlllII) * n;
            this.IlIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl * (1.0f - n15) + this.IlIIIlIlIIIllIlIlIIl * 0.7f * n15;
            this.IlIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI * (1.0f - n15) + this.IlIlIIIllIllIIIIIllI * 0.6f * n15;
            this.IllIIlllIIIIlllIIlIl = this.IllIIlllIIIIlllIIlIl * (1.0f - n15) + this.IllIIlllIIIIlllIIlIl * 0.6f * n15;
        }
        if (liiiIlIlIllllIIlIllI instanceof lllIIIIlllllIlIIllIl && ((lllIIIIlllllIlIIllIl)liiiIlIlIllllIIlIllI).llllIIIIlIIIlIlllIll(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl)) {
            final float llllIIIIlIIIlIlllIll6 = this.llllIIIIlIIIlIlllIll((lllIIIIlllllIlIIllIl)liiiIlIlIllllIIlIllI, n);
            float nextAfter = 1.0f / this.IlIIIlIlIIIllIlIlIIl;
            if (nextAfter > 1.0f / this.IlIlIIIllIllIIIIIllI) {
                nextAfter = 1.0f / this.IlIlIIIllIllIIIIIllI;
            }
            if (nextAfter > 1.0f / this.IllIIlllIIIIlllIIlIl) {
                nextAfter = 1.0f / this.IllIIlllIIIIlllIIlIl;
            }
            if (Float.isInfinite(nextAfter)) {
                nextAfter = Math.nextAfter(nextAfter, 0.0);
            }
            this.IlIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl * (1.0f - llllIIIIlIIIlIlllIll6) + this.IlIIIlIlIIIllIlIlIIl * nextAfter * llllIIIIlIIIlIlllIll6;
            this.IlIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI * (1.0f - llllIIIIlIIIlIlllIll6) + this.IlIlIIIllIllIIIIIllI * nextAfter * llllIIIIlIIIlIlllIll6;
            this.IllIIlllIIIIlllIIlIl = this.IllIIlllIIIIlllIIlIl * (1.0f - llllIIIIlIIIlIlllIll6) + this.IllIIlllIIIIlllIIlIl * nextAfter * llllIIIIlIIIlIlllIll6;
        }
        if (this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.IlIlIIIllIllIIIIIllI) {
            final float ilIIIlIlIIIllIlIlIIl = (this.IlIIIlIlIIIllIlIlIIl * 30.0f + this.IlIlIIIllIllIIIIIllI * 59.0f + this.IllIIlllIIIIlllIIlIl * 11.0f) / 100.0f;
            final float ilIlIIIllIllIIIIIllI2 = (this.IlIIIlIlIIIllIlIlIIl * 30.0f + this.IlIlIIIllIllIIIIIllI * 70.0f) / 100.0f;
            final float illIIlllIIIIlllIIlIl2 = (this.IlIIIlIlIIIllIlIlIIl * 30.0f + this.IllIIlllIIIIlllIIlIl * 70.0f) / 100.0f;
            this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
            this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI2;
            this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl2;
        }
        if (net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IIIlIIIlIlIIlllIIlll.llIllIIIIIllIlIIIIlI()) {
            final Object ilIlIlIlIlllllllllIl4 = net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IIIlIIIlIlIIlllIIlll, this, liiiIlIlIllllIIlIllI, llllIIIIlIIIlIlllIll3, n, this.IlIIIlIlIIIllIlIlIIl, this.IlIlIIIllIllIIIIIllI, this.IllIIlllIIIIlllIIlIl);
            net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl4);
            this.IlIIIlIlIIIllIlIlIIl = net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl4, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IlIlIIIlIIlIlIIlllIl, this.IlIIIlIlIIIllIlIlIIl);
            this.IlIlIIIllIllIIIIIllI = net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl4, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IlllllllIIIlIIIlIlII, this.IlIlIIIllIllIIIIIllI);
            this.IllIIlllIIIIlllIIlIl = net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl4, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IIlIIIIlllIlllllIlII, this.IllIIlllIIIIlllIIlIl);
        }
        net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl, this.IlIlIIIllIllIIIIIllI, this.IllIIlllIIIIlllIIlIl, 0.0f);
    }
    
    private void llllIIIIlIIIlIlllIll(final int n, final float n2) {
        this.lIIIlllIIIllIIIllIII = false;
        final llIllIIIIIllIlIIIIlI liiiIlIlIllllIIlIllI = this.IlIlIIIllIIllIlllllI.lIIIIlIlIllllIIlIllI();
        if (liiiIlIlIllllIIlIllI instanceof llllIIIIlIIIlIlllIll) {
            final boolean ilIIIlIlIIIllIlIlIIl = ((llllIIIIlIIIlIlllIll)liiiIlIlIllllIIlIllI).K.IlIIIlIlIIIllIlIlIIl;
        }
        GL11.glFog(2918, this.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl, this.IlIlIIIllIllIIIIIllI, this.IllIIlllIIIIlllIIlIl, 1.0f));
        GL11.glNormal3f(0.0f, -1.0f, 0.0f);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl, liiiIlIlIllllIIlIllI, n2);
        float ilIIIlIlIIIllIlIlIIl2 = -1.0f;
        if (net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.lIIlIIIIIIIlIIlIlIIl.llIllIIIIIllIlIIIIlI()) {
            ilIIIlIlIIIllIlIlIIl2 = net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl(net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.lIIlIIIIIIIlIIlIlIIl, this, liiiIlIlIllllIIlIllI, llllIIIIlIIIlIlllIll, n2, 0.1f);
        }
        if (ilIIIlIlIIIllIlIlIIl2 >= 0.0f) {
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl2);
        }
        else if (liiiIlIlIllllIIlIllI instanceof lllIIIIlllllIlIIllIl && ((llllIIIIlIIIlIlllIll)liiiIlIlIllllIIlIllI).llllIIIIlIIIlIlllIll(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.IIlllIIlIllIllIlIIll)) {
            float n3 = 5.0f;
            final int ilIlIlIlIlllllllllIl = ((llllIIIIlIIIlIlllIll)liiiIlIlIllllIIlIllI).IlIlIlIlIlllllllllIl(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.IIlllIIlIllIllIlIIll).IlIlIlIlIlllllllllIl();
            if (ilIlIlIlIlllllllllIl < 20) {
                n3 = 5.0f + (this.IlIllIlIlIIIlIlIlIII - 5.0f) * (1.0f - ilIlIlIlIlllllllllIl / 20.0f);
            }
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl(9729);
            if (n == -1) {
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f);
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(n3 * 0.8f);
            }
            else {
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(n3 * 0.25f);
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(n3);
            }
            if (GLContext.getCapabilities().GL_NV_fog_distance && net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI()) {
                GL11.glFogi(34138, 34139);
            }
        }
        else if (this.IIlIIIIIllIlIIIlIIll) {
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl(2048);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(0.1f);
        }
        else if (llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII) {
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl(2048);
            final float n4 = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lllllIIllIlIllIllllI() ? 0.02f : 0.1f;
            if (liiiIlIlIllllIIlIllI instanceof lllIIIIlllllIlIIllIl && ((llllIIIIlIIIlIlllIll)liiiIlIlIllllIIlIllI).llllIIIIlIIIlIlllIll(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll)) {
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(0.01f);
            }
            else {
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(0.1f - net.minecraft.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(liiiIlIlIllllIIlIllI) * 0.03f, 0.0f, n4));
            }
        }
        else if (llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII) {
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl(2048);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(2.0f);
        }
        else {
            final float ilIllIlIlIIIlIlIlIII = this.IlIllIlIlIIIlIlIlIII;
            this.lIIIlllIIIllIIIllIII = true;
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl(9729);
            if (n == -1) {
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f);
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(ilIllIlIlIIIlIlIlIII);
            }
            else {
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(ilIllIlIlIIIlIlIlIII * net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII());
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(ilIllIlIlIIIlIlIlIII);
            }
            if (GLContext.getCapabilities().GL_NV_fog_distance) {
                if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI()) {
                    GL11.glFogi(34138, 34139);
                }
                if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll()) {
                    GL11.glFogi(34138, 34140);
                }
            }
            if (this.IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl.IlIllIlIlIIIlIlIlIII.IlIlIlIlIlllllllllIl((int)liiiIlIlIllllIIlIllI.IIlllIlIIllIlIlIlIIl, (int)liiiIlIlIllllIIlIllI.lllllIlIIIlIlIIlllII)) {
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(ilIllIlIlIIIlIlIlIII * 0.05f);
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(ilIllIlIlIIIlIlIlIII);
            }
            if (net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.d.llIllIIIIIllIlIIIIlI()) {
                net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.d, this, liiiIlIlIllllIIlIllI, llllIIIIlIIIlIlllIll, n2, n, ilIllIlIlIIIlIlIlIII);
            }
        }
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIIIllIIllIlllllI();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(1028, 4608);
    }
    
    private FloatBuffer llllIIIIlIIIlIlllIll(final float n, final float n2, final float n3, final float n4) {
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
            net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll(n, n2, n3);
        }
        this.llIlIIIIIlIIlIlIIlll.clear();
        this.llIlIIIIIlIIlIlIIlll.put(n).put(n2).put(n3).put(n4);
        this.llIlIIIIIlIIlIlIIlll.flip();
        return this.llIlIIIIIlIIlIlIIlll;
    }
    
    public e llIIlIIIlIIIllIlIIIl() {
        return this.IIlllIIlIllIllIlIIll;
    }
    
    private void llllIIllllIlIlIIIIll() {
        this.IIlllllIllIllIlIlIII = 0;
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.h() && net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.g()) {
            if (this.IlIlIIIllIIllIlllllI.lIllllllIIllIlIlIlII()) {
                final net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl iIlllIIIlIlllIIlllII = this.IlIlIIIllIIllIlllllI.IIlllIIIlIlllIIlllII();
                if (iIlllIIIlIlllIIlllII != null) {
                    if (!this.IlIlIIIllIIllIlllllI.llIlIIIIIlIIlIlIIlll() && !(this.IlIlIIIllIIllIlllllI.IIIIlllIIIIIIlIIIlll instanceof net.minecraft.client.llIllIIIIIllIlIIIIlI.IIllIIllIIIlIlIIIIlI)) {
                        if (this.lllllIIlIlIIIlIlIIIl > 0) {
                            net.optifine.IllIllIlllIllllIIllI.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll();
                            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll((long)this.lllllIIlIlIIIlIlIIIl);
                            net.optifine.IllIllIlllIllllIIllI.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl();
                            this.IIlllllIllIllIlIlIII = this.lllllIIlIlIIIlIlIIIl;
                        }
                        final long iIlllIIlllIIIlIlllII = System.nanoTime() / 1000000L;
                        if (this.IIlllIIlllIIIlIlllII != 0L && this.IlIIlllllIIllIIlllll != 0) {
                            long n = iIlllIIlllIIIlIlllII - this.IIlllIIlllIIIlIlllII;
                            if (n < 0L) {
                                this.IIlllIIlllIIIlIlllII = iIlllIIlllIIIlIlllII;
                                n = 0L;
                            }
                            if (n >= 50L) {
                                this.IIlllIIlllIIIlIlllII = iIlllIIlllIIIlIlllII;
                                final int llllIllllIllllIlIlII = iIlllIIIlIlllIIlllII.llllIllllIllllIlIlII();
                                int n2 = llllIllllIllllIlIlII - this.IlIIlllllIIllIIlllll;
                                if (n2 < 0) {
                                    this.IlIIlllllIIllIIlllll = llllIllllIllllIlIlII;
                                    n2 = 0;
                                }
                                if (n2 < 1 && this.lllllIIlIlIIIlIlIIIl < 100) {
                                    this.lllllIIlIlIIIlIlIIIl += 2;
                                }
                                if (n2 > 1 && this.lllllIIlIlIIIlIlIIIl > 0) {
                                    --this.lllllIIlIlIIIlIlIIIl;
                                }
                                this.IlIIlllllIIllIIlllll = llllIllllIllllIlIlII;
                            }
                        }
                        else {
                            this.IIlllIIlllIIIlIlllII = iIlllIIlllIIIlIlllII;
                            this.IlIIlllllIIllIIlllll = iIlllIIIlIlllIIlllII.llllIllllIllllIlIlII();
                            this.IIlIlIllllIlllIIIIll = 1.0f;
                            this.llllIllllIllllIlIlII = 50.0f;
                        }
                    }
                    else {
                        if (this.IlIlIIIllIIllIlllllI.IIIIlllIIIIIIlIIIlll instanceof net.minecraft.client.llIllIIIIIllIlIIIIlI.IIllIIllIIIlIlIIIIlI) {
                            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(20L);
                        }
                        this.IIlllIIlllIIIlIlllII = 0L;
                        this.IlIIlllllIIllIIlllll = 0;
                    }
                }
            }
        }
        else {
            this.IIlllIIlllIIIlIlllII = 0L;
            this.IlIIlllllIIllIIlllll = 0;
        }
    }
    
    private void IlIllIlIlIIIlIlIlIII() {
        net.optifine.IllIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll();
        if (!this.lIllIIIIIlllIIlIIllI) {
            net.optifine.lIIIIlIIIIIlllIllIII.IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll();
            net.optifine.util.IlIIIlIIIllllIlIlIlI.llIllIIIIIllIlIIIIlI();
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.s() == 64 && net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.t() == 32) {
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(true);
            }
            this.lIllIIIIIlllIIlIIllI = true;
        }
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.n();
        final net.minecraft.client.IlIlIIIllIllIIIIIllI.llIIlIIIlIIIllIlIIIl illIIlllIIIIlllIIlIl = this.IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl;
        if (illIIlllIIIIlllIIlIl != null) {
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.d() != null) {
                final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl = new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIIIIIIlllIlIllIl(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("of.message.newVersion", "Åòn" + (String.valueOf("HD_U".replace("HD_U", "HD Ultra").replace("L", "Light")) + " " + net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.d()) + "Åòr"));
                ilIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll(new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIIIlIIlIlIIlllIl().llllIIIIlIIIlIlllIll(new net.minecraft.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(net.minecraft.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll, "https://optifine.net/downloads")));
                this.IlIlIIIllIIllIlllllI.lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl().llllIIIIlIIIlIlllIll(ilIlIIIIIIlllIlIllIl);
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl(null);
            }
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.u()) {
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(false);
                this.IlIlIIIllIIllIlllllI.lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl().llllIIIIlIIIlIlllIll(new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIIIIIIlllIlIllIl(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("of.message.java64Bit", new Object[0])));
            }
        }
        if (this.IlIlIIIllIIllIlllllI.IIIIlllIIIIIIlIIIlll instanceof net.minecraft.client.llIllIIIIIllIlIIIIlI.lllIllIIIllllllIllll) {
            this.llllIIIIlIIIlIlllIll((net.minecraft.client.llIllIIIIIllIlIIIIlI.lllIllIIIllllllIllll)this.IlIlIIIllIIllIlllllI.IIIIlllIIIIIIlIIIlll);
        }
        if (this.lIlIIlllIIlIIlIlllIl != illIIlllIIIIlllIIlIl) {
            net.optifine.IlIIllIIllIIllIIlIIl.llllIIIIlIIIlIlllIll(this.lIlIIlllIIlIIlIlllIl, illIIlllIIIIlllIIlIl);
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI();
            this.IIlllIIlllIIIlIlllII = 0L;
            this.IlIIlllllIIllIIlllll = 0;
            this.lIlIIlllIIlIIlIlllIl = illIIlllIIIIlllIIlIl;
        }
        if (!this.llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.cn)) {
            net.optifine.shaders.llIIlllIIlllIIllIllI.cn = 0;
        }
        if (this.IlIlIIIllIIllIlllllI.IIIIlllIIIIIIlIIIlll != null && this.IlIlIIIllIIllIlllllI.IIIIlllIIIIIIlIIIlll.getClass() == net.minecraft.client.llIllIIIIIllIlIIIIlI.llllIIIlIlllIlIIIIIl.class) {
            this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(new net.optifine.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI((net.minecraft.client.llIllIIIIIllIlIIIIlI.llllIIIlIlllIlIIIIIl)this.IlIlIIIllIIllIlllllI.IIIIlllIIIIIIlIIIlll));
        }
    }
    
    private void IIlllIIlIllIllIlIIll() {
        if (this.IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl != null && net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.G() && net.optifine.util.IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("CheckGlErrorFrameFinish", 10000L)) {
            final int llllllIllIllIlIllllI = net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllllIllIllIlIllllI();
            if (llllllIllIllIlIllllI != 0 && net.optifine.IllIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll(llllllIllIllIlIllllI)) {
                this.IlIlIIIllIIllIlllllI.lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl().llllIIIIlIIIlIlllIll(new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIIIIIIlllIlIllIl(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("of.message.openglError", llllllIllIllIlIllllI, net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(llllllIllIllIlIllllI))));
            }
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final net.minecraft.client.llIllIIIIIllIlIIIIlI.lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        try {
            Object o = null;
            final Calendar instance = Calendar.getInstance();
            instance.setTime(new Date());
            final int value = instance.get(5);
            final int n = instance.get(2) + 1;
            if (value == 8 && n == 4) {
                o = "Happy birthday, OptiFine!";
            }
            if (value == 14 && n == 8) {
                o = "Happy birthday, sp614x!";
            }
            if (o == null) {
                return;
            }
            net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.bh, o);
        }
        catch (Throwable t) {}
    }
    
    public boolean llllIIIIlIIIlIlllIll(final int n) {
        if (!net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIIIlllIIIllIIIllIII()) {
            return false;
        }
        if (this.llIIIlIlllIllIIlIllI != null && this.llIIIlIlllIllIIlIllI != this.lIIllIIIllllIlllIllI[2] && this.llIIIlIlllIllIIlIllI != this.lIIllIIIllllIlllIllI[4]) {
            return true;
        }
        if (n != 2 && n != 4) {
            if (this.llIIIlIlllIllIIlIllI == null) {
                return true;
            }
            this.llIIIlIlllIllIIlIllI.llllIIIIlIIIlIlllIll();
            this.llIIIlIlllIllIIlIllI = null;
            return true;
        }
        else {
            if (this.llIIIlIlllIllIIlIllI != null && this.llIIIlIlllIllIIlIllI == this.lIIllIIIllllIlllIllI[n]) {
                return true;
            }
            if (this.IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl == null) {
                return true;
            }
            this.llllIIIIlIIIlIlllIll(new lIllllIllIllIIllllll("shaders/post/fxaa_of_" + n + "x.json"));
            this.lIIllIIIllllIlllIllI[n] = this.llIIIlIlllIllIIlIllI;
            return this.IllIIlllllIIllIIllIl;
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final float n, final net.minecraft.client.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final boolean b) {
        final int n2 = 201435902;
        if (this.IllIlIllIllIlllIIlll) {
            this.IllIlIllIllIlllIIlll = false;
            this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, (double)n, ilIIIlIlIIIllIlIlIIl, b);
            this.IlIlIIIllIIllIlllllI.lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl().llIllIIIIIllIlIIIIlI(n2);
        }
        if (Keyboard.isKeyDown(61) && Keyboard.isKeyDown(38)) {
            if (this.IlIlIIIllIIllIlllllI.IIIIlllIIIIIIlIIIlll != null) {
                return;
            }
            this.IllIlIllIllIlllIIlll = true;
            this.IlIlIIIllIIllIlllllI.lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl().llllIIIIlIIIlIlllIll(new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIIIIIIlllIlIllIl(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("of.message.loadingVisibleChunks", new Object[0])), n2);
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final double n, final net.minecraft.client.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final boolean b) {
        final int u = this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.u;
        final boolean llllIlIllllIIlIIlIlI = this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.llllIlIllllIIlIIlIlI;
        try {
            this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.u = 1000;
            this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.llllIlIllllIIlIIlIlI = false;
            final lllllIIIIIlIlIIIIIIl lIlIIlllIIlIIlIlllIl = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIlIIlllIIlIIlIlllIl();
            int n2 = lIlIIlllIIlIIlIlllIl.IIlllIIlIllIllIlIIll();
            System.currentTimeMillis();
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl("Loading visible chunks");
            long n3 = System.currentTimeMillis() + 5000L;
            int n4 = 0;
            int i;
            do {
                i = 0;
                for (int j = 0; j < 100; ++j) {
                    lIlIIlllIIlIIlIlllIl.IlIIIlIlIIIllIlIlIIl = true;
                    lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, n, ilIIIlIlIIIllIlIlIIl, this.lIIIIlIIIIIlllIllIII++, b);
                    if (!lIlIIlllIIlIIlIlllIl.llIllIlIIIIllIlIIllI()) {
                        i = 1;
                    }
                    final int n5 = n4 + lIlIIlllIIlIIlIlllIl.lllIIIIlllllIlIIllIl();
                    while (!lIlIIlllIIlIIlIlllIl.llIllIlIIIIllIlIIllI()) {
                        lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll(System.nanoTime() + 1000000000L);
                    }
                    n4 = n5 - lIlIIlllIIlIIlIlllIl.lllIIIIlllllIlIIllIl();
                    if (i == 0) {
                        break;
                    }
                }
                if (lIlIIlllIIlIIlIlllIl.IIlllIIlIllIllIlIIll() != n2) {
                    i = 1;
                    n2 = lIlIIlllIIlIIlIlllIl.IIlllIIlIllIllIlIIll();
                }
                if (System.currentTimeMillis() > n3) {
                    net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI("Chunks loaded: " + n4);
                    n3 = System.currentTimeMillis() + 5000L;
                }
            } while (i != 0);
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI("Chunks loaded: " + n4);
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI("Finished loading visible chunks");
            net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl.IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll = 0;
        }
        finally {
            this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.u = u;
            this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.llllIlIllllIIlIIlIlI = llllIlIllllIIlIIlIlI;
        }
        this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.u = u;
        this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll.llllIlIllllIIlIIlIlI = llllIlIllllIIlIIlIlI;
    }
}
