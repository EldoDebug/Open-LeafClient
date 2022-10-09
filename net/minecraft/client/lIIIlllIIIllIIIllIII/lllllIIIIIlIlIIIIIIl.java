package net.minecraft.client.lIIIlllIIIllIIIllIII;

import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.client.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.client.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.*;
import net.optifine.lIIIlllIIIllIIIllIII.*;
import org.apache.logging.log4j.*;
import com.google.common.collect.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import java.io.*;
import com.google.gson.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import java.util.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl.*;
import org.lwjgl.util.vector.*;
import net.optifine.shaders.*;
import org.lwjgl.input.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import java.util.concurrent.*;
import net.minecraft.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.llllIIIlIlllIlIIIIIl.*;
import net.optifine.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;

public class lllllIIIIIlIlIIIIIIl implements llllIIllllIlIlIIIIll, IIIIlllIIIIIIlIIIlll
{
    private static final Logger llIIlIIIlIIIllIlIIIl;
    private static final lIllllIllIllIIllllll llIllIlIIIIllIlIIllI;
    private static final lIllllIllIllIIllllll lIlIlIIIllIIllIIIllI;
    private static final lIllllIllIllIIllllll IlIlIIIllIIllIlllllI;
    private static final lIllllIllIllIIllllll IIIIlllIIIIIIlIIIlll;
    private static final lIllllIllIllIIllllll llllIIllllIlIlIIIIll;
    public final Minecraft llllIIIIlIIIlIlllIll;
    private final IIlllIIlIllIllIlIIll IlIllIlIlIIIlIlIlIII;
    private final lllIllIIIllllllIllll IIlllIIlIllIllIlIIll;
    private llIIlIIIlIIIllIlIIIl lllIIIIlllllIlIIllIl;
    private Set IlIlIIIIIIlllIlIllIl;
    private List IIllIIllIIIlIlIIIIlI;
    private final Set IIIlIIIlIlIIlllIIlll;
    private IIlIlIllllIlllIIIIll IlIlIIIlIIlIlIIlllIl;
    private int IlllllllIIIlIIIlIlII;
    private int IIlIIIIlllIlllllIlII;
    private int IIIlIIlIIIIlllIlllII;
    private llIllIIIIIllIlIIIIlI IlIlIllllllllIIIIlII;
    private IlIlIlIlIlllllllllIl IIlllIlIIllIlIlIlIIl;
    private IlIlIlIlIlllllllllIl llIIIlIlIllIIlIlIlII;
    private IlIlIlIlIlllllllllIl lllllIlIIIlIlIIlllII;
    private int lIllllllIIllIlIlIlII;
    public final Map IlIlIlIlIlllllllllIl;
    private final Map llIIlllIIlllIIllIllI;
    private final IlIlIIIllIIllIlllllI[] IIlllIIIlIlllIIlllII;
    private llllIIIIlIIIlIlllIll IIlIIIIIllIlIIIlIIll;
    private IlIIIlIlIIIllIlIlIIl llllllIllIllIlIllllI;
    private double IIIllllllIllIIIlllIl;
    private double IlIIIlIIIllllIlIlIlI;
    private double IIIIIllIIIIlIIIIllIl;
    private int IIIIIIIIIlllIllIlIlI;
    private int IIllllIIIlIIIIIIllIl;
    private int IlllIIIIlIIIlIlIlIIl;
    private double lllIllIIIllllllIllll;
    private double llIllIlIlIIIIIIIllII;
    private double IIlIlIlIIlIllIIIIIIl;
    private double IllIllIIIIlIIlIlllII;
    private double IlIllllIIlIIlIlIlIll;
    private final net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl IllIllIlllIllllIIllI;
    private lllIIIIlllllIlIIllIl llIlIIIIIlIIlIlIIlll;
    private int IlIIlIlIIIlIIlIlIlII;
    private int IllIlIIllIllIIlIllII;
    private int lIIlIIIlIllIlIllIIIl;
    private int IIlIIIlllIllIllIlIII;
    private int lIlIlIlllIIlIlIlllIl;
    private boolean llIIIIIIlIllIIlIIIll;
    private net.minecraft.client.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll lIIIIlIlIllllIIlIllI;
    private final Vector4f[] llIIIlIlllIllIIlIllI;
    private final h IlIIllIIllIIllIIlIIl;
    private boolean lllllIIIIIlIlIIIIIIl;
    net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl.IlIlIIIllIIllIlllllI llIllIIIIIllIlIIIIlI;
    private double IllIIlllllIIllIIllIl;
    private double lIllIIIIIlllIIlIIllI;
    private double lIlIIlllIIlIIlIlllIl;
    public boolean IlIIIlIlIIIllIlIlIIl;
    private net.optifine.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl llIIIllIlIllIllIIIIl;
    public net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI IlIlIIIllIllIIIIIllI;
    public Set IllIIlllIIIIlllIIlIl;
    public Set llllIIIlIlllIlIIIIIl;
    private Deque IIIllIIIlIlIIllIIIlI;
    private List IIlllIIlllIIIlIlllII;
    private List IlIIlllllIIllIIlllll;
    private List lllllIIlIlIIIlIlIIIl;
    private List IIlllllIllIllIlIlIII;
    private List llllIllllIllllIlIlII;
    private List IIlIlIllllIlllIIIIll;
    private List lIIllIIIllllIlllIllI;
    private List IllIlIllIllIlllIIlll;
    private int IIllIIIlIIlIlIlIIIII;
    private int llIllIIlllllllllllll;
    private static final Set lllllIIllIlIllIllllI;
    private int IlIIIIIlIIllIIlIlIll;
    private lIIIIlIIIIIlllIllIII IllllIIlIlIllIIIllII;
    private lIIllIIIllllIlllIllI lllllIIIIIlIIlllIlIl;
    private int IlIllllIIIlIllIlIIll;
    private llllIIIlIlllIlIIIIIl lIIIIIlIlIIIlIIIIlIl;
    public boolean lIIIIlIIIIIlllIllIII;
    public boolean lIIIlllIIIllIIIllIII;
    private boolean IIllIIIlIIIIlIIlIIII;
    private static int IIIllIIllIIIIIIlIIlI;
    private static volatile /* synthetic */ int[] IIIIIIIllllIlIIIIIII;
    
    static {
        llIIlIIIlIIIllIlIIIl = LogManager.getLogger();
        llIllIlIIIIllIlIIllI = new lIllllIllIllIIllllll("textures/environment/moon_phases.png");
        lIlIlIIIllIIllIIIllI = new lIllllIllIllIIllllll("textures/environment/sun.png");
        IlIlIIIllIIllIlllllI = new lIllllIllIllIIllllll("textures/environment/clouds.png");
        IIIIlllIIIIIIlIIIlll = new lIllllIllIllIIllllll("textures/environment/end_sky.png");
        llllIIllllIlIlIIIIll = new lIllllIllIllIIllllll("textures/misc/forcefield.png");
        lllllIIllIlIllIllllI = Collections.unmodifiableSet((Set<?>)new HashSet<Object>(Arrays.asList(net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llllIIIlIlllIlIIIIIl)));
        lllllIIIIIlIlIIIIIIl.IIIllIIllIIIIIIlIIlI = 0;
    }
    
