package net.minecraft.IlllllllIIIlIIIlIlII;

import java.lang.reflect.*;
import net.minecraft.lIIIIlIIIIIlllIllIII.*;
import com.google.gson.*;

public class IIlIIIIlllIlllllIlII implements JsonDeserializer, JsonSerializer
{
    public IlIlIIIlIIlIlIIlllIl llllIIIIlIIIlIlllIll(final JsonElement jsonElement, final Type type, final JsonDeserializationContext jsonDeserializationContext) {
        if (!jsonElement.isJsonObject()) {
            return null;
        }
        final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl = new IlIlIIIlIIlIlIIlllIl();
        final JsonObject asJsonObject = jsonElement.getAsJsonObject();
        if (asJsonObject == null) {
            return null;
        }
        if (asJsonObject.has("bold")) {
            IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(ilIlIIIlIIlIlIIlllIl, asJsonObject.get("bold").getAsBoolean());
        }
        if (asJsonObject.has("italic")) {
            IlIlIIIlIIlIlIIlllIl.IlIlIlIlIlllllllllIl(ilIlIIIlIIlIlIIlllIl, asJsonObject.get("italic").getAsBoolean());
        }
        if (asJsonObject.has("underlined")) {
            IlIlIIIlIIlIlIIlllIl.llIllIIIIIllIlIIIIlI(ilIlIIIlIIlIlIIlllIl, asJsonObject.get("underlined").getAsBoolean());
        }
        if (asJsonObject.has("strikethrough")) {
            IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl(ilIlIIIlIIlIlIIlllIl, asJsonObject.get("strikethrough").getAsBoolean());
        }
        if (asJsonObject.has("obfuscated")) {
            IlIlIIIlIIlIlIIlllIl.IlIlIIIllIllIIIIIllI(ilIlIIIlIIlIlIIlllIl, asJsonObject.get("obfuscated").getAsBoolean());
        }
        if (asJsonObject.has("color")) {
            IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(ilIlIIIlIIlIlIIlllIl, (IlllIIIIlIIIlIlIlIIl)jsonDeserializationContext.deserialize(asJsonObject.get("color"), (Type)IlllIIIIlIIIlIlIlIIl.class));
        }
        if (asJsonObject.has("insertion")) {
            IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(ilIlIIIlIIlIlIIlllIl, asJsonObject.get("insertion").getAsString());
        }
        if (asJsonObject.has("clickEvent")) {
            final JsonObject asJsonObject2 = asJsonObject.getAsJsonObject("clickEvent");
            if (asJsonObject2 != null) {
                final JsonPrimitive asJsonPrimitive = asJsonObject2.getAsJsonPrimitive("action");
                final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = (asJsonPrimitive == null) ? null : IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(asJsonPrimitive.getAsString());
                final JsonPrimitive asJsonPrimitive2 = asJsonObject2.getAsJsonPrimitive("value");
                final String s = (asJsonPrimitive2 == null) ? null : asJsonPrimitive2.getAsString();
                if (ilIlIlIlIlllllllllIl != null && s != null && ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll()) {
                    IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(ilIlIIIlIIlIlIIlllIl, new llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, s));
                }
            }
        }
        if (asJsonObject.has("hoverEvent")) {
            final JsonObject asJsonObject3 = asJsonObject.getAsJsonObject("hoverEvent");
            if (asJsonObject3 != null) {
                final JsonPrimitive asJsonPrimitive3 = asJsonObject3.getAsJsonPrimitive("action");
                final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = (asJsonPrimitive3 == null) ? null : IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(asJsonPrimitive3.getAsString());
                final llIIIIIIlIllIIlIIIll llIIIIIIlIllIIlIIIll = (llIIIIIIlIllIIlIIIll)jsonDeserializationContext.deserialize(asJsonObject3.get("value"), (Type)llIIIIIIlIllIIlIIIll.class);
                if (ilIIIlIlIIIllIlIlIIl != null && llIIIIIIlIllIIlIIIll != null && ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll()) {
                    IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(ilIlIIIlIIlIlIIlllIl, new llIllIIIIIllIlIIIIlI(ilIIIlIlIIIllIlIlIIl, llIIIIIIlIllIIlIIIll));
                }
            }
        }
        return ilIlIIIlIIlIlIIlllIl;
    }
    
    public JsonElement llllIIIIlIIIlIlllIll(final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl, final Type type, final JsonSerializationContext jsonSerializationContext) {
        if (ilIlIIIlIIlIlIIlllIl.llllIIIlIlllIlIIIIIl()) {
            return null;
        }
        final JsonObject jsonObject = new JsonObject();
        if (ilIlIIIlIIlIlIIlllIl.llIllIIIIIllIlIIIIlI != null) {
            jsonObject.addProperty("bold", ilIlIIIlIIlIlIIlllIl.llIllIIIIIllIlIIIIlI);
        }
        if (ilIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl != null) {
            jsonObject.addProperty("italic", ilIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl);
        }
        if (ilIlIIIlIIlIlIIlllIl.IlIlIIIllIllIIIIIllI != null) {
            jsonObject.addProperty("underlined", ilIlIIIlIIlIlIIlllIl.IlIlIIIllIllIIIIIllI);
        }
        if (ilIlIIIlIIlIlIIlllIl.IllIIlllIIIIlllIIlIl != null) {
            jsonObject.addProperty("strikethrough", ilIlIIIlIIlIlIIlllIl.IllIIlllIIIIlllIIlIl);
        }
        if (ilIlIIIlIIlIlIIlllIl.llllIIIlIlllIlIIIIIl != null) {
            jsonObject.addProperty("obfuscated", ilIlIIIlIIlIlIIlllIl.llllIIIlIlllIlIIIIIl);
        }
        if (ilIlIIIlIIlIlIIlllIl.IlIlIlIlIlllllllllIl != null) {
            jsonObject.add("color", jsonSerializationContext.serialize((Object)ilIlIIIlIIlIlIIlllIl.IlIlIlIlIlllllllllIl));
        }
        if (ilIlIIIlIIlIlIIlllIl.llIIlIIIlIIIllIlIIIl != null) {
            jsonObject.add("insertion", jsonSerializationContext.serialize((Object)ilIlIIIlIIlIlIIlllIl.llIIlIIIlIIIllIlIIIl));
        }
        if (ilIlIIIlIIlIlIIlllIl.lIIIIlIIIIIlllIllIII != null) {
            final JsonObject jsonObject2 = new JsonObject();
            jsonObject2.addProperty("action", ilIlIIIlIIlIlIIlllIl.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll().IlIlIlIlIlllllllllIl());
            jsonObject2.addProperty("value", ilIlIIIlIIlIlIIlllIl.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl());
            jsonObject.add("clickEvent", (JsonElement)jsonObject2);
        }
        if (ilIlIIIlIIlIlIIlllIl.lIIIlllIIIllIIIllIII != null) {
            final JsonObject jsonObject3 = new JsonObject();
            jsonObject3.addProperty("action", ilIlIIIlIIlIlIIlllIl.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll().IlIlIlIlIlllllllllIl());
            jsonObject3.add("value", jsonSerializationContext.serialize((Object)ilIlIIIlIIlIlIIlllIl.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl()));
            jsonObject.add("hoverEvent", (JsonElement)jsonObject3);
        }
        return (JsonElement)jsonObject;
    }
}
