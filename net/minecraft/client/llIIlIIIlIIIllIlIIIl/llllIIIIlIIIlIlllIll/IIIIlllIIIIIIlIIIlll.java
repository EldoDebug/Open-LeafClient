package net.minecraft.client.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll;

import java.lang.reflect.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import com.google.gson.*;

public class IIIIlllIIIIIIlIIIlll extends IlIIIlIlIIIllIlIlIIl implements JsonSerializer
{
    public IlIlIIIllIIllIlllllI llllIIIIlIIIlIlllIll(final JsonElement jsonElement, final Type type, final JsonDeserializationContext jsonDeserializationContext) {
        final JsonObject asJsonObject = jsonElement.getAsJsonObject();
        final llIIIIIIlIllIIlIIIll llIIIIIIlIllIIlIIIll = (llIIIIIIlIllIIlIIIll)jsonDeserializationContext.deserialize(asJsonObject.get("description"), (Type)llIIIIIIlIllIIlIIIll.class);
        if (llIIIIIIlIllIIlIIIll == null) {
            throw new JsonParseException("Invalid/missing description!");
        }
        return new IlIlIIIllIIllIlllllI(llIIIIIIlIllIIlIIIll, IIlllllIllIllIlIlIII.lIIIlllIIIllIIIllIII(asJsonObject, "pack_format"));
    }
    
    public JsonElement llllIIIIlIIIlIlllIll(final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI, final Type type, final JsonSerializationContext jsonSerializationContext) {
        final JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("pack_format", (Number)ilIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl());
        jsonObject.add("description", jsonSerializationContext.serialize((Object)ilIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll()));
        return (JsonElement)jsonObject;
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return "pack";
    }
}
