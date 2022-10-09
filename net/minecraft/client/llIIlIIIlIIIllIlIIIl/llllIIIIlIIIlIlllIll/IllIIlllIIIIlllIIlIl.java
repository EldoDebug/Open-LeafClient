package net.minecraft.client.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll;

import java.lang.reflect.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import org.apache.commons.lang3.*;
import com.google.gson.*;

public class IllIIlllIIIIlllIIlIl extends IlIIIlIlIIIllIlIlIIl
{
    public IlIlIIIllIllIIIIIllI llllIIIIlIIIlIlllIll(final JsonElement jsonElement, final Type type, final JsonDeserializationContext jsonDeserializationContext) {
        final JsonObject asJsonObject = jsonElement.getAsJsonObject();
        final float[] array = new float[256];
        final float[] array2 = new float[256];
        final float[] array3 = new float[256];
        float llllIIIIlIIIlIlllIll = 1.0f;
        float llllIIIIlIIIlIlllIll2 = 0.0f;
        float llllIIIIlIIIlIlllIll3 = 0.0f;
        if (asJsonObject.has("characters")) {
            if (!asJsonObject.get("characters").isJsonObject()) {
                throw new JsonParseException("Invalid font->characters: expected object, was " + asJsonObject.get("characters"));
            }
            final JsonObject asJsonObject2 = asJsonObject.getAsJsonObject("characters");
            if (asJsonObject2.has("default")) {
                if (!asJsonObject2.get("default").isJsonObject()) {
                    throw new JsonParseException("Invalid font->characters->default: expected object, was " + asJsonObject2.get("default"));
                }
                final JsonObject asJsonObject3 = asJsonObject2.getAsJsonObject("default");
                llllIIIIlIIIlIlllIll = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject3, "width", llllIIIIlIIIlIlllIll);
                Validate.inclusiveBetween(0.0, 3.4028234663852886E38, (double)llllIIIIlIIIlIlllIll, "Invalid default width");
                llllIIIIlIIIlIlllIll2 = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject3, "spacing", llllIIIIlIIIlIlllIll2);
                Validate.inclusiveBetween(0.0, 3.4028234663852886E38, (double)llllIIIIlIIIlIlllIll2, "Invalid default spacing");
                llllIIIIlIIIlIlllIll3 = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject3, "left", llllIIIIlIIIlIlllIll2);
                Validate.inclusiveBetween(0.0, 3.4028234663852886E38, (double)llllIIIIlIIIlIlllIll3, "Invalid default left");
            }
            for (int i = 0; i < 256; ++i) {
                final JsonElement value = asJsonObject2.get(Integer.toString(i));
                float llllIIIIlIIIlIlllIll4 = llllIIIIlIIIlIlllIll;
                float llllIIIIlIIIlIlllIll5 = llllIIIIlIIIlIlllIll2;
                float llllIIIIlIIIlIlllIll6 = llllIIIIlIIIlIlllIll3;
                if (value != null) {
                    final JsonObject ilIlIIIllIllIIIIIllI = IIlllllIllIllIlIlIII.IlIlIIIllIllIIIIIllI(value, "characters[" + i + "]");
                    llllIIIIlIIIlIlllIll4 = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, "width", llllIIIIlIIIlIlllIll);
                    Validate.inclusiveBetween(0.0, 3.4028234663852886E38, (double)llllIIIIlIIIlIlllIll4, "Invalid width");
                    llllIIIIlIIIlIlllIll5 = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, "spacing", llllIIIIlIIIlIlllIll2);
                    Validate.inclusiveBetween(0.0, 3.4028234663852886E38, (double)llllIIIIlIIIlIlllIll5, "Invalid spacing");
                    llllIIIIlIIIlIlllIll6 = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, "left", llllIIIIlIIIlIlllIll3);
                    Validate.inclusiveBetween(0.0, 3.4028234663852886E38, (double)llllIIIIlIIIlIlllIll6, "Invalid left");
                }
                array[i] = llllIIIIlIIIlIlllIll4;
                array2[i] = llllIIIIlIIIlIlllIll5;
                array3[i] = llllIIIIlIIIlIlllIll6;
            }
        }
        return new IlIlIIIllIllIIIIIllI(array, array3, array2);
    }
    
    @Override
    public String llllIIIIlIIIlIlllIll() {
        return "font";
    }
}
