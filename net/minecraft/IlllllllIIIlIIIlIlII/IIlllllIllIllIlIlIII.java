package net.minecraft.IlllllllIIIlIIIlIlII;

import org.apache.commons.lang3.*;
import com.google.gson.*;

public class IIlllllIllIllIlIlIII
{
    public static boolean llllIIIIlIIIlIlllIll(final JsonObject jsonObject, final String s) {
        return IlIIIlIlIIIllIlIlIIl(jsonObject, s) && jsonObject.getAsJsonPrimitive(s).isString();
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final JsonElement jsonElement) {
        return jsonElement.isJsonPrimitive() && jsonElement.getAsJsonPrimitive().isString();
    }
    
    public static boolean IlIlIlIlIlllllllllIl(final JsonObject jsonObject, final String s) {
        return IlIIIlIlIIIllIlIlIIl(jsonObject, s) && jsonObject.getAsJsonPrimitive(s).isBoolean();
    }
    
    public static boolean llIllIIIIIllIlIIIIlI(final JsonObject jsonObject, final String s) {
        return IlIlIIIllIllIIIIIllI(jsonObject, s) && jsonObject.get(s).isJsonArray();
    }
    
    public static boolean IlIIIlIlIIIllIlIlIIl(final JsonObject jsonObject, final String s) {
        return IlIlIIIllIllIIIIIllI(jsonObject, s) && jsonObject.get(s).isJsonPrimitive();
    }
    
    public static boolean IlIlIIIllIllIIIIIllI(final JsonObject jsonObject, final String s) {
        return jsonObject != null && jsonObject.get(s) != null;
    }
    
    public static String llllIIIIlIIIlIlllIll(final JsonElement jsonElement, final String s) {
        if (jsonElement.isJsonPrimitive()) {
            return jsonElement.getAsString();
        }
        throw new JsonSyntaxException("Expected " + s + " to be a string, was " + IlIlIlIlIlllllllllIl(jsonElement));
    }
    
    public static String IllIIlllIIIIlllIIlIl(final JsonObject jsonObject, final String s) {
        if (jsonObject.has(s)) {
            return llllIIIIlIIIlIlllIll(jsonObject.get(s), s);
        }
        throw new JsonSyntaxException("Missing " + s + ", expected to find a string");
    }
    
    public static String llllIIIIlIIIlIlllIll(final JsonObject jsonObject, final String s, final String s2) {
        return jsonObject.has(s) ? llllIIIIlIIIlIlllIll(jsonObject.get(s), s) : s2;
    }
    
    public static boolean IlIlIlIlIlllllllllIl(final JsonElement jsonElement, final String s) {
        if (jsonElement.isJsonPrimitive()) {
            return jsonElement.getAsBoolean();
        }
        throw new JsonSyntaxException("Expected " + s + " to be a Boolean, was " + IlIlIlIlIlllllllllIl(jsonElement));
    }
    
    public static boolean llllIIIlIlllIlIIIIIl(final JsonObject jsonObject, final String s) {
        if (jsonObject.has(s)) {
            return IlIlIlIlIlllllllllIl(jsonObject.get(s), s);
        }
        throw new JsonSyntaxException("Missing " + s + ", expected to find a Boolean");
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final JsonObject jsonObject, final String s, final boolean b) {
        return jsonObject.has(s) ? IlIlIlIlIlllllllllIl(jsonObject.get(s), s) : b;
    }
    
    public static float llIllIIIIIllIlIIIIlI(final JsonElement jsonElement, final String s) {
        if (jsonElement.isJsonPrimitive() && jsonElement.getAsJsonPrimitive().isNumber()) {
            return jsonElement.getAsFloat();
        }
        throw new JsonSyntaxException("Expected " + s + " to be a Float, was " + IlIlIlIlIlllllllllIl(jsonElement));
    }
    
    public static float lIIIIlIIIIIlllIllIII(final JsonObject jsonObject, final String s) {
        if (jsonObject.has(s)) {
            return llIllIIIIIllIlIIIIlI(jsonObject.get(s), s);
        }
        throw new JsonSyntaxException("Missing " + s + ", expected to find a Float");
    }
    
