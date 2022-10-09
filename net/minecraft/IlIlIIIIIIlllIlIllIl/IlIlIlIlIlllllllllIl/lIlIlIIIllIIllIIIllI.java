package net.minecraft.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl;

import java.lang.reflect.*;
import com.google.gson.*;
import java.text.*;
import com.mojang.authlib.*;
import java.util.*;

class lIlIlIIIllIIllIIIllI implements JsonDeserializer, JsonSerializer
{
    final /* synthetic */ lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll;
    
    private lIlIlIIIllIIllIIIllI(final lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public JsonElement llllIIIIlIIIlIlllIll(final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI, final Type type, final JsonSerializationContext jsonSerializationContext) {
        final JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll().getName());
        final UUID id = llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll().getId();
        jsonObject.addProperty("uuid", (id == null) ? "" : id.toString());
        jsonObject.addProperty("expiresOn", lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll.format(llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl()));
        return (JsonElement)jsonObject;
    }
    
    public llIllIlIIIIllIlIIllI llllIIIIlIIIlIlllIll(final JsonElement jsonElement, final Type type, final JsonDeserializationContext jsonDeserializationContext) {
        if (!jsonElement.isJsonObject()) {
            return null;
        }
        final JsonObject asJsonObject = jsonElement.getAsJsonObject();
        final JsonElement value = asJsonObject.get("name");
        final JsonElement value2 = asJsonObject.get("uuid");
        final JsonElement value3 = asJsonObject.get("expiresOn");
        if (value == null || value2 == null) {
            return null;
        }
        final String asString = value2.getAsString();
        final String asString2 = value.getAsString();
        Date parse = null;
        if (value3 != null) {
            try {
                parse = lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll.parse(value3.getAsString());
            }
            catch (ParseException ex) {
                parse = null;
            }
        }
        if (asString2 != null && asString != null) {
            UUID fromString;
            try {
                fromString = UUID.fromString(asString);
            }
            catch (Throwable t) {
                return null;
            }
            final lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll;
            llllIIIIlIIIlIlllIll.getClass();
            return new llIllIlIIIIllIlIIllI(llllIIIIlIIIlIlllIll, new GameProfile(fromString, asString2), parse, null);
        }
        return null;
    }
}
