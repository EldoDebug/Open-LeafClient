package net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll;

import java.lang.reflect.*;
import com.google.gson.*;

class lIlIlIIIllIIllIIIllI implements JsonDeserializer
{
    public llIllIlIIIIllIlIIllI llllIIIIlIIIlIlllIll(final JsonElement jsonElement, final Type type, final JsonDeserializationContext jsonDeserializationContext) {
        final JsonObject asJsonObject = jsonElement.getAsJsonObject();
        return new llIllIlIIIIllIlIIllI(this.llllIIIIlIIIlIlllIll(jsonDeserializationContext, asJsonObject, "thirdperson"), this.llllIIIIlIIIlIlllIll(jsonDeserializationContext, asJsonObject, "firstperson"), this.llllIIIIlIIIlIlllIll(jsonDeserializationContext, asJsonObject, "head"), this.llllIIIIlIIIlIlllIll(jsonDeserializationContext, asJsonObject, "gui"), this.llllIIIIlIIIlIlllIll(jsonDeserializationContext, asJsonObject, "ground"), this.llllIIIIlIIIlIlllIll(jsonDeserializationContext, asJsonObject, "fixed"));
    }
    
    private IIlllIIlIllIllIlIIll llllIIIIlIIIlIlllIll(final JsonDeserializationContext jsonDeserializationContext, final JsonObject jsonObject, final String s) {
        return (IIlllIIlIllIllIlIIll)(jsonObject.has(s) ? jsonDeserializationContext.deserialize(jsonObject.get(s), (Type)IIlllIIlIllIllIlIIll.class) : IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll);
    }
}
