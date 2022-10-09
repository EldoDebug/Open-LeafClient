package net.minecraft.client.llIllIlIIIIllIlIIllI;

import com.google.gson.*;
import net.minecraft.client.*;
import org.apache.logging.log4j.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.client.llllIIIIlIIIlIlllIll.*;
import org.apache.commons.lang3.*;
import net.optifine.util.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import org.lwjgl.input.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.client.IlIlIIIllIIllIlllllI.*;
import java.lang.reflect.*;
import org.apache.commons.io.*;
import net.optifine.lIIIIlIIIIIlllIllIII.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;
import com.google.common.collect.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.optifine.*;
import java.io.*;
import net.optifine.shaders.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;

public class llllIIIIlIIIlIlllIll
{
    private static final Logger az;
    private static final Gson aA;
    private static final ParameterizedType aB;
    private static final String[] aC;
    private static final String[] aD;
    private static final String[] aE;
    private static final String[] aF;
    private static final String[] aG;
    private static final String[] aH;
    private static final String[] aI;
    private static final String[] aJ;
    public float llllIIIIlIIIlIlllIll;
    public boolean IlIlIlIlIlllllllllIl;
    public int llIllIIIIIllIlIIIIlI;
    public boolean IlIIIlIlIIIllIlIlIIl;
    public boolean IlIlIIIllIllIIIIIllI;
    public boolean IllIIlllIIIIlllIIlIl;
    public int llllIIIlIlllIlIIIIIl;
    public int lIIIIlIIIIIlllIllIII;
    public boolean lIIIlllIIIllIIIllIII;
    public int llIIlIIIlIIIllIlIIIl;
    public List llIllIlIIIIllIlIIllI;
    public List lIlIlIIIllIIllIIIllI;
    public IlIlIlIlIlllllllllIl IlIlIIIllIIllIlllllI;
    public boolean IIIIlllIIIIIIlIIIlll;
    public boolean llllIIllllIlIlIIIIll;
    public boolean IlIllIlIlIIIlIlIlIII;
    public float IIlllIIlIllIllIlIIll;
    public boolean lllIIIIlllllIlIIllIl;
    public boolean IlIlIIIIIIlllIlIllIl;
    public boolean IIllIIllIIIlIlIIIIlI;
    public boolean IIIlIIIlIlIIlllIIlll;
    public boolean IlIlIIIlIIlIlIIlllIl;
    public boolean IlllllllIIIlIIIlIlII;
    public boolean IIlIIIIlllIlllllIlII;
    public boolean IIIlIIlIIIIlllIlllII;
    public boolean IlIlIllllllllIIIIlII;
    private final Set aK;
    public boolean IIlllIlIIllIlIlIlIIl;
    public int llIIIlIlIllIIlIlIlII;
    public int lllllIlIIIlIlIIlllII;
    public boolean lIllllllIIllIlIlIlII;
    public float llIIlllIIlllIIllIllI;
    public float IIlllIIIlIlllIIlllII;
    public float IIlIIIIIllIlIIIlIIll;
    public float llllllIllIllIlIllllI;
    public boolean IIIllllllIllIIIlllIl;
    public int IlIIIlIIIllllIlIlIlI;
    private Map aL;
    public float IIIIIllIIIIlIIIIllIl;
    public float IIIIIIIIIlllIllIlIlI;
    public float IIllllIIIlIIIIIIllIl;
    public float IlllIIIIlIIIlIlIlIIl;
    public float lllIllIIIllllllIllll;
    public int llIllIlIlIIIIIIIllII;
    public boolean IIlIlIlIIlIllIIIIIIl;
    public String IllIllIIIIlIIlIlllII;
    public int IlIllllIIlIIlIlIlIll;
    public int IllIllIlllIllllIIllI;
    public int llIlIIIIIlIIlIlIIlll;
    public boolean IlIIlIlIIIlIIlIlIlII;
    public boolean IllIlIIllIllIIlIllII;
    public boolean lIIlIIIlIllIlIllIIIl;
    public IlIIIlIlIIIllIlIlIIl IIlIIIlllIllIllIlIII;
    public IlIIIlIlIIIllIlIlIIl lIlIlIlllIIlIlIlllIl;
    public IlIIIlIlIIIllIlIlIIl llIIIIIIlIllIIlIIIll;
    public IlIIIlIlIIIllIlIlIIl lIIIIlIlIllllIIlIllI;
    public IlIIIlIlIIIllIlIlIIl llIIIlIlllIllIIlIllI;
    public IlIIIlIlIIIllIlIlIIl IlIIllIIllIIllIIlIIl;
    public IlIIIlIlIIIllIlIlIIl lllllIIIIIlIlIIIIIIl;
    public IlIIIlIlIIIllIlIlIIl IllIIlllllIIllIIllIl;
    public IlIIIlIlIIIllIlIlIIl lIllIIIIIlllIIlIIllI;
    public IlIIIlIlIIIllIlIlIIl lIlIIlllIIlIIlIlllIl;
    public IlIIIlIlIIIllIlIlIIl llIIIllIlIllIllIIIIl;
    public IlIIIlIlIIIllIlIlIIl IIIllIIIlIlIIllIIIlI;
    public IlIIIlIlIIIllIlIlIIl IIlllIIlllIIIlIlllII;
    public IlIIIlIlIIIllIlIlIIl IlIIlllllIIllIIlllll;
    public IlIIIlIlIIIllIlIlIIl lllllIIlIlIIIlIlIIIl;
    public IlIIIlIlIIIllIlIlIIl IIlllllIllIllIlIlIII;
    public IlIIIlIlIIIllIlIlIIl llllIllllIllllIlIlII;
    public IlIIIlIlIIIllIlIlIIl IIlIlIllllIlllIIIIll;
    public IlIIIlIlIIIllIlIlIIl lIIllIIIllllIlllIllI;
    public IlIIIlIlIIIllIlIlIIl IllIlIllIllIlllIIlll;
    public IlIIIlIlIIIllIlIlIIl IIllIIIlIIlIlIlIIIII;
    public IlIIIlIlIIIllIlIlIIl llIllIIlllllllllllll;
    public IlIIIlIlIIIllIlIlIIl lllllIIllIlIllIllllI;
    public IlIIIlIlIIIllIlIlIIl IlIIIIIlIIllIIlIlIll;
    public IlIIIlIlIIIllIlIlIIl[] IllllIIlIlIllIIIllII;
    public IlIIIlIlIIIllIlIlIIl[] lllllIIIIIlIIlllIlIl;
    protected Minecraft IlIllllIIIlIllIlIIll;
    private File aM;
    public IllIIlllIIIIlllIIlIl lIIIIIlIlIIIlIIIIlIl;
    public boolean IIllIIIlIIIIlIIlIIII;
    public int IIIllIIllIIIIIIlIIlI;
    public boolean IIIIIIIllllIlIIIIIII;
    public boolean IIlllIIIllIllIIlIlIl;
    public boolean llIlllIlllllIIllIIII;
    public String lllllIlIlIlllIlllIlI;
    public boolean IlIllllIIlIllIlIlIll;
    public boolean lllIlIIIIIlIlllllIlI;
    public float llIlIIIIllIlIIlIlIII;
    public float IIIIIlllIlIIIIIIIllI;
    public float llllllIIIIIIIlllIIll;
    public int IIlIlllIlIlllIlIllll;
    public int lIllllIllIllIIllllll;
    public String lllIIIIlIlIllIIlIIIl;
    public boolean IllIlllIllIIIIllllII;
    public int lIllIlIIIllllllIIlII;
    public float IlIllIIllIIlIIIIlIIl;
    public int lIIlllIlllllIIlllIll;
    public boolean lIllIIlIlIlllllIIIII;
    public boolean lIIlIIIIIIIlIIlIlIIl;
    public boolean IlIIlllIIlIlllllIIlI;
    public boolean llllIlIllllIIlIIlIlI;
    public boolean a;
    public boolean b;
    public float c;
    public int d;
    public int e;
    public int f;
    public float g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public int t;
    public int u;
    public boolean v;
    public int w;
    public boolean x;
    public boolean y;
    public String z;
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public int N;
    public boolean O;
    public boolean P;
    public int Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public int U;
    public int V;
    public int W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public boolean aa;
    public boolean ab;
    public boolean ac;
    public boolean ad;
    public boolean ae;
    public boolean af;
    public boolean ag;
    public boolean ah;
    public boolean ai;
    public boolean aj;
    public boolean ak;
    public boolean al;
    public static final int am = 0;
    public static final int an = 1;
    public static final int ao = 2;
    public static final int ap = 3;
    public static final int aq = 4;
    public static final int ar = 0;
    public static final int as = 1;
    public static final int at = 2;
    public static final String au = "Default";
    private static final int[] aN;
    private static final int[] aO;
    private static final String[] aP;
    public IlIIIlIlIIIllIlIlIIl av;
    private File aQ;
    public IlIIIlIlIIIllIlIlIIl aw;
    public IlIIIlIlIIIllIlIlIIl ax;
    public IlIIIlIlIIIllIlIlIIl ay;
    private static volatile /* synthetic */ int[] aR;
    
    static {
        az = LogManager.getLogger();
        aA = new Gson();
        aB = new net.minecraft.client.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl();
        aC = new String[] { "options.guiScale.auto", "options.guiScale.small", "options.guiScale.normal", "options.guiScale.large" };
        aD = new String[] { "options.particles.all", "options.particles.decreased", "options.particles.minimal" };
        aE = new String[] { "options.ao.off", "options.ao.min", "options.ao.max" };
        aF = new String[] { "options.stream.compression.low", "options.stream.compression.medium", "options.stream.compression.high" };
        aG = new String[] { "options.stream.chat.enabled.streaming", "options.stream.chat.enabled.always", "options.stream.chat.enabled.never" };
        aH = new String[] { "options.stream.chat.userFilter.all", "options.stream.chat.userFilter.subs", "options.stream.chat.userFilter.mods" };
        aI = new String[] { "options.stream.mic_toggle.mute", "options.stream.mic_toggle.talk" };
        aJ = new String[] { "options.off", "options.graphics.fast", "options.graphics.fancy" };
        aN = new int[] { 0, 1, 4, 2 };
        aO = new int[] { 3, 1, 2 };
        aP = new String[] { "options.off", "options.graphics.fast", "options.graphics.fancy" };
    }
    
