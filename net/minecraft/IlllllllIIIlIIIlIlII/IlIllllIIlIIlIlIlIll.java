package net.minecraft.IlllllllIIIlIIIlIlII;

import com.google.common.collect.*;
import java.util.*;

public enum IlIllllIIlIIlIlIlIll
{
    llllIIIIlIIIlIlllIll("EXPLOSION_NORMAL", 0, "explode", 0, true), 
    IlIlIlIlIlllllllllIl("EXPLOSION_LARGE", 1, "largeexplode", 1, true), 
    llIllIIIIIllIlIIIIlI("EXPLOSION_HUGE", 2, "hugeexplosion", 2, true), 
    IlIIIlIlIIIllIlIlIIl("FIREWORKS_SPARK", 3, "fireworksSpark", 3, false), 
    IlIlIIIllIllIIIIIllI("WATER_BUBBLE", 4, "bubble", 4, false), 
    IllIIlllIIIIlllIIlIl("WATER_SPLASH", 5, "splash", 5, false), 
    llllIIIlIlllIlIIIIIl("WATER_WAKE", 6, "wake", 6, false), 
    lIIIIlIIIIIlllIllIII("SUSPENDED", 7, "suspended", 7, false), 
    lIIIlllIIIllIIIllIII("SUSPENDED_DEPTH", 8, "depthsuspend", 8, false), 
    llIIlIIIlIIIllIlIIIl("CRIT", 9, "crit", 9, false), 
    llIllIlIIIIllIlIIllI("CRIT_MAGIC", 10, "magicCrit", 10, false), 
    lIlIlIIIllIIllIIIllI("SMOKE_NORMAL", 11, "smoke", 11, false), 
    IlIlIIIllIIllIlllllI("SMOKE_LARGE", 12, "largesmoke", 12, false), 
    IIIIlllIIIIIIlIIIlll("SPELL", 13, "spell", 13, false), 
    llllIIllllIlIlIIIIll("SPELL_INSTANT", 14, "instantSpell", 14, false), 
    IlIllIlIlIIIlIlIlIII("SPELL_MOB", 15, "mobSpell", 15, false), 
    IIlllIIlIllIllIlIIll("SPELL_MOB_AMBIENT", 16, "mobSpellAmbient", 16, false), 
    lllIIIIlllllIlIIllIl("SPELL_WITCH", 17, "witchMagic", 17, false), 
    IlIlIIIIIIlllIlIllIl("DRIP_WATER", 18, "dripWater", 18, false), 
    IIllIIllIIIlIlIIIIlI("DRIP_LAVA", 19, "dripLava", 19, false), 
    IIIlIIIlIlIIlllIIlll("VILLAGER_ANGRY", 20, "angryVillager", 20, false), 
    IlIlIIIlIIlIlIIlllIl("VILLAGER_HAPPY", 21, "happyVillager", 21, false), 
    IlllllllIIIlIIIlIlII("TOWN_AURA", 22, "townaura", 22, false), 
    IIlIIIIlllIlllllIlII("NOTE", 23, "note", 23, false), 
    IIIlIIlIIIIlllIlllII("PORTAL", 24, "portal", 24, false), 
    IlIlIllllllllIIIIlII("ENCHANTMENT_TABLE", 25, "enchantmenttable", 25, false), 
    IIlllIlIIllIlIlIlIIl("FLAME", 26, "flame", 26, false), 
    llIIIlIlIllIIlIlIlII("LAVA", 27, "lava", 27, false), 
    lllllIlIIIlIlIIlllII("FOOTSTEP", 28, "footstep", 28, false), 
    lIllllllIIllIlIlIlII("CLOUD", 29, "cloud", 29, false), 
    llIIlllIIlllIIllIllI("REDSTONE", 30, "reddust", 30, false), 
    IIlllIIIlIlllIIlllII("SNOWBALL", 31, "snowballpoof", 31, false), 
    IIlIIIIIllIlIIIlIIll("SNOW_SHOVEL", 32, "snowshovel", 32, false), 
    llllllIllIllIlIllllI("SLIME", 33, "slime", 33, false), 
    IIIllllllIllIIIlllIl("HEART", 34, "heart", 34, false), 
    IlIIIlIIIllllIlIlIlI("BARRIER", 35, "barrier", 35, false), 
    IIIIIllIIIIlIIIIllIl("ITEM_CRACK", 36, "iconcrack_", 36, false, 2), 
    IIIIIIIIIlllIllIlIlI("BLOCK_CRACK", 37, "blockcrack_", 37, false, 1), 
    IIllllIIIlIIIIIIllIl("BLOCK_DUST", 38, "blockdust_", 38, false, 1), 
    IlllIIIIlIIIlIlIlIIl("WATER_DROP", 39, "droplet", 39, false), 
    lllIllIIIllllllIllll("ITEM_TAKE", 40, "take", 40, false), 
    llIllIlIlIIIIIIIllII("MOB_APPEARANCE", 41, "mobappearance", 41, true);
    
