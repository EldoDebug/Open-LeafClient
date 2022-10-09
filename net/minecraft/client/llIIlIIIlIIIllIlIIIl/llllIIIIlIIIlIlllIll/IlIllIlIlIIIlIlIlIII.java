package net.minecraft.client.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll;

import java.lang.reflect.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import com.google.common.collect.*;
import java.util.*;
import com.google.gson.*;

public class IlIllIlIlIIIlIlIlIII extends IlIIIlIlIIIllIlIlIIl
{
    public llllIIllllIlIlIIIIll llllIIIIlIIIlIlllIll(final JsonElement jsonElement, final Type type, final JsonDeserializationContext jsonDeserializationContext) {
        final JsonObject asJsonObject = jsonElement.getAsJsonObject();
        final boolean llllIIIIlIIIlIlllIll = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "blur", false);
        final boolean llllIIIIlIIIlIlllIll2 = IIlllllIllIllIlIlIII.llllIIIIlIIIlIlllIll(asJsonObject, "clamp", false);
        final ArrayList arrayList = Lists.newArrayList();
        if (asJsonObject.has("mipmaps")) {
            try {
                final JsonArray asJsonArray = asJsonObject.getAsJsonArray("mipmaps");
                for (int i = 0; i < asJsonArray.size(); ++i) {
                    final JsonElement value = asJsonArray.get(i);
                    if (value.isJsonPrimitive()) {
                        try {
                            arrayList.add(value.getAsInt());
                            continue;
                        }
                        catch (NumberFormatException ex) {
                            throw new JsonParseException("Invalid texture->mipmap->" + i + ": expected number, was " + value, (Throwable)ex);
                        }
                    }
                    if (value.isJsonObject()) {
                        throw new JsonParseException("Invalid texture->mipmap->" + i + ": expected number, was " + value);
                    }
                }
            }
            catch (ClassCastException ex2) {
                throw new JsonParseException("Invalid texture->mipmaps: expected array, was " + asJsonObject.get("mipmaps"), (Throwable)ex2);
            }
        }
        return new llllIIllllIlIlIIIIll(llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2, arrayList);
    }
    
    @Override
    public String llllIIIIlIIIlIlllIll() {
        return "texture";
    }
}
