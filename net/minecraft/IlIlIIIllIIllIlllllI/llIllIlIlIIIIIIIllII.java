package net.minecraft.IlIlIIIllIIllIlllllI;

import java.lang.reflect.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import com.mojang.authlib.*;
import java.util.*;
import com.google.gson.*;

public class llIllIlIlIIIIIIIllII implements JsonDeserializer, JsonSerializer
{
    public lllIllIIIllllllIllll llllIIIIlIIIlIlllIll(final JsonElement jsonElement, final Type type, final JsonDeserializationContext jsonDeserializationContext) {
        final JsonObject ilIlIIIllIllIIIIIllI = IIlllllIllIllIlIlIII.IlIlIIIllIllIIIIIllI(jsonElement, "players");
        final lllIllIIIllllllIllll lllIllIIIllllllIllll = new lllIllIIIllllllIllll(IIlllllIllIllIlIlIII.lIIIlllIIIllIIIllIII(ilIlIIIllIllIIIIIllI, "max"), IIlllllIllIllIlIlIII.lIIIlllIIIllIIIllIII(ilIlIIIllIllIIIIIllI, "online"));
        if (IIlllllIllIllIlIlIII.llIllIIIIIllIlIIIIlI(ilIlIIIllIllIIIIIllI, "sample")) {
            final JsonArray llIllIlIIIIllIlIIllI = IIlllllIllIllIlIlIII.llIllIlIIIIllIlIIllI(ilIlIIIllIllIIIIIllI, "sample");
            if (llIllIlIIIIllIlIIllI.size() > 0) {
                final GameProfile[] array = new GameProfile[llIllIlIIIIllIlIIllI.size()];
                for (int i = 0; i < array.length; ++i) {
                    final JsonObject ilIlIIIllIllIIIIIllI2 = IIlllllIllIllIlIlIII.IlIlIIIllIllIIIIIllI(llIllIlIIIIllIlIIllI.get(i), "player[" + i + "]");
                    array[i] = new GameProfile(UUID.fromString(IIlllllIllIllIlIlIII.IllIIlllIIIIlllIIlIl(ilIlIIIllIllIIIIIllI2, "id")), IIlllllIllIllIlIlIII.IllIIlllIIIIlllIIlIl(ilIlIIIllIllIIIIIllI2, "name"));
                }
                lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(array);
            }
        }
        return lllIllIIIllllllIllll;
    }
    
    public JsonElement llllIIIIlIIIlIlllIll(final lllIllIIIllllllIllll lllIllIIIllllllIllll, final Type type, final JsonSerializationContext jsonSerializationContext) {
        final JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("max", (Number)lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll());
        jsonObject.addProperty("online", (Number)lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl());
        if (lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI() != null && lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI().length > 0) {
            final JsonArray jsonArray = new JsonArray();
            for (int i = 0; i < lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI().length; ++i) {
                final JsonObject jsonObject2 = new JsonObject();
                final UUID id = lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI()[i].getId();
                jsonObject2.addProperty("id", (id == null) ? "" : id.toString());
                jsonObject2.addProperty("name", lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI()[i].getName());
                jsonArray.add((JsonElement)jsonObject2);
            }
            jsonObject.add("sample", (JsonElement)jsonArray);
        }
        return (JsonElement)jsonObject;
    }
}
