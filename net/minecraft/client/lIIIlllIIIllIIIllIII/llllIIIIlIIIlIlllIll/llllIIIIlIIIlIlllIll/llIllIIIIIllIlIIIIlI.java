package net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll;

import java.lang.reflect.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import com.google.gson.*;

class llIllIIIIIllIlIIIIlI implements JsonDeserializer
{
    public IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final JsonElement jsonElement, final Type type, final JsonDeserializationContext jsonDeserializationContext) {
        final JsonObject asJsonObject = jsonElement.getAsJsonObject();
        return new IlIlIlIlIlllllllllIl(this.IlIlIlIlIlllllllllIl(asJsonObject), this.llllIIIIlIIIlIlllIll(asJsonObject));
    }
    
    protected int llllIIIIlIIIlIlllIll(final JsonObject jsonObject) {
        final int llllIIIIlIIIlIlllIll = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(jsonObject, "rotation", 0);
        if (llllIIIIlIIIlIlllIll >= 0 && llllIIIIlIIIlIlllIll % 90 == 0 && llllIIIIlIIIlIlllIll / 90 <= 3) {
            return llllIIIIlIIIlIlllIll;
        }
        throw new JsonParseException("Invalid rotation " + llllIIIIlIIIlIlllIll + " found, only 0/90/180/270 allowed");
    }
    
    private float[] IlIlIlIlIlllllllllIl(final JsonObject jsonObject) {
        if (!jsonObject.has("uv")) {
            return null;
        }
        final JsonArray llIllIlIIIIllIlIIllI = IIlllllIllIllIlIlIII.llIllIlIIIIllIlIIllI(jsonObject, "uv");
        if (llIllIlIIIIllIlIIllI.size() != 4) {
            throw new JsonParseException("Expected 4 uv values, found: " + llIllIlIIIIllIlIIllI.size());
        }
        final float[] array = new float[4];
        for (int i = 0; i < array.length; ++i) {
            array[i] = IIlllllIllIllIlIlIII.llIllIIIIIllIlIIIIlI(llIllIlIIIIllIlIIllI.get(i), "uv[" + i + "]");
        }
        return array;
    }
}
