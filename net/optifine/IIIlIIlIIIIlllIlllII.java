package net.optifine;

import net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.optifine.util.*;
import net.optifine.llllIIIIlIIIlIlllIll.*;
import net.optifine.lIIIIlIIIIIlllIllIII.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;
import java.util.*;

public class IIIlIIlIIIIlllIlllII
{
    private String llllIIIIlIIIlIlllIll;
    private String IlIlIlIlIlllllllllIl;
    private IlIlIllllllllIIIIlII llIllIIIIIllIlIIIIlI;
    private Map IlIIIlIlIIIllIlIlIIl;
    private lIlIlIIIllIIllIIIllI IlIlIIIllIllIIIIIllI;
    private llIIlIIIlIIIllIlIIIl[] IllIIlllIIIIlllIIlIl;
    private llllIIllllIlIlIIIIll llllIIIlIlllIlIIIIIl;
    private Boolean lIIIIlIIIIIlllIllIII;
    private Boolean lIIIlllIIIllIIIllIII;
    private Boolean llIIlIIIlIIIllIlIIIl;
    private Boolean llIllIlIIIIllIlIIllI;
    private llllIIllllIlIlIIIIll lIlIlIIIllIIllIIIllI;
    private IlIllIlIlIIIlIlIlIII[] IlIlIIIllIIllIlllllI;
    private IIlllIlIIllIlIlIlIIl[] IIIIlllIIIIIIlIIIlll;
    private IlIlIlIlIlllllllllIl[] llllIIllllIlIlIIIIll;
    private static final IIlllIlIIllIlIlIlIIl[] IlIllIlIlIIIlIlIlIII;
    private static final IIlllIlIIllIlIlIlIIl[] IIlllIIlIllIllIlIIll;
    private static final IIlllIlIIllIlIlIlIIl[] lllIIIIlllllIlIIllIl;
    private static final IlIlIlIlIlllllllllIl[] IlIlIIIIIIlllIlIllIl;
    private static final lIllllIllIllIIllllll IIllIIllIIIlIlIIIIlI;
    private static final lIllllIllIllIIllllll IIIlIIIlIlIIlllIIlll;
    private static final lIllllIllIllIIllllll IlIlIIIlIIlIlIIlllIl;
    private static final lIllllIllIllIIllllll IlllllllIIIlIIIlIlII;
    private static final lIllllIllIllIIllllll IIlIIIIlllIlllllIlII;
    private static final lIllllIllIllIIllllll IIIlIIlIIIIlllIlllII;
    private static final lIllllIllIllIIllllll IlIlIllllllllIIIIlII;
    private static final lIllllIllIllIIllllll IIlllIlIIllIlIlIlIIl;
    private static final lIllllIllIllIIllllll llIIIlIlIllIIlIlIlII;
    private static final lIllllIllIllIIllllll lllllIlIIIlIlIIlllII;
    private static final lIllllIllIllIIllllll lIllllllIIllIlIlIlII;
    private static final lIllllIllIllIIllllll llIIlllIIlllIIllIllI;
    private static final lIllllIllIllIIllllll IIlllIIIlIlllIIlllII;
    private static volatile /* synthetic */ int[] IIlIIIIIllIlIIIlIIll;
    
