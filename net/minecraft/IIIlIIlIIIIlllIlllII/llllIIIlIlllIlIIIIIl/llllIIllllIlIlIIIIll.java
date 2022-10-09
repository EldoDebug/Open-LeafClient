package net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlIlIIIIIIlllIlIllIl.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.concurrent.*;

public class llllIIllllIlIlIIIIll
{
    public static final IllIIlllIIIIlllIIlIl llllIIIIlIIIlIlllIll;
    private long IlIlIlIlIlllllllllIl;
    private llIllIlIlIIIIIIIllII llIllIIIIIllIlIIIIlI;
    private String IlIIIlIlIIIllIlIlIIl;
    private int IlIlIIIllIllIIIIIllI;
    private int IllIIlllIIIIlllIIlIl;
    private int llllIIIlIlllIlIIIIIl;
    private long lIIIIlIIIIIlllIllIII;
    private long lIIIlllIIIllIIIllIII;
    private long llIIlIIIlIIIllIlIIIl;
    private long llIllIlIIIIllIlIIllI;
    private IIIIlllIIIIIIlIIIlll lIlIlIIIllIIllIIIllI;
    private int IlIlIIIllIIllIlllllI;
    private String IIIIlllIIIIIIlIIIlll;
    private int llllIIllllIlIlIIIIll;
    private int IlIllIlIlIIIlIlIlIII;
    private boolean IIlllIIlIllIllIlIIll;
    private int lllIIIIlllllIlIIllIl;
    private boolean IlIlIIIIIIlllIlIllIl;
    private int IIllIIllIIIlIlIIIIlI;
    private lllIllIIIllllllIllll IIIlIIIlIlIIlllIIlll;
    private boolean IlIlIIIlIIlIlIIlllIl;
    private boolean IlllllllIIIlIIIlIlII;
    private boolean IIlIIIIlllIlllllIlII;
    private boolean IIIlIIlIIIIlllIlllII;
    private IllIIlllIIIIlllIIlIl IlIlIllllllllIIIIlII;
    private boolean IIlllIlIIllIlIlIlIIl;
    private double llIIIlIlIllIIlIlIlII;
    private double lllllIlIIIlIlIIlllII;
    private double lIllllllIIllIlIlIlII;
    private long llIIlllIIlllIIllIllI;
    private double IIlllIIIlIlllIIlllII;
    private double IIlIIIIIllIlIIIlIIll;
    private double llllllIllIllIlIllllI;
    private int IIIllllllIllIIIlllIl;
    private int IlIIIlIIIllllIlIlIlI;
    private lIIIlllIIIllIIIllIII IIIIIllIIIIlIIIIllIl;
    
    static {
        llllIIIIlIIIlIlllIll = IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI;
    }
    
    protected llllIIllllIlIlIIIIll() {
        this.llIllIIIIIllIlIIIIlI = llIllIlIlIIIIIIIllII.IlIlIlIlIlllllllllIl;
        this.IlIIIlIlIIIllIlIlIIl = "";
        this.llIIIlIlIllIIlIlIlII = 0.0;
        this.lllllIlIIIlIlIIlllII = 0.0;
        this.lIllllllIIllIlIlIlII = 6.0E7;
        this.llIIlllIIlllIIllIllI = 0L;
        this.IIlllIIIlIlllIIlllII = 0.0;
        this.IIlIIIIIllIlIIIlIIll = 5.0;
        this.llllllIllIllIlIllllI = 0.2;
        this.IIIllllllIllIIIlllIl = 5;
        this.IlIIIlIIIllllIlIlIlI = 15;
        this.IIIIIllIIIIlIIIIllIl = new lIIIlllIIIllIIIllIII();
    }
    
    public llllIIllllIlIlIIIIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        this.llIllIIIIIllIlIIIIlI = llIllIlIlIIIIIIIllII.IlIlIlIlIlllllllllIl;
        this.IlIIIlIlIIIllIlIlIIl = "";
        this.llIIIlIlIllIIlIlIlII = 0.0;
        this.lllllIlIIIlIlIIlllII = 0.0;
        this.lIllllllIIllIlIlIlII = 6.0E7;
        this.llIIlllIIlllIIllIllI = 0L;
        this.IIlllIIIlIlllIIlllII = 0.0;
        this.IIlIIIIIllIlIIIlIIll = 5.0;
        this.llllllIllIllIlIllllI = 0.2;
        this.IIIllllllIllIIIlllIl = 5;
        this.IlIIIlIIIllllIlIlIlI = 15;
        this.IIIIIllIIIIlIIIIllIl = new lIIIlllIIIllIIIllIII();
        this.IlIlIlIlIlllllllllIl = iiiIlllIIIIIIlIIIlll.llllIIIlIlllIlIIIIIl("RandomSeed");
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("generatorName", 8)) {
            this.llIllIIIIIllIlIIIIlI = llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl("generatorName"));
            if (this.llIllIIIIIllIlIIIIlI == null) {
                this.llIllIIIIIllIlIIIIlI = llIllIlIlIIIIIIIllII.IlIlIlIlIlllllllllIl;
            }
            else if (this.llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl()) {
                int illIIlllIIIIlllIIlIl = 0;
                if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("generatorVersion", 99)) {
                    illIIlllIIIIlllIIlIl = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("generatorVersion");
                }
                this.llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl);
            }
            if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("generatorOptions", 8)) {
                this.IlIIIlIlIIIllIlIlIIl = iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl("generatorOptions");
            }
        }
        this.IIIlIIIlIlIIlllIIlll = lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("GameType"));
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("MapFeatures", 99)) {
            this.IlIlIIIlIIlIlIIlllIl = iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("MapFeatures");
        }
        else {
            this.IlIlIIIlIIlIlIIlllIl = true;
        }
        this.IlIlIIIllIllIIIIIllI = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("SpawnX");
        this.IllIIlllIIIIlllIIlIl = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("SpawnY");
        this.llllIIIlIlllIlIIIIIl = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("SpawnZ");
        this.lIIIIlIIIIIlllIllIII = iiiIlllIIIIIIlIIIlll.llllIIIlIlllIlIIIIIl("Time");
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("DayTime", 99)) {
            this.lIIIlllIIIllIIIllIII = iiiIlllIIIIIIlIIIlll.llllIIIlIlllIlIIIIIl("DayTime");
        }
        else {
            this.lIIIlllIIIllIIIllIII = this.lIIIIlIIIIIlllIllIII;
        }
        this.llIIlIIIlIIIllIlIIIl = iiiIlllIIIIIIlIIIlll.llllIIIlIlllIlIIIIIl("LastPlayed");
        this.llIllIlIIIIllIlIIllI = iiiIlllIIIIIIlIIIlll.llllIIIlIlllIlIIIIIl("SizeOnDisk");
        this.IIIIlllIIIIIIlIIIlll = iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl("LevelName");
        this.llllIIllllIlIlIIIIll = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("version");
        this.IlIllIlIlIIIlIlIlIII = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("clearWeatherTime");
        this.lllIIIIlllllIlIIllIl = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("rainTime");
        this.IIlllIIlIllIllIlIIll = iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("raining");
        this.IIllIIllIIIlIlIIIIlI = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("thunderTime");
        this.IlIlIIIIIIlllIlIllIl = iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("thundering");
        this.IlllllllIIIlIIIlIlII = iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("hardcore");
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("initialized", 99)) {
            this.IIIlIIlIIIIlllIlllII = iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("initialized");
        }
        else {
            this.IIIlIIlIIIIlllIlllII = true;
        }
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("allowCommands", 99)) {
            this.IIlIIIIlllIlllllIlII = iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("allowCommands");
        }
        else {
            this.IIlIIIIlllIlllllIlII = (this.IIIlIIIlIlIIlllIIlll == lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI);
        }
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("Player", 10)) {
            this.lIlIlIIIllIIllIIIllI = iiiIlllIIIIIIlIIIlll.IlIlIIIllIIllIlllllI("Player");
            this.IlIlIIIllIIllIlllllI = this.lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl("Dimension");
        }
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("GameRules", 10)) {
            this.IIIIIllIIIIlIIIIllIl.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll.IlIlIIIllIIllIlllllI("GameRules"));
        }
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("Difficulty", 99)) {
            this.IlIlIllllllllIIIIlII = net.minecraft.IIIlIIlIIIIlllIlllII.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll.IlIIIlIlIIIllIlIlIIl("Difficulty"));
        }
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("DifficultyLocked", 1)) {
            this.IIlllIlIIllIlIlIlIIl = iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("DifficultyLocked");
        }
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("BorderCenterX", 99)) {
            this.llIIIlIlIllIIlIlIlII = iiiIlllIIIIIIlIIIlll.lIIIlllIIIllIIIllIII("BorderCenterX");
        }
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("BorderCenterZ", 99)) {
            this.lllllIlIIIlIlIIlllII = iiiIlllIIIIIIlIIIlll.lIIIlllIIIllIIIllIII("BorderCenterZ");
        }
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("BorderSize", 99)) {
            this.lIllllllIIllIlIlIlII = iiiIlllIIIIIIlIIIlll.lIIIlllIIIllIIIllIII("BorderSize");
        }
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("BorderSizeLerpTime", 99)) {
            this.llIIlllIIlllIIllIllI = iiiIlllIIIIIIlIIIlll.llllIIIlIlllIlIIIIIl("BorderSizeLerpTime");
        }
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("BorderSizeLerpTarget", 99)) {
            this.IIlllIIIlIlllIIlllII = iiiIlllIIIIIIlIIIlll.lIIIlllIIIllIIIllIII("BorderSizeLerpTarget");
        }
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("BorderSafeZone", 99)) {
            this.IIlIIIIIllIlIIIlIIll = iiiIlllIIIIIIlIIIlll.lIIIlllIIIllIIIllIII("BorderSafeZone");
        }
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("BorderDamagePerBlock", 99)) {
            this.llllllIllIllIlIllllI = iiiIlllIIIIIIlIIIlll.lIIIlllIIIllIIIllIII("BorderDamagePerBlock");
        }
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("BorderWarningBlocks", 99)) {
            this.IIIllllllIllIIIlllIl = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("BorderWarningBlocks");
        }
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("BorderWarningTime", 99)) {
            this.IlIIIlIIIllllIlIlIlI = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("BorderWarningTime");
        }
    }
    
    public llllIIllllIlIlIIIIll(final IlllIIIIlIIIlIlIlIIl illlIIIIlIIIlIlIlIIl, final String iiiIlllIIIIIIlIIIlll) {
        this.llIllIIIIIllIlIIIIlI = llIllIlIlIIIIIIIllII.IlIlIlIlIlllllllllIl;
        this.IlIIIlIlIIIllIlIlIIl = "";
        this.llIIIlIlIllIIlIlIlII = 0.0;
        this.lllllIlIIIlIlIIlllII = 0.0;
        this.lIllllllIIllIlIlIlII = 6.0E7;
        this.llIIlllIIlllIIllIllI = 0L;
        this.IIlllIIIlIlllIIlllII = 0.0;
        this.IIlIIIIIllIlIIIlIIll = 5.0;
        this.llllllIllIllIlIllllI = 0.2;
        this.IIIllllllIllIIIlllIl = 5;
        this.IlIIIlIIIllllIlIlIlI = 15;
        this.IIIIIllIIIIlIIIIllIl = new lIIIlllIIIllIIIllIII();
        this.llllIIIIlIIIlIlllIll(illlIIIIlIIIlIlIlIIl);
        this.IIIIlllIIIIIIlIIIlll = iiiIlllIIIIIIlIIIlll;
        this.IlIlIllllllllIIIIlII = net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll;
        this.IIIlIIlIIIIlllIlllII = false;
    }
    
    public void llllIIIIlIIIlIlllIll(final IlllIIIIlIIIlIlIlIIl illlIIIIlIIIlIlIlIIl) {
        this.IlIlIlIlIlllllllllIl = illlIIIIlIIIlIlIlIIl.IlIIIlIlIIIllIlIlIIl();
        this.IIIlIIIlIlIIlllIIlll = illlIIIIlIIIlIlIlIIl.IlIlIIIllIllIIIIIllI();
        this.IlIlIIIlIIlIlIIlllIl = illlIIIIlIIIlIlIlIIl.llllIIIlIlllIlIIIIIl();
        this.IlllllllIIIlIIIlIlII = illlIIIIlIIIlIlIlIIl.IllIIlllIIIIlllIIlIl();
        this.llIllIIIIIllIlIIIIlI = illlIIIIlIIIlIlIlIIl.lIIIIlIIIIIlllIllIII();
        this.IlIIIlIlIIIllIlIlIIl = illlIIIIlIIIlIlIlIIl.llIIlIIIlIIIllIlIIIl();
        this.IIlIIIIlllIlllllIlII = illlIIIIlIIIlIlIlIIl.lIIIlllIIIllIIIllIII();
    }
    
    public llllIIllllIlIlIIIIll(final llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll) {
        this.llIllIIIIIllIlIIIIlI = llIllIlIlIIIIIIIllII.IlIlIlIlIlllllllllIl;
        this.IlIIIlIlIIIllIlIlIIl = "";
        this.llIIIlIlIllIIlIlIlII = 0.0;
        this.lllllIlIIIlIlIIlllII = 0.0;
        this.lIllllllIIllIlIlIlII = 6.0E7;
        this.llIIlllIIlllIIllIllI = 0L;
        this.IIlllIIIlIlllIIlllII = 0.0;
        this.IIlIIIIIllIlIIIlIIll = 5.0;
        this.llllllIllIllIlIllllI = 0.2;
        this.IIIllllllIllIIIlllIl = 5;
        this.IlIIIlIIIllllIlIlIlI = 15;
        this.IIIIIllIIIIlIIIIllIl = new lIIIlllIIIllIIIllIII();
        this.IlIlIlIlIlllllllllIl = llllIIllllIlIlIIIIll.IlIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llllIIllllIlIlIIIIll.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl;
        this.IIIlIIIlIlIIlllIIlll = llllIIllllIlIlIIIIll.IIIlIIIlIlIIlllIIlll;
        this.IlIlIIIlIIlIlIIlllIl = llllIIllllIlIlIIIIll.IlIlIIIlIIlIlIIlllIl;
        this.IlIlIIIllIllIIIIIllI = llllIIllllIlIlIIIIll.IlIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = llllIIllllIlIlIIIIll.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llllIIllllIlIlIIIIll.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = llllIIllllIlIlIIIIll.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = llllIIllllIlIlIIIIll.lIIIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl = llllIIllllIlIlIIIIll.llIIlIIIlIIIllIlIIIl;
        this.llIllIlIIIIllIlIIllI = llllIIllllIlIlIIIIll.llIllIlIIIIllIlIIllI;
        this.lIlIlIIIllIIllIIIllI = llllIIllllIlIlIIIIll.lIlIlIIIllIIllIIIllI;
        this.IlIlIIIllIIllIlllllI = llllIIllllIlIlIIIIll.IlIlIIIllIIllIlllllI;
        this.IIIIlllIIIIIIlIIIlll = llllIIllllIlIlIIIIll.IIIIlllIIIIIIlIIIlll;
        this.llllIIllllIlIlIIIIll = llllIIllllIlIlIIIIll.llllIIllllIlIlIIIIll;
        this.lllIIIIlllllIlIIllIl = llllIIllllIlIlIIIIll.lllIIIIlllllIlIIllIl;
        this.IIlllIIlIllIllIlIIll = llllIIllllIlIlIIIIll.IIlllIIlIllIllIlIIll;
        this.IIllIIllIIIlIlIIIIlI = llllIIllllIlIlIIIIll.IIllIIllIIIlIlIIIIlI;
        this.IlIlIIIIIIlllIlIllIl = llllIIllllIlIlIIIIll.IlIlIIIIIIlllIlIllIl;
        this.IlllllllIIIlIIIlIlII = llllIIllllIlIlIIIIll.IlllllllIIIlIIIlIlII;
        this.IIlIIIIlllIlllllIlII = llllIIllllIlIlIIIIll.IIlIIIIlllIlllllIlII;
        this.IIIlIIlIIIIlllIlllII = llllIIllllIlIlIIIIll.IIIlIIlIIIIlllIlllII;
        this.IIIIIllIIIIlIIIIllIl = llllIIllllIlIlIIIIll.IIIIIllIIIIlIIIIllIl;
        this.IlIlIllllllllIIIIlII = llllIIllllIlIlIIIIll.IlIlIllllllllIIIIlII;
        this.IIlllIlIIllIlIlIlIIl = llllIIllllIlIlIIIIll.IIlllIlIIllIlIlIlIIl;
        this.llIIIlIlIllIIlIlIlII = llllIIllllIlIlIIIIll.llIIIlIlIllIIlIlIlII;
        this.lllllIlIIIlIlIIlllII = llllIIllllIlIlIIIIll.lllllIlIIIlIlIIlllII;
        this.lIllllllIIllIlIlIlII = llllIIllllIlIlIIIIll.lIllllllIIllIlIlIlII;
        this.llIIlllIIlllIIllIllI = llllIIllllIlIlIIIIll.llIIlllIIlllIIllIllI;
        this.IIlllIIIlIlllIIlllII = llllIIllllIlIlIIIIll.IIlllIIIlIlllIIlllII;
        this.IIlIIIIIllIlIIIlIIll = llllIIllllIlIlIIIIll.IIlIIIIIllIlIIIlIIll;
        this.llllllIllIllIlIllllI = llllIIllllIlIlIIIIll.llllllIllIllIlIllllI;
        this.IlIIIlIIIllllIlIlIlI = llllIIllllIlIlIIIIll.IlIIIlIIIllllIlIlIlI;
        this.IIIllllllIllIIIlllIl = llllIIllllIlIlIIIIll.IIIllllllIllIIIlllIl;
    }
    
    public IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll() {
        final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = new IIIIlllIIIIIIlIIIlll();
        this.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll, this.lIlIlIIIllIIllIIIllI);
        return iiiIlllIIIIIIlIIIlll;
    }
    
    public IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll2 = new IIIIlllIIIIIIlIIIlll();
        this.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll2, iiiIlllIIIIIIlIIIlll);
        return iiiIlllIIIIIIlIIIlll2;
    }
    
    private void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll, final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll2) {
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("RandomSeed", this.IlIlIlIlIlllllllllIl);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("generatorName", this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll());
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("generatorVersion", this.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl());
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("generatorOptions", this.IlIIIlIlIIIllIlIlIIl);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("GameType", this.IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll());
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("MapFeatures", this.IlIlIIIlIIlIlIIlllIl);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("SpawnX", this.IlIlIIIllIllIIIIIllI);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("SpawnY", this.IllIIlllIIIIlllIIlIl);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("SpawnZ", this.llllIIIlIlllIlIIIIIl);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Time", this.lIIIIlIIIIIlllIllIII);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("DayTime", this.lIIIlllIIIllIIIllIII);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("SizeOnDisk", this.llIllIlIIIIllIlIIllI);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("LastPlayed", net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.lllllIIllIlIllIllllI());
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("LevelName", this.IIIIlllIIIIIIlIIIlll);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("version", this.llllIIllllIlIlIIIIll);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("clearWeatherTime", this.IlIllIlIlIIIlIlIlIII);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("rainTime", this.lllIIIIlllllIlIIllIl);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("raining", this.IIlllIIlIllIllIlIIll);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("thunderTime", this.IIllIIllIIIlIlIIIIlI);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("thundering", this.IlIlIIIIIIlllIlIllIl);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("hardcore", this.IlllllllIIIlIIIlIlII);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("allowCommands", this.IIlIIIIlllIlllllIlII);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("initialized", this.IIIlIIlIIIIlllIlllII);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("BorderCenterX", this.llIIIlIlIllIIlIlIlII);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("BorderCenterZ", this.lllllIlIIIlIlIIlllII);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("BorderSize", this.lIllllllIIllIlIlIlII);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("BorderSizeLerpTime", this.llIIlllIIlllIIllIllI);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("BorderSafeZone", this.IIlIIIIIllIlIIIlIIll);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("BorderDamagePerBlock", this.llllllIllIllIlIllllI);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("BorderSizeLerpTarget", this.IIlllIIIlIlllIIlllII);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("BorderWarningBlocks", (double)this.IIIllllllIllIIIlllIl);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("BorderWarningTime", (double)this.IlIIIlIIIllllIlIlIlI);
        if (this.IlIlIllllllllIIIIlII != null) {
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Difficulty", (byte)this.IlIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll());
        }
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("DifficultyLocked", this.IIlllIlIIllIlIlIlIIl);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("GameRules", this.IIIIIllIIIIlIIIIllIl.llllIIIIlIIIlIlllIll());
        if (iiiIlllIIIIIIlIIIlll2 != null) {
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Player", iiiIlllIIIIIIlIIIlll2);
        }
    }
    
    public long IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public int llIllIIIIIllIlIIIIlI() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public int IlIIIlIlIIIllIlIlIIl() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public int IlIlIIIllIllIIIIIllI() {
        return this.llllIIIlIlllIlIIIIIl;
    }
    
    public long IllIIlllIIIIlllIIlIl() {
        return this.lIIIIlIIIIIlllIllIII;
    }
    
    public long llllIIIlIlllIlIIIIIl() {
        return this.lIIIlllIIIllIIIllIII;
    }
    
    public long lIIIIlIIIIIlllIllIII() {
        return this.llIllIlIIIIllIlIIllI;
    }
    
    public IIIIlllIIIIIIlIIIlll lIIIlllIIIllIIIllIII() {
        return this.lIlIlIIIllIIllIIIllI;
    }
    
    public void llllIIIIlIIIlIlllIll(final int ilIlIIIllIllIIIIIllI) {
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    public void IlIlIlIlIlllllllllIl(final int illIIlllIIIIlllIIlIl) {
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
    }
    
    public void llIllIIIIIllIlIIIIlI(final int llllIIIlIlllIlIIIIIl) {
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final long liiiIlIIIIIlllIllIII) {
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
    }
    
    public void IlIlIlIlIlllllllllIl(final long liiIlllIIIllIIIllIII) {
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        this.IlIlIIIllIllIIIIIllI = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII();
        this.IllIIlllIIIIlllIIlIl = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII();
        this.llllIIIlIlllIlIIIIIl = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl();
    }
    
    public String llIIlIIIlIIIllIlIIIl() {
        return this.IIIIlllIIIIIIlIIIlll;
    }
    
    public void llllIIIIlIIIlIlllIll(final String iiiIlllIIIIIIlIIIlll) {
        this.IIIIlllIIIIIIlIIIlll = iiiIlllIIIIIIlIIIlll;
    }
    
    public int llIllIlIIIIllIlIIllI() {
        return this.llllIIllllIlIlIIIIll;
    }
    
    public void IlIIIlIlIIIllIlIlIIl(final int llllIIllllIlIlIIIIll) {
        this.llllIIllllIlIlIIIIll = llllIIllllIlIlIIIIll;
    }
    
    public long lIlIlIIIllIIllIIIllI() {
        return this.llIIlIIIlIIIllIlIIIl;
    }
    
    public int IlIlIllllllllIIIIlII() {
        return this.IlIllIlIlIIIlIlIlIII;
    }
    
    public void llllIIIlIlllIlIIIIIl(final int ilIllIlIlIIIlIlIlIII) {
        this.IlIllIlIlIIIlIlIlIII = ilIllIlIlIIIlIlIlIII;
    }
    
    public boolean IlIlIIIllIIllIlllllI() {
        return this.IlIlIIIIIIlllIlIllIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final boolean ilIlIIIIIIlllIlIllIl) {
        this.IlIlIIIIIIlllIlIllIl = ilIlIIIIIIlllIlIllIl;
    }
    
    public int IIIIlllIIIIIIlIIIlll() {
        return this.IIllIIllIIIlIlIIIIlI;
    }
    
    public void IlIlIIIllIllIIIIIllI(final int iIllIIllIIIlIlIIIIlI) {
        this.IIllIIllIIIlIlIIIIlI = iIllIIllIIIlIlIIIIlI;
    }
    
    public boolean llllIIllllIlIlIIIIll() {
        return this.IIlllIIlIllIllIlIIll;
    }
    
    public void IlIlIlIlIlllllllllIl(final boolean iIlllIIlIllIllIlIIll) {
        this.IIlllIIlIllIllIlIIll = iIlllIIlIllIllIlIIll;
    }
    
    public int IlIllIlIlIIIlIlIlIII() {
        return this.lllIIIIlllllIlIIllIl;
    }
    
    public void IllIIlllIIIIlllIIlIl(final int lllIIIIlllllIlIIllIl) {
        this.lllIIIIlllllIlIIllIl = lllIIIIlllllIlIIllIl;
    }
    
    public lllIllIIIllllllIllll IIlllIIlIllIllIlIIll() {
        return this.IIIlIIIlIlIIlllIIlll;
    }
    
    public boolean lllIIIIlllllIlIIllIl() {
        return this.IlIlIIIlIIlIlIIlllIl;
    }
    
    public void IllIIlllIIIIlllIIlIl(final boolean ilIlIIIlIIlIlIIlllIl) {
        this.IlIlIIIlIIlIlIIlllIl = ilIlIIIlIIlIlIIlllIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final lllIllIIIllllllIllll iiIlIIIlIlIIlllIIlll) {
        this.IIIlIIIlIlIIlllIIlll = iiIlIIIlIlIIlllIIlll;
    }
    
    public boolean IlIlIIIIIIlllIlIllIl() {
        return this.IlllllllIIIlIIIlIlII;
    }
    
    public void llllIIIlIlllIlIIIIIl(final boolean illlllllIIIlIIIlIlII) {
        this.IlllllllIIIlIIIlIlII = illlllllIIIlIIIlIlII;
    }
    
    public llIllIlIlIIIIIIIllII IIllIIllIIIlIlIIIIlI() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public void llllIIIIlIIIlIlllIll(final llIllIlIlIIIIIIIllII llIllIIIIIllIlIIIIlI) {
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    public String IIlllIlIIllIlIlIlIIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public boolean IIIlIIIlIlIIlllIIlll() {
        return this.IIlIIIIlllIlllllIlII;
    }
    
    public void llIllIIIIIllIlIIIIlI(final boolean iIlIIIIlllIlllllIlII) {
        this.IIlIIIIlllIlllllIlII = iIlIIIIlllIlllllIlII;
    }
    
    public boolean IlIlIIIlIIlIlIIlllIl() {
        return this.IIIlIIlIIIIlllIlllII;
    }
    
    public void IlIIIlIlIIIllIlIlIIl(final boolean iiIlIIlIIIIlllIlllII) {
        this.IIIlIIlIIIIlllIlllII = iiIlIIlIIIIlllIlllII;
    }
    
    public lIIIlllIIIllIIIllIII IlllllllIIIlIIIlIlII() {
        return this.IIIIIllIIIIlIIIIllIl;
    }
    
    public double llIIIlIlIllIIlIlIlII() {
        return this.llIIIlIlIllIIlIlIlII;
    }
    
    public double lllllIlIIIlIlIIlllII() {
        return this.lllllIlIIIlIlIIlllII;
    }
    
    public double lIllllllIIllIlIlIlII() {
        return this.lIllllllIIllIlIlIlII;
    }
    
    public void llllIIIIlIIIlIlllIll(final double lIllllllIIllIlIlIlII) {
        this.lIllllllIIllIlIlIlII = lIllllllIIllIlIlIlII;
    }
    
    public long llIIlllIIlllIIllIllI() {
        return this.llIIlllIIlllIIllIllI;
    }
    
    public void llIllIIIIIllIlIIIIlI(final long llIIlllIIlllIIllIllI) {
        this.llIIlllIIlllIIllIllI = llIIlllIIlllIIllIllI;
    }
    
    public double IIlllIIIlIlllIIlllII() {
        return this.IIlllIIIlIlllIIlllII;
    }
    
    public void IlIlIlIlIlllllllllIl(final double iIlllIIIlIlllIIlllII) {
        this.IIlllIIIlIlllIIlllII = iIlllIIIlIlllIIlllII;
    }
    
    public void llIllIIIIIllIlIIIIlI(final double lllllIlIIIlIlIIlllII) {
        this.lllllIlIIIlIlIIlllII = lllllIlIIIlIlIIlllII;
    }
    
    public void IlIIIlIlIIIllIlIlIIl(final double llIIIlIlIllIIlIlIlII) {
        this.llIIIlIlIllIIlIlIlII = llIIIlIlIllIIlIlIlII;
    }
    
    public double IIlIIIIIllIlIIIlIIll() {
        return this.IIlIIIIIllIlIIIlIIll;
    }
    
    public void IlIlIIIllIllIIIIIllI(final double iIlIIIIIllIlIIIlIIll) {
        this.IIlIIIIIllIlIIIlIIll = iIlIIIIIllIlIIIlIIll;
    }
    
    public double llllllIllIllIlIllllI() {
        return this.llllllIllIllIlIllllI;
    }
    
    public void IllIIlllIIIIlllIIlIl(final double llllllIllIllIlIllllI) {
        this.llllllIllIllIlIllllI = llllllIllIllIlIllllI;
    }
    
    public int IIIllllllIllIIIlllIl() {
        return this.IIIllllllIllIIIlllIl;
    }
    
    public int IlIIIlIIIllllIlIlIlI() {
        return this.IlIIIlIIIllllIlIlIlI;
    }
    
    public void lIIIIlIIIIIlllIllIII(final int iiIllllllIllIIIlllIl) {
        this.IIIllllllIllIIIlllIl = iiIllllllIllIIIlllIl;
    }
    
    public void lIIIlllIIIllIIIllIII(final int ilIIIlIIIllllIlIlIlI) {
        this.IlIIIlIIIllllIlIlIlI = ilIIIlIIIllllIlIlIlI;
    }
    
    public IllIIlllIIIIlllIIlIl IIlIIIIlllIlllllIlII() {
        return this.IlIlIllllllllIIIIlII;
    }
    
    public void llllIIIIlIIIlIlllIll(final IllIIlllIIIIlllIIlIl ilIlIllllllllIIIIlII) {
        this.IlIlIllllllllIIIIlII = ilIlIllllllllIIIIlII;
    }
    
    public boolean IIIlIIlIIIIlllIlllII() {
        return this.IIlllIlIIllIlIlIlIIl;
    }
    
    public void IlIlIIIllIllIIIIIllI(final boolean iIlllIlIIllIlIlIlIIl) {
        this.IIlllIlIIllIlIlIlIIl = iIlllIlIIllIlIlIlIIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
        liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll("Level seed", new IlIllIlIlIIIlIlIlIII(this));
        liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll("Level generator", new IIlllIIlIllIllIlIIll(this));
        liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll("Level generator options", new lllIIIIlllllIlIIllIl(this));
        liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll("Level spawn location", new IlIlIIIIIIlllIlIllIl(this));
        liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll("Level time", new IIllIIllIIIlIlIIIIlI(this));
        liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll("Level dimension", new IIIlIIIlIlIIlllIIlll(this));
        liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll("Level storage version", new IlIlIIIlIIlIlIIlllIl(this));
        liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll("Level weather", new IlllllllIIIlIIIlIlII(this));
        liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll("Level game mode", new IIlIIIIlllIlllllIlII(this));
    }
}
