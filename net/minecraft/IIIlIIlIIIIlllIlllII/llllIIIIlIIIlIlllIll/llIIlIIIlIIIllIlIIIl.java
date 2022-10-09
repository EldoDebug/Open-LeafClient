package net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll;

import net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.*;
import org.apache.logging.log4j.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import com.google.common.collect.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.*;
import java.util.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;

public abstract class llIIlIIIlIIIllIlIIIl
{
    private static final Logger IIlllIIIllIllIIlIlIl;
    protected static final llIllIlIIIIllIlIIllI llllIIIIlIIIlIlllIll;
    protected static final llIllIlIIIIllIlIIllI IlIlIlIlIlllllllllIl;
    protected static final llIllIlIIIIllIlIIllI llIllIIIIIllIlIIIIlI;
    protected static final llIllIlIIIIllIlIIllI IlIIIlIlIIIllIlIlIIl;
    protected static final llIllIlIIIIllIlIIllI IlIlIIIllIllIIIIIllI;
    protected static final llIllIlIIIIllIlIIllI IllIIlllIIIIlllIIlIl;
    protected static final llIllIlIIIIllIlIIllI llllIIIlIlllIlIIIIIl;
    protected static final llIllIlIIIIllIlIIllI lIIIIlIIIIIlllIllIII;
    protected static final llIllIlIIIIllIlIIllI lIIIlllIIIllIIIllIII;
    protected static final llIllIlIIIIllIlIIllI llIIlIIIlIIIllIlIIIl;
    protected static final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI;
    protected static final llIllIlIIIIllIlIIllI lIlIlIIIllIIllIIIllI;
    protected static final llIllIlIIIIllIlIIllI IlIlIIIllIIllIlllllI;
    private static final llIIlIIIlIIIllIlIIIl[] llIlllIlllllIIllIIII;
    public static final Set IIIIlllIIIIIIlIIIlll;
    public static final Map llllIIllllIlIlIIIIll;
    public static final llIIlIIIlIIIllIlIIIl IlIllIlIlIIIlIlIlIII;
    public static final llIIlIIIlIIIllIlIIIl IIlllIIlIllIllIlIIll;
    public static final llIIlIIIlIIIllIlIIIl lllIIIIlllllIlIIllIl;
    public static final llIIlIIIlIIIllIlIIIl IlIlIIIIIIlllIlIllIl;
    public static final llIIlIIIlIIIllIlIIIl IIllIIllIIIlIlIIIIlI;
    public static final llIIlIIIlIIIllIlIIIl IIIlIIIlIlIIlllIIlll;
    public static final llIIlIIIlIIIllIlIIIl IlIlIIIlIIlIlIIlllIl;
    public static final llIIlIIIlIIIllIlIIIl IlllllllIIIlIIIlIlII;
    public static final llIIlIIIlIIIllIlIIIl IIlIIIIlllIlllllIlII;
    public static final llIIlIIIlIIIllIlIIIl IIIlIIlIIIIlllIlllII;
    public static final llIIlIIIlIIIllIlIIIl IlIlIllllllllIIIIlII;
    public static final llIIlIIIlIIIllIlIIIl IIlllIlIIllIlIlIlIIl;
    public static final llIIlIIIlIIIllIlIIIl llIIIlIlIllIIlIlIlII;
    public static final llIIlIIIlIIIllIlIIIl lllllIlIIIlIlIIlllII;
    public static final llIIlIIIlIIIllIlIIIl lIllllllIIllIlIlIlII;
    public static final llIIlIIIlIIIllIlIIIl llIIlllIIlllIIllIllI;
    public static final llIIlIIIlIIIllIlIIIl IIlllIIIlIlllIIlllII;
    public static final llIIlIIIlIIIllIlIIIl IIlIIIIIllIlIIIlIIll;
    public static final llIIlIIIlIIIllIlIIIl llllllIllIllIlIllllI;
    public static final llIIlIIIlIIIllIlIIIl IIIllllllIllIIIlllIl;
    public static final llIIlIIIlIIIllIlIIIl IlIIIlIIIllllIlIlIlI;
    public static final llIIlIIIlIIIllIlIIIl IIIIIllIIIIlIIIIllIl;
    public static final llIIlIIIlIIIllIlIIIl IIIIIIIIIlllIllIlIlI;
    public static final llIIlIIIlIIIllIlIIIl IIllllIIIlIIIIIIllIl;
    public static final llIIlIIIlIIIllIlIIIl IlllIIIIlIIIlIlIlIIl;
    public static final llIIlIIIlIIIllIlIIIl lllIllIIIllllllIllll;
    public static final llIIlIIIlIIIllIlIIIl llIllIlIlIIIIIIIllII;
    public static final llIIlIIIlIIIllIlIIIl IIlIlIlIIlIllIIIIIIl;
    public static final llIIlIIIlIIIllIlIIIl IllIllIIIIlIIlIlllII;
    public static final llIIlIIIlIIIllIlIIIl IlIllllIIlIIlIlIlIll;
    public static final llIIlIIIlIIIllIlIIIl IllIllIlllIllllIIllI;
    public static final llIIlIIIlIIIllIlIIIl llIlIIIIIlIIlIlIIlll;
    public static final llIIlIIIlIIIllIlIIIl IlIIlIlIIIlIIlIlIlII;
    public static final llIIlIIIlIIIllIlIIIl IllIlIIllIllIIlIllII;
    public static final llIIlIIIlIIIllIlIIIl lIIlIIIlIllIlIllIIIl;
    public static final llIIlIIIlIIIllIlIIIl IIlIIIlllIllIllIlIII;
    public static final llIIlIIIlIIIllIlIIIl lIlIlIlllIIlIlIlllIl;
    public static final llIIlIIIlIIIllIlIIIl llIIIIIIlIllIIlIIIll;
    public static final llIIlIIIlIIIllIlIIIl lIIIIlIlIllllIIlIllI;
    public static final llIIlIIIlIIIllIlIIIl llIIIlIlllIllIIlIllI;
    public static final llIIlIIIlIIIllIlIIIl IlIIllIIllIIllIIlIIl;
    protected static final IIllIIllIIIlIlIIIIlI lllllIIIIIlIlIIIIIIl;
    protected static final IIllIIllIIIlIlIIIIlI IllIIlllllIIllIIllIl;
    protected static final net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI lIllIIIIIlllIIlIIllI;
    public String lIlIIlllIIlIIlIlllIl;
    public int llIIIllIlIllIllIIIIl;
    public int IIIllIIIlIlIIllIIIlI;
    public net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl IIlllIIlllIIIlIlllII;
    public net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl IlIIlllllIIllIIlllll;
    public int lllllIIlIlIIIlIlIIIl;
    public float IIlllllIllIllIlIlIII;
    public float llllIllllIllllIlIlII;
    public float IIlIlIllllIlllIIIIll;
    public float lIIllIIIllllIlllIllI;
    public int IllIlIllIllIlllIIlll;
    public lIIIIlIIIIIlllIllIII IIllIIIlIIlIlIlIIIII;
    protected List llIllIIlllllllllllll;
    protected List lllllIIllIlIllIllllI;
    protected List IlIIIIIlIIllIIlIlIll;
    protected List IllllIIlIlIllIIIllII;
    protected boolean lllllIIIIIlIIlllIlIl;
    protected boolean IlIllllIIIlIllIlIIll;
    public final int lIIIIIlIlIIIlIIIIlIl;
    protected IIIIIIIIIlllIllIlIlI IIllIIIlIIIIlIIlIIII;
    protected llIllIIIIIllIlIIIIlI IIIllIIllIIIIIIlIIlI;
    protected llllllIllIllIlIllllI IIIIIIIllllIlIIIIIII;
    private static volatile /* synthetic */ int[] lllllIlIlIlllIlllIlI;
    
