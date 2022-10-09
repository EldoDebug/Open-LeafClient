package net.minecraft.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl;

import java.lang.reflect.*;
import com.google.gson.*;

class IIllIIllIIIlIlIIIIlI implements JsonDeserializer, JsonSerializer
{
    final /* synthetic */ lllIIIIlllllIlIIllIl llllIIIIlIIIlIlllIll;
    
    private IIllIIllIIIlIlIIIIlI(final lllIIIIlllllIlIIllIl llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public JsonElement llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Type type, final JsonSerializationContext jsonSerializationContext) {
        final JsonObject jsonObject = new JsonObject();
        illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(jsonObject);
        return (JsonElement)jsonObject;
    }
    
    public IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll(final JsonElement jsonElement, final Type type, final JsonDeserializationContext jsonDeserializationContext) {
        if (jsonElement.isJsonObject()) {
            return this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(jsonElement.getAsJsonObject());
        }
        return null;
    }
}