    private final String IIlIlIlIIlIllIIIIIIl;
    private final int IllIllIIIIlIIlIlllII;
    private final boolean IlIllllIIlIIlIlIlIll;
    private final int IllIllIlllIllllIIllI;
    private static final Map llIlIIIIIlIIlIlIIlll;
    private static final String[] IlIIlIlIIIlIIlIlIlII;
    
    static {
        IllIlIIllIllIIlIllII = new IlIllllIIlIIlIlIlIll[] { IlIllllIIlIIlIlIlIll.llllIIIIlIIIlIlllIll, IlIllllIIlIIlIlIlIll.IlIlIlIlIlllllllllIl, IlIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI, IlIllllIIlIIlIlIlIll.IlIIIlIlIIIllIlIlIIl, IlIllllIIlIIlIlIlIll.IlIlIIIllIllIIIIIllI, IlIllllIIlIIlIlIlIll.IllIIlllIIIIlllIIlIl, IlIllllIIlIIlIlIlIll.llllIIIlIlllIlIIIIIl, IlIllllIIlIIlIlIlIll.lIIIIlIIIIIlllIllIII, IlIllllIIlIIlIlIlIll.lIIIlllIIIllIIIllIII, IlIllllIIlIIlIlIlIll.llIIlIIIlIIIllIlIIIl, IlIllllIIlIIlIlIlIll.llIllIlIIIIllIlIIllI, IlIllllIIlIIlIlIlIll.lIlIlIIIllIIllIIIllI, IlIllllIIlIIlIlIlIll.IlIlIIIllIIllIlllllI, IlIllllIIlIIlIlIlIll.IIIIlllIIIIIIlIIIlll, IlIllllIIlIIlIlIlIll.llllIIllllIlIlIIIIll, IlIllllIIlIIlIlIlIll.IlIllIlIlIIIlIlIlIII, IlIllllIIlIIlIlIlIll.IIlllIIlIllIllIlIIll, IlIllllIIlIIlIlIlIll.lllIIIIlllllIlIIllIl, IlIllllIIlIIlIlIlIll.IlIlIIIIIIlllIlIllIl, IlIllllIIlIIlIlIlIll.IIllIIllIIIlIlIIIIlI, IlIllllIIlIIlIlIlIll.IIIlIIIlIlIIlllIIlll, IlIllllIIlIIlIlIlIll.IlIlIIIlIIlIlIIlllIl, IlIllllIIlIIlIlIlIll.IlllllllIIIlIIIlIlII, IlIllllIIlIIlIlIlIll.IIlIIIIlllIlllllIlII, IlIllllIIlIIlIlIlIll.IIIlIIlIIIIlllIlllII, IlIllllIIlIIlIlIlIll.IlIlIllllllllIIIIlII, IlIllllIIlIIlIlIlIll.IIlllIlIIllIlIlIlIIl, IlIllllIIlIIlIlIlIll.llIIIlIlIllIIlIlIlII, IlIllllIIlIIlIlIlIll.lllllIlIIIlIlIIlllII, IlIllllIIlIIlIlIlIll.lIllllllIIllIlIlIlII, IlIllllIIlIIlIlIlIll.llIIlllIIlllIIllIllI, IlIllllIIlIIlIlIlIll.IIlllIIIlIlllIIlllII, IlIllllIIlIIlIlIlIll.IIlIIIIIllIlIIIlIIll, IlIllllIIlIIlIlIlIll.llllllIllIllIlIllllI, IlIllllIIlIIlIlIlIll.IIIllllllIllIIIlllIl, IlIllllIIlIIlIlIlIll.IlIIIlIIIllllIlIlIlI, IlIllllIIlIIlIlIlIll.IIIIIllIIIIlIIIIllIl, IlIllllIIlIIlIlIlIll.IIIIIIIIIlllIllIlIlI, IlIllllIIlIIlIlIlIll.IIllllIIIlIIIIIIllIl, IlIllllIIlIIlIlIlIll.IlllIIIIlIIIlIlIlIIl, IlIllllIIlIIlIlIlIll.lllIllIIIllllllIllll, IlIllllIIlIIlIlIlIll.llIllIlIlIIIIIIIllII };
        llIlIIIIIlIIlIlIIlll = Maps.newHashMap();
        final ArrayList arrayList = Lists.newArrayList();
        IlIllllIIlIIlIlIlIll[] values;
        for (int length = (values = values()).length, i = 0; i < length; ++i) {
            final IlIllllIIlIIlIlIlIll ilIllllIIlIIlIlIlIll = values[i];
            IlIllllIIlIIlIlIlIll.llIlIIIIIlIIlIlIIlll.put(ilIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI(), ilIllllIIlIIlIlIlIll);
            if (!ilIllllIIlIIlIlIlIll.IlIlIlIlIlllllllllIl().endsWith("_")) {
                arrayList.add(ilIllllIIlIIlIlIlIll.IlIlIlIlIlllllllllIl());
            }
        }
        IlIIlIlIIIlIIlIlIlII = arrayList.toArray(new String[arrayList.size()]);
    }
    
