package net.optifine.shaders;

import net.minecraft.client.*;
import org.lwjgl.util.vector.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.optifine.shaders.llIllIIIIIllIlIIIIlI.*;
import java.nio.*;
import org.lwjgl.*;
import net.optifine.shaders.llllIIIIlIIIlIlllIll.*;
import net.optifine.llIIlIIIlIIIllIlIIIl.*;
import org.apache.commons.io.*;
import net.optifine.*;
import net.optifine.util.*;
import java.io.*;
import com.google.common.base.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import java.util.regex.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import org.lwjgl.util.glu.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import java.util.*;

public class llIIlllIIlllIIllIllI
{
    static Minecraft llllIIIIlIIIlIlllIll;
    static IIllIIllIIIlIlIIIIlI IlIlIlIlIlllllllllIl;
    public static boolean llIllIIIIIllIlIIIIlI;
    public static boolean IlIIIlIlIIIllIlIlIIl;
    public static ContextCapabilities IlIlIIIllIllIIIIIllI;
    public static String IllIIlllIIIIlllIIlIl;
    public static String llllIIIlIlllIlIIIIIl;
    public static String lIIIIlIIIIIlllIllIII;
    public static boolean lIIIlllIIIllIIIllIII;
    public static int llIIlIIIlIIIllIlIIIl;
    private static int dU;
    private static int dV;
    public static int llIllIlIIIIllIlIIllI;
    public static int lIlIlIIIllIIllIIIllI;
    public static boolean IlIlIIIllIIllIlllllI;
    public static boolean IIIIlllIIIIIIlIIIlll;
    public static boolean llllIIllllIlIlIIIIll;
    public static boolean IlIllIlIlIIIlIlIlIII;
    public static boolean IIlllIIlIllIllIlIIll;
    public static boolean lllIIIIlllllIlIIllIl;
    public static boolean IlIlIIIIIIlllIlIllIl;
    private static boolean dW;
    private static boolean dX;
    private static boolean dY;
    private static boolean dZ;
    private static boolean ea;
    public static boolean IIllIIllIIIlIlIIIIlI;
    public static boolean IIIlIIIlIlIIlllIIlll;
    public static boolean IlIlIIIlIIlIlIIlllIl;
    static float[] IlllllllIIIlIIIlIlII;
    static float[] IIlIIIIlllIlllllIlII;
    static float[] IIIlIIlIIIIlllIlllII;
    static float[] IlIlIllllllllIIIIlII;
    static float[] IIlllIlIIllIlIlIlIIl;
    static float[] llIIIlIlIllIIlIlIlII;
    static float[] lllllIlIIIlIlIIlllII;
    static float[] lIllllllIIllIlIlIlII;
    private static float[] eb;
    static float llIIlllIIlllIIllIllI;
    static float IIlllIIIlIlllIIlllII;
    static float IIlIIIIIllIlIIIlIIll;
    static float llllllIllIllIlIllllI;
    static float IIIllllllIllIIIlllIl;
    static float IlIIIlIIIllllIlIlIlI;
    static long IIIIIllIIIIlIIIIllIl;
    static long IIIIIIIIIlllIllIlIlI;
    static long IIllllIIIlIIIIIIllIl;
    static float IlllIIIIlIIIlIlIlIIl;
    static float lllIllIIIllllllIllll;
    static float llIllIlIlIIIIIIIllII;
    static int IIlIlIlIIlIllIIIIIIl;
    static long IllIllIIIIlIIlIlllII;
    static long IlIllllIIlIIlIlIlIll;
    static long IllIllIlllIllllIIllI;
    static int llIlIIIIIlIIlIlIIlll;
    static float IlIIlIlIIIlIIlIlIlII;
    static float IllIlIIllIllIIlIllII;
    static int lIIlIIIlIllIlIllIIIl;
    static float IIlIIIlllIllIllIlIII;
    static float lIlIlIlllIIlIlIlllIl;
    public static float llIIIIIIlIllIIlIIIll;
    public static float lIIIIlIlIllllIIlIllI;
    public static float llIIIlIlllIllIIlIllI;
    static boolean IlIIllIIllIIllIIlIIl;
    static int lllllIIIIIlIlIIIIIIl;
    static int IllIIlllllIIllIIllIl;
    static float lIllIIIIIlllIIlIIllI;
    static float lIlIIlllIIlIIlIlllIl;
    static float llIIIllIlIllIllIIIIl;
    static float IIIllIIIlIlIIllIIIlI;
    static float IIlllIIlllIIIlIlllII;
    static float IlIIlllllIIllIIlllll;
    static boolean lllllIIlIlIIIlIlIIIl;
    static int IIlllllIllIllIlIlIII;
    static float llllIllllIllllIlIlII;
    static float IIlIlIllllIlllIIIIll;
    static boolean lIIllIIIllllIlllIllI;
    static boolean IllIlIllIllIlllIIlll;
    public static int IIllIIIlIIlIlIlIIIII;
    public static int llIllIIlllllllllllll;
    public static int lllllIIllIlIllIllllI;
    public static boolean IlIIIIIlIIllIIlIlIll;
    public static boolean IllllIIlIlIllIIIllII;
    public static boolean lllllIIIIIlIIlllIlIl;
    public static boolean IlIllllIIIlIllIlIIll;
    public static boolean lIIIIIlIlIIIlIIIIlIl;
    public static boolean IIllIIIlIIIIlIIlIIII;
    private static boolean ec;
    private static int ed;
    private static boolean ee;
    public static int IIIllIIllIIIIIIlIIlI;
    public static int IIIIIIIllllIlIIIIIII;
    private static IlIllIlIlIIIlIlIlIII ef;
    public static lIlIlIIIllIIllIIIllI IIlllIIIllIllIIlIlIl;
    public static lIIIIlIIIIIlllIllIII llIlllIlllllIIllIIII;
    public static lIIIIlIIIIIlllIllIII lllllIlIlIlllIlllIlI;
    public static lIIIIlIIIIIlllIllIII IlIllllIIlIllIlIlIll;
    public static lIIIIlIIIIIlllIllIII lllIlIIIIIlIlllllIlI;
    public static lIIIIlIIIIIlllIllIII llIlIIIIllIlIIlIlIII;
    public static lIIIIlIIIIIlllIllIII IIIIIlllIlIIIIIIIllI;
    public static lIIIIlIIIIIlllIllIII llllllIIIIIIIlllIIll;
    public static lIIIIlIIIIIlllIllIII IIlIlllIlIlllIlIllll;
    public static lIIIIlIIIIIlllIllIII lIllllIllIllIIllllll;
    public static lIIIIlIIIIIlllIllIII lllIIIIlIlIllIIlIIIl;
    public static lIIIIlIIIIIlllIllIII IllIlllIllIIIIllllII;
    public static lIIIIlIIIIIlllIllIII lIllIlIIIllllllIIlII;
    public static lIIIIlIIIIIlllIllIII IlIllIIllIIlIIIIlIIl;
    public static lIIIIlIIIIIlllIllIII lIIlllIlllllIIlllIll;
    public static lIIIIlIIIIIlllIllIII lIllIIlIlIlllllIIIII;
    public static lIIIIlIIIIIlllIllIII lIIlIIIIIIIlIIlIlIIl;
    public static lIIIIlIIIIIlllIllIII IlIIlllIIlIlllllIIlI;
    public static lIIIIlIIIIIlllIllIII llllIlIllllIIlIIlIlI;
    public static lIIIIlIIIIIlllIllIII a;
    public static lIIIIlIIIIIlllIllIII b;
    public static lIIIIlIIIIIlllIllIII c;
    public static lIIIIlIIIIIlllIllIII d;
    public static lIIIIlIIIIIlllIllIII e;
    public static lIIIIlIIIIIlllIllIII f;
    public static lIIIIlIIIIIlllIllIII g;
    public static lIIIIlIIIIIlllIllIII h;
    public static lIIIIlIIIIIlllIllIII i;
    public static lIIIIlIIIIIlllIllIII j;
    public static lIIIIlIIIIIlllIllIII k;
    public static lIIIIlIIIIIlllIllIII l;
    public static lIIIIlIIIIIlllIllIII m;
    public static lIIIIlIIIIIlllIllIII n;
    public static lIIIIlIIIIIlllIllIII o;
    public static lIIIIlIIIIIlllIllIII p;
    public static lIIIIlIIIIIlllIllIII q;
    public static lIIIIlIIIIIlllIllIII r;
    public static lIIIIlIIIIIlllIllIII s;
    public static lIIIIlIIIIIlllIllIII t;
    public static lIIIIlIIIIIlllIllIII u;
    public static lIIIIlIIIIIlllIllIII v;
    public static llllIIIlIlllIlIIIIIl w;
    public static llIllIlIIIIllIlIIllI x;
    public static llIllIlIIIIllIlIIllI y;
    public static lIIIIlIIIIIlllIllIII z;
    public static lIIIIlIIIIIlllIllIII A;
    public static lIIIIlIIIIIlllIllIII B;
    public static lIIIIlIIIIIlllIllIII C;
    public static llllIIIlIlllIlIIIIIl D;
    public static llllIIIlIlllIlIIIIIl E;
    public static llllIIIlIlllIlIIIIIl F;
    public static llllIIIlIlllIlIIIIIl G;
    public static llllIIIlIlllIlIIIIIl H;
    public static llllIIIlIlllIlIIIIIl I;
    public static llllIIIlIlllIlIIIIIl J;
    public static llllIIIlIlllIlIIIIIl K;
    public static llllIIIlIlllIlIIIIIl L;
    public static llllIIIlIlllIlIIIIIl M;
    public static llIllIlIIIIllIlIIllI N;
    public static llIllIlIIIIllIlIIllI O;
    public static llIllIlIIIIllIlIIllI P;
    public static llIllIlIIIIllIlIIllI Q;
    public static llIllIlIIIIllIlIIllI R;
    public static llIllIlIIIIllIlIIllI S;
    public static llllIIllllIlIlIIIIll T;
    public static llllIIllllIlIlIIIIll U;
    public static llllIIllllIlIlIIIIll V;
    public static llllIIllllIlIlIIIIll W;
    public static llllIIllllIlIlIIIIll X;
    public static llllIIllllIlIlIIIIll Y;
    public static llllIIllllIlIlIIIIll Z;
    public static llllIIllllIlIlIIIIll aa;
    public static llllIIllllIlIlIIIIll ab;
    public static llllIIllllIlIlIIIIll ac;
    public static llllIIIlIlllIlIIIIIl ad;
    public static llllIIIlIlllIlIIIIIl ae;
    public static llIIlIIIlIIIllIlIIIl af;
    public static llIIlIIIlIIIllIlIIIl ag;
    public static llIIlIIIlIIIllIlIIIl ah;
    public static lIIIIlIIIIIlllIllIII ai;
    public static lIIIIlIIIIIlllIllIII aj;
    public static llllIIIlIlllIlIIIIIl ak;
    public static llllIIIlIlllIlIIIIIl al;
    public static llllIIIlIlllIlIIIIIl am;
    public static lIIIIlIIIIIlllIllIII an;
    public static llllIIIlIlllIlIIIIIl ao;
    public static llIIlIIIlIIIllIlIIIl ap;
    public static IlIlIIIllIIllIlllllI aq;
    public static lIIIIlIIIIIlllIllIII ar;
    static double as;
    static double at;
    static double au;
    static double av;
    static double aw;
    static double ax;
    static int ay;
    static int az;
    static int aA;
    public static boolean aB;
    static int aC;
    static int aD;
    static int aE;
    static int aF;
    static float aG;
    static float aH;
    static boolean aI;
    static float aJ;
    static int aK;
    static int aL;
    public static boolean aM;
    static boolean aN;
    static final int aO = 8;
    static final int aP = 8;
    static final int aQ = 3;
    static final int aR = 8;
    static final int aS = 2;
    static int aT;
    static int aU;
    static int aV;
    static int aW;
    static int aX;
    static int aY;
    static int aZ;
    static int ba;
    private static int[] eg;
    public static boolean[] bb;
    public static Vector4f[] bc;
    private static IlIlIIIIIIlllIlIllIl eh;
    public static final net.optifine.shaders.IlIllIlIlIIIlIlIlIII bd;
    public static final net.optifine.shaders.IlIllIlIlIIIlIlIlIII be;
    public static final net.optifine.shaders.IlIllIlIlIIIlIlIlIII bf;
    public static final net.optifine.shaders.IlIllIlIlIIIlIlIlIII bg;
    public static final net.optifine.shaders.IlIllIlIlIIIlIlIlIII bh;
    public static final net.optifine.shaders.IlIllIlIlIIIlIlIlIII bi;
    public static final net.optifine.shaders.IlIllIlIlIIIlIlIlIII bj;
    public static final net.optifine.shaders.IlIllIlIlIIIlIlIlIII bk;
    public static final net.optifine.shaders.IlIllIlIlIIIlIlIlIII bl;
    public static final net.optifine.shaders.IlIllIlIlIIIlIlIlIII bm;
    public static final net.optifine.shaders.IlIllIlIlIIIlIlIlIII bn;
    public static final net.optifine.shaders.IlIllIlIlIIIlIlIlIII bo;
    public static final net.optifine.shaders.IlIllIlIlIIIlIlIlIII bp;
    public static final net.optifine.shaders.IlIllIlIlIIIlIlIlIII bq;
    public static final net.optifine.shaders.IlIllIlIlIIIlIlIlIII br;
    public static final net.optifine.shaders.IlIllIlIlIIIlIlIlIII bs;
    public static final net.optifine.shaders.IlIllIlIlIIIlIlIlIII bt;
    public static final net.optifine.shaders.IlIllIlIlIIIlIlIlIII bu;
    public static final net.optifine.shaders.IlIllIlIlIIIlIlIlIII bv;
    public static final net.optifine.shaders.IlIllIlIlIIIlIlIlIII bw;
    public static final net.optifine.shaders.IlIllIlIlIIIlIlIlIII bx;
    public static final net.optifine.shaders.IlIllIlIlIIIlIlIlIII by;
    public static final net.optifine.shaders.IlIllIlIlIIIlIlIlIII bz;
    public static final net.optifine.shaders.IlIllIlIlIIIlIlIlIII bA;
    public static final net.optifine.shaders.IlIllIlIlIIIlIlIlIII bB;
    public static final net.optifine.shaders.IlIllIlIlIIIlIlIlIII[] bC;
    public static final net.optifine.shaders.IlIllIlIlIIIlIlIlIII bD;
    public static final net.optifine.shaders.IlIllIlIlIIIlIlIlIII bE;
    public static final net.optifine.shaders.IlIllIlIlIIIlIlIlIII bF;
    public static final net.optifine.shaders.IlIllIlIlIIIlIlIlIII bG;
    public static final net.optifine.shaders.IlIllIlIlIIIlIlIlIII[] bH;
    public static final net.optifine.shaders.IlIllIlIlIIIlIlIlIII bI;
    public static final net.optifine.shaders.IlIllIlIlIIIlIlIlIII bJ;
    public static final int bK;
    public static final net.optifine.shaders.IlIllIlIlIIIlIlIlIII[] bL;
    public static net.optifine.shaders.IlIllIlIlIIIlIlIlIII bM;
    public static int bN;
    private static IIlllIIlIllIllIlIIll ei;
    private static boolean ej;
    static IntBuffer bO;
    private static int ek;
    public static Properties bP;
    public static Properties bQ;
    public static IlIIIlIlIIIllIlIlIIl bR;
    public static boolean[] bS;
    public static boolean[] bT;
    public static boolean[] bU;
    public static boolean[] bV;
    public static boolean[] bW;
    public static boolean bX;
    public static boolean bY;
    public static float bZ;
    public static float ca;
    public static float cb;
    public static int cc;
    public static int cd;
    public static int ce;
    public static int cf;
    public static int cg;
    public static int ch;
    public static boolean ci;
    public static boolean cj;
    public static boolean ck;
    public static net.optifine.shaders.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII cl;
    public static net.optifine.shaders.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII cm;
    public static int cn;
    public static final int co = 3;
    public static final int cp = 2;
    public static final String[] cq;
    public static final String[] cr;
    public static final int[] cs;
    public static final int[] ct;
    private static net.optifine.shaders.lIlIlIIIllIIllIIIllI el;
    public static boolean cu;
    public static String cv;
    public static final String cw = "OFF";
    public static final String cx = "(internal)";
    public static final String cy = "shaderpacks";
    public static final String cz = "optionsshaders.txt";
    public static final File cA;
    static File cB;
    private static IIIIlllIIIIIIlIIIlll[] em;
    private static Set en;
    static IlIlIllllllllIIIIlII[] cC;
    static Map cD;
    static Map cE;
    public static final String cF = "/shaders/shaders.properties";
    public static net.optifine.shaders.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl cG;
    public static net.optifine.shaders.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII cH;
    public static net.optifine.shaders.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII cI;
    public static net.optifine.shaders.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII cJ;
    public static net.optifine.shaders.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII cK;
    public static net.optifine.shaders.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII cL;
    public static net.optifine.shaders.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII cM;
    public static net.optifine.shaders.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII cN;
    public static net.optifine.shaders.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII cO;
    public static net.optifine.shaders.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII cP;
    public static net.optifine.shaders.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII cQ;
    public static net.optifine.shaders.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII cR;
    public static net.optifine.shaders.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII cS;
    public static net.optifine.shaders.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII cT;
    public static net.optifine.shaders.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII cU;
    public static net.optifine.shaders.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII cV;
    public static net.optifine.shaders.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII cW;
    private static Map eo;
    private static IlllllllIIIlIIIlIlII ep;
    private static List eq;
    private static net.optifine.shaders.llIllIlIIIIllIlIIllI[] er;
    private static net.optifine.shaders.llIllIlIIIIllIlIIllI[] es;
    private static net.optifine.shaders.llIllIlIIIIllIlIIllI[] et;
    private static String eu;
    private static IlIlIlIlIlllllllllIl ev;
    private static final int ew = 0;
    private static final int ex = 1;
    private static final int ey = 2;
    private static final String[] ez;
    public static final boolean cX = true;
    private static final boolean eA = true;
    public static final boolean cY;
    public static float cZ;
    public static float da;
    public static float db;
    public static float dc;
    public static float dd;
    public static float de;
    public static int df;
    public static float dg;
    public static float dh;
    public static float di;
    public static float dj;
    public static float dk;
    public static int dl;
    public static int[] dm;
    private static net.optifine.shaders.llIllIlIIIIllIlIIllI eB;
    private static boolean eC;
    private static int eD;
    static final int[] dn;
    private static final int eE;
    private static final ByteBuffer eF;
    static final float[] do;
    static final float[] dp;
    static final float[] dq;
    static final float[] dr;
    static final float[] ds;
    static final float[] dt;
    static final float[] du;
    static final float[] dv;
    static final FloatBuffer dw;
    static final FloatBuffer dx;
    static final FloatBuffer dy;
    static final FloatBuffer dz;
    static final FloatBuffer dA;
    static final FloatBuffer dB;
    static final FloatBuffer dC;
    static final FloatBuffer dD;
    static final FloatBuffer dE;
    static final FloatBuffer dF;
    static final FloatBuffer dG;
    static final FloatBuffer dH;
    static final IntBuffer dI;
    static final IntBuffer dJ;
    static final IntBuffer dK;
    static final IntBuffer dL;
    static final IntBuffer dM;
    static final IntBuffer dN;
    static final IntBuffer dO;
    static final IntBuffer dP;
    static final lIIIlllIIIllIIIllIII dQ;
    static Map dR;
    private static final String[] eG;
    private static final int[] eH;
    private static final Pattern eI;
    public static int[] dS;
    public static int dT;
    private static volatile /* synthetic */ int[] eJ;
    private static volatile /* synthetic */ int[] eK;
    private static volatile /* synthetic */ int[] eL;
    private static volatile /* synthetic */ int[] eM;
    
