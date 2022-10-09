package net.minecraft.client.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll;

import java.lang.reflect.*;
import com.google.common.collect.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import org.apache.commons.lang3.*;
import java.util.*;
import com.google.gson.*;

public class llIllIIIIIllIlIIIIlI extends IlIIIlIlIIIllIlIlIIl implements JsonSerializer
{
    public IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final JsonElement jsonElement, final Type type, final JsonDeserializationContext jsonDeserializationContext) {
        final ArrayList arrayList = Lists.newArrayList();
        final JsonObject ilIlIIIllIllIIIIIllI = IIlllllIllIllIlIlIII.IlIlIIIllIllIIIIIllI(jsonElement, "metadata section");
        final int llllIIIIlIIIlIlllIll = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, "frametime", 1);
        if (llllIIIIlIIIlIlllIll != 1) {
            Validate.inclusiveBetween(1L, 2147483647L, (long)llllIIIIlIIIlIlllIll, "Invalid default frame time");
        }
        if (ilIlIIIllIllIIIIIllI.has("frames")) {
            try {
                final JsonArray llIllIlIIIIllIlIIllI = IIlllllIllIllIlIlIII.llIllIlIIIIllIlIIllI(ilIlIIIllIllIIIIIllI, "frames");
                for (int i = 0; i < llIllIlIIIIllIlIIllI.size(); ++i) {
                    final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll(i, llIllIlIIIIllIlIIllI.get(i));
                    if (llllIIIIlIIIlIlllIll2 != null) {
                        arrayList.add(llllIIIIlIIIlIlllIll2);
                    }
                }
            }
            catch (ClassCastException ex) {
                throw new JsonParseException("Invalid animation->frames: expected array, was " + ilIlIIIllIllIIIIIllI.get("frames"), (Throwable)ex);
            }
        }
        final int llllIIIIlIIIlIlllIll3 = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, "width", -1);
        final int llllIIIIlIIIlIlllIll4 = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, "height", -1);
        if (llllIIIIlIIIlIlllIll3 != -1) {
            Validate.inclusiveBetween(1L, 2147483647L, (long)llllIIIIlIIIlIlllIll3, "Invalid width");
        }
        if (llllIIIIlIIIlIlllIll4 != -1) {
            Validate.inclusiveBetween(1L, 2147483647L, (long)llllIIIIlIIIlIlllIll4, "Invalid height");
        }
        return new IlIlIlIlIlllllllllIl(arrayList, llllIIIIlIIIlIlllIll3, llllIIIIlIIIlIlllIll4, llllIIIIlIIIlIlllIll, IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, "interpolate", false));
    }
    
    private llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final int n, final JsonElement jsonElement) {
        if (jsonElement.isJsonPrimitive()) {
            return new llllIIIIlIIIlIlllIll(IIlllllIllIllIlIlIII.IlIIIlIlIIIllIlIlIIl(jsonElement, "frames[" + n + "]"));
        }
        if (jsonElement.isJsonObject()) {
            final JsonObject ilIlIIIllIllIIIIIllI = IIlllllIllIllIlIlIII.IlIlIIIllIllIIIIIllI(jsonElement, "frames[" + n + "]");
            final int llllIIIIlIIIlIlllIll = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, "time", -1);
            if (ilIlIIIllIllIIIIIllI.has("time")) {
                Validate.inclusiveBetween(1L, 2147483647L, (long)llllIIIIlIIIlIlllIll, "Invalid frame time");
            }
            final int liiIlllIIIllIIIllIII = IIlllllIllIllIlIlIII.lIIIlllIIIllIIIllIII(ilIlIIIllIllIIIIIllI, "index");
            Validate.inclusiveBetween(0L, 2147483647L, (long)liiIlllIIIllIIIllIII, "Invalid frame index");
            return new llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII, llllIIIIlIIIlIlllIll);
        }
        return null;
    }
    
    public JsonElement llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final Type type, final JsonSerializationContext jsonSerializationContext) {
        final JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("frametime", (Number)ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl());
        if (ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl() != -1) {
            jsonObject.addProperty("width", (Number)ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl());
        }
        if (ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll() != -1) {
            jsonObject.addProperty("height", (Number)ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll());
        }
        if (ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI() > 0) {
            final JsonArray jsonArray = new JsonArray();
            for (int i = 0; i < ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(); ++i) {
                if (ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(i)) {
                    final JsonObject jsonObject2 = new JsonObject();
                    jsonObject2.addProperty("index", (Number)ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(i));
                    jsonObject2.addProperty("time", (Number)ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(i));
                    jsonArray.add((JsonElement)jsonObject2);
                }
                else {
                    jsonArray.add((JsonElement)new JsonPrimitive((Number)ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(i)));
                }
            }
            jsonObject.add("frames", (JsonElement)jsonArray);
        }
        return (JsonElement)jsonObject;
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return "animation";
    }
}