    static {
        IlIllIlIlIIIlIlIlIII = new IIlllIlIIllIlIlIlIIl[] { net.optifine.IIlllIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll, net.optifine.IIlllIlIIllIlIlIlIIl.IlIlIlIlIlllllllllIl, net.optifine.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI, net.optifine.IIlllIlIIllIlIlIlIIl.IlIIIlIlIIIllIlIlIIl };
        IIlllIIlIllIllIlIIll = new IIlllIlIIllIlIlIlIIl[] { net.optifine.IIlllIlIIllIlIlIlIIl.IlIlIIIllIllIIIIIllI, net.optifine.IIlllIlIIllIlIlIlIIl.IllIIlllIIIIlllIIlIl };
        lllIIIIlllllIlIIllIl = new IIlllIlIIllIlIlIlIIl[0];
        IlIlIIIIIIlllIlIllIl = new IlIlIlIlIlllllllllIl[0];
        IIllIIllIIIlIlIIIIlI = new lIllllIllIllIIllllll("textures/gui/container/anvil.png");
        IIIlIIIlIlIIlllIIlll = new lIllllIllIllIIllllll("textures/gui/container/beacon.png");
        IlIlIIIlIIlIlIIlllIl = new lIllllIllIllIIllllll("textures/gui/container/brewing_stand.png");
        IlllllllIIIlIIIlIlII = new lIllllIllIllIIllllll("textures/gui/container/generic_54.png");
        IIlIIIIlllIlllllIlII = new lIllllIllIllIIllllll("textures/gui/container/crafting_table.png");
        IIIlIIlIIIIlllIlllII = new lIllllIllIllIIllllll("textures/gui/container/horse.png");
        IlIlIllllllllIIIIlII = new lIllllIllIllIIllllll("textures/gui/container/dispenser.png");
        IIlllIlIIllIlIlIlIIl = new lIllllIllIllIIllllll("textures/gui/container/enchanting_table.png");
        llIIIlIlIllIIlIlIlII = new lIllllIllIllIIllllll("textures/gui/container/furnace.png");
        lllllIlIIIlIlIIlllII = new lIllllIllIllIIllllll("textures/gui/container/hopper.png");
        lIllllllIIllIlIlIlII = new lIllllIllIllIIllllll("textures/gui/container/inventory.png");
        llIIlllIIlllIIllIllI = new lIllllIllIllIIllllll("textures/gui/container/shulker_box.png");
        IIlllIIIlIlllIIlllII = new lIllllIllIllIIllllll("textures/gui/container/villager.png");
    }
    
