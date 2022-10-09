package net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll;

import org.lwjgl.util.vector.*;
import java.lang.reflect.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import com.google.gson.*;

class lllIIIIlllllIlIIllIl implements JsonDeserializer
{
    private static final Vector3f llllIIIIlIIIlIlllIll;
    private static final Vector3f IlIlIlIlIlllllllllIl;
    private static final Vector3f llIllIIIIIllIlIIIIlI;
    
    static {
        llllIIIIlIIIlIlllIll = new Vector3f(0.0f, 0.0f, 0.0f);
        IlIlIlIlIlllllllllIl = new Vector3f(0.0f, 0.0f, 0.0f);
        llIllIIIIIllIlIIIIlI = new Vector3f(1.0f, 1.0f, 1.0f);
    }
    
    public IIlllIIlIllIllIlIIll llllIIIIlIIIlIlllIll(final JsonElement jsonElement, final Type type, final JsonDeserializationContext jsonDeserializationContext) {
        final JsonObject asJsonObject = jsonElement.getAsJsonObject();
        final Vector3f llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(asJsonObject, "rotation", lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll);
        final Vector3f llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll(asJsonObject, "translation", lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl);
        llllIIIIlIIIlIlllIll2.scale(0.0625f);
        llllIIIIlIIIlIlllIll2.x = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2.x, -1.5f, 1.5f);
        llllIIIIlIIIlIlllIll2.y = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2.y, -1.5f, 1.5f);
        llllIIIIlIIIlIlllIll2.z = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2.z, -1.5f, 1.5f);
        final Vector3f llllIIIIlIIIlIlllIll3 = this.llllIIIIlIIIlIlllIll(asJsonObject, "scale", lllIIIIlllllIlIIllIl.llIllIIIIIllIlIIIIlI);
        llllIIIIlIIIlIlllIll3.x = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3.x, -4.0f, 4.0f);
        llllIIIIlIIIlIlllIll3.y = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3.y, -4.0f, 4.0f);
        llllIIIIlIIIlIlllIll3.z = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3.z, -4.0f, 4.0f);
        return new IIlllIIlIllIllIlIIll(llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2, llllIIIIlIIIlIlllIll3);
    }
    
    private Vector3f llllIIIIlIIIlIlllIll(final JsonObject jsonObject, final String s, final Vector3f vector3f) {
        if (!jsonObject.has(s)) {
            return vector3f;
        }
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
