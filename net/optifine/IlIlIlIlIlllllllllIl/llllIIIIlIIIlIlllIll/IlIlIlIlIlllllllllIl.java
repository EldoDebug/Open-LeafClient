package net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;

import net.optifine.llllIIIIlIIIlIlllIll.*;
import net.optifine.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;
import net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import net.optifine.llllIIIlIlllIlIIIIIl.*;
import com.google.gson.*;
import java.io.*;

public class IlIlIlIlIlllllllllIl
{
    public static final String llllIIIIlIIIlIlllIll = "entity";
    public static final String IlIlIlIlIlllllllllIl = "texture";
    public static final String llIllIIIIIllIlIIIIlI = "shadowSize";
    public static final String IlIIIlIlIIIllIlIlIIl = "type";
    public static final String IlIlIIIllIllIIIIIllI = "textureSize";
    public static final String IllIIlllIIIIlllIIlIl = "usePlayerTexture";
    public static final String llllIIIlIlllIlIIIIIl = "models";
    public static final String lIIIIlIIIIIlllIllIII = "animations";
    public static final String lIIIlllIIIllIIIllIII = "id";
    public static final String llIIlIIIlIIIllIlIIIl = "baseId";
    public static final String llIllIlIIIIllIlIIllI = "model";
    public static final String lIlIlIIIllIIllIIIllI = "type";
    public static final String IlIlIIIllIIllIlllllI = "part";
    public static final String IIIIlllIIIIIIlIIIlll = "attach";
    public static final String llllIIllllIlIlIIIIll = "invertAxis";
    public static final String IlIllIlIlIIIlIlIlIII = "mirrorTexture";
    public static final String IIlllIIlIllIllIlIIll = "translate";
    public static final String lllIIIIlllllIlIIllIl = "rotate";
    public static final String IlIlIIIIIIlllIlIllIl = "scale";
    public static final String IIllIIllIIIlIlIIIIlI = "boxes";
    public static final String IIIlIIIlIlIIlllIIlll = "sprites";
    public static final String IlIlIIIlIIlIlIIlllIl = "submodel";
    public static final String IlllllllIIIlIIIlIlII = "submodels";
    public static final String IIlIIIIlllIlllllIlII = "textureOffset";
    public static final String IIIlIIlIIIIlllIlllII = "coordinates";
    public static final String IlIlIllllllllIIIIlII = "sizeAdd";
    public static final String IIlllIlIIllIlIlIlIIl = "EntityModel";
    public static final String llIIIlIlIllIIlIlIlII = "EntityModelPart";
    
