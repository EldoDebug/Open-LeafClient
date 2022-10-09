package net.minecraft.client.llIIlIIIlIIIllIlIIIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

public class IlIlIlIlIlllllllllIl
{
    private static final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll;
    private static final lIllllIllIllIIllllll IlIlIlIlIlllllllllIl;
    
    static {
        llllIIIIlIIIlIlllIll = new lIllllIllIllIIllllll("textures/entity/steve.png");
        IlIlIlIlIlllllllllIl = new lIllllIllIllIIllllll("textures/entity/alex.png");
    }
    
    public static lIllllIllIllIIllllll llllIIIIlIIIlIlllIll() {
        return net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;
    }
    
    public static lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final UUID uuid) {
        return llIllIIIIIllIlIIIIlI(uuid) ? net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl : net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;
    }
    
    public static String IlIlIlIlIlllllllllIl(final UUID uuid) {
        return llIllIIIIIllIlIIIIlI(uuid) ? "slim" : "default";
    }
    
    private static boolean llIllIIIIIllIlIIIIlI(final UUID uuid) {
        return (uuid.hashCode() & 0x1) == 0x1;
    }
}