    public IIIlIIlIIIIlllIlllII(final Properties properties, final String s) {
        this.llllIIIIlIIIlIlllIll = null;
        this.IlIlIlIlIlllllllllIl = null;
        this.llIllIIIIIllIlIIIIlI = null;
        this.IlIIIlIlIIIllIlIlIIl = null;
        this.IlIlIIIllIllIIIIIllI = null;
        this.IllIIlllIIIIlllIIlIl = null;
        this.llllIIIlIlllIlIIIIIl = null;
        this.lIIIIlIIIIIlllIllIII = null;
        this.lIIIlllIIIllIIIllIII = null;
        this.llIIlIIIlIIIllIlIIIl = null;
        this.llIllIlIIIIllIlIIllI = null;
        this.lIlIlIIIllIIllIIIllI = null;
        this.IlIlIIIllIIllIlllllI = null;
        this.IIIIlllIIIIIIlIIIlll = null;
        this.llllIIllllIlIlIIIIll = null;
        final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = new llllIIIIlIIIlIlllIll("CustomGuis");
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s);
        this.IlIlIlIlIlllllllllIl = llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(s);
        this.llIllIIIIIllIlIIIIlI = (IlIlIllllllllIIIIlII)llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(properties.getProperty("container"), net.optifine.IlIlIllllllllIIIIlII.values(), "container");
        this.IlIIIlIlIIIllIlIlIIl = llllIIIIlIIIlIlllIll(properties, "texture", this.llIllIIIIIllIlIIIIlI, "textures/gui/", this.IlIlIlIlIlllllllllIl);
        this.IlIlIIIllIllIIIIIllI = llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl("name", properties.getProperty("name"));
        this.IllIIlllIIIIlllIIlIl = llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl(properties.getProperty("biomes"));
        this.llllIIIlIlllIlIIIIIl = llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI(properties.getProperty("heights"));
        this.lIIIIlIIIIIlllIllIII = llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI(properties.getProperty("large"));
        this.lIIIlllIIIllIIIllIII = llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI(properties.getProperty("trapped"));
        this.llIIlIIIlIIIllIlIIIl = llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI(properties.getProperty("christmas"));
        this.llIllIlIIIIllIlIIllI = llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI(properties.getProperty("ender"));
        this.lIlIlIIIllIIllIIIllI = llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI(properties.getProperty("levels"));
        this.IlIlIIIllIIllIlllllI = llllIIIIlIIIlIlllIll.IIIIlllIIIIIIlIIIlll(properties.getProperty("professions"));
        this.IIIIlllIIIIIIlIIIlll = (IIlllIlIIllIlIlIlIIl[])llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(properties.getProperty("variants"), llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI), "variants", net.optifine.IIIlIIlIIIIlllIlllII.lllIIIIlllllIlIIllIl);
        this.llllIIllllIlIlIIIIll = IlIlIlIlIlllllllllIl(properties.getProperty("colors"));
    }
    
    private static IIlllIlIIllIlIlIlIIl[] llllIIIIlIIIlIlllIll(final IlIlIllllllllIIIIlII ilIlIllllllllIIIIlII) {
        return (ilIlIllllllllIIIIlII == net.optifine.IlIlIllllllllIIIIlII.llIIlIIIlIIIllIlIIIl) ? net.optifine.IIIlIIlIIIIlllIlllII.IlIllIlIlIIIlIlIlIII : ((ilIlIllllllllIIIIlII == net.optifine.IlIlIllllllllIIIIlII.IllIIlllIIIIlllIIlIl) ? net.optifine.IIIlIIlIIIIlllIlllII.IIlllIIlIllIllIlIIll : new IIlllIlIIllIlIlIlIIl[0]);
    }
    
    private static IlIlIlIlIlllllllllIl[] IlIlIlIlIlllllllllIl(String lowerCase) {
        if (lowerCase == null) {
            return null;
        }
        lowerCase = lowerCase.toLowerCase();
        final String[] llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(lowerCase, " ");
        final IlIlIlIlIlllllllllIl[] array = new IlIlIlIlIlllllllllIl[llllIIIIlIIIlIlllIll.length];
        for (int i = 0; i < llllIIIIlIIIlIlllIll.length; ++i) {
            final String s = llllIIIIlIIIlIlllIll[i];
            final IlIlIlIlIlllllllllIl llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI(s);
            if (llIllIIIIIllIlIIIIlI == null) {
                IlIIIlIlIIIllIlIlIIl("Invalid color: " + s);
                return net.optifine.IIIlIIlIIIIlllIlllII.IlIlIIIIIIlllIlIllIl;
            }
            array[i] = llIllIIIIIllIlIIIIlI;
        }
        return array;
    }
    
    private static IlIlIlIlIlllllllllIl llIllIIIIIllIlIIIIlI(final String s) {
        if (s == null) {
            return null;
        }
        final IlIlIlIlIlllllllllIl[] values = IlIlIlIlIlllllllllIl.values();
        for (int i = 0; i < values.length; ++i) {
            final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = values[i];
            if (ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll().equals(s)) {
                return ilIlIlIlIlllllllllIl;
            }
            if (ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl().equals(s)) {
                return ilIlIlIlIlllllllllIl;
            }
        }
        return null;
    }
    
    private static lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(String trim, final String s) {
        if (trim == null) {
            return null;
        }
        trim = trim.trim();
        String s2 = IlIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll(trim, s);
        if (!s2.endsWith(".png")) {
            s2 = String.valueOf(s2) + ".png";
        }
        return new lIllllIllIllIIllllll(String.valueOf(s) + "/" + s2);
    }
    
    private static Map llllIIIIlIIIlIlllIll(final Properties properties, final String s, final IlIlIllllllllIIIIlII ilIlIllllllllIIIIlII, final String s2, final String s3) {
        final HashMap<lIllllIllIllIIllllll, lIllllIllIllIIllllll> hashMap = new HashMap<lIllllIllIllIIllllll, lIllllIllIllIIllllll>();
        final String property = properties.getProperty(s);
        if (property != null) {
            final lIllllIllIllIIllllll ilIlIlIlIlllllllllIl = IlIlIlIlIlllllllllIl(ilIlIllllllllIIIIlII);
            final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(property, s3);
            if (ilIlIlIlIlllllllllIl != null && llllIIIIlIIIlIlllIll != null) {
                hashMap.put(ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll);
            }
        }
        final String string = String.valueOf(s) + ".";
        for (final String s4 : ((Hashtable<String, V>)properties).keySet()) {
            if (s4.startsWith(string)) {
                hashMap.put(new lIllllIllIllIIllllll(String.valueOf(s2) + IIIllllllIllIIIlllIl.llIllIIIIIllIlIIIIlI(s4.substring(string.length()).replace('\\', '/'), "/", ".png") + ".png"), llllIIIIlIIIlIlllIll(properties.getProperty(s4), s3));
            }
        }
        return hashMap;
    }
    
    private static lIllllIllIllIIllllll IlIlIlIlIlllllllllIl(final IlIlIllllllllIIIIlII ilIlIllllllllIIIIlII) {
        if (ilIlIllllllllIIIIlII == null) {
            return null;
        }
        switch (IlIlIlIlIlllllllllIl()[ilIlIllllllllIIIIlII.ordinal()]) {
            case 1: {
                return net.optifine.IIIlIIlIIIIlllIlllII.IIllIIllIIIlIlIIIIlI;
            }
            case 2: {
                return net.optifine.IIIlIIlIIIIlllIlllII.IIIlIIIlIlIIlllIIlll;
            }
            case 3: {
                return net.optifine.IIIlIIlIIIIlllIlllII.IlIlIIIlIIlIlIIlllIl;
            }
            case 4: {
                return net.optifine.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII;
            }
            case 5: {
                return net.optifine.IIIlIIlIIIIlllIlllII.IIlIIIIlllIlllllIlII;
            }
            case 13: {
                return null;
            }
            case 6: {
                return net.optifine.IIIlIIlIIIIlllIlllII.IlIlIllllllllIIIIlII;
            }
            case 7: {
                return net.optifine.IIIlIIlIIIIlllIlllII.IIlllIlIIllIlIlIlIIl;
            }
            case 8: {
                return net.optifine.IIIlIIlIIIIlllIlllII.llIIIlIlIllIIlIlIlII;
            }
            case 9: {
                return net.optifine.IIIlIIlIIIIlllIlllII.lllllIlIIIlIlIIlllII;
            }
            case 10: {
                return net.optifine.IIIlIIlIIIIlllIlllII.IIIlIIlIIIIlllIlllII;
            }
            case 14: {
                return net.optifine.IIIlIIlIIIIlllIlllII.lIllllllIIllIlIlIlII;
            }
            case 12: {
                return net.optifine.IIIlIIlIIIIlllIlllII.llIIlllIIlllIIllIllI;
            }
            case 11: {
                return net.optifine.IIIlIIlIIIIlllIlllII.IIlllIIIlIlllIIlllII;
            }
            default: {
                return null;
            }
        }
    }
    
    public boolean llllIIIIlIIIlIlllIll(final String s) {
        if (this.llllIIIIlIIIlIlllIll == null || this.llllIIIIlIIIlIlllIll.length() <= 0) {
            IlIIIlIlIIIllIlIlIIl("No name found: " + s);
            return false;
        }
        if (this.IlIlIlIlIlllllllllIl == null) {
            IlIIIlIlIIIllIlIlIIl("No base path found: " + s);
            return false;
        }
        if (this.llIllIIIIIllIlIIIIlI == null) {
            IlIIIlIlIIIllIlIlIIl("No container found: " + s);
            return false;
        }
        if (this.IlIIIlIlIIIllIlIlIIl.isEmpty()) {
            IlIIIlIlIIIllIlIlIIl("No texture found: " + s);
            return false;
        }
        if (this.IlIlIIIllIIllIlllllI == net.optifine.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll) {
            IlIIIlIlIIIllIlIlIIl("Invalid professions or careers: " + s);
            return false;
        }
        if (this.IIIIlllIIIIIIlIIIlll == net.optifine.IIIlIIlIIIIlllIlllII.lllIIIIlllllIlIIllIl) {
            IlIIIlIlIIIllIlIlIIl("Invalid variants: " + s);
            return false;
        }
        if (this.llllIIllllIlIlIIIIll == net.optifine.IIIlIIlIIIIlllIlllII.IlIlIIIIIIlllIlIllIl) {
            IlIIIlIlIIIllIlIlIIl("Invalid colors: " + s);
            return false;
        }
        return true;
    }
    
    private static void IlIIIlIlIIIllIlIlIIl(final String s) {
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("[CustomGuis] " + s);
    }
    
    private boolean llllIIIIlIIIlIlllIll(final IlIlIllllllllIIIIlII ilIlIllllllllIIIIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.IIIlIIlIIIIlllIlllII.lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI) {
        return this.llIllIIIIIllIlIIIIlI == ilIlIllllllllIIIIlII && (this.IllIIlllIIIIlllIIlIl == null || net.optifine.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl), this.IllIIlllIIIIlllIIlIl)) && (this.llllIIIlIlllIlIIIIIl == null || this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII()));
    }
    
    public boolean llllIIIIlIIIlIlllIll(final IlIlIllllllllIIIIlII ilIlIllllllllIIIIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.IIIlIIlIIIIlllIlllII.lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI) {
        if (!this.llllIIIIlIIIlIlllIll(ilIlIllllllllIIIIlII, ilIlIlIlIlllllllllIl, lIlIlIIIllIIllIIIllI)) {
            return false;
        }
        if (this.IlIlIIIllIllIIIIIllI != null && !this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(liIllIIIllllIlllIllI))) {
            return false;
        }
        switch (IlIlIlIlIlllllllllIl()[ilIlIllllllllIIIIlII.ordinal()]) {
            case 2: {
                return this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, lIlIlIIIllIIllIIIllI);
            }
            case 4: {
                return this.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl, lIlIlIIIllIIllIIIllI);
            }
            case 6: {
                return this.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl, lIlIlIIIllIIllIIIllI);
            }
            default: {
                return true;
            }
        }
    }
    
    public static String llllIIIIlIIIlIlllIll(final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI) {
        final net.minecraft.IIIlIIlIIIIlllIlllII.IlIllIlIlIIIlIlIlIII ilIlIlIlIlllllllllIl = IlIlIlIlIlllllllllIl(liIllIIIllllIlllIllI);
        return (ilIlIlIlIlllllllllIl == null) ? null : ilIlIlIlIlllllllllIl.v_().lIIIIlIIIIIlllIllIII();
    }
    
    private static net.minecraft.IIIlIIlIIIIlllIlllII.IlIllIlIlIIIlIlIlIII IlIlIlIlIlllllllllIl(final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI) {
        return (liIllIIIllllIlllIllI instanceof net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl) ? llllIIIIlIIIlIlllIll(liIllIIIllllIlllIllI, lIIIIlIIIIIlllIllIII.aV) : ((liIllIIIllllIlllIllI instanceof llllIIIlIlllIlIIIIIl) ? llllIIIIlIIIlIlllIll(liIllIIIllllIlllIllI, lIIIIlIIIIIlllIllIII.aX) : ((liIllIIIllllIlllIllI instanceof net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII) ? llllIIIIlIIIlIlllIll(liIllIIIllllIlllIllI, lIIIIlIIIIIlllIllIII.aZ) : ((liIllIIIllllIlllIllI instanceof IIIIlllIIIIIIlIIIlll) ? ((IIIIlllIIIIIIlIIIlll)liIllIIIllllIlllIllI).IlIlIIIllIllIIIIIllI : ((liIllIIIllllIlllIllI instanceof IIIlIIIlIlIIlllIIlll) ? llllIIIIlIIIlIlllIll(liIllIIIllllIlllIllI, lIIIIlIIIIIlllIllIII.bb) : ((liIllIIIllllIlllIllI instanceof net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IlIllIlIlIIIlIlIlIII) ? llllIIIIlIIIlIlllIll(liIllIIIllllIlllIllI, lIIIIlIIIIIlllIllIII.bd) : ((liIllIIIllllIlllIllI instanceof net.minecraft.client.llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl) ? llllIIIIlIIIlIlllIll(liIllIIIllllIlllIllI, lIIIIlIIIIIlllIllIII.bf) : null))))));
    }
    
    private static net.minecraft.IIIlIIlIIIIlllIlllII.IlIllIlIlIIIlIlIlIII llllIIIIlIIIlIlllIll(final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI, final net.optifine.lIIIIlIIIIIlllIllIII.lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI) {
        final Object llllIIIIlIIIlIlllIll = lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(liIllIIIllllIlllIllI, lIlIlIIIllIIllIIIllI);
        return (llllIIIIlIIIlIlllIll instanceof net.minecraft.IIIlIIlIIIIlllIlllII.IlIllIlIlIIIlIlIlIII) ? ((net.minecraft.IIIlIIlIIIIlllIlllII.IlIllIlIlIIIlIlIlIII)llllIIIIlIIIlIlllIll) : null;
    }
    
    private boolean llllIIIIlIIIlIlllIll(final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.IIIlIIlIIIIlllIlllII.lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI) {
        final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
        if (!(llllIIIIlIIIlIlllIll instanceof net.minecraft.IlIlIIIlIIlIlIIlllIl.llIIlIIIlIIIllIlIIIl)) {
            return false;
        }
        final net.minecraft.IlIlIIIlIIlIlIIlllIl.llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl = (net.minecraft.IlIlIIIlIIlIlIIlllIl.llIIlIIIlIIIllIlIIIl)llllIIIIlIIIlIlllIll;
        if (this.lIlIlIIIllIIllIIIllI != null) {
            final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = new net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll();
            llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
            if (!this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("Levels"))) {
                return false;
            }
        }
        return true;
    }
    
    private boolean IlIlIlIlIlllllllllIl(final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.IIIlIIlIIIIlllIlllII.lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI) {
        final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
        if (llllIIIIlIIIlIlllIll instanceof IlIlIIIllIIllIlllllI) {
            return this.llllIIIIlIIIlIlllIll((IlIlIIIllIIllIlllllI)llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl, lIlIlIIIllIIllIIIllI);
        }
        return llllIIIIlIIIlIlllIll instanceof IlIlIIIlIIlIlIIlllIl && this.llllIIIIlIIIlIlllIll((IlIlIIIlIIlIlIIlllIl)llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl, lIlIlIIIllIIllIIIllI);
    }
    
    private boolean llllIIIIlIIIlIlllIll(final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.IIIlIIlIIIIlllIlllII.lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI) {
        return this.llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII != null || ilIlIIIllIIllIlllllI.llllIIIlIlllIlIIIIIl != null || ilIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl != null || ilIlIIIllIIllIlllllI.lIIIlllIIIllIIIllIII != null, ilIlIIIllIIllIlllllI.IlIlIIIlIIlIlIIlllIl() == 1, net.optifine.llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll, false);
    }
    
    private boolean llllIIIIlIIIlIlllIll(final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.IIIlIIlIIIIlllIlllII.lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI) {
        return this.llllIIIIlIIIlIlllIll(false, false, false, true);
    }
    
    private boolean llllIIIIlIIIlIlllIll(final boolean b, final boolean b2, final boolean b3, final boolean b4) {
        return (this.lIIIIlIIIIIlllIllIII == null || this.lIIIIlIIIIIlllIllIII == b) && (this.lIIIlllIIIllIIIllIII == null || this.lIIIlllIIIllIIIllIII == b2) && (this.llIIlIIIlIIIllIlIIIl == null || this.llIIlIIIlIIIllIlIIIl == b3) && (this.llIllIlIIIIllIlIIllI == null || this.llIllIlIIIIllIlIIllI == b4);
    }
    
    private boolean llIllIIIIIllIlIIIIlI(final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.IIIlIIlIIIIlllIlllII.lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI) {
        final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
        if (!(llllIIIIlIIIlIlllIll instanceof lllIIIIlllllIlIIllIl)) {
            return false;
        }
        final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl = (lllIIIIlllllIlIIllIl)llllIIIIlIIIlIlllIll;
        return this.IIIIlllIIIIIIlIIIlll == null || net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl), this.IIIIlllIIIIIIlIIIlll);
    }
    
    private IIlllIlIIllIlIlIlIIl llllIIIIlIIIlIlllIll(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        return (lllIIIIlllllIlIIllIl instanceof IlIlIIIIIIlllIlIllIl) ? net.optifine.IIlllIlIIllIlIlIlIIl.IllIIlllIIIIlllIIlIl : net.optifine.IIlllIlIIllIlIlIlIIl.IlIlIIIllIllIIIIIllI;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final IlIlIllllllllIIIIlII ilIlIllllllllIIIIlII, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final net.minecraft.IIIlIIlIIIIlllIlllII.lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI) {
        if (!this.llllIIIIlIIIlIlllIll(ilIlIllllllllIIIIlII, llIllIIIIIllIlIIIIlI.IlIlIIIlIIlIlIIlllIl(), lIlIlIIIllIIllIIIllI)) {
            return false;
        }
        if (this.IlIlIIIllIllIIIIIllI != null && !this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI.s_())) {
            return false;
        }
        switch (IlIlIlIlIlllllllllIl()[ilIlIllllllllIIIIlII.ordinal()]) {
            case 10: {
                return this.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI, lIlIlIIIllIIllIIIllI);
            }
            case 11: {
                return this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, lIlIlIIIllIIllIIIllI);
            }
            default: {
                return true;
            }
        }
    }
    
    private boolean llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final net.minecraft.IIIlIIlIIIIlllIlllII.lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI) {
        if (!(llIllIIIIIllIlIIIIlI instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IlIlIllllllllIIIIlII)) {
            return false;
        }
        final net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IlIlIllllllllIIIIlII ilIlIllllllllIIIIlII = (net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IlIlIllllllllIIIIlII)llIllIIIIIllIlIIIIlI;
        if (this.IlIlIIIllIIllIlllllI != null) {
            final int an = ilIlIllllllllIIIIlII.an();
            final int llllIIIIlIIIlIlllIll = net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(ilIlIllllllllIIIIlII, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.aS, -1);
            if (llllIIIIlIIIlIlllIll < 0) {
                return false;
            }
            boolean b = false;
            for (int i = 0; i < this.IlIlIIIllIIllIlllllI.length; ++i) {
                if (this.IlIlIIIllIIllIlllllI[i].llllIIIIlIIIlIlllIll(an, llllIIIIlIIIlIlllIll)) {
                    b = true;
                    break;
                }
            }
            if (!b) {
                return false;
            }
        }
        return true;
    }
    
    private boolean IlIlIlIlIlllllllllIl(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final net.minecraft.IIIlIIlIIIIlllIlllII.lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI) {
        if (!(llIllIIIIIllIlIIIIlI instanceof IllIIlllIIIIlllIIlIl)) {
            return false;
        }
        final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl = (IllIIlllIIIIlllIIlIl)llIllIIIIIllIlIIIIlI;
        return this.IIIIlllIIIIIIlIIIlll == null || net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl), this.IIIIlllIIIIIIlIIIlll);
    }
    
    private IIlllIlIIllIlIlIlIIl llllIIIIlIIIlIlllIll(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl) {
        switch (illIIlllIIIIlllIIlIl.aq()) {
            case 0: {
                return net.optifine.IIlllIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll;
            }
            case 1: {
                return net.optifine.IIlllIlIIllIlIlIlIIl.IlIlIlIlIlllllllllIl;
            }
            case 2: {
                return net.optifine.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI;
            }
            default: {
                return null;
            }
        }
    }
    
    public IlIlIllllllllIIIIlII llllIIIIlIIIlIlllIll() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final lIllllIllIllIIllllll lIllllIllIllIIllllll) {
        final lIllllIllIllIIllllll lIllllIllIllIIllllll2 = this.IlIIIlIlIIIllIlIlIIl.get(lIllllIllIllIIllllll);
        return (lIllllIllIllIIllllll2 == null) ? lIllllIllIllIIllllll : lIllllIllIllIIllllll2;
    }
    
    @Override
    public String toString() {
        return "name: " + this.llllIIIIlIIIlIlllIll + ", container: " + this.llIllIIIIIllIlIIIIlI + ", textures: " + this.IlIIIlIlIIIllIlIlIIl;
    }
    
    static /* synthetic */ int[] IlIlIlIlIlllllllllIl() {
        final int[] iIlIIIIIllIlIIIlIIll = net.optifine.IIIlIIlIIIIlllIlllII.IIlIIIIIllIlIIIlIIll;
        if (iIlIIIIIllIlIIIlIIll != null) {
            return iIlIIIIIllIlIIIlIIll;
        }
        final int[] iIlIIIIIllIlIIIlIIll2 = new int[net.optifine.IlIlIllllllllIIIIlII.values().length];
        try {
            iIlIIIIIllIlIIIlIIll2[net.optifine.IlIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            iIlIIIIIllIlIIIlIIll2[net.optifine.IlIlIllllllllIIIIlII.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            iIlIIIIIllIlIIIlIIll2[net.optifine.IlIlIllllllllIIIIlII.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            iIlIIIIIllIlIIIlIIll2[net.optifine.IlIlIllllllllIIIIlII.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            iIlIIIIIllIlIIIlIIll2[net.optifine.IlIlIllllllllIIIIlII.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        try {
            iIlIIIIIllIlIIIlIIll2[net.optifine.IlIlIllllllllIIIIlII.IlIlIIIllIIllIlllllI.ordinal()] = 13;
        }
        catch (NoSuchFieldError noSuchFieldError6) {}
        try {
            iIlIIIIIllIlIIIlIIll2[net.optifine.IlIlIllllllllIIIIlII.IllIIlllIIIIlllIIlIl.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError7) {}
        try {
            iIlIIIIIllIlIIIlIIll2[net.optifine.IlIlIllllllllIIIIlII.llllIIIlIlllIlIIIIIl.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError8) {}
        try {
            iIlIIIIIllIlIIIlIIll2[net.optifine.IlIlIllllllllIIIIlII.lIIIIlIIIIIlllIllIII.ordinal()] = 8;
        }
        catch (NoSuchFieldError noSuchFieldError9) {}
        try {
            iIlIIIIIllIlIIIlIIll2[net.optifine.IlIlIllllllllIIIIlII.lIIIlllIIIllIIIllIII.ordinal()] = 9;
        }
        catch (NoSuchFieldError noSuchFieldError10) {}
        try {
            iIlIIIIIllIlIIIlIIll2[net.optifine.IlIlIllllllllIIIIlII.llIIlIIIlIIIllIlIIIl.ordinal()] = 10;
        }
        catch (NoSuchFieldError noSuchFieldError11) {}
        try {
            iIlIIIIIllIlIIIlIIll2[net.optifine.IlIlIllllllllIIIIlII.IIIIlllIIIIIIlIIIlll.ordinal()] = 14;
        }
        catch (NoSuchFieldError noSuchFieldError12) {}
        try {
            iIlIIIIIllIlIIIlIIll2[net.optifine.IlIlIllllllllIIIIlII.lIlIlIIIllIIllIIIllI.ordinal()] = 12;
        }
        catch (NoSuchFieldError noSuchFieldError13) {}
        try {
            iIlIIIIIllIlIIIlIIll2[net.optifine.IlIlIllllllllIIIIlII.llIllIlIIIIllIlIIllI.ordinal()] = 11;
        }
        catch (NoSuchFieldError noSuchFieldError14) {}
        return net.optifine.IIIlIIlIIIIlllIlllII.IIlIIIIIllIlIIIlIIll = iIlIIIIIllIlIIIlIIll2;
    }
}