    public llllIIIIlIIIlIlllIll(final Minecraft ilIllllIIIlIllIlIIll, final File file) {
        this.llllIIIIlIIIlIlllIll = 0.5f;
        this.llIllIIIIIllIlIIIIlI = -1;
        this.IlIIIlIlIIIllIlIlIIl = true;
        this.IllIIlllIIIIlllIIlIl = true;
        this.llllIIIlIlllIlIIIIIl = 120;
        this.lIIIIlIIIIIlllIllIII = 2;
        this.lIIIlllIIIllIIIllIII = true;
        this.llIIlIIIlIIIllIlIIIl = 2;
        this.llIllIlIIIIllIlIIllI = Lists.newArrayList();
        this.lIlIlIIIllIIllIIIllI = Lists.newArrayList();
        this.IlIlIIIllIIllIlllllI = net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;
        this.IIIIlllIIIIIIlIIIlll = true;
        this.llllIIllllIlIlIIIIll = true;
        this.IlIllIlIlIIIlIlIlIII = true;
        this.IIlllIIlIllIllIlIIll = 1.0f;
        this.lllIIIIlllllIlIIllIl = true;
        this.IIllIIllIIIlIlIIIIlI = true;
        this.IIIlIIIlIlIIlllIIlll = false;
        this.IlIlIIIlIIlIlIIlllIl = true;
        this.IlllllllIIIlIIIlIlII = false;
        this.IlIlIllllllllIIIIlII = true;
        this.aK = Sets.newHashSet((Object[])net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.values());
        this.lIllllllIIllIlIlIlII = true;
        this.llIIlllIIlllIIllIllI = 1.0f;
        this.IIlllIIIlIlllIIlllII = 1.0f;
        this.IIlIIIIIllIlIIIlIIll = 0.44366196f;
        this.llllllIllIllIlIllllI = 1.0f;
        this.IIIllllllIllIIIlllIl = true;
        this.IlIIIlIIIllllIlIlIlI = 4;
        this.aL = Maps.newEnumMap((Class)IlIlIIIllIIllIlllllI.class);
        this.IIIIIllIIIIlIIIIllIl = 0.5f;
        this.IIIIIIIIIlllIllIlIlI = 1.0f;
        this.IIllllIIIlIIIIIIllIl = 1.0f;
        this.IlllIIIIlIIIlIlIlIIl = 0.5412844f;
        this.lllIllIIIllllllIllll = 0.31690142f;
        this.llIllIlIlIIIIIIIllII = 1;
        this.IIlIlIlIIlIllIIIIIIl = true;
        this.IllIllIIIIlIIlIlllII = "";
        this.IlIllllIIlIIlIlIlIll = 0;
        this.IllIllIlllIllllIIllI = 0;
        this.llIlIIIIIlIIlIlIIlll = 0;
        this.IlIIlIlIIIlIIlIlIlII = true;
        this.IllIlIIllIllIIlIllII = true;
        this.lIIlIIIlIllIlIllIIIl = true;
        this.IIlIIIlllIllIllIlIII = new IlIIIlIlIIIllIlIlIIl("key.forward", 17, "key.categories.movement");
        this.lIlIlIlllIIlIlIlllIl = new IlIIIlIlIIIllIlIlIIl("key.left", 30, "key.categories.movement");
        this.llIIIIIIlIllIIlIIIll = new IlIIIlIlIIIllIlIlIIl("key.back", 31, "key.categories.movement");
        this.lIIIIlIlIllllIIlIllI = new IlIIIlIlIIIllIlIlIIl("key.right", 32, "key.categories.movement");
        this.llIIIlIlllIllIIlIllI = new IlIIIlIlIIIllIlIlIIl("key.jump", 57, "key.categories.movement");
        this.IlIIllIIllIIllIIlIIl = new IlIIIlIlIIIllIlIlIIl("key.sneak", 42, "key.categories.movement");
        this.lllllIIIIIlIlIIIIIIl = new IlIIIlIlIIIllIlIlIIl("key.sprint", 29, "key.categories.movement");
        this.IllIIlllllIIllIIllIl = new IlIIIlIlIIIllIlIlIIl("key.inventory", 18, "key.categories.inventory");
        this.lIllIIIIIlllIIlIIllI = new IlIIIlIlIIIllIlIlIIl("key.use", -99, "key.categories.gameplay");
        this.lIlIIlllIIlIIlIlllIl = new IlIIIlIlIIIllIlIlIIl("key.drop", 16, "key.categories.gameplay");
        this.llIIIllIlIllIllIIIIl = new IlIIIlIlIIIllIlIlIIl("key.attack", -100, "key.categories.gameplay");
        this.IIIllIIIlIlIIllIIIlI = new IlIIIlIlIIIllIlIlIIl("key.pickItem", -98, "key.categories.gameplay");
        this.IIlllIIlllIIIlIlllII = new IlIIIlIlIIIllIlIlIIl("key.chat", 20, "key.categories.multiplayer");
        this.IlIIlllllIIllIIlllll = new IlIIIlIlIIIllIlIlIIl("key.playerlist", 15, "key.categories.multiplayer");
        this.lllllIIlIlIIIlIlIIIl = new IlIIIlIlIIIllIlIlIIl("key.command", 53, "key.categories.multiplayer");
        this.IIlllllIllIllIlIlIII = new IlIIIlIlIIIllIlIlIIl("key.screenshot", 60, "key.categories.misc");
        this.llllIllllIllllIlIlII = new IlIIIlIlIIIllIlIlIIl("key.togglePerspective", 63, "key.categories.misc");
        this.IIlIlIllllIlllIIIIll = new IlIIIlIlIIIllIlIlIIl("key.smoothCamera", 0, "key.categories.misc");
        this.lIIllIIIllllIlllIllI = new IlIIIlIlIIIllIlIlIIl("key.fullscreen", 87, "key.categories.misc");
        this.IllIlIllIllIlllIIlll = new IlIIIlIlIIIllIlIlIIl("key.spectatorOutlines", 0, "key.categories.misc");
        this.IIllIIIlIIlIlIlIIIII = new IlIIIlIlIIIllIlIlIIl("key.streamStartStop", 64, "key.categories.stream");
        this.llIllIIlllllllllllll = new IlIIIlIlIIIllIlIlIIl("key.streamPauseUnpause", 65, "key.categories.stream");
        this.lllllIIllIlIllIllllI = new IlIIIlIlIIIllIlIlIIl("key.streamCommercial", 0, "key.categories.stream");
        this.IlIIIIIlIIllIIlIlIll = new IlIIIlIlIIIllIlIlIIl("key.streamToggleMic", 0, "key.categories.stream");
        this.IllllIIlIlIllIIIllII = new IlIIIlIlIIIllIlIlIIl[] { new IlIIIlIlIIIllIlIlIIl("key.hotbar.1", 2, "key.categories.inventory"), new IlIIIlIlIIIllIlIlIIl("key.hotbar.2", 3, "key.categories.inventory"), new IlIIIlIlIIIllIlIlIIl("key.hotbar.3", 4, "key.categories.inventory"), new IlIIIlIlIIIllIlIlIIl("key.hotbar.4", 5, "key.categories.inventory"), new IlIIIlIlIIIllIlIlIIl("key.hotbar.5", 6, "key.categories.inventory"), new IlIIIlIlIIIllIlIlIIl("key.hotbar.6", 7, "key.categories.inventory"), new IlIIIlIlIIIllIlIlIIl("key.hotbar.7", 8, "key.categories.inventory"), new IlIIIlIlIIIllIlIlIIl("key.hotbar.8", 9, "key.categories.inventory"), new IlIIIlIlIIIllIlIlIIl("key.hotbar.9", 10, "key.categories.inventory") };
        this.lIllIlIIIllllllIIlII = 1;
        this.IlIllIIllIIlIIIIlIIl = 0.8f;
        this.lIIlllIlllllIIlllIll = 0;
        this.lIllIIlIlIlllllIIIII = false;
        this.lIIlIIIIIIIlIIlIlIIl = false;
        this.IlIIlllIIlIlllllIIlI = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.g();
        this.llllIlIllllIIlIIlIlI = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.g();
        this.a = false;
        this.b = false;
        this.c = 1.0f;
        this.d = 0;
        this.e = 1;
        this.f = 0;
        this.g = 0.0f;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.k = 3;
        this.l = 4000;
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = true;
        this.q = true;
        this.r = true;
        this.s = true;
        this.t = 0;
        this.u = 1;
        this.v = false;
        this.w = 0;
        this.x = false;
        this.y = false;
        this.z = "Default";
        this.A = true;
        this.B = true;
        this.C = true;
        this.D = true;
        this.E = true;
        this.F = true;
        this.G = true;
        this.H = 2;
        this.I = true;
        this.J = false;
        this.K = true;
        this.L = false;
        this.M = false;
        this.N = 0;
        this.O = true;
        this.P = true;
        this.Q = 3;
        this.R = true;
        this.S = true;
        this.T = true;
        this.U = 1;
        this.V = 0;
        this.W = 0;
        this.X = true;
        this.Y = true;
        this.Z = true;
        this.aa = true;
        this.ab = true;
        this.ac = true;
        this.ad = true;
        this.ae = true;
        this.af = true;
        this.ag = true;
        this.ah = true;
        this.ai = true;
        this.aj = true;
        this.ak = true;
        this.al = true;
        this.aw = new IlIIIlIlIIIllIlIlIIl("Setting GUI", 54, "LeafClient");
        this.ax = new IlIIIlIlIIIllIlIlIIl("Toggle Freelook", 28, "LeafClient");
        this.ay = new IlIIIlIlIIIllIlIlIIl("Toggle Sprinting", 29, "LeafClient");
        this.lllllIIIIIlIIlllIlIl = (IlIIIlIlIIIllIlIlIIl[])ArrayUtils.addAll((Object[])new IlIIIlIlIIIllIlIlIIl[] { this.llIIIllIlIllIllIIIIl, this.lIllIIIIIlllIIlIIllI, this.IIlIIIlllIllIllIlIII, this.lIlIlIlllIIlIlIlllIl, this.llIIIIIIlIllIIlIIIll, this.lIIIIlIlIllllIIlIllI, this.llIIIlIlllIllIIlIllI, this.IlIIllIIllIIllIIlIIl, this.lllllIIIIIlIlIIIIIIl, this.lIlIIlllIIlIIlIlllIl, this.IllIIlllllIIllIIllIl, this.IIlllIIlllIIIlIlllII, this.IlIIlllllIIllIIlllll, this.IIIllIIIlIlIIllIIIlI, this.lllllIIlIlIIIlIlIIIl, this.IIlllllIllIllIlIlIII, this.llllIllllIllllIlIlII, this.IIlIlIllllIlllIIIIll, this.IIllIIIlIIlIlIlIIIII, this.llIllIIlllllllllllll, this.lllllIIllIlIllIllllI, this.IlIIIIIlIIllIIlIlIll, this.lIIllIIIllllIlllIllI, this.IllIlIllIllIlllIIlll, this.aw, this.ay, this.ax }, (Object[])this.IllllIIlIlIllIIIllII);
        this.lIIIIIlIlIIIlIIIIlIl = net.minecraft.IIIlIIlIIIIlllIlllII.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI;
        this.lllllIlIlIlllIlllIlI = "";
        this.llIlIIIIllIlIIlIlIII = 70.0f;
        this.lllIIIIlIlIllIIlIIIl = "en_US";
        this.IllIlllIllIIIIllllII = false;
        this.IlIllllIIIlIllIlIIll = ilIllllIIIlIllIlIIll;
        this.aM = new File(file, "options.txt");
        if (ilIllllIIIlIllIlIIll.IllIllIlllIllllIIllI() && Runtime.getRuntime().maxMemory() >= 1000000000L) {
            net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(32.0f);
            final long n = 1000000L;
            if (Runtime.getRuntime().maxMemory() >= 1500L * n) {
                net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(48.0f);
            }
            if (Runtime.getRuntime().maxMemory() >= 2500L * n) {
                net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(64.0f);
            }
        }
        else {
            net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(16.0f);
        }
        this.llIllIIIIIllIlIIIIlI = (ilIllllIIIlIllIlIIll.IllIllIlllIllllIIllI() ? 12 : 8);
        this.aQ = new File(file, "optionsof.txt");
        this.llllIIIlIlllIlIIIIIl = (int)net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI();
        this.av = new IlIIIlIlIIIllIlIlIIl("of.key.zoom", 46, "key.categories.misc");
        net.optifine.util.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll(this.lllllIIIIIlIIlllIlIl = (IlIIIlIlIIIllIlIlIIl[])ArrayUtils.add((Object[])this.lllllIIIIIlIIlllIlIl, (Object)this.av), new IlIIIlIlIIIllIlIlIIl[] { this.av });
        this.llIllIIIIIllIlIIIIlI = 8;
        this.llllIIIIlIIIlIlllIll();
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this);
    }
    
    public llllIIIIlIIIlIlllIll() {
        this.llllIIIIlIIIlIlllIll = 0.5f;
        this.llIllIIIIIllIlIIIIlI = -1;
        this.IlIIIlIlIIIllIlIlIIl = true;
        this.IllIIlllIIIIlllIIlIl = true;
        this.llllIIIlIlllIlIIIIIl = 120;
        this.lIIIIlIIIIIlllIllIII = 2;
        this.lIIIlllIIIllIIIllIII = true;
        this.llIIlIIIlIIIllIlIIIl = 2;
        this.llIllIlIIIIllIlIIllI = Lists.newArrayList();
        this.lIlIlIIIllIIllIIIllI = Lists.newArrayList();
        this.IlIlIIIllIIllIlllllI = net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;
        this.IIIIlllIIIIIIlIIIlll = true;
        this.llllIIllllIlIlIIIIll = true;
        this.IlIllIlIlIIIlIlIlIII = true;
        this.IIlllIIlIllIllIlIIll = 1.0f;
        this.lllIIIIlllllIlIIllIl = true;
        this.IIllIIllIIIlIlIIIIlI = true;
        this.IIIlIIIlIlIIlllIIlll = false;
        this.IlIlIIIlIIlIlIIlllIl = true;
        this.IlllllllIIIlIIIlIlII = false;
        this.IlIlIllllllllIIIIlII = true;
        this.aK = Sets.newHashSet((Object[])net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.values());
        this.lIllllllIIllIlIlIlII = true;
        this.llIIlllIIlllIIllIllI = 1.0f;
        this.IIlllIIIlIlllIIlllII = 1.0f;
        this.IIlIIIIIllIlIIIlIIll = 0.44366196f;
        this.llllllIllIllIlIllllI = 1.0f;
        this.IIIllllllIllIIIlllIl = true;
        this.IlIIIlIIIllllIlIlIlI = 4;
        this.aL = Maps.newEnumMap((Class)IlIlIIIllIIllIlllllI.class);
        this.IIIIIllIIIIlIIIIllIl = 0.5f;
        this.IIIIIIIIIlllIllIlIlI = 1.0f;
        this.IIllllIIIlIIIIIIllIl = 1.0f;
        this.IlllIIIIlIIIlIlIlIIl = 0.5412844f;
        this.lllIllIIIllllllIllll = 0.31690142f;
        this.llIllIlIlIIIIIIIllII = 1;
        this.IIlIlIlIIlIllIIIIIIl = true;
        this.IllIllIIIIlIIlIlllII = "";
        this.IlIllllIIlIIlIlIlIll = 0;
        this.IllIllIlllIllllIIllI = 0;
        this.llIlIIIIIlIIlIlIIlll = 0;
        this.IlIIlIlIIIlIIlIlIlII = true;
        this.IllIlIIllIllIIlIllII = true;
        this.lIIlIIIlIllIlIllIIIl = true;
        this.IIlIIIlllIllIllIlIII = new IlIIIlIlIIIllIlIlIIl("key.forward", 17, "key.categories.movement");
        this.lIlIlIlllIIlIlIlllIl = new IlIIIlIlIIIllIlIlIIl("key.left", 30, "key.categories.movement");
        this.llIIIIIIlIllIIlIIIll = new IlIIIlIlIIIllIlIlIIl("key.back", 31, "key.categories.movement");
        this.lIIIIlIlIllllIIlIllI = new IlIIIlIlIIIllIlIlIIl("key.right", 32, "key.categories.movement");
        this.llIIIlIlllIllIIlIllI = new IlIIIlIlIIIllIlIlIIl("key.jump", 57, "key.categories.movement");
        this.IlIIllIIllIIllIIlIIl = new IlIIIlIlIIIllIlIlIIl("key.sneak", 42, "key.categories.movement");
        this.lllllIIIIIlIlIIIIIIl = new IlIIIlIlIIIllIlIlIIl("key.sprint", 29, "key.categories.movement");
        this.IllIIlllllIIllIIllIl = new IlIIIlIlIIIllIlIlIIl("key.inventory", 18, "key.categories.inventory");
        this.lIllIIIIIlllIIlIIllI = new IlIIIlIlIIIllIlIlIIl("key.use", -99, "key.categories.gameplay");
        this.lIlIIlllIIlIIlIlllIl = new IlIIIlIlIIIllIlIlIIl("key.drop", 16, "key.categories.gameplay");
        this.llIIIllIlIllIllIIIIl = new IlIIIlIlIIIllIlIlIIl("key.attack", -100, "key.categories.gameplay");
        this.IIIllIIIlIlIIllIIIlI = new IlIIIlIlIIIllIlIlIIl("key.pickItem", -98, "key.categories.gameplay");
        this.IIlllIIlllIIIlIlllII = new IlIIIlIlIIIllIlIlIIl("key.chat", 20, "key.categories.multiplayer");
        this.IlIIlllllIIllIIlllll = new IlIIIlIlIIIllIlIlIIl("key.playerlist", 15, "key.categories.multiplayer");
        this.lllllIIlIlIIIlIlIIIl = new IlIIIlIlIIIllIlIlIIl("key.command", 53, "key.categories.multiplayer");
        this.IIlllllIllIllIlIlIII = new IlIIIlIlIIIllIlIlIIl("key.screenshot", 60, "key.categories.misc");
        this.llllIllllIllllIlIlII = new IlIIIlIlIIIllIlIlIIl("key.togglePerspective", 63, "key.categories.misc");
        this.IIlIlIllllIlllIIIIll = new IlIIIlIlIIIllIlIlIIl("key.smoothCamera", 0, "key.categories.misc");
        this.lIIllIIIllllIlllIllI = new IlIIIlIlIIIllIlIlIIl("key.fullscreen", 87, "key.categories.misc");
        this.IllIlIllIllIlllIIlll = new IlIIIlIlIIIllIlIlIIl("key.spectatorOutlines", 0, "key.categories.misc");
        this.IIllIIIlIIlIlIlIIIII = new IlIIIlIlIIIllIlIlIIl("key.streamStartStop", 64, "key.categories.stream");
        this.llIllIIlllllllllllll = new IlIIIlIlIIIllIlIlIIl("key.streamPauseUnpause", 65, "key.categories.stream");
        this.lllllIIllIlIllIllllI = new IlIIIlIlIIIllIlIlIIl("key.streamCommercial", 0, "key.categories.stream");
        this.IlIIIIIlIIllIIlIlIll = new IlIIIlIlIIIllIlIlIIl("key.streamToggleMic", 0, "key.categories.stream");
        this.IllllIIlIlIllIIIllII = new IlIIIlIlIIIllIlIlIIl[] { new IlIIIlIlIIIllIlIlIIl("key.hotbar.1", 2, "key.categories.inventory"), new IlIIIlIlIIIllIlIlIIl("key.hotbar.2", 3, "key.categories.inventory"), new IlIIIlIlIIIllIlIlIIl("key.hotbar.3", 4, "key.categories.inventory"), new IlIIIlIlIIIllIlIlIIl("key.hotbar.4", 5, "key.categories.inventory"), new IlIIIlIlIIIllIlIlIIl("key.hotbar.5", 6, "key.categories.inventory"), new IlIIIlIlIIIllIlIlIIl("key.hotbar.6", 7, "key.categories.inventory"), new IlIIIlIlIIIllIlIlIIl("key.hotbar.7", 8, "key.categories.inventory"), new IlIIIlIlIIIllIlIlIIl("key.hotbar.8", 9, "key.categories.inventory"), new IlIIIlIlIIIllIlIlIIl("key.hotbar.9", 10, "key.categories.inventory") };
        this.lIllIlIIIllllllIIlII = 1;
        this.IlIllIIllIIlIIIIlIIl = 0.8f;
        this.lIIlllIlllllIIlllIll = 0;
        this.lIllIIlIlIlllllIIIII = false;
        this.lIIlIIIIIIIlIIlIlIIl = false;
        this.IlIIlllIIlIlllllIIlI = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.g();
        this.llllIlIllllIIlIIlIlI = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.g();
        this.a = false;
        this.b = false;
        this.c = 1.0f;
        this.d = 0;
        this.e = 1;
        this.f = 0;
        this.g = 0.0f;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.k = 3;
        this.l = 4000;
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = true;
        this.q = true;
        this.r = true;
        this.s = true;
        this.t = 0;
        this.u = 1;
        this.v = false;
        this.w = 0;
        this.x = false;
        this.y = false;
        this.z = "Default";
        this.A = true;
        this.B = true;
        this.C = true;
        this.D = true;
        this.E = true;
        this.F = true;
        this.G = true;
        this.H = 2;
        this.I = true;
        this.J = false;
        this.K = true;
        this.L = false;
        this.M = false;
        this.N = 0;
        this.O = true;
        this.P = true;
        this.Q = 3;
        this.R = true;
        this.S = true;
        this.T = true;
        this.U = 1;
        this.V = 0;
        this.W = 0;
        this.X = true;
        this.Y = true;
        this.Z = true;
        this.aa = true;
        this.ab = true;
        this.ac = true;
        this.ad = true;
        this.ae = true;
        this.af = true;
        this.ag = true;
        this.ah = true;
        this.ai = true;
        this.aj = true;
        this.ak = true;
        this.al = true;
        this.aw = new IlIIIlIlIIIllIlIlIIl("Setting GUI", 54, "LeafClient");
        this.ax = new IlIIIlIlIIIllIlIlIIl("Toggle Freelook", 28, "LeafClient");
        this.ay = new IlIIIlIlIIIllIlIlIIl("Toggle Sprinting", 29, "LeafClient");
        this.lllllIIIIIlIIlllIlIl = (IlIIIlIlIIIllIlIlIIl[])ArrayUtils.addAll((Object[])new IlIIIlIlIIIllIlIlIIl[] { this.llIIIllIlIllIllIIIIl, this.lIllIIIIIlllIIlIIllI, this.IIlIIIlllIllIllIlIII, this.lIlIlIlllIIlIlIlllIl, this.llIIIIIIlIllIIlIIIll, this.lIIIIlIlIllllIIlIllI, this.llIIIlIlllIllIIlIllI, this.IlIIllIIllIIllIIlIIl, this.lllllIIIIIlIlIIIIIIl, this.lIlIIlllIIlIIlIlllIl, this.IllIIlllllIIllIIllIl, this.IIlllIIlllIIIlIlllII, this.IlIIlllllIIllIIlllll, this.IIIllIIIlIlIIllIIIlI, this.lllllIIlIlIIIlIlIIIl, this.IIlllllIllIllIlIlIII, this.llllIllllIllllIlIlII, this.IIlIlIllllIlllIIIIll, this.IIllIIIlIIlIlIlIIIII, this.llIllIIlllllllllllll, this.lllllIIllIlIllIllllI, this.IlIIIIIlIIllIIlIlIll, this.lIIllIIIllllIlllIllI, this.IllIlIllIllIlllIIlll, this.aw, this.ay, this.ax }, (Object[])this.IllllIIlIlIllIIIllII);
        this.lIIIIIlIlIIIlIIIIlIl = net.minecraft.IIIlIIlIIIIlllIlllII.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI;
        this.lllllIlIlIlllIlllIlI = "";
        this.llIlIIIIllIlIIlIlIII = 70.0f;
        this.lllIIIIlIlIllIIlIIIl = "en_US";
        this.IllIlllIllIIIIllllII = false;
    }
    
    public static String llllIIIIlIIIlIlllIll(final int n) {
        return (n < 0) ? llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("key.mouseButton", n + 101) : ((n < 256) ? Keyboard.getKeyName(n) : String.format("%c", (char)(n - 256)).toUpperCase());
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        return ilIIIlIlIIIllIlIlIIl.lIIIlllIIIllIIIllIII() != 0 && ((ilIIIlIlIIIllIlIlIIl.lIIIlllIIIllIIIllIII() < 0) ? Mouse.isButtonDown(ilIIIlIlIIIllIlIlIIl.lIIIlllIIIllIIIllIII() + 100) : Keyboard.isKeyDown(ilIIIlIlIIIllIlIlIIl.lIIIlllIIIllIIIllIII()));
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final int n) {
        ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(n);
        this.IlIlIlIlIlllllllllIl();
    }
    
    public void llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final float lllIllIIIllllllIllll) {
        this.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI, lllIllIIIllllllIllll);
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl) {
            this.llllIIIIlIIIlIlllIll = lllIllIIIllllllIllll;
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI) {
            this.llIlIIIIllIlIIlIlIII = lllIllIIIllllllIllll;
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl) {
            this.IIIIIlllIlIIIIIIIllI = lllIllIIIllllllIllll;
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII) {
            this.llllIIIlIlllIlIIIIIl = (int)lllIllIIIllllllIllll;
            this.IIllIIllIIIlIlIIIIlI = false;
            if (this.llllIIIlIlllIlIIIIIl <= 0) {
                this.llllIIIlIlllIlIIIIIl = (int)llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI();
                this.IIllIIllIIIlIlIIIIlI = true;
            }
            this.llIIlIIIlIIIllIlIIIl();
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IlIlIIIIIIlllIlIllIl) {
            this.IIlllIIlIllIllIlIIll = lllIllIIIllllllIllll;
            this.IlIllllIIIlIllIlIIll.lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl().IlIlIlIlIlllllllllIl();
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII) {
            this.llllllIllIllIlIllllI = lllIllIIIllllllIllll;
            this.IlIllllIIIlIllIlIIll.lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl().IlIlIlIlIlllllllllIl();
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII) {
            this.IIlIIIIIllIlIIIlIIll = lllIllIIIllllllIllll;
            this.IlIllllIIIlIllIlIIll.lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl().IlIlIlIlIlllllllllIl();
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl) {
            this.IIlllIIIlIlllIIlllII = lllIllIIIllllllIllll;
            this.IlIllllIIIlIllIlIIll.lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl().IlIlIlIlIlllllllllIl();
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IlIlIllllllllIIIIlII) {
            this.llIIlllIIlllIIllIllI = lllIllIIIllllllIllll;
            this.IlIllllIIIlIllIlIIll.lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl().IlIlIlIlIlllllllllIl();
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.lIllllllIIllIlIlIlII) {
            final int ilIIIlIIIllllIlIlIlI = this.IlIIIlIIIllllIlIlIlI;
            this.IlIIIlIIIllllIlIlIlI = (int)lllIllIIIllllllIllll;
            if (ilIIIlIIIllllIlIlIlI != lllIllIIIllllllIllll) {
                this.IlIllllIIIlIllIlIIll.IlIllllIIlIIlIlIlIll().llllIIIIlIIIlIlllIll(this.IlIIIlIIIllllIlIlIlI);
                this.IlIllllIIIlIllIlIIll.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl);
                this.IlIllllIIIlIllIlIIll.IlIllllIIlIIlIlIlIll().llllIIIIlIIIlIlllIll(false, this.IlIIIlIIIllllIlIlIlI > 0);
                this.IlIllllIIIlIllIlIIll.IlIlIllllllllIIIIlII();
            }
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.llIllIlIlIIIIIIIllII) {
            this.IlIlIIIlIIlIlIIlllIl = !this.IlIlIIIlIIlIlIIlllIl;
            this.IlIllllIIIlIllIlIIll.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl();
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl) {
            this.llIllIIIIIllIlIIIIlI = (int)lllIllIIIllllllIllll;
            this.IlIllllIIIlIllIlIIll.llllIIIlIlllIlIIIIIl.llIIlIIIlIIIllIlIIIl();
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IIlllIIIlIlllIIlllII) {
            this.IIIIIllIIIIlIIIIllIl = lllIllIIIllllllIllll;
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IIlIIIIIllIlIIIlIIll) {
            this.IIIIIIIIIlllIllIlIlI = lllIllIIIllllllIllll;
            this.IlIllllIIIlIllIlIIll.lIIlIIIlIllIlIllIIIl().IlIllIlIlIIIlIlIlIII();
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.llllllIllIllIlIllllI) {
            this.IIllllIIIlIIIIIIllIl = lllIllIIIllllllIllll;
            this.IlIllllIIIlIllIlIIll.lIIlIIIlIllIlIllIIIl().IlIllIlIlIIIlIlIlIII();
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IIIllllllIllIIIlllIl) {
            this.IlllIIIIlIIIlIlIlIIl = lllIllIIIllllllIllll;
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IlIIIlIIIllllIlIlIlI) {
            this.lllIllIIIllllllIllll = lllIllIIIllllllIllll;
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final int n) {
        this.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI, n);
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll) {
            this.IlIlIlIlIlllllllllIl = !this.IlIlIlIlIlllllllllIl;
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IIIIlllIIIIIIlIIIlll) {
            this.IIlIlllIlIlllIlIllll += n;
            if (net.minecraft.client.llIllIIIIIllIlIIIIlI.lIIllIIIllllIlllIllI.llllIIllllIlIlIIIIll()) {
                this.IIlIlllIlIlllIlIllll = 0;
            }
            final DisplayMode ilIllllIIlIllIlIlIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIllllIIlIllIlIlIll();
            final int min = Math.min(ilIllllIIlIllIlIlIll.getWidth() / 320, ilIllllIIlIllIlIlIll.getHeight() / 240);
            if (this.IIlIlllIlIlllIlIllll < 0) {
                this.IIlIlllIlIlllIlIllll = min - 1;
            }
            if (this.IlIllllIIIlIllIlIIll.IlIIIlIlIIIllIlIlIIl() && this.IIlIlllIlIlllIlIllll % 2 != 0) {
                this.IIlIlllIlIlllIlIllll += n;
            }
            if (this.IIlIlllIlIlllIlIllll < 0 || this.IIlIlllIlIlllIlIllll >= min) {
                this.IIlIlllIlIlllIlIllll = 0;
            }
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.llllIIllllIlIlIIIIll) {
            this.lIllllIllIllIIllllll = (this.lIllllIllIllIIllllll + n) % 3;
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.llllIIIlIlllIlIIIIIl) {
            this.IlIIIlIlIIIllIlIlIIl = !this.IlIIIlIlIIIllIlIlIIl;
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.llIllIlIIIIllIlIIllI) {
            this.lIIIIlIIIIIlllIllIII = (this.lIIIIlIIIIIlllIllIII + n) % 3;
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.llIIlllIIlllIIllIllI) {
            this.IllIlllIllIIIIllllII = !this.IllIlllIllIIIIllllII;
            this.IlIllllIIIlIllIlIIll.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(this.IlIllllIIIlIllIlIIll.IllIllIIIIlIIlIlllII().llllIIIIlIIIlIlllIll() || this.IllIlllIllIIIIllllII);
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl) {
            this.IllIIlllIIIIlllIIlIl = !this.IllIIlllIIIIlllIIlIl;
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII) {
            if (!this.IlIlIIIllIllIIIIIllI && net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(net.optifine.IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll("of.message.an.shaders1"), net.optifine.IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll("of.message.an.shaders2"));
                return;
            }
            this.IlIlIIIllIllIIIIIllI = !this.IlIlIIIllIllIIIIIllI;
            this.IlIllllIIIlIllIlIIll.IlIlIIIllIllIIIIIllI();
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.lIlIlIIIllIIllIIIllI) {
            this.lIIIlllIIIllIIIllIII = !this.lIIIlllIIIllIIIllIII;
            this.lIlIlIIIllIIllIIIllI();
            this.IlIllllIIIlIllIlIIll.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl();
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IlIlIIIllIIllIlllllI) {
            this.llIIlIIIlIIIllIlIIIl = (this.llIIlIIIlIIIllIlIIIl + n) % 3;
            this.IlIllllIIIlIllIlIIll.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl();
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IlIllIlIlIIIlIlIlIII) {
            this.IlIlIIIllIIllIlllllI = net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll((this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll() + n) % 3);
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IIIIIllIIIIlIIIIllIl) {
            this.llIllIlIlIIIIIIIllII = (this.llIllIlIlIIIIIIIllII + n) % 3;
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IIIIIIIIIlllIllIlIlI) {
            this.IIlIlIlIIlIllIIIIIIl = !this.IIlIlIlIIlIllIIIIIIl;
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IIllllIIIlIIIIIIllIl) {
            this.IlIllllIIlIIlIlIlIll = (this.IlIllllIIlIIlIlIlIll + n) % 3;
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IlllIIIIlIIIlIlIlIIl) {
            this.IllIllIlllIllllIIllI = (this.IllIllIlllIllllIIllI + n) % 3;
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.lllIllIIIllllllIllll) {
            this.llIlIIIIIlIIlIlIIlll = (this.llIlIIIIIlIIlIlIIlll + n) % 2;
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IIlllIIlIllIllIlIIll) {
            this.IIIIlllIIIIIIlIIIlll = !this.IIIIlllIIIIIIlIIIlll;
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.lllIIIIlllllIlIIllIl) {
            this.llllIIllllIlIlIIIIll = !this.llllIIllllIlIlIIIIll;
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IIllIIllIIIlIlIIIIlI) {
            this.IlIllIlIlIIIlIlIlIII = !this.IlIllIlIlIIIlIlIlIII;
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IIIlIIIlIlIIlllIIlll) {
            this.lllIIIIlllllIlIIllIl = !this.lllIIIIlllllIlIIllIl;
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IIIlIIlIIIIlllIlllII) {
            this.IIlllIlIIllIlIlIlIIl = !this.IIlllIlIIllIlIlIlIIl;
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IlIlIIIlIIlIlIIlllIl) {
            this.IlIlIIIIIIlllIlIllIl = !this.IlIlIIIIIIlllIlIllIl;
            if (this.IlIllllIIIlIllIlIIll.IlIIIlIIIllllIlIlIlI() != this.IlIlIIIIIIlllIlIllIl) {
                this.IlIllllIIIlIllIlIIll.IIlllIIlIllIllIlIIll();
            }
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IlllllllIIIlIIIlIlII) {
            Display.setVSyncEnabled(this.IIllIIllIIIlIlIIIIlI = !this.IIllIIllIIIlIlIIIIlI);
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IIlIIIIlllIlllllIlII) {
            this.IIIlIIIlIlIIlllIIlll = !this.IIIlIIIlIlIIlllIIlll;
            this.IlIllllIIIlIllIlIIll.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl();
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.llIllIlIlIIIIIIIllII) {
            this.IlIlIIIlIIlIlIIlllIl = !this.IlIlIIIlIIlIlIIlllIl;
            this.IlIllllIIIlIllIlIIll.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl();
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IIlIlIlIIlIllIIIIIIl) {
            this.IlllllllIIIlIIIlIlII = !this.IlllllllIIIlIIIlIlII;
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IllIllIIIIlIIlIlllII) {
            this.IllIlIIllIllIIlIllII = !this.IllIlIIllIllIIlIllII;
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IlIllllIIlIIlIlIlIll) {
            this.lIIlIIIlIllIlIllIIIl = !this.lIIlIIIlIllIlIllIIIl;
        }
        this.IlIlIlIlIlllllllllIl();
    }
    
    public float llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        final float ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl(llIllIIIIIllIlIIIIlI);
        return (ilIIIlIlIIIllIlIlIIl != Float.MAX_VALUE) ? ilIIIlIlIIIllIlIlIIl : ((llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI) ? this.llIlIIIIllIlIIlIlIII : ((llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl) ? this.IIIIIlllIlIIIIIIIllI : ((llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI) ? this.llllllIIIIIIIlllIIll : ((llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl) ? this.llllIIIIlIIIlIlllIll : ((llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IlIlIIIIIIlllIlIllIl) ? this.IIlllIIlIllIllIlIIll : ((llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII) ? this.llllllIllIllIlIllllI : ((llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII) ? this.IIlIIIIIllIlIIIlIIll : ((llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IlIlIllllllllIIIIlII) ? this.llIIlllIIlllIIllIllI : ((llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl) ? this.IIlllIIIlIlllIIlllII : ((llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII) ? ((float)this.llllIIIlIlllIlIIIIIl) : ((llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.lIllllllIIllIlIlIlII) ? ((float)this.IlIIIlIIIllllIlIlIlI) : ((llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl) ? ((float)this.llIllIIIIIllIlIIIIlI) : ((llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IIlllIIIlIlllIIlllII) ? this.IIIIIllIIIIlIIIIllIl : ((llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IIlIIIIIllIlIIIlIIll) ? this.IIIIIIIIIlllIllIlIlI : ((llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.llllllIllIllIlIllllI) ? this.IIllllIIIlIIIIIIllIl : ((llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IIIllllllIllIIIlllIl) ? this.IlllIIIIlIIIlIlIlIIl : ((llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IlIIIlIIIllllIlIlIlI) ? this.lllIllIIIllllllIllll : 0.0f)))))))))))))))));
    }
    
    public boolean IlIlIlIlIlllllllllIl(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        switch (llIllIlIIIIllIlIIllI()[llIllIIIIIllIlIIIIlI.ordinal()]) {
            case 1: {
                return this.IlIlIlIlIlllllllllIl;
            }
            case 7: {
                return this.IlIIIlIlIIIllIlIlIIl;
            }
            case 8: {
                return this.IlIlIIIllIllIIIIIllI;
            }
            case 10: {
                return this.IllIIlllIIIIlllIIlIl;
            }
            case 17: {
                return this.IIIIlllIIIIIIlIIIlll;
            }
            case 18: {
                return this.llllIIllllIlIlIIIIll;
            }
            case 20: {
                return this.IlIllIlIlIIIlIlIlIII;
            }
            case 21: {
                return this.lllIIIIlllllIlIIllIl;
            }
            case 22: {
                return this.IlIlIIIIIIlllIlIllIl;
            }
            case 23: {
                return this.IIllIIllIIIlIlIIIIlI;
            }
            case 24: {
                return this.IIIlIIIlIlIIlllIIlll;
            }
            case 25: {
                return this.IIlllIlIIllIlIlIlIIl;
            }
            case 38: {
                return this.IIlIlIlIIlIllIIIIIIl;
            }
            case 31: {
                return this.IllIlllIllIIIIllllII;
            }
            case 42: {
                return this.IlIlIIIlIIlIlIIlllIl;
            }
            case 43: {
                return this.IlllllllIIIlIIIlIlII;
            }
            case 44: {
                return this.IllIlIIllIllIIlIllII;
            }
            case 45: {
                return this.lIIlIIIlIllIlIllIIIl;
            }
            default: {
                return false;
            }
        }
    }
    
    private static String llllIIIIlIIIlIlllIll(final String[] array, int n) {
        if (n < 0 || n >= array.length) {
            n = 0;
        }
        return llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(array[n], new Object[0]);
    }
    
    public String llIllIIIIIllIlIIIIlI(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        final String ilIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI(llIllIIIIIllIlIIIIlI);
        if (ilIlIIIllIllIIIIIllI != null) {
            return ilIlIIIllIllIIIIIllI;
        }
        final String string = String.valueOf(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl(), new Object[0])) + ": ";
        if (llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll()) {
            final float llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI);
            final float ilIlIlIlIlllllllllIl = llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
            return (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.lIllllllIIllIlIlIlII && llllIIIIlIIIlIlllIll >= 4.0) ? (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll("of.general.max")) : ((llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl) ? ((ilIlIlIlIlllllllllIl == 0.0f) ? (String.valueOf(string) + net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("options.sensitivity.min", new Object[0])) : ((ilIlIlIlIlllllllllIl == 1.0f) ? (String.valueOf(string) + net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("options.sensitivity.max", new Object[0])) : (String.valueOf(string) + (int)(ilIlIlIlIlllllllllIl * 200.0f) + "%"))) : ((llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI) ? ((llllIIIIlIIIlIlllIll == 70.0f) ? (String.valueOf(string) + net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("options.fov.min", new Object[0])) : ((llllIIIIlIIIlIlllIll == 110.0f) ? (String.valueOf(string) + net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("options.fov.max", new Object[0])) : (String.valueOf(string) + (int)llllIIIIlIIIlIlllIll))) : ((llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII) ? ((llllIIIIlIIIlIlllIll == llIllIIIIIllIlIIIIlI.w) ? (String.valueOf(string) + net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("options.framerateLimit.max", new Object[0])) : (String.valueOf(string) + (int)llllIIIIlIIIlIlllIll + " fps")) : ((llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.llIllIlIIIIllIlIIllI) ? ((llllIIIIlIIIlIlllIll == llIllIIIIIllIlIIIIlI.v) ? (String.valueOf(string) + net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("options.cloudHeight.min", new Object[0])) : (String.valueOf(string) + ((int)llllIIIIlIIIlIlllIll + 128))) : ((llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl) ? ((ilIlIlIlIlllllllllIl == 0.0f) ? (String.valueOf(string) + net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("options.gamma.min", new Object[0])) : ((ilIlIlIlIlllllllllIl == 1.0f) ? (String.valueOf(string) + net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("options.gamma.max", new Object[0])) : (String.valueOf(string) + "+" + (int)(ilIlIlIlIlllllllllIl * 100.0f) + "%"))) : ((llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI) ? (String.valueOf(string) + (int)(ilIlIlIlIlllllllllIl * 400.0f) + "%") : ((llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IlIlIIIIIIlllIlIllIl) ? (String.valueOf(string) + (int)(ilIlIlIlIlllllllllIl * 90.0f + 10.0f) + "%") : ((llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII) ? (String.valueOf(string) + net.minecraft.client.llIllIIIIIllIlIIIIlI.IllIllIlllIllllIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl) + "px") : ((llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII) ? (String.valueOf(string) + net.minecraft.client.llIllIIIIIllIlIIIIlI.IllIllIlllIllllIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl) + "px") : ((llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl) ? (String.valueOf(string) + net.minecraft.client.llIllIIIIIllIlIIIIlI.IllIllIlllIllllIIllI.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl) + "px") : ((llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl) ? (String.valueOf(string) + (int)llllIIIIlIIIlIlllIll + " chunks") : ((llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.lIllllllIIllIlIlIlII) ? ((llllIIIIlIIIlIlllIll == 0.0f) ? (String.valueOf(string) + net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("options.off", new Object[0])) : (String.valueOf(string) + (int)llllIIIIlIIIlIlllIll)) : ((llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IlIIIlIIIllllIlIlIlI) ? (String.valueOf(string) + net.minecraft.client.IlIlIIIllIIllIlllllI.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl) + " fps") : ((llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IIIllllllIllIIIlllIl) ? (String.valueOf(string) + net.minecraft.client.IlIlIIIllIIllIlllllI.IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl) + " Kbps") : ((llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IIlllIIIlIlllIIlllII) ? (String.valueOf(string) + String.format("%.3f bpp", net.minecraft.client.IlIlIIIllIIllIlllllI.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl))) : ((ilIlIlIlIlllllllllIl == 0.0f) ? (String.valueOf(string) + net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("options.off", new Object[0])) : (String.valueOf(string) + (int)(ilIlIlIlIlllllllllIl * 100.0f) + "%")))))))))))))))));
        }
        if (llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()) {
            return this.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI) ? (String.valueOf(string) + net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("options.on", new Object[0])) : (String.valueOf(string) + net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("options.off", new Object[0]));
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IIIIlllIIIIIIlIIIlll) {
            return (this.IIlIlllIlIlllIlIllll >= net.minecraft.client.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.aC.length) ? (String.valueOf(string) + this.IIlIlllIlIlllIlIllll + "x") : (String.valueOf(string) + llllIIIIlIIIlIlllIll(net.minecraft.client.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.aC, this.IIlIlllIlIlllIlIllll));
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IlIllIlIlIIIlIlIlIII) {
            return String.valueOf(string) + net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(this.IlIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl(), new Object[0]);
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.llllIIllllIlIlIIIIll) {
            return String.valueOf(string) + llllIIIIlIIIlIlllIll(net.minecraft.client.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.aD, this.lIllllIllIllIIllllll);
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IlIlIIIllIIllIlllllI) {
            return String.valueOf(string) + llllIIIIlIIIlIlllIll(net.minecraft.client.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.aE, this.llIIlIIIlIIIllIlIIIl);
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IIIIIllIIIIlIIIIllIl) {
            return String.valueOf(string) + llllIIIIlIIIlIlllIll(net.minecraft.client.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.aF, this.llIllIlIlIIIIIIIllII);
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IIllllIIIlIIIIIIllIl) {
            return String.valueOf(string) + llllIIIIlIIIlIlllIll(net.minecraft.client.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.aG, this.IlIllllIIlIIlIlIlIll);
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IlllIIIIlIIIlIlIlIIl) {
            return String.valueOf(string) + llllIIIIlIIIlIlllIll(net.minecraft.client.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.aH, this.IllIllIlllIllllIIllI);
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.lllIllIIIllllllIllll) {
            return String.valueOf(string) + llllIIIIlIIIlIlllIll(net.minecraft.client.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.aI, this.llIlIIIIIlIIlIlIIlll);
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.llIllIlIIIIllIlIIllI) {
            return String.valueOf(string) + llllIIIIlIIIlIlllIll(net.minecraft.client.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.aI, this.lIIIIlIIIIIlllIllIII);
        }
        if (llIllIIIIIllIlIIIIlI != llIllIIIIIllIlIIIIlI.lIlIlIIIllIIllIIIllI) {
            return string;
        }
        if (this.lIIIlllIIIllIIIllIII) {
            return String.valueOf(string) + net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("options.graphics.fancy", new Object[0]);
        }
        return String.valueOf(string) + net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("options.graphics.fast", new Object[0]);
    }
    
    public void llllIIIIlIIIlIlllIll() {
        InputStream inputStream = null;
        Label_2160: {
            try {
                if (this.aM.exists()) {
                    final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream = new FileInputStream(this.aM)));
                    this.aL.clear();
                    String line;
                    while ((line = bufferedReader.readLine()) != null) {
                        try {
                            final String[] split = line.split(":");
                            if (split[0].equals("mouseSensitivity")) {
                                this.llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(split[1]);
                            }
                            if (split[0].equals("fov")) {
                                this.llIlIIIIllIlIIlIlIII = this.llllIIIIlIIIlIlllIll(split[1]) * 40.0f + 70.0f;
                            }
                            if (split[0].equals("gamma")) {
                                this.IIIIIlllIlIIIIIIIllI = this.llllIIIIlIIIlIlllIll(split[1]);
                            }
                            if (split[0].equals("saturation")) {
                                this.llllllIIIIIIIlllIIll = this.llllIIIIlIIIlIlllIll(split[1]);
                            }
                            if (split[0].equals("invertYMouse")) {
                                this.IlIlIlIlIlllllllllIl = split[1].equals("true");
                            }
                            if (split[0].equals("renderDistance")) {
                                this.llIllIIIIIllIlIIIIlI = Integer.parseInt(split[1]);
                            }
                            if (split[0].equals("guiScale")) {
                                this.IIlIlllIlIlllIlIllll = Integer.parseInt(split[1]);
                            }
                            if (split[0].equals("particles")) {
                                this.lIllllIllIllIIllllll = Integer.parseInt(split[1]);
                            }
                            if (split[0].equals("bobView")) {
                                this.IlIIIlIlIIIllIlIlIIl = split[1].equals("true");
                            }
                            if (split[0].equals("anaglyph3d")) {
                                this.IlIlIIIllIllIIIIIllI = split[1].equals("true");
                            }
                            if (split[0].equals("maxFps")) {
                                this.llllIIIlIlllIlIIIIIl = Integer.parseInt(split[1]);
                                if (this.IIllIIllIIIlIlIIIIlI) {
                                    this.llllIIIlIlllIlIIIIIl = (int)net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI();
                                }
                                if (this.llllIIIlIlllIlIIIIIl <= 0) {
                                    this.llllIIIlIlllIlIIIIIl = (int)net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI();
                                }
                            }
                            if (split[0].equals("fboEnable")) {
                                this.IllIIlllIIIIlllIIlIl = split[1].equals("true");
                            }
                            if (split[0].equals("difficulty")) {
                                this.lIIIIIlIlIIIlIIIIlIl = net.minecraft.IIIlIIlIIIIlllIlllII.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(Integer.parseInt(split[1]));
                            }
                            if (split[0].equals("fancyGraphics")) {
                                this.lIIIlllIIIllIIIllIII = split[1].equals("true");
                                this.lIlIlIIIllIIllIIIllI();
                            }
                            if (split[0].equals("ao")) {
                                if (split[1].equals("true")) {
                                    this.llIIlIIIlIIIllIlIIIl = 2;
                                }
                                else if (split[1].equals("false")) {
                                    this.llIIlIIIlIIIllIlIIIl = 0;
                                }
                                else {
                                    this.llIIlIIIlIIIllIlIIIl = Integer.parseInt(split[1]);
                                }
                            }
                            if (split[0].equals("renderClouds")) {
                                if (split[1].equals("true")) {
                                    this.lIIIIlIIIIIlllIllIII = 2;
                                }
                                else if (split[1].equals("false")) {
                                    this.lIIIIlIIIIIlllIllIII = 0;
                                }
                                else if (split[1].equals("fast")) {
                                    this.lIIIIlIIIIIlllIllIII = 1;
                                }
                            }
                            if (split[0].equals("resourcePacks")) {
                                this.llIllIlIIIIllIlIIllI = (List)net.minecraft.client.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.aA.fromJson(line.substring(line.indexOf(58) + 1), (Type)net.minecraft.client.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.aB);
                                if (this.llIllIlIIIIllIlIIllI == null) {
                                    this.llIllIlIIIIllIlIIllI = Lists.newArrayList();
                                }
                            }
                            if (split[0].equals("incompatibleResourcePacks")) {
                                this.lIlIlIIIllIIllIIIllI = (List)net.minecraft.client.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.aA.fromJson(line.substring(line.indexOf(58) + 1), (Type)net.minecraft.client.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.aB);
                                if (this.lIlIlIIIllIIllIIIllI == null) {
                                    this.lIlIlIIIllIIllIIIllI = Lists.newArrayList();
                                }
                            }
                            if (split[0].equals("lastServer") && split.length >= 2) {
                                this.lllllIlIlIlllIlllIlI = line.substring(line.indexOf(58) + 1);
                            }
                            if (split[0].equals("lang") && split.length >= 2) {
                                this.lllIIIIlIlIllIIlIIIl = split[1];
                            }
                            if (split[0].equals("chatVisibility")) {
                                this.IlIlIIIllIIllIlllllI = net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(Integer.parseInt(split[1]));
                            }
                            if (split[0].equals("chatColors")) {
                                this.IIIIlllIIIIIIlIIIlll = split[1].equals("true");
                            }
                            if (split[0].equals("chatLinks")) {
                                this.llllIIllllIlIlIIIIll = split[1].equals("true");
                            }
                            if (split[0].equals("chatLinksPrompt")) {
                                this.IlIllIlIlIIIlIlIlIII = split[1].equals("true");
                            }
                            if (split[0].equals("chatOpacity")) {
                                this.IIlllIIlIllIllIlIIll = this.llllIIIIlIIIlIlllIll(split[1]);
                            }
                            if (split[0].equals("snooperEnabled")) {
                                this.lllIIIIlllllIlIIllIl = split[1].equals("true");
                            }
                            if (split[0].equals("fullscreen")) {
                                this.IlIlIIIIIIlllIlIllIl = split[1].equals("true");
                            }
                            if (split[0].equals("enableVsync")) {
                                this.IIllIIllIIIlIlIIIIlI = split[1].equals("true");
                                if (this.IIllIIllIIIlIlIIIIlI) {
                                    this.llllIIIlIlllIlIIIIIl = (int)net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI();
                                }
                                this.llIIlIIIlIIIllIlIIIl();
                            }
                            if (split[0].equals("useVbo")) {
                                this.IIIlIIIlIlIIlllIIlll = split[1].equals("true");
                            }
                            if (split[0].equals("hideServerAddress")) {
                                this.IIlIIIIlllIlllllIlII = split[1].equals("true");
                            }
                            if (split[0].equals("advancedItemTooltips")) {
                                this.IIIlIIlIIIIlllIlllII = split[1].equals("true");
                            }
                            if (split[0].equals("pauseOnLostFocus")) {
                                this.IlIlIllllllllIIIIlII = split[1].equals("true");
                            }
                            if (split[0].equals("touchscreen")) {
                                this.IIlllIlIIllIlIlIlIIl = split[1].equals("true");
                            }
                            if (split[0].equals("overrideHeight")) {
                                this.lllllIlIIIlIlIIlllII = Integer.parseInt(split[1]);
                            }
                            if (split[0].equals("overrideWidth")) {
                                this.llIIIlIlIllIIlIlIlII = Integer.parseInt(split[1]);
                            }
                            if (split[0].equals("heldItemTooltips")) {
                                this.lIllllllIIllIlIlIlII = split[1].equals("true");
                            }
                            if (split[0].equals("chatHeightFocused")) {
                                this.llllllIllIllIlIllllI = this.llllIIIIlIIIlIlllIll(split[1]);
                            }
                            if (split[0].equals("chatHeightUnfocused")) {
                                this.IIlIIIIIllIlIIIlIIll = this.llllIIIIlIIIlIlllIll(split[1]);
                            }
                            if (split[0].equals("chatScale")) {
                                this.llIIlllIIlllIIllIllI = this.llllIIIIlIIIlIlllIll(split[1]);
                            }
                            if (split[0].equals("chatWidth")) {
                                this.IIlllIIIlIlllIIlllII = this.llllIIIIlIIIlIlllIll(split[1]);
                            }
                            if (split[0].equals("showInventoryAchievementHint")) {
                                this.IIIllllllIllIIIlllIl = split[1].equals("true");
                            }
                            if (split[0].equals("mipmapLevels")) {
                                this.IlIIIlIIIllllIlIlIlI = Integer.parseInt(split[1]);
                            }
                            if (split[0].equals("streamBytesPerPixel")) {
                                this.IIIIIllIIIIlIIIIllIl = this.llllIIIIlIIIlIlllIll(split[1]);
                            }
                            if (split[0].equals("streamMicVolume")) {
                                this.IIIIIIIIIlllIllIlIlI = this.llllIIIIlIIIlIlllIll(split[1]);
                            }
                            if (split[0].equals("streamSystemVolume")) {
                                this.IIllllIIIlIIIIIIllIl = this.llllIIIIlIIIlIlllIll(split[1]);
                            }
                            if (split[0].equals("streamKbps")) {
                                this.IlllIIIIlIIIlIlIlIIl = this.llllIIIIlIIIlIlllIll(split[1]);
                            }
                            if (split[0].equals("streamFps")) {
                                this.lllIllIIIllllllIllll = this.llllIIIIlIIIlIlllIll(split[1]);
                            }
                            if (split[0].equals("streamCompression")) {
                                this.llIllIlIlIIIIIIIllII = Integer.parseInt(split[1]);
                            }
                            if (split[0].equals("streamSendMetadata")) {
                                this.IIlIlIlIIlIllIIIIIIl = split[1].equals("true");
                            }
                            if (split[0].equals("streamPreferredServer") && split.length >= 2) {
                                this.IllIllIIIIlIIlIlllII = line.substring(line.indexOf(58) + 1);
                            }
                            if (split[0].equals("streamChatEnabled")) {
                                this.IlIllllIIlIIlIlIlIll = Integer.parseInt(split[1]);
                            }
                            if (split[0].equals("streamChatUserFilter")) {
                                this.IllIllIlllIllllIIllI = Integer.parseInt(split[1]);
                            }
                            if (split[0].equals("streamMicToggleBehavior")) {
                                this.llIlIIIIIlIIlIlIIlll = Integer.parseInt(split[1]);
                            }
                            if (split[0].equals("forceUnicodeFont")) {
                                this.IllIlllIllIIIIllllII = split[1].equals("true");
                            }
                            if (split[0].equals("allowBlockAlternatives")) {
                                this.IlIlIIIlIIlIlIIlllIl = split[1].equals("true");
                            }
                            if (split[0].equals("reducedDebugInfo")) {
                                this.IlllllllIIIlIIIlIlII = split[1].equals("true");
                            }
                            if (split[0].equals("useNativeTransport")) {
                                this.IlIIlIlIIIlIIlIlIlII = split[1].equals("true");
                            }
                            if (split[0].equals("entityShadows")) {
                                this.IllIlIIllIllIIlIllII = split[1].equals("true");
                            }
                            if (split[0].equals("realmsNotifications")) {
                                this.lIIlIIIlIllIlIllIIIl = split[1].equals("true");
                            }
                            IlIIIlIlIIIllIlIlIIl[] lllllIIIIIlIIlllIlIl;
                            for (int length = (lllllIIIIIlIIlllIlIl = this.lllllIIIIIlIIlllIlIl).length, i = 0; i < length; ++i) {
                                final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = lllllIIIIIlIIlllIlIl[i];
                                if (split[0].equals("key_" + ilIIIlIlIIIllIlIlIIl.llllIIIlIlllIlIIIIIl())) {
                                    ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(Integer.parseInt(split[1]));
                                }
                            }
                            IlIlIIIllIIllIlllllI[] values;
                            for (int length2 = (values = net.minecraft.client.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI.values()).length, j = 0; j < length2; ++j) {
                                final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI = values[j];
                                if (split[0].equals("soundCategory_" + ilIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll())) {
                                    this.aL.put(ilIlIIIllIIllIlllllI, this.llllIIIIlIIIlIlllIll(split[1]));
                                }
                            }
                            IlIlIIIllIllIIIIIllI[] values2;
                            for (int length3 = (values2 = net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.values()).length, k = 0; k < length3; ++k) {
                                final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI = values2[k];
                                if (split[0].equals("modelPart_" + ilIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI())) {
                                    this.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, split[1].equals("true"));
                                }
                            }
                        }
                        catch (Exception ex) {
                            net.minecraft.client.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.az.warn("Skipping bad option: " + line);
                            ex.printStackTrace();
                        }
                    }
                    net.minecraft.client.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl();
                    bufferedReader.close();
                    break Label_2160;
                }
            }
            catch (Exception ex2) {
                net.minecraft.client.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.az.error("Failed to load options", (Throwable)ex2);
                break Label_2160;
            }
            finally {
                IOUtils.closeQuietly(inputStream);
            }
            IOUtils.closeQuietly(inputStream);
            return;
        }
        this.llllIIIlIlllIlIIIIIl();
    }
    
    private float llllIIIIlIIIlIlllIll(final String s) {
        return s.equals("true") ? 1.0f : (s.equals("false") ? 0.0f : Float.parseFloat(s));
    }
    
    public void IlIlIlIlIlllllllllIl() {
        if (net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IIIllllllIllIIIlllIl.llIllIIIIIllIlIIIIlI()) {
            final Object llllIIIlIlllIlIIIIIl = net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl(net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IlIIIlIIIllllIlIlIlI, new Object[0]);
            if (llllIIIlIlllIlIIIIIl != null && net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IIIIIIIIIlllIllIlIlI, new Object[0])) {
                return;
            }
        }
        try {
            final PrintWriter printWriter = new PrintWriter(new FileWriter(this.aM));
            printWriter.println("invertYMouse:" + this.IlIlIlIlIlllllllllIl);
            printWriter.println("mouseSensitivity:" + this.llllIIIIlIIIlIlllIll);
            printWriter.println("fov:" + (this.llIlIIIIllIlIIlIlIII - 70.0f) / 40.0f);
            printWriter.println("gamma:" + this.IIIIIlllIlIIIIIIIllI);
            printWriter.println("saturation:" + this.llllllIIIIIIIlllIIll);
            printWriter.println("renderDistance:" + this.llIllIIIIIllIlIIIIlI);
            printWriter.println("guiScale:" + this.IIlIlllIlIlllIlIllll);
            printWriter.println("particles:" + this.lIllllIllIllIIllllll);
            printWriter.println("bobView:" + this.IlIIIlIlIIIllIlIlIIl);
            printWriter.println("anaglyph3d:" + this.IlIlIIIllIllIIIIIllI);
            printWriter.println("maxFps:" + this.llllIIIlIlllIlIIIIIl);
            printWriter.println("fboEnable:" + this.IllIIlllIIIIlllIIlIl);
            printWriter.println("difficulty:" + this.lIIIIIlIlIIIlIIIIlIl.llllIIIIlIIIlIlllIll());
            printWriter.println("fancyGraphics:" + this.lIIIlllIIIllIIIllIII);
            printWriter.println("ao:" + this.llIIlIIIlIIIllIlIIIl);
            switch (this.lIIIIlIIIIIlllIllIII) {
                case 0: {
                    printWriter.println("renderClouds:false");
                    break;
                }
                case 1: {
                    printWriter.println("renderClouds:fast");
                    break;
                }
                case 2: {
                    printWriter.println("renderClouds:true");
                    break;
                }
            }
            printWriter.println("resourcePacks:" + net.minecraft.client.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.aA.toJson((Object)this.llIllIlIIIIllIlIIllI));
            printWriter.println("incompatibleResourcePacks:" + net.minecraft.client.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.aA.toJson((Object)this.lIlIlIIIllIIllIIIllI));
            printWriter.println("lastServer:" + this.lllllIlIlIlllIlllIlI);
            printWriter.println("lang:" + this.lllIIIIlIlIllIIlIIIl);
            printWriter.println("chatVisibility:" + this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll());
            printWriter.println("chatColors:" + this.IIIIlllIIIIIIlIIIlll);
            printWriter.println("chatLinks:" + this.llllIIllllIlIlIIIIll);
            printWriter.println("chatLinksPrompt:" + this.IlIllIlIlIIIlIlIlIII);
            printWriter.println("chatOpacity:" + this.IIlllIIlIllIllIlIIll);
            printWriter.println("snooperEnabled:" + this.lllIIIIlllllIlIIllIl);
            printWriter.println("fullscreen:" + this.IlIlIIIIIIlllIlIllIl);
            printWriter.println("enableVsync:" + this.IIllIIllIIIlIlIIIIlI);
            printWriter.println("useVbo:" + this.IIIlIIIlIlIIlllIIlll);
            printWriter.println("hideServerAddress:" + this.IIlIIIIlllIlllllIlII);
            printWriter.println("advancedItemTooltips:" + this.IIIlIIlIIIIlllIlllII);
            printWriter.println("pauseOnLostFocus:" + this.IlIlIllllllllIIIIlII);
            printWriter.println("touchscreen:" + this.IIlllIlIIllIlIlIlIIl);
            printWriter.println("overrideWidth:" + this.llIIIlIlIllIIlIlIlII);
            printWriter.println("overrideHeight:" + this.lllllIlIIIlIlIIlllII);
            printWriter.println("heldItemTooltips:" + this.lIllllllIIllIlIlIlII);
            printWriter.println("chatHeightFocused:" + this.llllllIllIllIlIllllI);
            printWriter.println("chatHeightUnfocused:" + this.IIlIIIIIllIlIIIlIIll);
            printWriter.println("chatScale:" + this.llIIlllIIlllIIllIllI);
            printWriter.println("chatWidth:" + this.IIlllIIIlIlllIIlllII);
            printWriter.println("showInventoryAchievementHint:" + this.IIIllllllIllIIIlllIl);
            printWriter.println("mipmapLevels:" + this.IlIIIlIIIllllIlIlIlI);
            printWriter.println("streamBytesPerPixel:" + this.IIIIIllIIIIlIIIIllIl);
            printWriter.println("streamMicVolume:" + this.IIIIIIIIIlllIllIlIlI);
            printWriter.println("streamSystemVolume:" + this.IIllllIIIlIIIIIIllIl);
            printWriter.println("streamKbps:" + this.IlllIIIIlIIIlIlIlIIl);
            printWriter.println("streamFps:" + this.lllIllIIIllllllIllll);
            printWriter.println("streamCompression:" + this.llIllIlIlIIIIIIIllII);
            printWriter.println("streamSendMetadata:" + this.IIlIlIlIIlIllIIIIIIl);
            printWriter.println("streamPreferredServer:" + this.IllIllIIIIlIIlIlllII);
            printWriter.println("streamChatEnabled:" + this.IlIllllIIlIIlIlIlIll);
            printWriter.println("streamChatUserFilter:" + this.IllIllIlllIllllIIllI);
            printWriter.println("streamMicToggleBehavior:" + this.llIlIIIIIlIIlIlIIlll);
            printWriter.println("forceUnicodeFont:" + net.minecraft.client.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.az);
            printWriter.println("allowBlockAlternatives:" + this.IlIlIIIlIIlIlIIlllIl);
            printWriter.println("reducedDebugInfo:" + this.IlllllllIIIlIIIlIlII);
            printWriter.println("useNativeTransport:" + this.IlIIlIlIIIlIIlIlIlII);
            printWriter.println("entityShadows:" + this.IllIlIIllIllIIlIllII);
            printWriter.println("realmsNotifications:" + this.IIlIIIlllIllIllIlIII);
            IlIIIlIlIIIllIlIlIIl[] lllllIIIIIlIIlllIlIl;
            for (int length = (lllllIIIIIlIIlllIlIl = this.lllllIIIIIlIIlllIlIl).length, i = 0; i < length; ++i) {
                final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = lllllIIIIIlIIlllIlIl[i];
                printWriter.println("key_" + ilIIIlIlIIIllIlIlIIl.llllIIIlIlllIlIIIIIl() + ":" + ilIIIlIlIIIllIlIlIIl.lIIIlllIIIllIIIllIII());
            }
            IlIlIIIllIIllIlllllI[] values;
            for (int length2 = (values = net.minecraft.client.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI.values()).length, j = 0; j < length2; ++j) {
                final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI = values[j];
                printWriter.println("soundCategory_" + ilIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll() + ":" + this.llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI));
            }
            IlIlIIIllIllIIIIIllI[] values2;
            for (int length3 = (values2 = net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.values()).length, k = 0; k < length3; ++k) {
                final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI = values2[k];
                printWriter.println("modelPart_" + ilIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI() + ":" + this.aK.contains(ilIlIIIllIllIIIIIllI));
            }
            printWriter.close();
        }
        catch (Exception ex) {
            net.minecraft.client.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.az.error("Failed to save options", (Throwable)ex);
        }
        this.lIIIIlIIIIIlllIllIII();
        this.llIllIIIIIllIlIIIIlI();
    }
    
    public float llllIIIIlIIIlIlllIll(final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI) {
        return this.aL.containsKey(ilIlIIIllIIllIlllllI) ? this.aL.get(ilIlIIIllIIllIlllllI) : 1.0f;
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI, final float n) {
        this.IlIllllIIIlIllIlIIll.IlIIlIlIIIlIIlIlIlII().llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI, n);
        this.aL.put(ilIlIIIllIIllIlllllI, n);
    }
    
    public void llIllIIIIIllIlIIIIlI() {
        if (this.IlIllllIIIlIllIlIIll.lIIIIlIIIIIlllIllIII != null) {
            int n = 0;
            final Iterator<IlIlIIIllIllIIIIIllI> iterator = this.aK.iterator();
            while (iterator.hasNext()) {
                n |= iterator.next().llllIIIIlIIIlIlllIll();
            }
            this.IlIllllIIIlIllIlIIll.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII(this.lllIIIIlIlIllIIlIIIl, this.llIllIIIIIllIlIIIIlI, this.IlIlIIIllIIllIlllllI, this.IIIIlllIIIIIIlIIIlll, n));
        }
    }
    
    public Set IlIIIlIlIIIllIlIlIIl() {
        return (Set)ImmutableSet.copyOf((Collection)this.aK);
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI, final boolean b) {
        if (b) {
            this.aK.add(ilIlIIIllIllIIIIIllI);
        }
        else {
            this.aK.remove(ilIlIIIllIllIIIIIllI);
        }
        this.llIllIIIIIllIlIIIIlI();
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI) {
        if (!this.IlIIIlIlIIIllIlIlIIl().contains(ilIlIIIllIllIIIIIllI)) {
            this.aK.add(ilIlIIIllIllIIIIIllI);
        }
        else {
            this.aK.remove(ilIlIIIllIllIIIIIllI);
        }
        this.llIllIIIIIllIlIIIIlI();
    }
    
    public int IlIlIIIllIllIIIIIllI() {
        return (this.llIllIIIIIllIlIIIIlI >= 4) ? this.lIIIIlIIIIIlllIllIII : 0;
    }
    
    public boolean IllIIlllIIIIlllIIlIl() {
        return this.IlIIlIlIIIlIIlIlIlII;
    }
    
    private void IlIlIlIlIlllllllllIl(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final float n) {
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IIlIIIlllIllIllIlIII) {
            this.g = n;
            this.IlIllllIIIlIllIlIIll.llllIIIlIlllIlIIIIIl.lIlIlIIIllIIllIIIllI();
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IllIIlllllIIllIIllIl) {
            this.c = n;
            this.IlIllllIIIlIllIlIIll.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl();
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.lIIlllIlllllIIlllIll) {
            final int n2 = (int)n;
            if (n2 > 0 && net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(net.optifine.IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll("of.message.aa.shaders1"), net.optifine.IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll("of.message.aa.shaders2"));
                return;
            }
            final int[] array = { 0, 2, 4, 6, 8, 12, 16 };
            this.d = 0;
            for (int i = 0; i < array.length; ++i) {
                if (n2 >= array[i]) {
                    this.d = array[i];
                }
            }
            this.d = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.d, 0, 16);
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.lIllIIlIlIlllllIIIII) {
            final int n3 = (int)n;
            if (n3 > 1 && net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(net.optifine.IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll("of.message.af.shaders1"), net.optifine.IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll("of.message.af.shaders2"));
                return;
            }
            this.e = 1;
            while (this.e * 2 <= n3) {
                this.e *= 2;
            }
            this.e = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.e, 1, 16);
            this.IlIllllIIIlIllIlIIll.IlIlIIIllIllIIIIIllI();
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IlIIlIlIIIlIIlIlIlII) {
            this.lIIlllIlllllIIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll((int)n, 0, 3);
            this.IlIllllIIIlIllIlIIll.IlIlIIIllIllIIIIIllI();
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.lllIlIIIIIlIlllllIlI) {
            final int n4 = (int)n - 1;
            final String[] lllIlIIIIIlIlllllIlI = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lllIlIIIIIlIlllllIlI();
            if (n4 < 0 || n4 >= lllIlIIIIIlIlllllIlI.length) {
                this.z = "Default";
                return;
            }
            this.z = lllIlIIIIIlIlllllIlI[n4];
        }
    }
    
    private float IlIIIlIlIIIllIlIlIIl(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IIlIIIlllIllIllIlIII) {
            return this.g;
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IllIIlllllIIllIIllIl) {
            return this.c;
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.lIIlllIlllllIIlllIll) {
            return (float)this.d;
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.lIllIIlIlIlllllIIIII) {
            return (float)this.e;
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IlIIlIlIIIlIIlIlIlII) {
            return (float)this.lIIlllIlllllIIlllIll;
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII) {
            return (this.llllIIIlIlllIlIIIIIl == llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI() && this.IIllIIllIIIlIlIIIIlI) ? 0.0f : ((float)this.llllIIIlIlllIlIIIIIl);
        }
        if (llIllIIIIIllIlIIIIlI != llIllIIIIIllIlIIIIlI.lllIlIIIIIlIlllllIlI) {
            return Float.MAX_VALUE;
        }
        if (this.z.equals("Default")) {
            return 0.0f;
        }
        final int index = Arrays.asList(net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lllIlIIIIIlIlllllIlI()).indexOf(this.z);
        return (index < 0) ? 0.0f : ((float)(index + 1));
    }
    
    private void IlIlIlIlIlllllllllIl(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final int n) {
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IllIllIlllIllllIIllI) {
            switch (this.lIllIlIIIllllllIIlII) {
                case 1: {
                    this.lIllIlIIIllllllIIlII = 2;
                    if (!net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl()) {
                        this.lIllIlIIIllllllIIlII = 3;
                        break;
                    }
                    break;
                }
                case 2: {
                    this.lIllIlIIIllllllIIlII = 3;
                    break;
                }
                case 3: {
                    this.lIllIlIIIllllllIIlII = 1;
                    break;
                }
                default: {
                    this.lIllIlIIIllllllIIlII = 1;
                    break;
                }
            }
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.llIlIIIIIlIIlIlIIlll) {
            this.IlIllIIllIIlIIIIlIIl += 0.2f;
            if (this.IlIllIIllIIlIIIIlIIl > 0.81f) {
                this.IlIllIIllIIlIIIIlIIl = 0.2f;
            }
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IllIlIIllIllIIlIllII) {
            this.lIIlIIIIIIIlIIlIlIIl = !this.lIIlIIIIIIIlIIlIlIIl;
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.lllllIIIIIlIIlllIlIl) {
            this.IlIIlllIIlIlllllIIlI = !this.IlIIlllIIlIlllllIIlI;
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI();
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.lIIlIIIlIllIlIllIIIl) {
            ++this.f;
            if (this.f > 3) {
                this.f = 0;
            }
            this.lIlIlIIIllIIllIIIllI();
            this.IlIllllIIIlIllIlIIll.llllIIIlIlllIlIIIIIl.lIlIlIIIllIIllIIIllI();
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.lIlIlIlllIIlIlIlllIl) {
            this.h = llllIIIIlIIIlIlllIll(this.h, net.minecraft.client.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.aN);
            this.IlIllllIIIlIllIlIIll.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl();
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.b) {
            ++this.j;
            if (this.j > 2) {
                this.j = 0;
            }
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.llIIIIIIlIllIIlIIIll) {
            ++this.i;
            if (this.i > 3) {
                this.i = 0;
            }
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.lIIIIlIlIllllIIlIllI) {
            ++this.V;
            if (this.V == 1) {
                ++this.V;
            }
            if (this.V > 2) {
                this.V = 0;
            }
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.llIIIlIlllIllIIlIllI) {
            ++this.W;
            if (this.W == 1) {
                ++this.W;
            }
            if (this.W > 2) {
                this.W = 0;
            }
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IlIIllIIllIIllIIlIIl) {
            this.X = !this.X;
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.lllllIIIIIlIlIIIIIIl) {
            this.Y = !this.Y;
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IIlllIIlllIIIlIlllII) {
            this.Z = !this.Z;
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IlIIlllllIIllIIlllll) {
            this.aa = !this.aa;
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.lllllIIlIlIIIlIlIIIl) {
            this.ab = !this.ab;
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IIlllllIllIllIlIlIII) {
            this.ac = !this.ac;
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IlIllllIIIlIllIlIIll) {
            this.ad = !this.ad;
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.lIIIIIlIlIIIlIIIIlIl) {
            this.ae = !this.ae;
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IIIllIIllIIIIIIlIIlI) {
            this.ag = !this.ag;
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IIIIIIIllllIlIIIIIII) {
            this.ah = !this.ah;
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IIlllIIIllIllIIlIlIl) {
            this.ai = !this.ai;
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.lllllIlIlIlllIlllIlI) {
            this.aj = !this.aj;
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.llIlIIIIllIlIIlIlIII) {
            this.ak = !this.ak;
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.lIIlIIIIIIIlIIlIlIIl) {
            this.al = !this.al;
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IIllIIIlIIIIlIIlIIII) {
            this.af = !this.af;
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.lIllIIIIIlllIIlIIllI) {
            this.m = !this.m;
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.lIlIIlllIIlIIlIlllIl) {
            this.o = !this.o;
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.llIIIllIlIllIllIIIIl) {
            final int l = 900;
            this.l = Math.max(this.l / l * l, l);
            this.l *= 2;
            if (this.l > 32 * l) {
                this.l = l;
            }
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IIIllIIIlIlIIllIIIlI) {
            ++this.k;
            if (this.k > 3) {
                this.k = 1;
            }
            this.IlIllllIIIlIllIlIIll.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl();
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.lIllIlIIIllllllIIlII) {
            ++this.H;
            if (this.H > 3) {
                this.H = 1;
            }
            if (this.H == 2) {
                this.IlIllllIIIlIllIlIIll.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl();
            }
            else {
                this.IlIllllIIIlIllIlIIll.IlIlIIIllIllIIIIIllI();
            }
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.llllIllllIllllIlIlII) {
            this.p = !this.p;
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IIlIlIllllIlllIIIIll) {
            this.q = !this.q;
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.lIIllIIIllllIlllIllI) {
            this.r = !this.r;
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IllIlIllIllIlllIIlll) {
            this.s = !this.s;
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IIllIIIlIIlIlIlIIIII) {
            ++this.t;
            if (this.t > 2) {
                this.t = 0;
            }
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.llIllIIlllllllllllll) {
            ++this.u;
            if (this.u > 5) {
                this.u = 1;
            }
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.lllllIIllIlIllIllllI) {
            this.v = !this.v;
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IlIIIIIlIIllIIlIlIll) {
            ++this.w;
            if (this.w > 2) {
                this.w = 0;
            }
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IllllIIlIlIllIIIllII) {
            this.x = !this.x;
            this.IlIlIIIllIIllIlllllI();
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.llIlllIlllllIIllIIII) {
            this.n = !this.n;
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IlIllllIIlIllIlIlIll) {
            this.y = !this.y;
            this.IlIllllIIIlIllIlIIll.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl();
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IIIIIlllIlIIIIIIIllI) {
            this.A = !this.A;
            net.optifine.lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl();
            this.IlIllllIIIlIllIlIIll.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl();
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.llllllIIIIIIIlllIIll) {
            this.B = !this.B;
            net.optifine.IlIIllIIllIIllIIlIIl.llllIIIIlIIIlIlllIll();
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IIlIlllIlIlllIlIllll) {
            this.C = !this.C;
            net.optifine.lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl();
            this.IlIllllIIIlIllIlIIll.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl();
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.lIllllIllIllIIllllll) {
            this.D = !this.D;
            this.IlIllllIIIlIllIlIIll.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIIllIIllIIllIIlIIl());
            this.IlIllllIIIlIllIlIIll.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIIllIIllIIllIIlIIl());
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.lllIIIIlIlIllIIlIIIl) {
            this.E = !this.E;
            net.optifine.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll();
            this.IlIllllIIIlIllIlIIll.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl();
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IlIllIIllIIlIIIIlIIl) {
            this.I = !this.I;
            this.IlIllllIIIlIllIlIIll.IlIlIIIllIllIIIIIllI();
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.d) {
            this.F = !this.F;
            net.optifine.IIIIIllIIIIlIIIIllIl.IlIlIlIlIlllllllllIl();
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IllIlllIllIIIIllllII) {
            this.G = !this.G;
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IlIIlllIIlIlllllIIlI) {
            this.J = !this.J;
            net.optifine.lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll();
            this.IlIllllIIIlIllIlIIll.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl();
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.llllIlIllllIIlIIlIlI) {
            this.K = !this.K;
            this.IlIllllIIIlIllIlIIll.IlIlIIIllIllIIIIIllI();
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.e) {
            this.L = !this.L;
            net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IllIIlllIIIIlllIIlIl = this.L;
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.f) {
            if (!this.M && net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(net.optifine.IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll("of.message.fr.shaders1"), net.optifine.IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll("of.message.fr.shaders2"));
                return;
            }
            this.M = !this.M;
            if (this.M) {
                this.IlIllllIIIlIllIlIIll.IlIllIlIlIIIlIlIlIII.IlIlIlIlIlllllllllIl();
            }
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.o();
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.g) {
            if (this.N == 0) {
                this.N = 1;
            }
            else if (this.N == 1) {
                this.N = 2;
            }
            else if (this.N == 2) {
                this.N = 0;
            }
            else {
                this.N = 0;
            }
            this.IlIllllIIIlIllIlIIll.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl();
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.c) {
            this.llllIlIllllIIlIIlIlI = !this.llllIlIllllIIlIIlIlI;
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.o) {
            this.a = !this.a;
            this.IlIllllIIIlIllIlIIll.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl();
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.q) {
            this.b = !this.b;
            this.IlIllllIIIlIllIlIIll.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl();
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.h) {
            this.O = !this.O;
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.j) {
            this.P = !this.P;
            this.IlIllllIIIlIllIlIIll.IlIlIIIllIllIIIIIllI();
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.i) {
            this.Q = llllIIIIlIIIlIlllIll(this.Q, net.minecraft.client.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.aO);
            net.optifine.IlllIIIIlIIIlIlIlIIl.IlIlIlIlIlllllllllIl(this.IlIllllIIIlIllIlIIll.llllIIIlIlllIlIIIIIl);
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.m) {
            ++this.U;
            if (this.U > 4) {
                this.U = 1;
            }
            if (!net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIIIlllIIIllIIIllIII()) {
                this.U = 1;
            }
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.k) {
            this.R = !this.R;
            this.IlIllllIIIlIllIlIIll.IlIlIIIllIllIIIIIllI();
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.n) {
            this.S = !this.S;
            net.optifine.llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll();
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.p) {
            this.T = !this.T;
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.a) {
            this.lIllllllIIllIlIlIlII = !this.lIllllllIIllIlIlIlII;
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.l) {
            this.IIIlIIlIIIIlllIlllII = !this.IIIlIIlIIIIlllIlllII;
        }
    }
    
    private String IlIlIIIllIllIIIIIllI(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        final String string = String.valueOf(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl(), new Object[0])) + ": ";
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl) {
            final int n = (int)this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI);
            String s = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("options.renderDistance.tiny", new Object[0]);
            int n2 = 2;
            if (n >= 4) {
                s = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("options.renderDistance.short", new Object[0]);
                n2 = 4;
            }
            if (n >= 8) {
                s = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("options.renderDistance.normal", new Object[0]);
                n2 = 8;
            }
            if (n >= 16) {
                s = net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("options.renderDistance.far", new Object[0]);
                n2 = 16;
            }
            if (n >= 32) {
                s = net.optifine.IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll("of.options.renderDistance.extreme");
                n2 = 32;
            }
            if (n >= 48) {
                s = net.optifine.IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll("of.options.renderDistance.insane");
                n2 = 48;
            }
            if (n >= 64) {
                s = net.optifine.IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll("of.options.renderDistance.ludicrous");
                n2 = 64;
            }
            final int n3 = this.llIllIIIIIllIlIIIIlI - n2;
            String string2 = s;
            if (n3 > 0) {
                string2 = String.valueOf(s) + "+";
            }
            return String.valueOf(string) + n + " " + string2;
        }
        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IllIllIlllIllllIIllI) {
            switch (this.lIllIlIIIllllllIIlII) {
                case 1: {
                    return String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIIIlIlIIIllIlIlIIl();
                }
                case 2: {
                    return String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIlIIIllIllIIIIIllI();
                }
                case 3: {
                    return String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI();
                }
                default: {
                    return String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI();
                }
            }
        }
        else {
            if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.llIlIIIIIlIIlIlIIlll) {
                return String.valueOf(string) + this.IlIllIIllIIlIIIIlIIl;
            }
            if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IlIIlIlIIIlIIlIlIlII) {
                switch (this.lIIlllIlllllIIlllIll) {
                    case 0: {
                        return String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll("of.options.mipmap.nearest");
                    }
                    case 1: {
                        return String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll("of.options.mipmap.linear");
                    }
                    case 2: {
                        return String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll("of.options.mipmap.bilinear");
                    }
                    case 3: {
                        return String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll("of.options.mipmap.trilinear");
                    }
                    default: {
                        return String.valueOf(string) + "of.options.mipmap.nearest";
                    }
                }
            }
            else {
                if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IllIlIIllIllIIlIllII) {
                    return this.lIIlIIIIIIIlIIlIlIIl ? (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl()) : (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI());
                }
                if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.lllllIIIIIlIIlllIlIl) {
                    return this.IlIIlllIIlIlllllIIlI ? (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl()) : (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI());
                }
                if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.lIIlIIIlIllIlIllIIIl) {
                    switch (this.f) {
                        case 1: {
                            return String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIIIlIlIIIllIlIlIIl();
                        }
                        case 2: {
                            return String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIlIIIllIllIIIIIllI();
                        }
                        case 3: {
                            return String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI();
                        }
                        default: {
                            return String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IllIIlllIIIIlllIIlIl();
                        }
                    }
                }
                else if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.lIlIlIlllIIlIlIlllIl) {
                    switch (this.h) {
                        case 1: {
                            return String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIIIlIlIIIllIlIlIIl();
                        }
                        case 2: {
                            return String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIlIIIllIllIIIIIllI();
                        }
                        default: {
                            return String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IllIIlllIIIIlllIIlIl();
                        }
                        case 4: {
                            return String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll("of.general.smart");
                        }
                    }
                }
                else if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.b) {
                    switch (this.j) {
                        case 1: {
                            return String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIIIlIlIIIllIlIlIIl();
                        }
                        case 2: {
                            return String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIlIIIllIllIIIIIllI();
                        }
                        default: {
                            return String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IllIIlllIIIIlllIIlIl();
                        }
                    }
                }
                else if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.llIIIIIIlIllIIlIIIll) {
                    switch (this.i) {
                        case 1: {
                            return String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIIIlIlIIIllIlIlIIl();
                        }
                        case 2: {
                            return String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIlIIIllIllIIIIIllI();
                        }
                        case 3: {
                            return String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI();
                        }
                        default: {
                            return String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IllIIlllIIIIlllIIlIl();
                        }
                    }
                }
                else if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.lIIIIlIlIllllIIlIllI) {
                    switch (this.V) {
                        case 1: {
                            return String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll("of.options.animation.dynamic");
                        }
                        case 2: {
                            return String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI();
                        }
                        default: {
                            return String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl();
                        }
                    }
                }
                else if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.llIIIlIlllIllIIlIllI) {
                    switch (this.W) {
                        case 1: {
                            return String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll("of.options.animation.dynamic");
                        }
                        case 2: {
                            return String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI();
                        }
                        default: {
                            return String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl();
                        }
                    }
                }
                else {
                    if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IlIIllIIllIIllIIlIIl) {
                        return this.X ? (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl()) : (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI());
                    }
                    if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.lllllIIIIIlIlIIIIIIl) {
                        return this.Y ? (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl()) : (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI());
                    }
                    if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IIlllIIlllIIIlIlllII) {
                        return this.Z ? (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl()) : (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI());
                    }
                    if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IlIIlllllIIllIIlllll) {
                        return this.aa ? (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl()) : (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI());
                    }
                    if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.lllllIIlIlIIIlIlIIIl) {
                        return this.ab ? (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl()) : (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI());
                    }
                    if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IIlllllIllIllIlIlIII) {
                        return this.ac ? (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl()) : (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI());
                    }
                    if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IlIllllIIIlIllIlIIll) {
                        return this.ad ? (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl()) : (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI());
                    }
                    if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.lIIIIIlIlIIIlIIIIlIl) {
                        return this.ae ? (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl()) : (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI());
                    }
                    if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IIIllIIllIIIIIIlIIlI) {
                        return this.ag ? (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl()) : (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI());
                    }
                    if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IIIIIIIllllIlIIIIIII) {
                        return this.ah ? (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl()) : (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI());
                    }
                    if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IIlllIIIllIllIIlIlIl) {
                        return this.ai ? (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl()) : (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI());
                    }
                    if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.lllllIlIlIlllIlllIlI) {
                        return this.aj ? (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl()) : (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI());
                    }
                    if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.llIlIIIIllIlIIlIlIII) {
                        return this.ak ? (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl()) : (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI());
                    }
                    if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.lIIlIIIIIIIlIIlIlIIl) {
                        return this.al ? (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl()) : (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI());
                    }
                    if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IIllIIIlIIIIlIIlIIII) {
                        return this.af ? (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl()) : (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI());
                    }
                    if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.lIllIIIIIlllIIlIIllI) {
                        return this.m ? (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl()) : (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI());
                    }
                    if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.lIlIIlllIIlIIlIlllIl) {
                        return this.o ? (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl()) : (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI());
                    }
                    if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.llIIIllIlIllIllIIIIl) {
                        final int n4 = 900;
                        return (this.l <= n4) ? (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll("of.options.save.45s")) : ((this.l <= 2 * n4) ? (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll("of.options.save.90s")) : ((this.l <= 4 * n4) ? (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll("of.options.save.3min")) : ((this.l <= 8 * n4) ? (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll("of.options.save.6min")) : ((this.l <= 16 * n4) ? (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll("of.options.save.12min")) : (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll("of.options.save.24min"))))));
                    }
                    if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IIIllIIIlIlIIllIIIlI) {
                        switch (this.k) {
                            case 1: {
                                return String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIIIlIlIIIllIlIlIIl();
                            }
                            case 2: {
                                return String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIlIIIllIllIIIIIllI();
                            }
                            default: {
                                return String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI();
                            }
                        }
                    }
                    else if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.lIllIlIIIllllllIIlII) {
                        switch (this.H) {
                            case 1: {
                                return String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIIIlIlIIIllIlIlIIl();
                            }
                            case 2: {
                                return String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIlIIIllIllIIIIIllI();
                            }
                            default: {
                                return String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI();
                            }
                        }
                    }
                    else {
                        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.llllIllllIllllIlIlII) {
                            return this.p ? (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl()) : (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI());
                        }
                        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IIlIlIllllIlllIIIIll) {
                            return this.q ? (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl()) : (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI());
                        }
                        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.lIIllIIIllllIlllIllI) {
                            return this.r ? (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl()) : (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI());
                        }
                        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IllIlIllIllIlllIIlll) {
                            return this.s ? (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl()) : (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI());
                        }
                        if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IIllIIIlIIlIlIlIIIII) {
                            switch (this.t) {
                                case 1: {
                                    return String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIIIlIlIIIllIlIlIIl();
                                }
                                case 2: {
                                    return String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIlIIIllIllIIIIIllI();
                                }
                                default: {
                                    return String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IllIIlllIIIIlllIIlIl();
                                }
                            }
                        }
                        else {
                            if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.llIllIIlllllllllllll) {
                                return String.valueOf(string) + this.u;
                            }
                            if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.lllllIIllIlIllIllllI) {
                                return this.v ? (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl()) : (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI());
                            }
                            if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IlIIIIIlIIllIIlIlIll) {
                                return (this.w == 1) ? (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll("of.options.time.dayOnly")) : ((this.w == 2) ? (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll("of.options.time.nightOnly")) : (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IllIIlllIIIIlllIIlIl()));
                            }
                            if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IllllIIlIlIllIIIllII) {
                                return this.x ? (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl()) : (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI());
                            }
                            if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.lIIlllIlllllIIlllIll) {
                                String string3 = "";
                                if (this.d != net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lllllIIIIIlIIlllIlIl()) {
                                    string3 = " (" + net.optifine.IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll("of.general.restart") + ")";
                                }
                                return (this.d == 0) ? (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI() + string3) : (String.valueOf(string) + this.d + string3);
                            }
                            if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.lIllIIlIlIlllllIIIII) {
                                return (this.e == 1) ? (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI()) : (String.valueOf(string) + this.e);
                            }
                            if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.llIlllIlllllIIllIIII) {
                                return this.n ? (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl()) : (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI());
                            }
                            if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IlIllllIIlIllIlIlIll) {
                                return this.y ? (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl()) : (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI());
                            }
                            if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IIIIIlllIlIIIIIIIllI) {
                                return this.A ? (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl()) : (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI());
                            }
                            if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.llllllIIIIIIIlllIIll) {
                                return this.B ? (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl()) : (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI());
                            }
                            if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IIlIlllIlIlllIlIllll) {
                                return this.C ? (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl()) : (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI());
                            }
                            if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.lIllllIllIllIIllllll) {
                                return this.D ? (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl()) : (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI());
                            }
                            if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.lllIIIIlIlIllIIlIIIl) {
                                return this.E ? (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl()) : (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI());
                            }
                            if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.d) {
                                return this.F ? (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl()) : (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI());
                            }
                            if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IllIlllIllIIIIllllII) {
                                return this.G ? (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl()) : (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI());
                            }
                            if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IlIllIIllIIlIIIIlIIl) {
                                return this.I ? (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl()) : (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI());
                            }
                            if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.IlIIlllIIlIlllllIIlI) {
                                return this.J ? (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl()) : (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI());
                            }
                            if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.llllIlIllllIIlIIlIlI) {
                                return this.K ? (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl()) : (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI());
                            }
                            if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.e) {
                                return this.L ? (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl()) : (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI());
                            }
                            if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.f) {
                                return this.M ? (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl()) : (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI());
                            }
                            if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.g) {
                                return (this.N == 1) ? (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIIIlIlIIIllIlIlIIl()) : ((this.N == 2) ? (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIlIIIllIllIIIIIllI()) : (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IllIIlllIIIIlllIIlIl()));
                            }
                            if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.c) {
                                return this.llllIlIllllIIlIIlIlI ? (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl()) : (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI());
                            }
                            if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.o) {
                                return this.a ? (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl()) : (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI());
                            }
                            if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.q) {
                                return this.b ? (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl()) : (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI());
                            }
                            if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.h) {
                                return this.O ? (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl()) : (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI());
                            }
                            if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.j) {
                                return this.P ? (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl()) : (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI());
                            }
                            if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.i) {
                                return String.valueOf(string) + llllIIIIlIIIlIlllIll(net.minecraft.client.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.aP, llIllIIIIIllIlIIIIlI(this.Q, net.minecraft.client.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.aO));
                            }
                            if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.m) {
                                return (this.U <= 1) ? (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IllIIlllIIIIlllIIlIl()) : (String.valueOf(string) + this.U + "x");
                            }
                            if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.k) {
                                return this.R ? (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl()) : (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI());
                            }
                            if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.n) {
                                return this.S ? (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl()) : (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI());
                            }
                            if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.p) {
                                return this.T ? (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl()) : (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI());
                            }
                            if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.lllIlIIIIIlIlllllIlI) {
                                return this.z.equals("Default") ? (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IllIIlllIIIIlllIIlIl()) : (String.valueOf(string) + this.z);
                            }
                            if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.a) {
                                return this.lIllllllIIllIlIlIlII ? (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl()) : (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI());
                            }
                            if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.l) {
                                return this.IIIlIIlIIIIlllIlllII ? (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl()) : (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI());
                            }
                            if (llIllIIIIIllIlIIIIlI == llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII) {
                                final float llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI);
                                return (llllIIIIlIIIlIlllIll == 0.0f) ? (String.valueOf(string) + net.optifine.IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll("of.options.framerateLimit.vsync")) : ((llllIIIIlIIIlIlllIll == llIllIIIIIllIlIIIIlI.w) ? (String.valueOf(string) + net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("options.framerateLimit.max", new Object[0])) : (String.valueOf(string) + (int)llllIIIIlIIIlIlllIll + " fps"));
                            }
                            return null;
                        }
                    }
                }
            }
        }
    }
    
    public void llllIIIlIlllIlIIIIIl() {
        try {
            File file = this.aQ;
            if (!file.exists()) {
                file = this.aM;
            }
            if (!file.exists()) {
                return;
            }
            final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                try {
                    final String[] split = line.split(":");
                    if (split[0].equals("ofRenderDistanceChunks") && split.length >= 2) {
                        this.llIllIIIIIllIlIIIIlI = Integer.valueOf(split[1]);
                        this.llIllIIIIIllIlIIIIlI = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI, 2, 1024);
                    }
                    if (split[0].equals("ofFogType") && split.length >= 2) {
                        this.lIllIlIIIllllllIIlII = Integer.valueOf(split[1]);
                        this.lIllIlIIIllllllIIlII = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.lIllIlIIIllllllIIlII, 1, 3);
                    }
                    if (split[0].equals("ofFogStart") && split.length >= 2) {
                        this.IlIllIIllIIlIIIIlIIl = Float.valueOf(split[1]);
                        if (this.IlIllIIllIIlIIIIlIIl < 0.2f) {
                            this.IlIllIIllIIlIIIIlIIl = 0.2f;
                        }
                        if (this.IlIllIIllIIlIIIIlIIl > 0.81f) {
                            this.IlIllIIllIIlIIIIlIIl = 0.8f;
                        }
                    }
                    if (split[0].equals("ofMipmapType") && split.length >= 2) {
                        this.lIIlllIlllllIIlllIll = Integer.valueOf(split[1]);
                        this.lIIlllIlllllIIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.lIIlllIlllllIIlllIll, 0, 3);
                    }
                    if (split[0].equals("ofOcclusionFancy") && split.length >= 2) {
                        this.lIllIIlIlIlllllIIIII = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofSmoothFps") && split.length >= 2) {
                        this.lIIlIIIIIIIlIIlIlIIl = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofSmoothWorld") && split.length >= 2) {
                        this.IlIIlllIIlIlllllIIlI = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofAoLevel") && split.length >= 2) {
                        this.c = Float.valueOf(split[1]);
                        this.c = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.c, 0.0f, 1.0f);
                    }
                    if (split[0].equals("ofClouds") && split.length >= 2) {
                        this.f = Integer.valueOf(split[1]);
                        this.f = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.f, 0, 3);
                        this.lIlIlIIIllIIllIIIllI();
                    }
                    if (split[0].equals("ofCloudsHeight") && split.length >= 2) {
                        this.g = Float.valueOf(split[1]);
                        this.g = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.g, 0.0f, 1.0f);
                    }
                    if (split[0].equals("ofTrees") && split.length >= 2) {
                        this.h = Integer.valueOf(split[1]);
                        this.h = IlIlIlIlIlllllllllIl(this.h, net.minecraft.client.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.aN);
                    }
                    if (split[0].equals("ofDroppedItems") && split.length >= 2) {
                        this.j = Integer.valueOf(split[1]);
                        this.j = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.j, 0, 2);
                    }
                    if (split[0].equals("ofRain") && split.length >= 2) {
                        this.i = Integer.valueOf(split[1]);
                        this.i = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.i, 0, 3);
                    }
                    if (split[0].equals("ofAnimatedWater") && split.length >= 2) {
                        this.V = Integer.valueOf(split[1]);
                        this.V = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.V, 0, 2);
                    }
                    if (split[0].equals("ofAnimatedLava") && split.length >= 2) {
                        this.W = Integer.valueOf(split[1]);
                        this.W = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.W, 0, 2);
                    }
                    if (split[0].equals("ofAnimatedFire") && split.length >= 2) {
                        this.X = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofAnimatedPortal") && split.length >= 2) {
                        this.Y = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofAnimatedRedstone") && split.length >= 2) {
                        this.Z = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofAnimatedExplosion") && split.length >= 2) {
                        this.aa = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofAnimatedFlame") && split.length >= 2) {
                        this.ab = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofAnimatedSmoke") && split.length >= 2) {
                        this.ac = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofVoidParticles") && split.length >= 2) {
                        this.ad = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofWaterParticles") && split.length >= 2) {
                        this.ae = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofPortalParticles") && split.length >= 2) {
                        this.ag = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofPotionParticles") && split.length >= 2) {
                        this.ah = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofFireworkParticles") && split.length >= 2) {
                        this.ai = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofDrippingWaterLava") && split.length >= 2) {
                        this.aj = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofAnimatedTerrain") && split.length >= 2) {
                        this.ak = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofAnimatedTextures") && split.length >= 2) {
                        this.al = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofRainSplash") && split.length >= 2) {
                        this.af = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofLagometer") && split.length >= 2) {
                        this.m = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofShowFps") && split.length >= 2) {
                        this.o = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofAutoSaveTicks") && split.length >= 2) {
                        this.l = Integer.valueOf(split[1]);
                        this.l = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.l, 40, 40000);
                    }
                    if (split[0].equals("ofBetterGrass") && split.length >= 2) {
                        this.k = Integer.valueOf(split[1]);
                        this.k = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.k, 1, 3);
                    }
                    if (split[0].equals("ofConnectedTextures") && split.length >= 2) {
                        this.H = Integer.valueOf(split[1]);
                        this.H = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.H, 1, 3);
                    }
                    if (split[0].equals("ofWeather") && split.length >= 2) {
                        this.p = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofSky") && split.length >= 2) {
                        this.q = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofStars") && split.length >= 2) {
                        this.r = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofSunMoon") && split.length >= 2) {
                        this.s = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofVignette") && split.length >= 2) {
                        this.t = Integer.valueOf(split[1]);
                        this.t = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.t, 0, 2);
                    }
                    if (split[0].equals("ofChunkUpdates") && split.length >= 2) {
                        this.u = Integer.valueOf(split[1]);
                        this.u = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.u, 1, 5);
                    }
                    if (split[0].equals("ofChunkUpdatesDynamic") && split.length >= 2) {
                        this.v = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofTime") && split.length >= 2) {
                        this.w = Integer.valueOf(split[1]);
                        this.w = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.w, 0, 2);
                    }
                    if (split[0].equals("ofClearWater") && split.length >= 2) {
                        this.x = Boolean.valueOf(split[1]);
                        this.IlIlIIIllIIllIlllllI();
                    }
                    if (split[0].equals("ofAaLevel") && split.length >= 2) {
                        this.d = Integer.valueOf(split[1]);
                        this.d = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.d, 0, 16);
                    }
                    if (split[0].equals("ofAfLevel") && split.length >= 2) {
                        this.e = Integer.valueOf(split[1]);
                        this.e = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.e, 1, 16);
                    }
                    if (split[0].equals("ofProfiler") && split.length >= 2) {
                        this.n = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofBetterSnow") && split.length >= 2) {
                        this.y = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofSwampColors") && split.length >= 2) {
                        this.A = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofRandomEntities") && split.length >= 2) {
                        this.B = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofSmoothBiomes") && split.length >= 2) {
                        this.C = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofCustomFonts") && split.length >= 2) {
                        this.D = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofCustomColors") && split.length >= 2) {
                        this.E = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofCustomItems") && split.length >= 2) {
                        this.I = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofCustomSky") && split.length >= 2) {
                        this.F = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofShowCapes") && split.length >= 2) {
                        this.G = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofNaturalTextures") && split.length >= 2) {
                        this.J = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofEmissiveTextures") && split.length >= 2) {
                        this.K = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofLazyChunkLoading") && split.length >= 2) {
                        this.llllIlIllllIIlIIlIlI = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofRenderRegions") && split.length >= 2) {
                        this.a = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofSmartAnimations") && split.length >= 2) {
                        this.b = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofDynamicFov") && split.length >= 2) {
                        this.O = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofAlternateBlocks") && split.length >= 2) {
                        this.P = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofDynamicLights") && split.length >= 2) {
                        this.Q = Integer.valueOf(split[1]);
                        this.Q = IlIlIlIlIlllllllllIl(this.Q, net.minecraft.client.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.aO);
                    }
                    if (split[0].equals("ofScreenshotSize") && split.length >= 2) {
                        this.U = Integer.valueOf(split[1]);
                        this.U = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.U, 1, 4);
                    }
                    if (split[0].equals("ofCustomEntityModels") && split.length >= 2) {
                        this.R = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofCustomGuis") && split.length >= 2) {
                        this.S = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofShowGlErrors") && split.length >= 2) {
                        this.T = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofFullscreenMode") && split.length >= 2) {
                        this.z = split[1];
                    }
                    if (split[0].equals("ofFastMath") && split.length >= 2) {
                        this.L = Boolean.valueOf(split[1]);
                        net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IllIIlllIIIIlllIIlIl = this.L;
                    }
                    if (split[0].equals("ofFastRender") && split.length >= 2) {
                        this.M = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofTranslucentBlocks") && split.length >= 2) {
                        this.N = Integer.valueOf(split[1]);
                        this.N = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.N, 0, 2);
                    }
                    if (!split[0].equals("key_" + this.av.llllIIIlIlllIlIIIIIl())) {
                        continue;
                    }
                    this.av.IlIlIlIlIlllllllllIl(Integer.parseInt(split[1]));
                }
                catch (Exception ex) {
                    net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl("Skipping bad option: " + line);
                    ex.printStackTrace();
                }
            }
            net.optifine.util.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll(this.lllllIIIIIlIIlllIlIl, new IlIIIlIlIIIllIlIlIIl[] { this.av });
            net.minecraft.client.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl();
            bufferedReader.close();
        }
        catch (Exception ex2) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Failed to load options");
            ex2.printStackTrace();
        }
    }
    
    public void lIIIIlIIIIIlllIllIII() {
        try {
            final PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.aQ), "UTF-8"));
            printWriter.println("ofFogType:" + this.lIllIlIIIllllllIIlII);
            printWriter.println("ofFogStart:" + this.IlIllIIllIIlIIIIlIIl);
            printWriter.println("ofMipmapType:" + this.lIIlllIlllllIIlllIll);
            printWriter.println("ofOcclusionFancy:" + this.lIllIIlIlIlllllIIIII);
            printWriter.println("ofSmoothFps:" + this.lIIlIIIIIIIlIIlIlIIl);
            printWriter.println("ofSmoothWorld:" + this.IlIIlllIIlIlllllIIlI);
            printWriter.println("ofAoLevel:" + this.c);
            printWriter.println("ofClouds:" + this.f);
            printWriter.println("ofCloudsHeight:" + this.g);
            printWriter.println("ofTrees:" + this.h);
            printWriter.println("ofDroppedItems:" + this.j);
            printWriter.println("ofRain:" + this.i);
            printWriter.println("ofAnimatedWater:" + this.V);
            printWriter.println("ofAnimatedLava:" + this.W);
            printWriter.println("ofAnimatedFire:" + this.X);
            printWriter.println("ofAnimatedPortal:" + this.Y);
            printWriter.println("ofAnimatedRedstone:" + this.Z);
            printWriter.println("ofAnimatedExplosion:" + this.aa);
            printWriter.println("ofAnimatedFlame:" + this.ab);
            printWriter.println("ofAnimatedSmoke:" + this.ac);
            printWriter.println("ofVoidParticles:" + this.ad);
            printWriter.println("ofWaterParticles:" + this.ae);
            printWriter.println("ofPortalParticles:" + this.ag);
            printWriter.println("ofPotionParticles:" + this.ah);
            printWriter.println("ofFireworkParticles:" + this.ai);
            printWriter.println("ofDrippingWaterLava:" + this.aj);
            printWriter.println("ofAnimatedTerrain:" + this.ak);
            printWriter.println("ofAnimatedTextures:" + this.al);
            printWriter.println("ofRainSplash:" + this.af);
            printWriter.println("ofLagometer:" + this.m);
            printWriter.println("ofShowFps:" + this.o);
            printWriter.println("ofAutoSaveTicks:" + this.l);
            printWriter.println("ofBetterGrass:" + this.k);
            printWriter.println("ofConnectedTextures:" + this.H);
            printWriter.println("ofWeather:" + this.p);
            printWriter.println("ofSky:" + this.q);
            printWriter.println("ofStars:" + this.r);
            printWriter.println("ofSunMoon:" + this.s);
            printWriter.println("ofVignette:" + this.t);
            printWriter.println("ofChunkUpdates:" + this.u);
            printWriter.println("ofChunkUpdatesDynamic:" + this.v);
            printWriter.println("ofTime:" + this.w);
            printWriter.println("ofClearWater:" + this.x);
            printWriter.println("ofAaLevel:" + this.d);
            printWriter.println("ofAfLevel:" + this.e);
            printWriter.println("ofProfiler:" + this.n);
            printWriter.println("ofBetterSnow:" + this.y);
            printWriter.println("ofSwampColors:" + this.A);
            printWriter.println("ofRandomEntities:" + this.B);
            printWriter.println("ofSmoothBiomes:" + this.C);
            printWriter.println("ofCustomFonts:" + this.D);
            printWriter.println("ofCustomColors:" + this.E);
            printWriter.println("ofCustomItems:" + this.I);
            printWriter.println("ofCustomSky:" + this.F);
            printWriter.println("ofShowCapes:" + this.G);
            printWriter.println("ofNaturalTextures:" + this.J);
            printWriter.println("ofEmissiveTextures:" + this.K);
            printWriter.println("ofLazyChunkLoading:" + this.llllIlIllllIIlIIlIlI);
            printWriter.println("ofRenderRegions:" + this.a);
            printWriter.println("ofSmartAnimations:" + this.b);
            printWriter.println("ofDynamicFov:" + this.O);
            printWriter.println("ofAlternateBlocks:" + this.P);
            printWriter.println("ofDynamicLights:" + this.Q);
            printWriter.println("ofScreenshotSize:" + this.U);
            printWriter.println("ofCustomEntityModels:" + this.R);
            printWriter.println("ofCustomGuis:" + this.S);
            printWriter.println("ofShowGlErrors:" + this.T);
            printWriter.println("ofFullscreenMode:" + this.z);
            printWriter.println("ofFastMath:" + this.L);
            printWriter.println("ofFastRender:" + this.M);
            printWriter.println("ofTranslucentBlocks:" + this.N);
            printWriter.println("key_" + this.av.llllIIIlIlllIlIIIIIl() + ":" + this.av.lIIIlllIIIllIIIllIII());
            printWriter.close();
        }
        catch (Exception ex) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Failed to save options");
            ex.printStackTrace();
        }
    }
    
    private void lIlIlIIIllIIllIIIllI() {
        switch (this.f) {
            case 1: {
                this.lIIIIlIIIIIlllIllIII = 1;
                break;
            }
            case 2: {
                this.lIIIIlIIIIIlllIllIII = 2;
                break;
            }
            case 3: {
                this.lIIIIlIIIIIlllIllIII = 0;
                break;
            }
            default: {
                if (this.lIIIlllIIIllIIIllIII) {
                    this.lIIIIlIIIIIlllIllIII = 2;
                    break;
                }
                this.lIIIIlIIIIIlllIllIII = 1;
                break;
            }
        }
    }
    
    public void lIIIlllIIIllIIIllIII() {
        this.llIllIIIIIllIlIIIIlI = 8;
        this.IlIIIlIlIIIllIlIlIIl = true;
        this.IlIlIIIllIllIIIIIllI = false;
        this.llllIIIlIlllIlIIIIIl = (int)net.minecraft.client.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI();
        this.IIllIIllIIIlIlIIIIlI = false;
        this.llIIlIIIlIIIllIlIIIl();
        this.IlIIIlIIIllllIlIlIlI = 4;
        this.lIIIlllIIIllIIIllIII = true;
        this.llIIlIIIlIIIllIlIIIl = 2;
        this.lIIIIlIIIIIlllIllIII = 2;
        this.llIlIIIIllIlIIlIlIII = 70.0f;
        this.IIIIIlllIlIIIIIIIllI = 0.0f;
        this.IIlIlllIlIlllIlIllll = 0;
        this.lIllllIllIllIIllllll = 0;
        this.lIllllllIIllIlIlIlII = true;
        this.IIIlIIIlIlIIlllIIlll = false;
        this.IllIlllIllIIIIllllII = false;
        this.lIllIlIIIllllllIIlII = 1;
        this.IlIllIIllIIlIIIIlIIl = 0.8f;
        this.lIIlllIlllllIIlllIll = 0;
        this.lIllIIlIlIlllllIIIII = false;
        this.b = false;
        this.lIIlIIIIIIIlIIlIlIIl = false;
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.f();
        this.IlIIlllIIlIlllllIIlI = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.g();
        this.llllIlIllllIIlIIlIlI = false;
        this.a = false;
        this.L = false;
        this.M = false;
        this.N = 0;
        this.O = true;
        this.P = true;
        this.Q = 3;
        this.U = 1;
        this.R = true;
        this.S = true;
        this.T = true;
        this.c = 1.0f;
        this.d = 0;
        this.e = 1;
        this.f = 0;
        this.g = 0.0f;
        this.h = 0;
        this.i = 0;
        this.k = 3;
        this.l = 4000;
        this.m = false;
        this.o = false;
        this.n = false;
        this.p = true;
        this.q = true;
        this.r = true;
        this.s = true;
        this.t = 0;
        this.u = 1;
        this.v = false;
        this.w = 0;
        this.x = false;
        this.y = false;
        this.z = "Default";
        this.A = true;
        this.B = true;
        this.C = true;
        this.D = true;
        this.E = true;
        this.I = true;
        this.F = true;
        this.G = true;
        this.H = 2;
        this.J = false;
        this.K = true;
        this.V = 0;
        this.W = 0;
        this.X = true;
        this.Y = true;
        this.Z = true;
        this.aa = true;
        this.ab = true;
        this.ac = true;
        this.ad = true;
        this.ae = true;
        this.af = true;
        this.ag = true;
        this.ah = true;
        this.ai = true;
        this.aj = true;
        this.ak = true;
        this.al = true;
        net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll("OFF");
        net.optifine.shaders.llIIlllIIlllIIllIllI.cn = 0;
        net.optifine.shaders.llIIlllIIlllIIllIllI.IlllllllIIIlIIIlIlII();
        net.optifine.shaders.llIIlllIIlllIIllIllI.IlIlIlIlIlllllllllIl();
        this.IlIlIIIllIIllIlllllI();
        this.IlIllllIIIlIllIlIIll.IlIlIIIllIllIIIIIllI();
        this.IlIlIlIlIlllllllllIl();
    }
    
    public void llIIlIIIlIIIllIlIIIl() {
        Display.setVSyncEnabled(this.IIllIIllIIIlIlIIIIlI);
    }
    
    private void IlIlIIIllIIllIlllllI() {
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.H()) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlllIIlIllIllIlIIll = true;
        }
        net.optifine.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(this, this.IlIllllIIIlIllIlIIll.IllIIlllIIIIlllIIlIl);
    }
    
    public void llllIIIIlIIIlIlllIll(final boolean al) {
        final int n = al ? 0 : 2;
        this.V = n;
        this.W = n;
        this.X = al;
        this.Y = al;
        this.Z = al;
        this.aa = al;
        this.ab = al;
        this.ac = al;
        this.ad = al;
        this.ae = al;
        this.af = al;
        this.ag = al;
        this.ah = al;
        this.ai = al;
        this.lIllllIllIllIIllllll = (al ? 0 : 2);
        this.aj = al;
        this.ak = al;
        this.al = al;
    }
    
    private static int llllIIIIlIIIlIlllIll(final int n, final int[] array) {
        int llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI(n, array);
        if (llIllIIIIIllIlIIIIlI < 0) {
            return array[0];
        }
        if (++llIllIIIIIllIlIIIIlI >= array.length) {
            llIllIIIIIllIlIIIIlI = 0;
        }
        return array[llIllIIIIIllIlIIIIlI];
    }
    
    private static int IlIlIlIlIlllllllllIl(final int n, final int[] array) {
        return (llIllIIIIIllIlIIIIlI(n, array) < 0) ? array[0] : n;
    }
    
    private static int llIllIIIIIllIlIIIIlI(final int n, final int[] array) {
        for (int i = 0; i < array.length; ++i) {
            if (array[i] == n) {
                return i;
            }
        }
        return -1;
    }
    
    static /* synthetic */ int[] llIllIlIIIIllIlIIllI() {
        final int[] ar = llllIIIIlIIIlIlllIll.aR;
        if (ar != null) {
            return ar;
        }
        final int[] ar2 = new int[llIllIIIIIllIlIIIIlI.values().length];
        try {
            ar2[llIllIIIIIllIlIIIIlI.lIIlllIlllllIIlllIll.ordinal()] = 96;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.l.ordinal()] = 112;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.lIllIIlIlIlllllIIIII.ordinal()] = 97;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.j.ordinal()] = 110;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.IlIlIIIllIIllIlllllI.ordinal()] = 13;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII.ordinal()] = 8;
        }
        catch (NoSuchFieldError noSuchFieldError6) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.IlIIlllllIIllIIlllll.ordinal()] = 64;
        }
        catch (NoSuchFieldError noSuchFieldError7) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.IlIIllIIllIIllIIlIIl.ordinal()] = 56;
        }
        catch (NoSuchFieldError noSuchFieldError8) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.lllllIIlIlIIIlIlIIIl.ordinal()] = 65;
        }
        catch (NoSuchFieldError noSuchFieldError9) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.llIIIlIlllIllIIlIllI.ordinal()] = 55;
        }
        catch (NoSuchFieldError noSuchFieldError10) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.lllllIIIIIlIlIIIIIIl.ordinal()] = 57;
        }
        catch (NoSuchFieldError noSuchFieldError11) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.IIlllIIlllIIIlIlllII.ordinal()] = 63;
        }
        catch (NoSuchFieldError noSuchFieldError12) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.IIlllllIllIllIlIlIII.ordinal()] = 66;
        }
        catch (NoSuchFieldError noSuchFieldError13) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.llIlIIIIllIlIIlIlIII.ordinal()] = 87;
        }
        catch (NoSuchFieldError noSuchFieldError14) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.lIIlIIIIIIIlIIlIlIIl.ordinal()] = 98;
        }
        catch (NoSuchFieldError noSuchFieldError15) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.lIIIIlIlIllllIIlIllI.ordinal()] = 54;
        }
        catch (NoSuchFieldError noSuchFieldError16) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.IllIIlllllIIllIIllIl.ordinal()] = 58;
        }
        catch (NoSuchFieldError noSuchFieldError17) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.llIIIllIlIllIllIIIIl.ordinal()] = 61;
        }
        catch (NoSuchFieldError noSuchFieldError18) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.IIIllIIIlIlIIllIIIlI.ordinal()] = 62;
        }
        catch (NoSuchFieldError noSuchFieldError19) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.IlIllllIIlIllIlIlIll.ordinal()] = 85;
        }
        catch (NoSuchFieldError noSuchFieldError20) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.llIllIlIlIIIIIIIllII.ordinal()] = 42;
        }
        catch (NoSuchFieldError noSuchFieldError21) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.IIlllIIlIllIllIlIIll.ordinal()] = 17;
        }
        catch (NoSuchFieldError noSuchFieldError22) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII.ordinal()] = 28;
        }
        catch (NoSuchFieldError noSuchFieldError23) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII.ordinal()] = 29;
        }
        catch (NoSuchFieldError noSuchFieldError24) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.lllIIIIlllllIlIIllIl.ordinal()] = 18;
        }
        catch (NoSuchFieldError noSuchFieldError25) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.IIllIIllIIIlIlIIIIlI.ordinal()] = 20;
        }
        catch (NoSuchFieldError noSuchFieldError26) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.IlIlIIIIIIlllIlIllIl.ordinal()] = 19;
        }
        catch (NoSuchFieldError noSuchFieldError27) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.IlIlIllllllllIIIIlII.ordinal()] = 26;
        }
        catch (NoSuchFieldError noSuchFieldError28) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.IlIllIlIlIIIlIlIlIII.ordinal()] = 16;
        }
        catch (NoSuchFieldError noSuchFieldError29) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl.ordinal()] = 27;
        }
        catch (NoSuchFieldError noSuchFieldError30) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.llIllIIlllllllllllll.ordinal()] = 72;
        }
        catch (NoSuchFieldError noSuchFieldError31) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.lllllIIllIlIllIllllI.ordinal()] = 73;
        }
        catch (NoSuchFieldError noSuchFieldError32) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.IllllIIlIlIllIIIllII.ordinal()] = 75;
        }
        catch (NoSuchFieldError noSuchFieldError33) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.lIIlIIIlIllIlIllIIIl.ordinal()] = 50;
        }
        catch (NoSuchFieldError noSuchFieldError34) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.IIlIIIlllIllIllIlIII.ordinal()] = 51;
        }
        catch (NoSuchFieldError noSuchFieldError35) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.lIllIlIIIllllllIIlII.ordinal()] = 94;
        }
        catch (NoSuchFieldError noSuchFieldError36) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.lllIIIIlIlIllIIlIIIl.ordinal()] = 92;
        }
        catch (NoSuchFieldError noSuchFieldError37) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.k.ordinal()] = 111;
        }
        catch (NoSuchFieldError noSuchFieldError38) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.lIllllIllIllIIllllll.ordinal()] = 91;
        }
        catch (NoSuchFieldError noSuchFieldError39) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.n.ordinal()] = 114;
        }
        catch (NoSuchFieldError noSuchFieldError40) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.IlIllIIllIIlIIIIlIIl.ordinal()] = 95;
        }
        catch (NoSuchFieldError noSuchFieldError41) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.d.ordinal()] = 104;
        }
        catch (NoSuchFieldError noSuchFieldError42) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.lllllIlIlIlllIlllIlI.ordinal()] = 84;
        }
        catch (NoSuchFieldError noSuchFieldError43) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.b.ordinal()] = 102;
        }
        catch (NoSuchFieldError noSuchFieldError44) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.h.ordinal()] = 108;
        }
        catch (NoSuchFieldError noSuchFieldError45) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.i.ordinal()] = 109;
        }
        catch (NoSuchFieldError noSuchFieldError46) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.llllIlIllllIIlIIlIlI.ordinal()] = 100;
        }
        catch (NoSuchFieldError noSuchFieldError47) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.IlllllllIIIlIIIlIlII.ordinal()] = 23;
        }
        catch (NoSuchFieldError noSuchFieldError48) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.IllIllIIIIlIIlIlllII.ordinal()] = 44;
        }
        catch (NoSuchFieldError noSuchFieldError49) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.e.ordinal()] = 105;
        }
        catch (NoSuchFieldError noSuchFieldError50) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.f.ordinal()] = 106;
        }
        catch (NoSuchFieldError noSuchFieldError51) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl.ordinal()] = 10;
        }
        catch (NoSuchFieldError noSuchFieldError52) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.IIlllIIIllIllIIlIlIl.ordinal()] = 82;
        }
        catch (NoSuchFieldError noSuchFieldError53) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.IllIllIlllIllllIIllI.ordinal()] = 46;
        }
        catch (NoSuchFieldError noSuchFieldError54) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.llIlIIIIIlIIlIlIIlll.ordinal()] = 47;
        }
        catch (NoSuchFieldError noSuchFieldError55) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.llIIlllIIlllIIllIllI.ordinal()] = 31;
        }
        catch (NoSuchFieldError noSuchFieldError56) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError57) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII.ordinal()] = 9;
        }
        catch (NoSuchFieldError noSuchFieldError58) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.lllIlIIIIIlIlllllIlI.ordinal()] = 86;
        }
        catch (NoSuchFieldError noSuchFieldError59) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError60) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.lIlIlIIIllIIllIIIllI.ordinal()] = 12;
        }
        catch (NoSuchFieldError noSuchFieldError61) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.IIIIlllIIIIIIlIIIlll.ordinal()] = 14;
        }
        catch (NoSuchFieldError noSuchFieldError62) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.a.ordinal()] = 101;
        }
        catch (NoSuchFieldError noSuchFieldError63) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError64) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.lIllIIIIIlllIIlIIllI.ordinal()] = 59;
        }
        catch (NoSuchFieldError noSuchFieldError65) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.c.ordinal()] = 103;
        }
        catch (NoSuchFieldError noSuchFieldError66) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.lIllllllIIllIlIlIlII.ordinal()] = 30;
        }
        catch (NoSuchFieldError noSuchFieldError67) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.IlIIlIlIIIlIIlIlIlII.ordinal()] = 48;
        }
        catch (NoSuchFieldError noSuchFieldError68) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.IlIIlllIIlIlllllIIlI.ordinal()] = 99;
        }
        catch (NoSuchFieldError noSuchFieldError69) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.llllIIllllIlIlIIIIll.ordinal()] = 15;
        }
        catch (NoSuchFieldError noSuchFieldError70) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.IIIllIIllIIIIIIlIIlI.ordinal()] = 80;
        }
        catch (NoSuchFieldError noSuchFieldError71) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.IIIIIIIllllIlIIIIIII.ordinal()] = 81;
        }
        catch (NoSuchFieldError noSuchFieldError72) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.llIlllIlllllIIllIIII.ordinal()] = 83;
        }
        catch (NoSuchFieldError noSuchFieldError73) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.llIIIIIIlIllIIlIIIll.ordinal()] = 53;
        }
        catch (NoSuchFieldError noSuchFieldError74) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.IIllIIIlIIIIlIIlIIII.ordinal()] = 79;
        }
        catch (NoSuchFieldError noSuchFieldError75) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.llllllIIIIIIIlllIIll.ordinal()] = 89;
        }
        catch (NoSuchFieldError noSuchFieldError76) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.IIlIlIlIIlIllIIIIIIl.ordinal()] = 43;
        }
        catch (NoSuchFieldError noSuchFieldError77) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.llIllIlIIIIllIlIIllI.ordinal()] = 11;
        }
        catch (NoSuchFieldError noSuchFieldError78) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError79) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.o.ordinal()] = 115;
        }
        catch (NoSuchFieldError noSuchFieldError80) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError81) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.m.ordinal()] = 113;
        }
        catch (NoSuchFieldError noSuchFieldError82) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError83) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.IllIlllIllIIIIllllII.ordinal()] = 93;
        }
        catch (NoSuchFieldError noSuchFieldError84) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.lIlIIlllIIlIIlIlllIl.ordinal()] = 60;
        }
        catch (NoSuchFieldError noSuchFieldError85) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.p.ordinal()] = 116;
        }
        catch (NoSuchFieldError noSuchFieldError86) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.IIlIlIllllIlllIIIIll.ordinal()] = 68;
        }
        catch (NoSuchFieldError noSuchFieldError87) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.q.ordinal()] = 117;
        }
        catch (NoSuchFieldError noSuchFieldError88) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.IIlIlllIlIlllIlIllll.ordinal()] = 90;
        }
        catch (NoSuchFieldError noSuchFieldError89) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.IllIlIIllIllIIlIllII.ordinal()] = 49;
        }
        catch (NoSuchFieldError noSuchFieldError90) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.lllllIIIIIlIIlllIlIl.ordinal()] = 76;
        }
        catch (NoSuchFieldError noSuchFieldError91) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.IIIlIIIlIlIIlllIIlll.ordinal()] = 21;
        }
        catch (NoSuchFieldError noSuchFieldError92) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.lIIllIIIllllIlllIllI.ordinal()] = 69;
        }
        catch (NoSuchFieldError noSuchFieldError93) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.IIlllIIIlIlllIIlllII.ordinal()] = 32;
        }
        catch (NoSuchFieldError noSuchFieldError94) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.IIllllIIIlIIIIIIllIl.ordinal()] = 39;
        }
        catch (NoSuchFieldError noSuchFieldError95) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.IlllIIIIlIIIlIlIlIIl.ordinal()] = 40;
        }
        catch (NoSuchFieldError noSuchFieldError96) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.IIIIIllIIIIlIIIIllIl.ordinal()] = 37;
        }
        catch (NoSuchFieldError noSuchFieldError97) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.IlIIIlIIIllllIlIlIlI.ordinal()] = 36;
        }
        catch (NoSuchFieldError noSuchFieldError98) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.IIIllllllIllIIIlllIl.ordinal()] = 35;
        }
        catch (NoSuchFieldError noSuchFieldError99) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.lllIllIIIllllllIllll.ordinal()] = 41;
        }
        catch (NoSuchFieldError noSuchFieldError100) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.IIIIIIIIIlllIllIlIlI.ordinal()] = 38;
        }
        catch (NoSuchFieldError noSuchFieldError101) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.IIlIIIIIllIlIIIlIIll.ordinal()] = 33;
        }
        catch (NoSuchFieldError noSuchFieldError102) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.llllllIllIllIlIllllI.ordinal()] = 34;
        }
        catch (NoSuchFieldError noSuchFieldError103) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.IllIlIllIllIlllIIlll.ordinal()] = 70;
        }
        catch (NoSuchFieldError noSuchFieldError104) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.IIIIIlllIlIIIIIIIllI.ordinal()] = 88;
        }
        catch (NoSuchFieldError noSuchFieldError105) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.IlIIIIIlIIllIIlIlIll.ordinal()] = 74;
        }
        catch (NoSuchFieldError noSuchFieldError106) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.IIIlIIlIIIIlllIlllII.ordinal()] = 25;
        }
        catch (NoSuchFieldError noSuchFieldError107) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.g.ordinal()] = 107;
        }
        catch (NoSuchFieldError noSuchFieldError108) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.lIlIlIlllIIlIlIlllIl.ordinal()] = 52;
        }
        catch (NoSuchFieldError noSuchFieldError109) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.IlIlIIIlIIlIlIIlllIl.ordinal()] = 22;
        }
        catch (NoSuchFieldError noSuchFieldError110) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.IIlIIIIlllIlllllIlII.ordinal()] = 24;
        }
        catch (NoSuchFieldError noSuchFieldError111) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.llllIIIlIlllIlIIIIIl.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError112) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.IIllIIIlIIlIlIlIIIII.ordinal()] = 71;
        }
        catch (NoSuchFieldError noSuchFieldError113) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.IlIllllIIIlIllIlIIll.ordinal()] = 77;
        }
        catch (NoSuchFieldError noSuchFieldError114) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.lIIIIIlIlIIIlIIIIlIl.ordinal()] = 78;
        }
        catch (NoSuchFieldError noSuchFieldError115) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.llllIllllIllllIlIlII.ordinal()] = 67;
        }
        catch (NoSuchFieldError noSuchFieldError116) {}
        try {
            ar2[llIllIIIIIllIlIIIIlI.IlIllllIIlIIlIlIlIll.ordinal()] = 45;
        }
        catch (NoSuchFieldError noSuchFieldError117) {}
        return llllIIIIlIIIlIlllIll.aR = ar2;
    }
}