    static {
        net.optifine.shaders.llIIlllIIlllIIllIllI.llIllIIIIIllIlIIIIlI = false;
        net.optifine.shaders.llIIlllIIlllIIllIllI.IlIIIlIlIIIllIlIlIIl = false;
        net.optifine.shaders.llIIlllIIlllIIllIllI.lIIIlllIIIllIIIllIII = false;
        net.optifine.shaders.llIIlllIIlllIIllIllI.llIIlIIIlIIIllIlIIIl = 0;
        net.optifine.shaders.llIIlllIIlllIIllIllI.dU = 0;
        net.optifine.shaders.llIIlllIIlllIIllIllI.dV = 0;
        net.optifine.shaders.llIIlllIIlllIIllIllI.llIllIlIIIIllIlIIllI = 0;
        net.optifine.shaders.llIIlllIIlllIIllIllI.lIlIlIIIllIIllIIIllI = 0;
        net.optifine.shaders.llIIlllIIlllIIllIllI.IlIlIIIllIIllIlllllI = false;
        net.optifine.shaders.llIIlllIIlllIIllIllI.IIIIlllIIIIIIlIIIlll = false;
        net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIllllIlIlIIIIll = false;
        net.optifine.shaders.llIIlllIIlllIIllIllI.IlIllIlIlIIIlIlIlIII = false;
        net.optifine.shaders.llIIlllIIlllIIllIllI.IIlllIIlIllIllIlIIll = false;
        net.optifine.shaders.llIIlllIIlllIIllIllI.lllIIIIlllllIlIIllIl = false;
        net.optifine.shaders.llIIlllIIlllIIllIllI.IIllIIllIIIlIlIIIIlI = false;
        net.optifine.shaders.llIIlllIIlllIIllIllI.IIIlIIIlIlIIlllIIlll = false;
        net.optifine.shaders.llIIlllIIlllIIllIllI.IlIlIIIlIIlIlIIlllIl = false;
        net.optifine.shaders.llIIlllIIlllIIllIllI.IlllllllIIIlIIIlIlII = new float[4];
        net.optifine.shaders.llIIlllIIlllIIllIllI.IIlIIIIlllIlllllIlII = new float[4];
        net.optifine.shaders.llIIlllIIlllIIllIllI.IIIlIIlIIIIlllIlllII = new float[4];
        net.optifine.shaders.llIIlllIIlllIIllIllI.IlIlIllllllllIIIIlII = new float[4];
        net.optifine.shaders.llIIlllIIlllIIllIllI.IIlllIlIIllIlIlIlIIl = new float[4];
        net.optifine.shaders.llIIlllIIlllIIllIllI.llIIIlIlIllIIlIlIlII = new float[] { 0.0f, 100.0f, 0.0f, 0.0f };
        net.optifine.shaders.llIIlllIIlllIIllIllI.lllllIlIIIlIlIIlllII = new float[] { 0.0f, 100.0f, 0.0f, 0.0f };
        net.optifine.shaders.llIIlllIIlllIIllIllI.lIllllllIIllIlIlIlII = new float[] { 0.0f, -100.0f, 0.0f, 0.0f };
        net.optifine.shaders.llIIlllIIlllIIllIllI.eb = new float[16];
        net.optifine.shaders.llIIlllIIlllIIllIllI.IIIIIllIIIIlIIIIllIl = 0L;
        net.optifine.shaders.llIIlllIIlllIIllIllI.IIIIIIIIIlllIllIlIlI = 0L;
        net.optifine.shaders.llIIlllIIlllIIllIllI.IIllllIIIlIIIIIIllIl = 0L;
        net.optifine.shaders.llIIlllIIlllIIllIllI.IlllIIIIlIIIlIlIlIIl = 0.0f;
        net.optifine.shaders.llIIlllIIlllIIllIllI.lllIllIIIllllllIllll = 0.0f;
        net.optifine.shaders.llIIlllIIlllIIllIllI.llIllIlIlIIIIIIIllII = 0.0f;
        net.optifine.shaders.llIIlllIIlllIIllIllI.IIlIlIlIIlIllIIIIIIl = 0;
        net.optifine.shaders.llIIlllIIlllIIllIllI.IllIllIIIIlIIlIlllII = 0L;
        net.optifine.shaders.llIIlllIIlllIIllIllI.IlIllllIIlIIlIlIlIll = 0L;
        net.optifine.shaders.llIIlllIIlllIIllIllI.IllIllIlllIllllIIllI = 0L;
        net.optifine.shaders.llIIlllIIlllIIllIllI.llIlIIIIIlIIlIlIIlll = 0;
        net.optifine.shaders.llIIlllIIlllIIllIllI.IlIIlIlIIIlIIlIlIlII = 0.0f;
        net.optifine.shaders.llIIlllIIlllIIllIllI.IllIlIIllIllIIlIllII = 0.0f;
        net.optifine.shaders.llIIlllIIlllIIllIllI.lIIlIIIlIllIlIllIIIl = 0;
        net.optifine.shaders.llIIlllIIlllIIllIllI.IIlIIIlllIllIllIlIII = 0.0f;
        net.optifine.shaders.llIIlllIIlllIIllIllI.lIlIlIlllIIlIlIlllIl = 0.0f;
        net.optifine.shaders.llIIlllIIlllIIllIllI.llIIIIIIlIllIIlIIIll = 600.0f;
        net.optifine.shaders.llIIlllIIlllIIllIllI.lIIIIlIlIllllIIlIllI = 200.0f;
        net.optifine.shaders.llIIlllIIlllIIllIllI.llIIIlIlllIllIIlIllI = 10.0f;
        net.optifine.shaders.llIIlllIIlllIIllIllI.IlIIllIIllIIllIIlIIl = false;
        net.optifine.shaders.llIIlllIIlllIIllIllI.lllllIIIIIlIlIIIIIIl = 0;
        net.optifine.shaders.llIIlllIIlllIIllIllI.IllIIlllllIIllIIllIl = 0;
        net.optifine.shaders.llIIlllIIlllIIllIllI.lIllIIIIIlllIIlIIllI = 0.0f;
        net.optifine.shaders.llIIlllIIlllIIllIllI.lIlIIlllIIlIIlIlllIl = 0.0f;
        net.optifine.shaders.llIIlllIIlllIIllIllI.llIIIllIlIllIllIIIIl = 0.0f;
        net.optifine.shaders.llIIlllIIlllIIllIllI.IIIllIIIlIlIIllIIIlI = 0.0f;
        net.optifine.shaders.llIIlllIIlllIIllIllI.IIlllIIlllIIIlIlllII = 0.0f;
        net.optifine.shaders.llIIlllIIlllIIllIllI.IlIIlllllIIllIIlllll = 1.0f;
        net.optifine.shaders.llIIlllIIlllIIllIllI.lllllIIlIlIIIlIlIIIl = false;
        net.optifine.shaders.llIIlllIIlllIIllIllI.IIlllllIllIllIlIlIII = 1;
        net.optifine.shaders.llIIlllIIlllIIllIllI.llllIllllIllllIlIlII = 0.0f;
        net.optifine.shaders.llIIlllIIlllIIllIllI.IIlIlIllllIlllIIIIll = 0.0f;
        net.optifine.shaders.llIIlllIIlllIIllIllI.lIIllIIIllllIlllIllI = false;
        net.optifine.shaders.llIIlllIIlllIIllIllI.IllIlIllIllIlllIIlll = true;
        net.optifine.shaders.llIIlllIIlllIIllIllI.IIllIIIlIIlIlIlIIIII = 10;
        net.optifine.shaders.llIIlllIIlllIIllIllI.llIllIIlllllllllllll = 11;
        net.optifine.shaders.llIIlllIIlllIIllIllI.lllllIIllIlIllIllllI = 12;
        net.optifine.shaders.llIIlllIIlllIIllIllI.IlIIIIIlIIllIIlIlIll = false;
        net.optifine.shaders.llIIlllIIlllIIllIllI.IllllIIlIlIllIIIllII = false;
        net.optifine.shaders.llIIlllIIlllIIllIllI.lllllIIIIIlIIlllIlIl = false;
        net.optifine.shaders.llIIlllIIlllIIllIllI.IlIllllIIIlIllIlIIll = false;
        net.optifine.shaders.llIIlllIIlllIIllIllI.lIIIIIlIlIIIlIIIIlIl = false;
        net.optifine.shaders.llIIlllIIlllIIllIllI.IIllIIIlIIIIlIIlIIII = false;
        net.optifine.shaders.llIIlllIIlllIIllIllI.ec = false;
        net.optifine.shaders.llIIlllIIlllIIllIllI.ed = 3;
        net.optifine.shaders.llIIlllIIlllIIllIllI.ee = false;
        net.optifine.shaders.llIIlllIIlllIIllIllI.IIIllIIllIIIIIIlIIlI = 0;
        net.optifine.shaders.llIIlllIIlllIIllIllI.IIIIIIIllllIlIIIIIII = 0;
        net.optifine.shaders.llIIlllIIlllIIllIllI.ef = new IlIllIlIlIIIlIlIlIII();
        net.optifine.shaders.llIIlllIIlllIIllIllI.IIlllIIIllIllIIlIlIl = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.IllIIlllIIIIlllIIlIl("entityColor");
        net.optifine.shaders.llIIlllIIlllIIllIllI.llIlllIlllllIIllIIII = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.llllIIIIlIIIlIlllIll("entityId");
        net.optifine.shaders.llIIlllIIlllIIllIllI.lllllIlIlIlllIlllIlI = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.llllIIIIlIIIlIlllIll("blockEntityId");
        net.optifine.shaders.llIIlllIIlllIIllIllI.IlIllllIIlIllIlIlIll = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.llllIIIIlIIIlIlllIll("texture");
        net.optifine.shaders.llIIlllIIlllIIllIllI.lllIlIIIIIlIlllllIlI = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.llllIIIIlIIIlIlllIll("lightmap");
        net.optifine.shaders.llIIlllIIlllIIllIllI.llIlIIIIllIlIIlIlIII = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.llllIIIIlIIIlIlllIll("normals");
        net.optifine.shaders.llIIlllIIlllIIllIllI.IIIIIlllIlIIIIIIIllI = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.llllIIIIlIIIlIlllIll("specular");
        net.optifine.shaders.llIIlllIIlllIIllIllI.llllllIIIIIIIlllIIll = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.llllIIIIlIIIlIlllIll("shadow");
        net.optifine.shaders.llIIlllIIlllIIllIllI.IIlIlllIlIlllIlIllll = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.llllIIIIlIIIlIlllIll("watershadow");
        net.optifine.shaders.llIIlllIIlllIIllIllI.lIllllIllIllIIllllll = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.llllIIIIlIIIlIlllIll("shadowtex0");
        net.optifine.shaders.llIIlllIIlllIIllIllI.lllIIIIlIlIllIIlIIIl = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.llllIIIIlIIIlIlllIll("shadowtex1");
        net.optifine.shaders.llIIlllIIlllIIllIllI.IllIlllIllIIIIllllII = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.llllIIIIlIIIlIlllIll("depthtex0");
        net.optifine.shaders.llIIlllIIlllIIllIllI.lIllIlIIIllllllIIlII = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.llllIIIIlIIIlIlllIll("depthtex1");
        net.optifine.shaders.llIIlllIIlllIIllIllI.IlIllIIllIIlIIIIlIIl = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.llllIIIIlIIIlIlllIll("shadowcolor");
        net.optifine.shaders.llIIlllIIlllIIllIllI.lIIlllIlllllIIlllIll = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.llllIIIIlIIIlIlllIll("shadowcolor0");
        net.optifine.shaders.llIIlllIIlllIIllIllI.lIllIIlIlIlllllIIIII = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.llllIIIIlIIIlIlllIll("shadowcolor1");
        net.optifine.shaders.llIIlllIIlllIIllIllI.lIIlIIIIIIIlIIlIlIIl = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.llllIIIIlIIIlIlllIll("noisetex");
        net.optifine.shaders.llIIlllIIlllIIllIllI.IlIIlllIIlIlllllIIlI = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.llllIIIIlIIIlIlllIll("gcolor");
        net.optifine.shaders.llIIlllIIlllIIllIllI.llllIlIllllIIlIIlIlI = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.llllIIIIlIIIlIlllIll("gdepth");
        net.optifine.shaders.llIIlllIIlllIIllIllI.a = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.llllIIIIlIIIlIlllIll("gnormal");
        net.optifine.shaders.llIIlllIIlllIIllIllI.b = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.llllIIIIlIIIlIlllIll("composite");
        net.optifine.shaders.llIIlllIIlllIIllIllI.c = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.llllIIIIlIIIlIlllIll("gaux1");
        net.optifine.shaders.llIIlllIIlllIIllIllI.d = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.llllIIIIlIIIlIlllIll("gaux2");
        net.optifine.shaders.llIIlllIIlllIIllIllI.e = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.llllIIIIlIIIlIlllIll("gaux3");
        net.optifine.shaders.llIIlllIIlllIIllIllI.f = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.llllIIIIlIIIlIlllIll("gaux4");
        net.optifine.shaders.llIIlllIIlllIIllIllI.g = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.llllIIIIlIIIlIlllIll("colortex0");
        net.optifine.shaders.llIIlllIIlllIIllIllI.h = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.llllIIIIlIIIlIlllIll("colortex1");
        net.optifine.shaders.llIIlllIIlllIIllIllI.i = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.llllIIIIlIIIlIlllIll("colortex2");
        net.optifine.shaders.llIIlllIIlllIIllIllI.j = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.llllIIIIlIIIlIlllIll("colortex3");
        net.optifine.shaders.llIIlllIIlllIIllIllI.k = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.llllIIIIlIIIlIlllIll("colortex4");
        net.optifine.shaders.llIIlllIIlllIIllIllI.l = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.llllIIIIlIIIlIlllIll("colortex5");
        net.optifine.shaders.llIIlllIIlllIIllIllI.m = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.llllIIIIlIIIlIlllIll("colortex6");
        net.optifine.shaders.llIIlllIIlllIIllIllI.n = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.llllIIIIlIIIlIlllIll("colortex7");
        net.optifine.shaders.llIIlllIIlllIIllIllI.o = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.llllIIIIlIIIlIlllIll("gdepthtex");
        net.optifine.shaders.llIIlllIIlllIIllIllI.p = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.llllIIIIlIIIlIlllIll("depthtex2");
        net.optifine.shaders.llIIlllIIlllIIllIllI.q = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.llllIIIIlIIIlIlllIll("tex");
        net.optifine.shaders.llIIlllIIlllIIllIllI.r = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.llllIIIIlIIIlIlllIll("heldItemId");
        net.optifine.shaders.llIIlllIIlllIIllIllI.s = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.llllIIIIlIIIlIlllIll("heldBlockLightValue");
        net.optifine.shaders.llIIlllIIlllIIllIllI.t = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.llllIIIIlIIIlIlllIll("heldItemId2");
        net.optifine.shaders.llIIlllIIlllIIllIllI.u = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.llllIIIIlIIIlIlllIll("heldBlockLightValue2");
        net.optifine.shaders.llIIlllIIlllIIllIllI.v = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.llllIIIIlIIIlIlllIll("fogMode");
        net.optifine.shaders.llIIlllIIlllIIllIllI.w = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.IlIIIlIlIIIllIlIlIIl("fogDensity");
        net.optifine.shaders.llIIlllIIlllIIllIllI.x = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.IlIlIIIllIllIIIIIllI("fogColor");
        net.optifine.shaders.llIIlllIIlllIIllIllI.y = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.IlIlIIIllIllIIIIIllI("skyColor");
        net.optifine.shaders.llIIlllIIlllIIllIllI.z = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.llllIIIIlIIIlIlllIll("worldTime");
        net.optifine.shaders.llIIlllIIlllIIllIllI.A = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.llllIIIIlIIIlIlllIll("worldDay");
        net.optifine.shaders.llIIlllIIlllIIllIllI.B = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.llllIIIIlIIIlIlllIll("moonPhase");
        net.optifine.shaders.llIIlllIIlllIIllIllI.C = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.llllIIIIlIIIlIlllIll("frameCounter");
        net.optifine.shaders.llIIlllIIlllIIllIllI.D = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.IlIIIlIlIIIllIlIlIIl("frameTime");
        net.optifine.shaders.llIIlllIIlllIIllIllI.E = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.IlIIIlIlIIIllIlIlIIl("frameTimeCounter");
        net.optifine.shaders.llIIlllIIlllIIllIllI.F = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.IlIIIlIlIIIllIlIlIIl("sunAngle");
        net.optifine.shaders.llIIlllIIlllIIllIllI.G = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.IlIIIlIlIIIllIlIlIIl("shadowAngle");
        net.optifine.shaders.llIIlllIIlllIIllIllI.H = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.IlIIIlIlIIIllIlIlIIl("rainStrength");
        net.optifine.shaders.llIIlllIIlllIIllIllI.I = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.IlIIIlIlIIIllIlIlIIl("aspectRatio");
        net.optifine.shaders.llIIlllIIlllIIllIllI.J = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.IlIIIlIlIIIllIlIlIIl("viewWidth");
        net.optifine.shaders.llIIlllIIlllIIllIllI.K = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.IlIIIlIlIIIllIlIlIIl("viewHeight");
        net.optifine.shaders.llIIlllIIlllIIllIllI.L = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.IlIIIlIlIIIllIlIlIIl("near");
        net.optifine.shaders.llIIlllIIlllIIllIllI.M = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.IlIIIlIlIIIllIlIlIIl("far");
        net.optifine.shaders.llIIlllIIlllIIllIllI.N = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.IlIlIIIllIllIIIIIllI("sunPosition");
        net.optifine.shaders.llIIlllIIlllIIllIllI.O = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.IlIlIIIllIllIIIIIllI("moonPosition");
        net.optifine.shaders.llIIlllIIlllIIllIllI.P = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.IlIlIIIllIllIIIIIllI("shadowLightPosition");
        net.optifine.shaders.llIIlllIIlllIIllIllI.Q = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.IlIlIIIllIllIIIIIllI("upPosition");
        net.optifine.shaders.llIIlllIIlllIIllIllI.R = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.IlIlIIIllIllIIIIIllI("previousCameraPosition");
        net.optifine.shaders.llIIlllIIlllIIllIllI.S = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.IlIlIIIllIllIIIIIllI("cameraPosition");
        net.optifine.shaders.llIIlllIIlllIIllIllI.T = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.llllIIIlIlllIlIIIIIl("gbufferModelView");
        net.optifine.shaders.llIIlllIIlllIIllIllI.U = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.llllIIIlIlllIlIIIIIl("gbufferModelViewInverse");
        net.optifine.shaders.llIIlllIIlllIIllIllI.V = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.llllIIIlIlllIlIIIIIl("gbufferPreviousProjection");
        net.optifine.shaders.llIIlllIIlllIIllIllI.W = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.llllIIIlIlllIlIIIIIl("gbufferProjection");
        net.optifine.shaders.llIIlllIIlllIIllIllI.X = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.llllIIIlIlllIlIIIIIl("gbufferProjectionInverse");
        net.optifine.shaders.llIIlllIIlllIIllIllI.Y = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.llllIIIlIlllIlIIIIIl("gbufferPreviousModelView");
        net.optifine.shaders.llIIlllIIlllIIllIllI.Z = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.llllIIIlIlllIlIIIIIl("shadowProjection");
        net.optifine.shaders.llIIlllIIlllIIllIllI.aa = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.llllIIIlIlllIlIIIIIl("shadowProjectionInverse");
        net.optifine.shaders.llIIlllIIlllIIllIllI.ab = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.llllIIIlIlllIlIIIIIl("shadowModelView");
        net.optifine.shaders.llIIlllIIlllIIllIllI.ac = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.llllIIIlIlllIlIIIIIl("shadowModelViewInverse");
        net.optifine.shaders.llIIlllIIlllIIllIllI.ad = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.IlIIIlIlIIIllIlIlIIl("wetness");
        net.optifine.shaders.llIIlllIIlllIIllIllI.ae = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.IlIIIlIlIIIllIlIlIIl("eyeAltitude");
        net.optifine.shaders.llIIlllIIlllIIllIllI.af = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.IlIlIlIlIlllllllllIl("eyeBrightness");
        net.optifine.shaders.llIIlllIIlllIIllIllI.ag = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.IlIlIlIlIlllllllllIl("eyeBrightnessSmooth");
        net.optifine.shaders.llIIlllIIlllIIllIllI.ah = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.IlIlIlIlIlllllllllIl("terrainTextureSize");
        net.optifine.shaders.llIIlllIIlllIIllIllI.ai = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.llllIIIIlIIIlIlllIll("terrainIconSize");
        net.optifine.shaders.llIIlllIIlllIIllIllI.aj = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.llllIIIIlIIIlIlllIll("isEyeInWater");
        net.optifine.shaders.llIIlllIIlllIIllIllI.ak = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.IlIIIlIlIIIllIlIlIIl("nightVision");
        net.optifine.shaders.llIIlllIIlllIIllIllI.al = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.IlIIIlIlIIIllIlIlIIl("blindness");
        net.optifine.shaders.llIIlllIIlllIIllIllI.am = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.IlIIIlIlIIIllIlIlIIl("screenBrightness");
        net.optifine.shaders.llIIlllIIlllIIllIllI.an = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.llllIIIIlIIIlIlllIll("hideGUI");
        net.optifine.shaders.llIIlllIIlllIIllIllI.ao = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.IlIIIlIlIIIllIlIlIIl("centerDepthSmooth");
        net.optifine.shaders.llIIlllIIlllIIllIllI.ap = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.IlIlIlIlIlllllllllIl("atlasSize");
        net.optifine.shaders.llIIlllIIlllIIllIllI.aq = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.llIllIIIIIllIlIIIIlI("blendFunc");
        net.optifine.shaders.llIIlllIIlllIIllIllI.ar = net.optifine.shaders.llIIlllIIlllIIllIllI.ef.llllIIIIlIIIlIlllIll("instanceId");
        net.optifine.shaders.llIIlllIIlllIIllIllI.aA = 0;
        net.optifine.shaders.llIIlllIIlllIIllIllI.aB = false;
        net.optifine.shaders.llIIlllIIlllIIllIllI.aC = 1024;
        net.optifine.shaders.llIIlllIIlllIIllIllI.aD = 1024;
        net.optifine.shaders.llIIlllIIlllIIllIllI.aE = 1024;
        net.optifine.shaders.llIIlllIIlllIIllIllI.aF = 1024;
        net.optifine.shaders.llIIlllIIlllIIllIllI.aG = 90.0f;
        net.optifine.shaders.llIIlllIIlllIIllIllI.aH = 160.0f;
        net.optifine.shaders.llIIlllIIlllIIllIllI.aI = true;
        net.optifine.shaders.llIIlllIIlllIIllIllI.aJ = -1.0f;
        net.optifine.shaders.llIIlllIIlllIIllIllI.aK = 0;
        net.optifine.shaders.llIIlllIIlllIIllIllI.aM = false;
        net.optifine.shaders.llIIlllIIlllIIllIllI.aN = false;
        net.optifine.shaders.llIIlllIIlllIIllIllI.aT = 0;
        net.optifine.shaders.llIIlllIIlllIIllIllI.aU = 0;
        net.optifine.shaders.llIIlllIIlllIIllIllI.aV = 0;
        net.optifine.shaders.llIIlllIIlllIIllIllI.aW = 0;
        net.optifine.shaders.llIIlllIIlllIIllIllI.aX = 0;
        net.optifine.shaders.llIIlllIIlllIIllIllI.aY = 0;
        net.optifine.shaders.llIIlllIIlllIIllIllI.aZ = 0;
        net.optifine.shaders.llIIlllIIlllIIllIllI.ba = 0;
        net.optifine.shaders.llIIlllIIlllIIllIllI.eg = new int[8];
        net.optifine.shaders.llIIlllIIlllIIllIllI.bb = new boolean[8];
        net.optifine.shaders.llIIlllIIlllIIllIllI.bc = new Vector4f[8];
        net.optifine.shaders.llIIlllIIlllIIllIllI.eh = new IlIlIIIIIIlllIlIllIl();
        bd = net.optifine.shaders.llIIlllIIlllIIllIllI.eh.llllIIIIlIIIlIlllIll();
        be = net.optifine.shaders.llIIlllIIlllIIllIllI.eh.IlIlIlIlIlllllllllIl("shadow", net.optifine.shaders.llIIlllIIlllIIllIllI.bd);
        bf = net.optifine.shaders.llIIlllIIlllIIllIllI.eh.IlIlIlIlIlllllllllIl("shadow_solid", net.optifine.shaders.llIIlllIIlllIIllIllI.be);
        bg = net.optifine.shaders.llIIlllIIlllIIllIllI.eh.IlIlIlIlIlllllllllIl("shadow_cutout", net.optifine.shaders.llIIlllIIlllIIllIllI.be);
        bh = net.optifine.shaders.llIIlllIIlllIIllIllI.eh.llllIIIIlIIIlIlllIll("gbuffers_basic", net.optifine.shaders.llIIlllIIlllIIllIllI.bd);
        bi = net.optifine.shaders.llIIlllIIlllIIllIllI.eh.llllIIIIlIIIlIlllIll("gbuffers_textured", net.optifine.shaders.llIIlllIIlllIIllIllI.bh);
        bj = net.optifine.shaders.llIIlllIIlllIIllIllI.eh.llllIIIIlIIIlIlllIll("gbuffers_textured_lit", net.optifine.shaders.llIIlllIIlllIIllIllI.bi);
        bk = net.optifine.shaders.llIIlllIIlllIIllIllI.eh.llllIIIIlIIIlIlllIll("gbuffers_skybasic", net.optifine.shaders.llIIlllIIlllIIllIllI.bh);
        bl = net.optifine.shaders.llIIlllIIlllIIllIllI.eh.llllIIIIlIIIlIlllIll("gbuffers_skytextured", net.optifine.shaders.llIIlllIIlllIIllIllI.bi);
        bm = net.optifine.shaders.llIIlllIIlllIIllIllI.eh.llllIIIIlIIIlIlllIll("gbuffers_clouds", net.optifine.shaders.llIIlllIIlllIIllIllI.bi);
        bn = net.optifine.shaders.llIIlllIIlllIIllIllI.eh.llllIIIIlIIIlIlllIll("gbuffers_terrain", net.optifine.shaders.llIIlllIIlllIIllIllI.bj);
        bo = net.optifine.shaders.llIIlllIIlllIIllIllI.eh.llllIIIIlIIIlIlllIll("gbuffers_terrain_solid", net.optifine.shaders.llIIlllIIlllIIllIllI.bn);
        bp = net.optifine.shaders.llIIlllIIlllIIllIllI.eh.llllIIIIlIIIlIlllIll("gbuffers_terrain_cutout_mip", net.optifine.shaders.llIIlllIIlllIIllIllI.bn);
        bq = net.optifine.shaders.llIIlllIIlllIIllIllI.eh.llllIIIIlIIIlIlllIll("gbuffers_terrain_cutout", net.optifine.shaders.llIIlllIIlllIIllIllI.bn);
        br = net.optifine.shaders.llIIlllIIlllIIllIllI.eh.llllIIIIlIIIlIlllIll("gbuffers_damagedblock", net.optifine.shaders.llIIlllIIlllIIllIllI.bn);
        bs = net.optifine.shaders.llIIlllIIlllIIllIllI.eh.llllIIIIlIIIlIlllIll("gbuffers_block", net.optifine.shaders.llIIlllIIlllIIllIllI.bn);
        bt = net.optifine.shaders.llIIlllIIlllIIllIllI.eh.llllIIIIlIIIlIlllIll("gbuffers_beaconbeam", net.optifine.shaders.llIIlllIIlllIIllIllI.bi);
        bu = net.optifine.shaders.llIIlllIIlllIIllIllI.eh.llllIIIIlIIIlIlllIll("gbuffers_item", net.optifine.shaders.llIIlllIIlllIIllIllI.bj);
        bv = net.optifine.shaders.llIIlllIIlllIIllIllI.eh.llllIIIIlIIIlIlllIll("gbuffers_entities", net.optifine.shaders.llIIlllIIlllIIllIllI.bj);
        bw = net.optifine.shaders.llIIlllIIlllIIllIllI.eh.llllIIIIlIIIlIlllIll("gbuffers_entities_glowing", net.optifine.shaders.llIIlllIIlllIIllIllI.bv);
        bx = net.optifine.shaders.llIIlllIIlllIIllIllI.eh.llllIIIIlIIIlIlllIll("gbuffers_armor_glint", net.optifine.shaders.llIIlllIIlllIIllIllI.bi);
        by = net.optifine.shaders.llIIlllIIlllIIllIllI.eh.llllIIIIlIIIlIlllIll("gbuffers_spidereyes", net.optifine.shaders.llIIlllIIlllIIllIllI.bi);
        bz = net.optifine.shaders.llIIlllIIlllIIllIllI.eh.llllIIIIlIIIlIlllIll("gbuffers_hand", net.optifine.shaders.llIIlllIIlllIIllIllI.bj);
        bA = net.optifine.shaders.llIIlllIIlllIIllIllI.eh.llllIIIIlIIIlIlllIll("gbuffers_weather", net.optifine.shaders.llIIlllIIlllIIllIllI.bj);
        bB = net.optifine.shaders.llIIlllIIlllIIllIllI.eh.llIllIIIIIllIlIIIIlI("deferred_pre");
        bC = net.optifine.shaders.llIIlllIIlllIIllIllI.eh.IlIlIlIlIlllllllllIl("deferred", 16);
        bD = net.optifine.shaders.llIIlllIIlllIIllIllI.bC[0];
        bE = net.optifine.shaders.llIIlllIIlllIIllIllI.eh.llllIIIIlIIIlIlllIll("gbuffers_water", net.optifine.shaders.llIIlllIIlllIIllIllI.bn);
        bF = net.optifine.shaders.llIIlllIIlllIIllIllI.eh.llllIIIIlIIIlIlllIll("gbuffers_hand_water", net.optifine.shaders.llIIlllIIlllIIllIllI.bz);
        bG = net.optifine.shaders.llIIlllIIlllIIllIllI.eh.llIllIIIIIllIlIIIIlI("composite_pre");
        bH = net.optifine.shaders.llIIlllIIlllIIllIllI.eh.llllIIIIlIIIlIlllIll("composite", 16);
        bI = net.optifine.shaders.llIIlllIIlllIIllIllI.bH[0];
        bJ = net.optifine.shaders.llIIlllIIlllIIllIllI.eh.llllIIIIlIIIlIlllIll("final");
        bK = net.optifine.shaders.llIIlllIIlllIIllIllI.eh.IlIlIlIlIlllllllllIl();
        bL = net.optifine.shaders.llIIlllIIlllIIllIllI.eh.IlIIIlIlIIIllIlIlIIl();
        net.optifine.shaders.llIIlllIIlllIIllIllI.bM = net.optifine.shaders.llIIlllIIlllIIllIllI.bd;
        net.optifine.shaders.llIIlllIIlllIIllIllI.bN = 0;
        net.optifine.shaders.llIIlllIIlllIIllIllI.ei = new IIlllIIlIllIllIlIIll();
        net.optifine.shaders.llIIlllIIlllIIllIllI.ej = false;
        net.optifine.shaders.llIIlllIIlllIIllIllI.bO = null;
        net.optifine.shaders.llIIlllIIlllIIllIllI.ek = 0;
        net.optifine.shaders.llIIlllIIlllIIllIllI.bP = null;
        net.optifine.shaders.llIIlllIIlllIIllIllI.bQ = null;
        net.optifine.shaders.llIIlllIIlllIIllIllI.bR = null;
        net.optifine.shaders.llIIlllIIlllIIllIllI.bS = new boolean[2];
        net.optifine.shaders.llIIlllIIlllIIllIllI.bT = new boolean[2];
        net.optifine.shaders.llIIlllIIlllIIllIllI.bU = new boolean[2];
        net.optifine.shaders.llIIlllIIlllIIllIllI.bV = new boolean[8];
        net.optifine.shaders.llIIlllIIlllIIllIllI.bW = new boolean[8];
        net.optifine.shaders.llIIlllIIlllIIllIllI.bX = false;
        net.optifine.shaders.llIIlllIIlllIIllIllI.bY = false;
        net.optifine.shaders.llIIlllIIlllIIllIllI.bZ = 0.125f;
        net.optifine.shaders.llIIlllIIlllIIllIllI.ca = 1.0f;
        net.optifine.shaders.llIIlllIIlllIIllIllI.cb = 1.0f;
        net.optifine.shaders.llIIlllIIlllIIllIllI.cc = 0;
        net.optifine.shaders.llIIlllIIlllIIllIllI.cd = 0;
        net.optifine.shaders.llIIlllIIlllIIllIllI.ce = 0;
        net.optifine.shaders.llIIlllIIlllIIllIllI.cf = 0;
        net.optifine.shaders.llIIlllIIlllIIllIllI.cg = 0;
        net.optifine.shaders.llIIlllIIlllIIllIllI.ch = 0;
        net.optifine.shaders.llIIlllIIlllIIllIllI.ci = true;
        net.optifine.shaders.llIIlllIIlllIIllIllI.cj = true;
        net.optifine.shaders.llIIlllIIlllIIllIllI.ck = true;
        net.optifine.shaders.llIIlllIIlllIIllIllI.cl = new net.optifine.shaders.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII("oldLighting", "Classic Lighting", 0);
        net.optifine.shaders.llIIlllIIlllIIllIllI.cm = new net.optifine.shaders.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII("oldHandLight", "Old Hand Light", 0);
        net.optifine.shaders.llIIlllIIlllIIllIllI.cn = 0;
        cq = new String[] { "Nearest", "Nearest-Nearest", "Nearest-Linear" };
        cr = new String[] { "Nearest", "Linear" };
        cs = new int[] { 9728, 9984, 9986 };
        ct = new int[] { 9728, 9729 };
        net.optifine.shaders.llIIlllIIlllIIllIllI.el = null;
        net.optifine.shaders.llIIlllIIlllIIllIllI.cu = false;
        net.optifine.shaders.llIIlllIIlllIIllIllI.em = null;
        net.optifine.shaders.llIIlllIIlllIIllIllI.en = null;
        net.optifine.shaders.llIIlllIIlllIIllIllI.cC = null;
        net.optifine.shaders.llIIlllIIlllIIllIllI.cD = null;
        net.optifine.shaders.llIIlllIIlllIIllIllI.cE = new HashMap();
        net.optifine.shaders.llIIlllIIlllIIllIllI.cG = new net.optifine.shaders.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl("clouds", "Clouds", 0);
        net.optifine.shaders.llIIlllIIlllIIllIllI.cH = new net.optifine.shaders.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII("oldLighting", "Classic Lighting", 0);
        net.optifine.shaders.llIIlllIIlllIIllIllI.cI = new net.optifine.shaders.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII("oldHandLight", "Old Hand Light", 0);
        net.optifine.shaders.llIIlllIIlllIIllIllI.cJ = new net.optifine.shaders.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII("dynamicHandLight", "Dynamic Hand Light", 0);
        net.optifine.shaders.llIIlllIIlllIIllIllI.cK = new net.optifine.shaders.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII("shadowTranslucent", "Shadow Translucent", 0);
        net.optifine.shaders.llIIlllIIlllIIllIllI.cL = new net.optifine.shaders.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII("underwaterOverlay", "Underwater Overlay", 0);
        net.optifine.shaders.llIIlllIIlllIIllIllI.cM = new net.optifine.shaders.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII("sun", "Sun", 0);
        net.optifine.shaders.llIIlllIIlllIIllIllI.cN = new net.optifine.shaders.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII("moon", "Moon", 0);
        net.optifine.shaders.llIIlllIIlllIIllIllI.cO = new net.optifine.shaders.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII("vignette", "Vignette", 0);
        net.optifine.shaders.llIIlllIIlllIIllIllI.cP = new net.optifine.shaders.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII("backFace.solid", "Back-face Solid", 0);
        net.optifine.shaders.llIIlllIIlllIIllIllI.cQ = new net.optifine.shaders.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII("backFace.cutout", "Back-face Cutout", 0);
        net.optifine.shaders.llIIlllIIlllIIllIllI.cR = new net.optifine.shaders.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII("backFace.cutoutMipped", "Back-face Cutout Mipped", 0);
        net.optifine.shaders.llIIlllIIlllIIllIllI.cS = new net.optifine.shaders.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII("backFace.translucent", "Back-face Translucent", 0);
        net.optifine.shaders.llIIlllIIlllIIllIllI.cT = new net.optifine.shaders.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII("rain.depth", "Rain Depth", 0);
        net.optifine.shaders.llIIlllIIlllIIllIllI.cU = new net.optifine.shaders.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII("beacon.beam.depth", "Rain Depth", 0);
        net.optifine.shaders.llIIlllIIlllIIllIllI.cV = new net.optifine.shaders.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII("separateAo", "Separate AO", 0);
        net.optifine.shaders.llIIlllIIlllIIllIllI.cW = new net.optifine.shaders.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII("frustum.culling", "Frustum Culling", 0);
        net.optifine.shaders.llIIlllIIlllIIllIllI.eo = new HashMap();
        net.optifine.shaders.llIIlllIIlllIIllIllI.ep = null;
        net.optifine.shaders.llIIlllIIlllIIllIllI.eq = new ArrayList();
        net.optifine.shaders.llIIlllIIlllIIllIllI.er = null;
        net.optifine.shaders.llIIlllIIlllIIllIllI.es = null;
        net.optifine.shaders.llIIlllIIlllIIllIllI.et = null;
        net.optifine.shaders.llIIlllIIlllIIllIllI.eu = null;
        net.optifine.shaders.llIIlllIIlllIIllIllI.ev = null;
        ez = new String[] { "gbuffers", "composite", "deferred" };
        cY = System.getProperty("shaders.debug.save", "false").equals("true");
        net.optifine.shaders.llIIlllIIlllIIllIllI.cZ = 0.5f;
        net.optifine.shaders.llIIlllIIlllIIllIllI.da = 0.6f;
        net.optifine.shaders.llIIlllIIlllIIllIllI.db = 0.8f;
        net.optifine.shaders.llIIlllIIlllIIllIllI.dc = -1.0f;
        net.optifine.shaders.llIIlllIIlllIIllIllI.dd = 0.0f;
        net.optifine.shaders.llIIlllIIlllIIllIllI.de = 0.0f;
        net.optifine.shaders.llIIlllIIlllIIllIllI.df = 0;
        net.optifine.shaders.llIIlllIIlllIIllIllI.dg = 0.0f;
        net.optifine.shaders.llIIlllIIlllIIllIllI.dk = 2.0f;
        net.optifine.shaders.llIIlllIIlllIIllIllI.dl = 16;
        net.optifine.shaders.llIIlllIIlllIIllIllI.dm = new int[2];
        net.optifine.shaders.llIIlllIIlllIIllIllI.eC = false;
        net.optifine.shaders.llIIlllIIlllIIllIllI.eD = 256;
        dn = new int[] { 0, 1, 2, 3, 7, 8, 9, 10 };
        eE = (285 + 8 * net.optifine.shaders.llIIlllIIlllIIllIllI.bK) * 4;
        eF = (ByteBuffer)BufferUtils.createByteBuffer(net.optifine.shaders.llIIlllIIlllIIllIllI.eE).limit(0);
        do = new float[16];
        dp = new float[16];
        dq = new float[16];
        dr = new float[16];
        ds = new float[16];
        dt = new float[16];
        du = new float[16];
        dv = new float[16];
        dw = IlIlIIIllIIllIlllllI(16);
        dx = IlIlIIIllIIllIlllllI(16);
        dy = IlIlIIIllIIllIlllllI(16);
        dz = IlIlIIIllIIllIlllllI(16);
        dA = IlIlIIIllIIllIlllllI(16);
        dB = IlIlIIIllIIllIlllllI(16);
        dC = IlIlIIIllIIllIlllllI(16);
        dD = IlIlIIIllIIllIlllllI(16);
        dE = IlIlIIIllIIllIlllllI(16);
        dF = IlIlIIIllIIllIlllllI(16);
        dG = IlIlIIIllIIllIlllllI(16);
        dH = IlIlIIIllIIllIlllllI(16);
        dI = llllIIIIlIIIlIlllIll(16);
        dJ = llllIIIIlIIIlIlllIll(3);
        dK = llllIIIIlIIIlIlllIll(8);
        dL = llllIIIIlIIIlIlllIll(2);
        dM = llllIIIIlIIIlIlllIll(8);
        dN = llllIIIIlIIIlIlllIll(8);
        dO = (IntBuffer)llllIIIIlIIIlIlllIll(8).limit(0);
        dP = (IntBuffer)llllIIIIlIIIlIlllIll(8).put(36064).position(0).limit(1);
        dQ = new lIIIlllIIIllIIIllIII(net.optifine.shaders.llIIlllIIlllIIllIllI.dI, 8);
        eG = new String[] { "R8", "RG8", "RGB8", "RGBA8", "R8_SNORM", "RG8_SNORM", "RGB8_SNORM", "RGBA8_SNORM", "R16", "RG16", "RGB16", "RGBA16", "R16_SNORM", "RG16_SNORM", "RGB16_SNORM", "RGBA16_SNORM", "R16F", "RG16F", "RGB16F", "RGBA16F", "R32F", "RG32F", "RGB32F", "RGBA32F", "R32I", "RG32I", "RGB32I", "RGBA32I", "R32UI", "RG32UI", "RGB32UI", "RGBA32UI", "R3_G3_B2", "RGB5_A1", "RGB10_A2", "R11F_G11F_B10F", "RGB9_E5" };
        eH = new int[] { 33321, 33323, 32849, 32856, 36756, 36757, 36758, 36759, 33322, 33324, 32852, 32859, 36760, 36761, 36762, 36763, 33325, 33327, 34843, 34842, 33326, 33328, 34837, 34836, 33333, 33339, 36227, 36226, 33334, 33340, 36209, 36208, 10768, 32855, 32857, 35898, 35901 };
        eI = Pattern.compile("\\s*([\\w:]+)\\s*=\\s*([-]?\\d+)\\s*");
        net.optifine.shaders.llIIlllIIlllIIllIllI.dS = new int[32];
        net.optifine.shaders.llIIlllIIlllIIllIllI.dT = 0;
        cA = new File(Minecraft.getMinecraft().mcDataDir, "shaderpacks");
        net.optifine.shaders.llIIlllIIlllIIllIllI.cB = new File(Minecraft.getMinecraft().mcDataDir, "optionsshaders.txt");
    }
    
    private static ByteBuffer lIlIlIIIllIIllIIIllI(final int n) {
        final ByteBuffer ef = net.optifine.shaders.llIIlllIIlllIIllIllI.eF;
        final int limit = ef.limit();
        ef.position(limit).limit(limit + n);
        return ef.slice();
    }
    
    public static IntBuffer llllIIIIlIIIlIlllIll(final int n) {
        final ByteBuffer ef = net.optifine.shaders.llIIlllIIlllIIllIllI.eF;
        final int limit = ef.limit();
        ef.position(limit).limit(limit + n * 4);
        return ef.asIntBuffer();
    }
    
    private static FloatBuffer IlIlIIIllIIllIlllllI(final int n) {
        final ByteBuffer ef = net.optifine.shaders.llIIlllIIlllIIllIllI.eF;
        final int limit = ef.limit();
        ef.position(limit).limit(limit + n * 4);
        return ef.asFloatBuffer();
    }
    
    private static IntBuffer[] llIllIIIIIllIlIIIIlI(final int n, final int n2) {
        final IntBuffer[] array = new IntBuffer[n];
        for (int i = 0; i < n; ++i) {
            array[i] = llllIIIIlIIIlIlllIll(n2);
        }
        return array;
    }
    
