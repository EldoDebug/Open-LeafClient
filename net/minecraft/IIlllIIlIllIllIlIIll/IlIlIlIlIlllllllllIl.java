package net.minecraft.IIlllIIlIllIllIlIIll;

import net.minecraft.client.*;
import java.net.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import com.mojang.util.*;
import com.mojang.authlib.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import com.google.common.util.concurrent.*;
import net.minecraft.client.llIllIlIIIIllIlIIllI.*;

public class IlIlIlIlIlllllllllIl
{
    public static boolean llllIIIIlIIIlIlllIll() {
        return Minecraft.getMinecraft().IIIlIIIlIlIIlllIIlll.IIlllIlIIllIlIlIlIIl;
    }
    
    public static Proxy IlIlIlIlIlllllllllIl() {
        return Minecraft.getMinecraft().IlllIIIIlIIIlIlIlIIl();
    }
    
    public static String llIllIIIIIllIlIIIIlI() {
        final Session iiiiIllIIIIlIIIIllIl = Minecraft.getMinecraft().IIIIIllIIIIlIIIIllIl();
        return (iiiiIllIIIIlIIIIllIl == null) ? null : iiiiIllIIIIlIIIIllIl.llllIIIIlIIIlIlllIll();
    }
    
    public static String IlIIIlIlIIIllIlIlIIl() {
        final Session iiiiIllIIIIlIIIIllIl = Minecraft.getMinecraft().IIIIIllIIIIlIIIIllIl();
        return (iiiiIllIIIIlIIIIllIl == null) ? null : iiiiIllIIIIlIIIIllIl.llIllIIIIIllIlIIIIlI();
    }
    
    public static long IlIlIIIllIllIIIIIllI() {
        return Minecraft.IIIllllllIllIIIlllIl();
    }
    
    public static String IllIIlllIIIIlllIIlIl() {
        return Minecraft.getMinecraft().IIIIIllIIIIlIIIIllIl().llllIIIIlIIIlIlllIll();
    }
    
    public static String llllIIIlIlllIlIIIIIl() {
        return Minecraft.getMinecraft().IIIIIllIIIIlIIIIllIl().IlIlIlIlIlllllllllIl();
    }
    
    public static String lIIIIlIIIIIlllIllIII() {
        return Minecraft.getMinecraft().IIIIIllIIIIlIIIIllIl().llIllIIIIIllIlIIIIlI();
    }
    
    public static String llllIIIIlIIIlIlllIll(final String s) {
        return Minecraft.getMinecraft().lIlIlIlllIIlIlIlllIl().fillProfileProperties(new GameProfile(UUIDTypeAdapter.fromString(s), (String)null), false).getName();
    }
    
    public static void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        Minecraft.getMinecraft().llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll());
    }
    
    public static String lIIIlllIIIllIIIllIII() {
        return Minecraft.getMinecraft().mcDataDir.getAbsolutePath();
    }
    
    public static int llIIlIIIlIIIllIlIIIl() {
        return lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll();
    }
    
    public static int llIllIlIIIIllIlIIllI() {
        return lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll();
    }
    
    public static int lIlIlIIIllIIllIIIllI() {
        return lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll();
    }
    
    public static int IlIlIIIllIIllIlllllI() {
        return lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll();
    }
    
    public static void llllIIIIlIIIlIlllIll(final boolean b) {
        Minecraft.getMinecraft().llllIIIIlIIIlIlllIll(b);
    }
    
    public static ListenableFuture llllIIIIlIIIlIlllIll(final String s, final String s2) {
        return Minecraft.getMinecraft().IIlIlIlIIlIllIIIIIIl().llllIIIIlIIIlIlllIll(s, s2);
    }
    
    public static void IIIIlllIIIIIIlIIIlll() {
        Minecraft.getMinecraft().IIlIlIlIIlIllIIIIIIl().IllIIlllIIIIlllIIlIl();
    }
    
    public static boolean llllIIllllIlIlIIIIll() {
        return Minecraft.getMinecraft().IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI.IlIllllIIlIIlIlIlIll);
    }
    
    public static boolean IlIllIlIlIIIlIlIlIII() {
        return Minecraft.getMinecraft().IIIIlllIIIIIIlIIIlll != null && Minecraft.getMinecraft().IIIIlllIIIIIIlIIIlll instanceof net.minecraft.client.llIllIIIIIllIlIIIIlI.lllIllIIIllllllIllll;
    }
}
