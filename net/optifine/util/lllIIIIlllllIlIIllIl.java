package net.optifine.util;

import com.google.gson.*;

public class lllIIIIlllllIlIIllIl
{
    public static float llllIIIIlIIIlIlllIll(final JsonObject jsonObject, final String s, final float n) {
        final JsonElement value = jsonObject.get(s);
        return (value == null) ? n : value.getAsFloat();
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final JsonObject jsonObject, final String s, final boolean b) {
        final JsonElement value = jsonObject.get(s);
        return (value == null) ? b : value.getAsBoolean();
    }
    
    public static String llllIIIIlIIIlIlllIll(final JsonObject jsonObject, final String s) {
        return llllIIIIlIIIlIlllIll(jsonObject, s, null);
    }
    
    public static String llllIIIIlIIIlIlllIll(final JsonObject jsonObject, final String s, final String s2) {
        final JsonElement value = jsonObject.get(s);
        return (value == null) ? s2 : value.getAsString();
    }
    
    public static float[] llllIIIIlIIIlIlllIll(final JsonElement jsonElement, final int n) {
        return llllIIIIlIIIlIlllIll(jsonElement, n, (float[])null);
    }
    
    public static float[] llllIIIIlIIIlIlllIll(final JsonElement jsonElement, final int n, final float[] array) {
        if (jsonElement == null) {
            return array;
        }
        final JsonArray asJsonArray = jsonElement.getAsJsonArray();
        if (asJsonArray.size() != n) {
            throw new JsonParseException("Wrong array length: " + asJsonArray.size() + ", should be: " + n + ", array: " + asJsonArray);
        }
        final float[] array2 = new float[asJsonArray.size()];
        for (int i = 0; i < array2.length; ++i) {
            array2[i] = asJsonArray.get(i).getAsFloat();
        }
        return array2;
    }
    
    public static int[] IlIlIlIlIlllllllllIl(final JsonElement jsonElement, final int n) {
        return llllIIIIlIIIlIlllIll(jsonElement, n, (int[])null);
    }
    
    public static int[] llllIIIIlIIIlIlllIll(final JsonElement jsonElement, final int n, final int[] array) {
        if (jsonElement == null) {
            return array;
        }
        final JsonArray asJsonArray = jsonElement.getAsJsonArray();
        if (asJsonArray.size() != n) {
            throw new JsonParseException("Wrong array length: " + asJsonArray.size() + ", should be: " + n + ", array: " + asJsonArray);
        }
        final int[] array2 = new int[asJsonArray.size()];
        for (int i = 0; i < array2.length; ++i) {
            array2[i] = asJsonArray.get(i).getAsInt();
        }
        return array2;
    }
}
