package net.minecraft.IlIlIIIllIIllIlllllI;

import java.lang.reflect.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import com.google.gson.*;

public class IIlIlIlIIlIllIIIIIIl implements JsonDeserializer, JsonSerializer
{
    public IIIIIIIIIlllIllIlIlI llllIIIIlIIIlIlllIll(final JsonElement jsonElement, final Type type, final JsonDeserializationContext jsonDeserializationContext) {
        final JsonObject ilIlIIIllIllIIIIIllI = IIlllllIllIllIlIlIII.IlIlIIIllIllIIIIIllI(jsonElement, "status");
        final IIIIIIIIIlllIllIlIlI iiiiiiiiIlllIllIlIlI = new IIIIIIIIIlllIllIlIlI();
        if (ilIlIIIllIllIIIIIllI.has("description")) {
            iiiiiiiiIlllIllIlIlI.llllIIIIlIIIlIlllIll((llIIIIIIlIllIIlIIIll)jsonDeserializationContext.deserialize(ilIlIIIllIllIIIIIllI.get("description"), (Type)llIIIIIIlIllIIlIIIll.class));
        }
        if (ilIlIIIllIllIIIIIllI.has("players")) {
            iiiiiiiiIlllIllIlIlI.llllIIIIlIIIlIlllIll((lllIllIIIllllllIllll)jsonDeserializationContext.deserialize(ilIlIIIllIllIIIIIllI.get("players"), (Type)lllIllIIIllllllIllll.class));
        }
        if (ilIlIIIllIllIIIIIllI.has("version")) {
            iiiiiiiiIlllIllIlIlI.llllIIIIlIIIlIlllIll((IIllllIIIlIIIIIIllIl)jsonDeserializationContext.deserialize(ilIlIIIllIllIIIIIllI.get("version"), (Type)IIllllIIIlIIIIIIllIl.class));
        }
        if (ilIlIIIllIllIIIIIllI.has("favicon")) {
            iiiiiiiiIlllIllIlIlI.llllIIIIlIIIlIlllIll(IIlllllIllIllIlIlIII.IllIIlllIIIIlllIIlIl(ilIlIIIllIllIIIIIllI, "favicon"));
        }
        return iiiiiiiiIlllIllIlIlI;
    }
    
    public JsonElement llllIIIIlIIIlIlllIll(final IIIIIIIIIlllIllIlIlI iiiiiiiiIlllIllIlIlI, final Type type, final JsonSerializationContext jsonSerializationContext) {
        final JsonObject jsonObject = new JsonObject();
        if (iiiiiiiiIlllIllIlIlI.llllIIIIlIIIlIlllIll() != null) {
            jsonObject.add("description", jsonSerializationContext.serialize((Object)iiiiiiiiIlllIllIlIlI.llllIIIIlIIIlIlllIll()));
        }
        if (iiiiiiiiIlllIllIlIlI.IlIlIlIlIlllllllllIl() != null) {
            jsonObject.add("players", jsonSerializationContext.serialize((Object)iiiiiiiiIlllIllIlIlI.IlIlIlIlIlllllllllIl()));
        }
        if (iiiiiiiiIlllIllIlIlI.llIllIIIIIllIlIIIIlI() != null) {
            jsonObject.add("version", jsonSerializationContext.serialize((Object)iiiiiiiiIlllIllIlIlI.llIllIIIIIllIlIIIIlI()));
        }
        if (iiiiiiiiIlllIllIlIlI.IlIIIlIlIIIllIlIlIIl() != null) {
            jsonObject.addProperty("favicon", iiiiiiiiIlllIllIlIlI.IlIIIlIlIIIllIlIlIIl());
        }
        return (JsonElement)jsonObject;
    }
}
