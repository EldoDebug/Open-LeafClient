package net.optifine.llllIIIlIlllIlIIIIIl;

import net.optifine.util.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import java.awt.*;
import com.google.gson.*;
import java.util.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class lIIIlllIIIllIIIllIII
{
    private static JsonParser IIIllllllIllIIIlllIl;
    public static final String llllIIIIlIIIlIlllIll = "type";
    public static final String IlIlIlIlIlllllllllIl = "textureSize";
    public static final String llIllIIIIIllIlIIIIlI = "usePlayerTexture";
    public static final String IlIIIlIlIIIllIlIlIIl = "models";
    public static final String IlIlIIIllIllIIIIIllI = "id";
    public static final String IllIIlllIIIIlllIIlIl = "baseId";
    public static final String llllIIIlIlllIlIIIIIl = "type";
    public static final String lIIIIlIIIIIlllIllIII = "texture";
    public static final String lIIIlllIIIllIIIllIII = "textureSize";
    public static final String llIIlIIIlIIIllIlIIIl = "attachTo";
    public static final String llIllIlIIIIllIlIIllI = "invertAxis";
    public static final String lIlIlIIIllIIllIIIllI = "mirrorTexture";
    public static final String IlIlIIIllIIllIlllllI = "translate";
    public static final String IIIIlllIIIIIIlIIIlll = "rotate";
    public static final String llllIIllllIlIlIIIIll = "scale";
    public static final String IlIllIlIlIIIlIlIlIII = "boxes";
    public static final String IIlllIIlIllIllIlIIll = "sprites";
    public static final String lllIIIIlllllIlIIllIl = "submodel";
    public static final String IlIlIIIIIIlllIlIllIl = "submodels";
    public static final String IIllIIllIIIlIlIIIIlI = "textureOffset";
    public static final String IIIlIIIlIlIIlllIIlll = "coordinates";
    public static final String IlIlIIIlIIlIlIIlllIl = "sizeAdd";
    public static final String IlllllllIIIlIIIlIlII = "uvDown";
    public static final String IIlIIIIlllIlllllIlII = "uvUp";
    public static final String IIIlIIlIIIIlllIlllII = "uvNorth";
    public static final String IlIlIllllllllIIIIlII = "uvSouth";
    public static final String IIlllIlIIllIlIlIlIIl = "uvWest";
    public static final String llIIIlIlIllIIlIlIlII = "uvEast";
    public static final String lllllIlIIIlIlIIlllII = "uvFront";
    public static final String lIllllllIIllIlIlIlII = "uvBack";
    public static final String llIIlllIIlllIIllIllI = "uvLeft";
    public static final String IIlllIIIlIlllIIlllII = "uvRight";
    public static final String IIlIIIIIllIlIIIlIIll = "PlayerItem";
    public static final String llllllIllIllIlIllllI = "ModelBox";
    
    static {
        net.optifine.llllIIIlIlllIlIIIIIl.lIIIlllIIIllIIIllIII.IIIllllllIllIIIlllIl = new JsonParser();
    }
    
    public static lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll(final JsonObject jsonObject) {
        final String llllIIIIlIIIlIlllIll = net.optifine.util.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(jsonObject, "type");
        if (!net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, (Object)"PlayerItem")) {
            throw new JsonParseException("Unknown model type: " + llllIIIIlIIIlIlllIll);
        }
        final int[] ilIlIlIlIlllllllllIl = net.optifine.util.lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl(jsonObject.get("textureSize"), 2);
        llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, "Missing texture size");
        final Dimension dimension = new Dimension(ilIlIlIlIlllllllllIl[0], ilIlIlIlIlllllllllIl[1]);
        final boolean llllIIIIlIIIlIlllIll2 = net.optifine.util.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(jsonObject, "usePlayerTexture", false);
        final JsonArray jsonArray = (JsonArray)jsonObject.get("models");
        llllIIIIlIIIlIlllIll(jsonArray, "Missing elements");
        final HashMap<String, JsonObject> hashMap = (HashMap<String, JsonObject>)new HashMap<Object, JsonObject>();
        final ArrayList<llIIlIIIlIIIllIlIIIl> list = new ArrayList<llIIlIIIlIIIllIlIIIl>();
        new ArrayList();
        for (int i = 0; i < jsonArray.size(); ++i) {
            final JsonObject jsonObject2 = (JsonObject)jsonArray.get(i);
            final String llllIIIIlIIIlIlllIll3 = net.optifine.util.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(jsonObject2, "baseId");
            if (llllIIIIlIIIlIlllIll3 != null) {
                final JsonObject jsonObject3 = hashMap.get(llllIIIIlIIIlIlllIll3);
                if (jsonObject3 == null) {
                    net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("BaseID not found: " + llllIIIIlIIIlIlllIll3);
                    continue;
                }
                for (final Map.Entry<String, V> entry : jsonObject3.entrySet()) {
                    if (!jsonObject2.has((String)entry.getKey())) {
                        jsonObject2.add((String)entry.getKey(), (JsonElement)entry.getValue());
                    }
                }
            }
            final String llllIIIIlIIIlIlllIll4 = net.optifine.util.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(jsonObject2, "id");
            if (llllIIIIlIIIlIlllIll4 != null) {
                if (!hashMap.containsKey(llllIIIIlIIIlIlllIll4)) {
                    hashMap.put(llllIIIIlIIIlIlllIll4, jsonObject2);
                }
                else {
                    net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Duplicate model ID: " + llllIIIIlIIIlIlllIll4);
                }
            }
            final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll5 = llllIIIIlIIIlIlllIll(jsonObject2, dimension);
            if (llllIIIIlIIIlIlllIll5 != null) {
                list.add(llllIIIIlIIIlIlllIll5);
            }
        }
        return new lIIIIlIIIIIlllIllIII(dimension, llllIIIIlIIIlIlllIll2, list.toArray(new llIIlIIIlIIIllIlIIIl[list.size()]));
    }
    
    private static void llllIIIIlIIIlIlllIll(final Object o, final String s) {
        if (o == null) {
            throw new JsonParseException(s);
        }
    }
    
    private static lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final String s) {
        final int index = s.indexOf(58);
        if (index < 0) {
            return new lIllllIllIllIIllllll(s);
        }
        return new lIllllIllIllIIllllll(s.substring(0, index), s.substring(index + 1));
    }
    
    private static int IlIlIlIlIlllllllllIl(final String s) {
        if (s == null) {
            return 0;
        }
        if (s.equals("body")) {
            return 0;
        }
        if (s.equals("head")) {
            return 1;
        }
        if (s.equals("leftArm")) {
            return 2;
        }
        if (s.equals("rightArm")) {
            return 3;
        }
        if (s.equals("leftLeg")) {
            return 4;
        }
        if (s.equals("rightLeg")) {
            return 5;
        }
        if (s.equals("cape")) {
            return 6;
        }
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Unknown attachModel: " + s);
        return 0;
    }
    
    public static llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(final JsonObject jsonObject, final Dimension dimension) {
        final String llllIIIIlIIIlIlllIll = net.optifine.util.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(jsonObject, "type");
        if (!net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, (Object)"ModelBox")) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Unknown model type: " + llllIIIIlIIIlIlllIll);
            return null;
        }
        final int ilIlIlIlIlllllllllIl = IlIlIlIlIlllllllllIl(net.optifine.util.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(jsonObject, "attachTo"));
        final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI = new llIllIIIIIllIlIIIIlI();
        llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII = dimension.width;
        llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl = dimension.height;
        return new llIIlIIIlIIIllIlIIIl(ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll(jsonObject, llIllIIIIIllIlIIIIlI, null, null));
    }
    
    public static IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll(final JsonObject jsonObject, final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final int[] array, final String s) {
        final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll = new IIlIIIIIllIlIIIlIIll(ilIIIlIlIIIllIlIlIIl);
        ilIIIIIllIlIIIlIIll.llllIIIIlIIIlIlllIll(net.optifine.util.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(jsonObject, "id"));
        final float llllIIIIlIIIlIlllIll = net.optifine.util.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(jsonObject, "scale", 1.0f);
        ilIIIIIllIlIIIlIIll.IIllIIllIIIlIlIIIIlI = llllIIIIlIIIlIlllIll;
        ilIIIIIllIlIIIlIIll.IIIlIIIlIlIIlllIIlll = llllIIIIlIIIlIlllIll;
        ilIIIIIllIlIIIlIIll.IlIlIIIlIIlIlIIlllIl = llllIIIIlIIIlIlllIll;
        final String llllIIIIlIIIlIlllIll2 = net.optifine.util.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(jsonObject, "texture");
        if (llllIIIIlIIIlIlllIll2 != null) {
            ilIIIIIllIlIIIlIIll.llllIIIIlIIIlIlllIll(net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(s, llllIIIIlIIIlIlllIll2, ".png"));
        }
        int[] ilIlIlIlIlllllllllIl = net.optifine.util.lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl(jsonObject.get("textureSize"), 2);
        if (ilIlIlIlIlllllllllIl == null) {
            ilIlIlIlIlllllllllIl = array;
        }
        if (ilIlIlIlIlllllllllIl != null) {
            ilIIIIIllIlIIIlIIll.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl[0], ilIlIlIlIlllllllllIl[1]);
        }
        final String lowerCase = net.optifine.util.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(jsonObject, "invertAxis", "").toLowerCase();
        final boolean contains = lowerCase.contains("x");
        final boolean contains2 = lowerCase.contains("y");
        final boolean contains3 = lowerCase.contains("z");
        final float[] llllIIIIlIIIlIlllIll3 = net.optifine.util.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(jsonObject.get("translate"), 3, new float[3]);
        if (contains) {
            llllIIIIlIIIlIlllIll3[0] = -llllIIIIlIIIlIlllIll3[0];
        }
        if (contains2) {
            llllIIIIlIIIlIlllIll3[1] = -llllIIIIlIIIlIlllIll3[1];
        }
        if (contains3) {
            llllIIIIlIIIlIlllIll3[2] = -llllIIIIlIIIlIlllIll3[2];
        }
        final float[] llllIIIIlIIIlIlllIll4 = net.optifine.util.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(jsonObject.get("rotate"), 3, new float[3]);
        for (int i = 0; i < llllIIIIlIIIlIlllIll4.length; ++i) {
            llllIIIIlIIIlIlllIll4[i] = llllIIIIlIIIlIlllIll4[i] / 180.0f * llIllIIlllllllllllll.IlIlIlIlIlllllllllIl;
        }
        if (contains) {
            llllIIIIlIIIlIlllIll4[0] = -llllIIIIlIIIlIlllIll4[0];
        }
        if (contains2) {
            llllIIIIlIIIlIlllIll4[1] = -llllIIIIlIIIlIlllIll4[1];
        }
        if (contains3) {
            llllIIIIlIIIlIlllIll4[2] = -llllIIIIlIIIlIlllIll4[2];
        }
        ilIIIIIllIlIIIlIIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3[0], llllIIIIlIIIlIlllIll3[1], llllIIIIlIIIlIlllIll3[2]);
        ilIIIIIllIlIIIlIIll.IllIIlllIIIIlllIIlIl = llllIIIIlIIIlIlllIll4[0];
        ilIIIIIllIlIIIlIIll.llllIIIlIlllIlIIIIIl = llllIIIIlIIIlIlllIll4[1];
        ilIIIIIllIlIIIlIIll.lIIIIlIIIIIlllIllIII = llllIIIIlIIIlIlllIll4[2];
        final String lowerCase2 = net.optifine.util.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(jsonObject, "mirrorTexture", "").toLowerCase();
        final boolean contains4 = lowerCase2.contains("u");
        final boolean contains5 = lowerCase2.contains("v");
        if (contains4) {
            ilIIIIIllIlIIIlIIll.lIIIlllIIIllIIIllIII = true;
        }
        if (contains5) {
            ilIIIIIllIlIIIlIIll.IlIlIIIIIIlllIlIllIl = true;
        }
        final JsonArray asJsonArray = jsonObject.getAsJsonArray("boxes");
        if (asJsonArray != null) {
            for (int j = 0; j < asJsonArray.size(); ++j) {
                final JsonObject asJsonObject = asJsonArray.get(j).getAsJsonObject();
                final int[] ilIlIlIlIlllllllllIl2 = net.optifine.util.lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl(asJsonObject.get("textureOffset"), 2);
                final int[][] ilIlIlIlIlllllllllIl3 = IlIlIlIlIlllllllllIl(asJsonObject);
                if (ilIlIlIlIlllllllllIl2 == null && ilIlIlIlIlllllllllIl3 == null) {
                    throw new JsonParseException("Texture offset not specified");
                }
                final float[] llllIIIIlIIIlIlllIll5 = net.optifine.util.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(asJsonObject.get("coordinates"), 6);
                if (llllIIIIlIIIlIlllIll5 == null) {
                    throw new JsonParseException("Coordinates not specified");
                }
                if (contains) {
                    llllIIIIlIIIlIlllIll5[0] = -llllIIIIlIIIlIlllIll5[0] - llllIIIIlIIIlIlllIll5[3];
                }
                if (contains2) {
                    llllIIIIlIIIlIlllIll5[1] = -llllIIIIlIIIlIlllIll5[1] - llllIIIIlIIIlIlllIll5[4];
                }
                if (contains3) {
                    llllIIIIlIIIlIlllIll5[2] = -llllIIIIlIIIlIlllIll5[2] - llllIIIIlIIIlIlllIll5[5];
                }
                final float llllIIIIlIIIlIlllIll6 = net.optifine.util.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(asJsonObject, "sizeAdd", 0.0f);
                if (ilIlIlIlIlllllllllIl3 != null) {
                    ilIIIIIllIlIIIlIIll.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl3, llllIIIIlIIIlIlllIll5[0], llllIIIIlIIIlIlllIll5[1], llllIIIIlIIIlIlllIll5[2], llllIIIIlIIIlIlllIll5[3], llllIIIIlIIIlIlllIll5[4], llllIIIIlIIIlIlllIll5[5], llllIIIIlIIIlIlllIll6);
                }
                else {
                    ilIIIIIllIlIIIlIIll.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl2[0], ilIlIlIlIlllllllllIl2[1]);
                    ilIIIIIllIlIIIlIIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll5[0], llllIIIIlIIIlIlllIll5[1], llllIIIIlIIIlIlllIll5[2], (int)llllIIIIlIIIlIlllIll5[3], (int)llllIIIIlIIIlIlllIll5[4], (int)llllIIIIlIIIlIlllIll5[5], llllIIIIlIIIlIlllIll6);
                }
            }
        }
        final JsonArray asJsonArray2 = jsonObject.getAsJsonArray("sprites");
        if (asJsonArray2 != null) {
            for (int k = 0; k < asJsonArray2.size(); ++k) {
                final JsonObject asJsonObject2 = asJsonArray2.get(k).getAsJsonObject();
                final int[] ilIlIlIlIlllllllllIl4 = net.optifine.util.lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl(asJsonObject2.get("textureOffset"), 2);
                if (ilIlIlIlIlllllllllIl4 == null) {
                    throw new JsonParseException("Texture offset not specified");
                }
                final float[] llllIIIIlIIIlIlllIll7 = net.optifine.util.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(asJsonObject2.get("coordinates"), 6);
                if (llllIIIIlIIIlIlllIll7 == null) {
                    throw new JsonParseException("Coordinates not specified");
                }
                if (contains) {
                    llllIIIIlIIIlIlllIll7[0] = -llllIIIIlIIIlIlllIll7[0] - llllIIIIlIIIlIlllIll7[3];
                }
                if (contains2) {
                    llllIIIIlIIIlIlllIll7[1] = -llllIIIIlIIIlIlllIll7[1] - llllIIIIlIIIlIlllIll7[4];
                }
                if (contains3) {
                    llllIIIIlIIIlIlllIll7[2] = -llllIIIIlIIIlIlllIll7[2] - llllIIIIlIIIlIlllIll7[5];
                }
                final float llllIIIIlIIIlIlllIll8 = net.optifine.util.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(asJsonObject2, "sizeAdd", 0.0f);
                ilIIIIIllIlIIIlIIll.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl4[0], ilIlIlIlIlllllllllIl4[1]);
                ilIIIIIllIlIIIlIIll.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll7[0], llllIIIIlIIIlIlllIll7[1], llllIIIIlIIIlIlllIll7[2], (int)llllIIIIlIIIlIlllIll7[3], (int)llllIIIIlIIIlIlllIll7[4], (int)llllIIIIlIIIlIlllIll7[5], llllIIIIlIIIlIlllIll8);
            }
        }
        final JsonObject jsonObject2 = (JsonObject)jsonObject.get("submodel");
        if (jsonObject2 != null) {
            ilIIIIIllIlIIIlIIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(jsonObject2, ilIIIlIlIIIllIlIlIIl, ilIlIlIlIlllllllllIl, s));
        }
        final JsonArray jsonArray = (JsonArray)jsonObject.get("submodels");
        if (jsonArray != null) {
            for (int l = 0; l < jsonArray.size(); ++l) {
                final IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll9 = llllIIIIlIIIlIlllIll((JsonObject)jsonArray.get(l), ilIIIlIlIIIllIlIlIIl, ilIlIlIlIlllllllllIl, s);
                if (llllIIIIlIIIlIlllIll9.IlIIIlIlIIIllIlIlIIl() != null && ilIIIIIllIlIIIlIIll.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll9.IlIIIlIlIIIllIlIlIIl()) != null) {
                    net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Duplicate model ID: " + llllIIIIlIIIlIlllIll9.IlIIIlIlIIIllIlIlIIl());
                }
                ilIIIIIllIlIIIlIIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll9);
            }
        }
        return ilIIIIIllIlIIIlIIll;
    }
    
    private static int[][] IlIlIlIlIlllllllllIl(final JsonObject jsonObject) {
        final int[][] array = { net.optifine.util.lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl(jsonObject.get("uvDown"), 4), net.optifine.util.lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl(jsonObject.get("uvUp"), 4), net.optifine.util.lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl(jsonObject.get("uvNorth"), 4), net.optifine.util.lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl(jsonObject.get("uvSouth"), 4), net.optifine.util.lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl(jsonObject.get("uvWest"), 4), net.optifine.util.lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl(jsonObject.get("uvEast"), 4) };
        if (array[2] == null) {
            array[2] = net.optifine.util.lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl(jsonObject.get("uvFront"), 4);
        }
        if (array[3] == null) {
            array[3] = net.optifine.util.lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl(jsonObject.get("uvBack"), 4);
        }
        if (array[4] == null) {
            array[4] = net.optifine.util.lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl(jsonObject.get("uvLeft"), 4);
        }
        if (array[5] == null) {
            array[5] = net.optifine.util.lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl(jsonObject.get("uvRight"), 4);
        }
        boolean b = false;
        for (int i = 0; i < array.length; ++i) {
            if (array[i] != null) {
                b = true;
            }
        }
        if (!b) {
            return null;
        }
        return array;
    }
}