    static {
        IIlllIIIllIllIIlIlIl = LogManager.getLogger();
        llllIIIIlIIIlIlllIll = new llIllIlIIIIllIlIIllI(0.1f, 0.2f);
        IlIlIlIlIlllllllllIl = new llIllIlIIIIllIlIIllI(-0.5f, 0.0f);
        llIllIIIIIllIlIIIIlI = new llIllIlIIIIllIlIIllI(-1.0f, 0.1f);
        IlIIIlIlIIIllIlIlIIl = new llIllIlIIIIllIlIIllI(-1.8f, 0.1f);
        IlIlIIIllIllIIIIIllI = new llIllIlIIIIllIlIIllI(0.125f, 0.05f);
        IllIIlllIIIIlllIIlIl = new llIllIlIIIIllIlIIllI(0.2f, 0.2f);
        llllIIIlIlllIlIIIIIl = new llIllIlIIIIllIlIIllI(0.45f, 0.3f);
        lIIIIlIIIIIlllIllIII = new llIllIlIIIIllIlIIllI(1.5f, 0.025f);
        lIIIlllIIIllIIIllIII = new llIllIlIIIIllIlIIllI(1.0f, 0.5f);
        llIIlIIIlIIIllIlIIIl = new llIllIlIIIIllIlIIllI(0.0f, 0.025f);
        llIllIlIIIIllIlIIllI = new llIllIlIIIIllIlIIllI(0.1f, 0.8f);
        lIlIlIIIllIIllIIIllI = new llIllIlIIIIllIlIIllI(0.2f, 0.3f);
        IlIlIIIllIIllIlllllI = new llIllIlIIIIllIlIIllI(-0.2f, 0.1f);
        llIlllIlllllIIllIIII = new llIIlIIIlIIIllIlIIIl[256];
        IIIIlllIIIIIIlIIIlll = Sets.newHashSet();
        llllIIllllIlIlIIIIll = Maps.newHashMap();
        IlIllIlIlIIIlIlIlIII = new IlIlIllllllllIIIIlII(0).IlIlIlIlIlllllllllIl(112).llllIIIIlIIIlIlllIll("Ocean").llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI);
        IIlllIIlIllIllIlIIll = new IIlllIlIIllIlIlIlIIl(1).IlIlIlIlIlllllllllIl(9286496).llllIIIIlIIIlIlllIll("Plains");
        lllIIIIlllllIlIIllIl = new llllIIllllIlIlIIIIll(2).IlIlIlIlIlllllllllIl(16421912).llllIIIIlIIIlIlllIll("Desert").IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(2.0f, 0.0f).llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI);
        IlIlIIIIIIlllIlIllIl = new IIIlIIIlIlIIlllIIlll(3, false).IlIlIlIlIlllllllllIl(6316128).llllIIIIlIIIlIlllIll("Extreme Hills").llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII).llllIIIIlIIIlIlllIll(0.2f, 0.3f);
        IIllIIllIIIlIlIIIIlI = new IIlllIIlIllIllIlIIll(4, 0).IlIlIlIlIlllllllllIl(353825).llllIIIIlIIIlIlllIll("Forest");
        IIIlIIIlIlIIlllIIlll = new net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llllllIllIllIlIllllI(5, 0).IlIlIlIlIlllllllllIl(747097).llllIIIIlIIIlIlllIll("Taiga").llllIIIIlIIIlIlllIll(5159473).llllIIIIlIIIlIlllIll(0.25f, 0.8f).llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl);
        IlIlIIIlIIlIlIIlllIl = new IIlIIIIIllIlIIIlIIll(6).IlIlIlIlIlllllllllIl(522674).llllIIIIlIIIlIlllIll("Swampland").llllIIIIlIIIlIlllIll(9154376).llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IlIlIIIllIIllIlllllI).llllIIIIlIIIlIlllIll(0.8f, 0.9f);
        IlllllllIIIlIIIlIlII = new llIIIlIlIllIIlIlIlII(7).IlIlIlIlIlllllllllIl(255).llllIIIIlIIIlIlllIll("River").llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl);
        IIlIIIIlllIlllllIlII = new net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI(8).IlIlIlIlIlllllllllIl(16711680).llllIIIIlIIIlIlllIll("Hell").IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(2.0f, 0.0f);
        IIIlIIlIIIIlllIlllII = new IlIllIlIlIIIlIlIlIII(9).IlIlIlIlIlllllllllIl(8421631).llllIIIIlIIIlIlllIll("The End").IlIlIlIlIlllllllllIl();
        IlIlIllllllllIIIIlII = new IlIlIllllllllIIIIlII(10).IlIlIlIlIlllllllllIl(9474208).llllIIIIlIIIlIlllIll("FrozenOcean").llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI).llllIIIIlIIIlIlllIll(0.0f, 0.5f);
        IIlllIlIIllIlIlIlIIl = new llIIIlIlIllIIlIlIlII(11).IlIlIlIlIlllllllllIl(10526975).llllIIIIlIIIlIlllIll("FrozenRiver").llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl).llllIIIIlIIIlIlllIll(0.0f, 0.5f);
        llIIIlIlIllIIlIlIlII = new llIIlllIIlllIIllIllI(12, false).IlIlIlIlIlllllllllIl(16777215).llllIIIIlIIIlIlllIll("Ice Plains").llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll(0.0f, 0.5f).llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI);
        lllllIlIIIlIlIIlllII = new llIIlllIIlllIIllIllI(13, false).IlIlIlIlIlllllllllIl(10526880).llllIIIIlIIIlIlllIll("Ice Mountains").llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl).llllIIIIlIIIlIlllIll(0.0f, 0.5f);
        lIllllllIIllIlIlIlII = new IIlIIIIlllIlllllIlII(14).IlIlIlIlIlllllllllIl(16711935).llllIIIIlIIIlIlllIll("MushroomIsland").llllIIIIlIIIlIlllIll(0.9f, 1.0f).llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.lIlIlIIIllIIllIIIllI);
        llIIlllIIlllIIllIllI = new IIlIIIIlllIlllllIlII(15).IlIlIlIlIlllllllllIl(10486015).llllIIIIlIIIlIlllIll("MushroomIslandShore").llllIIIIlIIIlIlllIll(0.9f, 1.0f).llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl);
        IIlllIIIlIlllIIlllII = new IIIIlllIIIIIIlIIIlll(16).IlIlIlIlIlllllllllIl(16440917).llllIIIIlIIIlIlllIll("Beach").llllIIIIlIIIlIlllIll(0.8f, 0.4f).llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl);
        IIlIIIIIllIlIIIlIIll = new llllIIllllIlIlIIIIll(17).IlIlIlIlIlllllllllIl(13786898).llllIIIIlIIIlIlllIll("DesertHills").IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(2.0f, 0.0f).llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl);
        llllllIllIllIlIllllI = new IIlllIIlIllIllIlIIll(18, 0).IlIlIlIlIlllllllllIl(2250012).llllIIIIlIIIlIlllIll("ForestHills").llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl);
        IIIllllllIllIIIlllIl = new net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llllllIllIllIlIllllI(19, 0).IlIlIlIlIlllllllllIl(1456435).llllIIIIlIIIlIlllIll("TaigaHills").llllIIIIlIIIlIlllIll(5159473).llllIIIIlIIIlIlllIll(0.25f, 0.8f).llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl);
        IlIIIlIIIllllIlIlIlI = new IIIlIIIlIlIIlllIIlll(20, true).IlIlIlIlIlllllllllIl(7501978).llllIIIIlIIIlIlllIll("Extreme Hills Edge").llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll()).llllIIIIlIIIlIlllIll(0.2f, 0.3f);
        IIIIIllIIIIlIIIIllIl = new IlIlIIIlIIlIlIIlllIl(21, false).IlIlIlIlIlllllllllIl(5470985).llllIIIIlIIIlIlllIll("Jungle").llllIIIIlIIIlIlllIll(5470985).llllIIIIlIIIlIlllIll(0.95f, 0.9f);
        IIIIIIIIIlllIllIlIlI = new IlIlIIIlIIlIlIIlllIl(22, false).IlIlIlIlIlllllllllIl(2900485).llllIIIIlIIIlIlllIll("JungleHills").llllIIIIlIIIlIlllIll(5470985).llllIIIIlIIIlIlllIll(0.95f, 0.9f).llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl);
        IIllllIIIlIIIIIIllIl = new IlIlIIIlIIlIlIIlllIl(23, true).IlIlIlIlIlllllllllIl(6458135).llllIIIIlIIIlIlllIll("JungleEdge").llllIIIIlIIIlIlllIll(5470985).llllIIIIlIIIlIlllIll(0.95f, 0.8f);
        IlllIIIIlIIIlIlIlIIl = new IlIlIllllllllIIIIlII(24).IlIlIlIlIlllllllllIl(48).llllIIIIlIIIlIlllIll("Deep Ocean").llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl);
        lllIllIIIllllllIllll = new IIlllIIIlIlllIIlllII(25).IlIlIlIlIlllllllllIl(10658436).llllIIIIlIIIlIlllIll("Stone Beach").llllIIIIlIIIlIlllIll(0.2f, 0.3f).llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.llIllIlIIIIllIlIIllI);
        llIllIlIlIIIIIIIllII = new IIIIlllIIIIIIlIIIlll(26).IlIlIlIlIlllllllllIl(16445632).llllIIIIlIIIlIlllIll("Cold Beach").llllIIIIlIIIlIlllIll(0.05f, 0.3f).llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl).llIllIIIIIllIlIIIIlI();
        IIlIlIlIIlIllIIIIIIl = new IIlllIIlIllIllIlIIll(27, 2).llllIIIIlIIIlIlllIll("Birch Forest").IlIlIlIlIlllllllllIl(3175492);
        IllIllIIIIlIIlIlllII = new IIlllIIlIllIllIlIIll(28, 2).llllIIIIlIIIlIlllIll("Birch Forest Hills").IlIlIlIlIlllllllllIl(2055986).llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl);
        IlIllllIIlIIlIlIlIll = new IIlllIIlIllIllIlIIll(29, 3).IlIlIlIlIlllllllllIl(4215066).llllIIIIlIIIlIlllIll("Roofed Forest");
        IllIllIlllIllllIIllI = new net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llllllIllIllIlIllllI(30, 0).IlIlIlIlIlllllllllIl(3233098).llllIIIIlIIIlIlllIll("Cold Taiga").llllIIIIlIIIlIlllIll(5159473).llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll(-0.5f, 0.4f).llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl).llIllIIIIIllIlIIIIlI(16777215);
        llIlIIIIIlIIlIlIIlll = new net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llllllIllIllIlIllllI(31, 0).IlIlIlIlIlllllllllIl(2375478).llllIIIIlIIIlIlllIll("Cold Taiga Hills").llllIIIIlIIIlIlllIll(5159473).llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll(-0.5f, 0.4f).llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl).llIllIIIIIllIlIIIIlI(16777215);
        IlIIlIlIIIlIIlIlIlII = new net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llllllIllIllIlIllllI(32, 1).IlIlIlIlIlllllllllIl(5858897).llllIIIIlIIIlIlllIll("Mega Taiga").llllIIIIlIIIlIlllIll(5159473).llllIIIIlIIIlIlllIll(0.3f, 0.8f).llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl);
        IllIlIIllIllIIlIllII = new net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llllllIllIllIlIllllI(33, 1).IlIlIlIlIlllllllllIl(4542270).llllIIIIlIIIlIlllIll("Mega Taiga Hills").llllIIIIlIIIlIlllIll(5159473).llllIIIIlIIIlIlllIll(0.3f, 0.8f).llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl);
        lIIlIIIlIllIlIllIIIl = new IIIlIIIlIlIIlllIIlll(34, true).IlIlIlIlIlllllllllIl(5271632).llllIIIIlIIIlIlllIll("Extreme Hills+").llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII).llllIIIIlIIIlIlllIll(0.2f, 0.3f);
        IIlIIIlllIllIllIlIII = new lllllIlIIIlIlIIlllII(35).IlIlIlIlIlllllllllIl(12431967).llllIIIIlIIIlIlllIll("Savanna").llllIIIIlIIIlIlllIll(1.2f, 0.0f).IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI);
        lIlIlIlllIIlIlIlllIl = new lllllIlIIIlIlIIlllII(36).IlIlIlIlIlllllllllIl(10984804).llllIIIIlIIIlIlllIll("Savanna Plateau").llllIIIIlIIIlIlllIll(1.0f, 0.0f).IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII);
        llIIIIIIlIllIIlIIIll = new IlllllllIIIlIIIlIlII(37, false, false).IlIlIlIlIlllllllllIl(14238997).llllIIIIlIIIlIlllIll("Mesa");
        lIIIIlIlIllllIIlIllI = new IlllllllIIIlIIIlIlII(38, false, true).IlIlIlIlIlllllllllIl(11573093).llllIIIIlIIIlIlllIll("Mesa Plateau F").llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII);
        llIIIlIlllIllIIlIllI = new IlllllllIIIlIIIlIlII(39, false, false).IlIlIlIlIlllllllllIl(13274213).llllIIIIlIIIlIlllIll("Mesa Plateau").llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII);
        IlIIllIIllIIllIIlIIl = net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IlIllIlIlIIIlIlIlIII;
        net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IIlllIIlIllIllIlIIll.llIllIlIIIIllIlIIllI();
        net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.lllIIIIlllllIlIIllIl.llIllIlIIIIllIlIIllI();
        net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IIllIIllIIIlIlIIIIlI.llIllIlIIIIllIlIIllI();
        net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IIIlIIIlIlIIlllIIlll.llIllIlIIIIllIlIIllI();
        net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IlIlIIIlIIlIlIIlllIl.llIllIlIIIIllIlIIllI();
        net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.llIIIlIlIllIIlIlIlII.llIllIlIIIIllIlIIllI();
        net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IIIIIllIIIIlIIIIllIl.llIllIlIIIIllIlIIllI();
        net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IIllllIIIlIIIIIIllIl.llIllIlIIIIllIlIIllI();
        net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IllIllIlllIllllIIllI.llIllIlIIIIllIlIIllI();
        net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IIlIIIlllIllIllIlIII.llIllIlIIIIllIlIIllI();
        net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.lIlIlIlllIIlIlIlllIl.llIllIlIIIIllIlIIllI();
        net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.llIIIIIIlIllIIlIIIll.llIllIlIIIIllIlIIllI();
        net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.lIIIIlIlIllllIIlIllI.llIllIlIIIIllIlIIllI();
        net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.llIIIlIlllIllIIlIllI.llIllIlIIIIllIlIIllI();
        net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IIlIlIlIIlIllIIIIIIl.llIllIlIIIIllIlIIllI();
        net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IllIllIIIIlIIlIlllII.llIllIlIIIIllIlIIllI();
        net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IlIllllIIlIIlIlIlIll.llIllIlIIIIllIlIIllI();
        net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IlIIlIlIIIlIIlIlIlII.llIllIlIIIIllIlIIllI();
        net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IlIlIIIIIIlllIlIllIl.llIllIlIIIIllIlIIllI();
        net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.lIIlIIIlIllIlIllIIIl.llIllIlIIIIllIlIIllI();
        net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IlIIlIlIIIlIIlIlIlII.IlIIIlIlIIIllIlIlIIl(net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IllIlIIllIllIIlIllII.lIIIIIlIlIIIlIIIIlIl + 128).llllIIIIlIIIlIlllIll("Redwood Taiga Hills M");
        llIIlIIIlIIIllIlIIIl[] llIlllIlllllIIllIIII2;
        for (int length = (llIlllIlllllIIllIIII2 = net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.llIlllIlllllIIllIIII).length, i = 0; i < length; ++i) {
            final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl2 = llIlllIlllllIIllIIII2[i];
            if (llIIlIIIlIIIllIlIIIl2 != null) {
                if (net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.llllIIllllIlIlIIIIll.containsKey(llIIlIIIlIIIllIlIIIl2.lIlIIlllIIlIIlIlllIl)) {
                    throw new Error("Biome \"" + llIIlIIIlIIIllIlIIIl2.lIlIIlllIIlIIlIlllIl + "\" is defined as both ID " + ((llIIlIIIlIIIllIlIIIl)net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.llllIIllllIlIlIIIIll.get(llIIlIIIlIIIllIlIIIl2.lIlIIlllIIlIIlIlllIl)).lIIIIIlIlIIIlIIIIlIl + " and " + llIIlIIIlIIIllIlIIIl2.lIIIIIlIlIIIlIIIIlIl);
                }
                net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.llllIIllllIlIlIIIIll.put(llIIlIIIlIIIllIlIIIl2.lIlIIlllIIlIIlIlllIl, llIIlIIIlIIIllIlIIIl2);
                if (llIIlIIIlIIIllIlIIIl2.lIIIIIlIlIIIlIIIIlIl < 128) {
                    net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IIIIlllIIIIIIlIIIlll.add(llIIlIIIlIIIllIlIIIl2);
                }
            }
        }
        net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IIIIlllIIIIIIlIIIlll.remove(net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IIlIIIIlllIlllllIlII);
        net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IIIIlllIIIIIIlIIIlll.remove(net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IIIlIIlIIIIlllIlllII);
        net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IIIIlllIIIIIIlIIIlll.remove(net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IlIlIllllllllIIIIlII);
        net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IIIIlllIIIIIIlIIIlll.remove(net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IlIIIlIIIllllIlIlIlI);
        lllllIIIIIlIlIIIIIIl = new IIllIIllIIIlIlIIIIlI(new Random(1234L), 1);
        IllIIlllllIIllIIllIl = new IIllIIllIIIlIlIIIIlI(new Random(2345L), 1);
        lIllIIIIIlllIIlIIllI = new net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI();
    }
    
    protected llIIlIIIlIIIllIlIIIl(final int liiiiIlIlIIIlIIIIlIl) {
        this.IIlllIIlllIIIlIlllII = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.lllIllIIIllllllIllll();
        this.IlIIlllllIIllIIlllll = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl.lllIllIIIllllllIllll();
        this.lllllIIlIlIIIlIlIIIl = 5169201;
        this.IIlllllIllIllIlIlIII = net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll;
        this.llllIllllIllllIlIlII = net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl;
        this.IIlIlIllllIlllIIIIll = 0.5f;
        this.lIIllIIIllllIlllIllI = 0.5f;
        this.IllIlIllIllIlllIIlll = 16777215;
        this.llIllIIlllllllllllll = Lists.newArrayList();
        this.lllllIIllIlIllIllllI = Lists.newArrayList();
        this.IlIIIIIlIIllIIlIlIll = Lists.newArrayList();
        this.IllllIIlIlIllIIIllII = Lists.newArrayList();
        this.IlIllllIIIlIllIlIIll = true;
        this.IIllIIIlIIIIlIIlIIII = new IIIIIIIIIlllIllIlIlI(false);
        this.IIIllIIllIIIIIIlIIlI = new llIllIIIIIllIlIIIIlI(false);
        this.IIIIIIIllllIlIIIIIII = new llllllIllIllIlIllllI();
        this.lIIIIIlIlIIIlIIIIlIl = liiiiIlIlIIIlIIIIlIl;
        net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.llIlllIlllllIIllIIII[liiiiIlIlIIIlIIIIlIl] = this;
        this.IIllIIIlIIlIlIlIIIII = this.llllIIIIlIIIlIlllIll();
        this.lllllIIllIlIllIllllI.add(new lIlIlIIIllIIllIIIllI(net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IIIlIIIlIlIIlllIIlll.class, 12, 4, 4));
        this.lllllIIllIlIllIllllI.add(new lIlIlIIIllIIllIIIllI(net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.class, 10, 3, 3));
        this.lllllIIllIlIllIllllI.add(new lIlIlIIIllIIllIIIllI(net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.llIllIlIIIIllIlIIllI.class, 10, 4, 4));
        this.lllllIIllIlIllIllllI.add(new lIlIlIIIllIIllIIIllI(IlIIIlIlIIIllIlIlIIl.class, 10, 4, 4));
        this.lllllIIllIlIllIllllI.add(new lIlIlIIIllIIllIIIllI(IlIlIIIllIllIIIIIllI.class, 8, 4, 4));
        this.llIllIIlllllllllllll.add(new lIlIlIIIllIIllIIIllI(llIllIlIlIIIIIIIllII.class, 100, 4, 4));
        this.llIllIIlllllllllllll.add(new lIlIlIIIllIIllIIIllI(llIlIIIIIlIIlIlIIlll.class, 100, 4, 4));
        this.llIllIIlllllllllllll.add(new lIlIlIIIllIIllIIIllI(net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.llllllIllIllIlIllllI.class, 100, 4, 4));
        this.llIllIIlllllllllllll.add(new lIlIlIIIllIIllIIIllI(net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl.class, 100, 4, 4));
        this.llIllIIlllllllllllll.add(new lIlIlIIIllIIllIIIllI(IIIllllllIllIIIlllIl.class, 100, 4, 4));
        this.llIllIIlllllllllllll.add(new lIlIlIIIllIIllIIIllI(net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI.class, 10, 1, 4));
        this.llIllIIlllllllllllll.add(new lIlIlIIIllIIllIIIllI(IllIllIlllIllllIIllI.class, 5, 1, 1));
        this.IlIIIIIlIIllIIlIlIll.add(new lIlIlIIIllIIllIIIllI(net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IlllllllIIIlIIIlIlII.class, 10, 4, 4));
        this.IllllIIlIlIllIIIllII.add(new lIlIlIIIllIIllIIIllI(net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI.class, 10, 8, 8));
    }
    
    protected lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll() {
        return new lIIIIlIIIIIlllIllIII();
    }
    
    protected llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(final float iIlIlIllllIlllIIIIll, final float liIllIIIllllIlllIllI) {
        if (iIlIlIllllIlllIIIIll > 0.1f && iIlIlIllllIlllIIIIll < 0.2f) {
            throw new IllegalArgumentException("Please avoid temperatures in the range 0.1 - 0.2 because of snow");
        }
        this.IIlIlIllllIlllIIIIll = iIlIlIllllIlllIIIIll;
        this.lIIllIIIllllIlllIllI = liIllIIIllllIlllIllI;
        return this;
    }
    
    protected final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI) {
        this.IIlllllIllIllIlIlIII = llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll;
        this.llllIllllIllllIlIlII = llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl;
        return this;
    }
    
    protected llIIlIIIlIIIllIlIIIl IlIlIlIlIlllllllllIl() {
        this.IlIllllIIIlIllIlIIll = false;
        return this;
    }
    
    public net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final Random random) {
        return (random.nextInt(10) == 0) ? this.IIIllIIllIIIIIIlIIlI : this.IIllIIIlIIIIlIIlIIII;
    }
    
    public lllIllIIIllllllIllll IlIlIlIlIlllllllllIl(final Random random) {
        return new IIIIIllIIIIlIIIIllIl(dd.IlIlIlIlIlllllllllIl);
    }
    
    public llIllIIlllllllllllll llllIIIIlIIIlIlllIll(final Random random, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return (random.nextInt(3) > 0) ? net.minecraft.llllIIIIlIIIlIlllIll.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll : net.minecraft.llllIIIIlIIIlIlllIll.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl;
    }
    
    protected llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI() {
        this.lllllIIIIIlIIlllIlIl = true;
        return this;
    }
    
    protected llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(final String lIlIIlllIIlIIlIlllIl) {
        this.lIlIIlllIIlIIlIlllIl = lIlIIlllIIlIIlIlllIl;
        return this;
    }
    
    protected llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(final int lllllIIlIlIIIlIlIIIl) {
        this.lllllIIlIlIIIlIlIIIl = lllllIIlIlIIIlIlIIIl;
        return this;
    }
    
    protected llIIlIIIlIIIllIlIIIl IlIlIlIlIlllllllllIl(final int n) {
        this.llllIIIIlIIIlIlllIll(n, false);
        return this;
    }
    
    protected llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI(final int iiIllIIIlIlIIllIIIlI) {
        this.IIIllIIIlIlIIllIIIlI = iiIllIIIlIlIIllIIIlI;
        return this;
    }
    
    protected llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(final int n, final boolean b) {
        this.llIIIllIlIllIllIIIIl = n;
        if (b) {
            this.IIIllIIIlIlIIllIIIlI = (n & 0xFEFEFE) >> 1;
        }
        else {
            this.IIIllIIIlIlIIllIIIlI = n;
        }
        return this;
    }
    
    public int llllIIIIlIIIlIlllIll(float llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll /= 3.0f;
        llllIIIIlIIIlIlllIll = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, -1.0f, 1.0f);
        return net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(0.62222224f - llllIIIIlIIIlIlllIll * 0.05f, 0.5f + llllIIIIlIIIlIlllIll * 0.1f, 1.0f);
    }
    
    public List llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.IIlllIlIIllIlIlIlIIl illlIlIIllIlIlIlIIl) {
        switch (llllIIllllIlIlIIIIll()[illlIlIIllIlIlIlIIl.ordinal()]) {
            case 1: {
                return this.llIllIIlllllllllllll;
            }
            case 2: {
                return this.lllllIIllIlIllIllllI;
            }
            case 4: {
                return this.IlIIIIIlIIllIIlIlIll;
            }
            case 3: {
                return this.IllllIIlIlIllIIIllII;
            }
            default: {
                return Collections.emptyList();
            }
        }
    }
    
    public boolean IlIIIlIlIIIllIlIlIIl() {
        return this.llIIlIIIlIIIllIlIIIl();
    }
    
    public boolean IlIlIIIllIllIIIIIllI() {
        return !this.llIIlIIIlIIIllIlIIIl() && this.IlIllllIIIlIllIlIIll;
    }
    
    public boolean IllIIlllIIIIlllIIlIl() {
        return this.lIIllIIIllllIlllIllI > 0.85f;
    }
    
    public float llllIIIlIlllIlIIIIIl() {
        return 0.1f;
    }
    
    public final int lIIIIlIIIIIlllIllIII() {
        return (int)(this.lIIllIIIllllIlllIllI * 65536.0f);
    }
    
    public final float lIIIlllIIIllIIIllIII() {
        return this.lIIllIIIllllIlllIllI;
    }
    
    public final float llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() > 64) {
            return this.IIlIlIllllIlllIIIIll - ((float)(net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.lllllIIIIIlIlIIIIIIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() * 1.0 / 8.0, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() * 1.0 / 8.0) * 4.0) + ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() - 64.0f) * 0.05f / 30.0f;
        }
        return this.IIlIlIllllIlllIIIIll;
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        this.IIllIIIlIIlIlIlIIIII.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, random, this, ilIlIlIlIlllllllllIl);
    }
    
    public int IlIlIlIlIlllllllllIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return net.minecraft.IIIlIIlIIIIlllIlllII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl), 0.0f, 1.0f), net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.lIIIlllIIIllIIIllIII(), 0.0f, 1.0f));
    }
    
    public int llIllIIIIIllIlIIIIlI(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl), 0.0f, 1.0f), net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.lIIIlllIIIllIIIllIII(), 0.0f, 1.0f));
    }
    
    public boolean llIIlIIIlIIIllIlIIIl() {
        return this.lllllIIIIIlIIlllIlIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final int n, final int n2, final double n3) {
        this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, random, illIIlllIIIIlllIIlIl, n, n2, n3);
    }
    
    public final void IlIlIlIlIlllllllllIl(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final int n, final int n2, final double n3) {
        final int ilIlIIIlIIlIlIIlllIl = illlllllIIIlIIIlIlII.IlIlIIIlIIlIlIIlllIl();
        net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl = this.IIlllIIlllIIIlIlllII;
        net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl2 = this.IlIIlllllIIllIIlllll;
        int n4 = -1;
        final int n5 = (int)(n3 / 3.0 + 3.0 + random.nextDouble() * 0.25);
        final int n6 = n & 0xF;
        final int n7 = n2 & 0xF;
        final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = new llllIIIlIlllIlIIIIIl();
        for (int i = 255; i >= 0; --i) {
            if (i <= random.nextInt(5)) {
                illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(n7, i, n6, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII.lllIllIIIllllllIllll());
            }
            else {
                final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll = illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(n7, i, n6);
                if (llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
                    n4 = -1;
                }
                else if (llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl) {
                    if (n4 == -1) {
                        if (n5 <= 0) {
                            llIIlIIIlIIIllIlIIIl = null;
                            llIIlIIIlIIIllIlIIIl2 = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lllIllIIIllllllIllll();
                        }
                        else if (i >= ilIlIIIlIIlIlIIlllIl - 4 && i <= ilIlIIIlIIlIlIIlllIl + 1) {
                            llIIlIIIlIIIllIlIIIl = this.IIlllIIlllIIIlIlllII;
                            llIIlIIIlIIIllIlIIIl2 = this.IlIIlllllIIllIIlllll;
                        }
                        if (i < ilIlIIIlIIlIlIIlllIl && (llIIlIIIlIIIllIlIIIl == null || llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll)) {
                            if (this.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(n, i, n2)) < 0.15f) {
                                llIIlIIIlIIIllIlIIIl = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIlIIIIllIlIIlIlIII.lllIllIIIllllllIllll();
                            }
                            else {
                                llIIlIIIlIIIllIlIIIl = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.lllIllIIIllllllIllll();
                            }
                        }
                        n4 = n5;
                        if (i >= ilIlIIIlIIlIlIIlllIl - 1) {
                            illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(n7, i, n6, llIIlIIIlIIIllIlIIIl);
                        }
                        else if (i < ilIlIIIlIIlIlIIlllIl - 7 - n5) {
                            llIIlIIIlIIIllIlIIIl = null;
                            llIIlIIIlIIIllIlIIIl2 = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lllIllIIIllllllIllll();
                            illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(n7, i, n6, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIlllIIIIIIlIIIlll.lllIllIIIllllllIllll());
                        }
                        else {
                            illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(n7, i, n6, llIIlIIIlIIIllIlIIIl2);
                        }
                    }
                    else if (n4 > 0) {
                        --n4;
                        illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(n7, i, n6, llIIlIIIlIIIllIlIIIl2);
                        if (n4 == 0 && llIIlIIIlIIIllIlIIIl2.llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI) {
                            n4 = random.nextInt(4) + Math.max(0, i - 63);
                            llIIlIIIlIIIllIlIIIl2 = ((llIIlIIIlIIIllIlIIIl2.llllIIIIlIIIlIlllIll(bl.IIIIIIIIIlllIllIlIlI) == bm.IlIlIlIlIlllllllllIl) ? net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aQ.lllIllIIIllllllIllll() : net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.lllIllIIIllllllIllll());
                        }
                    }
                }
            }
        }
    }
    
    protected llIIlIIIlIIIllIlIIIl llIllIlIIIIllIlIIllI() {
        return this.IlIIIlIlIIIllIlIlIIl(this.lIIIIIlIlIIIlIIIIlIl + 128);
    }
    
    protected llIIlIIIlIIIllIlIIIl IlIIIlIlIIIllIlIlIIl(final int n) {
        return new IIIlIIlIIIIlllIlllII(n, this);
    }
    
    public Class lIlIlIIIllIIllIIIllI() {
        return this.getClass();
    }
    
    public boolean llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return llIIlIIIlIIIllIlIIIl == this || (llIIlIIIlIIIllIlIIIl != null && this.lIlIlIIIllIIllIIIllI() == llIIlIIIlIIIllIlIIIl.lIlIlIIIllIIllIIIllI());
    }
    
    public IlIlIIIllIIllIlllllI IlIlIIIllIIllIlllllI() {
        return (this.IIlIlIllllIlllIIIIll < 0.2) ? net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl : ((this.IIlIlIllllIlllIIIIll < 1.0) ? net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI : net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI.IlIIIlIlIIIllIlIlIIl);
    }
    
    public static llIIlIIIlIIIllIlIIIl[] IIIIlllIIIIIIlIIIlll() {
        return net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.llIlllIlllllIIllIIII;
    }
    
    public static llIIlIIIlIIIllIlIIIl IlIlIIIllIllIIIIIllI(final int n) {
        return llllIIIIlIIIlIlllIll(n, null);
    }
    
    public static llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(final int n, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        if (n >= 0 && n <= llIIlIIIlIIIllIlIIIl.llIlllIlllllIIllIIII.length) {
            final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl2 = llIIlIIIlIIIllIlIIIl.llIlllIlllllIIllIIII[n];
            return (llIIlIIIlIIIllIlIIIl2 == null) ? llIIlIIIlIIIllIlIIIl : llIIlIIIlIIIllIlIIIl2;
        }
        llIIlIIIlIIIllIlIIIl.IIlllIIIllIllIIlIlIl.warn("Biome ID is out of bounds: " + n + ", defaulting to 0 (Ocean)");
        return llIIlIIIlIIIllIlIIIl.IlIllIlIlIIIlIlIlIII;
    }
    
    static /* synthetic */ int[] llllIIllllIlIlIIIIll() {
        final int[] lllllIlIlIlllIlllIlI = net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.lllllIlIlIlllIlllIlI;
        if (lllllIlIlIlllIlllIlI != null) {
            return lllllIlIlIlllIlllIlI;
        }
        final int[] lllllIlIlIlllIlllIlI2 = new int[net.minecraft.llllIIIlIlllIlIIIIIl.IIlllIlIIllIlIlIlIIl.values().length];
        try {
            lllllIlIlIlllIlllIlI2[net.minecraft.llllIIIlIlllIlIIIIIl.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            lllllIlIlIlllIlllIlI2[net.minecraft.llllIIIlIlllIlIIIIIl.IIlllIlIIllIlIlIlIIl.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            lllllIlIlIlllIlllIlI2[net.minecraft.llllIIIlIlllIlIIIIIl.IIlllIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            lllllIlIlIlllIlllIlI2[net.minecraft.llllIIIlIlllIlIIIIIl.IIlllIlIIllIlIlIlIIl.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        return net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.lllllIlIlIlllIlllIlI = lllllIlIlIlllIlllIlI2;
    }
}