    public lllllIIIIIlIlIIIIIIl(final Minecraft llllIIIIlIIIlIlllIll) {
        this.IlIlIIIIIIlllIlIllIl = Sets.newLinkedHashSet();
        this.IIllIIllIIIlIlIIIIlI = Lists.newArrayListWithCapacity(69696);
        this.IIIlIIIlIlIIlllIIlll = Sets.newHashSet();
        this.IlllllllIIIlIIIlIlII = -1;
        this.IIlIIIIlllIlllllIlII = -1;
        this.IIIlIIlIIIIlllIlllII = -1;
        this.IlIlIlIlIlllllllllIl = Maps.newHashMap();
        this.llIIlllIIlllIIllIllI = Maps.newHashMap();
        this.IIlllIIIlIlllIIlllII = new IlIlIIIllIIllIlllllI[10];
        this.IIIllllllIllIIIlllIl = Double.MIN_VALUE;
        this.IlIIIlIIIllllIlIlIlI = Double.MIN_VALUE;
        this.IIIIIllIIIIlIIIIllIl = Double.MIN_VALUE;
        this.IIIIIIIIIlllIllIlIlI = Integer.MIN_VALUE;
        this.IIllllIIIlIIIIIIllIl = Integer.MIN_VALUE;
        this.IlllIIIIlIIIlIlIlIIl = Integer.MIN_VALUE;
        this.lllIllIIIllllllIllll = Double.MIN_VALUE;
        this.llIllIlIlIIIIIIIllII = Double.MIN_VALUE;
        this.IIlIlIlIIlIllIIIIIIl = Double.MIN_VALUE;
        this.IllIllIIIIlIIlIlllII = Double.MIN_VALUE;
        this.IlIllllIIlIIlIlIlIll = Double.MIN_VALUE;
        this.IllIllIlllIllllIIllI = new net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl();
        this.IlIIlIlIIIlIIlIlIlII = -1;
        this.IllIlIIllIllIIlIllII = 2;
        this.llIIIIIIlIllIIlIIIll = false;
        this.llIIIlIlllIllIIlIllI = new Vector4f[8];
        this.IlIIllIIllIIllIIlIIl = new h();
        this.lllllIIIIIlIlIIIIIIl = false;
        this.IlIIIlIlIIIllIlIlIIl = true;
        this.IllIIlllIIIIlllIIlIl = new LinkedHashSet();
        this.llllIIIlIlllIlIIIIIl = new LinkedHashSet();
        this.IIIllIIIlIlIIllIIIlI = new ArrayDeque();
        this.IIlllIIlllIIIlIlllII = new ArrayList(1024);
        this.IlIIlllllIIllIIlllll = new ArrayList(1024);
        this.lllllIIlIlIIIlIlIIIl = new ArrayList(1024);
        this.IIlllllIllIllIlIlIII = new ArrayList(1024);
        this.llllIllllIllllIlIlII = new ArrayList(1024);
        this.IIlIlIllllIlllIIIIll = new ArrayList(1024);
        this.lIIllIIIllllIlllIllI = new ArrayList(1024);
        this.IllIlIllIllIlllIIlll = new ArrayList(1024);
        this.IIllIIIlIIlIlIlIIIII = 0;
        this.llIllIIlllllllllllll = 0;
        this.IllllIIlIlIllIIIllII = null;
        this.lllllIIIIIlIIlllIlIl = null;
        this.IlIllllIIIlIllIlIIll = 0;
        this.lIIIIIlIlIIIlIIIIlIl = new llllIIIlIlllIlIIIIIl(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(0, 0, 0));
        this.lIIIIlIIIIIlllIllIII = false;
        this.lIIIlllIIIllIIIllIII = false;
        this.IIllIIIlIIIIlIIlIIII = false;
        this.llIIIllIlIllIllIIIIl = new net.optifine.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll);
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IIlllIIlIllIllIlIIll = llllIIIIlIIIlIlllIll.lllllIIIIIlIlIIIIIIl();
        (this.IlIllIlIlIIIlIlIlIII = llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll()).llllIIIIlIIIlIlllIll(net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIIIIIlIlIIIIIIl.llllIIllllIlIlIIIIll);
        GL11.glTexParameteri(3553, 10242, 10497);
        GL11.glTexParameteri(3553, 10243, 10497);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(0);
        this.IIlIIIIlllIlllllIlII();
        this.lllllIIIIIlIlIIIIIIl = net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IllIIlllIIIIlllIIlIl();
        if (this.lllllIIIIIlIlIIIIIIl) {
            this.llIlIIIIIlIIlIlIIlll = new IIlllllIllIllIlIlIII();
            this.llIllIIIIIllIlIIIIlI = new net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl.lllIIIIlllllIlIIllIl();
        }
        else {
            this.llIlIIIIIlIIlIlIIlll = new llIIIllIlIllIllIIIIl();
            this.llIllIIIIIllIlIIIIlI = new net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl.IIIIlllIIIIIIlIIIlll();
        }
        (this.IlIlIllllllllIIIIlII = new llIllIIIIIllIlIIIIlI()).llllIIIIlIIIlIlllIll(new net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl(0, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll, 3));
        this.IIlllIlIIllIlIlIlIIl();
        this.IlIlIllllllllIIIIlII();
        this.IIIlIIlIIIIlllIlllII();
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI) {
        this.IIlIIIIlllIlllllIlII();
    }
    
    private void IIlIIIIlllIlllllIlII() {
        final IlIlIIIIIIlllIlIllIl ilIllllIIlIIlIlIlIll = this.llllIIIIlIIIlIlllIll.IlIllllIIlIIlIlIlIll();
        for (int i = 0; i < this.IIlllIIIlIlllIIlllII.length; ++i) {
            this.IIlllIIIlIlllIIlllII[i] = ilIllllIIlIIlIlIlIll.llllIIIIlIIIlIlllIll("minecraft:blocks/destroy_stage_" + i);
        }
    }
    
    public void llllIIIIlIIIlIlllIll() {
        if (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lllIllIIIllllllIllll) {
            if (net.minecraft.client.lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl() == null) {
                net.minecraft.client.lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll();
            }
            final lIllllIllIllIIllllll lIllllIllIllIIllllll = new lIllllIllIllIIllllll("shaders/post/entity_outline.json");
            try {
                (this.llllllIllIllIlIllllI = new IlIIIlIlIIIllIlIlIIl(this.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), this.llllIIIIlIIIlIlllIll.llIllIlIlIIIIIIIllII(), this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(), lIllllIllIllIIllllll)).llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl, this.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI);
                this.IIlIIIIIllIlIIIlIIll = this.llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll("final");
            }
            catch (IOException ex) {
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIIIIIlIlIIIIIIl.llIIlIIIlIIIllIlIIIl.warn("Failed to load shader: " + lIllllIllIllIIllllll, (Throwable)ex);
                this.llllllIllIllIlIllllI = null;
                this.IIlIIIIIllIlIIIlIIll = null;
            }
            catch (JsonSyntaxException ex2) {
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIIIIIlIlIIIIIIl.llIIlIIIlIIIllIlIIIl.warn("Failed to load shader: " + lIllllIllIllIIllllll, (Throwable)ex2);
                this.llllllIllIllIlIllllI = null;
                this.IIlIIIIIllIlIIIlIIll = null;
            }
        }
        else {
            this.llllllIllIllIlIllllI = null;
            this.IIlIIIIIllIlIIIlIIll = null;
        }
    }
    
    public void IlIlIlIlIlllllllllIl() {
        if (this.llIllIIIIIllIlIIIIlI()) {
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(770, 771, 0, 1);
            this.IIlIIIIIllIlIIIlIIll.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl, this.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI, false);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
        }
    }
    
    protected boolean llIllIIIIIllIlIIIIlI() {
        return !net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIlIllllIIlIIlIlI() && !net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b() && !net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIllllIIIlIllIlIIll() && (this.IIlIIIIIllIlIIIlIIll != null && this.llllllIllIllIlIllllI != null && this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII != null && this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl() && this.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll.IllIlIllIllIlllIIlll.IlIIIlIlIIIllIlIlIIl());
    }
    
    private void IIIlIIlIIIIlllIlllII() {
        final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll = net.minecraft.client.lIIIlllIIIllIIIllIII.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
        final net.minecraft.client.lIIIlllIIIllIIIllIII.lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
        if (this.lllllIlIIIlIlIIlllII != null) {
            this.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI();
        }
        if (this.IIIlIIlIIIIlllIlllII >= 0) {
            net.minecraft.client.lIIIlllIIIllIIIllIII.llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl(this.IIIlIIlIIIIlllIlllII);
            this.IIIlIIlIIIIlllIlllII = -1;
        }
        if (this.lllllIIIIIlIlIIIIIIl) {
            this.lllllIlIIIlIlIIlllII = new IlIlIlIlIlllllllllIl(this.IlIlIllllllllIIIIlII);
            this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, -16.0f, true);
            llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl();
            llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI();
            this.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI.llllIIIlIlllIlIIIIIl());
        }
        else {
            GL11.glNewList(this.IIIlIIlIIIIlllIlllII = net.minecraft.client.lIIIlllIIIllIIIllIII.llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll(1), 4864);
            this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, -16.0f, true);
            llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
            GL11.glEndList();
        }
    }
    
    private void IlIlIllllllllIIIIlII() {
        final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll = net.minecraft.client.lIIIlllIIIllIIIllIII.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
        final net.minecraft.client.lIIIlllIIIllIIIllIII.lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
        if (this.llIIIlIlIllIIlIlIlII != null) {
            this.llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI();
        }
        if (this.IIlIIIIlllIlllllIlII >= 0) {
            net.minecraft.client.lIIIlllIIIllIIIllIII.llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl(this.IIlIIIIlllIlllllIlII);
            this.IIlIIIIlllIlllllIlII = -1;
        }
        if (this.lllllIIIIIlIlIIIIIIl) {
            this.llIIIlIlIllIIlIlIlII = new IlIlIlIlIlllllllllIl(this.IlIlIllllllllIIIIlII);
            this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, 16.0f, false);
            llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl();
            llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI();
            this.llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI.llllIIIlIlllIlIIIIIl());
        }
        else {
            GL11.glNewList(this.IIlIIIIlllIlllllIlII = net.minecraft.client.lIIIlllIIIllIIIllIII.llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll(1), 4864);
            this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, 16.0f, false);
            llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
            GL11.glEndList();
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final net.minecraft.client.lIIIlllIIIllIIIllIII.lIIllIIIllllIlllIllI liIllIIIllllIlllIllI, final float n, final boolean b) {
        liIllIIIllllIlllIllI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl);
        for (int n2 = (this.IIllIIIlIIlIlIlIIIII / 64 + 1) * 64 + 64, i = -n2; i <= n2; i += 64) {
            for (int j = -n2; j <= n2; j += 64) {
                float n3 = (float)i;
                float n4 = (float)(i + 64);
                if (b) {
                    n4 = (float)i;
                    n3 = (float)(i + 64);
                }
                liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl(n3, n, (double)j).IlIlIIIllIllIIIIIllI();
                liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl(n4, n, (double)j).IlIlIIIllIllIIIIIllI();
                liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl(n4, n, (double)(j + 64)).IlIlIIIllIllIIIIIllI();
                liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl(n3, n, (double)(j + 64)).IlIlIIIllIllIIIIIllI();
            }
        }
    }
    
    private void IIlllIlIIllIlIlIlIIl() {
        final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll = net.minecraft.client.lIIIlllIIIllIIIllIII.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
        final net.minecraft.client.lIIIlllIIIllIIIllIII.lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
        if (this.IIlllIlIIllIlIlIlIIl != null) {
            this.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI();
        }
        if (this.IlllllllIIIlIIIlIlII >= 0) {
            net.minecraft.client.lIIIlllIIIllIIIllIII.llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl(this.IlllllllIIIlIIIlIlII);
            this.IlllllllIIIlIIIlIlII = -1;
        }
        if (this.lllllIIIIIlIlIIIIIIl) {
            this.IIlllIlIIllIlIlIlIIl = new IlIlIlIlIlllllllllIl(this.IlIlIllllllllIIIIlII);
            this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI);
            llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl();
            llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI();
            this.IIlllIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI.llllIIIlIlllIlIIIIIl());
        }
        else {
            this.IlllllllIIIlIIIlIlII = net.minecraft.client.lIIIlllIIIllIIIllIII.llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll(1);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
            GL11.glNewList(this.IlllllllIIIlIIIlIlII, 4864);
            this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI);
            llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
            GL11.glEndList();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final net.minecraft.client.lIIIlllIIIllIIIllIII.lIIllIIIllllIlllIllI liIllIIIllllIlllIllI) {
        final Random random = new Random(10842L);
        liIllIIIllllIlllIllI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl);
        for (int i = 0; i < 1500; ++i) {
            final double n = random.nextFloat() * 2.0f - 1.0f;
            final double n2 = random.nextFloat() * 2.0f - 1.0f;
            final double n3 = random.nextFloat() * 2.0f - 1.0f;
            final double n4 = 0.15f + random.nextFloat() * 0.1f;
            final double n5 = n * n + n2 * n2 + n3 * n3;
            if (n5 < 1.0 && n5 > 0.01) {
                final double n6 = 1.0 / Math.sqrt(n5);
                final double n7 = n * n6;
                final double n8 = n2 * n6;
                final double n9 = n3 * n6;
                final double n10 = n7 * 100.0;
                final double n11 = n8 * 100.0;
                final double n12 = n9 * 100.0;
                final double atan2 = Math.atan2(n7, n9);
                final double sin = Math.sin(atan2);
                final double cos = Math.cos(atan2);
                final double atan3 = Math.atan2(Math.sqrt(n7 * n7 + n9 * n9), n8);
                final double sin2 = Math.sin(atan3);
                final double cos2 = Math.cos(atan3);
                final double n13 = random.nextDouble() * 3.141592653589793 * 2.0;
                final double sin3 = Math.sin(n13);
                final double cos3 = Math.cos(n13);
                for (int j = 0; j < 4; ++j) {
                    final double n14 = ((j & 0x2) - 1) * n4;
                    final double n15 = ((j + 1 & 0x2) - 1) * n4;
                    final double n16 = n14 * cos3 - n15 * sin3;
                    final double n17 = n15 * cos3 + n14 * sin3;
                    final double n18 = n16 * sin2 + 0.0 * cos2;
                    final double n19 = 0.0 * sin2 - n16 * cos2;
                    liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl(n10 + (n19 * sin - n17 * cos), n11 + n18, n12 + (n17 * sin + n19 * cos)).IlIlIIIllIllIIIIIllI();
                }
            }
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl lllIIIIlllllIlIIllIl) {
        if (this.lllIIIIlllllIlIIllIl != null) {
            this.lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl(this);
        }
        this.IIIllllllIllIIIlllIl = Double.MIN_VALUE;
        this.IlIIIlIIIllllIlIlIlI = Double.MIN_VALUE;
        this.IIIIIllIIIIlIIIIllIl = Double.MIN_VALUE;
        this.IIIIIIIIIlllIllIlIlI = Integer.MIN_VALUE;
        this.IIllllIIIlIIIIIIllIl = Integer.MIN_VALUE;
        this.IlllIIIIlIIIlIlIlIIl = Integer.MIN_VALUE;
        this.IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl);
        this.lllIIIIlllllIlIIllIl = lllIIIIlllllIlIIllIl;
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.x()) {
            net.optifine.IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll();
        }
        net.optifine.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl();
        this.IllllIIlIlIllIIIllII = null;
        this.lllllIIIIIlIIlllIlIl = null;
        this.lIIIIIlIlIIIlIIIIlIl.llllIIIIlIIIlIlllIll(null, (net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl)null);
        net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll(this.lllIIIIlllllIlIIllIl);
        if (lllIIIIlllllIlIIllIl != null) {
            lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(this);
            this.IlIIIlIlIIIllIlIlIIl();
        }
        else {
            this.IlIlIIIIIIlllIlIllIl.clear();
            this.llIIlllIIlllIIllIllI();
            if (this.IlIlIIIlIIlIlIIlllIl != null) {
                this.IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll();
            }
            this.IlIlIIIlIIlIlIIlllIl = null;
        }
    }
    
    public void IlIIIlIlIIIllIlIlIIl() {
        if (this.lllIIIIlllllIlIIllIl != null) {
            this.IlIIIlIlIIIllIlIlIIl = true;
            net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl(net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIIllIlIIIlIIll());
            net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl(net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIIIllIlIIIlIIll());
            net.minecraft.client.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll();
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.x()) {
                net.optifine.IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll();
            }
            net.optifine.llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl();
            this.IlIIlIlIIIlIIlIlIlII = this.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll.llIllIIIIIllIlIIIIlI;
            this.IIllIIIlIIlIlIlIIIII = this.IlIIlIlIIIlIIlIlIlII * 16;
            this.llIllIIlllllllllllll = this.IIllIIIlIIlIlIlIIIII * this.IIllIIIlIIlIlIlIIIII;
            final boolean lllllIIIIIlIlIIIIIIl = this.lllllIIIIIlIlIIIIIIl;
            this.lllllIIIIIlIlIIIIIIl = net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IllIIlllIIIIlllIIlIl();
            if (lllllIIIIIlIlIIIIIIl && !this.lllllIIIIIlIlIIIIIIl) {
                this.llIlIIIIIlIIlIlIIlll = new llIIIllIlIllIllIIIIl();
                this.llIllIIIIIllIlIIIIlI = new net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl.IIIIlllIIIIIIlIIIlll();
            }
            else if (!lllllIIIIIlIlIIIIIIl && this.lllllIIIIIlIlIIIIIIl) {
                this.llIlIIIIIlIIlIlIIlll = new IIlllllIllIllIlIlIII();
                this.llIllIIIIIllIlIIIIlI = new net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl.lllIIIIlllllIlIIllIl();
            }
            this.IIlllIlIIllIlIlIlIIl();
            this.IlIlIllllllllIIIIlII();
            this.IIIlIIlIIIIlllIlllII();
            if (this.IlIlIIIlIIlIlIIlllIl != null) {
                this.IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll();
            }
            this.IlIlIIIllIllIIIIIllI();
            synchronized (this.IIIlIIIlIlIIlllIIlll) {
                this.IIIlIIIlIlIIlllIIlll.clear();
            }
            // monitorexit(this.IIIlIIIlIlIIlllIIlll)
            this.IlIlIIIlIIlIlIIlllIl = new IIlIlIllllIlllIIIIll(this.lllIIIIlllllIlIIllIl, this.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll.llIllIIIIIllIlIIIIlI, this, this.llIllIIIIIllIlIIIIlI);
            if (this.lllIIIIlllllIlIIllIl != null) {
                final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI liiiIlIlIllllIIlIllI = this.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI();
                if (liiiIlIlIllllIIlIllI != null) {
                    this.IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(liiiIlIlIllllIIlIllI.IIlllIlIIllIlIlIlIIl, liiiIlIlIllllIIlIllI.lllllIlIIIlIlIIlllII);
                }
            }
            this.IllIlIIllIllIIlIllII = 2;
        }
        if (this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII == null) {
            this.IIllIIIlIIIIlIIlIIII = true;
        }
    }
    
    protected void IlIlIIIllIllIIIIIllI() {
        this.IlIlIIIIIIlllIlIllIl.clear();
        this.IllIllIlllIllllIIllI.IlIlIlIlIlllllllllIl();
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final int n2) {
        if (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lllIllIIIllllllIllll && this.llllllIllIllIlIllllI != null) {
            this.llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(n, n2);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final net.minecraft.client.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final float n) {
        int llIllIIIIIllIlIIIIlI2 = 0;
        if (net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.am.llIllIIIIIllIlIIIIlI()) {
            llIllIIIIIllIlIIIIlI2 = net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI(net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.am, new Object[0]);
        }
        if (this.IllIlIIllIllIIlIllII > 0) {
            if (llIllIIIIIllIlIIIIlI2 > 0) {
                return;
            }
            --this.IllIlIIllIllIIlIllII;
        }
        else {
            final double n2 = llIllIIIIIllIlIIIIlI.IIlIIIIlllIlllllIlII + (llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl - llIllIIIIIllIlIIIIlI.IIlIIIIlllIlllllIlII) * n;
            final double n3 = llIllIIIIIllIlIIIIlI.IIIlIIlIIIIlllIlllII + (llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII - llIllIIIIIllIlIIIIlI.IIIlIIlIIIIlllIlllII) * n;
            final double n4 = llIllIIIIIllIlIIIIlI.IlIlIllllllllIIIIlII + (llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII - llIllIIIIIllIlIIIIlI.IlIlIllllllllIIIIlII) * n;
            this.lllIIIIlllllIlIIllIl.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll("prepare");
            net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.lllIIIIlllllIlIIllIl, this.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), this.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI, this.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI(), n);
            this.IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(this.lllIIIIlllllIlIIllIl, this.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI, this.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI(), this.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII, this.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll, n);
            ++net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIIIIIlIlIIIIIIl.IIIllIIllIIIIIIlIIlI;
            if (llIllIIIIIllIlIIIIlI2 == 0) {
                this.lIIlIIIlIllIlIllIIIl = 0;
                this.IIlIIIlllIllIllIlIII = 0;
                this.lIlIlIlllIIlIlIlllIl = 0;
                this.IlIIIIIlIIllIIlIlIll = 0;
            }
            final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI liiiIlIlIllllIIlIllI = this.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI();
            final double ilIIIlIlIIIllIlIlIIl2 = liiiIlIlIllllIIlIllI.lIIlIIIlIllIlIllIIIl + (liiiIlIlIllllIIlIllI.IIlllIlIIllIlIlIlIIl - liiiIlIlIllllIIlIllI.lIIlIIIlIllIlIllIIIl) * n;
            final double ilIlIIIllIllIIIIIllI = liiiIlIlIllllIIlIllI.IIlIIIlllIllIllIlIII + (liiiIlIlIllllIIlIllI.llIIIlIlIllIIlIlIlII - liiiIlIlIllllIIlIllI.IIlIIIlllIllIllIlIII) * n;
            final double illIIlllIIIIlllIIlIl = liiiIlIlIllllIIlIllI.lIlIlIlllIIlIlIlllIl + (liiiIlIlIllllIIlIllI.lllllIlIIIlIlIIlllII - liiiIlIlIllllIIlIllI.lIlIlIlllIIlIlIlllIl) * n;
            net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.IIIIlllIIIIIIlIIIlll.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl2;
            net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.IIIIlllIIIIIIlIIIlll.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
            net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.IIIIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
            this.IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl2, ilIlIIIllIllIIIIIllI, illIIlllIIIIlllIIlIl);
            this.llllIIIIlIIIlIlllIll.IlIllIlIlIIIlIlIlIII.lIIIIlIIIIIlllIllIII();
            this.lllIIIIlllllIlIIllIl.IIlIIIIlllIlllllIlII.llIllIIIIIllIlIIIIlI("global");
            final List iiIlIIIlIlIIlllIIlll = this.lllIIIIlllllIlIIllIl.IIIlIIIlIlIIlllIIlll();
            if (llIllIIIIIllIlIIIIlI2 == 0) {
                this.lIIlIIIlIllIlIllIIIl = iiIlIIIlIlIIlllIIlll.size();
            }
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIIIlIIlIlIIlllIl() && this.llllIIIIlIIIlIlllIll.IlIllIlIlIIIlIlIlIII.lIIIlllIIIllIIIllIII) {
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IIIIlllIIIIIIlIIIlll();
            }
            final boolean llIllIIIIIllIlIIIIlI3 = net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IIllIIIlIIlIlIlIIIII.llIllIIIIIllIlIIIIlI();
            final boolean llIllIIIIIllIlIIIIlI4 = net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.C.llIllIIIIIllIlIIIIlI();
            for (int i = 0; i < this.lllIIIIlllllIlIIllIl.llllIIIlIlllIlIIIIIl.size(); ++i) {
                final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI5 = this.lllIIIIlllllIlIIllIl.llllIIIlIlllIlIIIIIl.get(i);
                if (!llIllIIIIIllIlIIIIlI3 || net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI5, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IIllIIIlIIlIlIlIIIII, llIllIIIIIllIlIIIIlI2)) {
                    ++this.IIlIIIlllIllIllIlIII;
                    if (llIllIIIIIllIlIIIIlI5.lIIIIlIIIIIlllIllIII(n2, n3, n4)) {
                        this.IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI5, n);
                    }
                }
            }
            if (this.llIllIIIIIllIlIIIIlI()) {
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(519);
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IIIIlllIIIIIIlIIIlll();
                this.IIlIIIIIllIlIIIlIIll.IllIIlllIIIIlllIIlIl();
                this.IIlIIIIIllIlIIIlIIll.llllIIIIlIIIlIlllIll(false);
                this.lllIIIIlllllIlIIllIl.IIlIIIIlllIlllllIlII.llIllIIIIIllIlIIIIlI("entityOutlines");
                net.minecraft.client.lIIIlllIIIllIIIllIII.lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll();
                this.IIlllIIlIllIllIlIIll.llIllIIIIIllIlIIIIlI(true);
                for (int j = 0; j < iiIlIIIlIlIIlllIIlll.size(); ++j) {
                    final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI6 = iiIlIIIlIlIIlllIIlll.get(j);
                    final boolean b = this.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI() instanceof net.minecraft.llllIIIlIlllIlIIIIIl.lllIIIIlllllIlIIllIl && ((net.minecraft.llllIIIlIlllIlIIIIIl.lllIIIIlllllIlIIllIl)this.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI()).ah();
                    final boolean b2 = llIllIIIIIllIlIIIIlI6.lIIIIlIIIIIlllIllIII(n2, n3, n4) && (llIllIIIIIllIlIIIIlI6.IIllIIIlIIlIlIlIIIII || ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI6.IlIIlllIIlIlllllIIlI()) || llIllIIIIIllIlIIIIlI6.IIllIIllIIIlIlIIIIlI == this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII) && llIllIIIIIllIlIIIIlI6 instanceof net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll;
                    if ((llIllIIIIIllIlIIIIlI6 != this.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI() || this.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll.IIIllIIllIIIIIIlIIlI != 0 || b) && b2) {
                        this.IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI6, n);
                    }
                }
                this.IIlllIIlIllIllIlIIll.llIllIIIIIllIlIIIIlI(false);
                net.minecraft.client.lIIIlllIIIllIIIllIII.lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl();
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(false);
                this.llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(n);
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIIIllIllIIIIIllI();
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(true);
                this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(false);
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIIIllIIllIlllllI();
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIlIlllIlIIIIIl();
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(515);
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIIlIIIlIIIllIlIIIl();
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl();
            }
            this.lllIIIIlllllIlIIllIl.IIlIIIIlllIlllllIlII.llIllIIIIIllIlIIIIlI("entities");
            final boolean b3 = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b();
            if (b3) {
                net.optifine.shaders.llIIlllIIlllIIllIllI.IIlIlIlIIlIllIIIIIIl();
            }
            net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll();
            final boolean liiIlllIIIllIIIllIII = this.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll.lIIIlllIIIllIIIllIII;
            this.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll.lIIIlllIIIllIIIllIII = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIIIlIIIllllIlIlIlI();
            final boolean b4 = net.optifine.shaders.llIIlllIIlllIIllIllI.IIlllIIlIllIllIlIIll && !this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl();
            for (final lIllIIIIIlllIIlIIllI lIllIIIIIlllIIlIIllI : this.IIlllIIlllIIIlIlllII) {
                final IIIlIIlIIIIlllIlllII iiIlIIlIIIIlllIlllII = lIllIIIIIlllIIlIIllI.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI().IlIlIIIIIIlllIlIllIl()[lIllIIIIIlllIIlIIllI.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII().lIIIlllIIIllIIIllIII() / 16];
                if (!iiIlIIlIIIIlllIlllII.isEmpty()) {
                    for (final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI7 : iiIlIIlIIIIlllIlllII) {
                        if (!llIllIIIIIllIlIIIIlI3 || net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI7, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IIllIIIlIIlIlIlIIIII, llIllIIIIIllIlIIIIlI2)) {
                            final boolean b5 = this.IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI7, ilIIIlIlIIIllIlIlIIl, n2, n3, n4) || llIllIIIIIllIlIIIIlI7.IIllIIllIIIlIlIIIIlI == this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII;
                            if (b5) {
                                final boolean b6 = this.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI() instanceof net.minecraft.llllIIIlIlllIlIIIIIl.lllIIIIlllllIlIIllIl && ((net.minecraft.llllIIIlIlllIlIIIIIl.lllIIIIlllllIlIIllIl)this.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI()).ah();
                                if ((llIllIIIIIllIlIIIIlI7 == this.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI() && !b4 && this.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll.IIIllIIllIIIIIIlIIlI == 0 && !b6) || (llIllIIIIIllIlIIIIlI7.llIIIlIlIllIIlIlIlII >= 0.0 && llIllIIIIIllIlIIIIlI7.llIIIlIlIllIIlIlIlII < 256.0 && !this.lllIIIIlllllIlIIllIl.IllIIlllIIIIlllIIlIl(new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI7)))) {
                                    continue;
                                }
                                ++this.IIlIIIlllIllIllIlIII;
                                this.IlIlIIIllIllIIIIIllI = llIllIIIIIllIlIIIIlI7;
                                if (b3) {
                                    net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI7);
                                }
                                this.IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI7, n);
                                this.IlIlIIIllIllIIIIIllI = null;
                            }
                            if (b5 || !(llIllIIIIIllIlIIIIlI7 instanceof net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.llIIlIIIlIIIllIlIIIl) || (llIllIIIIIllIlIIIIlI3 && !net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI7, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IIllIIIlIIlIlIlIIIII, llIllIIIIIllIlIIIIlI2))) {
                                continue;
                            }
                            this.IlIlIIIllIllIIIIIllI = llIllIIIIIllIlIIIIlI7;
                            if (b3) {
                                net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI7);
                            }
                            this.llllIIIIlIIIlIlllIll.lllllIIIIIlIlIIIIIIl().IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI7, n);
                            this.IlIlIIIllIllIIIIIllI = null;
                        }
                    }
                }
            }
            this.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
            if (b3) {
                net.optifine.shaders.llIIlllIIlllIIllIllI.IllIllIlllIllllIIllI();
                net.optifine.shaders.llIIlllIIlllIIllIllI.IIlIIIlllIllIllIlIII();
            }
            this.lllIIIIlllllIlIIllIl.IIlIIIIlllIlllllIlII.llIllIIIIIllIlIIIIlI("blockentities");
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl();
            if (net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.B.llIllIIIIIllIlIIIIlI()) {
                net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl();
            }
            net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.llllIIllllIlIlIIIIll.IlIlIlIlIlllllllllIl();
            final Iterator<lIllIIIIIlllIIlIIllI> iterator3 = (Iterator<lIllIIIIIlllIIlIIllI>)this.IlIIlllllIIllIIlllll.iterator();
            while (iterator3.hasNext()) {
                final List ilIlIlIlIlllllllllIl = iterator3.next().llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl().IlIlIlIlIlllllllllIl();
                if (!ilIlIlIlIlllllllllIl.isEmpty()) {
                    for (final net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl3 : ilIlIlIlIlllllllllIl) {
                        if (llIllIIIIIllIlIIIIlI4) {
                            if (!net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(ilIIIlIlIIIllIlIlIIl3, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.C, llIllIIIIIllIlIIIIlI2)) {
                                continue;
                            }
                            final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = (net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll)net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl(ilIIIlIlIIIllIlIlIIl3, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.A, new Object[0]);
                            if (llllIIIIlIIIlIlllIll != null && !ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll)) {
                                continue;
                            }
                        }
                        if (b3) {
                            net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl3);
                        }
                        net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl3, n, -1);
                        ++this.IlIIIIIlIIllIIlIlIll;
                    }
                }
            }
            synchronized (this.IIIlIIIlIlIIlllIIlll) {
                for (final net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl4 : this.IIIlIIIlIlIIlllIIlll) {
                    if (!llIllIIIIIllIlIIIIlI4 || net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(ilIIIlIlIIIllIlIlIIl4, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.C, llIllIIIIIllIlIIIIlI2)) {
                        if (b3) {
                            net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl4);
                        }
                        net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl4, n, -1);
                    }
                }
            }
            // monitorexit(this.IIIlIIIlIlIIlllIIlll)
            if (net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.B.llIllIIIIIllIlIIIIlI()) {
                net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI2);
            }
            this.lIIIIlIIIIIlllIllIII = true;
            this.lllllIlIIIlIlIIlllII();
            for (final net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl : this.IlIlIlIlIlllllllllIl.values()) {
                net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2 = ilIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll();
                net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl5 = this.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl2);
                if (ilIIIlIlIIIllIlIlIIl5 instanceof net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIlIIIllIIllIlllllI) {
                    final net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI = (net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIlIIIllIIllIlllllI)ilIIIlIlIIIllIlIlIIl5;
                    if (ilIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII != null) {
                        ilIlIlIlIlllllllllIl2 = ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI);
                        ilIIIlIlIIIllIlIlIIl5 = this.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl2);
                    }
                    else if (ilIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl != null) {
                        ilIlIlIlIlllllllllIl2 = ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI);
                        ilIIIlIlIIIllIlIlIIl5 = this.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl2);
                    }
                }
                final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI8 = this.lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl2).llIllIIIIIllIlIIIIlI();
                int llllIIIIlIIIlIlllIll2;
                if (llIllIIIIIllIlIIIIlI4) {
                    llllIIIIlIIIlIlllIll2 = 0;
                    if (ilIIIlIlIIIllIlIlIIl5 != null && net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(ilIIIlIlIIIllIlIlIIl5, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.C, llIllIIIIIllIlIIIIlI2) && net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(ilIIIlIlIIIllIlIlIIl5, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.z, new Object[0])) {
                        final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll3 = (net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll)net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl(ilIIIlIlIIIllIlIlIIl5, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.A, new Object[0]);
                        if (llllIIIIlIIIlIlllIll3 != null) {
                            llllIIIIlIIIlIlllIll2 = (ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3) ? 1 : 0);
                        }
                    }
                }
                else {
                    llllIIIIlIIIlIlllIll2 = ((ilIIIlIlIIIllIlIlIIl5 != null && (llIllIIIIIllIlIIIIlI8 instanceof IIlIIIIIllIlIIIlIIll || llIllIIIIIllIlIIIIlI8 instanceof IIIllIIIlIlIIllIIIlI || llIllIIIIIllIlIIIIlI8 instanceof br || llIllIIIIIllIlIIIIlI8 instanceof ca)) ? 1 : 0);
                }
                if (llllIIIIlIIIlIlllIll2 != 0) {
                    if (b3) {
                        net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl5);
                    }
                    net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl5, n, ilIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl());
                }
            }
            this.lIllllllIIllIlIlIlII();
            this.lIIIIlIIIIIlllIllIII = false;
            if (b3) {
                net.optifine.shaders.llIIlllIIlllIIllIllI.lIlIlIlllIIlIlIlllIl();
            }
            --net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIIIIIlIlIIIIIIl.IIIllIIllIIIIIIlIIlI;
            this.llllIIIIlIIIlIlllIll.IlIllIlIlIIIlIlIlIII.llllIIIlIlllIlIIIIIl();
            this.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl();
        }
    }
    
    public String IllIIlllIIIIlllIIlIl() {
        final int length = this.IlIlIIIlIIlIlIIlllIl.IllIIlllIIIIlllIIlIl.length;
        int n = 0;
        final Iterator<lIllIIIIIlllIIlIIllI> iterator = this.IIllIIllIIIlIlIIIIlI.iterator();
        while (iterator.hasNext()) {
            final llIllIlIIIIllIlIIllI ilIlIlIlIlllllllllIl = iterator.next().llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl;
            if (ilIlIlIlIlllllllllIl != net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll && !ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll()) {
                ++n;
            }
        }
        return String.format("C: %d/%d %sD: %d, %s", n, length, this.llllIIIIlIIIlIlllIll.llllllIllIllIlIllllI ? "(s) " : "", this.IlIIlIlIIIlIIlIlIlII, this.IllIllIlllIllllIIllI.llllIIIIlIIIlIlllIll());
    }
    
    public String llllIIIlIlllIlIIIIIl() {
        return "E: " + this.IIlIIIlllIllIllIlIII + "/" + this.lIIlIIIlIllIlIllIIIl + ", B: " + this.lIlIlIlllIIlIlIlllIl + ", I: " + (this.lIIlIIIlIllIlIllIIIl - this.lIlIlIlllIIlIlIlllIl - this.IIlIIIlllIllIllIlIII) + ", " + net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final double n, net.minecraft.client.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final int n2, final boolean b) {
        if (this.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll.llIllIIIIIllIlIIIIlI != this.IlIIlIlIIIlIIlIlIlII) {
            this.IlIIIlIlIIIllIlIlIIl();
        }
        this.lllIIIIlllllIlIIllIl.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll("camera");
        final double n3 = llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl - this.IIIllllllIllIIIlllIl;
        final double n4 = llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII - this.IlIIIlIIIllllIlIlIlI;
        final double n5 = llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII - this.IIIIIllIIIIlIIIIllIl;
        if (this.IIIIIIIIIlllIllIlIlI != llIllIIIIIllIlIIIIlI.lllllIIlIlIIIlIlIIIl || this.IIllllIIIlIIIIIIllIl != llIllIIIIIllIlIIIIlI.IIlllllIllIllIlIlIII || this.IlllIIIIlIIIlIlIlIIl != llIllIIIIIllIlIIIIlI.llllIllllIllllIlIlII || n3 * n3 + n4 * n4 + n5 * n5 > 16.0) {
            this.IIIllllllIllIIIlllIl = llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl;
            this.IlIIIlIIIllllIlIlIlI = llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII;
            this.IIIIIllIIIIlIIIIllIl = llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII;
            this.IIIIIIIIIlllIllIlIlI = llIllIIIIIllIlIIIIlI.lllllIIlIlIIIlIlIIIl;
            this.IIllllIIIlIIIIIIllIl = llIllIIIIIllIlIIIIlI.IIlllllIllIllIlIlIII;
            this.IlllIIIIlIIIlIlIlIIl = llIllIIIIIllIlIIIIlI.llllIllllIllllIlIlII;
            this.IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl, llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII);
        }
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.x()) {
            net.optifine.IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll(this);
        }
        this.lllIIIIlllllIlIIllIl.IIlIIIIlllIlllllIlII.llIllIIIIIllIlIIIIlI("renderlistcamera");
        final double n6 = llIllIIIIIllIlIIIIlI.lIIlIIIlIllIlIllIIIl + (llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl - llIllIIIIIllIlIIIIlI.lIIlIIIlIllIlIllIIIl) * n;
        final double n7 = llIllIIIIIllIlIIIIlI.IIlIIIlllIllIllIlIII + (llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII - llIllIIIIIllIlIIIIlI.IIlIIIlllIllIllIlIII) * n;
        final double n8 = llIllIIIIIllIlIIIIlI.lIlIlIlllIIlIlIlllIl + (llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII - llIllIIIIIllIlIIIIlI.lIlIlIlllIIlIlIlllIl) * n;
        this.llIlIIIIIlIIlIlIIlll.llllIIIIlIIIlIlllIll(n6, n7, n8);
        this.lllIIIIlllllIlIIllIl.IIlIIIIlllIlllllIlII.llIllIIIIIllIlIIIIlI("cull");
        if (this.lIIIIlIlIllllIIlIllI != null) {
            final net.minecraft.client.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI2 = new net.minecraft.client.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI(this.lIIIIlIlIllllIIlIllI);
            llIllIIIIIllIlIIIIlI2.llllIIIIlIIIlIlllIll(this.IlIIllIIllIIllIIlIIl.llllIIIIlIIIlIlllIll, this.IlIIllIIllIIllIIlIIl.IlIlIlIlIlllllllllIl, this.IlIIllIIllIIllIIlIIl.llIllIIIIIllIlIIIIlI);
            ilIIIlIlIIIllIlIlIIl = llIllIIIIIllIlIIIIlI2;
        }
        this.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI("culling");
        final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(n6, n7 + llIllIIIIIllIlIIIIlI.llllIlIllllIIlIIlIlI(), n8);
        final IlIllIlIlIIIlIlIlIII llllIIIIlIIIlIlllIll = this.IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
        new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n6 / 16.0) * 16, net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n7 / 16.0) * 16, net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n8 / 16.0) * 16);
        this.IlIIIlIlIIIllIlIlIIl = (this.IlIIIlIlIIIllIlIlIIl || !this.IlIlIIIIIIlllIlIllIl.isEmpty() || llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl != this.lllIllIIIllllllIllll || llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII != this.llIllIlIlIIIIIIIllII || llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII != this.IIlIlIlIIlIllIIIIIIl || llIllIIIIIllIlIIIIlI.llllllIllIllIlIllllI != this.IllIllIIIIlIIlIlllII || llIllIIIIIllIlIIIIlI.IIlIIIIIllIlIIIlIIll != this.IlIllllIIlIIlIlIlIll);
        this.lllIllIIIllllllIllll = llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl;
        this.llIllIlIlIIIIIIIllII = llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII;
        this.IIlIlIlIIlIllIIIIIIl = llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII;
        this.IllIllIIIIlIIlIlllII = llIllIIIIIllIlIIIIlI.llllllIllIllIlIllllI;
        this.IlIllllIIlIIlIlIlIll = llIllIIIIIllIlIIIIlI.IIlIIIIIllIlIIIlIIll;
        final boolean b2 = this.lIIIIlIlIllllIIlIllI != null;
        this.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI("update");
        net.optifine.IllIllIlllIllllIIllI.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll();
        final int iIlllIIlIllIllIlIIll = this.IIlllIIlIllIllIlIIll();
        if (iIlllIIlIllIllIlIIll != this.IlIllllIIIlIllIlIIll) {
            this.IlIllllIIIlIllIlIIll = iIlllIIlIllIllIlIIll;
            this.IlIIIlIlIIIllIlIlIIl = true;
        }
        int llllIIIIlIIIlIlllIll2 = 256;
        if (!net.optifine.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll()) {
            this.IlIIIlIlIIIllIlIlIIl = true;
        }
        if (!b2 && this.IlIIIlIlIIIllIlIlIIl && net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.H()) {
            llllIIIIlIIIlIlllIll2 = net.optifine.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.lllIIIIlllllIlIIllIl, llIllIIIIIllIlIIIIlI, this.IlIIlIlIIIlIIlIlIlII);
        }
        final IlIllIlIlIIIlIlIlIII llllIIIIlIIIlIlllIll3 = this.IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl, llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII, llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII));
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.IIlllIIlIllIllIlIIll) {
            this.IIllIIllIIIlIlIIIIlI = this.IIlIlIllllIlllIIIIll;
            this.IIlllIIlllIIIlIlllII = this.lIIllIIIllllIlllIllI;
            this.IlIIlllllIIllIIlllll = this.IllIlIllIllIlllIIlll;
            if (!b2 && this.IlIIIlIlIIIllIlIlIIl) {
                this.llIIlllIIlllIIllIllI();
                if (llllIIIIlIIIlIlllIll3 != null && llllIIIIlIIIlIlllIll3.lIIIlllIIIllIIIllIII().lIIIlllIIIllIIIllIII() > llllIIIIlIIIlIlllIll2) {
                    this.IIlllIIlllIIIlIlllII.add(llllIIIIlIIIlIlllIll3.IIIIlllIIIIIIlIIIlll());
                }
                final Iterator llllIIIIlIIIlIlllIll4 = net.optifine.shaders.llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(this.lllIIIIlllllIlIIllIl, n, llIllIIIIIllIlIIIIlI, this.IlIIlIlIIIlIIlIlIlII, this.IlIlIIIlIIlIlIIlllIl);
                while (llllIIIIlIIIlIlllIll4.hasNext()) {
                    final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII = llllIIIIlIIIlIlllIll4.next();
                    if (ilIllIlIlIIIlIlIlIII != null && ilIllIlIlIIIlIlIlIII.lIIIlllIIIllIIIllIII().lIIIlllIIIllIIIllIII() <= llllIIIIlIIIlIlllIll2) {
                        final lIllIIIIIlllIIlIIllI iiiIlllIIIIIIlIIIlll = ilIllIlIlIIIlIlIlIII.IIIIlllIIIIIIlIIIlll();
                        if (!ilIllIlIlIIIlIlIlIII.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll() || ilIllIlIlIIIlIlIlIII.llIIlIIIlIIIllIlIIIl()) {
                            this.IIllIIllIIIlIlIIIIlI.add(iiiIlllIIIIIIlIIIlll);
                        }
                        if (net.optifine.util.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(ilIllIlIlIIIlIlIlIII.lIlIlIIIllIIllIIIllI())) {
                            this.IIlllIIlllIIIlIlllII.add(iiiIlllIIIIIIlIIIlll);
                        }
                        if (ilIllIlIlIIIlIlIlIII.llllIIIlIlllIlIIIIIl().IlIlIlIlIlllllllllIl().size() <= 0) {
                            continue;
                        }
                        this.IlIIlllllIIllIIlllll.add(iiiIlllIIIIIIlIIIlll);
                    }
                }
            }
        }
        else {
            this.IIllIIllIIIlIlIIIIlI = this.lllllIIlIlIIIlIlIIIl;
            this.IIlllIIlllIIIlIlllII = this.IIlllllIllIllIlIlIII;
            this.IlIIlllllIIllIIlllll = this.llllIllllIllllIlIlII;
        }
        if (!b2 && this.IlIIIlIlIIIllIlIlIIl && !net.optifine.shaders.llIIlllIIlllIIllIllI.IIlllIIlIllIllIlIIll) {
            this.IlIIIlIlIIIllIlIlIIl = false;
            this.llIIlllIIlllIIllIllI();
            this.IIIllIIIlIlIIllIIIlI.clear();
            final Deque iiIllIIIlIlIIllIIIlI = this.IIIllIIIlIlIIllIIIlI;
            boolean llllllIllIllIlIllllI = this.llllIIIIlIIIlIlllIll.llllllIllIllIlIllllI;
            if (llllIIIIlIIIlIlllIll != null && llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII().lIIIlllIIIllIIIllIII() <= llllIIIIlIIIlIlllIll2) {
                boolean b3 = false;
                final lIllIIIIIlllIIlIIllI lIllIIIIIlllIIlIIllI = new lIllIIIIIlllIIlIIllI(llllIIIIlIIIlIlllIll, null, 0);
                final Set lllllIIllIlIllIllllI = net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIIIIIlIlIIIIIIl.lllllIIllIlIllIllllI;
                if (lllllIIllIlIllIllllI.size() == 1) {
                    final Vector3f llllIIIIlIIIlIlllIll5 = this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, n);
                    lllllIIllIlIllIllllI.remove(net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll5.x, llllIIIIlIIIlIlllIll5.y, llllIIIIlIIIlIlllIll5.z).IlIlIIIllIllIIIIIllI());
                }
                if (lllllIIllIlIllIllllI.isEmpty()) {
                    b3 = true;
                }
                if (b3 && !b) {
                    this.IIllIIllIIIlIlIIIIlI.add(lIllIIIIIlllIIlIIllI);
                }
                else {
                    if (b && this.lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI().llllIIllllIlIlIIIIll()) {
                        llllllIllIllIlIllllI = false;
                    }
                    llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n2);
                    iiIllIIIlIlIIllIIIlI.add(lIllIIIIIlllIIlIIllI);
                }
            }
            else {
                final int n9 = (ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() > 0) ? Math.min(llllIIIIlIIIlIlllIll2, 248) : 8;
                if (llllIIIIlIIIlIlllIll3 != null) {
                    this.IIlllIIlllIIIlIlllII.add(llllIIIIlIIIlIlllIll3.IIIIlllIIIIIIlIIIlll());
                }
                for (int i = -this.IlIIlIlIIIlIIlIlIlII; i <= this.IlIIlIlIIIlIIlIlIlII; ++i) {
                    for (int j = -this.IlIIlIlIIIlIIlIlIlII; j <= this.IlIIlIlIIIlIIlIlIlII; ++j) {
                        final IlIllIlIlIIIlIlIlIII llllIIIIlIIIlIlllIll6 = this.IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl((i << 4) + 8, n9, (j << 4) + 8));
                        if (llllIIIIlIIIlIlllIll6 != null && llllIIIIlIIIlIlllIll6.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, n2)) {
                            llllIIIIlIIIlIlllIll6.llllIIIIlIIIlIlllIll(n2);
                            final lIllIIIIIlllIIlIIllI iiiIlllIIIIIIlIIIlll2 = llllIIIIlIIIlIlllIll6.IIIIlllIIIIIIlIIIlll();
                            iiiIlllIIIIIIlIIIlll2.llllIIIIlIIIlIlllIll(null, 0);
                            iiIllIIIlIlIIllIIIlI.add(iiiIlllIIIIIIlIIIlll2);
                        }
                    }
                }
            }
            this.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll("iteration");
            final boolean illlllllIIIlIIIlIlII = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII();
            while (!iiIllIIIlIlIIllIIIlI.isEmpty()) {
                final lIllIIIIIlllIIlIIllI lIllIIIIIlllIIlIIllI2 = iiIllIIIlIlIIllIIIlI.poll();
                final IlIllIlIlIIIlIlIlIII llllIIIIlIIIlIlllIll7 = lIllIIIIIlllIIlIIllI2.llllIIIIlIIIlIlllIll;
                final net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll ilIlIlIlIlllllllllIl2 = lIllIIIIIlllIIlIIllI2.IlIlIlIlIlllllllllIl;
                final llIllIlIIIIllIlIIllI ilIlIlIlIlllllllllIl3 = llllIIIIlIIIlIlllIll7.IlIlIlIlIlllllllllIl;
                if (!ilIlIlIlIlllllllllIl3.llllIIIIlIIIlIlllIll() || llllIIIIlIIIlIlllIll7.llIIlIIIlIIIllIlIIIl()) {
                    this.IIllIIllIIIlIlIIIIlI.add(lIllIIIIIlllIIlIIllI2);
                }
                if (net.optifine.util.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll7.lIlIlIIIllIIllIIIllI())) {
                    this.IIlllIIlllIIIlIlllII.add(lIllIIIIIlllIIlIIllI2);
                }
                if (ilIlIlIlIlllllllllIl3.IlIlIlIlIlllllllllIl().size() > 0) {
                    this.IlIIlllllIIllIIlllll.add(lIllIIIIIlllIIlIIllI2);
                }
                net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll[] array;
                for (int length = (array = (llllllIllIllIlIllllI ? net.optifine.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(lIllIIIIIlllIIlIIllI2.llIllIIIIIllIlIIIIlI) : net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llllIIIlIlllIlIIIIIl)).length, k = 0; k < length; ++k) {
                    final net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll lllIllIIIllllllIllll = array[k];
                    if (!llllllIllIllIlIllllI || ilIlIlIlIlllllllllIl2 == null || ilIlIlIlIlllllllllIl3.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl2.IlIlIIIllIllIIIIIllI(), lllIllIIIllllllIllll)) {
                        final IlIllIlIlIIIlIlIlIII llllIIIIlIIIlIlllIll8 = this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll7, lllIllIIIllllllIllll, illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll2);
                        if (llllIIIIlIIIlIlllIll8 != null && llllIIIIlIIIlIlllIll8.llllIIIIlIIIlIlllIll(n2) && llllIIIIlIIIlIlllIll8.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, n2)) {
                            final int n10 = lIllIIIIIlllIIlIIllI2.llIllIIIIIllIlIIIIlI | 1 << lllIllIIIllllllIllll.ordinal();
                            final lIllIIIIIlllIIlIIllI iiiIlllIIIIIIlIIIlll3 = llllIIIIlIIIlIlllIll8.IIIIlllIIIIIIlIIIlll();
                            iiiIlllIIIIIIlIIIlll3.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll, n10);
                            iiIllIIIlIlIIllIIIlI.add(iiiIlllIIIIIIlIIIlll3);
                        }
                    }
                }
            }
            this.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl();
        }
        this.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI("captureFrustum");
        if (this.llIIIIIIlIllIIlIIIll) {
            this.llllIIIIlIIIlIlllIll(n6, n7, n8);
            this.llIIIIIIlIllIIlIIIll = false;
        }
        net.optifine.IllIllIlllIllllIIllI.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl();
        if (net.optifine.shaders.llIIlllIIlllIIllIllI.IIlllIIlIllIllIlIIll) {
            net.optifine.shaders.llIIlllIIlllIIllIllI.IIllIIIlIIIIlIIlIIII();
        }
        else {
            this.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI("rebuildNear");
            this.IllIllIlllIllllIIllI.IlIlIIIllIllIIIIIllI();
            final Set ilIlIIIIIIlllIlIllIl = this.IlIlIIIIIIlllIlIllIl;
            this.IlIlIIIIIIlllIlIllIl = Sets.newLinkedHashSet();
            net.optifine.IllIllIlllIllllIIllI.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll();
            final Iterator<lIllIIIIIlllIIlIIllI> iterator = (Iterator<lIllIIIIIlllIIlIIllI>)this.IIllIIllIIIlIlIIIIlI.iterator();
            while (iterator.hasNext()) {
                final IlIllIlIlIIIlIlIlIII llllIIIIlIIIlIlllIll9 = iterator.next().llllIIIIlIIIlIlllIll;
                if (llllIIIIlIIIlIlllIll9.llIIlIIIlIIIllIlIIIl() || ilIlIIIIIIlllIlIllIl.contains(llllIIIIlIIIlIlllIll9)) {
                    this.IlIIIlIlIIIllIlIlIIl = true;
                    final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl liiIlllIIIllIIIllIII = llllIIIIlIIIlIlllIll9.lIIIlllIIIllIIIllIII();
                    if (ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII() + 8, liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII() + 8, liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl() + 8) >= 768.0) {
                        this.IlIlIIIIIIlllIlIllIl.add(llllIIIIlIIIlIlllIll9);
                    }
                    else if (!llllIIIIlIIIlIlllIll9.llIllIlIIIIllIlIIllI()) {
                        this.llllIIIlIlllIlIIIIIl.add(llllIIIIlIIIlIlllIll9);
                    }
                    else {
                        this.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll("build near");
                        this.IllIllIlllIllllIIllI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll9);
                        llllIIIIlIIIlIlllIll9.llllIIIIlIIIlIlllIll(false);
                        this.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl();
                    }
                }
            }
            net.optifine.IllIllIlllIllllIIllI.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl();
            this.IlIlIIIIIIlllIlIllIl.addAll(ilIlIIIIIIlllIlIllIl);
            this.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl();
        }
    }
    
    private boolean llllIIIIlIIIlIlllIll(final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII) {
        final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl liiIlllIIIllIIIllIII = ilIllIlIlIIIlIlIlIII.lIIIlllIIIllIIIllIII();
        return net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() - liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII()) <= 16 && net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() - liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII()) <= 16 && net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() - liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl()) <= 16;
    }
    
    private Set IlIIIlIlIIIllIlIlIIl(final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl.IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl = new net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl.IlIlIIIIIIlllIlIllIl();
        final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2 = new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() >> 4 << 4, ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() >> 4 << 4, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() >> 4 << 4);
        final net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIlIlllIlIIIIIl = this.lllIIIIlllllIlIIllIl.llllIIIlIlllIlIIIIIl(ilIlIlIlIlllllllllIl2);
        for (final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl2 : net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl2, ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(15, 15, 15))) {
            if (llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI(llllIIIlIlllIlIIIIIl2).llllIIllllIlIlIIIIll()) {
                ilIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl2);
            }
        }
        return ilIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
    }
    
    private IlIllIlIlIIIlIlIlIII llllIIIIlIIIlIlllIll(final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII, final net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll lllIllIIIllllllIllll, final boolean b, final int n) {
        final IlIllIlIlIIIlIlIlIII llIllIIIIIllIlIIIIlI = ilIllIlIlIIIlIlIlIII.llIllIIIIIllIlIIIIlI(lllIllIIIllllllIllll);
        if (llIllIIIIIllIlIIIIlI == null) {
            return null;
        }
        if (llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII().lIIIlllIIIllIIIllIII() > n) {
            return null;
        }
        if (b) {
            final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl liiIlllIIIllIIIllIII = llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII();
            final int n2 = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() - liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII();
            final int n3 = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() - liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl();
            if (n2 * n2 + n3 * n3 > this.llIllIIlllllllllllll) {
                return null;
            }
        }
        return llIllIIIIIllIlIIIIlI;
    }
    
    private void llllIIIIlIIIlIlllIll(final double llllIIIIlIIIlIlllIll, final double ilIlIlIlIlllllllllIl, final double llIllIIIIIllIlIIIIlI) {
        this.lIIIIlIlIllllIIlIllI = new net.minecraft.client.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl();
        ((net.minecraft.client.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl)this.lIIIIlIlIllllIIlIllI).IlIlIlIlIlllllllllIl();
        final lllllIIllIlIllIllllI lllllIIllIlIllIllllI = new lllllIIllIlIllIllllI(this.lIIIIlIlIllllIIlIllI.llIllIIIIIllIlIIIIlI);
        lllllIIllIlIllIllllI.transpose();
        final lllllIIllIlIllIllllI lllllIIllIlIllIllllI2 = new lllllIIllIlIllIllllI(this.lIIIIlIlIllllIIlIllI.IlIlIlIlIlllllllllIl);
        lllllIIllIlIllIllllI2.transpose();
        final lllllIIllIlIllIllllI lllllIIllIlIllIllllI3 = new lllllIIllIlIllIllllI();
        net.minecraft.IlllllllIIIlIIIlIlII.lllllIIllIlIllIllllI.mul((Matrix4f)lllllIIllIlIllIllllI2, (Matrix4f)lllllIIllIlIllIllllI, (Matrix4f)lllllIIllIlIllIllllI3);
        lllllIIllIlIllIllllI3.invert();
        this.IlIIllIIllIIllIIlIIl.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIIllIIllIIllIIlIIl.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.IlIIllIIllIIllIIlIIl.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.llIIIlIlllIllIIlIllI[0] = new Vector4f(-1.0f, -1.0f, -1.0f, 1.0f);
        this.llIIIlIlllIllIIlIllI[1] = new Vector4f(1.0f, -1.0f, -1.0f, 1.0f);
        this.llIIIlIlllIllIIlIllI[2] = new Vector4f(1.0f, 1.0f, -1.0f, 1.0f);
        this.llIIIlIlllIllIIlIllI[3] = new Vector4f(-1.0f, 1.0f, -1.0f, 1.0f);
        this.llIIIlIlllIllIIlIllI[4] = new Vector4f(-1.0f, -1.0f, 1.0f, 1.0f);
        this.llIIIlIlllIllIIlIllI[5] = new Vector4f(1.0f, -1.0f, 1.0f, 1.0f);
        this.llIIIlIlllIllIIlIllI[6] = new Vector4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.llIIIlIlllIllIIlIllI[7] = new Vector4f(-1.0f, 1.0f, 1.0f, 1.0f);
        for (int i = 0; i < 8; ++i) {
            net.minecraft.IlllllllIIIlIIIlIlII.lllllIIllIlIllIllllI.transform((Matrix4f)lllllIIllIlIllIllllI3, this.llIIIlIlllIllIIlIllI[i], this.llIIIlIlllIllIIlIllI[i]);
            final Vector4f vector4f = this.llIIIlIlllIllIIlIllI[i];
            vector4f.x /= this.llIIIlIlllIllIIlIllI[i].w;
            final Vector4f vector4f2 = this.llIIIlIlllIllIIlIllI[i];
            vector4f2.y /= this.llIIIlIlllIllIIlIllI[i].w;
            final Vector4f vector4f3 = this.llIIIlIlllIllIIlIllI[i];
            vector4f3.z /= this.llIIIlIlllIllIIlIllI[i].w;
            this.llIIIlIlllIllIIlIllI[i].w = 1.0f;
        }
    }
    
    protected Vector3f llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final double n) {
        float n2 = (float)(llIllIIIIIllIlIIIIlI.IlIIIlIIIllllIlIlIlI + (llIllIIIIIllIlIIIIlI.llllllIllIllIlIllllI - llIllIIIIIllIlIIIIlI.IlIIIlIIIllllIlIlIlI) * n);
        final float n3 = (float)(llIllIIIIIllIlIIIIlI.IIIllllllIllIIIlllIl + (llIllIIIIIllIlIIIIlI.IIlIIIIIllIlIIIlIIll - llIllIIIIIllIlIIIIlI.IIIllllllIllIIIlllIl) * n);
        if (Minecraft.getMinecraft().IIIlIIIlIlIIlllIIlll.IIIllIIllIIIIIIlIIlI == 2) {
            n2 += 180.0f;
        }
        final float ilIlIlIlIlllllllllIl = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(-n3 * 0.017453292f - 3.1415927f);
        final float llllIIIIlIIIlIlllIll = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(-n3 * 0.017453292f - 3.1415927f);
        final float n4 = -net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(-n2 * 0.017453292f);
        return new Vector3f(llllIIIIlIIIlIlllIll * n4, net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(-n2 * 0.017453292f), ilIlIlIlIlllllllllIl * n4);
    }
    
    public int llllIIIIlIIIlIlllIll(final IlIIlIlIIIlIIlIlIlII ilIIlIlIIIlIIlIlIlII, final double n, final int n2, final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        net.minecraft.client.lIIIlllIIIllIIIllIII.lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll();
        if (ilIIlIlIIIlIIlIlIlII == net.minecraft.IlllllllIIIlIIIlIlII.IlIIlIlIIIlIIlIlIlII.IlIIIlIlIIIllIlIlIIl && !net.optifine.shaders.llIIlllIIlllIIllIllI.IIlllIIlIllIllIlIIll) {
            this.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll("translucent_sort");
            final double n3 = llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl - this.IllIIlllllIIllIIllIl;
            final double n4 = llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII - this.lIllIIIIIlllIIlIIllI;
            final double n5 = llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII - this.lIlIIlllIIlIIlIlllIl;
            if (n3 * n3 + n4 * n4 + n5 * n5 > 1.0) {
                this.IllIIlllllIIllIIllIl = llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl;
                this.lIllIIIIIlllIIlIIllI = llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII;
                this.lIlIIlllIIlIIlIlllIl = llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII;
                int n6 = 0;
                this.IllIIlllIIIIlllIIlIl.clear();
                for (final lIllIIIIIlllIIlIIllI lIllIIIIIlllIIlIIllI : this.IIllIIllIIIlIlIIIIlI) {
                    if (lIllIIIIIlllIIlIIllI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl(ilIIlIlIIIlIIlIlIlII) && n6++ < 15) {
                        this.IllIIlllIIIIlllIIlIl.add(lIllIIIIIlllIIlIIllI.llllIIIIlIIIlIlllIll);
                    }
                }
            }
            this.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl();
        }
        this.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll("filterempty");
        int n7 = 0;
        final boolean b = ilIIlIlIIIlIIlIlIlII == net.minecraft.IlllllllIIIlIIIlIlII.IlIIlIlIIIlIIlIlIlII.IlIIIlIlIIIllIlIlIIl;
        final int n8 = b ? (this.IIllIIllIIIlIlIIIIlI.size() - 1) : 0;
        for (int n9 = b ? -1 : this.IIllIIllIIIlIlIIIIlI.size(), n10 = b ? -1 : 1, i = n8; i != n9; i += n10) {
            final IlIllIlIlIIIlIlIlIII llllIIIIlIIIlIlllIll = this.IIllIIllIIIlIlIIIIlI.get(i).llllIIIIlIIIlIlllIll;
            if (!llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl().IlIlIlIlIlllllllllIl(ilIIlIlIIIlIIlIlIlII)) {
                ++n7;
                this.llIlIIIIIlIIlIlIIlll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, ilIIlIlIIIlIIlIlIlII);
            }
        }
        if (n7 == 0) {
            this.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl();
            return n7;
        }
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIIIlIIlIlIIlllIl() && this.llllIIIIlIIIlIlllIll.IlIllIlIlIIIlIlIlIII.lIIIlllIIIllIIIllIII) {
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IIIIlllIIIIIIlIIIlll();
        }
        this.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI("render_" + ilIIlIlIIIlIIlIlIlII);
        this.llllIIIIlIIIlIlllIll(ilIIlIlIIIlIIlIlIlII);
        this.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl();
        return n7;
    }
    
    private void llllIIIIlIIIlIlllIll(final IlIIlIlIIIlIIlIlIlII ilIIlIlIIIlIIlIlIlII) {
        this.llllIIIIlIIIlIlllIll.IlIllIlIlIIIlIlIlIII.lIIIIlIIIIIlllIllIII();
        if (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IllIIlllIIIIlllIIlIl()) {
            GL11.glEnableClientState(32884);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIlIIIllIIllIIIllI(net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IIlllIIlIllIllIlIIll);
            GL11.glEnableClientState(32888);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIlIIIllIIllIIIllI(net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lllIIIIlllllIlIIllIl);
            GL11.glEnableClientState(32888);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIlIIIllIIllIIIllI(net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IIlllIIlIllIllIlIIll);
            GL11.glEnableClientState(32886);
        }
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
            net.optifine.shaders.IIlllIIIlIlllIIlllII.llllIIIIlIIIlIlllIll(ilIIlIlIIIlIIlIlIlII);
        }
        this.llIlIIIIIlIIlIlIIlll.llllIIIIlIIIlIlllIll(ilIIlIlIIIlIIlIlIlII);
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
            net.optifine.shaders.IIlllIIIlIlllIIlllII.IlIlIlIlIlllllllllIl(ilIIlIlIIIlIIlIlIlII);
        }
        if (net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IllIIlllIIIIlllIIlIl()) {
            for (final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl : net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII()) {
                final IllIIlllIIIIlllIIlIl ilIlIlIlIlllllllllIl = ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl();
                final int ilIIIlIlIIIllIlIlIIl2 = ilIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl();
                switch (IlllllllIIIlIIIlIlII()[ilIlIlIlIlllllllllIl.ordinal()]) {
                    default: {
                        continue;
                    }
                    case 1: {
                        GL11.glDisableClientState(32884);
                        continue;
                    }
                    case 4: {
                        net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIlIIIllIIllIIIllI(net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IIlllIIlIllIllIlIIll + ilIIIlIlIIIllIlIlIIl2);
                        GL11.glDisableClientState(32888);
                        net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lIlIlIIIllIIllIIIllI(net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.IIlllIIlIllIllIlIIll);
                        continue;
                    }
                    case 3: {
                        GL11.glDisableClientState(32886);
                        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIIlllIIlllIIllIllI();
                        continue;
                    }
                }
            }
        }
        this.llllIIIIlIIIlIlllIll.IlIllIlIlIIIlIlIlIII.llllIIIlIlllIlIIIIIl();
    }
    
    private void llllIIIIlIIIlIlllIll(final Iterator iterator) {
        while (iterator.hasNext()) {
            if (this.lIllllllIIllIlIlIlII - iterator.next().llIllIIIIIllIlIIIIlI() > 400) {
                iterator.remove();
            }
        }
    }
    
    public void lIIIIlIIIIIlllIllIII() {
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
            if (Keyboard.isKeyDown(61) && Keyboard.isKeyDown(24)) {
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI().llllIIIIlIIIlIlllIll(new net.optifine.shaders.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl(null, net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.c()));
            }
            if (Keyboard.isKeyDown(61) && Keyboard.isKeyDown(19)) {
                net.optifine.shaders.llIIlllIIlllIIllIllI.IlllllllIIIlIIIlIlII();
                net.optifine.shaders.llIIlllIIlllIIllIllI.llIllIIIIIllIlIIIIlI();
            }
        }
        ++this.lIllllllIIllIlIlIlII;
        if (this.lIllllllIIllIlIlIlII % 20 == 0) {
            this.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl.values().iterator());
        }
    }
    
    private void llIIIlIlIllIIlIlIlII() {
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIIlllllIIllIIlllll()) {
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IIIIlllIIIIIIlIIIlll();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(770, 771, 1, 0);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(false);
            this.IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIIIIIlIlIIIIIIl.IIIIlllIIIIIIlIIIlll);
            final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll = net.minecraft.client.lIIIlllIIIllIIIllIII.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
            final net.minecraft.client.lIIIlllIIIllIIIllIII.lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
            for (int i = 0; i < 6; ++i) {
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
                if (i == 1) {
                    net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(90.0f, 1.0f, 0.0f, 0.0f);
                }
                if (i == 2) {
                    net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-90.0f, 1.0f, 0.0f, 0.0f);
                }
                if (i == 3) {
                    net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(180.0f, 1.0f, 0.0f, 0.0f);
                }
                if (i == 4) {
                    net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(90.0f, 0.0f, 0.0f, 1.0f);
                }
                if (i == 5) {
                    net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-90.0f, 0.0f, 0.0f, 1.0f);
                }
                llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI);
                int n = 40;
                int n2 = 40;
                int n3 = 40;
                if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lllIIIIlIlIllIIlIIIl()) {
                    final e ilIlIlIlIlllllllllIl = net.optifine.lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl(new e(n / 255.0, n2 / 255.0, n3 / 255.0), this.lllIIIIlllllIlIIllIl, this.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI(), 0.0f);
                    n = (int)(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll * 255.0);
                    n2 = (int)(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl * 255.0);
                    n3 = (int)(ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI * 255.0);
                }
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(-100.0, -100.0, -100.0).llllIIIIlIIIlIlllIll(0.0, 0.0).IlIlIlIlIlllllllllIl(n, n2, n3, 255).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(-100.0, -100.0, 100.0).llllIIIIlIIIlIlllIll(0.0, 16.0).IlIlIlIlIlllllllllIl(n, n2, n3, 255).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(100.0, -100.0, 100.0).llllIIIIlIIIlIlllIll(16.0, 16.0).IlIlIlIlIlllllllllIl(n, n2, n3, 255).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(100.0, -100.0, -100.0).llllIIIIlIIIlIlllIll(16.0, 0.0).IlIlIlIlIlllllllllIl(n, n2, n3, 255).IlIlIIIllIllIIIIIllI();
                llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
            }
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(true);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final float n, final int n2) {
        if (net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.L.llIllIIIIIllIlIIIIlI()) {
            final Object llllIIIlIlllIlIIIIIl = net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl(this.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.IlIllIlIlIIIlIlIlIII, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.L, new Object[0]);
            if (llllIIIlIlllIlIIIIIl != null) {
                net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.W, n, this.lllIIIIlllllIlIIllIl, this.llllIIIIlIIIlIlllIll);
                return;
            }
        }
        if (this.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.IlIllIlIlIIIlIlIlIII.IIlllIIlIllIllIlIIll() == 1) {
            this.llIIIlIlIllIIlIlIlII();
        }
        else if (this.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.IlIllIlIlIIIlIlIlIII.IlIIIlIlIIIllIlIlIIl()) {
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIIIlIIlIlIIlllIl();
            final boolean b = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b();
            if (b) {
                net.optifine.shaders.llIIlllIIlllIIllIllI.llllIllllIllllIlIlII();
            }
            final e llllIIIIlIIIlIlllIll = net.optifine.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(this.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI(), n), this.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl, this.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI().IIlllIlIIllIlIlIlIIl, this.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI().llIIIlIlIllIIlIlIlII + 1.0, this.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI().lllllIlIIIlIlIIlllII);
            if (b) {
                net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
            }
            float n3 = (float)llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll;
            float n4 = (float)llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl;
            float n5 = (float)llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI;
            if (n2 != 2) {
                final float n6 = (n3 * 30.0f + n4 * 59.0f + n5 * 11.0f) / 100.0f;
                final float n7 = (n3 * 30.0f + n4 * 70.0f) / 100.0f;
                final float n8 = (n3 * 30.0f + n5 * 70.0f) / 100.0f;
                n3 = n6;
                n4 = n7;
                n5 = n8;
            }
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(n3, n4, n5);
            final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll2 = net.minecraft.client.lIIIlllIIIllIIIllIII.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
            final net.minecraft.client.lIIIlllIIIllIIIllIII.lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll2.llIllIIIIIllIlIIIIlI();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(false);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIIIllIIllIlllllI();
            if (b) {
                net.optifine.shaders.llIIlllIIlllIIllIllI.llIllIIlllllllllllll();
            }
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(n3, n4, n5);
            if (b) {
                net.optifine.shaders.llIIlllIIlllIIllIllI.IIIIIllIIIIlIIIIllIl();
            }
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIIlllllIIllIIlllll()) {
                if (this.lllllIIIIIlIlIIIIIIl) {
                    this.llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll();
                    GL11.glEnableClientState(32884);
                    GL11.glVertexPointer(3, 5126, 12, 0L);
                    this.llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll(7);
                    this.llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl();
                    GL11.glDisableClientState(32884);
                }
                else {
                    net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIllIlIlIIIlIlIlIII(this.IIlIIIIlllIlllllIlII);
                }
            }
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IIIIlllIIIIIIlIIIlll();
            if (b) {
                net.optifine.shaders.llIIlllIIlllIIllIllI.lllllIIllIlIllIllllI();
            }
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(770, 771, 1, 0);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll();
            final float[] llllIIIIlIIIlIlllIll3 = this.lllIIIIlllllIlIIllIl.IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(this.lllIIIIlllllIlIIllIl.llIllIIIIIllIlIIIIlI(n), n);
            if (llllIIIIlIIIlIlllIll3 != null && net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lllllIIlIlIIIlIlIIIl()) {
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIIIlIIlIlIIlllIl();
                if (b) {
                    net.optifine.shaders.llIIlllIIlllIIllIllI.llllIllllIllllIlIlII();
                }
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIIlIIIlIIIllIlIIIl(7425);
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(90.0f, 1.0f, 0.0f, 0.0f);
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl((net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl(n)) < 0.0f) ? 180.0f : 0.0f, 0.0f, 0.0f, 1.0f);
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(90.0f, 0.0f, 0.0f, 1.0f);
                float n9 = llllIIIIlIIIlIlllIll3[0];
                float n10 = llllIIIIlIIIlIlllIll3[1];
                float n11 = llllIIIIlIIIlIlllIll3[2];
                if (n2 != 2) {
                    final float n12 = (n9 * 30.0f + n10 * 59.0f + n11 * 11.0f) / 100.0f;
                    final float n13 = (n9 * 30.0f + n10 * 70.0f) / 100.0f;
                    final float n14 = (n9 * 30.0f + n11 * 70.0f) / 100.0f;
                    n9 = n12;
                    n10 = n13;
                    n11 = n14;
                }
                llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(6, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII);
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(0.0, 100.0, 0.0).llllIIIIlIIIlIlllIll(n9, n10, n11, llllIIIIlIIIlIlllIll3[3]).IlIlIIIllIllIIIIIllI();
                for (int i = 0; i <= 16; ++i) {
                    final float n15 = i * 3.1415927f * 2.0f / 16.0f;
                    final float llllIIIIlIIIlIlllIll4 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n15);
                    final float ilIlIlIlIlllllllllIl = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n15);
                    llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll4 * 120.0f, ilIlIlIlIlllllllllIl * 120.0f, (double)(-ilIlIlIlIlllllllllIl * 40.0f * llllIIIIlIIIlIlllIll3[3])).llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3[0], llllIIIIlIIIlIlllIll3[1], llllIIIIlIIIlIlllIll3[2], 0.0f).IlIlIIIllIllIIIIIllI();
                }
                llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl();
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIIlIIIlIIIllIlIIIl(7424);
            }
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll();
            if (b) {
                net.optifine.shaders.llIIlllIIlllIIllIllI.IIlllllIllIllIlIlIII();
            }
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(770, 1, 1, 0);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
            final float n16 = 1.0f - this.lllIIIIlllllIlIIllIl.llIIlIIIlIIIllIlIIIl(n);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, n16);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-90.0f, 0.0f, 1.0f, 0.0f);
            net.optifine.IIIIIllIIIIlIIIIllIl.llllIIIIlIIIlIlllIll(this.lllIIIIlllllIlIIllIl, this.IlIllIlIlIIIlIlIlIII, n);
            if (b) {
                net.optifine.shaders.llIIlllIIlllIIllIllI.IIlllIlIIllIlIlIlIIl();
            }
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(this.lllIIIIlllllIlIIllIl.llIllIIIIIllIlIIIIlI(n) * 360.0f, 1.0f, 0.0f, 0.0f);
            if (b) {
                net.optifine.shaders.llIIlllIIlllIIllIllI.llIIIlIlIllIIlIlIlII();
            }
            final float n17 = 30.0f;
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlllllIllIllIlIlIII()) {
                this.IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIIIIIlIlIIIIIIl.lIlIlIIIllIIllIIIllI);
                llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII);
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(-n17, 100.0, -n17).llllIIIIlIIIlIlllIll(0.0, 0.0).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n17, 100.0, -n17).llllIIIIlIIIlIlllIll(1.0, 0.0).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n17, 100.0, n17).llllIIIIlIIIlIlllIll(1.0, 1.0).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(-n17, 100.0, n17).llllIIIIlIIIlIlllIll(0.0, 1.0).IlIlIIIllIllIIIIIllI();
                llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl();
            }
            final float n18 = 20.0f;
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIllllIllllIlIlII()) {
                this.IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIIIIIlIlIIIIIIl.llIllIlIIIIllIlIIllI);
                final int ilIlIIIllIIllIlllllI = this.lllIIIIlllllIlIIllIl.IlIlIIIllIIllIlllllI();
                final int n19 = ilIlIIIllIIllIlllllI % 4;
                final int n20 = ilIlIIIllIIllIlllllI / 4 % 2;
                final float n21 = (n19 + 0) / 4.0f;
                final float n22 = (n20 + 0) / 2.0f;
                final float n23 = (n19 + 1) / 4.0f;
                final float n24 = (n20 + 1) / 2.0f;
                llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII);
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(-n18, -100.0, n18).llllIIIIlIIIlIlllIll(n23, n24).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n18, -100.0, n18).llllIIIIlIIIlIlllIll(n21, n24).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n18, -100.0, -n18).llllIIIIlIIIlIlllIll(n21, n22).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(-n18, -100.0, -n18).llllIIIIlIIIlIlllIll(n23, n22).IlIlIIIllIllIIIIIllI();
                llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl();
            }
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIIIlIIlIlIIlllIl();
            if (b) {
                net.optifine.shaders.llIIlllIIlllIIllIllI.llllIllllIllllIlIlII();
            }
            final float n25 = this.lllIIIIlllllIlIIllIl.llllIIIlIlllIlIIIIIl(n) * n16;
            if (n25 > 0.0f && net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIIllIIIllllIlllIllI() && !net.optifine.IIIIIllIIIIlIIIIllIl.llllIIIIlIIIlIlllIll(this.lllIIIIlllllIlIIllIl)) {
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(n25, n25, n25, n25);
                if (this.lllllIIIIIlIlIIIIIIl) {
                    this.IIlllIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll();
                    GL11.glEnableClientState(32884);
                    GL11.glVertexPointer(3, 5126, 12, 0L);
                    this.IIlllIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll(7);
                    this.IIlllIlIIllIlIlIlIIl.IlIlIlIlIlllllllllIl();
                    GL11.glDisableClientState(32884);
                }
                else {
                    net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIllIlIlIIIlIlIlIII(this.IlllllllIIIlIIIlIlII);
                }
            }
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIIIllIIllIlllllI();
            if (b) {
                net.optifine.shaders.llIIlllIIlllIIllIllI.llIllIIlllllllllllll();
            }
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIIIlIIlIlIIlllIl();
            if (b) {
                net.optifine.shaders.llIIlllIIlllIIllIllI.llllIllllIllllIlIlII();
            }
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(0.0f, 0.0f, 0.0f);
            final double n26 = this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl(n).IlIlIlIlIlllllllllIl - this.lllIIIIlllllIlIIllIl.IIIIIIIIIlllIllIlIlI();
            if (n26 < 0.0) {
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, 12.0f, 0.0f);
                if (this.lllllIIIIIlIlIIIIIIl) {
                    this.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll();
                    GL11.glEnableClientState(32884);
                    GL11.glVertexPointer(3, 5126, 12, 0L);
                    this.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(7);
                    this.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl();
                    GL11.glDisableClientState(32884);
                }
                else {
                    net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIllIlIlIIIlIlIlIII(this.IIIlIIlIIIIlllIlllII);
                }
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
                final float n27 = -(float)(n26 + 65.0);
                llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII);
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(-1.0, n27, 1.0).IlIlIlIlIlllllllllIl(0, 0, 0, 255).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(1.0, n27, 1.0).IlIlIlIlIlllllllllIl(0, 0, 0, 255).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(1.0, -1.0, 1.0).IlIlIlIlIlllllllllIl(0, 0, 0, 255).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(-1.0, -1.0, 1.0).IlIlIlIlIlllllllllIl(0, 0, 0, 255).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(-1.0, -1.0, -1.0).IlIlIlIlIlllllllllIl(0, 0, 0, 255).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(1.0, -1.0, -1.0).IlIlIlIlIlllllllllIl(0, 0, 0, 255).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(1.0, n27, -1.0).IlIlIlIlIlllllllllIl(0, 0, 0, 255).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(-1.0, n27, -1.0).IlIlIlIlIlllllllllIl(0, 0, 0, 255).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(1.0, -1.0, -1.0).IlIlIlIlIlllllllllIl(0, 0, 0, 255).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(1.0, -1.0, 1.0).IlIlIlIlIlllllllllIl(0, 0, 0, 255).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(1.0, n27, 1.0).IlIlIlIlIlllllllllIl(0, 0, 0, 255).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(1.0, n27, -1.0).IlIlIlIlIlllllllllIl(0, 0, 0, 255).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(-1.0, n27, -1.0).IlIlIlIlIlllllllllIl(0, 0, 0, 255).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(-1.0, n27, 1.0).IlIlIlIlIlllllllllIl(0, 0, 0, 255).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(-1.0, -1.0, 1.0).IlIlIlIlIlllllllllIl(0, 0, 0, 255).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(-1.0, -1.0, -1.0).IlIlIlIlIlllllllllIl(0, 0, 0, 255).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(-1.0, -1.0, -1.0).IlIlIlIlIlllllllllIl(0, 0, 0, 255).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(-1.0, -1.0, 1.0).IlIlIlIlIlllllllllIl(0, 0, 0, 255).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(1.0, -1.0, 1.0).IlIlIlIlIlllllllllIl(0, 0, 0, 255).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(1.0, -1.0, -1.0).IlIlIlIlIlllllllllIl(0, 0, 0, 255).IlIlIIIllIllIIIIIllI();
                llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl();
            }
            if (this.lllIIIIlllllIlIIllIl.IlIllIlIlIIIlIlIlIII.llllIIIlIlllIlIIIIIl()) {
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(n3 * 0.2f + 0.04f, n4 * 0.2f + 0.04f, n5 * 0.6f + 0.1f);
            }
            else {
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(n3, n4, n5);
            }
            if (this.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll.llIllIIIIIllIlIIIIlI <= 4) {
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(this.llllIIIIlIIIlIlllIll.IlIllIlIlIIIlIlIlIII.IlIIIlIlIIIllIlIlIIl, this.llllIIIIlIIIlIlllIll.IlIllIlIlIIIlIlIlIII.IlIlIIIllIllIIIIIllI, this.llllIIIIlIIIlIlllIll.IlIllIlIlIIIlIlIlIII.IllIIlllIIIIlllIIlIl);
            }
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, -(float)(n26 - 16.0), 0.0f);
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIIlllllIIllIIlllll()) {
                if (this.lllllIIIIIlIlIIIIIIl) {
                    this.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll();
                    net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IIIIlllIIIIIIlIIIlll(32884);
                    net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl(3, 5126, 12, 0);
                    this.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(7);
                    this.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl();
                    net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIIIllIIllIlllllI(32884);
                }
                else {
                    net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIllIlIlIIIlIlIlIII(this.IIIlIIlIIIIlllIlllII);
                }
            }
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll();
            if (b) {
                net.optifine.shaders.llIIlllIIlllIIllIllI.IIlllllIllIllIlIlIII();
            }
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(true);
        }
    }
    
    public void IlIlIlIlIlllllllllIl(float n, final int n2) {
        if (!net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII()) {
            if (net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.K.llIllIIIIIllIlIIIIlI()) {
                final Object llllIIIlIlllIlIIIIIl = net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl(this.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.IlIllIlIlIIIlIlIlIII, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.K, new Object[0]);
                if (llllIIIlIlllIlIIIIIl != null) {
                    net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.W, n, this.lllIIIIlllllIlIIllIl, this.llllIIIIlIIIlIlllIll);
                    return;
                }
            }
            if (this.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.IlIllIlIlIIIlIlIlIII.IlIIIlIlIIIllIlIlIIl()) {
                if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
                    net.optifine.shaders.llIIlllIIlllIIllIllI.lllIllIIIllllllIllll();
                }
                if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII()) {
                    this.llIllIIIIIllIlIIIIlI(n, n2);
                }
                else {
                    final float n3 = n;
                    n = 0.0f;
                    net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIllIlIlIIIlIlIlIII();
                    final float n4 = (float)(this.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI().IIlIIIlllIllIllIlIII + (this.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI().llIIIlIlIllIIlIlIlII - this.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI().IIlIIIlllIllIllIlIII) * n);
                    final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll = net.minecraft.client.lIIIlllIIIllIIIllIII.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
                    final net.minecraft.client.lIIIlllIIIllIIIllIII.lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
                    this.IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIIIIIlIlIIIIIIl.IlIlIIIllIIllIlllllI);
                    net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
                    net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(770, 771, 1, 0);
                    final e ilIlIIIllIllIIIIIllI = this.lllIIIIlllllIlIIllIl.IlIlIIIllIllIIIIIllI(n);
                    float n5 = (float)ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll;
                    float n6 = (float)ilIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl;
                    float n7 = (float)ilIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;
                    this.llIIIllIlIllIllIIIIl.llllIIIIlIIIlIlllIll(false, this.lIllllllIIllIlIlIlII, n3, ilIlIIIllIllIIIIIllI);
                    if (this.llIIIllIlIllIllIIIIl.llllIIIIlIIIlIlllIll()) {
                        this.llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl();
                        if (n2 != 2) {
                            final float n8 = (n5 * 30.0f + n6 * 59.0f + n7 * 11.0f) / 100.0f;
                            final float n9 = (n5 * 30.0f + n6 * 70.0f) / 100.0f;
                            final float n10 = (n5 * 30.0f + n7 * 70.0f) / 100.0f;
                            n5 = n8;
                            n6 = n9;
                            n7 = n10;
                        }
                        final double n11 = this.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI().IIlIIIIlllIlllllIlII + (this.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI().IIlllIlIIllIlIlIlIIl - this.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI().IIlIIIIlllIlllllIlII) * n + (this.lIllllllIIllIlIlIlII + n) * 0.029999999329447746;
                        final double n12 = this.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI().IlIlIllllllllIIIIlII + (this.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI().lllllIlIIIlIlIIlllII - this.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI().IlIlIllllllllIIIIlII) * n;
                        final int llIllIIIIIllIlIIIIlI2 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n11 / 2048.0);
                        final int llIllIIIIIllIlIIIIlI3 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n12 / 2048.0);
                        final double n13 = n11 - llIllIIIIIllIlIIIIlI2 * 2048;
                        final double n14 = n12 - llIllIIIIIllIlIIIIlI3 * 2048;
                        final float n15 = this.lllIIIIlllllIlIIllIl.IlIllIlIlIIIlIlIlIII.IllIIlllIIIIlllIIlIl() - n4 + 0.33f + this.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll.g * 128.0f;
                        final float n16 = (float)(n13 * 4.8828125E-4);
                        final float n17 = (float)(n14 * 4.8828125E-4);
                        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI);
                        for (int i = -256; i < 256; i += 32) {
                            for (int j = -256; j < 256; j += 32) {
                                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(i + 0, n15, (double)(j + 32)).llllIIIIlIIIlIlllIll((i + 0) * 4.8828125E-4f + n16, (j + 32) * 4.8828125E-4f + n17).llllIIIIlIIIlIlllIll(n5, n6, n7, 0.8f).IlIlIIIllIllIIIIIllI();
                                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(i + 32, n15, (double)(j + 32)).llllIIIIlIIIlIlllIll((i + 32) * 4.8828125E-4f + n16, (j + 32) * 4.8828125E-4f + n17).llllIIIIlIIIlIlllIll(n5, n6, n7, 0.8f).IlIlIIIllIllIIIIIllI();
                                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(i + 32, n15, (double)(j + 0)).llllIIIIlIIIlIlllIll((i + 32) * 4.8828125E-4f + n16, (j + 0) * 4.8828125E-4f + n17).llllIIIIlIIIlIlllIll(n5, n6, n7, 0.8f).IlIlIIIllIllIIIIIllI();
                                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(i + 0, n15, (double)(j + 0)).llllIIIIlIIIlIlllIll((i + 0) * 4.8828125E-4f + n16, (j + 0) * 4.8828125E-4f + n17).llllIIIIlIIIlIlllIll(n5, n6, n7, 0.8f).IlIlIIIllIllIIIIIllI();
                            }
                        }
                        llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
                        this.llIIIllIlIllIllIIIIl.llIllIIIIIllIlIIIIlI();
                    }
                    this.llIIIllIlIllIllIIIIl.IlIIIlIlIIIllIlIlIIl();
                    net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
                    net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
                    net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIllllIlIlIIIIll();
                }
                if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
                    net.optifine.shaders.llIIlllIIlllIIllIllI.llIllIlIlIIIIIIIllII();
                }
            }
        }
    }
    
    public boolean llllIIIIlIIIlIlllIll(final double n, final double n2, final double n3, final float n4) {
        return false;
    }
    
    private void llIllIIIIIllIlIIIIlI(float n, final int n2) {
        n = 0.0f;
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIllIlIlIIIlIlIlIII();
        final float n3 = (float)(this.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI().IIlIIIlllIllIllIlIII + (this.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI().llIIIlIlIllIIlIlIlII - this.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI().IIlIIIlllIllIllIlIII) * n);
        final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll = net.minecraft.client.lIIIlllIIIllIIIllIII.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
        final net.minecraft.client.lIIIlllIIIllIIIllIII.lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
        final double n4 = (this.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI().IIlIIIIlllIlllllIlII + (this.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI().IIlllIlIIllIlIlIlIIl - this.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI().IIlIIIIlllIlllllIlII) * n + (this.lIllllllIIllIlIlIlII + n) * 0.029999999329447746) / 12.0;
        final double n5 = (this.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI().IlIlIllllllllIIIIlII + (this.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI().lllllIlIIIlIlIIlllII - this.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI().IlIlIllllllllIIIIlII) * n) / 12.0 + 0.33000001311302185;
        final float n6 = this.lllIIIIlllllIlIIllIl.IlIllIlIlIIIlIlIlIII.IllIIlllIIIIlllIIlIl() - n3 + 0.33f + this.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll.g * 128.0f;
        final int llIllIIIIIllIlIIIIlI2 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n4 / 2048.0);
        final int llIllIIIIIllIlIIIIlI3 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n5 / 2048.0);
        final double n7 = n4 - llIllIIIIIllIlIIIIlI2 * 2048;
        final double n8 = n5 - llIllIIIIIllIlIIIIlI3 * 2048;
        this.IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIIIIIlIlIIIIIIl.IlIlIIIllIIllIlllllI);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(770, 771, 1, 0);
        final e ilIlIIIllIllIIIIIllI = this.lllIIIIlllllIlIIllIl.IlIlIIIllIllIIIIIllI(n);
        float n9 = (float)ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll;
        float n10 = (float)ilIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl;
        float n11 = (float)ilIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;
        this.llIIIllIlIllIllIIIIl.llllIIIIlIIIlIlllIll(true, this.lIllllllIIllIlIlIlII, n, ilIlIIIllIllIIIIIllI);
        if (n2 != 2) {
            final float n12 = (n9 * 30.0f + n10 * 59.0f + n11 * 11.0f) / 100.0f;
            final float n13 = (n9 * 30.0f + n10 * 70.0f) / 100.0f;
            final float n14 = (n9 * 30.0f + n11 * 70.0f) / 100.0f;
            n9 = n12;
            n10 = n13;
            n11 = n14;
        }
        final float n15 = n9 * 0.9f;
        final float n16 = n10 * 0.9f;
        final float n17 = n11 * 0.9f;
        final float n18 = n9 * 0.7f;
        final float n19 = n10 * 0.7f;
        final float n20 = n11 * 0.7f;
        final float n21 = n9 * 0.8f;
        final float n22 = n10 * 0.8f;
        final float n23 = n11 * 0.8f;
        final float n24 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n7) * 0.00390625f;
        final float n25 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n8) * 0.00390625f;
        final float n26 = (float)(n7 - net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n7));
        final float n27 = (float)(n8 - net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n8));
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(12.0f, 1.0f, 12.0f);
        for (int i = 0; i < 2; ++i) {
            if (i == 0) {
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(false, false, false, false);
            }
            else {
                switch (n2) {
                    case 0: {
                        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(false, true, true, true);
                        break;
                    }
                    case 1: {
                        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(true, false, false, true);
                        break;
                    }
                    case 2: {
                        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(true, true, true, true);
                        break;
                    }
                }
            }
            this.llIIIllIlIllIllIIIIl.IlIIIlIlIIIllIlIlIIl();
        }
        if (this.llIIIllIlIllIllIIIIl.llllIIIIlIIIlIlllIll()) {
            this.llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl();
            for (int j = -3; j <= 4; ++j) {
                for (int k = -3; k <= 4; ++k) {
                    llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.IIIIlllIIIIIIlIIIlll);
                    final float n28 = (float)(j * 8);
                    final float n29 = (float)(k * 8);
                    final float n30 = n28 - n26;
                    final float n31 = n29 - n27;
                    if (n6 > -5.0f) {
                        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n30 + 0.0f, n6 + 0.0f, (double)(n31 + 8.0f)).llllIIIIlIIIlIlllIll((n28 + 0.0f) * 0.00390625f + n24, (n29 + 8.0f) * 0.00390625f + n25).llllIIIIlIIIlIlllIll(n18, n19, n20, 0.8f).llIllIIIIIllIlIIIIlI(0.0f, -1.0f, 0.0f).IlIlIIIllIllIIIIIllI();
                        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n30 + 8.0f, n6 + 0.0f, (double)(n31 + 8.0f)).llllIIIIlIIIlIlllIll((n28 + 8.0f) * 0.00390625f + n24, (n29 + 8.0f) * 0.00390625f + n25).llllIIIIlIIIlIlllIll(n18, n19, n20, 0.8f).llIllIIIIIllIlIIIIlI(0.0f, -1.0f, 0.0f).IlIlIIIllIllIIIIIllI();
                        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n30 + 8.0f, n6 + 0.0f, (double)(n31 + 0.0f)).llllIIIIlIIIlIlllIll((n28 + 8.0f) * 0.00390625f + n24, (n29 + 0.0f) * 0.00390625f + n25).llllIIIIlIIIlIlllIll(n18, n19, n20, 0.8f).llIllIIIIIllIlIIIIlI(0.0f, -1.0f, 0.0f).IlIlIIIllIllIIIIIllI();
                        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n30 + 0.0f, n6 + 0.0f, (double)(n31 + 0.0f)).llllIIIIlIIIlIlllIll((n28 + 0.0f) * 0.00390625f + n24, (n29 + 0.0f) * 0.00390625f + n25).llllIIIIlIIIlIlllIll(n18, n19, n20, 0.8f).llIllIIIIIllIlIIIIlI(0.0f, -1.0f, 0.0f).IlIlIIIllIllIIIIIllI();
                    }
                    if (n6 <= 5.0f) {
                        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n30 + 0.0f, n6 + 4.0f - 9.765625E-4f, (double)(n31 + 8.0f)).llllIIIIlIIIlIlllIll((n28 + 0.0f) * 0.00390625f + n24, (n29 + 8.0f) * 0.00390625f + n25).llllIIIIlIIIlIlllIll(n9, n10, n11, 0.8f).llIllIIIIIllIlIIIIlI(0.0f, 1.0f, 0.0f).IlIlIIIllIllIIIIIllI();
                        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n30 + 8.0f, n6 + 4.0f - 9.765625E-4f, (double)(n31 + 8.0f)).llllIIIIlIIIlIlllIll((n28 + 8.0f) * 0.00390625f + n24, (n29 + 8.0f) * 0.00390625f + n25).llllIIIIlIIIlIlllIll(n9, n10, n11, 0.8f).llIllIIIIIllIlIIIIlI(0.0f, 1.0f, 0.0f).IlIlIIIllIllIIIIIllI();
                        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n30 + 8.0f, n6 + 4.0f - 9.765625E-4f, (double)(n31 + 0.0f)).llllIIIIlIIIlIlllIll((n28 + 8.0f) * 0.00390625f + n24, (n29 + 0.0f) * 0.00390625f + n25).llllIIIIlIIIlIlllIll(n9, n10, n11, 0.8f).llIllIIIIIllIlIIIIlI(0.0f, 1.0f, 0.0f).IlIlIIIllIllIIIIIllI();
                        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n30 + 0.0f, n6 + 4.0f - 9.765625E-4f, (double)(n31 + 0.0f)).llllIIIIlIIIlIlllIll((n28 + 0.0f) * 0.00390625f + n24, (n29 + 0.0f) * 0.00390625f + n25).llllIIIIlIIIlIlllIll(n9, n10, n11, 0.8f).llIllIIIIIllIlIIIIlI(0.0f, 1.0f, 0.0f).IlIlIIIllIllIIIIIllI();
                    }
                    if (j > -1) {
                        for (int l = 0; l < 8; ++l) {
                            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n30 + l + 0.0f, n6 + 0.0f, (double)(n31 + 8.0f)).llllIIIIlIIIlIlllIll((n28 + l + 0.5f) * 0.00390625f + n24, (n29 + 8.0f) * 0.00390625f + n25).llllIIIIlIIIlIlllIll(n15, n16, n17, 0.8f).llIllIIIIIllIlIIIIlI(-1.0f, 0.0f, 0.0f).IlIlIIIllIllIIIIIllI();
                            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n30 + l + 0.0f, n6 + 4.0f, (double)(n31 + 8.0f)).llllIIIIlIIIlIlllIll((n28 + l + 0.5f) * 0.00390625f + n24, (n29 + 8.0f) * 0.00390625f + n25).llllIIIIlIIIlIlllIll(n15, n16, n17, 0.8f).llIllIIIIIllIlIIIIlI(-1.0f, 0.0f, 0.0f).IlIlIIIllIllIIIIIllI();
                            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n30 + l + 0.0f, n6 + 4.0f, (double)(n31 + 0.0f)).llllIIIIlIIIlIlllIll((n28 + l + 0.5f) * 0.00390625f + n24, (n29 + 0.0f) * 0.00390625f + n25).llllIIIIlIIIlIlllIll(n15, n16, n17, 0.8f).llIllIIIIIllIlIIIIlI(-1.0f, 0.0f, 0.0f).IlIlIIIllIllIIIIIllI();
                            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n30 + l + 0.0f, n6 + 0.0f, (double)(n31 + 0.0f)).llllIIIIlIIIlIlllIll((n28 + l + 0.5f) * 0.00390625f + n24, (n29 + 0.0f) * 0.00390625f + n25).llllIIIIlIIIlIlllIll(n15, n16, n17, 0.8f).llIllIIIIIllIlIIIIlI(-1.0f, 0.0f, 0.0f).IlIlIIIllIllIIIIIllI();
                        }
                    }
                    if (j <= 1) {
                        for (int n32 = 0; n32 < 8; ++n32) {
                            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n30 + n32 + 1.0f - 9.765625E-4f, n6 + 0.0f, (double)(n31 + 8.0f)).llllIIIIlIIIlIlllIll((n28 + n32 + 0.5f) * 0.00390625f + n24, (n29 + 8.0f) * 0.00390625f + n25).llllIIIIlIIIlIlllIll(n15, n16, n17, 0.8f).llIllIIIIIllIlIIIIlI(1.0f, 0.0f, 0.0f).IlIlIIIllIllIIIIIllI();
                            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n30 + n32 + 1.0f - 9.765625E-4f, n6 + 4.0f, (double)(n31 + 8.0f)).llllIIIIlIIIlIlllIll((n28 + n32 + 0.5f) * 0.00390625f + n24, (n29 + 8.0f) * 0.00390625f + n25).llllIIIIlIIIlIlllIll(n15, n16, n17, 0.8f).llIllIIIIIllIlIIIIlI(1.0f, 0.0f, 0.0f).IlIlIIIllIllIIIIIllI();
                            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n30 + n32 + 1.0f - 9.765625E-4f, n6 + 4.0f, (double)(n31 + 0.0f)).llllIIIIlIIIlIlllIll((n28 + n32 + 0.5f) * 0.00390625f + n24, (n29 + 0.0f) * 0.00390625f + n25).llllIIIIlIIIlIlllIll(n15, n16, n17, 0.8f).llIllIIIIIllIlIIIIlI(1.0f, 0.0f, 0.0f).IlIlIIIllIllIIIIIllI();
                            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n30 + n32 + 1.0f - 9.765625E-4f, n6 + 0.0f, (double)(n31 + 0.0f)).llllIIIIlIIIlIlllIll((n28 + n32 + 0.5f) * 0.00390625f + n24, (n29 + 0.0f) * 0.00390625f + n25).llllIIIIlIIIlIlllIll(n15, n16, n17, 0.8f).llIllIIIIIllIlIIIIlI(1.0f, 0.0f, 0.0f).IlIlIIIllIllIIIIIllI();
                        }
                    }
                    if (k > -1) {
                        for (int n33 = 0; n33 < 8; ++n33) {
                            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n30 + 0.0f, n6 + 4.0f, (double)(n31 + n33 + 0.0f)).llllIIIIlIIIlIlllIll((n28 + 0.0f) * 0.00390625f + n24, (n29 + n33 + 0.5f) * 0.00390625f + n25).llllIIIIlIIIlIlllIll(n21, n22, n23, 0.8f).llIllIIIIIllIlIIIIlI(0.0f, 0.0f, -1.0f).IlIlIIIllIllIIIIIllI();
                            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n30 + 8.0f, n6 + 4.0f, (double)(n31 + n33 + 0.0f)).llllIIIIlIIIlIlllIll((n28 + 8.0f) * 0.00390625f + n24, (n29 + n33 + 0.5f) * 0.00390625f + n25).llllIIIIlIIIlIlllIll(n21, n22, n23, 0.8f).llIllIIIIIllIlIIIIlI(0.0f, 0.0f, -1.0f).IlIlIIIllIllIIIIIllI();
                            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n30 + 8.0f, n6 + 0.0f, (double)(n31 + n33 + 0.0f)).llllIIIIlIIIlIlllIll((n28 + 8.0f) * 0.00390625f + n24, (n29 + n33 + 0.5f) * 0.00390625f + n25).llllIIIIlIIIlIlllIll(n21, n22, n23, 0.8f).llIllIIIIIllIlIIIIlI(0.0f, 0.0f, -1.0f).IlIlIIIllIllIIIIIllI();
                            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n30 + 0.0f, n6 + 0.0f, (double)(n31 + n33 + 0.0f)).llllIIIIlIIIlIlllIll((n28 + 0.0f) * 0.00390625f + n24, (n29 + n33 + 0.5f) * 0.00390625f + n25).llllIIIIlIIIlIlllIll(n21, n22, n23, 0.8f).llIllIIIIIllIlIIIIlI(0.0f, 0.0f, -1.0f).IlIlIIIllIllIIIIIllI();
                        }
                    }
                    if (k <= 1) {
                        for (int n34 = 0; n34 < 8; ++n34) {
                            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n30 + 0.0f, n6 + 4.0f, (double)(n31 + n34 + 1.0f - 9.765625E-4f)).llllIIIIlIIIlIlllIll((n28 + 0.0f) * 0.00390625f + n24, (n29 + n34 + 0.5f) * 0.00390625f + n25).llllIIIIlIIIlIlllIll(n21, n22, n23, 0.8f).llIllIIIIIllIlIIIIlI(0.0f, 0.0f, 1.0f).IlIlIIIllIllIIIIIllI();
                            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n30 + 8.0f, n6 + 4.0f, (double)(n31 + n34 + 1.0f - 9.765625E-4f)).llllIIIIlIIIlIlllIll((n28 + 8.0f) * 0.00390625f + n24, (n29 + n34 + 0.5f) * 0.00390625f + n25).llllIIIIlIIIlIlllIll(n21, n22, n23, 0.8f).llIllIIIIIllIlIIIIlI(0.0f, 0.0f, 1.0f).IlIlIIIllIllIIIIIllI();
                            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n30 + 8.0f, n6 + 0.0f, (double)(n31 + n34 + 1.0f - 9.765625E-4f)).llllIIIIlIIIlIlllIll((n28 + 8.0f) * 0.00390625f + n24, (n29 + n34 + 0.5f) * 0.00390625f + n25).llllIIIIlIIIlIlllIll(n21, n22, n23, 0.8f).llIllIIIIIllIlIIIIlI(0.0f, 0.0f, 1.0f).IlIlIIIllIllIIIIIllI();
                            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n30 + 0.0f, n6 + 0.0f, (double)(n31 + n34 + 1.0f - 9.765625E-4f)).llllIIIIlIIIlIlllIll((n28 + 0.0f) * 0.00390625f + n24, (n29 + n34 + 0.5f) * 0.00390625f + n25).llllIIIIlIIIlIlllIll(n21, n22, n23, 0.8f).llIllIIIIIllIlIIIIlI(0.0f, 0.0f, 1.0f).IlIlIIIllIllIIIIIllI();
                        }
                    }
                    llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
                }
            }
            this.llIIIllIlIllIllIIIIl.llIllIIIIIllIlIIIIlI();
        }
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIllllIlIlIIIIll();
    }
    
    public void llllIIIIlIIIlIlllIll(long n) {
        n += (long)1.0E8;
        this.IlIIIlIlIIIllIlIlIIl |= this.IllIllIlllIllllIIllI.llllIIIIlIIIlIlllIll(n);
        if (this.llllIIIlIlllIlIIIIIl.size() > 0) {
            final Iterator iterator = this.llllIIIlIlllIlIIIIIl.iterator();
            while (iterator.hasNext()) {
                final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII = iterator.next();
                if (!this.IllIllIlllIllllIIllI.llllIIIIlIIIlIlllIll(ilIllIlIlIIIlIlIlIII)) {
                    break;
                }
                ilIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(false);
                iterator.remove();
                this.IlIlIIIIIIlllIlIllIl.remove(ilIllIlIlIIIlIlIlIII);
                this.IllIIlllIIIIlllIIlIl.remove(ilIllIlIlIIIlIlIlIII);
            }
        }
        if (this.IllIIlllIIIIlllIIlIl.size() > 0) {
            final Iterator iterator2 = this.IllIIlllIIIIlllIIlIl.iterator();
            if (iterator2.hasNext() && this.IllIllIlllIllllIIllI.llIllIIIIIllIlIIIIlI(iterator2.next())) {
                iterator2.remove();
            }
        }
        double n2 = 0.0;
        final int iiIlIIlIIIIlllIlllII = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII();
        if (!this.IlIlIIIIIIlllIlIllIl.isEmpty()) {
            final Iterator iterator3 = this.IlIlIIIIIIlllIlIllIl.iterator();
            while (iterator3.hasNext()) {
                final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII2 = iterator3.next();
                final boolean ilIlIIIllIIllIlllllI = ilIllIlIlIIIlIlIlIII2.IlIlIIIllIIllIlllllI();
                boolean b;
                if (ilIlIIIllIIllIlllllI) {
                    b = this.IllIllIlllIllllIIllI.IlIlIlIlIlllllllllIl(ilIllIlIlIIIlIlIlIII2);
                }
                else {
                    b = this.IllIllIlllIllllIIllI.llllIIIIlIIIlIlllIll(ilIllIlIlIIIlIlIlIII2);
                }
                if (!b) {
                    break;
                }
                ilIllIlIlIIIlIlIlIII2.llllIIIIlIIIlIlllIll(false);
                iterator3.remove();
                if (ilIlIIIllIIllIlllllI) {
                    continue;
                }
                n2 += 2.0 * net.optifine.util.IIlllIIIlIlllIIlllII.IlIlIlIlIlllllllllIl(ilIllIlIlIIIlIlIlIII2);
                if (n2 > iiIlIIlIIIIlllIlllII) {
                    break;
                }
            }
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final float n) {
        final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll = net.minecraft.client.lIIIlllIIIllIIIllIII.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
        final net.minecraft.client.lIIIlllIIIllIIIllIII.lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI2 = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
        final net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI illIllIlllIllllIIllI = this.lllIIIIlllllIlIIllIl.IllIllIlllIllllIIllI();
        final double n2 = this.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll.llIllIIIIIllIlIIIIlI * 16;
        if (llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl >= illIllIlllIllllIIllI.IllIIlllIIIIlllIIlIl() - n2 || llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl <= illIllIlllIllllIIllI.IlIIIlIlIIIllIlIlIIl() + n2 || llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII >= illIllIlllIllllIIllI.llllIIIlIlllIlIIIIIl() - n2 || llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII <= illIllIlllIllllIIllI.IlIlIIIllIllIIIIIllI() + n2) {
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
                net.optifine.shaders.llIIlllIIlllIIllIllI.IIlIlIllllIlllIIIIll();
                net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.bj);
            }
            final double pow = Math.pow(1.0 - illIllIlllIllllIIllI.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI) / n2, 4.0);
            final double n3 = llIllIIIIIllIlIIIIlI.lIIlIIIlIllIlIllIIIl + (llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl - llIllIIIIIllIlIIIIlI.lIIlIIIlIllIlIllIIIl) * n;
            final double n4 = llIllIIIIIllIlIIIIlI.IIlIIIlllIllIllIlIII + (llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII - llIllIIIIIllIlIIIIlI.IIlIIIlllIllIllIlIII) * n;
            final double n5 = llIllIIIIIllIlIIIIlI.lIlIlIlllIIlIlIlllIl + (llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII - llIllIIIIIllIlIIIIlI.lIlIlIlllIIlIlIlllIl) * n;
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(770, 1, 1, 0);
            this.IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIIIIIlIlIIIIIIl.llllIIllllIlIlIIIIll);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(false);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
            final int llllIIIIlIIIlIlllIll2 = illIllIlllIllllIIllI.llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI((llllIIIIlIIIlIlllIll2 >> 16 & 0xFF) / 255.0f, (llllIIIIlIIIlIlllIll2 >> 8 & 0xFF) / 255.0f, (llllIIIIlIIIlIlllIll2 & 0xFF) / 255.0f, (float)pow);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(-3.0f, -3.0f);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IIlllIIlIllIllIlIIll();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(516, 0.1f);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIllIlIlIIIlIlIlIII();
            final float n6 = Minecraft.IIIllllllIllIIIlllIl() % 3000L / 3000.0f;
            llIllIIIIIllIlIIIIlI2.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII);
            llIllIIIIIllIlIIIIlI2.llIllIIIIIllIlIIIIlI(-n3, -n4, -n5);
            final double max = Math.max(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n5 - n2), illIllIlllIllllIIllI.IlIlIIIllIllIIIIIllI());
            final double min = Math.min(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IllIIlllIIIIlllIIlIl(n5 + n2), illIllIlllIllllIIllI.llllIIIlIlllIlIIIIIl());
            if (n3 > illIllIlllIllllIIllI.IllIIlllIIIIlllIIlIl() - n2) {
                float n7 = 0.0f;
                for (double n8 = max; n8 < min; ++n8, n7 += 0.5f) {
                    final double min2 = Math.min(1.0, min - n8);
                    final float n9 = (float)min2 * 0.5f;
                    llIllIIIIIllIlIIIIlI2.IlIlIlIlIlllllllllIl(illIllIlllIllllIIllI.IllIIlllIIIIlllIIlIl(), 256.0, n8).llllIIIIlIIIlIlllIll(n6 + n7, n6 + 0.0f).IlIlIIIllIllIIIIIllI();
                    llIllIIIIIllIlIIIIlI2.IlIlIlIlIlllllllllIl(illIllIlllIllllIIllI.IllIIlllIIIIlllIIlIl(), 256.0, n8 + min2).llllIIIIlIIIlIlllIll(n6 + n9 + n7, n6 + 0.0f).IlIlIIIllIllIIIIIllI();
                    llIllIIIIIllIlIIIIlI2.IlIlIlIlIlllllllllIl(illIllIlllIllllIIllI.IllIIlllIIIIlllIIlIl(), 0.0, n8 + min2).llllIIIIlIIIlIlllIll(n6 + n9 + n7, n6 + 128.0f).IlIlIIIllIllIIIIIllI();
                    llIllIIIIIllIlIIIIlI2.IlIlIlIlIlllllllllIl(illIllIlllIllllIIllI.IllIIlllIIIIlllIIlIl(), 0.0, n8).llllIIIIlIIIlIlllIll(n6 + n7, n6 + 128.0f).IlIlIIIllIllIIIIIllI();
                }
            }
            if (n3 < illIllIlllIllllIIllI.IlIIIlIlIIIllIlIlIIl() + n2) {
                float n10 = 0.0f;
                for (double n11 = max; n11 < min; ++n11, n10 += 0.5f) {
                    final double min3 = Math.min(1.0, min - n11);
                    final float n12 = (float)min3 * 0.5f;
                    llIllIIIIIllIlIIIIlI2.IlIlIlIlIlllllllllIl(illIllIlllIllllIIllI.IlIIIlIlIIIllIlIlIIl(), 256.0, n11).llllIIIIlIIIlIlllIll(n6 + n10, n6 + 0.0f).IlIlIIIllIllIIIIIllI();
                    llIllIIIIIllIlIIIIlI2.IlIlIlIlIlllllllllIl(illIllIlllIllllIIllI.IlIIIlIlIIIllIlIlIIl(), 256.0, n11 + min3).llllIIIIlIIIlIlllIll(n6 + n12 + n10, n6 + 0.0f).IlIlIIIllIllIIIIIllI();
                    llIllIIIIIllIlIIIIlI2.IlIlIlIlIlllllllllIl(illIllIlllIllllIIllI.IlIIIlIlIIIllIlIlIIl(), 0.0, n11 + min3).llllIIIIlIIIlIlllIll(n6 + n12 + n10, n6 + 128.0f).IlIlIIIllIllIIIIIllI();
                    llIllIIIIIllIlIIIIlI2.IlIlIlIlIlllllllllIl(illIllIlllIllllIIllI.IlIIIlIlIIIllIlIlIIl(), 0.0, n11).llllIIIIlIIIlIlllIll(n6 + n10, n6 + 128.0f).IlIlIIIllIllIIIIIllI();
                }
            }
            final double max2 = Math.max(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n3 - n2), illIllIlllIllllIIllI.IlIIIlIlIIIllIlIlIIl());
            final double min4 = Math.min(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IllIIlllIIIIlllIIlIl(n3 + n2), illIllIlllIllllIIllI.IllIIlllIIIIlllIIlIl());
            if (n5 > illIllIlllIllllIIllI.llllIIIlIlllIlIIIIIl() - n2) {
                float n13 = 0.0f;
                for (double n14 = max2; n14 < min4; ++n14, n13 += 0.5f) {
                    final double min5 = Math.min(1.0, min4 - n14);
                    final float n15 = (float)min5 * 0.5f;
                    llIllIIIIIllIlIIIIlI2.IlIlIlIlIlllllllllIl(n14, 256.0, illIllIlllIllllIIllI.llllIIIlIlllIlIIIIIl()).llllIIIIlIIIlIlllIll(n6 + n13, n6 + 0.0f).IlIlIIIllIllIIIIIllI();
                    llIllIIIIIllIlIIIIlI2.IlIlIlIlIlllllllllIl(n14 + min5, 256.0, illIllIlllIllllIIllI.llllIIIlIlllIlIIIIIl()).llllIIIIlIIIlIlllIll(n6 + n15 + n13, n6 + 0.0f).IlIlIIIllIllIIIIIllI();
                    llIllIIIIIllIlIIIIlI2.IlIlIlIlIlllllllllIl(n14 + min5, 0.0, illIllIlllIllllIIllI.llllIIIlIlllIlIIIIIl()).llllIIIIlIIIlIlllIll(n6 + n15 + n13, n6 + 128.0f).IlIlIIIllIllIIIIIllI();
                    llIllIIIIIllIlIIIIlI2.IlIlIlIlIlllllllllIl(n14, 0.0, illIllIlllIllllIIllI.llllIIIlIlllIlIIIIIl()).llllIIIIlIIIlIlllIll(n6 + n13, n6 + 128.0f).IlIlIIIllIllIIIIIllI();
                }
            }
            if (n5 < illIllIlllIllllIIllI.IlIlIIIllIllIIIIIllI() + n2) {
                float n16 = 0.0f;
                for (double n17 = max2; n17 < min4; ++n17, n16 += 0.5f) {
                    final double min6 = Math.min(1.0, min4 - n17);
                    final float n18 = (float)min6 * 0.5f;
                    llIllIIIIIllIlIIIIlI2.IlIlIlIlIlllllllllIl(n17, 256.0, illIllIlllIllllIIllI.IlIlIIIllIllIIIIIllI()).llllIIIIlIIIlIlllIll(n6 + n16, n6 + 0.0f).IlIlIIIllIllIIIIIllI();
                    llIllIIIIIllIlIIIIlI2.IlIlIlIlIlllllllllIl(n17 + min6, 256.0, illIllIlllIllllIIllI.IlIlIIIllIllIIIIIllI()).llllIIIIlIIIlIlllIll(n6 + n18 + n16, n6 + 0.0f).IlIlIIIllIllIIIIIllI();
                    llIllIIIIIllIlIIIIlI2.IlIlIlIlIlllllllllIl(n17 + min6, 0.0, illIllIlllIllllIIllI.IlIlIIIllIllIIIIIllI()).llllIIIIlIIIlIlllIll(n6 + n18 + n16, n6 + 128.0f).IlIlIIIllIllIIIIIllI();
                    llIllIIIIIllIlIIIIlI2.IlIlIlIlIlllllllllIl(n17, 0.0, illIllIlllIllllIIllI.IlIlIIIllIllIIIIIllI()).llllIIIIlIIIlIlllIll(n6 + n16, n6 + 128.0f).IlIlIIIllIllIIIIIllI();
                }
            }
            llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
            llIllIIIIIllIlIIIIlI2.llIllIIIIIllIlIIIIlI(0.0, 0.0, 0.0);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIllllIlIlIIIIll();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(0.0f, 0.0f);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lllIIIIlllllIlIIllIl();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(770, 771, 1, 0);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(true);
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
                net.optifine.shaders.llIIlllIIlllIIllIllI.lIIllIIIllllIlllIllI();
            }
        }
    }
    
    private void lllllIlIIIlIlIIlllII() {
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(774, 768, 1, 0);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 0.5f);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(-1.0f, -10.0f);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IIlllIIlIllIllIlIIll();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(516, 0.1f);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
            net.optifine.shaders.IIlllIIIlIlllIIlllII.llllIIIlIlllIlIIIIIl();
        }
    }
    
    private void lIllllllIIllIlIlIlII() {
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(0.0f, 0.0f);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lllIIIIlllllIlIIllIl();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(true);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
            net.optifine.shaders.IIlllIIIlIlllIIlllII.lIIIIlIIIIIlllIllIII();
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final IIlllIIlllIIIlIlllII illlIIlllIIIlIlllII, final net.minecraft.client.lIIIlllIIIllIIIllIII.lIIllIIIllllIlllIllI liIllIIIllllIlllIllI, final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final float n) {
        final double n2 = llIllIIIIIllIlIIIIlI.lIIlIIIlIllIlIllIIIl + (llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl - llIllIIIIIllIlIIIIlI.lIIlIIIlIllIlIllIIIl) * n;
        final double n3 = llIllIIIIIllIlIIIIlI.IIlIIIlllIllIllIlIII + (llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII - llIllIIIIIllIlIIIIlI.IIlIIIlllIllIllIlIII) * n;
        final double n4 = llIllIIIIIllIlIIIIlI.lIlIlIlllIIlIlIlllIl + (llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII - llIllIIIIIllIlIIIIlI.lIlIlIlllIIlIlIlllIl) * n;
        if (!this.IlIlIlIlIlllllllllIl.isEmpty()) {
            this.IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl);
            this.lllllIlIIIlIlIIlllII();
            liIllIIIllllIlllIllI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll);
            liIllIIIllllIlllIllI.llIllIIIIIllIlIIIIlI(-n2, -n3, -n4);
            liIllIIIllllIlllIllI.IlIIIlIlIIIllIlIlIIl();
            final Iterator<net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIIIIlllIlIllIl> iterator = this.IlIlIlIlIlllllllllIl.values().iterator();
            while (iterator.hasNext()) {
                final net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl = iterator.next();
                final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = ilIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll();
                final double n5 = llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII() - n2;
                final double n6 = llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII() - n3;
                final double n7 = llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl() - n4;
                final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI2 = this.lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll).llIllIIIIIllIlIIIIlI();
                boolean b;
                if (net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.z.llIllIIIIIllIlIIIIlI()) {
                    boolean ilIlIlIlIlllllllllIl = llIllIIIIIllIlIIIIlI2 instanceof IIlIIIIIllIlIIIlIIll || llIllIIIIIllIlIIIIlI2 instanceof IIIllIIIlIlIIllIIIlI || llIllIIIIIllIlIIIIlI2 instanceof br || llIllIIIIIllIlIIIIlI2 instanceof ca;
                    if (!ilIlIlIlIlllllllllIl) {
                        final net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll2 = this.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
                        if (llllIIIIlIIIlIlllIll2 != null) {
                            ilIlIlIlIlllllllllIl = net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.z, new Object[0]);
                        }
                    }
                    b = !ilIlIlIlIlllllllllIl;
                }
                else {
                    b = (!(llIllIIIIIllIlIIIIlI2 instanceof IIlIIIIIllIlIIIlIIll) && !(llIllIIIIIllIlIIIIlI2 instanceof IIIllIIIlIlIIllIIIlI) && !(llIllIIIIIllIlIIIIlI2 instanceof br) && !(llIllIIIIIllIlIIIIlI2 instanceof ca));
                }
                if (b) {
                    if (n5 * n5 + n6 * n6 + n7 * n7 > 1024.0) {
                        iterator.remove();
                    }
                    else {
                        final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = this.lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
                        if (ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
                            continue;
                        }
                        this.llllIIIIlIIIlIlllIll.IlIIllIIllIIllIIlIIl().llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl2, llllIIIIlIIIlIlllIll, this.IIlllIIIlIlllIIlllII[ilIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl()], this.lllIIIIlllllIlIIllIl);
                    }
                }
            }
            illlIIlllIIIlIlllII.IlIlIlIlIlllllllllIl();
            liIllIIIllllIlllIllI.llIllIIIIIllIlIIIIlI(0.0, 0.0, 0.0);
            this.lIllllllIIllIlIlIlII();
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final llIlllIlllllIIllIIII llIlllIlllllIIllIIII, final int n, final float n2) {
        if (n == 0 && llIlllIlllllIIllIIII.llllIIIIlIIIlIlllIll == lllllIlIlIlllIlllIlI.IlIlIlIlIlllllllllIl) {
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(770, 771, 1, 0);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(0.0f, 0.0f, 0.0f, 0.4f);
            GL11.glLineWidth(2.0f);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIIIlIIlIlIIlllIl();
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
                net.optifine.shaders.llIIlllIIlllIIllIllI.llllIllllIllllIlIlII();
            }
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(false);
            final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2 = llIlllIlllllIIllIIII.llllIIIIlIIIlIlllIll();
            final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = this.lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2).llIllIIIIIllIlIIIIlI();
            if (llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl() != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll && this.lllIIIIlllllIlIIllIl.IllIllIlllIllllIIllI().llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2)) {
                llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI((lIlIlIIIllIIllIIIllI)this.lllIIIIlllllIlIIllIl, llllIIIIlIIIlIlllIll2);
                final double n3 = llllIIIIlIIIlIlllIll.lIIlIIIlIllIlIllIIIl + (llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl - llllIIIIlIIIlIlllIll.lIIlIIIlIllIlIllIIIl) * n2;
                final double n4 = llllIIIIlIIIlIlllIll.IIlIIIlllIllIllIlIII + (llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII - llllIIIIlIIIlIlllIll.IIlIIIlllIllIllIlIII) * n2;
                final double n5 = llllIIIIlIIIlIlllIll.lIlIlIlllIIlIlIlllIl + (llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII - llllIIIIlIIIlIlllIll.lIlIlIlllIIlIlIlllIl) * n2;
                net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll3 = llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI(this.lllIIIIlllllIlIIllIl, llllIIIIlIIIlIlllIll2);
                final net.minecraft.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl llIllIlIlIIIIIIIllII = llIllIIIIIllIlIIIIlI.llIllIlIlIIIIIIIllII();
                if (llIllIlIlIIIIIIIllII != net.minecraft.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll) {
                    llllIIIIlIIIlIlllIll3 = net.optifine.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3, llIllIlIlIIIIIIIllII, llllIIIIlIIIlIlllIll2);
                }
                llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3.IlIlIlIlIlllllllllIl(0.0020000000949949026, 0.0020000000949949026, 0.0020000000949949026).llIllIIIIIllIlIIIIlI(-n3, -n4, -n5));
            }
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(true);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll();
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
                net.optifine.shaders.llIIlllIIlllIIllIllI.IIlllllIllIllIlIlIII();
            }
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll2 = IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
        final net.minecraft.client.lIIIlllIIIllIIIllIII.lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll2.llIllIIIIIllIlIIIIlI();
        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(3, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl);
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl, llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl, llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI).IlIlIIIllIllIIIIIllI();
        llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl();
        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(3, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl);
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI, llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl, llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI, llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl, llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI, llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI, llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI, llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI).IlIlIIIllIllIIIIIllI();
        llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl();
        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(1, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl);
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI, llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl, llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl, llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI, llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl, llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl, llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI, llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI, llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl).IlIlIIIllIllIIIIIllI();
        llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl();
    }
    
    public static void llllIIIIlIIIlIlllIll(final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final int n, final int n2, final int n3, final int n4) {
        final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll2 = IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
        final net.minecraft.client.lIIIlllIIIllIIIllIII.lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll2.llIllIIIIIllIlIIIIlI();
        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(3, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII);
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI).IlIlIlIlIlllllllllIl(n, n2, n3, n4).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl, llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI).IlIlIlIlIlllllllllIl(n, n2, n3, n4).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl, llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl).IlIlIlIlIlllllllllIl(n, n2, n3, n4).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl).IlIlIlIlIlllllllllIl(n, n2, n3, n4).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI).IlIlIlIlIlllllllllIl(n, n2, n3, n4).IlIlIIIllIllIIIIIllI();
        llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl();
        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(3, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII);
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI, llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI).IlIlIlIlIlllllllllIl(n, n2, n3, n4).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl, llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI, llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI).IlIlIlIlIlllllllllIl(n, n2, n3, n4).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl, llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI, llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl).IlIlIlIlIlllllllllIl(n, n2, n3, n4).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI, llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl).IlIlIlIlIlllllllllIl(n, n2, n3, n4).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI, llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI).IlIlIlIlIlllllllllIl(n, n2, n3, n4).IlIlIIIllIllIIIIIllI();
        llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl();
        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(1, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII);
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI).IlIlIlIlIlllllllllIl(n, n2, n3, n4).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI, llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI).IlIlIlIlIlllllllllIl(n, n2, n3, n4).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl, llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI).IlIlIlIlIlllllllllIl(n, n2, n3, n4).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl, llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI, llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI).IlIlIlIlIlllllllllIl(n, n2, n3, n4).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl, llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl).IlIlIlIlIlllllllllIl(n, n2, n3, n4).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl, llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI, llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl).IlIlIlIlIlllllllllIl(n, n2, n3, n4).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl).IlIlIlIlIlllllllllIl(n, n2, n3, n4).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI, llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl).IlIlIlIlIlllllllllIl(n, n2, n3, n4).IlIlIIIllIllIIIIIllI();
        llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl();
    }
    
    private void IlIlIlIlIlllllllllIl(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        this.IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(n, n2, n3, n4, n5, n6);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final int liiiIlIIIIIlllIllIII = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII();
        final int liiIlllIIIllIIIllIII = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII();
        final int llIIlIIIlIIIllIlIIIl = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl();
        this.IlIlIlIlIlllllllllIl(liiiIlIIIIIlllIllIII - 1, liiIlllIIIllIIIllIII - 1, llIIlIIIlIIIllIlIIIl - 1, liiiIlIIIIIlllIllIII + 1, liiIlllIIIllIIIllIII + 1, llIIlIIIlIIIllIlIIIl + 1);
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final int liiiIlIIIIIlllIllIII = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII();
        final int liiIlllIIIllIIIllIII = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII();
        final int llIIlIIIlIIIllIlIIIl = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl();
        this.IlIlIlIlIlllllllllIl(liiiIlIIIIIlllIllIII - 1, liiIlllIIIllIIIllIII - 1, llIIlIIIlIIIllIlIIIl - 1, liiiIlIIIIIlllIllIII + 1, liiIlllIIIllIIIllIII + 1, llIIlIIIlIIIllIlIIIl + 1);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        this.IlIlIlIlIlllllllllIl(n - 1, n2 - 1, n3 - 1, n4 + 1, n5 + 1, n6 + 1);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final String s, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final net.minecraft.client.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2 = this.llIIlllIIlllIIllIllI.get(ilIlIlIlIlllllllllIl);
        if (ilIlIlIlIlllllllllIl2 != null) {
            this.llllIIIIlIIIlIlllIll.IlIIlIlIIIlIIlIlIlII().IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl2);
            this.llIIlllIIlllIIllIllI.remove(ilIlIlIlIlllllllllIl);
        }
        if (s != null) {
            final IlIllllIIIlIllIlIIll ilIIIlIlIIIllIlIlIIl = net.minecraft.llIllIlIIIIllIlIIllI.IlIllllIIIlIllIlIIll.IlIIIlIlIIIllIlIlIIl(s);
            if (ilIIIlIlIIIllIlIlIIl != null) {
                this.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl.lllIIIIlllllIlIIllIl());
            }
            final net.minecraft.client.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI llllIIIIlIIIlIlllIll = net.minecraft.client.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(new lIllllIllIllIIllllll(s), (float)ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII(), (float)ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII(), (float)ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl());
            this.llIIlllIIlllIIllIllI.put(ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll);
            this.llllIIIIlIIIlIlllIll.IlIIlIlIIIlIIlIlIlII().llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final String s, final double n, final double n2, final double n3, final float n4, final float n5) {
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final String s, final double n, final double n2, final double n3, final float n4, final float n5) {
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final boolean b, final double n2, final double n3, final double n4, final double n5, final double n6, final double n7, final int... array) {
        try {
            this.IlIlIlIlIlllllllllIl(n, b, n2, n3, n4, n5, n6, n7, array);
        }
        catch (Throwable t) {
            final net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(t, "Exception while adding particle");
            final lIIIlllIIIllIIIllIII llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll("Particle being added");
            llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll("ID", n);
            if (array != null) {
                llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll("Parameters", array);
            }
            llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll("Position", new IllIIlllllIIllIIllIl(this, n2, n3, n4));
            throw new IIlIlllIlIlllIlIllll(llllIIIIlIIIlIlllIll);
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final IlIllllIIlIIlIlIlIll ilIllllIIlIIlIlIlIll, final double n, final double n2, final double n3, final double n4, final double n5, final double n6, final int... array) {
        this.llllIIIIlIIIlIlllIll(ilIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI(), ilIllllIIlIIlIlIlIll.IlIlIIIllIllIIIIIllI(), n, n2, n3, n4, n5, n6, array);
    }
    
    private IIIllllllIllIIIlllIl IlIlIlIlIlllllllllIl(final int n, final boolean b, final double n2, final double n3, final double n4, final double n5, final double n6, final double n7, final int... array) {
        if (this.llllIIIIlIIIlIlllIll == null || this.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI() == null || this.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl == null) {
            return null;
        }
        int lIllllIllIllIIllllll = this.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll.lIllllIllIllIIllllll;
        if (lIllllIllIllIIllllll == 1 && this.lllIIIIlllllIlIIllIl.llllIIllllIlIlIIIIll.nextInt(3) == 0) {
            lIllllIllIllIIllllll = 2;
        }
        final double n8 = this.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI().IIlllIlIIllIlIlIlIIl - n2;
        final double n9 = this.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI().llIIIlIlIllIIlIlIlII - n3;
        final double n10 = this.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI().lllllIlIIIlIlIIlllII - n4;
        if (n == net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI() && !net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IllIllIIIIlIIlIlllII()) {
            return null;
        }
        if (n == net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI() && !net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IllIllIIIIlIIlIlllII()) {
            return null;
        }
        if (n == net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI() && !net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IllIllIIIIlIIlIlllII()) {
            return null;
        }
        if (n == net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI() && !net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIIlIlIIIlIIlIlIlII()) {
            return null;
        }
        if (n == net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI() && !net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIlIIIIIlIIlIlIIlll()) {
            return null;
        }
        if (n == net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI() && !net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IllIllIlllIllllIIllI()) {
            return null;
        }
        if (n == net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI() && !net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IllIllIlllIllllIIllI()) {
            return null;
        }
        if (n == net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IlIllIlIlIIIlIlIlIII.llIllIIIIIllIlIIIIlI() && !net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIlllIllIllIlIII()) {
            return null;
        }
        if (n == net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IIlllIIlIllIllIlIIll.llIllIIIIIllIlIIIIlI() && !net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIlllIllIllIlIII()) {
            return null;
        }
        if (n == net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IIIIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI() && !net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIlllIllIllIlIII()) {
            return null;
        }
        if (n == net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.llllIIllllIlIlIIIIll.llIllIIIIIllIlIIIIlI() && !net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIlllIllIllIlIII()) {
            return null;
        }
        if (n == net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.lllIIIIlllllIlIIllIl.llIllIIIIIllIlIIIIlI() && !net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIIIlllIllIllIlIII()) {
            return null;
        }
        if (n == net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI() && !net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIIlIIIlIllIlIllIIIl()) {
            return null;
        }
        if (n == net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI() && !net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIllllIIlIIlIlIlIll()) {
            return null;
        }
        if (n == net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.llIIlllIIlllIIllIllI.llIllIIIIIllIlIIIIlI() && !net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIlIlIIlIllIIIIIIl()) {
            return null;
        }
        if (n == net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IlIlIIIIIIlllIlIllIl.llIllIIIIIllIlIIIIlI() && !net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIllIIllIIIIIIlIIlI()) {
            return null;
        }
        if (n == net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI() && !net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIllIIllIIIIIIlIIlI()) {
            return null;
        }
        if (n == net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI() && !net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIlIlIlllIIlIlIlllIl()) {
            return null;
        }
        if (!b) {
            double n11 = 256.0;
            if (n == net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI()) {
                n11 = 38416.0;
            }
            if (n8 * n8 + n9 * n9 + n10 * n10 > n11) {
                return null;
            }
            if (lIllllIllIllIIllllll > 1) {
                return null;
            }
        }
        final IIIllllllIllIIIlllIl llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(n, n2, n3, n4, n5, n6, n7, array);
        if (n == net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI()) {
            net.optifine.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, this.lllIIIIlllllIlIIllIl, n2, n3, n4, this.lIIIIIlIlIIIlIIIIlIl);
        }
        if (n == net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI()) {
            net.optifine.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, this.lllIIIIlllllIlIIllIl, n2, n3, n4, this.lIIIIIlIlIIIlIIIIlIl);
        }
        if (n == net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IlllIIIIlIIIlIlIlIIl.llIllIIIIIllIlIIIIlI()) {
            net.optifine.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, this.lllIIIIlllllIlIIllIl, n2, n3, n4, this.lIIIIIlIlIIIlIIIIlIl);
        }
        if (n == net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IlllllllIIIlIIIlIlII.llIllIIIIIllIlIIIIlI()) {
            net.optifine.lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
        }
        if (n == net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI()) {
            net.optifine.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
        }
        if (n == net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.llIIlllIIlllIIllIllI.llIllIIIIIllIlIIIIlI()) {
            net.optifine.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, this.lllIIIIlllllIlIIllIl, n2, n3, n4);
        }
        return llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        net.optifine.IlIIllIIllIIllIIlIIl.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, this.lllIIIIlllllIlIIllIl);
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.x()) {
            net.optifine.IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, this);
        }
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        net.optifine.IlIIllIIllIIllIIlIIl.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI, this.lllIIIIlllllIlIIllIl);
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.x()) {
            net.optifine.IlllIIIIlIIIlIlIlIIl.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI, this);
        }
    }
    
    public void lIIIlllIIIllIIIllIII() {
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n2) {
        switch (n) {
            case 1013:
            case 1018: {
                if (this.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI() == null) {
                    break;
                }
                final double n3 = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() - this.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI().IIlllIlIIllIlIlIlIIl;
                final double n4 = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() - this.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI().llIIIlIlIllIIlIlIlII;
                final double n5 = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() - this.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI().lllllIlIIIlIlIIlllII;
                final double sqrt = Math.sqrt(n3 * n3 + n4 * n4 + n5 * n5);
                double iIlllIlIIllIlIlIlIIl = this.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI().IIlllIlIIllIlIlIlIIl;
                double llIIIlIlIllIIlIlIlII = this.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI().llIIIlIlIllIIlIlIlII;
                double lllllIlIIIlIlIIlllII = this.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI().lllllIlIIIlIlIIlllII;
                if (sqrt > 0.0) {
                    iIlllIlIIllIlIlIlIIl += n3 / sqrt * 2.0;
                    llIIIlIlIllIIlIlIlII += n4 / sqrt * 2.0;
                    lllllIlIIIlIlIIlllII += n5 / sqrt * 2.0;
                }
                if (n == 1013) {
                    this.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(iIlllIlIIllIlIlIlIIl, llIIIlIlIllIIlIlIlII, lllllIlIIIlIlIIlllII, "mob.wither.spawn", 1.0f, 1.0f, false);
                    break;
                }
                this.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(iIlllIlIIllIlIlIlIIl, llIIIlIlIllIIlIlIlII, lllllIlIIIlIlIIlllII, "mob.enderdragon.end", 5.0f, 1.0f, false);
                break;
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final int n, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n2) {
        final Random llllIIllllIlIlIIIIll = this.lllIIIIlllllIlIIllIl.llllIIllllIlIlIIIIll;
        switch (n) {
            case 1000: {
                this.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, "random.click", 1.0f, 1.0f, false);
                break;
            }
            case 1001: {
                this.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, "random.click", 1.0f, 1.2f, false);
                break;
            }
            case 1002: {
                this.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, "random.bow", 1.0f, 1.2f, false);
                break;
            }
            case 1003: {
                this.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, "random.door_open", 1.0f, this.lllIIIIlllllIlIIllIl.llllIIllllIlIlIIIIll.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1004: {
                this.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, "random.fizz", 0.5f, 2.6f + (llllIIllllIlIlIIIIll.nextFloat() - llllIIllllIlIlIIIIll.nextFloat()) * 0.8f, false);
                break;
            }
            case 1005: {
                if (net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(n2) instanceof IlIllllIIIlIllIlIIll) {
                    this.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, "records." + ((IlIllllIIIlIllIlIIll)net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(n2)).llllIIIlIlllIlIIIIIl);
                    break;
                }
                this.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, (String)null);
                break;
            }
            case 1006: {
                this.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, "random.door_close", 1.0f, this.lllIIIIlllllIlIIllIl.llllIIllllIlIlIIIIll.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1007: {
                this.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, "mob.ghast.charge", 10.0f, (llllIIllllIlIlIIIIll.nextFloat() - llllIIllllIlIlIIIIll.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1008: {
                this.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, "mob.ghast.fireball", 10.0f, (llllIIllllIlIlIIIIll.nextFloat() - llllIIllllIlIlIIIIll.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1009: {
                this.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, "mob.ghast.fireball", 2.0f, (llllIIllllIlIlIIIIll.nextFloat() - llllIIllllIlIlIIIIll.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1010: {
                this.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, "mob.zombie.wood", 2.0f, (llllIIllllIlIlIIIIll.nextFloat() - llllIIllllIlIlIIIIll.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1011: {
                this.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, "mob.zombie.metal", 2.0f, (llllIIllllIlIlIIIIll.nextFloat() - llllIIllllIlIlIIIIll.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1012: {
                this.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, "mob.zombie.woodbreak", 2.0f, (llllIIllllIlIlIIIIll.nextFloat() - llllIIllllIlIlIIIIll.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1014: {
                this.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, "mob.wither.shoot", 2.0f, (llllIIllllIlIlIIIIll.nextFloat() - llllIIllllIlIlIIIIll.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1015: {
                this.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, "mob.bat.takeoff", 0.05f, (llllIIllllIlIlIIIIll.nextFloat() - llllIIllllIlIlIIIIll.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1016: {
                this.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, "mob.zombie.infect", 2.0f, (llllIIllllIlIlIIIIll.nextFloat() - llllIIllllIlIlIIIIll.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1017: {
                this.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, "mob.zombie.unfect", 2.0f, (llllIIllllIlIlIIIIll.nextFloat() - llllIIllllIlIlIIIIll.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1020: {
                this.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, "random.anvil_break", 1.0f, this.lllIIIIlllllIlIIllIl.llllIIllllIlIlIIIIll.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1021: {
                this.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, "random.anvil_use", 1.0f, this.lllIIIIlllllIlIIllIl.llllIIllllIlIlIIIIll.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1022: {
                this.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, "random.anvil_land", 0.3f, this.lllIIIIlllllIlIIllIl.llllIIllllIlIlIIIIll.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 2000: {
                final int n3 = n2 % 3 - 1;
                final int n4 = n2 / 3 % 3 - 1;
                final double n5 = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + n3 * 0.6 + 0.5;
                final double n6 = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + 0.5;
                final double n7 = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + n4 * 0.6 + 0.5;
                for (int i = 0; i < 10; ++i) {
                    final double n8 = llllIIllllIlIlIIIIll.nextDouble() * 0.2 + 0.01;
                    this.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.lIlIlIIIllIIllIIIllI, n5 + n3 * 0.01 + (llllIIllllIlIlIIIIll.nextDouble() - 0.5) * n4 * 0.5, n6 + (llllIIllllIlIlIIIIll.nextDouble() - 0.5) * 0.5, n7 + n4 * 0.01 + (llllIIllllIlIlIIIIll.nextDouble() - 0.5) * n3 * 0.5, n3 * n8 + llllIIllllIlIlIIIIll.nextGaussian() * 0.01, -0.03 + llllIIllllIlIlIIIIll.nextGaussian() * 0.01, n4 * n8 + llllIIllllIlIlIIIIll.nextGaussian() * 0.01, new int[0]);
                }
            }
            case 2001: {
                final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n2 & 0xFFF);
                if (llllIIIIlIIIlIlllIll2.IllIIlllIIIIlllIIlIl() != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
                    this.llllIIIIlIIIlIlllIll.IlIIlIlIIIlIIlIlIlII().llllIIIIlIIIlIlllIll(new net.minecraft.client.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI(new lIllllIllIllIIllllll(llllIIIIlIIIlIlllIll2.IIlllIIIlIlllIIlllII.llllIIIIlIIIlIlllIll()), (llllIIIIlIIIlIlllIll2.IIlllIIIlIlllIIlllII.IlIIIlIlIIIllIlIlIIl() + 1.0f) / 2.0f, llllIIIIlIIIlIlllIll2.IIlllIIIlIlllIIlllII.IlIlIIIllIllIIIIIllI() * 0.8f, ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + 0.5f, ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + 0.5f, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + 0.5f));
                }
                this.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll2.llIllIIIIIllIlIIIIlI(n2 >> 12 & 0xFF));
                break;
            }
            case 2002: {
                final double n9 = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII();
                final double n10 = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII();
                final double n11 = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl();
                for (int j = 0; j < 8; ++j) {
                    this.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IIIIIllIIIIlIIIIllIl, n9, n10, n11, llllIIllllIlIlIIIIll.nextGaussian() * 0.15, llllIIllllIlIlIIIIll.nextDouble() * 0.2, llllIIllllIlIlIIIIll.nextGaussian() * 0.15, net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.D), n2);
                }
                final int llllIIIlIlllIlIIIIIl = net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.D.llllIIIlIlllIlIIIIIl(n2);
                final float n12 = (llllIIIlIlllIlIIIIIl >> 16 & 0xFF) / 255.0f;
                final float n13 = (llllIIIlIlllIlIIIIIl >> 8 & 0xFF) / 255.0f;
                final float n14 = (llllIIIlIlllIlIIIIIl >> 0 & 0xFF) / 255.0f;
                IlIllllIIlIIlIlIlIll ilIllllIIlIIlIlIlIll = net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IIIIlllIIIIIIlIIIlll;
                if (net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.D.lIIIIlIIIIIlllIllIII(n2)) {
                    ilIllllIIlIIlIlIlIll = net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.llllIIllllIlIlIIIIll;
                }
                for (int k = 0; k < 100; ++k) {
                    final double n15 = llllIIllllIlIlIIIIll.nextDouble() * 4.0;
                    final double n16 = llllIIllllIlIlIIIIll.nextDouble() * 3.141592653589793 * 2.0;
                    final double n17 = Math.cos(n16) * n15;
                    final double n18 = 0.01 + llllIIllllIlIlIIIIll.nextDouble() * 0.5;
                    final double n19 = Math.sin(n16) * n15;
                    final IIIllllllIllIIIlllIl ilIlIlIlIlllllllllIl2 = this.IlIlIlIlIlllllllllIl(ilIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI(), ilIllllIIlIIlIlIlIll.IlIlIIIllIllIIIIIllI(), n9 + n17 * 0.1, n10 + 0.3, n11 + n19 * 0.1, n17, n18, n19, new int[0]);
                    if (ilIlIlIlIlllllllllIl2 != null) {
                        final float n20 = 0.75f + llllIIllllIlIlIIIIll.nextFloat() * 0.25f;
                        ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(n12 * n20, n13 * n20, n14 * n20);
                        ilIlIlIlIlllllllllIl2.IlIIIlIlIIIllIlIlIIl((float)n15);
                    }
                }
                this.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, "game.potion.smash", 1.0f, this.lllIIIIlllllIlIIllIl.llllIIllllIlIlIIIIll.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 2003: {
                final double n21 = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + 0.5;
                final double n22 = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII();
                final double n23 = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + 0.5;
                for (int l = 0; l < 8; ++l) {
                    this.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IIIIIllIIIIlIIIIllIl, n21, n22, n23, llllIIllllIlIlIIIIll.nextGaussian() * 0.15, llllIIllllIlIlIIIIll.nextDouble() * 0.2, llllIIllllIlIlIIIIll.nextGaussian() * 0.15, net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.L));
                }
                for (double n24 = 0.0; n24 < 6.283185307179586; n24 += 0.15707963267948966) {
                    this.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IIIlIIlIIIIlllIlllII, n21 + Math.cos(n24) * 5.0, n22 - 0.4, n23 + Math.sin(n24) * 5.0, Math.cos(n24) * -5.0, 0.0, Math.sin(n24) * -5.0, new int[0]);
                    this.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IIIlIIlIIIIlllIlllII, n21 + Math.cos(n24) * 5.0, n22 - 0.4, n23 + Math.sin(n24) * 5.0, Math.cos(n24) * -7.0, 0.0, Math.sin(n24) * -7.0, new int[0]);
                }
            }
            case 2004: {
                for (int n25 = 0; n25 < 20; ++n25) {
                    final double n26 = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + 0.5 + (this.lllIIIIlllllIlIIllIl.llllIIllllIlIlIIIIll.nextFloat() - 0.5) * 2.0;
                    final double n27 = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + 0.5 + (this.lllIIIIlllllIlIIllIl.llllIIllllIlIlIIIIll.nextFloat() - 0.5) * 2.0;
                    final double n28 = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + 0.5 + (this.lllIIIIlllllIlIIllIl.llllIIllllIlIlIIIIll.nextFloat() - 0.5) * 2.0;
                    this.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.lIlIlIIIllIIllIIIllI, n26, n27, n28, 0.0, 0.0, 0.0, new int[0]);
                    this.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IIlllIlIIllIlIlIlIIl, n26, n27, n28, 0.0, 0.0, 0.0, new int[0]);
                }
            }
            case 2005: {
                net.minecraft.llIllIlIIIIllIlIIllI.IllIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll(this.lllIIIIlllllIlIIllIl, ilIlIlIlIlllllllllIl, n2);
                break;
            }
        }
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final int n, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n2) {
        if (n2 >= 0 && n2 < 10) {
            net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl = this.IlIlIlIlIlllllllllIl.get(n);
            if (ilIlIIIIIIlllIlIllIl == null || ilIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll().lIIIIlIIIIIlllIllIII() != ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() || ilIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll().lIIIlllIIIllIIIllIII() != ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() || ilIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll().llIIlIIIlIIIllIlIIIl() != ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl()) {
                ilIlIIIIIIlllIlIllIl = new net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIIIIlllIlIllIl(n, ilIlIlIlIlllllllllIl);
                this.IlIlIlIlIlllllllllIl.put(n, ilIlIIIIIIlllIlIllIl);
            }
            ilIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll(n2);
            ilIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl(this.lIllllllIIllIlIlIlII);
        }
        else {
            this.IlIlIlIlIlllllllllIl.remove(n);
        }
    }
    
    public void llIIlIIIlIIIllIlIIIl() {
        this.IlIIIlIlIIIllIlIlIIl = true;
    }
    
    public boolean llIllIlIIIIllIlIIllI() {
        return this.IlIlIIIIIIlllIlIllIl.isEmpty() && this.IllIllIlllIllllIIllI.IllIIlllIIIIlllIIlIl();
    }
    
    public void lIlIlIIIllIIllIIIllI() {
        this.llIIIllIlIllIllIIIIl.IlIlIIIllIllIIIIIllI();
    }
    
    public int IlIlIIIllIIllIlllllI() {
        return this.IlIlIIIlIIlIlIIlllIl.IllIIlllIIIIlllIIlIl.length;
    }
    
    public int IIIIlllIIIIIIlIIIlll() {
        return this.IIllIIllIIIlIlIIIIlI.size();
    }
    
    public int llllIIllllIlIlIIIIll() {
        return this.IIlIIIlllIllIllIlIII;
    }
    
    public int IlIllIlIlIIIlIlIlIII() {
        return this.IlIIIIIlIIllIIlIlIll;
    }
    
    public int IIlllIIlIllIllIlIIll() {
        if (this.lllIIIIlllllIlIIllIl == null) {
            return 0;
        }
        final lIIIIlIIIIIlllIllIII llIIIlIlIllIIlIlIlII = this.lllIIIIlllllIlIIllIl.llIIIlIlIllIIlIlIlII();
        if (llIIIlIlIllIIlIlIlII == null) {
            return 0;
        }
        if (llIIIlIlIllIIlIlIlII != this.IllllIIlIlIllIIIllII) {
            this.IllllIIlIlIllIIIllII = llIIIlIlIllIIlIlIlII;
            this.lllllIIIIIlIIlllIlIl = (lIIllIIIllllIlllIllI)net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(llIIIlIlIllIIlIlIlII, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.aQ);
        }
        return (this.lllllIIIIIlIIlllIlIl == null) ? 0 : this.lllllIIIIIlIIlllIlIl.llllIIIIlIIIlIlllIll();
    }
    
    public int lllIIIIlllllIlIIllIl() {
        return this.IlIlIIIIIIlllIlIllIl.size();
    }
    
    public IlIllIlIlIIIlIlIlIII llIllIIIIIllIlIIIIlI(final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return this.IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
    }
    
    public llIIlIIIlIIIllIlIIIl IlIlIIIIIIlllIlIllIl() {
        return this.lllIIIIlllllIlIIllIl;
    }
    
    private void llIIlllIIlllIIllIllI() {
        if (net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIIIIIlIlIIIIIIl.IIIllIIllIIIIIIlIIlI > 0) {
            this.IIllIIllIIIlIlIIIIlI = new ArrayList(this.IIllIIllIIIlIlIIIIlI.size() + 16);
            this.IIlllIIlllIIIlIlllII = new ArrayList(this.IIlllIIlllIIIlIlllII.size() + 16);
            this.IlIIlllllIIllIIlllll = new ArrayList(this.IlIIlllllIIllIIlllll.size() + 16);
        }
        else {
            this.IIllIIllIIIlIlIIIIlI.clear();
            this.IIlllIIlllIIIlIlllII.clear();
            this.IlIIlllllIIllIIlllll.clear();
        }
    }
    
    public void IIllIIllIIIlIlIIIIlI() {
        if (this.IIllIIIlIIIIlIIlIIII) {
            this.IlIIIlIlIIIllIlIlIIl();
            this.IIllIIIlIIIIlIIlIIII = false;
        }
    }
    
    public void IIIlIIIlIlIIlllIIlll() {
        if (this.IllIllIlllIllllIIllI != null) {
            this.IllIllIlllIllllIIllI.llllIIIlIlllIlIIIIIl();
        }
    }
    
    public void IlIlIIIlIIlIlIIlllIl() {
        if (this.IllIllIlllIllllIIllI != null) {
            this.IllIllIlllIllllIIllI.lIIIIlIIIIIlllIllIII();
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final Collection collection, final Collection collection2) {
        synchronized (this.IIIlIIIlIlIIlllIIlll) {
            this.IIIlIIIlIlIIlllIIlll.removeAll(collection);
            this.IIIlIIIlIlIIlllIIlll.addAll(collection2);
        }
        // monitorexit(this.IIIlIIIlIlIIlllIIlll)
    }
    
    static /* synthetic */ int[] IlllllllIIIlIIIlIlII() {
        final int[] iiiiiiIllllIlIIIIIII = lllllIIIIIlIlIIIIIIl.IIIIIIIllllIlIIIIIII;
        if (iiiiiiIllllIlIIIIIII != null) {
            return iiiiiiIllllIlIIIIIII;
        }
        final int[] iiiiiiIllllIlIIIIIII2 = new int[IllIIlllIIIIlllIIlIl.values().length];
        try {
            iiiiiiIllllIlIIIIIII2[IllIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            iiiiiiIllllIlIIIIIII2[IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            iiiiiiIllllIlIIIIIII2[IllIIlllIIIIlllIIlIl.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            iiiiiiIllllIlIIIIIII2[IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            iiiiiiIllllIlIIIIIII2[IllIIlllIIIIlllIIlIl.llllIIIlIlllIlIIIIIl.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        try {
            iiiiiiIllllIlIIIIIII2[IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError6) {}
        try {
            iiiiiiIllllIlIIIIIII2[IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError7) {}
        return lllllIIIIIlIlIIIIIIl.IIIIIIIllllIlIIIIIII = iiiiiiIllllIlIIIIIII2;
    }
}