    public static float llllIIIIlIIIlIlllIll(final JsonObject jsonObject, final String s, final float n) {
        return jsonObject.has(s) ? llIllIIIIIllIlIIIIlI(jsonObject.get(s), s) : n;
    }
    
    public static int IlIIIlIlIIIllIlIlIIl(final JsonElement jsonElement, final String s) {
        if (jsonElement.isJsonPrimitive() && jsonElement.getAsJsonPrimitive().isNumber()) {
            return jsonElement.getAsInt();
        }
        throw new JsonSyntaxException("Expected " + s + " to be a Int, was " + IlIlIlIlIlllllllllIl(jsonElement));
    }
    
    public static int lIIIlllIIIllIIIllIII(final JsonObject jsonObject, final String s) {
        if (jsonObject.has(s)) {
            return IlIIIlIlIIIllIlIlIIl(jsonObject.get(s), s);
        }
        throw new JsonSyntaxException("Missing " + s + ", expected to find a Int");
    }
    
    public static int llllIIIIlIIIlIlllIll(final JsonObject jsonObject, final String s, final int n) {
        return jsonObject.has(s) ? IlIIIlIlIIIllIlIlIIl(jsonObject.get(s), s) : n;
    }
    
    public static JsonObject IlIlIIIllIllIIIIIllI(final JsonElement jsonElement, final String s) {
        if (jsonElement.isJsonObject()) {
            return jsonElement.getAsJsonObject();
        }
        throw new JsonSyntaxException("Expected " + s + " to be a JsonObject, was " + IlIlIlIlIlllllllllIl(jsonElement));
    }
    
    public static JsonObject llIIlIIIlIIIllIlIIIl(final JsonObject jsonObject, final String s) {
        if (jsonObject.has(s)) {
            return IlIlIIIllIllIIIIIllI(jsonObject.get(s), s);
        }
        throw new JsonSyntaxException("Missing " + s + ", expected to find a JsonObject");
    }
    
    public static JsonObject llllIIIIlIIIlIlllIll(final JsonObject jsonObject, final String s, final JsonObject jsonObject2) {
        return jsonObject.has(s) ? IlIlIIIllIllIIIIIllI(jsonObject.get(s), s) : jsonObject2;
    }
    
    public static JsonArray IllIIlllIIIIlllIIlIl(final JsonElement jsonElement, final String s) {
        if (jsonElement.isJsonArray()) {
            return jsonElement.getAsJsonArray();
        }
        throw new JsonSyntaxException("Expected " + s + " to be a JsonArray, was " + IlIlIlIlIlllllllllIl(jsonElement));
    }
    
    public static JsonArray llIllIlIIIIllIlIIllI(final JsonObject jsonObject, final String s) {
        if (jsonObject.has(s)) {
            return IllIIlllIIIIlllIIlIl(jsonObject.get(s), s);
        }
        throw new JsonSyntaxException("Missing " + s + ", expected to find a JsonArray");
    }
    
    public static JsonArray llllIIIIlIIIlIlllIll(final JsonObject jsonObject, final String s, final JsonArray jsonArray) {
        return jsonObject.has(s) ? IllIIlllIIIIlllIIlIl(jsonObject.get(s), s) : jsonArray;
    }
    
    public static String IlIlIlIlIlllllllllIl(final JsonElement jsonElement) {
        final String abbreviateMiddle = StringUtils.abbreviateMiddle(String.valueOf(jsonElement), "...", 10);
        if (jsonElement == null) {
            return "null (missing)";
        }
        if (jsonElement.isJsonNull()) {
            return "null (json)";
        }
        if (jsonElement.isJsonArray()) {
            return "an array (" + abbreviateMiddle + ")";
        }
        if (jsonElement.isJsonObject()) {
            return "an object (" + abbreviateMiddle + ")";
        }
        if (jsonElement.isJsonPrimitive()) {
            final JsonPrimitive asJsonPrimitive = jsonElement.getAsJsonPrimitive();
            if (asJsonPrimitive.isNumber()) {
                return "a number (" + abbreviateMiddle + ")";
            }
            if (asJsonPrimitive.isBoolean()) {
                return "a boolean (" + abbreviateMiddle + ")";
            }
        }
        return abbreviateMiddle;
    }
}
