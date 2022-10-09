package net.minecraft.llllIIIlIlllIlIIIIIl;

import org.apache.logging.log4j.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.*;
import com.google.common.collect.*;
import java.util.*;

public class IIIIlllIIIIIIlIIIlll
{
    private static final Logger IlIlIlIlIlllllllllIl;
    private static final Map llIllIIIIIllIlIIIIlI;
    private static final Map IlIIIlIlIIIllIlIlIIl;
    private static final Map IlIlIIIllIllIIIIIllI;
    private static final Map IllIIlllIIIIlllIIlIl;
    private static final Map llllIIIlIlllIlIIIIIl;
    public static final Map llllIIIIlIIIlIlllIll;
    
    static {
        IlIlIlIlIlllllllllIl = LogManager.getLogger();
        llIllIIIIIllIlIIIIlI = Maps.newHashMap();
        IlIIIlIlIIIllIlIlIIl = Maps.newHashMap();
        IlIlIIIllIllIIIIIllI = Maps.newHashMap();
        IllIIlllIIIIlllIIlIl = Maps.newHashMap();
        llllIIIlIlllIlIIIIIl = Maps.newHashMap();
        llllIIIIlIIIlIlllIll = Maps.newLinkedHashMap();
        llllIIIIlIIIlIlllIll(lIIIlllIIIllIIIllIII.class, "Item", 1);
        llllIIIIlIIIlIlllIll(IlIlIIIlIIlIlIIlllIl.class, "XPOrb", 2);
        llllIIIIlIIIlIlllIll(IlIlIlIlIlllllllllIl.class, "ThrownEgg", 7);
        llllIIIIlIIIlIlllIll(IlIlIIIllIIllIlllllI.class, "LeashKnot", 8);
        llllIIIIlIIIlIlllIll(IlIlIIIIIIlllIlIllIl.class, "Painting", 9);
        llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.class, "Arrow", 10);
        llllIIIIlIIIlIlllIll(lIIIIlIIIIIlllIllIII.class, "Snowball", 11);
        llllIIIIlIIIlIlllIll(IlIlIIIllIllIIIIIllI.class, "Fireball", 12);
        llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl.class, "SmallFireball", 13);
        llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI.class, "ThrownEnderpearl", 14);
        llllIIIIlIIIlIlllIll(IlIIIlIlIIIllIlIlIIl.class, "EyeOfEnderSignal", 15);
        llllIIIIlIIIlIlllIll(IllIIlllIIIIlllIIlIl.class, "ThrownPotion", 16);
        llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.IllIIlllIIIIlllIIlIl.class, "ThrownExpBottle", 17);
        llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl.class, "ItemFrame", 18);
        llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.llIIlIIIlIIIllIlIIIl.class, "WitherSkull", 19);
        llllIIIIlIIIlIlllIll(IIIlIIIlIlIIlllIIlll.class, "PrimedTnt", 20);
        llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llllIIIlIlllIlIIIIIl.class, "FallingSand", 21);
        llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.lIIIIlIIIIIlllIllIII.class, "FireworksRocketEntity", 22);
        llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.class, "ArmorStand", 30);
        llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl.class, "Boat", 41);
        llllIIIIlIIIlIlllIll(llllIIllllIlIlIIIIll.class, lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(), 42);
        llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.IlIlIIIllIIllIlllllI.class, lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), 43);
        llllIIIIlIIIlIlllIll(IlIllIlIlIIIlIlIlIII.class, lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(), 44);
        llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl.class, lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(), 45);
        llllIIIIlIIIlIlllIll(IIlllIIlIllIllIlIIll.class, lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl(), 46);
        llllIIIIlIIIlIlllIll(llIIIllIlIllIllIIIIl.class, lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl(), 47);
        llllIIIIlIIIlIlllIll(IIllIIllIIIlIlIIIIlI.class, lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(), 40);
        llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIllIlIlIIIlIlIlIII.class, "Mob", 48);
        llllIIIIlIIIlIlllIll(IIlllIlIIllIlIlIlIIl.class, "Monster", 49);
        llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl.class, "Creeper", 50, 894731, 0);
        llllIIIIlIIIlIlllIll(llllllIllIllIlIllllI.class, "Skeleton", 51, 12698049, 4802889);
        llllIIIIlIIIlIlllIll(llIllIlIlIIIIIIIllII.class, "Spider", 52, 3419431, 11013646);
        llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.IlIllIlIlIIIlIlIlIII.class, "Giant", 53);
        llllIIIIlIIIlIlllIll(llIlIIIIIlIIlIlIIlll.class, "Zombie", 54, 44975, 7969893);
        llllIIIIlIIIlIlllIll(IIIllllllIllIIIlllIl.class, "Slime", 55, 5349438, 8306542);
        llllIIIIlIIIlIlllIll(llIllIlIIIIllIlIIllI.class, "Ghast", 56, 16382457, 12369084);
        llllIIIIlIIIlIlllIll(llIIIlIlIllIIlIlIlII.class, "PigZombie", 57, 15373203, 5009705);
        llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI.class, "Enderman", 58, 1447446, 0);
        llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI.class, "CaveSpider", 59, 803406, 11013646);
        llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI.class, "Silverfish", 60, 7237230, 3158064);
        llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.class, "Blaze", 61, 16167425, 16775294);
        llllIIIIlIIIlIlllIll(IlIlIllllllllIIIIlII.class, "LavaSlime", 62, 3407872, 16579584);
        llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.class, "EnderDragon", 63);
        llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl.class, "WitherBoss", 64);
        llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI.class, "Bat", 65, 4996656, 986895);
        llllIIIIlIIIlIlllIll(IllIllIlllIllllIIllI.class, "Witch", 66, 3407872, 5349438);
        llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.llIIlIIIlIIIllIlIIIl.class, "Endermite", 67, 1447446, 7237230);
        llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.lllIIIIlllllIlIIllIl.class, "Guardian", 68, 5931634, 15826224);
        llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.llIllIlIIIIllIlIIllI.class, "Pig", 90, 15771042, 14377823);
        llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IIIlIIIlIlIIlllIIlll.class, "Sheep", 91, 15198183, 16758197);
        llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IlIlIIIllIllIIIIIllI.class, "Cow", 92, 4470310, 10592673);
        llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl.class, "Chicken", 93, 10592673, 16711680);
        llllIIIIlIIIlIlllIll(IlllllllIIIlIIIlIlII.class, "Squid", 94, 2243405, 7375001);
        llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IIIllllllIllIIIlllIl.class, "Wolf", 95, 14144467, 13545366);
        llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.lIIIlllIIIllIIIllIII.class, "MushroomCow", 96, 10489616, 12040119);
        llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.class, "SnowMan", 97);
        llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.llIIlIIIlIIIllIlIIIl.class, "Ozelot", 98, 15720061, 5653556);
        llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.IlllllllIIIlIIIlIlII.class, "VillagerGolem", 99);
        llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl.class, "EntityHorse", 100, 12623485, 15656192);
        llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.class, "Rabbit", 101, 10051392, 7555121);
        llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IlIlIllllllllIIIIlII.class, "Villager", 120, 5651507, 12422002);
        llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI.class, "EnderCrystal", 200);
    }
    
    private static void llllIIIIlIIIlIlllIll(final Class clazz, final String s, final int n) {
        if (IIIIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI.containsKey(s)) {
            throw new IllegalArgumentException("ID is already registered: " + s);
        }
        if (IIIIlllIIIIIIlIIIlll.IlIlIIIllIllIIIIIllI.containsKey(n)) {
            throw new IllegalArgumentException("ID is already registered: " + n);
        }
        if (n == 0) {
            throw new IllegalArgumentException("Cannot register to reserved id: " + n);
        }
        if (clazz == null) {
            throw new IllegalArgumentException("Cannot register null clazz for id: " + n);
        }
        IIIIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI.put(s, clazz);
        IIIIlllIIIIIIlIIIlll.IlIIIlIlIIIllIlIlIIl.put(clazz, s);
        IIIIlllIIIIIIlIIIlll.IlIlIIIllIllIIIIIllI.put(n, clazz);
        IIIIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl.put(clazz, n);
        IIIIlllIIIIIIlIIIlll.llllIIIlIlllIlIIIIIl.put(s, n);
    }
    
    private static void llllIIIIlIIIlIlllIll(final Class clazz, final String s, final int n, final int n2, final int n3) {
        llllIIIIlIIIlIlllIll(clazz, s, n);
        IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll.put(n, new net.minecraft.llllIIIlIlllIlIIIIIl.llllIIllllIlIlIIIIll(n, n2, n3));
    }
    
    public static net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll(final String s, final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI = null;
        try {
            final Class<net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI> clazz = IIIIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI.get(s);
            if (clazz != null) {
                llIllIIIIIllIlIIIIlI = clazz.getConstructor(net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII.class).newInstance(illlllllIIIlIIIlIlII);
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        return llIllIIIIIllIlIIIIlI;
    }
    
    public static net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll(final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll, final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI = null;
        if ("Minecart".equals(iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl("id"))) {
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("id", lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("Type")).IlIlIlIlIlllllllllIl());
            iiiIlllIIIIIIlIIIlll.llllIIllllIlIlIIIIll("Type");
        }
        try {
            final Class<net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI> clazz = IIIIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI.get(iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl("id"));
            if (clazz != null) {
                llIllIIIIIllIlIIIIlI = clazz.getConstructor(net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII.class).newInstance(illlllllIIIlIIIlIlII);
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        if (llIllIIIIIllIlIIIIlI != null) {
            llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl(iiiIlllIIIIIIlIIIlll);
        }
        else {
            IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl.warn("Skipping Entity with id " + iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl("id"));
        }
        return llIllIIIIIllIlIIIIlI;
    }
    
    public static net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll(final int n, final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI = null;
        try {
            final Class llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(n);
            if (llllIIIIlIIIlIlllIll != null) {
                llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.getConstructor(net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII.class).newInstance(illlllllIIIlIIIlIlII);
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        if (llIllIIIIIllIlIIIIlI == null) {
            IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl.warn("Skipping Entity with id " + n);
        }
        return llIllIIIIIllIlIIIIlI;
    }
    
    public static int llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        final Integer n = IIIIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl.get(llIllIIIIIllIlIIIIlI.getClass());
        return (n == null) ? 0 : n;
    }
    
    public static Class llllIIIIlIIIlIlllIll(final int n) {
        return IIIIlllIIIIIIlIIIlll.IlIlIIIllIllIIIIIllI.get(n);
    }
    
    public static String IlIlIlIlIlllllllllIl(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        return IIIIlllIIIIIIlIIIlll.IlIIIlIlIIIllIlIlIIl.get(llIllIIIIIllIlIIIIlI.getClass());
    }
    
    public static int llllIIIIlIIIlIlllIll(final String s) {
        final Integer n = IIIIlllIIIIIIlIIIlll.llllIIIlIlllIlIIIIIl.get(s);
        return (n == null) ? 90 : n;
    }
    
    public static String IlIlIlIlIlllllllllIl(final int n) {
        return IIIIlllIIIIIIlIIIlll.IlIIIlIlIIIllIlIlIIl.get(llllIIIIlIIIlIlllIll(n));
    }
    
    public static void llllIIIIlIIIlIlllIll() {
    }
    
    public static List IlIlIlIlIlllllllllIl() {
        final Set<String> keySet = IIIIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI.keySet();
        final ArrayList arrayList = Lists.newArrayList();
        for (final String s : keySet) {
            if ((((Class)IIIIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI.get(s)).getModifiers() & 0x400) != 0x400) {
                arrayList.add(s);
            }
        }
        arrayList.add("LightningBolt");
        return arrayList;
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final String s) {
        String ilIlIlIlIlllllllllIl = IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI);
        if (ilIlIlIlIlllllllllIl == null && llIllIIIIIllIlIIIIlI instanceof net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll) {
            ilIlIlIlIlllllllllIl = "Player";
        }
        else if (ilIlIlIlIlllllllllIl == null && llIllIIIIIllIlIIIIlI instanceof net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll) {
            ilIlIlIlIlllllllllIl = "LightningBolt";
        }
        return s.equals(ilIlIlIlIlllllllllIl);
    }
    
    public static boolean IlIlIlIlIlllllllllIl(final String s) {
        return "Player".equals(s) || IlIlIlIlIlllllllllIl().contains(s);
    }
}
