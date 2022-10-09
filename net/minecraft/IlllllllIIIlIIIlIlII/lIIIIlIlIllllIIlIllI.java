package net.minecraft.IlllllllIIIlIIIlIlII;

import java.lang.reflect.*;
import java.util.*;
import com.google.gson.*;

public class lIIIIlIlIllllIIlIllI implements JsonDeserializer, JsonSerializer
{
    private static final Gson llllIIIIlIIIlIlllIll;
    
    static {
        final GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeHierarchyAdapter((Class)llIIIIIIlIllIIlIIIll.class, (Object)new lIIIIlIlIllllIIlIllI());
        gsonBuilder.registerTypeHierarchyAdapter((Class)IlIlIIIlIIlIlIIlllIl.class, (Object)new IIlIIIIlllIlllllIlII());
        gsonBuilder.registerTypeAdapterFactory((TypeAdapterFactory)new IllIllIlllIllllIIllI());
        llllIIIIlIIIlIlllIll = gsonBuilder.create();
    }
    
    public llIIIIIIlIllIIlIIIll llllIIIIlIIIlIlllIll(final JsonElement jsonElement, final Type type, final JsonDeserializationContext jsonDeserializationContext) {
        if (jsonElement.isJsonPrimitive()) {
            return new IlIlIIIIIIlllIlIllIl(jsonElement.getAsString());
        }
        if (jsonElement.isJsonObject()) {
            final JsonObject asJsonObject = jsonElement.getAsJsonObject();
            IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII;
            if (asJsonObject.has("text")) {
                ilIllIlIlIIIlIlIlIII = new IlIlIIIIIIlllIlIllIl(asJsonObject.get("text").getAsString());
            }
            else if (asJsonObject.has("translate")) {
                final String asString = asJsonObject.get("translate").getAsString();
                if (asJsonObject.has("with")) {
                    final JsonArray asJsonArray = asJsonObject.getAsJsonArray("with");
                    final Object[] array = new Object[asJsonArray.size()];
                    for (int i = 0; i < array.length; ++i) {
                        array[i] = this.llllIIIIlIIIlIlllIll(asJsonArray.get(i), type, jsonDeserializationContext);
                        if (array[i] instanceof IlIlIIIIIIlllIlIllIl) {
                            final IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl = (IlIlIIIIIIlllIlIllIl)array[i];
                            if (ilIlIIIIIIlllIlIllIl.llllIIIlIlllIlIIIIIl().llllIIIlIlllIlIIIIIl() && ilIlIIIIIIlllIlIllIl.IllIIlllIIIIlllIIlIl().isEmpty()) {
                                array[i] = ilIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll();
                            }
                        }
                    }
                    ilIllIlIlIIIlIlIlIII = new IIllIIllIIIlIlIIIIlI(asString, array);
                }
                else {
                    ilIllIlIlIIIlIlIlIII = new IIllIIllIIIlIlIIIIlI(asString, new Object[0]);
                }
            }
            else if (asJsonObject.has("score")) {
                final JsonObject asJsonObject2 = asJsonObject.getAsJsonObject("score");
                if (!asJsonObject2.has("name") || !asJsonObject2.has("objective")) {
                    throw new JsonParseException("A score component needs a least a name and an objective");
                }
                ilIllIlIlIIIlIlIlIII = new IIIIlllIIIIIIlIIIlll(IIlllllIllIllIlIlIII.IllIIlllIIIIlllIIlIl(asJsonObject2, "name"), IIlllllIllIllIlIlIII.IllIIlllIIIIlllIIlIl(asJsonObject2, "objective"));
                if (asJsonObject2.has("value")) {
                    ((IIIIlllIIIIIIlIIIlll)ilIllIlIlIIIlIlIlIII).llllIIIIlIIIlIlllIll(IIlllllIllIllIlIlIII.IllIIlllIIIIlllIIlIl(asJsonObject2, "value"));
                }
            }
            else {
                if (!asJsonObject.has("selector")) {
                    throw new JsonParseException("Don't know how to turn " + jsonElement.toString() + " into a Component");
                }
                ilIllIlIlIIIlIlIlIII = new llllIIllllIlIlIIIIll(IIlllllIllIllIlIlIII.IllIIlllIIIIlllIIlIl(asJsonObject, "selector"));
            }
            if (asJsonObject.has("extra")) {
                final JsonArray asJsonArray2 = asJsonObject.getAsJsonArray("extra");
                if (asJsonArray2.size() <= 0) {
                    throw new JsonParseException("Unexpected empty array of components");
                }
                for (int j = 0; j < asJsonArray2.size(); ++j) {
                    ilIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll(asJsonArray2.get(j), type, jsonDeserializationContext));
                }
            }
            ilIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll((IlIlIIIlIIlIlIIlllIl)jsonDeserializationContext.deserialize(jsonElement, (Type)IlIlIIIlIIlIlIIlllIl.class));
            return ilIllIlIlIIIlIlIlIII;
        }
        if (jsonElement.isJsonArray()) {
            final JsonArray asJsonArray3 = jsonElement.getAsJsonArray();
            llIIIIIIlIllIIlIIIll llIIIIIIlIllIIlIIIll = null;
            for (final JsonElement jsonElement2 : asJsonArray3) {
                final llIIIIIIlIllIIlIIIll llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(jsonElement2, jsonElement2.getClass(), jsonDeserializationContext);
                if (llIIIIIIlIllIIlIIIll == null) {
                    llIIIIIIlIllIIlIIIll = llllIIIIlIIIlIlllIll;
                }
                else {
                    llIIIIIIlIllIIlIIIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
                }
            }
            return llIIIIIIlIllIIlIIIll;
        }
        throw new JsonParseException("Don't know how to turn " + jsonElement.toString() + " into a Component");
    }
    
    private void llllIIIIlIIIlIlllIll(final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl, final JsonObject jsonObject, final JsonSerializationContext jsonSerializationContext) {
        final JsonElement serialize = jsonSerializationContext.serialize((Object)ilIlIIIlIIlIlIIlllIl);
        if (serialize.isJsonObject()) {
            for (final Map.Entry<String, V> entry : ((JsonObject)serialize).entrySet()) {
                jsonObject.add((String)entry.getKey(), (JsonElement)entry.getValue());
            }
        }
    }
    
    public JsonElement llllIIIIlIIIlIlllIll(final llIIIIIIlIllIIlIIIll llIIIIIIlIllIIlIIIll, final Type type, final JsonSerializationContext jsonSerializationContext) {
        if (llIIIIIIlIllIIlIIIll instanceof IlIlIIIIIIlllIlIllIl && llIIIIIIlIllIIlIIIll.llllIIIlIlllIlIIIIIl().llllIIIlIlllIlIIIIIl() && llIIIIIIlIllIIlIIIll.IllIIlllIIIIlllIIlIl().isEmpty()) {
            return (JsonElement)new JsonPrimitive(((IlIlIIIIIIlllIlIllIl)llIIIIIIlIllIIlIIIll).llllIIIIlIIIlIlllIll());
        }
        final JsonObject jsonObject = new JsonObject();
        if (!llIIIIIIlIllIIlIIIll.llllIIIlIlllIlIIIIIl().llllIIIlIlllIlIIIIIl()) {
            this.llllIIIIlIIIlIlllIll(llIIIIIIlIllIIlIIIll.llllIIIlIlllIlIIIIIl(), jsonObject, jsonSerializationContext);
        }
        if (!llIIIIIIlIllIIlIIIll.IllIIlllIIIIlllIIlIl().isEmpty()) {
            final JsonArray jsonArray = new JsonArray();
            for (final llIIIIIIlIllIIlIIIll llIIIIIIlIllIIlIIIll2 : llIIIIIIlIllIIlIIIll.IllIIlllIIIIlllIIlIl()) {
                jsonArray.add(this.llllIIIIlIIIlIlllIll(llIIIIIIlIllIIlIIIll2, llIIIIIIlIllIIlIIIll2.getClass(), jsonSerializationContext));
            }
            jsonObject.add("extra", (JsonElement)jsonArray);
        }
        if (llIIIIIIlIllIIlIIIll instanceof IlIlIIIIIIlllIlIllIl) {
            jsonObject.addProperty("text", ((IlIlIIIIIIlllIlIllIl)llIIIIIIlIllIIlIIIll).llllIIIIlIIIlIlllIll());
        }
        else if (llIIIIIIlIllIIlIIIll instanceof IIllIIllIIIlIlIIIIlI) {
            final IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI = (IIllIIllIIIlIlIIIIlI)llIIIIIIlIllIIlIIIll;
            jsonObject.addProperty("translate", illIIllIIIlIlIIIIlI.IlIIIlIlIIIllIlIlIIl());
            if (illIIllIIIlIlIIIIlI.llIIlIIIlIIIllIlIIIl() != null && illIIllIIIlIlIIIIlI.llIIlIIIlIIIllIlIIIl().length > 0) {
                final JsonArray jsonArray2 = new JsonArray();
                Object[] llIIlIIIlIIIllIlIIIl;
                for (int length = (llIIlIIIlIIIllIlIIIl = illIIllIIIlIlIIIIlI.llIIlIIIlIIIllIlIIIl()).length, i = 0; i < length; ++i) {
                    final Object o = llIIlIIIlIIIllIlIIIl[i];
                    if (o instanceof llIIIIIIlIllIIlIIIll) {
                        jsonArray2.add(this.llllIIIIlIIIlIlllIll((llIIIIIIlIllIIlIIIll)o, ((llIIIIIIlIllIIlIIIll)o).getClass(), jsonSerializationContext));
                    }
                    else {
                        jsonArray2.add((JsonElement)new JsonPrimitive(String.valueOf(o)));
                    }
                }
                jsonObject.add("with", (JsonElement)jsonArray2);
            }
        }
        else if (llIIIIIIlIllIIlIIIll instanceof IIIIlllIIIIIIlIIIlll) {
            final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = (IIIIlllIIIIIIlIIIlll)llIIIIIIlIllIIlIIIll;
            final JsonObject jsonObject2 = new JsonObject();
            jsonObject2.addProperty("name", iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll());
            jsonObject2.addProperty("objective", iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl());
            jsonObject2.addProperty("value", iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI());
            jsonObject.add("score", (JsonElement)jsonObject2);
        }
        else {
            if (!(llIIIIIIlIllIIlIIIll instanceof llllIIllllIlIlIIIIll)) {
                throw new IllegalArgumentException("Don't know how to serialize " + llIIIIIIlIllIIlIIIll + " as a Component");
            }
            jsonObject.addProperty("selector", ((llllIIllllIlIlIIIIll)llIIIIIIlIllIIlIIIll).llllIIIIlIIIlIlllIll());
        }
        return (JsonElement)jsonObject;
    }
    
    public static String llllIIIIlIIIlIlllIll(final llIIIIIIlIllIIlIIIll llIIIIIIlIllIIlIIIll) {
        return lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll.toJson((Object)llIIIIIIlIllIIlIIIll);
    }
    
    public static llIIIIIIlIllIIlIIIll llllIIIIlIIIlIlllIll(final String s) {
        return (llIIIIIIlIllIIlIIIll)lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll.fromJson(s, (Class)llIIIIIIlIllIIlIIIll.class);
    }
}
