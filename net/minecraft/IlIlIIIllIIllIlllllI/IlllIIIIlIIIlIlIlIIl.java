package net.minecraft.IlIlIIIllIIllIlllllI;

import java.lang.reflect.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import com.google.gson.*;

public class IlllIIIIlIIIlIlIlIIl implements JsonDeserializer, JsonSerializer
{
    public IIllllIIIlIIIIIIllIl llllIIIIlIIIlIlllIll(final JsonElement jsonElement, final Type type, final JsonDeserializationContext jsonDeserializationContext) {
        final JsonObject ilIlIIIllIllIIIIIllI = IIlllllIllIllIlIlIII.IlIlIIIllIllIIIIIllI(jsonElement, "version");
        return new IIllllIIIlIIIIIIllIl(IIlllllIllIllIlIlIII.IllIIlllIIIIlllIIlIl(ilIlIIIllIllIIIIIllI, "name"), IIlllllIllIllIlIlIII.lIIIlllIIIllIIIllIII(ilIlIIIllIllIIIIIllI, "protocol"));
    }
    
    public JsonElement llllIIIIlIIIlIlllIll(final IIllllIIIlIIIIIIllIl illllIIIlIIIIIIllIl, final Type type, final JsonSerializationContext jsonSerializationContext) {
        final JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", illllIIIlIIIIIIllIl.llllIIIIlIIIlIlllIll());
        jsonObject.addProperty("protocol", (Number)illllIIIlIIIIIIllIl.IlIlIlIlIlllllllllIl());
        return (JsonElement)jsonObject;
    }
}