    public static IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final JsonObject jsonObject, final String s) {
        final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = new llllIIIIlIIIlIlllIll("CustomEntityModels");
        final String llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s);
        final String ilIlIlIlIlllllllllIl = llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(s);
        final String llllIIIIlIIIlIlllIll3 = net.optifine.util.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(jsonObject, "texture");
        final int[] ilIlIlIlIlllllllllIl2 = net.optifine.util.lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl(jsonObject.get("textureSize"), 2);
        final float llllIIIIlIIIlIlllIll4 = net.optifine.util.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(jsonObject, "shadowSize", -1.0f);
        final JsonArray jsonArray = (JsonArray)jsonObject.get("models");
        llllIIIIlIIIlIlllIll(jsonArray, "Missing models");
        final HashMap hashMap = new HashMap();
        final ArrayList<IllIIlllIIIIlllIIlIl> list = new ArrayList<IllIIlllIIIIlllIIlIl>();
        for (int i = 0; i < jsonArray.size(); ++i) {
            final JsonObject jsonObject2 = (JsonObject)jsonArray.get(i);
            llllIIIIlIIIlIlllIll(jsonObject2, hashMap);
            llllIIIIlIIIlIlllIll(jsonObject2, hashMap, ilIlIlIlIlllllllllIl);
            IlIlIlIlIlllllllllIl(jsonObject2, hashMap);
            final IllIIlllIIIIlllIIlIl llllIIIIlIIIlIlllIll5 = llllIIIIlIIIlIlllIll(jsonObject2, ilIlIlIlIlllllllllIl2, ilIlIlIlIlllllllllIl);
            if (llllIIIIlIIIlIlllIll5 != null) {
                list.add(llllIIIIlIIIlIlllIll5);
            }
        }
        final IllIIlllIIIIlllIIlIl[] array = list.toArray(new IllIIlllIIIIlllIIlIl[list.size()]);
        lIllllIllIllIIllllll llllIIIIlIIIlIlllIll6 = null;
        if (llllIIIIlIIIlIlllIll3 != null) {
            llllIIIIlIIIlIlllIll6 = llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll3, ".png");
        }
        return new IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll2, ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll6, array, llllIIIIlIIIlIlllIll4);
    }
    
    private static void llllIIIIlIIIlIlllIll(final JsonObject jsonObject, final Map map) {
        final String llllIIIIlIIIlIlllIll = net.optifine.util.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(jsonObject, "baseId");
        if (llllIIIIlIIIlIlllIll != null) {
            final JsonObject jsonObject2 = map.get(llllIIIIlIIIlIlllIll);
            if (jsonObject2 == null) {
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("BaseID not found: " + llllIIIIlIIIlIlllIll);
            }
            else {
                llllIIIIlIIIlIlllIll(jsonObject2, jsonObject);
            }
        }
    }
    
    private static void llllIIIIlIIIlIlllIll(final JsonObject jsonObject, final Map map, final String s) {
        final String llllIIIIlIIIlIlllIll = net.optifine.util.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(jsonObject, "model");
        if (llllIIIIlIIIlIlllIll != null) {
            final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll(s, llllIIIIlIIIlIlllIll, ".jpm");
            try {
                final JsonObject llllIIIIlIIIlIlllIll3 = llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2);
                if (llllIIIIlIIIlIlllIll3 == null) {
                    net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Model not found: " + llllIIIIlIIIlIlllIll2);
                    return;
                }
                llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3, jsonObject);
            }
            catch (IOException ex) {
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl(ex.getClass().getName() + ": " + ex.getMessage());
            }
            catch (JsonParseException ex2) {
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl(ex2.getClass().getName() + ": " + ex2.getMessage());
            }
            catch (Exception ex3) {
                ex3.printStackTrace();
            }
        }
    }
    
    private static void llllIIIIlIIIlIlllIll(final JsonObject jsonObject, final JsonObject jsonObject2) {
        for (final Map.Entry<String, V> entry : jsonObject.entrySet()) {
            if (!entry.getKey().equals("id") && !jsonObject2.has((String)entry.getKey())) {
                jsonObject2.add((String)entry.getKey(), (JsonElement)entry.getValue());
            }
        }
    }
    
    public static lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final String s, String s2, final String s3) {
        if (!s2.endsWith(s3)) {
            s2 = String.valueOf(s2) + s3;
        }
        if (!s2.contains("/")) {
            s2 = String.valueOf(s) + "/" + s2;
        }
        else if (s2.startsWith("./")) {
            s2 = String.valueOf(s) + "/" + s2.substring(2);
        }
        else if (s2.startsWith("~/")) {
            s2 = "optifine/" + s2.substring(2);
        }
        return new lIllllIllIllIIllllll(s2);
    }
    
    private static void IlIlIlIlIlllllllllIl(final JsonObject jsonObject, final Map map) {
        final String llllIIIIlIIIlIlllIll = net.optifine.util.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(jsonObject, "id");
        if (llllIIIIlIIIlIlllIll != null) {
            if (llllIIIIlIIIlIlllIll.length() < 1) {
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Empty model ID: " + llllIIIIlIIIlIlllIll);
            }
            else if (map.containsKey(llllIIIIlIIIlIlllIll)) {
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Duplicate model ID: " + llllIIIIlIIIlIlllIll);
            }
            else {
                map.put(llllIIIIlIIIlIlllIll, jsonObject);
            }
        }
    }
    
    public static IllIIlllIIIIlllIIlIl llllIIIIlIIIlIlllIll(final JsonObject jsonObject, final int[] array, final String s) {
        final String llllIIIIlIIIlIlllIll = net.optifine.util.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(jsonObject, "part");
        llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, "Model part not specified, missing \"replace\" or \"attachTo\".");
        final boolean llllIIIIlIIIlIlllIll2 = net.optifine.util.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(jsonObject, "attach", false);
        final net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll3 = new net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll();
        if (array != null) {
            llllIIIIlIIIlIlllIll3.lIIIlllIIIllIIIllIII = array[0];
            llllIIIIlIIIlIlllIll3.llIIlIIIlIIIllIlIIIl = array[1];
        }
        net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = null;
        final JsonArray jsonArray = (JsonArray)jsonObject.get("animations");
        if (jsonArray != null) {
            final ArrayList<llllIIIlIlllIlIIIIIl> list = new ArrayList<llllIIIlIlllIlIIIIIl>();
            for (int i = 0; i < jsonArray.size(); ++i) {
                for (final Map.Entry<String, V> entry : ((JsonObject)jsonArray.get(i)).entrySet()) {
                    list.add(new llllIIIlIlllIlIIIIIl(entry.getKey(), ((JsonElement)entry.getValue()).getAsString()));
                }
            }
            if (list.size() > 0) {
                ilIIIlIlIIIllIlIlIIl = new net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl(list.toArray(new llllIIIlIlllIlIIIIIl[list.size()]));
            }
        }
        return new IllIIlllIIIIlllIIlIl(llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2, net.optifine.llllIIIlIlllIlIIIIIl.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(jsonObject, llllIIIIlIIIlIlllIll3, array, s), ilIIIlIlIIIllIlIlIIl);
    }
    
    private static void llllIIIIlIIIlIlllIll(final Object o, final String s) {
        if (o == null) {
            throw new JsonParseException(s);
        }
    }
    
    public static JsonObject llllIIIIlIIIlIlllIll(final lIllllIllIllIIllllll lIllllIllIllIIllllll) {
        final InputStream llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll);
        if (llllIIIIlIIIlIlllIll == null) {
            return null;
        }
        final String llllIIIIlIIIlIlllIll2 = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, "ASCII");
        llllIIIIlIIIlIlllIll.close();
        return (JsonObject)new JsonParser().parse(llllIIIIlIIIlIlllIll2);
    }
}