    private IlIllllIIlIIlIlIlIll(final String s, final int n, final String iIlIlIlIIlIllIIIIIIl, final int illIllIIIIlIIlIlllII, final boolean ilIllllIIlIIlIlIlIll, final int illIllIlllIllllIIllI) {
        this.IIlIlIlIIlIllIIIIIIl = iIlIlIlIIlIllIIIIIIl;
        this.IllIllIIIIlIIlIlllII = illIllIIIIlIIlIlllII;
        this.IlIllllIIlIIlIlIlIll = ilIllllIIlIIlIlIlIll;
        this.IllIllIlllIllllIIllI = illIllIlllIllllIIllI;
    }
    
    private IlIllllIIlIIlIlIlIll(final String s, final int n, final String s2, final int n2, final boolean b) {
        this(s, n, s2, n2, b, 0);
    }
    
    public static String[] llllIIIIlIIIlIlllIll() {
        return IlIllllIIlIIlIlIlIll.IlIIlIlIIIlIIlIlIlII;
    }
    
    public String IlIlIlIlIlllllllllIl() {
        return this.IIlIlIlIIlIllIIIIIIl;
    }
    
    public int llIllIIIIIllIlIIIIlI() {
        return this.IllIllIIIIlIIlIlllII;
    }
    
    public int IlIIIlIlIIIllIlIlIIl() {
        return this.IllIllIlllIllllIIllI;
    }
    
    public boolean IlIlIIIllIllIIIIIllI() {
        return this.IlIllllIIlIIlIlIlIll;
    }
    
    public boolean IllIIlllIIIIlllIIlIl() {
        return this.IllIllIlllIllllIIllI > 0;
    }
    
    public static IlIllllIIlIIlIlIlIll llllIIIIlIIIlIlllIll(final int n) {
        return IlIllllIIlIIlIlIlIll.llIlIIIIIlIIlIlIIlll.get(n);
    }
}
