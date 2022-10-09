package net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;

import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.*;
import java.io.*;
import com.google.gson.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import java.util.*;

public class llIllIIIIIllIlIIIIlI
{
    private static boolean llllIIIIlIIIlIlllIll;
    private static Map IlIlIlIlIlllllllllIl;
    private static Map llIllIIIIIllIlIIIIlI;
    
    static {
        net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll = false;
        net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl = null;
        net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI = null;
    }
    
    public static void llllIIIIlIIIlIlllIll() {
        final Map llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI();
        final Map ilIIIlIlIIIllIlIlIIl = IlIIIlIlIIIllIlIlIIl();
        if (llIllIIIIIllIlIIIIlI == null) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Entity render map not found, custom entity models are DISABLED.");
        }
        else if (ilIIIlIlIIIllIlIlIIl == null) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Tile entity render map not found, custom entity models are DISABLED.");
        }
        else {
            net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll = false;
            llIllIIIIIllIlIIIIlI.clear();
            ilIIIlIlIIIllIlIlIIl.clear();
            llIllIIIIIllIlIIIIlI.putAll(net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl);
            ilIIIlIlIIIllIlIlIIl.putAll(net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI);
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.A()) {
                final lIllllIllIllIIllllll[] ilIlIIIllIllIIIIIllI = IlIlIIIllIllIIIIIllI();
                for (int i = 0; i < ilIlIIIllIllIIIIIllI.length; ++i) {
                    final lIllllIllIllIIllllll lIllllIllIllIIllllll = ilIlIIIllIllIIIIIllI[i];
                    net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl("CustomEntityModel: " + lIllllIllIllIIllllll.IlIlIlIlIlllllllllIl());
                    final llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll);
                    if (llllIIIIlIIIlIlllIll != null) {
                        final Class illIIlllIIIIlllIIlIl = llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl();
                        if (illIIlllIIIIlllIIlIl != null) {
                            if (llllIIIIlIIIlIlllIll instanceof net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI) {
                                llIllIIIIIllIlIIIIlI.put(illIIlllIIIIlllIIlIl, llllIIIIlIIIlIlllIll);
                            }
                            else if (llllIIIIlIIIlIlllIll instanceof IIlllIIlIllIllIlIIll) {
                                ilIIIlIlIIIllIlIlIIl.put(illIIlllIIIIlllIIlIl, llllIIIIlIIIlIlllIll);
                            }
                            else {
                                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Unknown renderer type: " + ((IIlllIIlIllIllIlIIll)llllIIIIlIIIlIlllIll).getClass().getName());
                            }
                            net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll = true;
                        }
                    }
                }
            }
        }
    }
    
    private static Map llIllIIIIIllIlIIIIlI() {
        final Map ilIIIlIlIIIllIlIlIIl = Minecraft.getMinecraft().lllllIIIIIlIlIIIIIIl().IlIIIlIlIIIllIlIlIIl();
        if (ilIIIlIlIIIllIlIlIIl == null) {
            return null;
        }
        if (net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl == null) {
            net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl = new HashMap(ilIIIlIlIIIllIlIlIIl);
        }
        return ilIIIlIlIIIllIlIlIIl;
    }
    
    private static Map IlIIIlIlIIIllIlIlIIl() {
        final Map llllIIIIlIIIlIlllIll = IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;
        if (net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI == null) {
            net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI = new HashMap(llllIIIIlIIIlIlllIll);
        }
        return llllIIIIlIIIlIlllIll;
    }
    
    private static lIllllIllIllIIllllll[] IlIlIIIllIllIIIIIllI() {
        final String s = "optifine/cem/";
        final String s2 = ".jem";
        final ArrayList<lIllllIllIllIIllllll> list = new ArrayList<lIllllIllIllIIllllll>();
        final String[] llllIIIIlIIIlIlllIll = IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll();
        for (int i = 0; i < llllIIIIlIIIlIlllIll.length; ++i) {
            final lIllllIllIllIIllllll lIllllIllIllIIllllll = new lIllllIllIllIIllllll(String.valueOf(s) + llllIIIIlIIIlIlllIll[i] + s2);
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(lIllllIllIllIIllllll)) {
                list.add(lIllllIllIllIIllllll);
            }
        }
        return list.toArray(new lIllllIllIllIIllllll[list.size()]);
    }
    
    private static llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll(final lIllllIllIllIIllllll lIllllIllIllIIllllll) {
        try {
            return llllIIIIlIIIlIlllIll(net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll), lIllllIllIllIIllllll.IlIlIlIlIlllllllllIl());
        }
        catch (IOException ex) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl(ex.getClass().getName() + ": " + ex.getMessage());
            return null;
        }
        catch (JsonParseException ex2) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl(ex2.getClass().getName() + ": " + ex2.getMessage());
            return null;
        }
        catch (Exception ex3) {
            ex3.printStackTrace();
            return null;
        }
    }
    
    private static llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll(final JsonObject jsonObject, final String s) {
        final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(jsonObject, s);
        final String llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll();
        final lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll3 = IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2);
        llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3, "Entity not found: " + llllIIIIlIIIlIlllIll2);
        final Class llllIIIIlIIIlIlllIll4 = llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll();
        llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll4, "Entity class not found: " + llllIIIIlIIIlIlllIll2);
        final llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll5 = llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3, llllIIIIlIIIlIlllIll);
        if (llllIIIIlIIIlIlllIll5 == null) {
            return null;
        }
        llllIIIIlIIIlIlllIll5.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll4);
        return llllIIIIlIIIlIlllIll5;
    }
    
    private static llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII, final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        final lIllllIllIllIIllllll llIllIIIIIllIlIIIIlI = ilIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI();
        final IllIIlllIIIIlllIIlIl[] ilIIIlIlIIIllIlIlIIl2 = ilIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl();
        float n = ilIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI();
        if (n < 0.0f) {
            n = liiiIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl();
        }
        final net.minecraft.client.IlIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl ilIlIIIllIllIIIIIllI = liiiIlIIIIIlllIllIII.IlIlIIIllIllIIIIIllI();
        if (ilIlIIIllIllIIIIIllI == null) {
            return null;
        }
        if (!llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII, ilIlIIIllIllIIIIIllI, ilIIIlIlIIIllIlIlIIl2, new net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(liiiIlIIIIIlllIllIII, ilIlIIIllIllIIIIIllI, ilIIIlIlIIIllIlIlIIl2))) {
            return null;
        }
        final llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll = liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, n);
        if (llllIIIIlIIIlIlllIll == null) {
            throw new JsonParseException("Entity renderer is null, model: " + liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl() + ", adapter: " + liiiIlIIIIIlllIllIII.getClass().getName());
        }
        if (llIllIIIIIllIlIIIIlI != null) {
            llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI);
        }
        return llllIIIIlIIIlIlllIll;
    }
    
    private static boolean llllIIIIlIIIlIlllIll(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII, final net.minecraft.client.IlIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final IllIIlllIIIIlllIIlIl[] array, final net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        for (int i = 0; i < array.length; ++i) {
            if (!llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII, ilIIIlIlIIIllIlIlIIl, array[i], llIllIIIIIllIlIIIIlI)) {
                return false;
            }
        }
        return true;
    }
    
    private static boolean llllIIIIlIIIlIlllIll(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII, final net.minecraft.client.IlIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        final String ilIlIlIlIlllllllllIl = illIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl();
        final IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll = liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, ilIlIlIlIlllllllllIl);
        if (llllIIIIlIIIlIlllIll == null) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Model part not found: " + ilIlIlIlIlllllllllIl + ", model: " + ilIIIlIlIIIllIlIlIIl);
            return false;
        }
        if (!illIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI()) {
            if (llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI != null) {
                llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.clear();
            }
            if (llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl != null) {
                llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl.clear();
            }
            if (llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI != null) {
                final IIlIIIIIllIlIIIlIIll[] llllIIIIlIIIlIlllIll2 = liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl);
                final Set<Object> setFromMap = Collections.newSetFromMap(new IdentityHashMap<Object, Boolean>());
                setFromMap.addAll(Arrays.asList(llllIIIIlIIIlIlllIll2));
                final Iterator iterator = llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI.iterator();
                while (iterator.hasNext()) {
                    if (!setFromMap.contains(iterator.next())) {
                        iterator.remove();
                    }
                }
            }
        }
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll());
        final net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl2 = illIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl();
        if (ilIIIlIlIIIllIlIlIIl2 != null) {
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll());
            llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
            if (!ilIIIlIlIIIllIlIlIIl2.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI)) {
                return false;
            }
            illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll().llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl2);
        }
        return true;
    }
    
    private static void llllIIIIlIIIlIlllIll(final Object o, final String s) {
        if (o == null) {
            throw new JsonParseException(s);
        }
    }
    
    public static boolean IlIlIlIlIlllllllllIl() {
        return net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll;
    }
}
