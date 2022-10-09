package net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll;

import java.lang.reflect.*;
import org.lwjgl.util.vector.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import com.google.common.collect.*;
import java.util.*;
import com.google.gson.*;

class IlIlIIIllIllIIIIIllI implements JsonDeserializer
{
    public IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final JsonElement jsonElement, final Type type, final JsonDeserializationContext jsonDeserializationContext) {
        final JsonObject asJsonObject = jsonElement.getAsJsonObject();
        final Vector3f ilIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI(asJsonObject);
        final Vector3f ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl(asJsonObject);
        final lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(asJsonObject);
        final Map llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll(jsonDeserializationContext, asJsonObject);
        if (asJsonObject.has("shade") && !IIlllllIllIllIlIlIII.IlIlIlIlIlllllllllIl(asJsonObject, "shade")) {
            throw new JsonParseException("Expected shade to be a Boolean");
        }
        return new IlIIIlIlIIIllIlIlIIl(ilIlIIIllIllIIIIIllI, ilIIIlIlIIIllIlIlIIl, llllIIIIlIIIlIlllIll2, llllIIIIlIIIlIlllIll, IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "shade", true));
    }
    
    private lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll(final JsonObject jsonObject) {
        lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII = null;
        if (jsonObject.has("rotation")) {
            final JsonObject llIIlIIIlIIIllIlIIIl = IIlllllIllIllIlIlIII.llIIlIIIlIIIllIlIIIl(jsonObject, "rotation");
            final Vector3f llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl, "origin");
            llllIIIIlIIIlIlllIll.scale(0.0625f);
            liiiIlIIIIIlllIllIII = new lIIIIlIIIIIlllIllIII(llllIIIIlIIIlIlllIll, this.llIllIIIIIllIlIIIIlI(llIIlIIIlIIIllIlIIIl), this.IlIlIlIlIlllllllllIl(llIIlIIIlIIIllIlIIIl), IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl, "rescale", false));
        }
        return liiiIlIIIIIlllIllIII;
    }
    
    private float IlIlIlIlIlllllllllIl(final JsonObject jsonObject) {
        final float liiiIlIIIIIlllIllIII = IIlllllIllIllIlIlIII.lIIIIlIIIIIlllIllIII(jsonObject, "angle");
        if (liiiIlIIIIIlllIllIII != 0.0f && llIllIIlllllllllllll.IlIlIIIllIllIIIIIllI(liiiIlIIIIIlllIllIII) != 22.5f && llIllIIlllllllllllll.IlIlIIIllIllIIIIIllI(liiiIlIIIIIlllIllIII) != 45.0f) {
            throw new JsonParseException("Invalid rotation " + liiiIlIIIIIlllIllIII + " found, only -45/-22.5/0/22.5/45 allowed");
        }
        return liiiIlIIIIIlllIllIII;
    }
    
    private llIllIlIlIIIIIIIllII llIllIIIIIllIlIIIIlI(final JsonObject jsonObject) {
        final String illIIlllIIIIlllIIlIl = IIlllllIllIllIlIlIII.IllIIlllIIIIlllIIlIl(jsonObject, "axis");
        final llIllIlIlIIIIIIIllII llllIIIIlIIIlIlllIll = llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl.toLowerCase());
        if (llllIIIIlIIIlIlllIll == null) {
            throw new JsonParseException("Invalid rotation axis: " + illIIlllIIIIlllIIlIl);
        }
        return llllIIIIlIIIlIlllIll;
    }
    
    private Map llllIIIIlIIIlIlllIll(final JsonDeserializationContext jsonDeserializationContext, final JsonObject jsonObject) {
        final Map ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl(jsonDeserializationContext, jsonObject);
        if (ilIlIlIlIlllllllllIl.isEmpty()) {
            throw new JsonParseException("Expected between 1 and 6 unique faces, got 0");
        }
        return ilIlIlIlIlllllllllIl;
    }
    
    private Map IlIlIlIlIlllllllllIl(final JsonDeserializationContext jsonDeserializationContext, final JsonObject jsonObject) {
        final EnumMap enumMap = Maps.newEnumMap((Class)lllIllIIIllllllIllll.class);
        for (final Map.Entry<String, V> entry : IIlllllIllIllIlIlIII.llIIlIIIlIIIllIlIIIl(jsonObject, "faces").entrySet()) {
            enumMap.put(this.llllIIIIlIIIlIlllIll(entry.getKey()), (IllIIlllIIIIlllIIlIl)jsonDeserializationContext.deserialize((JsonElement)entry.getValue(), (Type)IllIIlllIIIIlllIIlIl.class));
        }
        return enumMap;
    }
    
    private lllIllIIIllllllIllll llllIIIIlIIIlIlllIll(final String s) {
        final lllIllIIIllllllIllll llllIIIIlIIIlIlllIll = lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(s);
        if (llllIIIIlIIIlIlllIll == null) {
            throw new JsonParseException("Unknown facing: " + s);
        }
        return llllIIIIlIIIlIlllIll;
    }
    
    private Vector3f IlIIIlIlIIIllIlIlIIl(final JsonObject jsonObject) {
        final Vector3f llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(jsonObject, "to");
        if (llllIIIIlIIIlIlllIll.x >= -16.0f && llllIIIIlIIIlIlllIll.y >= -16.0f && llllIIIIlIIIlIlllIll.z >= -16.0f && llllIIIIlIIIlIlllIll.x <= 32.0f && llllIIIIlIIIlIlllIll.y <= 32.0f && llllIIIIlIIIlIlllIll.z <= 32.0f) {
            return llllIIIIlIIIlIlllIll;
        }
        throw new JsonParseException("'to' specifier exceeds the allowed boundaries: " + llllIIIIlIIIlIlllIll);
    }
    
    private Vector3f IlIlIIIllIllIIIIIllI(final JsonObject jsonObject) {
        final Vector3f llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(jsonObject, "from");
        if (llllIIIIlIIIlIlllIll.x >= -16.0f && llllIIIIlIIIlIlllIll.y >= -16.0f && llllIIIIlIIIlIlllIll.z >= -16.0f && llllIIIIlIIIlIlllIll.x <= 32.0f && llllIIIIlIIIlIlllIll.y <= 32.0f && llllIIIIlIIIlIlllIll.z <= 32.0f) {
            return llllIIIIlIIIlIlllIll;
        }
        throw new JsonParseException("'from' specifier exceeds the allowed boundaries: " + llllIIIIlIIIlIlllIll);
    }
    
    private Vector3f llllIIIIlIIIlIlllIll(final JsonObject jsonObject, final String s) {
        final JsonArray llIllIlIIIIllIlIIllI = IIlllllIllIllIlIlIII.llIllIlIIIIllIlIIllI(jsonObject, s);
        if (llIllIlIIIIllIlIIllI.size() != 3) {
            throw new JsonParseException("Expected 3 " + s + " values, found: " + llIllIlIIIIllIlIIllI.size());
        }
        final float[] array = new float[3];
        for (int i = 0; i < array.length; ++i) {
            array[i] = IIlllllIllIllIlIlIII.llIllIIIIIllIlIIIIlI(llIllIlIIIIllIlIIllI.get(i), String.valueOf(s) + "[" + i + "]");
        }
        return new Vector3f(array[0], array[1], array[2]);
    }
}