    public static void llllIIIIlIIIlIlllIll() {
        net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("Load shaders configuration.");
        try {
            if (!net.optifine.shaders.llIIlllIIlllIIllIllI.cA.exists()) {
                net.optifine.shaders.llIIlllIIlllIIllIllI.cA.mkdir();
            }
        }
        catch (Exception ex) {
            net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll("Failed to open the shaderpacks directory: " + net.optifine.shaders.llIIlllIIlllIIllIllI.cA);
        }
        (net.optifine.shaders.llIIlllIIlllIIllIllI.bQ = new net.optifine.util.llIIlllIIlllIIllIllI()).setProperty(net.optifine.shaders.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl(), "");
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.cB.exists()) {
            try {
                final FileReader fileReader = new FileReader(net.optifine.shaders.llIIlllIIlllIIllIllI.cB);
                net.optifine.shaders.llIIlllIIlllIIllIllI.bQ.load(fileReader);
                fileReader.close();
            }
            catch (Exception ex2) {}
        }
        if (!net.optifine.shaders.llIIlllIIlllIIllIllI.cB.exists()) {
            try {
                IlIlIlIlIlllllllllIl();
            }
            catch (Exception ex3) {}
        }
        final llllIIIIlIIIlIlllIll[] values = net.optifine.shaders.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.values();
        for (int i = 0; i < values.length; ++i) {
            final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = values[i];
            llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, net.optifine.shaders.llIIlllIIlllIIllIllI.bQ.getProperty(llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(), llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI()));
        }
        llIllIIIIIllIlIIIIlI();
    }
    
    private static void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, String llIllIIIIIllIlIIIIlI) {
        if (llIllIIIIIllIlIIIIlI == null) {
            llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
        }
        switch (lIIlIIIIIIIlIIlIlIIl()[llllIIIIlIIIlIlllIll.ordinal()]) {
            case 1: {
                net.optifine.shaders.llIIlllIIlllIIllIllI.cn = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, 0);
                break;
            }
            case 2: {
                net.optifine.shaders.llIIlllIIlllIIllIllI.cj = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, true);
                break;
            }
            case 3: {
                net.optifine.shaders.llIIlllIIlllIIllIllI.ck = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, true);
                break;
            }
            case 4: {
                net.optifine.shaders.llIIlllIIlllIIllIllI.ca = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, 1.0f);
                break;
            }
            case 5: {
                net.optifine.shaders.llIIlllIIlllIIllIllI.cb = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, 1.0f);
                break;
            }
            case 6: {
                net.optifine.shaders.llIIlllIIlllIIllIllI.bZ = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, 0.125f);
                break;
            }
            case 7: {
                net.optifine.shaders.llIIlllIIlllIIllIllI.bY = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, true);
                break;
            }
            case 8: {
                net.optifine.shaders.llIIlllIIlllIIllIllI.cm.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI);
                break;
            }
            case 9: {
                net.optifine.shaders.llIIlllIIlllIIllIllI.cl.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI);
                break;
            }
            case 10: {
                net.optifine.shaders.llIIlllIIlllIIllIllI.cv = llIllIIIIIllIlIIIIlI;
                break;
            }
            case 11: {
                net.optifine.shaders.llIIlllIIlllIIllIllI.bX = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, true);
                break;
            }
            case 12: {
                net.optifine.shaders.llIIlllIIlllIIllIllI.ci = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, true);
                break;
            }
            case 13: {
                net.optifine.shaders.llIIlllIIlllIIllIllI.cc = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, 0);
                break;
            }
            case 14: {
                net.optifine.shaders.llIIlllIIlllIIllIllI.cd = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, 0);
                break;
            }
            case 15: {
                net.optifine.shaders.llIIlllIIlllIIllIllI.ce = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, 0);
                break;
            }
            case 16: {
                net.optifine.shaders.llIIlllIIlllIIllIllI.cf = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, 0);
                break;
            }
            case 17: {
                net.optifine.shaders.llIIlllIIlllIIllIllI.cf = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, 0);
                break;
            }
            case 18: {
                net.optifine.shaders.llIIlllIIlllIIllIllI.cf = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, 0);
                break;
            }
            default: {
                throw new IllegalArgumentException("Unknown option: " + llllIIIIlIIIlIlllIll);
            }
        }
    }
    
    public static void IlIlIlIlIlllllllllIl() {
        net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("Save shaders configuration.");
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.bQ == null) {
            net.optifine.shaders.llIIlllIIlllIIllIllI.bQ = new net.optifine.util.llIIlllIIlllIIllIllI();
        }
        final llllIIIIlIIIlIlllIll[] values = net.optifine.shaders.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.values();
        for (int i = 0; i < values.length; ++i) {
            final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = values[i];
            net.optifine.shaders.llIIlllIIlllIIllIllI.bQ.setProperty(llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(), llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll));
        }
        try {
            final FileWriter fileWriter = new FileWriter(net.optifine.shaders.llIIlllIIlllIIllIllI.cB);
            net.optifine.shaders.llIIlllIIlllIIllIllI.bQ.store(fileWriter, null);
            fileWriter.close();
        }
        catch (Exception ex) {
            net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll("Error saving configuration: " + ex.getClass().getName() + ": " + ex.getMessage());
        }
    }
    
    public static String llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        switch (lIIlIIIIIIIlIIlIlIIl()[llllIIIIlIIIlIlllIll.ordinal()]) {
            case 1: {
                return Integer.toString(net.optifine.shaders.llIIlllIIlllIIllIllI.cn);
            }
            case 2: {
                return Boolean.toString(net.optifine.shaders.llIIlllIIlllIIllIllI.cj);
            }
            case 3: {
                return Boolean.toString(net.optifine.shaders.llIIlllIIlllIIllIllI.ck);
            }
            case 4: {
                return Float.toString(net.optifine.shaders.llIIlllIIlllIIllIllI.ca);
            }
            case 5: {
                return Float.toString(net.optifine.shaders.llIIlllIIlllIIllIllI.cb);
            }
            case 6: {
                return Float.toString(net.optifine.shaders.llIIlllIIlllIIllIllI.bZ);
            }
            case 7: {
                return Boolean.toString(net.optifine.shaders.llIIlllIIlllIIllIllI.bY);
            }
            case 8: {
                return net.optifine.shaders.llIIlllIIlllIIllIllI.cm.llIllIIIIIllIlIIIIlI();
            }
            case 9: {
                return net.optifine.shaders.llIIlllIIlllIIllIllI.cl.llIllIIIIIllIlIIIIlI();
            }
            case 10: {
                return net.optifine.shaders.llIIlllIIlllIIllIllI.cv;
            }
            case 11: {
                return Boolean.toString(net.optifine.shaders.llIIlllIIlllIIllIllI.bX);
            }
            case 12: {
                return Boolean.toString(net.optifine.shaders.llIIlllIIlllIIllIllI.ci);
            }
            case 13: {
                return Integer.toString(net.optifine.shaders.llIIlllIIlllIIllIllI.cc);
            }
            case 14: {
                return Integer.toString(net.optifine.shaders.llIIlllIIlllIIllIllI.cd);
            }
            case 15: {
                return Integer.toString(net.optifine.shaders.llIIlllIIlllIIllIllI.ce);
            }
            case 16: {
                return Integer.toString(net.optifine.shaders.llIIlllIIlllIIllIllI.cf);
            }
            case 17: {
                return Integer.toString(net.optifine.shaders.llIIlllIIlllIIllIllI.cf);
            }
            case 18: {
                return Integer.toString(net.optifine.shaders.llIIlllIIlllIIllIllI.cf);
            }
            default: {
                throw new IllegalArgumentException("Unknown option: " + llllIIIIlIIIlIlllIll);
            }
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(final String cv) {
        net.optifine.shaders.llIIlllIIlllIIllIllI.cv = cv;
        net.optifine.shaders.llIIlllIIlllIIllIllI.bQ.setProperty(net.optifine.shaders.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl(), cv);
        llIllIIIIIllIlIIIIlI();
    }
    
    public static void llIllIIIIIllIlIIIIlI() {
        final boolean cu = net.optifine.shaders.llIIlllIIlllIIllIllI.cu;
        final boolean llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI();
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl != null) {
            net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl.IIIlIIIlIlIIlllIIlll();
        }
        net.optifine.shaders.llIIlllIIlllIIllIllI.cu = false;
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.el != null) {
            net.optifine.shaders.llIIlllIIlllIIllIllI.el.IlIlIlIlIlllllllllIl();
            net.optifine.shaders.llIIlllIIlllIIllIllI.el = null;
            net.optifine.shaders.llIIlllIIlllIIllIllI.eo.clear();
            net.optifine.shaders.llIIlllIIlllIIllIllI.eq.clear();
            net.optifine.shaders.llIIlllIIlllIIllIllI.em = null;
            net.optifine.shaders.llIIlllIIlllIIllIllI.en = null;
            net.optifine.shaders.llIIlllIIlllIIllIllI.cC = null;
            net.optifine.shaders.llIIlllIIlllIIllIllI.cD = null;
            net.optifine.shaders.llIIlllIIlllIIllIllI.cE.clear();
            net.optifine.shaders.llIIlllIIlllIIllIllI.cG.IllIIlllIIIIlllIIlIl();
            net.optifine.shaders.llIIlllIIlllIIllIllI.cI.IllIIlllIIIIlllIIlIl();
            net.optifine.shaders.llIIlllIIlllIIllIllI.cJ.IllIIlllIIIIlllIIlIl();
            net.optifine.shaders.llIIlllIIlllIIllIllI.cH.IllIIlllIIIIlllIIlIl();
            d();
            net.optifine.shaders.llIIlllIIlllIIllIllI.eu = null;
        }
        boolean b = false;
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIllllIIIlIllIlIIll()) {
            net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("Shaders can not be loaded, Antialiasing is enabled: " + net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lllllIIIIIlIIlllIlIl() + "x");
            b = true;
        }
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IllllIIlIlIllIIIllII()) {
            net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("Shaders can not be loaded, Anisotropic Filtering is enabled: " + net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIIIIIlIIllIIlIlIll() + "x");
            b = true;
        }
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIlIllllIIlIIlIlI()) {
            net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("Shaders can not be loaded, Fast Render is enabled.");
            b = true;
        }
        final String property = net.optifine.shaders.llIIlllIIlllIIllIllI.bQ.getProperty(net.optifine.shaders.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl(), "(internal)");
        if (!b) {
            net.optifine.shaders.llIIlllIIlllIIllIllI.el = IlIlIlIlIlllllllllIl(property);
            net.optifine.shaders.llIIlllIIlllIIllIllI.cu = (net.optifine.shaders.llIIlllIIlllIIllIllI.el != null);
        }
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.cu) {
            net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("Loaded shaderpack: " + IIIllIIllIIIIIIlIIlI());
        }
        else {
            net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("No shaderpack loaded.");
            net.optifine.shaders.llIIlllIIlllIIllIllI.el = new IIlllIlIIllIlIlIlIIl();
        }
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.cY) {
            llllIIIIlIIIlIlllIll(new File(net.optifine.shaders.llIIlllIIlllIIllIllI.cA, "debug"));
        }
        q();
        b();
        net.optifine.shaders.llIIlllIIlllIIllIllI.em = e();
        c();
        final boolean b2 = net.optifine.shaders.llIIlllIIlllIIllIllI.cu ^ cu;
        final boolean b3 = llIllIlIIIIllIlIIllI() ^ llIllIlIIIIllIlIIllI;
        if (b2 || b3) {
            net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll();
            if (net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.ab.llIllIIIIIllIlIIIIlI()) {
                net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.ac.llllIIIIlIIIlIlllIll(null);
                net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.af.llllIIIIlIIIlIlllIll(null);
            }
            lIIIIlIIIIIlllIllIII();
        }
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.IIlIlIlIIlIllIIIIIIl() != null) {
            net.optifine.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll();
        }
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl != null) {
            net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl.IlIlIIIlIIlIlIIlllIl();
        }
        if ((b2 || b3) && net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.llIllIlIlIIIIIIIllII() != null) {
            net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.IlIlIllllllllIIIIlII();
        }
    }
    
    public static net.optifine.shaders.lIlIlIIIllIIllIIIllI IlIlIlIlIlllllllllIl(String trim) {
        if (trim == null) {
            return null;
        }
        trim = trim.trim();
        if (!trim.isEmpty() && !trim.equals("OFF")) {
            if (trim.equals("(internal)")) {
                return new IIIlIIlIIIIlllIlllII();
            }
            try {
                final File file = new File(net.optifine.shaders.llIIlllIIlllIIllIllI.cA, trim);
                return file.isDirectory() ? new net.optifine.shaders.IlIlIllllllllIIIIlII(trim, file) : ((file.isFile() && trim.toLowerCase().endsWith(".zip")) ? new llIIIlIlIllIIlIlIlII(trim, file) : null);
            }
            catch (Exception ex) {
                ex.printStackTrace();
                return null;
            }
        }
        return null;
    }
    
    public static net.optifine.shaders.lIlIlIIIllIIllIIIllI IlIIIlIlIIIllIlIlIIl() {
        return net.optifine.shaders.llIIlllIIlllIIllIllI.el;
    }
    
    private static void b() {
        net.optifine.shaders.llIIlllIIlllIIllIllI.eq.clear();
        for (int i = -128; i <= 128; ++i) {
            if (net.optifine.shaders.llIIlllIIlllIIllIllI.el.IlIlIlIlIlllllllllIl("/shaders/world" + i)) {
                net.optifine.shaders.llIIlllIIlllIIllIllI.eq.add(i);
            }
        }
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.eq.size() > 0) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl("[Shaders] Worlds: " + net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll((Object[])net.optifine.shaders.llIIlllIIlllIIllIllI.eq.toArray(new Integer[net.optifine.shaders.llIIlllIIlllIIllIllI.eq.size()])));
        }
    }
    
    private static void c() {
        net.optifine.shaders.llIIlllIIlllIIllIllI.cG.IllIIlllIIIIlllIIlIl();
        net.optifine.shaders.llIIlllIIlllIIllIllI.cI.IllIIlllIIIIlllIIlIl();
        net.optifine.shaders.llIIlllIIlllIIllIllI.cJ.IllIIlllIIIIlllIIlIl();
        net.optifine.shaders.llIIlllIIlllIIllIllI.cH.IllIIlllIIIIlllIIlIl();
        net.optifine.shaders.llIIlllIIlllIIllIllI.cK.IllIIlllIIIIlllIIlIl();
        net.optifine.shaders.llIIlllIIlllIIllIllI.cL.IllIIlllIIIIlllIIlIl();
        net.optifine.shaders.llIIlllIIlllIIllIllI.cM.IllIIlllIIIIlllIIlIl();
        net.optifine.shaders.llIIlllIIlllIIllIllI.cN.IllIIlllIIIIlllIIlIl();
        net.optifine.shaders.llIIlllIIlllIIllIllI.cO.IllIIlllIIIIlllIIlIl();
        net.optifine.shaders.llIIlllIIlllIIllIllI.cP.IllIIlllIIIIlllIIlIl();
        net.optifine.shaders.llIIlllIIlllIIllIllI.cQ.IllIIlllIIIIlllIIlIl();
        net.optifine.shaders.llIIlllIIlllIIllIllI.cR.IllIIlllIIIIlllIIlIl();
        net.optifine.shaders.llIIlllIIlllIIllIllI.cS.IllIIlllIIIIlllIIlIl();
        net.optifine.shaders.llIIlllIIlllIIllIllI.cT.IllIIlllIIIIlllIIlIl();
        net.optifine.shaders.llIIlllIIlllIIllIllI.cU.IllIIlllIIIIlllIIlIl();
        net.optifine.shaders.llIIlllIIlllIIllIllI.cV.IllIIlllIIIIlllIIlIl();
        net.optifine.shaders.llIIlllIIlllIIllIllI.cW.IllIIlllIIIIlllIIlIl();
        net.optifine.shaders.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI();
        net.optifine.shaders.IlIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl();
        net.optifine.shaders.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl();
        net.optifine.shaders.llIIlllIIlllIIllIllI.ev = null;
        for (int i = 0; i < net.optifine.shaders.llIIlllIIlllIIllIllI.bL.length; ++i) {
            net.optifine.shaders.llIIlllIIlllIIllIllI.bL[i].llllIIIIlIIIlIlllIll();
        }
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.el != null) {
            net.optifine.shaders.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.el);
            net.optifine.shaders.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.el);
            net.optifine.shaders.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.el);
            final String s = "/shaders/shaders.properties";
            try {
                final InputStream llllIIIIlIIIlIlllIll = net.optifine.shaders.llIIlllIIlllIIllIllI.el.llllIIIIlIIIlIlllIll(s);
                if (llllIIIIlIIIlIlllIll == null) {
                    return;
                }
                final InputStream llllIIIIlIIIlIlllIll2 = net.optifine.shaders.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, s);
                final net.optifine.util.llIIlllIIlllIIllIllI llIIlllIIlllIIllIllI = new net.optifine.util.llIIlllIIlllIIllIllI();
                llIIlllIIlllIIllIllI.load(llllIIIIlIIIlIlllIll2);
                llllIIIIlIIIlIlllIll2.close();
                net.optifine.shaders.llIIlllIIlllIIllIllI.cG.llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI);
                net.optifine.shaders.llIIlllIIlllIIllIllI.cI.llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI);
                net.optifine.shaders.llIIlllIIlllIIllIllI.cJ.llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI);
                net.optifine.shaders.llIIlllIIlllIIllIllI.cH.llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI);
                net.optifine.shaders.llIIlllIIlllIIllIllI.cK.llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI);
                net.optifine.shaders.llIIlllIIlllIIllIllI.cL.llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI);
                net.optifine.shaders.llIIlllIIlllIIllIllI.cM.llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI);
                net.optifine.shaders.llIIlllIIlllIIllIllI.cO.llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI);
                net.optifine.shaders.llIIlllIIlllIIllIllI.cN.llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI);
                net.optifine.shaders.llIIlllIIlllIIllIllI.cP.llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI);
                net.optifine.shaders.llIIlllIIlllIIllIllI.cQ.llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI);
                net.optifine.shaders.llIIlllIIlllIIllIllI.cR.llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI);
                net.optifine.shaders.llIIlllIIlllIIllIllI.cS.llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI);
                net.optifine.shaders.llIIlllIIlllIIllIllI.cT.llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI);
                net.optifine.shaders.llIIlllIIlllIIllIllI.cU.llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI);
                net.optifine.shaders.llIIlllIIlllIIllIllI.cV.llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI);
                net.optifine.shaders.llIIlllIIlllIIllIllI.cW.llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI);
                net.optifine.shaders.llIIlllIIlllIIllIllI.en = net.optifine.shaders.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII.llIllIIIIIllIlIIIIlI(llIIlllIIlllIIllIllI, net.optifine.shaders.llIIlllIIlllIIllIllI.em);
                net.optifine.shaders.llIIlllIIlllIIllIllI.cC = net.optifine.shaders.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI, net.optifine.shaders.llIIlllIIlllIIllIllI.em);
                net.optifine.shaders.llIIlllIIlllIIllIllI.cD = net.optifine.shaders.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI, net.optifine.shaders.llIIlllIIlllIIllIllI.cC, net.optifine.shaders.llIIlllIIlllIIllIllI.em);
                net.optifine.shaders.llIIlllIIlllIIllIllI.cE = net.optifine.shaders.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llIIlllIIlllIIllIllI, net.optifine.shaders.llIIlllIIlllIIllIllI.em);
                net.optifine.shaders.llIIlllIIlllIIllIllI.er = llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI, 0);
                net.optifine.shaders.llIIlllIIlllIIllIllI.es = llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI, 1);
                net.optifine.shaders.llIIlllIIlllIIllIllI.et = llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI, 2);
                net.optifine.shaders.llIIlllIIlllIIllIllI.eu = llIIlllIIlllIIllIllI.getProperty("texture.noise");
                if (net.optifine.shaders.llIIlllIIlllIIllIllI.eu != null) {
                    net.optifine.shaders.llIIlllIIlllIIllIllI.eC = true;
                }
                net.optifine.shaders.llIIlllIIlllIIllIllI.ev = net.optifine.shaders.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI);
                net.optifine.shaders.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llIIlllIIlllIIllIllI);
                net.optifine.shaders.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII.llIllIIIIIllIlIIIIlI(llIIlllIIlllIIllIllI);
                net.optifine.shaders.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl(llIIlllIIlllIIllIllI);
                net.optifine.shaders.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII.IlIlIIIllIllIIIIIllI(llIIlllIIlllIIllIllI);
            }
            catch (IOException ex) {
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("[Shaders] Error reading: " + s);
            }
        }
    }
    
    private static net.optifine.shaders.llIllIlIIIIllIlIIllI[] llllIIIIlIIIlIlllIll(final Properties properties, final int n) {
        final String string = "texture." + net.optifine.shaders.llIIlllIIlllIIllIllI.ez[n] + ".";
        final Set<String> keySet = ((Hashtable<String, V>)properties).keySet();
        final ArrayList<net.optifine.shaders.llIllIlIIIIllIlIIllI> list = new ArrayList<net.optifine.shaders.llIllIlIIIIllIlIIllI>();
        for (final String s : keySet) {
            if (s.startsWith(string)) {
                final String llIllIIIIIllIlIIIIlI = net.optifine.util.IIIllllllIllIIIlllIl.llIllIIIIIllIlIIIIlI(net.optifine.util.IIIllllllIllIIIlllIl.IlIIIlIlIIIllIlIlIIl(s, string), new String[] { ".0", ".1", ".2", ".3", ".4", ".5", ".6", ".7", ".8", ".9" });
                final String trim = properties.getProperty(s).trim();
                final int ilIlIIIllIllIIIIIllI = IlIlIIIllIllIIIIIllI(n, llIllIIIIIllIlIIIIlI);
                if (ilIlIIIllIllIIIIIllI < 0) {
                    net.optifine.shaders.IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl("Invalid texture name: " + s);
                }
                else {
                    final net.optifine.shaders.llIllIlIIIIllIlIIllI llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, trim);
                    if (llllIIIIlIIIlIlllIll == null) {
                        continue;
                    }
                    net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("Custom texture: " + s + " = " + trim);
                    list.add(llllIIIIlIIIlIlllIll);
                }
            }
        }
        if (list.size() <= 0) {
            return null;
        }
        return list.toArray(new net.optifine.shaders.llIllIlIIIIllIlIIllI[list.size()]);
    }
    
    private static net.optifine.shaders.llIllIlIIIIllIlIIllI llllIIIIlIIIlIlllIll(final int n, String trim) {
        if (trim == null) {
            return null;
        }
        trim = trim.trim();
        return (trim.indexOf(58) >= 0) ? IlIlIlIlIlllllllllIl(n, trim) : ((trim.indexOf(32) >= 0) ? llIllIIIIIllIlIIIIlI(n, trim) : IlIIIlIlIIIllIlIlIIl(n, trim));
    }
    
    private static net.optifine.shaders.llIllIlIIIIllIlIIllI IlIlIlIlIlllllllllIl(final int n, final String s) {
        String s2 = s.trim();
        int n2 = 0;
        if (s2.startsWith("minecraft:textures/")) {
            s2 = net.optifine.util.IIIllllllIllIIIlllIl.IllIIlllIIIIlllIIlIl(s2, ".png");
            if (s2.endsWith("_n.png")) {
                s2 = net.optifine.util.IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(s2, "_n.png", ".png");
                n2 = 1;
            }
            else if (s2.endsWith("_s.png")) {
                s2 = net.optifine.util.IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(s2, "_s.png", ".png");
                n2 = 2;
            }
        }
        return new IlIlIIIllIllIIIIIllI(n, new lIllllIllIllIIllllll(s2), n2);
    }
    
    private static net.optifine.shaders.llIllIlIIIIllIlIIllI llIllIIIIIllIlIIIIlI(final int n, final String s) {
        final net.optifine.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = new net.optifine.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll("Shaders");
        final ArrayDeque<String> arrayDeque = new ArrayDeque<String>(Arrays.asList(net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s, " ")));
        final String s2 = arrayDeque.poll();
        final net.optifine.llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = (net.optifine.llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl)llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(arrayDeque.poll(), net.optifine.llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl.values(), "texture type");
        if (ilIIIlIlIIIllIlIlIIl == null) {
            net.optifine.shaders.IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl("Invalid raw texture type: " + s);
            return null;
        }
        final net.optifine.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = (net.optifine.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll)llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(arrayDeque.poll(), net.optifine.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll.values(), "internal format");
        if (llllIIIIlIIIlIlllIll2 == null) {
            net.optifine.shaders.IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl("Invalid raw texture internal format: " + s);
            return null;
        }
        int n2 = 0;
        int llllIIIIlIIIlIlllIll3 = 0;
        int n3 = 0;
        switch (IlIIlllIIlIlllllIIlI()[ilIIIlIlIIIllIlIlIIl.ordinal()]) {
            case 1: {
                n3 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(arrayDeque.poll(), -1);
                break;
            }
            case 2: {
                n3 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(arrayDeque.poll(), -1);
                n2 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(arrayDeque.poll(), -1);
                break;
            }
            case 3: {
                n3 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(arrayDeque.poll(), -1);
                n2 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(arrayDeque.poll(), -1);
                llllIIIIlIIIlIlllIll3 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(arrayDeque.poll(), -1);
                break;
            }
            case 4: {
                n3 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(arrayDeque.poll(), -1);
                n2 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(arrayDeque.poll(), -1);
                break;
            }
            default: {
                net.optifine.shaders.IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl("Invalid raw texture type: " + ilIIIlIlIIIllIlIlIIl);
                return null;
            }
        }
        if (n3 < 0 || n2 < 0 || llllIIIIlIIIlIlllIll3 < 0) {
            net.optifine.shaders.IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl("Invalid raw texture size: " + s);
            return null;
        }
        final net.optifine.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = (net.optifine.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl)llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(arrayDeque.poll(), net.optifine.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.values(), "pixel format");
        if (ilIlIlIlIlllllllllIl == null) {
            net.optifine.shaders.IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl("Invalid raw texture pixel format: " + s);
            return null;
        }
        final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI = (llIllIIIIIllIlIIIIlI)llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(arrayDeque.poll(), net.optifine.llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI.values(), "pixel type");
        if (llIllIIIIIllIlIIIIlI == null) {
            net.optifine.shaders.IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl("Invalid raw texture pixel type: " + s);
            return null;
        }
        if (!arrayDeque.isEmpty()) {
            net.optifine.shaders.IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl("Invalid raw texture, too many parameters: " + s);
            return null;
        }
        return llllIIIIlIIIlIlllIll(n, s, s2, ilIIIlIlIIIllIlIlIIl, llllIIIIlIIIlIlllIll2, n3, n2, llllIIIIlIIIlIlllIll3, ilIlIlIlIlllllllllIl, llIllIIIIIllIlIIIIlI);
    }
    
    private static net.optifine.shaders.llIllIlIIIIllIlIIllI llllIIIIlIIIlIlllIll(final int n, final String s, final String s2, final net.optifine.llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final net.optifine.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final int n2, final int n3, final int n4, final net.optifine.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        try {
            final String string = "shaders/" + net.optifine.util.IIIllllllIllIIIlllIl.IlIIIlIlIIIllIlIlIIl(s2, "/");
            final InputStream llllIIIIlIIIlIlllIll2 = net.optifine.shaders.llIIlllIIlllIIllIllI.el.llllIIIIlIIIlIlllIll(string);
            if (llllIIIIlIIIlIlllIll2 == null) {
                net.optifine.shaders.IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl("Raw texture not found: " + s2);
                return null;
            }
            final byte[] llIllIIIIIllIlIIIIlI2 = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll2);
            IOUtils.closeQuietly(llllIIIIlIIIlIlllIll2);
            final ByteBuffer llIllIIIIIllIlIIIIlI3 = net.minecraft.client.lIIIlllIIIllIIIllIII.llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI2.length);
            llIllIIIIIllIlIIIIlI3.put(llIllIIIIIllIlIIIIlI2);
            llIllIIIIIllIlIIIIlI3.flip();
            final net.minecraft.client.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll llllIIIIlIIIlIlllIll3 = net.optifine.shaders.IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(string, new net.minecraft.client.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll(true, true, new ArrayList()));
            return new IllIIlllIIIIlllIIlIl(ilIIIlIlIIIllIlIlIIl, llllIIIIlIIIlIlllIll, n2, n3, n4, ilIlIlIlIlllllllllIl, llIllIIIIIllIlIIIIlI, llIllIIIIIllIlIIIIlI3, n, llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll(), llllIIIIlIIIlIlllIll3.IlIlIlIlIlllllllllIl());
        }
        catch (IOException ex) {
            net.optifine.shaders.IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl("Error loading raw texture: " + s2);
            net.optifine.shaders.IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl(ex.getClass().getName() + ": " + ex.getMessage());
            return null;
        }
    }
    
    private static net.optifine.shaders.llIllIlIIIIllIlIIllI IlIIIlIlIIIllIlIlIIl(final int n, String s) {
        s = s.trim();
        if (s.indexOf(46) < 0) {
            s = String.valueOf(s) + ".png";
        }
        try {
            final String string = "shaders/" + net.optifine.util.IIIllllllIllIIIlllIl.IlIIIlIlIIIllIlIlIIl(s, "/");
            final InputStream llllIIIIlIIIlIlllIll = net.optifine.shaders.llIIlllIIlllIIllIllI.el.llllIIIIlIIIlIlllIll(string);
            if (llllIIIIlIIIlIlllIll == null) {
                net.optifine.shaders.IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl("Texture not found: " + s);
                return null;
            }
            IOUtils.closeQuietly(llllIIIIlIIIlIlllIll);
            final net.optifine.shaders.IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl = new net.optifine.shaders.IIIllllllIllIIIlllIl(string);
            iiIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.llIllIlIlIIIIIIIllII());
            return new net.optifine.shaders.IlIIIlIlIIIllIlIlIIl(n, string, iiIllllllIllIIIlllIl);
        }
        catch (IOException ex) {
            net.optifine.shaders.IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl("Error loading texture: " + s);
            net.optifine.shaders.IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl(ex.getClass().getName() + ": " + ex.getMessage());
            return null;
        }
    }
    
    private static int IlIlIIIllIllIIIIIllI(final int n, final String s) {
        if (n == 0) {
            if (s.equals("texture")) {
                return 0;
            }
            if (s.equals("lightmap")) {
                return 1;
            }
            if (s.equals("normals")) {
                return 2;
            }
            if (s.equals("specular")) {
                return 3;
            }
            if (s.equals("shadowtex0") || s.equals("watershadow")) {
                return 4;
            }
            if (s.equals("shadow")) {
                return net.optifine.shaders.llIIlllIIlllIIllIllI.aN ? 5 : 4;
            }
            if (s.equals("shadowtex1")) {
                return 5;
            }
            if (s.equals("depthtex0")) {
                return 6;
            }
            if (s.equals("gaux1")) {
                return 7;
            }
            if (s.equals("gaux2")) {
                return 8;
            }
            if (s.equals("gaux3")) {
                return 9;
            }
            if (s.equals("gaux4")) {
                return 10;
            }
            if (s.equals("depthtex1")) {
                return 12;
            }
            if (s.equals("shadowcolor0") || s.equals("shadowcolor")) {
                return 13;
            }
            if (s.equals("shadowcolor1")) {
                return 14;
            }
            if (s.equals("noisetex")) {
                return 15;
            }
        }
        if (n == 1 || n == 2) {
            if (s.equals("colortex0") || s.equals("colortex0")) {
                return 0;
            }
            if (s.equals("colortex1") || s.equals("gdepth")) {
                return 1;
            }
            if (s.equals("colortex2") || s.equals("gnormal")) {
                return 2;
            }
            if (s.equals("colortex3") || s.equals("composite")) {
                return 3;
            }
            if (s.equals("shadowtex0") || s.equals("watershadow")) {
                return 4;
            }
            if (s.equals("shadow")) {
                return net.optifine.shaders.llIIlllIIlllIIllIllI.aN ? 5 : 4;
            }
            if (s.equals("shadowtex1")) {
                return 5;
            }
            if (s.equals("depthtex0") || s.equals("gdepthtex")) {
                return 6;
            }
            if (s.equals("colortex4") || s.equals("gaux1")) {
                return 7;
            }
            if (s.equals("colortex5") || s.equals("gaux2")) {
                return 8;
            }
            if (s.equals("colortex6") || s.equals("gaux3")) {
                return 9;
            }
            if (s.equals("colortex7") || s.equals("gaux4")) {
                return 10;
            }
            if (s.equals("depthtex1")) {
                return 11;
            }
            if (s.equals("depthtex2")) {
                return 12;
            }
            if (s.equals("shadowcolor0") || s.equals("shadowcolor")) {
                return 13;
            }
            if (s.equals("shadowcolor1")) {
                return 14;
            }
            if (s.equals("noisetex")) {
                return 15;
            }
        }
        return -1;
    }
    
    private static void llllIIIIlIIIlIlllIll(final net.optifine.shaders.llIllIlIIIIllIlIIllI[] array) {
        if (array != null) {
            for (int i = 0; i < array.length; ++i) {
                final net.optifine.shaders.llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI = array[i];
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(33984 + llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll());
                final int ilIIIlIlIIIllIlIlIIl = llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl();
                final int illIIlllIIIIlllIIlIl = llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl();
                if (illIIlllIIIIlllIIlIl == 3553) {
                    net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(ilIIIlIlIIIllIlIlIIl);
                }
                else {
                    GL11.glBindTexture(illIIlllIIIIlllIIlIl, ilIIIlIlIIIllIlIlIIl);
                }
            }
        }
    }
    
    private static void d() {
        IlIlIlIlIlllllllllIl(net.optifine.shaders.llIIlllIIlllIIllIllI.er);
        IlIlIlIlIlllllllllIl(net.optifine.shaders.llIIlllIIlllIIllIllI.es);
        IlIlIlIlIlllllllllIl(net.optifine.shaders.llIIlllIIlllIIllIllI.et);
        net.optifine.shaders.llIIlllIIlllIIllIllI.er = null;
        net.optifine.shaders.llIIlllIIlllIIllIllI.es = null;
        net.optifine.shaders.llIIlllIIlllIIllIllI.et = null;
    }
    
    private static void IlIlIlIlIlllllllllIl(final net.optifine.shaders.llIllIlIIIIllIlIIllI[] array) {
        if (array != null) {
            for (int i = 0; i < array.length; ++i) {
                array[i].IlIlIIIllIllIIIIIllI();
            }
        }
    }
    
    public static IIIIlllIIIIIIlIIIlll[] llIllIIIIIllIlIIIIlI(final String s) {
        IIIIlllIIIIIIlIIIlll[] array = net.optifine.shaders.llIIlllIIlllIIllIllI.em.clone();
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.cD == null) {
            if (net.optifine.shaders.llIIlllIIlllIIllIllI.cC != null) {
                array = (IIIIlllIIIIIIlIIIlll[])net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, new net.optifine.shaders.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll(net.optifine.shaders.llIIlllIIlllIIllIllI.cC, array), 0);
            }
            return IlIlIlIlIlllllllllIl(array);
        }
        final net.optifine.shaders.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl = net.optifine.shaders.llIIlllIIlllIIllIllI.cD.get((s != null) ? ("screen." + s) : "screen");
        if (llIIlIIIlIIIllIlIIIl == null) {
            return new IIIIlllIIIIIIlIIIlll[0];
        }
        final IIIIlllIIIIIIlIIIlll[] ilIlIlIlIlllllllllIl = llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl();
        final ArrayList<IIIIlllIIIIIIlIIIlll> list = new ArrayList<IIIIlllIIIIIIlIIIlll>();
        for (int i = 0; i < ilIlIlIlIlllllllllIl.length; ++i) {
            final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = ilIlIlIlIlllllllllIl[i];
            if (iiiIlllIIIIIIlIIIlll == null) {
                list.add(null);
            }
            else if (iiiIlllIIIIIIlIIIlll instanceof net.optifine.shaders.llllIIIIlIIIlIlllIll.IIlllIIlIllIllIlIIll) {
                list.addAll((Collection<?>)Arrays.asList(llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.cD, array)));
            }
            else {
                list.add(iiiIlllIIIIIIlIIIlll);
            }
        }
        return list.toArray(new IIIIlllIIIIIIlIIIlll[list.size()]);
    }
    
    public static int llllIIIIlIIIlIlllIll(final String s, final int n) {
        final String s2 = (s != null) ? ("screen." + s) : "screen";
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.cD == null) {
            return n;
        }
        final net.optifine.shaders.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl = net.optifine.shaders.llIIlllIIlllIIllIllI.cD.get(s2);
        return (llIIlIIIlIIIllIlIIIl == null) ? n : llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI();
    }
    
    private static IIIIlllIIIIIIlIIIlll[] llllIIIIlIIIlIlllIll(final Map map, final IIIIlllIIIIIIlIIIlll[] array) {
        final HashSet<String> set = new HashSet<String>();
        final Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            final IIIIlllIIIIIIlIIIlll[] ilIlIlIlIlllllllllIl = ((net.optifine.shaders.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl)map.get(iterator.next())).IlIlIlIlIlllllllllIl();
            for (int i = 0; i < ilIlIlIlIlllllllllIl.length; ++i) {
                final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = ilIlIlIlIlllllllllIl[i];
                if (iiiIlllIIIIIIlIIIlll != null) {
                    set.add(iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll());
                }
            }
        }
        final ArrayList<IIIIlllIIIIIIlIIIlll> list = new ArrayList<IIIIlllIIIIIIlIIIlll>();
        for (int j = 0; j < array.length; ++j) {
            final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll2 = array[j];
            if (iiiIlllIIIIIIlIIIlll2.lIlIlIIIllIIllIIIllI() && !set.contains(iiiIlllIIIIIIlIIIlll2.llllIIIIlIIIlIlllIll())) {
                list.add(iiiIlllIIIIIIlIIIlll2);
            }
        }
        return list.toArray(new IIIIlllIIIIIIlIIIlll[list.size()]);
    }
    
    public static IIIIlllIIIIIIlIIIlll IlIIIlIlIIIllIlIlIIl(final String s) {
        return net.optifine.shaders.lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll(s, net.optifine.shaders.llIIlllIIlllIIllIllI.em);
    }
    
    public static IIIIlllIIIIIIlIIIlll[] IlIlIIIllIllIIIIIllI() {
        return net.optifine.shaders.llIIlllIIlllIIllIllI.em;
    }
    
    public static boolean IlIlIIIllIllIIIIIllI(final String s) {
        return net.optifine.shaders.llIIlllIIlllIIllIllI.en != null && net.optifine.shaders.llIIlllIIlllIIllIllI.en.contains(s);
    }
    
    private static IIIIlllIIIIIIlIIIlll[] IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll[] array) {
        final ArrayList<IIIIlllIIIIIIlIIIlll> list = new ArrayList<IIIIlllIIIIIIlIIIlll>();
        for (int i = 0; i < array.length; ++i) {
            final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = array[i];
            if (iiiIlllIIIIIIlIIIlll.lIlIlIIIllIIllIIIllI()) {
                list.add(iiiIlllIIIIIIlIIIlll);
            }
        }
        return list.toArray(new IIIIlllIIIIIIlIIIlll[list.size()]);
    }
    
    public static void IllIIlllIIIIlllIIlIl() {
        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.em, net.optifine.shaders.llIIlllIIlllIIllIllI.el);
    }
    
    private static void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll[] array, final net.optifine.shaders.lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI) {
        final net.optifine.util.llIIlllIIlllIIllIllI llIIlllIIlllIIllIllI = new net.optifine.util.llIIlllIIlllIIllIllI();
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.em != null) {
            for (int i = 0; i < array.length; ++i) {
                final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = array[i];
                if (iiiIlllIIIIIIlIIIlll.llIllIlIIIIllIlIIllI() && iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl()) {
                    llIIlllIIlllIIllIllI.setProperty(iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(), iiiIlllIIIIIIlIIIlll.IlIIIlIlIIIllIlIlIIl());
                }
            }
        }
        try {
            llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, llIIlllIIlllIIllIllI);
        }
        catch (IOException ex) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("[Shaders] Error saving configuration for " + net.optifine.shaders.llIIlllIIlllIIllIllI.el.llllIIIIlIIIlIlllIll());
            ex.printStackTrace();
        }
    }
    
    private static void llllIIIIlIIIlIlllIll(final net.optifine.shaders.lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final Properties properties) {
        final File file = new File(Minecraft.getMinecraft().mcDataDir, "shaderpacks/" + lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll() + ".txt");
        if (properties.isEmpty()) {
            file.delete();
        }
        else {
            final FileOutputStream fileOutputStream = new FileOutputStream(file);
            properties.store(fileOutputStream, null);
            fileOutputStream.flush();
            fileOutputStream.close();
        }
    }
    
    private static IIIIlllIIIIIIlIIIlll[] e() {
        try {
            final IIIIlllIIIIIIlIIIlll[] llllIIIIlIIIlIlllIll = net.optifine.shaders.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.el, net.optifine.shaders.llIIlllIIlllIIllIllI.eh.llIllIIIIIllIlIIIIlI(), net.optifine.shaders.llIIlllIIlllIIllIllI.eq);
            final Properties llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.el);
            for (int i = 0; i < llllIIIIlIIIlIlllIll.length; ++i) {
                final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = llllIIIIlIIIlIlllIll[i];
                final String property = llllIIIIlIIIlIlllIll2.getProperty(iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll());
                if (property != null) {
                    iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl();
                    if (!iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl(property)) {
                        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("[Shaders] Invalid value, option: " + iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll() + ", value: " + property);
                    }
                }
            }
            return llllIIIIlIIIlIlllIll;
        }
        catch (IOException ex) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("[Shaders] Error reading configuration for " + net.optifine.shaders.llIIlllIIlllIIllIllI.el.llllIIIIlIIIlIlllIll());
            ex.printStackTrace();
            return null;
        }
    }
    
    private static Properties llllIIIIlIIIlIlllIll(final net.optifine.shaders.lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI) {
        final net.optifine.util.llIIlllIIlllIIllIllI llIIlllIIlllIIllIllI = new net.optifine.util.llIIlllIIlllIIllIllI();
        final File file = new File(Minecraft.getMinecraft().mcDataDir, "shaderpacks/" + lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll() + ".txt");
        if (file.exists() && file.isFile() && file.canRead()) {
            final FileInputStream fileInputStream = new FileInputStream(file);
            llIIlllIIlllIIllIllI.load(fileInputStream);
            fileInputStream.close();
            return llIIlllIIlllIIllIllI;
        }
        return llIIlllIIlllIIllIllI;
    }
    
    public static IIIIlllIIIIIIlIIIlll[] llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll[] array) {
        final ArrayList<IIIIlllIIIIIIlIIIlll> list = new ArrayList<IIIIlllIIIIIIlIIIlll>();
        for (int i = 0; i < array.length; ++i) {
            final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = array[i];
            if (iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl() && iiiIlllIIIIIIlIIIlll.llIllIlIIIIllIlIIllI()) {
                list.add(iiiIlllIIIIIIlIIIlll);
            }
        }
        return list.toArray(new IIIIlllIIIIIIlIIIlll[list.size()]);
    }
    
    private static String llllIIIIlIIIlIlllIll(String llllIIllllIlIlIIIIll, final IIIIlllIIIIIIlIIIlll[] array) {
        if (array != null && array.length > 0) {
            for (int i = 0; i < array.length; ++i) {
                final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = array[i];
                if (iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl(llllIIllllIlIlIIIIll)) {
                    llllIIllllIlIlIIIIll = iiiIlllIIIIIIlIIIlll.llllIIllllIlIlIIIIll();
                    break;
                }
            }
            return llllIIllllIlIlIIIIll;
        }
        return llllIIllllIlIlIIIIll;
    }
    
    public static ArrayList llllIIIlIlllIlIIIIIl() {
        final ArrayList<String> list = new ArrayList<String>();
        list.add("OFF");
        list.add("(internal)");
        final int size = list.size();
        try {
            if (!net.optifine.shaders.llIIlllIIlllIIllIllI.cA.exists()) {
                net.optifine.shaders.llIIlllIIlllIIllIllI.cA.mkdir();
            }
            final File[] listFiles = net.optifine.shaders.llIIlllIIlllIIllIllI.cA.listFiles();
            for (int i = 0; i < listFiles.length; ++i) {
                final File file = listFiles[i];
                final String name = file.getName();
                if (file.isDirectory()) {
                    if (!name.equals("debug")) {
                        final File file2 = new File(file, "shaders");
                        if (file2.exists() && file2.isDirectory()) {
                            list.add(name);
                        }
                    }
                }
                else if (file.isFile() && name.toLowerCase().endsWith(".zip")) {
                    list.add(name);
                }
            }
        }
        catch (Exception ex) {}
        Collections.sort(list.subList(size, list.size()), String.CASE_INSENSITIVE_ORDER);
        return list;
    }
    
    public static int IllIIlllIIIIlllIIlIl(final String s) {
        final int glCheckFramebufferStatusEXT = EXTFramebufferObject.glCheckFramebufferStatusEXT(36160);
        if (glCheckFramebufferStatusEXT != 36053) {
            System.err.format("FramebufferStatus 0x%04X at %s\n", glCheckFramebufferStatusEXT, s);
        }
        return glCheckFramebufferStatusEXT;
    }
    
    public static int llllIIIlIlllIlIIIIIl(final String s) {
        final int llllllIllIllIlIllllI = net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllllIllIllIlIllllI();
        if (llllllIllIllIlIllllI != 0 && net.optifine.IllIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll(llllllIllIllIlIllllI)) {
            final String llIllIIIIIllIlIIIIlI = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(llllllIllIllIlIllllI);
            net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(String.format("OpenGL error: %s (%s)%s, at: %s", llllllIllIllIlIllllI, llIllIIIIIllIlIIIIlI, IllIIlllIIIIlllIIlIl(llllllIllIllIlIllllI, s), s));
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.G() && net.optifine.util.IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("ShowGlErrorShaders", 10000L)) {
                lIlIlIIIllIIllIIIllI(net.minecraft.client.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("of.message.openglError", llllllIllIllIlIllllI, llIllIIIIIllIlIIIIlI));
            }
        }
        return llllllIllIllIlIllllI;
    }
    
    private static String IllIIlllIIIIlllIIlIl(final int n, final String s) {
        final StringBuilder sb = new StringBuilder();
        if (n == 1286) {
            final int glCheckFramebufferStatusEXT = EXTFramebufferObject.glCheckFramebufferStatusEXT(36160);
            sb.append(", fbStatus: " + glCheckFramebufferStatusEXT + " (" + llllIIllllIlIlIIIIll(glCheckFramebufferStatusEXT) + ")");
        }
        String ilIlIIIllIllIIIIIllI = net.optifine.shaders.llIIlllIIlllIIllIllI.bM.IlIlIIIllIllIIIIIllI();
        if (ilIlIIIllIllIIIIIllI.isEmpty()) {
            ilIlIIIllIllIIIIIllI = "none";
        }
        sb.append(", program: " + ilIlIIIllIllIIIIIllI);
        final net.optifine.shaders.IlIllIlIlIIIlIlIlIII iiiIlllIIIIIIlIIIlll = IIIIlllIIIIIIlIIIlll(net.optifine.shaders.llIIlllIIlllIIllIllI.bN);
        if (iiiIlllIIIIIIlIIIlll != net.optifine.shaders.llIIlllIIlllIIllIllI.bM) {
            String ilIlIIIllIllIIIIIllI2 = iiiIlllIIIIIIlIIIlll.IlIlIIIllIllIIIIIllI();
            if (ilIlIIIllIllIIIIIllI2.isEmpty()) {
                ilIlIIIllIllIIIIIllI2 = "none";
            }
            sb.append(" (" + ilIlIIIllIllIIIIIllI2 + ")");
        }
        if (s.equals("setDrawBuffers")) {
            sb.append(", drawBuffers: " + net.optifine.shaders.llIIlllIIlllIIllIllI.bM.llIIlIIIlIIIllIlIIIl());
        }
        return sb.toString();
    }
    
    private static net.optifine.shaders.IlIllIlIlIIIlIlIlIII IIIIlllIIIIIIlIIIlll(final int n) {
        for (int i = 0; i < net.optifine.shaders.llIIlllIIlllIIllIllI.bL.length; ++i) {
            final net.optifine.shaders.IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII = net.optifine.shaders.llIIlllIIlllIIllIllI.bL[i];
            if (ilIllIlIlIIIlIlIlIII.lIIIIlIIIIIlllIllIII() == n) {
                return ilIllIlIlIIIlIlIlIII;
            }
        }
        return net.optifine.shaders.llIIlllIIlllIIllIllI.bd;
    }
    
    private static String llllIIllllIlIlIIIIll(final int n) {
        switch (n) {
            case 33305: {
                return "Undefined";
            }
            case 36053: {
                return "Complete";
            }
            case 36054: {
                return "Incomplete attachment";
            }
            case 36055: {
                return "Incomplete missing attachment";
            }
            case 36059: {
                return "Incomplete draw buffer";
            }
            case 36060: {
                return "Incomplete read buffer";
            }
            case 36061: {
                return "Unsupported";
            }
            case 36182: {
                return "Incomplete multisample";
            }
            case 36264: {
                return "Incomplete layer targets";
            }
            default: {
                return "Unknown";
            }
        }
    }
    
    private static void lIlIlIIIllIIllIIIllI(final String s) {
        net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl().llllIIIIlIIIlIlllIll(new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIIIIIIlllIlIllIl(s));
    }
    
    private static void IlIlIIIllIIllIlllllI(final String s) {
        net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(s);
        net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl().llllIIIIlIIIlIlllIll(new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIIIIIIlllIlIllIl(s));
    }
    
    public static void llllIIIIlIIIlIlllIll(final String s, final IntBuffer intBuffer) {
        final StringBuilder sb = new StringBuilder(128);
        sb.append(s).append(" [pos ").append(intBuffer.position()).append(" lim ").append(intBuffer.limit()).append(" cap ").append(intBuffer.capacity()).append(" :");
        for (int limit = intBuffer.limit(), i = 0; i < limit; ++i) {
            sb.append(" ").append(intBuffer.get(i));
        }
        sb.append("]");
        net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI(sb.toString());
    }
    
    public static void llllIIIIlIIIlIlllIll(final Minecraft llllIIIIlIIIlIlllIll) {
        IIIIIIIllllIlIIIIIII();
        net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll = Minecraft.getMinecraft();
        net.optifine.shaders.llIIlllIIlllIIllIllI.IlIlIIIllIllIIIIIllI = GLContext.getCapabilities();
        net.optifine.shaders.llIIlllIIlllIIllIllI.IllIIlllIIIIlllIIlIl = GL11.glGetString(7938);
        net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIlIlllIlIIIIIl = GL11.glGetString(7936);
        net.optifine.shaders.llIIlllIIlllIIllIllI.lIIIIlIIIIIlllIllIII = GL11.glGetString(7937);
        net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("OpenGL Version: " + net.optifine.shaders.llIIlllIIlllIIllIllI.IllIIlllIIIIlllIIlIl);
        net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("Vendor:  " + net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIlIlllIlIIIIIl);
        net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("Renderer: " + net.optifine.shaders.llIIlllIIlllIIllIllI.lIIIIlIIIIIlllIllIII);
        net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("Capabilities: " + (net.optifine.shaders.llIIlllIIlllIIllIllI.IlIlIIIllIllIIIIIllI.OpenGL20 ? " 2.0 " : " - ") + (net.optifine.shaders.llIIlllIIlllIIllIllI.IlIlIIIllIllIIIIIllI.OpenGL21 ? " 2.1 " : " - ") + (net.optifine.shaders.llIIlllIIlllIIllIllI.IlIlIIIllIllIIIIIllI.OpenGL30 ? " 3.0 " : " - ") + (net.optifine.shaders.llIIlllIIlllIIllIllI.IlIlIIIllIllIIIIIllI.OpenGL32 ? " 3.2 " : " - ") + (net.optifine.shaders.llIIlllIIlllIIllIllI.IlIlIIIllIllIIIIIllI.OpenGL40 ? " 4.0 " : " - "));
        net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("GL_MAX_DRAW_BUFFERS: " + GL11.glGetInteger(34852));
        net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("GL_MAX_COLOR_ATTACHMENTS_EXT: " + GL11.glGetInteger(36063));
        net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("GL_MAX_TEXTURE_IMAGE_UNITS: " + GL11.glGetInteger(34930));
        net.optifine.shaders.llIIlllIIlllIIllIllI.lIIIlllIIIllIIIllIII = net.optifine.shaders.llIIlllIIlllIIllIllI.IlIlIIIllIllIIIIIllI.OpenGL30;
        llllIIIIlIIIlIlllIll();
    }
    
    public static void lIIIIlIIIIIlllIllIII() {
        if (llIllIlIIIIllIlIIllI()) {
            net.optifine.shaders.llIIlllIIlllIIllIllI.cZ = 0.5f;
            net.optifine.shaders.llIIlllIIlllIIllIllI.da = 0.6f;
            net.optifine.shaders.llIIlllIIlllIIllIllI.db = 0.8f;
        }
        else {
            net.optifine.shaders.llIIlllIIlllIIllIllI.cZ = 1.0f;
            net.optifine.shaders.llIIlllIIlllIIllIllI.da = 1.0f;
            net.optifine.shaders.llIIlllIIlllIIllIllI.db = 1.0f;
        }
    }
    
    public static boolean lIIIlllIIIllIIIllIII() {
        return net.optifine.shaders.llIIlllIIlllIIllIllI.cm.llllIIIlIlllIlIIIIIl() ? (net.optifine.shaders.llIIlllIIlllIIllIllI.cI.llllIIIlIlllIlIIIIIl() || net.optifine.shaders.llIIlllIIlllIIllIllI.cI.lIIIIlIIIIIlllIllIII()) : net.optifine.shaders.llIIlllIIlllIIllIllI.cm.lIIIIlIIIIIlllIllIII();
    }
    
    public static boolean llIIlIIIlIIIllIlIIIl() {
        return net.optifine.shaders.llIIlllIIlllIIllIllI.cJ.llllIIIlIlllIlIIIIIl() || net.optifine.shaders.llIIlllIIlllIIllIllI.cJ.lIIIIlIIIIIlllIllIII();
    }
    
    public static boolean llIllIlIIIIllIlIIllI() {
        return net.optifine.shaders.llIIlllIIlllIIllIllI.cl.llllIIIlIlllIlIIIIIl() ? (net.optifine.shaders.llIIlllIIlllIIllIllI.cH.llllIIIlIlllIlIIIIIl() || net.optifine.shaders.llIIlllIIlllIIllIllI.cH.lIIIIlIIIIIlllIllIII()) : net.optifine.shaders.llIIlllIIlllIIllIllI.cl.lIIIIlIIIIIlllIllIII();
    }
    
    public static boolean lIlIlIIIllIIllIIIllI() {
        return !net.optifine.shaders.llIIlllIIlllIIllIllI.cK.lIIIlllIIIllIIIllIII();
    }
    
    public static boolean IlIlIIIllIIllIlllllI() {
        return !net.optifine.shaders.llIIlllIIlllIIllIllI.cL.lIIIlllIIIllIIIllIII();
    }
    
    public static boolean IIIIlllIIIIIIlIIIlll() {
        return !net.optifine.shaders.llIIlllIIlllIIllIllI.cM.lIIIlllIIIllIIIllIII();
    }
    
    public static boolean llllIIllllIlIlIIIIll() {
        return !net.optifine.shaders.llIIlllIIlllIIllIllI.cN.lIIIlllIIIllIIIllIII();
    }
    
    public static boolean IlIllIlIlIIIlIlIlIII() {
        return !net.optifine.shaders.llIIlllIIlllIIllIllI.cO.lIIIlllIIIllIIIllIII();
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final IlIIlIlIIIlIIlIlIlII ilIIlIlIIIlIIlIlIlII) {
        switch (llllIlIllllIIlIIlIlI()[ilIIlIlIIIlIIlIlIlII.ordinal()]) {
            case 1: {
                return net.optifine.shaders.llIIlllIIlllIIllIllI.cP.lIIIIlIIIIIlllIllIII();
            }
            case 3: {
                return net.optifine.shaders.llIIlllIIlllIIllIllI.cQ.lIIIIlIIIIIlllIllIII();
            }
            case 2: {
                return net.optifine.shaders.llIIlllIIlllIIllIllI.cR.lIIIIlIIIIIlllIllIII();
            }
            case 4: {
                return net.optifine.shaders.llIIlllIIlllIIllIllI.cS.lIIIIlIIIIIlllIllIII();
            }
            default: {
                return false;
            }
        }
    }
    
    public static boolean IIlllIIlIllIllIlIIll() {
        return net.optifine.shaders.llIIlllIIlllIIllIllI.cT.lIIIIlIIIIIlllIllIII();
    }
    
    public static boolean lllIIIIlllllIlIIllIl() {
        return net.optifine.shaders.llIIlllIIlllIIllIllI.cU.lIIIIlIIIIIlllIllIII();
    }
    
    public static boolean IlIlIIIIIIlllIlIllIl() {
        return net.optifine.shaders.llIIlllIIlllIIllIllI.cV.lIIIIlIIIIIlllIllIII();
    }
    
    public static boolean IIllIIllIIIlIlIIIIlI() {
        return !net.optifine.shaders.llIIlllIIlllIIllIllI.cW.lIIIlllIIIllIIIllIII();
    }
    
    public static void IIIlIIIlIlIIlllIIlll() {
        boolean b;
        if (!net.optifine.shaders.llIIlllIIlllIIllIllI.llIllIIIIIllIlIIIIlI) {
            net.optifine.shaders.llIIlllIIlllIIllIllI.llIllIIIIIllIlIIIIlI = true;
            b = true;
        }
        else {
            b = false;
        }
        if (!net.optifine.shaders.llIIlllIIlllIIllIllI.IlIIIlIlIIIllIlIlIIl) {
            llllIIIlIlllIlIIIIIl("Shaders.init pre");
            if (IIIllIIllIIIIIIlIIlI() != null) {}
            if (!net.optifine.shaders.llIIlllIIlllIIllIllI.IlIlIIIllIllIIIIIllI.OpenGL20) {
                IlIlIIIllIIllIlllllI("No OpenGL 2.0");
            }
            if (!net.optifine.shaders.llIIlllIIlllIIllIllI.IlIlIIIllIllIIIIIllI.GL_EXT_framebuffer_object) {
                IlIlIIIllIIllIlllllI("No EXT_framebuffer_object");
            }
            net.optifine.shaders.llIIlllIIlllIIllIllI.dM.position(0).limit(8);
            net.optifine.shaders.llIIlllIIlllIIllIllI.dI.position(0).limit(16);
            net.optifine.shaders.llIIlllIIlllIIllIllI.dJ.position(0).limit(3);
            net.optifine.shaders.llIIlllIIlllIIllIllI.dN.position(0).limit(8);
            net.optifine.shaders.llIIlllIIlllIIllIllI.dL.position(0).limit(2);
            net.optifine.shaders.llIIlllIIlllIIllIllI.dK.position(0).limit(8);
            net.optifine.shaders.llIIlllIIlllIIllIllI.aT = 4;
            net.optifine.shaders.llIIlllIIlllIIllIllI.aU = 1;
            net.optifine.shaders.llIIlllIIlllIIllIllI.aV = 0;
            net.optifine.shaders.llIIlllIIlllIIllIllI.aW = 0;
            net.optifine.shaders.llIIlllIIlllIIllIllI.aX = 1;
            net.optifine.shaders.llIIlllIIlllIIllIllI.aY = 1;
            Arrays.fill(net.optifine.shaders.llIIlllIIlllIIllIllI.eg, 6408);
            Arrays.fill(net.optifine.shaders.llIIlllIIlllIIllIllI.bb, true);
            Arrays.fill(net.optifine.shaders.llIIlllIIlllIIllIllI.bc, null);
            Arrays.fill(net.optifine.shaders.llIIlllIIlllIIllIllI.bS, false);
            Arrays.fill(net.optifine.shaders.llIIlllIIlllIIllIllI.bT, false);
            Arrays.fill(net.optifine.shaders.llIIlllIIlllIIllIllI.bU, false);
            Arrays.fill(net.optifine.shaders.llIIlllIIlllIIllIllI.bV, false);
            Arrays.fill(net.optifine.shaders.llIIlllIIlllIIllIllI.bW, false);
            net.optifine.shaders.llIIlllIIlllIIllIllI.lllllIIlIlIIIlIlIIIl = false;
            net.optifine.shaders.llIIlllIIlllIIllIllI.eC = false;
            net.optifine.shaders.llIIlllIIlllIIllIllI.dd = 0.0f;
            net.optifine.shaders.llIIlllIIlllIIllIllI.dk = 2.0f;
            net.optifine.shaders.llIIlllIIlllIIllIllI.aC = 1024;
            net.optifine.shaders.llIIlllIIlllIIllIllI.aD = 1024;
            net.optifine.shaders.llIIlllIIlllIIllIllI.aE = 1024;
            net.optifine.shaders.llIIlllIIlllIIllIllI.aF = 1024;
            net.optifine.shaders.llIIlllIIlllIIllIllI.aG = 90.0f;
            net.optifine.shaders.llIIlllIIlllIIllIllI.aH = 160.0f;
            net.optifine.shaders.llIIlllIIlllIIllIllI.aI = true;
            net.optifine.shaders.llIIlllIIlllIIllIllI.aJ = -1.0f;
            net.optifine.shaders.llIIlllIIlllIIllIllI.dc = -1.0f;
            net.optifine.shaders.llIIlllIIlllIIllIllI.IlIIIIIlIIllIIlIlIll = false;
            net.optifine.shaders.llIIlllIIlllIIllIllI.IllllIIlIlIllIIIllII = false;
            net.optifine.shaders.llIIlllIIlllIIllIllI.lllllIIIIIlIIlllIlIl = false;
            net.optifine.shaders.llIIlllIIlllIIllIllI.aN = false;
            net.optifine.shaders.llIIlllIIlllIIllIllI.ee = false;
            lIIIIlIIIIIlllIllIII();
            net.optifine.shaders.llIllIIIIIllIlIIIIlI.IIlllIIlIllIllIlIIll.IlIlIlIlIlllllllllIl();
            net.optifine.shaders.llIIlllIIlllIIllIllI.ef.llllIIIIlIIIlIlllIll();
            if (net.optifine.shaders.llIIlllIIlllIIllIllI.ev != null) {
                net.optifine.shaders.llIIlllIIlllIIllIllI.ev.IlIlIlIlIlllllllllIl();
            }
            final IlIlIllllllllIIIIlII llllIIIIlIIIlIlllIll = net.optifine.shaders.lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.cC, net.optifine.shaders.llIIlllIIlllIIllIllI.em, false);
            String string = "";
            if (net.optifine.shaders.llIIlllIIlllIIllIllI.ep != null) {
                final int iIlllIIlIllIllIlIIll = net.optifine.shaders.llIIlllIIlllIIllIllI.ep.IlIllIlIlIIIlIlIlIII.IIlllIIlIllIllIlIIll();
                if (net.optifine.shaders.llIIlllIIlllIIllIllI.eq.contains(iIlllIIlIllIllIlIIll)) {
                    string = "world" + iIlllIIlIllIllIlIIll + "/";
                }
            }
            for (int i = 0; i < net.optifine.shaders.llIIlllIIlllIIllIllI.bL.length; ++i) {
                final net.optifine.shaders.IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII = net.optifine.shaders.llIIlllIIlllIIllIllI.bL[i];
                ilIllIlIlIIIlIlIlIII.IlIlIlIlIlllllllllIl();
                ilIllIlIlIIIlIlIlIII.llIllIIIIIllIlIIIIlI();
                if (ilIllIlIlIIIlIlIlIII.IllIIlllIIIIlllIIlIl() != net.optifine.shaders.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll) {
                    String s = String.valueOf(string) + ilIllIlIlIIIlIlIlIII.IlIlIIIllIllIIIIIllI();
                    boolean b2 = true;
                    if (net.optifine.shaders.llIIlllIIlllIIllIllI.cE.containsKey(s)) {
                        b2 = (b2 && net.optifine.shaders.llIIlllIIlllIIllIllI.cE.get(s).llIllIIIIIllIlIIIIlI());
                    }
                    if (llllIIIIlIIIlIlllIll != null) {
                        b2 = (b2 && !llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl(s));
                    }
                    if (!b2) {
                        net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("Program disabled: " + s);
                        s = String.valueOf(string) + "<disabled>";
                    }
                    final String string2 = "/shaders/" + s;
                    llllIIIIlIIIlIlllIll(ilIllIlIlIIIlIlIlIII, String.valueOf(string2) + ".vsh", String.valueOf(string2) + ".gsh", String.valueOf(string2) + ".fsh");
                    if (ilIllIlIlIIIlIlIlIII.lIIIIlIIIIIlllIllIII() > 0) {
                        net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("Program loaded: " + s);
                    }
                    IlIlIlIlIlllllllllIl(ilIllIlIlIIIlIlIlIII);
                    llIllIIIIIllIlIIIIlI(ilIllIlIlIIIlIlIlIII);
                }
            }
            net.optifine.shaders.llIIlllIIlllIIllIllI.ej = false;
            for (int j = 0; j < net.optifine.shaders.llIIlllIIlllIIllIllI.bC.length; ++j) {
                if (net.optifine.shaders.llIIlllIIlllIIllIllI.bC[j].lIIIIlIIIIIlllIllIII() != 0) {
                    net.optifine.shaders.llIIlllIIlllIIllIllI.ej = true;
                    break;
                }
            }
            net.optifine.shaders.llIIlllIIlllIIllIllI.aX = net.optifine.shaders.llIIlllIIlllIIllIllI.aT;
            net.optifine.shaders.llIIlllIIlllIIllIllI.aA = ((net.optifine.shaders.llIIlllIIlllIIllIllI.aW > 0) ? 1 : 0);
            net.optifine.shaders.llIIlllIIlllIIllIllI.aM = (net.optifine.shaders.llIIlllIIlllIIllIllI.aW > 0);
            net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("usedColorBuffers: " + net.optifine.shaders.llIIlllIIlllIIllIllI.aT);
            net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("usedDepthBuffers: " + net.optifine.shaders.llIIlllIIlllIIllIllI.aU);
            net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("usedShadowColorBuffers: " + net.optifine.shaders.llIIlllIIlllIIllIllI.aV);
            net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("usedShadowDepthBuffers: " + net.optifine.shaders.llIIlllIIlllIIllIllI.aW);
            net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("usedColorAttachs: " + net.optifine.shaders.llIIlllIIlllIIllIllI.aX);
            net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("usedDrawBuffers: " + net.optifine.shaders.llIIlllIIlllIIllIllI.aY);
            net.optifine.shaders.llIIlllIIlllIIllIllI.dM.position(0).limit(net.optifine.shaders.llIIlllIIlllIIllIllI.aY);
            net.optifine.shaders.llIIlllIIlllIIllIllI.dI.position(0).limit(net.optifine.shaders.llIIlllIIlllIIllIllI.aT * 2);
            net.optifine.shaders.llIIlllIIlllIIllIllI.dQ.llllIIIIlIIIlIlllIll();
            for (int k = 0; k < net.optifine.shaders.llIIlllIIlllIIllIllI.aY; ++k) {
                net.optifine.shaders.llIIlllIIlllIIllIllI.dM.put(k, 36064 + k);
            }
            final int glGetInteger = GL11.glGetInteger(34852);
            if (net.optifine.shaders.llIIlllIIlllIIllIllI.aY > glGetInteger) {
                IlIlIIIllIIllIlllllI("[Shaders] Error: Not enough draw buffers, needed: " + net.optifine.shaders.llIIlllIIlllIIllIllI.aY + ", available: " + glGetInteger);
            }
            net.optifine.shaders.llIIlllIIlllIIllIllI.dN.position(0).limit(net.optifine.shaders.llIIlllIIlllIIllIllI.aV);
            for (int l = 0; l < net.optifine.shaders.llIIlllIIlllIIllIllI.aV; ++l) {
                net.optifine.shaders.llIIlllIIlllIIllIllI.dN.put(l, 36064 + l);
            }
            for (int n = 0; n < net.optifine.shaders.llIIlllIIlllIIllIllI.bL.length; ++n) {
                net.optifine.shaders.IlIllIlIlIIIlIlIlIII llllIIIlIlllIlIIIIIl;
                net.optifine.shaders.IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII2;
                for (ilIllIlIlIIIlIlIlIII2 = (llllIIIlIlllIlIIIIIl = net.optifine.shaders.llIIlllIIlllIIllIllI.bL[n]); llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII() == 0 && llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl() != llllIIIlIlllIlIIIIIl; llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl()) {}
                if (llllIIIlIlllIlIIIIIl != ilIllIlIlIIIlIlIlIII2 && ilIllIlIlIIIlIlIlIII2 != net.optifine.shaders.llIIlllIIlllIIllIllI.be) {
                    ilIllIlIlIIIlIlIlIII2.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl);
                }
            }
            h();
            i();
            if (net.optifine.shaders.llIIlllIIlllIIllIllI.eC) {
                f();
            }
            if (net.optifine.shaders.llIIlllIIlllIIllIllI.bR == null) {
                net.optifine.shaders.llIIlllIIlllIIllIllI.bR = net.optifine.shaders.IIlIIIIIllIlIIIlIIll.llllIIIIlIIIlIlllIll();
            }
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-90.0f, 0.0f, 1.0f, 0.0f);
            IIlllIlIIllIlIlIlIIl();
            llIIIlIlIllIIlIlIlII();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
            net.optifine.shaders.llIIlllIIlllIIllIllI.IlIIIlIlIIIllIlIlIIl = true;
            g();
            IlIlIIIlIIlIlIIlllIl();
            if (!b) {}
            llllIIIlIlllIlIIIIIl("Shaders.init");
        }
    }
    
    private static void IlIlIlIlIlllllllllIl(final net.optifine.shaders.IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII) {
        final int glGetInteger = GL11.glGetInteger(34852);
        Arrays.fill(ilIllIlIlIIIlIlIlIII.IlIlIIIIIIlllIlIllIl(), false);
        if (ilIllIlIlIIIlIlIlIII == net.optifine.shaders.llIIlllIIlllIIllIllI.bJ) {
            ilIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll((IntBuffer)null);
        }
        else if (ilIllIlIlIIIlIlIlIII.lIIIIlIIIIIlllIllIII() == 0) {
            if (ilIllIlIlIIIlIlIlIII == net.optifine.shaders.llIIlllIIlllIIllIllI.be) {
                ilIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.dO);
            }
            else {
                ilIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.dP);
            }
        }
        else {
            final String llIIlIIIlIIIllIlIIIl = ilIllIlIlIIIlIlIlIII.llIIlIIIlIIIllIlIIIl();
            if (llIIlIIIlIIIllIlIIIl == null) {
                if (ilIllIlIlIIIlIlIlIII != net.optifine.shaders.llIIlllIIlllIIllIllI.be && ilIllIlIlIIIlIlIlIII != net.optifine.shaders.llIIlllIIlllIIllIllI.bf && ilIllIlIlIIIlIlIlIII != net.optifine.shaders.llIIlllIIlllIIllIllI.bg) {
                    ilIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.dM);
                    net.optifine.shaders.llIIlllIIlllIIllIllI.aY = net.optifine.shaders.llIIlllIIlllIIllIllI.aT;
                    Arrays.fill(ilIllIlIlIIIlIlIlIII.IlIlIIIIIIlllIlIllIl(), 0, net.optifine.shaders.llIIlllIIlllIIllIllI.aT, true);
                }
                else {
                    ilIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.dN);
                }
            }
            else {
                final IntBuffer lIlIlIIIllIIllIIIllI = ilIllIlIlIIIlIlIlIII.lIlIlIIIllIIllIIIllI();
                final int length = llIIlIIIlIIIllIlIIIl.length();
                net.optifine.shaders.llIIlllIIlllIIllIllI.aY = Math.max(net.optifine.shaders.llIIlllIIlllIIllIllI.aY, length);
                final int min = Math.min(length, glGetInteger);
                ilIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI);
                lIlIlIIIllIIllIIIllI.limit(min);
                for (int i = 0; i < min; ++i) {
                    lIlIlIIIllIIllIIIllI.put(i, llllIIIIlIIIlIlllIll(ilIllIlIlIIIlIlIlIII, llIIlIIIlIIIllIlIIIl, i));
                }
            }
        }
    }
    
    private static int llllIIIIlIIIlIlllIll(final net.optifine.shaders.IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII, final String s, final int n) {
        int n2 = 0;
        if (n >= s.length()) {
            return n2;
        }
        final int n3 = s.charAt(n) - '0';
        if (ilIllIlIlIIIlIlIlIII == net.optifine.shaders.llIIlllIIlllIIllIllI.be) {
            if (n3 >= 0 && n3 <= 1) {
                n2 = n3 + 36064;
                net.optifine.shaders.llIIlllIIlllIIllIllI.aV = Math.max(net.optifine.shaders.llIIlllIIlllIIllIllI.aV, n3);
            }
            return n2;
        }
        if (n3 >= 0 && n3 <= 7) {
            ilIllIlIlIIIlIlIlIII.IlIlIIIIIIlllIlIllIl()[n3] = true;
            n2 = n3 + 36064;
            net.optifine.shaders.llIIlllIIlllIIllIllI.aX = Math.max(net.optifine.shaders.llIIlllIIlllIIllIllI.aX, n3);
            net.optifine.shaders.llIIlllIIlllIIllIllI.aT = Math.max(net.optifine.shaders.llIIlllIIlllIIllIllI.aT, n3);
        }
        return n2;
    }
    
    private static void llIllIIIIIllIlIIIIlI(final net.optifine.shaders.IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII) {
        final boolean[] ilIlIIIIIIlllIlIllIl = ilIllIlIlIIIlIlIlIII.IlIlIIIIIIlllIlIllIl();
        final Boolean[] lllIIIIlllllIlIIllIl = ilIllIlIlIIIlIlIlIII.lllIIIIlllllIlIIllIl();
        for (int i = 0; i < lllIIIIlllllIlIIllIl.length; ++i) {
            final Boolean b = lllIIIIlllllIlIIllIl[i];
            if (b != null) {
                ilIlIIIIIIlllIlIllIl[i] = b;
            }
        }
    }
    
    public static void IlIlIIIlIIlIlIIlllIl() {
        net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("Reset model renderers");
        ++net.optifine.shaders.llIIlllIIlllIIllIllI.llIIlIIIlIIIllIlIIIl;
        net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("Reset world renderers");
        net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl();
    }
    
    private static void llllIIIIlIIIlIlllIll(final net.optifine.shaders.IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII, final String s, final String s2, final String s3) {
        llllIIIlIlllIlIIIIIl("pre setupProgram");
        final int glCreateProgramObjectARB = ARBShaderObjects.glCreateProgramObjectARB();
        llllIIIlIlllIlIIIIIl("create");
        if (glCreateProgramObjectARB != 0) {
            net.optifine.shaders.llIIlllIIlllIIllIllI.IlIllllIIIlIllIlIIll = false;
            net.optifine.shaders.llIIlllIIlllIIllIllI.lIIIIIlIlIIIlIIIIlIl = false;
            net.optifine.shaders.llIIlllIIlllIIllIllI.IIllIIIlIIIIlIIlIIII = false;
            final int llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(ilIllIlIlIIIlIlIlIII, s);
            final int ilIlIlIlIlllllllllIl = IlIlIlIlIlllllllllIl(ilIllIlIlIIIlIlIlIII, s2);
            final int llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI(ilIllIlIlIIIlIlIlIII, s3);
            llllIIIlIlllIlIIIIIl("create");
            if (llllIIIIlIIIlIlllIll == 0 && ilIlIlIlIlllllllllIl == 0 && llIllIIIIIllIlIIIIlI == 0) {
                ARBShaderObjects.glDeleteObjectARB(glCreateProgramObjectARB);
                ilIllIlIlIIIlIlIlIII.IlIlIlIlIlllllllllIl();
            }
            else {
                if (llllIIIIlIIIlIlllIll != 0) {
                    ARBShaderObjects.glAttachObjectARB(glCreateProgramObjectARB, llllIIIIlIIIlIlllIll);
                    llllIIIlIlllIlIIIIIl("attach");
                }
                if (ilIlIlIlIlllllllllIl != 0) {
                    ARBShaderObjects.glAttachObjectARB(glCreateProgramObjectARB, ilIlIlIlIlllllllllIl);
                    llllIIIlIlllIlIIIIIl("attach");
                    if (net.optifine.shaders.llIIlllIIlllIIllIllI.ec) {
                        ARBGeometryShader4.glProgramParameteriARB(glCreateProgramObjectARB, 36315, 4);
                        ARBGeometryShader4.glProgramParameteriARB(glCreateProgramObjectARB, 36316, 5);
                        ARBGeometryShader4.glProgramParameteriARB(glCreateProgramObjectARB, 36314, net.optifine.shaders.llIIlllIIlllIIllIllI.ed);
                        llllIIIlIlllIlIIIIIl("arbGeometryShader4");
                    }
                    net.optifine.shaders.llIIlllIIlllIIllIllI.ee = true;
                }
                if (llIllIIIIIllIlIIIIlI != 0) {
                    ARBShaderObjects.glAttachObjectARB(glCreateProgramObjectARB, llIllIIIIIllIlIIIIlI);
                    llllIIIlIlllIlIIIIIl("attach");
                }
                if (net.optifine.shaders.llIIlllIIlllIIllIllI.IlIllllIIIlIllIlIIll) {
                    ARBVertexShader.glBindAttribLocationARB(glCreateProgramObjectARB, net.optifine.shaders.llIIlllIIlllIIllIllI.IIllIIIlIIlIlIlIIIII, (CharSequence)"mc_Entity");
                    llllIIIlIlllIlIIIIIl("mc_Entity");
                }
                if (net.optifine.shaders.llIIlllIIlllIIllIllI.lIIIIIlIlIIIlIIIIlIl) {
                    ARBVertexShader.glBindAttribLocationARB(glCreateProgramObjectARB, net.optifine.shaders.llIIlllIIlllIIllIllI.llIllIIlllllllllllll, (CharSequence)"mc_midTexCoord");
                    llllIIIlIlllIlIIIIIl("mc_midTexCoord");
                }
                if (net.optifine.shaders.llIIlllIIlllIIllIllI.IIllIIIlIIIIlIIlIIII) {
                    ARBVertexShader.glBindAttribLocationARB(glCreateProgramObjectARB, net.optifine.shaders.llIIlllIIlllIIllIllI.lllllIIllIlIllIllllI, (CharSequence)"at_tangent");
                    llllIIIlIlllIlIIIIIl("at_tangent");
                }
                ARBShaderObjects.glLinkProgramARB(glCreateProgramObjectARB);
                if (GL20.glGetProgrami(glCreateProgramObjectARB, 35714) != 1) {
                    net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll("Error linking program: " + glCreateProgramObjectARB + " (" + ilIllIlIlIIIlIlIlIII.IlIlIIIllIllIIIIIllI() + ")");
                }
                llllIIIlIlllIlIIIIIl(glCreateProgramObjectARB, ilIllIlIlIIIlIlIlIII.IlIlIIIllIllIIIIIllI());
                if (llllIIIIlIIIlIlllIll != 0) {
                    ARBShaderObjects.glDetachObjectARB(glCreateProgramObjectARB, llllIIIIlIIIlIlllIll);
                    ARBShaderObjects.glDeleteObjectARB(llllIIIIlIIIlIlllIll);
                }
                if (ilIlIlIlIlllllllllIl != 0) {
                    ARBShaderObjects.glDetachObjectARB(glCreateProgramObjectARB, ilIlIlIlIlllllllllIl);
                    ARBShaderObjects.glDeleteObjectARB(ilIlIlIlIlllllllllIl);
                }
                if (llIllIIIIIllIlIIIIlI != 0) {
                    ARBShaderObjects.glDetachObjectARB(glCreateProgramObjectARB, llIllIIIIIllIlIIIIlI);
                    ARBShaderObjects.glDeleteObjectARB(llIllIIIIIllIlIIIIlI);
                }
                ilIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(glCreateProgramObjectARB);
                ilIllIlIlIIIlIlIlIII.IlIlIlIlIlllllllllIl(glCreateProgramObjectARB);
                llllIIIIlIIIlIlllIll(ilIllIlIlIIIlIlIlIII);
                ARBShaderObjects.glValidateProgramARB(glCreateProgramObjectARB);
                llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.bd);
                llllIIIlIlllIlIIIIIl(glCreateProgramObjectARB, ilIllIlIlIIIlIlIlIII.IlIlIIIllIllIIIIIllI());
                if (GL20.glGetProgrami(glCreateProgramObjectARB, 35715) != 1) {
                    final String s4 = "\"";
                    IlIlIIIllIIllIlllllI("[Shaders] Error: Invalid program " + s4 + ilIllIlIlIIIlIlIlIII.IlIlIIIllIllIIIIIllI() + s4);
                    ARBShaderObjects.glDeleteObjectARB(glCreateProgramObjectARB);
                    ilIllIlIlIIIlIlIlIII.IlIlIlIlIlllllllllIl();
                }
            }
        }
    }
    
    private static int llllIIIIlIIIlIlllIll(final net.optifine.shaders.IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII, final String s) {
        final int glCreateShaderObjectARB = ARBShaderObjects.glCreateShaderObjectARB(35633);
        if (glCreateShaderObjectARB == 0) {
            return 0;
        }
        final StringBuilder sb = new StringBuilder(131072);
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(IIIIlllIIIIIIlIIIlll(s));
        }
        catch (Exception ex2) {
            ARBShaderObjects.glDeleteObjectARB(glCreateShaderObjectARB);
            return 0;
        }
        final IIIIlllIIIIIIlIIIlll[] llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.em);
        final ArrayList list = new ArrayList();
        if (bufferedReader != null) {
            try {
                final BufferedReader llllIIIIlIIIlIlllIll2 = net.optifine.shaders.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(bufferedReader, s, net.optifine.shaders.llIIlllIIlllIIllIllI.el, 0, list, 0);
                final net.optifine.shaders.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI = new net.optifine.shaders.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI();
                while (true) {
                    final String line = llllIIIIlIIIlIlllIll2.readLine();
                    if (line == null) {
                        break;
                    }
                    final String llllIIIIlIIIlIlllIll3 = llllIIIIlIIIlIlllIll(line, llllIIIIlIIIlIlllIll);
                    sb.append(llllIIIIlIIIlIlllIll3).append('\n');
                    if (!ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3)) {
                        continue;
                    }
                    final net.optifine.shaders.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI llllIIIIlIIIlIlllIll4 = net.optifine.shaders.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3);
                    if (llllIIIIlIIIlIlllIll4 == null) {
                        continue;
                    }
                    if (llllIIIIlIIIlIlllIll4.IlIlIlIlIlllllllllIl("mc_Entity")) {
                        net.optifine.shaders.llIIlllIIlllIIllIllI.IlIIIIIlIIllIIlIlIll = true;
                        net.optifine.shaders.llIIlllIIlllIIllIllI.IlIllllIIIlIllIlIIll = true;
                    }
                    else if (llllIIIIlIIIlIlllIll4.IlIlIlIlIlllllllllIl("mc_midTexCoord")) {
                        net.optifine.shaders.llIIlllIIlllIIllIllI.IllllIIlIlIllIIIllII = true;
                        net.optifine.shaders.llIIlllIIlllIIllIllI.lIIIIIlIlIIIlIIIIlIl = true;
                    }
                    else if (llllIIIIlIIIlIlllIll4.IlIlIlIlIlllllllllIl("at_tangent")) {
                        net.optifine.shaders.llIIlllIIlllIIllIllI.lllllIIIIIlIIlllIlIl = true;
                        net.optifine.shaders.llIIlllIIlllIIllIllI.IIllIIIlIIIIlIIlIIII = true;
                    }
                    if (!llllIIIIlIIIlIlllIll4.IlIIIlIlIIIllIlIlIIl("countInstances")) {
                        continue;
                    }
                    ilIllIlIlIIIlIlIlIII.IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll4.lIlIlIIIllIIllIIIllI());
                    net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("countInstances: " + ilIllIlIlIIIlIlIlIII.IIIIlllIIIIIIlIIIlll());
                }
                llllIIIIlIIIlIlllIll2.close();
            }
            catch (Exception ex) {
                net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll("Couldn't read " + s + "!");
                ex.printStackTrace();
                ARBShaderObjects.glDeleteObjectARB(glCreateShaderObjectARB);
                return 0;
            }
        }
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.cY) {
            llllIIIIlIIIlIlllIll(s, sb.toString());
        }
        ARBShaderObjects.glShaderSourceARB(glCreateShaderObjectARB, (CharSequence)sb);
        ARBShaderObjects.glCompileShaderARB(glCreateShaderObjectARB);
        if (GL20.glGetShaderi(glCreateShaderObjectARB, 35713) != 1) {
            net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll("Error compiling vertex shader: " + s);
        }
        llllIIIIlIIIlIlllIll(glCreateShaderObjectARB, s, list);
        return glCreateShaderObjectARB;
    }
    
    private static int IlIlIlIlIlllllllllIl(final net.optifine.shaders.IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII, final String s) {
        final int glCreateShaderObjectARB = ARBShaderObjects.glCreateShaderObjectARB(36313);
        if (glCreateShaderObjectARB == 0) {
            return 0;
        }
        final StringBuilder sb = new StringBuilder(131072);
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(IIIIlllIIIIIIlIIIlll(s));
        }
        catch (Exception ex2) {
            ARBShaderObjects.glDeleteObjectARB(glCreateShaderObjectARB);
            return 0;
        }
        final IIIIlllIIIIIIlIIIlll[] llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.em);
        final ArrayList list = new ArrayList();
        net.optifine.shaders.llIIlllIIlllIIllIllI.ec = false;
        net.optifine.shaders.llIIlllIIlllIIllIllI.ed = 3;
        if (bufferedReader != null) {
            try {
                final BufferedReader llllIIIIlIIIlIlllIll2 = net.optifine.shaders.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(bufferedReader, s, net.optifine.shaders.llIIlllIIlllIIllIllI.el, 0, list, 0);
                final net.optifine.shaders.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI = new net.optifine.shaders.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI();
                while (true) {
                    final String line = llllIIIIlIIIlIlllIll2.readLine();
                    if (line == null) {
                        break;
                    }
                    final String llllIIIIlIIIlIlllIll3 = llllIIIIlIIIlIlllIll(line, llllIIIIlIIIlIlllIll);
                    sb.append(llllIIIIlIIIlIlllIll3).append('\n');
                    if (!ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3)) {
                        continue;
                    }
                    final net.optifine.shaders.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI llllIIIIlIIIlIlllIll4 = net.optifine.shaders.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3);
                    if (llllIIIIlIIIlIlllIll4 == null) {
                        continue;
                    }
                    if (llllIIIIlIIIlIlllIll4.lIIIIlIIIIIlllIllIII("GL_ARB_geometry_shader4")) {
                        final String liiiIlIIIIIlllIllIII = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII(llllIIIIlIIIlIlllIll4.llIllIIIIIllIlIIIIlI());
                        if (liiiIlIIIIIlllIllIII.equals("enable") || liiiIlIIIIIlllIllIII.equals("require") || liiiIlIIIIIlllIllIII.equals("warn")) {
                            net.optifine.shaders.llIIlllIIlllIIllIllI.ec = true;
                        }
                    }
                    if (!llllIIIIlIIIlIlllIll4.IlIIIlIlIIIllIlIlIIl("maxVerticesOut")) {
                        continue;
                    }
                    net.optifine.shaders.llIIlllIIlllIIllIllI.ed = llllIIIIlIIIlIlllIll4.lIlIlIIIllIIllIIIllI();
                }
                llllIIIIlIIIlIlllIll2.close();
            }
            catch (Exception ex) {
                net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll("Couldn't read " + s + "!");
                ex.printStackTrace();
                ARBShaderObjects.glDeleteObjectARB(glCreateShaderObjectARB);
                return 0;
            }
        }
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.cY) {
            llllIIIIlIIIlIlllIll(s, sb.toString());
        }
        ARBShaderObjects.glShaderSourceARB(glCreateShaderObjectARB, (CharSequence)sb);
        ARBShaderObjects.glCompileShaderARB(glCreateShaderObjectARB);
        if (GL20.glGetShaderi(glCreateShaderObjectARB, 35713) != 1) {
            net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll("Error compiling geometry shader: " + s);
        }
        llllIIIIlIIIlIlllIll(glCreateShaderObjectARB, s, list);
        return glCreateShaderObjectARB;
    }
    
    private static int llIllIIIIIllIlIIIIlI(final net.optifine.shaders.IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII, final String s) {
        final int glCreateShaderObjectARB = ARBShaderObjects.glCreateShaderObjectARB(35632);
        if (glCreateShaderObjectARB == 0) {
            return 0;
        }
        final StringBuilder sb = new StringBuilder(131072);
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(IIIIlllIIIIIIlIIIlll(s));
        }
        catch (Exception ex2) {
            ARBShaderObjects.glDeleteObjectARB(glCreateShaderObjectARB);
            return 0;
        }
        final IIIIlllIIIIIIlIIIlll[] llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.em);
        final ArrayList list = new ArrayList();
        if (bufferedReader != null) {
            try {
                final BufferedReader llllIIIIlIIIlIlllIll2 = net.optifine.shaders.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(bufferedReader, s, net.optifine.shaders.llIIlllIIlllIIllIllI.el, 0, list, 0);
                final net.optifine.shaders.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI = new net.optifine.shaders.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI();
                while (true) {
                    final String line = llllIIIIlIIIlIlllIll2.readLine();
                    if (line == null) {
                        break;
                    }
                    final String llllIIIIlIIIlIlllIll3 = llllIIIIlIIIlIlllIll(line, llllIIIIlIIIlIlllIll);
                    sb.append(llllIIIIlIIIlIlllIll3).append('\n');
                    if (!ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3)) {
                        continue;
                    }
                    final net.optifine.shaders.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI llllIIIIlIIIlIlllIll4 = net.optifine.shaders.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3);
                    if (llllIIIIlIIIlIlllIll4 == null) {
                        continue;
                    }
                    if (llllIIIIlIIIlIlllIll4.IlIIIlIlIIIllIlIlIIl()) {
                        final String ilIlIlIlIlllllllllIl = llllIIIIlIIIlIlllIll4.IlIlIlIlIlllllllllIl();
                        final int ilIlIlIlIlllllllllIl2;
                        if ((ilIlIlIlIlllllllllIl2 = net.optifine.shaders.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl)) >= 0) {
                            net.optifine.shaders.llIIlllIIlllIIllIllI.aW = Math.max(net.optifine.shaders.llIIlllIIlllIIllIllI.aW, ilIlIlIlIlllllllllIl2 + 1);
                        }
                        else {
                            final int llIllIIIIIllIlIIIIlI;
                            if ((llIllIIIIIllIlIIIIlI = net.optifine.shaders.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl)) >= 0) {
                                net.optifine.shaders.llIIlllIIlllIIllIllI.aV = Math.max(net.optifine.shaders.llIIlllIIlllIIllIllI.aV, llIllIIIIIllIlIIIIlI + 1);
                            }
                            else {
                                final int ilIIIlIlIIIllIlIlIIl;
                                if ((ilIIIlIlIIIllIlIlIIl = net.optifine.shaders.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII.IlIIIlIlIIIllIlIlIIl(ilIlIlIlIlllllllllIl)) >= 0) {
                                    net.optifine.shaders.llIIlllIIlllIIllIllI.aU = Math.max(net.optifine.shaders.llIIlllIIlllIIllIllI.aU, ilIIIlIlIIIllIlIlIIl + 1);
                                }
                                else if (ilIlIlIlIlllllllllIl.equals("gdepth") && net.optifine.shaders.llIIlllIIlllIIllIllI.eg[1] == 6408) {
                                    net.optifine.shaders.llIIlllIIlllIIllIllI.eg[1] = 34836;
                                }
                                else {
                                    final int ilIlIIIllIllIIIIIllI2;
                                    if ((ilIlIIIllIllIIIIIllI2 = net.optifine.shaders.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI(ilIlIlIlIlllllllllIl)) >= 0) {
                                        net.optifine.shaders.llIIlllIIlllIIllIllI.aT = Math.max(net.optifine.shaders.llIIlllIIlllIIllIllI.aT, ilIlIIIllIllIIIIIllI2 + 1);
                                    }
                                    else {
                                        if (!ilIlIlIlIlllllllllIl.equals("centerDepthSmooth")) {
                                            continue;
                                        }
                                        net.optifine.shaders.llIIlllIIlllIIllIllI.lllllIIlIlIIIlIlIIIl = true;
                                    }
                                }
                            }
                        }
                    }
                    else if (!llllIIIIlIIIlIlllIll4.IlIIIlIlIIIllIlIlIIl("shadowMapResolution") && !llllIIIIlIIIlIlllIll4.llIllIIIIIllIlIIIIlI("SHADOWRES")) {
                        if (!llllIIIIlIIIlIlllIll4.IllIIlllIIIIlllIIlIl("shadowMapFov") && !llllIIIIlIIIlIlllIll4.llIllIIIIIllIlIIIIlI("SHADOWFOV")) {
                            if (!llllIIIIlIIIlIlllIll4.IllIIlllIIIIlllIIlIl("shadowDistance") && !llllIIIIlIIIlIlllIll4.llIllIIIIIllIlIIIIlI("SHADOWHPL")) {
                                if (llllIIIIlIIIlIlllIll4.IllIIlllIIIIlllIIlIl("shadowDistanceRenderMul")) {
                                    net.optifine.shaders.llIIlllIIlllIIllIllI.aJ = llllIIIIlIIIlIlllIll4.IlIlIIIllIIllIlllllI();
                                    net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("Shadow distance render mul: " + net.optifine.shaders.llIIlllIIlllIIllIllI.aJ);
                                }
                                else if (llllIIIIlIIIlIlllIll4.IllIIlllIIIIlllIIlIl("shadowIntervalSize")) {
                                    net.optifine.shaders.llIIlllIIlllIIllIllI.dk = llllIIIIlIIIlIlllIll4.IlIlIIIllIIllIlllllI();
                                    net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("Shadow map interval size: " + net.optifine.shaders.llIIlllIIlllIIllIllI.dk);
                                }
                                else if (llllIIIIlIIIlIlllIll4.IlIlIlIlIlllllllllIl("generateShadowMipmap", true)) {
                                    Arrays.fill(net.optifine.shaders.llIIlllIIlllIIllIllI.bT, true);
                                    net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("Generate shadow mipmap");
                                }
                                else if (llllIIIIlIIIlIlllIll4.IlIlIlIlIlllllllllIl("generateShadowColorMipmap", true)) {
                                    Arrays.fill(net.optifine.shaders.llIIlllIIlllIIllIllI.bV, true);
                                    net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("Generate shadow color mipmap");
                                }
                                else if (llllIIIIlIIIlIlllIll4.IlIlIlIlIlllllllllIl("shadowHardwareFiltering", true)) {
                                    Arrays.fill(net.optifine.shaders.llIIlllIIlllIIllIllI.bS, true);
                                    net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("Hardware shadow filtering enabled.");
                                }
                                else if (llllIIIIlIIIlIlllIll4.IlIlIlIlIlllllllllIl("shadowHardwareFiltering0", true)) {
                                    net.optifine.shaders.llIIlllIIlllIIllIllI.bS[0] = true;
                                    net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("shadowHardwareFiltering0");
                                }
                                else if (llllIIIIlIIIlIlllIll4.IlIlIlIlIlllllllllIl("shadowHardwareFiltering1", true)) {
                                    net.optifine.shaders.llIIlllIIlllIIllIllI.bS[1] = true;
                                    net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("shadowHardwareFiltering1");
                                }
                                else if (llllIIIIlIIIlIlllIll4.llllIIIIlIIIlIlllIll("shadowtex0Mipmap", "shadowtexMipmap", true)) {
                                    net.optifine.shaders.llIIlllIIlllIIllIllI.bT[0] = true;
                                    net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("shadowtex0Mipmap");
                                }
                                else if (llllIIIIlIIIlIlllIll4.IlIlIlIlIlllllllllIl("shadowtex1Mipmap", true)) {
                                    net.optifine.shaders.llIIlllIIlllIIllIllI.bT[1] = true;
                                    net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("shadowtex1Mipmap");
                                }
                                else if (llllIIIIlIIIlIlllIll4.llllIIIIlIIIlIlllIll("shadowcolor0Mipmap", "shadowColor0Mipmap", true)) {
                                    net.optifine.shaders.llIIlllIIlllIIllIllI.bV[0] = true;
                                    net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("shadowcolor0Mipmap");
                                }
                                else if (llllIIIIlIIIlIlllIll4.llllIIIIlIIIlIlllIll("shadowcolor1Mipmap", "shadowColor1Mipmap", true)) {
                                    net.optifine.shaders.llIIlllIIlllIIllIllI.bV[1] = true;
                                    net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("shadowcolor1Mipmap");
                                }
                                else if (llllIIIIlIIIlIlllIll4.llllIIIIlIIIlIlllIll("shadowtex0Nearest", "shadowtexNearest", "shadow0MinMagNearest", true)) {
                                    net.optifine.shaders.llIIlllIIlllIIllIllI.bU[0] = true;
                                    net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("shadowtex0Nearest");
                                }
                                else if (llllIIIIlIIIlIlllIll4.llllIIIIlIIIlIlllIll("shadowtex1Nearest", "shadow1MinMagNearest", true)) {
                                    net.optifine.shaders.llIIlllIIlllIIllIllI.bU[1] = true;
                                    net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("shadowtex1Nearest");
                                }
                                else if (llllIIIIlIIIlIlllIll4.llllIIIIlIIIlIlllIll("shadowcolor0Nearest", "shadowColor0Nearest", "shadowColor0MinMagNearest", true)) {
                                    net.optifine.shaders.llIIlllIIlllIIllIllI.bW[0] = true;
                                    net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("shadowcolor0Nearest");
                                }
                                else if (llllIIIIlIIIlIlllIll4.llllIIIIlIIIlIlllIll("shadowcolor1Nearest", "shadowColor1Nearest", "shadowColor1MinMagNearest", true)) {
                                    net.optifine.shaders.llIIlllIIlllIIllIllI.bW[1] = true;
                                    net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("shadowcolor1Nearest");
                                }
                                else if (!llllIIIIlIIIlIlllIll4.IllIIlllIIIIlllIIlIl("wetnessHalflife") && !llllIIIIlIIIlIlllIll4.llIllIIIIIllIlIIIIlI("WETNESSHL")) {
                                    if (!llllIIIIlIIIlIlllIll4.IllIIlllIIIIlllIIlIl("drynessHalflife") && !llllIIIIlIIIlIlllIll4.llIllIIIIIllIlIIIIlI("DRYNESSHL")) {
                                        if (llllIIIIlIIIlIlllIll4.IllIIlllIIIIlllIIlIl("eyeBrightnessHalflife")) {
                                            net.optifine.shaders.llIIlllIIlllIIllIllI.llIIIlIlllIllIIlIllI = llllIIIIlIIIlIlllIll4.IlIlIIIllIIllIlllllI();
                                            net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("Eye brightness halflife: " + net.optifine.shaders.llIIlllIIlllIIllIllI.llIIIlIlllIllIIlIllI);
                                        }
                                        else if (llllIIIIlIIIlIlllIll4.IllIIlllIIIIlllIIlIl("centerDepthHalflife")) {
                                            net.optifine.shaders.llIIlllIIlllIIllIllI.IlIIlllllIIllIIlllll = llllIIIIlIIIlIlllIll4.IlIlIIIllIIllIlllllI();
                                            net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("Center depth halflife: " + net.optifine.shaders.llIIlllIIlllIIllIllI.IlIIlllllIIllIIlllll);
                                        }
                                        else if (llllIIIIlIIIlIlllIll4.IllIIlllIIIIlllIIlIl("sunPathRotation")) {
                                            net.optifine.shaders.llIIlllIIlllIIllIllI.dd = llllIIIIlIIIlIlllIll4.IlIlIIIllIIllIlllllI();
                                            net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("Sun path rotation: " + net.optifine.shaders.llIIlllIIlllIIllIllI.dd);
                                        }
                                        else if (llllIIIIlIIIlIlllIll4.IllIIlllIIIIlllIIlIl("ambientOcclusionLevel")) {
                                            net.optifine.shaders.llIIlllIIlllIIllIllI.dc = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll4.IlIlIIIllIIllIlllllI(), 0.0f, 1.0f);
                                            net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("AO Level: " + net.optifine.shaders.llIIlllIIlllIIllIllI.dc);
                                        }
                                        else if (llllIIIIlIIIlIlllIll4.IlIIIlIlIIIllIlIlIIl("superSamplingLevel")) {
                                            final int lIlIlIIIllIIllIIIllI = llllIIIIlIIIlIlllIll4.lIlIlIIIllIIllIIIllI();
                                            if (lIlIlIIIllIIllIIIllI > 1) {
                                                net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("Super sampling level: " + lIlIlIIIllIIllIIIllI + "x");
                                                net.optifine.shaders.llIIlllIIlllIIllIllI.IIlllllIllIllIlIlIII = lIlIlIIIllIIllIIIllI;
                                            }
                                            else {
                                                net.optifine.shaders.llIIlllIIlllIIllIllI.IIlllllIllIllIlIlIII = 1;
                                            }
                                        }
                                        else if (llllIIIIlIIIlIlllIll4.IlIIIlIlIIIllIlIlIIl("noiseTextureResolution")) {
                                            net.optifine.shaders.llIIlllIIlllIIllIllI.eD = llllIIIIlIIIlIlllIll4.lIlIlIIIllIIllIIIllI();
                                            net.optifine.shaders.llIIlllIIlllIIllIllI.eC = true;
                                            net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("Noise texture enabled");
                                            net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("Noise texture resolution: " + net.optifine.shaders.llIIlllIIlllIIllIllI.eD);
                                        }
                                        else if (llllIIIIlIIIlIlllIll4.IlIlIIIllIllIIIIIllI("Format")) {
                                            final String ilIlIIIllIllIIIIIllI3 = net.optifine.util.IIIllllllIllIIIlllIl.IlIlIIIllIllIIIIIllI(llllIIIIlIIIlIlllIll4.IlIlIlIlIlllllllllIl(), "Format");
                                            final String llIllIIIIIllIlIIIIlI2 = llllIIIIlIIIlIlllIll4.llIllIIIIIllIlIIIIlI();
                                            final int liiiIlIIIIIlllIllIII = lIIIIlIIIIIlllIllIII(ilIlIIIllIllIIIIIllI3);
                                            final int llllIIllllIlIlIIIIll = llllIIllllIlIlIIIIll(llIllIIIIIllIlIIIIlI2);
                                            if (liiiIlIIIIIlllIllIII < 0 || llllIIllllIlIlIIIIll == 0) {
                                                continue;
                                            }
                                            net.optifine.shaders.llIIlllIIlllIIllIllI.eg[liiiIlIIIIIlllIllIII] = llllIIllllIlIlIIIIll;
                                            net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("%s format: %s", ilIlIIIllIllIIIIIllI3, llIllIIIIIllIlIIIIlI2);
                                        }
                                        else if (llllIIIIlIIIlIlllIll4.llllIIIIlIIIlIlllIll("Clear", false)) {
                                            if (!net.optifine.shaders.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl(s) && !net.optifine.shaders.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII.IllIIlllIIIIlllIIlIl(s)) {
                                                continue;
                                            }
                                            final String ilIlIIIllIllIIIIIllI4 = net.optifine.util.IIIllllllIllIIIlllIl.IlIlIIIllIllIIIIIllI(llllIIIIlIIIlIlllIll4.IlIlIlIlIlllllllllIl(), "Clear");
                                            final int liiiIlIIIIIlllIllIII2 = lIIIIlIIIIIlllIllIII(ilIlIIIllIllIIIIIllI4);
                                            if (liiiIlIIIIIlllIllIII2 < 0) {
                                                continue;
                                            }
                                            net.optifine.shaders.llIIlllIIlllIIllIllI.bb[liiiIlIIIIIlllIllIII2] = false;
                                            net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("%s clear disabled", ilIlIIIllIllIIIIIllI4);
                                        }
                                        else if (llllIIIIlIIIlIlllIll4.llIIlIIIlIIIllIlIIIl("ClearColor")) {
                                            if (!net.optifine.shaders.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl(s) && !net.optifine.shaders.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII.IllIIlllIIIIlllIIlIl(s)) {
                                                continue;
                                            }
                                            final String ilIlIIIllIllIIIIIllI5 = net.optifine.util.IIIllllllIllIIIlllIl.IlIlIIIllIllIIIIIllI(llllIIIIlIIIlIlllIll4.IlIlIlIlIlllllllllIl(), "ClearColor");
                                            final int liiiIlIIIIIlllIllIII3 = lIIIIlIIIIIlllIllIII(ilIlIIIllIllIIIIIllI5);
                                            if (liiiIlIIIIIlllIllIII3 < 0) {
                                                continue;
                                            }
                                            final Vector4f iiiIlllIIIIIIlIIIlll = llllIIIIlIIIlIlllIll4.IIIIlllIIIIIIlIIIlll();
                                            if (iiiIlllIIIIIIlIIIlll != null) {
                                                net.optifine.shaders.llIIlllIIlllIIllIllI.bc[liiiIlIIIIIlllIllIII3] = iiiIlllIIIIIIlIIIlll;
                                                net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("%s clear color: %s %s %s %s", ilIlIIIllIllIIIIIllI5, iiiIlllIIIIIIlIIIlll.getX(), iiiIlllIIIIIIlIIIlll.getY(), iiiIlllIIIIIIlIIIlll.getZ(), iiiIlllIIIIIIlIIIlll.getW());
                                            }
                                            else {
                                                net.optifine.shaders.IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl("Invalid color value: " + llllIIIIlIIIlIlllIll4.llIllIIIIIllIlIIIIlI());
                                            }
                                        }
                                        else if (llllIIIIlIIIlIlllIll4.llllIIIIlIIIlIlllIll("GAUX4FORMAT", "RGBA32F")) {
                                            net.optifine.shaders.llIIlllIIlllIIllIllI.eg[7] = 34836;
                                            net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("gaux4 format : RGB32AF");
                                        }
                                        else if (llllIIIIlIIIlIlllIll4.llllIIIIlIIIlIlllIll("GAUX4FORMAT", "RGB32F")) {
                                            net.optifine.shaders.llIIlllIIlllIIllIllI.eg[7] = 34837;
                                            net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("gaux4 format : RGB32F");
                                        }
                                        else if (llllIIIIlIIIlIlllIll4.llllIIIIlIIIlIlllIll("GAUX4FORMAT", "RGB16")) {
                                            net.optifine.shaders.llIIlllIIlllIIllIllI.eg[7] = 32852;
                                            net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("gaux4 format : RGB16");
                                        }
                                        else if (llllIIIIlIIIlIlllIll4.llllIIIIlIIIlIlllIll("MipmapEnabled", true)) {
                                            if (!net.optifine.shaders.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl(s) && !net.optifine.shaders.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII.IllIIlllIIIIlllIIlIl(s) && !net.optifine.shaders.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII.lIIIIlIIIIIlllIllIII(s)) {
                                                continue;
                                            }
                                            final String ilIlIIIllIllIIIIIllI6 = net.optifine.util.IIIllllllIllIIIlllIl.IlIlIIIllIllIIIIIllI(llllIIIIlIIIlIlllIll4.IlIlIlIlIlllllllllIl(), "MipmapEnabled");
                                            final int liiiIlIIIIIlllIllIII4 = lIIIIlIIIIIlllIllIII(ilIlIIIllIllIIIIIllI6);
                                            if (liiiIlIIIIIlllIllIII4 < 0) {
                                                continue;
                                            }
                                            ilIllIlIlIIIlIlIlIII.llIllIIIIIllIlIIIIlI(ilIllIlIlIIIlIlIlIII.IlIlIIIllIIllIlllllI() | 1 << liiiIlIIIIIlllIllIII4);
                                            net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("%s mipmap enabled", ilIlIIIllIllIIIIIllI6);
                                        }
                                        else {
                                            if (!llllIIIIlIIIlIlllIll4.llIllIIIIIllIlIIIIlI("DRAWBUFFERS")) {
                                                continue;
                                            }
                                            final String llIllIIIIIllIlIIIIlI3 = llllIIIIlIIIlIlllIll4.llIllIIIIIllIlIIIIlI();
                                            if (net.optifine.shaders.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII.lIIIlllIIIllIIIllIII(llIllIIIIIllIlIIIIlI3)) {
                                                ilIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI3);
                                            }
                                            else {
                                                net.optifine.shaders.IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl("Invalid draw buffers: " + llIllIIIIIllIlIIIIlI3);
                                            }
                                        }
                                    }
                                    else {
                                        net.optifine.shaders.llIIlllIIlllIIllIllI.lIIIIlIlIllllIIlIllI = llllIIIIlIIIlIlllIll4.IlIlIIIllIIllIlllllI();
                                        net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("Dryness halflife: " + net.optifine.shaders.llIIlllIIlllIIllIllI.lIIIIlIlIllllIIlIllI);
                                    }
                                }
                                else {
                                    net.optifine.shaders.llIIlllIIlllIIllIllI.llIIIIIIlIllIIlIIIll = llllIIIIlIIIlIlllIll4.IlIlIIIllIIllIlllllI();
                                    net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("Wetness halflife: " + net.optifine.shaders.llIIlllIIlllIIllIllI.llIIIIIIlIllIIlIIIll);
                                }
                            }
                            else {
                                net.optifine.shaders.llIIlllIIlllIIllIllI.aH = llllIIIIlIIIlIlllIll4.IlIlIIIllIIllIlllllI();
                                net.optifine.shaders.llIIlllIIlllIIllIllI.aI = true;
                                net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("Shadow map distance: " + net.optifine.shaders.llIIlllIIlllIIllIllI.aH);
                            }
                        }
                        else {
                            net.optifine.shaders.llIIlllIIlllIIllIllI.aG = llllIIIIlIIIlIlllIll4.IlIlIIIllIIllIlllllI();
                            net.optifine.shaders.llIIlllIIlllIIllIllI.aI = false;
                            net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("Shadow map field of view: " + net.optifine.shaders.llIIlllIIlllIIllIllI.aG);
                        }
                    }
                    else {
                        net.optifine.shaders.llIIlllIIlllIIllIllI.aE = (net.optifine.shaders.llIIlllIIlllIIllIllI.aF = llllIIIIlIIIlIlllIll4.lIlIlIIIllIIllIIIllI());
                        net.optifine.shaders.llIIlllIIlllIIllIllI.aC = (net.optifine.shaders.llIIlllIIlllIIllIllI.aD = Math.round(net.optifine.shaders.llIIlllIIlllIIllIllI.aE * net.optifine.shaders.llIIlllIIlllIIllIllI.cb));
                        net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("Shadow map resolution: " + net.optifine.shaders.llIIlllIIlllIIllIllI.aE);
                    }
                }
                llllIIIIlIIIlIlllIll2.close();
            }
            catch (Exception ex) {
                net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll("Couldn't read " + s + "!");
                ex.printStackTrace();
                ARBShaderObjects.glDeleteObjectARB(glCreateShaderObjectARB);
                return 0;
            }
        }
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.cY) {
            llllIIIIlIIIlIlllIll(s, sb.toString());
        }
        ARBShaderObjects.glShaderSourceARB(glCreateShaderObjectARB, (CharSequence)sb);
        ARBShaderObjects.glCompileShaderARB(glCreateShaderObjectARB);
        if (GL20.glGetShaderi(glCreateShaderObjectARB, 35713) != 1) {
            net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll("Error compiling fragment shader: " + s);
        }
        llllIIIIlIIIlIlllIll(glCreateShaderObjectARB, s, list);
        return glCreateShaderObjectARB;
    }
    
    private static Reader IIIIlllIIIIIIlIIIlll(final String s) {
        return new InputStreamReader(net.optifine.shaders.llIIlllIIlllIIllIllI.el.llllIIIIlIIIlIlllIll(s));
    }
    
    public static void llllIIIIlIIIlIlllIll(final String s, final String s2) {
        try {
            final File file = new File(net.optifine.shaders.llIIlllIIlllIIllIllI.cA, "debug/" + s);
            file.getParentFile().mkdirs();
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(file, s2);
        }
        catch (IOException ex) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Error saving: " + s);
            ex.printStackTrace();
        }
    }
    
    private static void llllIIIIlIIIlIlllIll(final File file) {
        if (file.exists() && file.isDirectory()) {
            final File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (int i = 0; i < listFiles.length; ++i) {
                    final File file2 = listFiles[i];
                    if (file2.isDirectory()) {
                        llllIIIIlIIIlIlllIll(file2);
                    }
                    file2.delete();
                }
            }
        }
    }
    
    private static boolean llllIIIlIlllIlIIIIIl(final int n, final String s) {
        final IntBuffer intBuffer = BufferUtils.createIntBuffer(1);
        ARBShaderObjects.glGetObjectParameterARB(n, 35716, intBuffer);
        final int value = intBuffer.get();
        if (value > 1) {
            final ByteBuffer byteBuffer = BufferUtils.createByteBuffer(value);
            intBuffer.flip();
            ARBShaderObjects.glGetInfoLogARB(n, intBuffer, byteBuffer);
            final byte[] array = new byte[value];
            byteBuffer.get(array);
            if (array[value - 1] == 0) {
                array[value - 1] = 10;
            }
            net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("Info log: " + s + "\n" + net.optifine.util.IIIllllllIllIIIlllIl.lIIIIlIIIIIlllIllIII(new String(array, Charsets.US_ASCII), " \n\r\t"));
            return false;
        }
        return true;
    }
    
    private static boolean llllIIIIlIIIlIlllIll(final int n, final String s, final List list) {
        BufferUtils.createIntBuffer(1);
        final int glGetShaderi = GL20.glGetShaderi(n, 35716);
        if (glGetShaderi <= 1) {
            return true;
        }
        for (int i = 0; i < list.size(); ++i) {
            net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("File: " + (i + 1) + " = " + list.get(i));
        }
        net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("Shader info log: " + s + "\n" + net.optifine.util.IIIllllllIllIIIlllIl.lIIIIlIIIIIlllIllIII(GL20.glGetShaderInfoLog(n, glGetShaderi), " \n\r\t"));
        return false;
    }
    
    public static void llllIIIIlIIIlIlllIll(IntBuffer do1) {
        if (do1 == null) {
            do1 = net.optifine.shaders.llIIlllIIlllIIllIllI.dO;
        }
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.bO != do1) {
            GL20.glDrawBuffers(net.optifine.shaders.llIIlllIIlllIIllIllI.bO = do1);
            llllIIIlIlllIlIIIIIl("setDrawBuffers");
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(net.optifine.shaders.IlIllIlIlIIIlIlIlIII bm) {
        llllIIIlIlllIlIIIIIl("pre-useProgram");
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.IIlllIIlIllIllIlIIll) {
            bm = net.optifine.shaders.llIIlllIIlllIIllIllI.be;
        }
        else if (net.optifine.shaders.llIIlllIIlllIIllIllI.lllIIIIlllllIlIIllIl) {
            bm = net.optifine.shaders.llIIlllIIlllIIllIllI.bw;
        }
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.bM != bm) {
            llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.bM, bm);
            net.optifine.shaders.llIIlllIIlllIIllIllI.bM = bm;
            int n = bm.lIIIIlIIIIIlllIllIII();
            ARBShaderObjects.glUseProgramObjectARB(net.optifine.shaders.llIIlllIIlllIIllIllI.bN = n);
            if (llllIIIlIlllIlIIIIIl("useProgram") != 0) {
                bm.llllIIIIlIIIlIlllIll(0);
                n = bm.lIIIIlIIIIIlllIllIII();
                ARBShaderObjects.glUseProgramObjectARB(net.optifine.shaders.llIIlllIIlllIIllIllI.bN = n);
            }
            net.optifine.shaders.llIIlllIIlllIIllIllI.ef.llllIIIIlIIIlIlllIll(n);
            if (net.optifine.shaders.llIIlllIIlllIIllIllI.ev != null) {
                net.optifine.shaders.llIIlllIIlllIIllIllI.ev.llllIIIIlIIIlIlllIll(n);
            }
            if (n != 0) {
                final IntBuffer llIllIlIIIIllIlIIllI = bm.llIllIlIIIIllIlIIllI();
                if (net.optifine.shaders.llIIlllIIlllIIllIllI.IlIllIlIlIIIlIlIlIII) {
                    llllIIIIlIIIlIlllIll(llIllIlIIIIllIlIIllI);
                }
                net.optifine.shaders.llIIlllIIlllIIllIllI.ek = bm.IlIlIIIllIIllIlllllI();
                switch (a()[bm.IllIIlllIIIIlllIIlIl().ordinal()]) {
                    case 3: {
                        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.IlIllllIIlIllIlIlIll, 0);
                        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.lllIlIIIIIlIlllllIlI, 1);
                        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.llIlIIIIllIlIIlIlIII, 2);
                        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.IIIIIlllIlIIIIIIIllI, 3);
                        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.llllllIIIIIIIlllIIll, net.optifine.shaders.llIIlllIIlllIIllIllI.aN ? 5 : 4);
                        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.IIlIlllIlIlllIlIllll, 4);
                        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.lIllllIllIllIIllllll, 4);
                        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.lllIIIIlIlIllIIlIIIl, 5);
                        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.IllIlllIllIIIIllllII, 6);
                        if (net.optifine.shaders.llIIlllIIlllIIllIllI.er != null || net.optifine.shaders.llIIlllIIlllIIllIllI.ej) {
                            llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.c, 7);
                            llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.d, 8);
                            llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.e, 9);
                            llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.f, 10);
                        }
                        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.lIllIlIIIllllllIIlII, 11);
                        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.IlIllIIllIIlIIIIlIIl, 13);
                        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.lIIlllIlllllIIlllIll, 13);
                        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.lIllIIlIlIlllllIIIII, 14);
                        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.lIIlIIIIIIIlIIlIlIIl, 15);
                        break;
                    }
                    case 4:
                    case 5: {
                        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.IlIIlllIIlIlllllIIlI, 0);
                        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.llllIlIllllIIlIIlIlI, 1);
                        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.a, 2);
                        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.b, 3);
                        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.c, 7);
                        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.d, 8);
                        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.e, 9);
                        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.f, 10);
                        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.g, 0);
                        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.h, 1);
                        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.i, 2);
                        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.j, 3);
                        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.k, 7);
                        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.l, 8);
                        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.m, 9);
                        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.n, 10);
                        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.llllllIIIIIIIlllIIll, net.optifine.shaders.llIIlllIIlllIIllIllI.aN ? 5 : 4);
                        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.IIlIlllIlIlllIlIllll, 4);
                        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.lIllllIllIllIIllllll, 4);
                        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.lllIIIIlIlIllIIlIIIl, 5);
                        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.o, 6);
                        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.IllIlllIllIIIIllllII, 6);
                        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.lIllIlIIIllllllIIlII, 11);
                        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.p, 12);
                        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.IlIllIIllIIlIIIIlIIl, 13);
                        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.lIIlllIlllllIIlllIll, 13);
                        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.lIllIIlIlIlllllIIIII, 14);
                        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.lIIlIIIIIIIlIIlIlIIl, 15);
                        break;
                    }
                    case 2: {
                        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.q, 0);
                        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.IlIllllIIlIllIlIlIll, 0);
                        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.lllIlIIIIIlIlllllIlI, 1);
                        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.llIlIIIIllIlIIlIlIII, 2);
                        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.IIIIIlllIlIIIIIIIllI, 3);
                        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.llllllIIIIIIIlllIIll, net.optifine.shaders.llIIlllIIlllIIllIllI.aN ? 5 : 4);
                        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.IIlIlllIlIlllIlIllll, 4);
                        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.lIllllIllIllIIllllll, 4);
                        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.lllIIIIlIlIllIIlIIIl, 5);
                        if (net.optifine.shaders.llIIlllIIlllIIllIllI.er != null) {
                            llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.c, 7);
                            llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.d, 8);
                            llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.e, 9);
                            llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.f, 10);
                        }
                        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.IlIllIIllIIlIIIIlIIl, 13);
                        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.lIIlllIlllllIIlllIll, 13);
                        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.lIllIIlIlIlllllIIIII, 14);
                        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.lIIlIIIIIIIlIIlIlIIl, 15);
                        break;
                    }
                }
                final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = (net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII != null) ? net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII.n() : null;
                final net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = (lllIIIIlIlIllIIlIIIl != null) ? lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() : null;
                int llllIIIIlIIIlIlllIll = -1;
                net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = null;
                if (ilIIIlIlIIIllIlIlIIl != null) {
                    final int ilIIIlIlIIIllIlIlIIl2 = net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl(ilIIIlIlIIIllIlIlIIl);
                    llllIIIIlIIIlIlllIll2 = (net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll)net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl2);
                    llllIIIIlIIIlIlllIll = net.optifine.shaders.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl2);
                }
                final int n2 = (llllIIIIlIIIlIlllIll2 != null) ? llllIIIIlIIIlIlllIll2.IlIIIlIlIIIllIlIlIIl() : 0;
                llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.r, llllIIIIlIIIlIlllIll);
                llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.s, n2);
                llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.v, net.optifine.shaders.llIIlllIIlllIIllIllI.IllIlIllIllIlllIIlll ? net.optifine.shaders.llIIlllIIlllIIllIllI.df : 0);
                llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.w, net.optifine.shaders.llIIlllIIlllIIllIllI.IllIlIllIllIlllIIlll ? net.optifine.shaders.llIIlllIIlllIIllIllI.dg : 0.0f);
                llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.x, net.optifine.shaders.llIIlllIIlllIIllIllI.dh, net.optifine.shaders.llIIlllIIlllIIllIllI.di, net.optifine.shaders.llIIlllIIlllIIllIllI.dj);
                llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.y, net.optifine.shaders.llIIlllIIlllIIllIllI.llllllIllIllIlIllllI, net.optifine.shaders.llIIlllIIlllIIllIllI.IIIllllllIllIIIlllIl, net.optifine.shaders.llIIlllIIlllIIllIllI.IlIIIlIIIllllIlIlIlI);
                llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.z, (int)(net.optifine.shaders.llIIlllIIlllIIllIllI.IIIIIllIIIIlIIIIllIl % 24000L));
                llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.A, (int)(net.optifine.shaders.llIIlllIIlllIIllIllI.IIIIIllIIIIlIIIIllIl / 24000L));
                llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.B, net.optifine.shaders.llIIlllIIlllIIllIllI.IIlIlIlIIlIllIIIIIIl);
                llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.C, net.optifine.shaders.llIIlllIIlllIIllIllI.llIlIIIIIlIIlIlIIlll);
                llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.D, net.optifine.shaders.llIIlllIIlllIIllIllI.IlIIlIlIIIlIIlIlIlII);
                llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.E, net.optifine.shaders.llIIlllIIlllIIllIllI.IllIlIIllIllIIlIllII);
                llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.F, net.optifine.shaders.llIIlllIIlllIIllIllI.lllIllIIIllllllIllll);
                llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.G, net.optifine.shaders.llIIlllIIlllIIllIllI.llIllIlIlIIIIIIIllII);
                llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.H, net.optifine.shaders.llIIlllIIlllIIllIllI.IIlIIIlllIllIllIlIII);
                llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.I, net.optifine.shaders.llIIlllIIlllIIllIllI.llIllIlIIIIllIlIIllI / (float)net.optifine.shaders.llIIlllIIlllIIllIllI.lIlIlIIIllIIllIIIllI);
                llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.J, (float)net.optifine.shaders.llIIlllIIlllIIllIllI.llIllIlIIIIllIlIIllI);
                llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.K, (float)net.optifine.shaders.llIIlllIIlllIIllIllI.lIlIlIIIllIIllIIIllI);
                llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.L, 0.05f);
                llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.M, (float)(net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll.llIllIIIIIllIlIIIIlI * 16));
                llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.N, net.optifine.shaders.llIIlllIIlllIIllIllI.IlllllllIIIlIIIlIlII[0], net.optifine.shaders.llIIlllIIlllIIllIllI.IlllllllIIIlIIIlIlII[1], net.optifine.shaders.llIIlllIIlllIIllIllI.IlllllllIIIlIIIlIlII[2]);
                llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.O, net.optifine.shaders.llIIlllIIlllIIllIllI.IIlIIIIlllIlllllIlII[0], net.optifine.shaders.llIIlllIIlllIIllIllI.IIlIIIIlllIlllllIlII[1], net.optifine.shaders.llIIlllIIlllIIllIllI.IIlIIIIlllIlllllIlII[2]);
                llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.P, net.optifine.shaders.llIIlllIIlllIIllIllI.IIIlIIlIIIIlllIlllII[0], net.optifine.shaders.llIIlllIIlllIIllIllI.IIIlIIlIIIIlllIlllII[1], net.optifine.shaders.llIIlllIIlllIIllIllI.IIIlIIlIIIIlllIlllII[2]);
                llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.Q, net.optifine.shaders.llIIlllIIlllIIllIllI.IlIlIllllllllIIIIlII[0], net.optifine.shaders.llIIlllIIlllIIllIllI.IlIlIllllllllIIIIlII[1], net.optifine.shaders.llIIlllIIlllIIllIllI.IlIlIllllllllIIIIlII[2]);
                llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.R, (float)net.optifine.shaders.llIIlllIIlllIIllIllI.as, (float)net.optifine.shaders.llIIlllIIlllIIllIllI.at, (float)net.optifine.shaders.llIIlllIIlllIIllIllI.au);
                llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.S, (float)net.optifine.shaders.llIIlllIIlllIIllIllI.av, (float)net.optifine.shaders.llIIlllIIlllIIllIllI.aw, (float)net.optifine.shaders.llIIlllIIlllIIllIllI.ax);
                llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.T, false, net.optifine.shaders.llIIlllIIlllIIllIllI.dy);
                llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.U, false, net.optifine.shaders.llIIlllIIlllIIllIllI.dz);
                llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.V, false, net.optifine.shaders.llIIlllIIlllIIllIllI.dE);
                llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.W, false, net.optifine.shaders.llIIlllIIlllIIllIllI.dw);
                llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.X, false, net.optifine.shaders.llIIlllIIlllIIllIllI.dx);
                llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.Y, false, net.optifine.shaders.llIIlllIIlllIIllIllI.dF);
                if (net.optifine.shaders.llIIlllIIlllIIllIllI.aW > 0) {
                    llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.Z, false, net.optifine.shaders.llIIlllIIlllIIllIllI.dA);
                    llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.aa, false, net.optifine.shaders.llIIlllIIlllIIllIllI.dB);
                    llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.ab, false, net.optifine.shaders.llIIlllIIlllIIllIllI.dC);
                    llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.ac, false, net.optifine.shaders.llIIlllIIlllIIllIllI.dD);
                }
                llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.ad, net.optifine.shaders.llIIlllIIlllIIllIllI.lIlIlIlllIIlIlIlllIl);
                llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.ae, net.optifine.shaders.llIIlllIIlllIIllIllI.llIIIllIlIllIllIIIIl);
                llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.af, net.optifine.shaders.llIIlllIIlllIIllIllI.IllIIlllllIIllIIllIl & 0xFFFF, net.optifine.shaders.llIIlllIIlllIIllIllI.IllIIlllllIIllIIllIl >> 16);
                llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.ag, Math.round(net.optifine.shaders.llIIlllIIlllIIllIllI.lIllIIIIIlllIIlIIllI), Math.round(net.optifine.shaders.llIIlllIIlllIIllIllI.lIlIIlllIIlIIlIlllIl));
                llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.ah, net.optifine.shaders.llIIlllIIlllIIllIllI.dm[0], net.optifine.shaders.llIIlllIIlllIIllIllI.dm[1]);
                llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.ai, net.optifine.shaders.llIIlllIIlllIIllIllI.dl);
                llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.aj, net.optifine.shaders.llIIlllIIlllIIllIllI.lllllIIIIIlIlIIIIIIl);
                llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.ak, net.optifine.shaders.llIIlllIIlllIIllIllI.llllIllllIllllIlIlII);
                llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.al, net.optifine.shaders.llIIlllIIlllIIllIllI.IIlIlIllllIlllIIIIll);
                llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.am, net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll.IIIIIlllIlIIIIIIIllI);
                llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.an, net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll.IIllIIIlIIIIlIIlIIII ? 1 : 0);
                llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.ao, net.optifine.shaders.llIIlllIIlllIIllIllI.IIlllIIlllIIIlIlllII);
                llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.ap, net.optifine.shaders.llIIlllIIlllIIllIllI.IIIllIIllIIIIIIlIIlI, net.optifine.shaders.llIIlllIIlllIIllIllI.IIIIIIIllllIlIIIIIII);
                if (net.optifine.shaders.llIIlllIIlllIIllIllI.ev != null) {
                    net.optifine.shaders.llIIlllIIlllIIllIllI.ev.llllIIIIlIIIlIlllIll();
                }
                llllIIIlIlllIlIIIIIl("end useProgram");
            }
        }
    }
    
    private static void llllIIIIlIIIlIlllIll(final net.optifine.shaders.IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII, final net.optifine.shaders.IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII2) {
        if (ilIllIlIlIIIlIlIlIII.llllIIllllIlIlIIIIll() != null) {
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlllIIIIlIIIlIlIlIIl();
        }
        if (ilIllIlIlIIIlIlIlIII.IlIllIlIlIIIlIlIlIII() != null) {
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lllIllIIIllllllIllll();
        }
        final net.optifine.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI llllIIllllIlIlIIIIll = ilIllIlIlIIIlIlIlIII2.llllIIllllIlIlIIIIll();
        if (llllIIllllIlIlIIIIll != null) {
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(llllIIllllIlIlIIIIll);
        }
        final net.optifine.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl ilIllIlIlIIIlIlIlIII3 = ilIllIlIlIIIlIlIlIII2.IlIllIlIlIIIlIlIlIII();
        if (ilIllIlIlIIIlIlIlIII3 != null) {
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(ilIllIlIlIIIlIlIlIII3);
        }
    }
    
    private static void llllIIIIlIIIlIlllIll(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII, final int n) {
        liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(n);
    }
    
    private static void llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final int n, final int n2) {
        llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(n, n2);
    }
    
    private static void llllIIIIlIIIlIlllIll(final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl, final float n) {
        llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(n);
    }
    
    private static void llllIIIIlIIIlIlllIll(final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI, final float n, final float n2, final float n3) {
        llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(n, n2, n3);
    }
    
    private static void llllIIIIlIIIlIlllIll(final llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll, final boolean b, final FloatBuffer floatBuffer) {
        llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll(b, floatBuffer);
    }
    
    public static int lIIIIlIIIIIlllIllIII(final String s) {
        return (!s.equals("colortex0") && !s.equals("gcolor")) ? ((!s.equals("colortex1") && !s.equals("gdepth")) ? ((!s.equals("colortex2") && !s.equals("gnormal")) ? ((!s.equals("colortex3") && !s.equals("composite")) ? ((!s.equals("colortex4") && !s.equals("gaux1")) ? ((!s.equals("colortex5") && !s.equals("gaux2")) ? ((!s.equals("colortex6") && !s.equals("gaux3")) ? ((!s.equals("colortex7") && !s.equals("gaux4")) ? -1 : 7) : 6) : 5) : 4) : 3) : 2) : 1) : 0;
    }
    
    private static int llllIIllllIlIlIIIIll(String trim) {
        trim = trim.trim();
        for (int i = 0; i < net.optifine.shaders.llIIlllIIlllIIllIllI.eG.length; ++i) {
            if (trim.equals(net.optifine.shaders.llIIlllIIlllIIllIllI.eG[i])) {
                return net.optifine.shaders.llIIlllIIlllIIllIllI.eH[i];
            }
        }
        return 0;
    }
    
    private static void f() {
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.eB == null && net.optifine.shaders.llIIlllIIlllIIllIllI.eu != null) {
            net.optifine.shaders.llIIlllIIlllIIllIllI.eB = llllIIIIlIIIlIlllIll(15, net.optifine.shaders.llIIlllIIlllIIllIllI.eu);
        }
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.eB == null) {
            net.optifine.shaders.llIIlllIIlllIIllIllI.eB = new net.optifine.shaders.llIIlIIIlIIIllIlIIIl(net.optifine.shaders.llIIlllIIlllIIllIllI.eD, net.optifine.shaders.llIIlllIIlllIIllIllI.eD);
        }
    }
    
    private static void g() {
        net.optifine.shaders.llIIlllIIlllIIllIllI.dR = new IdentityHashMap(300);
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.dR.isEmpty()) {
            final Iterator<lIllllIllIllIIllllll> iterator = net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI().iterator();
            while (iterator.hasNext()) {
                final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = (net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll)net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(iterator.next());
                net.optifine.shaders.llIIlllIIlllIIllIllI.dR.put(llllIIIIlIIIlIlllIll, net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll));
            }
        }
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(net.optifine.shaders.llIIlllIIlllIIllIllI.el.llllIIIIlIIIlIlllIll("/mc_Entity_x.txt")));
        }
        catch (Exception ex) {}
        if (bufferedReader != null) {
            try {
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    final Matcher matcher = net.optifine.shaders.llIIlllIIlllIIllIllI.eI.matcher(line);
                    if (matcher.matches()) {
                        final String group = matcher.group(1);
                        final int int1 = Integer.parseInt(matcher.group(2));
                        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(group);
                        if (llllIIIIlIIIlIlllIll2 != null) {
                            net.optifine.shaders.llIIlllIIlllIIllIllI.dR.put(llllIIIIlIIIlIlllIll2, int1);
                        }
                        else {
                            net.optifine.shaders.IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl("Unknown block name %s", group);
                        }
                    }
                    else {
                        net.optifine.shaders.IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl("unmatched %s\n", line);
                    }
                }
            }
            catch (Exception ex2) {
                net.optifine.shaders.IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl("Error parsing mc_Entity_x.txt");
            }
        }
        if (bufferedReader != null) {
            try {
                bufferedReader.close();
            }
            catch (Exception ex3) {}
        }
    }
    
    private static IntBuffer IlIlIlIlIlllllllllIl(final IntBuffer intBuffer) {
        for (int limit = intBuffer.limit(), i = intBuffer.position(); i < limit; ++i) {
            intBuffer.put(i, 0);
        }
        return intBuffer;
    }
    
    public static void IlllllllIIIlIIIlIlII() {
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.IlIIIlIlIIIllIlIlIIl) {
            llllIIIlIlllIlIIIIIl("Shaders.uninit pre");
            for (int i = 0; i < net.optifine.shaders.llIIlllIIlllIIllIllI.bL.length; ++i) {
                final net.optifine.shaders.IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII = net.optifine.shaders.llIIlllIIlllIIllIllI.bL[i];
                if (ilIllIlIlIIIlIlIlIII.lIIIlllIIIllIIIllIII() != 0) {
                    ARBShaderObjects.glDeleteObjectARB(ilIllIlIlIIIlIlIlIII.lIIIlllIIIllIIIllIII());
                    llllIIIlIlllIlIIIIIl("del programRef");
                }
                ilIllIlIlIIIlIlIlIII.IlIlIlIlIlllllllllIl(0);
                ilIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(0);
                ilIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll((String)null);
                ilIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll((IntBuffer)null);
                ilIllIlIlIIIlIlIlIII.llIllIIIIIllIlIIIIlI(0);
            }
            net.optifine.shaders.llIIlllIIlllIIllIllI.ej = false;
            if (net.optifine.shaders.llIIlllIIlllIIllIllI.aZ != 0) {
                EXTFramebufferObject.glDeleteFramebuffersEXT(net.optifine.shaders.llIIlllIIlllIIllIllI.aZ);
                net.optifine.shaders.llIIlllIIlllIIllIllI.aZ = 0;
                llllIIIlIlllIlIIIIIl("del dfb");
            }
            if (net.optifine.shaders.llIIlllIIlllIIllIllI.ba != 0) {
                EXTFramebufferObject.glDeleteFramebuffersEXT(net.optifine.shaders.llIIlllIIlllIIllIllI.ba);
                net.optifine.shaders.llIIlllIIlllIIllIllI.ba = 0;
                llllIIIlIlllIlIIIIIl("del sfb");
            }
            if (net.optifine.shaders.llIIlllIIlllIIllIllI.dJ != null) {
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(net.optifine.shaders.llIIlllIIlllIIllIllI.dJ);
                IlIlIlIlIlllllllllIl(net.optifine.shaders.llIIlllIIlllIIllIllI.dJ);
                llllIIIlIlllIlIIIIIl("del dfbDepthTextures");
            }
            if (net.optifine.shaders.llIIlllIIlllIIllIllI.dI != null) {
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(net.optifine.shaders.llIIlllIIlllIIllIllI.dI);
                IlIlIlIlIlllllllllIl(net.optifine.shaders.llIIlllIIlllIIllIllI.dI);
                llllIIIlIlllIlIIIIIl("del dfbTextures");
            }
            if (net.optifine.shaders.llIIlllIIlllIIllIllI.dL != null) {
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(net.optifine.shaders.llIIlllIIlllIIllIllI.dL);
                IlIlIlIlIlllllllllIl(net.optifine.shaders.llIIlllIIlllIIllIllI.dL);
                llllIIIlIlllIlIIIIIl("del shadow depth");
            }
            if (net.optifine.shaders.llIIlllIIlllIIllIllI.dK != null) {
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(net.optifine.shaders.llIIlllIIlllIIllIllI.dK);
                IlIlIlIlIlllllllllIl(net.optifine.shaders.llIIlllIIlllIIllIllI.dK);
                llllIIIlIlllIlIIIIIl("del shadow color");
            }
            if (net.optifine.shaders.llIIlllIIlllIIllIllI.dM != null) {
                IlIlIlIlIlllllllllIl(net.optifine.shaders.llIIlllIIlllIIllIllI.dM);
            }
            if (net.optifine.shaders.llIIlllIIlllIIllIllI.eB != null) {
                net.optifine.shaders.llIIlllIIlllIIllIllI.eB.IlIlIIIllIllIIIIIllI();
                net.optifine.shaders.llIIlllIIlllIIllIllI.eB = null;
            }
            net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("Uninit");
            net.optifine.shaders.llIIlllIIlllIIllIllI.aA = 0;
            net.optifine.shaders.llIIlllIIlllIIllIllI.aM = false;
            net.optifine.shaders.llIIlllIIlllIIllIllI.IlIIIlIlIIIllIlIlIIl = false;
            llllIIIlIlllIlIIIIIl("Shaders.uninit");
        }
    }
    
    public static void IIlIIIIlllIlllllIlII() {
        net.optifine.shaders.llIIlllIIlllIIllIllI.dV = 0;
    }
    
    public static void IIIlIIlIIIIlllIlllII() {
        net.optifine.shaders.llIIlllIIlllIIllIllI.aB = true;
    }
    
    private static void h() {
        net.optifine.shaders.llIIlllIIlllIIllIllI.dU = net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl;
        net.optifine.shaders.llIIlllIIlllIIllIllI.dV = net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI;
        net.optifine.shaders.llIIlllIIlllIIllIllI.llIllIlIIIIllIlIIllI = Math.round(net.optifine.shaders.llIIlllIIlllIIllIllI.dU * net.optifine.shaders.llIIlllIIlllIIllIllI.ca);
        net.optifine.shaders.llIIlllIIlllIIllIllI.lIlIlIIIllIIllIIIllI = Math.round(net.optifine.shaders.llIIlllIIlllIIllIllI.dV * net.optifine.shaders.llIIlllIIlllIIllIllI.ca);
        j();
    }
    
    private static void i() {
        net.optifine.shaders.llIIlllIIlllIIllIllI.aB = false;
        net.optifine.shaders.llIIlllIIlllIIllIllI.aC = Math.round(net.optifine.shaders.llIIlllIIlllIIllIllI.aE * net.optifine.shaders.llIIlllIIlllIIllIllI.cb);
        net.optifine.shaders.llIIlllIIlllIIllIllI.aD = Math.round(net.optifine.shaders.llIIlllIIlllIIllIllI.aF * net.optifine.shaders.llIIlllIIlllIIllIllI.cb);
        k();
    }
    
    private static void j() {
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.aZ != 0) {
            EXTFramebufferObject.glDeleteFramebuffersEXT(net.optifine.shaders.llIIlllIIlllIIllIllI.aZ);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(net.optifine.shaders.llIIlllIIlllIIllIllI.dJ);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(net.optifine.shaders.llIIlllIIlllIIllIllI.dI);
        }
        net.optifine.shaders.llIIlllIIlllIIllIllI.aZ = EXTFramebufferObject.glGenFramebuffersEXT();
        GL11.glGenTextures((IntBuffer)net.optifine.shaders.llIIlllIIlllIIllIllI.dJ.clear().limit(net.optifine.shaders.llIIlllIIlllIIllIllI.aU));
        GL11.glGenTextures((IntBuffer)net.optifine.shaders.llIIlllIIlllIIllIllI.dI.clear().limit(16));
        net.optifine.shaders.llIIlllIIlllIIllIllI.dJ.position(0);
        net.optifine.shaders.llIIlllIIlllIIllIllI.dI.position(0);
        EXTFramebufferObject.glBindFramebufferEXT(36160, net.optifine.shaders.llIIlllIIlllIIllIllI.aZ);
        GL20.glDrawBuffers(0);
        GL11.glReadBuffer(0);
        for (int i = 0; i < net.optifine.shaders.llIIlllIIlllIIllIllI.aU; ++i) {
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(net.optifine.shaders.llIIlllIIlllIIllIllI.dJ.get(i));
            GL11.glTexParameteri(3553, 10242, 33071);
            GL11.glTexParameteri(3553, 10243, 33071);
            GL11.glTexParameteri(3553, 10241, 9728);
            GL11.glTexParameteri(3553, 10240, 9728);
            GL11.glTexParameteri(3553, 34891, 6409);
            GL11.glTexImage2D(3553, 0, 6402, net.optifine.shaders.llIIlllIIlllIIllIllI.llIllIlIIIIllIlIIllI, net.optifine.shaders.llIIlllIIlllIIllIllI.lIlIlIIIllIIllIIIllI, 0, 6402, 5126, (FloatBuffer)null);
        }
        EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36096, 3553, net.optifine.shaders.llIIlllIIlllIIllIllI.dJ.get(0), 0);
        GL20.glDrawBuffers(net.optifine.shaders.llIIlllIIlllIIllIllI.dM);
        GL11.glReadBuffer(0);
        llllIIIlIlllIlIIIIIl("FT d");
        for (int j = 0; j < net.optifine.shaders.llIIlllIIlllIIllIllI.aT; ++j) {
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(net.optifine.shaders.llIIlllIIlllIIllIllI.dQ.llllIIIIlIIIlIlllIll(j));
            GL11.glTexParameteri(3553, 10242, 33071);
            GL11.glTexParameteri(3553, 10243, 33071);
            GL11.glTexParameteri(3553, 10241, 9729);
            GL11.glTexParameteri(3553, 10240, 9729);
            GL11.glTexImage2D(3553, 0, net.optifine.shaders.llIIlllIIlllIIllIllI.eg[j], net.optifine.shaders.llIIlllIIlllIIllIllI.llIllIlIIIIllIlIIllI, net.optifine.shaders.llIIlllIIlllIIllIllI.lIlIlIIIllIIllIIIllI, 0, IlIllIlIlIIIlIlIlIII(net.optifine.shaders.llIIlllIIlllIIllIllI.eg[j]), 33639, (ByteBuffer)null);
            EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36064 + j, 3553, net.optifine.shaders.llIIlllIIlllIIllIllI.dQ.llllIIIIlIIIlIlllIll(j), 0);
            llllIIIlIlllIlIIIIIl("FT c");
        }
        for (int k = 0; k < net.optifine.shaders.llIIlllIIlllIIllIllI.aT; ++k) {
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(net.optifine.shaders.llIIlllIIlllIIllIllI.dQ.IlIlIlIlIlllllllllIl(k));
            GL11.glTexParameteri(3553, 10242, 33071);
            GL11.glTexParameteri(3553, 10243, 33071);
            GL11.glTexParameteri(3553, 10241, 9729);
            GL11.glTexParameteri(3553, 10240, 9729);
            GL11.glTexImage2D(3553, 0, net.optifine.shaders.llIIlllIIlllIIllIllI.eg[k], net.optifine.shaders.llIIlllIIlllIIllIllI.llIllIlIIIIllIlIIllI, net.optifine.shaders.llIIlllIIlllIIllIllI.lIlIlIIIllIIllIIIllI, 0, IlIllIlIlIIIlIlIlIII(net.optifine.shaders.llIIlllIIlllIIllIllI.eg[k]), 33639, (ByteBuffer)null);
            llllIIIlIlllIlIIIIIl("FT ca");
        }
        int n = EXTFramebufferObject.glCheckFramebufferStatusEXT(36160);
        if (n == 36058) {
            IlIlIIIllIIllIlllllI("[Shaders] Error: Failed framebuffer incomplete formats");
            for (int l = 0; l < net.optifine.shaders.llIIlllIIlllIIllIllI.aT; ++l) {
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(net.optifine.shaders.llIIlllIIlllIIllIllI.dQ.llllIIIIlIIIlIlllIll(l));
                GL11.glTexImage2D(3553, 0, 6408, net.optifine.shaders.llIIlllIIlllIIllIllI.llIllIlIIIIllIlIIllI, net.optifine.shaders.llIIlllIIlllIIllIllI.lIlIlIIIllIIllIIIllI, 0, 32993, 33639, (ByteBuffer)null);
                EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36064 + l, 3553, net.optifine.shaders.llIIlllIIlllIIllIllI.dQ.llllIIIIlIIIlIlllIll(l), 0);
                llllIIIlIlllIlIIIIIl("FT c");
            }
            n = EXTFramebufferObject.glCheckFramebufferStatusEXT(36160);
            if (n == 36053) {
                net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("complete");
            }
        }
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(0);
        if (n != 36053) {
            IlIlIIIllIIllIlllllI("[Shaders] Error: Failed creating framebuffer! (Status " + n + ")");
        }
        else {
            net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("Framebuffer created.");
        }
    }
    
    private static int IlIllIlIlIIIlIlIlIII(final int n) {
        switch (n) {
            case 33333:
            case 33334:
            case 33339:
            case 33340:
            case 36208:
            case 36209:
            case 36226:
            case 36227: {
                return 36251;
            }
            default: {
                return 32993;
            }
        }
    }
    
    private static void k() {
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.aW != 0) {
            if (net.optifine.shaders.llIIlllIIlllIIllIllI.ba != 0) {
                EXTFramebufferObject.glDeleteFramebuffersEXT(net.optifine.shaders.llIIlllIIlllIIllIllI.ba);
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(net.optifine.shaders.llIIlllIIlllIIllIllI.dL);
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(net.optifine.shaders.llIIlllIIlllIIllIllI.dK);
            }
            EXTFramebufferObject.glBindFramebufferEXT(36160, net.optifine.shaders.llIIlllIIlllIIllIllI.ba = EXTFramebufferObject.glGenFramebuffersEXT());
            GL11.glDrawBuffer(0);
            GL11.glReadBuffer(0);
            GL11.glGenTextures((IntBuffer)net.optifine.shaders.llIIlllIIlllIIllIllI.dL.clear().limit(net.optifine.shaders.llIIlllIIlllIIllIllI.aW));
            GL11.glGenTextures((IntBuffer)net.optifine.shaders.llIIlllIIlllIIllIllI.dK.clear().limit(net.optifine.shaders.llIIlllIIlllIIllIllI.aV));
            net.optifine.shaders.llIIlllIIlllIIllIllI.dL.position(0);
            net.optifine.shaders.llIIlllIIlllIIllIllI.dK.position(0);
            for (int i = 0; i < net.optifine.shaders.llIIlllIIlllIIllIllI.aW; ++i) {
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(net.optifine.shaders.llIIlllIIlllIIllIllI.dL.get(i));
                GL11.glTexParameterf(3553, 10242, 33071.0f);
                GL11.glTexParameterf(3553, 10243, 33071.0f);
                final int n = net.optifine.shaders.llIIlllIIlllIIllIllI.bU[i] ? 9728 : 9729;
                GL11.glTexParameteri(3553, 10241, n);
                GL11.glTexParameteri(3553, 10240, n);
                if (net.optifine.shaders.llIIlllIIlllIIllIllI.bS[i]) {
                    GL11.glTexParameteri(3553, 34892, 34894);
                }
                GL11.glTexImage2D(3553, 0, 6402, net.optifine.shaders.llIIlllIIlllIIllIllI.aC, net.optifine.shaders.llIIlllIIlllIIllIllI.aD, 0, 6402, 5126, (FloatBuffer)null);
            }
            EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36096, 3553, net.optifine.shaders.llIIlllIIlllIIllIllI.dL.get(0), 0);
            llllIIIlIlllIlIIIIIl("FT sd");
            for (int j = 0; j < net.optifine.shaders.llIIlllIIlllIIllIllI.aV; ++j) {
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(net.optifine.shaders.llIIlllIIlllIIllIllI.dK.get(j));
                GL11.glTexParameterf(3553, 10242, 33071.0f);
                GL11.glTexParameterf(3553, 10243, 33071.0f);
                final int n2 = net.optifine.shaders.llIIlllIIlllIIllIllI.bW[j] ? 9728 : 9729;
                GL11.glTexParameteri(3553, 10241, n2);
                GL11.glTexParameteri(3553, 10240, n2);
                GL11.glTexImage2D(3553, 0, 6408, net.optifine.shaders.llIIlllIIlllIIllIllI.aC, net.optifine.shaders.llIIlllIIlllIIllIllI.aD, 0, 32993, 33639, (ByteBuffer)null);
                EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36064 + j, 3553, net.optifine.shaders.llIIlllIIlllIIllIllI.dK.get(j), 0);
                llllIIIlIlllIlIIIIIl("FT sc");
            }
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(0);
            if (net.optifine.shaders.llIIlllIIlllIIllIllI.aV > 0) {
                GL20.glDrawBuffers(net.optifine.shaders.llIIlllIIlllIIllIllI.dN);
            }
            final int glCheckFramebufferStatusEXT = EXTFramebufferObject.glCheckFramebufferStatusEXT(36160);
            if (glCheckFramebufferStatusEXT != 36053) {
                IlIlIIIllIIllIlllllI("[Shaders] Error: Failed creating shadow framebuffer! (Status " + glCheckFramebufferStatusEXT + ")");
            }
            else {
                net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("Shadow framebuffer created.");
            }
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(final Minecraft llllIIIIlIIIlIlllIll, final float n, final long n2) {
        llllIIIlIlllIlIIIIIl("pre beginRender");
        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl);
        net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll("init");
        net.optifine.shaders.llIIlllIIlllIIllIllI.IlIlIlIlIlllllllllIl = net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.IlIllIlIlIIIlIlIlIII;
        if (!net.optifine.shaders.llIIlllIIlllIIllIllI.IlIIIlIlIIIllIlIlIIl) {
            try {
                IIIlIIIlIlIIlllIIlll();
            }
            catch (IllegalStateException ex) {
                if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII(ex.getMessage()).equals("Function is not supported")) {
                    IlIlIIIllIIllIlllllI("[Shaders] Error: " + ex.getMessage());
                    ex.printStackTrace();
                    llllIIIIlIIIlIlllIll("OFF");
                    return;
                }
            }
        }
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl != net.optifine.shaders.llIIlllIIlllIIllIllI.dU || net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI != net.optifine.shaders.llIIlllIIlllIIllIllI.dV) {
            h();
        }
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.aB) {
            i();
        }
        net.optifine.shaders.llIIlllIIlllIIllIllI.IIIIIllIIIIlIIIIllIl = net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.IlIlIllllllllIIIIlII();
        net.optifine.shaders.llIIlllIIlllIIllIllI.IIllllIIIlIIIIIIllIl = (net.optifine.shaders.llIIlllIIlllIIllIllI.IIIIIllIIIIlIIIIllIl - net.optifine.shaders.llIIlllIIlllIIllIllI.IIIIIIIIIlllIllIlIlI) % 24000L;
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.IIllllIIIlIIIIIIllIl < 0L) {
            net.optifine.shaders.llIIlllIIlllIIllIllI.IIllllIIIlIIIIIIllIl += 24000L;
        }
        net.optifine.shaders.llIIlllIIlllIIllIllI.IIIIIIIIIlllIllIlIlI = net.optifine.shaders.llIIlllIIlllIIllIllI.IIIIIllIIIIlIIIIllIl;
        net.optifine.shaders.llIIlllIIlllIIllIllI.IIlIlIlIIlIllIIIIIIl = net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.IlIlIIIllIIllIlllllI();
        ++net.optifine.shaders.llIIlllIIlllIIllIllI.llIlIIIIIlIIlIlIIlll;
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.llIlIIIIIlIIlIlIIlll >= 720720) {
            net.optifine.shaders.llIIlllIIlllIIllIllI.llIlIIIIIlIIlIlIIlll = 0;
        }
        net.optifine.shaders.llIIlllIIlllIIllIllI.IllIllIIIIlIIlIlllII = System.currentTimeMillis();
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.IlIllllIIlIIlIlIlIll == 0L) {
            net.optifine.shaders.llIIlllIIlllIIllIllI.IlIllllIIlIIlIlIlIll = net.optifine.shaders.llIIlllIIlllIIllIllI.IllIllIIIIlIIlIlllII;
        }
        net.optifine.shaders.llIIlllIIlllIIllIllI.IllIllIlllIllllIIllI = net.optifine.shaders.llIIlllIIlllIIllIllI.IllIllIIIIlIIlIlllII - net.optifine.shaders.llIIlllIIlllIIllIllI.IlIllllIIlIIlIlIlIll;
        net.optifine.shaders.llIIlllIIlllIIllIllI.IlIllllIIlIIlIlIlIll = net.optifine.shaders.llIIlllIIlllIIllIllI.IllIllIIIIlIIlIlllII;
        net.optifine.shaders.llIIlllIIlllIIllIllI.IlIIlIlIIIlIIlIlIlII = net.optifine.shaders.llIIlllIIlllIIllIllI.IllIllIlllIllllIIllI / 1000.0f;
        net.optifine.shaders.llIIlllIIlllIIllIllI.IllIlIIllIllIIlIllII += net.optifine.shaders.llIIlllIIlllIIllIllI.IlIIlIlIIIlIIlIlIlII;
        net.optifine.shaders.llIIlllIIlllIIllIllI.IllIlIIllIllIIlIllII %= 3600.0f;
        net.optifine.shaders.llIIlllIIlllIIllIllI.IIlIIIlllIllIllIlIII = llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.llIIlIIIlIIIllIlIIIl(n);
        final float n3 = (float)Math.exp(Math.log(0.5) * (net.optifine.shaders.llIIlllIIlllIIllIllI.IllIllIlllIllllIIllI * 0.01f) / ((net.optifine.shaders.llIIlllIIlllIIllIllI.lIlIlIlllIIlIlIlllIl < net.optifine.shaders.llIIlllIIlllIIllIllI.IIlIIIlllIllIllIlIII) ? net.optifine.shaders.llIIlllIIlllIIllIllI.lIIIIlIlIllllIIlIllI : net.optifine.shaders.llIIlllIIlllIIllIllI.llIIIIIIlIllIIlIIIll));
        net.optifine.shaders.llIIlllIIlllIIllIllI.lIlIlIlllIIlIlIlllIl = net.optifine.shaders.llIIlllIIlllIIllIllI.lIlIlIlllIIlIlIlllIl * n3 + net.optifine.shaders.llIIlllIIlllIIllIllI.IIlIIIlllIllIllIlIII * (1.0f - n3);
        final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI liiiIlIlIllllIIlIllI = net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI();
        if (liiiIlIlIllllIIlIllI != null) {
            net.optifine.shaders.llIIlllIIlllIIllIllI.IlIlIIIIIIlllIlIllIl = (liiiIlIlIllllIIlIllI instanceof net.minecraft.llllIIIlIlllIlIIIIIl.lllIIIIlllllIlIIllIl && ((net.minecraft.llllIIIlIlllIlIIIIIl.lllIIIIlllllIlIIllIl)liiiIlIlIllllIIlIllI).ah());
            net.optifine.shaders.llIIlllIIlllIIllIllI.llIIIllIlIllIllIIIIl = (float)liiiIlIlIllllIIlIllI.llIIIlIlIllIIlIlIlII * n + (float)liiiIlIlIllllIIlIllI.IIlIIIlllIllIllIlIII * (1.0f - n);
            net.optifine.shaders.llIIlllIIlllIIllIllI.IllIIlllllIIllIIllIl = liiiIlIlIllllIIlIllI.a_(n);
            final float n4 = (float)Math.exp(Math.log(0.5) * (net.optifine.shaders.llIIlllIIlllIIllIllI.IllIllIlllIllllIIllI * 0.01f) / net.optifine.shaders.llIIlllIIlllIIllIllI.llIIIlIlllIllIIlIllI);
            net.optifine.shaders.llIIlllIIlllIIllIllI.lIllIIIIIlllIIlIIllI = net.optifine.shaders.llIIlllIIlllIIllIllI.lIllIIIIIlllIIlIIllI * n4 + (net.optifine.shaders.llIIlllIIlllIIllIllI.IllIIlllllIIllIIllIl & 0xFFFF) * (1.0f - n4);
            net.optifine.shaders.llIIlllIIlllIIllIllI.lIlIIlllIIlIIlIlllIl = net.optifine.shaders.llIIlllIIlllIIllIllI.lIlIIlllIIlIIlIlllIl * n4 + (net.optifine.shaders.llIIlllIIlllIIllIllI.IllIIlllllIIllIIllIl >> 16) * (1.0f - n4);
            final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl illIIlllIIIIlllIIlIl = net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl, liiiIlIlIllllIIlIllI, n).IllIIlllIIIIlllIIlIl();
            if (illIIlllIIIIlllIIlIl == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII) {
                net.optifine.shaders.llIIlllIIlllIIllIllI.lllllIIIIIlIlIIIIIIl = 1;
            }
            else if (illIIlllIIIIlllIIlIl == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII) {
                net.optifine.shaders.llIIlllIIlllIIllIllI.lllllIIIIIlIlIIIIIIl = 2;
            }
            else {
                net.optifine.shaders.llIIlllIIlllIIllIllI.lllllIIIIIlIlIIIIIIl = 0;
            }
            if (net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII != null) {
                net.optifine.shaders.llIIlllIIlllIIllIllI.llllIllllIllllIlIlII = 0.0f;
                if (net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl)) {
                    net.optifine.shaders.llIIlllIIlllIIllIllI.llllIllllIllllIlIlII = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI().IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII, n);
                }
                net.optifine.shaders.llIIlllIIlllIIllIllI.IIlIlIllllIlllIIIIll = 0.0f;
                if (net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.IIlllIIlIllIllIlIIll)) {
                    net.optifine.shaders.llIIlllIIlllIIllIllI.IIlIlIllllIlllIIIIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.IIlllIIlIllIllIlIIll).IlIlIlIlIlllllllllIl() / 20.0f, 0.0f, 1.0f);
                }
            }
            final e ilIlIlIlIlllllllllIl = net.optifine.lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl(net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(liiiIlIlIllllIIlIllI, n), net.optifine.shaders.llIIlllIIlllIIllIllI.ep, liiiIlIlIllllIIlIllI, n);
            net.optifine.shaders.llIIlllIIlllIIllIllI.llllllIllIllIlIllllI = (float)ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;
            net.optifine.shaders.llIIlllIIlllIIllIllI.IIIllllllIllIIIlllIl = (float)ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl;
            net.optifine.shaders.llIIlllIIlllIIllIllI.IlIIIlIIIllllIlIlIlI = (float)ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI;
        }
        net.optifine.shaders.llIIlllIIlllIIllIllI.IlIlIIIllIIllIlllllI = true;
        net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIllllIlIlIIIIll = false;
        net.optifine.shaders.llIIlllIIlllIIllIllI.IIlllIIlIllIllIlIIll = false;
        net.optifine.shaders.llIIlllIIlllIIllIllI.dX = false;
        net.optifine.shaders.llIIlllIIlllIIllIllI.dY = false;
        net.optifine.shaders.llIIlllIIlllIIllIllI.dZ = false;
        net.optifine.shaders.llIIlllIIlllIIllIllI.ea = false;
        l();
        net.optifine.shaders.llIIlllIIlllIIllIllI.as = net.optifine.shaders.llIIlllIIlllIIllIllI.av;
        net.optifine.shaders.llIIlllIIlllIIllIllI.at = net.optifine.shaders.llIIlllIIlllIIllIllI.aw;
        net.optifine.shaders.llIIlllIIlllIIllIllI.au = net.optifine.shaders.llIIlllIIlllIIllIllI.ax;
        net.optifine.shaders.llIIlllIIlllIIllIllI.dE.position(0);
        net.optifine.shaders.llIIlllIIlllIIllIllI.dw.position(0);
        net.optifine.shaders.llIIlllIIlllIIllIllI.dE.put(net.optifine.shaders.llIIlllIIlllIIllIllI.dw);
        net.optifine.shaders.llIIlllIIlllIIllIllI.dE.position(0);
        net.optifine.shaders.llIIlllIIlllIIllIllI.dw.position(0);
        net.optifine.shaders.llIIlllIIlllIIllIllI.dF.position(0);
        net.optifine.shaders.llIIlllIIlllIIllIllI.dy.position(0);
        net.optifine.shaders.llIIlllIIlllIIllIllI.dF.put(net.optifine.shaders.llIIlllIIlllIIllIllI.dy);
        net.optifine.shaders.llIIlllIIlllIIllIllI.dF.position(0);
        net.optifine.shaders.llIIlllIIlllIIllIllI.dy.position(0);
        llllIIIlIlllIlIIIIIl("beginRender");
        net.optifine.shaders.IIlllIIIlIlllIIlllII.llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.IlIlIlIlIlllllllllIl, 0, n, n2);
        net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl();
        EXTFramebufferObject.glBindFramebufferEXT(36160, net.optifine.shaders.llIIlllIIlllIIllIllI.aZ);
        for (int i = 0; i < net.optifine.shaders.llIIlllIIlllIIllIllI.aT; ++i) {
            EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36064 + i, 3553, net.optifine.shaders.llIIlllIIlllIIllIllI.dQ.llllIIIIlIIIlIlllIll(i), 0);
        }
        llllIIIlIlllIlIIIIIl("end beginRender");
    }
    
    private static void l() {
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.aW >= 1) {
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(33988);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(net.optifine.shaders.llIIlllIIlllIIllIllI.dL.get(0));
            if (net.optifine.shaders.llIIlllIIlllIIllIllI.aW >= 2) {
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(33989);
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(net.optifine.shaders.llIIlllIIlllIIllIllI.dL.get(1));
            }
        }
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(33984);
        for (int i = 0; i < net.optifine.shaders.llIIlllIIlllIIllIllI.aT; ++i) {
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(net.optifine.shaders.llIIlllIIlllIIllIllI.dQ.llllIIIIlIIIlIlllIll(i));
            GL11.glTexParameteri(3553, 10240, 9729);
            GL11.glTexParameteri(3553, 10241, 9729);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(net.optifine.shaders.llIIlllIIlllIIllIllI.dQ.IlIlIlIlIlllllllllIl(i));
            GL11.glTexParameteri(3553, 10240, 9729);
            GL11.glTexParameteri(3553, 10241, 9729);
        }
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(0);
        for (int n = 0; n < 4 && 4 + n < net.optifine.shaders.llIIlllIIlllIIllIllI.aT; ++n) {
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(33991 + n);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(net.optifine.shaders.llIIlllIIlllIIllIllI.dQ.llllIIIIlIIIlIlllIll(4 + n));
        }
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(33990);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(net.optifine.shaders.llIIlllIIlllIIllIllI.dJ.get(0));
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.aU >= 2) {
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(33995);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(net.optifine.shaders.llIIlllIIlllIIllIllI.dJ.get(1));
            if (net.optifine.shaders.llIIlllIIlllIIllIllI.aU >= 3) {
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(33996);
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(net.optifine.shaders.llIIlllIIlllIIllIllI.dJ.get(2));
            }
        }
        for (int j = 0; j < net.optifine.shaders.llIIlllIIlllIIllIllI.aV; ++j) {
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(33997 + j);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(net.optifine.shaders.llIIlllIIlllIIllIllI.dK.get(j));
        }
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.eC) {
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(33984 + net.optifine.shaders.llIIlllIIlllIIllIllI.eB.llllIIIIlIIIlIlllIll());
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(net.optifine.shaders.llIIlllIIlllIIllIllI.eB.IlIIIlIlIIIllIlIlIIl());
        }
        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.er);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(33984);
    }
    
    public static void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII ep) {
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.ep != ep) {
            final IlllllllIIIlIIIlIlII ep2 = net.optifine.shaders.llIIlllIIlllIIllIllI.ep;
            net.optifine.shaders.llIIlllIIlllIIllIllI.ep = ep;
            IlIIIlIlIIIllIlIlIIl(net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI());
            final int ilIlIlIlIlllllllllIl = IlIlIlIlIlllllllllIl(ep2);
            final int ilIlIlIlIlllllllllIl2 = IlIlIlIlIlllllllllIl(ep);
            if (ilIlIlIlIlllllllllIl2 != ilIlIlIlIlllllllllIl) {
                final boolean contains = net.optifine.shaders.llIIlllIIlllIIllIllI.eq.contains(ilIlIlIlIlllllllllIl);
                final boolean contains2 = net.optifine.shaders.llIIlllIIlllIIllIllI.eq.contains(ilIlIlIlIlllllllllIl2);
                if (contains || contains2) {
                    IlllllllIIIlIIIlIlII();
                }
            }
            net.optifine.shaders.llIllIIIIIllIlIIIIlI.IIlllIIlIllIllIlIIll.IlIlIlIlIlllllllllIl();
        }
    }
    
    private static int IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        return (illlllllIIIlIIIlIlII == null) ? Integer.MIN_VALUE : illlllllIIIlIIIlIlII.IlIllIlIlIIIlIlIlIII.IIlllIIlIllIllIlIIll();
    }
    
    public static void llllIIIIlIIIlIlllIll(final int n, final float n2, final long n3) {
        if (!net.optifine.shaders.llIIlllIIlllIIllIllI.IIlllIIlIllIllIlIIll) {
            EXTFramebufferObject.glBindFramebufferEXT(36160, net.optifine.shaders.llIIlllIIlllIIllIllI.aZ);
            GL11.glViewport(0, 0, net.optifine.shaders.llIIlllIIlllIIllIllI.llIllIlIIIIllIlIIllI, net.optifine.shaders.llIIlllIIlllIIllIllI.lIlIlIIIllIIllIIIllI);
            net.optifine.shaders.llIIlllIIlllIIllIllI.bO = null;
            net.optifine.shaders.IIlIIIIIllIlIIIlIIll.llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.bR.llllIIIlIlllIlIIIIIl());
            llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.bi);
            llllIIIlIlllIlIIIIIl("end beginRenderPass");
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4) {
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(true, true, true, true);
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.IIlllIIlIllIllIlIIll) {
            GL11.glViewport(0, 0, net.optifine.shaders.llIIlllIIlllIIllIllI.aC, net.optifine.shaders.llIIlllIIlllIIllIllI.aD);
        }
        else {
            GL11.glViewport(0, 0, net.optifine.shaders.llIIlllIIlllIIllIllI.llIllIlIIIIllIlIIllI, net.optifine.shaders.llIIlllIIlllIIllIllI.lIlIlIIIllIIllIIIllI);
            EXTFramebufferObject.glBindFramebufferEXT(36160, net.optifine.shaders.llIIlllIIlllIIllIllI.aZ);
            net.optifine.shaders.llIIlllIIlllIIllIllI.IlIllIlIlIIIlIlIlIII = true;
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIllllIlIlIIIIll();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIIlIIIlIIIllIlIIIl();
            llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.dO);
            llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.bi);
            llllIIIlIlllIlIIIIIl("beginRenderPass");
        }
    }
    
    public static void IlIlIlIlIlllllllllIl(final int df) {
        net.optifine.shaders.llIIlllIIlllIIllIllI.df = df;
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.IllIlIllIllIlllIIlll) {
            llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.v, df);
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(final float dh, final float di, final float dj) {
        net.optifine.shaders.llIIlllIIlllIIllIllI.dh = dh;
        net.optifine.shaders.llIIlllIIlllIIllIllI.di = di;
        net.optifine.shaders.llIIlllIIlllIIllIllI.dj = dj;
        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.x, net.optifine.shaders.llIIlllIIlllIIllIllI.dh, net.optifine.shaders.llIIlllIIlllIIllIllI.di, net.optifine.shaders.llIIlllIIlllIIllIllI.dj);
    }
    
    public static void llllIIIIlIIIlIlllIll(final float llIIlllIIlllIIllIllI, final float iIlllIIIlIlllIIlllII, final float iIlIIIIIllIlIIIlIIll, final float n) {
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI, iIlllIIIlIlllIIlllII, iIlIIIIIllIlIIIlIIll, n);
        llIIlllIIlllIIllIllI.llIIlllIIlllIIllIllI = llIIlllIIlllIIllIllI;
        llIIlllIIlllIIllIllI.IIlllIIIlIlllIIlllII = iIlllIIIlIlllIIlllII;
        llIIlllIIlllIIllIllI.IIlIIIIIllIlIIIlIIll = iIlIIIIIllIlIIIlIIll;
    }
    
    public static void IlIlIllllllllIIIIlII() {
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.IIlllIIlIllIllIlIIll) {
            llllIIIlIlllIlIIIIIl("shadow clear pre");
            EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36096, 3553, net.optifine.shaders.llIIlllIIlllIIllIllI.dL.get(0), 0);
            GL11.glClearColor(1.0f, 1.0f, 1.0f, 1.0f);
            GL20.glDrawBuffers(net.optifine.shaders.llIIlllIIlllIIllIllI.be.llIllIlIIIIllIlIIllI());
            IllIIlllIIIIlllIIlIl("shadow clear");
            GL11.glClear(16640);
            llllIIIlIlllIlIIIIIl("shadow clear");
        }
        else {
            llllIIIlIlllIlIIIIIl("clear pre");
            if (net.optifine.shaders.llIIlllIIlllIIllIllI.bb[0]) {
                final Vector4f vector4f = net.optifine.shaders.llIIlllIIlllIIllIllI.bc[0];
                if (vector4f != null) {
                    GL11.glClearColor(vector4f.getX(), vector4f.getY(), vector4f.getZ(), vector4f.getW());
                }
                if (net.optifine.shaders.llIIlllIIlllIIllIllI.dQ.IlIIIlIlIIIllIlIlIIl(0)) {
                    EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36064, 3553, net.optifine.shaders.llIIlllIIlllIIllIllI.dQ.IlIlIlIlIlllllllllIl(0), 0);
                    GL20.glDrawBuffers(36064);
                    GL11.glClear(16384);
                    EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36064, 3553, net.optifine.shaders.llIIlllIIlllIIllIllI.dQ.llllIIIIlIIIlIlllIll(0), 0);
                }
                GL20.glDrawBuffers(36064);
                GL11.glClear(16384);
            }
            if (net.optifine.shaders.llIIlllIIlllIIllIllI.bb[1]) {
                GL11.glClearColor(1.0f, 1.0f, 1.0f, 1.0f);
                final Vector4f vector4f2 = net.optifine.shaders.llIIlllIIlllIIllIllI.bc[1];
                if (vector4f2 != null) {
                    GL11.glClearColor(vector4f2.getX(), vector4f2.getY(), vector4f2.getZ(), vector4f2.getW());
                }
                if (net.optifine.shaders.llIIlllIIlllIIllIllI.dQ.IlIIIlIlIIIllIlIlIIl(1)) {
                    EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36065, 3553, net.optifine.shaders.llIIlllIIlllIIllIllI.dQ.IlIlIlIlIlllllllllIl(1), 0);
                    GL20.glDrawBuffers(36065);
                    GL11.glClear(16384);
                    EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36065, 3553, net.optifine.shaders.llIIlllIIlllIIllIllI.dQ.llllIIIIlIIIlIlllIll(1), 0);
                }
                GL20.glDrawBuffers(36065);
                GL11.glClear(16384);
            }
            for (int i = 2; i < net.optifine.shaders.llIIlllIIlllIIllIllI.aT; ++i) {
                if (net.optifine.shaders.llIIlllIIlllIIllIllI.bb[i]) {
                    GL11.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    final Vector4f vector4f3 = net.optifine.shaders.llIIlllIIlllIIllIllI.bc[i];
                    if (vector4f3 != null) {
                        GL11.glClearColor(vector4f3.getX(), vector4f3.getY(), vector4f3.getZ(), vector4f3.getW());
                    }
                    if (net.optifine.shaders.llIIlllIIlllIIllIllI.dQ.IlIIIlIlIIIllIlIlIIl(i)) {
                        EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36064 + i, 3553, net.optifine.shaders.llIIlllIIlllIIllIllI.dQ.IlIlIlIlIlllllllllIl(i), 0);
                        GL20.glDrawBuffers(36064 + i);
                        GL11.glClear(16384);
                        EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36064 + i, 3553, net.optifine.shaders.llIIlllIIlllIIllIllI.dQ.llllIIIIlIIIlIlllIll(i), 0);
                    }
                    GL20.glDrawBuffers(36064 + i);
                    GL11.glClear(16384);
                }
            }
            llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.dM);
            IllIIlllIIIIlllIIlIl("clear");
            llllIIIlIlllIlIIIIIl("clear");
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(final float n) {
        final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI liiiIlIlIllllIIlIllI = net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI();
        final double n2 = liiiIlIlIllllIIlIllI.lIIlIIIlIllIlIllIIIl + (liiiIlIlIllllIIlIllI.IIlllIlIIllIlIlIlIIl - liiiIlIlIllllIIlIllI.lIIlIIIlIllIlIllIIIl) * n;
        final double aw = liiiIlIlIllllIIlIllI.IIlIIIlllIllIllIlIII + (liiiIlIlIllllIIlIllI.llIIIlIlIllIIlIlIlII - liiiIlIlIllllIIlIllI.IIlIIIlllIllIllIlIII) * n;
        final double n3 = liiiIlIlIllllIIlIllI.lIlIlIlllIIlIlIlllIl + (liiiIlIlIllllIIlIllI.lllllIlIIIlIlIIlllII - liiiIlIlIllllIIlIllI.lIlIlIlllIIlIlIlllIl) * n;
        llIllIIIIIllIlIIIIlI(liiiIlIlIllllIIlIllI);
        net.optifine.shaders.llIIlllIIlllIIllIllI.av = n2 - net.optifine.shaders.llIIlllIIlllIIllIllI.ay;
        net.optifine.shaders.llIIlllIIlllIIllIllI.aw = aw;
        net.optifine.shaders.llIIlllIIlllIIllIllI.ax = n3 - net.optifine.shaders.llIIlllIIlllIIllIllI.az;
        GL11.glGetFloat(2983, (FloatBuffer)net.optifine.shaders.llIIlllIIlllIIllIllI.dw.position(0));
        net.optifine.shaders.IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll((FloatBuffer)net.optifine.shaders.llIIlllIIlllIIllIllI.dx.position(0), (FloatBuffer)net.optifine.shaders.llIIlllIIlllIIllIllI.dw.position(0), net.optifine.shaders.llIIlllIIlllIIllIllI.dp, net.optifine.shaders.llIIlllIIlllIIllIllI.do);
        net.optifine.shaders.llIIlllIIlllIIllIllI.dw.position(0);
        net.optifine.shaders.llIIlllIIlllIIllIllI.dx.position(0);
        GL11.glGetFloat(2982, (FloatBuffer)net.optifine.shaders.llIIlllIIlllIIllIllI.dy.position(0));
        net.optifine.shaders.IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll((FloatBuffer)net.optifine.shaders.llIIlllIIlllIIllIllI.dz.position(0), (FloatBuffer)net.optifine.shaders.llIIlllIIlllIIllIllI.dy.position(0), net.optifine.shaders.llIIlllIIlllIIllIllI.dr, net.optifine.shaders.llIIlllIIlllIIllIllI.dq);
        net.optifine.shaders.llIIlllIIlllIIllIllI.dy.position(0);
        net.optifine.shaders.llIIlllIIlllIIllIllI.dz.position(0);
        llllIIIlIlllIlIIIIIl("setCamera");
    }
    
    private static void llIllIIIIIllIlIIIIlI(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        final double abs = Math.abs(net.optifine.shaders.llIIlllIIlllIIllIllI.av - net.optifine.shaders.llIIlllIIlllIIllIllI.as);
        final double abs2 = Math.abs(net.optifine.shaders.llIIlllIIlllIIllIllI.ax - net.optifine.shaders.llIIlllIIlllIIllIllI.au);
        final double abs3 = Math.abs(net.optifine.shaders.llIIlllIIlllIIllIllI.av);
        final double abs4 = Math.abs(net.optifine.shaders.llIIlllIIlllIIllIllI.ax);
        if (abs > 1000.0 || abs2 > 1000.0 || abs3 > 1000000.0 || abs4 > 1000000.0) {
            IlIIIlIlIIIllIlIlIIl(llIllIIIIIllIlIIIIlI);
        }
    }
    
    private static void IlIIIlIlIIIllIlIlIIl(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        if (llIllIIIIIllIlIIIIlI == null) {
            net.optifine.shaders.llIIlllIIlllIIllIllI.ay = 0;
            net.optifine.shaders.llIIlllIIlllIIllIllI.az = 0;
        }
        else {
            net.optifine.shaders.llIIlllIIlllIIllIllI.ay = (int)llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl / 1000 * 1000;
            net.optifine.shaders.llIIlllIIlllIIllIllI.az = (int)llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII / 1000 * 1000;
        }
    }
    
    public static void IlIlIlIlIlllllllllIl(final float n) {
        final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI liiiIlIlIllllIIlIllI = net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI();
        final double n2 = liiiIlIlIllllIIlIllI.lIIlIIIlIllIlIllIIIl + (liiiIlIlIllllIIlIllI.IIlllIlIIllIlIlIlIIl - liiiIlIlIllllIIlIllI.lIIlIIIlIllIlIllIIIl) * n;
        final double aw = liiiIlIlIllllIIlIllI.IIlIIIlllIllIllIlIII + (liiiIlIlIllllIIlIllI.llIIIlIlIllIIlIlIlII - liiiIlIlIllllIIlIllI.IIlIIIlllIllIllIlIII) * n;
        final double n3 = liiiIlIlIllllIIlIllI.lIlIlIlllIIlIlIlllIl + (liiiIlIlIllllIIlIllI.lllllIlIIIlIlIIlllII - liiiIlIlIllllIIlIllI.lIlIlIlllIIlIlIlllIl) * n;
        llIllIIIIIllIlIIIIlI(liiiIlIlIllllIIlIllI);
        net.optifine.shaders.llIIlllIIlllIIllIllI.av = n2 - net.optifine.shaders.llIIlllIIlllIIllIllI.ay;
        net.optifine.shaders.llIIlllIIlllIIllIllI.aw = aw;
        net.optifine.shaders.llIIlllIIlllIIllIllI.ax = n3 - net.optifine.shaders.llIIlllIIlllIIllIllI.az;
        GL11.glGetFloat(2983, (FloatBuffer)net.optifine.shaders.llIIlllIIlllIIllIllI.dw.position(0));
        net.optifine.shaders.IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll((FloatBuffer)net.optifine.shaders.llIIlllIIlllIIllIllI.dx.position(0), (FloatBuffer)net.optifine.shaders.llIIlllIIlllIIllIllI.dw.position(0), net.optifine.shaders.llIIlllIIlllIIllIllI.dp, net.optifine.shaders.llIIlllIIlllIIllIllI.do);
        net.optifine.shaders.llIIlllIIlllIIllIllI.dw.position(0);
        net.optifine.shaders.llIIlllIIlllIIllIllI.dx.position(0);
        GL11.glGetFloat(2982, (FloatBuffer)net.optifine.shaders.llIIlllIIlllIIllIllI.dy.position(0));
        net.optifine.shaders.IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll((FloatBuffer)net.optifine.shaders.llIIlllIIlllIIllIllI.dz.position(0), (FloatBuffer)net.optifine.shaders.llIIlllIIlllIIllIllI.dy.position(0), net.optifine.shaders.llIIlllIIlllIIllIllI.dr, net.optifine.shaders.llIIlllIIlllIIllIllI.dq);
        net.optifine.shaders.llIIlllIIlllIIllIllI.dy.position(0);
        net.optifine.shaders.llIIlllIIlllIIllIllI.dz.position(0);
        GL11.glViewport(0, 0, net.optifine.shaders.llIIlllIIlllIIllIllI.aC, net.optifine.shaders.llIIlllIIlllIIllIllI.aD);
        GL11.glMatrixMode(5889);
        GL11.glLoadIdentity();
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.aI) {
            GL11.glOrtho((double)(-net.optifine.shaders.llIIlllIIlllIIllIllI.aH), (double)net.optifine.shaders.llIIlllIIlllIIllIllI.aH, (double)(-net.optifine.shaders.llIIlllIIlllIIllIllI.aH), (double)net.optifine.shaders.llIIlllIIlllIIllIllI.aH, 0.05000000074505806, 256.0);
        }
        else {
            GLU.gluPerspective(net.optifine.shaders.llIIlllIIlllIIllIllI.aG, net.optifine.shaders.llIIlllIIlllIIllIllI.aC / (float)net.optifine.shaders.llIIlllIIlllIIllIllI.aD, 0.05f, 256.0f);
        }
        GL11.glMatrixMode(5888);
        GL11.glLoadIdentity();
        GL11.glTranslatef(0.0f, 0.0f, -100.0f);
        GL11.glRotatef(90.0f, 1.0f, 0.0f, 0.0f);
        net.optifine.shaders.llIIlllIIlllIIllIllI.IlllIIIIlIIIlIlIlIIl = net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI(n);
        net.optifine.shaders.llIIlllIIlllIIllIllI.lllIllIIIllllllIllll = ((net.optifine.shaders.llIIlllIIlllIIllIllI.IlllIIIIlIIIlIlIlIIl < 0.75f) ? (net.optifine.shaders.llIIlllIIlllIIllIllI.IlllIIIIlIIIlIlIlIIl + 0.25f) : (net.optifine.shaders.llIIlllIIlllIIllIllI.IlllIIIIlIIIlIlIlIIl - 0.75f));
        final float n4 = net.optifine.shaders.llIIlllIIlllIIllIllI.IlllIIIIlIIIlIlIlIIl * -360.0f;
        final float n5 = (net.optifine.shaders.llIIlllIIlllIIllIllI.de > 0.0f) ? (n4 % net.optifine.shaders.llIIlllIIlllIIllIllI.de - net.optifine.shaders.llIIlllIIlllIIllIllI.de * 0.5f) : 0.0f;
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.lllIllIIIllllllIllll <= 0.5) {
            GL11.glRotatef(n4 - n5, 0.0f, 0.0f, 1.0f);
            GL11.glRotatef(net.optifine.shaders.llIIlllIIlllIIllIllI.dd, 1.0f, 0.0f, 0.0f);
            net.optifine.shaders.llIIlllIIlllIIllIllI.llIllIlIlIIIIIIIllII = net.optifine.shaders.llIIlllIIlllIIllIllI.lllIllIIIllllllIllll;
        }
        else {
            GL11.glRotatef(n4 + 180.0f - n5, 0.0f, 0.0f, 1.0f);
            GL11.glRotatef(net.optifine.shaders.llIIlllIIlllIIllIllI.dd, 1.0f, 0.0f, 0.0f);
            net.optifine.shaders.llIIlllIIlllIIllIllI.llIllIlIlIIIIIIIllII = net.optifine.shaders.llIIlllIIlllIIllIllI.lllIllIIIllllllIllll - 0.5f;
        }
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.aI) {
            final float dk = net.optifine.shaders.llIIlllIIlllIIllIllI.dk;
            final float n6 = dk / 2.0f;
            GL11.glTranslatef((float)n2 % dk - n6, (float)aw % dk - n6, (float)n3 % dk - n6);
        }
        final float n7 = net.optifine.shaders.llIIlllIIlllIIllIllI.lllIllIIIllllllIllll * 6.2831855f;
        final float n8 = (float)Math.cos(n7);
        final float n9 = (float)Math.sin(n7);
        final float n10 = net.optifine.shaders.llIIlllIIlllIIllIllI.dd * 6.2831855f;
        float n11 = n8;
        float n12 = n9 * (float)Math.cos(n10);
        float n13 = n9 * (float)Math.sin(n10);
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.lllIllIIIllllllIllll > 0.5) {
            n11 = -n8;
            n12 = -n12;
            n13 = -n13;
        }
        net.optifine.shaders.llIIlllIIlllIIllIllI.IIlllIlIIllIlIlIlIIl[0] = n11;
        net.optifine.shaders.llIIlllIIlllIIllIllI.IIlllIlIIllIlIlIlIIl[1] = n12;
        net.optifine.shaders.llIIlllIIlllIIllIllI.IIlllIlIIllIlIlIlIIl[2] = n13;
        net.optifine.shaders.llIIlllIIlllIIllIllI.IIlllIlIIllIlIlIlIIl[3] = 0.0f;
        GL11.glGetFloat(2983, (FloatBuffer)net.optifine.shaders.llIIlllIIlllIIllIllI.dA.position(0));
        net.optifine.shaders.IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll((FloatBuffer)net.optifine.shaders.llIIlllIIlllIIllIllI.dB.position(0), (FloatBuffer)net.optifine.shaders.llIIlllIIlllIIllIllI.dA.position(0), net.optifine.shaders.llIIlllIIlllIIllIllI.dt, net.optifine.shaders.llIIlllIIlllIIllIllI.ds);
        net.optifine.shaders.llIIlllIIlllIIllIllI.dA.position(0);
        net.optifine.shaders.llIIlllIIlllIIllIllI.dB.position(0);
        GL11.glGetFloat(2982, (FloatBuffer)net.optifine.shaders.llIIlllIIlllIIllIllI.dC.position(0));
        net.optifine.shaders.IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll((FloatBuffer)net.optifine.shaders.llIIlllIIlllIIllIllI.dD.position(0), (FloatBuffer)net.optifine.shaders.llIIlllIIlllIIllIllI.dC.position(0), net.optifine.shaders.llIIlllIIlllIIllIllI.dv, net.optifine.shaders.llIIlllIIlllIIllIllI.du);
        net.optifine.shaders.llIIlllIIlllIIllIllI.dC.position(0);
        net.optifine.shaders.llIIlllIIlllIIllIllI.dD.position(0);
        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.W, false, net.optifine.shaders.llIIlllIIlllIIllIllI.dw);
        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.X, false, net.optifine.shaders.llIIlllIIlllIIllIllI.dx);
        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.V, false, net.optifine.shaders.llIIlllIIlllIIllIllI.dE);
        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.T, false, net.optifine.shaders.llIIlllIIlllIIllIllI.dy);
        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.U, false, net.optifine.shaders.llIIlllIIlllIIllIllI.dz);
        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.Y, false, net.optifine.shaders.llIIlllIIlllIIllIllI.dF);
        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.Z, false, net.optifine.shaders.llIIlllIIlllIIllIllI.dA);
        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.aa, false, net.optifine.shaders.llIIlllIIlllIIllIllI.dB);
        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.ab, false, net.optifine.shaders.llIIlllIIlllIIllIllI.dC);
        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.ac, false, net.optifine.shaders.llIIlllIIlllIIllIllI.dD);
        net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll.IIIllIIllIIIIIIlIIlI = 1;
        llllIIIlIlllIlIIIIIl("setCamera");
    }
    
    public static void IIlllIlIIllIlIlIlIIl() {
        GL11.glRotatef(net.optifine.shaders.llIIlllIIlllIIllIllI.dd * 1.0f, 0.0f, 0.0f, 1.0f);
        llllIIIlIlllIlIIIIIl("preCelestialRotate");
    }
    
    public static void llIIIlIlIllIIlIlIlII() {
        final FloatBuffer dg = net.optifine.shaders.llIIlllIIlllIIllIllI.dG;
        dg.clear();
        GL11.glGetFloat(2982, dg);
        dg.get(net.optifine.shaders.llIIlllIIlllIIllIllI.eb, 0, 16);
        net.optifine.shaders.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl(net.optifine.shaders.llIIlllIIlllIIllIllI.IlllllllIIIlIIIlIlII, net.optifine.shaders.llIIlllIIlllIIllIllI.eb, net.optifine.shaders.llIIlllIIlllIIllIllI.lllllIlIIIlIlIIlllII);
        net.optifine.shaders.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl(net.optifine.shaders.llIIlllIIlllIIllIllI.IIlIIIIlllIlllllIlII, net.optifine.shaders.llIIlllIIlllIIllIllI.eb, net.optifine.shaders.llIIlllIIlllIIllIllI.lIllllllIIllIlIlIlII);
        System.arraycopy((net.optifine.shaders.llIIlllIIlllIIllIllI.llIllIlIlIIIIIIIllII == net.optifine.shaders.llIIlllIIlllIIllIllI.lllIllIIIllllllIllll) ? net.optifine.shaders.llIIlllIIlllIIllIllI.IlllllllIIIlIIIlIlII : net.optifine.shaders.llIIlllIIlllIIllIllI.IIlIIIIlllIlllllIlII, 0, net.optifine.shaders.llIIlllIIlllIIllIllI.IIIlIIlIIIIlllIlllII, 0, 3);
        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.N, net.optifine.shaders.llIIlllIIlllIIllIllI.IlllllllIIIlIIIlIlII[0], net.optifine.shaders.llIIlllIIlllIIllIllI.IlllllllIIIlIIIlIlII[1], net.optifine.shaders.llIIlllIIlllIIllIllI.IlllllllIIIlIIIlIlII[2]);
        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.O, net.optifine.shaders.llIIlllIIlllIIllIllI.IIlIIIIlllIlllllIlII[0], net.optifine.shaders.llIIlllIIlllIIllIllI.IIlIIIIlllIlllllIlII[1], net.optifine.shaders.llIIlllIIlllIIllIllI.IIlIIIIlllIlllllIlII[2]);
        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.P, net.optifine.shaders.llIIlllIIlllIIllIllI.IIIlIIlIIIIlllIlllII[0], net.optifine.shaders.llIIlllIIlllIIllIllI.IIIlIIlIIIIlllIlllII[1], net.optifine.shaders.llIIlllIIlllIIllIllI.IIIlIIlIIIIlllIlllII[2]);
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.ev != null) {
            net.optifine.shaders.llIIlllIIlllIIllIllI.ev.llllIIIIlIIIlIlllIll();
        }
        llllIIIlIlllIlIIIIIl("postCelestialRotate");
    }
    
    public static void lllllIlIIIlIlIIlllII() {
        final FloatBuffer dg = net.optifine.shaders.llIIlllIIlllIIllIllI.dG;
        dg.clear();
        GL11.glGetFloat(2982, dg);
        dg.get(net.optifine.shaders.llIIlllIIlllIIllIllI.eb, 0, 16);
        net.optifine.shaders.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl(net.optifine.shaders.llIIlllIIlllIIllIllI.IlIlIllllllllIIIIlII, net.optifine.shaders.llIIlllIIlllIIllIllI.eb, net.optifine.shaders.llIIlllIIlllIIllIllI.llIIIlIlIllIIlIlIlII);
        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.Q, net.optifine.shaders.llIIlllIIlllIIllIllI.IlIlIllllllllIIIIlII[0], net.optifine.shaders.llIIlllIIlllIIllIllI.IlIlIllllllllIIIIlII[1], net.optifine.shaders.llIIlllIIlllIIllIllI.IlIlIllllllllIIIIlII[2]);
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.ev != null) {
            net.optifine.shaders.llIIlllIIlllIIllIllI.ev.llllIIIIlIIIlIlllIll();
        }
    }
    
    public static void lIllllllIIllIlIlIlII() {
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.lIIIlllIIIllIIIllIII) {
            for (int i = 0; i < net.optifine.shaders.llIIlllIIlllIIllIllI.aT; ++i) {
                if ((net.optifine.shaders.llIIlllIIlllIIllIllI.ek & 1 << i) != 0x0) {
                    net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(33984 + net.optifine.shaders.llIIlllIIlllIIllIllI.dn[i]);
                    GL11.glTexParameteri(3553, 10241, 9987);
                    GL30.glGenerateMipmap(3553);
                }
            }
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(33984);
        }
    }
    
    public static void llIIlllIIlllIIllIllI() {
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        m();
        final int iiiIlllIIIIIIlIIIlll = net.optifine.shaders.llIIlllIIlllIIllIllI.bM.IIIIlllIIIIIIlIIIlll();
        if (iiiIlllIIIIIIlIIIlll > 1) {
            for (int i = 1; i < iiiIlllIIIIIIlIIIlll; ++i) {
                net.optifine.shaders.llIIlllIIlllIIllIllI.ar.IlIlIlIlIlllllllllIl(i);
                m();
            }
            net.optifine.shaders.llIIlllIIlllIIllIllI.ar.IlIlIlIlIlllllllllIl(0);
        }
    }
    
    private static void m() {
        if (!lIllIIlIlIlllllIIIII()) {
            GL11.glBegin(5);
            GL11.glTexCoord2f(0.0f, 0.0f);
            GL11.glVertex3f(0.0f, 0.0f, 0.0f);
            GL11.glTexCoord2f(1.0f, 0.0f);
            GL11.glVertex3f(1.0f, 0.0f, 0.0f);
            GL11.glTexCoord2f(0.0f, 1.0f);
            GL11.glVertex3f(0.0f, 1.0f, 0.0f);
            GL11.glTexCoord2f(1.0f, 1.0f);
            GL11.glVertex3f(1.0f, 1.0f, 0.0f);
            GL11.glEnd();
        }
        else {
            GL11.glBegin(7);
            GL11.glTexCoord2f(0.0f, 0.0f);
            GL11.glVertex3f(0.0f, 0.0f, 0.0f);
            GL11.glTexCoord2f(1.0f, 0.0f);
            GL11.glVertex3f(1.0f, 0.0f, 0.0f);
            GL11.glTexCoord2f(1.0f, 1.0f);
            GL11.glVertex3f(1.0f, 1.0f, 0.0f);
            GL11.glTexCoord2f(0.0f, 1.0f);
            GL11.glVertex3f(0.0f, 1.0f, 0.0f);
            GL11.glEnd();
        }
    }
    
    public static void IIlllIIIlIlllIIlllII() {
        if (!net.optifine.shaders.llIIlllIIlllIIllIllI.IIlllIIlIllIllIlIIll) {
            boolean ilIIIlIlIIIllIlIlIIl = IlIIIlIlIIIllIlIlIIl(net.optifine.shaders.llIIlllIIlllIIllIllI.bB);
            if (net.optifine.shaders.llIIlllIIlllIIllIllI.ej) {
                llllIIIlIlllIlIIIIIl("pre-render Deferred");
                llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.bC, false);
                ilIIIlIlIIIllIlIlIIl = true;
            }
            if (ilIIIlIlIIIllIlIlIIl) {
                l();
                for (int i = 0; i < net.optifine.shaders.llIIlllIIlllIIllIllI.aT; ++i) {
                    EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36064 + i, 3553, net.optifine.shaders.llIIlllIIlllIIllIllI.dQ.llllIIIIlIIIlIlllIll(i), 0);
                }
                if (net.optifine.shaders.llIIlllIIlllIIllIllI.bE.llIllIlIIIIllIlIIllI() != null) {
                    llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.bE.llIllIlIIIIllIlIIllI());
                }
                else {
                    llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.dM);
                }
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(33984);
                net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl);
            }
        }
    }
    
    public static void IIlIIIIIllIlIIIlIIll() {
        if (!net.optifine.shaders.llIIlllIIlllIIllIllI.IIlllIIlIllIllIlIIll) {
            IlIIIlIlIIIllIlIlIIl(net.optifine.shaders.llIIlllIIlllIIllIllI.bG);
            llllIIIlIlllIlIIIIIl("pre-render CompositeFinal");
            llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.bH, true);
        }
    }
    
    private static boolean IlIIIlIlIIIllIlIlIIl(final net.optifine.shaders.IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII) {
        boolean b = false;
        final Boolean[] lllIIIIlllllIlIIllIl = ilIllIlIlIIIlIlIlIII.lllIIIIlllllIlIIllIl();
        for (int i = 0; i < net.optifine.shaders.llIIlllIIlllIIllIllI.aT; ++i) {
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl[i])) {
                net.optifine.shaders.llIIlllIIlllIIllIllI.dQ.llIllIIIIIllIlIIIIlI(i);
                b = true;
            }
        }
        return b;
    }
    
    private static void llllIIIIlIIIlIlllIll(final net.optifine.shaders.IlIllIlIlIIIlIlIlIII[] array, final boolean b) {
        if (!net.optifine.shaders.llIIlllIIlllIIllIllI.IIlllIIlIllIllIlIIll) {
            GL11.glPushMatrix();
            GL11.glLoadIdentity();
            GL11.glMatrixMode(5889);
            GL11.glPushMatrix();
            GL11.glLoadIdentity();
            GL11.glOrtho(0.0, 1.0, 0.0, 1.0, 0.0, 1.0);
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIIlIIIlIIIllIlIIIl();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(519);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(false);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl();
            if (net.optifine.shaders.llIIlllIIlllIIllIllI.aW >= 1) {
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(33988);
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(net.optifine.shaders.llIIlllIIlllIIllIllI.dL.get(0));
                if (net.optifine.shaders.llIIlllIIlllIIllIllI.aW >= 2) {
                    net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(33989);
                    net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(net.optifine.shaders.llIIlllIIlllIIllIllI.dL.get(1));
                }
            }
            for (int i = 0; i < net.optifine.shaders.llIIlllIIlllIIllIllI.aT; ++i) {
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(33984 + net.optifine.shaders.llIIlllIIlllIIllIllI.dn[i]);
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(net.optifine.shaders.llIIlllIIlllIIllIllI.dQ.llllIIIIlIIIlIlllIll(i));
            }
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(33990);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(net.optifine.shaders.llIIlllIIlllIIllIllI.dJ.get(0));
            if (net.optifine.shaders.llIIlllIIlllIIllIllI.aU >= 2) {
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(33995);
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(net.optifine.shaders.llIIlllIIlllIIllIllI.dJ.get(1));
                if (net.optifine.shaders.llIIlllIIlllIIllIllI.aU >= 3) {
                    net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(33996);
                    net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(net.optifine.shaders.llIIlllIIlllIIllIllI.dJ.get(2));
                }
            }
            for (int j = 0; j < net.optifine.shaders.llIIlllIIlllIIllIllI.aV; ++j) {
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(33997 + j);
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(net.optifine.shaders.llIIlllIIlllIIllIllI.dK.get(j));
            }
            if (net.optifine.shaders.llIIlllIIlllIIllIllI.eC) {
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(33984 + net.optifine.shaders.llIIlllIIlllIIllIllI.eB.llllIIIIlIIIlIlllIll());
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(net.optifine.shaders.llIIlllIIlllIIllIllI.eB.IlIIIlIlIIIllIlIlIIl());
            }
            if (b) {
                llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.es);
            }
            else {
                llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.et);
            }
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(33984);
            for (int k = 0; k < net.optifine.shaders.llIIlllIIlllIIllIllI.aT; ++k) {
                EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36064 + k, 3553, net.optifine.shaders.llIIlllIIlllIIllIllI.dQ.IlIlIlIlIlllllllllIl(k), 0);
            }
            EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36096, 3553, net.optifine.shaders.llIIlllIIlllIIllIllI.dJ.get(0), 0);
            GL20.glDrawBuffers(net.optifine.shaders.llIIlllIIlllIIllIllI.dM);
            llllIIIlIlllIlIIIIIl("pre-composite");
            for (int l = 0; l < array.length; ++l) {
                final net.optifine.shaders.IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII = array[l];
                if (ilIllIlIlIIIlIlIlIII.lIIIIlIIIIIlllIllIII() != 0) {
                    llllIIIIlIIIlIlllIll(ilIllIlIlIIIlIlIlIII);
                    llllIIIlIlllIlIIIIIl(ilIllIlIlIIIlIlIlIII.IlIlIIIllIllIIIIIllI());
                    if (net.optifine.shaders.llIIlllIIlllIIllIllI.ek != 0) {
                        lIllllllIIllIlIlIlII();
                    }
                    n();
                    llIIlllIIlllIIllIllI();
                    o();
                    for (int n = 0; n < net.optifine.shaders.llIIlllIIlllIIllIllI.aT; ++n) {
                        if (ilIllIlIlIIIlIlIlIII.IlIlIIIIIIlllIlIllIl()[n]) {
                            net.optifine.shaders.llIIlllIIlllIIllIllI.dQ.llIllIIIIIllIlIIIIlI(n);
                            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(33984 + net.optifine.shaders.llIIlllIIlllIIllIllI.dn[n]);
                            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(net.optifine.shaders.llIIlllIIlllIIllIllI.dQ.llllIIIIlIIIlIlllIll(n));
                            EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36064 + n, 3553, net.optifine.shaders.llIIlllIIlllIIllIllI.dQ.IlIlIlIlIlllllllllIl(n), 0);
                        }
                    }
                    net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(33984);
                }
            }
            llllIIIlIlllIlIIIIIl("composite");
            if (b) {
                p();
                net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIllllIlIlIIIIll = true;
            }
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIIIllIllIIIIIllI();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(515);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(true);
            GL11.glPopMatrix();
            GL11.glMatrixMode(5888);
            GL11.glPopMatrix();
            llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.bd);
        }
    }
    
    private static void n() {
        final net.optifine.shaders.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII iIlllIIlIllIllIlIIll = net.optifine.shaders.llIIlllIIlllIIllIllI.bM.IIlllIIlIllIllIlIIll();
        if (iIlllIIlIllIllIlIIll != null) {
            GL11.glViewport((int)(net.optifine.shaders.llIIlllIIlllIIllIllI.llIllIlIIIIllIlIIllI * iIlllIIlIllIllIlIIll.IlIlIlIlIlllllllllIl()), (int)(net.optifine.shaders.llIIlllIIlllIIllIllI.lIlIlIIIllIIllIIIllI * iIlllIIlIllIllIlIIll.llIllIIIIIllIlIIIIlI()), (int)(net.optifine.shaders.llIIlllIIlllIIllIllI.llIllIlIIIIllIlIIllI * iIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll()), (int)(net.optifine.shaders.llIIlllIIlllIIllIllI.lIlIlIIIllIIllIIIllI * iIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll()));
        }
    }
    
    private static void o() {
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.bM.IIlllIIlIllIllIlIIll() != null) {
            GL11.glViewport(0, 0, net.optifine.shaders.llIIlllIIlllIIllIllI.llIllIlIIIIllIlIIllI, net.optifine.shaders.llIIlllIIlllIIllIllI.lIlIlIIIllIIllIIIllI);
        }
    }
    
    private static void p() {
        net.optifine.shaders.llIIlllIIlllIIllIllI.IlIllIlIlIIIlIlIlIII = false;
        net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(true);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.llIllIIIIIllIlIIIIlI, net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IlIlIIIllIllIIIIIllI, 3553, net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl().llllIIIlIlllIlIIIIIl, 0);
        GL11.glViewport(0, 0, net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl, net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI);
        if (net.minecraft.client.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll) {
            final boolean b = net.minecraft.client.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl != 0;
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(b, !b, !b, true);
        }
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(true);
        GL11.glClearColor(net.optifine.shaders.llIIlllIIlllIIllIllI.llIIlllIIlllIIllIllI, net.optifine.shaders.llIIlllIIlllIIllIllI.IIlllIIIlIlllIIlllII, net.optifine.shaders.llIIlllIIlllIIllIllI.IIlIIIIIllIlIIIlIIll, 1.0f);
        GL11.glClear(16640);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIIlIIIlIIIllIlIIIl();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(519);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(false);
        llllIIIlIlllIlIIIIIl("pre-final");
        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.bJ);
        llllIIIlIlllIlIIIIIl("final");
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.ek != 0) {
            lIllllllIIllIlIlIlII();
        }
        llIIlllIIlllIIllIllI();
        llllIIIlIlllIlIIIIIl("renderCompositeFinal");
    }
    
    public static void llllllIllIllIlIllllI() {
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.IIlllIIlIllIllIlIIll) {
            llllIIIlIlllIlIIIIIl("shadow endRender");
        }
        else {
            if (!net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIllllIlIlIIIIll) {
                IIlIIIIIllIlIIIlIIll();
            }
            net.optifine.shaders.llIIlllIIlllIIllIllI.IlIlIIIllIIllIlllllI = false;
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(true, true, true, true);
            llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.bd);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll();
            llllIIIlIlllIlIIIIIl("endRender end");
        }
    }
    
    public static void IIIllllllIllIIIlllIl() {
        net.optifine.shaders.llIIlllIIlllIIllIllI.IIIIlllIIIIIIlIIIlll = true;
        net.optifine.shaders.llIIlllIIlllIIllIllI.IllIlIllIllIlllIIlll = true;
        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.dM);
        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.bl);
        IlIlIlIlIlllllllllIl(-2, 0);
    }
    
    public static void llllIIIIlIIIlIlllIll(final e e) {
        net.optifine.shaders.llIIlllIIlllIIllIllI.llllllIllIllIlIllllI = (float)e.llllIIIIlIIIlIlllIll;
        net.optifine.shaders.llIIlllIIlllIIllIllI.IIIllllllIllIIIlllIl = (float)e.IlIlIlIlIlllllllllIl;
        net.optifine.shaders.llIIlllIIlllIIllIllI.IlIIIlIIIllllIlIlIlI = (float)e.llIllIIIIIllIlIIIIlI;
        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.y, net.optifine.shaders.llIIlllIIlllIIllIllI.llllllIllIllIlIllllI, net.optifine.shaders.llIIlllIIlllIIllIllI.IIIllllllIllIIIlllIl, net.optifine.shaders.llIIlllIIlllIIllIllI.IlIIIlIIIllllIlIlIlI);
    }
    
    public static void IlIIIlIIIllllIlIlIlI() {
        final lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = net.minecraft.client.lIIIlllIIIllIIIllIII.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll().llIllIIIIIllIlIIIIlI();
        final float n = (float)(net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll.llIllIIIIIllIlIIIIlI * 16);
        final double n2 = n * 0.9238;
        final double n3 = n * 0.3826;
        final double n4 = -n3;
        final double n5 = -n2;
        final double n6 = 16.0;
        final double n7 = -net.optifine.shaders.llIIlllIIlllIIllIllI.aw;
        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl);
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n4, n7, n5).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n4, n6, n5).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n5, n6, n4).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n5, n7, n4).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n5, n7, n4).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n5, n6, n4).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n5, n6, n3).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n5, n7, n3).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n5, n7, n3).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n5, n6, n3).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n4, n6, n2).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n4, n7, n2).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n4, n7, n2).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n4, n6, n2).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n3, n6, n2).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n3, n7, n2).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n3, n7, n2).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n3, n6, n2).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n2, n6, n3).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n2, n7, n3).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n2, n7, n3).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n2, n6, n3).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n2, n6, n4).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n2, n7, n4).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n2, n7, n4).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n2, n6, n4).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n3, n6, n5).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n3, n7, n5).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n3, n7, n5).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n3, n6, n5).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n4, n6, n5).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n4, n7, n5).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n5, n7, n5).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n5, n7, n2).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n2, n7, n2).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n2, n7, n5).IlIlIIIllIllIIIIIllI();
        net.minecraft.client.lIIIlllIIIllIIIllIII.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll().IlIlIlIlIlllllllllIl();
    }
    
    public static void IIIIIllIIIIlIIIIllIl() {
        lllllIlIIIlIlIIlllII();
        GL11.glColor3f(net.optifine.shaders.llIIlllIIlllIIllIllI.dh, net.optifine.shaders.llIIlllIIlllIIllIllI.di, net.optifine.shaders.llIIlllIIlllIIllIllI.dj);
        IlIIIlIIIllllIlIlIlI();
        GL11.glColor3f(net.optifine.shaders.llIIlllIIlllIIllIllI.llllllIllIllIlIllllI, net.optifine.shaders.llIIlllIIlllIIllIllI.IIIllllllIllIIIlllIl, net.optifine.shaders.llIIlllIIlllIIllIllI.IlIIIlIIIllllIlIlIlI);
    }
    
    public static void IIIIIIIIIlllIllIlIlI() {
        net.optifine.shaders.llIIlllIIlllIIllIllI.IIIIlllIIIIIIlIIIlll = false;
        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.dM);
        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.lIIllIIIllllIlllIllI ? net.optifine.shaders.llIIlllIIlllIIllIllI.bj : net.optifine.shaders.llIIlllIIlllIIllIllI.bi);
        lIIIIIlIlIIIlIIIIlIl();
    }
    
    public static void IIllllIIIlIIIIIIllIl() {
        llllIIIlIlllIlIIIIIl("beginUpdateChunks1");
        IllIIlllIIIIlllIIlIl("beginUpdateChunks1");
        if (!net.optifine.shaders.llIIlllIIlllIIllIllI.IIlllIIlIllIllIlIIll) {
            llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.bn);
        }
        llllIIIlIlllIlIIIIIl("beginUpdateChunks2");
        IllIIlllIIIIlllIIlIl("beginUpdateChunks2");
    }
    
    public static void IlllIIIIlIIIlIlIlIIl() {
        llllIIIlIlllIlIIIIIl("endUpdateChunks1");
        IllIIlllIIIIlllIIlIl("endUpdateChunks1");
        if (!net.optifine.shaders.llIIlllIIlllIIllIllI.IIlllIIlIllIllIlIIll) {
            llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.bn);
        }
        llllIIIlIlllIlIIIIIl("endUpdateChunks2");
        IllIIlllIIIIlllIIlIl("endUpdateChunks2");
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final net.minecraft.client.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (!net.optifine.shaders.llIIlllIIlllIIllIllI.cu) {
            return true;
        }
        llllIIIlIlllIlIIIIIl("shouldRenderClouds");
        return net.optifine.shaders.llIIlllIIlllIIllIllI.IIlllIIlIllIllIlIIll ? net.optifine.shaders.llIIlllIIlllIIllIllI.bY : (llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII > 0);
    }
    
    public static void lllIllIIIllllllIllll() {
        net.optifine.shaders.llIIlllIIlllIIllIllI.IllIlIllIllIlllIIlll = true;
        IlIlIlIlIlllllllllIl(-3, 0);
        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.bm);
    }
    
    public static void llIllIlIlIIIIIIIllII() {
        lllllIIllIlIllIllllI();
        lIIIIIlIlIIIlIIIIlIl();
        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.lIIllIIIllllIlllIllI ? net.optifine.shaders.llIIlllIIlllIIllIllI.bj : net.optifine.shaders.llIIlllIIlllIIllIllI.bi);
    }
    
    public static void IIlIlIlIIlIllIIIIIIl() {
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.IlIlIIIllIIllIlllllI) {
            llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.bv);
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.IlIlIIIllIIllIlllllI) {
            llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.bv);
            IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI);
        }
    }
    
    public static void IlIlIlIlIlllllllllIl(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.llIlllIlllllIIllIIII.IllIIlllIIIIlllIIlIl()) {
            int llllIIIIlIIIlIlllIll = net.optifine.util.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI);
            final int llllIIIIlIIIlIlllIll2 = net.optifine.shaders.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
            if (llllIIIIlIIIlIlllIll2 >= 0) {
                llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll2;
            }
            net.optifine.shaders.llIIlllIIlllIIllIllI.llIlllIlllllIIllIIII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
        }
    }
    
    public static void IllIllIIIIlIIlIlllII() {
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.IlIlIIIllIIllIlllllI && net.optifine.shaders.llIIlllIIlllIIllIllI.by.lIIIIlIIIIIlllIllIII() != net.optifine.shaders.llIIlllIIlllIIllIllI.bd.lIIIIlIIIIIlllIllIII()) {
            llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.by);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(516, 0.0f);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(770, 771);
        }
    }
    
    public static void IlIllllIIlIIlIlIlIll() {
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.IlIlIIIllIIllIlllllI && net.optifine.shaders.llIIlllIIlllIIllIllI.by.lIIIIlIIIIIlllIllIII() != net.optifine.shaders.llIIlllIIlllIIllIllI.bd.lIIIIlIIIIIlllIllIII()) {
            llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.bv);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI();
        }
    }
    
    public static void IllIllIlllIllllIIllI() {
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.IlIlIIIllIIllIlllllI) {
            IlIlIlIlIlllllllllIl((net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI)null);
            llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.lIIllIIIllllIlllIllI ? net.optifine.shaders.llIIlllIIlllIIllIllI.bj : net.optifine.shaders.llIIlllIIlllIIllIllI.bi);
        }
    }
    
    public static void llIlIIIIIlIIlIlIIlll() {
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.IlIlIIIllIIllIlllllI) {
            net.optifine.shaders.llIIlllIIlllIIllIllI.lllIIIIlllllIlIIllIl = true;
        }
    }
    
    public static void IlIIlIlIIIlIIlIlIlII() {
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.IlIlIIIllIIllIlllllI) {
            net.optifine.shaders.llIIlllIIlllIIllIllI.lllIIIIlllllIlIIllIl = false;
        }
    }
    
    public static void IlIlIlIlIlllllllllIl(final float n, final float n2, final float n3, final float n4) {
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.IlIlIIIllIIllIlllllI && !net.optifine.shaders.llIIlllIIlllIIllIllI.IIlllIIlIllIllIlIIll) {
            net.optifine.shaders.llIIlllIIlllIIllIllI.IIlllIIIllIllIIlIlIl.llllIIIIlIIIlIlllIll(n, n2, n3, n4);
        }
    }
    
    public static void IllIlIIllIllIIlIllII() {
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.IlIlIIIllIIllIlllllI) {
            net.optifine.shaders.IIlIIIIIllIlIIIlIIll.llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.bR);
            if (!net.optifine.shaders.llIIlllIIlllIIllIllI.IIlllIIlIllIllIlIIll) {
                llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.dP);
            }
        }
    }
    
    public static void lIIlIIIlIllIlIllIIIl() {
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.IlIlIIIllIIllIlllllI && !net.optifine.shaders.llIIlllIIlllIIllIllI.IIlllIIlIllIllIlIIll) {
            llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.bv.llIllIlIIIIllIlIIllI());
        }
    }
    
    public static void IIlIIIlllIllIllIlIII() {
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.IlIlIIIllIIllIlllllI) {
            llllIIIlIlllIlIIIIIl("beginBlockEntities");
            llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.bs);
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.IlIlIIIllIIllIlllllI) {
            llllIIIlIlllIlIIIIIl("nextBlockEntity");
            llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.bs);
            IlIlIlIlIlllllllllIl(ilIIIlIlIIIllIlIlIIl);
        }
    }
    
    public static void IlIlIlIlIlllllllllIl(final net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.lllllIlIlIlllIlllIlI.IllIIlllIIIIlllIIlIl()) {
            net.optifine.shaders.llIIlllIIlllIIllIllI.lllllIlIlIlllIlllIlI.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI(ilIIIlIlIIIllIlIlIIl));
        }
    }
    
    private static int llIllIIIIIllIlIIIIlI(final net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (ilIIIlIlIIIllIlIlIIl == null) {
            return -1;
        }
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll ilIlIIIllIIllIlllllI = ilIIIlIlIIIllIlIlIIl.IlIlIIIllIIllIlllllI();
        if (ilIlIIIllIIllIlllllI == null) {
            return 0;
        }
        int llllIIIIlIIIlIlllIll = net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI);
        final int llllIIIIlIIIlIlllIll2 = net.optifine.shaders.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, ilIIIlIlIIIllIlIlIIl.llIIlIIIlIIIllIlIIIl());
        if (llllIIIIlIIIlIlllIll2 >= 0) {
            llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll2;
        }
        return llllIIIIlIIIlIlllIll;
    }
    
    public static void lIlIlIlllIIlIlIlllIl() {
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.IlIlIIIllIIllIlllllI) {
            llllIIIlIlllIlIIIIIl("endBlockEntities");
            IlIlIlIlIlllllllllIl((net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl)null);
            llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.lIIllIIIllllIlllIllI ? net.optifine.shaders.llIIlllIIlllIIllIllI.bj : net.optifine.shaders.llIIlllIIlllIIllIllI.bi);
            net.optifine.shaders.IIlIIIIIllIlIIIlIIll.llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.bR.llllIIIlIlllIlIIIIIl());
        }
    }
    
    public static void llIIIIIIlIllIIlIIIll() {
        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.bj);
    }
    
    public static void lIIIIlIlIllllIIlIllI() {
        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.bi);
    }
    
    public static void llIIIlIlllIllIIlIllI() {
        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.bj);
    }
    
    public static void IlIIllIIllIIllIIlIIl() {
        if (!net.optifine.shaders.llIIlllIIlllIIllIllI.IIlllIIlIllIllIlIIll && net.optifine.shaders.llIIlllIIlllIIllIllI.lllllIIlIlIIIlIlIIIl) {
            net.optifine.shaders.llIIlllIIlllIIllIllI.dH.clear();
            GL11.glReadPixels(net.optifine.shaders.llIIlllIIlllIIllIllI.llIllIlIIIIllIlIIllI / 2, net.optifine.shaders.llIIlllIIlllIIllIllI.lIlIlIIIllIIllIIIllI / 2, 1, 1, 6402, 5126, net.optifine.shaders.llIIlllIIlllIIllIllI.dH);
            net.optifine.shaders.llIIlllIIlllIIllIllI.IIIllIIIlIlIIllIIIlI = net.optifine.shaders.llIIlllIIlllIIllIllI.dH.get(0);
            final float n = (float)Math.exp(Math.log(0.5) * (net.optifine.shaders.llIIlllIIlllIIllIllI.IllIllIlllIllllIIllI * 0.01f) / net.optifine.shaders.llIIlllIIlllIIllIllI.IlIIlllllIIllIIlllll);
            net.optifine.shaders.llIIlllIIlllIIllIllI.IIlllIIlllIIIlIlllII = net.optifine.shaders.llIIlllIIlllIIllIllI.IIlllIIlllIIIlIlllII * n + net.optifine.shaders.llIIlllIIlllIIllIllI.IIIllIIIlIlIIllIIIlI * (1.0f - n);
        }
    }
    
    public static void lllllIIIIIlIlIIIIIIl() {
        if (!net.optifine.shaders.llIIlllIIlllIIllIllI.IIlllIIlIllIllIlIIll) {
            if (net.optifine.shaders.llIIlllIIlllIIllIllI.aU >= 3) {
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(33996);
                GL11.glCopyTexSubImage2D(3553, 0, 0, 0, 0, 0, net.optifine.shaders.llIIlllIIlllIIllIllI.llIllIlIIIIllIlIIllI, net.optifine.shaders.llIIlllIIlllIIllIllI.lIlIlIIIllIIllIIIllI);
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(33984);
            }
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIIlIIIlIIIllIlIIIl();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(770, 771);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl();
            llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.bA);
        }
    }
    
    public static void IllIIlllllIIllIIllIl() {
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.bj);
    }
    
    public static void lIllIIIIIlllIIlIIllI() {
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.aU >= 2) {
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(33995);
            llllIIIlIlllIlIIIIIl("pre copy depth");
            GL11.glCopyTexSubImage2D(3553, 0, 0, 0, 0, 0, net.optifine.shaders.llIIlllIIlllIIllIllI.llIllIlIIIIllIlIIllI, net.optifine.shaders.llIIlllIIlllIIllIllI.lIlIlIIIllIIllIIIllI);
            llllIIIlIlllIlIIIIIl("copy depth");
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl(33984);
        }
        net.optifine.shaders.IIlIIIIIllIlIIIlIIll.llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.bR.llllIIIlIlllIlIIIIIl());
    }
    
    public static void lIlIIlllIIlIIlIlllIl() {
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.IlIlIIIllIIllIlllllI) {
            if (!net.optifine.shaders.llIIlllIIlllIIllIllI.IIlllIIlIllIllIlIIll) {
                IIlllIIIlIlllIIlllII();
                llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.bE);
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(true);
            }
            else {
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(true);
            }
        }
    }
    
    public static void llIIIllIlIllIllIIIIl() {
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.IlIlIIIllIIllIlllllI) {
            if (net.optifine.shaders.llIIlllIIlllIIllIllI.IIlllIIlIllIllIlIIll) {}
            llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.lIIllIIIllllIlllIllI ? net.optifine.shaders.llIIlllIIlllIIllIllI.bj : net.optifine.shaders.llIIlllIIlllIIllIllI.bi);
        }
    }
    
    public static void IIIllIIIlIlIIllIIIlI() {
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.bZ != 1.0) {
            GL11.glScaled(1.0, 1.0, (double)net.optifine.shaders.llIIlllIIlllIIllIllI.bZ);
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(final boolean b) {
        GL11.glMatrixMode(5888);
        GL11.glPushMatrix();
        GL11.glMatrixMode(5889);
        GL11.glPushMatrix();
        GL11.glMatrixMode(5888);
        if (b) {
            llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.bF);
        }
        else {
            llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.bz);
        }
        llllIIIlIlllIlIIIIIl("beginHand");
        IllIIlllIIIIlllIIlIl("beginHand");
    }
    
    public static void IIlllIIlllIIIlIlllII() {
        llllIIIlIlllIlIIIIIl("pre endHand");
        IllIIlllIIIIlllIIlIl("pre endHand");
        GL11.glMatrixMode(5889);
        GL11.glPopMatrix();
        GL11.glMatrixMode(5888);
        GL11.glPopMatrix();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(770, 771);
        llllIIIlIlllIlIIIIIl("endHand");
    }
    
    public static void IlIIlllllIIllIIlllll() {
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
    }
    
    public static void lllllIIlIlIIIlIlIIIl() {
    }
    
    public static void llIllIIIIIllIlIIIIlI(final int n) {
        GL11.glEnable(n);
        if (n == 3553) {
            IIlllllIllIllIlIlIII();
        }
        else if (n == 2912) {
            llIllIIlllllllllllll();
        }
    }
    
    public static void IlIIIlIlIIIllIlIlIIl(final int n) {
        GL11.glDisable(n);
        if (n == 3553) {
            llllIllllIllllIlIlII();
        }
        else if (n == 2912) {
            lllllIIllIlIllIllllI();
        }
    }
    
    public static void IlIlIIIllIllIIIIIllI(final int n) {
        GL11.glEnable(n);
        IIlllllIllIllIlIlIII();
    }
    
    public static void IllIIlllIIIIlllIIlIl(final int n) {
        GL11.glDisable(n);
        llllIllllIllllIlIlII();
    }
    
    public static void llllIIIlIlllIlIIIIIl(final int n) {
        GL11.glEnable(n);
        llIllIIlllllllllllll();
    }
    
    public static void lIIIIlIIIIIlllIllIII(final int n) {
        GL11.glDisable(n);
        lllllIIllIlIllIllllI();
    }
    
    public static void IIlllllIllIllIlIlIII() {
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.IIIIlllIIIIIIlIIIlll) {
            llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.bl);
        }
        else if (net.optifine.shaders.llIIlllIIlllIIllIllI.bM == net.optifine.shaders.llIIlllIIlllIIllIllI.bh) {
            llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.lIIllIIIllllIlllIllI ? net.optifine.shaders.llIIlllIIlllIIllIllI.bj : net.optifine.shaders.llIIlllIIlllIIllIllI.bi);
        }
    }
    
    public static void llllIllllIllllIlIlII() {
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.IIIIlllIIIIIIlIIIlll) {
            llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.bk);
        }
        else if (net.optifine.shaders.llIIlllIIlllIIllIllI.bM == net.optifine.shaders.llIIlllIIlllIIllIllI.bi || net.optifine.shaders.llIIlllIIlllIIllIllI.bM == net.optifine.shaders.llIIlllIIlllIIllIllI.bj) {
            llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.bh);
        }
    }
    
    public static void IIlIlIllllIlllIIIIll() {
        net.optifine.shaders.llIIlllIIlllIIllIllI.ei.llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.bM);
    }
    
    public static void lIIllIIIllllIlllIllI() {
        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.ei.llllIIIIlIIIlIlllIll());
    }
    
    public static void IllIlIllIllIlllIIlll() {
        IIlIlIllllIlllIIIIll();
        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.bh);
    }
    
    public static void IIllIIIlIIlIlIlIIIII() {
        lIIllIIIllllIlllIllI();
    }
    
    public static void llIllIIlllllllllllll() {
        net.optifine.shaders.llIIlllIIlllIIllIllI.IllIlIllIllIlllIIlll = true;
        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.v, net.optifine.shaders.llIIlllIIlllIIllIllI.df);
        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.w, net.optifine.shaders.llIIlllIIlllIIllIllI.dg);
    }
    
    public static void lllllIIllIlIllIllllI() {
        net.optifine.shaders.llIIlllIIlllIIllIllI.IllIlIllIllIlllIIlll = false;
        llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.v, 0);
    }
    
    public static void llIllIIIIIllIlIIIIlI(final float dg) {
        net.optifine.shaders.llIIlllIIlllIIllIllI.dg = dg;
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.IllIlIllIllIlllIIlll) {
            llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.w, dg);
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(final int n, final int df) {
        GL11.glFogi(n, df);
        if (n == 2917) {
            net.optifine.shaders.llIIlllIIlllIIllIllI.df = df;
            if (net.optifine.shaders.llIIlllIIlllIIllIllI.IllIlIllIllIlllIIlll) {
                llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.v, net.optifine.shaders.llIIlllIIlllIIllIllI.df);
            }
        }
    }
    
    public static void IlIIIIIlIIllIIlIlIll() {
        net.optifine.shaders.llIIlllIIlllIIllIllI.lIIllIIIllllIlllIllI = true;
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.bM == net.optifine.shaders.llIIlllIIlllIIllIllI.bi) {
            llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.bj);
        }
    }
    
    public static void IllllIIlIlIllIIIllII() {
        net.optifine.shaders.llIIlllIIlllIIllIllI.lIIllIIIllllIlllIllI = false;
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.bM == net.optifine.shaders.llIIlllIIlllIIllIllI.bj) {
            llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.bi);
        }
    }
    
    public static int lllllIIIIIlIIlllIlIl() {
        return net.optifine.shaders.llIIlllIIlllIIllIllI.dS[net.optifine.shaders.llIIlllIIlllIIllIllI.dT * 2];
    }
    
    public static int IlIllllIIIlIllIlIIll() {
        return net.optifine.shaders.llIIlllIIlllIIllIllI.dS[net.optifine.shaders.llIIlllIIlllIIllIllI.dT * 2 + 1];
    }
    
    public static int lIIIlllIIIllIIIllIII(final int n) {
        net.optifine.shaders.llIIlllIIlllIIllIllI.dS[net.optifine.shaders.llIIlllIIlllIIllIllI.dT * 2] = ((net.optifine.shaders.llIIlllIIlllIIllIllI.dS[net.optifine.shaders.llIIlllIIlllIIllIllI.dT * 2] & 0xFFFF) | n << 16);
        return n;
    }
    
    public static int llIIlIIIlIIIllIlIIIl(final int n) {
        net.optifine.shaders.llIIlllIIlllIIllIllI.dS[net.optifine.shaders.llIIlllIIlllIIllIllI.dT * 2 + 1] = ((net.optifine.shaders.llIIlllIIlllIIllIllI.dS[net.optifine.shaders.llIIlllIIlllIIllIllI.dT * 2 + 1] & 0xFFFF0000) | (n & 0xFFFF));
        return n;
    }
    
    public static void IlIlIlIlIlllllllllIl(final int n, final int n2) {
        ++net.optifine.shaders.llIIlllIIlllIIllIllI.dT;
        net.optifine.shaders.llIIlllIIlllIIllIllI.dS[net.optifine.shaders.llIIlllIIlllIIllIllI.dT * 2] = ((n & 0xFFFF) | n2 << 16);
        net.optifine.shaders.llIIlllIIlllIIllIllI.dS[net.optifine.shaders.llIIlllIIlllIIllIllI.dT * 2 + 1] = 0;
    }
    
    public static void llIllIlIIIIllIlIIllI(final int n) {
        ++net.optifine.shaders.llIIlllIIlllIIllIllI.dT;
        net.optifine.shaders.llIIlllIIlllIIllIllI.dS[net.optifine.shaders.llIIlllIIlllIIllIllI.dT * 2] = (n & 0xFFFF);
        net.optifine.shaders.llIIlllIIlllIIllIllI.dS[net.optifine.shaders.llIIlllIIlllIIllIllI.dT * 2 + 1] = 0;
    }
    
    public static void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        ++net.optifine.shaders.llIIlllIIlllIIllIllI.dT;
        net.optifine.shaders.llIIlllIIlllIIllIllI.dS[net.optifine.shaders.llIIlllIIlllIIllIllI.dT * 2] = ((net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll) & 0xFFFF) | llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI() << 16);
        net.optifine.shaders.llIIlllIIlllIIllIllI.dS[net.optifine.shaders.llIIlllIIlllIIllIllI.dT * 2 + 1] = 0;
    }
    
    public static void lIIIIIlIlIIIlIIIIlIl() {
        net.optifine.shaders.llIIlllIIlllIIllIllI.dS[net.optifine.shaders.llIIlllIIlllIIllIllI.dT * 2] = 0;
        net.optifine.shaders.llIIlllIIlllIIllIllI.dS[net.optifine.shaders.llIIlllIIlllIIllIllI.dT * 2 + 1] = 0;
        --net.optifine.shaders.llIIlllIIlllIIllIllI.dT;
    }
    
    public static void IIllIIIlIIIIlIIlIIII() {
        net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl();
    }
    
    public static String IIIllIIllIIIIIIlIIlI() {
        return (net.optifine.shaders.llIIlllIIlllIIllIllI.el == null) ? null : ((net.optifine.shaders.llIIlllIIlllIIllIllI.el instanceof IIlllIlIIllIlIlIlIIl) ? null : net.optifine.shaders.llIIlllIIlllIIllIllI.el.llllIIIIlIIIlIlllIll());
    }
    
    public static InputStream lIIIlllIIIllIIIllIII(final String s) {
        return (net.optifine.shaders.llIIlllIIlllIIllIllI.el == null) ? null : net.optifine.shaders.llIIlllIIlllIIllIllI.el.llllIIIIlIIIlIlllIll(s);
    }
    
    public static void IlIlIlIlIlllllllllIl(final boolean b) {
        if (b) {
            net.optifine.shaders.llIIlllIIlllIIllIllI.cn += 2;
            if (net.optifine.shaders.llIIlllIIlllIIllIllI.cn > 4) {
                net.optifine.shaders.llIIlllIIlllIIllIllI.cn = 0;
            }
        }
        else {
            net.optifine.shaders.llIIlllIIlllIIllIllI.cn -= 2;
            if (net.optifine.shaders.llIIlllIIlllIIllIllI.cn < 0) {
                net.optifine.shaders.llIIlllIIlllIIllIllI.cn = 4;
            }
        }
        net.optifine.shaders.llIIlllIIlllIIllIllI.cn = net.optifine.shaders.llIIlllIIlllIIllIllI.cn / 2 * 2;
        net.optifine.shaders.llIIlllIIlllIIllIllI.cn = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.cn, 0, 4);
    }
    
    public static void IIIIIIIllllIlIIIIIII() {
        try {
            Class.forName("shadersmod.transform.SMCClassTransformer");
        }
        catch (Throwable t) {
            return;
        }
        throw new RuntimeException("Shaders Mod detected. Please remove it, OptiFine has built-in support for shaders.");
    }
    
    public static void IIlllIIIllIllIIlIlIl() {
        q();
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.cu) {
            net.optifine.shaders.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll();
            net.optifine.shaders.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll();
            net.optifine.shaders.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll();
        }
    }
    
    private static void q() {
        net.optifine.shaders.llIIlllIIlllIIllIllI.eo = new HashMap();
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.cu) {
            final ArrayList<String> list = new ArrayList<String>();
            final String s = "/shaders/lang/";
            final String s2 = "en_US";
            final String s3 = ".lang";
            list.add(String.valueOf(s) + s2 + s3);
            if (!net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.c().lllIIIIlIlIllIIlIIIl.equals(s2)) {
                list.add(String.valueOf(s) + net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.c().lllIIIIlIlIllIIlIIIl + s3);
            }
            try {
                final Iterator<Object> iterator = list.iterator();
                while (iterator.hasNext()) {
                    final InputStream llllIIIIlIIIlIlllIll = net.optifine.shaders.llIIlllIIlllIIllIllI.el.llllIIIIlIIIlIlllIll(iterator.next());
                    if (llllIIIIlIIIlIlllIll != null) {
                        final net.optifine.util.llIIlllIIlllIIllIllI llIIlllIIlllIIllIllI = new net.optifine.util.llIIlllIIlllIIllIllI();
                        net.optifine.IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, llIIlllIIlllIIllIllI);
                        llllIIIIlIIIlIlllIll.close();
                        for (final String s4 : ((Hashtable<String, V>)llIIlllIIlllIIllIllI).keySet()) {
                            net.optifine.shaders.llIIlllIIlllIIllIllI.eo.put(s4, llIIlllIIlllIIllIllI.getProperty(s4));
                        }
                    }
                }
            }
            catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    public static String IlIlIlIlIlllllllllIl(final String s, final String s2) {
        final String s3 = net.optifine.shaders.llIIlllIIlllIIllIllI.eo.get(s);
        return (s3 == null) ? s2 : s3;
    }
    
    public static boolean llIIlIIIlIIIllIlIIIl(String substring) {
        if (substring == null) {
            return false;
        }
        if (substring.length() <= 0) {
            return false;
        }
        final int lastIndex = substring.lastIndexOf("/");
        if (lastIndex >= 0) {
            substring = substring.substring(lastIndex + 1);
        }
        return llIllIlIIIIllIlIIllI(substring) != null;
    }
    
    public static net.optifine.shaders.IlIllIlIlIIIlIlIlIII llIllIlIIIIllIlIIllI(final String s) {
        return net.optifine.shaders.llIIlllIIlllIIllIllI.eh.IlIIIlIlIIIllIlIlIIl(s);
    }
    
    public static void llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        net.optifine.shaders.llIIlllIIlllIIllIllI.IIIlIIIlIlIIlllIIlll = llIllIIIIIllIlIIIIlI(lllIIIIlIlIllIIlIIIl);
    }
    
    public static void IlIlIlIlIlllllllllIl(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        net.optifine.shaders.llIIlllIIlllIIllIllI.IlIlIIIlIIlIlIIlllIl = llIllIIIIIllIlIIIIlI(lllIIIIlIlIllIIlIIIl);
    }
    
    public static boolean llIlllIlllllIIllIIII() {
        return net.optifine.shaders.llIIlllIIlllIIllIllI.IIIlIIIlIlIIlllIIlll;
    }
    
    public static boolean lllllIlIlIlllIlllIlI() {
        return net.optifine.shaders.llIIlllIIlllIIllIllI.IlIlIIIlIIlIlIIlllIl;
    }
    
    public static boolean IlIllllIIlIllIlIlIll() {
        return net.optifine.shaders.llIIlllIIlllIIllIllI.dX && net.optifine.shaders.llIIlllIIlllIIllIllI.dY;
    }
    
    private static boolean llIllIIIIIllIlIIIIlI(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        if (lllIIIIlIlIllIIlIIIl == null) {
            return false;
        }
        final net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll();
        if (llllIIIIlIIIlIlllIll == null) {
            return false;
        }
        if (!(llllIIIIlIIIlIlllIll instanceof net.minecraft.llIllIlIIIIllIlIIllI.IIlllIIIlIlllIIlllII)) {
            return false;
        }
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll lllIIIIlllllIlIIllIl = ((net.minecraft.llIllIlIIIIllIlIIllI.IIlllIIIlIlllIIlllII)llllIIIIlIIIlIlllIll).lllIIIIlllllIlIIllIl();
        return lllIIIIlllllIlIIllIl != null && lllIIIIlllllIlIIllIl.IIlllIIlIllIllIlIIll() == net.minecraft.IlllllllIIIlIIIlIlII.IlIIlIlIIIlIIlIlIlII.IlIIIlIlIIIllIlIlIIl;
    }
    
    public static boolean lllIlIIIIIlIlllllIlI() {
        return net.optifine.shaders.llIIlllIIlllIIllIllI.dZ;
    }
    
    public static boolean llIlIIIIllIlIIlIlIII() {
        return !net.optifine.shaders.llIIlllIIlllIIllIllI.dZ && !net.optifine.shaders.llIIlllIIlllIIllIllI.ea;
    }
    
    public static void llllIIIIlIIIlIlllIll(final boolean dz, final boolean ea) {
        net.optifine.shaders.llIIlllIIlllIIllIllI.dZ = dz;
        net.optifine.shaders.llIIlllIIlllIIllIllI.ea = ea;
    }
    
    public static void IlIlIlIlIlllllllllIl(final boolean dx, final boolean dy) {
        net.optifine.shaders.llIIlllIIlllIIllIllI.dX = dx;
        net.optifine.shaders.llIIlllIIlllIIllIllI.dY = dy;
    }
    
    public static boolean IIIIIlllIlIIIIIIIllI() {
        return net.optifine.shaders.llIIlllIIlllIIllIllI.dX;
    }
    
    public static boolean llllllIIIIIIIlllIIll() {
        return net.optifine.shaders.llIIlllIIlllIIllIllI.dY;
    }
    
    public static float IIlIlllIlIlllIlIllll() {
        return (net.optifine.shaders.llIIlllIIlllIIllIllI.aJ < 0.0f) ? -1.0f : (net.optifine.shaders.llIIlllIIlllIIllIllI.aH * net.optifine.shaders.llIIlllIIlllIIllIllI.aJ);
    }
    
    public static void llIllIIIIIllIlIIIIlI(final boolean dw) {
        net.optifine.shaders.llIIlllIIlllIIllIllI.dW = dw;
    }
    
    public static boolean lIllllIllIllIIllllll() {
        return net.optifine.shaders.llIIlllIIlllIIllIllI.dW;
    }
    
    public static void lllIIIIlIlIllIIlIIIl() {
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.IlIlIIIllIIllIlllllI) {
            llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.bt);
        }
    }
    
    public static void IllIlllIllIIIIllllII() {
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.IlIlIIIllIIllIlllllI) {
            llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.bs);
        }
    }
    
    public static IlllllllIIIlIIIlIlII lIllIlIIIllllllIIlII() {
        return net.optifine.shaders.llIIlllIIlllIIllIllI.ep;
    }
    
    public static net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl IlIllIIllIIlIIIIlIIl() {
        return new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(net.optifine.shaders.llIIlllIIlllIIllIllI.av, net.optifine.shaders.llIIlllIIlllIIllIllI.aw, net.optifine.shaders.llIIlllIIlllIIllIllI.ax);
    }
    
    public static boolean lIIlllIlllllIIlllIll() {
        return net.optifine.shaders.llIIlllIIlllIIllIllI.ev != null;
    }
    
    public static boolean lIllIIlIlIlllllIIIII() {
        return !net.optifine.shaders.llIIlllIIlllIIllIllI.ee || net.optifine.shaders.llIIlllIIlllIIllIllI.IlIlIIIllIllIIIIIllI.GL_NV_geometry_shader4;
    }
    
    static /* synthetic */ int[] lIIlIIIIIIIlIIlIlIIl() {
        final int[] ej = net.optifine.shaders.llIIlllIIlllIIllIllI.eJ;
        if (ej != null) {
            return ej;
        }
        final int[] ej2 = new int[net.optifine.shaders.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.values().length];
        try {
            ej2[net.optifine.shaders.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ej2[net.optifine.shaders.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            ej2[net.optifine.shaders.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            ej2[net.optifine.shaders.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            ej2[net.optifine.shaders.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII.ordinal()] = 8;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        try {
            ej2[net.optifine.shaders.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII.ordinal()] = 9;
        }
        catch (NoSuchFieldError noSuchFieldError6) {}
        try {
            ej2[net.optifine.shaders.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError7) {}
        try {
            ej2[net.optifine.shaders.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.ordinal()] = 10;
        }
        catch (NoSuchFieldError noSuchFieldError8) {}
        try {
            ej2[net.optifine.shaders.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.ordinal()] = 12;
        }
        catch (NoSuchFieldError noSuchFieldError9) {}
        try {
            ej2[net.optifine.shaders.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError10) {}
        try {
            ej2[net.optifine.shaders.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError11) {}
        try {
            ej2[net.optifine.shaders.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIllIlIlIIIlIlIlIII.ordinal()] = 16;
        }
        catch (NoSuchFieldError noSuchFieldError12) {}
        try {
            ej2[net.optifine.shaders.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IIlllIIlIllIllIlIIll.ordinal()] = 17;
        }
        catch (NoSuchFieldError noSuchFieldError13) {}
        try {
            ej2[net.optifine.shaders.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl.ordinal()] = 18;
        }
        catch (NoSuchFieldError noSuchFieldError14) {}
        try {
            ej2[net.optifine.shaders.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI.ordinal()] = 13;
        }
        catch (NoSuchFieldError noSuchFieldError15) {}
        try {
            ej2[net.optifine.shaders.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IIIIlllIIIIIIlIIIlll.ordinal()] = 14;
        }
        catch (NoSuchFieldError noSuchFieldError16) {}
        try {
            ej2[net.optifine.shaders.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll.ordinal()] = 15;
        }
        catch (NoSuchFieldError noSuchFieldError17) {}
        try {
            ej2[net.optifine.shaders.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI.ordinal()] = 11;
        }
        catch (NoSuchFieldError noSuchFieldError18) {}
        return net.optifine.shaders.llIIlllIIlllIIllIllI.eJ = ej2;
    }
    
    static /* synthetic */ int[] IlIIlllIIlIlllllIIlI() {
        final int[] ek = net.optifine.shaders.llIIlllIIlllIIllIllI.eK;
        if (ek != null) {
            return ek;
        }
        final int[] ek2 = new int[net.optifine.llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl.values().length];
        try {
            ek2[net.optifine.llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ek2[net.optifine.llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            ek2[net.optifine.llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            ek2[net.optifine.llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        return net.optifine.shaders.llIIlllIIlllIIllIllI.eK = ek2;
    }
    
    static /* synthetic */ int[] llllIlIllllIIlIIlIlI() {
        final int[] el = net.optifine.shaders.llIIlllIIlllIIllIllI.eL;
        if (el != null) {
            return el;
        }
        final int[] el2 = new int[net.minecraft.IlllllllIIIlIIIlIlII.IlIIlIlIIIlIIlIlIlII.values().length];
        try {
            el2[net.minecraft.IlllllllIIIlIIIlIlII.IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            el2[net.minecraft.IlllllllIIIlIIIlIlII.IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            el2[net.minecraft.IlllllllIIIlIIIlIlII.IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            el2[net.minecraft.IlllllllIIIlIIIlIlII.IlIIlIlIIIlIIlIlIlII.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        return net.optifine.shaders.llIIlllIIlllIIllIllI.eL = el2;
    }
    
    static /* synthetic */ int[] a() {
        final int[] em = net.optifine.shaders.llIIlllIIlllIIllIllI.eM;
        if (em != null) {
            return em;
        }
        final int[] em2 = new int[net.optifine.shaders.lllIIIIlllllIlIIllIl.values().length];
        try {
            em2[net.optifine.shaders.lllIIIIlllllIlIIllIl.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            em2[net.optifine.shaders.lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            em2[net.optifine.shaders.lllIIIIlllllIlIIllIl.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            em2[net.optifine.shaders.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            em2[net.optifine.shaders.lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        return net.optifine.shaders.llIIlllIIlllIIllIllI.eM = em2;
    }
}
