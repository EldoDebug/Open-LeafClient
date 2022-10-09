package net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl;

import java.util.*;
import com.google.common.collect.*;

public enum lIlIlIIIllIIllIIIllI
{
    llllIIIIlIIIlIlllIll("RIDEABLE", 0, 0, "MinecartRideable"), 
    IlIlIlIlIlllllllllIl("CHEST", 1, 1, "MinecartChest"), 
    llIllIIIIIllIlIIIIlI("FURNACE", 2, 2, "MinecartFurnace"), 
    IlIIIlIlIIIllIlIlIIl("TNT", 3, 3, "MinecartTNT"), 
    IlIlIIIllIllIIIIIllI("SPAWNER", 4, 4, "MinecartSpawner"), 
    IllIIlllIIIIlllIIlIl("HOPPER", 5, 5, "MinecartHopper"), 
    llllIIIlIlllIlIIIIIl("COMMAND_BLOCK", 6, 6, "MinecartCommandBlock");
    
    private static final Map lIIIIlIIIIIlllIllIII;
    private final int lIIIlllIIIllIIIllIII;
    private final String llIIlIIIlIIIllIlIIIl;
    
    static {
        llIllIlIIIIllIlIIllI = new lIlIlIIIllIIllIIIllI[] { lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll, lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl, lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI, lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl, lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI, lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl, lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl };
        lIIIIlIIIIIlllIllIII = Maps.newHashMap();
        lIlIlIIIllIIllIIIllI[] values;
        for (int length = (values = values()).length, i = 0; i < length; ++i) {
            final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI = values[i];
            net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII.put(lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(), lIlIlIIIllIIllIIIllI);
        }
    }
    
    private lIlIlIIIllIIllIIIllI(final String s, final int n, final int liiIlllIIIllIIIllIII, final String llIIlIIIlIIIllIlIIIl) {
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return this.lIIIlllIIIllIIIllIII;
    }
    
    public String IlIlIlIlIlllllllllIl() {
        return this.llIIlIIIlIIIllIlIIIl;
    }
    
    public static lIlIlIIIllIIllIIIllI llllIIIIlIIIlIlllIll(final int n) {
        final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI = net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII.get(n);
        return (lIlIlIIIllIIllIIIllI == null) ? net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll : lIlIlIIIllIIllIIIllI;
    }
}
